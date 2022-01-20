package com.donggi.chapter14;

@FunctionalInterface
interface MyFunction {
    void run(); // public abstract void run();
}

public class LambdaExample {
    static void execute(MyFunction f) { // 매개변수의 타입이 MyFunction인 메서드
        f.run();
    }

    static MyFunction getMyFunction() { // 반환 타입이 MyFunction인 메서드
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {

        // 람다식으로 MyFunction 의 run()을 구현
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() {  // 익명 클래스로 run() 구현
            @Override
            public void run() { // 반드시 public 붙여야한다
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();
        execute(f1);
        execute(() -> System.out.println("run()"));
    }
}



