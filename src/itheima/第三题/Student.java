package itheima.第三题;

import java.lang.invoke.StringConcatFactory;

public class Student {
    private String name;
    private int age;
    private String cotent;

    public void eat(){
        System.out.println("年龄为"+age+"的"+name+"正在吃饭....");
    }
    public void study(){
        System.out.println("年龄为"+age+"的"+name+"正在专心致志的听着"+cotent+"的知识........");
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }
    public String getCotent(){
        return cotent;
    }
    public void setCotent(){
        this.cotent = cotent;
    }
    public Student(String name,int age,String cotent){
        this.name = name;
        this.age = age;
        this.cotent = cotent;
    }
}
