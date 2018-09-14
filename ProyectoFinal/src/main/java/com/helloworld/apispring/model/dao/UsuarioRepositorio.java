/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helloworld.apispring.model.dao;

import com.helloworld.apispring.model.entity.Reserva;
import com.helloworld.apispring.model.entity.Usuario;
import com.helloworld.apispring.model.entity.Viaje;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UsuarioRepositorio {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public SessionFactory getSessionFactory()
    {
         return sessionFactory;
    }
    
    public void getSessionFactory (SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    
    public List<Usuario> obtenerAllUsuarios()
    {
        Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Usuario.class); 
        return criteria.list(); 
    }
    
    public List<Reserva> obtenerAllReservas()
    {
        Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Reserva.class); 
        return criteria.list(); 
    }
    
    public List<Viaje> obtenerAllViajes()
    {
        Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Viaje.class); 
        return criteria.list(); 
    }
    
    
}
