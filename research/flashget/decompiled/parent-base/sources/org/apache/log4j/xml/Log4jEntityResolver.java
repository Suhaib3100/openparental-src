package org.apache.log4j.xml;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.apache.log4j.helpers.LogLog;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;

/* loaded from: classes3.dex */
public class Log4jEntityResolver implements EntityResolver {
    private static final String PUBLIC_ID = "-//APACHE//DTD LOG4J 1.2//EN";

    @Override // org.xml.sax.EntityResolver
    public InputSource resolveEntity(String str, String str2) {
        if (!str2.endsWith("log4j.dtd") && !"-//APACHE//DTD LOG4J 1.2//EN".equals(str)) {
            return null;
        }
        Class<?> cls = getClass();
        InputStream a5 = ProtectedSandApp.a(cls, "/org/apache/log4j/xml/log4j.dtd");
        if (a5 == null) {
            LogLog.warn("Could not find [log4j.dtd] using [" + cls.getClassLoader() + "] class loader, parsed without DTD.");
            a5 = new ByteArrayInputStream(new byte[0]);
        }
        return new InputSource(a5);
    }
}
