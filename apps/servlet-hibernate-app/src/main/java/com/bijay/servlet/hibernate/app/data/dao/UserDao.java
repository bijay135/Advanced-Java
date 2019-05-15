package com.bijay.servlet.hibernate.app.data.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.bijay.servlet.hibernate.app.data.model.User;
import com.bijay.servlet.hibernate.app.util.HibernateUtil;

public class UserDao {

	public User findOneByUsernameAndPassword(String username, String password) {
		EntityManager em = HibernateUtil.createEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<User> cq = cb.createQuery(User.class);
		Root<User> from = cq.from(User.class);
		Predicate usernameEq = cb.equal(from.get("username"), username);
		Predicate passwordEq = cb.equal(from.get("password"), password);
		Expression<Boolean> usernameAndPasswordEq = cb.and(usernameEq, passwordEq);
		cq.select(from).where(usernameAndPasswordEq);
		List<User> users = em.createQuery(cq).getResultList();
		User user = users.size() != 0 ? users.get(0) : null;
		em.close();
		return user;
	}
}
