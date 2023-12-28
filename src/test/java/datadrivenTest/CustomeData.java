package datadrivenTest;

import org.testng.annotations.DataProvider;

public class CustomeData {

	@DataProvider(name="testdata1")
	public Object[][] testData()
	{
		Object data[][]= {{"Admin","admin123"},{"Sarang","test123"},{"Admin","admin123"},{"Pooja","test123"}};
		return data;
	}
}
