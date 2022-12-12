package com.porfolio.mgb.Interface;
import com.porfolio.mgb.Entity.Persona;
import java.util.List;

public interface IPersonaService {
   //traer una lista persona
    public List<Persona> getPersona();
    //Guardar un Objeto de tipo persona
    public void savePersona(Persona persona);
    //Eliminar un Usuario pero por Id
    public void deletePersona(Long id);
    //buscar una persona
    public Persona findPersona(Long id);
}
