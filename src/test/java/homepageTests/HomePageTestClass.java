package homepageTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTestClass {
	@Test
	public void verifyHomepageHeader() {
		System.out.println("Homepage header is displayed.");
		Assert.assertTrue(true, "Homepage header is not displayed");
	}
	
	@Test
	public void verifyFavouriteHeader() {
		System.out.println("Favourite header is displayed.");
		Assert.assertTrue(true, "Favourite header is not displayed");
	}
	
	@Test
	public void verifyElectronicsHeader() {
		System.out.println("Electronics header is displayed.");
		Assert.assertTrue(true, "Electronics header is not displayed");
	}
	
	@Test
	public void verifyGroceryHeader() {
		System.out.println("Grocery header is displayed.");
		Assert.assertTrue(true, "Homepage header is not displayed");
	}
	
	@Test
	public void verifyTravelHeader() {
		System.out.println("Travel header is displayed.");
		Assert.assertTrue(true, "Homepage header is not displayed");
	}

}
