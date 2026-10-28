package org.apache.log4j.helpers;

import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Properties;
import kotlin.text.Typography;
import org.apache.commons.io.j;
import org.apache.commons.io.k;
import org.apache.log4j.Level;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.spi.Configurator;
import org.apache.log4j.spi.LoggerRepository;

/* loaded from: classes5.dex */
public class OptionConverter {
    static String DELIM_START = "${";
    static int DELIM_START_LEN = 2;
    static char DELIM_STOP = '}';
    static int DELIM_STOP_LEN = 1;

    private OptionConverter() {
    }

    public static String[] concatanateArrays(String[] strArr, String[] strArr2) {
        String[] strArr3 = new String[strArr.length + strArr2.length];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    public static String convertSpecialChars(String str) {
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length);
        int i5 = 0;
        while (i5 < length) {
            int i6 = i5 + 1;
            char charAt = str.charAt(i5);
            if (charAt == '\\') {
                int i7 = i6 + 1;
                char charAt2 = str.charAt(i6);
                if (charAt2 == 'n') {
                    charAt2 = '\n';
                } else if (charAt2 == 'r') {
                    charAt2 = '\r';
                } else if (charAt2 == 't') {
                    charAt2 = '\t';
                } else if (charAt2 == 'f') {
                    charAt2 = '\f';
                } else {
                    char c6 = '\b';
                    if (charAt2 != '\b') {
                        c6 = Typography.f27126b;
                        if (charAt2 != '\"') {
                            c6 = '\'';
                            if (charAt2 != '\'') {
                                if (charAt2 == '\\') {
                                    i6 = i7;
                                    charAt = '\\';
                                }
                            }
                        }
                    }
                    i6 = i7;
                    charAt = c6;
                }
                char c7 = charAt2;
                i6 = i7;
                charAt = c7;
            }
            stringBuffer.append(charAt);
            i5 = i6;
        }
        return stringBuffer.toString();
    }

    public static String findAndSubst(String str, Properties properties) {
        String property = properties.getProperty(str);
        if (property == null) {
            return null;
        }
        try {
            return substVars(property, properties);
        } catch (IllegalArgumentException e6) {
            LogLog.error("Bad option value [" + property + "].", e6);
            return property;
        }
    }

    public static String getSystemProperty(String str, String str2) {
        try {
            return System.getProperty(str, str2);
        } catch (Throwable unused) {
            LogLog.debug("Was not allowed to read system property \"" + str + "\".");
            return str2;
        }
    }

    public static Object instantiateByClassName(String str, Class cls, Object obj) {
        if (str != null) {
            try {
                Class<?> loadClass = Loader.loadClass(str);
                if (cls.isAssignableFrom(loadClass)) {
                    return loadClass.newInstance();
                }
                LogLog.error("A \"" + str + "\" object is not assignable to a \"" + cls.getName() + "\" variable.");
                StringBuilder sb = new StringBuilder("The class \"");
                sb.append(cls.getName());
                sb.append("\" was loaded by ");
                LogLog.error(sb.toString());
                LogLog.error("[" + cls.getClassLoader() + "] whereas object of type ");
                LogLog.error("\"" + loadClass.getName() + "\" was loaded by [" + loadClass.getClassLoader() + "].");
                return obj;
            } catch (ClassNotFoundException e6) {
                LogLog.error("Could not instantiate class [" + str + "].", e6);
            } catch (IllegalAccessException e7) {
                LogLog.error("Could not instantiate class [" + str + "].", e7);
            } catch (InstantiationException e8) {
                LogLog.error("Could not instantiate class [" + str + "].", e8);
            } catch (RuntimeException e9) {
                LogLog.error("Could not instantiate class [" + str + "].", e9);
            }
        }
        return obj;
    }

    public static Object instantiateByKey(Properties properties, String str, Class cls, Object obj) {
        String findAndSubst = findAndSubst(str, properties);
        if (findAndSubst != null) {
            return instantiateByClassName(findAndSubst.trim(), cls, obj);
        }
        LogLog.error("Could not find value for key " + str);
        return obj;
    }

    public static void selectAndConfigure(InputStream inputStream, String str, LoggerRepository loggerRepository) {
        Configurator propertyConfigurator;
        if (str != null) {
            LogLog.debug("Preferred configurator class: ".concat(str));
            propertyConfigurator = (Configurator) instantiateByClassName(str, Configurator.class, null);
            if (propertyConfigurator == null) {
                LogLog.error("Could not instantiate configurator [" + str + "].");
                return;
            }
        } else {
            propertyConfigurator = new PropertyConfigurator();
        }
        propertyConfigurator.doConfigure(inputStream, loggerRepository);
    }

