//******     解决这道题采用枚举的算法    ******
//假设 a b c d e 代表1-9不同的5个数字 (注意是各不相同的数字,并且不含0)
//   能满足形式:   ab * cde =adb * ce   的等式一共有多少种?
public class 马虎的算式 {
    public static void main(String[] args) {
        int shuliang = 0;
        for (int a = 1; a < 10; a++) {//表示a可以取9个数
            for (int b = 1; b < 10; b++) {//表示b可以取9个数
                if (b != a) for (int c = 1; c < 10; c++) {//在b不等于a的前提下, c可以取9个数
                    if (c != a && c != b) for (int d = 1; d < 10; d++) {//在c不等于a并且不等于b的前提下, d可以取9个数
                        if (d != a && d != b && d != c) for (int e = 1; e < 10; e++) {//在d不等于a并且不等于b并且不等于c的前提下, e可以取9个数
                            if (e != a && e != b && e != c && e != d) {//在e不等于a并且不等于b并且不等于c并且不等于d的前提下,可以进行等式验证
                                if ((a * 10 + b) * (c * 100 + d * 10 + e) == (a * 100 + d * 10 + b) * (c * 10 + e)) {//上面等式验证的方法
                                    shuliang++;//每次满足条件 shuliang+1;
                                }
                            }
                        }
                    }
                }
            }

        }
        System.out.println(shuliang);
    }
}