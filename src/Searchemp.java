import java.sql.*;
import java.util.Scanner;

public class Searchemp {
    String url = "jdbc:mysql://localhost:3306/employeeData";
    String user = "root";
    String password = "GSUsx?!25d";

class GetInputFromUser {
    public static void main(String args[])
    {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        String s = in.nextLine();
        System.out.println("You entered string " + s);
    }
    {SELECT CONCAT(Fname, ' ', Lname) AS Full_Name, SSN, empid, Fname, Lname,
    FROM your_table_name
    WHERE SSN = @s
    OR EMPID = @s
    OR FNAME = @s
    OR LNAME = @s;
    }

//Search for an employee using name, SSN, empid to show their information
// show option payroll information/general emplyee info/ both
// take input both name, SSN, empid 



    public StringBuilder getSearch(int empID, Connection myConn) {
        StringBuilder output = new StringBuilder("");
        String sqlcommand = "SELECT * FROM table employees WHERE empID = 's' OR SSN='s' OR Fname +Lname = 's'";


        while (Searchemp.next()) {
            int id = Searchemp.getInt("ID");
            String name = Searchemp.getString("Name");
            // Print other columns as needed
            //if columns from general employee info 
            System.out.println("ID: " + id + ", Name: " + Fname + Lname + "Email:"+ email+ "Hire date: " + hiredate+ "Salary:"+ salary + "Job Title:" + job_title +" Job ID:" + Jobtitle +
            "Addess:"+ addressLine1 + addressLine2 + city + state + country + postal_Code)
            //colums for payroll info 
            System.out.printl(" pay_date:"+ paydate + "Earnings" + earnings + "fed_tax" , fed_med, fed_ss, state_tax, retire_401k, healthcare ')
            
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}
    }
        
        //ERROR MESSAGE
            return output;
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
            return output; // Return empty StringBuilder in case of error
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return output; // Return empty StringBuilder in case of error
        }
    }
}
