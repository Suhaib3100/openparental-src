package androidx.compose.ui.graphics;

import androidx.compose.ui.layout.i1;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: GraphicsLayerModifier.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0093\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010&\u001a\u00020%*\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\"\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R\"\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010,\u001a\u0004\b8\u0010.\"\u0004\b9\u00100R\"\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010,\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R\"\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010,\u001a\u0004\b>\u0010.\"\u0004\b?\u00100R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010,\u001a\u0004\bA\u0010.\"\u0004\bB\u00100R\"\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010,\u001a\u0004\b7\u0010.\"\u0004\bD\u00100R\"\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010,\u001a\u0004\bE\u0010.\"\u0004\bF\u00100R\"\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010,\u001a\u0004\bH\u0010.\"\u0004\b,\u00100R(\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b/\u0010D\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R(\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\\\u0010D\u001a\u0004\b^\u0010J\"\u0004\b_\u0010LR(\u0010\u0018\u001a\u00020\u00168\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b`\u0010D\u001a\u0004\ba\u0010J\"\u0004\bb\u0010LR(\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b,\u0010c\u001a\u0004\bd\u0010e\"\u0004\b4\u0010fR'\u0010l\u001a\u0013\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020\u001d0g¢\u0006\u0002\bi8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010n\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010V\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006o"}, d2 = {"Landroidx/compose/ui/graphics/f6;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/q$d;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/p6;", "transformOrigin", "Landroidx/compose/ui/graphics/e6;", "shape", "", "clip", "Landroidx/compose/ui/graphics/s5;", "renderEffect", "Landroidx/compose/ui/graphics/d2;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/i4;", "compositingStrategy", "<init>", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/e6;ZLandroidx/compose/ui/graphics/s5;JJILkotlin/jvm/internal/w;)V", "Lkotlin/k2;", "z7", "()V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "", "toString", "()Ljava/lang/String;", "p", "F", "K", "()F", "z", "(F)V", "q", "f0", "Q", "r", "g", "k", "s", "Y", "b0", "t", "X", "o", "u", "o6", "t3", "v", "a0", "H", "w", "J", "x", "O", "y", "C", "j2", "()J", "r2", "(J)V", "A", "Landroidx/compose/ui/graphics/e6;", "K4", "()Landroidx/compose/ui/graphics/e6;", "h5", "(Landroidx/compose/ui/graphics/e6;)V", "B", "Z", "j", "()Z", "g2", "(Z)V", "Landroidx/compose/ui/graphics/s5;", "m", "()Landroidx/compose/ui/graphics/s5;", "D", "(Landroidx/compose/ui/graphics/s5;)V", "o1", "T1", "E", "Q1", "t2", "I", "M", "()I", "(I)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/q4;", "Lkotlin/u;", "G", "Lld/l;", "layerBlock", "b7", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nGraphicsLayerModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/SimpleGraphicsLayerModifier\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,672:1\n72#2:673\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/SimpleGraphicsLayerModifier\n*L\n636#1:673\n*E\n"})
/* loaded from: classes.dex */
final class f6 extends q.d implements androidx.compose.ui.node.c0 {

    /* renamed from: A, reason: from kotlin metadata */
    @fg.l
    private e6 shape;

    /* renamed from: B, reason: from kotlin metadata */
    private boolean clip;

    /* renamed from: C, reason: from kotlin metadata */
    @fg.m
    private s5 renderEffect;

    /* renamed from: D, reason: from kotlin metadata */
    private long ambientShadowColor;

    /* renamed from: E, reason: from kotlin metadata */
    private long spotShadowColor;

    /* renamed from: F, reason: from kotlin metadata */
    private int compositingStrategy;

    /* renamed from: G, reason: from kotlin metadata */
    @fg.l
    private ld.l<? super q4, kotlin.k2> layerBlock;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float scaleX;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float scaleY;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private float shadowElevation;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private float cameraDistance;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin;

    /* compiled from: GraphicsLayerModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/q4;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/q4;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<q4, kotlin.k2> {
        a() {
            super(1);
        }

        public final void a(@fg.l q4 q4Var) {
            q4Var.z(f6.this.getScaleX());
            q4Var.Q(f6.this.getScaleY());
            q4Var.k(f6.this.getAlpha());
            q4Var.b0(f6.this.getTranslationX());
            q4Var.o(f6.this.getTranslationY());
            q4Var.t3(f6.this.getShadowElevation());
            q4Var.H(f6.this.getRotationX());
            q4Var.J(f6.this.getRotationY());
            q4Var.O(f6.this.getRotationZ());
            q4Var.F(f6.this.getCameraDistance());
            q4Var.r2(f6.this.getTransformOrigin());
            q4Var.h5(f6.this.getShape());
            q4Var.g2(f6.this.getClip());
            q4Var.D(f6.this.getRenderEffect());
            q4Var.T1(f6.this.getAmbientShadowColor());
            q4Var.t2(f6.this.getSpotShadowColor());
            q4Var.r(f6.this.getCompositingStrategy());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(q4 q4Var) {
            a(q4Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: GraphicsLayerModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f17831b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f6 f17832c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.layout.i1 i1Var, f6 f6Var) {
            super(1);
            this.f17831b = i1Var;
            this.f17832c = f6Var;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.u(aVar, this.f17831b, 0, 0, 0.0f, this.f17832c.layerBlock, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    public /* synthetic */ f6(float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13, float f14, float f15, long j4, e6 e6Var, boolean z4, s5 s5Var, long j5, long j6, int i4, kotlin.jvm.internal.w wVar) {
        this(f4, f5, f6, f7, f10, f11, f12, f13, f14, f15, j4, e6Var, z4, s5Var, j5, j6, i4);
    }

