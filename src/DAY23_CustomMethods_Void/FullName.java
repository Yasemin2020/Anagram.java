package DAY23_CustomMethods_Void;

public class FullName {
    public static void main(String[] args) {
        fullName("YasEMİn","ESki");
    }
    public static void fullName(String name,String surname){
        name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();

        surname=surname.substring(0,1).toUpperCase()+surname.substring(1).toLowerCase();;

        System.out.println(name+" "+surname);
    }
    /*
    16.  write a method that can print out the full name of a person in
regular format
ex:
fullName("cYdEo", "SCHOOL");
output:
"Cydeo School"
     */
}
