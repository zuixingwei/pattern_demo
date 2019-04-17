package com.gupaoedu.pattern.factory.simplefactory;

import com.gupaoedu.pattern.factory.ICourse;
import com.gupaoedu.pattern.factory.JavaCourse;
import com.gupaoedu.pattern.factory.PythonCourse;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        //普通方式，需要new很多次
//        ICourse course=new JavaCourse();
//        course.record();

        //简单工厂,只要new一次
        CourseFactory courseFactory=new CourseFactory();
//        ICourse course=courseFactory.create("java");
//        ICourse course=courseFactory.create("com.gupaoedu.pattern.factory.simplefactory.JavaCourse");
        ICourse course=courseFactory.create(JavaCourse.class);
        course.record();

        course=courseFactory.create(PythonCourse.class);
        course.record();
    }
}
