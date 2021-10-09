public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[] arr=new int[nums.length];
        arr[nums.length-1]=nums[nums.length-1];
        arr[nums.length-2]=Math.max(nums[nums.length-1],nums[nums.length-2]);
        for(int i= nums.length-3;i>=0;i--){
            arr[i]=Math.max(arr[i+1],nums[i]+arr[i+2]);
            }
        return arr[0];
    }
