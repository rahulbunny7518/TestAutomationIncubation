package module2_coreJava;

public class Task06_5 {
	public static void main(String[] args) {
		int[] outer1 = {1, 2, 4, 6};
        int[] inner1 = {2, 4};
        
        System.out.println("Result 1: " + linearIn(outer1, inner1));
	}
	
	 public static boolean linearIn(int[] outer, int[] inner) {
	        int i = 0;
	        int j = 0;

	        while (i < outer.length && j < inner.length) {
	            if (outer[i] == inner[j]) {
	                j++;
	            }
	            i++;
	        }

	        return j == inner.length;
	    }
}
