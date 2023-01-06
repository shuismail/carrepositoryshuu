public class MyOwnAutoShop {

    public static void main(String[] args) {
        Sedan chuu= new Sedan(10, "blue", 12500, 13);
        Ford chuu1=new Ford(20, "white", 2532, 5, 6500);
        Ford chuu2=new Ford(10, "grey", 350, 3, 6700);
        Car chu=new Car(12, "red", 2600);

        System.out.println("Sedan Sales Price: "+chuu.getSalePrice());
        System.out.println("Ford sales : "+chuu1.getSalePrice());
        System.out.println("Ford 2 sales :"+chuu2.getSalePrice());
        System.out.println("Car Sales Price are: "+chu.getSalePrice());

    }
    
}
