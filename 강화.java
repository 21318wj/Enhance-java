package port;

import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ��ȭ {
	static Random r = new Random();
	static int Pro;
	static int ����Ȯ��, ����Ȯ��;
	static int ��ȭ���;
	static int ����;
	static Scanner sc = new Scanner(System.in);
	static DecimalFormat dc = new DecimalFormat("###,###,###,###");
	
	public void menu(Oi o){	//�ܰ躰 ��ȭ Ȯ�� ����
		if(o.stack==2) {
			switch(o.Star) {
			case 10 :
				��ȭ���=12966500;
				break;
			case 11 :
				��ȭ���=16640100;
				break;
			case 12 :
				��ȭ���=20356300;
				break;
			case 15 :
				��ȭ���=71316500;
				break;
			case 16 :
				��ȭ���=83999600;
				break;
			case 17 :
				��ȭ���=98016700;
				break;
			case 20 :
				��ȭ���=148612400;
				break;
			case 21 :
				��ȭ���=168501500;
				break;
			case 22 :
				��ȭ���=189988600;
				break;
			} ��ȭSTACK(o);
		} else {
			switch(o.Star) {
			case 0 :
				��ȭ���=321000;
				����Ȯ�� = 95;
				��ȭ1(o);
				break;
			case 1 :
				��ȭ���=641000;
				����Ȯ�� = 90;
				��ȭ1(o);
				break;
			case 2 :
				��ȭ���=961000;
				����Ȯ�� = 85;
				��ȭ1(o);
				break;
			case 3 :
				��ȭ���=1281000;
				����Ȯ�� = 85;
				��ȭ1(o);
				break;
			case 4 :
				��ȭ���=1601000;
				����Ȯ�� = 80;
				��ȭ1(o);
				break;
			case 5 :
				��ȭ���=1921000;
				����Ȯ�� = 75;
				��ȭ1(o);
				break;
			case 6 :
				��ȭ���=2241000;
				����Ȯ�� = 70;
				��ȭ1(o);
				break;
			case 7 :
				��ȭ���=2561000;
				����Ȯ�� = 65;
				��ȭ1(o);
				break;
			case 8 :
				��ȭ���=2881000;
				����Ȯ�� = 60;
				��ȭ1(o);
				break;
			case 9 :
				��ȭ���=3201000;
				����Ȯ�� = 55;
				��ȭ1(o);
				break;
			case 10 :
				��ȭ���=12966500;
				����Ȯ�� = 50;
				��ȭ1(o);
				break;
			case 11 :
				��ȭ���=16400100;
				����Ȯ�� = 450;
				����Ȯ�� = 1000;
				��ȭ2(o);
				break;
			case 12 :
				��ȭ���=20356300;
				����Ȯ�� = 400;
				����Ȯ�� = 994;
				��ȭ2(o);
				break;
			case 13 :
				��ȭ���=24865300;
				����Ȯ�� = 350;
				����Ȯ�� = 987;
				��ȭ2(o);
				break;
			case 14 :
				��ȭ���=29956500;
				����Ȯ�� = 350;
				����Ȯ�� = 986;
				��ȭ2(o);
				break;
			case 15 :
				��ȭ���=71316500;
				����Ȯ�� = 300;
				����Ȯ�� = 979;
				��ȭ3(o);
				break;
			case 16 :
				��ȭ���=83999600;
				����Ȯ�� = 300;
				����Ȯ�� = 979;
				��ȭ2(o);
				break;
			case 17 :
				��ȭ���=98017700;
				����Ȯ�� = 300;
				����Ȯ�� = 972;
				��ȭ2(o);
				break;
			case 18 :
				��ȭ���=113422300;
				����Ȯ�� = 300;
				����Ȯ�� = 972;
				��ȭ2(o);
				break;
			case 19 :
				��ȭ���=130720000;
				����Ȯ�� = 300;
				����Ȯ�� = 972;
				��ȭ2(o);
				break;
			case 20 :
				��ȭ���=148612400;
				����Ȯ�� = 300;
				����Ȯ�� = 930;
				��ȭ3(o);
				break;
			case 21 :
				��ȭ���=168501500;
				����Ȯ�� = 300;
				����Ȯ�� = 930;
				��ȭ2(o);
				break;
			case 22 :
				��ȭ���=189988600;
				����Ȯ�� = 30;
				����Ȯ�� = 806;
				��ȭ2(o);
				break;
			case 23 :
				��ȭ���=213124000;
				����Ȯ�� = 20;
				����Ȯ�� = 706;
				��ȭ2(o);
				break;
			case 24 :
				��ȭ���=237957700;
				����Ȯ�� = 10;
				����Ȯ�� = 600;
				��ȭ2(o);
				break;
			}
		}
	}
	
	public static void ��ȭ1(Oi o) { //0~~~10��ȭ(���н� �ܰ� ����)
		Pro = Math.abs(r.nextInt(100)+1);
		String ��ȭ�� = dc.format(o.�޼�);
		String ��ȭ�� = dc.format(o.�޼�-��ȭ���);
		
		if(o.�޼�<��ȭ���) {
			System.out.println("�޼Ұ� �����մϴ�\n");
		} else if(Pro<=����Ȯ��) {
			o.set����();
			o.setStar();
			o.stack=0;
			o.�޼�=o.�޼�-��ȭ���;
			System.out.println("    ��ȭ�� �����Ͽ����ϴ�.\n         ��"+(o.getStar()-1)+" >> ��"+o.getStar()+"\n");
			System.out.println("�޼�: "+��ȭ��+" >> "+��ȭ��);
			System.out.println();
		} else{
			System.out.println("    ��ȭ�� �����Ͽ����ϴ�.\n         ��"+o.getStar()+" >> ��"+o.getStar()+"\n");
			System.out.println("�޼�: "+��ȭ��+" >> "+��ȭ��);
			System.out.println();
			o.�޼�=o.�޼�-��ȭ���;
			o.set����();
		}
	}
	
	public static void ��ȭ2(Oi o) { //11~~14 && 16~~19 && 21~~24 ��ȭ(���н� �ܰ� �϶�,�ı�)
		boolean ke = true;
		
		Pro = Math.abs(r.nextInt(1000)+1);
		String ��ȭ�� = dc.format(o.�޼�);
		String ��ȭ�� = dc.format(o.�޼�-��ȭ���);
		String ������ = dc.format((o.�޼�-��ȭ���)-1000000000);;
		
		if(o.�޼�<��ȭ���) {
			System.out.println("�޼Ұ� �����մϴ�\n");
		} else if(Pro<=����Ȯ��) {
			o.set����();
			o.setStar();
			o.stack=0;
			o.�޼�=o.�޼�-��ȭ���;
			System.out.println("    ��ȭ�� �����Ͽ����ϴ�.\n         ��"+(o.getStar()-1)+" >> ��"+o.getStar()+"\n");
			System.out.println("�޼�: "+��ȭ��+" >> "+��ȭ��);
			System.out.println();
		} else if(Pro<=����Ȯ��){
			o.set����();
			o.setStack();
			o.testStar();
			o.�޼�=o.�޼�-��ȭ���;
			System.out.println("    ��ȭ�� �����Ͽ����ϴ�.\n         ��"+(o.getStar()+1)+" >> ��"+o.getStar()+"\n");
			System.out.println("�޼�: "+��ȭ��+" >> "+��ȭ��);
			System.out.println();
		}else {
			o.�޼�=o.�޼�-��ȭ���;
			o.set�ı�();
			System.out.println("�޼�: "+��ȭ��+" >> "+��ȭ��);
			System.out.println("    ��� �ı��Ǿ����ϴ�.");
			System.out.println("    ��� �ǻ츮�ðڽ��ϱ�?");	
			while(ke) {
				System.out.println("    0-�ǻ츮�� 1-����");
				���� = sc.nextInt();
				if(���� <0 || ����>1) {
					System.out.println("!0~1");
				} else {
					switch(����){
						case 0:
							if((o.�޼�-1000000000)<0) {
								System.out.println("�޼Ұ� �����մϴ�");
							}else {		
								o.�޼�=o.�޼�-1000000000;
								System.out.println("�޼�: "+��ȭ��+" >> "+������);
								System.out.println("    ��"+o.Star+" >>  ��"+(o.Star-3));
								o.Star=o.Star-3;
								ke = false;
							}
					    break;
						case 1:
							o.Ke = false;
							ke = false;
							break;
					}	
				}
			}
		}	
	}
	
	public static void ��ȭ3(Oi o) { //15, 20��ȭ(���н� �ܰ� ����, �ı�)
		boolean ke = true;
		Pro = Math.abs(r.nextInt(1000)+1);
		
		String ��ȭ�� = dc.format(o.�޼�);
		String ��ȭ�� = dc.format(o.�޼�-��ȭ���);
		String ������ = dc.format((o.�޼�-��ȭ���)-1000000000);
		
		if(o.�޼�<��ȭ���) {
			System.out.println("�޼Ұ� �����մϴ�\n");
		}else if(Pro<=����Ȯ��) {
			o.set����();
			o.setStar();
			o.stack=0;
			o.�޼�=o.�޼�-��ȭ���;
			System.out.println("    ��ȭ�� �����Ͽ����ϴ�.\n         ��"+(o.getStar()-1)+" >> ��"+o.getStar()+"\n");
			System.out.println("�޼�: "+��ȭ��+" >> "+��ȭ��);
			System.out.println();
		} else if(Pro<=����Ȯ��){
			o.set����();
			o.�޼�=o.�޼�-��ȭ���;
			System.out.println("    ��ȭ�� �����Ͽ����ϴ�.\n         ��"+o.getStar()+" >> ��"+o.getStar()+"\n");
			System.out.println("�޼�: "+��ȭ��+" >> "+��ȭ��);
			System.out.println();
		} else {
			o.�޼�=o.�޼�-��ȭ���;
			o.set�ı�();
			System.out.println("�޼�: "+��ȭ��+" >> "+��ȭ��);
			System.out.println("    ��� �ı��Ǿ����ϴ�.");
			System.out.println("    ��� �ǻ츮�ðڽ��ϱ�?");
			
			while(ke) {
				System.out.println("    0-�ǻ츮�� 1-����");
				���� = sc.nextInt();
				if(���� <0 || ����>1) {
					System.out.println("!0~1");
				} else {
					switch(����){
						case 0:
							if((o.�޼�-1000000000)<0) {
								System.out.println("�޼Ұ� �����մϴ�");
							}else {		
								o.�޼�=o.�޼�-1000000000;
								System.out.println("�޼�: "+��ȭ��+" >> "+������);
								System.out.println("    ��"+o.Star+" >>  ��"+(o.Star-3));
								o.Star=o.Star-3;
								ke = false;
							}
					   break;
						case 1:
							o.Ke = false;
							ke = false;
							break;
					}	
				}
			}
		}			
	}
	
	public void �ı�������ȭ(Oi o) {
		switch(o.Star) {
		case 12:
			����Ȯ��=400;
			��ȭ���=40712600;
			break;
		case 13:
			����Ȯ��=350;
			��ȭ���=49730600;
			break;
		case 14:
			����Ȯ��=350;
			��ȭ���=59913000;
			break;
		case 15:
			����Ȯ��=300;
			��ȭ���=142633000;
			break;
		case 16:
			����Ȯ��=300;
			��ȭ���=167999200;
			break;
		}
		
		String ��ȭ�� = dc.format(o.�޼�);
		String ��ȭ�� = dc.format(o.�޼�-��ȭ���);
		
		
		Pro = Math.abs(r.nextInt(1000)+1);
		if(o.�޼�<��ȭ���) {
			System.out.println("�޼Ұ� �����մϴ�\n");
		} else if(Pro<=����Ȯ��){
			o.set����();
			o.setStar();
			o.stack=0;
			o.�޼�=o.�޼�-��ȭ���;
			System.out.println("    ��ȭ�� �����Ͽ����ϴ�.\n         ��"+(o.getStar()-1)+" >> ��"+o.getStar()+"\n");
			System.out.println("�޼�: "+��ȭ��+" >> "+��ȭ��);
			System.out.println();
		}else if(o.Star==15){
			o.set����();
			o.�޼�=o.�޼�-��ȭ���;
			System.out.println("    ��ȭ�� �����Ͽ����ϴ�.\n         ��"+o.getStar()+" >> ��"+o.getStar()+"\n");
			System.out.println("�޼�: "+��ȭ��+" >> "+��ȭ��);
			System.out.println();
		}else {
			o.set����();
			o.testStar();
			o.setStack();
			o.�޼�=o.�޼�-��ȭ���;
			System.out.println("    ��ȭ�� �����Ͽ����ϴ�.\n         ��"+(o.getStar()+1)+" >> ��"+o.getStar()+"\n");
			System.out.println("�޼�: "+��ȭ��+" >> "+��ȭ��);
			System.out.println();
		}		
	}
	
	public static void ��ȭSTACK(Oi o) {	//�������� ��ȭ ���н� 100% ����
		
		String ��ȭ�� = dc.format(o.�޼�);
		String ��ȭ�� = dc.format(o.�޼�-��ȭ���);
		
		o.set����();
		o.setStar();
		o.stack=0;
		o.�޼�=o.�޼�-��ȭ���;
		System.out.println("    ��ȭ�� �����Ͽ����ϴ�.\n         ��"+(o.getStar()-1)+" >> ��"+o.getStar()+"\n");
		System.out.println("�޼�: "+��ȭ��+" >> "+��ȭ��);
		System.out.println();
	}
}