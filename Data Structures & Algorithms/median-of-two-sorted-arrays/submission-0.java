class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int total = n1 + n2;

        int[] arr = new int[total];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                arr[k] = nums1[i];
                k++;
                i++;
            } else {
                arr[k] = nums2[j];
                k++;
                j++;
            }
        }

        while (i < n1) {
            arr[k] = nums1[i];
            k++;
            i++;
        }

        while (j < n2) {
            arr[k] = nums2[j];
            k++;
            j++;
        }

        
        if (total % 2 == 0) {
            return (arr[total / 2 - 1] + arr[total / 2]) / 2.0;
        } else {
            return arr[total / 2];
        }
    }
}