package port;

import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class 강화 {
	static Random r = new Random();
	static int Pro;
	static int 성공확률, 실패확률;
	static int 강화비용;
	static int 복구;
	static Scanner sc = new Scanner(System.in);
	static DecimalFormat dc = new DecimalFormat("###,###,###,###");
	
	public void menu(Oi o){	//단계별 강화 확률 설정
		if(o.stack==2) {
			switch(o.Star) {
			case 10 :
				강화비용=12966500;
				break;
			case 11 :
				강화비용=16640100;
				break;
			case 12 :
				강화비용=20356300;
				break;
			case 15 :
				강화비용=71316500;
				break;
			case 16 :
				강화비용=83999600;
				break;
			case 17 :
				강화비용=98016700;
				break;
			case 20 :
				강화비용=148612400;
				break;
			case 21 :
				강화비용=168501500;
				break;
			case 22 :
				강화비용=189988600;
				break;
			} 강화STACK(o);
		} else {
			switch(o.Star) {
			case 0 :
				강화비용=321000;
				성공확률 = 95;
				강화1(o);
				break;
			case 1 :
				강화비용=641000;
				성공확률 = 90;
				강화1(o);
				break;
			case 2 :
				강화비용=961000;
				성공확률 = 85;
				강화1(o);
				break;
			case 3 :
				강화비용=1281000;
				성공확률 = 85;
				강화1(o);
				break;
			case 4 :
				강화비용=1601000;
				성공확률 = 80;
				강화1(o);
				break;
			case 5 :
				강화비용=1921000;
				성공확률 = 75;
				강화1(o);
				break;
			case 6 :
				강화비용=2241000;
				성공확률 = 70;
				강화1(o);
				break;
			case 7 :
				강화비용=2561000;
				성공확률 = 65;
				강화1(o);
				break;
			case 8 :
				강화비용=2881000;
				성공확률 = 60;
				강화1(o);
				break;
			case 9 :
				강화비용=3201000;
				성공확률 = 55;
				강화1(o);
				break;
			case 10 :
				강화비용=12966500;
				성공확률 = 50;
				강화1(o);
				break;
			case 11 :
				강화비용=16400100;
				성공확률 = 450;
				실패확률 = 1000;
				강화2(o);
				break;
			case 12 :
				강화비용=20356300;
				성공확률 = 400;
				실패확률 = 994;
				강화2(o);
				break;
			case 13 :
				강화비용=24865300;
				성공확률 = 350;
				실패확률 = 987;
				강화2(o);
				break;
			case 14 :
				강화비용=29956500;
				성공확률 = 350;
				실패확률 = 986;
				강화2(o);
				break;
			case 15 :
				강화비용=71316500;
				성공확률 = 300;
				실패확률 = 979;
				강화3(o);
				break;
			case 16 :
				강화비용=83999600;
				성공확률 = 300;
				실패확률 = 979;
				강화2(o);
				break;
			case 17 :
				강화비용=98017700;
				성공확률 = 300;
				실패확률 = 972;
				강화2(o);
				break;
			case 18 :
				강화비용=113422300;
				성공확률 = 300;
				실패확률 = 972;
				강화2(o);
				break;
			case 19 :
				강화비용=130720000;
				성공확률 = 300;
				실패확률 = 972;
				강화2(o);
				break;
			case 20 :
				강화비용=148612400;
				성공확률 = 300;
				실패확률 = 930;
				강화3(o);
				break;
			case 21 :
				강화비용=168501500;
				성공확률 = 300;
				실패확률 = 930;
				강화2(o);
				break;
			case 22 :
				강화비용=189988600;
				성공확률 = 30;
				실패확률 = 806;
				강화2(o);
				break;
			case 23 :
				강화비용=213124000;
				성공확률 = 20;
				실패확률 = 706;
				강화2(o);
				break;
			case 24 :
				강화비용=237957700;
				성공확률 = 10;
				실패확률 = 600;
				강화2(o);
				break;
			}
		}
	}
	
	public static void 강화1(Oi o) { //0~~~10강화(실패시 단계 유지)
		Pro = Math.abs(r.nextInt(100)+1);
		String 강화전 = dc.format(o.메소);
		String 강화후 = dc.format(o.메소-강화비용);
		
		if(o.메소<강화비용) {
			System.out.println("메소가 부족합니다\n");
		} else if(Pro<=성공확률) {
			o.set성공();
			o.setStar();
			o.stack=0;
			o.메소=o.메소-강화비용;
			System.out.println("    강화에 성공하였습니다.\n         ★"+(o.getStar()-1)+" >> ★"+o.getStar()+"\n");
			System.out.println("메소: "+강화전+" >> "+강화후);
			System.out.println();
		} else{
			System.out.println("    강화에 실패하였습니다.\n         ★"+o.getStar()+" >> ★"+o.getStar()+"\n");
			System.out.println("메소: "+강화전+" >> "+강화후);
			System.out.println();
			o.메소=o.메소-강화비용;
			o.set실패();
		}
	}
	
	public static void 강화2(Oi o) { //11~~14 && 16~~19 && 21~~24 강화(실패시 단계 하락,파괴)
		boolean ke = true;
		
		Pro = Math.abs(r.nextInt(1000)+1);
		String 강화전 = dc.format(o.메소);
		String 강화후 = dc.format(o.메소-강화비용);
		String 복구후 = dc.format((o.메소-강화비용)-1000000000);;
		
		if(o.메소<강화비용) {
			System.out.println("메소가 부족합니다\n");
		} else if(Pro<=성공확률) {
			o.set성공();
			o.setStar();
			o.stack=0;
			o.메소=o.메소-강화비용;
			System.out.println("    강화에 성공하였습니다.\n         ★"+(o.getStar()-1)+" >> ★"+o.getStar()+"\n");
			System.out.println("메소: "+강화전+" >> "+강화후);
			System.out.println();
		} else if(Pro<=실패확률){
			o.set실패();
			o.setStack();
			o.testStar();
			o.메소=o.메소-강화비용;
			System.out.println("    강화에 실패하였습니다.\n         ★"+(o.getStar()+1)+" >> ★"+o.getStar()+"\n");
			System.out.println("메소: "+강화전+" >> "+강화후);
			System.out.println();
		}else {
			o.메소=o.메소-강화비용;
			o.set파괴();
			System.out.println("메소: "+강화전+" >> "+강화후);
			System.out.println("    장비가 파괴되었습니다.");
			System.out.println("    장비를 되살리시겠습니까?");	
			while(ke) {
				System.out.println("    0-되살리기 1-종료");
				복구 = sc.nextInt();
				if(복구 <0 || 복구>1) {
					System.out.println("!0~1");
				} else {
					switch(복구){
						case 0:
							if((o.메소-1000000000)<0) {
								System.out.println("메소가 부족합니다");
							}else {		
								o.메소=o.메소-1000000000;
								System.out.println("메소: "+강화후+" >> "+복구후);
								System.out.println("    ★"+o.Star+" >>  ★"+(o.Star-3));
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
	
	public static void 강화3(Oi o) { //15, 20강화(실패시 단계 유지, 파괴)
		boolean ke = true;
		Pro = Math.abs(r.nextInt(1000)+1);
		
		String 강화전 = dc.format(o.메소);
		String 강화후 = dc.format(o.메소-강화비용);
		String 복구후 = dc.format((o.메소-강화비용)-1000000000);
		
		if(o.메소<강화비용) {
			System.out.println("메소가 부족합니다\n");
		}else if(Pro<=성공확률) {
			o.set성공();
			o.setStar();
			o.stack=0;
			o.메소=o.메소-강화비용;
			System.out.println("    강화에 성공하였습니다.\n         ★"+(o.getStar()-1)+" >> ★"+o.getStar()+"\n");
			System.out.println("메소: "+강화전+" >> "+강화후);
			System.out.println();
		} else if(Pro<=실패확률){
			o.set실패();
			o.메소=o.메소-강화비용;
			System.out.println("    강화에 실패하였습니다.\n         ★"+o.getStar()+" >> ★"+o.getStar()+"\n");
			System.out.println("메소: "+강화전+" >> "+강화후);
			System.out.println();
		} else {
			o.메소=o.메소-강화비용;
			o.set파괴();
			System.out.println("메소: "+강화전+" >> "+강화후);
			System.out.println("    장비가 파괴되었습니다.");
			System.out.println("    장비를 되살리시겠습니까?");
			
			while(ke) {
				System.out.println("    0-되살리기 1-종료");
				복구 = sc.nextInt();
				if(복구 <0 || 복구>1) {
					System.out.println("!0~1");
				} else {
					switch(복구){
						case 0:
							if((o.메소-1000000000)<0) {
								System.out.println("메소가 부족합니다");
							}else {		
								o.메소=o.메소-1000000000;
								System.out.println("메소: "+강화후+" >> "+복구후);
								System.out.println("    ★"+o.Star+" >>  ★"+(o.Star-3));
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
	
	public void 파괴방지강화(Oi o) {
		switch(o.Star) {
		case 12:
			성공확률=400;
			강화비용=40712600;
			break;
		case 13:
			성공확률=350;
			강화비용=49730600;
			break;
		case 14:
			성공확률=350;
			강화비용=59913000;
			break;
		case 15:
			성공확률=300;
			강화비용=142633000;
			break;
		case 16:
			성공확률=300;
			강화비용=167999200;
			break;
		}
		
		String 강화전 = dc.format(o.메소);
		String 강화후 = dc.format(o.메소-강화비용);
		
		
		Pro = Math.abs(r.nextInt(1000)+1);
		if(o.메소<강화비용) {
			System.out.println("메소가 부족합니다\n");
		} else if(Pro<=성공확률){
			o.set성공();
			o.setStar();
			o.stack=0;
			o.메소=o.메소-강화비용;
			System.out.println("    강화에 성공하였습니다.\n         ★"+(o.getStar()-1)+" >> ★"+o.getStar()+"\n");
			System.out.println("메소: "+강화전+" >> "+강화후);
			System.out.println();
		}else if(o.Star==15){
			o.set실패();
			o.메소=o.메소-강화비용;
			System.out.println("    강화에 실패하였습니다.\n         ★"+o.getStar()+" >> ★"+o.getStar()+"\n");
			System.out.println("메소: "+강화전+" >> "+강화후);
			System.out.println();
		}else {
			o.set실패();
			o.testStar();
			o.setStack();
			o.메소=o.메소-강화비용;
			System.out.println("    강화에 실패하였습니다.\n         ★"+(o.getStar()+1)+" >> ★"+o.getStar()+"\n");
			System.out.println("메소: "+강화전+" >> "+강화후);
			System.out.println();
		}		
	}
	
	public static void 강화STACK(Oi o) {	//연속으로 강화 실패시 100% 성공
		
		String 강화전 = dc.format(o.메소);
		String 강화후 = dc.format(o.메소-강화비용);
		
		o.set성공();
		o.setStar();
		o.stack=0;
		o.메소=o.메소-강화비용;
		System.out.println("    강화에 성공하였습니다.\n         ★"+(o.getStar()-1)+" >> ★"+o.getStar()+"\n");
		System.out.println("메소: "+강화전+" >> "+강화후);
		System.out.println();
	}
}