import java.util.ArrayList;
import java.util.Scanner;

public class Persona {

    public Persona(String dni, String nombre) {
    }

    public static void main(String[] args) {
        Scanner pacientes = new Scanner(System.in);
        ArrayList<Persona> listaPersonas = new ArrayList<>();

        PacientePediatrico chico = new PacientePediatrico();
        chico.Cobertura();
        PacientePediatrico cob = new PacientePediatrico();
        cob.CobertutaOS();
        PacientePediatrico des = new PacientePediatrico();
        des.Descuento();
        PacientePediatrico vede = new PacientePediatrico();
        vede.Vademecum();
        PacientePediatrico Diet = new PacientePediatrico();
        Diet.TipoDeDienta();

        System.out.println("-----------------" );

        Paciente_Adulto.PacienteAdulto cober = new Paciente_Adulto.PacienteAdulto();
        cober.CobertutaOS();
        Paciente_Adulto.PacienteAdulto DEs = new Paciente_Adulto.PacienteAdulto();
        DEs.Descuento();
        Paciente_Adulto.PacienteAdulto vadem = new Paciente_Adulto.PacienteAdulto();
        vadem.Vademecum();
        Paciente_Adulto.PacienteAdulto cobe = new Paciente_Adulto.PacienteAdulto();
        cobe.Cobertura();
        Paciente_Adulto.PacienteAdulto Rx = new Paciente_Adulto.PacienteAdulto();
        Rx.EstudiosRx();
        Paciente_Adulto.PacienteAdulto Sang = new Paciente_Adulto.PacienteAdulto();
        Sang.EstudiosSangre();


    }




}
