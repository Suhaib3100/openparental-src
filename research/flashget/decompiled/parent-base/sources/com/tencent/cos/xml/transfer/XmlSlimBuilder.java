package com.tencent.cos.xml.transfer;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.CompleteMultipartUpload;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class XmlSlimBuilder {
    private static void addElement(XmlSerializer xmlSerializer, String str, String str2) throws IOException {
        if (str2 != null) {
            xmlSerializer.startTag("", str);
            xmlSerializer.text(str2);
            xmlSerializer.endTag("", str);
        }
    }

    public static String buildCompleteMultipartUpload(CompleteMultipartUpload completeMultipartUpload) throws IOException, XmlPullParserException {
        if (completeMultipartUpload == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
        newSerializer.setOutput(stringWriter);
        newSerializer.setFeature(ProtectedSandApp.s("俤\u0001"), true);
        newSerializer.startDocument(ProtectedSandApp.s("俥\u0001"), null);
        String s4 = ProtectedSandApp.s("俦\u0001");
        newSerializer.startTag("", s4);
        List<CompleteMultipartUpload.Part> list = completeMultipartUpload.parts;
        if (list != null) {
            for (CompleteMultipartUpload.Part part : list) {
                if (part != null) {
                    String s5 = ProtectedSandApp.s("俧\u0001");
                    newSerializer.startTag("", s5);
                    addElement(newSerializer, ProtectedSandApp.s("俨\u0001"), String.valueOf(part.partNumber));
                    addElement(newSerializer, ProtectedSandApp.s("俩\u0001"), part.eTag);
                    newSerializer.endTag("", s5);
                }
            }
        }
        newSerializer.endTag("", s4);
        newSerializer.endDocument();
        return removeXMLHeader(stringWriter.toString());
    }

    private static String removeXMLHeader(String str) {
        return (str == null || !str.startsWith(ProtectedSandApp.s("俪\u0001"))) ? str : str.substring(str.indexOf(ProtectedSandApp.s("俫\u0001")) + 2);
    }
}
