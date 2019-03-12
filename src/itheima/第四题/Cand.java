package itheima.第四题;

public class Cand {
    private String ds;
    private String hs;
    public Cand(String ds,String hs){
        this.ds = ds;
        this.hs = hs;
    }

    public void showCand(){
        System.out.println(ds + hs);
    }
    private String getDs(){
        return ds;
    }
    private void setDs(){
        this.ds = ds;
    }
    private String getHs(){
        return hs;
    }
    private void setHs(){
        this.hs = hs;
    }
}
