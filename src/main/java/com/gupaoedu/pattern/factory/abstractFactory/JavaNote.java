package com.gupaoedu.pattern.factory.abstractFactory;

public class JavaNote implements INote{

    @Override
    public void edit() {
        System.out.println("Java笔记编辑");
    }
}
