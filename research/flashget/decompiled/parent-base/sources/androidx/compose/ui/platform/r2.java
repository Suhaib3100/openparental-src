package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.graphics.i4;
import kotlin.Metadata;

/* compiled from: RenderNodeApi23.android.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b3\b\u0001\u0018\u0000 o2\u00020\u0001:\u0001:B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\u001fJ5\u0010(\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00060%H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b.\u0010-J\u0017\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u0010H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b9\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010>R\u001c\u0010A\u001a\u00020?8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b1\u0010@R\"\u0010\u0017\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bB\u0010@\u001a\u0004\bB\u0010\u000f\"\u0004\bC\u0010\u001fR\"\u0010\u0018\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bD\u0010@\u001a\u0004\bE\u0010\u000f\"\u0004\bF\u0010\u001fR\"\u0010\u0019\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bG\u0010@\u001a\u0004\bD\u0010\u000f\"\u0004\bH\u0010\u001fR\"\u0010\u001a\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bI\u0010@\u001a\u0004\bJ\u0010\u000f\"\u0004\bK\u0010\u001fR$\u0010R\u001a\u0004\u0018\u00010L8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR*\u0010W\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\u00108\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b9\u0010T\u001a\u0004\bU\u0010\u0012\"\u0004\bG\u0010VR\u0014\u0010Z\u001a\u00020X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010YR\u0014\u0010\\\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u000fR\u0014\u0010^\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010\u000fR$\u0010d\u001a\u00020_2\u0006\u0010S\u001a\u00020_8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010g\u001a\u00020_2\u0006\u0010S\u001a\u00020_8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\be\u0010a\"\u0004\bf\u0010cR$\u0010j\u001a\u00020_2\u0006\u0010S\u001a\u00020_8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bh\u0010a\"\u0004\bi\u0010cR$\u0010m\u001a\u00020_2\u0006\u0010S\u001a\u00020_8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bk\u0010a\"\u0004\bl\u0010cR$\u0010p\u001a\u00020_2\u0006\u0010S\u001a\u00020_8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bn\u0010a\"\u0004\bo\u0010cR$\u0010s\u001a\u00020\r2\u0006\u0010S\u001a\u00020\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bq\u0010\u000f\"\u0004\br\u0010\u001fR$\u0010v\u001a\u00020\r2\u0006\u0010S\u001a\u00020\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bt\u0010\u000f\"\u0004\bu\u0010\u001fR$\u0010y\u001a\u00020_2\u0006\u0010S\u001a\u00020_8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bw\u0010a\"\u0004\bx\u0010cR$\u0010|\u001a\u00020_2\u0006\u0010S\u001a\u00020_8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bz\u0010a\"\u0004\b{\u0010cR$\u0010\u007f\u001a\u00020_2\u0006\u0010S\u001a\u00020_8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b}\u0010a\"\u0004\b~\u0010cR'\u0010\u0082\u0001\u001a\u00020_2\u0006\u0010S\u001a\u00020_8V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0080\u0001\u0010a\"\u0005\b\u0081\u0001\u0010cR&\u0010\u0084\u0001\u001a\u00020_2\u0006\u0010S\u001a\u00020_8V@VX\u0096\u000e¢\u0006\r\u001a\u0005\b\u0083\u0001\u0010a\"\u0004\b@\u0010cR'\u0010\u0087\u0001\u001a\u00020_2\u0006\u0010S\u001a\u00020_8V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0085\u0001\u0010a\"\u0005\b\u0086\u0001\u0010cR'\u0010\u008a\u0001\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0088\u0001\u0010\u0012\"\u0005\b\u0089\u0001\u0010VR&\u0010\u008c\u0001\u001a\u00020_2\u0006\u0010S\u001a\u00020_8V@VX\u0096\u000e¢\u0006\r\u001a\u0004\bI\u0010a\"\u0005\b\u008b\u0001\u0010cR-\u0010\u008f\u0001\u001a\u00020?2\u0006\u0010S\u001a\u00020?8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u001a\u0005\b\u008d\u0001\u0010\u000f\"\u0005\b\u008e\u0001\u0010\u001fR\u0016\u0010\u0091\u0001\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0092\u0001"}, d2 = {"Landroidx/compose/ui/platform/r2;", "Landroidx/compose/ui/platform/l1;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Lkotlin/k2;", "c0", "()V", "Landroid/view/RenderNode;", "renderNode", "l0", "(Landroid/view/RenderNode;)V", "", "d0", "()I", "", "g0", "()Z", "Landroid/graphics/Outline;", "outline", "P", "(Landroid/graphics/Outline;)V", "left", "top", "right", "bottom", "h", "(IIII)Z", "offset", "E", "(I)V", "l", "Landroidx/compose/ui/graphics/w1;", "canvasHolder", "Landroidx/compose/ui/graphics/g5;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/v1;", "drawBlock", "R", "(Landroidx/compose/ui/graphics/w1;Landroidx/compose/ui/graphics/g5;Lld/l;)V", "Landroid/graphics/Matrix;", "matrix", "B", "(Landroid/graphics/Matrix;)V", "b", "Landroid/graphics/Canvas;", "canvas", "c", "(Landroid/graphics/Canvas;)V", "hasOverlappingRendering", "A", "(Z)Z", "Landroidx/compose/ui/platform/m1;", "w", "()Landroidx/compose/ui/platform/m1;", "i", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "e0", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/RenderNode;", "Landroidx/compose/ui/graphics/i4;", "I", "internalCompositingStrategy", "d", "i0", "e", "u", "k0", "f", "j0", "g", "G", "h0", "Landroidx/compose/ui/graphics/s5;", "Landroidx/compose/ui/graphics/s5;", "m", "()Landroidx/compose/ui/graphics/s5;", "D", "(Landroidx/compose/ui/graphics/s5;)V", "renderEffect", "value", "Z", "t", "(Z)V", "clipToBounds", "", "()J", "uniqueId", "getWidth", "width", "getHeight", "height", "", "K", "()F", "z", "(F)V", "scaleX", "f0", "Q", "scaleY", "Y", "b0", "translationX", "X", "o", "translationY", "V", "j", "elevation", "p", "S", "ambientShadowColor", "L", "U", "spotShadowColor", "x", "O", "rotationZ", "a0", "H", "rotationX", "s", "J", "rotationY", "C", "F", "cameraDistance", "q", "pivotX", "v", "N", "pivotY", "y", "T", "clipToOutline", "k", "alpha", "M", "r", "compositingStrategy", "n", "hasDisplayList", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@androidx.annotation.x0(23)
@kotlin.jvm.internal.r1({"SMAP\nRenderNodeApi23.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,417:1\n47#2,5:418\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n*L\n275#1:418,5\n*E\n"})
/* loaded from: classes.dex */
public final class r2 implements l1 {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: k, reason: collision with root package name */
    public static final int f20094k = 8;

