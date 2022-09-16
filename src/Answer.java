import java.util.Scanner;

public class Answer {
    private static Scanner scan;
    public static void main(String[] args) {
        // 문제 1) 점수를 입력받아 점수 및 등급을 출력하는 프로그램 작성
        // 조건 1. else if문을 사용하여 작성
        // 조건 2. 95이상 A+, 90이상 A, 85이상 B+, 80이상 B, 75이상 C+, 70이상 C, 60이상 D, 60미만 F
        // 조건 3. 중첩 if문을 사용하여 각각의 + 대의 점수를 출력
        scan = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요 : ");
        int score = scan.nextInt();

        if (score >= 90) {
            if (score >= 95) {
                System.out.println("당신의 점수는 " + score + "이고, 등급은 A+ 입니다.");
            }
            else {
                System.out.println("당신의 점수는 " + score + "이고, 등급은 A 입니다.");
            }
        }

        else if (score >= 80) {
            if (score >= 85) {
                System.out.println("당신의 점수는 " + score + "이고, 등급은 B+ 입니다.");
            }
            else {
                System.out.println("당신의 점수는 " + score + "이고, 등급은 B 입니다.");
            }
        }

        else if (score >= 70) {
            if (score >= 75) {
                System.out.println("당신의 점수는 " + score + "이고, 등급은 C+ 입니다.");
            }
            else {
                System.out.println("당신의 점수는 " + score + "이고, 등급은 C 입니다.");
            }
        }

        else if (score >= 60) {
            System.out.println("당신의 점수는 " + score + "이고, 등급은 D 입니다.");
        }

        else {
            System.out.println("당신의 점수는 " + score + "이고, 등급은 F 입니다.");
        }

        // 65254 : 오만원1개, 만원1개, 천원5개, 500원0개, 100원2개, 10원4개, 1원5개
        System.out.print("돈의 액수를 입력하세요>>");
        int money = scan.nextInt();

        System.out.println("오만원" + (money / 50000) + "개, " + "만원" + ((money % 50000) / 10000) + "개, " + "천원" +
            ((money % 10000) / 1000) + "개, " + "500원" + ((money % 1000) / 500) + "개, " + "100원" + ((money % 1000) / 100)
            + "개, " + "10원" + ((money % 100) / 10) + "개, " + "1원" + ((money % 10) / 1) + "개");


        /* 다른 답
        원금 / 50000 해서 5만원권 수 확인
        int m50000 = money / 50000;
        5만원을 뺀 값을 변수 money에 저장
        money = money % 50000;
        int m10000 = money / 10000;
        money = money % 10000;
        int m1000 = money / 1000;
        money = money % 1000;
        int m500 = money / 500;
        money = money % 500;
        int m100 = money / 100;
        money = money % 100;
        int m10 = money / 10;
        money = money % 10;

        System.out.println("오만원 " + m50000 + "개");
        System.out.println("만원 " + m10000 + "개");
        System.out.println("천원 " + m1000 + "개");
        System.out.println("오백원 " + m500 + "개");
        System.out.println("백원 " + m100 + "개");
        System.out.println("십원 " + m10 + "개");
        System.out.println("일원 " + money + "개");
         */








        System.out.print("학점을 입력하세요>>");
        String grade = scan.next();
        switch(grade) {
            case "A" :
            case "B" :
                System.out.println("Exellent");
                break;

            case "C" :
            case "D" :
                System.out.println("Good");
                break;

            case "F" :
                System.out.println("Bye");
                break;

            default :
                System.out.println("잘못된 입력입니다.");
                break;
        }



        System.out.print("1~99 사이의 정수를 입력하세요>>");
        int n = scan.nextInt();

        if (n % 10 == 3 ) {
            if (n / 10 == 3) {
                System.out.println("박수짝짝");
            }
            else if (n / 10 == 6) {
                System.out.println("박수짝짝");
            }
            else if (n / 10 == 9) {
                System.out.println("박수짝짝");
            }
            else {
                System.out.println("박수짝");
            }
        }

        else if (n % 10 == 6) {
            if (n / 10 == 3) {
                System.out.println("박수짝짝");
            }
            else if (n / 10 == 6) {
                System.out.println("박수짝짝");
            }
            else if (n / 10 == 9) {
                System.out.println("박수짝짝");
            }
            else {
                System.out.println("박수짝");
            }
        }

        else if (n % 10 == 9) {
            if (n / 10 == 3) {
                System.out.println("박수짝짝");
            }
            else if (n / 10 == 6) {
                System.out.println("박수짝짝");
            }
            else if (n / 10 == 9) {
                System.out.println("박수짝짝");
            }
            else {
                System.out.println("박수짝");
            }
        }

        else {
            if (n / 10 == 3) {
                System.out.println("박수짝");
            }
            else if (n / 10 == 6) {
                System.out.println("박수짝");
            }
            else if (n / 10 == 9) {
                System.out.println("박수짝");
            }
            else {
                System.out.println("박수없음");
            }
        }

        /* 다른 답
        int n = scan.nextInt();
        int first = n / 10;     10의 자리 숫자 저장
        int second = n % 10;    1의 자리 숫자 저장
        int count = 0;          3, 6, 9의 수를 저장하기 위한 변수

        10의자리 숫자가 3의 배수인지 확인
        if (first % 3 == 0) {
            count++(혹은 count += 1, 혹은 count = count + 1);    3의 배수이면 변수 count값 1증가
        }

        1의자리 숫자가 3의 배수인지 확인
        if (second % 3 == 0) {
            count++;    3의 배수이면 변수 count값 1증가
        }

        if (count == 1) {
            System.out.println("박수 짝");
        }

        else if (count == 2) {
            System.out.println("박수 짝짝");
        }

        else {
            System.out.println("박수 없음");
        } */






        scan.close();





    }
}
