package itheima.第五题;

public class Clicle {
    private int r;
    public Clicle() {
    }
    public Clicle(int r){
        this.r = r;
    }
    public int getR(){
        return r;
    }
    public void setR(){
        this.r = r;
    }
    public void showArea(){
        System.out.println("半径为:"+r+",面积为:"+(3.14*r*r));
    }
    public void showPerimeter(){
        System.out.println("半径为:"+r+",周长为:"+(3.14*2*r));
    }
}
