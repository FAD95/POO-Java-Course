import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Fad", "Neuro");
        doctor1.showDoctor();

        doctor1.addAvailableAppointment(new Date(), "4pm");
        doctor1.addAvailableAppointment(new Date(), "6pm");
        doctor1.addAvailableAppointment(new Date(), "2pm");

        for (Doctor.AvailableAppointment aA: doctor1.getAvailableAppointment()) {
            System.out.println(aA.getDate() + " "+aA.getTime());
        }

        Doctor doctor2 = new Doctor("Felipe");
        doctor2.showDoctor();

        Patient patient = new Patient("Florez", "florez@mail.com");
        patient.showPatient();

        //showMenu();
    }
}
