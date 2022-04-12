package day37_Inheritance_SuperKeyword.EmployeeTask;

public class AmazonInc {
    public static void main(String[] args) {
        String company="Amaozon Inc";
        
        ProductOwner PO= new ProductOwner("Suhaib",29,'M',1,160000,company);
        
        BusinessAnalyst BA =new BusinessAnalyst("Cihad",30,'M', 2, 150000, company);
        
        ScrumMaster SM = new ScrumMaster("Anel", 26,'F',3, 145000, company);

       Tester tester1 = new Tester("Layan", 11, 'F', "QA",1415,110000,company );
       Tester tester2=new Tester("Ali",43,'M', "QE",1416,120000,company );
       Tester tester3=new Tester("Alex",44,'M', "SDET",1417,130000,company );
       Tester tester4= new Tester("Lala", 23,'F', "QA",1418,140000,company );

       Tester[] testers= {tester1, tester2, tester3, tester4};

       Developer developer1 = new Developer("Olga", 22, 'F', "Java Developer",1420,150000,company );


       Developer[] developers={developer1};

       ScrumTeam scrumTeam=new ScrumTeam(PO, BA, SM);
       scrumTeam.addDeveloper(developer1);
       scrumTeam.addTester(testers);

        System.out.println(scrumTeam);

        for(Developer developer:scrumTeam.developers){
            System.out.println(developer.name+" + "+developer.salary);
        }
        
        
    }
}
