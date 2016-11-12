// 将1~10之间的整数存放到一个线性表LinkedList的对象中，然后将其下标为4的元素从列表中删除
import java.util.LinkedList;
public class Exercise {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 1; i <= 10; i++) {
            linkedList.add(i);
        }
        linkedList.remove(4);
    }
}


// 利用ArrayList类创建一个对象，并向其添加若干个字符串元素，然后随机选一个元素输出
import java.util.ArrayList;

public class Exercise {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Java");
        System.out.println(arrayList.get((int)(Math.random() * (arrayList.size() - 1))));
    }
}


