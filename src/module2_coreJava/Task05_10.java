package module2_coreJava;

public class Task05_10 {

	public static void main(String[] args) {
	
		String str = "jnv453jik22f1";
		
		StringBuilder iteratingNumber = new StringBuilder();
		
		int answer = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				iteratingNumber.append(str.charAt(i));
			}
			else {
				if(iteratingNumber.length()>0) {
					answer+= Integer.parseInt(iteratingNumber.toString());
					iteratingNumber.setLength(0);
				}
			}
		}
		if(iteratingNumber.length() > 0) {
			answer+= Integer.parseInt(iteratingNumber.toString());
		}
		
		System.out.println("Result is "+ answer);
	}

}
