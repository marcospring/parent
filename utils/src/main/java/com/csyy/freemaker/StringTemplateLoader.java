package com.csyy.freemaker;

import freemarker.cache.TemplateLoader;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * 根据模板内容去解析
 * 
 * StringTemplateLoader
 * 
 * DingZhanhe 2013-7-23 下午7:35:03
 * 
 * @version 1.0.0
 * 
 */
public class StringTemplateLoader implements TemplateLoader {

	/**
	 * 模板内容
	 */
	private String templateContent;

	public StringTemplateLoader(String templateContent) {
		this.templateContent = templateContent;
		if (templateContent == null) {
			this.templateContent = "";
		}
	}

	public void closeTemplateSource(Object templateSource) throws IOException {
		((StringReader) templateSource).close();
	}

	public Object findTemplateSource(String name) throws IOException {
		return new StringReader(templateContent);
	}

	public long getLastModified(Object templateSource) {
		return 0;
	}

	public Reader getReader(Object templateSource, String encoding) throws IOException {
		return (Reader) templateSource;
	}

}
