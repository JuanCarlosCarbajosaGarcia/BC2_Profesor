public class TestProfesor {
    public static void main(String[] args) {
        Profesor p1 = new Profesor("javier",1200.28,"Informatica");
        p1.mostrarInformacion();

        try {
            p1.setSalario(0);
            System.out.println(p1);
        }catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
