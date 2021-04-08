package com.string;

public class StringToArray {
    public static void main(String[] args) {
        String s="hello";
        byte[] bytes = s.getBytes();
        for (int i=0;i<bytes.length;i++){
            System.out.println("bytes:"+bytes[i]);
        }
        char[] chars = s.toCharArray();
        for (int i=0;i<chars.length;i++){
            System.out.println("char:"+chars[i]);
        }
        }
}
