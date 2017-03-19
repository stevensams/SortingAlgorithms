# Sorting Algorithms Coursework
Completed this coursework in 2003 during my udnergraduate degree at Brunel University.

## Selection Sort

### Theory

When sorting an array of numbers into ascending order, the Selection Sort algorithm picks the first element of an unsorted array and stores its location. If a value smaller than the value held at this location is found, the variable is changed to the smaller value’s array location. After the whole array has been checked, the value held in the variable will be the location of the smallest element. This value is then swapped with the first element of the unsorted array thus placing it in its correct position. To use an example, in figure 1a the variable *min* is initially set to the first array location, i.e. 0. This location contains the value 68. The `findSmaller()` method compares the value 68 to the values held in the remaining array. When `findSmaller()` checks the value at index 1, it finds 42. As this value is smaller than the value held at the *min* location, i.e. 68, it changes the *min* value to 1, corresponding to the new known minimum value location. The `findSmaller()` method then checks the next index. This contains the value 74. As 74 is greater than 42, the value at *min* is not changed. Finally, `findSmaller()` checks the last element of the array. The value stored at this index is 12. As 12 is less than the value stored at *min*, the *min* variable is changed to the index of this smaller value, namely 3. The *min* variable now contains the location of the smallest value in the entire array. This value is swapped with index 0, placing the smallest value in its place. On occasions the value will already be in its correct location, as in figure 1b, and no swapping is required. This comparison process continues for each element up to location n-1.  The Selection Sort algorithm has a time complexity of *O*(*n*2).

![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/figures/1a.png "Figure 1a")
![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/figures/1b.png "Figure 1b")
![alt text](https://github.com/stevensams/SortingAlgorithms/blob/master/images/figures/1c.png "Figure 1c")
### Implementation
### Pseduocode
### Experiment
### Results
### Conclusion

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
