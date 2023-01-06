public class Ford extends Car {
    private int intYear;
    private int Manufacturer;

    public Ford(int intSpeed, String color, double regularPrice,int intYear,int Manufacturer) {
        super(intSpeed, color, regularPrice);
        this.intYear=intYear;
        this.Manufacturer=Manufacturer;
    }

    public double getSalePrice(){
        return getRegularPrice()-Manufacturer;
    }
    


    
}
