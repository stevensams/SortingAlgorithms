package sams.steven.algorithms;

/**
 * Title:        HeapSort Algorithm
 * Description:  An algorithm to sort an array of random values into ascending order
 * Company:      DISC Brunel University
 * @author       Steven Sams
 * @version 1.0
 */

public class HeapSort
{
    public static void heap(int[] a, int i, int heapLimit) {
        //restore heap properties
        int parentIndex = i;          // assign the parent location
        int leftChild = 2 * i + 1;   // assign the left child of the parent
        int parentValue = a[i];     // store the parent's value

        if (leftChild < heapLimit && a[leftChild+1] < a[leftChild])
            leftChild++;

        while (leftChild <= heapLimit && a[leftChild] < parentValue) {
            a[parentIndex] = a[leftChild];     // assign value of child to parent
            parentIndex = leftChild;          // switch parent and child locations
            leftChild = 2 * leftChild + 1;   // next child

            if (leftChild < heapLimit && a[leftChild + 1] < a[leftChild])
                leftChild++;
        }
        a[parentIndex] = parentValue; // assign the correct value to the parent
    }

    public static void makeHeap(int[] a) {
        for(int i = a.length / 2 - 1; i >= 0; i--) // start from the last parent and work up
            heap(a, i,a.length-1);		  // restore the heap properties
    }

    public static int getMin(int[] a, int heapLimit) {
        int min = a[0];	      // copy the value the root (smallest) value
        a[0] = a[heapLimit]; // insert the last element into the root position
        heap(a,0,heapLimit - 1); //restore the heap properties
        return min; 	   // return the smallest value
    }

    public static void heapsort(int[] a) {
        // construct the heap
        makeHeap(a);
        for(int heapLimit = a.length - 1; heapLimit > 0; heapLimit--)
            a[heapLimit] = getMin(a, heapLimit); //take out the root and replace with the last element in the array
    }
}