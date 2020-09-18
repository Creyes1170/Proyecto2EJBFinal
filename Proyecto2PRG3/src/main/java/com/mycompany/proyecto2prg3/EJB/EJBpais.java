/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.proyecto2prg3.EJB;

import com.mycompany.proyecto2prg3.entidades.Pais;
import com.mycompany.proyecto2prg3.services.PaisFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Named("paisBean")
@RequestScoped
public class EJBpais implements Serializable{

    @EJB
    private PaisFacadeLocal paisFacade;
    private Pais newproduct;
    
    public EJBpais () {
        
    }
    
    
    public Pais getNewproduct() {
        if(newproduct==null){
        
            newproduct = new Pais();           
        }
        return newproduct;
    }

      public void setNewproduct(Pais newproduct) {
        this.newproduct = newproduct;
    } 
     
      public List<Pais>getPais(){
        return this.paisFacade.findAll();
    }
    
    
    
    public void crear(){
        this.paisFacade.create(newproduct);
    }
    public void borrar(Pais pais){
        this.paisFacade.remove(pais);
    }
    public void Update(Pais pais){
        this.paisFacade.edit(pais);
    }
 
}
