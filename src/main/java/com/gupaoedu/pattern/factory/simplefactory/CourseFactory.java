package com.gupaoedu.pattern.factory.simplefactory;

import com.gupaoedu.pattern.factory.ICourse;

public class CourseFactory {
//    public ICourse create(String name){
//        if("java".equals(name)){
//            return new JavaCourse();
//        }else{
//            return null;
//        }
//    }

//    public ICourse create(String className) {
//        try {
//            if (!(className == null && "".equals(className))) {
//                return (ICourse)Class.forName(className).newInstance();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    public ICourse create(Class clazz) {
        try {
            if (clazz!=null) {
                return (ICourse)clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
