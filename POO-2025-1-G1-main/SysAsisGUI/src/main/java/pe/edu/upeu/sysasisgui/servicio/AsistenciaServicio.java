package pe.edu.upeu.sysasisgui.servicio;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysasisgui.modelo.Asistencia;
import java.util.ArrayList;
import java.util.List;

@Service
public class AsistenciaServicio {
    public List<Asistencia> asistencias=new ArrayList<>();

    //create
    public void save(Asistencia dato) {
        asistencias.add(dato);
    }

    //reporte
    public List<Asistencia> getEntidad() {
        return asistencias;
    }

    public Asistencia getEntidad(int index) {
        return asistencias.get(index);
    }

    //update
    public void update(int index,Asistencia dato) {
        asistencias.set(index, dato);
    }

    //Delete
    public void Delete(int index) {
        asistencias.remove(index);
    }

    public void deleteEntidad(Asistencia dato) {
        asistencias.remove(dato);
    }

}
