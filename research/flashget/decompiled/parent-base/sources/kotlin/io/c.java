package kotlin.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;

/* compiled from: Console.kt */
@kd.i(name = "ConsoleKt")
@Metadata(d1 = {"\u0000^\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001a\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0087\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\bH\u0087\b¢\u0006\u0004\b\t\u0010\n\u001a\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b\f\u0010\r\u001a\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0014H\u0087\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0017H\u0087\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u001aH\u0087\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u001dH\u0087\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001a\u0010 \u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0087\b¢\u0006\u0004\b \u0010\u0004\u001a\u0018\u0010!\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0087\b¢\u0006\u0004\b!\u0010\u0007\u001a\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\bH\u0087\b¢\u0006\u0004\b\"\u0010\n\u001a\u0018\u0010#\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b#\u0010\r\u001a\u0018\u0010$\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b$\u0010\u0010\u001a\u0018\u0010%\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b%\u0010\u0013\u001a\u0018\u0010&\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0014H\u0087\b¢\u0006\u0004\b&\u0010\u0016\u001a\u0018\u0010'\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0017H\u0087\b¢\u0006\u0004\b'\u0010\u0019\u001a\u0018\u0010(\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u001aH\u0087\b¢\u0006\u0004\b(\u0010\u001c\u001a\u0018\u0010)\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u001dH\u0087\b¢\u0006\u0004\b)\u0010\u001f\u001a\u0010\u0010*\u001a\u00020\u0002H\u0087\b¢\u0006\u0004\b*\u0010+\u001a\u000f\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b-\u0010.\u001a\u0011\u0010/\u001a\u0004\u0018\u00010,H\u0007¢\u0006\u0004\b/\u0010.\u001a\u000f\u00100\u001a\u0004\u0018\u00010,¢\u0006\u0004\b0\u0010.¨\u00061"}, d2 = {"", "message", "Lkotlin/k2;", "g", "(Ljava/lang/Object;)V", "", "e", "(I)V", "", "f", "(J)V", "", "a", "(B)V", "", "h", "(S)V", "", "b", "(C)V", "", "i", "(Z)V", "", "d", "(F)V", "", "c", "(D)V", "", "j", "([C)V", "r", "p", "q", "l", "s", "m", "t", "o", "n", "u", "k", "()V", "", "w", "()Ljava/lang/String;", "x", "v", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class c {
    @kotlin.internal.f
    private static final void a(byte b5) {
        System.out.print(Byte.valueOf(b5));
    }

    @kotlin.internal.f
    private static final void b(char c5) {
        System.out.print(c5);
    }

    @kotlin.internal.f
    private static final void c(double d5) {
        System.out.print(d5);
    }

    @kotlin.internal.f
    private static final void d(float f4) {
        System.out.print(f4);
    }

    @kotlin.internal.f
    private static final void e(int i4) {
        System.out.print(i4);
    }

    @kotlin.internal.f
    private static final void f(long j4) {
        System.out.print(j4);
    }

    @kotlin.internal.f
    private static final void g(Object obj) {
        System.out.print(obj);
    }

    @kotlin.internal.f
    private static final void h(short s4) {
        System.out.print(Short.valueOf(s4));
    }

    @kotlin.internal.f
    private static final void i(boolean z4) {
        System.out.print(z4);
    }

    @kotlin.internal.f
    private static final void j(char[] cArr) {
        l0.p(cArr, ProtectedSandApp.s("掩\u0001"));
        System.out.print(cArr);
    }

    @kotlin.internal.f
    private static final void k() {
        System.out.println();
    }

    @kotlin.internal.f
    private static final void l(byte b5) {
        System.out.println(Byte.valueOf(b5));
    }

    @kotlin.internal.f
    private static final void m(char c5) {
        System.out.println(c5);
    }

    @kotlin.internal.f
    private static final void n(double d5) {
        System.out.println(d5);
    }

    @kotlin.internal.f
    private static final void o(float f4) {
        System.out.println(f4);
    }

    @kotlin.internal.f
    private static final void p(int i4) {
        System.out.println(i4);
    }

    @kotlin.internal.f
    private static final void q(long j4) {
        System.out.println(j4);
    }

    @kotlin.internal.f
    private static final void r(Object obj) {
        System.out.println(obj);
    }

    @kotlin.internal.f
    private static final void s(short s4) {
        System.out.println(Short.valueOf(s4));
    }

    @kotlin.internal.f
    private static final void t(boolean z4) {
        System.out.println(z4);
    }

    @kotlin.internal.f
    private static final void u(char[] cArr) {
        l0.p(cArr, ProtectedSandApp.s("掩\u0001"));
        System.out.println(cArr);
    }

    @fg.m
    public static final String v() {
        o oVar = o.f75180a;
        InputStream inputStream = System.in;
        l0.o(inputStream, ProtectedSandApp.s("措\u0001"));
        Charset defaultCharset = Charset.defaultCharset();
        l0.o(defaultCharset, ProtectedSandApp.s("掫\u0001"));
        return oVar.d(inputStream, defaultCharset);
    }

    @fg.l
    @c1(version = "1.6")
    public static final String w() {
        String v4 = v();
        if (v4 != null) {
            return v4;
        }
        throw new ReadAfterEOFException(ProtectedSandApp.s("掬\u0001"));
    }

    @fg.m
    @c1(version = "1.6")
    public static final String x() {
        return v();
    }
}
