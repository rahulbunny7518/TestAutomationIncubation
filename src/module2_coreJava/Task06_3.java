package module2_coreJava;

import java.util.Scanner;

public class Task06_3 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
 
        int[] array = new int[n];
 
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
 
        int count = countClumps(array);
        System.out.println("Number of clumps: " + count);
        scanner.close();
    }
 
    public static int countClumps(int[] nums) {
        int count = 0;
        boolean clump = false;
 
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && !clump) {
            	clump = true;
                count++;
            } else if (nums[i] != nums[i + 1]) {
            	clump = false;
            }
        }
        return count;
    }
}