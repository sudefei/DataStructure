package com.foramt;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher1 = Teacher.getTeacher();
        Teacher teacher2 = Teacher.getTeacher();
        System.out.println(teacher1.equals(teacher2));
        System.out.println(teacher1==teacher2);

    }
}
