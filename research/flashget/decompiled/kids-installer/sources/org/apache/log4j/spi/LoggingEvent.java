package org.apache.log4j.spi;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import org.apache.log4j.Category;
import org.apache.log4j.Level;
import org.apache.log4j.MDC;
import org.apache.log4j.NDC;
import org.apache.log4j.Priority;
import org.apache.log4j.helpers.Loader;
import org.apache.log4j.helpers.LogLog;

/* loaded from: classes5.dex */
public class LoggingEvent implements Serializable {
    static final long serialVersionUID = -868428216207166145L;
    public final String categoryName;
    public final transient String fqnOfCategoryClass;
    public transient Priority level;
    private LocationInfo locationInfo;
    private transient Category logger;
    private Hashtable mdcCopy;
    private boolean mdcCopyLookupRequired;
    private transient Object message;
    private String ndc;
    private boolean ndcLookupRequired;
    private String renderedMessage;
    private String threadName;
    private ThrowableInformation throwableInfo;
    public final long timeStamp;
    static final String TO_LEVEL = "toLevel";
    private static long startTime = System.currentTimeMillis();
    static final Integer[] PARAM_ARRAY = new Integer[1];
    static final Class[] TO_LEVEL_PARAMS = {Integer.TYPE};
    static final Hashtable methodCache = new Hashtable(3);

    public LoggingEvent(String str, Category category, Priority priority, Object obj, Throwable th) {
        this.ndcLookupRequired = true;
        this.mdcCopyLookupRequired = true;
        this.fqnOfCategoryClass = str;
        this.logger = category;
        this.categoryName = category.getName();
        this.level = priority;
        this.message = obj;
        if (th != null) {
            this.throwableInfo = new ThrowableInformation(th, category);
        }
        this.timeStamp = System.currentTimeMillis();
    }

    public static long getStartTime() {
        return startTime;
    }

