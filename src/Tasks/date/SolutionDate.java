package Tasks.date;

public class SolutionDate {


    public static void main(String[] args) {
        RemainingDays date1 = new RemainingDays(2022,0,1,0,0,0);
        RemainingDays date2 = new RemainingDays(2022,3,20,0,0,0);

        RemainingDays.getDifferenceInDays(date1,date2);
        int date = RemainingDays.getDifferenceInDays1(date1,date2);
        System.out.println(date);;


    }



}
