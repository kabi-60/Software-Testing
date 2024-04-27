### :warning: Problems Identified

- **Common Problems:**

    - When many people are using the same ip address, the system block the ip address.
    - The code continues to run and doesn't wait for the redirected page to load.
    - The website has a bot detection mechanism that blocks the user actions.
    - The website has two kinds of same element (like buttons, input, etc...) one for the desktop and another for the mobile.
    - The cookies pop-up is displayed at the bottom of the page. It interrupts the user actions like click from happening. Because it will be over the button element and the automation software can't click the button.

- **Testcase 2:**
    - When "Add to Cart" button is clicked the pop-up is not displayed. Because the website has a bot detection mechanism that blocks the user actions.

## Project Question

1.  Build a Data Driven framework using POM for the web application [https://www.barnesandnoble.com/](https://www.barnesandnoble.com/).
2.  Utilize the five utilities available within the framework structure:
    - Perform Excel data reading.
    - Configure and manage settings using property files.
    - Implement multilevel logging.
    - Generate extent reports.
    - Capture screenshots for reporting purposes.
3.  Create at least three independent test cases within the framework.
4.  Ensure each test case involves navigation through at least two pages.
5.  Capture screenshots in cases of test failures.
6.  Save the Excel file after adding the data.
7.  Adhere to best practices for logging, report generation, properties file management, Excel data reading, and screenshot capturing.

### **Instructions:**

1. When you open the workspace, click "ACCEPT" in the lower-right corner of the REDHAT notification to enable import package suggestions while working on Selenium scripts.

2. Ensure that you do not change the existing main class file.

3. Common Maven Commands for Selenium:

    - To change to a specific directory: cd /path of your maven project
    - To run all test cases: mvn clean test
    - To change to a parent directory: cd ..

4. To view the running scripts,

    - Click on port 8081, and you'll be directed to a new window. In the URL bar of this new window, replace "8081" with "4444" to access the Selenium Grid.
    - Perform the same procedure again, but replace "8081" with "7900" for the VNC server page
    - To view the execution, click on the "connect" button on the VNC server page.

5. If you need to terminate an active session in the Selenium Grid, you can click on the "reset grid" button.

6. To execute your test scripts, click Run Test Case.

7. To submit your code, click "Submit Project" and to end the Test by clicking "Submit Test", where you find a dialog box enter the text **"END"**.

> **Note:** Use wait command to get the page loaded.
> **Under "runner" create the classname prefix with "Test". (for eg : Testcase_book.java).**

---

### **Testcase1:**

1. Open a web browser and navigate to the URL: [https://www.barnesandnoble.com/](https://www.barnesandnoble.com/)

2. Click on the “**All”** dropdown on the left side of the search bar and select “**Books**”.

    ![alt text](./img/image.png)

3. On the search bar input the value "**Chetan Bhagat**". The input search value should be taken from Excel.

4. Click on the **search icon**.

5. Verify the search results contain the keyword “Chetan Bhagat” in it.

    ![alt text](./img/image-1.png)

### **Testcase2:**

1. Open a web browser and navigate to the URL: [https://www.barnesandnoble.com/](https://www.barnesandnoble.com/)

2. Below the search bar, hover over the Audiobooks. Under the Bestsellers section, click on the URL "**Audiobooks Top 100**".

    ![alt text](./img/image-2.png)

3. You will be redirected to the "Audiobooks Top 100 Bestsellers" page. On the first audiobook result page scroll down and click the “**ADD TO CART”** button.

    ![alt text](./img/image-3.png)

4. Verify the pop-up displays the label "**Item Successfully Added To Your Cart**".

    ![alt text](./img/image-4.png)

### **Testcase3:**

1. Open a web browser and navigate to the URL: [https://www.barnesandnoble.com/](https://www.barnesandnoble.com/)

2. Scroll down and click on "**B&N MEMBERSHIP**."

    ![alt text](./img/image-5.png)

3. You will be redirected to the "Membership & Rewards" page. Scroll down to the last and, under the label "FREE," click on the "**JOIN REWARDS**" button.

    ![alt text](./img/image-6.png)

4. Verify the pop-up has label "Sign in or Create an Account".

    ![alt text](./img/image-7.png)

