package OOP.Inheritance.PrivateMember;

public class Teacher1 extends Person1 {
    private String qualification;
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    public String getQualification() {
        return qualification;
    }
    void display(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQualification());
    }

}
