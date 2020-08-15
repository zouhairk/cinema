package com.ibformation.cinema2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ibformation.cinema2.bo.CarteFid;
import com.ibformation.cinema2.dao.CarteFideliteDao;

@Component
@Service
public class CarteFideliteServiceImp implements CarteFideliteService {

	@Autowired
	private CarteFideliteDao carteFidelitDao;

	@Override
	public Optional<CarteFid> findById(Integer id) {
		return carteFidelitDao.findById(id);
	}

	@Override
	public List<CarteFid> findAll() {
		return (List<CarteFid>) carteFidelitDao.findAll();
	}

	@Override
	public CarteFid createOrUpdate(CarteFid o) {
		return carteFidelitDao.save(o);
	}

	@Override
	public void deleteById(Integer id) {
		carteFidelitDao.deleteById(id);
	}

}