    /* renamed from: C, reason: from getter */
    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final void D(@fg.m s5 s5Var) {
        this.renderEffect = s5Var;
    }

    public final void F(float f4) {
        this.cameraDistance = f4;
    }

    public final void H(float f4) {
        this.rotationX = f4;
    }

    public final void J(float f4) {
        this.rotationY = f4;
    }

    /* renamed from: K, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    @fg.l
    /* renamed from: K4, reason: from getter */
    public final e6 getShape() {
        return this.shape;
    }

    /* renamed from: M, reason: from getter */
    public final int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    public final void O(float f4) {
        this.rotationZ = f4;
    }

    public final void Q(float f4) {
        this.scaleY = f4;
    }

    /* renamed from: Q1, reason: from getter */
    public final long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    public final void T1(long j4) {
        this.ambientShadowColor = j4;
    }

    /* renamed from: X, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    /* renamed from: Y, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    /* renamed from: a0, reason: from getter */
    public final float getRotationX() {
        return this.rotationX;
    }

    public final void b0(float f4) {
        this.translationX = f4;
    }

    @Override // androidx.compose.ui.q.d
    public boolean b7() {
        return false;
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        androidx.compose.ui.layout.i1 m02 = l0Var.m0(j4);
        return androidx.compose.ui.layout.o0.x2(o0Var, m02.getWidth(), m02.getHeight(), null, new b(m02, this), 4, null);
    }

    /* renamed from: f0, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    /* renamed from: g, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    public final void g2(boolean z4) {
        this.clip = z4;
    }

    public final void h5(@fg.l e6 e6Var) {
        this.shape = e6Var;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: j2, reason: from getter */
    public final long getTransformOrigin() {
        return this.transformOrigin;
    }

    public final void k(float f4) {
        this.alpha = f4;
    }

    @fg.m
    /* renamed from: m, reason: from getter */
    public final s5 getRenderEffect() {
        return this.renderEffect;
    }

    public final void o(float f4) {
        this.translationY = f4;
    }

    /* renamed from: o1, reason: from getter */
    public final long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    /* renamed from: o6, reason: from getter */
    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    public final void r(int i4) {
        this.compositingStrategy = i4;
    }

    public final void r2(long j4) {
        this.transformOrigin = j4;
    }

    /* renamed from: s, reason: from getter */
    public final float getRotationY() {
        return this.rotationY;
    }

    public final void t2(long j4) {
        this.spotShadowColor = j4;
    }

    public final void t3(float f4) {
        this.shadowElevation = f4;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.scaleX);
        sb.append(", scaleY=");
        sb.append(this.scaleY);
        sb.append(", alpha = ");
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

    /* renamed from: x, reason: from getter */
    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final void z(float f4) {
        this.scaleX = f4;
    }

    public final void z7() {
        androidx.compose.ui.node.e1 wrapped = androidx.compose.ui.node.k.m(this, 2).getWrapped();
        if (wrapped != null) {
            wrapped.o5(this.layerBlock, true);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f6(float r23, float r24, float r25, float r26, float r27, float r28, float r29, float r30, float r31, float r32, long r33, androidx.compose.ui.graphics.e6 r35, boolean r36, androidx.compose.ui.graphics.s5 r37, long r38, long r40, int r42, int r43, kotlin.jvm.internal.w r44) {
        /*
            r22 = this;
            r0 = 65536(0x10000, float:9.1835E-41)
            r0 = r43 & r0
            if (r0 == 0) goto L12
            androidx.compose.ui.graphics.i4$a r0 = androidx.compose.ui.graphics.i4.INSTANCE
            r0.getClass()
            int r0 = androidx.compose.ui.graphics.i4.a()
            r21 = r0
            goto L14
        L12:
            r21 = r42
        L14:
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r14 = r35
            r15 = r36
            r16 = r37
            r17 = r38
            r19 = r40
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r19, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.f6.<init>(float, float, float, float, float, float, float, float, float, float, long, androidx.compose.ui.graphics.e6, boolean, androidx.compose.ui.graphics.s5, long, long, int, int, kotlin.jvm.internal.w):void");
    }

    private f6(float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13, float f14, float f15, long j4, e6 e6Var, boolean z4, s5 s5Var, long j5, long j6, int i4) {
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
        this.layerBlock = new a();
    }
}
