package com.tencent.qcloud.qcloudxml.core;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public interface ChildElementBinder<T> {
    void fromXml(XmlPullParser xmlPullParser, T t4, String str) throws IOException, XmlPullParserException;
}
