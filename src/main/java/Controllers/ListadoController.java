
package Controllers;

import Models.Conexion;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListadoController {
    private JdbcTemplate jdbc;
    
    public ListadoController() {
        Conexion conexion = new Conexion();
        this.jdbc = new JdbcTemplate(conexion.conectar());
    }
    
    @RequestMapping("listado.htm")
    public ModelAndView listado ()
    {
        ModelAndView modelandview = new ModelAndView();
        String consulta= "select * from motores";
        List motores = this.jdbc.queryForList(consulta);
        modelandview.addObject("motores",motores);
        modelandview.setViewName("listado");
        return modelandview;
    }
}
