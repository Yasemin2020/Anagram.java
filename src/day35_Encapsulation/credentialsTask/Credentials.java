package day35_Encapsulation.credentialsTask;

public class Credentials {
    private String username, password;

    public boolean isStrongPassword(String password){

        String ch="";
        String letter="";
        String digit="";

        for (char each : password.toCharArray()) {
           if ( Character.isLetter(each)){
               letter+=each;
           }else if(Character.isDigit(each)){
               digit+=each;
           }else {
               if (each!=' ')
                   ch+=each;
               }

           }
        return password.length()>=8 && letter.length()>0 && digit.length()>0 && ch.length()>0;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(!(isStrongPassword(password))){
            System.out.println("Your new password should have at least have 8 characters long, and should not contain space\n" +
                    "                             at least contain one letter\n" +
                    "                             at least contain one special characters\n" +
                    "                             at least contain a digit ");
            System.exit(0);
        }
        this.password = password;
    }

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

/*
 create a class named Credentials
            Variables:
                username, password

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password

                toString():

            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)
 */