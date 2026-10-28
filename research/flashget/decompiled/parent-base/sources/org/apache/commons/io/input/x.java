package org.apache.commons.io.input;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: XmlStreamReader.java */
/* loaded from: classes4.dex */
public class x extends Reader {

    /* renamed from: e, reason: collision with root package name */
    private static final int f85514e = 4096;

    /* renamed from: b, reason: collision with root package name */
    private final Reader f85533b;

    /* renamed from: c, reason: collision with root package name */
    private final String f85534c;

    /* renamed from: d, reason: collision with root package name */
    private final String f85535d;

    /* renamed from: f, reason: collision with root package name */
    private static final String f85515f = "UTF-8";

    /* renamed from: g, reason: collision with root package name */
    private static final String f85516g = "US-ASCII";

    /* renamed from: h, reason: collision with root package name */
    private static final String f85517h = "UTF-16BE";

    /* renamed from: i, reason: collision with root package name */
    private static final String f85518i = "UTF-16LE";

    /* renamed from: j, reason: collision with root package name */
    private static final String f85519j = "UTF-32BE";

    /* renamed from: k, reason: collision with root package name */
    private static final String f85520k = "UTF-32LE";

    /* renamed from: l, reason: collision with root package name */
    private static final String f85521l = "UTF-16";

    /* renamed from: m, reason: collision with root package name */
    private static final String f85522m = "UTF-32";

    /* renamed from: n, reason: collision with root package name */
    private static final String f85523n = "CP1047";

    /* renamed from: s, reason: collision with root package name */
    private static final String f85528s = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch";

    /* renamed from: t, reason: collision with root package name */
    private static final String f85529t = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM";

    /* renamed from: u, reason: collision with root package name */
    private static final String f85530u = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL";

    /* renamed from: v, reason: collision with root package name */
    private static final String f85531v = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch";

    /* renamed from: w, reason: collision with root package name */
    private static final String f85532w = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Invalid MIME";

    /* renamed from: o, reason: collision with root package name */
    private static final org.apache.commons.io.a[] f85524o = {org.apache.commons.io.a.f85307e, org.apache.commons.io.a.f85308f, org.apache.commons.io.a.f85309g, org.apache.commons.io.a.f85310h, org.apache.commons.io.a.f85311i};

    /* renamed from: p, reason: collision with root package name */
    private static final org.apache.commons.io.a[] f85525p = {new org.apache.commons.io.a("UTF-8", 60, 63, 120, 109), new org.apache.commons.io.a("UTF-16BE", 0, 60, 0, 63), new org.apache.commons.io.a("UTF-16LE", 60, 0, 63, 0), new org.apache.commons.io.a("UTF-32BE", 0, 0, 0, 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109), new org.apache.commons.io.a("UTF-32LE", 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109, 0, 0, 0), new org.apache.commons.io.a("CP1047", 76, 111, 167, 148)};

    /* renamed from: q, reason: collision with root package name */
    private static final Pattern f85526q = Pattern.compile("charset=[\"']?([.[^; \"']]*)[\"']?");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f85527r = Pattern.compile("<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))", 8);

    public x(File file) throws IOException {
        this(new FileInputStream(file));
    }

    private String c(b bVar, b bVar2, String str, boolean z4) throws IOException {
        String f4 = bVar.f();
        String f5 = bVar2.f();
        try {
            return a(str, f4, f5, k(bVar2, f5), z4);
        } catch (XmlStreamReaderException e4) {
            if (z4) {
                return d(str, e4);
            }
            throw e4;
        }
    }

    private String d(String str, XmlStreamReaderException xmlStreamReaderException) throws IOException {
        if (str != null && str.startsWith("text/html")) {
            try {
                return a(androidx.constraintlayout.core.motion.key.c.a("text/xml", str.substring(9)), xmlStreamReaderException.a(), xmlStreamReaderException.e(), xmlStreamReaderException.d(), true);
            } catch (XmlStreamReaderException e4) {
                xmlStreamReaderException = e4;
            }
        }
        String d5 = xmlStreamReaderException.d();
        if (d5 == null) {
            d5 = xmlStreamReaderException.b();
        }
        if (d5 != null) {
            return d5;
        }
        String str2 = this.f85535d;
        return str2 == null ? "UTF-8" : str2;
    }

