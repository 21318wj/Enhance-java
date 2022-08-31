package port;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {	
		Oi o = new Oi();
		강화 강화 = new 강화();
		정보 정보 = new 정보();
		int menu;
		Scanner sc = new Scanner(System.in);
		while(o.Ke) {
			System.out.println("===========menu==========");
			System.out.println("0-강화☆  1-강화★(파괴방지)");
			System.out.println("2-정보    3-종료");
			System.out.print("▶▶");
			
			do {
				menu = sc.nextInt();
				if(menu<0||menu>2) {
					System.out.println("!0~2");
				}
			}while(menu<0||menu>2);
					
			switch(menu) {
				case 0 :
					강화.menu(o);	    //0-강화
					break;
			    case 1 :
			    	if(o.Star>11&&o.Star<17&&o.stack<2) {		    		
			    		강화.파괴방지강화(o);
			    	}else if(o.Star<12|| o.Star>16) {
			    			System.out.println("파괴방지가 불가능한 단계입니다.");
			    			System.out.println();
			    	}else if(o.stack==2) {
			    			System.out.println("연속으로 강화를 실패하여");
			    			System.out.println("성공확률 100%상태입니다.\n");
			    	}
			    	break;
			    case 2 :
			    	정보.menu(o);		//1-강화 정보
			    	break;
			    case 3 :
			    	o.Ke = false;   //종료
			    	break;
			}
		}			
	}	
}
