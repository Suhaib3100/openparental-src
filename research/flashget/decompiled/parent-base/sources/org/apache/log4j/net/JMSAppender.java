package org.apache.log4j.net;

import javax.naming.Context;
import javax.naming.NamingException;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public class JMSAppender extends AppenderSkeleton {
    String initialContextFactoryName;
    boolean locationInfo;
    String password;
    String providerURL;
    String securityCredentials;
    String securityPrincipalName;
    String tcfBindingName;
    String topicBindingName;
    TopicConnection topicConnection;
    TopicPublisher topicPublisher;
    TopicSession topicSession;
    String urlPkgPrefixes;
    String userName;

    public JMSAppender() {
        throw new Error("Unresolved compilation problems: \n\tThe import javax.jms cannot be resolved\n\tThe import javax.jms cannot be resolved\n\tThe import javax.jms cannot be resolved\n\tThe import javax.jms cannot be resolved\n\tThe import javax.jms cannot be resolved\n\tThe import javax.jms cannot be resolved\n\tThe import javax.jms cannot be resolved\n\tThe import javax.jms cannot be resolved\n\tTopicConnection cannot be resolved to a type\n\tTopicSession cannot be resolved to a type\n\tTopicPublisher cannot be resolved to a type\n\tTopicConnectionFactory cannot be resolved to a type\n\tTopicConnectionFactory cannot be resolved to a type\n\tTopicConnection cannot be resolved to a type\n\tTopicConnection cannot be resolved to a type\n\tTopicSession cannot be resolved to a type\n\tTopicConnection cannot be resolved to a type\n\tSession cannot be resolved to a variable\n\tTopic cannot be resolved to a type\n\tTopic cannot be resolved to a type\n\tTopicPublisher cannot be resolved to a type\n\tTopicSession cannot be resolved to a type\n\tTopicConnection cannot be resolved to a type\n\tJMSException cannot be resolved to a type\n\tTopicConnection cannot be resolved to a type\n\tTopicSession cannot be resolved to a type\n\tTopicPublisher cannot be resolved to a type\n\tTopicSession cannot be resolved to a type\n\tTopicSession cannot be resolved to a type\n\tTopicConnection cannot be resolved to a type\n\tTopicConnection cannot be resolved to a type\n\tJMSException cannot be resolved to a type\n\tTopicPublisher cannot be resolved to a type\n\tTopicSession cannot be resolved to a type\n\tTopicConnection cannot be resolved to a type\n\tObjectMessage cannot be resolved to a type\n\tTopicSession cannot be resolved to a type\n\tTopicPublisher cannot be resolved to a type\n\tJMSException cannot be resolved to a type\n\tTopicConnection cannot be resolved to a type\n\tTopicConnection cannot be resolved to a type\n\tTopicSession cannot be resolved to a type\n\tTopicSession cannot be resolved to a type\n\tTopicPublisher cannot be resolved to a type\n\tTopicPublisher cannot be resolved to a type\n");
    }

    @Override // org.apache.log4j.AppenderSkeleton, org.apache.log4j.spi.OptionHandler
    public void activateOptions() {
        throw new Error("Unresolved compilation problems: \n\tTopicConnectionFactory cannot be resolved to a type\n\tTopicConnectionFactory cannot be resolved to a type\n\tTopicConnection cannot be resolved to a type\n\tTopicConnection cannot be resolved to a type\n\tTopicSession cannot be resolved to a type\n\tTopicConnection cannot be resolved to a type\n\tSession cannot be resolved to a variable\n\tTopic cannot be resolved to a type\n\tTopic cannot be resolved to a type\n\tTopicPublisher cannot be resolved to a type\n\tTopicSession cannot be resolved to a type\n\tTopicConnection cannot be resolved to a type\n\tJMSException cannot be resolved to a type\n");
    }

    @Override // org.apache.log4j.AppenderSkeleton
    public void append(LoggingEvent loggingEvent) {
        throw new Error("Unresolved compilation problems: \n\tObjectMessage cannot be resolved to a type\n\tTopicSession cannot be resolved to a type\n\tTopicPublisher cannot be resolved to a type\n\tJMSException cannot be resolved to a type\n");
    }

    protected boolean checkEntryConditions() {
        throw new Error("Unresolved compilation problems: \n\tTopicConnection cannot be resolved to a type\n\tTopicSession cannot be resolved to a type\n\tTopicPublisher cannot be resolved to a type\n");
    }

    @Override // org.apache.log4j.Appender
    public synchronized void close() {
        throw new Error("Unresolved compilation problems: \n\tTopicSession cannot be resolved to a type\n\tTopicSession cannot be resolved to a type\n\tTopicConnection cannot be resolved to a type\n\tTopicConnection cannot be resolved to a type\n\tJMSException cannot be resolved to a type\n\tTopicPublisher cannot be resolved to a type\n\tTopicSession cannot be resolved to a type\n\tTopicConnection cannot be resolved to a type\n");
    }

    public String getInitialContextFactoryName() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public boolean getLocationInfo() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public String getPassword() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public String getProviderURL() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public String getSecurityCredentials() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public String getSecurityPrincipalName() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public String getTopicBindingName() {
        throw new Error("Unresolved compilation problem: \n");
    }

    protected TopicConnection getTopicConnection() {
        throw new Error("Unresolved compilation problems: \n\tTopicConnection cannot be resolved to a type\n\tTopicConnection cannot be resolved to a type\n");
    }

    public String getTopicConnectionFactoryBindingName() {
        throw new Error("Unresolved compilation problem: \n");
    }

    protected TopicPublisher getTopicPublisher() {
        throw new Error("Unresolved compilation problems: \n\tTopicPublisher cannot be resolved to a type\n\tTopicPublisher cannot be resolved to a type\n");
    }

    protected TopicSession getTopicSession() {
        throw new Error("Unresolved compilation problems: \n\tTopicSession cannot be resolved to a type\n\tTopicSession cannot be resolved to a type\n");
    }

    String getURLPkgPrefixes() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public String getUserName() {
        throw new Error("Unresolved compilation problem: \n");
    }

    protected Object lookup(Context context, String str) throws NamingException {
        throw new Error("Unresolved compilation problem: \n");
    }

    @Override // org.apache.log4j.Appender
    public boolean requiresLayout() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public void setInitialContextFactoryName(String str) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public void setLocationInfo(boolean z4) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public void setPassword(String str) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public void setProviderURL(String str) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public void setSecurityCredentials(String str) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public void setSecurityPrincipalName(String str) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public void setTopicBindingName(String str) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public void setTopicConnectionFactoryBindingName(String str) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public void setURLPkgPrefixes(String str) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public void setUserName(String str) {
        throw new Error("Unresolved compilation problem: \n");
    }
}
