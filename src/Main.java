import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Fad", "Neuro");
        doctor1.showDoctor();

        Patient patient = new Patient("Florez", "florez@mail.com");
        patient.showPatient();

        showMenu();
    }
}
