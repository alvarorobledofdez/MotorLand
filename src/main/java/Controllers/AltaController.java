
package Controllers;

import Models.Conexion;
import Models.Motor;
import Models.ValidarMotor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("alta.htm")
public class AltaController {
    
    private JdbcTemplate jdbc;
    private ValidarMotor validar;
    
    //Creamos el constructor en el cual realizamos la conexion y las validaciones
    public AltaController(){
        Conexion conexion  =new Conexion();
        this.jdbc = new JdbcTemplate(conexion.conectar());
        this.validar = new ValidarMotor();
    }
    
    //Aqui hacemos un metodo get para llamar a la pagina y cargar los datos en blanco del motor
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView altaMotor(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("alta");
        modelAndView.addObject("motor", new Motor());
        return modelAndView;
    }
    
    //Aqui enviamos los datos introducidos por el usuario mediante el metodo post y creamos el motor en al base de datos
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView altaMotor(@ModelAttribute("motor") Motor motor, BindingResult result){
        this.validar.validate(motor, result);
        
        if(result.hasErrors()){
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("alta");
            modelAndView.addObject("motor", new Motor());
            return modelAndView;
        } else {
            this.jdbc.update("insert into motores(modelo, fabricante, potencia, peso, cantidad) values (?,?,?,?,?)", 
                    motor.getModelo(), motor.getFabricante(), motor.getPotencia(), motor.getPeso(), motor.getCantidad());
            return new ModelAndView("redirect:/listado.htm");
        }
    }
}
