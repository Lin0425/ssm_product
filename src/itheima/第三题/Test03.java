package itheima.第三题;

public class Test03 {
    public static void main(String[] args){
        Teacher t = new Teacher("周老师",30,"java面向对象");
        t.eat();
        t.teach();
        Student stu =new Student("韩同学",18,"java面向对象");
        stu.eat();
        stu.study();
    }
}
