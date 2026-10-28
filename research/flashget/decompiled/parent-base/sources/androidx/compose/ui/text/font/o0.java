package androidx.compose.ui.text.font;

import androidx.compose.runtime.x4;
import androidx.constraintlayout.core.motion.utils.w;
import com.tencent.rtmp.TXLivePushConfig;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FontWeight.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/font/o0;", "", "", "weight", "<init>", "(I)V", "other", "t", "(Landroidx/compose/ui/text/font/o0;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "I", "u", "c", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o0 implements Comparable<o0> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: d, reason: collision with root package name */
    public static final int f20821d = 0;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final o0 f20822e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final o0 f20823f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final o0 f20824g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final o0 f20825h;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final o0 f20826i;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static final o0 f20827j;

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    private static final o0 f20828k;

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private static final o0 f20829l;

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private static final o0 f20830m;

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    private static final o0 f20831n;

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    private static final o0 f20832o;

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    private static final o0 f20833p;

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    private static final o0 f20834q;

    /* renamed from: r, reason: collision with root package name */
    @fg.l
    private static final o0 f20835r;

    /* renamed from: s, reason: collision with root package name */
    @fg.l
    private static final o0 f20836s;

    /* renamed from: t, reason: collision with root package name */
    @fg.l
    private static final o0 f20837t;

    /* renamed from: u, reason: collision with root package name */
    @fg.l
    private static final o0 f20838u;

    /* renamed from: v, reason: collision with root package name */
    @fg.l
    private static final o0 f20839v;

    /* renamed from: w, reason: collision with root package name */
    @fg.l
    private static final List<o0> f20840w;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int weight;

    /* compiled from: FontWeight.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR \u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR \u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\bR \u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\bR \u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u0006\u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010\bR \u0010(\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010\u0006\u0012\u0004\b*\u0010\u0003\u001a\u0004\b)\u0010\bR \u0010+\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010\u0006\u0012\u0004\b-\u0010\u0003\u001a\u0004\b,\u0010\bR \u0010.\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010\u0006\u0012\u0004\b0\u0010\u0003\u001a\u0004\b/\u0010\bR \u00101\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010\u0006\u0012\u0004\b3\u0010\u0003\u001a\u0004\b2\u0010\bR \u00104\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010\u0006\u0012\u0004\b6\u0010\u0003\u001a\u0004\b5\u0010\bR \u00107\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u0010\u0006\u0012\u0004\b9\u0010\u0003\u001a\u0004\b8\u0010\bR \u0010:\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b:\u0010\u0006\u0012\u0004\b<\u0010\u0003\u001a\u0004\b;\u0010\bR \u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006B"}, d2 = {"Landroidx/compose/ui/text/font/o0$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/o0;", "W100", "Landroidx/compose/ui/text/font/o0;", "t", "()Landroidx/compose/ui/text/font/o0;", "u", "W200", "v", "w", "W300", "x", "y", "W400", "z", "A", "W500", "B", "C", "W600", "D", "E", "W700", "F", "G", "W800", "H", "I", "W900", "J", "K", "Thin", "q", "r", "ExtraLight", "g", "h", "Light", "i", "j", "Normal", "m", "n", "Medium", "k", "l", "SemiBold", "o", "p", "Bold", "c", "d", "ExtraBold", "e", "f", "Black", "a", "b", "", "values", "Ljava/util/List;", "s", "()Ljava/util/List;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.font.o0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @x4
        public static /* synthetic */ void A() {
        }

        @x4
        public static /* synthetic */ void C() {
        }

        @x4
        public static /* synthetic */ void E() {
        }

        @x4
        public static /* synthetic */ void G() {
        }

        @x4
        public static /* synthetic */ void I() {
        }

        @x4
        public static /* synthetic */ void K() {
        }

        @x4
        public static /* synthetic */ void b() {
        }

        @x4
        public static /* synthetic */ void d() {
        }

        @x4
        public static /* synthetic */ void f() {
        }

        @x4
        public static /* synthetic */ void h() {
        }

        @x4
        public static /* synthetic */ void j() {
        }

        @x4
        public static /* synthetic */ void l() {
        }

        @x4
        public static /* synthetic */ void n() {
        }

        @x4
        public static /* synthetic */ void p() {
        }

        @x4
        public static /* synthetic */ void r() {
        }

        @x4
        public static /* synthetic */ void u() {
        }

        @x4
        public static /* synthetic */ void w() {
        }

        @x4
        public static /* synthetic */ void y() {
        }

        @fg.l
        public final o0 B() {
            return o0.f20826i;
        }

        @fg.l
        public final o0 D() {
            return o0.f20827j;
        }

        @fg.l
        public final o0 F() {
            return o0.f20828k;
        }

        @fg.l
        public final o0 H() {
            return o0.f20829l;
        }

        @fg.l
        public final o0 J() {
            return o0.f20830m;
        }

        @fg.l
        public final o0 a() {
            return o0.f20839v;
        }

        @fg.l
        public final o0 c() {
            return o0.f20837t;
        }

        @fg.l
        public final o0 e() {
            return o0.f20838u;
        }

        @fg.l
        public final o0 g() {
            return o0.f20832o;
        }

        @fg.l
        public final o0 i() {
            return o0.f20833p;
        }

        @fg.l
        public final o0 k() {
            return o0.f20835r;
        }

        @fg.l
        public final o0 m() {
            return o0.f20834q;
        }

        @fg.l
        public final o0 o() {
            return o0.f20836s;
        }

        @fg.l
        public final o0 q() {
            return o0.f20831n;
        }

        @fg.l
        public final List<o0> s() {
            return o0.f20840w;
        }

        @fg.l
        public final o0 t() {
            return o0.f20822e;
        }

        @fg.l
        public final o0 v() {
            return o0.f20823f;
        }

        @fg.l
        public final o0 x() {
            return o0.f20824g;
        }

        @fg.l
        public final o0 z() {
            return o0.f20825h;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    static {
        o0 o0Var = new o0(100);
        f20822e = o0Var;
        o0 o0Var2 = new o0(200);
        f20823f = o0Var2;
        o0 o0Var3 = new o0(300);
        f20824g = o0Var3;
        o0 o0Var4 = new o0(400);
        f20825h = o0Var4;
        o0 o0Var5 = new o0(500);
        f20826i = o0Var5;
        o0 o0Var6 = new o0(600);
        f20827j = o0Var6;
        o0 o0Var7 = new o0(w.h.f22554j);
        f20828k = o0Var7;
        o0 o0Var8 = new o0(TXLivePushConfig.DEFAULT_MIN_VIDEO_BITRATE);
        f20829l = o0Var8;
        o0 o0Var9 = new o0(w.b.f22438j);
        f20830m = o0Var9;
        f20831n = o0Var;
        f20832o = o0Var2;
        f20833p = o0Var3;
        f20834q = o0Var4;
        f20835r = o0Var5;
        f20836s = o0Var6;
        f20837t = o0Var7;
        f20838u = o0Var8;
        f20839v = o0Var9;
        f20840w = kotlin.collections.w.O(o0Var, o0Var2, o0Var3, o0Var4, o0Var5, o0Var6, o0Var7, o0Var8, o0Var9);
    }

    public o0(int i4) {
        this.weight = i4;
        if (1 > i4 || i4 >= 1001) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Font weight can be in range [1, 1000]. Current value: ", i4).toString());
        }
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof o0) && this.weight == ((o0) other).weight;
    }

    /* renamed from: hashCode, reason: from getter */
    public int getWeight() {
        return this.weight;
    }

    @Override // java.lang.Comparable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public int compareTo(@fg.l o0 other) {
        return kotlin.jvm.internal.l0.t(this.weight, other.weight);
    }

    @fg.l
    public String toString() {
        return androidx.view.e.a(new StringBuilder("FontWeight(weight="), this.weight, ')');
    }

    public final int u() {
        return this.weight;
    }
}
