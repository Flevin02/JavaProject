package cn.flevin;

/**
 * String substring(int start,int end):
 * 截取当前字符串中指定范围的字符串(含头不含尾---包含start，但不包含end)
 */
public class SubstringDemo {
    public static void main(String[] args) {
        //                      1
        //            01234567890
        String str = "www.tedu.cn";
        int start = str.indexOf(".")+1; //4，获取第1个点之后的下标
        int end = str.lastIndexOf("."); //8，获取最后一个点的下标
        String name = str.substring(start,end); //截取下标4到7的字符串
        System.out.println(name); //tedu

        name = str.substring(4); //从下标4一直截到最后
        System.out.println(name); //tedu.cn
    }
}


















