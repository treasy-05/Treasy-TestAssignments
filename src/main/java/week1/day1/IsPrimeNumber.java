package week1.day1;

public class IsPrimeNumber {

public static void main(String[] args) {
	boolean flag = false;
	int n=17;
	for (int i = 2; i <=n-1; i++) {
		if (n%i==0) {
		System.out.println("Non-Prime");
		flag = true;
		break;
		}
	}
	if(flag == false) {
		System.out.println("Prime");
	}
}
}
