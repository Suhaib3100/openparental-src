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
/* loaded from: classes5.dex */
public class x extends Reader {

    /* renamed from: r, reason: collision with root package name */
    private static final int f31997r = 4096;

    /* renamed from: o, reason: collision with root package name */
    private final Reader f32006o;

    /* renamed from: p, reason: collision with root package name */
    private final String f32007p;

    /* renamed from: q, reason: collision with root package name */
    private final String f32008q;
    private static final String A = "CP1047";
    private static final String F = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch";
    private static final String G = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM";
    private static final String H = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL";
    private static final String I = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch";
    private static final String J = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Invalid MIME";

    /* renamed from: s, reason: collision with root package name */
    private static final String f31998s = "UTF-8";

    /* renamed from: t, reason: collision with root package name */
    private static final String f31999t = "US-ASCII";

    /* renamed from: u, reason: collision with root package name */
    private static final String f32000u = "UTF-16BE";

    /* renamed from: v, reason: collision with root package name */
    private static final String f32001v = "UTF-16LE";

    /* renamed from: w, reason: collision with root package name */
    private static final String f32002w = "UTF-32BE";

    /* renamed from: x, reason: collision with root package name */
    private static final String f32003x = "UTF-32LE";

    /* renamed from: y, reason: collision with root package name */
    private static final String f32004y = "UTF-16";

    /* renamed from: z, reason: collision with root package name */
    private static final String f32005z = "UTF-32";
    private static final org.apache.commons.io.a[] B = {org.apache.commons.io.a.f31807r, org.apache.commons.io.a.f31808s, org.apache.commons.io.a.f31809t, org.apache.commons.io.a.f31810u, org.apache.commons.io.a.f31811v};
    private static final org.apache.commons.io.a[] C = {new org.apache.commons.io.a("UTF-8", 60, 63, 120, 109), new org.apache.commons.io.a("UTF-16BE", 0, 60, 0, 63), new org.apache.commons.io.a("UTF-16LE", 60, 0, 63, 0), new org.apache.commons.io.a("UTF-32BE", 0, 0, 0, 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109), new org.apache.commons.io.a("UTF-32LE", 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109, 0, 0, 0), new org.apache.commons.io.a("CP1047", 76, 111, 167, 148)};
    private static final Pattern D = Pattern.compile("charset=[\"']?([.[^; \"']]*)[\"']?");
    public static final Pattern E = Pattern.compile("<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))", 8);

    public x(File file) throws IOException {
        this(new FileInputStream(file));
    }

    private String c(b bVar, b bVar2, String str, boolean z5) throws IOException {
        String g5 = bVar.g();
        String g6 = bVar2.g();
        try {
            return a(str, g5, g6, m(bVar2, g6), z5);
        } catch (XmlStreamReaderException e6) {
            if (z5) {
                return d(str, e6);
            }
            throw e6;
        }
    }

    private String d(String str, XmlStreamReaderException xmlStreamReaderException) throws IOException {
        if (str != null && str.startsWith("text/html")) {
            try {
                return a(androidx.constraintlayout.motion.widget.g.a("text/xml", str.substring(9)), xmlStreamReaderException.a(), xmlStreamReaderException.e(), xmlStreamReaderException.d(), true);
            } catch (XmlStreamReaderException e6) {
                xmlStreamReaderException = e6;
            }
        }
        String d6 = xmlStreamReaderException.d();
        if (d6 == null) {
            d6 = xmlStreamReaderException.b();
        }
        if (d6 != null) {
            return d6;
        }
        String str2 = this.f32008q;
        return str2 == null ? "UTF-8" : str2;
    }

    private String e(b bVar, b bVar2, boolean z5) throws IOException {
        String g5 = bVar.g();
        String g6 = bVar2.g();
        try {
            return b(g5, g6, m(bVar2, g6));
        } catch (XmlStreamReaderException e6) {
            if (z5) {
                return d(null, e6);
            }
            throw e6;
        }
    }

