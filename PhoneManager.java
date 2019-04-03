import java.util.Scanner;
class Phone {
	String name;
	String tel;
	Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() { return name; }
	public String getTel() { return tel; }
}
public class PhoneManager {
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ο���>>");
		n = scan.nextInt();
		Phone[] person = new Phone[n];
		for(int i = 0; i<n; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� ���������� �Է�)>>");
			person[i] = new Phone(scan.next(), scan.next());	
		}
		System.out.println("����Ǿ����ϴ�.");
		while(true) {
			System.out.println("�˻��� �̸�>>");
			String s = scan.next();
	
			for(int i=0; i<n; i++) {
				if(s.equals(person[i].name)) 
					System.out.println(person[i].getName()+ "�� ��ȣ��"+ person[i].getTel());
		
				else if (!s.equals(person[i].name ))
							System.out.println(s + "�� �����ϴ�." );
				
			}
			if(s.equals("exit")) {
				System.exit(1);
				scan.close();
			}
					
			}
		}
		

	}


