/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetCDNStatisSumRequest extends RpcAcsRequest<GetCDNStatisSumResponse> {
	
	public GetCDNStatisSumRequest() {
		super("vod", "2017-03-21", "GetCDNStatisSum");
	}

	private String level;

	private String resourceOwnerAccount;

	private String endStatisTime;

	private String startStatisTime;

	private String resourceOwnerId;

	private String ownerAccount;

	private String ownerId;

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
		if(level != null){
			putQueryParameter("Level", level);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getEndStatisTime() {
		return this.endStatisTime;
	}

	public void setEndStatisTime(String endStatisTime) {
		this.endStatisTime = endStatisTime;
		if(endStatisTime != null){
			putQueryParameter("EndStatisTime", endStatisTime);
		}
	}

	public String getStartStatisTime() {
		return this.startStatisTime;
	}

	public void setStartStatisTime(String startStatisTime) {
		this.startStatisTime = startStatisTime;
		if(startStatisTime != null){
			putQueryParameter("StartStatisTime", startStatisTime);
		}
	}

	public String getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(String resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	@Override
	public Class<GetCDNStatisSumResponse> getResponseClass() {
		return GetCDNStatisSumResponse.class;
	}

}
