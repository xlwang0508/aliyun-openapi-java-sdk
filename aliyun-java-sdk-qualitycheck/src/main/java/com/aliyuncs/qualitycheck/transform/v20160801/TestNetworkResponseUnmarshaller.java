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

package com.aliyuncs.qualitycheck.transform.v20160801;

import com.aliyuncs.qualitycheck.model.v20160801.TestNetworkResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TestNetworkResponseUnmarshaller {

	public static TestNetworkResponse unmarshall(TestNetworkResponse testNetworkResponse, UnmarshallerContext context) {
		
		testNetworkResponse.setRequestId(context.stringValue("TestNetworkResponse.RequestId"));
		testNetworkResponse.setSuccess(context.booleanValue("TestNetworkResponse.Success"));
		testNetworkResponse.setCode(context.stringValue("TestNetworkResponse.Code"));
		testNetworkResponse.setMessage(context.stringValue("TestNetworkResponse.Message"));
		testNetworkResponse.setData(context.stringValue("TestNetworkResponse.Data"));
	 
	 	return testNetworkResponse;
	}
}