package pe.edu.upeu.sysasisgui.servicio;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysasisgui.modelo.Estudiante;
import java.util.ArrayList;
import java.util.List;

@Service
public class EstudianteServicio {

    public List<Estudiante> estudiantes=new ArrayList<>();

    //crear
    public void save(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    //reporte
    public List<Estudiante> getEntidad() {
        return estudiantes;
    }

    public Estudiante getEntidad(int index) {
        return estudiantes.get(index);
    }

    //update
    public void update(int index,Estudiante estudiante) {
        estudiantes.set(index, estudiante);
    }

    //Delete
    public void Delete(int index) {
        estudiantes.remove(index);
    }

    public void deleteEntidad(Estudiante estudiante) {
        estudiantes.remove(estudiante);
    }


    public void cargarDatos() {
        estudiantes.add(new Estudiante("Pedro Castillo"));
        estudiantes.add(new Estudiante("Maria Castillo"));
        estudiantes.add(new Estudiante("Joseph Castillo"));
        estudiantes.add(new Estudiante("Julia Castillo"));
        estudiantes.add(new Estudiante("Julia Castillo"));
    }
}
