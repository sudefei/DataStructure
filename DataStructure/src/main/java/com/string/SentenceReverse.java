package com.string;

public class SentenceReverse {
    public static void main(String[] args) {
        String string="Student. a am I";
        System.out.println(ReverseSentence(string));
        System.out.println(ReverseSentence02(string));
    }
    public static String ReverseSentence(String str) {
        if (str.isEmpty() || str.trim().equals("")) return null;
        String[] s = str.split(" ");
        String result="";
        for (int i=s.length-1;i>=0;i--){
            result+=s[i]+" ";
        }
        return result;
    }

    public static String ReverseSentence02(String str) {
        if (str.isEmpty() || str.trim().equals("")) return null;
        StringBuffer sb=new StringBuffer();
        String[] s = str.split(" ");
        for (int i=s.length-1;i>=0;i--){
            sb.append(s[i]+" ");
        }
        String result = sb.toString();
        return result;
    }

}
