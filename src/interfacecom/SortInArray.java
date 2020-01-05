package interfacecom;

import java.util.*;

public class SortInArray {
    public static void main(String[] args) {
        List<Accounts> list =Arrays.asList(new Accounts("Justin", "X1234", 1000),
                new Accounts("Kevin", "s1234", 200),
                new Accounts("David", "y1234", 2000))
        ;
        //Collections.sort(list);//為甚麼這樣就可以直接排序
        list.sort(Accounts::compareTo);
        System.out.println(list);
    }
}
class Accounts implements Comparable<Accounts>{
    String name;
    String account;
    int money;
    Accounts(String name,String account,int money){
        this.account=account;
        this.name =name;
        this.money =money;
    }
    @Override
    public int compareTo(Accounts o) {
        if (this.money>o.money)
            return 1;
        if (this.money<o.money)
            return  -1;
        else
            return 0;
    }
    public String toString(){
        return String.format("Account(%s, %s, %d)", name, account, money);
    }
}