package myProgram2;


public class Duplicate {

	public static void main(String[] args) {
		int arr[] = {44,64,76,32,86,43,64,32,86,75,22};
		
		System.out.println("Duplicate Elements are: ");
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}

}
