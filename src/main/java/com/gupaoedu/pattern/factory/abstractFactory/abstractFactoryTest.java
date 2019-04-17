package com.gupaoedu.pattern.factory.abstractFactory;

public class abstractFactoryTest {
    public static void main(String[] args) {
        IAllFactory factory=new IJavaFactory();
        factory.createCourse().record();
        factory.createNote().edit();
        factory.createVideo().record();

        factory=new IPythonFactory();
        factory.createCourse().record();
        factory.createNote().edit();
        factory.createVideo().record();

    }
}
