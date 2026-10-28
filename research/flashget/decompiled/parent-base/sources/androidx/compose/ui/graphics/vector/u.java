package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.e2;
import androidx.compose.ui.graphics.i5;
import androidx.compose.ui.graphics.i6;
import androidx.compose.ui.graphics.j6;
import androidx.compose.ui.graphics.k1;
import androidx.compose.ui.graphics.l1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.k2;

/* compiled from: Vector.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\u0010\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0013\u001a\u00020\u000f*\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018\"\u0014\u0010\u001d\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018\"\u0014\u0010\u001f\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018\"\u0014\u0010!\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0018\"\u0014\u0010#\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0018\"\u0014\u0010%\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0018\"\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b$\u0010'\"\u0014\u0010)\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015\"\u0014\u0010+\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0018\"\u0014\u0010-\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0018\"\u0014\u0010/\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0018\"\u0014\u00101\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0018\"\u0014\u00103\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0018\"\u0017\u00108\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b\u001c\u00107\"\u0017\u0010;\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b\u001e\u00107\"\u0017\u0010>\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b \u00107\"\u0017\u0010B\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b\"\u0010A\"\u0017\u0010E\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u00106\u001a\u0004\b\u001a\u00107\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/g;", "Lkotlin/k2;", "Lkotlin/u;", "block", "", "Landroidx/compose/ui/graphics/vector/i;", "a", "(Lld/l;)Ljava/util/List;", "", "pathStr", "b", "(Ljava/lang/String;)Ljava/util/List;", "Landroidx/compose/ui/graphics/d2;", "other", "", "i", "(JJ)Z", "Landroidx/compose/ui/graphics/e2;", "j", "(Landroidx/compose/ui/graphics/e2;)Z", "Ljava/lang/String;", "DefaultGroupName", "", "F", "DefaultRotation", "c", "DefaultPivotX", "d", "DefaultPivotY", "e", "DefaultScaleX", "f", "DefaultScaleY", "g", "DefaultTranslationX", "h", "DefaultTranslationY", "Ljava/util/List;", "()Ljava/util/List;", "EmptyPath", "DefaultPathName", "k", "DefaultStrokeLineWidth", "l", "DefaultStrokeLineMiter", "m", "DefaultTrimPathStart", "n", "DefaultTrimPathEnd", "o", "DefaultTrimPathOffset", "Landroidx/compose/ui/graphics/i6;", "p", "I", "()I", "DefaultStrokeLineCap", "Landroidx/compose/ui/graphics/j6;", "q", "DefaultStrokeLineJoin", "Landroidx/compose/ui/graphics/k1;", "r", "DefaultTintBlendMode", "s", "J", "()J", "DefaultTintColor", "Landroidx/compose/ui/graphics/i5;", "t", "DefaultFillType", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static final float f18368b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public static final float f18369c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public static final float f18370d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f18371e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public static final float f18372f = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    public static final float f18373g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public static final float f18374h = 0.0f;

    /* renamed from: k, reason: collision with root package name */
    public static final float f18377k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    public static final float f18378l = 4.0f;

    /* renamed from: m, reason: collision with root package name */
    public static final float f18379m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public static final float f18380n = 1.0f;

    /* renamed from: o, reason: collision with root package name */
    public static final float f18381o = 0.0f;

    /* renamed from: p, reason: collision with root package name */
    private static final int f18382p;

    /* renamed from: q, reason: collision with root package name */
    private static final int f18383q;

    /* renamed from: r, reason: collision with root package name */
    private static final int f18384r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f18385s;

    /* renamed from: t, reason: collision with root package name */
    private static final int f18386t;

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final String f18367a = "";

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    public static final String f18376j = "";

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final List<i> f18375i = j0.f74919b;

    static {
        i6.INSTANCE.getClass();
        f18382p = i6.f17861c;
        j6.INSTANCE.getClass();
        f18383q = j6.f17869c;
        k1.INSTANCE.getClass();
        f18384r = k1.f17879h;
        d2.INSTANCE.getClass();
        f18385s = d2.f17777n;
        i5.INSTANCE.getClass();
        f18386t = i5.f17857c;
    }

    @fg.l
    public static final List<i> a(@fg.l ld.l<? super g, k2> lVar) {
        g gVar = new g();
        lVar.invoke(gVar);
        return gVar.f();
    }

    @fg.l
    public static final List<i> b(@fg.m String str) {
        return str == null ? f18375i : new l().d(str).f();
    }

    public static final int c() {
        return f18386t;
    }

    public static final int d() {
        return f18382p;
    }

    public static final int e() {
        return f18383q;
    }

    public static final int f() {
        return f18384r;
    }

    public static final long g() {
        return f18385s;
    }

    @fg.l
    public static final List<i> h() {
        return f18375i;
    }

    public static final boolean i(long j4, long j5) {
        return d2.I(j4) == d2.I(j5) && d2.G(j4) == d2.G(j5) && d2.C(j4) == d2.C(j5);
    }

    public static final boolean j(@fg.m e2 e2Var) {
        if (e2Var instanceof l1) {
            l1 l1Var = (l1) e2Var;
            int blendMode = l1Var.getBlendMode();
            k1.Companion companion = k1.INSTANCE;
            companion.getClass();
            if (k1.G(blendMode, k1.f17879h)) {
                return true;
            }
            int blendMode2 = l1Var.getBlendMode();
            companion.getClass();
            if (k1.G(blendMode2, k1.f17877f)) {
                return true;
            }
        } else if (e2Var == null) {
            return true;
        }
        return false;
    }
}
