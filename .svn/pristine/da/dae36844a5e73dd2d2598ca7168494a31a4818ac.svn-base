package com.ibformation.cinema2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ibformation.cinema2.bo.Role;
import com.ibformation.cinema2.dao.RoleDao;

@Service
@Component
public class RoleServiceImp implements RoleService {

	@Autowired
	RoleDao roleDao;

	@Override
	public Optional<Role> findById(Integer id) {
		return roleDao.findById(id);
	}

	@Override
	public List<Role> findAll() {
		return (List<Role>) roleDao.findAll();
	}

	@Override
	public Role createOrUpdate(Role o) {
		return roleDao.save(o);
	}

	@Override
	public void deleteById(Integer id) {
		roleDao.deleteById(id);
	}

}
