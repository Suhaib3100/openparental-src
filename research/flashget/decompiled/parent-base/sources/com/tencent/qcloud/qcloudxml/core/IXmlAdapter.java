package com.tencent.qcloud.qcloudxml.core;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public abstract class IXmlAdapter<T> {
    public T fromXml(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        throw new IllegalStateException(ProtectedSandApp.s("㨥\u0001"));
    }

    public void toXml(XmlSerializer xmlSerializer, T t4, String str) throws XmlPullParserException, IOException {
        throw new IllegalStateException(ProtectedSandApp.s("㨦\u0001"));
    }
}
