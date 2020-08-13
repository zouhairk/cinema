package com.ibformation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ibformation.bo.Permission;
import com.ibformation.dao.PermissionDao;

@Service
@Component
public class PermissionServiceImp implements PermissionService {

	@Autowired
	PermissionDao permDao;

	@Override
	public Optional<Permission> findById(Integer id) {
		return permDao.findById(id);
	}

	@Override
	public List<Permission> findAll() {
		return (List<Permission>) permDao.findAll();
	}

	@Override
	public Permission createOrUpdate(Permission o) {
		return permDao.save(o);
	}

	@Override
	public void deleteById(Integer id) {
		permDao.deleteById(id);
	}

}
