package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.graphics.p6;
import kotlin.Metadata;

/* compiled from: RenderNodeLayer.android.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u00021+B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010\"J\u000f\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010\u000eJ\u0017\u0010&\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b&\u0010\u0011J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010\u000eJ\u000f\u0010(\u001a\u00020\u0007H\u0016¢\u0006\u0004\b(\u0010\u000eJ\"\u0010+\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020\u001cH\u0016¢\u0006\u0004\b/\u00100J1\u00101\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0016¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u001a\u00107\u001a\u00020\u00072\u0006\u00104\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\b7\u00106R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b1\u00108\u001a\u0004\b9\u0010:R$\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010;R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010<R$\u0010B\u001a\u00020\u001c2\u0006\u0010=\u001a\u00020\u001c8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010?R\u0016\u0010H\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010?R\u0018\u0010K\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010JR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020M0L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001c\u0010V\u001a\u00020T8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b7\u0010UR\u0014\u0010X\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010WR\u0016\u0010[\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010ZR\u0014\u0010^\u001a\u00020\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010]R\u0014\u0010_\u001a\u00020\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010]\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`"}, d2 = {"Landroidx/compose/ui/platform/y4;", "Landroidx/compose/ui/node/o1;", "Landroidx/compose/ui/layout/l;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/v1;", "Lkotlin/k2;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lld/l;Lld/a;)V", "r", "()V", "canvas", "o", "(Landroidx/compose/ui/graphics/v1;)V", "Landroidx/compose/ui/graphics/z5;", "scope", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/unit/d;", "density", "h", "(Landroidx/compose/ui/graphics/z5;Landroidx/compose/ui/unit/w;Landroidx/compose/ui/unit/d;)V", "Li0/f;", "position", "", "i", "(J)Z", "Landroidx/compose/ui/unit/u;", "size", "d", "(J)V", "Landroidx/compose/ui/unit/q;", "m", "invalidate", "g", "n", "destroy", "point", "inverse", "c", "(JZ)J", "Li0/d;", "rect", "j", "(Li0/d;Z)V", "b", "(Lld/l;Lld/a;)V", "Landroidx/compose/ui/graphics/y4;", "matrix", "a", "([F)V", "l", "Landroidx/compose/ui/platform/AndroidComposeView;", "p", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Lld/l;", "Lld/a;", "value", "e", "Z", "q", "(Z)V", "isDirty", "Landroidx/compose/ui/platform/k2;", "f", "Landroidx/compose/ui/platform/k2;", "outlineResolver", "isDestroyed", "drawnWithZ", "Landroidx/compose/ui/graphics/d5;", "Landroidx/compose/ui/graphics/d5;", "softwareLayerPaint", "Landroidx/compose/ui/platform/e2;", "Landroidx/compose/ui/platform/l1;", "Landroidx/compose/ui/platform/e2;", "matrixCache", "Landroidx/compose/ui/graphics/w1;", "k", "Landroidx/compose/ui/graphics/w1;", "canvasHolder", "Landroidx/compose/ui/graphics/p6;", "J", "transformOrigin", "Landroidx/compose/ui/platform/l1;", "renderNode", "", "I", "mutatedFields", "", "()J", "layerId", "ownerViewId", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@androidx.annotation.x0(23)
@kotlin.jvm.internal.r1({"SMAP\nRenderNodeLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeLayer.android.kt\nandroidx/compose/ui/platform/RenderNodeLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,413:1\n1#2:414\n*E\n"})
/* loaded from: classes.dex */
public final class y4 implements androidx.compose.ui.node.o1, androidx.compose.ui.layout.l {

    /* renamed from: p, reason: collision with root package name */
    public static final int f20220p = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AndroidComposeView ownerView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super androidx.compose.ui.graphics.v1, kotlin.k2> drawBlock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.a<kotlin.k2> invalidateParentLayer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 outlineResolver;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isDestroyed;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean drawnWithZ;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.graphics.d5 softwareLayerPaint;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e2<l1> matrixCache = new e2<>(f20221q);

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.graphics.w1 canvasHolder = new androidx.compose.ui.graphics.w1();

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l1 renderNode;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int mutatedFields;

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    private static final ld.p<l1, Matrix, kotlin.k2> f20221q = a.f20235b;

