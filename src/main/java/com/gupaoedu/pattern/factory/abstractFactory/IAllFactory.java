package com.gupaoedu.pattern.factory.abstractFactory;

import com.gupaoedu.pattern.factory.ICourse;

public interface IAllFactory {

    INote createNote();

    IVideo createVideo();

    ICourse createCourse();
}
