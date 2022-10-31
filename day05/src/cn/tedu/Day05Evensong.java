package cn.tedu;
//第五天晚课
public class Day05Evensong {
    public static void main(String[] args) {

    }
}


/*
1.循环结构：
  1)for结构：应用率高、与次数相关的
2.三种循环结构如何选择：
  1)先看循环是否与次数相关：
    1.1)若相关：------------------------------直接上for
    1.2)若无关，再判断要素1与要素3代码是否相同
        1.2.1)若相同：--------------------------直接上do...while
        1.2.2)若不同：--------------------------直接上while
3.break：跳出循环
  continue：跳过循环体中剩余语句而进入一次循环
4.嵌套循环：
  1)循环中套循环
  2)执行规则：外层循环走一次，内层循环走所有次
  3)建议: 嵌套层数越少越好，能用一层就不用两层，能用两层就不用三层
  4)break只能跳出当前一层循环
5.数组：
  1)相同数据类型元素的集合
  2)是一种数据类型(引用类型)
  3)定义：
      //声明整型数组arr，包含10个元素，每个元素都是int类型，默认值为0
      int[] arr = new int[10];
  4)初始化：初始化数组中的元素
      int[] arr = new int[3]; //0,0,0
      int[] arr = {2,5,8}; //2,5,8
      int[] arr = new int[]{2,5,8}; //2,5,8
      int[] arr;
      arr = {2,5,8}; //编译错误，此方式只能声明同时初始化
      arr = new int[]{2,5,8}; //正确
   5)访问：访问的是数组中的元素
     5.1)通过(数组名.length)可以获取数组的长度(元素个数)
           int[] arr = new int[10];
           System.out.println(arr.length); //10
     5.2)通过下标/索引来访问数组中的元素
         下标从0开始，最大到(数组的长度-1)
            int[] arr = new int[3];
            arr[0] = 100; //给arr中第1个元素赋值为100
            arr[1] = 200; //给arr中第2个元素赋值为200
            arr[2] = 300; //给arr中第3个元素赋值为300
            //arr[3] = 400; //运行时会发生数组下标越界的异常
            System.out.println(arr[arr.length-1]); //输出最后一个元素的值
  6)遍历/迭代：从头到尾挨个走一遍
      int[] arr = new int[10];
      for(int i=0;i<arr.length;i++){ //遍历所有元素
          arr[i] = (int)(Math.random()*100); //给每个元素赋值为0到99之间的随机数
          System.out.println(arr[i]); //输出每个元素的值
      }
 */


/*
//面试题:-------简答题
1.JDK、JRE、JVM的区别:
  1)JDK:java开发工具包，是java的核心，包括:JRE+编译、运行等命令工具
  2)JRE:java运行环境，是运行java程序所必须的环境集合，包括:JVM+java系统类库
  3)JVM:java虚拟机，是java实现跨平台的最核心部分，能够运行java语言所开发的程序
2.java的8种基本数据类型是什么?(简述java的8种基本数据类型)
  答:8种基本数据类型包括:byte,short,int,long,float,double,boolean,char
  1)byte:字节型，用于存储整数，占用1个字节，范围在-128到127
  2)short:短整型，用于存储整数，占用2个字节，范围在-32768到32767
  3)int:最常用的整型，用于存储整数，占用4个字节，范围在-2^31到2^31-1
  4)long:长整型，用于存储整数，占用8个字节，范围在-2^63到2^63-1
  5)float:单精度浮点型，用于存储小数，占用4个字节，不用表示精确的值
  6)double:双精度浮点型，最常用的存储小数的类型，占用8个字节，不能表示精确的值
  7)boolean:布尔型，存储true或false，占用1个字节
  8)char:字符型，采用Unicode字符编码格式，存储单个字符，占用2个字节
3.switch可以作用于哪些数据类型上?
  答: byte,short,int,char,String,枚举。其余类型都不允许
 */

/*
//面试题:----代码分析题
    int result = 0;
    int i = 2;
    switch(i){
        case 1:
            result = result+1;
        case 2:
            result = result+i*2; //result=4
        case 3:
            result = result+i*3; //result=10
    }
    System.out.println(result); //10

    int a=0,c=0;
    do{
        --c; //c=-1
        a--; //a=-1
    }while(a>0);
    System.out.println(c); //-1
*/
