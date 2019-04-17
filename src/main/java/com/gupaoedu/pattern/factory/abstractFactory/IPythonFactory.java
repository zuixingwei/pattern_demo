package com.gupaoedu.pattern.factory.abstractFactory;

import com.gupaoedu.pattern.factory.ICourse;
import com.gupaoedu.pattern.factory.PythonCourse;

public class IPythonFactory implements IAllFactory {
    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }

    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }
}
