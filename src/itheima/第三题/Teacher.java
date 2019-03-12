package itheima.第三题;

public class Teacher {
    private String name;
    private int age;
    private String content;

    public void eat(){
        System.out.println(""+age+"的"+name+"正在吃饭....");
    }
    public void teach(){
        System.out.println("年龄为"+age+"的"+name+"正在亢奋的讲着"+content+"的知识........");
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.name = name;
    }
    public String getContent(){
        return content;
    }
    public void setContent(){
        this.content = content;
    }
    public Teacher(String name,int age,String content){
        this.name = name;
        this.age = age;
        this.content = content;
    }
}
