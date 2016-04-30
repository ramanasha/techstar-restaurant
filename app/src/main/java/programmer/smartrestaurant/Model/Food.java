package programmer.smartrestaurant.Model;

/**
 * Created by tsenguun on 4/30/2016.
 */

public class Food {
    private int _id;
    private String name ;
    private String une;
    private String turul;
    private String hemjee;

    public Food(){

    }
    public Food(int  id ,String name, String une, String turul, String hemjee){
        this._id = id;
        this.name = name;
        this.une = une;
        this.turul = turul;
        this.hemjee = hemjee;
    }

    public Food(String name, String une, String turul, String hemjee){
        this.name = name;
        this.une = une;
        this.turul = turul;
        this.hemjee = hemjee;
    }
    public int getID(){ return this._id;
    }
    public void setID(int id){
        this ._id= id;}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUne() {
        return une;
    }
    public void setUne(String une) {
        this.une = une;
    }
    public String getTurul() {
        return turul;
    }
    public void setTurul(String turul) {
        this.turul = turul;
    }
    public String getHemjee() {
        return hemjee;
    }
    public void setHemjee(String hemjee) {
        this.hemjee = hemjee;
    }




}
