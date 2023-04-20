import java.util.Scanner;
//import java.io.*;

public class Project_001 {
	public static void main (String[] orgs)
	{
		/*
		//1
		System.out.println("첫번째 예제: 한개의 숫자를 입력받고 그 수의 두배를 결과로 출력하기.");
		System.out.println("숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("입력받은 수의 두배는,");
		int b = a+a;
		System.out.println(b);
		System.out.println("입니다.");
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in());
		
		//2
		System.out.println("두번째 예제: 두개의 숫자를 입력받고 두 수의 합을 결과로 출력하기.");
		System.out.println("첫번째 숫자를 입력하세요.");
		int a1 = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int a2 = scan.nextInt();
		System.out.println("입력받은 두 수의 합은,");
		int b1 = a1+a2;
		System.out.println(b1);
		System.out.println("입니다.");
		
		//3
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
		
		//4
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
		
		*/
		
		//5
		//정수 하나를 입력받아, 짝수인지 홀수인지 구별하는 프로그램을 만드시오.
		Scanner putin = new Scanner(System.in);
		System.out.println("정수하나입력하시오.");
		int num3 = putin.nextInt();
		
		int num4 = num3-2;
		int num5 = num3%2;
		
		System.out.print("나머지값은:");
		System.out.println(num5);
		if (num3 == 0)
		{
			System.out.println("0입니다.");
		}

		else
		{
			while (num4!=0&&num4!=1)
			{
				num4=num4-2;
			}
			if (num4==0)
			{
				System.out.println("짝수입니다.");
			}
			else if (num4==1)
			{
				System.out.println("홀수입니다.");
			}
		}
		
		putin.close();
		//나는 % 연산자를 몰라서 while문으로 먼저 접근했다가 (나머지를 구하려 처음에 / 연산자를 썼는데 나누기는 나머지값이 나오지 않아서 곰곰히 생각해 본 결과.) 구글링해 본 후, % 연산자의 존재를 깨달음.
		//어찌보면 기본기도 없는 멍청이라 할 수 있겠습니다...
	}

}
