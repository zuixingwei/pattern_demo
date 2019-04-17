package com.gupaoedu.pattern.factory.abstractFactory;

public class PythonVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("Python视频直播");
    }
}
