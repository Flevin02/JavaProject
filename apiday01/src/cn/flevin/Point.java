package cn.flevin;
/**
 * 点
 */
public class Point {
    /*
      数据私有，设计getter/setter的原因:
      1)很多框架都是基于getter/setter来配置获取数据的，可以理解为它是一种行业的标准
      2)getter/setter时可以对数据进行控制，而public权限时无法对数据进行控制
      3)getter/setter并非一定要同时出现，可以只getter或只setter，需要根据需求自行选择
     */
    private int x;
    private int y;

    public int getX(){ //getter
        return x;
    }
    public void setX(int x){ //setter
        this.x = x;
    }

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}














