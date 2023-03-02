//if文
package day3;

public class Sample301 {
   public static void main(String[] args) {
      //標準出力
      int a = 10; //整数値　（色々変えてみましょう）
      System.out.println("a="+a);
      //入力した値が、正の数かどうかを調べる
      if(a > 0){
      System.out.println("aは正の数です。");  //生の数だった場合に実行
      }
      System.out.println(a > 0);
      System.out.println(a < 0);
   } 
}

//if文はカッコ内の条件が成り立てば表示します
//ifはtrueかfalseで判断されて条件が分岐して処理が行われる
//条件が満たされてない「a > 12」は表示されない


//a=10
//aは正の数です。
//true
//false
