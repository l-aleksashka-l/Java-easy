package org.example;
public class SeleniumTutorial {
    enum Browser {
        CHROME, FIREFOX, IE
    }

    private WebDriver webDriver;

    public SeleniumTutorial(Browser browser) throws URISyntaxException {
        setProperties();
        switch(browser) {
            case CHROME:
                webDriver = new ChromeDriver();
                break;
            case FIREFOX:
                webDriver = new FirefoxDriver();
                break;
            case IE:
                webDriver = new InternetExplorerDriver();
                break;
        }
    }

    private void setProperties() throws URISyntaxException {
        URL chromeURL = getClass().getClassLoader().getResource("driver" + File.separator + "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", Paths.get(chromeURL.toURI()).toFile().getAbsolutePath());

        URL firefoxURL = getClass().getClassLoader().getResource("driver" + File.separator + "geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", Paths.get(firefoxURL.toURI()).toFile().getAbsolutePath());

        URL ieURL = getClass().getClassLoader().getResource("driver" + File.separator + "IEDriverServer.exe");
        System.setProperty("webdriver.ie.driver", Paths.get(ieURL.toURI()).toFile().getAbsolutePath());
    }

    public void goToGoogleAndSearch() {
        webDriver.get("https://google.com");
        WebElement searchFieldElement = webDriver.findElement(By.id("lst-ib"));
        searchFieldElement.sendKeys("selenium tutorial javapointers.com");
        searchFieldElement.sendKeys(Keys.ENTER);
    }

    public void quit() {
        webDriver.quit();
    }

    public static void main(String[] args) throws URISyntaxException {
        SeleniumTutorial seleniumTutorial = new SeleniumTutorial(Browser.CHROME);
        seleniumTutorial.goToGoogleAndSearch();
        seleniumTutorial.quit();
    }
}