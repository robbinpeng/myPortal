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
package org.apache.pluto.driver.services.container;

import org.apache.pluto.container.FilterManager;
import org.apache.pluto.container.FilterManagerService;
import org.apache.pluto.container.PortletWindow;

/**
 * @version $Id: FilterManagerServiceImpl.java 771572 2009-05-05 06:02:17Z cziegeler $
 *
 */
public class FilterManagerServiceImpl implements FilterManagerService {

    /**
     * @see org.apache.pluto.container.FilterManagerService#getFilterManager(org.apache.pluto.container.PortletWindow, java.lang.String)
     */
    public FilterManager getFilterManager(PortletWindow portletWindow, String lifeCycle) {
        return new FilterManagerImpl(portletWindow, lifeCycle);
    }
}
