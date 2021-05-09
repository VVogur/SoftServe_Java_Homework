package homework11;


//1. Write program which stores weekdays in enum and print out every day of week in new line in view:
//        M o N d A y
//        T u E s D a Y
//        ...
//        and so on

public class TaskOneDays {

    enum WeekDay {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }

    public static class Main {
        public static void main(String[] args) {

            print(WeekDay.Monday.toString());
            print(WeekDay.Tuesday.toString());
            print(WeekDay.Wednesday.toString());
            print(WeekDay.Thursday.toString());
            print(WeekDay.Friday.toString());
            print(WeekDay.Saturday.toString());
            print(WeekDay.Sunday.toString());

        }

        private static void print(String strDay) {
            String[] arr = strDay.split("");
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    System.out.print(arr[i].toUpperCase() + " ");
                } else System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
