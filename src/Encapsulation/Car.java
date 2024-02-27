package Encapsulation;

public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year){
//        this.make = make;
//        this.model = model;
//        this.year = year;
        // DRY
        this.setMake(make) ;
        this.setModel(model);
        this.setYear(year);
    }
    //can only be access through methods (getters & setters)
    // getters
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

    // to change the private getters of a Car object you use setters
    // setters

    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }


}
