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
		
		System.out.print("인원수>>");
		n = scan.nextInt();
		Phone[] person = new Phone[n];
		for(int i = 0; i<n; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
			person[i] = new Phone(scan.next(), scan.next());	
		}
		System.out.println("저장되엇습니다.");
		while(true) {
			System.out.println("검색할 이름>>");
			String s = scan.next();
	
			for(int i=0; i<n; i++) {
				if(s.equals(person[i].name)) 
					System.out.println(person[i].getName()+ "의 번호는"+ person[i].getTel());
		
				else if (!s.equals(person[i].name ))
							System.out.println(s + "는 없습니다." );
				
			}
			if(s.equals("exit")) {
				System.exit(1);
				scan.close();
			}
					
			}
		}
		

	}


