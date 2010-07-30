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
import java.util.Locale;
import java.util.Map;

/**
 * The base model interface for the KaleoDefinition service. Represents a row in the &quot;KaleoDefinition&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoDefinitionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoDefinitionImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a kaleo definition model instance should use the {@link KaleoDefinition} interface instead.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoDefinition
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoDefinitionImpl
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoDefinitionModelImpl
 * @generated
 */
public interface KaleoDefinitionModel extends BaseModel<KaleoDefinition> {
	/**
	 * Gets the primary key of this kaleo definition.
	 *
	 * @return the primary key of this kaleo definition
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this kaleo definition
	 *
	 * @param pk the primary key of this kaleo definition
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the kaleo definition id of this kaleo definition.
	 *
	 * @return the kaleo definition id of this kaleo definition
	 */
	public long getKaleoDefinitionId();

	/**
	 * Sets the kaleo definition id of this kaleo definition.
	 *
	 * @param kaleoDefinitionId the kaleo definition id of this kaleo definition
	 */
	public void setKaleoDefinitionId(long kaleoDefinitionId);

	/**
	 * Gets the group id of this kaleo definition.
	 *
	 * @return the group id of this kaleo definition
	 */
	public long getGroupId();

	/**
	 * Sets the group id of this kaleo definition.
	 *
	 * @param groupId the group id of this kaleo definition
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company id of this kaleo definition.
	 *
	 * @return the company id of this kaleo definition
	 */
	public long getCompanyId();

	/**
	 * Sets the company id of this kaleo definition.
	 *
	 * @param companyId the company id of this kaleo definition
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user id of this kaleo definition.
	 *
	 * @return the user id of this kaleo definition
	 */
	public long getUserId();

	/**
	 * Sets the user id of this kaleo definition.
	 *
	 * @param userId the user id of this kaleo definition
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this kaleo definition.
	 *
	 * @return the user uuid of this kaleo definition
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this kaleo definition.
	 *
	 * @param userUuid the user uuid of this kaleo definition
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this kaleo definition.
	 *
	 * @return the user name of this kaleo definition
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this kaleo definition.
	 *
	 * @param userName the user name of this kaleo definition
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this kaleo definition.
	 *
	 * @return the create date of this kaleo definition
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this kaleo definition.
	 *
	 * @param createDate the create date of this kaleo definition
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this kaleo definition.
	 *
	 * @return the modified date of this kaleo definition
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this kaleo definition.
	 *
	 * @param modifiedDate the modified date of this kaleo definition
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the name of this kaleo definition.
	 *
	 * @return the name of this kaleo definition
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this kaleo definition.
	 *
	 * @param name the name of this kaleo definition
	 */
	public void setName(String name);

	/**
	 * Gets the title of this kaleo definition.
	 *
	 * @return the title of this kaleo definition
	 */
	public String getTitle();

	/**
	 * Gets the localized title of this kaleo definition. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale to get the localized title for
	 * @return the localized title of this kaleo definition
	 */
	public String getTitle(Locale locale);

	/**
	 * Gets the localized title of this kaleo definition, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local to get the localized title for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this kaleo definition. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	public String getTitle(Locale locale, boolean useDefault);

	/**
	 * Gets the localized title of this kaleo definition. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized title for
	 * @return the localized title of this kaleo definition
	 */
	public String getTitle(String languageId);

	/**
	 * Gets the localized title of this kaleo definition, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized title for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this kaleo definition
	 */
	public String getTitle(String languageId, boolean useDefault);

	/**
	 * Gets a map of the locales and localized title of this kaleo definition.
	 *
	 * @return the locales and localized title
	 */
	public Map<Locale, String> getTitleMap();

	/**
	 * Sets the title of this kaleo definition.
	 *
	 * @param title the title of this kaleo definition
	 */
	public void setTitle(String title);

	/**
	 * Sets the localized title of this kaleo definition.
	 *
	 * @param locale the locale to set the localized title for
	 * @param title the localized title of this kaleo definition
	 */
	public void setTitle(Locale locale, String title);

	/**
	 * Sets the localized titles of this kaleo definition from the map of locales and localized titles.
	 *
	 * @param titleMap the locales and localized titles of this kaleo definition
	 */
	public void setTitleMap(Map<Locale, String> titleMap);

	/**
	 * Gets the description of this kaleo definition.
	 *
	 * @return the description of this kaleo definition
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this kaleo definition.
	 *
	 * @param description the description of this kaleo definition
	 */
	public void setDescription(String description);

	/**
	 * Gets the version of this kaleo definition.
	 *
	 * @return the version of this kaleo definition
	 */
	public int getVersion();

	/**
	 * Sets the version of this kaleo definition.
	 *
	 * @param version the version of this kaleo definition
	 */
	public void setVersion(int version);

	/**
	 * Gets the active of this kaleo definition.
	 *
	 * @return the active of this kaleo definition
	 */
	public boolean getActive();

	/**
	 * Determines whether this kaleo definition is active.
	 *
	 * @return whether this kaleo definition is active
	 */
	public boolean isActive();

	/**
	 * Sets whether this {$entity.humanName} is active.
	 *
	 * @param active the active of this kaleo definition
	 */
	public void setActive(boolean active);

	/**
	 * Gets the start kaleo node id of this kaleo definition.
	 *
	 * @return the start kaleo node id of this kaleo definition
	 */
	public long getStartKaleoNodeId();

	/**
	 * Sets the start kaleo node id of this kaleo definition.
	 *
	 * @param startKaleoNodeId the start kaleo node id of this kaleo definition
	 */
	public void setStartKaleoNodeId(long startKaleoNodeId);

	/**
	 * Gets a copy of this kaleo definition as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public KaleoDefinition toEscapedModel();

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

	public int compareTo(KaleoDefinition kaleoDefinition);

	public int hashCode();

	public String toString();

	public String toXmlString();
}