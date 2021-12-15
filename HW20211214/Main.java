import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
  
    //  # 2-11

    Random rand = new Random();

    int r = rand.nextInt(89);

    System.out.println("3개의 난수를 생성했습니다.");

    System.out.println("한 자리 양의 정수 : " +(r%10));
    System.out.println("한 자리 음의 정수 : "+ (r%10)*-1);
    System.out.println("두 자리 양의 정수 : " +(r+10));
  
  

    // # 2-14

    Scanner sc = new Scanner(System.in);
		String lastName;
		String firstName;
		
		System.out.print("성: ");
		lastName = sc.next();
		
		System.out.print("이름: ");
		firstName = sc.next();
		
		System.out.println("안녕하세요. "+lastName+firstName+" 씨.");


    //  # 3-3

    Scanner sc1 = new Scanner(System.in);
    int A;
    int B;

    System.out.print("변수 A : ");
    A = sc1.nextInt();
    System.out.print("변수 B : ");
    B = sc1.nextInt();

    if (A%B == 0){
      System.out.println("B는 A의 약수이다.");
    }else {
      System.out.println("B는 A의 약수가 아니다.");
    }


    //  # 3-5

    int C;
    Scanner sc2 = new Scanner(System.in);

    System.out.print("정수값 : ");
    C = sc2.nextInt();

    if(C > 0){
      System.out.println("값이 양수입니다.");
    }else if(C < 0){
      System.out.println("값이 음수입니다.");
    }else{
      System.out.println("값이 0입니다.");
    }

    //  # 3-7
    Scanner stdIn = new Scanner(System.in);

    System.out.print("변수 a : ");
    int a = stdIn.nextInt();
    System.out.print("변수 b : ");
    int b = stdIn.nextInt();

    if(a>b){
      System.out.println("a가 크다");
    }else if (a<b){
      System.out.println("b가 크다");
    }else {
      System.out.println("a와 b가 같다");
    }
}
}