# Computation, Algorithms & Implementation Coursework
I completed this coursework in 2003 during the sophomore year of my Computer Science undergraduate degree at Brunel University, London.

## Selection Sort

When sorting an array of numbers into ascending order, the Selection Sort algorithm picks the first element of an unsorted array and stores its location. If a value smaller than the value held at this location is found, the variable is changed to the smaller value’s array location. After the whole array has been checked, the value held in the variable will be the location of the smallest element. This value is then swapped with the first element of the unsorted array thus placing it in its correct position. To use an example, in figure 1a the variable *min* is initially set to the first array location, i.e. 0. This location contains the value 68. The `findSmaller()` method compares the value 68 to the values held in the remaining array. When `findSmaller()` checks the value at index 1, it finds 42. As this value is smaller than the value held at the *min* location, i.e. 68, it changes the *min* value to 1, corresponding to the new known minimum value location. The `findSmaller()` method then checks the next index. This contains the value 74. As 74 is greater than 42, the value at *min* is not changed. Finally, `findSmaller()` checks the last element of the array. The value stored at this index is 12. As 12 is less than the value stored at *min*, the *min* variable is changed to the index of this smaller value, namely 3. The *min* variable now contains the location of the smallest value in the entire array. This value is swapped with index 0, placing the smallest value in its place. On occasions the value will already be in its correct location, as in figure 1b, and no swapping is required. This comparison process continues for each element up to location n-1.  The Selection Sort algorithm has a time complexity of *O*(*n*<sup>2</sup>).

![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/figures/1a.png "Figure 1a")
![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/figures/1b.png "Figure 1b")
![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/figures/1c.png "Figure 1c")

### Implementation

The Selection Sort algorithm implemented below locates the smallest value in the array and swaps it for the first value, continuing this iterative process in the remainder of the array up to element *n*-1, where *n* is the count of values in the array. 

![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/pseudocode/selection-sort.png "Selection Sort Pseudocode")

### Experiment

 To evaluate the performance of the algorithm the current time in milliseconds before and after sorting *n* numbers, where *n* was the complete length of the array, was captured. The algorithm was tested on a randomised array of integers of array lengths of between 10,000 and 100,000, incrementing by 10,000 after each test. 

 The aim through this testing was to find, as close as possible, the worst, best and average case of the algorithm’s complexity. The more tests conducted, the closer the final results would be to the theoretical best, worst and average case. The range (10,000-100,000) and the number of tests at each stage (20) was deemed sufficient without being excessive. 

 A scatter-plot of the worst and best times of each input size (see below for an example) was constructed to highlight the best, worst and calculated average case chart seen in section A.2.2. 

### Results

![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/charts/selection-sort-complete.png "Selection Sort Results Complete")

![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/charts/selection-sort-best%7Cworst%7Caverage.png "Selection Sort Best|Worst|Average Results")

### Summary

As can be seen in the above chart, doubling the input size quadruples the time required for Selection Sort to sort the array. An example of this can be seen in the relationship between input sizes 40,000 and 80,000. Selection Sort requires only *n*-1 swaps in the worst case however the number of comparisons is fixed at *n*(*n*-1)/2 for all cases. This results in a time complexity of *O*(*n*<sup>2</sup>).

## Merge Sort

The Merge Sort algorithm recursively divides an array into two until the remaining sub arrays contain just one element. The sub arrays are then merged together, sorting each one as the process goes. The top section in figure 2a shows an unsorted array with four elements. The Merge Sort algorithm firstly calls itself to create two sub arrays with one containing the first two elements of the parent array and the other containing the second two elements of the parent array. Merge Sort then calls itself again to split the sub arrays into further sub arrays. This can be seen in the middle section of Figure 2a. There now exists four sub arrays of one element, meaning that each sub array is inherently sorted. When Merge Sort calls itself a third time, a comparison check will discover that the sub arrays contain just one element and send them to a separate method to be merged.

In the Merge algorithm the element in the first two arrays is compared, the smaller one is selected and placed first in a temporary array. The larger element (in this case 68) will remain in one of the two arrays. Two mutually exclusive while loops at the end of the algorithm (one for each sub array) will locate the larger element and place it at the end of the temporary array. This process also happens for the third and forth arrays, resulting in two sorted arrays of size two, viewable in section 2a as the forth section down. The final step is to combine these two arrays, again by first finding the smallest element of the two arrays and putting it, once and for all, into its correct place in the final array. This process will insert the three smallest elements into the final array, with the bottom while loops taking care of the final element. The Merge Sort algorithm has a time complexity of *O*(*n* log *n*). 

![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/figures/2a.png "Figure 2a")

### Implementation

The Merge Sort algorithm implemented below recursively divides the array using the *start* and *end* variables as markers for the first and last elements of a divided list. When *start* and *end* are equal to each other then the list contains one element. The two recursive calls to `sort()` initially creates two, one element lists. The merge method then picks the smaller of the two elements and places it into an array. The second element (the larger one) is placed in by one of the bottom two while loops in the merge method. This process continues until the entire list is merged.

![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/pseudocode/merge-sort-sort.png "Merge Sort Sort Pseudocode")
![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/pseudocode/merge-sort-merge.png "Merge Sort Merge Pseudocode")

### Experiment
### Results

![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/charts/merge-sort-complete.png "Merge Sort Results Complete")

![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/charts/merge-sort-best%7Cworst%7Caverage.png "Merge Sort Best|Worst|Average Results")

