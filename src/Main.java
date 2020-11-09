import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Fad", "f@d");
        doctor1.showDataUser();

        doctor1.addAvailableAppointment(new Date(), "4pm");
        doctor1.addAvailableAppointment(new Date(), "6pm");
        doctor1.addAvailableAppointment(new Date(), "2pm");
        System.out.println(doctor1);

        Patient patient = new Patient("Florez", "florez@mail.com");
        System.out.println(patient);

        //showMenu();
    }
}
