String的常用方法

利用String类创建的字符串变量，一旦初始化或赋值，它的值和所分配的内存内容就不可再改变。如果硬要改变它的值，它就会产生一个新的字符串。（生成了一个新的对象str1），并重新申请了一个新的内存空间，已经指向了一个新的对象

public int length();
public boolean equals(String str);
public String substring(int beginIndex); //返回字符串从beginIndex开始的字串
public String substring(int beginIndex, int endIndex);//返回字符串从beginIndex开始到endIndex-1的字串
public char charAt(int index);//返回index位置的字符
public int indexOf(String str);//返回str在字符串中第一次出现的位置，找不到的话返回-1
public int compareTo(String anotherString);
public String replace(char oldChar, char newChar);//以newChar字符替换字符串中所有oldChar字符
public String trim();//去掉字符串的首尾空格
public String toLowerCase();
public String toUpperCase();

不能像c++一样使用str[1]的下标方式访问，只能用str.charAt(1)的方式访问字符串下标为1的字符是什么字符