    private void readLevel(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int readInt = objectInputStream.readInt();
        try {
            String str = (String) objectInputStream.readObject();
            if (str == null) {
                this.level = Level.toLevel(readInt);
                return;
            }
            Hashtable hashtable = methodCache;
            Method method = (Method) hashtable.get(str);
            if (method == null) {
                method = Loader.loadClass(str).getDeclaredMethod("toLevel", TO_LEVEL_PARAMS);
                hashtable.put(str, method);
            }
            this.level = (Level) method.invoke(null, new Integer(readInt));
        } catch (IllegalAccessException e6) {
            LogLog.warn("Level deserialization failed, reverting to default.", e6);
            this.level = Level.toLevel(readInt);
        } catch (NoSuchMethodException e7) {
            LogLog.warn("Level deserialization failed, reverting to default.", e7);
            this.level = Level.toLevel(readInt);
        } catch (RuntimeException e8) {
            LogLog.warn("Level deserialization failed, reverting to default.", e8);
            this.level = Level.toLevel(readInt);
        } catch (InvocationTargetException e9) {
            if ((e9.getTargetException() instanceof InterruptedException) || (e9.getTargetException() instanceof InterruptedIOException)) {
                Thread.currentThread().interrupt();
            }
            LogLog.warn("Level deserialization failed, reverting to default.", e9);
            this.level = Level.toLevel(readInt);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        readLevel(objectInputStream);
        if (this.locationInfo == null) {
            this.locationInfo = new LocationInfo(null, null);
        }
    }

    private void writeLevel(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.level.toInt());
        Class<?> cls = this.level.getClass();
        if (cls == Level.class) {
            objectOutputStream.writeObject(null);
        } else {
            objectOutputStream.writeObject(cls.getName());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        getThreadName();
        getRenderedMessage();
        getNDC();
        getMDCCopy();
        getThrowableStrRep();
        objectOutputStream.defaultWriteObject();
        writeLevel(objectOutputStream);
    }

    public String getFQNOfLoggerClass() {
        return this.fqnOfCategoryClass;
    }

    public Level getLevel() {
        return (Level) this.level;
    }

    public LocationInfo getLocationInformation() {
        if (this.locationInfo == null) {
            this.locationInfo = new LocationInfo(new Throwable(), this.fqnOfCategoryClass);
        }
        return this.locationInfo;
    }

    public Category getLogger() {
        return this.logger;
    }

    public String getLoggerName() {
        return this.categoryName;
    }

    public Object getMDC(String str) {
        Object obj;
        Hashtable hashtable = this.mdcCopy;
        return (hashtable == null || (obj = hashtable.get(str)) == null) ? MDC.get(str) : obj;
    }

    public void getMDCCopy() {
        if (this.mdcCopyLookupRequired) {
            this.mdcCopyLookupRequired = false;
            Hashtable context = MDC.getContext();
            if (context != null) {
                this.mdcCopy = (Hashtable) context.clone();
            }
        }
    }

    public Object getMessage() {
        Object obj = this.message;
        return obj != null ? obj : getRenderedMessage();
    }

    public String getNDC() {
        if (this.ndcLookupRequired) {
            this.ndcLookupRequired = false;
            this.ndc = NDC.get();
        }
        return this.ndc;
    }

    public Map getProperties() {
        getMDCCopy();
        Map map = this.mdcCopy;
        if (map == null) {
            map = new HashMap();
        }
        return Collections.unmodifiableMap(map);
    }

    public final String getProperty(String str) {
        Object mdc = getMDC(str);
        if (mdc != null) {
            return mdc.toString();
        }
        return null;
    }

    public Set getPropertyKeySet() {
        return getProperties().keySet();
    }

    public String getRenderedMessage() {
        Object obj;
        if (this.renderedMessage == null && (obj = this.message) != null) {
            if (obj instanceof String) {
                this.renderedMessage = (String) obj;
            } else {
                LoggerRepository loggerRepository = this.logger.getLoggerRepository();
                if (loggerRepository instanceof RendererSupport) {
                    this.renderedMessage = ((RendererSupport) loggerRepository).getRendererMap().findAndRender(this.message);
                } else {
                    this.renderedMessage = this.message.toString();
                }
            }
        }
        return this.renderedMessage;
    }

    public String getThreadName() {
        if (this.threadName == null) {
            this.threadName = Thread.currentThread().getName();
        }
        return this.threadName;
    }

    public ThrowableInformation getThrowableInformation() {
        return this.throwableInfo;
    }

    public String[] getThrowableStrRep() {
        ThrowableInformation throwableInformation = this.throwableInfo;
        if (throwableInformation == null) {
            return null;
        }
        return throwableInformation.getThrowableStrRep();
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final boolean locationInformationExists() {
        return this.locationInfo != null;
    }

    public Object removeProperty(String str) {
        if (this.mdcCopy == null) {
            getMDCCopy();
        }
        if (this.mdcCopy == null) {
            this.mdcCopy = new Hashtable();
        }
        return this.mdcCopy.remove(str);
    }

    public final void setProperty(String str, String str2) {
        if (this.mdcCopy == null) {
            getMDCCopy();
        }
        if (this.mdcCopy == null) {
            this.mdcCopy = new Hashtable();
        }
        this.mdcCopy.put(str, str2);
    }

    public LoggingEvent(String str, Category category, long j5, Priority priority, Object obj, Throwable th) {
        this.ndcLookupRequired = true;
        this.mdcCopyLookupRequired = true;
        this.fqnOfCategoryClass = str;
        this.logger = category;
        this.categoryName = category.getName();
        this.level = priority;
        this.message = obj;
        if (th != null) {
            this.throwableInfo = new ThrowableInformation(th, category);
        }
        this.timeStamp = j5;
    }

    public LoggingEvent(String str, Category category, long j5, Level level, Object obj, String str2, ThrowableInformation throwableInformation, String str3, LocationInfo locationInfo, Map map) {
        this.ndcLookupRequired = true;
        this.mdcCopyLookupRequired = true;
        this.fqnOfCategoryClass = str;
        this.logger = category;
        if (category != null) {
            this.categoryName = category.getName();
        } else {
            this.categoryName = null;
        }
        this.level = level;
        this.message = obj;
        if (throwableInformation != null) {
            this.throwableInfo = throwableInformation;
        }
        this.timeStamp = j5;
        this.threadName = str2;
        this.ndcLookupRequired = false;
        this.ndc = str3;
        this.locationInfo = locationInfo;
        this.mdcCopyLookupRequired = false;
        if (map != null) {
            this.mdcCopy = new Hashtable(map);
        }
    }
}
