import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    // //  # 3-15

    Scanner sc = new Scanner(System.in);

    System.out.print("정수 a: " );

    int a = sc.nextInt();

    System.out.print("정수 b: " );

    int b = sc.nextInt();

    System.out.print("정수 c: " );

    int c = sc.nextInt();

    int min = a;

    if ( min > b ){
      min = b;
    }
    if( min > c ){
      min = c;
    }
    System.out.println("최솟값은 "+ min + "입니다.");



    // // // # 3-21
    int month;
		
		System.out.print("몇 월입니까? ");
		month = sc.nextInt();
		
		switch(month) {
		
			case 1: case 2 : case 12:
				System.out.println("겨울");
				break;
			case 3: case 4 : case 5:
				System.out.println("봄");
				break;
			case 6: case 7 : case 8:
				System.out.println("여름");
				break;
			case 9: case 10 : case 11:
				System.out.println("여름");
				break;        
			default:
				System.out.println("그런 월은 없습니다.");
		}


    // //  # 4-2
    
     int number = 0;
	  
	  while(number < 100 || number > 999 ) {
		  System.out.print("세 자릿수의 정수값 : ");
		  number = sc.nextInt();
	  }
	  System.out.println("입력한 값은 " + number +"입니다.");


    //  # 4-14

    int sum = 0;
	  int n = 0;
	  System.out.print("1부터 n까지의 합을 구합니다. n의 값 : ");
	  n = sc.nextInt();

	  for(int i = 1; i <= n; i++){
	      sum += i;
	    }
	    System.out.println("1부터 "+ n +"까지의 합은 "+ sum + "입니다.");

    //  # 4-21

	  int num = 0;
	  System.out.println("정방형을 표시합니다.");
	  System.out.print("단수는 : ");
	  num = sc.nextInt();

      for (int s = 1; s <= num; s++) {
          for (int j = 1; j <= num; j++) {
              System.out.print("*");
          }
          System.out.println();
      }

  }
}