package module2_coreJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task06_2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        List<Integer> array = new ArrayList<>();

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }

        System.out.println(canBalance(array));
        scanner.close();
    }
    public static boolean canBalance(List<Integer> nums) {
        int total_sum=0;
        for (Integer num : nums) {
            total_sum+=num;
        }
        int left_sum=0;

        for (int i = 0; i < nums.size()-1; i++) {
            left_sum+=nums.get(i);
            total_sum-=nums.get(i);

            if (left_sum==total_sum){
                return true;
            }
        }
        return false;
    }

}
