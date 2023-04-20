import java.util.Scanner;
//import java.io.*;

public class Project_001 {
	public static void main (String[] orgs)
	{
		System.out.println("숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		System.out.println("입력받은 수의 두배는,");
		int d = c+c;
		System.out.println(d);
		System.out.println("입니다.");
		scan.close();
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in());
		
	}

}
