package mergeapplication;

import java.io.File;
import java.io.IOException;

import javax.inject.Inject;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.part.ViewPart;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class HtmlParser extends ViewPart {
	public static String id = "MergeApplication.HtmlParser";
	@Inject IWorkbench workbench;

	 
	
	@Override
	public void createPartControl(Composite parent) {
		
		File htmlFile = new File("C:/Users/srika/OneDrive/Documents/rcp/employee.html");
	       Document doc;
		try {
			doc = Jsoup.parse(htmlFile, "UTF-8");
		
	       String title = doc.title();
	       
	       Label title1 = new Label(parent, SWT.NULL);
	       
	       title1.setText(" Title --> "+title+" ;");
	       System.out.println("Title : " + title);
	       
	       Element loginform = doc.getElementById("registerform");  
	       
	       Elements inputElements = loginform.getElementsByTag("input");  
	       for (Element inputElement : inputElements) {  
	           String key = inputElement.attr("name");  
	           String value = inputElement.attr("value");  
	           System.out.println("Param name: "+key+" \nParam value: "+value);
	           
	           Label key1 = new Label(parent, SWT.NULL);
	           key1.setText(key+" -->");
	           
	           Label value1 = new Label(parent, SWT.NULL);
	           value1.setText(value+" ; ");
	           
	       }  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		      
		
	}



	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
		
	}