/*
 * Copyright 2011 Strategic Gains, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.strategicgains.atomexpress.domain.atom;

public class Generator
{
	private String url;
	private String version;
	private String value;

	public Generator()
	{
		super();
	}
	
	public Generator(Generator that)
	{
		this();
		setUrl(that.url);
		setVersion(that.version);
		setValue(that.value);
	}
	public String getUrl()
	{
		return url;
	}

	public Generator setUrl(String url)
	{
		this.url = url;
		return this;
	}

	public String getVersion()
	{
		return version;
	}

	public Generator setVersion(String version)
	{
		this.version = version;
		return this;
	}

	public String getValue()
	{
		return value;
	}

	public Generator setValue(String value)
	{
		this.value = value;
		return this;
	}
}
