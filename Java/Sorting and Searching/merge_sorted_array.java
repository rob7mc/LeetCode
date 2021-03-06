/*
    Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

    The number of elements initialized in nums1 and nums2 are m and n respectively. 
    You may assume that nums1 has a size equal to m + n such that it has enough space 
    to hold additional elements from nums2.
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start at last element in the arrays
        int i = m-1;
        int j = n-1;
        int k = (m+n)-1;
        
        // Merge the 2 arrays together starting with the biggest element at the end of the array counting down
        while(k>=0){
            // j<0 if nums2 emptied first and i>=0 if nums1 only has 1 element
            if(j<0 || i>=0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }
    }
}