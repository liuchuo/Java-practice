// 利用基本输入输出流实现从键盘上读取一个字符，然后显示在屏幕上
import java.io.*;
public class Exercise {
    public static void main(String[] args) throws IOException {
        byte[] c = new byte[2];
        InputStream in = new DataInputStream(System.in);
        in.read(c);
        OutputSteam out = new DataOutputStream(System.out);
        out.write(c);
        in.close();
        out.close();
    }
}


// 利用文件输出流创建一个文件file1.txt，写入字符“文件已被成功创建！”，然后用记事本打开该文件，看一下是否正确写入
import java.io.*;
public class Exercise {
    public static void main(String[] args) throws IOException {
        File file = new File("file1.txt");
        FileOutputStream out = new FileOutputStream(file);
        String s = new String("文件已被成功创建！");
        byte[] bytes = s.getBytes("UTF-8");
        out.write(bytes);
        out.flush();
        out.close();
    }
}

// 利用文件输入流打开第7题中创建的file1.txt，读出其内容并显示在屏幕上
import java.io.*;
public class Exercise {
    public static void main(String[] args) throws IOException {
        File file = new File("file1.txt");
        FileInputStream in = new FileInputStream(file);
        byte[] bytes = new byte[1024];
        while(in.read(bytes) != -1) {
            System.out.println(new String(bytes));
        }
        in.close();
    }
}

// 利用文字输入输出流打开file1.txt，然后在文件的末尾追加一行字符串“又添加了一行文字！”
import java.io.*;
public class Exercise {
    public static void main(String[] args) throws IOException {
        File file = new File("file1.txt");
        FileOutputStream out = new FileOutputStream(file, true);
        String s = "又添加了一行文字！";
        byte[] bytes = s.getBytes("UTF-8");
        out.wirte(bytes);
        out.close();
    }
}


// 产生15个20~9999之间的随机整数，然后利用BufferedWriter类将其写入文件file2.txt中；之后再读取该文件中的数据并将它们以升序排序
import java.io.*;
public class Exercise {
    public static void main(String[] args) throws IOException {
        File file = new File("file2.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for(int i = 0; i < 15; i++) {
            String s = "" + ((int)(Math.random() * 9979 + 20) + "\n");
            writer.write(s);
        }
        writer.flush();
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader(file));
        int[] nums = new int[15];
        for(int i = 0; i < 15; i++) {
            nums[i] = Integer.praseInt(reader.readLine());
        }
        reader.close();
        Arrays.sort(nums);
        writer = new BufferedWriter(new FileWriter(file));
        for(int i = 0; i < 15; i++) {
            String s = "" + (num[i]) + "\n";
            writer.write(s);
        }
        writer.fulsh();
        writer.close();
    }
}