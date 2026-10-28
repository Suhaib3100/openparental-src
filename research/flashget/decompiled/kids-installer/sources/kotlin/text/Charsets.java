package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.charset.Charset;
import kotlin.Metadata;

/* compiled from: Charsets.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0010\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlin/text/Charsets;", "", "()V", "ISO_8859_1", "Ljava/nio/charset/Charset;", "US_ASCII", "UTF_16", "UTF_16BE", "UTF_16LE", "UTF_32", "UTF32", "()Ljava/nio/charset/Charset;", "UTF_32BE", "UTF32_BE", "UTF_32LE", "UTF32_LE", "UTF_8", "utf_32", "utf_32be", "utf_32le", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.text.f, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class Charsets {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final Charsets f27048a = new Charsets();

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final Charset f27049b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final Charset f27050c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final Charset f27051d;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final Charset f27052e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final Charset f27053f;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final Charset f27054g;

    /* renamed from: h, reason: collision with root package name */
    @d5.e
    private static volatile Charset f27055h;

    /* renamed from: i, reason: collision with root package name */
    @d5.e
    private static volatile Charset f27056i;

    /* renamed from: j, reason: collision with root package name */
    @d5.e
    private static volatile Charset f27057j;

    static {
        Charset forName = Charset.forName(ProtectedSandApp.s("媿"));
        String s5 = ProtectedSandApp.s("嫀");
        kotlin.jvm.internal.l0.o(forName, s5);
        f27049b = forName;
        Charset forName2 = Charset.forName(ProtectedSandApp.s("嫁"));
        kotlin.jvm.internal.l0.o(forName2, s5);
        f27050c = forName2;
        Charset forName3 = Charset.forName(ProtectedSandApp.s("嫂"));
        kotlin.jvm.internal.l0.o(forName3, s5);
        f27051d = forName3;
        Charset forName4 = Charset.forName(ProtectedSandApp.s("嫃"));
        kotlin.jvm.internal.l0.o(forName4, s5);
        f27052e = forName4;
        Charset forName5 = Charset.forName(ProtectedSandApp.s("嫄"));
        kotlin.jvm.internal.l0.o(forName5, s5);
        f27053f = forName5;
        Charset forName6 = Charset.forName(ProtectedSandApp.s("嫅"));
        kotlin.jvm.internal.l0.o(forName6, s5);
        f27054g = forName6;
    }

    private Charsets() {
    }

    @p3.i(name = "UTF32")
    @d5.d
    public final Charset a() {
        Charset charset = f27055h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName(ProtectedSandApp.s("嫆"));
        kotlin.jvm.internal.l0.o(forName, ProtectedSandApp.s("嫇"));
        f27055h = forName;
        return forName;
    }

    @p3.i(name = "UTF32_BE")
    @d5.d
    public final Charset b() {
        Charset charset = f27057j;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName(ProtectedSandApp.s("嫈"));
        kotlin.jvm.internal.l0.o(forName, ProtectedSandApp.s("嫉"));
        f27057j = forName;
        return forName;
    }

    @p3.i(name = "UTF32_LE")
    @d5.d
    public final Charset c() {
        Charset charset = f27056i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName(ProtectedSandApp.s("嫊"));
        kotlin.jvm.internal.l0.o(forName, ProtectedSandApp.s("嫋"));
        f27056i = forName;
        return forName;
    }
}
