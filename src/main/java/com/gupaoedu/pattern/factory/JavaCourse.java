package com.gupaoedu.pattern.factory;

public class JavaCourse implements ICourse{
    @Override
    public void record() {
        System.out.println("Java课程录播");
    }
}
