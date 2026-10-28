package org.apache.log4j.net;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.Layout;
import org.apache.log4j.helpers.SyslogQuietWriter;
import org.apache.log4j.helpers.SyslogWriter;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public class SyslogAppender extends AppenderSkeleton {
    protected static final int FACILITY_OI = 1;
    public static final int LOG_AUTH = 32;
    public static final int LOG_AUTHPRIV = 80;
    public static final int LOG_CRON = 72;
    public static final int LOG_DAEMON = 24;
    public static final int LOG_FTP = 88;
    public static final int LOG_KERN = 0;
    public static final int LOG_LOCAL0 = 128;
    public static final int LOG_LOCAL1 = 136;
    public static final int LOG_LOCAL2 = 144;
    public static final int LOG_LOCAL3 = 152;
    public static final int LOG_LOCAL4 = 160;
    public static final int LOG_LOCAL5 = 168;
    public static final int LOG_LOCAL6 = 176;
    public static final int LOG_LOCAL7 = 184;
    public static final int LOG_LPR = 48;
    public static final int LOG_MAIL = 16;
    public static final int LOG_NEWS = 56;
    public static final int LOG_SYSLOG = 40;
    public static final int LOG_USER = 8;
    public static final int LOG_UUCP = 64;
    protected static final int SYSLOG_HOST_OI = 0;
    static final String TAB = "    ";
    private final SimpleDateFormat dateFormat;
    boolean facilityPrinting;
    String facilityStr;
    private boolean header;
    private boolean layoutHeaderChecked;
    private String localHostname;
    SyslogQuietWriter sqw;
    int syslogFacility;
    String syslogHost;

    public SyslogAppender() {
        this.syslogFacility = 8;
        this.facilityPrinting = false;
        this.header = false;
        this.dateFormat = new SimpleDateFormat("MMM dd HH:mm:ss ", Locale.ENGLISH);
        this.layoutHeaderChecked = false;
        initSyslogFacilityStr();
    }

    public static int getFacility(String str) {
        if (str != null) {
            str = str.trim();
        }
        if ("KERN".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("USER".equalsIgnoreCase(str)) {
            return 8;
        }
        if ("MAIL".equalsIgnoreCase(str)) {
            return 16;
        }
        if ("DAEMON".equalsIgnoreCase(str)) {
            return 24;
        }
        if ("AUTH".equalsIgnoreCase(str)) {
            return 32;
        }
        if ("SYSLOG".equalsIgnoreCase(str)) {
            return 40;
        }
        if ("LPR".equalsIgnoreCase(str)) {
            return 48;
        }
        if ("NEWS".equalsIgnoreCase(str)) {
            return 56;
        }
        if ("UUCP".equalsIgnoreCase(str)) {
            return 64;
        }
        if ("CRON".equalsIgnoreCase(str)) {
            return 72;
        }
        if ("AUTHPRIV".equalsIgnoreCase(str)) {
            return 80;
        }
        if ("FTP".equalsIgnoreCase(str)) {
            return 88;
        }
        if ("LOCAL0".equalsIgnoreCase(str)) {
            return 128;
        }
        if ("LOCAL1".equalsIgnoreCase(str)) {
            return LOG_LOCAL1;
        }
        if ("LOCAL2".equalsIgnoreCase(str)) {
            return 144;
        }
        if ("LOCAL3".equalsIgnoreCase(str)) {
            return LOG_LOCAL3;
        }
        if ("LOCAL4".equalsIgnoreCase(str)) {
            return 160;
        }
        if ("LOCAL5".equalsIgnoreCase(str)) {
            return LOG_LOCAL5;
        }
        if ("LOCAL6".equalsIgnoreCase(str)) {
            return LOG_LOCAL6;
        }
        if ("LOCAL7".equalsIgnoreCase(str)) {
            return LOG_LOCAL7;
        }
        return -1;
    }

    public static String getFacilityString(int i4) {
        switch (i4) {
            case 0:
                return "kern";
            case 8:
                return "user";
            case 16:
                return "mail";
            case 24:
                return "daemon";
            case 32:
                return "auth";
            case 40:
                return "syslog";
            case 48:
                return "lpr";
            case 56:
                return "news";
            case 64:
                return "uucp";
            case 72:
                return "cron";
            case 80:
                return "authpriv";
            case 88:
                return "ftp";
            case 128:
                return "local0";
            case LOG_LOCAL1 /* 136 */:
                return "local1";
            case 144:
                return "local2";
            case LOG_LOCAL3 /* 152 */:
                return "local3";
            case 160:
                return "local4";
            case LOG_LOCAL5 /* 168 */:
                return "local5";
            case LOG_LOCAL6 /* 176 */:
                return "local6";
            case LOG_LOCAL7 /* 184 */:
                return "local7";
            default:
                return null;
        }
    }

    private String getLocalHostname() {
        if (this.localHostname == null) {
            try {
                this.localHostname = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException unused) {
                this.localHostname = "UNKNOWN_HOST";
            }
        }
        return this.localHostname;
    }

    private String getPacketHeader(long j4) {
        if (!this.header) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(this.dateFormat.format(new Date(j4)));
        if (stringBuffer.charAt(4) == '0') {
            stringBuffer.setCharAt(4, ' ');
        }
        stringBuffer.append(getLocalHostname());
        stringBuffer.append(' ');
        return stringBuffer.toString();
    }

    private void initSyslogFacilityStr() {
        String facilityString = getFacilityString(this.syslogFacility);
        this.facilityStr = facilityString;
        if (facilityString != null) {
            this.facilityStr = String.valueOf(facilityString).concat(":");
            return;
        }
        System.err.println("\"" + this.syslogFacility + "\" is an unknown syslog facility. Defaulting to \"USER\".");
        this.syslogFacility = 8;
        this.facilityStr = "user:";
    }

    private void sendLayoutMessage(String str) {
        if (this.sqw != null) {
            String packetHeader = getPacketHeader(new Date().getTime());
            if (this.facilityPrinting || packetHeader.length() > 0) {
                StringBuffer stringBuffer = new StringBuffer(packetHeader);
                if (this.facilityPrinting) {
                    stringBuffer.append(this.facilityStr);
                }
                stringBuffer.append(str);
                str = stringBuffer.toString();
            }
            this.sqw.setLevel(6);
            this.sqw.write(str);
        }
    }

    private void splitPacket(String str, String str2) {
        if (str2.getBytes().length <= 1019) {
            this.sqw.write(str2);
            return;
        }
        int length = ((str2.length() - str.length()) / 2) + str.length();
        splitPacket(str, String.valueOf(str2.substring(0, length)).concat("..."));
        splitPacket(str, str + "..." + str2.substring(length));
    }

    @Override // org.apache.log4j.AppenderSkeleton, org.apache.log4j.spi.OptionHandler
    public void activateOptions() {
        if (this.header) {
            getLocalHostname();
        }
        Layout layout = this.layout;
        if (layout != null && layout.getHeader() != null) {
            sendLayoutMessage(this.layout.getHeader());
        }
        this.layoutHeaderChecked = true;
    }

    @Override // org.apache.log4j.AppenderSkeleton
    public void append(LoggingEvent loggingEvent) {
        String[] throwableStrRep;
        if (isAsSevereAsThreshold(loggingEvent.getLevel())) {
            if (this.sqw == null) {
                this.errorHandler.error("No syslog host is set for SyslogAppedender named \"" + this.name + "\".");
                return;
            }
            if (!this.layoutHeaderChecked) {
                Layout layout = this.layout;
                if (layout != null && layout.getHeader() != null) {
                    sendLayoutMessage(this.layout.getHeader());
                }
                this.layoutHeaderChecked = true;
            }
            String packetHeader = getPacketHeader(loggingEvent.timeStamp);
            Layout layout2 = this.layout;
            String valueOf = layout2 == null ? String.valueOf(loggingEvent.getMessage()) : layout2.format(loggingEvent);
            if (this.facilityPrinting || packetHeader.length() > 0) {
                StringBuffer stringBuffer = new StringBuffer(packetHeader);
                if (this.facilityPrinting) {
                    stringBuffer.append(this.facilityStr);
                }
                stringBuffer.append(valueOf);
                valueOf = stringBuffer.toString();
            }
            this.sqw.setLevel(loggingEvent.getLevel().getSyslogEquivalent());
            if (valueOf.length() > 256) {
                splitPacket(packetHeader, valueOf);
            } else {
                this.sqw.write(valueOf);
            }
            Layout layout3 = this.layout;
            if ((layout3 == null || layout3.ignoresThrowable()) && (throwableStrRep = loggingEvent.getThrowableStrRep()) != null) {
                for (int i4 = 0; i4 < throwableStrRep.length; i4++) {
                    if (throwableStrRep[i4].startsWith("\t")) {
                        this.sqw.write(String.valueOf(packetHeader) + "    " + throwableStrRep[i4].substring(1));
                    } else {
                        this.sqw.write(String.valueOf(packetHeader) + throwableStrRep[i4]);
                    }
                }
            }
        }
    }

    @Override // org.apache.log4j.Appender
    public synchronized void close() {
        Layout layout;
        try {
            this.closed = true;
            if (this.sqw != null) {
                try {
                    try {
                        if (this.layoutHeaderChecked && (layout = this.layout) != null && layout.getFooter() != null) {
                            sendLayoutMessage(this.layout.getFooter());
                        }
                        this.sqw.close();
                        this.sqw = null;
                    } catch (InterruptedIOException unused) {
                        Thread.currentThread().interrupt();
                        this.sqw = null;
                    }
                } catch (IOException unused2) {
                    this.sqw = null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean getFacilityPrinting() {
        return this.facilityPrinting;
    }

    public final boolean getHeader() {
        return this.header;
    }

    public String getSyslogHost() {
        return this.syslogHost;
    }

    @Override // org.apache.log4j.Appender
    public boolean requiresLayout() {
        return true;
    }

    public void setFacility(String str) {
        if (str == null) {
            return;
        }
        int facility = getFacility(str);
        this.syslogFacility = facility;
        if (facility == -1) {
            System.err.println("[" + str + "] is an unknown syslog facility. Defaulting to [USER].");
            this.syslogFacility = 8;
        }
        initSyslogFacilityStr();
        SyslogQuietWriter syslogQuietWriter = this.sqw;
        if (syslogQuietWriter != null) {
            syslogQuietWriter.setSyslogFacility(this.syslogFacility);
        }
    }

    public void setFacilityPrinting(boolean z4) {
        this.facilityPrinting = z4;
    }

    public final void setHeader(boolean z4) {
        this.header = z4;
    }

    public void setSyslogHost(String str) {
        this.sqw = new SyslogQuietWriter(new SyslogWriter(str), this.syslogFacility, this.errorHandler);
        this.syslogHost = str;
    }

    public SyslogAppender(Layout layout, int i4) {
        this.syslogFacility = 8;
        this.facilityPrinting = false;
        this.header = false;
        this.dateFormat = new SimpleDateFormat("MMM dd HH:mm:ss ", Locale.ENGLISH);
        this.layoutHeaderChecked = false;
        this.layout = layout;
        this.syslogFacility = i4;
        initSyslogFacilityStr();
    }

    public SyslogAppender(Layout layout, String str, int i4) {
        this(layout, i4);
        setSyslogHost(str);
    }

    public String getFacility() {
        return getFacilityString(this.syslogFacility);
    }
}
