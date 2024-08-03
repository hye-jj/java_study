package com.dinfree.java.part1;

// public class HelloWorld {
//     public static void main(String[] args) {
//         // Hello World 출력
//         System.out.println("Hello World!!");
//     }

// }

public class Variables {
    // static 이 먼저로드되어 static 안에서 사용불가
    int num1;
    
    // 변수로 저장되어 static안에서 변수선언(클래스 Variables 선언) 하고 사용가능
    static int num2;

    // 매서드 만들기 -> static 안에서 호출
    public void printName(String name){
        // 지역변수 : 인스턴스나 클래스 변수와는 독립적
        String prtMsg = name + " Hello";
        int num1 = 10; // 지역변수라서 밖이랑 같은 변수명 써도 상관없음
        //int num1 = this.num1; 클래스인스턴스 대입하고 싶으면 this 이용

        System.out.println(prtMsg);
        System.out.println(num1);
    }

    public static void main(String[] args) {
        // main 안에서만 사용가능
        Variables mc = new Variables();
        mc.num1 = 100;
        Variables.num2 = 50;

        // 인스턴스 안의 매서드 호출 필요
        // 파라미터 필요함.
        mc.printName("홍길동");

        // f : 포맷, 형식지정필요
        System.out.printf("%d %d", mc.num1, Variables.num2);
    }
}