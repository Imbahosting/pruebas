/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.SessionScoped;
import modelo.util.JSFUtil;


/**
 *
 * @author Imbahosting
 */
@ManagedBean
@SessionScoped
public class controladorprueba
{
    private List<String> nombres;
    public String nombre;
    public List<Object> nombreslistas;
    public String estado="refresh";
  

    public controladorprueba() {
   
    nombres=new ArrayList<>();
     nombreslistas= new ArrayList<>();
   
    }
    public void activar()
    {
        estado="refresh";
    }
    public void desactivar()
    {
        estado="#";
    }

    
    
    public void ingresarnombre()
    {
      
        nombres.add(nombre);
      
        JSFUtil.crearMensajeINFO("ingresado"+nombre);
    }
    public void crearlista()
    {
        nombreslistas.add(nombres);
    }
   
    public String  crearnueva()
    {
        crearlista();
      nombres= new ArrayList<>();
       
       
       return "index";
     
    }
    public void obtenerregistro()
    {
     JSFUtil.crearMensajeINFO(""+nombreslistas.get(0));
    }

    public List<String> getNombres() {
        return nombres;
    }

    public void setNombres(List<String> nombres) {
        this.nombres = nombres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Object> getNombreslistas() {
        return nombreslistas;
    }

    public void setNombreslistas(List<Object> nombreslistas) {
        this.nombreslistas = nombreslistas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String mensajePaulina(){
        String res="Hola hola este es mi msj soy Paulina";
        return res;
    }
    
}
