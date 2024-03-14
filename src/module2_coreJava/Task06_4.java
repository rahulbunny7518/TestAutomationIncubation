package module2_coreJava;

import java.util.Scanner;

public class Task06_4 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
 
        int[] array = new int[n];
 
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
 
        int largestMirrorLength = maxMirror(array);
        System.out.println("Size of the largest mirror section: " + largestMirrorLength);
        scanner.close();
    }
 
    public static int maxMirror(int[] nums) {
        int maxLength = 0;
 
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                int count = 0;
                int index1 = i;
                int index2 = j;
 
                while (index1 < nums.length && index2 >= 0 && nums[index1] == nums[index2]) {
                    count++;
                    index1++;
                    index2--;
                }
 
                maxLength = Math.max(maxLength, count);
            }
        }
 
        return maxLength;
    }
}