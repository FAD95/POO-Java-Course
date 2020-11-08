import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id = 0;
    String name;
    String email;
    String speciality;




    Doctor(String name){
        id++;
        this.name=name;
        System.out.println("Construyendo el objeto Doctor");
    }

    Doctor( String name, String speciality){
        id++;
        this.name=name;
        this.speciality=speciality;
    }

    // Actions
    public void showDoctor() {
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Speciality: "+speciality);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointment(){
        return availableAppointments;
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){
            this.date=date;
            this.time=time;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
