# Computation, Algorithms & Implementation Coursework
I completed this coursework in 2003 during my Computer Science undergraduate degree at Brunel University, London.

## Selection Sort

When sorting an array of numbers into ascending order, the Selection Sort algorithm picks the first element of an unsorted array and stores its location. If a value smaller than the value held at this location is found, the variable is changed to the smaller value’s array location. After the whole array has been checked, the value held in the variable will be the location of the smallest element. This value is then swapped with the first element of the unsorted array thus placing it in its correct position. To use an example, in figure 1a the variable *min* is initially set to the first array location, i.e. 0. This location contains the value 68. The `findSmaller()` method compares the value 68 to the values held in the remaining array. When `findSmaller()` checks the value at index 1, it finds 42. As this value is smaller than the value held at the *min* location, i.e. 68, it changes the *min* value to 1, corresponding to the new known minimum value location. The `findSmaller()` method then checks the next index. This contains the value 74. As 74 is greater than 42, the value at *min* is not changed. Finally, `findSmaller()` checks the last element of the array. The value stored at this index is 12. As 12 is less than the value stored at *min*, the *min* variable is changed to the index of this smaller value, namely 3. The *min* variable now contains the location of the smallest value in the entire array. This value is swapped with index 0, placing the smallest value in its place. On occasions the value will already be in its correct location, as in figure 1b, and no swapping is required. This comparison process continues for each element up to location n-1.  The Selection Sort algorithm has a time complexity of *O*(*n*<sup>2</sup>).

![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/figures/1a.png "Figure 1a")
![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/figures/1b.png "Figure 1b")
![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/figures/1c.png "Figure 1c")

### Implementation

The Selection Sort algorithm implemented below locates the smallest value in the array and swaps it for the first value, continuing this iterative process in the remainder of the array up to element *n*-1, where *n* is the count of values in the array. 

![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/pseudocode/selection-sort.png "Selection Sort Pseudocode")

### Experiment

 To evaluate the performance of the algorithm, strategically System.currentTimeMillis() method in Java to capture the time before and just following the completion of the algorithm. 

 The subtraction of the former from the latter provided the total time in milliseconds that the algorithm took to sort *n* numbers, where *n* was the complete length of the array. I tested the algorithm on array lengths of between 10,000 and 100,000, incrementing by 10,000 after each test. For each array length, I performed twenty identical tests by calling the algorithm to sort a randomised array of integers. My aim through this testing was to find, as close as possible, the worst, best and average case of the algorithm’s time complexity. The more tests I conducted, the closer my final results would be to the theoretical best, worst and average case. I believed that the range (10,000-100,000) and the number of tests at each stage (20) was sufficient without being excessive. At the end of testing, I produced a scatter-plot and used the worst and best times of each input size (see below for an example) to produce the best, worst and calculated average case chart seen in section A.2.2. 

### Results


### Conclusion

As can be seen in the above chart, doubling the input size quadruples the time required for Selection Sort to sort the array. An example of this can be seen in the relationship between input sizes 40,000 and 80,000. Selection Sort requires only *n*-1 swaps in the worst case however the number of comparisons is fixed at *n*(*n*-1)/2 for all cases. This results in a time complexity of *O*(*n*<sup>2</sup>).

## Merge Sort
### Theory
### Implementation
### Pseduocode
### Experiment
### Results
### Conclusion

## Quick Sort
### Theory
### Implementation
### Pseduocode
### Experiment
### Results
### Conclusion

## Heap Sort
### Theory
### Implementation
### Pseduocode
### Experiment
### Results
### Conclusion
