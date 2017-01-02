import java.util.*;
public class CompareRunningTimes2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter problem size n:");
		int n = sc.nextInt();
		
		//Double nested loop
		long startTime = System.currentTimeMillis();
		int x = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				x++;
			}
		}
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Doubly nested loop: "+ elapsedTime);
	}
}
