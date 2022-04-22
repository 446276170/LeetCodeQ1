package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int target;
        int[] nums = {2,5,5,11};

        int k = 0;
        String t = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串数字,输入其他结束:");
//        while (true){
//            t = sc.next();
//            if (t == "N" || t == "n" || k > 9999){
//                break;
//            }else{
//                nums[k] = Integer.parseInt(t);
//                k++;
//            }
//        }
        t = sc.next();

        System.out.println("请输入一个数字");
        target = Integer.parseInt(sc.next());

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(nums,target)));
    }
}
