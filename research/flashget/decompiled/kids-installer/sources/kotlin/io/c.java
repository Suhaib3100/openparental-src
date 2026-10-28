package kotlin.io;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.l0;

/* compiled from: Console.kt */
@p3.i(name = "ConsoleKt")
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0005\n\u0002\u0010\f\n\u0002\u0010\u0019\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0005H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007H\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\bH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\nH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\fH\u0087\b\u001a\t\u0010\r\u001a\u00020\u0001H\u0087\b\u001a\u0013\u0010\r\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0005H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007H\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\bH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\nH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\fH\u0087\b\u001a\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a\b\u0010\u0010\u001a\u00020\u000fH\u0007\u001a\n\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0007¨\u0006\u0012"}, d2 = {"print", "", "message", "", "", "", "", "", "", "", "", "", "", "println", "readLine", "", "readln", "readlnOrNull", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {
    @InlineOnly
    private static final void a(byte b6) {
        System.out.print(Byte.valueOf(b6));
    }

    @InlineOnly
    private static final void b(char c6) {
        System.out.print(c6);
    }

    @InlineOnly
    private static final void c(double d6) {
        System.out.print(d6);
    }

    @InlineOnly
    private static final void d(float f6) {
        System.out.print(f6);
    }

    @InlineOnly
    private static final void e(int i5) {
        System.out.print(i5);
    }

    @InlineOnly
    private static final void f(long j5) {
        System.out.print(j5);
    }

    @InlineOnly
    private static final void g(Object obj) {
        System.out.print(obj);
    }

    @InlineOnly
    private static final void h(short s5) {
        System.out.print(Short.valueOf(s5));
    }

    @InlineOnly
    private static final void i(boolean z5) {
        System.out.print(z5);
    }

    @InlineOnly
    private static final void j(char[] cArr) {
        l0.p(cArr, ProtectedSandApp.s("㾈"));
        System.out.print(cArr);
    }

    @InlineOnly
    private static final void k() {
        System.out.println();
    }

    @InlineOnly
    private static final void l(byte b6) {
        System.out.println(Byte.valueOf(b6));
    }

    @InlineOnly
    private static final void m(char c6) {
        System.out.println(c6);
    }

    @InlineOnly
    private static final void n(double d6) {
        System.out.println(d6);
    }

    @InlineOnly
    private static final void o(float f6) {
        System.out.println(f6);
    }

    @InlineOnly
    private static final void p(int i5) {
        System.out.println(i5);
    }

    @InlineOnly
    private static final void q(long j5) {
        System.out.println(j5);
    }

    @InlineOnly
    private static final void r(Object obj) {
        System.out.println(obj);
    }

    @InlineOnly
    private static final void s(short s5) {
        System.out.println(Short.valueOf(s5));
    }

    @InlineOnly
    private static final void t(boolean z5) {
        System.out.println(z5);
    }

    @InlineOnly
    private static final void u(char[] cArr) {
        l0.p(cArr, ProtectedSandApp.s("㾉"));
        System.out.println(cArr);
    }

    @d5.e
    public static final String v() {
        LineReader lineReader = LineReader.f23421a;
        InputStream inputStream = System.in;
        l0.o(inputStream, ProtectedSandApp.s("㾊"));
        Charset defaultCharset = Charset.defaultCharset();
        l0.o(defaultCharset, ProtectedSandApp.s("㾋"));
        return lineReader.d(inputStream, defaultCharset);
    }

    @SinceKotlin(version = "1.6")
    @d5.d
    public static final String w() {
        String v5 = v();
        if (v5 != null) {
            return v5;
        }
        throw new ReadAfterEOFException(ProtectedSandApp.s("㾌"));
    }

    @SinceKotlin(version = "1.6")
    @d5.e
    public static final String x() {
        return v();
    }
}
