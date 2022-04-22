package com.company;

import java.util.jar.JarEntry;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = {0,0};//需要初始化才能赋值
        int[] ansn = {0,0};
        int k = nums.length;
        for (int i = 0; i < k; i++) {
            for (int j = i+1; j < k; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = nums[i];
                    ans[1] = nums[j];
                    ansn[0] = i;
                    ansn[1] = j;
                    return ansn;//需要马上return 否则在同一个循环中如果有多个答案输出将会变化 例：[2,5,5,11] 10
                }
            }
        }
        return ansn;
    }
}

//官方解答
/*    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
*/
