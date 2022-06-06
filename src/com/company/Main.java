package com.company;

import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int target;

        System.out.println("声明数组长度:");
        int al = sc.nextInt();
        int[] nums = new int[al];
        //int[] nums = {2,5,5,11};
        for (int i = 0 ;i<al;i++){
            System.out.println("输入第" + (i+1) + "个数字:");
            nums[i] = sc.nextInt();
        }

        System.out.println("请输入一个数字");
        target = Integer.parseInt(sc.next());

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(nums,target)));
    }
}
