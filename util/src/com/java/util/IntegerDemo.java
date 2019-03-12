package com.java.util;

/**
 * Integer类的练习
 * @author 张攀华
 * 2019.3.12
 */
public class IntegerDemo {
    public static void main(String[] args) {
        int num = 31;
        String string2 = Integer.toBinaryString(num);
        String string3 = Integer.toHexString(num);
        System.out.println("二进制："+string2);
        System.out.println("十六进制："+string3);
        System.out.println("-----------分割线，以下是自定义方法");
        System.out.println("转换二进制："+convert(31,2));
    }
    //编写代码将num转换成radix进制
    private static String convert(int num, int radix){
        //创建一个stringBuffer，用来存放结果字符串
        StringBuffer stringBuffer = new StringBuffer();
        //当被除数不等于0
                while(num !=0){
                    //定义remainder为余数
                    int remainder = num % radix;
                    //将余数加入stringBuffer中
                    stringBuffer.append(String.valueOf(remainder));
                    //更新被除数为商
                    num = num / radix;
                }
                //反转字符串
                return stringBuffer.reverse().toString();
    }
}
