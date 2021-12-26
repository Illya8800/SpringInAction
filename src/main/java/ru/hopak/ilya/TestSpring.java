package ru.hopak.ilya;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();

        System.out.println(unChet(5));



    }

    public static long unChet(long n){
        long sum = 0;
        for (long i = 1; i <= n; i+=2) {
            sum += i;
        }
        return sum;
    }
}

