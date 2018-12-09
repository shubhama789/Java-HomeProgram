package abc;

import java.util.ArrayList;
 
public class Fun {
 
    public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        arr2.add(1);
        System.out.println("Actual ArrayList:"+arrl);
        System.out.println(arrl.size());
        arrl.remove(1);
        System.out.println(arrl.size());
        System.out.println("After clear ArrayList:"+arrl);
        arrl.set(1,"hi");
        System.out.println("After clear ArrayList:"+arrl);
        arrl.add(1,"dkjhakj");
        System.out.println("After clear ArrayList:"+arrl);
    }
}