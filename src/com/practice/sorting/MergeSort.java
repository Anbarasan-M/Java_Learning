package com.practice.sorting;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Nothing to sort
        }
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr, temp, 0, n - 1);
    }

    private static void mergeSortHelper(int[] arr, int[] temp, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSortHelper(arr, temp, low, mid); // Sort the left half
            mergeSortHelper(arr, temp, mid + 1, high); // Sort the right half
            merge(arr, temp, low, mid, high); // Merge the sorted halves
        }
    }

    private static void merge(int[] arr, int[] temp, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i]; // Copy the elements to a temporary array
        }

        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            arr[k] = temp[i];
            k++;
            i++;
        }
        // No need to copy the elements from the right half because they are already in their correct positions
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 0, 6, 2};
        mergeSort(arr);
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

