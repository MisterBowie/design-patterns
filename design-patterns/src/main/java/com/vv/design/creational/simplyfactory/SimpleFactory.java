package com.vv.design.creational.simplyfactory;

public class SimpleFactory {
    public Video create(Class type) {
        Video video = null;
        try {
            video = (Video) Class.forName(type.getName()).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return video;
    }

    public Video create(String type) {
        if ("java".equals(type)) {
            return new JavaVideo();
        } else if ("py".equals(type)) {
            return new PythonVideo();
        } else {
            return null;
        }
    }
}
