package itheima.第六题;

import java.sql.SQLOutput;

public class Test06 {
    public static void main(String[] args){
        Manager m = new Manager("James","9527",15000,3000);
        m.intro();
        m.showSalary();
        m.work();

        System.out.println("============");

        Coder c = new Coder();
        c.setName("Kobe");
        c.setId("0025");
        c.setSalary(10000);
        c.intro();
        c.showSalary();
        c.work();
    }
}
