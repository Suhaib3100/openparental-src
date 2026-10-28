package org.apache.log4j;

import android.support.v4.media.d;
import androidx.appcompat.view.g;
import androidx.constraintlayout.core.motion.key.c;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;
import org.apache.log4j.config.PropertySetter;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.helpers.OptionConverter;
import org.apache.log4j.or.RendererMap;
import org.apache.log4j.spi.Configurator;
import org.apache.log4j.spi.ErrorHandler;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggerFactory;
import org.apache.log4j.spi.LoggerRepository;
import org.apache.log4j.spi.OptionHandler;
import org.apache.log4j.spi.RendererSupport;
import org.apache.log4j.spi.ThrowableRenderer;
import org.apache.log4j.spi.ThrowableRendererSupport;

/* loaded from: classes3.dex */
public class PropertyConfigurator implements Configurator {
    private LoggerRepository repository;
    public static final String LOGGER_FACTORY_KEY = "log4j.loggerFactory";
    private static final String RESET_KEY = "log4j.reset";
    private static final String THROWABLE_RENDERER_PREFIX = "log4j.throwableRenderer";
    static final String ROOT_LOGGER_PREFIX = "log4j.rootLogger";
    static final String CATEGORY_PREFIX = "log4j.category.";
    static final String LOGGER_PREFIX = "log4j.logger.";
    private static final String LOGGER_REF = "logger-ref";
    static final String FACTORY_PREFIX = "log4j.factory";
    static final String RENDERER_PREFIX = "log4j.renderer.";
    private static final String ROOT_REF = "root-ref";
    private static final String APPENDER_REF_TAG = "appender-ref";
    private static final String INTERNAL_ROOT_NAME = "root";
    static final String APPENDER_PREFIX = "log4j.appender.";
    static final String ADDITIVITY_PREFIX = "log4j.additivity.";
    static final String ROOT_CATEGORY_PREFIX = "log4j.rootCategory";
    static final String THRESHOLD_PREFIX = "log4j.threshold";
    protected Hashtable registry = new Hashtable(11);
    protected LoggerFactory loggerFactory = new DefaultCategoryFactory();

    public static void configure(String str) {
        new PropertyConfigurator().doConfigure(str, LogManager.getLoggerRepository());
    }

    public static void configureAndWatch(String str) {
        configureAndWatch(str, 60000L);
    }

    private void parseErrorHandler(ErrorHandler errorHandler, String str, Properties properties, LoggerRepository loggerRepository) {
        Appender parseAppender;
        if (OptionConverter.toBoolean(OptionConverter.findAndSubst(String.valueOf(str).concat("root-ref"), properties), false)) {
            errorHandler.setLogger(loggerRepository.getRootLogger());
        }
        String findAndSubst = OptionConverter.findAndSubst(String.valueOf(str).concat("logger-ref"), properties);
        if (findAndSubst != null) {
            LoggerFactory loggerFactory = this.loggerFactory;
            errorHandler.setLogger(loggerFactory == null ? loggerRepository.getLogger(findAndSubst) : loggerRepository.getLogger(findAndSubst, loggerFactory));
        }
        String findAndSubst2 = OptionConverter.findAndSubst(String.valueOf(str).concat("appender-ref"), properties);
        if (findAndSubst2 == null || (parseAppender = parseAppender(properties, findAndSubst2)) == null) {
            return;
        }
        errorHandler.setBackupAppender(parseAppender);
    }

    protected void configureLoggerFactory(Properties properties) {
        String findAndSubst = OptionConverter.findAndSubst("log4j.loggerFactory", properties);
        if (findAndSubst != null) {
            LogLog.debug("Setting category factory to [" + findAndSubst + "].");
            LoggerFactory loggerFactory = (LoggerFactory) OptionConverter.instantiateByClassName(findAndSubst, LoggerFactory.class, this.loggerFactory);
            this.loggerFactory = loggerFactory;
            PropertySetter.setProperties(loggerFactory, properties, "log4j.factory.");
        }
    }

    void configureRootCategory(Properties properties, LoggerRepository loggerRepository) {
        String str = "log4j.rootLogger";
        String findAndSubst = OptionConverter.findAndSubst("log4j.rootLogger", properties);
        if (findAndSubst == null) {
            findAndSubst = OptionConverter.findAndSubst("log4j.rootCategory", properties);
            str = "log4j.rootCategory";
        }
        String str2 = str;
        String str3 = findAndSubst;
        if (str3 == null) {
            LogLog.debug("Could not find root logger information. Is this OK?");
            return;
        }
        Logger rootLogger = loggerRepository.getRootLogger();
        synchronized (rootLogger) {
            parseCategory(properties, rootLogger, str2, "root", str3);
        }
    }

