package Showroom;

public class Naked extends Bike{

    private int bhp;
    private String Make;
    private String Model;

    public Naked(int bhp, String Make, String Model){
        this.bhp = bhp;
        this.Make = Make;
        this.Model = Model;
    }

    public Naked(String Make, String Model){
        this.bhp = 160;
        this.Make = Make;
        this.Model = Model;
    }

    public Naked(String Make){
        this.bhp = bhp;
        this.Make = Make;
        this.Model = "S1000R";
    }

    public Naked(){
        this.bhp = 160;
        this.Make = "BMW";
        this.Model = "S1000R";
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

    public String NoDoors() {
        return null;
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
