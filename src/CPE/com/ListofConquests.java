package CPE.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListofConquests {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int cases =scanner.nextInt();
        String counties[]=new String[cases];
        Set<String> set =new HashSet<>();
        for (int i =0;i<cases;i++){
            counties[i]=scanner.next();
            set.add(counties[i]);
            String No=scanner.nextLine();
        }
        Arrays.sort(counties);
        String st[]=set.toArray(new String[set.size()]);
        Arrays.sort(st);

        for (int i=0;i<st.length;i++){
            int count =0;
            for (int j =0;j<cases;j++){
                if (st[i].equals(counties[j]))
                    count++;
            }
            System.out.println(st[i]+" "+count);
        }
    }
}
