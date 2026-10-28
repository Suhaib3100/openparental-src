package org.apache.log4j;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.CodeSource;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.spi.ThrowableRenderer;

/* loaded from: classes3.dex */
public final class EnhancedThrowableRenderer implements ThrowableRenderer {
    private Method getClassNameMethod;
    private Method getStackTraceMethod;

    public EnhancedThrowableRenderer() {
        try {
            this.getStackTraceMethod = Throwable.class.getMethod("getStackTrace", null);
            this.getClassNameMethod = Class.forName("java.lang.StackTraceElement").getMethod("getClassName", null);
        } catch (Exception unused) {
        }
    }

    private Class findClass(String str) throws ClassNotFoundException {
        try {
            try {
                return Thread.currentThread().getContextClassLoader().loadClass(str);
            } catch (ClassNotFoundException unused) {
                return EnhancedThrowableRenderer.class.getClassLoader().loadClass(str);
            }
        } catch (ClassNotFoundException unused2) {
            return Class.forName(str);
        }
    }

    private String formatElement(Object obj, Map map) {
        String implementationVersion;
        URL location;
        StringBuffer stringBuffer = new StringBuffer("\tat ");
        stringBuffer.append(obj);
        try {
            String obj2 = this.getClassNameMethod.invoke(obj, null).toString();
            Object obj3 = map.get(obj2);
            if (obj3 != null) {
                stringBuffer.append(obj3);
            } else {
                Class findClass = findClass(obj2);
                int length = stringBuffer.length();
                stringBuffer.append('[');
                try {
                    CodeSource codeSource = findClass.getProtectionDomain().getCodeSource();
                    if (codeSource != null && (location = codeSource.getLocation()) != null) {
                        if ("file".equals(location.getProtocol())) {
                            String path = location.getPath();
                            if (path != null) {
                                int lastIndexOf = path.lastIndexOf(47);
                                int lastIndexOf2 = path.lastIndexOf(File.separatorChar);
                                if (lastIndexOf2 > lastIndexOf) {
                                    lastIndexOf = lastIndexOf2;
                                }
                                if (lastIndexOf > 0 && lastIndexOf != path.length() - 1) {
                                    stringBuffer.append(path.substring(lastIndexOf + 1));
                                }
                                stringBuffer.append(location);
                            }
                        } else {
                            stringBuffer.append(location);
                        }
                    }
                } catch (SecurityException unused) {
                }
                stringBuffer.append(':');
                Package r12 = findClass.getPackage();
                if (r12 != null && (implementationVersion = r12.getImplementationVersion()) != null) {
                    stringBuffer.append(implementationVersion);
                }
                stringBuffer.append(']');
                map.put(obj2, stringBuffer.substring(length));
            }
        } catch (Exception unused2) {
        }
        return stringBuffer.toString();
    }

    @Override // org.apache.log4j.spi.ThrowableRenderer
    public String[] doRender(Throwable th) {
        Method method = this.getStackTraceMethod;
        if (method != null) {
            try {
                Object[] objArr = (Object[]) method.invoke(th, null);
                String[] strArr = new String[objArr.length + 1];
                int i4 = 0;
                strArr[0] = th.toString();
                HashMap hashMap = new HashMap();
                while (i4 < objArr.length) {
                    int i5 = i4 + 1;
                    strArr[i5] = formatElement(objArr[i4], hashMap);
                    i4 = i5;
                }
                return strArr;
            } catch (Exception unused) {
            }
        }
        return DefaultThrowableRenderer.render(th);
    }
}
