
package Controllers;

import Models.Conexion;
import Models.ValidarMotor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("alta.htm")
public class AltaController {
    
    private JdbcTemplate jdbc;
    private ValidarMotor validar;
    
    public AltaController(){
        Conexion conexion  =new Conexion();
        this.jdbc = new JdbcTemplate(conexion.conectar());
        this.validar = new ValidarMotor();
    }
    
}
