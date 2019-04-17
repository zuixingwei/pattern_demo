package com.gupaoedu.pattern.factory.factoryMethod;

import com.gupaoedu.pattern.factory.ICourse;

public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory courseFactory=new JavaICourseFactory();
        ICourse course=courseFactory.create();
        course.record();

        courseFactory=new PythonICourseFactory();
        course=courseFactory.create();
        course.record();
    }
}
