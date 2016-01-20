/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.blogspot.chingovan.customquery.service.base;

import com.blogspot.chingovan.customquery.model.Author;
import com.blogspot.chingovan.customquery.service.AuthorService;
import com.blogspot.chingovan.customquery.service.persistence.AuthorPersistence;
import com.blogspot.chingovan.customquery.service.persistence.PostFinder;
import com.blogspot.chingovan.customquery.service.persistence.PostPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the author remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.blogspot.chingovan.customquery.service.impl.AuthorServiceImpl}.
 * </p>
 *
 * @author chinv
 * @see com.blogspot.chingovan.customquery.service.impl.AuthorServiceImpl
 * @see com.blogspot.chingovan.customquery.service.AuthorServiceUtil
 * @generated
 */
public abstract class AuthorServiceBaseImpl extends BaseServiceImpl
	implements AuthorService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.blogspot.chingovan.customquery.service.AuthorServiceUtil} to access the author remote service.
	 */

	/**
	 * Returns the author local service.
	 *
	 * @return the author local service
	 */
	public com.blogspot.chingovan.customquery.service.AuthorLocalService getAuthorLocalService() {
		return authorLocalService;
	}

	/**
	 * Sets the author local service.
	 *
	 * @param authorLocalService the author local service
	 */
	public void setAuthorLocalService(
		com.blogspot.chingovan.customquery.service.AuthorLocalService authorLocalService) {
		this.authorLocalService = authorLocalService;
	}

	/**
	 * Returns the author remote service.
	 *
	 * @return the author remote service
	 */
	public com.blogspot.chingovan.customquery.service.AuthorService getAuthorService() {
		return authorService;
	}

	/**
	 * Sets the author remote service.
	 *
	 * @param authorService the author remote service
	 */
	public void setAuthorService(
		com.blogspot.chingovan.customquery.service.AuthorService authorService) {
		this.authorService = authorService;
	}

	/**
	 * Returns the author persistence.
	 *
	 * @return the author persistence
	 */
	public AuthorPersistence getAuthorPersistence() {
		return authorPersistence;
	}

	/**
	 * Sets the author persistence.
	 *
	 * @param authorPersistence the author persistence
	 */
	public void setAuthorPersistence(AuthorPersistence authorPersistence) {
		this.authorPersistence = authorPersistence;
	}

	/**
	 * Returns the post local service.
	 *
	 * @return the post local service
	 */
	public com.blogspot.chingovan.customquery.service.PostLocalService getPostLocalService() {
		return postLocalService;
	}

	/**
	 * Sets the post local service.
	 *
	 * @param postLocalService the post local service
	 */
	public void setPostLocalService(
		com.blogspot.chingovan.customquery.service.PostLocalService postLocalService) {
		this.postLocalService = postLocalService;
	}

	/**
	 * Returns the post remote service.
	 *
	 * @return the post remote service
	 */
	public com.blogspot.chingovan.customquery.service.PostService getPostService() {
		return postService;
	}

	/**
	 * Sets the post remote service.
	 *
	 * @param postService the post remote service
	 */
	public void setPostService(
		com.blogspot.chingovan.customquery.service.PostService postService) {
		this.postService = postService;
	}

	/**
	 * Returns the post persistence.
	 *
	 * @return the post persistence
	 */
	public PostPersistence getPostPersistence() {
		return postPersistence;
	}

	/**
	 * Sets the post persistence.
	 *
	 * @param postPersistence the post persistence
	 */
	public void setPostPersistence(PostPersistence postPersistence) {
		this.postPersistence = postPersistence;
	}

	/**
	 * Returns the post finder.
	 *
	 * @return the post finder
	 */
	public PostFinder getPostFinder() {
		return postFinder;
	}

	/**
	 * Sets the post finder.
	 *
	 * @param postFinder the post finder
	 */
	public void setPostFinder(PostFinder postFinder) {
		this.postFinder = postFinder;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Author.class;
	}

	protected String getModelClassName() {
		return Author.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = authorPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.blogspot.chingovan.customquery.service.AuthorLocalService.class)
	protected com.blogspot.chingovan.customquery.service.AuthorLocalService authorLocalService;
	@BeanReference(type = com.blogspot.chingovan.customquery.service.AuthorService.class)
	protected com.blogspot.chingovan.customquery.service.AuthorService authorService;
	@BeanReference(type = AuthorPersistence.class)
	protected AuthorPersistence authorPersistence;
	@BeanReference(type = com.blogspot.chingovan.customquery.service.PostLocalService.class)
	protected com.blogspot.chingovan.customquery.service.PostLocalService postLocalService;
	@BeanReference(type = com.blogspot.chingovan.customquery.service.PostService.class)
	protected com.blogspot.chingovan.customquery.service.PostService postService;
	@BeanReference(type = PostPersistence.class)
	protected PostPersistence postPersistence;
	@BeanReference(type = PostFinder.class)
	protected PostFinder postFinder;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private AuthorServiceClpInvoker _clpInvoker = new AuthorServiceClpInvoker();
}