    /* renamed from: l, reason: collision with root package name */
    private static boolean f20095l = false;

    /* renamed from: m, reason: collision with root package name */
    private static boolean f20096m = true;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AndroidComposeView ownerView;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final RenderNode renderNode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int internalCompositingStrategy;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int left;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int top;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int right;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int bottom;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.graphics.s5 renderEffect;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    /* compiled from: RenderNodeApi23.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/r2$a;", "", "<init>", "()V", "", "testFailCreateRenderNode", "Z", "a", "()Z", "b", "(Z)V", "needToValidateAccess", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.r2$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final boolean a() {
            return r2.f20095l;
        }

        public final void b(boolean z4) {
            r2.f20095l = z4;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public r2(@fg.l AndroidComposeView androidComposeView) {
        this.ownerView = androidComposeView;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        this.renderNode = create;
        this.internalCompositingStrategy = androidx.compose.ui.graphics.i4.INSTANCE.a();
        if (f20096m) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            l0(create);
            c0();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            f20096m = false;
        }
        if (f20095l) {
            throw new NoClassDefFoundError();
        }
    }

    private final void c0() {
        b5.f19778a.a(this.renderNode);
    }

    private final void l0(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            c5 c5Var = c5.f19789a;
            c5Var.c(renderNode, c5Var.a(renderNode));
            c5Var.d(renderNode, c5Var.b(renderNode));
        }
    }

    @Override // androidx.compose.ui.platform.l1
    public boolean A(boolean hasOverlappingRendering) {
        return this.renderNode.setHasOverlappingRendering(hasOverlappingRendering);
    }

    @Override // androidx.compose.ui.platform.l1
    public void B(@fg.l Matrix matrix) {
        this.renderNode.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.l1
    public float C() {
        return -this.renderNode.getCameraDistance();
    }

    @Override // androidx.compose.ui.platform.l1
    public void D(@fg.m androidx.compose.ui.graphics.s5 s5Var) {
        this.renderEffect = s5Var;
    }

    @Override // androidx.compose.ui.platform.l1
    public void E(int offset) {
        this.left += offset;
        this.right += offset;
        this.renderNode.offsetLeftAndRight(offset);
    }

    @Override // androidx.compose.ui.platform.l1
    public void F(float f4) {
        this.renderNode.setCameraDistance(-f4);
    }

    @Override // androidx.compose.ui.platform.l1
    /* renamed from: G, reason: from getter */
    public int getBottom() {
        return this.bottom;
    }

