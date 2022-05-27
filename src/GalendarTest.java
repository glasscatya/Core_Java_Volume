import java.time.DayOfWeek;
import java.time.LocalDate;
//打印出当前月份的表格  标记出当前日期
//如下
/*
       Mon Tue Wed Thu Fri Sat Sun
                        1   2   3
        4   5   6   7   8   9* 10
        11  12  13  14  15  16  17
        18  19  20  21  22  23  24
        25  26  27  28  29  30
*/
public class GalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();//获取当前是星期几

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++)
            System.out.print("    ");//打印空白 直到当前星期有数字出现
        while(date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());//强制占三格  *和天数
            if(date.getDayOfMonth() == today) {
                System.out.print("*");//如果是当前日期 标*
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        if(date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
