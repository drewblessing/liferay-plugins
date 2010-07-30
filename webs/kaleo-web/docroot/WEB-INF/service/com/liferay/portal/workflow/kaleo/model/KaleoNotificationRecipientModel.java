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

package com.liferay.portal.workflow.kaleo.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the KaleoNotificationRecipient service. Represents a row in the &quot;KaleoNotificationRecipient&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoNotificationRecipientModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoNotificationRecipientImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a kaleo notification recipient model instance should use the {@link KaleoNotificationRecipient} interface instead.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoNotificationRecipient
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoNotificationRecipientImpl
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoNotificationRecipientModelImpl
 * @generated
 */
public interface KaleoNotificationRecipientModel extends BaseModel<KaleoNotificationRecipient> {
	/**
	 * Gets the primary key of this kaleo notification recipient.
	 *
	 * @return the primary key of this kaleo notification recipient
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this kaleo notification recipient
	 *
	 * @param pk the primary key of this kaleo notification recipient
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the kaleo notification recipient id of this kaleo notification recipient.
	 *
	 * @return the kaleo notification recipient id of this kaleo notification recipient
	 */
	public long getKaleoNotificationRecipientId();

	/**
	 * Sets the kaleo notification recipient id of this kaleo notification recipient.
	 *
	 * @param kaleoNotificationRecipientId the kaleo notification recipient id of this kaleo notification recipient
	 */
	public void setKaleoNotificationRecipientId(
		long kaleoNotificationRecipientId);

	/**
	 * Gets the group id of this kaleo notification recipient.
	 *
	 * @return the group id of this kaleo notification recipient
	 */
	public long getGroupId();

	/**
	 * Sets the group id of this kaleo notification recipient.
	 *
	 * @param groupId the group id of this kaleo notification recipient
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company id of this kaleo notification recipient.
	 *
	 * @return the company id of this kaleo notification recipient
	 */
	public long getCompanyId();

	/**
	 * Sets the company id of this kaleo notification recipient.
	 *
	 * @param companyId the company id of this kaleo notification recipient
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user id of this kaleo notification recipient.
	 *
	 * @return the user id of this kaleo notification recipient
	 */
	public long getUserId();

	/**
	 * Sets the user id of this kaleo notification recipient.
	 *
	 * @param userId the user id of this kaleo notification recipient
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this kaleo notification recipient.
	 *
	 * @return the user uuid of this kaleo notification recipient
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this kaleo notification recipient.
	 *
	 * @param userUuid the user uuid of this kaleo notification recipient
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this kaleo notification recipient.
	 *
	 * @return the user name of this kaleo notification recipient
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this kaleo notification recipient.
	 *
	 * @param userName the user name of this kaleo notification recipient
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this kaleo notification recipient.
	 *
	 * @return the create date of this kaleo notification recipient
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this kaleo notification recipient.
	 *
	 * @param createDate the create date of this kaleo notification recipient
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this kaleo notification recipient.
	 *
	 * @return the modified date of this kaleo notification recipient
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this kaleo notification recipient.
	 *
	 * @param modifiedDate the modified date of this kaleo notification recipient
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the kaleo definition id of this kaleo notification recipient.
	 *
	 * @return the kaleo definition id of this kaleo notification recipient
	 */
	public long getKaleoDefinitionId();

	/**
	 * Sets the kaleo definition id of this kaleo notification recipient.
	 *
	 * @param kaleoDefinitionId the kaleo definition id of this kaleo notification recipient
	 */
	public void setKaleoDefinitionId(long kaleoDefinitionId);

	/**
	 * Gets the kaleo notification id of this kaleo notification recipient.
	 *
	 * @return the kaleo notification id of this kaleo notification recipient
	 */
	public long getKaleoNotificationId();

	/**
	 * Sets the kaleo notification id of this kaleo notification recipient.
	 *
	 * @param kaleoNotificationId the kaleo notification id of this kaleo notification recipient
	 */
	public void setKaleoNotificationId(long kaleoNotificationId);

	/**
	 * Gets the recipient class name of this kaleo notification recipient.
	 *
	 * @return the recipient class name of this kaleo notification recipient
	 */
	@AutoEscape
	public String getRecipientClassName();

	/**
	 * Sets the recipient class name of this kaleo notification recipient.
	 *
	 * @param recipientClassName the recipient class name of this kaleo notification recipient
	 */
	public void setRecipientClassName(String recipientClassName);

	/**
	 * Gets the recipient class p k of this kaleo notification recipient.
	 *
	 * @return the recipient class p k of this kaleo notification recipient
	 */
	public long getRecipientClassPK();

	/**
	 * Sets the recipient class p k of this kaleo notification recipient.
	 *
	 * @param recipientClassPK the recipient class p k of this kaleo notification recipient
	 */
	public void setRecipientClassPK(long recipientClassPK);

	/**
	 * Gets the recipient role type of this kaleo notification recipient.
	 *
	 * @return the recipient role type of this kaleo notification recipient
	 */
	public int getRecipientRoleType();

	/**
	 * Sets the recipient role type of this kaleo notification recipient.
	 *
	 * @param recipientRoleType the recipient role type of this kaleo notification recipient
	 */
	public void setRecipientRoleType(int recipientRoleType);

	/**
	 * Gets the address of this kaleo notification recipient.
	 *
	 * @return the address of this kaleo notification recipient
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this kaleo notification recipient.
	 *
	 * @param address the address of this kaleo notification recipient
	 */
	public void setAddress(String address);

	/**
	 * Gets a copy of this kaleo notification recipient as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public KaleoNotificationRecipient toEscapedModel();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(KaleoNotificationRecipient kaleoNotificationRecipient);

	public int hashCode();

	public String toString();

	public String toXmlString();
}