package university;
public class course {
    String coursename;
    String instructor;
    int numstudent;
    
    course( String coursenameRe, String instructorRe, int numstudentRe){
      coursename = coursenameRe;
      instructor = instructorRe;
      numstudent = numstudentRe;

    }
    public String getcoursename(){
    return coursename;
    }
    public void setcoursename(String newcorsename){
    }
    

    public String getinstructor(){
    return instructor;
    }
    public void setinstructor(String newinstructor){
    }


    public int getnumstudent(){
    return numstudent;
    }
    public void setnumstudent(String newnumstudent){
    }

@Override
public String toString(){
    return " course name " + coursename +" instructor "+ instructor +" number of students "+ numstudent;
}

    public static void main(String[] args) {
        course prog = new course ("prog","Haya",35);
        System.out.println(prog);
    }
}





