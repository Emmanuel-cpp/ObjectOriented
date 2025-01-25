public class App {
    public static void main(String[] args) {
        //LET US NOW CREATE AN INSTANCE OF THE CLASS CAR HERE IN THE MAIN
        Car motoka = new Car("Vanguard","Toyota","White",5);
        Car motoka2 = new Car("LandCruiser", "Toyota", "Green", 4);

        System.out.println(motoka.getName());
        System.out.println(motoka.getModel());
        System.out.println(motoka.getColor());
        System.out.println(motoka.getDoors());

        System.out.println(motoka2.getName());
        System.out.println(motoka2.getModel());
        System.out.println(motoka2.getColor());
        System.out.println(motoka2.getDoors());



    }
}
