package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.WebDriverWaitUtility;

public class DataStructuresIntroductionPage extends BasePage {

	@FindBy(xpath = "//a[@href='/tryEditor']")
	private WebElement tryEditorLink;

	@FindBy(xpath = "//a[text()='Practice Questions']")
	private WebElement practiceLink;
	
	
	public void clickLinkUnderTopicsCovered(String itemName) {
		WebElement item = driver.findElement(By.xpath("//a[contains(@class,'list-group-item') and text()='" + itemName + "']"));
		WebDriverWaitUtility.waitForElementToBeClickable(item).click();
	}

	public void clickTryHereButton() {
		WebDriverWaitUtility.waitForElementToBeClickable(tryEditorLink);
		tryEditorLink.click();
	}

	public void clickPracticeLink() {
		WebDriverWaitUtility.waitForElementToBeClickable(practiceLink);
		practiceLink.click();
	}
}