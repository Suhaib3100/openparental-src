package com.tencent.cos.xml.utils;

import android.util.Xml;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.CosError;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class BaseXmlSlimParser {
    public static void parseError(InputStream inputStream, CosError cosError) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("偣\u0001"));
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            if (eventType == 2) {
                String name = newPullParser.getName();
                if (name.equalsIgnoreCase(ProtectedSandApp.s("偤\u0001"))) {
                    newPullParser.next();
                    cosError.code = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("健\u0001"))) {
                    newPullParser.next();
                    cosError.message = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偦\u0001"))) {
                    newPullParser.next();
                    cosError.resource = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偧\u0001"))) {
                    newPullParser.next();
                    cosError.requestId = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偨\u0001"))) {
                    newPullParser.next();
                    cosError.traceId = newPullParser.getText();
                }
            }
        }
    }
}
