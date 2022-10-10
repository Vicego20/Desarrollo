package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;/*TRAER OPCIONES DE CONSULTAS Y GUARDADOS CON EL CRUD*/


import com.example.demo.models.entity.Cliente;

public interface iClienteDao extends CrudRepository<Cliente, Long>{/*CONSULTAR LA INFORMACION SIN MOSTRARLA*/

}
