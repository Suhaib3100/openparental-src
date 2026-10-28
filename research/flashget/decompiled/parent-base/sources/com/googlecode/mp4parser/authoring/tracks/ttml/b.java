package com.googlecode.mp4parser.authoring.tracks.ttml;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: TtmlSegmenter.java */
/* loaded from: classes6.dex */
public class b {
    public static void a(Node node, String str, long j4) {
        if (node.getAttributes() == null || node.getAttributes().getNamedItem(str) == null) {
            return;
        }
        String nodeValue = node.getAttributes().getNamedItem(str).getNodeValue();
        long h4 = a.h(nodeValue) + j4;
        node.getAttributes().getNamedItem(str).setNodeValue(a.j(h4, nodeValue.contains(ProtectedSandApp.s("\u0eee\u0001")) ? -1 : ((int) (h4 - ((h4 / 1000) * 1000))) / 44));
    }

    public static Document b(Document document) throws XPathExpressionException {
        XPath newXPath = XPathFactory.newInstance().newXPath();
        newXPath.setNamespaceContext(a.f63829d);
        NodeList nodeList = (NodeList) newXPath.compile(ProtectedSandApp.s("\u0eef\u0001")).evaluate(document, XPathConstants.NODESET);
        for (int i4 = 0; i4 < nodeList.getLength(); i4++) {
            c(nodeList.item(i4));
        }
        for (int i5 = 0; i5 < nodeList.getLength(); i5++) {
            Node item = nodeList.item(i5);
            d(item, ProtectedSandApp.s("\u0ef0\u0001"));
            d(item, ProtectedSandApp.s("\u0ef1\u0001"));
        }
        return document;
    }

    private static void c(Node node) {
        String s4;
        long j4 = 0;
        Node node2 = node;
        while (true) {
            node2 = node2.getParentNode();
            s4 = ProtectedSandApp.s("\u0ef0\u0001");
            if (node2 == null) {
                break;
            } else if (node2.getAttributes() != null && node2.getAttributes().getNamedItem(s4) != null) {
                j4 += a.h(node2.getAttributes().getNamedItem(s4).getNodeValue());
            }
        }
        if (node.getAttributes() != null && node.getAttributes().getNamedItem(s4) != null) {
            node.getAttributes().getNamedItem(s4).setNodeValue(a.j(a.h(node.getAttributes().getNamedItem(s4).getNodeValue()) + j4, -1));
        }
        if (node.getAttributes() != null) {
            NamedNodeMap attributes = node.getAttributes();
            String s5 = ProtectedSandApp.s("\u0ef1\u0001");
            if (attributes.getNamedItem(s5) != null) {
                node.getAttributes().getNamedItem(s5).setNodeValue(a.j(a.h(node.getAttributes().getNamedItem(s5).getNodeValue()) + j4, -1));
            }
        }
    }

    private static void d(Node node, String str) {
        while (true) {
            node = node.getParentNode();
            if (node == null) {
                return;
            }
            if (node.getAttributes() != null && node.getAttributes().getNamedItem(str) != null) {
                node.getAttributes().removeNamedItem(str);
            }
        }
    }

    public static List<Document> e(Document document, int i4) throws XPathExpressionException {
        String s4;
        String s5;
        XPath xPath;
        XPathExpression xPathExpression;
        int i5 = i4 * 1000;
        XPath newXPath = XPathFactory.newInstance().newXPath();
        XPathExpression compile = newXPath.compile(ProtectedSandApp.s("\u0eef\u0001"));
        ArrayList arrayList = new ArrayList();
        while (true) {
            long size = arrayList.size() * i5;
            long size2 = (arrayList.size() + 1) * i5;
            Document document2 = (Document) document.cloneNode(true);
            NodeList nodeList = (NodeList) compile.evaluate(document2, XPathConstants.NODESET);
            int i6 = 0;
            boolean z4 = false;
            while (true) {
                int length = nodeList.getLength();
                s4 = ProtectedSandApp.s("\u0ef1\u0001");
                s5 = ProtectedSandApp.s("\u0ef0\u0001");
                if (i6 >= length) {
                    break;
                }
                int i7 = i5;
                Node item = nodeList.item(i6);
                long e4 = a.e(item);
                long d5 = a.d(item);
                if (e4 >= size || d5 <= size) {
                    xPath = newXPath;
                    xPathExpression = compile;
                } else {
                    xPath = newXPath;
                    xPathExpression = compile;
                    a(item, s5, size - e4);
                    e4 = size;
                }
                if (e4 >= size && e4 < size2 && d5 > size2) {
                    a(item, s4, size2 - d5);
                    e4 = size;
                    d5 = size2;
                }
                if (e4 > size2) {
                    z4 = true;
                }
                if (e4 < size || d5 > size2) {
                    item.getParentNode().removeChild(item);
                } else {
                    long j4 = -size;
                    a(item, s5, j4);
                    a(item, s4, j4);
                }
                i6++;
                newXPath = xPath;
                i5 = i7;
                compile = xPathExpression;
            }
            f(document2);
            Element element = (Element) newXPath.compile(ProtectedSandApp.s("\u0ef2\u0001")).evaluate(document2, XPathConstants.NODE);
            String attribute = element.getAttribute(s5);
            String attribute2 = element.getAttribute(s4);
            int i10 = i5;
            if (attribute == null || "".equals(attribute)) {
                element.setAttribute(s5, a.i(size));
            } else {
                a(element, s5, size);
            }
            if (attribute2 == null || "".equals(attribute2)) {
                element.setAttribute(s4, a.i(size2));
            } else {
                a(element, s4, size2);
            }
            arrayList.add(document2);
            if (!z4) {
                return arrayList;
            }
            i5 = i10;
        }
    }

    public static void f(Node node) {
        NodeList childNodes = node.getChildNodes();
        for (int i4 = 0; i4 < childNodes.getLength(); i4++) {
            Node item = childNodes.item(i4);
            if (item.getNodeType() == 3) {
                item.setTextContent(item.getTextContent().trim());
            }
            f(item);
        }
    }
}
