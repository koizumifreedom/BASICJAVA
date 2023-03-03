//final変数
package day2;

public class Sample206 {
    public static void main(String[] args) {
       final int NUMBER = 100;
       final String STRING = "HOGE";
       System.out.println(NUMBER);
       System.out.println(STRING);

       //定数は大文字にするとわかりやすい
       //finalがついた変数は変えられない
       //NUMBER = 100;
       //STRING = "HOGE";
    } 
}

//100
//HOGE
