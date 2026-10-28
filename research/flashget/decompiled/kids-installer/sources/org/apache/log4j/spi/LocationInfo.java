package org.apache.log4j.spi;

import java.io.InterruptedIOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.log4j.Layout;
import org.apache.log4j.helpers.LogLog;

/* loaded from: classes5.dex */
public class LocationInfo implements Serializable {
    private static Method getClassNameMethod = null;
    private static Method getFileNameMethod = null;
    private static Method getLineNumberMethod = null;
    private static Method getMethodNameMethod = null;
    private static Method getStackTraceMethod = null;
    static boolean inVisualAge = false;
    static final long serialVersionUID = -1325822038990805636L;
    transient String className;
    transient String fileName;
    public String fullInfo;
    transient String lineNumber;
    transient String methodName;
    public static final String NA = "?";
    private static StringWriter sw = new StringWriter();
    private static PrintWriter pw = new PrintWriter(sw);
    public static final LocationInfo NA_LOCATION_INFO = new LocationInfo("?", "?", "?", "?");

    static {
        inVisualAge = false;
        try {
            Class.forName("com.ibm.uvm.tools.DebugSupport");
            inVisualAge = true;
            LogLog.debug("Detected IBM VisualAge environment.");
        } catch (Throwable unused) {
        }
        try {
            getStackTraceMethod = Throwable.class.getMethod("getStackTrace", null);
            Class<?> cls = Class.forName("java.lang.StackTraceElement");
            getClassNameMethod = cls.getMethod("getClassName", null);
            getMethodNameMethod = cls.getMethod("getMethodName", null);
            getFileNameMethod = cls.getMethod("getFileName", null);
            getLineNumberMethod = cls.getMethod("getLineNumber", null);
        } catch (ClassNotFoundException unused2) {
            LogLog.debug("LocationInfo will use pre-JDK 1.4 methods to determine location.");
        } catch (NoSuchMethodException unused3) {
            LogLog.debug("LocationInfo will use pre-JDK 1.4 methods to determine location.");
        }
    }

    public LocationInfo(Throwable th, String str) {
        String stringWriter;
        int i5;
        int indexOf;
        int lastIndexOf;
        if (th == null || str == null) {
            return;
        }
        if (getLineNumberMethod != null) {
            try {
                Object[] objArr = (Object[]) getStackTraceMethod.invoke(th, null);
                String str2 = "?";
                int length = objArr.length - 1;
                while (length >= 0) {
                    String str3 = (String) getClassNameMethod.invoke(objArr[length], null);
                    if (str.equals(str3)) {
                        int i6 = length + 1;
                        if (i6 < objArr.length) {
                            this.className = str2;
                            this.methodName = (String) getMethodNameMethod.invoke(objArr[i6], null);
                            String str4 = (String) getFileNameMethod.invoke(objArr[i6], null);
                            this.fileName = str4;
                            if (str4 == null) {
                                this.fileName = "?";
                            }
                            int intValue = ((Integer) getLineNumberMethod.invoke(objArr[i6], null)).intValue();
                            if (intValue < 0) {
                                this.lineNumber = "?";
                            } else {
                                this.lineNumber = String.valueOf(intValue);
                            }
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append(this.className);
                            stringBuffer.append(".");
                            stringBuffer.append(this.methodName);
                            stringBuffer.append("(");
                            stringBuffer.append(this.fileName);
                            stringBuffer.append(":");
                            stringBuffer.append(this.lineNumber);
                            stringBuffer.append(")");
                            this.fullInfo = stringBuffer.toString();
                            return;
                        }
                        return;
                    }
                    length--;
                    str2 = str3;
                }
                return;
            } catch (IllegalAccessException e6) {
                LogLog.debug("LocationInfo failed using JDK 1.4 methods", e6);
            } catch (RuntimeException e7) {
                LogLog.debug("LocationInfo failed using JDK 1.4 methods", e7);
            } catch (InvocationTargetException e8) {
                if ((e8.getTargetException() instanceof InterruptedException) || (e8.getTargetException() instanceof InterruptedIOException)) {
                    Thread.currentThread().interrupt();
                }
                LogLog.debug("LocationInfo failed using JDK 1.4 methods", e8);
            }
        }
        synchronized (sw) {
            th.printStackTrace(pw);
            stringWriter = sw.toString();
            sw.getBuffer().setLength(0);
        }
        int lastIndexOf2 = stringWriter.lastIndexOf(str);
        if (lastIndexOf2 == -1) {
            return;
        }
        if (str.length() + lastIndexOf2 < stringWriter.length() && stringWriter.charAt(str.length() + lastIndexOf2) != '.' && (lastIndexOf = stringWriter.lastIndexOf(str.concat("."))) != -1) {
            lastIndexOf2 = lastIndexOf;
        }
        String str5 = Layout.LINE_SEP;
        int indexOf2 = stringWriter.indexOf(str5, lastIndexOf2);
        if (indexOf2 == -1 || (indexOf = stringWriter.indexOf(str5, (i5 = indexOf2 + Layout.LINE_SEP_LEN))) == -1) {
            return;
        }
        if (!inVisualAge) {
            int lastIndexOf3 = stringWriter.lastIndexOf("at ", indexOf);
            if (lastIndexOf3 == -1) {
                return;
            } else {
                i5 = lastIndexOf3 + 3;
            }
        }
        this.fullInfo = stringWriter.substring(i5, indexOf);
    }

