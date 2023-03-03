//多重ループ
package day4;

public class Sample402 {
   public static void main(String[] args) {
      // forの二重ループ
      for(int i = 1; i <= 2;i ++) {       //2回まで増やす
          for(int j = 1; j <=3 ; j++) {   //3回まで増やす
              int k = i + j ;
              System.out.print(i+"+" + j + "=" + k + " ");
          }
          System.out.println();
      }
   } 
}

//

//1+1=2 1+2=3 1+3=4 　
//2+1=3 2+2=4 2+3=5   ループしたiが左辺になって2になる
