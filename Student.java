public class Student {
    public static void main(String[] args){
        System.out.println("TODAY IS A WONDERFUL DAY THE LORD HAS GIVEN US");
    }
}

//THIS IS THE PARENT CLASS
class MainStudent{
    //ATTRIBUTES
    private int studentID;
    private String name;
    private String program;

    //CONSTRUCTOR
    public MainStudent(int studentID, String name, String program){
        this.studentID = studentID;
        this.name = name;
        this.program = program;
    }
    //THESE ARE SOME METHODS
    public void offered(){
        System.out.println("CONGRATULATIONS "+this.name+" YOU HAVE BEEN OFFERED AN INTERNSHIP AT THE BANK OF ZAMBIA AS A SOFTWARE ENGINEER");
    }
    public void registered(){
        System.out.println("NAME: "+ name);
        System.out.println("STUDENT ID: "+ studentID);
        System.out.println("PROGRAM: "+this.program);
    }

    //SINCE OUR ATTRIBUTES ARE PRIVATE THEY CANNOT BE ACCESSED OUTSIDE THE CLASS
    //BUT WE CAN CREATE GETTERS AND SETTERS TO ENABLE OUSIDE OF CLASS ACCESS

    //GETTERS AND SETTERS FOR STUDENTID ATTRIBUTE
    public int getStudentId(){
        return this.studentID;
    }
    public void setStudentId(int studID){
        studentID=studID;
    }

    //GETTER AND SETTER FOR NAME ATTRIBUTE
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    //GETTER AND SETTER FOR PROGRAM ATTRIBUTE
    public void setProgram(String myprogram){
        program=myprogram;
    }
    public String getProgram(){
        return program;
    }
}

//CLASS FOR UNDERGRADUATE STUDENTS
class UnderGraduate{
    //ATTRIBUTES 
    private String modeOfStudy;
    private int yearOfStudy;
    private int courses;
    //CONSTRUCTOR
    public UnderGraduate(String modeOfStudy, int yearOfStudy, int courses){
        this.modeOfStudy = modeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.courses = courses;
    }
}

class PostGraduate{
    private String category;
    private String project;
    //CONSTRUCTOR
    public PostGraduate(String category, String project){
        this.category = category;
        this.project = project;
    }
}
