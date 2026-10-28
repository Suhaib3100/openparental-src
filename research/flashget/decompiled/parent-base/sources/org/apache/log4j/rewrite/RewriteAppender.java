package org.apache.log4j.rewrite;

import java.util.Enumeration;
import java.util.Properties;
import org.apache.log4j.Appender;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.helpers.AppenderAttachableImpl;
import org.apache.log4j.spi.AppenderAttachable;
import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.spi.OptionHandler;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.log4j.xml.UnrecognizedElementHandler;
import org.w3c.dom.Element;

/* loaded from: classes3.dex */
public class RewriteAppender extends AppenderSkeleton implements AppenderAttachable, UnrecognizedElementHandler {
    private final AppenderAttachableImpl appenders = new AppenderAttachableImpl();
    private RewritePolicy policy;

    @Override // org.apache.log4j.spi.AppenderAttachable
    public void addAppender(Appender appender) {
        synchronized (this.appenders) {
            this.appenders.addAppender(appender);
        }
    }

    @Override // org.apache.log4j.AppenderSkeleton
    protected void append(LoggingEvent loggingEvent) {
        RewritePolicy rewritePolicy = this.policy;
        if (rewritePolicy != null) {
            loggingEvent = rewritePolicy.rewrite(loggingEvent);
        }
        if (loggingEvent != null) {
            synchronized (this.appenders) {
                this.appenders.appendLoopOnAppenders(loggingEvent);
            }
        }
    }

    @Override // org.apache.log4j.Appender
    public void close() {
        this.closed = true;
        synchronized (this.appenders) {
            try {
                Enumeration allAppenders = this.appenders.getAllAppenders();
                if (allAppenders != null) {
                    while (allAppenders.hasMoreElements()) {
                        Object nextElement = allAppenders.nextElement();
                        if (nextElement instanceof Appender) {
                            ((Appender) nextElement).close();
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // org.apache.log4j.spi.AppenderAttachable
    public Enumeration getAllAppenders() {
        Enumeration allAppenders;
        synchronized (this.appenders) {
            allAppenders = this.appenders.getAllAppenders();
        }
        return allAppenders;
    }

    @Override // org.apache.log4j.spi.AppenderAttachable
    public Appender getAppender(String str) {
        Appender appender;
        synchronized (this.appenders) {
            appender = this.appenders.getAppender(str);
        }
        return appender;
    }

    @Override // org.apache.log4j.spi.AppenderAttachable
    public boolean isAttached(Appender appender) {
        boolean isAttached;
        synchronized (this.appenders) {
            isAttached = this.appenders.isAttached(appender);
        }
        return isAttached;
    }

    @Override // org.apache.log4j.xml.UnrecognizedElementHandler
    public boolean parseUnrecognizedElement(Element element, Properties properties) throws Exception {
        if (!"rewritePolicy".equals(element.getNodeName())) {
            return false;
        }
        Object parseElement = DOMConfigurator.parseElement(element, properties, RewritePolicy.class);
        if (parseElement == null) {
            return true;
        }
        if (parseElement instanceof OptionHandler) {
            ((OptionHandler) parseElement).activateOptions();
        }
        setRewritePolicy((RewritePolicy) parseElement);
        return true;
    }

    @Override // org.apache.log4j.spi.AppenderAttachable
    public void removeAllAppenders() {
        synchronized (this.appenders) {
            this.appenders.removeAllAppenders();
        }
    }

    @Override // org.apache.log4j.spi.AppenderAttachable
    public void removeAppender(Appender appender) {
        synchronized (this.appenders) {
            this.appenders.removeAppender(appender);
        }
    }

    @Override // org.apache.log4j.Appender
    public boolean requiresLayout() {
        return false;
    }

    public void setRewritePolicy(RewritePolicy rewritePolicy) {
        this.policy = rewritePolicy;
    }

    @Override // org.apache.log4j.spi.AppenderAttachable
    public void removeAppender(String str) {
        synchronized (this.appenders) {
            this.appenders.removeAppender(str);
        }
    }
}
