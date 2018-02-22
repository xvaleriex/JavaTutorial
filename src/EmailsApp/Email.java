package EmailsApp;

public class Email {
    private String email;
    private String firstname;
    private String lastname;
    private String department;
    private String password;
    private int capacity;
    private String alternateEmail;

    //setters
    public void setFirstname(String newName)
    {
        this.firstname = newName;
    }
    public void setLastname(String newName)
    {
        this.lastname = newName;
    }

    public void setDepartment(int c)
    {
        String[] depArray = {"Sales" , "Development", "Accounting"};
        for (int i = 0; i < depArray.length ; i++){
            if (i == c){ this.department = depArray[i]; break;}
        }
    }

    public void setCapacity(int newCapacity)
    {
        this.capacity = newCapacity;
    }

    public void setAlternateEmail(String newEmail)
    {
        this.alternateEmail = newEmail;
    }

    //getters
    public String getEmail()
    {
        return this.email;
    }

    public String getDepartment()
    {
        return this.department;
    }

    public String getName()
    {
        return this.firstname = this.firstname + " " + this.lastname;
    }

    public int getCapacity()
    {
        return this.capacity;
    }

    //generating
    public String generateEmail()
    {
        String dep = getDepartment();
        this.email = this.firstname + "." + this.lastname + "@" + dep + "." + "certicon.cz";
        return email;
    }

    public String generatePassword(int length)
    {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        char[] password = new char[length];
        for (int i=0; i<length; i++)
        {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String (password);
    }
}
