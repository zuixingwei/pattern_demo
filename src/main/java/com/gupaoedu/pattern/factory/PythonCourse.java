package com.gupaoedu.pattern.factory;

public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("Python课程录播");
    }
}
