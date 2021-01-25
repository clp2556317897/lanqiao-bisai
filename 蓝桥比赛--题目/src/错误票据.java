import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//******  本道题目利用枚举    ******
/*
  某涉密单位下发了某种票据，并要在年终全部收回。
    每张票据有唯一的ID号。全年所有票据的ID号是连续的，但ID的开始数码是随机选定的。
    因为工作人员疏忽，在录入ID号的时候发生了一处错误，造成了某个ID断号，另外一个ID重号。
    你的任务是通过编程，找出断号的ID和重号的ID。
    假设断号不可能发生在最大和最小号。
要求程序首先输入一个整数N(N<100)表示后面数据行数。
接着读入N行数据。
每行数据长度不等，是用空格分开的若干个（不大于100个）正整数（不大于100000）
每个整数代表一个ID号。

要求程序输出1行，含两个整数m n，用空格分隔。
其中，m表示断号ID，n表示重号ID
* */
public class 错误票据 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        int n=sc.nextInt();
        sc.nextLine();//把整数后面的换行符去掉
        for(int i=0;i<n;i++){
            String line=sc.nextLine();
            String []split=line.split(" ");
            for(int j=0;j<split.length;j++){
                list.add(Integer.parseInt(split[j]));
            }
        }
        Collections.sort(list);//Collections.sort将集合里的数字从小到大排序
        int a=0, b=0;
        for(int m=1;m<list.size();m++){
            if(list.get(m)-list.get(m-1)==2){
                a=list.get(m)-1;
            }
            if(list.get(m)-list.get(m-1)==0){
                b=list.get(m);
            }
        }
        System.out.println(a+" "+b);
    }
}
