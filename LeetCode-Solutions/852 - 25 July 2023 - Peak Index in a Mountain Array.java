/*
Runtime: 0ms
Beats 100.00% of users with Java

Memory: 55.16mb
Beats 80.80% of users with Java
*/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0, r=n-1;
        return binarySearch(l, r, arr);
    }

    private int binarySearch(int l, int r, int[] arr){
        int mid = (l+r)/2;
        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
        else{
            if(arr[mid]<arr[mid+1]) return binarySearch(mid, r, arr);
            else return binarySearch(l, mid, arr);
        }
    }
}
