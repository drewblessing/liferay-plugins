/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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

package com.liferay.chat.service.persistence;

import com.liferay.chat.model.Entry;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the entry service.
 *
 * <p>
 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regnerate this class.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntryPersistence
 * @see EntryPersistenceImpl
 * @generated
 */
public class EntryUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Entry entry) {
		getPersistence().clearCache(entry);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Entry> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Entry> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Entry> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static Entry remove(Entry entry) throws SystemException {
		return getPersistence().remove(entry);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Entry update(Entry entry, boolean merge)
		throws SystemException {
		return getPersistence().update(entry, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Entry update(Entry entry, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(entry, merge, serviceContext);
	}

	/**
	* Caches the entry in the entity cache if it is enabled.
	*
	* @param entry the entry to cache
	*/
	public static void cacheResult(com.liferay.chat.model.Entry entry) {
		getPersistence().cacheResult(entry);
	}

	/**
	* Caches the entries in the entity cache if it is enabled.
	*
	* @param entries the entries to cache
	*/
	public static void cacheResult(
		java.util.List<com.liferay.chat.model.Entry> entries) {
		getPersistence().cacheResult(entries);
	}

	/**
	* Creates a new entry with the primary key.
	*
	* @param entryId the primary key for the new entry
	* @return the new entry
	*/
	public static com.liferay.chat.model.Entry create(long entryId) {
		return getPersistence().create(entryId);
	}

	/**
	* Removes the entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the entry to remove
	* @return the entry that was removed
	* @throws com.liferay.chat.NoSuchEntryException if a entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry remove(long entryId)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(entryId);
	}

	public static com.liferay.chat.model.Entry updateImpl(
		com.liferay.chat.model.Entry entry, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(entry, merge);
	}

	/**
	* Finds the entry with the primary key or throws a {@link com.liferay.chat.NoSuchEntryException} if it could not be found.
	*
	* @param entryId the primary key of the entry to find
	* @return the entry
	* @throws com.liferay.chat.NoSuchEntryException if a entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry findByPrimaryKey(long entryId)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(entryId);
	}

	/**
	* Finds the entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param entryId the primary key of the entry to find
	* @return the entry, or <code>null</code> if a entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry fetchByPrimaryKey(long entryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(entryId);
	}

	/**
	* Finds all the entries where createDate = &#63;.
	*
	* @param createDate the create date to search with
	* @return the matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findByCreateDate(
		long createDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCreateDate(createDate);
	}

	/**
	* Finds a range of all the entries where createDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param createDate the create date to search with
	* @param start the lower bound of the range of entries to return
	* @param end the upper bound of the range of entries to return (not inclusive)
	* @return the range of matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findByCreateDate(
		long createDate, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCreateDate(createDate, start, end);
	}

	/**
	* Finds an ordered range of all the entries where createDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param createDate the create date to search with
	* @param start the lower bound of the range of entries to return
	* @param end the upper bound of the range of entries to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findByCreateDate(
		long createDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCreateDate(createDate, start, end, orderByComparator);
	}

	/**
	* Finds the first entry in the ordered set where createDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param createDate the create date to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching entry
	* @throws com.liferay.chat.NoSuchEntryException if a matching entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry findByCreateDate_First(
		long createDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCreateDate_First(createDate, orderByComparator);
	}

	/**
	* Finds the last entry in the ordered set where createDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param createDate the create date to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching entry
	* @throws com.liferay.chat.NoSuchEntryException if a matching entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry findByCreateDate_Last(
		long createDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCreateDate_Last(createDate, orderByComparator);
	}

	/**
	* Finds the entries before and after the current entry in the ordered set where createDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param entryId the primary key of the current entry
	* @param createDate the create date to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next entry
	* @throws com.liferay.chat.NoSuchEntryException if a entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry[] findByCreateDate_PrevAndNext(
		long entryId, long createDate,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCreateDate_PrevAndNext(entryId, createDate,
			orderByComparator);
	}

	/**
	* Finds all the entries where fromUserId = &#63;.
	*
	* @param fromUserId the from user id to search with
	* @return the matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findByFromUserId(
		long fromUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFromUserId(fromUserId);
	}

	/**
	* Finds a range of all the entries where fromUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fromUserId the from user id to search with
	* @param start the lower bound of the range of entries to return
	* @param end the upper bound of the range of entries to return (not inclusive)
	* @return the range of matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findByFromUserId(
		long fromUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFromUserId(fromUserId, start, end);
	}

	/**
	* Finds an ordered range of all the entries where fromUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fromUserId the from user id to search with
	* @param start the lower bound of the range of entries to return
	* @param end the upper bound of the range of entries to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findByFromUserId(
		long fromUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFromUserId(fromUserId, start, end, orderByComparator);
	}

	/**
	* Finds the first entry in the ordered set where fromUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fromUserId the from user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching entry
	* @throws com.liferay.chat.NoSuchEntryException if a matching entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry findByFromUserId_First(
		long fromUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFromUserId_First(fromUserId, orderByComparator);
	}

	/**
	* Finds the last entry in the ordered set where fromUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fromUserId the from user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching entry
	* @throws com.liferay.chat.NoSuchEntryException if a matching entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry findByFromUserId_Last(
		long fromUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFromUserId_Last(fromUserId, orderByComparator);
	}

	/**
	* Finds the entries before and after the current entry in the ordered set where fromUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param entryId the primary key of the current entry
	* @param fromUserId the from user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next entry
	* @throws com.liferay.chat.NoSuchEntryException if a entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry[] findByFromUserId_PrevAndNext(
		long entryId, long fromUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFromUserId_PrevAndNext(entryId, fromUserId,
			orderByComparator);
	}

	/**
	* Finds all the entries where toUserId = &#63;.
	*
	* @param toUserId the to user id to search with
	* @return the matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findByToUserId(
		long toUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByToUserId(toUserId);
	}

	/**
	* Finds a range of all the entries where toUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param toUserId the to user id to search with
	* @param start the lower bound of the range of entries to return
	* @param end the upper bound of the range of entries to return (not inclusive)
	* @return the range of matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findByToUserId(
		long toUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByToUserId(toUserId, start, end);
	}

	/**
	* Finds an ordered range of all the entries where toUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param toUserId the to user id to search with
	* @param start the lower bound of the range of entries to return
	* @param end the upper bound of the range of entries to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findByToUserId(
		long toUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByToUserId(toUserId, start, end, orderByComparator);
	}

	/**
	* Finds the first entry in the ordered set where toUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param toUserId the to user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching entry
	* @throws com.liferay.chat.NoSuchEntryException if a matching entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry findByToUserId_First(
		long toUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByToUserId_First(toUserId, orderByComparator);
	}

	/**
	* Finds the last entry in the ordered set where toUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param toUserId the to user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching entry
	* @throws com.liferay.chat.NoSuchEntryException if a matching entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry findByToUserId_Last(
		long toUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByToUserId_Last(toUserId, orderByComparator);
	}

	/**
	* Finds the entries before and after the current entry in the ordered set where toUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param entryId the primary key of the current entry
	* @param toUserId the to user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next entry
	* @throws com.liferay.chat.NoSuchEntryException if a entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry[] findByToUserId_PrevAndNext(
		long entryId, long toUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByToUserId_PrevAndNext(entryId, toUserId,
			orderByComparator);
	}

	/**
	* Finds all the entries where createDate = &#63; and fromUserId = &#63;.
	*
	* @param createDate the create date to search with
	* @param fromUserId the from user id to search with
	* @return the matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findByC_F(
		long createDate, long fromUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_F(createDate, fromUserId);
	}

	/**
	* Finds a range of all the entries where createDate = &#63; and fromUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param createDate the create date to search with
	* @param fromUserId the from user id to search with
	* @param start the lower bound of the range of entries to return
	* @param end the upper bound of the range of entries to return (not inclusive)
	* @return the range of matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findByC_F(
		long createDate, long fromUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_F(createDate, fromUserId, start, end);
	}

	/**
	* Finds an ordered range of all the entries where createDate = &#63; and fromUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param createDate the create date to search with
	* @param fromUserId the from user id to search with
	* @param start the lower bound of the range of entries to return
	* @param end the upper bound of the range of entries to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findByC_F(
		long createDate, long fromUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_F(createDate, fromUserId, start, end,
			orderByComparator);
	}

	/**
	* Finds the first entry in the ordered set where createDate = &#63; and fromUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param createDate the create date to search with
	* @param fromUserId the from user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching entry
	* @throws com.liferay.chat.NoSuchEntryException if a matching entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry findByC_F_First(
		long createDate, long fromUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_F_First(createDate, fromUserId, orderByComparator);
	}

	/**
	* Finds the last entry in the ordered set where createDate = &#63; and fromUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param createDate the create date to search with
	* @param fromUserId the from user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching entry
	* @throws com.liferay.chat.NoSuchEntryException if a matching entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry findByC_F_Last(long createDate,
		long fromUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_F_Last(createDate, fromUserId, orderByComparator);
	}

	/**
	* Finds the entries before and after the current entry in the ordered set where createDate = &#63; and fromUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param entryId the primary key of the current entry
	* @param createDate the create date to search with
	* @param fromUserId the from user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next entry
	* @throws com.liferay.chat.NoSuchEntryException if a entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry[] findByC_F_PrevAndNext(
		long entryId, long createDate, long fromUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_F_PrevAndNext(entryId, createDate, fromUserId,
			orderByComparator);
	}

	/**
	* Finds all the entries where createDate = &#63; and toUserId = &#63;.
	*
	* @param createDate the create date to search with
	* @param toUserId the to user id to search with
	* @return the matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findByC_T(
		long createDate, long toUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_T(createDate, toUserId);
	}

	/**
	* Finds a range of all the entries where createDate = &#63; and toUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param createDate the create date to search with
	* @param toUserId the to user id to search with
	* @param start the lower bound of the range of entries to return
	* @param end the upper bound of the range of entries to return (not inclusive)
	* @return the range of matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findByC_T(
		long createDate, long toUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_T(createDate, toUserId, start, end);
	}

	/**
	* Finds an ordered range of all the entries where createDate = &#63; and toUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param createDate the create date to search with
	* @param toUserId the to user id to search with
	* @param start the lower bound of the range of entries to return
	* @param end the upper bound of the range of entries to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findByC_T(
		long createDate, long toUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_T(createDate, toUserId, start, end,
			orderByComparator);
	}

	/**
	* Finds the first entry in the ordered set where createDate = &#63; and toUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param createDate the create date to search with
	* @param toUserId the to user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching entry
	* @throws com.liferay.chat.NoSuchEntryException if a matching entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry findByC_T_First(
		long createDate, long toUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_T_First(createDate, toUserId, orderByComparator);
	}

	/**
	* Finds the last entry in the ordered set where createDate = &#63; and toUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param createDate the create date to search with
	* @param toUserId the to user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching entry
	* @throws com.liferay.chat.NoSuchEntryException if a matching entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry findByC_T_Last(long createDate,
		long toUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_T_Last(createDate, toUserId, orderByComparator);
	}

	/**
	* Finds the entries before and after the current entry in the ordered set where createDate = &#63; and toUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param entryId the primary key of the current entry
	* @param createDate the create date to search with
	* @param toUserId the to user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next entry
	* @throws com.liferay.chat.NoSuchEntryException if a entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry[] findByC_T_PrevAndNext(
		long entryId, long createDate, long toUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_T_PrevAndNext(entryId, createDate, toUserId,
			orderByComparator);
	}

	/**
	* Finds all the entries where createDate = &#63; and fromUserId = &#63; and toUserId = &#63;.
	*
	* @param createDate the create date to search with
	* @param fromUserId the from user id to search with
	* @param toUserId the to user id to search with
	* @return the matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findByC_F_T(
		long createDate, long fromUserId, long toUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_F_T(createDate, fromUserId, toUserId);
	}

	/**
	* Finds a range of all the entries where createDate = &#63; and fromUserId = &#63; and toUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param createDate the create date to search with
	* @param fromUserId the from user id to search with
	* @param toUserId the to user id to search with
	* @param start the lower bound of the range of entries to return
	* @param end the upper bound of the range of entries to return (not inclusive)
	* @return the range of matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findByC_F_T(
		long createDate, long fromUserId, long toUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_F_T(createDate, fromUserId, toUserId, start, end);
	}

	/**
	* Finds an ordered range of all the entries where createDate = &#63; and fromUserId = &#63; and toUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param createDate the create date to search with
	* @param fromUserId the from user id to search with
	* @param toUserId the to user id to search with
	* @param start the lower bound of the range of entries to return
	* @param end the upper bound of the range of entries to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findByC_F_T(
		long createDate, long fromUserId, long toUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_F_T(createDate, fromUserId, toUserId, start, end,
			orderByComparator);
	}

	/**
	* Finds the first entry in the ordered set where createDate = &#63; and fromUserId = &#63; and toUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param createDate the create date to search with
	* @param fromUserId the from user id to search with
	* @param toUserId the to user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching entry
	* @throws com.liferay.chat.NoSuchEntryException if a matching entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry findByC_F_T_First(
		long createDate, long fromUserId, long toUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_F_T_First(createDate, fromUserId, toUserId,
			orderByComparator);
	}

	/**
	* Finds the last entry in the ordered set where createDate = &#63; and fromUserId = &#63; and toUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param createDate the create date to search with
	* @param fromUserId the from user id to search with
	* @param toUserId the to user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching entry
	* @throws com.liferay.chat.NoSuchEntryException if a matching entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry findByC_F_T_Last(
		long createDate, long fromUserId, long toUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_F_T_Last(createDate, fromUserId, toUserId,
			orderByComparator);
	}

	/**
	* Finds the entries before and after the current entry in the ordered set where createDate = &#63; and fromUserId = &#63; and toUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param entryId the primary key of the current entry
	* @param createDate the create date to search with
	* @param fromUserId the from user id to search with
	* @param toUserId the to user id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next entry
	* @throws com.liferay.chat.NoSuchEntryException if a entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry[] findByC_F_T_PrevAndNext(
		long entryId, long createDate, long fromUserId, long toUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_F_T_PrevAndNext(entryId, createDate, fromUserId,
			toUserId, orderByComparator);
	}

	/**
	* Finds all the entries where fromUserId = &#63; and toUserId = &#63; and content = &#63;.
	*
	* @param fromUserId the from user id to search with
	* @param toUserId the to user id to search with
	* @param content the content to search with
	* @return the matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findByF_T_C(
		long fromUserId, long toUserId, java.lang.String content)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_T_C(fromUserId, toUserId, content);
	}

	/**
	* Finds a range of all the entries where fromUserId = &#63; and toUserId = &#63; and content = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fromUserId the from user id to search with
	* @param toUserId the to user id to search with
	* @param content the content to search with
	* @param start the lower bound of the range of entries to return
	* @param end the upper bound of the range of entries to return (not inclusive)
	* @return the range of matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findByF_T_C(
		long fromUserId, long toUserId, java.lang.String content, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_T_C(fromUserId, toUserId, content, start, end);
	}

	/**
	* Finds an ordered range of all the entries where fromUserId = &#63; and toUserId = &#63; and content = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fromUserId the from user id to search with
	* @param toUserId the to user id to search with
	* @param content the content to search with
	* @param start the lower bound of the range of entries to return
	* @param end the upper bound of the range of entries to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findByF_T_C(
		long fromUserId, long toUserId, java.lang.String content, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_T_C(fromUserId, toUserId, content, start, end,
			orderByComparator);
	}

	/**
	* Finds the first entry in the ordered set where fromUserId = &#63; and toUserId = &#63; and content = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fromUserId the from user id to search with
	* @param toUserId the to user id to search with
	* @param content the content to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching entry
	* @throws com.liferay.chat.NoSuchEntryException if a matching entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry findByF_T_C_First(
		long fromUserId, long toUserId, java.lang.String content,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_T_C_First(fromUserId, toUserId, content,
			orderByComparator);
	}

	/**
	* Finds the last entry in the ordered set where fromUserId = &#63; and toUserId = &#63; and content = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param fromUserId the from user id to search with
	* @param toUserId the to user id to search with
	* @param content the content to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching entry
	* @throws com.liferay.chat.NoSuchEntryException if a matching entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry findByF_T_C_Last(
		long fromUserId, long toUserId, java.lang.String content,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_T_C_Last(fromUserId, toUserId, content,
			orderByComparator);
	}

	/**
	* Finds the entries before and after the current entry in the ordered set where fromUserId = &#63; and toUserId = &#63; and content = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param entryId the primary key of the current entry
	* @param fromUserId the from user id to search with
	* @param toUserId the to user id to search with
	* @param content the content to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next entry
	* @throws com.liferay.chat.NoSuchEntryException if a entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.chat.model.Entry[] findByF_T_C_PrevAndNext(
		long entryId, long fromUserId, long toUserId, java.lang.String content,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.chat.NoSuchEntryException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByF_T_C_PrevAndNext(entryId, fromUserId, toUserId,
			content, orderByComparator);
	}

	/**
	* Finds all the entries.
	*
	* @return the entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of entries to return
	* @param end the upper bound of the range of entries to return (not inclusive)
	* @return the range of entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of entries to return
	* @param end the upper bound of the range of entries to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.chat.model.Entry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the entries where createDate = &#63; from the database.
	*
	* @param createDate the create date to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCreateDate(long createDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCreateDate(createDate);
	}

	/**
	* Removes all the entries where fromUserId = &#63; from the database.
	*
	* @param fromUserId the from user id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFromUserId(long fromUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByFromUserId(fromUserId);
	}

	/**
	* Removes all the entries where toUserId = &#63; from the database.
	*
	* @param toUserId the to user id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByToUserId(long toUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByToUserId(toUserId);
	}

	/**
	* Removes all the entries where createDate = &#63; and fromUserId = &#63; from the database.
	*
	* @param createDate the create date to search with
	* @param fromUserId the from user id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_F(long createDate, long fromUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_F(createDate, fromUserId);
	}

	/**
	* Removes all the entries where createDate = &#63; and toUserId = &#63; from the database.
	*
	* @param createDate the create date to search with
	* @param toUserId the to user id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_T(long createDate, long toUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_T(createDate, toUserId);
	}

	/**
	* Removes all the entries where createDate = &#63; and fromUserId = &#63; and toUserId = &#63; from the database.
	*
	* @param createDate the create date to search with
	* @param fromUserId the from user id to search with
	* @param toUserId the to user id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_F_T(long createDate, long fromUserId,
		long toUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_F_T(createDate, fromUserId, toUserId);
	}

	/**
	* Removes all the entries where fromUserId = &#63; and toUserId = &#63; and content = &#63; from the database.
	*
	* @param fromUserId the from user id to search with
	* @param toUserId the to user id to search with
	* @param content the content to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByF_T_C(long fromUserId, long toUserId,
		java.lang.String content)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByF_T_C(fromUserId, toUserId, content);
	}

	/**
	* Removes all the entries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the entries where createDate = &#63;.
	*
	* @param createDate the create date to search with
	* @return the number of matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCreateDate(long createDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCreateDate(createDate);
	}

	/**
	* Counts all the entries where fromUserId = &#63;.
	*
	* @param fromUserId the from user id to search with
	* @return the number of matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFromUserId(long fromUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByFromUserId(fromUserId);
	}

	/**
	* Counts all the entries where toUserId = &#63;.
	*
	* @param toUserId the to user id to search with
	* @return the number of matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByToUserId(long toUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByToUserId(toUserId);
	}

	/**
	* Counts all the entries where createDate = &#63; and fromUserId = &#63;.
	*
	* @param createDate the create date to search with
	* @param fromUserId the from user id to search with
	* @return the number of matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_F(long createDate, long fromUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_F(createDate, fromUserId);
	}

	/**
	* Counts all the entries where createDate = &#63; and toUserId = &#63;.
	*
	* @param createDate the create date to search with
	* @param toUserId the to user id to search with
	* @return the number of matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_T(long createDate, long toUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_T(createDate, toUserId);
	}

	/**
	* Counts all the entries where createDate = &#63; and fromUserId = &#63; and toUserId = &#63;.
	*
	* @param createDate the create date to search with
	* @param fromUserId the from user id to search with
	* @param toUserId the to user id to search with
	* @return the number of matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_F_T(long createDate, long fromUserId,
		long toUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_F_T(createDate, fromUserId, toUserId);
	}

	/**
	* Counts all the entries where fromUserId = &#63; and toUserId = &#63; and content = &#63;.
	*
	* @param fromUserId the from user id to search with
	* @param toUserId the to user id to search with
	* @param content the content to search with
	* @return the number of matching entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_T_C(long fromUserId, long toUserId,
		java.lang.String content)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByF_T_C(fromUserId, toUserId, content);
	}

	/**
	* Counts all the entries.
	*
	* @return the number of entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static EntryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EntryPersistence)PortletBeanLocatorUtil.locate(com.liferay.chat.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					EntryPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(EntryPersistence persistence) {
		_persistence = persistence;
	}

	private static EntryPersistence _persistence;
}