import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(23);
        list.add(14);
        list.add(27);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.add(34);
        list.remove(3);
        System.out.println(list);
        list.clear();
        System.out.println(list);
        list.add(10);
        list.add(23);
        list.add(14);
        list.add(2,8);
        System.out.println(list);




    }
}
