public class Doctor {
    static int id = 0;
    String name;
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
}
