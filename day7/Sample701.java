//アクセス指定子
package day7;

public class Sample701 {
   public static void main(String[] args) {
      SampleClass02 s = new SampleClass02();
      //method1()は、privateなので、外部からはアクセスできない。
      //s.method();
      //method2呼び出し
      s.method2();
      //method3呼び出し
      s.method3();
      //numは、privateフィールドなので、外部からはアクセスできない。
      //s.num = 1;
   } 
}

//アクセス接続子とはメソッドとフィールドに対するアクセス権限を規定する
//外部からアクセスできるようにしたり、でききるようにしなかったりできる
//クラスと同じメソッドんの事をコンストラクタと言う
//コンストラクタは一度しか実行されない主に初期化処理に使われる
//


//コンストラクタ
//method2(public)
//method1(private)
//method3(public) : num=1