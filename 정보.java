package port;
	import java.text.DecimalFormat;
	public class 정보 {
		static String 강화비용,파방비용;
	public void menu(Oi o){
		DecimalFormat dc = new DecimalFormat("###,###,###,###");
		String won = dc.format(o.메소);
		String won2 = dc.format(o.사용메소-o.메소);
		
		System.out.println("현재 메소: "+won);
		System.out.println("사용 메소: "+won2);
		System.out.println("강화횟수: "+(o.get성공()+o.get실패()+o.get파괴()));
		System.out.println("성공횟수: "+o.get성공());
		System.out.println("실패횟수: "+o.get실패());
		System.out.println("파괴횟수: "+o.get파괴());
		System.out.println("STACK: "+o.getStack());
		System.out.println();
		System.out.println("          TEST+"+o.getStar());	
		if(o.getStack()==2) {
			switch(o.getStar()) {
			case 10 :
				강화비용="12,966,500";
				System.out.println("★★★★★_★★★★★_☆☆☆☆☆");
				System.out.printf("     ☆☆☆☆☆_☆☆☆☆☆\n");
				break; 
			case 11 :
				강화비용="16,400,100";
				System.out.println("★★★★★_★★★★★_★☆☆☆☆");
				System.out.println("     ☆☆☆☆☆_☆☆☆☆☆\n");
				break;
			case 12 :
				강화비용="20,356,300";
				System.out.println("★★★★★_★★★★★_★★☆☆☆");
				System.out.println("     ☆☆☆☆☆_☆☆☆☆☆\n");			
				break;
			case 15 :
				강화비용="71,316,500";
				System.out.println("★★★★★_★★★★★_★★★★★");
				System.out.println("     ☆☆☆☆☆_☆☆☆☆☆\n");
				break;
			case 16 :
				강화비용="83,999,600";
				System.out.println("★★★★★_★★★★★_★★★★★");
				System.out.println("     ★☆☆☆☆_☆☆☆☆☆\n");
				break;
			case 17 :
				강화비용="98,016,700";
				System.out.println("★★★★★_★★★★★_★★★★★");
				System.out.println("     ★★☆☆☆_☆☆☆☆☆\n");
				break;
			case 20 :
				강화비용="148,612,400";
				System.out.println("★★★★★_★★★★★_★★★★★");
				System.out.println("     ★★★★★_☆☆☆☆☆\n");
				break;
			case 21 :
				강화비용="168,501,500";
				System.out.println("★★★★★_★★★★★_★★★★★");
				System.out.println("     ★★★★★_★☆☆☆☆\n");
				break;
			case 22 :
				강화비용="189,988,600";
				System.out.println("★★★★★_★★★★★_★★★★★");
				System.out.println("     ★★★★★_★★☆☆☆\n");
				break; 
			}
			System.out.println();
			System.out.println("연속으로 강화를 실패하여\n성공 확률이 100.0%가 되었습니다.\n");
			System.out.println("성공확률: 100.0%");
			System.out.println("강화비용: "+강화비용+"\n");
		} else{	
		switch(o.getStar()) {
			case 0 :
				강화비용="321,000";
				정보0();
				break;
			case 1 :
				강화비용="641,000";
				정보1();
				break;
			case 2 :
				강화비용="961,000";
				정보2();
				break;
			case 3 :
				강화비용="1,281,000";
				정보3();
				break;
			case 4 :
				강화비용="1,601,000";
				정보4();
				break;
			case 5 :
				강화비용="1,921,000";
				정보5();
				break;
			case 6 :
				강화비용="2,241,000";
				정보6();
				break;
			case 7 :
				강화비용="2,561,000";
				정보7();
				break;
			case 8 :
				강화비용="2,881,000";
				정보8();
				break;
			case 9 :
				강화비용="3,201,000";
				정보9();
				break;	
			case 10 :
				강화비용="12,966,500";
				정보10();
				break;
			case 11 :
				강화비용="16,400,100";
				정보11();
				break;
			case 12 :
				강화비용="20,356,300";
				파방비용="40,712,600";
				정보12();
				break;
			case 13 :
				강화비용="24,865,300";
				파방비용="49,730,600";
				정보13();
				break;
			case 14 :
				강화비용="29,956,500";
				파방비용="59,130,000";
				정보14();
				break;
			case 15 :
				강화비용="71,316,500";
				파방비용="142,633,000";
				정보15();
				break;
			case 16 :
				강화비용="83,999,600";
				파방비용="167,999,200";
				정보16();
				break;
			case 17 :
				강화비용="98,017,700";
				정보17();
				break;
			case 18 :
				강화비용="113,422,300";
				정보18();
				break;
			case 19 :
				강화비용="130,270,000";
				정보19();
				break;
			case 20 :
				강화비용="148,612,400";
				정보20();
				break;
			case 21 :
				강화비용="168,501,500";
				정보21();
				break;
			case 22 :
				강화비용="189,988,600";
				정보22();
				break;
			case 23 :
				강화비용="213,124,000";
				정보23();
				break;
			case 24 :
				강화비용="237,957,700";
				정보24();
				break;	
			case 25 :
				정보25();
				break;
		}
		}
		
	}
		public static void 정보0() {
			System.out.println("☆☆☆☆☆_☆☆☆☆☆_☆☆☆☆☆");
			System.out.println("     ☆☆☆☆☆_☆☆☆☆☆\n");
			System.out.println("성공확률: 95.0%");
			System.out.println("실패(유지)확률: 5.0%");
			System.out.println("강화비용: "+강화비용+"\n");
		}
		
		public static void 정보1() {
			System.out.println("★☆☆☆☆_☆☆☆☆☆_☆☆☆☆☆");
			System.out.println("     ☆☆☆☆☆_☆☆☆☆☆\n");
			System.out.println("성공확률: 90.0%");
			System.out.println("실패(유지)확률: 10.0%");
			System.out.println("강화비용: "+강화비용+"\n");
			
		}
		public static void 정보2() {
			System.out.println("★★☆☆☆_☆☆☆☆☆_☆☆☆☆☆");
			System.out.println("     ☆☆☆☆☆_☆☆☆☆☆\n");
			System.out.println("성공확률: 85.0%");
			System.out.println("실패(유지)확률: 15.0%");
			System.out.println("강화비용: "+강화비용+"\n");
		}
		
		public static void 정보3() {
			System.out.println("★★★☆☆_☆☆☆☆☆_☆☆☆☆☆");
			System.out.println("     ☆☆☆☆☆_☆☆☆☆☆\n");
			System.out.println("성공확률:85.0%");
			System.out.println("실패(유지)확률: 15.0%");
			System.out.println("강화비용: "+강화비용+"\n");
		}
		
		public static void 정보4() {
			System.out.println("★★★★☆_☆☆☆☆☆_☆☆☆☆☆");
			System.out.println("     ☆☆☆☆☆_☆☆☆☆☆\n");
			System.out.println("성공확률: 80.0%");
			System.out.println("실패(유지)확률: 20.0%");
			System.out.println("강화비용: "+강화비용+"\n");
		}
		
		public static void 정보5() {
			System.out.println("★★★★★_☆☆☆☆☆_☆☆☆☆☆");
			System.out.println("     ☆☆☆☆☆_☆☆☆☆☆\n");
			System.out.println("성공확률: 75.0%");
			System.out.println("실패(유지)확률: 25.0%");
			System.out.println("강화비용: "+강화비용+"\n");
		}
		
		public static void 정보6() {
			System.out.println("★★★★★_★☆☆☆☆_☆☆☆☆☆");
			System.out.println("     ☆☆☆☆☆_☆☆☆☆☆\n");
			System.out.println("성공확률: 70.0%");
			System.out.println("실패(유지)확률: 30.0%");
			System.out.println("강화비용: "+강화비용+"\n");
		}
		
		public static void 정보7() {
			System.out.println("★★★★★_★★☆☆☆_☆☆☆☆☆");
			System.out.println("     ☆☆☆☆☆_☆☆☆☆☆\n");
			System.out.println("성공확률: 65.0%");
			System.out.println("실패(유지)확률: 35.0%");
			System.out.println("강화비용: "+강화비용+"\n");
		}
		
		public static void 정보8() {
			System.out.println("★★★★★_★★★☆☆_☆☆☆☆☆");
			System.out.println("     ☆☆☆☆☆_☆☆☆☆☆\n");
			System.out.println("성공확률: 60.0%\n");
			System.out.println("실패(유지)확률: 40.0%");
			System.out.println("강화비용: "+강화비용+"\n");
		}
		
		public static void 정보9() {
			System.out.println("★★★★★_★★★★☆_☆☆☆☆☆");
			System.out.println("     ☆☆☆☆☆_☆☆☆☆☆\n");
			System.out.println("성공확률: 55.0%");
			System.out.println("실패(유지)확률: 45.0%");
			System.out.println("강화비용: "+강화비용+"\n");
		}
		
		public static void 정보10() {
			System.out.println("★★★★★_★★★★★_☆☆☆☆☆");
			System.out.println("     ☆☆☆☆☆_☆☆☆☆☆\n");
			System.out.println("성공확률: 50.0%");
			System.out.println("실패(유지)확률: 50.0%");
			System.out.println("강화비용: "+강화비용+"\n");
		}
		
		public static void 정보11() {
			System.out.println("★★★★★_★★★★★_★☆☆☆☆");
			System.out.println("     ☆☆☆☆☆_☆☆☆☆☆\n");
			System.out.println("성공확률: 45.0%");
			System.out.println("실패(하락)확률: 55.0%");
			System.out.println("강화비용: "+강화비용+"\n");
		}	
			
		public static void 정보12() {
			System.out.println("★★★★★_★★★★★_★★☆☆☆");
			System.out.println("     ☆☆☆☆☆_☆☆☆☆☆\n");
			System.out.println("성공확률: 40.0%");
			System.out.println("실패(하락)확률: 59.4%");
			System.out.println("파괴확률: 0.6%");
			System.out.println("강화비용: "+강화비용);
			System.out.println("파괴방지비용: "+파방비용+"\n");
		}
		
		public static void 정보13() {
			System.out.println("★★★★★_★★★★★_★★★☆☆");
			System.out.println("     ☆☆☆☆☆_☆☆☆☆☆\n");
			System.out.println("성공확률: 35.0%");
			System.out.println("실패(하락)확률: 63.7%");
			System.out.println("파괴확률: 1.3%");
			System.out.println("강화비용: "+강화비용);
			System.out.println("파괴방지비용: "+파방비용+"\n");
		}
		
		public static void 정보14() {
			System.out.println("★★★★★_★★★★★_★★★★☆");
			System.out.println("     ☆☆☆☆☆_☆☆☆☆☆\n");
			System.out.println("성공확률: 35.0%");
			System.out.println("실패(하락)확률: 63.6%");
			System.out.println("파괴확률: 1.4%");
			System.out.println("강화비용: "+강화비용);
			System.out.println("파괴방지비용: "+파방비용+"\n");
		}
		
		public static void 정보15() {
			System.out.println("★★★★★_★★★★★_★★★★★");
			System.out.println("     ☆☆☆☆☆_☆☆☆☆☆\n");
			System.out.println("성공확률: 30.0%");
			System.out.println("실패(유지)확률: 67.9%");
			System.out.println("파괴확률: 2.1%");
			System.out.println("강화비용: "+강화비용);
			System.out.println("파괴방지비용: "+파방비용+"\n");
		}	
		
		public static void 정보16() {
			System.out.println("★★★★★_★★★★★_★★★★★");
			System.out.println("     ★☆☆☆☆_☆☆☆☆☆\n");
			System.out.println("성공확률: 30.0%");
			System.out.println("실패(하락)확률: 67.9%");
			System.out.println("파괴확률: 2.1%");
			System.out.println("강화비용: "+강화비용);
			System.out.println("파괴방지비용: "+파방비용+"\n");
		}
		
		public static void 정보17() {
			System.out.println("★★★★★_★★★★★_★★★★★");
			System.out.println("     ★★☆☆☆_☆☆☆☆☆\n");
			System.out.println("성공확률: 30.0%");
			System.out.println("실패(하락)확률: 67.2%");
			System.out.println("파괴확률: 2.8%");
			System.out.println("강화비용: "+강화비용+"\n");
		}
		
		public static void 정보18() {
			System.out.println("★★★★★_★★★★★_★★★★★");
			System.out.println("     ★★★☆☆_☆☆☆☆☆\n");
			System.out.println("성공확률: 30.0%");
			System.out.println("실패(하락)확률: 67.2%");
			System.out.println("파괴확률: 2.8%");
			System.out.println("강화비용: "+강화비용+"\n");
		}
		
		public static void 정보19() {
			System.out.println("★★★★★_★★★★★_★★★★★");
			System.out.println("     ★★★★☆_☆☆☆☆☆\n");
			System.out.println("성공확률: 30.0%");
			System.out.println("실패(하락)확률: 67.2%");
			System.out.println("파괴확률: 2.8%");
			System.out.println("강화비용: "+강화비용+"\n");
		}
		
		public static void 정보20() {
			System.out.println("★★★★★_★★★★★_★★★★★");
			System.out.println("     ★★★★★_☆☆☆☆☆\n");
			System.out.println("성공확률: 30.0%");
			System.out.println("실패(유지)확률: 63.0%");
			System.out.println("파괴확률: 7.0%");
			System.out.println("강화비용: "+강화비용+"\n");
		}
		
		public static void 정보21() {
			System.out.println("★★★★★_★★★★★_★★★★★");
			System.out.println("     ★★★★★_★☆☆☆☆\n");
			System.out.println("성공확률: 30.0%");
			System.out.println("실패(하락)확률: 63.0%");
			System.out.println("파괴확률: 7.0%");
			System.out.println("강화비용: "+강화비용+"\n");
		}
		
		public static void 정보22() {
			System.out.println("★★★★★_★★★★★_★★★★★");
			System.out.println("     ★★★★★_★★☆☆☆\n");
			System.out.println("성공확률: 3.0%");
			System.out.println("실패(하락)확률: 77.6%");
			System.out.println("파괴확률: 19.4%");
			System.out.println("강화비용: "+강화비용+"\n");
		}
		
		public static void 정보23() {
			System.out.println("★★★★★_★★★★★_★★★★★");
			System.out.println("     ★★★★★_★★★☆☆\n");
			System.out.println("성공확률: 2.0%");
			System.out.println("실패(하락)확률: 67.6%");
			System.out.println("파괴확률: 29.4%");
			System.out.println("강화비용: "+강화비용+"\n");
		}
		
		public static void 정보24() {
			System.out.println("★★★★★_★★★★★_★★★★★");
			System.out.println("     ★★★★★_★★★★☆\n");
			System.out.println("성공확률: 1.0%");
			System.out.println("실패(하락)확률: 59.0%");
			System.out.println("파괴확률: 40.0%");
			System.out.println("강화비용: "+강화비용+"\n");
		}
		public static void 정보25() {
			System.out.println("★★★★★_★★★★★_★★★★★");
			System.out.println("     ★★★★★_★★★★★\n");
			
		}
}
