package interfacecom;
//number不能實作
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargeNumber {
    public static void main(String[] args) {
        ArrayList list =new ArrayList();
        list.add(45);
        list.add(644.555);
        list.add(new BigInteger("333333344444444444444"));
        list.add(new BigDecimal("2.555555555555555555555"));
        System.out.println(getLargeNumber(list));
    }
    public static Number getLargeNumber(ArrayList<Number> list){
        if (list.size()==0||list==null)
            return null;
        Number number =  list.get(0);
        for (int i=1;i<list.size();i++){
            if (number.doubleValue()<list.get(i).doubleValue())
            number =  list.get(i);
        }
        return number;
    }
}
