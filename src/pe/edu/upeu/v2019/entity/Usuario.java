/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.v2019.entity;

/**
 *
 * @author alum.fial1
 */
public class Usuario {
    private int idusuario;
    private int idrol;
    private int idpersona;
    private int estado;
    private String clave;
    private String nom_user;
	public Usuario(int idusuario, int estado) {
		this.idusuario = idusuario;
		this.estado = estado;
	}
	public Usuario() {

	}
	public Usuario(int idusuario, int idrol, int idpersona, int estado, String clave, String nom_user) {
		this.idusuario = idusuario;
		this.idrol = idrol;
		this.idpersona = idpersona;
		this.estado = estado;
		this.clave = clave;
		this.nom_user = nom_user;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public int getIdrol() {
		return idrol;
	}
	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}
	public int getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNom_user() {
		return nom_user;
	}
	public void setNom_user(String nom_user) {
		this.nom_user = nom_user;
	}
	
}
