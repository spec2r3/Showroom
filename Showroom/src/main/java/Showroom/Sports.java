package Showroom;

public class Sports extends Car{

    private int bhp;
    private String Make;
    private String Model;

    public Sports(int bhp, String Make, String Model){
        this.bhp = bhp;
        this.Make = Make;
        this.Model = Model;
    }

    public Sports(String Make, String Model){
        this.bhp = 500;
        this.Make = Make;
        this.Model = Model;
    }

    public Sports(String Make){
        this.bhp = 500;
        this.Make = Make;
        this.Model = "M4";
    }

    public Sports(){
        this.bhp = 500;
        this.Make = "BMW";
        this.Model = "M4";
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
        return "Turbo V6";
    }

    @Override
    public String transmission() {
        return "DCT";
    }
}
