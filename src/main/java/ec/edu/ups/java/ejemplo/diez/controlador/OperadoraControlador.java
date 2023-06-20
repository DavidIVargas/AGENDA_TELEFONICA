package ec.edu.ups.java.ejemplo.diez.controlador;

import ec.edu.ups.java.ejemplo.diez.idao.IOperadoraDAO;
import ec.edu.ups.java.ejemplo.diez.modelo.Operadora;
import java.util.List;

public class OperadoraControlador {

    private Operadora operadora;
    private IOperadoraDAO operadoraDAO;

    public OperadoraControlador(IOperadoraDAO operadoraDAO) {
        this.operadoraDAO = operadoraDAO;
    }

    public void crear(Operadora operadora) {
        this.operadora = operadora;
        operadoraDAO.create(operadora);
    }

    public Operadora buscarOperadora(String codigo) {
        int codigoInt = Integer.parseInt(codigo);
        this.operadora = operadoraDAO.read(codigoInt);
        return this.operadora;
    }

    public boolean actualizarOperadora(String codigo, String nombre) {
        Operadora operadoraEncontrada = buscarOperadora(codigo);
        if (operadoraEncontrada != null) {
            operadoraEncontrada.setNombre(nombre);
            operadoraDAO.update(operadoraEncontrada);
            return true;
        }
        return false;
    }

    public boolean eliminarOperadora(String codigo) {
        Operadora operadoraEncontrada = buscarOperadora(codigo);
        if (operadoraEncontrada != null) {
            operadoraDAO.delete(Integer.parseInt(codigo));
            return true;
        }
        return false;
    }

    public List<Operadora> listar() {
        return operadoraDAO.list();
    }
}
