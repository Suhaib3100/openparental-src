package org.apache.log4j.helpers;

import java.util.Enumeration;
import java.util.Vector;
import org.apache.log4j.Appender;
import org.apache.log4j.spi.AppenderAttachable;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public class AppenderAttachableImpl implements AppenderAttachable {
    protected Vector appenderList;

    @Override // org.apache.log4j.spi.AppenderAttachable
    public void addAppender(Appender appender) {
        if (appender == null) {
            return;
        }
        if (this.appenderList == null) {
            this.appenderList = new Vector(1);
        }
        if (this.appenderList.contains(appender)) {
            return;
        }
        this.appenderList.addElement(appender);
    }

    public int appendLoopOnAppenders(LoggingEvent loggingEvent) {
        Vector vector = this.appenderList;
        if (vector == null) {
            return 0;
        }
        int size = vector.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((Appender) this.appenderList.elementAt(i4)).doAppend(loggingEvent);
        }
        return size;
    }

    @Override // org.apache.log4j.spi.AppenderAttachable
    public Enumeration getAllAppenders() {
        Vector vector = this.appenderList;
        if (vector == null) {
            return null;
        }
        return vector.elements();
    }

    @Override // org.apache.log4j.spi.AppenderAttachable
    public Appender getAppender(String str) {
        Vector vector = this.appenderList;
        if (vector == null || str == null) {
            return null;
        }
        int size = vector.size();
        for (int i4 = 0; i4 < size; i4++) {
            Appender appender = (Appender) this.appenderList.elementAt(i4);
            if (str.equals(appender.getName())) {
                return appender;
            }
        }
        return null;
    }

    @Override // org.apache.log4j.spi.AppenderAttachable
    public boolean isAttached(Appender appender) {
        Vector vector = this.appenderList;
        if (vector == null || appender == null) {
            return false;
        }
        int size = vector.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((Appender) this.appenderList.elementAt(i4)) == appender) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.log4j.spi.AppenderAttachable
    public void removeAllAppenders() {
        Vector vector = this.appenderList;
        if (vector != null) {
            int size = vector.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((Appender) this.appenderList.elementAt(i4)).close();
            }
            this.appenderList.removeAllElements();
            this.appenderList = null;
        }
    }

    @Override // org.apache.log4j.spi.AppenderAttachable
    public void removeAppender(Appender appender) {
        Vector vector;
        if (appender == null || (vector = this.appenderList) == null) {
            return;
        }
        vector.removeElement(appender);
    }

    @Override // org.apache.log4j.spi.AppenderAttachable
    public void removeAppender(String str) {
        Vector vector;
        if (str == null || (vector = this.appenderList) == null) {
            return;
        }
        int size = vector.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (str.equals(((Appender) this.appenderList.elementAt(i4)).getName())) {
                this.appenderList.removeElementAt(i4);
                return;
            }
        }
    }
}
