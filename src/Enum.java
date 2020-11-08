public class Enum {
    public enum Day {
        SUNDAY("Domingo"), MONDAY("Lunes"), TUESDAY("Martes"), WEDNESDAY("Miercoles"),
        THURSDAY("Jueves"), FRIDAY("Viernes"), SATURDAY("Sabado");

        private String spanish;

        private Day(String s) {
            spanish = s;
        }

        public String getSpanish(){
            return spanish;
        }
    }

    public static void conditions(){
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are good.");
                break;
            case FRIDAY:
                System.out.println("Fridays are nice");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are the best");
                break;
            default:
                System.out.println("Midweek are so-so");
                break;

        }
    }


}
