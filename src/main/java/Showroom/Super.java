package Showroom;

public class Super extends Car{

    private int bhp;
    private String Make;
    private String Model;

    public Super(int bhp, String Make, String Model){
        this.bhp = bhp;
        this.Make = Make;
        this.Model = Model;
    }

    public Super(String Make, String Model){
        this.bhp = 800;
        this.Make = Make;
        this.Model = Model;
    }

    public Super(String Make){
        this.bhp = bhp;
        this.Make = Make;
        this.Model = "M8";
    }

    public Super(){
        this.bhp = 800;
        this.Make = "BMW";
        this.Model = "M8";
    }

    public int getBhp() {
        return bhp;
    }

    public String getMake() {
        return Make;
    }

    public String getModel() {
        return Model;
    }


    @Override
    public String engine() {
        return "Twin Turbo V8";
    }

    @Override
    public String transmission() {
        return "ZF 8 Speed";
    }
}