    private static final void appendFragment(StringBuffer stringBuffer, String str) {
        if (str == null) {
            stringBuffer.append("?");
        } else {
            stringBuffer.append(str);
        }
    }

    public String getClassName() {
        String str = this.fullInfo;
        if (str == null) {
            return "?";
        }
        if (this.className == null) {
            int lastIndexOf = str.lastIndexOf(40);
            if (lastIndexOf == -1) {
                this.className = "?";
            } else {
                int lastIndexOf2 = this.fullInfo.lastIndexOf(46, lastIndexOf);
                int lastIndexOf3 = inVisualAge ? this.fullInfo.lastIndexOf(32, lastIndexOf2) + 1 : 0;
                if (lastIndexOf2 == -1) {
                    this.className = "?";
                } else {
                    this.className = this.fullInfo.substring(lastIndexOf3, lastIndexOf2);
                }
            }
        }
        return this.className;
    }

    public String getFileName() {
        String str = this.fullInfo;
        if (str == null) {
            return "?";
        }
        if (this.fileName == null) {
            int lastIndexOf = str.lastIndexOf(58);
            if (lastIndexOf == -1) {
                this.fileName = "?";
            } else {
                this.fileName = this.fullInfo.substring(this.fullInfo.lastIndexOf(40, lastIndexOf - 1) + 1, lastIndexOf);
            }
        }
        return this.fileName;
    }

    public String getLineNumber() {
        String str = this.fullInfo;
        if (str == null) {
            return "?";
        }
        if (this.lineNumber == null) {
            int lastIndexOf = str.lastIndexOf(41);
            int lastIndexOf2 = this.fullInfo.lastIndexOf(58, lastIndexOf - 1);
            if (lastIndexOf2 == -1) {
                this.lineNumber = "?";
            } else {
                this.lineNumber = this.fullInfo.substring(lastIndexOf2 + 1, lastIndexOf);
            }
        }
        return this.lineNumber;
    }

    public String getMethodName() {
        String str = this.fullInfo;
        if (str == null) {
            return "?";
        }
        if (this.methodName == null) {
            int lastIndexOf = str.lastIndexOf(40);
            int lastIndexOf2 = this.fullInfo.lastIndexOf(46, lastIndexOf);
            if (lastIndexOf2 == -1) {
                this.methodName = "?";
            } else {
                this.methodName = this.fullInfo.substring(lastIndexOf2 + 1, lastIndexOf);
            }
        }
        return this.methodName;
    }

    public LocationInfo(String str, String str2, String str3, String str4) {
        this.fileName = str;
        this.className = str2;
        this.methodName = str3;
        this.lineNumber = str4;
        StringBuffer stringBuffer = new StringBuffer();
        appendFragment(stringBuffer, str2);
        stringBuffer.append(".");
        appendFragment(stringBuffer, str3);
        stringBuffer.append("(");
        appendFragment(stringBuffer, str);
        stringBuffer.append(":");
        appendFragment(stringBuffer, str4);
        stringBuffer.append(")");
        this.fullInfo = stringBuffer.toString();
    }
}
