public class Main {

    public int concat(int a){

        if(a>2)
            System.out.println(a);

        return a;

    }

    public String concat1(int year){

        String days;

        if (year % 400 == 0) {
            System.out.println("Количество дней 366");
            days = "Количество дней 366";
        }
        else if ( year % 100 == 0) {
            System.out.println("Количество дней 365");
            days = "Количество дней 365";
        }
        else if (year % 4 == 0){
            System.out.println("Количество дней 366");
            days = "Количество дней 366";
        }
        else {
            System.out.println("Количество дней 365");
            days = "Количество дней 365";
        }
        return days;
    }

    public String concat2(int a){

        String b;

        if(a % 2 == 0)
            b = "Четное число";

        else
            b = "Не Четное число";

        return b;
    }

}
