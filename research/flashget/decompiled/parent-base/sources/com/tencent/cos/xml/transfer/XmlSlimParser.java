package com.tencent.cos.xml.transfer;

import android.util.Xml;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.CopyObject;
import com.tencent.cos.xml.model.tag.InitiateMultipartUpload;
import com.tencent.cos.xml.model.tag.ListParts;
import com.tencent.cos.xml.utils.BaseXmlSlimParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class XmlSlimParser extends BaseXmlSlimParser {
    public static void parseCopyObjectResult(InputStream inputStream, CopyObject copyObject) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("偩\u0001"));
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            if (eventType == 2) {
                String name = newPullParser.getName();
                if (name.equalsIgnoreCase(ProtectedSandApp.s("偪\u0001"))) {
                    newPullParser.next();
                    copyObject.eTag = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偫\u0001"))) {
                    newPullParser.next();
                    copyObject.lastModified = newPullParser.getText();
                }
            }
        }
    }

    public static void parseInitiateMultipartUploadResult(InputStream inputStream, InitiateMultipartUpload initiateMultipartUpload) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("偩\u0001"));
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            if (eventType == 2) {
                String name = newPullParser.getName();
                if (name.equalsIgnoreCase(ProtectedSandApp.s("偬\u0001"))) {
                    newPullParser.next();
                    initiateMultipartUpload.bucket = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偭\u0001"))) {
                    newPullParser.next();
                    initiateMultipartUpload.key = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偮\u0001"))) {
                    newPullParser.next();
                    initiateMultipartUpload.uploadId = newPullParser.getText();
                }
            }
        }
    }

    public static void parseListPartsResult(InputStream inputStream, ListParts listParts) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("偩\u0001"));
        listParts.parts = new ArrayList();
        ListParts.Owner owner = null;
        ListParts.Initiator initiator = null;
        ListParts.Part part = null;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            String s4 = ProtectedSandApp.s("偯\u0001");
            String s5 = ProtectedSandApp.s("偰\u0001");
            String s6 = ProtectedSandApp.s("偱\u0001");
            if (eventType == 2) {
                String name = newPullParser.getName();
                if (name.equalsIgnoreCase(ProtectedSandApp.s("偬\u0001"))) {
                    newPullParser.next();
                    listParts.bucket = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偲\u0001"))) {
                    newPullParser.next();
                    listParts.encodingType = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偳\u0001"))) {
                    newPullParser.next();
                    listParts.encodingType = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偭\u0001"))) {
                    newPullParser.next();
                    listParts.key = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偮\u0001"))) {
                    newPullParser.next();
                    listParts.uploadId = newPullParser.getText();
                } else if (name.equalsIgnoreCase(s6)) {
                    owner = new ListParts.Owner();
                } else if (name.equalsIgnoreCase(s5)) {
                    initiator = new ListParts.Initiator();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("側\u0001"))) {
                    newPullParser.next();
                    if (owner != null) {
                        owner.f71732id = newPullParser.getText();
                    } else if (initiator != null) {
                        initiator.f71731id = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偵\u0001"))) {
                    newPullParser.next();
                    if (owner != null) {
                        owner.disPlayName = newPullParser.getText();
                    } else if (initiator != null) {
                        initiator.disPlayName = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偶\u0001"))) {
                    newPullParser.next();
                    listParts.partNumberMarker = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偷\u0001"))) {
                    newPullParser.next();
                    listParts.storageClass = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偸\u0001"))) {
                    newPullParser.next();
                    listParts.nextPartNumberMarker = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偹\u0001"))) {
                    newPullParser.next();
                    listParts.maxParts = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偺\u0001"))) {
                    newPullParser.next();
                    listParts.isTruncated = Boolean.parseBoolean(newPullParser.getText());
                } else if (name.equalsIgnoreCase(s4)) {
                    part = new ListParts.Part();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偻\u0001"))) {
                    newPullParser.next();
                    part.partNumber = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偫\u0001"))) {
                    newPullParser.next();
                    part.lastModified = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偪\u0001"))) {
                    newPullParser.next();
                    part.eTag = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("偼\u0001"))) {
                    newPullParser.next();
                    part.size = newPullParser.getText();
                }
            } else if (eventType == 3) {
                String name2 = newPullParser.getName();
                if (name2.equalsIgnoreCase(s6)) {
                    listParts.owner = owner;
                    owner = null;
                } else if (name2.equalsIgnoreCase(s5)) {
                    listParts.initiator = initiator;
                    initiator = null;
                } else if (name2.equalsIgnoreCase(s4)) {
                    listParts.parts.add(part);
                    part = null;
                }
            }
        }
    }
}
