package port;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {	
		Oi o = new Oi();
		��ȭ ��ȭ = new ��ȭ();
		���� ���� = new ����();
		int menu;
		Scanner sc = new Scanner(System.in);
		while(o.Ke) {
			System.out.println("===========menu==========");
			System.out.println("0-��ȭ��  1-��ȭ��(�ı�����)");
			System.out.println("2-����    3-����");
			System.out.print("����");
			
			do {
				menu = sc.nextInt();
				if(menu<0||menu>2) {
					System.out.println("!0~2");
				}
			}while(menu<0||menu>2);
					
			switch(menu) {
				case 0 :
					��ȭ.menu(o);	    //0-��ȭ
					break;
			    case 1 :
			    	if(o.Star>11&&o.Star<17&&o.stack<2) {		    		
			    		��ȭ.�ı�������ȭ(o);
			    	}else if(o.Star<12|| o.Star>16) {
			    			System.out.println("�ı������� �Ұ����� �ܰ��Դϴ�.");
			    			System.out.println();
			    	}else if(o.stack==2) {
			    			System.out.println("�������� ��ȭ�� �����Ͽ�");
			    			System.out.println("����Ȯ�� 100%�����Դϴ�.\n");
			    	}
			    	break;
			    case 2 :
			    	����.menu(o);		//1-��ȭ ����
			    	break;
			    case 3 :
			    	o.Ke = false;   //����
			    	break;
			}
		}			
	}	
}
