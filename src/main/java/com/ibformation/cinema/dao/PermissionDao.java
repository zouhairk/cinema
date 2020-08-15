package com.ibformation.cinema.dao;

import org.springframework.data.repository.CrudRepository;

import com.ibformation.cinema.bo.Permission;

public interface PermissionDao extends CrudRepository<Permission, Integer> {

}
