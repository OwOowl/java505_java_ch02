import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;

        System.out.println("a + b = " + c);

        c = a - b;
        System.out.println("a - b = " + c);

        c = a * b;
        System.out.println("a * b = " + c);

        c = 10 / 3;
        System.out.println("10 / 3 = " + c);

        c = 10 % 3;
        System.out.println("10 % 3 = " + c);



        // 스캐너
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int time = scanner.nextInt(); // 대입연산자는 우선순위가 가장 낮다고 볼 수 있음.
        int second = time % 60; // 대입연산자는 산술연산자와 합쳐지는 형태
        int minute = (time / 60) % 60;
        int hour = (time / 60) / 60;

        System.out.print(time + "초는 ");
        System.out.print(hour + "시간, ");
        System.out.print(minute + "분, ");
        System.out.println(second + "초입니다.");

        scanner.close();





        System.out.println("\n-----문자열 연결 연산자-----\n");


        // 문자열 연결 연산자 +
        System.out.println("하나의 긴 문자열을 표현하기 위해서는 String 타입의 변수에 긴 문자열을 저장하여 출력");

        System.out.println("여러개의 문자열 변수에 저장된 내용을 한줄로 표현하고 싶을 경우 사용하는 것이 문자열 연결 연산자");

        String str1 = "String 타입의 변수에 긴 물자열을 입력하여 println() 함수를 통해서 화면에 출력";
        System.out.println(str1);

        System.out.println("2개 이상의 " + "문자열을 + 연산자를 사용하여 " + "연산을 진행하면" + "하나의 긴 문자열로 출력 됨");

        String str2 = "2개 이상의 ";
        String str3 = "문자열을 + 연산자를 사용하여 ";
        String str4 = "연산을 진행하면 ";
        String str5 = "하나의 긴 문자열로 출력 됨 ";
        System.out.println(str2 + str3 + str4 + str5);

        String str6 = str2 + str3 + str4 + str5;

        System.out.println(str6);

        // 문자열과 기본 데이터 타입을 연산하면 모두 문자열이 됨
        String menu = "로세티리 바베큐 ";
        String menu2 = "세트 ";
        int price = 6500;
        int price2 = 2000;

        System.out.println(menu + price + "원");
        // ()안에 있는 데이터 먼저 연산
        System.out.println(menu + menu2 + (price + price2) + "원");
        // 연산자의 우선순위 때문에 왼쪽부터 연산하여 문자열과 숫자열(price)의 연산이 먼저 발생하고,
        // 이후에 문자열(price)과 숫자열(price2)의 연산이 추가 진행하여 ~65002000 원 의 결과가 출력
        System.out.println(menu + menu2 + price + price2 + "원");






        System.out.println("\n-----증감 연산자-----\n");

        // 증감 연산자
        int op = 10;
        System.out.println("변수 op의 값 : " + op);


        // 전위연산 혹은 후위연산이 단독으로 사용 될 경우 일반 연산자를 통해서 값을 증감시키는 것과 차이가 없음.
        op++;
        System.out.println("op++ 이후의 값 : " + op);

        ++op;
        System.out.println("++op 이후의 값 : " + op);

        op--;
        System.out.println("op-- 이후의 값 : " + op);

        --op;
        System.out.println("--op 이후의 값 : " + op);

        System.out.println("\n");
        // 전위연산 혹은 후위 연산을 다른 연산식과 함께 사용하는 경우 실행 시점이 달라짐.
        op = 10;
        System.out.println("현재 변수 op의 값 : " + op);
        System.out.println("++op 실행 시 값 : " + ++op);

        System.out.println("현재 op의 값 : " + op);
        System.out.println("op++ 실행 시 값 : " + op++);

        System.out.println("현재 op의 값 : " + op);
        System.out.println("op-- 실행 시 값 : " + op--);

        System.out.println("현재 op의 값 : " + op);
        System.out.println("--op 실행 시 값 : " + --op);
        System.out.println("현재 op의 값 : " + op);







        System.out.println("\n-----비교 연산자-----\n");

        // 비교 연산자

        System.out.println('a' > 'b');
        System.out.println(3 >= 2);
        System.out.println(-1 < 0);
        System.out.println(3.45 <= 2);
        System.out.println(3 == 2);
        System.out.println(3 != 2);



        System.out.println("\n-----논리 연산자-----\n");

        System.out.println(!(3 != 2));
        System.out.println((3 > 2) && (3 > 4));
        System.out.println((3 != 2) || (-1 > 0));
        System.out.println((3 != 2) ^ (-1 > 0));

        System.out.println("\n-----삼항 연산자-----\n");
        int num1 = 3;
        int num2 = 5;
        System.out.println("두 수의 차는 : " + ((num1 > num2)?(num1-num2):(num2-num1)));

        if (num1 > num2) {
            System.out.println("두 수의 차는 : " + (num1 - num2));
        }
        else {
            System.out.println("두 수의 차는 : " + (num2 - num1));
        }




    }
}
