
package Models;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


public class ValidarMotor implements Validator{

    @Override
    public boolean supports(Class<?> type) {
        return Motor.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Motor motor = (Motor) o;
        
        if(motor.getModelo().length() != 5){
            errors.rejectValue("modelo", "verificaModelo", "El modelo debe tener 5 caracteres");
        }
        
        if(motor.getPeso() == 0){
            errors.rejectValue("peso", "verificaPeso", "El peso no puede ser 0");
        }
        
        if(motor.getPotencia() == 0){
            errors.rejectValue("potencia", "verificaPotencia", "La potencia no puede ser 0");
        }
        
        if(motor.getCantidad() < 0){
            errors.rejectValue("cantidad", "verificaCantidad", "La cantidad no puede ser menor que 0");
        }
    }
    
}
