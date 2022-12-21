package test;
import java.util.*;

class Integer extends Exception {
}
class Integer1 extends Exception {
}

public class J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("密碼輸入測試");
		int num;
		int num2;
		int num3;
		int num4;
		try {
			System.out.print("請輸入密碼:");
			num = scn.nextInt();
			System.out.print("請再輸入一次密碼:");
			num2 = scn.nextInt();
			System.out.print("請再輸入一次密碼:");
			num3 = scn.nextInt();
			if (num != num2)
				throw new Integer();
			else if (num3 != num2)
				throw new Integer1();
			else
				System.out.println("密碼正確");
				
		} catch (Integer e) {
			System.out.println("與第一次輸入的不同");
		} 
		catch (Integer1 e) {
			System.out.println("與第一次輸入的不同");
		} 
		 catch (InputMismatchException e) {
			System.out.println("輸入三次錯誤，程式停止");
		}
		
	
	}

}
