/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyuncs.ossadmin.transform.v20130712;

import com.aliyuncs.ossadmin.model.v20130712.PutBucketStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PutBucketStatusResponseUnmarshaller {

	public static PutBucketStatusResponse unmarshall(PutBucketStatusResponse putBucketStatusResponse, UnmarshallerContext context) {
		
		putBucketStatusResponse.setCode(context.stringValue("PutBucketStatusResponse.Code"));
		putBucketStatusResponse.setMessage(context.stringValue("PutBucketStatusResponse.Message"));
		putBucketStatusResponse.setSuccess(context.booleanValue("PutBucketStatusResponse.Success"));
	 
	 	return putBucketStatusResponse;
	}
}