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
 * The base model interface for the KaleoAction service. Represents a row in the &quot;KaleoAction&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoActionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoActionImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a kaleo action model instance should use the {@link KaleoAction} interface instead.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoAction
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoActionImpl
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoActionModelImpl
 * @generated
 */
public interface KaleoActionModel extends BaseModel<KaleoAction> {
	/**
	 * Gets the primary key of this kaleo action.
	 *
	 * @return the primary key of this kaleo action
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this kaleo action
	 *
	 * @param pk the primary key of this kaleo action
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the kaleo action id of this kaleo action.
	 *
	 * @return the kaleo action id of this kaleo action
	 */
	public long getKaleoActionId();

	/**
	 * Sets the kaleo action id of this kaleo action.
	 *
	 * @param kaleoActionId the kaleo action id of this kaleo action
	 */
	public void setKaleoActionId(long kaleoActionId);

	/**
	 * Gets the group id of this kaleo action.
	 *
	 * @return the group id of this kaleo action
	 */
	public long getGroupId();

	/**
	 * Sets the group id of this kaleo action.
	 *
	 * @param groupId the group id of this kaleo action
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company id of this kaleo action.
	 *
	 * @return the company id of this kaleo action
	 */
	public long getCompanyId();

	/**
	 * Sets the company id of this kaleo action.
	 *
	 * @param companyId the company id of this kaleo action
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user id of this kaleo action.
	 *
	 * @return the user id of this kaleo action
	 */
	public long getUserId();

	/**
	 * Sets the user id of this kaleo action.
	 *
	 * @param userId the user id of this kaleo action
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this kaleo action.
	 *
	 * @return the user uuid of this kaleo action
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this kaleo action.
	 *
	 * @param userUuid the user uuid of this kaleo action
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this kaleo action.
	 *
	 * @return the user name of this kaleo action
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this kaleo action.
	 *
	 * @param userName the user name of this kaleo action
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this kaleo action.
	 *
	 * @return the create date of this kaleo action
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this kaleo action.
	 *
	 * @param createDate the create date of this kaleo action
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this kaleo action.
	 *
	 * @return the modified date of this kaleo action
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this kaleo action.
	 *
	 * @param modifiedDate the modified date of this kaleo action
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the kaleo definition id of this kaleo action.
	 *
	 * @return the kaleo definition id of this kaleo action
	 */
	public long getKaleoDefinitionId();

	/**
	 * Sets the kaleo definition id of this kaleo action.
	 *
	 * @param kaleoDefinitionId the kaleo definition id of this kaleo action
	 */
	public void setKaleoDefinitionId(long kaleoDefinitionId);

	/**
	 * Gets the kaleo node id of this kaleo action.
	 *
	 * @return the kaleo node id of this kaleo action
	 */
	public long getKaleoNodeId();

	/**
	 * Sets the kaleo node id of this kaleo action.
	 *
	 * @param kaleoNodeId the kaleo node id of this kaleo action
	 */
	public void setKaleoNodeId(long kaleoNodeId);

	/**
	 * Gets the kaleo node name of this kaleo action.
	 *
	 * @return the kaleo node name of this kaleo action
	 */
	@AutoEscape
	public String getKaleoNodeName();

	/**
	 * Sets the kaleo node name of this kaleo action.
	 *
	 * @param kaleoNodeName the kaleo node name of this kaleo action
	 */
	public void setKaleoNodeName(String kaleoNodeName);

	/**
	 * Gets the name of this kaleo action.
	 *
	 * @return the name of this kaleo action
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this kaleo action.
	 *
	 * @param name the name of this kaleo action
	 */
	public void setName(String name);

	/**
	 * Gets the description of this kaleo action.
	 *
	 * @return the description of this kaleo action
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this kaleo action.
	 *
	 * @param description the description of this kaleo action
	 */
	public void setDescription(String description);

	/**
	 * Gets the execution type of this kaleo action.
	 *
	 * @return the execution type of this kaleo action
	 */
	@AutoEscape
	public String getExecutionType();

	/**
	 * Sets the execution type of this kaleo action.
	 *
	 * @param executionType the execution type of this kaleo action
	 */
	public void setExecutionType(String executionType);

	/**
	 * Gets the script of this kaleo action.
	 *
	 * @return the script of this kaleo action
	 */
	@AutoEscape
	public String getScript();

	/**
	 * Sets the script of this kaleo action.
	 *
	 * @param script the script of this kaleo action
	 */
	public void setScript(String script);

	/**
	 * Gets the script language of this kaleo action.
	 *
	 * @return the script language of this kaleo action
	 */
	@AutoEscape
	public String getScriptLanguage();

	/**
	 * Sets the script language of this kaleo action.
	 *
	 * @param scriptLanguage the script language of this kaleo action
	 */
	public void setScriptLanguage(String scriptLanguage);

	/**
	 * Gets the priority of this kaleo action.
	 *
	 * @return the priority of this kaleo action
	 */
	public int getPriority();

	/**
	 * Sets the priority of this kaleo action.
	 *
	 * @param priority the priority of this kaleo action
	 */
	public void setPriority(int priority);

	/**
	 * Gets a copy of this kaleo action as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public KaleoAction toEscapedModel();

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

	public int compareTo(KaleoAction kaleoAction);

	public int hashCode();

	public String toString();

	public String toXmlString();
}