package org.apache.log4j.net;

import java.util.Properties;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.helpers.CyclicBuffer;
import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.spi.TriggeringEventEvaluator;
import org.apache.log4j.xml.UnrecognizedElementHandler;
import org.w3c.dom.Element;

/* loaded from: classes6.dex */
public class SMTPAppender extends AppenderSkeleton implements UnrecognizedElementHandler {
    private String bcc;
    private int bufferSize;
    protected CyclicBuffer cb;
    private String cc;
    protected TriggeringEventEvaluator evaluator;
    private String from;
    private boolean locationInfo;
    protected Message msg;
    private String replyTo;
    private boolean sendOnClose;
    private boolean smtpDebug;
    private String smtpHost;
    private String smtpPassword;
    private int smtpPort;
    private String smtpProtocol;
    private String smtpUsername;
    private String subject;
    private String to;

    public SMTPAppender() {
        throw new Error("Unresolved compilation problems: \n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tMessage cannot be resolved to a type\n\tSession cannot be resolved to a type\n\tThe method createSession() from the type SMTPAppender refers to the missing type Session\n\tMessage cannot be resolved to a type\n\tMimeMessage cannot be resolved to a type\n\tMessage cannot be resolved to a type\n\tMessage cannot be resolved to a type\n\tMimeUtility cannot be resolved\n\tMessagingException cannot be resolved to a type\n\tMessage cannot be resolved to a type\n\tMessagingException cannot be resolved to a type\n\tThe method getAddress(String) from the type SMTPAppender refers to the missing type InternetAddress\n\tThe method parseAddress(String) from the type SMTPAppender refers to the missing type InternetAddress\n\tMessage cannot be resolved to a variable\n\tThe method parseAddress(String) from the type SMTPAppender refers to the missing type InternetAddress\n\tMessage cannot be resolved to a variable\n\tThe method parseAddress(String) from the type SMTPAppender refers to the missing type InternetAddress\n\tMessage cannot be resolved to a variable\n\tThe method parseAddress(String) from the type SMTPAppender refers to the missing type InternetAddress\n\tSession cannot be resolved to a type\n\tAuthenticator cannot be resolved to a type\n\tAuthenticator cannot be resolved to a type\n\tPasswordAuthentication cannot be resolved to a type\n\tPasswordAuthentication cannot be resolved to a type\n\tSession cannot be resolved to a type\n\tSession cannot be resolved\n\tMessage cannot be resolved to a type\n\tInternetAddress cannot be resolved to a type\n\tInternetAddress cannot be resolved to a type\n\tAddressException cannot be resolved to a type\n\tInternetAddress cannot be resolved to a type\n\tInternetAddress cannot be resolved\n\tAddressException cannot be resolved to a type\n\tMimeBodyPart cannot be resolved to a type\n\tMimeBodyPart cannot be resolved to a type\n\tMimeUtility cannot be resolved\n\tInternetHeaders cannot be resolved to a type\n\tInternetHeaders cannot be resolved to a type\n\tMimeBodyPart cannot be resolved to a type\n\tMimeBodyPart cannot be resolved to a type\n\tMultipart cannot be resolved to a type\n\tMimeMultipart cannot be resolved to a type\n\tMessage cannot be resolved to a type\n\tMessage cannot be resolved to a type\n\tTransport cannot be resolved\n\tMessage cannot be resolved to a type\n\tMessagingException cannot be resolved to a type\n");
    }

    @Override // org.apache.log4j.AppenderSkeleton, org.apache.log4j.spi.OptionHandler
    public void activateOptions() {
        throw new Error("Unresolved compilation problems: \n\tSession cannot be resolved to a type\n\tThe method createSession() from the type SMTPAppender refers to the missing type Session\n\tMessage cannot be resolved to a type\n\tMimeMessage cannot be resolved to a type\n\tMessage cannot be resolved to a type\n\tMessage cannot be resolved to a type\n\tMimeUtility cannot be resolved\n\tMessagingException cannot be resolved to a type\n");
    }

    protected void addressMessage(Message message) throws MessagingException {
        throw new Error("Unresolved compilation problems: \n\tMessage cannot be resolved to a type\n\tMessagingException cannot be resolved to a type\n\tThe method getAddress(String) from the type SMTPAppender refers to the missing type InternetAddress\n\tThe method parseAddress(String) from the type SMTPAppender refers to the missing type InternetAddress\n\tMessage cannot be resolved to a variable\n\tThe method parseAddress(String) from the type SMTPAppender refers to the missing type InternetAddress\n\tMessage cannot be resolved to a variable\n\tThe method parseAddress(String) from the type SMTPAppender refers to the missing type InternetAddress\n\tMessage cannot be resolved to a variable\n\tThe method parseAddress(String) from the type SMTPAppender refers to the missing type InternetAddress\n");
    }

    @Override // org.apache.log4j.AppenderSkeleton
    public void append(LoggingEvent loggingEvent) {
        throw new Error("Unresolved compilation problem: \n");
    }

    protected boolean checkEntryConditions() {
        throw new Error("Unresolved compilation problem: \n\tMessage cannot be resolved to a type\n");
    }

    @Override // org.apache.log4j.Appender
    public synchronized void close() {
        throw new Error("Unresolved compilation problem: \n");
    }

    protected Session createSession() {
        throw new Error("Unresolved compilation problems: \n\tSession cannot be resolved to a type\n\tAuthenticator cannot be resolved to a type\n\tAuthenticator cannot be resolved to a type\n\tPasswordAuthentication cannot be resolved to a type\n\tPasswordAuthentication cannot be resolved to a type\n\tSession cannot be resolved to a type\n\tSession cannot be resolved\n");
    }

