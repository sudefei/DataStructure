package com.foramt;

public class Student {
//    构造私有的构造方法，使得其他的调用者不能对其进行实例化
    private Student(){};
//    确保类在内存中的只存在一个对象，该实例必须自动创建，而且对外提供
    private static Student s=new Student();
    public static Student getStudent(){
        return s;
    }
}
