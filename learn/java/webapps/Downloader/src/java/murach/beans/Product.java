/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murach.beans;

/**
 *
 * @author somebody
 */
public class Product {
	
	private String name;
	private String title;
	private String fileName;
	private String format;

	public Product() {
		name = "";
		title = "";
		fileName = "";
		format = "";
	}

	public Product(String name, String title, String fileName, String format) {
		this.name = name;
		this.title = title;
		this.fileName = fileName;
		this.format = format;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getName() {
		return name;
	}
}
