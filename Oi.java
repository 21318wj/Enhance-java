package port;

import java.util.Scanner;

public class Oi {
	int Star; 
	boolean Ke = true;
	int ����,����,�ı�,stack;
	Scanner sc = new Scanner(System.in);
	long �޼�,���޼�;
	
	
	public Oi(){
		System.out.print("���۸޼�: ");
		�޼� = sc.nextLong();
		���޼� = �޼�;
		���� = 0;
		���� = 0;
		�ı� = 0;
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
	
	public int get����() {
		return ����;
	}
	
	public void set����() {
		����++;
	}
	
	public int get����() {
		return ����;
	}
	
	public void set����() {
		����++;
	}
	
	public int get�ı�() {
		return �ı�;
	}
	
	public void set�ı�() {
		�ı�++;
	}
	
	public int getStack() {
		return stack;
	}
	
	public void setStack() {
		stack++;
	}
}
