package com.example.focaap;

public class task {
    public int[] twoSum(int[] nums, int target) {
        int[]solt = new int[2];
        for(int i = 0; i< nums.length; i++){
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    solt[0] = i;
                    solt[1] = j;
                }
            }
        }
        return solt;
    }

    public static void main(String[] args) {
        int[] nums = {4,54};
        int target = 58;
        task takss = new task();
        takss.twoSum(nums,target);
        for (int a : takss.twoSum(nums,target)
             ) {
            System.out.print(a + " ");
        }
    }
}