    @Override // androidx.compose.ui.platform.l1
    public void H(float f4) {
        this.renderNode.setRotationX(f4);
    }

    @Override // androidx.compose.ui.platform.l1
    public void I(float f4) {
        this.renderNode.setPivotX(f4);
    }

    @Override // androidx.compose.ui.platform.l1
    public void J(float f4) {
        this.renderNode.setRotationY(f4);
    }

    @Override // androidx.compose.ui.platform.l1
    public float K() {
        return this.renderNode.getScaleX();
    }

    @Override // androidx.compose.ui.platform.l1
    public int L() {
        return Build.VERSION.SDK_INT >= 28 ? c5.f19789a.b(this.renderNode) : androidx.core.view.x1.f27484y;
    }

    @Override // androidx.compose.ui.platform.l1
    /* renamed from: M, reason: from getter */
    public int getInternalCompositingStrategy() {
        return this.internalCompositingStrategy;
    }

    @Override // androidx.compose.ui.platform.l1
    public void N(float f4) {
        this.renderNode.setPivotY(f4);
    }

    @Override // androidx.compose.ui.platform.l1
    public void O(float f4) {
        this.renderNode.setRotation(f4);
    }

    @Override // androidx.compose.ui.platform.l1
    public void P(@fg.m Outline outline) {
        this.renderNode.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.l1
    public void Q(float f4) {
        this.renderNode.setScaleY(f4);
    }

    @Override // androidx.compose.ui.platform.l1
    public void R(@fg.l androidx.compose.ui.graphics.w1 canvasHolder, @fg.m androidx.compose.ui.graphics.g5 clipPath, @fg.l ld.l<? super androidx.compose.ui.graphics.v1, kotlin.k2> drawBlock) {
        DisplayListCanvas start = this.renderNode.start(getWidth(), getHeight());
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().U((Canvas) start);
        androidx.compose.ui.graphics.g0 androidCanvas = canvasHolder.getAndroidCanvas();
        if (clipPath != null) {
            androidCanvas.C();
            androidx.compose.ui.graphics.v1.q(androidCanvas, clipPath, 0, 2, null);
        }
        drawBlock.invoke(androidCanvas);
        if (clipPath != null) {
            androidCanvas.o();
        }
        canvasHolder.getAndroidCanvas().U(internalCanvas);
        this.renderNode.end(start);
    }

    @Override // androidx.compose.ui.platform.l1
    public void S(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            c5.f19789a.c(this.renderNode, i4);
        }
    }

    @Override // androidx.compose.ui.platform.l1
    public void T(boolean z4) {
        this.renderNode.setClipToOutline(z4);
    }

