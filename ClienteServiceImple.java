package com.example.demo.model.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.iClienteDao;
import com.example.demo.models.entity.Cliente;

@Service
public class ClienteServiceImple implements IClienteService {/*SE DESARROLLA EL METODO QUE ESTA EN CLIENTESERVICE*/

	@Autowired/*MANTENER CONECTADO PARA REALIZAR MODIFICACIONES*/
	private iClienteDao clienteDao;
	@Override/**/
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		
		return (List<Cliente>) clienteDao.findAll();
	}

}
