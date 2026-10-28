package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.graphics.b5;
import i0.n;
import kotlin.Metadata;

/* compiled from: OutlineResolver.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u001c\u001a\u00020\u001b*\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ=\u0010%\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010(\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b.\u0010/R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u00100R\u0016\u00103\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010<R$\u0010A\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020\u001b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b%\u00102\u001a\u0004\b1\u0010@R\u0016\u0010B\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00102R\u0018\u0010C\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010<R\u0018\u0010E\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010DR\u0016\u0010G\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010FR\u001c\u0010H\u001a\u00020\u00158\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u00109R\u001c\u0010J\u001a\u00020\u00178\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bI\u00109R\u0016\u0010L\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u00102R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010<R\u0018\u0010R\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010<R\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0013\u0010X\u001a\u0004\u0018\u0001048F¢\u0006\u0006\u001a\u0004\b8\u0010WR\u0011\u0010Y\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b:\u0010@R\u0013\u0010[\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b5\u0010Z\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\\"}, d2 = {"Landroidx/compose/ui/platform/k2;", "", "Landroidx/compose/ui/unit/d;", "density", "<init>", "(Landroidx/compose/ui/unit/d;)V", "Lkotlin/k2;", "j", "()V", "Li0/i;", "rect", "l", "(Li0/i;)V", "Li0/l;", "roundRect", "m", "(Li0/l;)V", "Landroidx/compose/ui/graphics/g5;", "composePath", "k", "(Landroidx/compose/ui/graphics/g5;)V", "Li0/f;", "offset", "Li0/n;", "size", "", "radius", "", "g", "(Li0/l;JJF)Z", "Landroidx/compose/ui/graphics/e6;", "shape", "alpha", "clipToOutline", "elevation", "Landroidx/compose/ui/unit/w;", "layoutDirection", "h", "(Landroidx/compose/ui/graphics/e6;FZFLandroidx/compose/ui/unit/w;Landroidx/compose/ui/unit/d;)Z", "position", "f", "(J)Z", "Landroidx/compose/ui/graphics/v1;", "canvas", "a", "(Landroidx/compose/ui/graphics/v1;)V", "i", "(J)V", "Landroidx/compose/ui/unit/d;", "b", "Z", "isSupportedOutline", "Landroid/graphics/Outline;", "c", "Landroid/graphics/Outline;", "cachedOutline", "d", "J", "e", "Landroidx/compose/ui/graphics/e6;", "Landroidx/compose/ui/graphics/g5;", "cachedRrectPath", "outlinePath", "<set-?>", "()Z", "cacheIsDirty", "usePathForClip", "tmpPath", "Li0/l;", "tmpRoundRect", "F", "roundedCornerRadius", "rectTopLeft", "n", "rectSize", "o", "outlineNeeded", "p", "Landroidx/compose/ui/unit/w;", "q", "tmpTouchPointPath", "r", "tmpOpPath", "Landroidx/compose/ui/graphics/b5;", "s", "Landroidx/compose/ui/graphics/b5;", "calculatedOutline", "()Landroid/graphics/Outline;", "outline", "outlineClipSupported", "()Landroidx/compose/ui/graphics/g5;", "clipPath", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nOutlineResolver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,357:1\n1#2:358\n35#3,5:359\n*S KotlinDebug\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n*L\n331#1:359,5\n*E\n"})
/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: t, reason: collision with root package name */
    public static final int f19958t = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.unit.d density;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isSupportedOutline = true;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Outline cachedOutline;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.graphics.e6 shape;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.graphics.g5 cachedRrectPath;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.graphics.g5 outlinePath;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean cacheIsDirty;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean usePathForClip;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.graphics.g5 tmpPath;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private i0.l tmpRoundRect;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float roundedCornerRadius;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private long rectTopLeft;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long rectSize;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean outlineNeeded;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.unit.w layoutDirection;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.graphics.g5 tmpTouchPointPath;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.graphics.g5 tmpOpPath;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.graphics.b5 calculatedOutline;

    public k2(@fg.l androidx.compose.ui.unit.d dVar) {
        this.density = dVar;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        n.Companion companion = i0.n.INSTANCE;
        companion.getClass();
        this.size = i0.n.f74171c;
        this.shape = androidx.compose.ui.graphics.r5.a();
        i0.f.INSTANCE.getClass();
        this.rectTopLeft = i0.f.f74147c;
        companion.getClass();
        this.rectSize = i0.n.f74171c;
        this.layoutDirection = androidx.compose.ui.unit.w.Ltr;
    }

    private final boolean g(i0.l lVar, long j4, long j5, float f4) {
        if (lVar == null || !i0.m.q(lVar) || lVar.q() != i0.f.p(j4) || lVar.s() != i0.f.r(j4)) {
            return false;
        }
        if (lVar.r() == i0.n.t(j5) + i0.f.p(j4)) {
            return lVar.m() == i0.n.m(j5) + i0.f.r(j4) && i0.a.m(lVar.t()) == f4;
        }
        return false;
    }

    private final void j() {
        if (this.cacheIsDirty) {
            i0.f.INSTANCE.getClass();
            this.rectTopLeft = i0.f.f74147c;
            long j4 = this.size;
            this.rectSize = j4;
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            if (!this.outlineNeeded || i0.n.t(j4) <= 0.0f || i0.n.m(this.size) <= 0.0f) {
                this.cachedOutline.setEmpty();
                return;
            }
            this.isSupportedOutline = true;
            androidx.compose.ui.graphics.b5 a5 = this.shape.a(this.size, this.layoutDirection, this.density);
            this.calculatedOutline = a5;
            if (a5 instanceof b5.b) {
                l(((b5.b) a5).b());
            } else if (a5 instanceof b5.c) {
                m(((b5.c) a5).getRoundRect());
            } else if (a5 instanceof b5.a) {
                k(((b5.a) a5).getPath());
            }
        }
    }

    private final void k(androidx.compose.ui.graphics.g5 composePath) {
        if (Build.VERSION.SDK_INT > 28 || composePath.b()) {
            Outline outline = this.cachedOutline;
            if (!(composePath instanceof androidx.compose.ui.graphics.v0)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((androidx.compose.ui.graphics.v0) composePath).getInternalPath());
            this.usePathForClip = !this.cachedOutline.canClip();
        } else {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        }
        this.outlinePath = composePath;
    }

    private final void l(i0.i rect) {
        this.rectTopLeft = i0.g.a(rect.t(), rect.getTop());
        this.rectSize = i0.o.a(rect.G(), rect.r());
        this.cachedOutline.setRect(kotlin.math.b.L0(rect.t()), kotlin.math.b.L0(rect.getTop()), kotlin.math.b.L0(rect.x()), kotlin.math.b.L0(rect.j()));
    }

    private final void m(i0.l roundRect) {
        float m4 = i0.a.m(roundRect.t());
        this.rectTopLeft = i0.g.a(roundRect.q(), roundRect.s());
        this.rectSize = i0.o.a(roundRect.v(), roundRect.p());
        if (i0.m.q(roundRect)) {
            this.cachedOutline.setRoundRect(kotlin.math.b.L0(roundRect.q()), kotlin.math.b.L0(roundRect.s()), kotlin.math.b.L0(roundRect.r()), kotlin.math.b.L0(roundRect.m()), m4);
            this.roundedCornerRadius = m4;
            return;
        }
        androidx.compose.ui.graphics.g5 g5Var = this.cachedRrectPath;
        if (g5Var == null) {
            g5Var = androidx.compose.ui.graphics.a1.a();
            this.cachedRrectPath = g5Var;
        }
        g5Var.reset();
        g5Var.r(roundRect);
        k(g5Var);
    }

    public final void a(@fg.l androidx.compose.ui.graphics.v1 canvas) {
        j();
        androidx.compose.ui.graphics.g5 g5Var = this.outlinePath;
        if (g5Var != null) {
            androidx.compose.ui.graphics.v1.q(canvas, g5Var, 0, 2, null);
            return;
        }
        float f4 = this.roundedCornerRadius;
        if (f4 <= 0.0f) {
            androidx.compose.ui.graphics.v1.v(canvas, i0.f.p(this.rectTopLeft), i0.f.r(this.rectTopLeft), i0.n.t(this.rectSize) + i0.f.p(this.rectTopLeft), i0.n.m(this.rectSize) + i0.f.r(this.rectTopLeft), 0, 16, null);
            return;
        }
        androidx.compose.ui.graphics.g5 g5Var2 = this.tmpPath;
        i0.l lVar = this.tmpRoundRect;
        if (g5Var2 == null || !g(lVar, this.rectTopLeft, this.rectSize, f4)) {
            i0.l e4 = i0.m.e(i0.f.p(this.rectTopLeft), i0.f.r(this.rectTopLeft), i0.n.t(this.rectSize) + i0.f.p(this.rectTopLeft), i0.n.m(this.rectSize) + i0.f.r(this.rectTopLeft), i0.b.b(this.roundedCornerRadius, 0.0f, 2, null));
            if (g5Var2 == null) {
                g5Var2 = androidx.compose.ui.graphics.a1.a();
            } else {
                g5Var2.reset();
            }
            g5Var2.r(e4);
            this.tmpRoundRect = e4;
            this.tmpPath = g5Var2;
        }
        androidx.compose.ui.graphics.v1.q(canvas, g5Var2, 0, 2, null);
    }

    /* renamed from: b, reason: from getter */
    public final boolean getCacheIsDirty() {
        return this.cacheIsDirty;
    }

    @fg.m
    public final androidx.compose.ui.graphics.g5 c() {
        j();
        return this.outlinePath;
    }

    @fg.m
    public final Outline d() {
        j();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    public final boolean e() {
        return !this.usePathForClip;
    }

    public final boolean f(long position) {
        androidx.compose.ui.graphics.b5 b5Var;
        if (this.outlineNeeded && (b5Var = this.calculatedOutline) != null) {
            return f5.b(b5Var, i0.f.p(position), i0.f.r(position), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    public final boolean h(@fg.l androidx.compose.ui.graphics.e6 shape, float alpha, boolean clipToOutline, float elevation, @fg.l androidx.compose.ui.unit.w layoutDirection, @fg.l androidx.compose.ui.unit.d density) {
        this.cachedOutline.setAlpha(alpha);
        boolean g4 = kotlin.jvm.internal.l0.g(this.shape, shape);
        boolean z4 = !g4;
        if (!g4) {
            this.shape = shape;
            this.cacheIsDirty = true;
        }
        boolean z5 = clipToOutline || elevation > 0.0f;
        if (this.outlineNeeded != z5) {
            this.outlineNeeded = z5;
            this.cacheIsDirty = true;
        }
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            this.cacheIsDirty = true;
        }
        if (!kotlin.jvm.internal.l0.g(this.density, density)) {
            this.density = density;
            this.cacheIsDirty = true;
        }
        return z4;
    }

    public final void i(long size) {
        if (i0.n.k(this.size, size)) {
            return;
        }
        this.size = size;
        this.cacheIsDirty = true;
    }
}
