public class Istudent {
    private String name;
    private int age;
    private char grade;

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public char getGrade(){
        return grade;
    }
    public void setGrade(char newGrade){
        grade = newGrade;
    }
    public void displayInfo(){
        System.out.println( "name of the student:"+" "+name +" "+"age:" +" "+age +" "+"grade:"+grade);
    }

}
