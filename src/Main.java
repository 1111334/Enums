
public class Main {
    public static void main(String[] args) {

        for (Month month : Month.values()) {
            String monthName = month.toString();

            if (monthName.endsWith("y")) {
                System.out.println(monthName + " ends with y");

            } else if (monthName.endsWith("Y")) {
                System.out.println(monthName + " doesn't end with y");
            } else {
                System.out.println(monthName + " ends neither with y nor with Y");
            }
        }

    }
}