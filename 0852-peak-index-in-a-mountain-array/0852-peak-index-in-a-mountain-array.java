class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n -1;
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s) / 2;
            if(arr[mid]<arr[mid+1]){
                //main ascending order part main hu
                //iska matlab mujhe main left part main hu 
                //or mujhe pata h answer right part main hai
                //to fir main right move karunga 
                s = mid + 1;
            }
            else{
                //arr[mid] >= arr[mid+1]
                //iska matlab main right part main hu;
                //iska matalab ek pootentaol answer milgaya 
                ans = mid;
                //now i have to find the 
                e = mid - 1;
            }
        }
        return ans;
    }
}