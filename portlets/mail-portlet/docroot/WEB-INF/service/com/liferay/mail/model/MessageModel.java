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

package com.liferay.mail.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Message service. Represents a row in the &quot;Mail_Message&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.mail.model.impl.MessageModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.mail.model.impl.MessageImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a message model instance should use the {@link Message} interface instead.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Message
 * @see com.liferay.mail.model.impl.MessageImpl
 * @see com.liferay.mail.model.impl.MessageModelImpl
 * @generated
 */
public interface MessageModel extends BaseModel<Message> {
	/**
	 * Gets the primary key of this message.
	 *
	 * @return the primary key of this message
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this message
	 *
	 * @param pk the primary key of this message
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the message id of this message.
	 *
	 * @return the message id of this message
	 */
	public long getMessageId();

	/**
	 * Sets the message id of this message.
	 *
	 * @param messageId the message id of this message
	 */
	public void setMessageId(long messageId);

	/**
	 * Gets the company id of this message.
	 *
	 * @return the company id of this message
	 */
	public long getCompanyId();

	/**
	 * Sets the company id of this message.
	 *
	 * @param companyId the company id of this message
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user id of this message.
	 *
	 * @return the user id of this message
	 */
	public long getUserId();

	/**
	 * Sets the user id of this message.
	 *
	 * @param userId the user id of this message
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this message.
	 *
	 * @return the user uuid of this message
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this message.
	 *
	 * @param userUuid the user uuid of this message
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this message.
	 *
	 * @return the user name of this message
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this message.
	 *
	 * @param userName the user name of this message
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this message.
	 *
	 * @return the create date of this message
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this message.
	 *
	 * @param createDate the create date of this message
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this message.
	 *
	 * @return the modified date of this message
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this message.
	 *
	 * @param modifiedDate the modified date of this message
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the account id of this message.
	 *
	 * @return the account id of this message
	 */
	public long getAccountId();

	/**
	 * Sets the account id of this message.
	 *
	 * @param accountId the account id of this message
	 */
	public void setAccountId(long accountId);

	/**
	 * Gets the folder id of this message.
	 *
	 * @return the folder id of this message
	 */
	public long getFolderId();

	/**
	 * Sets the folder id of this message.
	 *
	 * @param folderId the folder id of this message
	 */
	public void setFolderId(long folderId);

	/**
	 * Gets the sender of this message.
	 *
	 * @return the sender of this message
	 */
	@AutoEscape
	public String getSender();

	/**
	 * Sets the sender of this message.
	 *
	 * @param sender the sender of this message
	 */
	public void setSender(String sender);

	/**
	 * Gets the to of this message.
	 *
	 * @return the to of this message
	 */
	@AutoEscape
	public String getTo();

	/**
	 * Sets the to of this message.
	 *
	 * @param to the to of this message
	 */
	public void setTo(String to);

	/**
	 * Gets the cc of this message.
	 *
	 * @return the cc of this message
	 */
	@AutoEscape
	public String getCc();

	/**
	 * Sets the cc of this message.
	 *
	 * @param cc the cc of this message
	 */
	public void setCc(String cc);

	/**
	 * Gets the bcc of this message.
	 *
	 * @return the bcc of this message
	 */
	@AutoEscape
	public String getBcc();

	/**
	 * Sets the bcc of this message.
	 *
	 * @param bcc the bcc of this message
	 */
	public void setBcc(String bcc);

	/**
	 * Gets the sent date of this message.
	 *
	 * @return the sent date of this message
	 */
	public Date getSentDate();

	/**
	 * Sets the sent date of this message.
	 *
	 * @param sentDate the sent date of this message
	 */
	public void setSentDate(Date sentDate);

	/**
	 * Gets the subject of this message.
	 *
	 * @return the subject of this message
	 */
	@AutoEscape
	public String getSubject();

	/**
	 * Sets the subject of this message.
	 *
	 * @param subject the subject of this message
	 */
	public void setSubject(String subject);

	/**
	 * Gets the preview of this message.
	 *
	 * @return the preview of this message
	 */
	@AutoEscape
	public String getPreview();

	/**
	 * Sets the preview of this message.
	 *
	 * @param preview the preview of this message
	 */
	public void setPreview(String preview);

	/**
	 * Gets the body of this message.
	 *
	 * @return the body of this message
	 */
	@AutoEscape
	public String getBody();

	/**
	 * Sets the body of this message.
	 *
	 * @param body the body of this message
	 */
	public void setBody(String body);

	/**
	 * Gets the flags of this message.
	 *
	 * @return the flags of this message
	 */
	@AutoEscape
	public String getFlags();

	/**
	 * Sets the flags of this message.
	 *
	 * @param flags the flags of this message
	 */
	public void setFlags(String flags);

	/**
	 * Gets the size of this message.
	 *
	 * @return the size of this message
	 */
	public long getSize();

	/**
	 * Sets the size of this message.
	 *
	 * @param size the size of this message
	 */
	public void setSize(long size);

	/**
	 * Gets the remote message id of this message.
	 *
	 * @return the remote message id of this message
	 */
	public long getRemoteMessageId();

	/**
	 * Sets the remote message id of this message.
	 *
	 * @param remoteMessageId the remote message id of this message
	 */
	public void setRemoteMessageId(long remoteMessageId);

	/**
	 * Gets a copy of this message as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public Message toEscapedModel();

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

	public int compareTo(Message message);

	public int hashCode();

	public String toString();

	public String toXmlString();
}