from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
with webdriver.Firefox() as driver:
    Actions = webdriver.ActionChains(driver)
    driver.get("https://duckduckgo.com")
    wait = WebDriverWait(driver,10)
    print(driver.title)
    searchbox = driver.find_element(By.NAME,"q")
    Actions.click(searchbox).send_keys("hello").key_down(Keys.SHIFT).send_keys("hello").key_up(Keys.SHIFT).send_keys(Keys.ENTER).perform()
    wait.until(EC.url_contains("q=helloHELLO"))
    driver.quit()