    /* compiled from: RenderNodeLayer.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/platform/l1;", "rn", "Landroid/graphics/Matrix;", "matrix", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/l1;Landroid/graphics/Matrix;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<l1, Matrix, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f20235b = new a(2);

        a() {
            super(2);
        }

        public final void a(@fg.l l1 l1Var, @fg.l Matrix matrix) {
            l1Var.B(matrix);
        }

        @Override // ld.p
        public kotlin.k2 invoke(l1 l1Var, Matrix matrix) {
            l1Var.B(matrix);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: RenderNodeLayer.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/y4$c;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(29)
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final c f20236a = new c();

        private c() {
        }

        @androidx.annotation.u
        @kd.n
        public static final long a(@fg.l View view) {
            long uniqueDrawingId;
            uniqueDrawingId = view.getUniqueDrawingId();
            return uniqueDrawingId;
        }
    }

    public y4(@fg.l AndroidComposeView androidComposeView, @fg.l ld.l<? super androidx.compose.ui.graphics.v1, kotlin.k2> lVar, @fg.l ld.a<kotlin.k2> aVar) {
        this.ownerView = androidComposeView;
        this.drawBlock = lVar;
        this.invalidateParentLayer = aVar;
        this.outlineResolver = new k2(androidComposeView.getDensity());
        p6.INSTANCE.getClass();
        this.transformOrigin = p6.f17986c;
        l1 v4Var = Build.VERSION.SDK_INT >= 29 ? new v4(androidComposeView) : new r2(androidComposeView);
        v4Var.A(true);
        v4Var.f(false);
        this.renderNode = v4Var;
    }

    private final void o(androidx.compose.ui.graphics.v1 canvas) {
        if (this.renderNode.y() || this.renderNode.getClipToBounds()) {
            this.outlineResolver.a(canvas);
        }
    }

    private final void q(boolean z4) {
        if (z4 != this.isDirty) {
            this.isDirty = z4;
            this.ownerView.i1(this, z4);
        }
    }

    private final void r() {
        if (Build.VERSION.SDK_INT >= 26) {
            k6.f19978a.a(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    @Override // androidx.compose.ui.node.o1
    public void a(@fg.l float[] matrix) {
        androidx.compose.ui.graphics.y4.u(matrix, this.matrixCache.b(this.renderNode));
    }

    @Override // androidx.compose.ui.node.o1
    public void b(@fg.l ld.l<? super androidx.compose.ui.graphics.v1, kotlin.k2> drawBlock, @fg.l ld.a<kotlin.k2> invalidateParentLayer) {
        q(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        p6.INSTANCE.getClass();
        this.transformOrigin = p6.f17986c;
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
    }

    @Override // androidx.compose.ui.node.o1
    public long c(long point, boolean inverse) {
        if (!inverse) {
            return androidx.compose.ui.graphics.y4.j(this.matrixCache.b(this.renderNode), point);
        }
        float[] a5 = this.matrixCache.a(this.renderNode);
        if (a5 != null) {
            return androidx.compose.ui.graphics.y4.j(a5, point);
        }
        i0.f.INSTANCE.getClass();
        return i0.f.f74148d;
    }

    @Override // androidx.compose.ui.node.o1
    public void d(long size) {
        int m4 = androidx.compose.ui.unit.u.m(size);
        int i4 = (int) (size & 4294967295L);
        float f4 = m4;
        this.renderNode.I(p6.k(this.transformOrigin) * f4);
        float f5 = i4;
        this.renderNode.N(p6.l(this.transformOrigin) * f5);
        l1 l1Var = this.renderNode;
        if (l1Var.h(l1Var.getLeft(), this.renderNode.getTop(), this.renderNode.getLeft() + m4, this.renderNode.getTop() + i4)) {
            this.outlineResolver.i(i0.o.a(f4, f5));
            this.renderNode.P(this.outlineResolver.d());
            invalidate();
            this.matrixCache.c();
        }
    }

    @Override // androidx.compose.ui.node.o1
    public void destroy() {
        if (this.renderNode.n()) {
            this.renderNode.i();
        }
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        q(false);
        this.ownerView.p1();
        this.ownerView.n1(this);
    }

    @Override // androidx.compose.ui.layout.l
    public long e() {
        if (Build.VERSION.SDK_INT >= 29) {
            return c.a(this.ownerView);
        }
        return -1L;
    }

    @Override // androidx.compose.ui.layout.l
    /* renamed from: f */
    public long getLayerId() {
        return this.renderNode.a();
    }

