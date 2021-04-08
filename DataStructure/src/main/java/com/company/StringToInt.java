package com.company;

import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        String again;
      Scanner scan = new Scanner(System.in);
      do {
          System.out.println("请输入字符串：");
          String string = scan.nextLine();
          System.out.println("判断结果是："+strToInt(string));
          System.out.println("是否在输入字符串进行判断， 输入 [Y/N]");
          again = scan.nextLine();
      }while(again.equalsIgnoreCase("Y"));
    }

    public static int strToInt(String str){
        int start,flag=1;
        //首先要判断该字符串是否为空
        if(str == null || str.length() ==0 || str.trim().equals("")) return 0;
        //判断是 正数还是负数
        if(str.charAt(0) == '+'){
            flag=1;
            start=1;
        }else if (str.charAt(0)=='-'){
            flag=0;
            start=1;
        }else {
            start=0;
        }
        //对字符串中的每个元素进行遍历，如果是（0，9）则是规范的
        long result = 0 ;
        for (int i=start;i<str.length();i++){
            char tmp = str.charAt(i);
            if (tmp>='0' && tmp <= '9'){
                result =result*10 + (tmp-'0');
                if(flag == 1 && result > Integer.MAX_VALUE){
                    throw new RuntimeException("上溢出");
                }
                if (flag==0 && result < Integer.MIN_VALUE){
                    throw new RuntimeException("下溢出");
                }
            }else{
                return 0;
            }
        }
        if (flag==0){
             return (int)(-1*result);
        }else {
            return (int)result;
        }
    }

}
