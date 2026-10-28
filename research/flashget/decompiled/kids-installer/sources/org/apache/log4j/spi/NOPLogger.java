package org.apache.log4j.spi;

import java.util.Enumeration;
import java.util.ResourceBundle;
import java.util.Vector;
import org.apache.log4j.Appender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

/* loaded from: classes6.dex */
public final class NOPLogger extends Logger {
    public NOPLogger(NOPLoggerRepository nOPLoggerRepository, String str) {
        super(str);
        this.repository = nOPLoggerRepository;
        this.level = Level.OFF;
        this.parent = this;
    }

    @Override // org.apache.log4j.Category, org.apache.log4j.spi.AppenderAttachable
    public void addAppender(Appender appender) {
    }

    @Override // org.apache.log4j.Category
    public void assertLog(boolean z5, String str) {
    }

    @Override // org.apache.log4j.Category
    public void callAppenders(LoggingEvent loggingEvent) {
    }

    void closeNestedAppenders() {
    }

    @Override // org.apache.log4j.Category
    public void debug(Object obj) {
    }

    @Override // org.apache.log4j.Category
    public void error(Object obj) {
    }

    @Override // org.apache.log4j.Category
    public void fatal(Object obj) {
    }

    @Override // org.apache.log4j.Category, org.apache.log4j.spi.AppenderAttachable
    public Enumeration getAllAppenders() {
        return new Vector().elements();
    }

    @Override // org.apache.log4j.Category, org.apache.log4j.spi.AppenderAttachable
    public Appender getAppender(String str) {
        return null;
    }

    @Override // org.apache.log4j.Category
    public Priority getChainedPriority() {
        return getEffectiveLevel();
    }

    @Override // org.apache.log4j.Category
    public Level getEffectiveLevel() {
        return Level.OFF;
    }

    @Override // org.apache.log4j.Category
    public ResourceBundle getResourceBundle() {
        return null;
    }

    @Override // org.apache.log4j.Category
    public void info(Object obj) {
    }

    @Override // org.apache.log4j.Category, org.apache.log4j.spi.AppenderAttachable
    public boolean isAttached(Appender appender) {
        return false;
    }

    @Override // org.apache.log4j.Category
    public boolean isDebugEnabled() {
        return false;
    }

    @Override // org.apache.log4j.Category
    public boolean isEnabledFor(Priority priority) {
        return false;
    }

    @Override // org.apache.log4j.Category
    public boolean isInfoEnabled() {
        return false;
    }

    @Override // org.apache.log4j.Logger
    public boolean isTraceEnabled() {
        return false;
    }

    @Override // org.apache.log4j.Category
    public void l7dlog(Priority priority, String str, Throwable th) {
    }

    @Override // org.apache.log4j.Category
    public void log(String str, Priority priority, Object obj, Throwable th) {
    }

    @Override // org.apache.log4j.Category, org.apache.log4j.spi.AppenderAttachable
    public void removeAllAppenders() {
    }

    @Override // org.apache.log4j.Category, org.apache.log4j.spi.AppenderAttachable
    public void removeAppender(String str) {
    }

    @Override // org.apache.log4j.Category
    public void setLevel(Level level) {
    }

    @Override // org.apache.log4j.Category
    public void setPriority(Priority priority) {
    }

    @Override // org.apache.log4j.Category
    public void setResourceBundle(ResourceBundle resourceBundle) {
    }

    @Override // org.apache.log4j.Logger
    public void trace(Object obj) {
    }

    @Override // org.apache.log4j.Category
    public void warn(Object obj) {
    }

    @Override // org.apache.log4j.Category
    public void debug(Object obj, Throwable th) {
    }

    @Override // org.apache.log4j.Category
    public void error(Object obj, Throwable th) {
    }

    @Override // org.apache.log4j.Category
    public void fatal(Object obj, Throwable th) {
    }

    @Override // org.apache.log4j.Category
    public void info(Object obj, Throwable th) {
    }

    @Override // org.apache.log4j.Category
    public void l7dlog(Priority priority, String str, Object[] objArr, Throwable th) {
    }

    @Override // org.apache.log4j.Category
    public void log(Priority priority, Object obj) {
    }

    @Override // org.apache.log4j.Category, org.apache.log4j.spi.AppenderAttachable
    public void removeAppender(Appender appender) {
    }

    @Override // org.apache.log4j.Logger
    public void trace(Object obj, Throwable th) {
    }

    @Override // org.apache.log4j.Category
    public void warn(Object obj, Throwable th) {
    }

    @Override // org.apache.log4j.Category
    public void log(Priority priority, Object obj, Throwable th) {
    }
}
