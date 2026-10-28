package com.tencent.cos.xml.model.bucket;

import android.util.Xml;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.tag.ListMultipartUploads;
import com.tencent.qcloud.core.http.HttpResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes6.dex */
public final class ListMultiUploadsResult extends CosXmlResult {
    public ListMultipartUploads listMultipartUploads = new ListMultipartUploads();

    public static void parseListMultipartUploadsResult(InputStream inputStream, ListMultipartUploads listMultipartUploads) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, ProtectedSandApp.s("㚭\u0001"));
        listMultipartUploads.uploads = new ArrayList();
        listMultipartUploads.commonPrefixes = new ArrayList();
        ListMultipartUploads.Upload upload = null;
        ListMultipartUploads.CommonPrefixes commonPrefixes = null;
        ListMultipartUploads.Owner owner = null;
        ListMultipartUploads.Initiator initiator = null;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            String s4 = ProtectedSandApp.s("㚮\u0001");
            String s5 = ProtectedSandApp.s("㚯\u0001");
            String s6 = ProtectedSandApp.s("㚰\u0001");
            String s7 = ProtectedSandApp.s("㚱\u0001");
            if (eventType == 2) {
                String name = newPullParser.getName();
                if (name.equalsIgnoreCase(ProtectedSandApp.s("㚲\u0001"))) {
                    newPullParser.next();
                    listMultipartUploads.bucket = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("㚳\u0001"))) {
                    newPullParser.next();
                    listMultipartUploads.encodingType = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("㚴\u0001"))) {
                    newPullParser.next();
                    listMultipartUploads.keyMarker = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("㚵\u0001"))) {
                    newPullParser.next();
                    listMultipartUploads.uploadIdMarker = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("㚶\u0001"))) {
                    newPullParser.next();
                    listMultipartUploads.nextKeyMarker = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("㚷\u0001"))) {
                    newPullParser.next();
                    listMultipartUploads.nextUploadIdMarker = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("㚸\u0001"))) {
                    newPullParser.next();
                    listMultipartUploads.maxUploads = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("㚹\u0001"))) {
                    newPullParser.next();
                    listMultipartUploads.isTruncated = Boolean.parseBoolean(newPullParser.getText());
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("㚺\u0001"))) {
                    newPullParser.next();
                    if (commonPrefixes == null) {
                        listMultipartUploads.prefix = newPullParser.getText();
                    } else {
                        commonPrefixes.prefix = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("㚻\u0001"))) {
                    newPullParser.next();
                    listMultipartUploads.delimiter = newPullParser.getText();
                } else if (name.equalsIgnoreCase(s7)) {
                    upload = new ListMultipartUploads.Upload();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("㚼\u0001"))) {
                    newPullParser.next();
                    upload.key = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("㚽\u0001"))) {
                    newPullParser.next();
                    upload.uploadID = newPullParser.getText();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("㚾\u0001"))) {
                    newPullParser.next();
                    upload.storageClass = newPullParser.getText();
                } else if (name.equalsIgnoreCase(s4)) {
                    initiator = new ListMultipartUploads.Initiator();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("㚿\u0001"))) {
                    newPullParser.next();
                    if (initiator != null) {
                        initiator.uin = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(s5)) {
                    owner = new ListMultipartUploads.Owner();
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("㛀\u0001"))) {
                    newPullParser.next();
                    if (owner != null) {
                        owner.uid = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("㛁\u0001"))) {
                    newPullParser.next();
                    if (owner != null) {
                        owner.f71730id = newPullParser.getText();
                    } else if (initiator != null) {
                        initiator.f71729id = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("㛂\u0001"))) {
                    newPullParser.next();
                    if (owner != null) {
                        owner.displayName = newPullParser.getText();
                    } else if (initiator != null) {
                        initiator.displayName = newPullParser.getText();
                    }
                } else if (name.equalsIgnoreCase(ProtectedSandApp.s("㛃\u0001"))) {
                    newPullParser.next();
                    upload.initiated = newPullParser.getText();
                } else if (name.equalsIgnoreCase(s6)) {
                    commonPrefixes = new ListMultipartUploads.CommonPrefixes();
                }
            } else if (eventType == 3) {
                String name2 = newPullParser.getName();
                if (name2.equalsIgnoreCase(s7)) {
                    listMultipartUploads.uploads.add(upload);
                    upload = null;
                } else if (name2.equalsIgnoreCase(s6)) {
                    listMultipartUploads.commonPrefixes.add(commonPrefixes);
                    commonPrefixes = null;
                } else if (name2.equalsIgnoreCase(s5)) {
                    upload.owner = owner;
                    owner = null;
                } else if (name2.equalsIgnoreCase(s4)) {
                    upload.initiator = initiator;
                    initiator = null;
                }
            }
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public String printResult() {
        ListMultipartUploads listMultipartUploads = this.listMultipartUploads;
        return listMultipartUploads != null ? listMultipartUploads.toString() : super.printResult();
    }

    @Override // com.tencent.cos.xml.model.CosXmlResult
    protected void xmlParser(HttpResponse httpResponse) throws XmlPullParserException, IOException {
        parseListMultipartUploadsResult(httpResponse.byteStream(), this.listMultipartUploads);
    }
}
