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

package com.liferay.socialcoding.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the SVNRevision service. Represents a row in the &quot;SC_SVNRevision&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.socialcoding.model.impl.SVNRevisionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.socialcoding.model.impl.SVNRevisionImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a s v n revision model instance should use the {@link SVNRevision} interface instead.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SVNRevision
 * @see com.liferay.socialcoding.model.impl.SVNRevisionImpl
 * @see com.liferay.socialcoding.model.impl.SVNRevisionModelImpl
 * @generated
 */
public interface SVNRevisionModel extends BaseModel<SVNRevision> {
	/**
	 * Gets the primary key of this s v n revision.
	 *
	 * @return the primary key of this s v n revision
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this s v n revision
	 *
	 * @param pk the primary key of this s v n revision
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the svn revision id of this s v n revision.
	 *
	 * @return the svn revision id of this s v n revision
	 */
	public long getSvnRevisionId();

	/**
	 * Sets the svn revision id of this s v n revision.
	 *
	 * @param svnRevisionId the svn revision id of this s v n revision
	 */
	public void setSvnRevisionId(long svnRevisionId);

	/**
	 * Gets the svn user id of this s v n revision.
	 *
	 * @return the svn user id of this s v n revision
	 */
	@AutoEscape
	public String getSvnUserId();

	/**
	 * Sets the svn user id of this s v n revision.
	 *
	 * @param svnUserId the svn user id of this s v n revision
	 */
	public void setSvnUserId(String svnUserId);

	/**
	 * Gets the create date of this s v n revision.
	 *
	 * @return the create date of this s v n revision
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this s v n revision.
	 *
	 * @param createDate the create date of this s v n revision
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the svn repository id of this s v n revision.
	 *
	 * @return the svn repository id of this s v n revision
	 */
	public long getSvnRepositoryId();

	/**
	 * Sets the svn repository id of this s v n revision.
	 *
	 * @param svnRepositoryId the svn repository id of this s v n revision
	 */
	public void setSvnRepositoryId(long svnRepositoryId);

	/**
	 * Gets the revision number of this s v n revision.
	 *
	 * @return the revision number of this s v n revision
	 */
	public long getRevisionNumber();

	/**
	 * Sets the revision number of this s v n revision.
	 *
	 * @param revisionNumber the revision number of this s v n revision
	 */
	public void setRevisionNumber(long revisionNumber);

	/**
	 * Gets the comments of this s v n revision.
	 *
	 * @return the comments of this s v n revision
	 */
	@AutoEscape
	public String getComments();

	/**
	 * Sets the comments of this s v n revision.
	 *
	 * @param comments the comments of this s v n revision
	 */
	public void setComments(String comments);

	/**
	 * Gets a copy of this s v n revision as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public SVNRevision toEscapedModel();

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

	public int compareTo(SVNRevision svnRevision);

	public int hashCode();

	public String toString();

	public String toXmlString();
}