package org.apache.commons.io;

import android.content.preferences.protobuf.v;
import androidx.appcompat.view.menu.s;
import com.bumptech.glide.load.resource.bitmap.p0;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Selector;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: IOUtils.java */
/* loaded from: classes5.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private static final int f32059a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static final char f32060b = '/';

    /* renamed from: c, reason: collision with root package name */
    public static final char f32061c = '\\';

    /* renamed from: g, reason: collision with root package name */
    public static final String f32065g;

    /* renamed from: h, reason: collision with root package name */
    private static final int f32066h = 4096;

    /* renamed from: i, reason: collision with root package name */
    private static final int f32067i = 2048;

    /* renamed from: j, reason: collision with root package name */
    private static char[] f32068j;

    /* renamed from: k, reason: collision with root package name */
    private static byte[] f32069k;

    /* renamed from: e, reason: collision with root package name */
    public static final String f32063e = "\n";

    /* renamed from: f, reason: collision with root package name */
    public static final String f32064f = "\r\n";

    /* renamed from: d, reason: collision with root package name */
    public static final char f32062d = File.separatorChar;

    static {
        org.apache.commons.io.output.n nVar = new org.apache.commons.io.output.n(4);
        PrintWriter printWriter = new PrintWriter(nVar);
        printWriter.println();
        f32065g = nVar.toString();
        printWriter.close();
    }

    public static long A(Reader reader, Writer writer, long j5, long j6, char[] cArr) throws IOException {
        long j7 = 0;
        if (j5 > 0) {
            U(reader, j5);
        }
        if (j6 == 0) {
            return 0L;
        }
        int length = cArr.length;
        if (j6 > 0 && j6 < cArr.length) {
            length = (int) j6;
        }
        while (length > 0) {
            int read = reader.read(cArr, 0, length);
            if (-1 == read) {
                break;
            }
            writer.write(cArr, 0, read);
            j7 += read;
            if (j6 > 0) {
                length = (int) Math.min(j6 - j7, cArr.length);
            }
        }
        return j7;
    }

    public static String A0(URL url, Charset charset) throws IOException {
        InputStream openStream = url.openStream();
        try {
            return t0(openStream, charset);
        } finally {
            openStream.close();
        }
    }

    public static long B(Reader reader, Writer writer, char[] cArr) throws IOException {
        long j5 = 0;
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                return j5;
            }
            writer.write(cArr, 0, read);
            j5 += read;
        }
    }

    @Deprecated
    public static String B0(byte[] bArr) throws IOException {
        return new String(bArr);
    }

    public static o C(InputStream inputStream, String str) throws IOException {
        return D(inputStream, b.a(str));
    }

    public static String C0(byte[] bArr, String str) throws IOException {
        return new String(bArr, b.a(str));
    }

    public static o D(InputStream inputStream, Charset charset) throws IOException {
        return new o(new InputStreamReader(inputStream, b.b(charset)));
    }

    public static void D0(CharSequence charSequence, OutputStream outputStream) throws IOException {
        F0(charSequence, outputStream, Charset.defaultCharset());
    }

    public static o E(Reader reader) {
        return new o(reader);
    }

    public static void E0(CharSequence charSequence, OutputStream outputStream, String str) throws IOException {
        F0(charSequence, outputStream, b.a(str));
    }

    public static int F(InputStream inputStream, byte[] bArr) throws IOException {
        return G(inputStream, bArr, 0, bArr.length);
    }

    public static void F0(CharSequence charSequence, OutputStream outputStream, Charset charset) throws IOException {
        if (charSequence != null) {
            J0(charSequence.toString(), outputStream, charset);
        }
    }

    public static int G(InputStream inputStream, byte[] bArr, int i5, int i6) throws IOException {
        if (i6 < 0) {
            throw new IllegalArgumentException(s.a("Length must not be negative: ", i6));
        }
        int i7 = i6;
        while (i7 > 0) {
            int read = inputStream.read(bArr, (i6 - i7) + i5, i7);
            if (-1 == read) {
                break;
            }
            i7 -= read;
        }
        return i6 - i7;
    }

    public static void G0(CharSequence charSequence, Writer writer) throws IOException {
        if (charSequence != null) {
            K0(charSequence.toString(), writer);
        }
    }

    public static int H(Reader reader, char[] cArr) throws IOException {
        return I(reader, cArr, 0, cArr.length);
    }

    public static void H0(String str, OutputStream outputStream) throws IOException {
        J0(str, outputStream, Charset.defaultCharset());
    }

    public static int I(Reader reader, char[] cArr, int i5, int i6) throws IOException {
        if (i6 < 0) {
            throw new IllegalArgumentException(s.a("Length must not be negative: ", i6));
        }
        int i7 = i6;
        while (i7 > 0) {
            int read = reader.read(cArr, (i6 - i7) + i5, i7);
            if (-1 == read) {
                break;
            }
            i7 -= read;
        }
        return i6 - i7;
    }

    public static void I0(String str, OutputStream outputStream, String str2) throws IOException {
        J0(str, outputStream, b.a(str2));
    }

    public static void J(InputStream inputStream, byte[] bArr) throws IOException {
        K(inputStream, bArr, 0, bArr.length);
    }

    public static void J0(String str, OutputStream outputStream, Charset charset) throws IOException {
        if (str != null) {
            outputStream.write(str.getBytes(b.b(charset)));
        }
    }

    public static void K(InputStream inputStream, byte[] bArr, int i5, int i6) throws IOException {
        int G = G(inputStream, bArr, i5, i6);
        if (G != i6) {
            throw new EOFException(v.a("Length to read: ", i6, " actual: ", G));
        }
    }

    public static void K0(String str, Writer writer) throws IOException {
        if (str != null) {
            writer.write(str);
        }
    }

    public static void L(Reader reader, char[] cArr) throws IOException {
        M(reader, cArr, 0, cArr.length);
    }

    @Deprecated
    public static void L0(StringBuffer stringBuffer, OutputStream outputStream) throws IOException {
        M0(stringBuffer, outputStream, null);
    }

    public static void M(Reader reader, char[] cArr, int i5, int i6) throws IOException {
        int I = I(reader, cArr, i5, i6);
        if (I != i6) {
            throw new EOFException(v.a("Length to read: ", i6, " actual: ", I));
        }
    }

    @Deprecated
    public static void M0(StringBuffer stringBuffer, OutputStream outputStream, String str) throws IOException {
        if (stringBuffer != null) {
            outputStream.write(stringBuffer.toString().getBytes(b.a(str)));
        }
    }

    public static List<String> N(InputStream inputStream) throws IOException {
        return P(inputStream, Charset.defaultCharset());
    }

    @Deprecated
    public static void N0(StringBuffer stringBuffer, Writer writer) throws IOException {
        if (stringBuffer != null) {
            writer.write(stringBuffer.toString());
        }
    }

    public static List<String> O(InputStream inputStream, String str) throws IOException {
        return P(inputStream, b.a(str));
    }

    public static void O0(byte[] bArr, OutputStream outputStream) throws IOException {
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    public static List<String> P(InputStream inputStream, Charset charset) throws IOException {
        return Q(new InputStreamReader(inputStream, b.b(charset)));
    }

    public static void P0(byte[] bArr, Writer writer) throws IOException {
        R0(bArr, writer, Charset.defaultCharset());
    }

    public static List<String> Q(Reader reader) throws IOException {
        BufferedReader W = W(reader);
        ArrayList arrayList = new ArrayList();
        for (String readLine = W.readLine(); readLine != null; readLine = W.readLine()) {
            arrayList.add(readLine);
        }
        return arrayList;
    }

    public static void Q0(byte[] bArr, Writer writer, String str) throws IOException {
        R0(bArr, writer, b.a(str));
    }

    public static long R(InputStream inputStream, long j5) throws IOException {
        if (j5 < 0) {
            throw new IllegalArgumentException(p0.a("Skip count must be non-negative, actual: ", j5));
        }
        if (f32069k == null) {
            f32069k = new byte[2048];
        }
        long j6 = j5;
        while (j6 > 0) {
            long read = inputStream.read(f32069k, 0, (int) Math.min(j6, 2048L));
            if (read < 0) {
                break;
            }
            j6 -= read;
        }
        return j5 - j6;
    }

    public static void R0(byte[] bArr, Writer writer, Charset charset) throws IOException {
        if (bArr != null) {
            writer.write(new String(bArr, b.b(charset)));
        }
    }

    public static long S(Reader reader, long j5) throws IOException {
        if (j5 < 0) {
            throw new IllegalArgumentException(p0.a("Skip count must be non-negative, actual: ", j5));
        }
        if (f32068j == null) {
            f32068j = new char[2048];
        }
        long j6 = j5;
        while (j6 > 0) {
            long read = reader.read(f32068j, 0, (int) Math.min(j6, 2048L));
            if (read < 0) {
                break;
            }
            j6 -= read;
        }
        return j5 - j6;
    }

    public static void S0(char[] cArr, OutputStream outputStream) throws IOException {
        U0(cArr, outputStream, Charset.defaultCharset());
    }

    public static void T(InputStream inputStream, long j5) throws IOException {
        if (j5 < 0) {
            throw new IllegalArgumentException(p0.a("Bytes to skip must not be negative: ", j5));
        }
        long R = R(inputStream, j5);
        if (R == j5) {
            return;
        }
        throw new EOFException("Bytes to skip: " + j5 + " actual: " + R);
    }

    public static void T0(char[] cArr, OutputStream outputStream, String str) throws IOException {
        U0(cArr, outputStream, b.a(str));
    }

    public static void U(Reader reader, long j5) throws IOException {
        long S = S(reader, j5);
        if (S == j5) {
            return;
        }
        throw new EOFException("Chars to skip: " + j5 + " actual: " + S);
    }

    public static void U0(char[] cArr, OutputStream outputStream, Charset charset) throws IOException {
        if (cArr != null) {
            outputStream.write(new String(cArr).getBytes(b.b(charset)));
        }
    }

    public static InputStream V(InputStream inputStream) throws IOException {
        return org.apache.commons.io.output.b.e(inputStream);
    }

    public static void V0(char[] cArr, Writer writer) throws IOException {
        if (cArr != null) {
            writer.write(cArr);
        }
    }

    public static BufferedReader W(Reader reader) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader);
    }

    public static void W0(Collection<?> collection, String str, OutputStream outputStream) throws IOException {
        Y0(collection, str, outputStream, Charset.defaultCharset());
    }

    public static byte[] X(InputStream inputStream) throws IOException {
        org.apache.commons.io.output.b bVar = new org.apache.commons.io.output.b();
        m(inputStream, bVar);
        return bVar.g();
    }

    public static void X0(Collection<?> collection, String str, OutputStream outputStream, String str2) throws IOException {
        Y0(collection, str, outputStream, b.a(str2));
    }

    public static byte[] Y(InputStream inputStream, int i5) throws IOException {
        if (i5 < 0) {
            throw new IllegalArgumentException(s.a("Size must be equal or greater than zero: ", i5));
        }
        int i6 = 0;
        if (i5 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i5];
        while (i6 < i5) {
            int read = inputStream.read(bArr, i6, i5 - i6);
            if (read == -1) {
                break;
            }
            i6 += read;
        }
        if (i6 == i5) {
            return bArr;
        }
        throw new IOException(v.a("Unexpected readed size. current: ", i6, ", excepted: ", i5));
    }

    public static void Y0(Collection<?> collection, String str, OutputStream outputStream, Charset charset) throws IOException {
        if (collection == null) {
            return;
        }
        if (str == null) {
            str = f32065g;
        }
        Charset b6 = b.b(charset);
        for (Object obj : collection) {
            if (obj != null) {
                outputStream.write(obj.toString().getBytes(b6));
            }
            outputStream.write(str.getBytes(b6));
        }
    }

    public static byte[] Z(InputStream inputStream, long j5) throws IOException {
        if (j5 <= 2147483647L) {
            return Y(inputStream, (int) j5);
        }
        throw new IllegalArgumentException(p0.a("Size cannot be greater than Integer max value: ", j5));
    }

    public static void Z0(Collection<?> collection, String str, Writer writer) throws IOException {
        if (collection == null) {
            return;
        }
        if (str == null) {
            str = f32065g;
        }
        for (Object obj : collection) {
            if (obj != null) {
                writer.write(obj.toString());
            }
            writer.write(str);
        }
    }

    public static void a(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static byte[] a0(Reader reader) throws IOException {
        return c0(reader, Charset.defaultCharset());
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] b0(Reader reader, String str) throws IOException {
        return c0(reader, b.a(str));
    }

    public static void c(InputStream inputStream) {
        b(inputStream);
    }

    public static byte[] c0(Reader reader, Charset charset) throws IOException {
        org.apache.commons.io.output.b bVar = new org.apache.commons.io.output.b();
        t(reader, bVar, charset);
        return bVar.g();
    }

    public static void d(OutputStream outputStream) {
        b(outputStream);
    }

    @Deprecated
    public static byte[] d0(String str) throws IOException {
        return str.getBytes();
    }

    public static void e(Reader reader) {
        b(reader);
    }

    public static byte[] e0(URI uri) throws IOException {
        return f0(uri.toURL());
    }

    public static void f(Writer writer) {
        b(writer);
    }

    public static byte[] f0(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        try {
            return g0(openConnection);
        } finally {
            a(openConnection);
        }
    }

    public static void g(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] g0(URLConnection uRLConnection) throws IOException {
        InputStream inputStream = uRLConnection.getInputStream();
        try {
            return X(inputStream);
        } finally {
            inputStream.close();
        }
    }

    public static void h(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }

    public static char[] h0(InputStream inputStream) throws IOException {
        return j0(inputStream, Charset.defaultCharset());
    }

    public static void i(Selector selector) {
        if (selector != null) {
            try {
                selector.close();
            } catch (IOException unused) {
            }
        }
    }

    public static char[] i0(InputStream inputStream, String str) throws IOException {
        return j0(inputStream, b.a(str));
    }

    public static boolean j(InputStream inputStream, InputStream inputStream2) throws IOException {
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream = new BufferedInputStream(inputStream);
        }
        if (!(inputStream2 instanceof BufferedInputStream)) {
            inputStream2 = new BufferedInputStream(inputStream2);
        }
        for (int read = inputStream.read(); -1 != read; read = inputStream.read()) {
            if (read != inputStream2.read()) {
                return false;
            }
        }
        return inputStream2.read() == -1;
    }

    public static char[] j0(InputStream inputStream, Charset charset) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        q(inputStream, charArrayWriter, charset);
        return charArrayWriter.toCharArray();
    }

    public static boolean k(Reader reader, Reader reader2) throws IOException {
        BufferedReader W = W(reader);
        BufferedReader W2 = W(reader2);
        for (int read = W.read(); -1 != read; read = W.read()) {
            if (read != W2.read()) {
                return false;
            }
        }
        return W2.read() == -1;
    }

    public static char[] k0(Reader reader) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        n(reader, charArrayWriter);
        return charArrayWriter.toCharArray();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r1 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean l(java.io.Reader r3, java.io.Reader r4) throws java.io.IOException {
        /*
            java.io.BufferedReader r3 = W(r3)
            java.io.BufferedReader r4 = W(r4)
            java.lang.String r0 = r3.readLine()
            java.lang.String r1 = r4.readLine()
        L10:
            if (r0 == 0) goto L23
            if (r1 == 0) goto L23
            boolean r2 = r0.equals(r1)
            if (r2 == 0) goto L23
            java.lang.String r0 = r3.readLine()
            java.lang.String r1 = r4.readLine()
            goto L10
        L23:
            if (r0 != 0) goto L2b
            if (r1 != 0) goto L29
            r3 = 1
            goto L2f
        L29:
            r3 = 0
            goto L2f
        L2b:
            boolean r3 = r0.equals(r1)
        L2f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.n.l(java.io.Reader, java.io.Reader):boolean");
    }

    public static InputStream l0(CharSequence charSequence) {
        return n0(charSequence, Charset.defaultCharset());
    }

    public static int m(InputStream inputStream, OutputStream outputStream) throws IOException {
        long u5 = u(inputStream, outputStream);
        if (u5 > 2147483647L) {
            return -1;
        }
        return (int) u5;
    }

    public static InputStream m0(CharSequence charSequence, String str) throws IOException {
        return n0(charSequence, b.a(str));
    }

    public static int n(Reader reader, Writer writer) throws IOException {
        long y5 = y(reader, writer);
        if (y5 > 2147483647L) {
            return -1;
        }
        return (int) y5;
    }

    public static InputStream n0(CharSequence charSequence, Charset charset) {
        return q0(charSequence.toString(), charset);
    }

    public static void o(InputStream inputStream, Writer writer) throws IOException {
        q(inputStream, writer, Charset.defaultCharset());
    }

    public static InputStream o0(String str) {
        return q0(str, Charset.defaultCharset());
    }

    public static void p(InputStream inputStream, Writer writer, String str) throws IOException {
        q(inputStream, writer, b.a(str));
    }

    public static InputStream p0(String str, String str2) throws IOException {
        return new ByteArrayInputStream(str.getBytes(b.a(str2)));
    }

    public static void q(InputStream inputStream, Writer writer, Charset charset) throws IOException {
        n(new InputStreamReader(inputStream, b.b(charset)), writer);
    }

    public static InputStream q0(String str, Charset charset) {
        return new ByteArrayInputStream(str.getBytes(b.b(charset)));
    }

    public static void r(Reader reader, OutputStream outputStream) throws IOException {
        t(reader, outputStream, Charset.defaultCharset());
    }

    public static String r0(InputStream inputStream) throws IOException {
        return t0(inputStream, Charset.defaultCharset());
    }

    public static void s(Reader reader, OutputStream outputStream, String str) throws IOException {
        t(reader, outputStream, b.a(str));
    }

    public static String s0(InputStream inputStream, String str) throws IOException {
        return t0(inputStream, b.a(str));
    }

    public static void t(Reader reader, OutputStream outputStream, Charset charset) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, b.b(charset));
        n(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static String t0(InputStream inputStream, Charset charset) throws IOException {
        org.apache.commons.io.output.n nVar = new org.apache.commons.io.output.n();
        q(inputStream, nVar, charset);
        return nVar.toString();
    }

    public static long u(InputStream inputStream, OutputStream outputStream) throws IOException {
        return x(inputStream, outputStream, new byte[4096]);
    }

    public static String u0(Reader reader) throws IOException {
        org.apache.commons.io.output.n nVar = new org.apache.commons.io.output.n();
        n(reader, nVar);
        return nVar.toString();
    }

    public static long v(InputStream inputStream, OutputStream outputStream, long j5, long j6) throws IOException {
        return w(inputStream, outputStream, j5, j6, new byte[4096]);
    }

    public static String v0(URI uri) throws IOException {
        return x0(uri, Charset.defaultCharset());
    }

    public static long w(InputStream inputStream, OutputStream outputStream, long j5, long j6, byte[] bArr) throws IOException {
        long j7 = 0;
        if (j5 > 0) {
            T(inputStream, j5);
        }
        if (j6 == 0) {
            return 0L;
        }
        int length = bArr.length;
        int i5 = (j6 <= 0 || j6 >= ((long) length)) ? length : (int) j6;
        while (i5 > 0) {
            int read = inputStream.read(bArr, 0, i5);
            if (-1 == read) {
                break;
            }
            outputStream.write(bArr, 0, read);
            j7 += read;
            if (j6 > 0) {
                i5 = (int) Math.min(j6 - j7, length);
            }
        }
        return j7;
    }

    public static String w0(URI uri, String str) throws IOException {
        return x0(uri, b.a(str));
    }

    public static long x(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        long j5 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j5;
            }
            outputStream.write(bArr, 0, read);
            j5 += read;
        }
    }

    public static String x0(URI uri, Charset charset) throws IOException {
        return A0(uri.toURL(), b.b(charset));
    }

    public static long y(Reader reader, Writer writer) throws IOException {
        return B(reader, writer, new char[4096]);
    }

    public static String y0(URL url) throws IOException {
        return A0(url, Charset.defaultCharset());
    }

    public static long z(Reader reader, Writer writer, long j5, long j6) throws IOException {
        return A(reader, writer, j5, j6, new char[4096]);
    }

    public static String z0(URL url, String str) throws IOException {
        return A0(url, b.a(str));
    }
}