    public void doConfigure(String str, LoggerRepository loggerRepository) {
        FileInputStream fileInputStream;
        Properties properties = new Properties();
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            try {
                fileInputStream.close();
            } catch (InterruptedIOException unused) {
                Thread.currentThread().interrupt();
            } catch (Throwable unused2) {
            }
            doConfigure(properties, loggerRepository);
        } catch (Exception e5) {
            e = e5;
            fileInputStream2 = fileInputStream;
            if ((e instanceof InterruptedIOException) || (e instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
            }
            LogLog.error("Could not read configuration file [" + str + "].", e);
            LogLog.error("Ignoring configuration file [" + str + "].");
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (InterruptedIOException unused3) {
                    Thread.currentThread().interrupt();
                } catch (Throwable unused4) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (InterruptedIOException unused5) {
                    Thread.currentThread().interrupt();
                } catch (Throwable unused6) {
                }
            }
            throw th;
        }
    }

    void parseAdditivityForLogger(Properties properties, Logger logger, String str) {
        String findAndSubst = OptionConverter.findAndSubst("log4j.additivity." + str, properties);
        LogLog.debug("Handling log4j.additivity." + str + "=[" + findAndSubst + "]");
        if (findAndSubst == null || findAndSubst.equals("")) {
            return;
        }
        boolean z4 = OptionConverter.toBoolean(findAndSubst, true);
        LogLog.debug("Setting additivity for \"" + str + "\" to " + z4);
        logger.setAdditivity(z4);
    }

    Appender parseAppender(Properties properties, String str) {
        ErrorHandler errorHandler;
        int i4;
        Layout layout;
        Appender registryGet = registryGet(str);
        if (registryGet != null) {
            LogLog.debug("Appender \"" + str + "\" was already parsed.");
            return registryGet;
        }
        String a5 = c.a("log4j.appender.", str);
        String concat = String.valueOf(a5).concat(".layout");
        Appender appender = (Appender) OptionConverter.instantiateByKey(properties, a5, Appender.class, null);
        if (appender == null) {
            LogLog.error("Could not instantiate appender named \"" + str + "\".");
            return null;
        }
        appender.setName(str);
        if (appender instanceof OptionHandler) {
            if (appender.requiresLayout() && (layout = (Layout) OptionConverter.instantiateByKey(properties, concat, Layout.class, null)) != null) {
                appender.setLayout(layout);
                LogLog.debug("Parsing layout options for \"" + str + "\".");
                PropertySetter.setProperties(layout, properties, String.valueOf(concat).concat("."));
                LogLog.debug("End of parsing for \"" + str + "\".");
            }
            String concat2 = String.valueOf(a5).concat(".errorhandler");
            if (OptionConverter.findAndSubst(concat2, properties) != null && (errorHandler = (ErrorHandler) OptionConverter.instantiateByKey(properties, concat2, ErrorHandler.class, null)) != null) {
                appender.setErrorHandler(errorHandler);
                LogLog.debug("Parsing errorhandler options for \"" + str + "\".");
                parseErrorHandler(errorHandler, concat2, properties, this.repository);
                Properties properties2 = new Properties();
                String[] strArr = {String.valueOf(concat2).concat(".root-ref"), String.valueOf(concat2).concat(".logger-ref"), String.valueOf(concat2).concat(".appender-ref")};
                for (Map.Entry entry : properties.entrySet()) {
                    int i5 = 0;
                    while (true) {
                        i4 = 3;
                        if (i5 >= 3) {
                            break;
                        }
                        if (strArr[i5].equals(entry.getKey())) {
                            i4 = 3;
                            break;
                        }
                        i5++;
                    }
                    if (i5 == i4) {
                        properties2.put(entry.getKey(), entry.getValue());
                    }
                }
                PropertySetter.setProperties(errorHandler, properties2, String.valueOf(concat2).concat("."));
                LogLog.debug("End of errorhandler parsing for \"" + str + "\".");
            }
            PropertySetter.setProperties(appender, properties, String.valueOf(a5).concat("."));
            LogLog.debug("Parsed \"" + str + "\" options.");
        }
        parseAppenderFilters(properties, str, appender);
        registryPut(appender);
        return appender;
    }

    void parseAppenderFilters(Properties properties, String str, Appender appender) {
        String str2;
        String str3;
        String a5 = d.a("log4j.appender.", str, ".filter.");
        int length = a5.length();
        Hashtable hashtable = new Hashtable();
        Enumeration keys = properties.keys();
        String str4 = "";
        while (keys.hasMoreElements()) {
            String str5 = (String) keys.nextElement();
            if (str5.startsWith(a5)) {
                int indexOf = str5.indexOf(46, length);
                if (indexOf != -1) {
                    str3 = str5.substring(0, indexOf);
                    str2 = str5.substring(indexOf + 1);
                } else {
                    str2 = str4;
                    str3 = str5;
                }
                Vector vector = (Vector) hashtable.get(str3);
                if (vector == null) {
                    vector = new Vector();
                    hashtable.put(str3, vector);
                }
                if (indexOf != -1) {
                    vector.add(new NameValue(str2, OptionConverter.findAndSubst(str5, properties)));
                }
                str4 = str2;
            }
        }
        SortedKeyEnumeration sortedKeyEnumeration = new SortedKeyEnumeration(hashtable);
        while (sortedKeyEnumeration.hasMoreElements()) {
            String str6 = (String) sortedKeyEnumeration.nextElement();
            String property = properties.getProperty(str6);
            if (property != null) {
                StringBuilder a6 = g.a("Filter key: [", str6, "] class: [");
                a6.append(properties.getProperty(str6));
                a6.append("] props: ");
                a6.append(hashtable.get(str6));
                LogLog.debug(a6.toString());
                Filter filter = (Filter) OptionConverter.instantiateByClassName(property, Filter.class, null);
                if (filter != null) {
                    PropertySetter propertySetter = new PropertySetter(filter);
                    Enumeration elements = ((Vector) hashtable.get(str6)).elements();
                    while (elements.hasMoreElements()) {
                        NameValue nameValue = (NameValue) elements.nextElement();
                        propertySetter.setProperty(nameValue.key, nameValue.value);
                    }
                    propertySetter.activate();
                    LogLog.debug("Adding filter of type [" + filter.getClass() + "] to appender named [" + appender.getName() + "].");
                    appender.addFilter(filter);
                }
            } else {
                LogLog.warn("Missing class definition for filter: [" + str6 + "]");
            }
        }
    }

    void parseCategory(Properties properties, Logger logger, String str, String str2, String str3) {
        LogLog.debug("Parsing for [" + str2 + "] with value=[" + str3 + "].");
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ",");
        if (!str3.startsWith(",") && !str3.equals("")) {
            if (!stringTokenizer.hasMoreTokens()) {
                return;
            }
            String nextToken = stringTokenizer.nextToken();
            LogLog.debug("Level token is [" + nextToken + "].");
            if (!"inherited".equalsIgnoreCase(nextToken) && !"null".equalsIgnoreCase(nextToken)) {
                logger.setLevel(OptionConverter.toLevel(nextToken, Level.DEBUG));
            } else if (str2.equals("root")) {
                LogLog.warn("The root logger cannot be set to null.");
            } else {
                logger.setLevel(null);
            }
            StringBuilder a5 = g.a("Category ", str2, " set to ");
            a5.append(logger.getLevel());
            LogLog.debug(a5.toString());
        }
        logger.removeAllAppenders();
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if (trim != null && !trim.equals(",")) {
                LogLog.debug("Parsing appender named \"" + trim + "\".");
                Appender parseAppender = parseAppender(properties, trim);
                if (parseAppender != null) {
                    logger.addAppender(parseAppender);
                }
            }
        }
    }

    protected void parseCatsAndRenderers(Properties properties, LoggerRepository loggerRepository) {
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String str = (String) propertyNames.nextElement();
            String str2 = null;
            if (str.startsWith("log4j.category.") || str.startsWith("log4j.logger.")) {
                if (str.startsWith("log4j.category.")) {
                    str2 = str.substring(15);
                } else if (str.startsWith("log4j.logger.")) {
                    str2 = str.substring(13);
                }
                String str3 = str2;
                String findAndSubst = OptionConverter.findAndSubst(str, properties);
                Logger logger = loggerRepository.getLogger(str3, this.loggerFactory);
                synchronized (logger) {
                    parseCategory(properties, logger, str, str3, findAndSubst);
                    parseAdditivityForLogger(properties, logger, str3);
                }
            } else if (str.startsWith("log4j.renderer.")) {
                String substring = str.substring(15);
                String findAndSubst2 = OptionConverter.findAndSubst(str, properties);
                if (loggerRepository instanceof RendererSupport) {
                    RendererMap.addRenderer((RendererSupport) loggerRepository, substring, findAndSubst2);
                }
            } else if (str.equals("log4j.throwableRenderer") && (loggerRepository instanceof ThrowableRendererSupport)) {
                ThrowableRenderer throwableRenderer = (ThrowableRenderer) OptionConverter.instantiateByKey(properties, "log4j.throwableRenderer", ThrowableRenderer.class, null);
                if (throwableRenderer == null) {
                    LogLog.error("Could not instantiate throwableRenderer.");
                } else {
                    new PropertySetter(throwableRenderer).setProperties(properties, "log4j.throwableRenderer.");
                    ((ThrowableRendererSupport) loggerRepository).setThrowableRenderer(throwableRenderer);
                }
            }
        }
    }

    Appender registryGet(String str) {
        return (Appender) this.registry.get(str);
    }

    void registryPut(Appender appender) {
        this.registry.put(appender.getName(), appender);
    }

    public static void configureAndWatch(String str, long j4) {
        PropertyWatchdog propertyWatchdog = new PropertyWatchdog(str);
        propertyWatchdog.setDelay(j4);
        propertyWatchdog.start();
    }

    public static void configure(URL url) {
        new PropertyConfigurator().doConfigure(url, LogManager.getLoggerRepository());
    }

    public static void configure(InputStream inputStream) {
        new PropertyConfigurator().doConfigure(inputStream, LogManager.getLoggerRepository());
    }

    public static void configure(Properties properties) {
        new PropertyConfigurator().doConfigure(properties, LogManager.getLoggerRepository());
    }

    public void doConfigure(Properties properties, LoggerRepository loggerRepository) {
        this.repository = loggerRepository;
        String property = properties.getProperty("log4j.debug");
        if (property == null && (property = properties.getProperty("log4j.configDebug")) != null) {
            LogLog.warn("[log4j.configDebug] is deprecated. Use [log4j.debug] instead.");
        }
        if (property != null) {
            LogLog.setInternalDebugging(OptionConverter.toBoolean(property, true));
        }
        String property2 = properties.getProperty("log4j.reset");
        if (property2 != null && OptionConverter.toBoolean(property2, false)) {
            loggerRepository.resetConfiguration();
        }
        String findAndSubst = OptionConverter.findAndSubst("log4j.threshold", properties);
        if (findAndSubst != null) {
            loggerRepository.setThreshold(OptionConverter.toLevel(findAndSubst, Level.ALL));
            LogLog.debug("Hierarchy threshold set to [" + loggerRepository.getThreshold() + "].");
        }
        configureRootCategory(properties, loggerRepository);
        configureLoggerFactory(properties);
        parseCatsAndRenderers(properties, loggerRepository);
        LogLog.debug("Finished configuring.");
        this.registry.clear();
    }

    @Override // org.apache.log4j.spi.Configurator
    public void doConfigure(InputStream inputStream, LoggerRepository loggerRepository) {
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
            doConfigure(properties, loggerRepository);
        } catch (IOException e4) {
            if (e4 instanceof InterruptedIOException) {
                Thread.currentThread().interrupt();
            }
            LogLog.error("Could not read configuration file from InputStream [" + inputStream + "].", e4);
            LogLog.error("Ignoring configuration InputStream [" + inputStream + "].");
        }
    }

    @Override // org.apache.log4j.spi.Configurator
    public void doConfigure(URL url, LoggerRepository loggerRepository) {
        Properties properties = new Properties();
        LogLog.debug("Reading configuration from URL " + url);
        InputStream inputStream = null;
        try {
            try {
                URLConnection openConnection = url.openConnection();
                openConnection.setUseCaches(false);
                inputStream = openConnection.getInputStream();
                properties.load(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (InterruptedIOException unused) {
                        Thread.currentThread().interrupt();
                    } catch (IOException | RuntimeException unused2) {
                    }
                }
                doConfigure(properties, loggerRepository);
            } catch (Exception e4) {
                if ((e4 instanceof InterruptedIOException) || (e4 instanceof InterruptedException)) {
                    Thread.currentThread().interrupt();
                }
                LogLog.error("Could not read configuration file from URL [" + url + "].", e4);
                LogLog.error("Ignoring configuration file [" + url + "].");
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (InterruptedIOException unused3) {
                        Thread.currentThread().interrupt();
                    } catch (IOException | RuntimeException unused4) {
                    }
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (InterruptedIOException unused5) {
                    Thread.currentThread().interrupt();
                } catch (IOException | RuntimeException unused6) {
                }
            }
            throw th;
        }
    }
}
