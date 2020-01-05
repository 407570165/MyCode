package CPE.com;

import javafx.scene.SceneAntialiasing;

import java.util.Scanner;
import java.util.Vector;

public class FibonaccimalBase {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int cases =scanner.nextInt();
        for (int i =0;i<cases;i++){
            int n =scanner.nextInt();
            Vector<Integer> vector =new Vector<>();
            vector.add(1);
            if (n>1){
                vector.add(2);
                int temp =0;
                while((temp=vector.elementAt(vector.size()-2)+vector.lastElement())<=n){
                    vector.add(temp);
                }
            }
        }
    }
}
