//代入演算子
package day2;

public class Sample203 {
    public static void main(String[] args) {
        //使用する変数の定義
        int a1=2,b1=2,c1=2,d1=2;   //変数の宣言(1)
        int a2=2,b2=2,c2=2,d2=2;   //変数の宣言(2)
        //普通の計算による計算と代入
        a1 = a1 + 1;  //a1 + 1で計算したものをa1に代入
        b1 = b1 - 1;
        c1 = c1 * 2;
        d1 = d1 / 2;
        //代入演算による計算
        a2 += 1;
        b2 -= 1;
        c2 *= 2;
        d2 /= 2;
        System.out.println("a1="+a1+" b1=" + b1+" c1="+c1+" d1="+d1);
        System.out.println("a1="+a2+" b2=" + b2+" c2="+c2+" d1="+d2);
    }
}


//a1=3 b1=1 c1=4 d1=1
//a1=3 b2=1 c2=4 d1=1
