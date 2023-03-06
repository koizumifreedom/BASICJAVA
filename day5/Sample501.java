//配列変数
package day5;

public class Sample501 {
    public static void main(String[] args) {
        double[] d = new double[3];
        double sum,avg;   //合計値、平均値を入れる変数
        //値を代入
        d[0] = 1.2;
        d[1] = 3.7;
        d[2] = 4.1;
        sum  = 0.0;
        for(int i = 0; i < d.length; i++){
          System.out.print(d[i] + " ");
          sum += d[i];
        }
        System.out.println();
        avg = sum / 3.0;
        System.out.println("合計値 :" + sum);
        System.out.println("平均値 :" + avg);
    }
}

//d.lengthで長さがわかる
//配列は、変数の箱が連なったもの
//その連なった箱1つ1つを要素と言う
//複数のデータを扱うために必要
//要素には一意の数（添字(そえじ)がついている
//どんな要素でも0からスタート

//1.2 3.7 4.1 
//合計値 :9.0
//平均値 :3.0
