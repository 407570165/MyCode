package interfacecom;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities ={"Savannah", "Boston", "Atlanta", "Tampa"};
        Arrays.sort(cities);
        for (String city: cities)
            System.out.print(city+" ");
        System.out.println();
        BigInteger bigInteger[]={new BigInteger( "2323231092923992"),
                new BigInteger( "432232323239292"),
                new BigInteger( "54623239292") };
        Arrays.sort(bigInteger);
        for (BigInteger number :bigInteger)
            System.out.println(number+" ");

    }
}
