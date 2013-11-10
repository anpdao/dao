package com.sarvatra.dao;

import java.util.Map;

public interface GenericDao <T>{
	long countAll(final Map params);
	T create(T t);
	void delete(final Object id); 
	T find(final Object id);
	T update(final T t);
}
