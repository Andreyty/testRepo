import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class App {
    private static List<Integer>arrayList;
    private static List<Integer>linkedList;

    public static void main(String[] args){

        setup();

        System.out.println("difference " + Math.abs(getTimeInsert(arrayList) - getTimeInsert(linkedList)) + "\n");

        System.out.println("difference " + Math.abs(getTimeDelet(arrayList) - getTimeDelet(linkedList)) + "\n");

        System.out.println("difference " + Math.abs(getTimeFind(arrayList) - getTimeFind(linkedList)) + "\n");



    }
    public static void setup(){
        arrayList=new ArrayList<Integer>();
        linkedList=new LinkedList<Integer>();

        for (int i=0;i<1000000;i++ ) {
            arrayList.add((int)(Math.random() * 10));
        }
        linkedList.addAll(arrayList);
    }

    private static long getTimeInsert(List<Integer> list) {
        Date date0 = new Date();
        for (int i = 0; i < 1000; i++) {
            list.add((int) (Math.random() * 10));
        }
        Date date1 = new Date();
        long time = (date1.getTime() - date0.getTime());
        System.out.println("insert in " + list.getClass().getName() + " " + time + "ms");
        return time;
    }
    private static long getTimeDelet(List<Integer> list) {
        Date date0 = new Date();
        for (int i = 0; i < 1000; i++) {
            list.remove(i);
        }
        Date date1 = new Date();
        long time = (date1.getTime() - date0.getTime());
        System.out.println("delet in " + list.getClass().getName() + " " + time + "ms");
        return time;
    }

    //  Вывести время на поиск 1000 элементов
    private static long getTimeFind(List<Integer> list) {
        Date date0 = new Date();
        for (int i = 0; i < 1000; i++) {
            int temp = list.get(i);
        }
        Date date1 = new Date();
        long time = (date1.getTime() - date0.getTime());
        System.out.println("find in " + list.getClass().getName() + " " + time + "ms");
        return time;
    }
}
