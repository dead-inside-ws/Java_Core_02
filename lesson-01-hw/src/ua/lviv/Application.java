package ua.lviv;

public class Application {
	public static void main(String[] args) {
		
		int [] array1 = new int [10];
		for (int i = 0; i < array1.length; i++) {
			array1[i]=i;
		}
		int max=0;
		for (int i = 0; i < array1.length-1; i++) {
			if (array1[i]>array1[i+1]) {
				max=array1[i];
			}else {
				max=array1[i+1];
			}
		}
		System.out.println(max);
		int min = array1[0];
		for (int i = 0; i < array1.length; i++) {
			if (array1[i]<min) {
				min=array1[i];
			}
		}
		System.out.println(min);
	}
}
