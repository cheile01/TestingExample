package myPackage;

public class Adder {

	public int add(int input1, int input2) {
		int result = input1;
		for(int i=0; i<input2; i++){
            result++;
		}
		return result;
	}

}
