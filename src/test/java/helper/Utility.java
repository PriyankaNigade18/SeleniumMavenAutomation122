package helper;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility 
{

	//Select based drop down
	public static void selectBasedDropdown(WebElement ele,String value)
	{
		Select dd=new Select(ele);
		
		System.out.println("Is dropdown support mutiple selection: "+dd.isMultiple());
		
		List<WebElement> allOptions=dd.getOptions();
		
		System.out.println("Total Options are: "+allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
		}
	}
	
	
}
