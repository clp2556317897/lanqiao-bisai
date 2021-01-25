//******      这道题目采用递归的算法         ******
/*从我做起振
  我做起振兴
  做起振兴中
  起振兴中华    先站在左上角的"从"字格子里,可以横向或纵向跳到相邻的格子里,但不能跳到对角或其他位置的格子,一直跳到"华"字格子结束。
               要求跳过的路线刚好构成"从我做起振兴中华"这句话
               请问一共有多少种可能的跳跃路线?
  */
public class 振兴中华 {
    //重复
    //变化
    //边界
    public static void main(String[] args) {
       int m =f(0,0);
        System.out.println(m);
    }
    private static int f(int i, int j) {
        if(i==3||j==4) return 1;
        return f(i+1,j)+f(i,j+1);//将两种走法的路线数相加
    }
}
