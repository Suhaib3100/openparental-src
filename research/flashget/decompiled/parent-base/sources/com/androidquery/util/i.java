package com.androidquery.util;

import android.util.Xml;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: XmlDom.java */
/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private Element f41285a;

    public i(Element element) {
        this.f41285a = element;
    }

    private static i f(Node node, String str, String str2, String str3) {
        if (node.getNodeType() != 1) {
            return null;
        }
        Element element = (Element) node;
        if (str != null && !str.equals(element.getTagName())) {
            return null;
        }
        if (str2 != null && !element.hasAttribute(str2)) {
            return null;
        }
        if (str3 == null || str3.equals(element.getAttribute(str2))) {
            return new i(element);
        }
        return null;
    }

    private static List<i> g(NodeList nodeList, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < nodeList.getLength(); i4++) {
            i f4 = f(nodeList.item(i4), str, str2, str3);
            if (f4 != null) {
                arrayList.add(f4);
            }
        }
        return arrayList;
    }

    private String i(Element element, int i4) {
        String str;
        try {
            XmlSerializer newSerializer = Xml.newSerializer();
            StringWriter stringWriter = new StringWriter();
            newSerializer.setOutput(stringWriter);
            newSerializer.startDocument(ProtectedSandApp.s("\u07b9"), null);
            if (i4 > 0) {
                char[] cArr = new char[i4];
                Arrays.fill(cArr, ' ');
                str = new String(cArr);
            } else {
                str = null;
            }
            j(this.f41285a, newSerializer, 0, str);
            newSerializer.endDocument();
            return stringWriter.toString();
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    private void j(Element element, XmlSerializer xmlSerializer, int i4, String str) throws Exception {
        String tagName = element.getTagName();
        s(xmlSerializer, i4, str);
        xmlSerializer.startTag("", tagName);
        if (element.hasAttributes()) {
            NamedNodeMap attributes = element.getAttributes();
            for (int i5 = 0; i5 < attributes.getLength(); i5++) {
                Attr attr = (Attr) attributes.item(i5);
                xmlSerializer.attribute("", attr.getName(), attr.getValue());
            }
        }
        if (element.hasChildNodes()) {
            NodeList childNodes = element.getChildNodes();
            int i6 = 0;
            for (int i7 = 0; i7 < childNodes.getLength(); i7++) {
                Node item = childNodes.item(i7);
                short nodeType = item.getNodeType();
                if (nodeType == 1) {
                    j((Element) item, xmlSerializer, i4 + 1, str);
                    i6++;
                } else if (nodeType == 3) {
                    xmlSerializer.text(q(item));
                } else if (nodeType == 4) {
                    xmlSerializer.cdsect(q(item));
                }
            }
            if (i6 > 0) {
                s(xmlSerializer, i4, str);
            }
        }
        xmlSerializer.endTag("", tagName);
    }

    private String q(Node node) {
        String nodeValue;
        short nodeType = node.getNodeType();
        if (nodeType != 3) {
            nodeValue = nodeType != 4 ? null : node.getNodeValue();
        } else {
            nodeValue = node.getNodeValue();
            if (nodeValue != null) {
                nodeValue = nodeValue.trim();
            }
        }
        return nodeValue == null ? "" : nodeValue;
    }

    private void s(XmlSerializer xmlSerializer, int i4, String str) throws Exception {
        if (str != null) {
            xmlSerializer.text(ProtectedSandApp.s("\u07ba"));
            for (int i5 = 0; i5 < i4; i5++) {
                xmlSerializer.text(str);
            }
        }
    }

    public String a(String str) {
        return this.f41285a.getAttribute(str);
    }

    public i b(String str) {
        return c(str, null, null);
    }

    public i c(String str, String str2, String str3) {
        List<i> e4 = e(str, str2, str3);
        if (e4.size() == 0) {
            return null;
        }
        return e4.get(0);
    }

    public List<i> d(String str) {
        return e(str, null, null);
    }

    public List<i> e(String str, String str2, String str3) {
        return g(this.f41285a.getChildNodes(), str, str2, str3);
    }

    public Element h() {
        return this.f41285a;
    }

    public i k(String str) {
        NodeList elementsByTagName = this.f41285a.getElementsByTagName(str);
        if (elementsByTagName == null || elementsByTagName.getLength() <= 0) {
            return null;
        }
        return new i((Element) elementsByTagName.item(0));
    }

    public i l(String str, String str2, String str3) {
        List<i> n4 = n(str, str2, str3);
        if (n4.size() == 0) {
            return null;
        }
        return n4.get(0);
    }

    public List<i> m(String str) {
        return n(str, null, null);
    }

    public List<i> n(String str, String str2, String str3) {
        return g(this.f41285a.getElementsByTagName(str), null, str2, str3);
    }

    public String o() {
        NodeList childNodes = this.f41285a.getChildNodes();
        if (childNodes.getLength() == 1) {
            return childNodes.item(0).getNodeValue();
        }
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < childNodes.getLength(); i4++) {
            sb.append(q(childNodes.item(i4)));
        }
        return sb.toString();
    }

    public String p(String str) {
        i b5 = b(str);
        if (b5 == null) {
            return null;
        }
        return b5.o();
    }

    public String r(int i4) {
        return i(this.f41285a, i4);
    }

    public String toString() {
        return r(0);
    }

    public i(String str) throws SAXException {
        this(str.getBytes());
    }

    public i(byte[] bArr) throws SAXException {
        this(new ByteArrayInputStream(bArr));
    }

    public i(InputStream inputStream) throws SAXException {
        try {
            this.f41285a = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream).getDocumentElement();
        } catch (IOException e4) {
            throw new SAXException(e4);
        } catch (ParserConfigurationException unused) {
        }
    }
}
