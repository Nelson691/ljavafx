package pe.edu.upeu.sysasisgui.control;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pe.edu.upeu.sysasisgui.modelo.Asistencia;
import pe.edu.upeu.sysasisgui.modelo.Estudiante;
import pe.edu.upeu.sysasisgui.servicio.EstudianteServicio;

import java.awt.*;

@Controller
public class AsistenciaControl {

@FXML
    private Button btnGuardar;
@FXML
    private TableView<Estudiante> tableRegAsis;
@FXML
    private TableView<Asistencia> tableListaAsis;

@Autowired
private EstudianteServicio estudianteServicio;
private Estudiante estudiante;
@FXML
    private void initialize() {
    
}


}
