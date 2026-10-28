package org.apache.log4j;

import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public class DailyRollingFileAppender extends FileAppender {
    static final int HALF_DAY = 2;
    static final int TOP_OF_DAY = 3;
    static final int TOP_OF_HOUR = 1;
    static final int TOP_OF_MINUTE = 0;
    static final int TOP_OF_MONTH = 5;
    static final int TOP_OF_TROUBLE = -1;
    static final int TOP_OF_WEEK = 4;
    static final TimeZone gmtTimeZone = TimeZone.getTimeZone("GMT");
    int checkPeriod;
    private String datePattern;
    private long nextCheck;
    Date now;

    /* renamed from: rc, reason: collision with root package name */
    RollingCalendar f86715rc;
    private String scheduledFilename;
    SimpleDateFormat sdf;

    public DailyRollingFileAppender() {
        this.datePattern = "'.'yyyy-MM-dd";
        this.nextCheck = System.currentTimeMillis() - 1;
        this.now = new Date();
        this.f86715rc = new RollingCalendar();
        this.checkPeriod = -1;
    }

    @Override // org.apache.log4j.FileAppender, org.apache.log4j.WriterAppender, org.apache.log4j.AppenderSkeleton, org.apache.log4j.spi.OptionHandler
    public void activateOptions() {
        super.activateOptions();
        if (this.datePattern == null || this.fileName == null) {
            LogLog.error("Either File or DatePattern options are not set for appender [" + this.name + "].");
            return;
        }
        this.now.setTime(System.currentTimeMillis());
        this.sdf = new SimpleDateFormat(this.datePattern);
        int computeCheckPeriod = computeCheckPeriod();
        printPeriodicity(computeCheckPeriod);
        this.f86715rc.setType(computeCheckPeriod);
        this.scheduledFilename = String.valueOf(this.fileName) + this.sdf.format(new Date(new File(this.fileName).lastModified()));
    }

    int computeCheckPeriod() {
        RollingCalendar rollingCalendar = new RollingCalendar(gmtTimeZone, Locale.getDefault());
        Date date = new Date(0L);
        if (this.datePattern == null) {
            return -1;
        }
        for (int i4 = 0; i4 <= 5; i4++) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.datePattern);
            simpleDateFormat.setTimeZone(gmtTimeZone);
            String format = simpleDateFormat.format(date);
            rollingCalendar.setType(i4);
            String format2 = simpleDateFormat.format(new Date(rollingCalendar.getNextCheckMillis(date)));
            if (format != null && format2 != null && !format.equals(format2)) {
                return i4;
            }
        }
        return -1;
    }

    public String getDatePattern() {
        return this.datePattern;
    }

    void printPeriodicity(int i4) {
        if (i4 == 0) {
            LogLog.debug("Appender [" + this.name + "] to be rolled every minute.");
            return;
        }
        if (i4 == 1) {
            LogLog.debug("Appender [" + this.name + "] to be rolled on top of every hour.");
            return;
        }
        if (i4 == 2) {
            LogLog.debug("Appender [" + this.name + "] to be rolled at midday and midnight.");
            return;
        }
        if (i4 == 3) {
            LogLog.debug("Appender [" + this.name + "] to be rolled at midnight.");
            return;
        }
        if (i4 == 4) {
            LogLog.debug("Appender [" + this.name + "] to be rolled at start of week.");
            return;
        }
        if (i4 != 5) {
            LogLog.warn("Unknown periodicity for appender [" + this.name + "].");
            return;
        }
        LogLog.debug("Appender [" + this.name + "] to be rolled at start of every month.");
    }

    void rollOver() throws IOException {
        if (this.datePattern == null) {
            this.errorHandler.error("Missing DatePattern option in rollOver().");
            return;
        }
        String str = String.valueOf(this.fileName) + this.sdf.format(this.now);
        if (this.scheduledFilename.equals(str)) {
            return;
        }
        closeFile();
        File file = new File(this.scheduledFilename);
        if (file.exists()) {
            file.delete();
        }
        if (new File(this.fileName).renameTo(file)) {
            LogLog.debug(String.valueOf(this.fileName) + " -> " + this.scheduledFilename);
        } else {
            LogLog.error("Failed to rename [" + this.fileName + "] to [" + this.scheduledFilename + "].");
        }
        try {
            setFile(this.fileName, true, this.bufferedIO, this.bufferSize);
        } catch (IOException unused) {
            this.errorHandler.error("setFile(" + this.fileName + ", true) call failed.");
        }
        this.scheduledFilename = str;
    }

    public void setDatePattern(String str) {
        this.datePattern = str;
    }

    @Override // org.apache.log4j.WriterAppender
    protected void subAppend(LoggingEvent loggingEvent) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= this.nextCheck) {
            this.now.setTime(currentTimeMillis);
            this.nextCheck = this.f86715rc.getNextCheckMillis(this.now);
            try {
                rollOver();
            } catch (IOException e4) {
                if (e4 instanceof InterruptedIOException) {
                    Thread.currentThread().interrupt();
                }
                LogLog.error("rollOver() failed.", e4);
            }
        }
        super.subAppend(loggingEvent);
    }

    public DailyRollingFileAppender(Layout layout, String str, String str2) throws IOException {
        super(layout, str, true);
        this.datePattern = "'.'yyyy-MM-dd";
        this.nextCheck = System.currentTimeMillis() - 1;
        this.now = new Date();
        this.f86715rc = new RollingCalendar();
        this.checkPeriod = -1;
        this.datePattern = str2;
        activateOptions();
    }
}
