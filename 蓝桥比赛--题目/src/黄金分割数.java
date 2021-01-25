import java.math.BigDecimal;
import java.math.BigInteger;

//******    这道题其实就是求其斐波那契,但是因为所要求的数字过大所以要使用java自带的API(BigInteger和BigDecimal)     ******
//这道题要求精确到小数点后100位(要求四舍五入)
public class 黄金分割数 {
    //斐波那契就是 n/n+1 ,因为这道题要求精确到小数点后100位,所以我们需要求到小数点后101位是稳定的才可以达到我们本题的要求(稳定的意思就是不变)
    public static void main(String[] args) {
        BigInteger a=BigInteger.ONE;
        BigInteger b=BigInteger.ONE;
        for(int i=3;i<500;i++){
             BigInteger t=b;
             b=b.add(a);
             a=t;
        }
        BigDecimal divide=new BigDecimal(a,110).divide(new BigDecimal(b,110),BigDecimal.ROUND_HALF_DOWN);
        System.out.println(divide.toPlainString().substring(0, 103));
    }

}
