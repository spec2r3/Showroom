package Showroom;

public class SuperSport extends Bike{

    private int bhp;
    private String Make;
    private String Model;

    public SuperSport(int bhp, String Make, String Model){
        this.bhp = bhp;
        this.Make = Make;
        this.Model = Model;
    }

    public SuperSport(String Make, String Model){
        this.bhp = 200;
        this.Make = Make;
        this.Model = Model;
    }

    public SuperSport(String Make){
        this.bhp = bhp;
        this.Make = Make;
        this.Model = "S1000RR";
    }

    public SuperSport(){
        this.bhp = 200;
        this.Make = "BMW";
        this.Model = "S1000RR";
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
        return "Inline 4";
    }

    @Override
    public String transmission() {
        return "6 speed sequential ";
    }
}
