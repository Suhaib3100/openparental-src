package org.apache.log4j.xml;

import androidx.appcompat.view.g;
import androidx.concurrent.futures.a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Hashtable;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import org.apache.log4j.Appender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.config.PropertySetter;
import org.apache.log4j.helpers.FileWatchdog;
import org.apache.log4j.helpers.Loader;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.helpers.OptionConverter;
import org.apache.log4j.or.RendererMap;
import org.apache.log4j.spi.AppenderAttachable;
import org.apache.log4j.spi.Configurator;
import org.apache.log4j.spi.ErrorHandler;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggerFactory;
import org.apache.log4j.spi.LoggerRepository;
import org.apache.log4j.spi.RendererSupport;
import org.apache.log4j.spi.ThrowableRenderer;
import org.apache.log4j.spi.ThrowableRendererSupport;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* loaded from: classes6.dex */
public class DOMConfigurator implements Configurator {
    Properties props;
    LoggerRepository repository;
    static final String REF_ATTR = "ref";
    static final String ERROR_HANDLER_TAG = "errorHandler";
    static final String RENDERED_CLASS_ATTR = "renderedClass";
    static final String RENDERER_TAG = "renderer";
    static final String LOGGER_FACTORY_TAG = "loggerFactory";
    static final String PARAM_TAG = "param";
    static final String ROOT_REF = "root-ref";
    static final String ADDITIVITY_ATTR = "additivity";
    static final String APPENDER_REF_TAG = "appender-ref";
    static final String CATEGORY = "category";
    static final String THRESHOLD_ATTR = "threshold";
    static final String FILTER_TAG = "filter";
    static final String PRIORITY_TAG = "priority";
    static final String ROOT_TAG = "root";
    static final String CATEGORY_FACTORY_TAG = "categoryFactory";
    private static final String THROWABLE_RENDERER_TAG = "throwableRenderer";
    static final String APPENDER_TAG = "appender";
    static final String LEVEL_TAG = "level";
    static final String LOGGER_REF = "logger-ref";
    static final String CLASS_ATTR = "class";
    static final String CONFIGURATION_TAG = "log4j:configuration";
    static final String dbfKey = "javax.xml.parsers.DocumentBuilderFactory";
    static final String VALUE_ATTR = "value";
    static final String CONFIG_DEBUG_ATTR = "configDebug";
    static final String EMPTY_STR = "";
    static final String NAME_ATTR = "name";
    static final String INTERNAL_DEBUG_ATTR = "debug";
    static final String RENDERING_CLASS_ATTR = "renderingClass";
    private static final String RESET_ATTR = "reset";
    static final String LOGGER = "logger";
    static final String OLD_CONFIGURATION_TAG = "configuration";
    static final String LAYOUT_TAG = "layout";
    static final Class[] ONE_STRING_PARAM = {String.class};
    protected LoggerFactory catFactory = null;
    Hashtable appenderBag = new Hashtable();

    /* loaded from: classes5.dex */
    private interface ParseAction {
        Document parse(DocumentBuilder documentBuilder) throws SAXException, IOException;
    }

    public static void configure(Element element) {
        new DOMConfigurator().doConfigure(element, LogManager.getLoggerRepository());
    }

    public static void configureAndWatch(String str) {
        configureAndWatch(str, FileWatchdog.DEFAULT_DELAY);
    }

