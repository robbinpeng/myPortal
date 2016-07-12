/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.pluto.driver.portlets;

import javax.portlet.RenderRequest;

public class AdminPortlet extends GenericPlutoPortlet {

	private static final String VIEW_PAGE = "/WEB-INF/fragments/admin/view.jsp";
	private static final String EDIT_PAGE = "/WEB-INF/fragments/admin/edit.jsp";
	private static final String HELP_PAGE = "/WEB-INF/fragments/admin/help.jsp";

	// GenericPortlet Impl -----------------------------------------------------


    public String getViewPage() {
        return VIEW_PAGE;
    }

    public String getEditPage() {
        return EDIT_PAGE;
    }

    public String getHelpPage(RenderRequest request) {
        return HELP_PAGE;
    }
}
