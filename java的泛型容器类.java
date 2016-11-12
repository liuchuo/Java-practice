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


// 集合 A = {1, 2, 3, 4} 和 B = {1， 3， 5， 7， 9， 11} ,变成求A与B的交集、并集、差集
import java.util.HashSet;
import java.util.Set;

public class Exercise {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        for(int i = 1; i <= 4; i++) {
            a.add(i);
        }
        for(int i = 1; i <= 11; i += 2) {
            b.add(i);
        }

        HashSet<Integer> temp = new HashSet<>(a);
        temp.retainAll(b);
        for(Integer i : temp) {
            System.out.print(i + " ");
        }

        temp = a.clone();
        temp.addAll(b);
        Iterator<Integer> it = temp.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        temp = a.clone();
        temp.remove(b);
        Iterator<Integer> itt = temp.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}


// 利用随机函数生成10个随机数，将他们有序地存入到一个TreeSet对象中，然后利用迭代器有序地输出
import java.util.Iterator;
import java.util.TreeSet;

public class Exercise {
    public static void main(String[] args) {
        TreeSet<Double> treeSet = new TreeSet<>();
        for(int i = 0; i < 10; i++) {
            treeSet.add(Math.random());
        }
        Iterator<Double> it = treeSet.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}


// 利用HashMap类对象存储公司电话号码簿，其中包含公司的电话号码和公司名称，然后删除一个公司和查询一个公司的操作。
import java.util.HashMap;

public class Exercise {
    public static void main(String[] args) {
        HashMap<String, String> number = new HashMap<>();
        number.put("A", "1111111");
        number.put("B", "2222222");
        number.put("C", "3333333");
        number.remove("A");
        number.containKey("C");
    }
}