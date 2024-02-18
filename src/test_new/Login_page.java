package test_new;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_page {
	
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Selenium\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://rms-qa.2.mtlstaging.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		// Login
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("admin@gmail.com");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Admin@123");
		
		WebElement loginButton = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]"));
		loginButton.submit();
		
		
		// Go to user management
		/*WebElement userManagement = driver.findElement(By.xpath("//p[contains(text(),'User Management')][1]"));
		userManagement.click();
		
		WebElement searchBox = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		searchBox.sendKeys("maneesha");
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		searchBox.clear(); 
		searchBox.sendKeys(" ");
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		
		// Add user
		WebElement addUserButton = driver.findElement(By.xpath("//p[contains(text(),'Add User')]"));
		addUserButton.click();
		
		WebElement userName = driver.findElement(By.name("full_name"));
		userName.sendKeys("Test");
		//driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		Thread.sleep(2000);
		
	    // Locate the custom dropdown and click on it to reveal options
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]")).click(); 

	    
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("test@gmail.com");
		
		WebElement phoneNumber = driver.findElement(By.name("phone"));
		phoneNumber.sendKeys("9605693636");
		
		WebElement addUser = driver.findElement(By.xpath("//button[contains(text(),'Add User')]"));
		addUser.click();
		
		
		//Action
		WebElement actionButton = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/div[1]/div[1]/button[1]/img[1]"));
		actionButton.click();
		
		WebElement deleteButton = driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
		deleteButton.click();	

        
		
		driver.switchTo().alert().accept();
		
		
		/ Go to User Role
		
		WebElement userRole = driver.findElement(By.xpath("//p[contains(text(),'User Role')][1]"));
		userRole.click();
		
		WebElement searchBox = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		searchBox.sendKeys("TEST");
		searchBox.sendKeys(Keys.ENTER);
		searchBox.clear();
	
		Thread.sleep(2000);
		searchBox.sendKeys(" ");
		searchBox.sendKeys(Keys.ENTER);
		
		
		Thread.sleep(2000);
		WebElement addNewRole = driver.findElement(By.xpath("//p[contains(text(),'Add New Role')]"));
		addNewRole.click();
		
		WebElement roleName = driver.findElement(By.name("name"));
		roleName.sendKeys("Accountant");
		
		//Select userPermissions = new Select(driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")));
		//userPermissions.selectByVisibleText(null);
		
		WebElement roleDescription = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[1]/div[3]/div[1]/textarea[1]"));
		roleDescription.sendKeys("test");
		
		WebElement addRole = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[2]/button[1]"));
		addRole.click();
		
		
		
		//Action
		WebElement action = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/button[1]/img[1]"));
		action.click();
		
		WebElement deleteButton = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/button[2]"));
		deleteButton.click();
		
		
		
		// Go to List Building
		WebElement listBuildingButton = driver.findElement(By.xpath("//p[contains(text(),'List Building')]"));
		listBuildingButton.click();
		
		WebElement newBuilding = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/ul[3]/li[1]/ul[1]/li[2]/span[1]/a[1]"));
		newBuilding.click();
		
		WebElement searchBuilding = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		searchBuilding.sendKeys("Orchid Avenue");
		
		//Add new Building
		WebElement addNewBuilding = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/di. v[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/p[1]"));
		addNewBuilding.click();
		
		WebElement buildingName = driver.findElement(By.name("name"));
		buildingName.sendKeys("test");
		
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("T.J.Nagar, civil lane");
		
		WebElement townName = driver.findElement(By.name("town"));
		townName.sendKeys("coimbatore");
		
		Select stateName = new Select(driver.findElement(By.name("state")));
		stateName.selectByVisibleText();
		
		WebElement pincodeBuilding = driver.findElement(By.name("pin_code"));
		pincodeBuilding.sendKeys("684104");
		
		WebElement addNewButton= driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[2]/button[1]"));
		addNewButton.click();		
	
	    //Action
		WebElement actionElement = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/button[1]/img[1]"));
		actionElement.click();
		WebElement deleteButton = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[1]/button[2]"));
		deleteButton.click();
		
		
		
		
		// Go to Properties
		WebElement properties = driver.findElement(By.xpath("//p[contains(text(),'Properties')][1]"));
		properties.click();
		
		// Test search 
		WebElement searchBox = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		searchBox.sendKeys("Dazzle");
		searchBox.sendKeys(Keys.ENTER);
	
		// Test add property image
		/*WebElement propertyImage = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/button[1]"));
		  propertyImage.click();
		
		// Test file upload
	    WebElement fileInput = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/label[1]"));
		fileInput.click();
	    String imagePath = "C:\\Users\\MANEESHA\\Pictures.jpg";
		fileInput.sendKeys(imagePath);
		
        WebElement addProperty = driver.findElement(By.xpath("//p[contains(text(),'Add Property')]"));
        addProperty.click();
        
        WebElement dropdownElement = driver.findElement(By.cssSelector("react-select-5-option-3"));
        dropdownElement.click();
        Select dropdown = new Select(driver.findElement(By.id("")));
        dropdown.selectByVisibleText("Land");
         
        
         
       /*  alert box
		driver.findElement(By.name(null)).click();
		driver.switchTo().alert().accept();
		
		//Income
		
        WebElement incomeElement = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/span[1]/p[1]"));
        incomeElement.click();
        
        WebElement rentIncome = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/ul[1]/li[1]/span[1]/a[1]"));
        rentIncome.click();
        
        
        //searchBox
        WebElement searchBuilding = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        searchBuilding.sendKeys("Arisi");
        searchBuilding.sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        searchBuilding.clear();

		searchBuilding.sendKeys(" ");
        searchBuilding.sendKeys(Keys.ENTER);
        
        Thread.sleep(2000);
        WebElement addRentIncome = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/button[1]/p[1]"));
        addRentIncome.click();
        WebElement searchAddRent = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]"));
        searchAddRent.sendKeys("Bilal Estate");
        
        WebElement addProperty = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/button[1]/div[1]/div[2]/div[1]/div[1]/label[1]"));
        addProperty.click();
        WebElement dropdownElement = driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]"));
        dropdownElement.click();
        //Select dropdown = new Select(driver.findElement(By.name("month_collected")));
        //dropdown.selectByIndex(0);
        WebElement rentReceivedamt = driver.findElement(By.name("rent_recieved"));
        rentReceivedamt.sendKeys("100");
        
        Thread.sleep(2000);

        //Action
        WebElement actionButton = driver.findElement(By.xpath(""));
        actionButton.click();
        
        
        
        
        //Investmentincome
        WebElement investmentIncome = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/ul[1]/li[2]/span[1]/a[1]"));
        investmentIncome.click();
        
        //searchBox
        WebElement searchBuilding = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        searchBuilding.sendKeys("Arisi");
        searchBuilding.sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        searchBuilding.clear();

		searchBuilding.sendKeys(" ");
        searchBuilding.sendKeys(Keys.ENTER);
        
     
        Thread.sleep(2000);


        WebElement addInvestmentIncome = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/button[1]/p[1]"));
        addInvestmentIncome.click();
        WebElement searchAddInvestment = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]"));
        searchAddInvestment.sendKeys("Bilal Estate");
        
        
        WebElement addProperty = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/button[1]/div[1]/div[1]/div[1]/label[1]"));
        addProperty.click();
        WebElement investorNameElement = driver.findElement(By.name("investorName"));
        investorNameElement.sendKeys("Test");
        WebElement phoneNumberElement = driver.findElement(By.name("phoneNumber"));
        phoneNumberElement.sendKeys("9605673564");
        WebElement emailElement = driver.findElement(By.name("email"));
        emailElement.sendKeys("test@gmail.com");
        WebElement amountElement = driver.findElement(By.name("amount"));
        amountElement.sendKeys("100");
        WebElement addInvestmentIncomeButton = driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[2]/div[5]/button[1]"));
        addInvestmentIncomeButton.click();
        
        
        //Rent to be collected
        
        WebElement rentcollected = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/ul[1]/li[3]/span[1]/a[1]"));
        rentcollected.click();
        
        //searchBox
        WebElement searchBuilding = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        searchBuilding.sendKeys("Arisi");
        searchBuilding.sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        searchBuilding.clear();

		searchBuilding.sendKeys(" ");
        searchBuilding.sendKeys(Keys.ENTER);
        
     
        Thread.sleep(2000);
        
        //Action
        WebElement actionElement = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/button[1]/img[1]"));
        actionElement.click();

        
        WebElement clearDueAmt = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[3]/button[1]/p[1]")); 
        clearDueAmt.click();
        WebElement rentReceived = driver.findElement(By.name("rent_recieved"));
        rentReceived.sendKeys("100");
        
        
        //AddExpenseType
		 WebElement expenseButton = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/ul[2]/li[1]/div[1]/span[1]/p[1]"));
		 expenseButton.click();
		 WebElement addExpenseType = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/ul[2]/li[1]/ul[1]/li[2]/span[1]/a[1]"));
		 addExpenseType.click();
		 WebElement search = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		 search.sendKeys("wages");
		 search.sendKeys(Keys.ENTER);
		 
		 Thread.sleep(2000);
		 search.clear();
		 search.sendKeys(" ");
		 search.sendKeys(Keys.ENTER);
		 

		 Thread.sleep(2000);
		 WebElement expenseType = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]"));
		 expenseType.click();
		 
		WebElement addNewExpenseType = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/p[1]"));
		addNewExpenseType.click();
		WebElement expenseTypeName = driver.findElement(By.name("type"));
		expenseTypeName.sendKeys("Test");
		WebElement addNewButton = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/button[1]"));
		addNewButton.click();
		
		//Action
		WebElement actionButton = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/button[1]/img[1]"));
		actionButton.click();
		WebElement delete = driver.findElement(By.xpath("   ?     "));
		delete.click();
		//WebElement cancelButton = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]/p[1]"));
		//cancelButton.click();
		 
		 
		
		
			
       
		//Expenses
		/*WebElement expenseButton = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/ul[2]/li[1]/div[1]/span[1]/p[1]"));
		expenseButton.click();
		WebElement expense = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/ul[2]/li[1]/ul[1]/li[1]/span[1]/a[1]"));
		expense.click();
		WebElement search = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		search.sendKeys("dazzle");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		search.clear();
		
		Thread.sleep(4000);
		search.sendKeys(" ");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		WebElement addExpense = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/button[1]/p[1]"));
		addExpense.click();
		WebElement addExpenseButton = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/button[5]"));
		addExpenseButton.click(); 
		WebElement expenseAmt = driver.findElement(By.name("expenseAmount"));
		expenseAmt.sendKeys("200");
		WebElement addRemarks = driver.findElement(By.name("remark"));
		addRemarks.sendKeys("Test");
		WebElement documentsUpload = driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/form[1]/div[2]/div[6]/div[1]/div[1]/label[1]/div[1]/img[1]"));
		documentsUpload.click();
		
		
		
		
		
		
		//Balance sheet
		WebElement balancesheet = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/a[3]/p[1]"));
		balancesheet.click();
		
	    WebElement search = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		search.sendKeys("dazzle");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		search.clear();
		
		Thread.sleep(4000);
		search.sendKeys(" ");
		search.sendKeys(Keys.ENTER);
	    driver.navigate().refresh();

		
	   WebElement dateFilterElement = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
       dateFilterElement.click();

       WebElement monthInput = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
       monthInput.clear();
       monthInput.sendKeys("September");

       WebElement yearInput = driver.findElement(By.xpath(""));
       yearInput.clear();
       yearInput.sendKeys("2022");

       
       WebElement action = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/div[1]/button[1]/img[1]"));
	   action.click();
		
		WebElement downloadButton = driver.findElement(By.xpath(""));
	    downloadButton.click();

	    // Wait for the file to download
	    File downloadedFile = new File("C:\\Users\\MANEESHA\\downloads .xlsx");
	    FluentWait<WebDriver> wait = null;
		wait.until(ExpectedConditions.visibilityOf((WebElement) downloadedFile));

	   
	    if (downloadedFile.exists()) {
	    System.out.println("File downloaded successfully.");
	           
	        }
	    else {
	            System.out.println("File download failed.");
	        }
		
		
		//Reports
		WebElement reportsButton = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/ul[4]/li[1]/div[1]/span[1]/p[1]"));
		reportsButton.click();
		WebElement targetButton = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/ul[4]/li[1]/ul[1]/li[1]/span[1]/a[1]"));
		targetButton.click();
		
		WebElement search = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		search.sendKeys("Gandhi nagar");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		search.clear();
		
		Thread.sleep(4000);
		search.sendKeys(" ");
		search.sendKeys(Keys.ENTER);
	    driver.navigate().refresh();
	    
	    WebElement monthFilter = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
	    monthFilter.click();
	    WebElement monthInput = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
	    monthInput.clear();
	    monthInput.sendKeys("April");

	    WebElement yearInput = driver.findElement(By.xpath(""));
	    yearInput.clear();
	    yearInput.sendKeys("2022");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		*/
		WebElement reportsButton = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/ul[4]/li[1]/div[1]/span[1]/p[1]"));
		reportsButton.click();
		
		WebElement occupancyButton = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/ul[4]/li[1]/ul[1]/li[2]/span[1]/a[1]"));
		occupancyButton.click();
		WebElement search = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		search.sendKeys("Gandhi nagar");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		search.clear();
		
		Thread.sleep(4000);
		search.sendKeys(" ");
		search.sendKeys(Keys.ENTER);
	    driver.navigate().refresh();
	    
	    search.sendKeys("");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		search.clear();
		
		Thread.sleep(4000);
		search.sendKeys(" ");
		search.sendKeys(Keys.ENTER);
	    driver.navigate().refresh();
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		WebElement incomeReportButton = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/ul[4]/li[1]/ul[1]/li[3]/span[1]/a[1]"));
		incomeReportButton.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		WebElement expenseReportButton = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/ul[4]/li[1]/ul[1]/li[4]/span[1]/a[1]"));
		expenseReportButton.click();
       
	}
	

}
		