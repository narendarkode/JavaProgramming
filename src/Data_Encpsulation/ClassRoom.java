package Data_Encpsulation;

public class ClassRoom {

     private String subject;
   private int studentCount;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public void DisplayDetails(){
        System.out.println("This is a "+ subject + "class room with " + studentCount + "Students");
    }

    //


}
