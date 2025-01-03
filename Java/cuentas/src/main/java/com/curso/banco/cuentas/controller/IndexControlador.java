package com.curso.banco.cuentas.controller;

import com.curso.banco.cuentas.model.Account;
import com.curso.banco.cuentas.service.AccountServiceImp;
import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.primefaces.PrimeFaces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@ViewScoped
public class IndexControlador {

    @Autowired
    AccountServiceImp accountServiceImp;

    private List<Account> cuentas;
    private Account cuentaSeleccionada;

    private static final Logger logger = LoggerFactory.getLogger(IndexControlador.class);

    @PostConstruct
    public void init(){
            this.cargarCuentas();
    }

    public void cargarCuentas(){
        this.cuentas = accountServiceImp.findAll();
        cuentas.forEach((account) -> logger.info(account.toString()));
    }

    public void agregarCuenta(){
        this.cuentaSeleccionada = new Account();
    }

    public void guardarCuenta(){

        logger.info("Cuenta a guardar" +  this.cuentaSeleccionada);
        if(this.cuentaSeleccionada.getIdCuenta() == null){
            this.accountServiceImp.saveAccount(this.cuentaSeleccionada);
            this.cuentas.add(this.cuentaSeleccionada);
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Cuenta Agregada"));
        }else{
            this.accountServiceImp.saveAccount(this.cuentaSeleccionada);
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Cuenta Actualizada"));
        }
        PrimeFaces.current().executeScript("PF('ventanaModalCuenta').hide()");
        PrimeFaces.current().ajax().update("forma-cuentas:mensajes","forma-cuentas:cuentas-tabla");

    }

    public void eliminarCuenta(){
        logger.info("Cuenta a Eliminar" + this.cuentaSeleccionada);
        if(this.cuentaSeleccionada.getIdCuenta() != null){
            this.accountServiceImp.deleteAccount(this.cuentaSeleccionada);
            this.cuentas.remove(this.cuentaSeleccionada);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cuenta Eliminada"));
            this.cuentaSeleccionada = null;
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Seleccione una Cuenta Eliminar"));
        }
        PrimeFaces.current().ajax().update("forma-cuentas:mensajes","forma-cuentas:cuentas-tabla");


    }
}
