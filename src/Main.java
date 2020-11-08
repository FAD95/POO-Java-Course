import static ui.UIMenu.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Fad", "f@d");

        doctor1.addAvailableAppointment(new Date(), "4pm");
        doctor1.addAvailableAppointment(new Date(), "6pm");
        doctor1.addAvailableAppointment(new Date(), "2pm");

        for (Doctor.AvailableAppointment aA: doctor1.getAvailableAppointment()) {
            System.out.println(aA.getDate() + " "+aA.getTime());
        }

        Doctor doctor2 = new Doctor("Felipe","f@o");

        Patient patient = new Patient("Florez", "florez@mail.com");
        patient.showPatient();

        System.out.println(Enum.Day.MONDAY);
        Enum.conditions();

        //showMenu();
    }
}
