public class FirstSample {
	public static void main(String[] args) {
		System.out.println("we will not use 'hello, world!'");
	}
}

main 函数的方法声明必须为 public
System.out.print() 为不换行的
// 
/*  */
/**  */注释可以用来自动生成文档

所有的函数必须在类里面。所以主函数 main 也是在类里的。


1.变量
整型：int short long byte  注意：没有任何无符号整型(unsigned)

java7开始，数字前面加上0b可以用来表示二进制

浮点型：float double 。float 类型的数值后面有个后缀 F，没有后缀 F 的自动默认为浮点型。当然也可以在数字后面加上 D。

char 型
boolean(布尔类型)：false true。 整型值和布尔值之间不能进行类型转换。

声明一个变量之后，必须将变量显式地初始化。不允许使用未被初始化的变量。

在 java 中不去分变量的声明与定义。


2.常量：final
final double PI = 3.1415926
类常量：可以在一个类的多种方法里面使用的常量。static final double PI = 3.1415926
类常量的定义在 main 方法的外面：
public class Sample2 {
	public static final double PI = 3.1415926
	public static void main(String[] args){
		code
	}
}
使用了 public 定义常量之后，其他类也可以来使用这个常量。

const 是 java 的保留关键字。虽然现在他还没被用。java 中还是用 final 来定义常量。

java 用 >>> 运算符填充高位0，用 >> 运算符用符号位填充高位。没有 <<< 运算符，<< 运算符填充低位的0。
而在 C/C++ 中无法确定 >> 是算术移位还是扩展符号位，执行中选择效率较高的一种。
对于移位运算符右侧的参数需要进行模32的运算（不过 long 的话就是取模64），所以 1 << 35 和 1 << 3 和 8 是相同的


3.math 数学函数
Math.sqrt();
Math.pow(x, a);
Math.sin  Math.cos  Math.tan  Math.atan
Math.exp  Math.log  Math.log10
Math.PI  Math.E(e常量的近似值)
简便：在前面添加头文件 import static java.lang.Math.*;


4.强制类型转换
double a = 3.99
int b = (int) a;


5.字符串
字串：
String greeting = "hello";
String s = greeting.substring(0, 3);

拼接：
允许直接 String a = b + c;（b c 为两个字符串）

字符串类是不可变的。是不可以直接修改的。 只能：
greeting = greeting.substring(0, 3) + "p!";//这是在修改字符串变量不是字符串，字符串本身不可变

检测字符串是否相等：
s.equals(t) 返回 true 或者 false       也可以："hello".equals(t)

关于比较字符串：
C 采用 strcmp 函数比较
C++ 采用 == 比较
java 是绝不能采用 == 比较的，他用 equals 或者 greeting.compareTo("Hello") == 0 这样写。不过前面一种方法更加清晰。

空串：
str == null

长度：
int len = str.length();

构建字符串：
StringBuilder builder = new StringBuilder();
builder.append(ch);
builder.append(str);
void setCharAt(int i, char c) //将第i个代码单元设置为 c


6.读取输入：
Scanner in = new Scanner(System.in);
String name = in.nextline();
String name = in.next();
int age = in.nextInt();

关于读取输入，要在前面加上头文件：import java.util.*;
import java.util.Scanner （它只会导Scanner类，在你所建的类中只可以用util中Scanner类）
import java.util.* （它是采用赖加载模式，你用到util中哪个类它才会加载哪个类。可以省去你一些导包的功夫，不必担心它多加载）


7.格式化输出：
System.out.printf("%d, %s", age, neme);

8.
C++允许在嵌套的块中重定义一个变量，这样做会覆盖在外层定义的变量。Java 不允许这么做。

9.
switch：遇到 break 才停止。可能会触发多个 case 语句


10.大数值：
BigInteger a = BigInteger.valueOf(200);
BigInteger c = a.add(b);
BigInteger d = c.multiply(b.add(BigInteger.valueOf(2))); 


11.数组


