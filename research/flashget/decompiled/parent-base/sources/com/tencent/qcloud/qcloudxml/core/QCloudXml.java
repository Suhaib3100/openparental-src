package com.tencent.qcloud.qcloudxml.core;

import android.util.Xml;
import androidx.core.database.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public final class QCloudXml {
    static final Map<Class<?>, IXmlAdapter<?>> XML_ADAPTERS = new HashMap();

    private static <T> IXmlAdapter<T> createXmlAdapter(Class<?> cls) {
        String s4 = ProtectedSandApp.s("孏\u0001");
        String s5 = ProtectedSandApp.s("子\u0001");
        String s6 = ProtectedSandApp.s("孑\u0001");
        Map<Class<?>, IXmlAdapter<?>> map = XML_ADAPTERS;
        IXmlAdapter<T> iXmlAdapter = (IXmlAdapter) map.get(cls);
        if (iXmlAdapter != null) {
            return iXmlAdapter;
        }
        String name = cls.getName();
        try {
            IXmlAdapter<T> iXmlAdapter2 = (IXmlAdapter) Class.forName(name.concat(s6)).newInstance();
            map.put(cls, iXmlAdapter2);
            return iXmlAdapter2;
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException(c.a(s5, name, s4, name, s6), e4);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(c.a(s5, name, s4, name, s6), e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException(c.a(s5, name, s4, name, s6), e6);
        }
    }

    public static <T> T fromXml(InputStream inputStream, Class<T> cls) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("孒\u0001"));
        return (T) fromXml(newPullParser, cls);
    }

    private static String removeXMLHeader(String str) {
        return (str == null || !str.startsWith(ProtectedSandApp.s("孓\u0001"))) ? str : str.substring(str.indexOf(ProtectedSandApp.s("孔\u0001")) + 2);
    }

    public static <T> String toXml(T t4) throws XmlPullParserException, IOException {
        if (t4 == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
        newSerializer.setOutput(stringWriter);
        newSerializer.setFeature(ProtectedSandApp.s("孕\u0001"), true);
        newSerializer.startDocument(ProtectedSandApp.s("孒\u0001"), null);
        toXml(newSerializer, t4);
        newSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    public static <T> T fromXml(XmlPullParser xmlPullParser, Class<T> cls) throws XmlPullParserException, IOException {
        return (T) fromXml(xmlPullParser, cls, null);
    }

    public static <T> T fromXml(XmlPullParser xmlPullParser, Class<T> cls, String str) throws XmlPullParserException, IOException {
        return (T) createXmlAdapter(cls).fromXml(xmlPullParser, str);
    }

    public static <T> void toXml(XmlSerializer xmlSerializer, T t4) throws XmlPullParserException, IOException {
        toXml(xmlSerializer, t4, null);
    }

    public static <T> void toXml(XmlSerializer xmlSerializer, T t4, String str) throws XmlPullParserException, IOException {
        createXmlAdapter(t4.getClass()).toXml(xmlSerializer, t4, str);
    }
}
