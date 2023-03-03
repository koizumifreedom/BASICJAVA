// if～else if～else
package day3;

//if~else if~else
public class Sample303 {
    public static void main(String[] args) {
       //標準出力
       int num = 1;                                  //整数値（色々変えてみよう）
       if(num == 1) {
          System.out.println("one");               //numが1だった場合の処理
       }else if(num == 2){
          System.out.println("two");               //numが2だった場合の処理
       }else if(num == 3){
           System.out.println("three");            //numが3だった場合の処理
       }else{
           System.out.println("不適切な値です。");    //それ以外の値が入力された場合
       }
    }
}

//左辺と右辺の値を比較するという場合は「＝＝』を使うケースがある
//ifでもelseでもない中間的な条件の場合は、else ifを使う
//else ifは「S何個あっても大丈夫

//one