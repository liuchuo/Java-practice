数组Arrays的常用用法：

以下int可以换为任意类型

import java.util.Arrays;

//在升序数组中查找首次出现key值的下标
public static int binarySearch(int[] a, int key);
//对数组升序排序
public static void sort(int[] a);
//对数组a从fromIndex到toIndex-1的元素进行升序排序
public static void sort(int[] a, int fromIndex, int toIndex);
//截取任意类型数组original中长度为newLength的数组元素拷贝给调用数组
public static X[] copyOf(int[] original, int newLength);
//判断两个数组a和b是否元素值都相等
public static boolean equals(int[] a, int[] b);

int[] a = {1, 2, 3, 4, 5};
int len = a.length;//返回a数组的长度

//for - each 结构
for(int element : a)
    System.out.println(element);
//二维数组
int[][] a = new int[3][4];
java中的数组不一定是矩形
int[][] x = new int[3][];
x[0] = new int[5];
x[1] = new int[10];
x[0][1] = 100;

对于二维数组，x.length取得的是二维数组x的行数，而x[0].length是取得x第0行的列数
二维数组要求必须指定高层维数：
int[][] myArray = new int[10][];
int[][] myArray = new int[10][3];
//下面两种方式是错误的
int[][] myArray = new int[][];
int[][] myArray = new int[][3];

也可以在声明的时候直接赋值：
int[] a = {1, 2, 3};
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6}
};

二维数组的for-each结构：
for(int[] row : a) {
    for(int col : row) {
        System.out.println(col);
    }
}


