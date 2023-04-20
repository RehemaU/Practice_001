import java.util.Scanner;
//import java.io.*;

public class Project_001 {
	public static void main (String[] orgs)
	{
		/*
		System.out.println("첫번째 예제: 한개의 숫자를 입력받고 그 수의 두배를 결과로 출력하기.");
		System.out.println("숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("입력받은 수의 두배는,");
		int b = a+a;
		System.out.println(b);
		System.out.println("입니다.");
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in());
		
		System.out.println("두번째 예제: 두개의 숫자를 입력받고 두 수의 합을 결과로 출력하기.");
		System.out.println("첫번째 숫자를 입력하세요.");
		int a1 = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int a2 = scan.nextInt();
		System.out.println("입력받은 두 수의 합은,");
		int b1 = a1+a2;
		System.out.println(b1);
		System.out.println("입니다.");
		
		System.out.println("세번째 예제: 두개의 숫자를 입력받고 두 수의 합/차/곱/나눗셈을 결과로 출력하기.");
		System.out.println("첫번째 숫자를 입력하세요.");
		float c1 = scan.nextFloat();
		System.out.println("두번째 숫자를 입력하세요.");
		float c2 = scan.nextInt();
		float d1 = c1+c2;
		float d2 = c1-c2;
		float d3 = c1*c2;
		float d4 = c1/c2;
		System.out.println("입력받은 두 수의 합/차/곱/나눗셈의 값은,");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println("입니다.");
		
				scan.close();
		*/
		
		//num1 num2 값을 입력받고, op 값을 입력받아, op=0 이면 덧셈, op=/=0 이면 뺄셈을 하는 구문 작성하기
		Scanner put = new Scanner(System.in);
		System.out.println("num1");
		int num1 = put.nextInt();
		System.out.println("num2");
		int num2 = put.nextInt();
		System.out.println("op");
		int op = put.nextInt();
		
		int numR;
		if (op==0)
		{
			numR=num1+num2;
		}
		else
		{
			numR=num1-num2; 
		}
		System.out.println(numR);
		
		put.close();
	}

}
