package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* compiled from: GraphicsLayerScope.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\"\u0010\r\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR*\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R*\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R*\u0010!\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R*\u0010$\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R*\u0010(\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0011\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R0\u00100\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020)8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R0\u00104\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020)8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R*\u00107\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b5\u0010\u0013\"\u0004\b6\u0010\u0015R*\u00109\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b8\u0010\u0013\"\u0004\b+\u0010\u0015R*\u0010=\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0011\u001a\u0004\b;\u0010\u0013\"\u0004\b<\u0010\u0015R*\u0010@\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b>\u0010\u0011\u001a\u0004\b?\u0010\u0013\"\u0004\b\u0011\u0010\u0015R0\u0010D\u001a\u00020A2\u0006\u0010\u000f\u001a\u00020A8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b#\u0010+\u001a\u0004\bB\u0010-\"\u0004\bC\u0010/R*\u0010L\u001a\u00020E2\u0006\u0010\u000f\u001a\u00020E8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR*\u0010R\u001a\u00020M2\u0006\u0010\u000f\u001a\u00020M8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010N\u001a\u0004\b1\u0010O\"\u0004\bP\u0010QR0\u0010V\u001a\u00020S2\u0006\u0010\u000f\u001a\u00020S8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bT\u0010\b\u001a\u0004\bU\u0010\n\"\u0004\bT\u0010\fR(\u0010Y\u001a\u00020W8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b8\u0010+\u001a\u0004\b\u001b\u0010-\"\u0004\bX\u0010/R\"\u0010_\u001a\u00020Z8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010[\u001a\u0004\b\\\u0010]\"\u0004\bF\u0010^R.\u0010f\u001a\u0004\u0018\u00010`2\b\u0010\u000f\u001a\u0004\u0018\u00010`8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\b:\u0010c\"\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0013R\u0014\u0010i\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006j"}, d2 = {"Landroidx/compose/ui/graphics/z5;", "Landroidx/compose/ui/graphics/q4;", "<init>", "()V", "Lkotlin/k2;", "l", "", "b", "I", "f", "()I", "q", "(I)V", "mutatedFields", "", "value", "c", "F", "K", "()F", "z", "(F)V", "scaleX", "d", "f0", "Q", "scaleY", "e", "g", "k", "alpha", "Y", "b0", "translationX", "X", "o", "translationY", "h", "o6", "t3", "shadowElevation", "Landroidx/compose/ui/graphics/d2;", "i", "J", "o1", "()J", "T1", "(J)V", "ambientShadowColor", "j", "Q1", "t2", "spotShadowColor", "a0", "H", "rotationX", "s", "rotationY", "m", "x", "O", "rotationZ", "n", "C", "cameraDistance", "Landroidx/compose/ui/graphics/p6;", "j2", "r2", "transformOrigin", "Landroidx/compose/ui/graphics/e6;", "p", "Landroidx/compose/ui/graphics/e6;", "K4", "()Landroidx/compose/ui/graphics/e6;", "h5", "(Landroidx/compose/ui/graphics/e6;)V", "shape", "", "Z", "()Z", "g2", "(Z)V", "clip", "Landroidx/compose/ui/graphics/i4;", "r", "M", "compositingStrategy", "Li0/n;", "t", "size", "Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/d;", "a", "()Landroidx/compose/ui/unit/d;", "(Landroidx/compose/ui/unit/d;)V", "graphicsDensity", "Landroidx/compose/ui/graphics/s5;", "u", "Landroidx/compose/ui/graphics/s5;", "()Landroidx/compose/ui/graphics/s5;", "D", "(Landroidx/compose/ui/graphics/s5;)V", "renderEffect", "density", "U", "fontScale", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class z5 implements q4 {

    /* renamed from: v, reason: collision with root package name */
    public static final int f18483v = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int mutatedFields;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float shadowElevation;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private e6 shape;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean clip;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int compositingStrategy;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.unit.d graphicsDensity;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private s5 renderEffect;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float scaleX = 1.0f;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float scaleY = 1.0f;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float alpha = 1.0f;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long ambientShadowColor = r4.b();

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long spotShadowColor = r4.b();

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float cameraDistance = 8.0f;

    public z5() {
        p6.INSTANCE.getClass();
        this.transformOrigin = p6.f17986c;
        this.shape = r5.a();
        i4.INSTANCE.getClass();
        this.compositingStrategy = i4.f17852c;
        i0.n.INSTANCE.getClass();
        this.size = i0.n.f74172d;
        this.graphicsDensity = androidx.compose.ui.unit.f.b(1.0f, 0.0f, 2, null);
    }

    @Override // androidx.compose.ui.graphics.q4
    /* renamed from: C, reason: from getter */
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.q4
    public void D(@fg.m s5 s5Var) {
        if (kotlin.jvm.internal.l0.g(this.renderEffect, s5Var)) {
            return;
        }
        this.mutatedFields |= 131072;
        this.renderEffect = s5Var;
    }

    @Override // androidx.compose.ui.graphics.q4
    public void F(float f4) {
        if (this.cameraDistance == f4) {
            return;
        }
        this.mutatedFields |= 2048;
        this.cameraDistance = f4;
    }

    @Override // androidx.compose.ui.graphics.q4
    public void H(float f4) {
        if (this.rotationX == f4) {
            return;
        }
        this.mutatedFields |= 256;
        this.rotationX = f4;
    }

    @Override // androidx.compose.ui.graphics.q4
    public void J(float f4) {
        if (this.rotationY == f4) {
            return;
        }
        this.mutatedFields |= 512;
        this.rotationY = f4;
    }

    @Override // androidx.compose.ui.graphics.q4
    /* renamed from: K, reason: from getter */
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.q4
    @fg.l
    /* renamed from: K4, reason: from getter */
    public e6 getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.graphics.q4
    /* renamed from: M, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.graphics.q4
    public void O(float f4) {
        if (this.rotationZ == f4) {
            return;
        }
        this.mutatedFields |= 1024;
        this.rotationZ = f4;
    }

    @Override // androidx.compose.ui.graphics.q4
    public void Q(float f4) {
        if (this.scaleY == f4) {
            return;
        }
        this.mutatedFields |= 2;
        this.scaleY = f4;
    }

    @Override // androidx.compose.ui.graphics.q4
    /* renamed from: Q1, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.q4
    public void T1(long j4) {
        if (d2.y(this.ambientShadowColor, j4)) {
            return;
        }
        this.mutatedFields |= 64;
        this.ambientShadowColor = j4;
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: U */
    public float getFontScale() {
        return this.graphicsDensity.getFontScale();
    }

    @Override // androidx.compose.ui.graphics.q4
    /* renamed from: X, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.q4
    /* renamed from: Y, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final androidx.compose.ui.unit.d getGraphicsDensity() {
        return this.graphicsDensity;
    }

    @Override // androidx.compose.ui.graphics.q4
    /* renamed from: a0, reason: from getter */
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: b */
    public float getDensity() {
        return this.graphicsDensity.getDensity();
    }

    @Override // androidx.compose.ui.graphics.q4
    public void b0(float f4) {
        if (this.translationX == f4) {
            return;
        }
        this.mutatedFields |= 8;
        this.translationX = f4;
    }

    @Override // androidx.compose.ui.graphics.q4
    /* renamed from: e, reason: from getter */
    public long getSize() {
        return this.size;
    }

    /* renamed from: f, reason: from getter */
    public final int getMutatedFields() {
        return this.mutatedFields;
    }

    @Override // androidx.compose.ui.graphics.q4
    /* renamed from: f0, reason: from getter */
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.q4
    /* renamed from: g, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.q4
    public void g2(boolean z4) {
        if (this.clip != z4) {
            this.mutatedFields |= 16384;
            this.clip = z4;
        }
    }

    @Override // androidx.compose.ui.graphics.q4
    public void h5(@fg.l e6 e6Var) {
        if (kotlin.jvm.internal.l0.g(this.shape, e6Var)) {
            return;
        }
        this.mutatedFields |= 8192;
        this.shape = e6Var;
    }

    @Override // androidx.compose.ui.graphics.q4
    /* renamed from: j, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.ui.graphics.q4
    /* renamed from: j2, reason: from getter */
    public long getTransformOrigin() {
        return this.transformOrigin;
    }

    @Override // androidx.compose.ui.graphics.q4
    public void k(float f4) {
        if (this.alpha == f4) {
            return;
        }
        this.mutatedFields |= 4;
        this.alpha = f4;
    }

    public final void l() {
        z(1.0f);
        Q(1.0f);
        k(1.0f);
        b0(0.0f);
        o(0.0f);
        t3(0.0f);
        T1(r4.b());
        t2(r4.b());
        H(0.0f);
        J(0.0f);
        O(0.0f);
        F(8.0f);
        p6.INSTANCE.getClass();
        r2(p6.f17986c);
        h5(r5.a());
        g2(false);
        D(null);
        i4.INSTANCE.getClass();
        r(i4.f17852c);
        i0.n.INSTANCE.getClass();
        this.size = i0.n.f74172d;
        this.mutatedFields = 0;
    }

    @Override // androidx.compose.ui.graphics.q4
    @fg.m
    /* renamed from: m, reason: from getter */
    public s5 getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.q4
    public void o(float f4) {
        if (this.translationY == f4) {
            return;
        }
        this.mutatedFields |= 16;
        this.translationY = f4;
    }

    @Override // androidx.compose.ui.graphics.q4
    /* renamed from: o1, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.q4
    /* renamed from: o6, reason: from getter */
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    public final void p(@fg.l androidx.compose.ui.unit.d dVar) {
        this.graphicsDensity = dVar;
    }

    public final void q(int i4) {
        this.mutatedFields = i4;
    }

    @Override // androidx.compose.ui.graphics.q4
    public void r(int i4) {
        if (i4.g(this.compositingStrategy, i4)) {
            return;
        }
        this.mutatedFields |= 32768;
        this.compositingStrategy = i4;
    }

    @Override // androidx.compose.ui.graphics.q4
    public void r2(long j4) {
        if (p6.i(this.transformOrigin, j4)) {
            return;
        }
        this.mutatedFields |= 4096;
        this.transformOrigin = j4;
    }

    @Override // androidx.compose.ui.graphics.q4
    /* renamed from: s, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    public void t(long j4) {
        this.size = j4;
    }

    @Override // androidx.compose.ui.graphics.q4
    public void t2(long j4) {
        if (d2.y(this.spotShadowColor, j4)) {
            return;
        }
        this.mutatedFields |= 128;
        this.spotShadowColor = j4;
    }

    @Override // androidx.compose.ui.graphics.q4
    public void t3(float f4) {
        if (this.shadowElevation == f4) {
            return;
        }
        this.mutatedFields |= 32;
        this.shadowElevation = f4;
    }

    @Override // androidx.compose.ui.graphics.q4
    /* renamed from: x, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.q4
    public void z(float f4) {
        if (this.scaleX == f4) {
            return;
        }
        this.mutatedFields |= 1;
        this.scaleX = f4;
    }
}
