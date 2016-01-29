/**
 * Software License
 *
 * Copyright 2007/2010 National Library of New Zealand.
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0 
 *
 * or the file "LICENSE.txt" included with the software.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */

package nz.govt.natlib.ndha.manualdeposit;

public interface ICMSSearchResults extends IBaseForm {

	public void setPresenter(CMSSearchResultsPresenter presenter);

	public void showDetail(String detail);

	public void closeForm();

	public void showError(String header, String message);

	public void showMessage(String header, String message);

	public void setStatus(boolean canSelect, boolean canPageForward,
			boolean canPageBackwards, String pagingMessage);

	public void setWaitCursor(boolean isWaiting);

}
