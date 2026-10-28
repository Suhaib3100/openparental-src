package org.apache.log4j.config;

import android.support.v4.media.c;
import android.support.v4.media.d;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Hashtable;
import org.apache.log4j.Appender;
import org.apache.log4j.Category;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.config.PropertyGetter;

/* loaded from: classes3.dex */
public class PropertyPrinter implements PropertyGetter.PropertyCallback {
    protected Hashtable appenderNames;
    protected boolean doCapitalize;
    protected Hashtable layoutNames;
    protected int numAppenders;
    protected PrintWriter out;

    public PropertyPrinter(PrintWriter printWriter) {
        this(printWriter, false);
    }

    public static String capitalize(String str) {
        if (!Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        if (str.length() != 1 && !Character.isLowerCase(str.charAt(1))) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.setCharAt(0, Character.toUpperCase(str.charAt(0)));
        return stringBuffer.toString();
    }

    public static void main(String[] strArr) {
        new PropertyPrinter(new PrintWriter(System.out));
    }

    @Override // org.apache.log4j.config.PropertyGetter.PropertyCallback
    public void foundProperty(Object obj, String str, String str2, Object obj2) {
        if ((obj instanceof Appender) && "name".equals(str2)) {
            return;
        }
        if (this.doCapitalize) {
            str2 = capitalize(str2);
        }
        this.out.println(String.valueOf(str) + str2 + "=" + obj2.toString());
    }

    protected String genAppName() {
        StringBuilder sb = new StringBuilder("A");
        int i4 = this.numAppenders;
        this.numAppenders = i4 + 1;
        sb.append(i4);
        return sb.toString();
    }

    protected boolean isGenAppName(String str) {
        int i4;
        if (str.length() >= 2 && str.charAt(0) == 'A') {
            for (0; i4 < str.length(); i4 + 1) {
                i4 = (str.charAt(i4) >= '0' && str.charAt(i4) <= '9') ? i4 + 1 : 0;
            }
            return true;
        }
        return false;
    }

    public void print(PrintWriter printWriter) {
        printOptions(printWriter, Logger.getRootLogger());
        Enumeration currentLoggers = LogManager.getCurrentLoggers();
        while (currentLoggers.hasMoreElements()) {
            printOptions(printWriter, (Logger) currentLoggers.nextElement());
        }
    }

    protected void printOptions(PrintWriter printWriter, Category category) {
        String str;
        Enumeration allAppenders = category.getAllAppenders();
        Level level = category.getLevel();
        String priority = level == null ? "" : level.toString();
        while (allAppenders.hasMoreElements()) {
            Appender appender = (Appender) allAppenders.nextElement();
            String str2 = (String) this.appenderNames.get(appender);
            if (str2 == null) {
                str2 = appender.getName();
                if (str2 == null || isGenAppName(str2)) {
                    str2 = genAppName();
                }
                this.appenderNames.put(appender, str2);
                printOptions(printWriter, appender, "log4j.appender." + str2);
                if (appender.getLayout() != null) {
                    printOptions(printWriter, appender.getLayout(), d.a("log4j.appender.", str2, ".layout"));
                }
            }
            priority = c.a(new StringBuilder(String.valueOf(priority)), ", ", str2);
        }
        if (category == Logger.getRootLogger()) {
            str = "log4j.rootLogger";
        } else {
            str = "log4j.logger." + category.getName();
        }
        if (priority != "") {
            printWriter.println(String.valueOf(str) + "=" + priority);
        }
        if (category.getAdditivity() || category == Logger.getRootLogger()) {
            return;
        }
        printWriter.println("log4j.additivity." + category.getName() + "=false");
    }

    public PropertyPrinter(PrintWriter printWriter, boolean z4) {
        this.numAppenders = 0;
        this.appenderNames = new Hashtable();
        this.layoutNames = new Hashtable();
        this.out = printWriter;
        this.doCapitalize = z4;
        print(printWriter);
        printWriter.flush();
    }

    protected void printOptions(PrintWriter printWriter, Logger logger) {
        printOptions(printWriter, (Category) logger);
    }

    protected void printOptions(PrintWriter printWriter, Object obj, String str) {
        printWriter.println(String.valueOf(str) + "=" + obj.getClass().getName());
        PropertyGetter.getProperties(obj, this, String.valueOf(str).concat("."));
    }
}
