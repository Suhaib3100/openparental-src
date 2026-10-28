package com.googlecode.mp4parser.authoring.tracks.ttml;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.authoring.d;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.apache.commons.lang3.time.e;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* compiled from: TtmlHelpers.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f63827b = ProtectedSandApp.s("໕\u0001");

    /* renamed from: c, reason: collision with root package name */
    public static final String f63828c = ProtectedSandApp.s("໖\u0001");

    /* renamed from: a, reason: collision with root package name */
    static byte[] f63826a = ProtectedSandApp.s("໗\u0001").getBytes();

    /* renamed from: d, reason: collision with root package name */
    public static final NamespaceContext f63829d = new b();

    /* compiled from: TtmlHelpers.java */
    private static class b implements NamespaceContext {
        private b() {
        }

        @Override // javax.xml.namespace.NamespaceContext
        public String getNamespaceURI(String str) {
            if (str.equals(ProtectedSandApp.s("໑\u0001"))) {
                return ProtectedSandApp.s("໒\u0001");
            }
            if (str.equals(ProtectedSandApp.s("໓\u0001"))) {
                return ProtectedSandApp.s("໔\u0001");
            }
            return null;
        }

        @Override // javax.xml.namespace.NamespaceContext
        public String getPrefix(String str) {
            if (str.equals(ProtectedSandApp.s("໒\u0001"))) {
                return ProtectedSandApp.s("໑\u0001");
            }
            if (str.equals(ProtectedSandApp.s("໔\u0001"))) {
                return ProtectedSandApp.s("໓\u0001");
            }
            return null;
        }

        @Override // javax.xml.namespace.NamespaceContext
        public Iterator getPrefixes(String str) {
            return Arrays.asList(ProtectedSandApp.s("໑\u0001"), ProtectedSandApp.s("໓\u0001")).iterator();
        }

        b(b bVar) {
        }
    }

    private static long a(InputStream inputStream, File file) throws IOException {
        byte[] bArr = new byte[16384];
        file.getParentFile().mkdirs();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        long j4 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (-1 == read) {
                    return j4;
                }
                fileOutputStream.write(bArr, 0, read);
                j4 += read;
            } finally {
                fileOutputStream.close();
            }
        }
    }

    public static void b(Document document, File file) throws IOException {
        try {
            NodeList nodeList = (NodeList) XPathFactory.newInstance().newXPath().compile(ProtectedSandApp.s("໘\u0001")).evaluate(document, XPathConstants.NODESET);
            for (int i4 = 0; i4 < nodeList.getLength(); i4++) {
                URI create = URI.create(nodeList.item(i4).getNodeValue());
                if (!create.isAbsolute()) {
                    a(new URI(document.getDocumentURI()).resolve(create).toURL().openStream(), new File(file.toURI().resolve(create).toURL().getFile()));
                }
            }
            a(new URI(document.getDocumentURI()).toURL().openStream(), file);
        } catch (URISyntaxException e4) {
            throw new IOException(e4);
        } catch (XPathExpressionException e5) {
            throw new IOException(e5);
        }
    }

    public static String[] c(Document document) {
        try {
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer(new StreamSource(new ByteArrayInputStream(f63826a)));
            StringWriter stringWriter = new StringWriter();
            newTransformer.transform(new DOMSource(document), new StreamResult(stringWriter));
            ArrayList arrayList = new ArrayList(new LinkedHashSet(Arrays.asList(stringWriter.getBuffer().toString().split(ProtectedSandApp.s("໙\u0001")))));
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        } catch (TransformerConfigurationException e4) {
            throw new RuntimeException(e4);
        } catch (TransformerException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static long d(Node node) {
        long j4 = 0;
        Node node2 = node;
        while (true) {
            node2 = node2.getParentNode();
            if (node2 == null) {
                break;
            }
            if (node2.getAttributes() != null) {
                NamedNodeMap attributes = node2.getAttributes();
                String s4 = ProtectedSandApp.s("\u0edb\u0001");
                if (attributes.getNamedItem(s4) != null) {
                    j4 += h(node2.getAttributes().getNamedItem(s4).getNodeValue());
                }
            }
        }
        if (node.getAttributes() != null) {
            NamedNodeMap attributes2 = node.getAttributes();
            String s5 = ProtectedSandApp.s("\u0eda\u0001");
            if (attributes2.getNamedItem(s5) != null) {
                return h(node.getAttributes().getNamedItem(s5).getNodeValue()) + j4;
            }
        }
        return j4;
    }

    public static long e(Node node) {
        String s4;
        long j4 = 0;
        Node node2 = node;
        while (true) {
            node2 = node2.getParentNode();
            s4 = ProtectedSandApp.s("\u0edb\u0001");
            if (node2 == null) {
                break;
            }
            if (node2.getAttributes() != null && node2.getAttributes().getNamedItem(s4) != null) {
                j4 += h(node2.getAttributes().getNamedItem(s4).getNodeValue());
            }
        }
        return (node.getAttributes() == null || node.getAttributes().getNamedItem(s4) == null) ? j4 : h(node.getAttributes().getNamedItem(s4).getNodeValue()) + j4;
    }

    public static void f(String[] strArr) throws URISyntaxException, ParserConfigurationException, IOException, SAXException, XPathExpressionException, TransformerException {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        c cVar = new c(ProtectedSandApp.s("ໝ\u0001"), com.googlecode.mp4parser.authoring.tracks.ttml.b.e(newInstance.newDocumentBuilder().parse(ProtectedSandApp.s("ໜ\u0001")), 60));
        d dVar = new d();
        dVar.a(cVar);
        new DefaultMp4Builder().a(dVar).writeContainer(new FileOutputStream(ProtectedSandApp.s("ໞ\u0001")).getChannel());
    }

    public static void g(Document document, OutputStream outputStream, int i4) throws IOException {
        try {
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
            newTransformer.setOutputProperty(ProtectedSandApp.s("ໟ\u0001"), ProtectedSandApp.s("\u0ee0\u0001"));
            if (i4 > 0) {
                newTransformer.setOutputProperty(ProtectedSandApp.s("\u0ee1\u0001"), ProtectedSandApp.s("\u0ee2\u0001"));
                newTransformer.setOutputProperty(ProtectedSandApp.s("\u0ee3\u0001"), Integer.toString(i4));
            }
            try {
                newTransformer.transform(new DOMSource(document), new StreamResult(outputStream));
            } catch (TransformerException e4) {
                throw new IOException(e4);
            }
        } catch (TransformerConfigurationException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static long h(String str) {
        long parseDouble;
        Matcher matcher = Pattern.compile(ProtectedSandApp.s("\u0ee4\u0001")).matcher(str);
        if (!matcher.matches()) {
            throw new RuntimeException(android.support.v4.media.d.a(ProtectedSandApp.s("\u0eea\u0001"), str, ProtectedSandApp.s("\u0eeb\u0001")));
        }
        String group = matcher.group(1);
        String group2 = matcher.group(2);
        String group3 = matcher.group(3);
        String group4 = matcher.group(4);
        String group5 = matcher.group(5);
        if (group5 == null) {
            group5 = ProtectedSandApp.s("\u0ee5\u0001");
        }
        String s4 = ProtectedSandApp.s("\u0ee6\u0001");
        String s5 = ProtectedSandApp.s("\u0ee7\u0001");
        String replace = group5.replace(s4, s5);
        long parseLong = (Long.parseLong(group4) * 1000) + (Long.parseLong(group3) * 60000) + (Long.parseLong(group2) * e.f86241c);
        boolean contains = replace.contains(s4);
        String s6 = ProtectedSandApp.s("\u0ee8\u0001");
        if (contains) {
            parseDouble = (long) ((Double.parseDouble(s6 + replace.replace(s4, s5)) * 40.0d * 1000.0d) + parseLong);
        } else {
            parseDouble = (long) ((Double.parseDouble(s6.concat(replace)) * 1000.0d) + parseLong);
        }
        return parseDouble * (ProtectedSandApp.s("\u0ee9\u0001").equals(group) ? -1 : 1);
    }

    public static String i(long j4) {
        return j(j4, -1);
    }

    public static String j(long j4, int i4) {
        String s4 = j4 >= 0 ? "" : ProtectedSandApp.s("\u0ee9\u0001");
        long abs = Math.abs(j4);
        long j5 = ((abs / 1000) / 60) / 60;
        long j6 = abs - (e.f86241c * j5);
        long j7 = (j6 / 1000) / 60;
        long j10 = j6 - (60000 * j7);
        long j11 = j10 / 1000;
        long j12 = j10 - (1000 * j11);
        if (i4 >= 0) {
            return String.format(ProtectedSandApp.s("\u0eec\u0001"), s4, Long.valueOf(j5), Long.valueOf(j7), Long.valueOf(j11), Integer.valueOf(i4));
        }
        return String.format(ProtectedSandApp.s("\u0eed\u0001"), s4, Long.valueOf(j5), Long.valueOf(j7), Long.valueOf(j11), Long.valueOf(j12));
    }
}
