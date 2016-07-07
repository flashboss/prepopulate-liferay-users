/******************************************************************************
 * Vige, Home of Professional Open Source Copyright 2010, Vige, and           *
 * individual contributors by the @authors tag. See the copyright.txt in the  *
 * distribution for a full listing of individual contributors.                *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may    *
 * not use this file except in compliance with the License. You may obtain    *
 * a copy of the License at http://www.apache.org/licenses/LICENSE-2.0        *
 * Unless required by applicable law or agreed to in writing, software        *
 * distributed under the License is distributed on an "AS IS" BASIS,          *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   *
 * See the License for the specific language governing permissions and        *
 * limitations under the License.                                             *
 ******************************************************************************/
package it.vige.liferay.prepopulate;

import static com.liferay.portal.service.UserLocalServiceUtil.getUserByUuidAndCompanyId;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Named;

import com.liferay.portal.kernel.exception.PortalException;

@Named("userModule")
@Startup
@Singleton
public class LiferayUserModule implements Serializable {

	private static final long serialVersionUID = -8560321558665446098L;

	@PostConstruct
	public void init() {
		try {
			getUserByUuidAndCompanyId("test", 0);
		} catch (PortalException e) {
			e.printStackTrace();
		}
	}
}