    @Override // androidx.compose.ui.platform.l1
    public void U(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            c5.f19789a.d(this.renderNode, i4);
        }
    }

    @Override // androidx.compose.ui.platform.l1
    public float V() {
        return this.renderNode.getElevation();
    }

    @Override // androidx.compose.ui.platform.l1
    public float X() {
        return this.renderNode.getTranslationY();
    }

    @Override // androidx.compose.ui.platform.l1
    public float Y() {
        return this.renderNode.getTranslationX();
    }

    @Override // androidx.compose.ui.platform.l1
    public long a() {
        return 0L;
    }

    @Override // androidx.compose.ui.platform.l1
    public float a0() {
        return this.renderNode.getRotationX();
    }

    @Override // androidx.compose.ui.platform.l1
    public void b(@fg.l Matrix matrix) {
        this.renderNode.getInverseMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.l1
    public void b0(float f4) {
        this.renderNode.setTranslationX(f4);
    }

    @Override // androidx.compose.ui.platform.l1
    public void c(@fg.l Canvas canvas) {
        kotlin.jvm.internal.l0.n(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.l1
    /* renamed from: d, reason: from getter */
    public int getLeft() {
        return this.left;
    }

    public final int d0() {
        int i4 = this.internalCompositingStrategy;
        androidx.compose.ui.graphics.i4.INSTANCE.getClass();
        return androidx.compose.ui.graphics.i4.g(i4, androidx.compose.ui.graphics.i4.f17853d) ? 2 : 0;
    }

    @Override // androidx.compose.ui.platform.l1
    /* renamed from: e, reason: from getter */
    public int getRight() {
        return this.right;
    }

    @fg.l
    /* renamed from: e0, reason: from getter */
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.ui.platform.l1
    public void f(boolean z4) {
        this.clipToBounds = z4;
        this.renderNode.setClipToBounds(z4);
    }

    @Override // androidx.compose.ui.platform.l1
    public float f0() {
        return this.renderNode.getScaleY();
    }

    @Override // androidx.compose.ui.platform.l1
    public float g() {
        return this.renderNode.getAlpha();
    }

    public final boolean g0() {
        return this.renderNode.hasOverlappingRendering();
    }

    @Override // androidx.compose.ui.platform.l1
    public int getHeight() {
        return this.bottom - this.top;
    }

    @Override // androidx.compose.ui.platform.l1
    public int getWidth() {
        return this.right - this.left;
    }

    @Override // androidx.compose.ui.platform.l1
    public boolean h(int left, int top2, int right, int bottom) {
        this.left = left;
        this.top = top2;
        this.right = right;
        this.bottom = bottom;
        return this.renderNode.setLeftTopRightBottom(left, top2, right, bottom);
    }

    public void h0(int i4) {
        this.bottom = i4;
    }

    @Override // androidx.compose.ui.platform.l1
    public void i() {
        c0();
    }

    public void i0(int i4) {
        this.left = i4;
    }

    @Override // androidx.compose.ui.platform.l1
    public void j(float f4) {
        this.renderNode.setElevation(f4);
    }

    public void j0(int i4) {
        this.right = i4;
    }

    @Override // androidx.compose.ui.platform.l1
    public void k(float f4) {
        this.renderNode.setAlpha(f4);
    }

    public void k0(int i4) {
        this.top = i4;
    }

    @Override // androidx.compose.ui.platform.l1
    public void l(int offset) {
        this.top += offset;
        this.bottom += offset;
        this.renderNode.offsetTopAndBottom(offset);
    }

    @Override // androidx.compose.ui.platform.l1
    @fg.m
    /* renamed from: m, reason: from getter */
    public androidx.compose.ui.graphics.s5 getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.platform.l1
    public boolean n() {
        return this.renderNode.isValid();
    }

    @Override // androidx.compose.ui.platform.l1
    public void o(float f4) {
        this.renderNode.setTranslationY(f4);
    }

    @Override // androidx.compose.ui.platform.l1
    public int p() {
        return Build.VERSION.SDK_INT >= 28 ? c5.f19789a.a(this.renderNode) : androidx.core.view.x1.f27484y;
    }

    @Override // androidx.compose.ui.platform.l1
    public float q() {
        return this.renderNode.getPivotX();
    }

    @Override // androidx.compose.ui.platform.l1
    public void r(int i4) {
        i4.Companion companion = androidx.compose.ui.graphics.i4.INSTANCE;
        if (androidx.compose.ui.graphics.i4.g(i4, companion.c())) {
            this.renderNode.setLayerType(2);
            this.renderNode.setHasOverlappingRendering(true);
        } else if (androidx.compose.ui.graphics.i4.g(i4, companion.b())) {
            this.renderNode.setLayerType(0);
            this.renderNode.setHasOverlappingRendering(false);
        } else {
            this.renderNode.setLayerType(0);
            this.renderNode.setHasOverlappingRendering(true);
        }
        this.internalCompositingStrategy = i4;
    }

    @Override // androidx.compose.ui.platform.l1
    public float s() {
        return this.renderNode.getRotationY();
    }

    @Override // androidx.compose.ui.platform.l1
    /* renamed from: t, reason: from getter */
    public boolean getClipToBounds() {
        return this.clipToBounds;
    }

    @Override // androidx.compose.ui.platform.l1
    /* renamed from: u, reason: from getter */
    public int getTop() {
        return this.top;
    }

    @Override // androidx.compose.ui.platform.l1
    public float v() {
        return this.renderNode.getPivotY();
    }

    @Override // androidx.compose.ui.platform.l1
    @fg.l
    public m1 w() {
        return new m1(0L, 0, 0, 0, 0, 0, 0, this.renderNode.getScaleX(), this.renderNode.getScaleY(), this.renderNode.getTranslationX(), this.renderNode.getTranslationY(), this.renderNode.getElevation(), p(), L(), this.renderNode.getRotation(), this.renderNode.getRotationX(), this.renderNode.getRotationY(), this.renderNode.getCameraDistance(), this.renderNode.getPivotX(), this.renderNode.getPivotY(), this.renderNode.getClipToOutline(), this.clipToBounds, this.renderNode.getAlpha(), this.renderEffect, this.internalCompositingStrategy, null);
    }

    @Override // androidx.compose.ui.platform.l1
    public float x() {
        return this.renderNode.getRotation();
    }

    @Override // androidx.compose.ui.platform.l1
    public boolean y() {
        return this.renderNode.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.l1
    public void z(float f4) {
        this.renderNode.setScaleX(f4);
    }
}
