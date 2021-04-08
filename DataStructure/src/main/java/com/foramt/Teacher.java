package com.foramt;

public class Teacher {

    private Teacher(){};
//饿汉式： 只要类一加载便去创建该对象
//懒汉式： 只有在用的时候才会去创建该对象
    private static Teacher t=null;
    public static Teacher getTeacher(){
        if (t==null){
            t=new Teacher();
        }
        return t;
    }
}
