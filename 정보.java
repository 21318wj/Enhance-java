package port;
	import java.text.DecimalFormat;
	public class ���� {
		static String ��ȭ���,�Ĺ���;
	public void menu(Oi o){
		DecimalFormat dc = new DecimalFormat("###,###,###,###");
		String won = dc.format(o.�޼�);
		String won2 = dc.format(o.���޼�-o.�޼�);
		
		System.out.println("���� �޼�: "+won);
		System.out.println("��� �޼�: "+won2);
		System.out.println("��ȭȽ��: "+(o.get����()+o.get����()+o.get�ı�()));
		System.out.println("����Ƚ��: "+o.get����());
		System.out.println("����Ƚ��: "+o.get����());
		System.out.println("�ı�Ƚ��: "+o.get�ı�());
		System.out.println("STACK: "+o.getStack());
		System.out.println();
		System.out.println("          TEST+"+o.getStar());	
		if(o.getStack()==2) {
			switch(o.getStar()) {
			case 10 :
				��ȭ���="12,966,500";
				System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�١١١١�");
				System.out.printf("     �١١١١�_�١١١١�\n");
				break; 
			case 11 :
				��ȭ���="16,400,100";
				System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡ١١١�");
				System.out.println("     �١١١١�_�١١١١�\n");
				break;
			case 12 :
				��ȭ���="20,356,300";
				System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡڡ١١�");
				System.out.println("     �١١١١�_�١١١١�\n");			
				break;
			case 15 :
				��ȭ���="71,316,500";
				System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡڡڡڡ�");
				System.out.println("     �١١١١�_�١١١١�\n");
				break;
			case 16 :
				��ȭ���="83,999,600";
				System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡڡڡڡ�");
				System.out.println("     �ڡ١١١�_�١١١١�\n");
				break;
			case 17 :
				��ȭ���="98,016,700";
				System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡڡڡڡ�");
				System.out.println("     �ڡڡ١١�_�١١١١�\n");
				break;
			case 20 :
				��ȭ���="148,612,400";
				System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡڡڡڡ�");
				System.out.println("     �ڡڡڡڡ�_�١١١١�\n");
				break;
			case 21 :
				��ȭ���="168,501,500";
				System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡڡڡڡ�");
				System.out.println("     �ڡڡڡڡ�_�ڡ١١١�\n");
				break;
			case 22 :
				��ȭ���="189,988,600";
				System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡڡڡڡ�");
				System.out.println("     �ڡڡڡڡ�_�ڡڡ١١�\n");
				break; 
			}
			System.out.println();
			System.out.println("�������� ��ȭ�� �����Ͽ�\n���� Ȯ���� 100.0%�� �Ǿ����ϴ�.\n");
			System.out.println("����Ȯ��: 100.0%");
			System.out.println("��ȭ���: "+��ȭ���+"\n");
		} else{	
		switch(o.getStar()) {
			case 0 :
				��ȭ���="321,000";
				����0();
				break;
			case 1 :
				��ȭ���="641,000";
				����1();
				break;
			case 2 :
				��ȭ���="961,000";
				����2();
				break;
			case 3 :
				��ȭ���="1,281,000";
				����3();
				break;
			case 4 :
				��ȭ���="1,601,000";
				����4();
				break;
			case 5 :
				��ȭ���="1,921,000";
				����5();
				break;
			case 6 :
				��ȭ���="2,241,000";
				����6();
				break;
			case 7 :
				��ȭ���="2,561,000";
				����7();
				break;
			case 8 :
				��ȭ���="2,881,000";
				����8();
				break;
			case 9 :
				��ȭ���="3,201,000";
				����9();
				break;	
			case 10 :
				��ȭ���="12,966,500";
				����10();
				break;
			case 11 :
				��ȭ���="16,400,100";
				����11();
				break;
			case 12 :
				��ȭ���="20,356,300";
				�Ĺ���="40,712,600";
				����12();
				break;
			case 13 :
				��ȭ���="24,865,300";
				�Ĺ���="49,730,600";
				����13();
				break;
			case 14 :
				��ȭ���="29,956,500";
				�Ĺ���="59,130,000";
				����14();
				break;
			case 15 :
				��ȭ���="71,316,500";
				�Ĺ���="142,633,000";
				����15();
				break;
			case 16 :
				��ȭ���="83,999,600";
				�Ĺ���="167,999,200";
				����16();
				break;
			case 17 :
				��ȭ���="98,017,700";
				����17();
				break;
			case 18 :
				��ȭ���="113,422,300";
				����18();
				break;
			case 19 :
				��ȭ���="130,270,000";
				����19();
				break;
			case 20 :
				��ȭ���="148,612,400";
				����20();
				break;
			case 21 :
				��ȭ���="168,501,500";
				����21();
				break;
			case 22 :
				��ȭ���="189,988,600";
				����22();
				break;
			case 23 :
				��ȭ���="213,124,000";
				����23();
				break;
			case 24 :
				��ȭ���="237,957,700";
				����24();
				break;	
			case 25 :
				����25();
				break;
		}
		}
		
	}
		public static void ����0() {
			System.out.println("�١١١١�_�١١١١�_�١١١١�");
			System.out.println("     �١١١١�_�١١١١�\n");
			System.out.println("����Ȯ��: 95.0%");
			System.out.println("����(����)Ȯ��: 5.0%");
			System.out.println("��ȭ���: "+��ȭ���+"\n");
		}
		
		public static void ����1() {
			System.out.println("�ڡ١١١�_�١١١١�_�١١١١�");
			System.out.println("     �١١١١�_�١١١١�\n");
			System.out.println("����Ȯ��: 90.0%");
			System.out.println("����(����)Ȯ��: 10.0%");
			System.out.println("��ȭ���: "+��ȭ���+"\n");
			
		}
		public static void ����2() {
			System.out.println("�ڡڡ١١�_�١١١١�_�١١١١�");
			System.out.println("     �١١١١�_�١١١١�\n");
			System.out.println("����Ȯ��: 85.0%");
			System.out.println("����(����)Ȯ��: 15.0%");
			System.out.println("��ȭ���: "+��ȭ���+"\n");
		}
		
		public static void ����3() {
			System.out.println("�ڡڡڡ١�_�١١١١�_�١١١١�");
			System.out.println("     �١١١١�_�١١١١�\n");
			System.out.println("����Ȯ��:85.0%");
			System.out.println("����(����)Ȯ��: 15.0%");
			System.out.println("��ȭ���: "+��ȭ���+"\n");
		}
		
		public static void ����4() {
			System.out.println("�ڡڡڡڡ�_�١١١١�_�١١١١�");
			System.out.println("     �١١١١�_�١١١١�\n");
			System.out.println("����Ȯ��: 80.0%");
			System.out.println("����(����)Ȯ��: 20.0%");
			System.out.println("��ȭ���: "+��ȭ���+"\n");
		}
		
		public static void ����5() {
			System.out.println("�ڡڡڡڡ�_�١١١١�_�١١١١�");
			System.out.println("     �١١١١�_�١١١١�\n");
			System.out.println("����Ȯ��: 75.0%");
			System.out.println("����(����)Ȯ��: 25.0%");
			System.out.println("��ȭ���: "+��ȭ���+"\n");
		}
		
		public static void ����6() {
			System.out.println("�ڡڡڡڡ�_�ڡ١١١�_�١١١١�");
			System.out.println("     �١١١١�_�١١١١�\n");
			System.out.println("����Ȯ��: 70.0%");
			System.out.println("����(����)Ȯ��: 30.0%");
			System.out.println("��ȭ���: "+��ȭ���+"\n");
		}
		
		public static void ����7() {
			System.out.println("�ڡڡڡڡ�_�ڡڡ١١�_�١١١١�");
			System.out.println("     �١١١١�_�١١١١�\n");
			System.out.println("����Ȯ��: 65.0%");
			System.out.println("����(����)Ȯ��: 35.0%");
			System.out.println("��ȭ���: "+��ȭ���+"\n");
		}
		
		public static void ����8() {
			System.out.println("�ڡڡڡڡ�_�ڡڡڡ١�_�١١١١�");
			System.out.println("     �١١١١�_�١١١١�\n");
			System.out.println("����Ȯ��: 60.0%\n");
			System.out.println("����(����)Ȯ��: 40.0%");
			System.out.println("��ȭ���: "+��ȭ���+"\n");
		}
		
		public static void ����9() {
			System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�١١١١�");
			System.out.println("     �١١١١�_�١١١١�\n");
			System.out.println("����Ȯ��: 55.0%");
			System.out.println("����(����)Ȯ��: 45.0%");
			System.out.println("��ȭ���: "+��ȭ���+"\n");
		}
		
		public static void ����10() {
			System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�١١١١�");
			System.out.println("     �١١١١�_�١١١١�\n");
			System.out.println("����Ȯ��: 50.0%");
			System.out.println("����(����)Ȯ��: 50.0%");
			System.out.println("��ȭ���: "+��ȭ���+"\n");
		}
		
		public static void ����11() {
			System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡ١١١�");
			System.out.println("     �١١١١�_�١١١١�\n");
			System.out.println("����Ȯ��: 45.0%");
			System.out.println("����(�϶�)Ȯ��: 55.0%");
			System.out.println("��ȭ���: "+��ȭ���+"\n");
		}	
			
		public static void ����12() {
			System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡڡ١١�");
			System.out.println("     �١١١١�_�١١١١�\n");
			System.out.println("����Ȯ��: 40.0%");
			System.out.println("����(�϶�)Ȯ��: 59.4%");
			System.out.println("�ı�Ȯ��: 0.6%");
			System.out.println("��ȭ���: "+��ȭ���);
			System.out.println("�ı��������: "+�Ĺ���+"\n");
		}
		
		public static void ����13() {
			System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡڡڡ١�");
			System.out.println("     �١١١١�_�١١١١�\n");
			System.out.println("����Ȯ��: 35.0%");
			System.out.println("����(�϶�)Ȯ��: 63.7%");
			System.out.println("�ı�Ȯ��: 1.3%");
			System.out.println("��ȭ���: "+��ȭ���);
			System.out.println("�ı��������: "+�Ĺ���+"\n");
		}
		
		public static void ����14() {
			System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡڡڡڡ�");
			System.out.println("     �١١١١�_�١١١١�\n");
			System.out.println("����Ȯ��: 35.0%");
			System.out.println("����(�϶�)Ȯ��: 63.6%");
			System.out.println("�ı�Ȯ��: 1.4%");
			System.out.println("��ȭ���: "+��ȭ���);
			System.out.println("�ı��������: "+�Ĺ���+"\n");
		}
		
		public static void ����15() {
			System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡڡڡڡ�");
			System.out.println("     �١١١١�_�١١١١�\n");
			System.out.println("����Ȯ��: 30.0%");
			System.out.println("����(����)Ȯ��: 67.9%");
			System.out.println("�ı�Ȯ��: 2.1%");
			System.out.println("��ȭ���: "+��ȭ���);
			System.out.println("�ı��������: "+�Ĺ���+"\n");
		}	
		
		public static void ����16() {
			System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡڡڡڡ�");
			System.out.println("     �ڡ١١١�_�١١١١�\n");
			System.out.println("����Ȯ��: 30.0%");
			System.out.println("����(�϶�)Ȯ��: 67.9%");
			System.out.println("�ı�Ȯ��: 2.1%");
			System.out.println("��ȭ���: "+��ȭ���);
			System.out.println("�ı��������: "+�Ĺ���+"\n");
		}
		
		public static void ����17() {
			System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡڡڡڡ�");
			System.out.println("     �ڡڡ١١�_�١١١١�\n");
			System.out.println("����Ȯ��: 30.0%");
			System.out.println("����(�϶�)Ȯ��: 67.2%");
			System.out.println("�ı�Ȯ��: 2.8%");
			System.out.println("��ȭ���: "+��ȭ���+"\n");
		}
		
		public static void ����18() {
			System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡڡڡڡ�");
			System.out.println("     �ڡڡڡ١�_�١١١١�\n");
			System.out.println("����Ȯ��: 30.0%");
			System.out.println("����(�϶�)Ȯ��: 67.2%");
			System.out.println("�ı�Ȯ��: 2.8%");
			System.out.println("��ȭ���: "+��ȭ���+"\n");
		}
		
		public static void ����19() {
			System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡڡڡڡ�");
			System.out.println("     �ڡڡڡڡ�_�١١١١�\n");
			System.out.println("����Ȯ��: 30.0%");
			System.out.println("����(�϶�)Ȯ��: 67.2%");
			System.out.println("�ı�Ȯ��: 2.8%");
			System.out.println("��ȭ���: "+��ȭ���+"\n");
		}
		
		public static void ����20() {
			System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡڡڡڡ�");
			System.out.println("     �ڡڡڡڡ�_�١١١١�\n");
			System.out.println("����Ȯ��: 30.0%");
			System.out.println("����(����)Ȯ��: 63.0%");
			System.out.println("�ı�Ȯ��: 7.0%");
			System.out.println("��ȭ���: "+��ȭ���+"\n");
		}
		
		public static void ����21() {
			System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡڡڡڡ�");
			System.out.println("     �ڡڡڡڡ�_�ڡ١١١�\n");
			System.out.println("����Ȯ��: 30.0%");
			System.out.println("����(�϶�)Ȯ��: 63.0%");
			System.out.println("�ı�Ȯ��: 7.0%");
			System.out.println("��ȭ���: "+��ȭ���+"\n");
		}
		
		public static void ����22() {
			System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡڡڡڡ�");
			System.out.println("     �ڡڡڡڡ�_�ڡڡ١١�\n");
			System.out.println("����Ȯ��: 3.0%");
			System.out.println("����(�϶�)Ȯ��: 77.6%");
			System.out.println("�ı�Ȯ��: 19.4%");
			System.out.println("��ȭ���: "+��ȭ���+"\n");
		}
		
		public static void ����23() {
			System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡڡڡڡ�");
			System.out.println("     �ڡڡڡڡ�_�ڡڡڡ١�\n");
			System.out.println("����Ȯ��: 2.0%");
			System.out.println("����(�϶�)Ȯ��: 67.6%");
			System.out.println("�ı�Ȯ��: 29.4%");
			System.out.println("��ȭ���: "+��ȭ���+"\n");
		}
		
		public static void ����24() {
			System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡڡڡڡ�");
			System.out.println("     �ڡڡڡڡ�_�ڡڡڡڡ�\n");
			System.out.println("����Ȯ��: 1.0%");
			System.out.println("����(�϶�)Ȯ��: 59.0%");
			System.out.println("�ı�Ȯ��: 40.0%");
			System.out.println("��ȭ���: "+��ȭ���+"\n");
		}
		public static void ����25() {
			System.out.println("�ڡڡڡڡ�_�ڡڡڡڡ�_�ڡڡڡڡ�");
			System.out.println("     �ڡڡڡڡ�_�ڡڡڡڡ�\n");
			
		}
}
