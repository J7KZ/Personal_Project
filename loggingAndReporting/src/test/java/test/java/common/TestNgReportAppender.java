package test.java.common;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.Layout;
import org.apache.log4j.spi.LoggingEvent;
import org.testng.Reporter;

/**
 * Class to place <b>log4j</b> logs in <b>ReportNG</b> reports.
 */
public class TestNgReportAppender extends AppenderSkeleton {

	@Override
	protected void append(final LoggingEvent event) {
		Reporter.log(eventToString(event));
	}

	private String eventToString(final LoggingEvent event) {
		final StringBuilder result = new StringBuilder(layout.format(event));

		if (layout.ignoresThrowable()) {
			final String[] s = event.getThrowableStrRep();
			if (s != null) {
				for (final String value : s) {
					result.append(value).append(Layout.LINE_SEP);
				}
			}
		}
		return result.toString();
	}

	public void close() {
	}

	/**
	 * Defines if layout required for <b>log4j</b> logs.
	 */
	public boolean requiresLayout() {
		return true;
	}
}