    @Override // androidx.compose.ui.node.o1
    public void g(@fg.l androidx.compose.ui.graphics.v1 canvas) {
        Canvas d5 = androidx.compose.ui.graphics.h0.d(canvas);
        if (d5.isHardwareAccelerated()) {
            n();
            boolean z4 = this.renderNode.V() > 0.0f;
            this.drawnWithZ = z4;
            if (z4) {
                canvas.t();
            }
            this.renderNode.c(d5);
            if (this.drawnWithZ) {
                canvas.D();
                return;
            }
            return;
        }
        float left = this.renderNode.getLeft();
        float top2 = this.renderNode.getTop();
        float right = this.renderNode.getRight();
        float bottom = this.renderNode.getBottom();
        if (this.renderNode.g() < 1.0f) {
            androidx.compose.ui.graphics.d5 d5Var = this.softwareLayerPaint;
            if (d5Var == null) {
                d5Var = new androidx.compose.ui.graphics.t0();
                this.softwareLayerPaint = d5Var;
            }
            d5Var.k(this.renderNode.g());
            d5.saveLayer(left, top2, right, bottom, d5Var.getInternalPaint());
        } else {
            canvas.C();
        }
        canvas.translate(left, top2);
        canvas.E(this.matrixCache.b(this.renderNode));
        o(canvas);
        ld.l<? super androidx.compose.ui.graphics.v1, kotlin.k2> lVar = this.drawBlock;
        if (lVar != null) {
            lVar.invoke(canvas);
        }
        canvas.o();
        q(false);
    }

