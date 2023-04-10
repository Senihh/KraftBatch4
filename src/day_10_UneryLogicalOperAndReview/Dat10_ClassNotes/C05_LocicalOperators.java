package day_10_UneryLogicalOperAndReview.Dat10_ClassNotes;

public class C05_LocicalOperators {
    public static void main(String[]args){
      /*  String name= "Ayşe ";
        int age=34;
        String citizen="Turkey";

        //18+,Turkish

        boolean isEligibleVote= age>=18 && citizen=="Turkey";
        System.out.println(name+ " is eligible to vote: "+ isEligibleVote);

        System.out.println("...........................");

     /*   String name2="Ümit";
        int findexScore=1800;
        int age2=43;
        int income=40000;

        boolean isEligibleForLoan= findexScore>=1500  && age2>=18  && income>30000;

        System.out.println(name2+ " is elgible for loan: "+ isEligibleForLoan);


        System.out.println("..........................");

        String name3="Hatice";
        int age3=21;
        char gender= "F";  //Famale,Male

        boolean isEligible= age>=18 && (gender == "M" || gender == "F");
        
*/
        String name="Ayşe";
        int age=34;
        String citrizen="Turkey";

        boolean isElibibleVote= age>18 && citrizen=="Turkey";

        System.out.println(name+" is eligible to vote: "+ isElibibleVote);


        String name2="Ümit";
        int findexScore=1800;
        int age2=43;
        int income=40000;

        boolean isEligibleForLoan= findexScore>=1500  && age2>=18  && income>30000;

        System.out.println(name2+ " is elgible for loan: "+ isEligibleForLoan);


       System.out.println("..........................");

        String name3="Hatice";
        int age3=21;
        char gender= 'F';  //Famale,Male

        boolean isEligible= age3>=18 && (gender == 'M' || gender == 'F');

        System.out.println(name3+" is elibible to be selected as MP: "+ isEligible );



    }
}
