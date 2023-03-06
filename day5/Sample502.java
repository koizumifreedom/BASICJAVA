///配列の初期化
package day5;

public class Sample502 {
    public static void main(String[] avgs) {
        int n[] = { 5,4,3,2,1 };            //何個でも数を増やす事ができる　例えば値が10個以上決まってるパターンならおすすめの方法
        String s[] = {"ABC","DEF","GHI"};
        int i;
        //整数方配列変数nの成分表示
        for(i = 0; i < n.length; i++) {
            System.out.print(n[i]+" ");
        }
        System.out.println();
        //文字列配列変数nの成分表示
        for(i = 0; i < s.length; i++) {
           System.out.print(s[i]+" ");
        }
        System.out.println();
    }
}

//lengthは、配列変数の成分の数を表す
//配列の長さ　(配列変数名).length

//5 4 3 2 1 
//ABC DEF GHI 