public class PracticeProblems {
    //variable initiation
    static String day = "Thursday";
    static int date = 21;
    static String month = "November";
    static int year = 2020;

    public static void main(String[] args){
        //variable checking
        System.out.println(day);
        System.out.println(date);
        System.out.println(month);
        System.out.println(year);

        //American format date
        System.out.println("American format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);

        //European format date
        System.out.println("European format:");
        System.out.println(day+" " + date+" " + " "+ month +" " + " "+ year);
    }
}
