package com.vv.design.creational.simplyfactory;

public class Test {
    public static void main(String[] args) {
        Video demoOne = new SimpleFactory().create("java");
        demoOne.produce();
        Video demoTwo = new SimpleFactory().create(PythonVideo.class);
        demoTwo.produce();
    }
}
