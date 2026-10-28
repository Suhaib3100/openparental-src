package de.mindpipe.android.logging.log4j;

import android.support.v4.media.session.PlaybackStateCompat;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;
import org.apache.log4j.helpers.LogLog;

/* loaded from: classes7.dex */
public class LogConfigurator {
    private String fileName;
    private String filePattern;
    private boolean immediateFlush;
    private boolean internalDebugging;
    private String logCatPattern;
    private int maxBackupSize;
    private long maxFileSize;
    private boolean resetConfiguration;
    private Level rootLevel;
    private boolean useFileAppender;
    private boolean useLogCatAppender;

    public LogConfigurator() {
        this.rootLevel = Level.DEBUG;
        this.filePattern = ProtectedSandApp.s("怷\u0001");
        this.logCatPattern = ProtectedSandApp.s("怸\u0001");
        this.fileName = ProtectedSandApp.s("怹\u0001");
        this.maxBackupSize = 5;
        this.maxFileSize = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
        this.immediateFlush = true;
        this.useLogCatAppender = true;
        this.useFileAppender = true;
        this.resetConfiguration = true;
        this.internalDebugging = false;
    }

    private void configureFileAppender() {
        Logger rootLogger = Logger.getRootLogger();
        try {
            RollingFileAppender rollingFileAppender = new RollingFileAppender(new PatternLayout(getFilePattern()), getFileName());
            rollingFileAppender.setMaxBackupIndex(getMaxBackupSize());
            rollingFileAppender.setMaximumFileSize(getMaxFileSize());
            rollingFileAppender.setImmediateFlush(isImmediateFlush());
            rootLogger.addAppender(rollingFileAppender);
        } catch (IOException e4) {
            throw new RuntimeException(ProtectedSandApp.s("怺\u0001"), e4);
        }
    }

    private void configureLogCatAppender() {
        Logger.getRootLogger().addAppender(new LogCatAppender(new PatternLayout(getLogCatPattern())));
    }

    public void configure() {
        Logger rootLogger = Logger.getRootLogger();
        if (isResetConfiguration()) {
            LogManager.getLoggerRepository().resetConfiguration();
        }
        LogLog.setInternalDebugging(isInternalDebugging());
        if (isUseFileAppender()) {
            configureFileAppender();
        }
        if (isUseLogCatAppender()) {
            configureLogCatAppender();
        }
        rootLogger.setLevel(getRootLevel());
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getFilePattern() {
        return this.filePattern;
    }

    public String getLogCatPattern() {
        return this.logCatPattern;
    }

    public int getMaxBackupSize() {
        return this.maxBackupSize;
    }

    public long getMaxFileSize() {
        return this.maxFileSize;
    }

    public Level getRootLevel() {
        return this.rootLevel;
    }

    public boolean isImmediateFlush() {
        return this.immediateFlush;
    }

    public boolean isInternalDebugging() {
        return this.internalDebugging;
    }

    public boolean isResetConfiguration() {
        return this.resetConfiguration;
    }

    public boolean isUseFileAppender() {
        return this.useFileAppender;
    }

    public boolean isUseLogCatAppender() {
        return this.useLogCatAppender;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setFilePattern(String str) {
        this.filePattern = str;
    }

    public void setImmediateFlush(boolean z4) {
        this.immediateFlush = z4;
    }

    public void setInternalDebugging(boolean z4) {
        this.internalDebugging = z4;
    }

    public void setLevel(String str, Level level) {
        Logger.getLogger(str).setLevel(level);
    }

    public void setLogCatPattern(String str) {
        this.logCatPattern = str;
    }

    public void setMaxBackupSize(int i4) {
        this.maxBackupSize = i4;
    }

    public void setMaxFileSize(long j4) {
        this.maxFileSize = j4;
    }

    public void setResetConfiguration(boolean z4) {
        this.resetConfiguration = z4;
    }

    public void setRootLevel(Level level) {
        this.rootLevel = level;
    }

    public void setUseFileAppender(boolean z4) {
        this.useFileAppender = z4;
    }

    public void setUseLogCatAppender(boolean z4) {
        this.useLogCatAppender = z4;
    }

    public LogConfigurator(String str) {
        this.rootLevel = Level.DEBUG;
        this.filePattern = ProtectedSandApp.s("怷\u0001");
        this.logCatPattern = ProtectedSandApp.s("怸\u0001");
        this.fileName = ProtectedSandApp.s("怹\u0001");
        this.maxBackupSize = 5;
        this.maxFileSize = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
        this.immediateFlush = true;
        this.useLogCatAppender = true;
        this.useFileAppender = true;
        this.resetConfiguration = true;
        this.internalDebugging = false;
        setFileName(str);
    }

    public LogConfigurator(String str, Level level) {
        this(str);
        setRootLevel(level);
    }

    public LogConfigurator(String str, Level level, String str2) {
        this(str);
        setRootLevel(level);
        setFilePattern(str2);
    }

    public LogConfigurator(String str, int i4, long j4, String str2, Level level) {
        this(str, level, str2);
        setMaxBackupSize(i4);
        setMaxFileSize(j4);
    }
}
