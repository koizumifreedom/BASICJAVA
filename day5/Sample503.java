///多次元配列
package day5;

public class Sample503 {
   public static void main(String[] args) {
      int a [] [] = new int [3] [4];  //[] []]二次元の配列である事を示している
      int m,n;
      //二次元配列に値を代入
      for(m = 0; m < a.length; m++) {
          for(n = 0; n < a[m].length; n++) {
          a[m][n] = m+n;
      }
   }
   //　成分の表示
   for(m = 0; m < a.length; m++) {
      for(n = 0; n < a[m]. length; n++) {
          System.out.print(a[m][n]+" ");
      }
      System.out.println();
      }
   }
}

//多次元配列はほとんど二次元一番使用頻度が高い

//0 1 2 3 
//1 2 3 4 
//2 3 4 5 