    static String g(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(";")) <= -1) {
            return null;
        }
        Matcher matcher = D.matcher(str.substring(indexOf + 1));
        String group = matcher.find() ? matcher.group(1) : null;
        if (group != null) {
            return group.toUpperCase(Locale.US);
        }
        return null;
    }

    static String j(String str) {
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
    
        throw new java.io.IOException(androidx.constraintlayout.solver.f.a("XML prolog or ROOT element not found on first ", r7, " bytes"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m(java.io.InputStream r10, java.lang.String r11) throws java.io.IOException {
        /*
            r0 = 0
            if (r11 == 0) goto L8b
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
            java.lang.String r11 = androidx.constraintlayout.solver.f.a(r11, r7, r0)
            r10.<init>(r11)
            throw r10
        L46:
            if (r7 <= 0) goto L8b
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
            java.util.regex.Pattern r10 = org.apache.commons.io.input.x.E
            java.util.regex.Matcher r10 = r10.matcher(r11)
            boolean r11 = r10.find()
            if (r11 == 0) goto L8b
            java.lang.String r10 = r10.group(r1)
            java.lang.String r10 = r10.toUpperCase()
            int r11 = r10.length()
            int r11 = r11 - r1
            java.lang.String r0 = r10.substring(r1, r11)
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.x.m(java.io.InputStream, java.lang.String):java.lang.String");
    }

    static boolean n(String str) {
        return str != null && (str.equals("application/xml") || str.equals("application/xml-dtd") || str.equals("application/xml-external-parsed-entity") || (str.startsWith("application/") && str.endsWith("+xml")));
    }

    static boolean o(String str) {
        return str != null && (str.equals("text/xml") || str.equals("text/xml-external-parsed-entity") || (str.startsWith("text/") && str.endsWith("+xml")));
    }

    String a(String str, String str2, String str3, String str4, boolean z5) throws IOException {
        if (z5 && str4 != null) {
            return str4;
        }
        String j5 = j(str);
        String g5 = g(str);
        boolean n5 = n(j5);
        boolean o5 = o(j5);
        if (!n5 && !o5) {
            throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Invalid MIME", j5, g5, str2, str3, str4), j5, g5, str2, str3, str4);
        }
        if (g5 == null) {
            if (n5) {
                return b(str2, str3, str4);
            }
            String str5 = this.f32008q;
            return str5 == null ? "US-ASCII" : str5;
        }
        if (g5.equals("UTF-16BE") || g5.equals("UTF-16LE")) {
            if (str2 == null) {
                return g5;
            }
            throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL", j5, g5, str2, str3, str4), j5, g5, str2, str3, str4);
        }
        if (g5.equals("UTF-16")) {
            if (str2 == null || !str2.startsWith("UTF-16")) {
                throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch", j5, g5, str2, str3, str4), j5, g5, str2, str3, str4);
            }
            return str2;
        }
        if (g5.equals("UTF-32BE") || g5.equals("UTF-32LE")) {
            if (str2 == null) {
                return g5;
            }
            throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL", j5, g5, str2, str3, str4), j5, g5, str2, str3, str4);
        }
        if (!g5.equals("UTF-32")) {
            return g5;
        }
        if (str2 == null || !str2.startsWith("UTF-32")) {
            throw new XmlStreamReaderException(MessageFormat.format("Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch", j5, g5, str2, str3, str4), j5, g5, str2, str3, str4);
        }
        return str2;
    }

    String b(String str, String str2, String str3) throws IOException {
        if (str == null) {
            if (str2 != null && str3 != null) {
                return (str3.equals("UTF-16") && (str2.equals("UTF-16BE") || str2.equals("UTF-16LE"))) ? str2 : str3;
            }
            String str4 = this.f32008q;
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
        this.f32006o.close();
    }

    public String k() {
        return this.f32008q;
    }

    public String l() {
        return this.f32007p;
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i5, int i6) throws IOException {
        return this.f32006o.read(cArr, i5, i6);
    }

    public x(InputStream inputStream) throws IOException {
        this(inputStream, true, (String) null);
    }

    public x(InputStream inputStream, boolean z5) throws IOException {
        this(inputStream, z5, (String) null);
    }

    public x(InputStream inputStream, boolean z5, String str) throws IOException {
        this.f32008q = str;
        b bVar = new b(new BufferedInputStream(inputStream, 4096), false, B);
        b bVar2 = new b(bVar, true, C);
        String e6 = e(bVar, bVar2, z5);
        this.f32007p = e6;
        this.f32006o = new InputStreamReader(bVar2, e6);
    }

    public x(URL url) throws IOException {
        this(url.openConnection(), (String) null);
    }

    public x(URLConnection uRLConnection, String str) throws IOException {
        this.f32008q = str;
        String contentType = uRLConnection.getContentType();
        b bVar = new b(new BufferedInputStream(uRLConnection.getInputStream(), 4096), false, B);
        b bVar2 = new b(bVar, true, C);
        if (!(uRLConnection instanceof HttpURLConnection) && contentType == null) {
            this.f32007p = e(bVar, bVar2, true);
        } else {
            this.f32007p = c(bVar, bVar2, contentType, true);
        }
        this.f32006o = new InputStreamReader(bVar2, this.f32007p);
    }

    public x(InputStream inputStream, String str, boolean z5, String str2) throws IOException {
        this.f32008q = str2;
        b bVar = new b(new BufferedInputStream(inputStream, 4096), false, B);
        b bVar2 = new b(bVar, true, C);
        String c6 = c(bVar, bVar2, str, z5);
        this.f32007p = c6;
        this.f32006o = new InputStreamReader(bVar2, c6);
    }

    public x(InputStream inputStream, String str) throws IOException {
        this(inputStream, str, true, null);
    }

    public x(InputStream inputStream, String str, boolean z5) throws IOException {
        this(inputStream, str, z5, null);
    }
}
