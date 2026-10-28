package org.apache.log4j;

import java.util.Date;
import org.apache.log4j.helpers.Transform;
import org.apache.log4j.spi.LocationInfo;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public class HTMLLayout extends Layout {
    public static final String LOCATION_INFO_OPTION = "LocationInfo";
    public static final String TITLE_OPTION = "Title";
    static String TRACE_PREFIX = "<br>&nbsp;&nbsp;&nbsp;&nbsp;";
    protected final int BUF_SIZE = 256;
    protected final int MAX_CAPACITY = 1024;
    private StringBuffer sbuf = new StringBuffer(256);
    boolean locationInfo = false;
    String title = "Log4J Log Messages";

    @Override // org.apache.log4j.spi.OptionHandler
    public void activateOptions() {
    }

    void appendThrowableAsHTML(String[] strArr, StringBuffer stringBuffer) {
        int length;
        if (strArr == null || (length = strArr.length) == 0) {
            return;
        }
        stringBuffer.append(Transform.escapeTags(strArr[0]));
        stringBuffer.append(Layout.LINE_SEP);
        for (int i4 = 1; i4 < length; i4++) {
            stringBuffer.append(TRACE_PREFIX);
            stringBuffer.append(Transform.escapeTags(strArr[i4]));
            stringBuffer.append(Layout.LINE_SEP);
        }
    }

    @Override // org.apache.log4j.Layout
    public String format(LoggingEvent loggingEvent) {
        if (this.sbuf.capacity() > 1024) {
            this.sbuf = new StringBuffer(256);
        } else {
            this.sbuf.setLength(0);
        }
        StringBuffer stringBuffer = this.sbuf;
        String str = Layout.LINE_SEP;
        stringBuffer.append(String.valueOf(str) + "<tr>" + str);
        this.sbuf.append("<td>");
        this.sbuf.append(loggingEvent.timeStamp - LoggingEvent.getStartTime());
        this.sbuf.append("</td>" + str);
        String escapeTags = Transform.escapeTags(loggingEvent.getThreadName());
        this.sbuf.append("<td title=\"" + escapeTags + " thread\">");
        this.sbuf.append(escapeTags);
        this.sbuf.append("</td>" + str);
        this.sbuf.append("<td title=\"Level\">");
        if (loggingEvent.getLevel().equals(Level.DEBUG)) {
            this.sbuf.append("<font color=\"#339933\">");
            this.sbuf.append(Transform.escapeTags(String.valueOf(loggingEvent.getLevel())));
            this.sbuf.append("</font>");
        } else if (loggingEvent.getLevel().isGreaterOrEqual(Level.WARN)) {
            this.sbuf.append("<font color=\"#993300\"><strong>");
            this.sbuf.append(Transform.escapeTags(String.valueOf(loggingEvent.getLevel())));
            this.sbuf.append("</strong></font>");
        } else {
            this.sbuf.append(Transform.escapeTags(String.valueOf(loggingEvent.getLevel())));
        }
        this.sbuf.append("</td>" + str);
        String escapeTags2 = Transform.escapeTags(loggingEvent.getLoggerName());
        this.sbuf.append("<td title=\"" + escapeTags2 + " category\">");
        this.sbuf.append(escapeTags2);
        this.sbuf.append("</td>" + str);
        if (this.locationInfo) {
            LocationInfo locationInformation = loggingEvent.getLocationInformation();
            this.sbuf.append("<td>");
            this.sbuf.append(Transform.escapeTags(locationInformation.getFileName()));
            this.sbuf.append(':');
            this.sbuf.append(locationInformation.getLineNumber());
            this.sbuf.append("</td>" + str);
        }
        this.sbuf.append("<td title=\"Message\">");
        this.sbuf.append(Transform.escapeTags(loggingEvent.getRenderedMessage()));
        this.sbuf.append("</td>" + str);
        this.sbuf.append("</tr>" + str);
        if (loggingEvent.getNDC() != null) {
            this.sbuf.append("<tr><td bgcolor=\"#EEEEEE\" style=\"font-size : xx-small;\" colspan=\"6\" title=\"Nested Diagnostic Context\">");
            this.sbuf.append("NDC: " + Transform.escapeTags(loggingEvent.getNDC()));
            this.sbuf.append("</td></tr>" + str);
        }
        String[] throwableStrRep = loggingEvent.getThrowableStrRep();
        if (throwableStrRep != null) {
            this.sbuf.append("<tr><td bgcolor=\"#993300\" style=\"color:White; font-size : xx-small;\" colspan=\"6\">");
            appendThrowableAsHTML(throwableStrRep, this.sbuf);
            this.sbuf.append("</td></tr>" + str);
        }
        return this.sbuf.toString();
    }

    @Override // org.apache.log4j.Layout
    public String getContentType() {
        return "text/html";
    }

    @Override // org.apache.log4j.Layout
    public String getFooter() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb = new StringBuilder("</table>");
        String str = Layout.LINE_SEP;
        sb.append(str);
        stringBuffer.append(sb.toString());
        stringBuffer.append("<br>" + str);
        stringBuffer.append("</body></html>");
        return stringBuffer.toString();
    }

    @Override // org.apache.log4j.Layout
    public String getHeader() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb = new StringBuilder("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
        String str = Layout.LINE_SEP;
        sb.append(str);
        stringBuffer.append(sb.toString());
        stringBuffer.append("<html>" + str);
        stringBuffer.append("<head>" + str);
        stringBuffer.append("<title>" + this.title + "</title>" + str);
        StringBuilder sb2 = new StringBuilder("<style type=\"text/css\">");
        sb2.append(str);
        stringBuffer.append(sb2.toString());
        stringBuffer.append("<!--" + str);
        stringBuffer.append("body, table {font-family: arial,sans-serif; font-size: x-small;}" + str);
        stringBuffer.append("th {background: #336699; color: #FFFFFF; text-align: left;}" + str);
        stringBuffer.append("-->" + str);
        stringBuffer.append("</style>" + str);
        stringBuffer.append("</head>" + str);
        stringBuffer.append("<body bgcolor=\"#FFFFFF\" topmargin=\"6\" leftmargin=\"6\">" + str);
        stringBuffer.append("<hr size=\"1\" noshade>" + str);
        stringBuffer.append("Log session start time " + new Date() + "<br>" + str);
        StringBuilder sb3 = new StringBuilder("<br>");
        sb3.append(str);
        stringBuffer.append(sb3.toString());
        stringBuffer.append("<table cellspacing=\"0\" cellpadding=\"4\" border=\"1\" bordercolor=\"#224466\" width=\"100%\">" + str);
        stringBuffer.append("<tr>" + str);
        stringBuffer.append("<th>Time</th>" + str);
        stringBuffer.append("<th>Thread</th>" + str);
        stringBuffer.append("<th>Level</th>" + str);
        stringBuffer.append("<th>Category</th>" + str);
        if (this.locationInfo) {
            stringBuffer.append("<th>File:Line</th>" + str);
        }
        stringBuffer.append("<th>Message</th>" + str);
        stringBuffer.append("</tr>" + str);
        return stringBuffer.toString();
    }

    public boolean getLocationInfo() {
        return this.locationInfo;
    }

    public String getTitle() {
        return this.title;
    }

    @Override // org.apache.log4j.Layout
    public boolean ignoresThrowable() {
        return false;
    }

    public void setLocationInfo(boolean z4) {
        this.locationInfo = z4;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
