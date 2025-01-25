public class Car {
    //we have defined the fields or characteristics
    private String name;
    private String model;
    private String color;
    private int doors;

    //we now define the constructor were we assign the fields
    
    public Car(String name, String model, String color, int doors){
        this.name=name;
        this.model=model;
        this.color=color;
        this.doors=doors;
    }
    //we now defined some methods
    public void move(){
        System.out.println(this.name+" THE CAR IS MOVING");
    }
    public void stop(){
        System.out.println(this.name+" CAR HAS NOW STOPPED");
    }

    //we define some getters and setters for the fields
    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }
}