    @Override // androidx.compose.ui.node.o1
    public void h(@fg.l androidx.compose.ui.graphics.z5 scope, @fg.l androidx.compose.ui.unit.w layoutDirection, @fg.l androidx.compose.ui.unit.d density) {
        ld.a<kotlin.k2> aVar;
        int mutatedFields = scope.getMutatedFields() | this.mutatedFields;
        int i4 = mutatedFields & 4096;
        if (i4 != 0) {
            this.transformOrigin = scope.getTransformOrigin();
        }
        boolean z4 = false;
        boolean z5 = this.renderNode.y() && !this.outlineResolver.e();
        if ((mutatedFields & 1) != 0) {
            this.renderNode.z(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            this.renderNode.Q(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            this.renderNode.k(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            this.renderNode.b0(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            this.renderNode.o(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            this.renderNode.j(scope.getShadowElevation());
        }
        if ((mutatedFields & 64) != 0) {
            this.renderNode.S(androidx.compose.ui.graphics.f2.r(scope.getAmbientShadowColor()));
        }
        if ((mutatedFields & 128) != 0) {
            this.renderNode.U(androidx.compose.ui.graphics.f2.r(scope.getSpotShadowColor()));
        }
        if ((mutatedFields & 1024) != 0) {
            this.renderNode.O(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            this.renderNode.H(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            this.renderNode.J(scope.getRotationY());
        }
        if ((mutatedFields & 2048) != 0) {
            this.renderNode.F(scope.getCameraDistance());
        }
        if (i4 != 0) {
            this.renderNode.I(p6.k(this.transformOrigin) * this.renderNode.getWidth());
            this.renderNode.N(p6.l(this.transformOrigin) * this.renderNode.getHeight());
        }
        boolean z6 = scope.getClip() && scope.getShape() != androidx.compose.ui.graphics.r5.a();
        if ((mutatedFields & 24576) != 0) {
            this.renderNode.T(z6);
            this.renderNode.f(scope.getClip() && scope.getShape() == androidx.compose.ui.graphics.r5.a());
        }
        if ((131072 & mutatedFields) != 0) {
            this.renderNode.D(scope.getRenderEffect());
        }
        if ((32768 & mutatedFields) != 0) {
            this.renderNode.r(scope.getCompositingStrategy());
        }
        boolean h4 = this.outlineResolver.h(scope.getShape(), scope.getAlpha(), z6, scope.getShadowElevation(), layoutDirection, density);
        if (this.outlineResolver.getCacheIsDirty()) {
            this.renderNode.P(this.outlineResolver.d());
        }
        if (z6 && !this.outlineResolver.e()) {
            z4 = true;
        }
        if (z5 != z4 || (z4 && h4)) {
            invalidate();
        } else {
            r();
        }
        if (!this.drawnWithZ && this.renderNode.V() > 0.0f && (aVar = this.invalidateParentLayer) != null) {
            aVar.invoke();
        }
        if ((mutatedFields & androidx.compose.ui.graphics.l4.MatrixAffectingFields) != 0) {
            this.matrixCache.c();
        }
        this.mutatedFields = scope.getMutatedFields();
    }

    @Override // androidx.compose.ui.node.o1
    public boolean i(long position) {
        float p4 = i0.f.p(position);
        float r4 = i0.f.r(position);
        if (this.renderNode.getClipToBounds()) {
            return 0.0f <= p4 && p4 < ((float) this.renderNode.getWidth()) && 0.0f <= r4 && r4 < ((float) this.renderNode.getHeight());
        }
        if (this.renderNode.y()) {
            return this.outlineResolver.f(position);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.o1
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        q(true);
    }

    @Override // androidx.compose.ui.node.o1
    public void j(@fg.l i0.d rect, boolean inverse) {
        if (!inverse) {
            androidx.compose.ui.graphics.y4.l(this.matrixCache.b(this.renderNode), rect);
            return;
        }
        float[] a5 = this.matrixCache.a(this.renderNode);
        if (a5 == null) {
            rect.k(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            androidx.compose.ui.graphics.y4.l(a5, rect);
        }
    }

    @Override // androidx.compose.ui.node.o1
    public void l(@fg.l float[] matrix) {
        float[] a5 = this.matrixCache.a(this.renderNode);
        if (a5 != null) {
            androidx.compose.ui.graphics.y4.u(matrix, a5);
        }
    }

    @Override // androidx.compose.ui.node.o1
    public void m(long position) {
        int left = this.renderNode.getLeft();
        int top2 = this.renderNode.getTop();
        int m4 = androidx.compose.ui.unit.q.m(position);
        int i4 = (int) (position & 4294967295L);
        if (left == m4 && top2 == i4) {
            return;
        }
        if (left != m4) {
            this.renderNode.E(m4 - left);
        }
        if (top2 != i4) {
            this.renderNode.l(i4 - top2);
        }
        r();
        this.matrixCache.c();
    }

    @Override // androidx.compose.ui.node.o1
    public void n() {
        if (this.isDirty || !this.renderNode.n()) {
            androidx.compose.ui.graphics.g5 c5 = (!this.renderNode.y() || this.outlineResolver.e()) ? null : this.outlineResolver.c();
            ld.l<? super androidx.compose.ui.graphics.v1, kotlin.k2> lVar = this.drawBlock;
            if (lVar != null) {
                this.renderNode.R(this.canvasHolder, c5, lVar);
            }
            q(false);
        }
    }

    @fg.l
    /* renamed from: p, reason: from getter */
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }
}
