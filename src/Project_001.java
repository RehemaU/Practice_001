import java.util.Scanner;
//import java.io.*;	//얘는 안씀 BufferedReader 깔짝여본것 뿐.
import java.util.ArrayList;

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
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in());	//얘는 안씀 BufferedReader 깔짝여본것 뿐.
		
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
		
		//6
		//1~100까지의 합을 구하는 프로그램을 반복문을 사용하여 만드시오.
		int result=0;
		for(int i = 1;i<101;i++)
		{
			//result=result+i;
			result += i;	//위와 같은 구문(더 간편한 구문)
		}
		System.out.println(result);
		//이 문제는 for문 검색하다가.. 모르고 힌트를 봐버렸다네요.
		 
		
		//7
		//1~100까지의 사이에 3의 배수가 몇개가 되는지 구하는 예제
		int thr = 0;
		for(int i = 1; i<=100 ; i++)
		{
			if (i%3==0)
			{
				thr++;
			}
		}
		System.out.println(thr);
		
		//8
		//1~100까지의 합을 구해서 출력한 후, 1~200까지의 합을 구해서 출력하고, 마지막으로 1~300까지의 합을 구해서 출력하는 프로그램 만들기 (코드 재활용하기)
		int result1=0;
		for(int i = 1;i<=100;i++)
		{
			//result=result+i;
			result1 += i;	//위와 같은 구문(더 간편한 구문)
		}
		System.out.print("1~100까지의 합:");
		System.out.println(result1);
		
		int result2=0;
		for(int i = 1;i<=200;i++)
		{
			//result=result+i;
			result2 += i;	//위와 같은 구문(더 간편한 구문)
		}
		System.out.print("1~200까지의 합:");
		System.out.println(result2);
		
		int result3=0;
		for(int i = 1;i<=300;i++)
		{
			//result=result+i;
			result3 += i;	//위와 같은 구문(더 간편한 구문)
		}
		System.out.print("1~300까지의 합:");
		System.out.println(result3);
		
		//9
		//1~100까지의 짝수의 합을 출력, 101~200까지의 짝수의 합을 출력,201~300까지의 짝수의 합을 출력
		int result=0;
		int n1, n2;
		
		n1=1;
		n2=100;
		for(int i=n1;i<=n2;i++)
		{
			if (i%2==0)
			{
				result+=i;
			}
		}
		System.out.println(result);
		
		n1=101;
		n2=200;
		for(int i=n1;i<=n2;i++)
		{
			if (i%2==0)
			{
				result+=i;
			}
		}
		System.out.println(result);
		
		n1=201;
		n2=300;
		for(int i=n1;i<=n2;i++)
		{
			if (i%2==0)
			{
				result+=i;
			}
		}
		System.out.println(result);

		//10
		//임의의 수를 매개변수로 전달받아 1~n 사이에 3의 배수가 몇개가 되는 지 구하는 프로그램
		//매개변수가 정확히 모르겠지만 사용자에게 입력받는 변수를 말하는 게 맞겠지?
		//난수는 아닐 거 아냐
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int result=0;
		for(int i=1;i<=a;i++)
		{
			if(i%3==0)
			{
				result++;
			}
		}
		System.out.println(result);
		scan.close();
		
		//11
		//국,영,수 과목의 점수를 입력받고, 평균을 내는 프로그램
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int r = (a+b+c)/3;
		System.out.println(r);
		scan.close();
		 */
		
		//12
		//11번 문제에서 과목을 추가하고 삭제해보세요 (리스트를 사용하라는 거 같은데... 하 이제 어려워지는구나.)
		//ㅇㅋ 이건 나중으로 미루고 강의부터 듣겠습니다 리스트 하려니까 갑자기 쉬고싶네
//		ArrayList sub = new ArrayList();
//		ArrayList score = new ArrayList();
		//배열을 배우고 다시 돌아왔습니다! 리스트는 아니지만 배열로 다시 도전해보겠습니다!
		Scanner scan = new Scanner(System.in);
		System.out.println("몇가지 과목을 입력하나요?");
		int n = scan.nextInt();
		int[] score = new int[n];
		String[] sub = new String[n];
		for (int i=0;i<n;i++)
		{
			System.out.printf("%d번째 ",i+1);
			System.out.println("과목명을 입력하세요.");
			sub[i] = scan.next();
		}
		
//		System.out.println("입력하신 과목은,");
//		for (int i=0;i<n;i++)
//		{
//			System.out.println(sub[i]);
//		}
//		System.out.println("입니다.");
		
		System.out.println("첫번째 과목부터 순서대로 성적을 입력하시오.");
		for (int i=0;i<n;i++)
		{
			System.out.printf("%d번째 ",i+1);
			System.out.println("성적을 입력하세요.");
			score[i] = scan.nextInt();
		}
		int average = 0;
		for (int i=0;i<n;i++)
		{
			average += score[i];
		}
		average = average/n;
		System.out.println("전체 과목의 평균 점수는:"+average);
		
		scan.close();
	}
}