### Summary

The time results for Merge Sort are a improvement on the performance seen with Selection Sort. The divide and conquer strategy enables Merge Sort to have a time complexity of *O*(*n* log *n*). However, the implementation requires an additional array to retain the correct order of values. Some versions of Merge Sort have three arrays as opposed to using the method above, namely array markers, indicated in the pseudo-code in section B.1.2. The impact is an increase in memory usage of at least twice that of the Selection Sort. 

## Quick Sort

The Quick Sort algorithm works on the same divide and conquer principle as that of Merge Sort. However instead of recursively splitting an array into two arrays of the same (or near the same) number of elements, Quick Sort picks an element of the array, called the pivot, and arranges all the values smaller than the pivot behind it (by swapping them with the pivot location) and all the values greater than the pivot in front of it. During this phase, the array is divided into 4 subsections: the pivot, elements less than the pivot, elements greater than the pivot and elements yet to be analysed. The elements in the two sub arrays either side of the pivot are not internally sorted. Quick Sort then calls itself to the section before and after the pivot, choosing a new pivot value in each, and performing the same operation. To use an example, figure 3a shows an unsorted list. The Quick Sort algorithm takes the first value in the array (42) as the pivot, dividing the array into greater than and less than sections around the pivot. In figure 3b Quick Sort is not required to perform any operations on the greater than sub list as it only contains one value, namely 73. Quick Sort chooses 27 as the new pivot value; the only other element in this section is 15. As 15 is less than the pivot value, Quick Sort swaps 15 with the pivot element. The array is now sorted. When all the values of an array are sorted in ascending or descending order, Quick Sort performs at the worst case. The reason for this is that the first element chosen will be either the largest or smallest in the whole array, resulting in a time complexity of *O*(*n*<sup>2</sup>). However for the vast majority of inputs, Quick Sort has a time complexity of *O*(*n* log *n*).

![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/figures/3a.png "Figure 3a")

![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/figures/3b.png "Figure 3b")

### Implementation

The Quick Sort algorithm, as implemented below, takes the first element of the array as the pivot, moving the smaller values behind and the larger values in front of the pivot value. Quick Sort is then recursively called on each sub array until all sub arrays contains just one element. When this occurs, the array will be sorted. 

![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/pseudocode/quick-sort-quicksort.png "Quick Sort Pseudocode")

![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/pseudocode/quick-sort-quick.png "Quick Sort Pseudocode")

![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/pseudocode/quick-sort-sort.png "Quick Sort Pseudocode")

### Experiment
### Results

![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/charts/quick-sort-complete.png "Quick Sort Results Complete")

![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/charts/quick-sort-best%7Cworst%7Caverage.png "Quick Sort Best|Worst|Average Results")


### Summary

The Quick Sort algorithm uses only one array and appears to be faster than Merge Sort in the worst case. However as was stated in Part 1 Section 3, Quick Sort has a worst case of *O*(*n*<sup>2</sup>); the same as Selection Sort. The worst case of Quick Sort occurs when the algorithm receives a sorted list, highly unlikely when using a randomised array. It is therefore not surprising that the diagram omits displaying the true worst case when using this testing procedure. Creating a separate test to trigger the worst case (by inputting a sorted array) alongside the randomised inputs would have provided a more accurate analysis for this particular algorithm. 

## Heap Sort

The Heap Sort algorithm creates a type of binary tree, called a heap, and enforces a ‘heap property’: that all parent nodes of the tree are smaller than their respective child nodes. The smallest node is the root of the tree. The concept of a heap is implemented in an array by defining the children of a parent as 2*i*+1 and 2*i*+2, where i is the index of the array. The corresponding parent and child nodes can be seen in an array in figure 4a. To sort the heap, Heap Sort removes the root of the tree replacing it with the last, rightmost child as seen in figure 4b. It is likely that the new root node will be larger than one or both its children and as such violates the heap property. Heap Sort will restore the heap property before any more values are removed.  To restore an array’s heap property, Heap Sort will start in the centre of the array (i.e the smallest parent) and work towards the root. It does not need to check the latter part of the array (i.e the children) as only parent elements can violate the heap properties. The root is then swapped with the last element of the unsorted array. This element is now sorted and is not swapped again. Heap Sort will continue removing the root of the tree and restoring the heap properties of the binary tree until there is only one element remaining in the unsorted array. Heap Sort, like Merge Sort, has a time complexity of *O*(*n* log *n*).

![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/figures/4a.png "Figure 4a")

![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/figures/4b.png "Figure 4b")

### Implementation

The `heapSort()` method below inserts the minimum element of an array into the last location in the array, continuing iteratively until there are no further values remaining in the unsorted section. The `getMin()` method returns the smallest value (the root) to the `heapSort()` method, inserting the last array element in its place. The `makeHeap()` method populates the heap from the bottom, rightmost child using a call to the `heap()` method to restore the heap’s ‘heap properties’. This is a minimum order heap and as such will return an array sorted in descending order.

### Pseduocode



### Experiment

### Results


### Summary

Heap Sort, like Quick Sort, uses just one array and so therefore minimises memory space. The time results for Heap Sort indicate that it is marginally slower than Quick Sort, however Heap Sort doesn’t suffer from the ‘hidden’ worst case of Quick Sort (*O*(*n*<sup>2</sup>)) highlighted in Section C.2.3. 
