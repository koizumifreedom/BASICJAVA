package day6;

public class Sample601 {
    public static void main(String[] args) { 
      SampleClass01 s = new SampleClass01();  //インスタンス生成
      s.n = 100;                       //フィールドnに値を代入
      s.s = "Hello";                   //フィールドsに値を代入
      int ans = s.add(1,2);       //メソッドadd()を呼び出し
      String str = s.add("World");  //メソッドadd()を呼び出し
      System.out.println(ans);         //呼び出し結果の表示
      System.out.println(str);         //呼び出し結果の表示
      s.showNum();                     //メソッドshowNum()を呼び出し
    } 
}

//オブジェクトとはモノを表す言葉
//オブジェクトには2種類の要素がある  メソッドとはオブジェクトの動作　フィールドとはオブジェクトの属性
//インスタンスという呼び名もあ  作った物事をインスタンスと言う
//インスタンスを生成するにはnewを用いる
//クラスとはオブジェクトの設計図にあたるも
//フィールドには。初期値を代入することが可能


//3
//HelloWorld
//n = 100