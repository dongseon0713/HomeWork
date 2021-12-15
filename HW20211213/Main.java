import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // # 2-7
       Scanner sc = new Scanner(System.in);

       int num;

       System.out.print("정수 값 : ");

       num = sc.nextInt();

       System.out.println("마지막 자릿수를 제외한 값은 "+ (num/10) + "입니다.");
       System.out.println("마지막 자릿수는 " + (num%10) + "입니다.");
       

    // # 2-6
    Scanner sc = new Scanner(System.in);

    int num;

    System.out.print("정수 값 : ");
    num = sc.nextInt();

    System.out.println("10을 더한 값은 "+ (num+10) + "입니다.");
    System.out.println("10을 뺀 값은 "+ (num-10) + "입니다.");

    // # 2-5
    Scanner sc = new Scanner(System.in);

    int num;

    System.out.print("정수 값 : ");
    num = sc.nextInt();

    System.out.println(num + "를 입력하셨습니다.");

    // # 2-2
    int x = 63;
    int y = 18;
    
    System.out.println("X 값은 " + x + "입니다.");
    System.out.println("Y 값은 " + y + "입니다.");
    System.out.println("합계는 " + (x+y) + "입니다.");
    System.out.println("평균값은 " + ((x+y)/2) + "입니다.");
    
    // # 1-5
    System.out.println("지");
    System.out.println("");
    System.out.println("동");
    System.out.println("선");


  }
}