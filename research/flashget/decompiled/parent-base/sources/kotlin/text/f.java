package kotlin.text;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.charset.Charset;
import kotlin.Metadata;

/* compiled from: Charsets.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0011\u0010\u001a\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0019¨\u0006\u001d"}, d2 = {"Lkotlin/text/f;", "", "<init>", "()V", "Ljava/nio/charset/Charset;", "b", "Ljava/nio/charset/Charset;", "UTF_8", "c", "UTF_16", "d", "UTF_16BE", "e", "UTF_16LE", "f", "US_ASCII", "g", "ISO_8859_1", "h", "utf_32", "i", "utf_32le", "j", "utf_32be", "a", "()Ljava/nio/charset/Charset;", "UTF_32", "UTF_32LE", "UTF_32BE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final f f79061a = new f();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public static final Charset UTF_8;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public static final Charset UTF_16;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public static final Charset UTF_16BE;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public static final Charset UTF_16LE;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public static final Charset US_ASCII;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public static final Charset ISO_8859_1;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private static volatile Charset utf_32;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private static volatile Charset utf_32le;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private static volatile Charset utf_32be;

    static {
        Charset forName = Charset.forName(ProtectedSandApp.s("萙\u0001"));
        String s4 = ProtectedSandApp.s("萚\u0001");
        kotlin.jvm.internal.l0.o(forName, s4);
        UTF_8 = forName;
        Charset forName2 = Charset.forName(ProtectedSandApp.s("萛\u0001"));
        kotlin.jvm.internal.l0.o(forName2, s4);
        UTF_16 = forName2;
        Charset forName3 = Charset.forName(ProtectedSandApp.s("萜\u0001"));
        kotlin.jvm.internal.l0.o(forName3, s4);
        UTF_16BE = forName3;
        Charset forName4 = Charset.forName(ProtectedSandApp.s("萝\u0001"));
        kotlin.jvm.internal.l0.o(forName4, s4);
        UTF_16LE = forName4;
        Charset forName5 = Charset.forName(ProtectedSandApp.s("萞\u0001"));
        kotlin.jvm.internal.l0.o(forName5, s4);
        US_ASCII = forName5;
        Charset forName6 = Charset.forName(ProtectedSandApp.s("萟\u0001"));
        kotlin.jvm.internal.l0.o(forName6, s4);
        ISO_8859_1 = forName6;
    }

    private f() {
    }

    @fg.l
    @kd.i(name = "UTF32")
    public final Charset a() {
        Charset charset = utf_32;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName(ProtectedSandApp.s("萠\u0001"));
        kotlin.jvm.internal.l0.o(forName, ProtectedSandApp.s("萚\u0001"));
        utf_32 = forName;
        return forName;
    }

    @fg.l
    @kd.i(name = "UTF32_BE")
    public final Charset b() {
        Charset charset = utf_32be;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName(ProtectedSandApp.s("萡\u0001"));
        kotlin.jvm.internal.l0.o(forName, ProtectedSandApp.s("萚\u0001"));
        utf_32be = forName;
        return forName;
    }

    @fg.l
    @kd.i(name = "UTF32_LE")
    public final Charset c() {
        Charset charset = utf_32le;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName(ProtectedSandApp.s("萢\u0001"));
        kotlin.jvm.internal.l0.o(forName, ProtectedSandApp.s("萚\u0001"));
        utf_32le = forName;
        return forName;
    }
}