    public static Object parseElement(Element element, Properties properties, Class cls) throws Exception {
        Object instantiateByClassName = OptionConverter.instantiateByClassName(subst(element.getAttribute("class"), properties), cls, null);
        if (instantiateByClassName == null) {
            return null;
        }
        PropertySetter propertySetter = new PropertySetter(instantiateByClassName);
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i5 = 0; i5 < length; i5++) {
            Node item = childNodes.item(i5);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                if (element2.getTagName().equals("param")) {
                    setParameter(element2, propertySetter, properties);
                } else {
                    parseUnrecognizedElement(instantiateByClassName, element2, properties);
                }
            }
        }
        return instantiateByClassName;
    }

    private static void parseUnrecognizedElement(Object obj, Element element, Properties properties) throws Exception {
        if (obj instanceof UnrecognizedElementHandler ? ((UnrecognizedElementHandler) obj).parseUnrecognizedElement(element, properties) : false) {
            return;
        }
        LogLog.warn("Unrecognized element " + element.getNodeName());
    }

    private static void quietParseUnrecognizedElement(Object obj, Element element, Properties properties) {
        try {
            parseUnrecognizedElement(obj, element, properties);
        } catch (Exception e6) {
            if ((e6 instanceof InterruptedException) || (e6 instanceof InterruptedIOException)) {
                Thread.currentThread().interrupt();
            }
            LogLog.error("Error in extension content: ", e6);
        }
    }

    public void doConfigure(final String str, LoggerRepository loggerRepository) {
        doConfigure(new ParseAction() { // from class: org.apache.log4j.xml.DOMConfigurator.1
            @Override // org.apache.log4j.xml.DOMConfigurator.ParseAction
            public Document parse(DocumentBuilder documentBuilder) throws SAXException, IOException {
                return documentBuilder.parse(new File(str));
            }

            public String toString() {
                return a.a(new StringBuilder("file ["), str, "]");
            }
        }, loggerRepository);
    }

    protected Appender findAppenderByName(Document document, String str) {
        Element element;
        Appender appender = (Appender) this.appenderBag.get(str);
        if (appender != null) {
            return appender;
        }
        NodeList elementsByTagName = document.getElementsByTagName("appender");
        int i5 = 0;
        while (true) {
            if (i5 >= elementsByTagName.getLength()) {
                element = null;
                break;
            }
            Node item = elementsByTagName.item(i5);
            if (str.equals(item.getAttributes().getNamedItem("name").getNodeValue())) {
                element = (Element) item;
                break;
            }
            i5++;
        }
        if (element != null) {
            Appender parseAppender = parseAppender(element);
            if (parseAppender != null) {
                this.appenderBag.put(str, parseAppender);
            }
            return parseAppender;
        }
        LogLog.error("No appender named [" + str + "] could be found.");
        return null;
    }

    protected Appender findAppenderByReference(Element element) {
        return findAppenderByName(element.getOwnerDocument(), subst(element.getAttribute("ref")));
    }

    protected void parse(Element element) {
        ThrowableRenderer parseThrowableRenderer;
        String tagName = element.getTagName();
        if (!tagName.equals("log4j:configuration")) {
            if (!tagName.equals("configuration")) {
                LogLog.error("DOM element is - not a <log4j:configuration> element.");
                return;
            } else {
                LogLog.warn("The <configuration> element has been deprecated.");
                LogLog.warn("Use the <log4j:configuration> element instead.");
            }
        }
        String subst = subst(element.getAttribute("debug"));
        LogLog.debug("debug attribute= \"" + subst + "\".");
        if (subst.equals("") || subst.equals("null")) {
            LogLog.debug("Ignoring debug attribute.");
        } else {
            LogLog.setInternalDebugging(OptionConverter.toBoolean(subst, true));
        }
        String subst2 = subst(element.getAttribute("reset"));
        LogLog.debug("reset attribute= \"" + subst2 + "\".");
        if (!"".equals(subst2) && OptionConverter.toBoolean(subst2, false)) {
            this.repository.resetConfiguration();
        }
        String subst3 = subst(element.getAttribute("configDebug"));
        if (!subst3.equals("") && !subst3.equals("null")) {
            LogLog.warn("The \"configDebug\" attribute is deprecated.");
            LogLog.warn("Use the \"debug\" attribute instead.");
            LogLog.setInternalDebugging(OptionConverter.toBoolean(subst3, true));
        }
        String subst4 = subst(element.getAttribute("threshold"));
        LogLog.debug("Threshold =\"" + subst4 + "\".");
        if (!"".equals(subst4) && !"null".equals(subst4)) {
            this.repository.setThreshold(subst4);
        }
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i5 = 0; i5 < length; i5++) {
            Node item = childNodes.item(i5);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                String tagName2 = element2.getTagName();
                if (tagName2.equals("categoryFactory") || tagName2.equals("loggerFactory")) {
                    parseCategoryFactory(element2);
                }
            }
        }
        for (int i6 = 0; i6 < length; i6++) {
            Node item2 = childNodes.item(i6);
            if (item2.getNodeType() == 1) {
                Element element3 = (Element) item2;
                String tagName3 = element3.getTagName();
                if (tagName3.equals("category") || tagName3.equals("logger")) {
                    parseCategory(element3);
                } else if (tagName3.equals("root")) {
                    parseRoot(element3);
                } else if (tagName3.equals("renderer")) {
                    parseRenderer(element3);
                } else if (tagName3.equals("throwableRenderer")) {
                    if ((this.repository instanceof ThrowableRendererSupport) && (parseThrowableRenderer = parseThrowableRenderer(element3)) != null) {
                        ((ThrowableRendererSupport) this.repository).setThrowableRenderer(parseThrowableRenderer);
                    }
                } else if (!tagName3.equals("appender") && !tagName3.equals("categoryFactory") && !tagName3.equals("loggerFactory")) {
                    quietParseUnrecognizedElement(this.repository, element3, this.props);
                }
            }
        }
    }

    protected Appender parseAppender(Element element) {
        String subst = subst(element.getAttribute("class"));
        LogLog.debug("Class name: [" + subst + ']');
        try {
            Object newInstance = Loader.loadClass(subst).newInstance();
            Appender appender = (Appender) newInstance;
            PropertySetter propertySetter = new PropertySetter(appender);
            appender.setName(subst(element.getAttribute("name")));
            NodeList childNodes = element.getChildNodes();
            int length = childNodes.getLength();
            for (int i5 = 0; i5 < length; i5++) {
                Node item = childNodes.item(i5);
                if (item.getNodeType() == 1) {
                    Element element2 = (Element) item;
                    if (element2.getTagName().equals("param")) {
                        setParameter(element2, propertySetter);
                    } else if (element2.getTagName().equals("layout")) {
                        appender.setLayout(parseLayout(element2));
                    } else if (element2.getTagName().equals("filter")) {
                        parseFilters(element2, appender);
                    } else if (element2.getTagName().equals("errorHandler")) {
                        parseErrorHandler(element2, appender);
                    } else if (element2.getTagName().equals("appender-ref")) {
                        String subst2 = subst(element2.getAttribute("ref"));
                        if (appender instanceof AppenderAttachable) {
                            LogLog.debug("Attaching appender named [" + subst2 + "] to appender named [" + appender.getName() + "].");
                            ((AppenderAttachable) appender).addAppender(findAppenderByReference(element2));
                        } else {
                            LogLog.error("Requesting attachment of appender named [" + subst2 + "] to appender named [" + appender.getName() + "] which does not implement org.apache.log4j.spi.AppenderAttachable.");
                        }
                    } else {
                        parseUnrecognizedElement(newInstance, element2, this.props);
                    }
                }
            }
            propertySetter.activate();
            return appender;
        } catch (Exception e6) {
            if ((e6 instanceof InterruptedException) || (e6 instanceof InterruptedIOException)) {
                Thread.currentThread().interrupt();
            }
            LogLog.error("Could not create an Appender. Reported error follows.", e6);
            return null;
        }
    }

    protected void parseCategory(Element element) {
        Logger logger;
        String subst = subst(element.getAttribute("name"));
        String subst2 = subst(element.getAttribute("class"));
        if ("".equals(subst2)) {
            LogLog.debug("Retreiving an instance of org.apache.log4j.Logger.");
            LoggerFactory loggerFactory = this.catFactory;
            logger = loggerFactory == null ? this.repository.getLogger(subst) : this.repository.getLogger(subst, loggerFactory);
        } else {
            LogLog.debug("Desired logger sub-class: [" + subst2 + ']');
            try {
                logger = (Logger) Loader.loadClass(subst2).getMethod("getLogger", ONE_STRING_PARAM).invoke(null, subst);
            } catch (InvocationTargetException e6) {
                if ((e6.getTargetException() instanceof InterruptedException) || (e6.getTargetException() instanceof InterruptedIOException)) {
                    Thread.currentThread().interrupt();
                }
                LogLog.error("Could not retrieve category [" + subst + "]. Reported error follows.", e6);
                return;
            } catch (Exception e7) {
                LogLog.error("Could not retrieve category [" + subst + "]. Reported error follows.", e7);
                return;
            }
        }
        synchronized (logger) {
            boolean z5 = OptionConverter.toBoolean(subst(element.getAttribute("additivity")), true);
            LogLog.debug("Setting [" + logger.getName() + "] additivity to [" + z5 + "].");
            logger.setAdditivity(z5);
            parseChildrenOfLoggerElement(element, logger, false);
        }
    }

    protected void parseCategoryFactory(Element element) {
        String subst = subst(element.getAttribute("class"));
        if ("".equals(subst)) {
            LogLog.error("Category Factory tag class attribute not found.");
            LogLog.debug("No Category Factory configured.");
            return;
        }
        LogLog.debug("Desired category factory: [" + subst + ']');
        Object instantiateByClassName = OptionConverter.instantiateByClassName(subst, LoggerFactory.class, null);
        if (instantiateByClassName instanceof LoggerFactory) {
            this.catFactory = (LoggerFactory) instantiateByClassName;
        } else {
            LogLog.error("Category Factory class " + subst + " does not implement org.apache.log4j.LoggerFactory");
        }
        PropertySetter propertySetter = new PropertySetter(instantiateByClassName);
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i5 = 0; i5 < length; i5++) {
            Node item = childNodes.item(i5);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                if (element2.getTagName().equals("param")) {
                    setParameter(element2, propertySetter);
                } else {
                    quietParseUnrecognizedElement(instantiateByClassName, element2, this.props);
                }
            }
        }
    }

    protected void parseChildrenOfLoggerElement(Element element, Logger logger, boolean z5) {
        PropertySetter propertySetter = new PropertySetter(logger);
        logger.removeAllAppenders();
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i5 = 0; i5 < length; i5++) {
            Node item = childNodes.item(i5);
            if (item.getNodeType() == 1) {
                Element element2 = (Element) item;
                String tagName = element2.getTagName();
                if (tagName.equals("appender-ref")) {
                    Appender findAppenderByReference = findAppenderByReference(element2);
                    String subst = subst(element2.getAttribute("ref"));
                    if (findAppenderByReference != null) {
                        StringBuilder a6 = g.a("Adding appender named [", subst, "] to category [");
                        a6.append(logger.getName());
                        a6.append("].");
                        LogLog.debug(a6.toString());
                    } else {
                        LogLog.debug("Appender named [" + subst + "] not found.");
                    }
                    logger.addAppender(findAppenderByReference);
                } else if (tagName.equals("level")) {
                    parseLevel(element2, logger, z5);
                } else if (tagName.equals("priority")) {
                    parseLevel(element2, logger, z5);
                } else if (tagName.equals("param")) {
                    setParameter(element2, propertySetter);
                } else {
                    quietParseUnrecognizedElement(logger, element2, this.props);
                }
            }
        }
        propertySetter.activate();
    }

    protected void parseErrorHandler(Element element, Appender appender) {
        ErrorHandler errorHandler = (ErrorHandler) OptionConverter.instantiateByClassName(subst(element.getAttribute("class")), ErrorHandler.class, null);
        if (errorHandler != null) {
            errorHandler.setAppender(appender);
            PropertySetter propertySetter = new PropertySetter(errorHandler);
            NodeList childNodes = element.getChildNodes();
            int length = childNodes.getLength();
            for (int i5 = 0; i5 < length; i5++) {
                Node item = childNodes.item(i5);
                if (item.getNodeType() == 1) {
                    Element element2 = (Element) item;
                    String tagName = element2.getTagName();
                    if (tagName.equals("param")) {
                        setParameter(element2, propertySetter);
                    } else if (tagName.equals("appender-ref")) {
                        errorHandler.setBackupAppender(findAppenderByReference(element2));
                    } else if (tagName.equals("logger-ref")) {
                        String attribute = element2.getAttribute("ref");
                        LoggerFactory loggerFactory = this.catFactory;
                        errorHandler.setLogger(loggerFactory == null ? this.repository.getLogger(attribute) : this.repository.getLogger(attribute, loggerFactory));
                    } else if (tagName.equals("root-ref")) {
                        errorHandler.setLogger(this.repository.getRootLogger());
                    } else {
                        quietParseUnrecognizedElement(errorHandler, element2, this.props);
                    }
                }
            }
            propertySetter.activate();
            appender.setErrorHandler(errorHandler);
        }
    }

    protected void parseFilters(Element element, Appender appender) {
        Filter filter = (Filter) OptionConverter.instantiateByClassName(subst(element.getAttribute("class")), Filter.class, null);
        if (filter != null) {
            PropertySetter propertySetter = new PropertySetter(filter);
            NodeList childNodes = element.getChildNodes();
            int length = childNodes.getLength();
            for (int i5 = 0; i5 < length; i5++) {
                Node item = childNodes.item(i5);
                if (item.getNodeType() == 1) {
                    Element element2 = (Element) item;
                    if (element2.getTagName().equals("param")) {
                        setParameter(element2, propertySetter);
                    } else {
                        quietParseUnrecognizedElement(filter, element2, this.props);
                    }
                }
            }
            propertySetter.activate();
            LogLog.debug("Adding filter of type [" + filter.getClass() + "] to appender named [" + appender.getName() + "].");
            appender.addFilter(filter);
        }
    }

    protected Layout parseLayout(Element element) {
        String subst = subst(element.getAttribute("class"));
        LogLog.debug("Parsing layout of class: \"" + subst + "\"");
        try {
            Object newInstance = Loader.loadClass(subst).newInstance();
            Layout layout = (Layout) newInstance;
            PropertySetter propertySetter = new PropertySetter(layout);
            NodeList childNodes = element.getChildNodes();
            int length = childNodes.getLength();
            for (int i5 = 0; i5 < length; i5++) {
                Node item = childNodes.item(i5);
                if (item.getNodeType() == 1) {
                    Element element2 = (Element) item;
                    if (element2.getTagName().equals("param")) {
                        setParameter(element2, propertySetter);
                    } else {
                        parseUnrecognizedElement(newInstance, element2, this.props);
                    }
                }
            }
            propertySetter.activate();
            return layout;
        } catch (Exception e6) {
            if ((e6 instanceof InterruptedException) || (e6 instanceof InterruptedIOException)) {
                Thread.currentThread().interrupt();
            }
            LogLog.error("Could not create the Layout. Reported error follows.", e6);
            return null;
        }
    }

    protected void parseLevel(Element element, Logger logger, boolean z5) {
        String name = logger.getName();
        if (z5) {
            name = "root";
        }
        String subst = subst(element.getAttribute("value"));
        LogLog.debug("Level value for " + name + " is  [" + subst + "].");
        if (!"inherited".equalsIgnoreCase(subst) && !"null".equalsIgnoreCase(subst)) {
            String subst2 = subst(element.getAttribute("class"));
            if ("".equals(subst2)) {
                logger.setLevel(OptionConverter.toLevel(subst, Level.DEBUG));
            } else {
                LogLog.debug("Desired Level sub-class: [" + subst2 + ']');
                try {
                    logger.setLevel((Level) Loader.loadClass(subst2).getMethod("toLevel", ONE_STRING_PARAM).invoke(null, subst));
                } catch (Exception e6) {
                    if ((e6 instanceof InterruptedException) || (e6 instanceof InterruptedIOException)) {
                        Thread.currentThread().interrupt();
                    }
                    LogLog.error("Could not create level [" + subst + "]. Reported error follows.", e6);
                    return;
                }
            }
        } else if (z5) {
            LogLog.error("Root level cannot be inherited. Ignoring directive.");
        } else {
            logger.setLevel(null);
        }
        LogLog.debug(String.valueOf(name) + " level set to " + logger.getLevel());
    }

    protected void parseRenderer(Element element) {
        String subst = subst(element.getAttribute("renderingClass"));
        String subst2 = subst(element.getAttribute("renderedClass"));
        LoggerRepository loggerRepository = this.repository;
        if (loggerRepository instanceof RendererSupport) {
            RendererMap.addRenderer((RendererSupport) loggerRepository, subst2, subst);
        }
    }

    protected void parseRoot(Element element) {
        Logger rootLogger = this.repository.getRootLogger();
        synchronized (rootLogger) {
            parseChildrenOfLoggerElement(element, rootLogger, true);
        }
    }

    protected ThrowableRenderer parseThrowableRenderer(Element element) {
        String subst = subst(element.getAttribute("class"));
        LogLog.debug("Parsing throwableRenderer of class: \"" + subst + "\"");
        try {
            Object newInstance = Loader.loadClass(subst).newInstance();
            ThrowableRenderer throwableRenderer = (ThrowableRenderer) newInstance;
            PropertySetter propertySetter = new PropertySetter(throwableRenderer);
            NodeList childNodes = element.getChildNodes();
            int length = childNodes.getLength();
            for (int i5 = 0; i5 < length; i5++) {
                Node item = childNodes.item(i5);
                if (item.getNodeType() == 1) {
                    Element element2 = (Element) item;
                    if (element2.getTagName().equals("param")) {
                        setParameter(element2, propertySetter);
                    } else {
                        parseUnrecognizedElement(newInstance, element2, this.props);
                    }
                }
            }
            propertySetter.activate();
            return throwableRenderer;
        } catch (Exception e6) {
            if ((e6 instanceof InterruptedException) || (e6 instanceof InterruptedIOException)) {
                Thread.currentThread().interrupt();
            }
            LogLog.error("Could not create the ThrowableRenderer. Reported error follows.", e6);
            return null;
        }
    }

    protected void setParameter(Element element, PropertySetter propertySetter) {
        propertySetter.setProperty(subst(element.getAttribute("name")), subst(OptionConverter.convertSpecialChars(element.getAttribute("value"))));
    }

    protected String subst(String str) {
        return subst(str, this.props);
    }

    public static void configureAndWatch(String str, long j5) {
        XMLWatchdog xMLWatchdog = new XMLWatchdog(str);
        xMLWatchdog.setDelay(j5);
        xMLWatchdog.start();
    }

    public static String subst(String str, Properties properties) {
        try {
            return OptionConverter.substVars(str, properties);
        } catch (IllegalArgumentException e6) {
            LogLog.warn("Could not perform variable substitution.", e6);
            return str;
        }
    }

    public static void configure(String str) throws FactoryConfigurationError {
        new DOMConfigurator().doConfigure(str, LogManager.getLoggerRepository());
    }

    @Override // org.apache.log4j.spi.Configurator
    public void doConfigure(final URL url, LoggerRepository loggerRepository) {
        doConfigure(new ParseAction() { // from class: org.apache.log4j.xml.DOMConfigurator.2
            @Override // org.apache.log4j.xml.DOMConfigurator.ParseAction
            public Document parse(DocumentBuilder documentBuilder) throws SAXException, IOException {
                URLConnection openConnection = url.openConnection();
                openConnection.setUseCaches(false);
                InputStream inputStream = openConnection.getInputStream();
                try {
                    InputSource inputSource = new InputSource(inputStream);
                    inputSource.setSystemId(url.toString());
                    return documentBuilder.parse(inputSource);
                } finally {
                    inputStream.close();
                }
            }

            public String toString() {
                return "url [" + url.toString() + "]";
            }
        }, loggerRepository);
    }

    public static void setParameter(Element element, PropertySetter propertySetter, Properties properties) {
        propertySetter.setProperty(subst(element.getAttribute("name"), properties), subst(OptionConverter.convertSpecialChars(element.getAttribute("value")), properties));
    }

    @Override // org.apache.log4j.spi.Configurator
    public void doConfigure(final InputStream inputStream, LoggerRepository loggerRepository) throws FactoryConfigurationError {
        doConfigure(new ParseAction() { // from class: org.apache.log4j.xml.DOMConfigurator.3
            @Override // org.apache.log4j.xml.DOMConfigurator.ParseAction
            public Document parse(DocumentBuilder documentBuilder) throws SAXException, IOException {
                InputSource inputSource = new InputSource(inputStream);
                inputSource.setSystemId("dummy://log4j.dtd");
                return documentBuilder.parse(inputSource);
            }

            public String toString() {
                return "input stream [" + inputStream.toString() + "]";
            }
        }, loggerRepository);
    }

    public static void configure(URL url) throws FactoryConfigurationError {
        new DOMConfigurator().doConfigure(url, LogManager.getLoggerRepository());
    }

    public void doConfigure(final Reader reader, LoggerRepository loggerRepository) throws FactoryConfigurationError {
        doConfigure(new ParseAction() { // from class: org.apache.log4j.xml.DOMConfigurator.4
            @Override // org.apache.log4j.xml.DOMConfigurator.ParseAction
            public Document parse(DocumentBuilder documentBuilder) throws SAXException, IOException {
                InputSource inputSource = new InputSource(reader);
                inputSource.setSystemId("dummy://log4j.dtd");
                return documentBuilder.parse(inputSource);
            }

            public String toString() {
                return "reader [" + reader.toString() + "]";
            }
        }, loggerRepository);
    }

    protected void doConfigure(final InputSource inputSource, LoggerRepository loggerRepository) throws FactoryConfigurationError {
        if (inputSource.getSystemId() == null) {
            inputSource.setSystemId("dummy://log4j.dtd");
        }
        doConfigure(new ParseAction() { // from class: org.apache.log4j.xml.DOMConfigurator.5
            @Override // org.apache.log4j.xml.DOMConfigurator.ParseAction
            public Document parse(DocumentBuilder documentBuilder) throws SAXException, IOException {
                return documentBuilder.parse(inputSource);
            }

            public String toString() {
                return "input source [" + inputSource.toString() + "]";
            }
        }, loggerRepository);
    }

    private final void doConfigure(ParseAction parseAction, LoggerRepository loggerRepository) throws FactoryConfigurationError {
        this.repository = loggerRepository;
        try {
            LogLog.debug("System property is :" + OptionConverter.getSystemProperty("javax.xml.parsers.DocumentBuilderFactory", null));
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            LogLog.debug("Standard DocumentBuilderFactory search succeded.");
            LogLog.debug("DocumentBuilderFactory is: ".concat(newInstance.getClass().getName()));
            try {
                newInstance.setValidating(true);
                DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
                newDocumentBuilder.setErrorHandler(new SAXErrorHandler());
                newDocumentBuilder.setEntityResolver(new Log4jEntityResolver());
                parse(parseAction.parse(newDocumentBuilder).getDocumentElement());
            } catch (Exception e6) {
                if ((e6 instanceof InterruptedException) || (e6 instanceof InterruptedIOException)) {
                    Thread.currentThread().interrupt();
                }
                LogLog.error("Could not parse " + parseAction.toString() + ".", e6);
            }
        } catch (FactoryConfigurationError e7) {
            LogLog.debug("Could not instantiate a DocumentBuilderFactory.", e7.getException());
            throw e7;
        }
    }

    public void doConfigure(Element element, LoggerRepository loggerRepository) {
        this.repository = loggerRepository;
        parse(element);
    }
}