    public static String substVars(String str, Properties properties) throws IllegalArgumentException {
        StringBuffer stringBuffer = new StringBuffer();
        int i5 = 0;
        while (true) {
            int indexOf = str.indexOf(DELIM_START, i5);
            if (indexOf == -1) {
                if (i5 == 0) {
                    return str;
                }
                stringBuffer.append(str.substring(i5, str.length()));
                return stringBuffer.toString();
            }
            stringBuffer.append(str.substring(i5, indexOf));
            int indexOf2 = str.indexOf(DELIM_STOP, indexOf);
            if (indexOf2 == -1) {
                throw new IllegalArgumentException(String.valueOf(Typography.f27126b) + str + "\" has no closing brace. Opening brace at position " + indexOf + k.f32026a);
            }
            String substring = str.substring(indexOf + DELIM_START_LEN, indexOf2);
            String systemProperty = getSystemProperty(substring, null);
            if (systemProperty == null && properties != null) {
                systemProperty = properties.getProperty(substring);
            }
            if (systemProperty != null) {
                stringBuffer.append(substVars(systemProperty, properties));
            }
            i5 = indexOf2 + DELIM_STOP_LEN;
        }
    }

    public static boolean toBoolean(String str, boolean z5) {
        if (str == null) {
            return z5;
        }
        String trim = str.trim();
        if ("true".equalsIgnoreCase(trim)) {
            return true;
        }
        if ("false".equalsIgnoreCase(trim)) {
            return false;
        }
        return z5;
    }

    public static long toFileSize(String str, long j5) {
        long j6;
        if (str == null) {
            return j5;
        }
        String upperCase = str.trim().toUpperCase();
        int indexOf = upperCase.indexOf("KB");
        if (indexOf != -1) {
            upperCase = upperCase.substring(0, indexOf);
            j6 = 1024;
        } else {
            int indexOf2 = upperCase.indexOf("MB");
            if (indexOf2 != -1) {
                upperCase = upperCase.substring(0, indexOf2);
                j6 = j.f32011c;
            } else {
                int indexOf3 = upperCase.indexOf("GB");
                if (indexOf3 != -1) {
                    upperCase = upperCase.substring(0, indexOf3);
                    j6 = j.f32014f;
                } else {
                    j6 = 1;
                }
            }
        }
        if (upperCase != null) {
            try {
                return Long.valueOf(upperCase).longValue() * j6;
            } catch (NumberFormatException e6) {
                LogLog.error("[" + upperCase + "] is not in proper int form.");
                LogLog.error("[" + str + "] not in expected format.", e6);
            }
        }
        return j5;
    }

    public static int toInt(String str, int i5) {
        if (str != null) {
            String trim = str.trim();
            try {
                return Integer.valueOf(trim).intValue();
            } catch (NumberFormatException e6) {
                LogLog.error("[" + trim + "] is not in proper int form.");
                e6.printStackTrace();
            }
        }
        return i5;
    }

    public static Level toLevel(String str, Level level) {
        if (str == null) {
            return level;
        }
        String trim = str.trim();
        int indexOf = trim.indexOf(35);
        if (indexOf == -1) {
            if ("NULL".equalsIgnoreCase(trim)) {
                return null;
            }
            return Level.toLevel(trim, level);
        }
        String substring = trim.substring(indexOf + 1);
        String substring2 = trim.substring(0, indexOf);
        if ("NULL".equalsIgnoreCase(substring2)) {
            return null;
        }
        LogLog.debug("toLevel:class=[" + substring + "]:pri=[" + substring2 + "]");
        try {
            return (Level) Loader.loadClass(substring).getMethod("toLevel", String.class, Level.class).invoke(null, substring2, level);
        } catch (ClassCastException e6) {
            LogLog.warn("class [" + substring + "] is not a subclass of org.apache.log4j.Level", e6);
            return level;
        } catch (ClassNotFoundException unused) {
            LogLog.warn("custom level class [" + substring + "] not found.");
            return level;
        } catch (IllegalAccessException e7) {
            LogLog.warn("class [" + substring + "] cannot be instantiated due to access restrictions", e7);
            return level;
        } catch (NoSuchMethodException e8) {
            LogLog.warn("custom level class [" + substring + "] does not have a class function toLevel(String, Level)", e8);
            return level;
        } catch (RuntimeException e9) {
            LogLog.warn("class [" + substring + "], level [" + substring2 + "] conversion failed.", e9);
            return level;
        } catch (InvocationTargetException e10) {
            if ((e10.getTargetException() instanceof InterruptedException) || (e10.getTargetException() instanceof InterruptedIOException)) {
                Thread.currentThread().interrupt();
            }
            LogLog.warn("custom level class [" + substring + "] could not be instantiated", e10);
            return level;
        }
    }

    public static void selectAndConfigure(URL url, String str, LoggerRepository loggerRepository) {
        Configurator propertyConfigurator;
        String file = url.getFile();
        if (str == null && file != null && file.endsWith(".xml")) {
            str = "org.apache.log4j.xml.DOMConfigurator";
        }
        if (str != null) {
            LogLog.debug("Preferred configurator class: ".concat(str));
            propertyConfigurator = (Configurator) instantiateByClassName(str, Configurator.class, null);
            if (propertyConfigurator == null) {
                LogLog.error("Could not instantiate configurator [" + str + "].");
                return;
            }
        } else {
            propertyConfigurator = new PropertyConfigurator();
        }
        propertyConfigurator.doConfigure(url, loggerRepository);
    }
}
