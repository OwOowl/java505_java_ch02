import java.util.Scanner;

public class If {

    private static Scanner scan;
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        // if문 : 가장 많이 사용되는 조건문으로 조건식의 결과가 참일경우 해당 코드 블럭을 실행하는 형태
        // 단순 if문 : 조건식의 결과가 참일 경우 코드블럭의 내용을 추가로 실행
        System.out.print("숫자를 입력하세요 : ");
        int n = scan.nextInt();

        if (n %2 == 0) {
            System.out.println("입력한 숫자는 짝수입니다.");
        }

        System.out.println("입력한 숫자는 " + n +" 입니다.");




        // if-else문 : 조건식의 결과가 참일 경우 바로 아래의 코드블럭을 실행하고, 거짓일 경우 else 아래의 코드블럭 실행
        // 단순 if문과는 다르게 반드시 둘중 하나 선택실행
        System.out.println("탕수육 먹는 형태를 입력하세요");
        System.out.print("찍먹? 부먹? : ");
        String input = scan.next();;

        // equals(문자열) : 지정한 문자열과 동일한 문자열인지 확인, true/false로 출력
        if (input.equals("부먹")) {
            System.out.println("탕수육의 원래 형태는 부먹입니다.");
        }

        else {
            System.out.println("찍먹을 해야 탕수육의 튀김옷이 바삭합니다.");
        }

        System.out.println("탕수육을 맛있게 먹습니다.");





        // else if문 : 조건식이 여러개가 존재하여 조건식의 결과가 참인 코드블럭을 실행
        // 조건식 설정을 단계적으로 해야 정상적인 값을 얻을 수 있다. 문법적인 문제는 없으나 논리적 문제가 발생 할 수 있다.
        // else구문으로 갈 수 업도록 모든 조건이 입력 되어있을 경우 마지막 else문은 생략가능
        /*System.out.print("점수를 입력해 주세요 : ");
        int grade = scan.nextInt();

        if (grade >= 90) {
            System.out.println("당신의 점수는 " + grade + "점이고, 당신의 등급은 A 입니다.");
        }
        else if (grade >= 80) {
            System.out.println("당신의 점수는 " + grade + "점이고, 당신의 등급은 B 입니다.");
        }
        else if (grade >= 70) {
            System.out.println("당신의 점수는 " + grade + "점이고, 당신의 등급은 C 입니다.");
        }
        else if (grade >= 60) {
            System.out.println("당신의 점수는 " + grade + "점이고, 당신의 등급은 D 입니다.");
        }
        else if (grade < 60) {
            System.out.println("당신의 점수는 " + grade + "점이고, 당신의 등급은 F 입니다.");
        }*/
        /* else {
            System.out.println("당신의 점수는 " + grade + "점이고, 당신의 등급은 F 입니다.");
        } */

        // 중첩 if문 : if, if-else, else if문의 코드블럭에 if문을 사용하는 방식

        System.out.println("\n----- 중첩 if문 -----\n");
        System.out.print("점수를 입력해 주세요 : ");
        int grade = scan.nextInt();

        if (grade >= 90) {
            System.out.println("당신의 점수는 " + grade + "점이고, 등급은 A 입니다.");
        }
        else {
            if (grade >= 80) {
                System.out.println("당신의 점수는 " + grade + "점이고, 등급은 B 입니다.");
            }
            else {
                if (grade >= 70) {
                    System.out.println("당신의 점수는 " + grade + "점이고, 등급은 C 입니다.");
                }
                else {
                    if (grade >= 60) {
                    System.out.println("당신의 점수는 " + grade + "점이고, 등급은 D 입니다.");
                    }
                    else {
                        System.out.println("당신의 점수는 " + grade + "점이고, 등급은 F 입니다.");
                    }
                }
            }
        }


    }
}
