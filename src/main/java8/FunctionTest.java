package main.java8;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author zhangwt
 * @date 2017/8/14 10:49.
 */
class TaobaoTradeDetails{
    private String name;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TaobaoTradeDetails(String name, Date date) {
        this.name = name;
        this.date = date;
    }
}

public class FunctionTest {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Calendar calendar = Calendar.getInstance();
        Date today =calendar.getTime();

        calendar.add(Calendar.DAY_OF_MONTH,-1);
        Date yesterday = calendar.getTime();

        calendar.add(Calendar.DAY_OF_MONTH,-1);
        Date tdby = calendar.getTime();

        calendar.add(Calendar.DAY_OF_MONTH,3);
        Date tomorrow = calendar.getTime();





        Function<TaobaoTradeDetails, Date> compare = TaobaoTradeDetails::getDate;
        Comparator<TaobaoTradeDetails> byDate = Comparator.comparing(compare);
        List<TaobaoTradeDetails> list = new ArrayList<>(Arrays.asList(new TaobaoTradeDetails("0",today),new TaobaoTradeDetails("1",tomorrow),new TaobaoTradeDetails("-2",tdby),new TaobaoTradeDetails("-1",yesterday)));


        List<TaobaoTradeDetails> result = list.stream().sorted(byDate.reversed()).collect(Collectors.toList());


        result.forEach(t-> System.out.println(t.getName()+":"+sdf.format(t.getDate())));
    }
}
