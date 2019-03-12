package itheima.第八题;

public class Test08 {
    public static void main(String[] args) {
        Book b1 = new Book("No0001","Java入门","isbn943247483",38.8,"2015-01-01");
        Book b2 = new Book("No0002","Mysql数据库","isbn23867592",46.8,"2016-01-01");
        Book b3 = new Book("No0003","JavaWe实践","isbn387648797524",58.8,"2017-01-01");

        Book b = b1;
        if (b2.getPrice()>b.getPrice()){
            b = b2;
        }
        if (b3.getPrice()>b.getPrice()){
            b = b3;
        }
        System.out.println("最贵的书是:"+b.getBookId()+","+b.getTitle()+
        ","+b.getIsbn()+","+b.getPrice()+","+b.getPublicationDate());
    }
}
