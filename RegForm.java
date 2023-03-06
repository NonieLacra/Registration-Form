
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegForm {


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        UserDetails userDetails = new UserDetails();

       while(true)
       {

           System.out.println("Please enter your Firstname");
           String Fname = input.nextLine();
           userDetails.setFname(Fname);

           int Fname_length = userDetails.getFname().length();



           Pattern pattern_fname = Pattern.compile("[^a-zA-Z]+");
           Matcher matcher_fname = pattern_fname.matcher(Fname);
           boolean fname_match = matcher_fname.find();

           if (Fname_length > 50 || Fname_length < 2)
           {
               System.out.println("Please enter 1-50 characters only, Try it again.");

           }
           else if (fname_match)
           {
               System.out.println("Please enter letters only, Try it again.");

           }
           else
           {
               break;
           }

       }

       while(true)
       {


           System.out.println("Please enter your Lastname");
           String Lname = input.nextLine();
           userDetails.setLname(Lname);

           int Lname_length = userDetails.getLname().length();

           Pattern pattern_lname = Pattern.compile("[^a-zA-Z]+");
           Matcher matcher_lname = pattern_lname.matcher(Lname);
           boolean lname_match = matcher_lname.find();

           if (Lname_length > 50 || Lname_length < 2)
           {
               System.out.println("Please enter 1-50 characters only, Try it again.");

           }
           else if (lname_match)
           {
               System.out.println("Please enter letters only, Try it again.");
           }
           else
           {
               break;
           }
       }

      while(true)
      {

          try {
              System.out.println("Please enter your Birthday (format: yyyy/mm/dd)");
              String Bday = input.nextLine();
              userDetails.setBday(Bday);

              Pattern pattern_bday = Pattern.compile("^((19|20)\\d\\d)/(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])$");
//          Pattern pattern_bday = Pattern.compile("[19|20]+[0-9]+[0-9]+/+[0|1]+[0-9]+/+[0-9]+[0-9]");
              Matcher matcher_bday = pattern_bday.matcher(Bday);
              boolean bday_match = matcher_bday.find();


              String Year = Bday.substring(0, 4);
              int Age = Integer.parseInt(Year);
              int Final_Age = 2023 - Age;


              if (!bday_match) {
                  System.out.println("Please enter the correct format, Try again.");
              } else if (Final_Age <= 17) {
                  System.out.println("Your birthday shows that you are under 18, Please Try again.");
              } else {
                  break;
              }
          }
          catch(Exception e)
          {
              System.out.println("Please enter the correct format, Try again.");
          }
      }


      while(true) {
          System.out.println("Please enter your Course");
          String Course = input.nextLine();
          userDetails.setCourse(Course);

          int Course_length = userDetails.getCourse().length();

          Pattern pattern_course = Pattern.compile("[^a-zA-Z]+");
          Matcher matcher_course = pattern_course.matcher(Course);
          boolean course_match = matcher_course.find();

          if (Course_length > 50 || Course_length < 1) {
              System.out.println("Please enter 1-50 characters only, Try again.");
          } else if (course_match) {
              System.out.println("Please enter letters only, Try again.");
          } else {
              break;
          }


      }
        while(true) {
            System.out.println("Please enter your Email");
            String Email = input.nextLine();
            userDetails.setEmail(Email);

            Pattern pattern_email = Pattern.compile("^[a-zA-Z0-9_!#$%&amp;'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
            Matcher matcher_email = pattern_email.matcher(Email);
            boolean email_match = matcher_email.find();

            if (!email_match) {
                System.out.println("Please enter your email in correct format, Try again.");
            } else {
                break;
            }

        }

        String Year = userDetails.getBday().substring(0,4);
        String Month = userDetails.getBday().substring(8, 10);
        String First_Letter = userDetails.getLname().substring(0, 1);

        System.out.println("=============================================");
        System.out.println("Firstname: " + userDetails.getFname());
        System.out.println("Lastname: " + userDetails.getLname());
        System.out.println("Birthday: " + userDetails.getBday());
        System.out.println("Course: " + userDetails.getCourse());
        System.out.println("Email: " + userDetails.getEmail());

        System.out.println("Student Number: " + Year + "-" + Month + "01-" + First_Letter);

    }

}
