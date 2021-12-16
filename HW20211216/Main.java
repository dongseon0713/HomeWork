import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //  # 4-22
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
    System.out.print("단수는 ? : ");
		
		int num = sc.nextInt();
		for(int i = 1 ; i <= num ; i++) {
			for(int j = 1 ; j <= i ; j++) {
			System.out.print("*");
			}
			System.out.println();
		}

    System.out.println("왼쪽 위가 직각인 이등변 삼각형을 표시합니다.");
    System.out.print("단수는 ? : ");

    int num1 = sc.nextInt();
	  for(int i = 1 ; i <= num1 ; i++) {
			for(int j = num1 ; j >= i ; j--) {
			System.out.print("*");
			}
			System.out.println();
	  } 

    System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
    System.out.print("단수는 ? : ");
    
    int num2 = sc.nextInt();

    for(int i = 1 ; i <= num2 ; i++){
	    for(int j = 1 ; j <= num2-i ; j++){
		   System.out.print(" ");
	    }
      for (int j = 1 ; j <= i ; j++){
        System.out.print("*");
      }
    	System.out.println();
    }

    System.out.println("오른쪽 위가 직각인 이등변 삼각형을 표시합니다.");
    System.out.print("단수는 ? : ");

    int num3 = sc.nextInt();

    for(int i = 1 ; i <= num3 ; i++){
	    for(int j = 1 ; j <= i-1 ; j++){
        System.out.print(" ");
      }
      for(int j = 1 ; j <= num3-i+1 ; j++){
        System.out.print("*");
      }
      System.out.println();
      }

    //  # 4-25
    int y;
    int g;
    do {
      System.out.print("2 이상의 정숫값 :");
      y = sc.nextInt();

    } while (y < 2);

    for(g = 2 ; g < y ; g++){
      if( y % g == 0){
        break;
      }
    }
    if(g == y){
      System.out.println("소수입니다.");
    }else {
      System.out.println("소수가 아닙니다.");
    }


    //  # 4-26
    int sum = 0;
    int i;
    
    System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할 까요? : ");
		int n = sc.nextInt();
		
		
		for (i = 0;i < n ; i++) {
			System.out.print("정수 (0으로 종료) : " );
			int j = sc.nextInt();
			if (j == 0) {
				break;
			}
			sum += j;
		}
		System.out.println("합계는 " + sum + "입니다.");

		if(i != 0) {
			System.out.println("평균은 " + sum/i + "입니다.");
		}

    //  # 4-27
    int sum1 = 0 ;
		int b;
		
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요? :");
		int m = sc.nextInt();
		
		for (b = 0 ; b < m ; b++) {
			System.out.print("정수 :");
			int j = sc.nextInt();
			
			if(sum + j > 1000) {
				System.out.println("합계가 1,000을 넘었습니다.");
				System.out.println("마지막 값은 무시합니다.");
				break;
			}
			sum += j ;
		}
		System.out.println("합계는 "+ sum1 + "입니다.");
		
		if( b != 0 ) {
			System.out.println("평균은 "+ sum1/b + "입니다.");
		}

    //  # 4-28
    int sum2 = 0;
		int c;
		int count = 0;
		
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요? : ");
		int h = sc.nextInt();
		
		for(c = 0; c < h ; c++) {
			System.out.print("정수 :");
			int j = sc.nextInt();	
			if( j < 0 ) {
				System.out.println("음수는 더하지 않습니다.");
				continue;
			}
			sum +=j;
			count++;
		}
		System.out.println("합계는 " + sum2 + "입니다.");
		
		if ( c != 0) {
			System.out.println("평균은 " + sum2/count + "입니다.");
		}
    }
  }