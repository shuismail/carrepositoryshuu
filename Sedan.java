public class Sedan extends Car {

    private int Length;

    public Sedan(int intSpeed, String color, double regularPrice,int Length) {
        super(intSpeed, color, regularPrice);
        this.Length=Length;
    }

    public double getSalePrice(){
        if(intLength>20){
             return getRegularPrice()*0.05;

        }else{
            return getRegularPrice()*0.1;
        }
        
        
        
        
    }
    
}
