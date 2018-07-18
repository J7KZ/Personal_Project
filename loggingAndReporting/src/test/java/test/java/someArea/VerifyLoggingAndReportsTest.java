package test.java.someArea;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * <b>TEST-123</b> Verify Logging and Reporting in tests.
 * <p>
 *
 * @author Unknown
 */
public class VerifyLoggingAndReportsTest {
	private static final Logger LOG = Logger.getLogger(VerifyLoggingAndReportsTest.class);

	@BeforeClass
	public void preliminarySteps() {
		LOG.trace("Starting 'TEST-123 Verify Logging and Reporting in tests.'.");
		LOG.debug("1. Login as emplyee.");
		LOG.info("2. In the pay period drop-down menu, select Current pay period.");
		LOG.warn("3. Make an In-punch for Friday for  and an Out-Punch for Thuesday, and click save.");
		LOG.error("4. Click Search in the right pane through the login button.");
		LOG.fatal("5. Click the Employee workspace.");
	}

	@Test
	public void checkPunchesSavedSuccessfullyTest() {
		String actualPunchIn = "8:00AM";
		String actualPunchOut = "3:00PM";

		LOG.info("Expected result: Punches saved successfully.");
		Assert.assertNotEquals(actualPunchIn, actualPunchOut, "Punches are Equal, but it shouldn't;");
		Assert.assertFalse(actualPunchIn.isEmpty(), "Punch in is not empty");
	}

	@Test(dependsOnMethods = "checkPunchesSavedSuccessfullyTest")
	public void checkTrueIsTrueTest() {
		LOG.info("6. Delete the out-punch of PunchOut, hit the tab button and click save.");
		LOG.info("Expected result: Out-punch deleted, exception appears and timecard saved successfully.");
		Assert.assertTrue(true, "Unexpectedly 'true' bacame 'false';");
	}

	@AfterClass(alwaysRun = true)
	public void cleanup() {
		LOG.info("Cleanup: remove created something");
	}
}