package DAY09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {
        int n1=58;
        int n2=84;
        if (n1<n2){
            System.out.println(n1+" is minimum");
        }
        if(n2<n1){
            System.out.println(n2+" is minimum");
        }
        if (n1==n2){
            System.out.println("equal");
        }

    }
}
