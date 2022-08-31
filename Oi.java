package port;

import java.util.Scanner;

public class Oi {
	int Star; 
	boolean Ke = true;
	int 성공,실패,파괴,stack;
	Scanner sc = new Scanner(System.in);
	long 메소,사용메소;
	
	
	public Oi(){
		System.out.print("시작메소: ");
		메소 = sc.nextLong();
		사용메소 = 메소;
		성공 = 0;
		실패 = 0;
		파괴 = 0;
		Star = 0;
	}
	
	public int getStar() {
		return Star;
	}
	
	public void setStar() {
		Star++;
	}
	
	public void testStar() {
		Star--;
	}
	
	public int get성공() {
		return 성공;
	}
	
	public void set성공() {
		성공++;
	}
	
	public int get실패() {
		return 실패;
	}
	
	public void set실패() {
		실패++;
	}
	
	public int get파괴() {
		return 파괴;
	}
	
	public void set파괴() {
		파괴++;
	}
	
	public int getStack() {
		return stack;
	}
	
	public void setStack() {
		stack++;
	}
}