    protected String formatBody() {
        throw new Error("Unresolved compilation problem: \n");
    }

    InternetAddress getAddress(String str) {
        throw new Error("Unresolved compilation problems: \n\tInternetAddress cannot be resolved to a type\n\tInternetAddress cannot be resolved to a type\n\tAddressException cannot be resolved to a type\n");
    }

    public String getBcc() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public int getBufferSize() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public String getCc() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public final TriggeringEventEvaluator getEvaluator() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public String getEvaluatorClass() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public String getFrom() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public boolean getLocationInfo() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public String getReplyTo() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public boolean getSMTPDebug() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public String getSMTPHost() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public String getSMTPPassword() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public final int getSMTPPort() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public final String getSMTPProtocol() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public String getSMTPUsername() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public final boolean getSendOnClose() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public String getSubject() {
        throw new Error("Unresolved compilation problem: \n");
    }

    public String getTo() {
        throw new Error("Unresolved compilation problem: \n");
    }

    InternetAddress[] parseAddress(String str) {
        throw new Error("Unresolved compilation problems: \n\tInternetAddress cannot be resolved to a type\n\tInternetAddress cannot be resolved\n\tAddressException cannot be resolved to a type\n");
    }

    @Override // org.apache.log4j.xml.UnrecognizedElementHandler
    public boolean parseUnrecognizedElement(Element element, Properties properties) throws Exception {
        throw new Error("Unresolved compilation problem: \n");
    }

    @Override // org.apache.log4j.Appender
    public boolean requiresLayout() {
        throw new Error("Unresolved compilation problem: \n");
    }

    protected void sendBuffer() {
        throw new Error("Unresolved compilation problems: \n\tMimeBodyPart cannot be resolved to a type\n\tMimeBodyPart cannot be resolved to a type\n\tMimeUtility cannot be resolved\n\tInternetHeaders cannot be resolved to a type\n\tInternetHeaders cannot be resolved to a type\n\tMimeBodyPart cannot be resolved to a type\n\tMimeBodyPart cannot be resolved to a type\n\tMultipart cannot be resolved to a type\n\tMimeMultipart cannot be resolved to a type\n\tMessage cannot be resolved to a type\n\tMessage cannot be resolved to a type\n\tTransport cannot be resolved\n\tMessage cannot be resolved to a type\n\tMessagingException cannot be resolved to a type\n");
    }

    public void setBcc(String str) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public void setBufferSize(int i5) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public void setCc(String str) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public final void setEvaluator(TriggeringEventEvaluator triggeringEventEvaluator) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public void setEvaluatorClass(String str) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public void setFrom(String str) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public void setLocationInfo(boolean z5) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public void setReplyTo(String str) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public void setSMTPDebug(boolean z5) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public void setSMTPHost(String str) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public void setSMTPPassword(String str) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public final void setSMTPPort(int i5) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public final void setSMTPProtocol(String str) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public void setSMTPUsername(String str) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public final void setSendOnClose(boolean z5) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public void setSubject(String str) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public void setTo(String str) {
        throw new Error("Unresolved compilation problem: \n");
    }

    public SMTPAppender(TriggeringEventEvaluator triggeringEventEvaluator) {
        throw new Error("Unresolved compilation problems: \n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tThe import javax.mail cannot be resolved\n\tMessage cannot be resolved to a type\n\tSession cannot be resolved to a type\n\tThe method createSession() from the type SMTPAppender refers to the missing type Session\n\tMessage cannot be resolved to a type\n\tMimeMessage cannot be resolved to a type\n\tMessage cannot be resolved to a type\n\tMessage cannot be resolved to a type\n\tMimeUtility cannot be resolved\n\tMessagingException cannot be resolved to a type\n\tMessage cannot be resolved to a type\n\tMessagingException cannot be resolved to a type\n\tThe method getAddress(String) from the type SMTPAppender refers to the missing type InternetAddress\n\tThe method parseAddress(String) from the type SMTPAppender refers to the missing type InternetAddress\n\tMessage cannot be resolved to a variable\n\tThe method parseAddress(String) from the type SMTPAppender refers to the missing type InternetAddress\n\tMessage cannot be resolved to a variable\n\tThe method parseAddress(String) from the type SMTPAppender refers to the missing type InternetAddress\n\tMessage cannot be resolved to a variable\n\tThe method parseAddress(String) from the type SMTPAppender refers to the missing type InternetAddress\n\tSession cannot be resolved to a type\n\tAuthenticator cannot be resolved to a type\n\tAuthenticator cannot be resolved to a type\n\tPasswordAuthentication cannot be resolved to a type\n\tPasswordAuthentication cannot be resolved to a type\n\tSession cannot be resolved to a type\n\tSession cannot be resolved\n\tMessage cannot be resolved to a type\n\tInternetAddress cannot be resolved to a type\n\tInternetAddress cannot be resolved to a type\n\tAddressException cannot be resolved to a type\n\tInternetAddress cannot be resolved to a type\n\tInternetAddress cannot be resolved\n\tAddressException cannot be resolved to a type\n\tMimeBodyPart cannot be resolved to a type\n\tMimeBodyPart cannot be resolved to a type\n\tMimeUtility cannot be resolved\n\tInternetHeaders cannot be resolved to a type\n\tInternetHeaders cannot be resolved to a type\n\tMimeBodyPart cannot be resolved to a type\n\tMimeBodyPart cannot be resolved to a type\n\tMultipart cannot be resolved to a type\n\tMimeMultipart cannot be resolved to a type\n\tMessage cannot be resolved to a type\n\tMessage cannot be resolved to a type\n\tTransport cannot be resolved\n\tMessage cannot be resolved to a type\n\tMessagingException cannot be resolved to a type\n");
    }
}
