//カプセル化
package day7;

public class Sample702 {
   public static void main(String[] args) {
       //引数つきコンストラクタの呼び出し
       SampleClass03 s = new SampleClass03("HelloWorld.");
       //SampleClass03 s = new SampleClass03();
       //numberのセッターで、値を設定
       s.setNumber(100);
       //ゲッターで値を呼び出し、内容を表示
       System.out.println(s.getNumber());
       System.out.println(s.getStr());
   }
}

//通常フィールドは、privateで隠蔽する
//外部からアクセスするメソッドを介して値の変更、取得を行う
//セッターフィールドに値を書き込むメソッド 書き込みが必要なものにはセッター
//ゲッターフィールドの値を取得するメソッド 読み込みが必要なものにはゲッター

//100
//HelloWorld.