//文字列の演算
package day2;

public class Sample205 {

    public static void main(String[] args) {
        String s1,s2,s3;
        s1 = "ABC";    //s1に文字列「ABC」を代入
        s2 = "DEF";    //s1に文字列「ABC」を代入
        s3 = s1 + s2;  //s3に、s1とs2を結合したものを代入
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 + s2);
        System.out.println(s3);
    }
}

//String 文字列の演算
//文字列は「+」のみ使用可能他の「-,*,/」は使用できない

//ABC
//DEF
//ABCDEF
//ABCDEF
