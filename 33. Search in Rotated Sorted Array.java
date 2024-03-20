class Solution {
    public int search(int arr[], int target) {
        // int pivot = findPivot(arr);
        // if (pivot == -1)
        //     return bSearch(arr, target, 0, arr.length - 1);
        // if (arr[pivot] == target)
        //     return pivot;
        // else if (arr[0] > target)
        //     return bSearch(arr, target, pivot + 1, arr.length - 1);
        // return bSearch(arr, target, 0, pivot - 1);
        int n=arr.length;
        int st = 0, end = n - 1, ans = 0;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[st] <= arr[mid]) {
                if (arr[st] <= target && target <= arr[mid])
                    end = mid - 1;
                else
                    st = mid + 1;
            } else {
                if (arr[mid] <= target && arr[end] >= target)
                    st = mid + 1;
                else 
                    end = mid - 1;
            }
        }
        return -1;
    }

    // public  int findPivot(int arr[]) {
    //     int st = 0, end = arr.length - 1;
    //     while (st <= end) {
    //         int mid = st + (end - st) / 2;
    //         if (mid < end && arr[mid] > arr[mid + 1])
    //             return mid;
    //         else if (mid > st && arr[mid] <= arr[mid - 1])
    //             return mid - 1;
    //         else if (arr[st] > arr[mid])
    //             end = mid - 1;
    //         else
    //             st = mid + 1;
    //     }
    //     return -1;
    // }

    // public  int bSearch(int arr[], int target, int st, int end) {
    //     while (st <= end) {
    //         int mid = st + (end - st) / 2;
    //         if (arr[mid] == target)
    //             return mid;
    //         else if (arr[mid] > target)
    //             end = mid - 1;
    //         else
    //             st = mid + 1;
    //     }
    //     return -1;
    }
}
