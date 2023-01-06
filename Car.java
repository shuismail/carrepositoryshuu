public class Car{
    private int Speed;
    private String color;
    private double regularPrice;

    public Car(int Speed,String color,double regularPrice){
        this.Speed=Speed;
        this.color=color;
        this.regularPrice=regularPrice;
    }

    public int getSpeed(){
        return Speed;
    }

    public String getColor(){
        return color;
    }
    
    public double getRegularPrice(){
        return regularPrice;
    }

    public double getSalePrice(){
        return regularPrice;
    }

}