package extentreports;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
	public static ExtentReports getInstance() {
		ExtentReports extent;
		String Path = "\\Users\\Jasmeet\\workspace\\SeleniumWDT2Tutorial\\report-demo1.html";
		extent = new ExtentReports(Path, false);
		extent
	     .addSystemInfo("Selenium Version", "2.52")
	     .addSystemInfo("Platform", "Windows");

		return extent;
	}
}