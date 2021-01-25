// ******   解决这道题采用自带的日期方法,就是采用java自带的和日期相关API(calendar)   ******
//1999年的12月31日是星期五, 请问: 未来哪一个离我们最近的一个世纪末(xx99年的)12月31日正好是星期天(星期日)

import java.util.Calendar;

public class 世纪末的星期 {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        for(int year=1999;year<100000;year+=100){//一个世纪100年,每次年份多加100年
            calendar.set(Calendar.YEAR,year);
            calendar.set(Calendar.MONTH,11);//11代表12月份
            calendar.set(Calendar.DAY_OF_MONTH,31);//31代表31日
            if(calendar.get(Calendar.DAY_OF_WEEK)==1){//1代表星期日，从sunday开始计算每周为星期几
                System.out.println(year);
                break;
            }
        }
    }

}
//注意: 日期在1970年以前就不能使用这个方法