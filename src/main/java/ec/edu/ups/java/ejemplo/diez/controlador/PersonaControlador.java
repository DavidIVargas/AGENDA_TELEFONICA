/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.ejemplo.diez.controlador;

import ec.edu.ups.java.ejemplo.diez.idao.IPersonaDAO;
import ec.edu.ups.java.ejemplo.diez.modelo.Persona;
import java.util.List;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public class PersonaControlador {
    private Persona persona;
    private IPersonaDAO personaDAO;

    public PersonaControlador(IPersonaDAO personaDAO) {        
        this.personaDAO = personaDAO;
    }
    
    public void crear(Persona persona){
        this.persona = persona;
        personaDAO.create(persona);
    }
    
    public Persona buscar(String cedula){
        this.persona = personaDAO.read(cedula);
        return this.persona;
    }
    
    public boolean actualizar(Persona persona){
        Persona personaEncontrada = this.buscar(persona.getCedula());
        if(personaEncontrada != null){
            personaDAO.update(persona);
            return true;
        }
        return false;
    }
    
    public boolean eliminar(String cedula){
        Persona personaEncontrada = this.buscar(cedula);
        if(personaEncontrada != null){
            personaDAO.delete(cedula);
            return true;
        }
        return false;
    }
    
    public List<Persona> listar(){
        return personaDAO.list();
    }
                
}
