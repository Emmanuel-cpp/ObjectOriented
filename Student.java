public class Student {
    public static void main(String[] args){
        System.out.println("TODAY IS A WONDERFUL DAY THE LORD HAS GIVEN US");

        //MainStudent object1MainStudent = new MainStudent(22107671, "Emmanuel Siamoonga", "COMPUTER SCIENCE");
        //object1MainStudent.offered();
        //object1MainStudent.registered();
        UnderGraduate undergrad = new UnderGraduate("FULLTIME",3, 7, 22107671, "JOEL CHABOTA", "AVIATION");
        undergrad.offered();
        System.out.println(String.format("DEAR %s YOU ARE UNDERGRADE ID IS %d, YEAR %d NO COURSES %d ",undergrad.getName(), undergrad.getStudentId(), undergrad.getYear(), undergrad.getCourse()));
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
        System.out.println("CONGRATULATIONS "+this.name.toUpperCase()+" YOU HAVE BEEN OFFERED AN INTERNSHIP AT THE BANK OF ZAMBIA AS A SOFTWARE ENGINEER");
    }
    public void registered(){
        System.out.println("NAME: "+ name.toUpperCase());
        System.out.println("STUDENT ID: "+ studentID);
        System.out.println("PROGRAM: "+this.program.toUpperCase());
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
class UnderGraduate extends MainStudent{
    //ATTRIBUTES 
    private String modeOfStudy;
    private int yearOfStudy;
    private int courses;
    //CONSTRUCTOR
    public UnderGraduate(String modeOfStudy, int yearOfStudy, int courses, int studentID, String name, String program){
        super(studentID, name, program);
        this.modeOfStudy = modeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.courses = courses;
    }
    public void setCourse(int mycourse){
        courses = mycourse;
    }
    public int getCourse(){
        return courses;
    }

    public void setYear(int year){
        this.yearOfStudy = year;
    }
    public int getYear(){
        return yearOfStudy;
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
