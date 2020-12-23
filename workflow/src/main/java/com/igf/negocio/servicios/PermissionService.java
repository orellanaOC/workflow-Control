/**
 * 
 */
package com.igf.negocio.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igf.modelo.Evento;
import com.igf.modelo.Permission;
import com.igf.negocio.repositorio.EventoRepository;
import com.igf.negocio.repositorio.PermissionRepository;

/**
 * @author Pc
 *
 */
@Service
public class PermissionService {
	@Autowired
private PermissionRepository permissionRepository;
	
	/*
	 * Metodo para guardar o actualizar 
	 */
	public Permission save(Permission evento) {
		return this.permissionRepository.save(evento);
	}
	
	/*
	 * Metodo para eliminar 
	 */
	public void delete(Long id) {
		this.permissionRepository.deleteById(id);
	}
	
	/*
	 * Metodo para buscar Evento por ID
	 */
	public Optional<Permission> find(Long id) {
		return this.permissionRepository.findById(id);		
	}
	
	/*
	 * Metodo para listar todos los Eventos
	 */
	public List<Permission> list(){
		return this.permissionRepository.findAll();		
	}
	
	/*
	 * Metodo para saber si el registro existe en la base de datos
	 */
	public boolean exists(Long id) {
		return this.permissionRepository.existsById(id);
	}
}
