public class UserDetails {
    private String Fname;
    private String Lname;
    private String Bday;
    private String Course;
    private String Year;
    private String Month;
    private String Email;
    private String First_Letter;

//    public UserDetails(String Fname, String Lname, String Bday, String Course, String Year, String Month, String Email, String First_Letter) {
//        this.Fname = Fname;
//        this.Lname = Lname;
//        this.Bday = Bday;
//        this.Course = Course;
//        this.Year = Year;
//        this.Month = Month;
//        this.Email = Email;
//        this.First_Letter = First_Letter;
//    }


    public String getFname()
    {
        return Fname;
    }

    public void setFname(String Fname)
    {
        this.Fname = Fname;
    }

    public String getLname()
    {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public String getBday()
    {
        return Bday;
    }

    public void setBday(String Bday)
    {
        this.Bday = Bday;
    }

    public String getCourse()
    {
        return Course;
    }

    public void setCourse(String Course)
    {
        this.Course = Course;
    }

    public String getEmail()
    {
        return Email;
    }

    public void setEmail(String Email)
    {
        this.Email = Email;
    }


}