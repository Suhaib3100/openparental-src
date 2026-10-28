package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* compiled from: GraphicsLayerModifier.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b%\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020 *\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0010\u0010*\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0010\u0010+\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b+\u0010'J\u0010\u0010,\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b,\u0010'J\u0010\u0010-\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b-\u0010'J\u0010\u0010.\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b.\u0010'J\u0010\u0010/\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b/\u0010'J\u0010\u00100\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b0\u0010'J\u0016\u00101\u001a\u00020\u000eHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b7\u00108J\u0016\u00109\u001a\u00020\u0016HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u00102J\u0016\u0010:\u001a\u00020\u0016HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u00102J\u0016\u0010;\u001a\u00020\u0019HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<J¿\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u0019HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010@\u001a\u00020?HÖ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010C\u001a\u00020BHÖ\u0001¢\u0006\u0004\bC\u0010<J\u001a\u0010F\u001a\u00020\u00122\b\u0010E\u001a\u0004\u0018\u00010DHÖ\u0003¢\u0006\u0004\bF\u0010GR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bH\u0010,\u001a\u0004\bI\u0010'R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bJ\u0010,\u001a\u0004\bK\u0010'R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bL\u0010,\u001a\u0004\bM\u0010'R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bN\u0010,\u001a\u0004\bO\u0010'R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bP\u0010,\u001a\u0004\bQ\u0010'R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bR\u0010,\u001a\u0004\bS\u0010'R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bT\u0010,\u001a\u0004\bU\u0010'R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b$\u0010,\u001a\u0004\bV\u0010'R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bW\u0010,\u001a\u0004\bX\u0010'R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bY\u0010,\u001a\u0004\bZ\u0010'R\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b&\u0010.\u001a\u0004\b[\u00102R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b0\u0010\\\u001a\u0004\b]\u00104R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u00106R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u00108R\u001d\u0010\u0017\u001a\u00020\u00168\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\bd\u00102R\u001d\u0010\u0018\u001a\u00020\u00168\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\be\u00102R\u001d\u0010\u001a\u001a\u00020\u00198\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010<\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006i"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/graphics/f6;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/p6;", "transformOrigin", "Landroidx/compose/ui/graphics/e6;", "shape", "", "clip", "Landroidx/compose/ui/graphics/s5;", "renderEffect", "Landroidx/compose/ui/graphics/d2;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/i4;", "compositingStrategy", "<init>", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/e6;ZLandroidx/compose/ui/graphics/s5;JJILkotlin/jvm/internal/w;)V", "N", "()Landroidx/compose/ui/graphics/f6;", "node", "Lkotlin/k2;", "r0", "(Landroidx/compose/ui/graphics/f6;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "n", "()F", "A", "B", "C", "D", "F", "H", "J", "K", "o", "r", "()J", "s", "()Landroidx/compose/ui/graphics/e6;", "u", "()Z", "v", "()Landroidx/compose/ui/graphics/s5;", "w", "x", "z", "()I", "L", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/e6;ZLandroidx/compose/ui/graphics/s5;JJI)Landroidx/compose/ui/graphics/GraphicsLayerElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "c0", "e", "d0", "f", "O", "g", "o0", "h", "q0", "i", "f0", "j", "Y", "a0", "l", "b0", "m", "R", "k0", "Landroidx/compose/ui/graphics/e6;", "g0", "p", "Z", "S", "q", "Landroidx/compose/ui/graphics/s5;", "X", "Q", "h0", "t", "I", "U", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class GraphicsLayerElement extends androidx.compose.ui.node.y0<f6> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float scaleX;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float scaleY;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float translationX;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float translationY;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float shadowElevation;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final float rotationX;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final float rotationY;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final float rotationZ;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final float cameraDistance;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long transformOrigin;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e6 shape;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean clip;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final s5 renderEffect;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final long ambientShadowColor;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final long spotShadowColor;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int compositingStrategy;

    public /* synthetic */ GraphicsLayerElement(float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13, float f14, float f15, long j4, e6 e6Var, boolean z4, s5 s5Var, long j5, long j6, int i4, kotlin.jvm.internal.w wVar) {
        this(f4, f5, f6, f7, f10, f11, f12, f13, f14, f15, j4, e6Var, z4, s5Var, j5, j6, i4);
    }

    public static GraphicsLayerElement M(GraphicsLayerElement graphicsLayerElement, float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13, float f14, float f15, long j4, e6 e6Var, boolean z4, s5 s5Var, long j5, long j6, int i4, int i5, Object obj) {
        float f16 = (i5 & 1) != 0 ? graphicsLayerElement.scaleX : f4;
        float f17 = (i5 & 2) != 0 ? graphicsLayerElement.scaleY : f5;
        float f18 = (i5 & 4) != 0 ? graphicsLayerElement.alpha : f6;
        float f19 = (i5 & 8) != 0 ? graphicsLayerElement.translationX : f7;
        float f20 = (i5 & 16) != 0 ? graphicsLayerElement.translationY : f10;
        float f21 = (i5 & 32) != 0 ? graphicsLayerElement.shadowElevation : f11;
        float f22 = (i5 & 64) != 0 ? graphicsLayerElement.rotationX : f12;
        float f23 = (i5 & 128) != 0 ? graphicsLayerElement.rotationY : f13;
        float f24 = (i5 & 256) != 0 ? graphicsLayerElement.rotationZ : f14;
        float f25 = (i5 & 512) != 0 ? graphicsLayerElement.cameraDistance : f15;
        long j7 = (i5 & 1024) != 0 ? graphicsLayerElement.transformOrigin : j4;
        e6 e6Var2 = (i5 & 2048) != 0 ? graphicsLayerElement.shape : e6Var;
        boolean z5 = (i5 & 4096) != 0 ? graphicsLayerElement.clip : z4;
        s5 s5Var2 = (i5 & 8192) != 0 ? graphicsLayerElement.renderEffect : s5Var;
        e6 e6Var3 = e6Var2;
        long j10 = (i5 & 16384) != 0 ? graphicsLayerElement.ambientShadowColor : j5;
        long j11 = (i5 & 32768) != 0 ? graphicsLayerElement.spotShadowColor : j6;
        int i6 = (i5 & 65536) != 0 ? graphicsLayerElement.compositingStrategy : i4;
        graphicsLayerElement.getClass();
        return new GraphicsLayerElement(f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, j7, e6Var3, z5, s5Var2, j10, j11, i6);
    }

    /* renamed from: A, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    /* renamed from: B, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: C, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    /* renamed from: D, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    /* renamed from: F, reason: from getter */
    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    /* renamed from: H, reason: from getter */
    public final float getRotationX() {
        return this.rotationX;
    }

    /* renamed from: J, reason: from getter */
    public final float getRotationY() {
        return this.rotationY;
    }

    /* renamed from: K, reason: from getter */
    public final float getRotationZ() {
        return this.rotationZ;
    }

    @fg.l
    public final GraphicsLayerElement L(float scaleX, float scaleY, float alpha, float translationX, float translationY, float shadowElevation, float rotationX, float rotationY, float rotationZ, float cameraDistance, long transformOrigin, @fg.l e6 shape, boolean clip, @fg.m s5 renderEffect, long ambientShadowColor, long spotShadowColor, int compositingStrategy) {
        return new GraphicsLayerElement(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, renderEffect, ambientShadowColor, spotShadowColor, compositingStrategy);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public f6 i() {
        return new f6(this.scaleX, this.scaleY, this.alpha, this.translationX, this.translationY, this.shadowElevation, this.rotationX, this.rotationY, this.rotationZ, this.cameraDistance, this.transformOrigin, this.shape, this.clip, this.renderEffect, this.ambientShadowColor, this.spotShadowColor, this.compositingStrategy, null);
    }

    public final float O() {
        return this.alpha;
    }

    /* renamed from: Q, reason: from getter */
    public final long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    /* renamed from: R, reason: from getter */
    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    /* renamed from: S, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: U, reason: from getter */
    public final int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @fg.m
    /* renamed from: X, reason: from getter */
    public final s5 getRenderEffect() {
        return this.renderEffect;
    }

    public final float Y() {
        return this.rotationX;
    }

    public final float a0() {
        return this.rotationY;
    }

    public final float b0() {
        return this.rotationZ;
    }

    /* renamed from: c0, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    public final float d0() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) other;
        return Float.compare(this.scaleX, graphicsLayerElement.scaleX) == 0 && Float.compare(this.scaleY, graphicsLayerElement.scaleY) == 0 && Float.compare(this.alpha, graphicsLayerElement.alpha) == 0 && Float.compare(this.translationX, graphicsLayerElement.translationX) == 0 && Float.compare(this.translationY, graphicsLayerElement.translationY) == 0 && Float.compare(this.shadowElevation, graphicsLayerElement.shadowElevation) == 0 && Float.compare(this.rotationX, graphicsLayerElement.rotationX) == 0 && Float.compare(this.rotationY, graphicsLayerElement.rotationY) == 0 && Float.compare(this.rotationZ, graphicsLayerElement.rotationZ) == 0 && Float.compare(this.cameraDistance, graphicsLayerElement.cameraDistance) == 0 && p6.i(this.transformOrigin, graphicsLayerElement.transformOrigin) && kotlin.jvm.internal.l0.g(this.shape, graphicsLayerElement.shape) && this.clip == graphicsLayerElement.clip && kotlin.jvm.internal.l0.g(this.renderEffect, graphicsLayerElement.renderEffect) && d2.y(this.ambientShadowColor, graphicsLayerElement.ambientShadowColor) && kotlin.a2.o(this.spotShadowColor, graphicsLayerElement.spotShadowColor) && i4.g(this.compositingStrategy, graphicsLayerElement.compositingStrategy);
    }

    public final float f0() {
        return this.shadowElevation;
    }

    @fg.l
    /* renamed from: g0, reason: from getter */
    public final e6 getShape() {
        return this.shape;
    }

    /* renamed from: h0, reason: from getter */
    public final long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        int a5 = androidx.compose.animation.d1.a(this.clip, (this.shape.hashCode() + ((p6.m(this.transformOrigin) + androidx.compose.animation.l0.a(this.cameraDistance, androidx.compose.animation.l0.a(this.rotationZ, androidx.compose.animation.l0.a(this.rotationY, androidx.compose.animation.l0.a(this.rotationX, androidx.compose.animation.l0.a(this.shadowElevation, androidx.compose.animation.l0.a(this.translationY, androidx.compose.animation.l0.a(this.translationX, androidx.compose.animation.l0.a(this.alpha, androidx.compose.animation.l0.a(this.scaleY, Float.hashCode(this.scaleX) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31, 31);
        s5 s5Var = this.renderEffect;
        return i4.h(this.compositingStrategy) + androidx.compose.material3.m0.a(this.spotShadowColor, (d2.K(this.ambientShadowColor) + ((a5 + (s5Var == null ? 0 : s5Var.hashCode())) * 31)) * 31, 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
        a2Var.d("graphicsLayer");
        a2Var.getProperties().c("scaleX", Float.valueOf(this.scaleX));
        a2Var.getProperties().c("scaleY", Float.valueOf(this.scaleY));
        a2Var.getProperties().c("alpha", Float.valueOf(this.alpha));
        a2Var.getProperties().c("translationX", Float.valueOf(this.translationX));
        a2Var.getProperties().c("translationY", Float.valueOf(this.translationY));
        a2Var.getProperties().c("shadowElevation", Float.valueOf(this.shadowElevation));
        a2Var.getProperties().c("rotationX", Float.valueOf(this.rotationX));
        a2Var.getProperties().c("rotationY", Float.valueOf(this.rotationY));
        a2Var.getProperties().c("rotationZ", Float.valueOf(this.rotationZ));
        a2Var.getProperties().c("cameraDistance", Float.valueOf(this.cameraDistance));
        a2Var.getProperties().c("transformOrigin", p6.b(this.transformOrigin));
        a2Var.getProperties().c("shape", this.shape);
        androidx.compose.foundation.h0.a(this.clip, a2Var.getProperties(), "clip", a2Var).c("renderEffect", this.renderEffect);
        a2Var.getProperties().c("ambientShadowColor", d2.n(this.ambientShadowColor));
        a2Var.getProperties().c("spotShadowColor", d2.n(this.spotShadowColor));
        a2Var.getProperties().c("compositingStrategy", i4.d(this.compositingStrategy));
    }

    /* renamed from: k0, reason: from getter */
    public final long getTransformOrigin() {
        return this.transformOrigin;
    }

    public final float n() {
        return this.scaleX;
    }

    public final float o() {
        return this.cameraDistance;
    }

    public final float o0() {
        return this.translationX;
    }

    public final float q0() {
        return this.translationY;
    }

    public final long r() {
        return this.transformOrigin;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l f6 node) {
        node.z(this.scaleX);
        node.Q(this.scaleY);
        node.k(this.alpha);
        node.b0(this.translationX);
        node.o(this.translationY);
        node.t3(this.shadowElevation);
        node.H(this.rotationX);
        node.J(this.rotationY);
        node.O(this.rotationZ);
        node.F(this.cameraDistance);
        node.r2(this.transformOrigin);
        node.h5(this.shape);
        node.g2(this.clip);
        node.D(this.renderEffect);
        node.T1(this.ambientShadowColor);
        node.t2(this.spotShadowColor);
        node.r(this.compositingStrategy);
        node.z7();
    }

    @fg.l
    public final e6 s() {
        return this.shape;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.scaleX);
        sb.append(", scaleY=");
        sb.append(this.scaleY);
        sb.append(", alpha=");
        sb.append(this.alpha);
        sb.append(", translationX=");
        sb.append(this.translationX);
        sb.append(", translationY=");
        sb.append(this.translationY);
        sb.append(", shadowElevation=");
        sb.append(this.shadowElevation);
        sb.append(", rotationX=");
        sb.append(this.rotationX);
        sb.append(", rotationY=");
        sb.append(this.rotationY);
        sb.append(", rotationZ=");
        sb.append(this.rotationZ);
        sb.append(", cameraDistance=");
        sb.append(this.cameraDistance);
        sb.append(", transformOrigin=");
        sb.append((Object) p6.n(this.transformOrigin));
        sb.append(", shape=");
        sb.append(this.shape);
        sb.append(", clip=");
        sb.append(this.clip);
        sb.append(", renderEffect=");
        sb.append(this.renderEffect);
        sb.append(", ambientShadowColor=");
        androidx.compose.foundation.f2.a(this.ambientShadowColor, sb, ", spotShadowColor=");
        androidx.compose.foundation.f2.a(this.spotShadowColor, sb, ", compositingStrategy=");
        sb.append((Object) i4.i(this.compositingStrategy));
        sb.append(')');
        return sb.toString();
    }

    public final boolean u() {
        return this.clip;
    }

    @fg.m
    public final s5 v() {
        return this.renderEffect;
    }

    public final long w() {
        return this.ambientShadowColor;
    }

    public final long x() {
        return this.spotShadowColor;
    }

    public final int z() {
        return this.compositingStrategy;
    }

    private GraphicsLayerElement(float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13, float f14, float f15, long j4, e6 e6Var, boolean z4, s5 s5Var, long j5, long j6, int i4) {
        this.scaleX = f4;
        this.scaleY = f5;
        this.alpha = f6;
        this.translationX = f7;
        this.translationY = f10;
        this.shadowElevation = f11;
        this.rotationX = f12;
        this.rotationY = f13;
        this.rotationZ = f14;
        this.cameraDistance = f15;
        this.transformOrigin = j4;
        this.shape = e6Var;
        this.clip = z4;
        this.renderEffect = s5Var;
        this.ambientShadowColor = j5;
        this.spotShadowColor = j6;
        this.compositingStrategy = i4;
    }
}
