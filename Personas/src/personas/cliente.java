/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import java.util.Date;
import java.util.UUID;

/**
 *
 * @author Usuario 1
 */
public class cliente extends Personas{
    
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;

    public cliente(int idCliente, Date fechaRegistro, boolean vip, int idPersona, String nombre, String genero, int edad, String direccion) {
        super(idPersona, nombre, genero, edad, direccion);
        this.idCliente = idCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        
    }

  

  
   

  

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
    
    
    
}
