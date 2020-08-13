package com.ibformation.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.ibformation.bo.Role;

@Repository
public class RoleDaoImp implements RoleDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Optional<Role> find(Integer id) {
		return Optional.of(em.find(Role.class, id));
	}

	@Override
	public List<Role> findAll() {
		return (List<Role>) em.createQuery("from Role").getResultList();
	}

	@Override
	public boolean save(Role o) {
		em.persist(o);
		return false;
	}

	@Override
	public boolean update(Role o) {
		em.merge(o);
		return false;
	}

	@Override
	public boolean delete(Role o) {
		em.remove(o);
		return false;
	}

}
