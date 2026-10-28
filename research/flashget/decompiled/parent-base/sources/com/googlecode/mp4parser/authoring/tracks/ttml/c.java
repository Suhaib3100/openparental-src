package com.googlecode.mp4parser.authoring.tracks.ttml;

import androidx.work.i0;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.authoring.f;
import com.googlecode.mp4parser.authoring.i;
import com.mp4parser.iso14496.part30.XMLSubtitleSampleEntry;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* compiled from: TtmlTrackImpl.java */
/* loaded from: classes6.dex */
public class c extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: e, reason: collision with root package name */
    i f63830e;

    /* renamed from: f, reason: collision with root package name */
    SampleDescriptionBox f63831f;

    /* renamed from: g, reason: collision with root package name */
    XMLSubtitleSampleEntry f63832g;

    /* renamed from: h, reason: collision with root package name */
    List<f> f63833h;

    /* renamed from: i, reason: collision with root package name */
    SubSampleInformationBox f63834i;

    /* renamed from: j, reason: collision with root package name */
    private long[] f63835j;

    /* compiled from: TtmlTrackImpl.java */
    class a implements f {

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ byte[] f63837b;

        a(byte[] bArr) {
            this.f63837b = bArr;
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public ByteBuffer a() {
            return ByteBuffer.wrap(this.f63837b);
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public void b(WritableByteChannel writableByteChannel) throws IOException {
            writableByteChannel.write(ByteBuffer.wrap(this.f63837b));
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public long getSize() {
            return this.f63837b.length;
        }
    }

    public c(String str, List<Document> list) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException, URISyntaxException {
        super(str);
        this.f63830e = new i();
        this.f63831f = new SampleDescriptionBox();
        this.f63832g = new XMLSubtitleSampleEntry();
        this.f63833h = new ArrayList();
        this.f63834i = new SubSampleInformationBox();
        c(list);
        HashSet hashSet = new HashSet();
        this.f63835j = new long[list.size()];
        XPathFactory.newInstance().newXPath().setNamespaceContext(com.googlecode.mp4parser.authoring.tracks.ttml.a.f63829d);
        for (int i4 = 0; i4 < list.size(); i4++) {
            Document document = list.get(i4);
            SubSampleInformationBox.a aVar = new SubSampleInformationBox.a();
            this.f63834i.getEntries().add(aVar);
            aVar.d(1L);
            this.f63835j[i4] = a(document);
            List<byte[]> b5 = b(document);
            hashSet.addAll(d(document));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            com.googlecode.mp4parser.authoring.tracks.ttml.a.g(document, byteArrayOutputStream, 4);
            SubSampleInformationBox.a.C0769a c0769a = new SubSampleInformationBox.a.C0769a();
            c0769a.h(byteArrayOutputStream.size());
            aVar.c().add(c0769a);
            Iterator<byte[]> it = b5.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(it.next());
                SubSampleInformationBox.a.C0769a c0769a2 = new SubSampleInformationBox.a.C0769a();
                c0769a2.h(r4.length);
                aVar.c().add(c0769a2);
            }
            this.f63833h.add(new a(byteArrayOutputStream.toByteArray()));
        }
        XMLSubtitleSampleEntry xMLSubtitleSampleEntry = this.f63832g;
        String[] c5 = com.googlecode.mp4parser.authoring.tracks.ttml.a.c(list.get(0));
        String s4 = ProtectedSandApp.s("\u0ef3\u0001");
        xMLSubtitleSampleEntry.setNamespace(g(s4, c5));
        this.f63832g.setSchemaLocation("");
        this.f63832g.setAuxiliaryMimeTypes(g(s4, (String[]) new ArrayList(hashSet).toArray(new String[hashSet.size()])));
        this.f63831f.addBox(this.f63832g);
        this.f63830e.v(i0.f35989d);
        this.f63830e.s(65535);
    }

    protected static List<byte[]> b(Document document) throws XPathExpressionException, URISyntaxException, IOException {
        NodeList nodeList = (NodeList) XPathFactory.newInstance().newXPath().compile(ProtectedSandApp.s("\u0ef4\u0001")).evaluate(document, XPathConstants.NODESET);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i4 = 1;
        for (int i5 = 0; i5 < nodeList.getLength(); i5++) {
            Node item = nodeList.item(i5);
            String nodeValue = item.getNodeValue();
            String substring = nodeValue.substring(nodeValue.lastIndexOf(ProtectedSandApp.s("\u0ef5\u0001")));
            String str = (String) linkedHashMap.get(nodeValue);
            if (str == null) {
                str = ProtectedSandApp.s("\u0ef6\u0001") + i4 + substring;
                linkedHashMap.put(str, nodeValue);
                i4++;
            }
            item.setNodeValue(str);
        }
        ArrayList arrayList = new ArrayList();
        if (!linkedHashMap.isEmpty()) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(k(new URI(document.getDocumentURI()).resolve((String) ((Map.Entry) it.next()).getValue()).toURL().openStream()));
            }
        }
        return arrayList;
    }

    public static String f(Document document) {
        return document.getDocumentElement().getAttribute(ProtectedSandApp.s("\u0ef7\u0001"));
    }

    private static String g(String str, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            sb.append(str2);
            sb.append(str);
        }
        sb.setLength(sb.length() > 0 ? sb.length() - 1 : 0);
        return sb.toString();
    }

    private static long i(Document document) {
        XPath newXPath = XPathFactory.newInstance().newXPath();
        newXPath.setNamespaceContext(com.googlecode.mp4parser.authoring.tracks.ttml.a.f63829d);
        try {
            NodeList nodeList = (NodeList) newXPath.compile(ProtectedSandApp.s("\u0ef8\u0001")).evaluate(document, XPathConstants.NODESET);
            long j4 = 0;
            for (int i4 = 0; i4 < nodeList.getLength(); i4++) {
                j4 = Math.max(com.googlecode.mp4parser.authoring.tracks.ttml.a.d(nodeList.item(i4)), j4);
            }
            return j4;
        } catch (XPathExpressionException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static byte[] k(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[8096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<f> A() {
        return this.f63833h;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public SubSampleInformationBox E0() {
        return this.f63834i;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] S2() {
        int length = this.f63835j.length;
        long[] jArr = new long[length];
        for (int i4 = 0; i4 < length; i4++) {
            jArr[i4] = (this.f63830e.k() * this.f63835j[i4]) / 1000;
        }
        return jArr;
    }

    long a(Document document) {
        return h(document) - e(document);
    }

    protected void c(List<Document> list) {
        Iterator<Document> it = list.iterator();
        String str = null;
        while (it.hasNext()) {
            String f4 = f(it.next());
            if (str == null) {
                this.f63830e.r(Locale.forLanguageTag(f4).getISO3Language());
                str = f4;
            } else if (!str.equals(f4)) {
                throw new RuntimeException(ProtectedSandApp.s("\u0ef9\u0001"));
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    protected List<String> d(Document document) throws XPathExpressionException {
        NodeList nodeList = (NodeList) XPathFactory.newInstance().newXPath().compile(ProtectedSandApp.s("\u0efa\u0001")).evaluate(document, XPathConstants.NODESET);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i4 = 0; i4 < nodeList.getLength(); i4++) {
            String nodeValue = nodeList.item(i4).getNodeValue();
            String substring = nodeValue.substring(nodeValue.lastIndexOf(ProtectedSandApp.s("\u0ef5\u0001")));
            if (substring.contains(ProtectedSandApp.s("\u0efb\u0001")) || substring.contains(ProtectedSandApp.s("\u0efc\u0001"))) {
                linkedHashSet.add(ProtectedSandApp.s("\u0eff\u0001"));
            } else if (substring.contains(ProtectedSandApp.s("\u0efd\u0001"))) {
                linkedHashSet.add(ProtectedSandApp.s("\u0efe\u0001"));
            }
        }
        return new ArrayList(linkedHashSet);
    }

    protected long e(Document document) {
        XPath newXPath = XPathFactory.newInstance().newXPath();
        newXPath.setNamespaceContext(com.googlecode.mp4parser.authoring.tracks.ttml.a.f63829d);
        try {
            NodeList nodeList = (NodeList) newXPath.compile(ProtectedSandApp.s("ༀ\u0001")).evaluate(document, XPathConstants.NODESET);
            long j4 = Long.MAX_VALUE;
            for (int i4 = 0; i4 < nodeList.getLength(); i4++) {
                j4 = Math.min(com.googlecode.mp4parser.authoring.tracks.ttml.a.e(nodeList.item(i4)), j4);
            }
            return j4;
        } catch (XPathExpressionException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return ProtectedSandApp.s("༁\u0001");
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.f63831f;
    }

    protected long h(Document document) {
        XPath newXPath = XPathFactory.newInstance().newXPath();
        newXPath.setNamespaceContext(com.googlecode.mp4parser.authoring.tracks.ttml.a.f63829d);
        try {
            NodeList nodeList = (NodeList) newXPath.compile(ProtectedSandApp.s("༂\u0001")).evaluate(document, XPathConstants.NODESET);
            long j4 = 0;
            for (int i4 = 0; i4 < nodeList.getLength(); i4++) {
                j4 = Math.max(com.googlecode.mp4parser.authoring.tracks.ttml.a.d(nodeList.item(i4)), j4);
            }
            return j4;
        } catch (XPathExpressionException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public i u2() {
        return this.f63830e;
    }
}