    private String e(b bVar, b bVar2, boolean z4) throws IOException {
        String f4 = bVar.f();
        String f5 = bVar2.f();
        try {
            return b(f4, f5, k(bVar2, f5));
        } catch (XmlStreamReaderException e4) {
            if (z4) {
                return d(null, e4);
            }
            throw e4;
        }
    }

    static String f(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(";")) <= -1) {
            return null;
        }
        Matcher matcher = f85526q.matcher(str.substring(indexOf + 1));
        String group = matcher.find() ? matcher.group(1) : null;
        if (group != null) {
            return group.toUpperCase(Locale.US);
        }
        return null;
    }

    static String g(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(";");
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        return str.trim();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r4 != (-1)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        throw new java.io.IOException("Unexpected end of XML stream");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        throw new java.io.IOException(androidx.collection.r2.a("XML prolog or ROOT element not found on first ", r7, " bytes"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String k(java.io.InputStream r10, java.lang.String r11) throws java.io.IOException {
        /*
            r0 = 0
            if (r11 == 0) goto L86
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r1]
            r10.mark(r1)
            r3 = 0
            int r4 = r10.read(r2, r3, r1)
            r5 = -1
            r8 = r0
            r9 = r1
            r7 = r3
            r6 = r5
        L14:
            if (r4 == r5) goto L2c
            if (r6 != r5) goto L2c
            if (r7 >= r1) goto L2c
            int r7 = r7 + r4
            int r9 = r9 - r4
            int r4 = r10.read(r2, r7, r9)
            java.lang.String r8 = new java.lang.String
            r8.<init>(r2, r3, r7, r11)
            r6 = 62
            int r6 = r8.indexOf(r6)
            goto L14
        L2c:
            if (r6 != r5) goto L46
            if (r4 != r5) goto L38
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Unexpected end of XML stream"
            r10.<init>(r11)
            throw r10
        L38:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "XML prolog or ROOT element not found on first "
            java.lang.String r0 = " bytes"
            java.lang.String r11 = androidx.collection.r2.a(r11, r7, r0)
            r10.<init>(r11)
            throw r10
        L46:
            if (r7 <= 0) goto L86
            r10.reset()
            java.io.BufferedReader r10 = new java.io.BufferedReader
            java.io.StringReader r11 = new java.io.StringReader
            r1 = 1
            int r6 = r6 + r1
            java.lang.String r2 = r8.substring(r3, r6)
            r11.<init>(r2)
            r10.<init>(r11)
            java.lang.StringBuffer r11 = new java.lang.StringBuffer
            r11.<init>()
            java.lang.String r2 = r10.readLine()
        L64:
            if (r2 == 0) goto L6e
            r11.append(r2)
            java.lang.String r2 = r10.readLine()
            goto L64
        L6e:
            java.util.regex.Pattern r10 = org.apache.commons.io.input.x.f85527r
            java.util.regex.Matcher r10 = r10.matcher(r11)
            boolean r11 = r10.find()
            if (r11 == 0) goto L86
            java.lang.String r10 = r10.group(r1)
            java.lang.String r10 = r10.toUpperCase()
            java.lang.String r0 = androidx.core.content.f.a(r10, r1, r1)
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.x.k(java.io.InputStream, java.lang.String):java.lang.String");
    }

    static boolean l(String str) {
        return str != null && (str.equals("application/xml") || str.equals("application/xml-dtd") || str.equals("application/xml-external-parsed-entity") || (str.startsWith("application/") && str.endsWith("+xml")));
    }

    static boolean m(String str) {
        return str != null && (str.equals("text/xml") || str.equals("text/xml-external-parsed-entity") || (str.startsWith("text/") && str.endsWith("+xml")));
    }

    String a(String str, String str2, String str3, String str4, boolean z4) throws IOException {
        if (z4 && str4 != null) {
            return str4;
        }
        String g4 = g(str);
        String f4 = f(str);
        boolean l4 = l(g4);
        boolean m4 = m(g4);
        if (!l4 && !m4) {
            throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Invalid MIME", g4, f4, str2, str3, str4), g4, f4, str2, str3, str4);
        }
        if (f4 == null) {
            if (l4) {
                return b(str2, str3, str4);
            }
            String str5 = this.f85535d;
            return str5 == null ? "US-ASCII" : str5;
        }
        if (f4.equals("UTF-16BE") || f4.equals("UTF-16LE")) {
            if (str2 == null) {
                return f4;
            }
            throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL", g4, f4, str2, str3, str4), g4, f4, str2, str3, str4);
        }
        if (f4.equals("UTF-16")) {
            if (str2 == null || !str2.startsWith("UTF-16")) {
                throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch", g4, f4, str2, str3, str4), g4, f4, str2, str3, str4);
            }
            return str2;
        }
        if (f4.equals("UTF-32BE") || f4.equals("UTF-32LE")) {
            if (str2 == null) {
                return f4;
            }
            throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL", g4, f4, str2, str3, str4), g4, f4, str2, str3, str4);
        }
        if (!f4.equals("UTF-32")) {
            return f4;
        }
        if (str2 == null || !str2.startsWith("UTF-32")) {
            throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch", g4, f4, str2, str3, str4), g4, f4, str2, str3, str4);
        }
        return str2;
    }

    String b(String str, String str2, String str3) throws IOException {
        if (str == null) {
            if (str2 != null && str3 != null) {
                return (str3.equals("UTF-16") && (str2.equals("UTF-16BE") || str2.equals("UTF-16LE"))) ? str2 : str3;
            }
            String str4 = this.f85535d;
            return str4 == null ? "UTF-8" : str4;
        }
        if (str.equals("UTF-8")) {
            if (str2 != null && !str2.equals("UTF-8")) {
                throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", str, str2, str3), str, str2, str3);
            }
            if (str3 == null || str3.equals("UTF-8")) {
                return str;
            }
            throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", str, str2, str3), str, str2, str3);
        }
        if (str.equals("UTF-16BE") || str.equals("UTF-16LE")) {
            if (str2 != null && !str2.equals(str)) {
                throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", str, str2, str3), str, str2, str3);
            }
            if (str3 == null || str3.equals("UTF-16") || str3.equals(str)) {
                return str;
            }
            throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", str, str2, str3), str, str2, str3);
        }
        if (!str.equals("UTF-32BE") && !str.equals("UTF-32LE")) {
            throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM", str, str2, str3), str, str2, str3);
        }
        if (str2 != null && !str2.equals(str)) {
            throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", str, str2, str3), str, str2, str3);
        }
        if (str3 == null || str3.equals("UTF-32") || str3.equals(str)) {
            return str;
        }
        throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch", str, str2, str3), str, str2, str3);
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f85533b.close();
    }

    public String h() {
        return this.f85535d;
    }

    public String i() {
        return this.f85534c;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i4, int i5) throws IOException {
        return this.f85533b.read(cArr, i4, i5);
    }

    public x(InputStream inputStream) throws IOException {
        this(inputStream, true, (String) null);
    }

    public x(InputStream inputStream, boolean z4) throws IOException {
        this(inputStream, z4, (String) null);
    }

    public x(InputStream inputStream, boolean z4, String str) throws IOException {
        this.f85535d = str;
        b bVar = new b(new BufferedInputStream(inputStream, 4096), false, f85524o);
        b bVar2 = new b(bVar, true, f85525p);
        String e4 = e(bVar, bVar2, z4);
        this.f85534c = e4;
        this.f85533b = new InputStreamReader(bVar2, e4);
    }

    public x(URL url) throws IOException {
        this(url.openConnection(), (String) null);
    }

    public x(URLConnection uRLConnection, String str) throws IOException {
        this.f85535d = str;
        String contentType = uRLConnection.getContentType();
        b bVar = new b(new BufferedInputStream(uRLConnection.getInputStream(), 4096), false, f85524o);
        b bVar2 = new b(bVar, true, f85525p);
        if (!(uRLConnection instanceof HttpURLConnection) && contentType == null) {
            this.f85534c = e(bVar, bVar2, true);
        } else {
            this.f85534c = c(bVar, bVar2, contentType, true);
        }
        this.f85533b = new InputStreamReader(bVar2, this.f85534c);
    }

    public x(InputStream inputStream, String str, boolean z4, String str2) throws IOException {
        this.f85535d = str2;
        b bVar = new b(new BufferedInputStream(inputStream, 4096), false, f85524o);
        b bVar2 = new b(bVar, true, f85525p);
        String c5 = c(bVar, bVar2, str, z4);
        this.f85534c = c5;
        this.f85533b = new InputStreamReader(bVar2, c5);
    }

    public x(InputStream inputStream, String str) throws IOException {
        this(inputStream, str, true, null);
    }

    public x(InputStream inputStream, String str, boolean z4) throws IOException {
        this(inputStream, str, z4, null);
    }
}
