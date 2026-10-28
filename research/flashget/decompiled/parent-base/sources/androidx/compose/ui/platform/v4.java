package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.i4;
import kotlin.Metadata;

/* compiled from: RenderNodeApi29.android.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b>\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J5\u0010!\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\f0\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010&J\u0017\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\fH\u0016¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010<R\u001c\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010CR\u0014\u0010\u0010\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010ER\u0014\u0010\u0011\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010ER\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010ER\u0014\u0010\u0013\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010ER\u0014\u0010J\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010ER\u0014\u0010L\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010ER$\u0010S\u001a\u00020M2\u0006\u0010N\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010V\u001a\u00020M2\u0006\u0010N\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bT\u0010P\"\u0004\bU\u0010RR$\u0010Y\u001a\u00020M2\u0006\u0010N\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bW\u0010P\"\u0004\bX\u0010RR$\u0010\\\u001a\u00020M2\u0006\u0010N\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bZ\u0010P\"\u0004\b[\u0010RR$\u0010_\u001a\u00020M2\u0006\u0010N\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b]\u0010P\"\u0004\b^\u0010RR$\u0010b\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020\u000f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b`\u0010E\"\u0004\ba\u0010\u0018R$\u0010e\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020\u000f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bc\u0010E\"\u0004\bd\u0010\u0018R$\u0010h\u001a\u00020M2\u0006\u0010N\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bf\u0010P\"\u0004\bg\u0010RR$\u0010k\u001a\u00020M2\u0006\u0010N\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bi\u0010P\"\u0004\bj\u0010RR$\u0010n\u001a\u00020M2\u0006\u0010N\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bl\u0010P\"\u0004\bm\u0010RR$\u0010q\u001a\u00020M2\u0006\u0010N\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bo\u0010P\"\u0004\bp\u0010RR$\u0010s\u001a\u00020M2\u0006\u0010N\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\br\u0010P\"\u0004\b@\u0010RR$\u0010v\u001a\u00020M2\u0006\u0010N\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bt\u0010P\"\u0004\bu\u0010RR$\u0010z\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bw\u0010\b\"\u0004\bx\u0010yR$\u0010}\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b{\u0010\b\"\u0004\b|\u0010yR%\u0010\u0080\u0001\u001a\u00020M2\u0006\u0010N\u001a\u00020M8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b~\u0010P\"\u0004\b\u007f\u0010RR-\u0010\u0085\u0001\u001a\u0004\u0018\u00010;2\b\u0010N\u001a\u0004\u0018\u00010;8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R-\u0010\u0088\u0001\u001a\u00020>2\u0006\u0010N\u001a\u00020>8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u001a\u0005\b\u0086\u0001\u0010E\"\u0005\b\u0087\u0001\u0010\u0018R\u0016\u0010\u008a\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008b\u0001"}, d2 = {"Landroidx/compose/ui/platform/v4;", "Landroidx/compose/ui/platform/l1;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "", "c0", "()Z", "Z", "Landroid/graphics/Outline;", "outline", "Lkotlin/k2;", "P", "(Landroid/graphics/Outline;)V", "", "left", "top", "right", "bottom", "h", "(IIII)Z", "offset", "E", "(I)V", "l", "Landroidx/compose/ui/graphics/w1;", "canvasHolder", "Landroidx/compose/ui/graphics/g5;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/v1;", "drawBlock", "R", "(Landroidx/compose/ui/graphics/w1;Landroidx/compose/ui/graphics/g5;Lld/l;)V", "Landroid/graphics/Matrix;", "matrix", "B", "(Landroid/graphics/Matrix;)V", "b", "Landroid/graphics/Canvas;", "canvas", "c", "(Landroid/graphics/Canvas;)V", "hasOverlappingRendering", "A", "(Z)Z", "Landroidx/compose/ui/platform/m1;", "w", "()Landroidx/compose/ui/platform/m1;", "i", "()V", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "W", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/graphics/RenderNode;", "Landroid/graphics/RenderNode;", "renderNode", "Landroidx/compose/ui/graphics/s5;", "Landroidx/compose/ui/graphics/s5;", "internalRenderEffect", "Landroidx/compose/ui/graphics/i4;", "d", "I", "internalCompositingStrategy", "", "()J", "uniqueId", "()I", "u", "e", "G", "getWidth", "width", "getHeight", "height", "", "value", "K", "()F", "z", "(F)V", "scaleX", "f0", "Q", "scaleY", "Y", "b0", "translationX", "X", "o", "translationY", "V", "j", "elevation", "p", "S", "ambientShadowColor", "L", "U", "spotShadowColor", "x", "O", "rotationZ", "a0", "H", "rotationX", "s", "J", "rotationY", "C", "F", "cameraDistance", "q", "pivotX", "v", "N", "pivotY", "y", "T", "(Z)V", "clipToOutline", "t", "f", "clipToBounds", "g", "k", "alpha", "m", "()Landroidx/compose/ui/graphics/s5;", "D", "(Landroidx/compose/ui/graphics/s5;)V", "renderEffect", "M", "r", "compositingStrategy", "n", "hasDisplayList", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@androidx.annotation.x0(29)
@kotlin.jvm.internal.r1({"SMAP\nRenderNodeApi29.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,274:1\n47#2,5:275\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n*L\n204#1:275,5\n*E\n"})
/* loaded from: classes.dex */
public final class v4 implements l1 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f20191e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AndroidComposeView ownerView;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final RenderNode renderNode = p4.a("Compose");

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.graphics.s5 internalRenderEffect;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int internalCompositingStrategy;

    public v4(@fg.l AndroidComposeView androidComposeView) {
        this.ownerView = androidComposeView;
        androidx.compose.ui.graphics.i4.INSTANCE.getClass();
        this.internalCompositingStrategy = androidx.compose.ui.graphics.i4.f17852c;
    }

    @Override // androidx.compose.ui.platform.l1
    public boolean A(boolean hasOverlappingRendering) {
        boolean hasOverlappingRendering2;
        hasOverlappingRendering2 = this.renderNode.setHasOverlappingRendering(hasOverlappingRendering);
        return hasOverlappingRendering2;
    }

    @Override // androidx.compose.ui.platform.l1
    public void B(@fg.l Matrix matrix) {
        this.renderNode.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.l1
    public float C() {
        float cameraDistance;
        cameraDistance = this.renderNode.getCameraDistance();
        return cameraDistance;
    }

    @Override // androidx.compose.ui.platform.l1
    public void D(@fg.m androidx.compose.ui.graphics.s5 s5Var) {
        this.internalRenderEffect = s5Var;
        if (Build.VERSION.SDK_INT >= 31) {
            x4.f20211a.a(this.renderNode, s5Var);
        }
    }

    @Override // androidx.compose.ui.platform.l1
    public void E(int offset) {
        this.renderNode.offsetLeftAndRight(offset);
    }

    @Override // androidx.compose.ui.platform.l1
    public void F(float f4) {
        this.renderNode.setCameraDistance(f4);
    }

    @Override // androidx.compose.ui.platform.l1
    /* renamed from: G */
    public int getBottom() {
        int bottom;
        bottom = this.renderNode.getBottom();
        return bottom;
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
        float scaleX;
        scaleX = this.renderNode.getScaleX();
        return scaleX;
    }

    @Override // androidx.compose.ui.platform.l1
    public int L() {
        int spotShadowColor;
        spotShadowColor = this.renderNode.getSpotShadowColor();
        return spotShadowColor;
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
        this.renderNode.setRotationZ(f4);
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
        RecordingCanvas beginRecording;
        beginRecording = this.renderNode.beginRecording();
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().U(beginRecording);
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
        this.renderNode.endRecording();
    }

    @Override // androidx.compose.ui.platform.l1
    public void S(int i4) {
        this.renderNode.setAmbientShadowColor(i4);
    }

    @Override // androidx.compose.ui.platform.l1
    public void T(boolean z4) {
        this.renderNode.setClipToOutline(z4);
    }

    @Override // androidx.compose.ui.platform.l1
    public void U(int i4) {
        this.renderNode.setSpotShadowColor(i4);
    }

    @Override // androidx.compose.ui.platform.l1
    public float V() {
        float elevation;
        elevation = this.renderNode.getElevation();
        return elevation;
    }

    @fg.l
    /* renamed from: W, reason: from getter */
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override // androidx.compose.ui.platform.l1
    public float X() {
        float translationY;
        translationY = this.renderNode.getTranslationY();
        return translationY;
    }

    @Override // androidx.compose.ui.platform.l1
    public float Y() {
        float translationX;
        translationX = this.renderNode.getTranslationX();
        return translationX;
    }

    public final boolean Z() {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.renderNode.hasOverlappingRendering();
        return hasOverlappingRendering;
    }

    @Override // androidx.compose.ui.platform.l1
    public long a() {
        long uniqueId;
        uniqueId = this.renderNode.getUniqueId();
        return uniqueId;
    }

    @Override // androidx.compose.ui.platform.l1
    public float a0() {
        float rotationX;
        rotationX = this.renderNode.getRotationX();
        return rotationX;
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
        canvas.drawRenderNode(this.renderNode);
    }

    public final boolean c0() {
        boolean useCompositingLayer;
        useCompositingLayer = this.renderNode.getUseCompositingLayer();
        return useCompositingLayer;
    }

    @Override // androidx.compose.ui.platform.l1
    /* renamed from: d */
    public int getLeft() {
        int left;
        left = this.renderNode.getLeft();
        return left;
    }

    @Override // androidx.compose.ui.platform.l1
    /* renamed from: e */
    public int getRight() {
        int right;
        right = this.renderNode.getRight();
        return right;
    }

    @Override // androidx.compose.ui.platform.l1
    public void f(boolean z4) {
        this.renderNode.setClipToBounds(z4);
    }

    @Override // androidx.compose.ui.platform.l1
    public float f0() {
        float scaleY;
        scaleY = this.renderNode.getScaleY();
        return scaleY;
    }

    @Override // androidx.compose.ui.platform.l1
    public float g() {
        float alpha;
        alpha = this.renderNode.getAlpha();
        return alpha;
    }

    @Override // androidx.compose.ui.platform.l1
    public int getHeight() {
        int height;
        height = this.renderNode.getHeight();
        return height;
    }

    @Override // androidx.compose.ui.platform.l1
    public int getWidth() {
        int width;
        width = this.renderNode.getWidth();
        return width;
    }

    @Override // androidx.compose.ui.platform.l1
    public boolean h(int left, int top2, int right, int bottom) {
        boolean position;
        position = this.renderNode.setPosition(left, top2, right, bottom);
        return position;
    }

    @Override // androidx.compose.ui.platform.l1
    public void i() {
        this.renderNode.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.l1
    public void j(float f4) {
        this.renderNode.setElevation(f4);
    }

    @Override // androidx.compose.ui.platform.l1
    public void k(float f4) {
        this.renderNode.setAlpha(f4);
    }

    @Override // androidx.compose.ui.platform.l1
    public void l(int offset) {
        this.renderNode.offsetTopAndBottom(offset);
    }

    @Override // androidx.compose.ui.platform.l1
    @fg.m
    /* renamed from: m, reason: from getter */
    public androidx.compose.ui.graphics.s5 getInternalRenderEffect() {
        return this.internalRenderEffect;
    }

    @Override // androidx.compose.ui.platform.l1
    public boolean n() {
        boolean hasDisplayList;
        hasDisplayList = this.renderNode.hasDisplayList();
        return hasDisplayList;
    }

    @Override // androidx.compose.ui.platform.l1
    public void o(float f4) {
        this.renderNode.setTranslationY(f4);
    }

    @Override // androidx.compose.ui.platform.l1
    public int p() {
        int ambientShadowColor;
        ambientShadowColor = this.renderNode.getAmbientShadowColor();
        return ambientShadowColor;
    }

    @Override // androidx.compose.ui.platform.l1
    public float q() {
        float pivotX;
        pivotX = this.renderNode.getPivotX();
        return pivotX;
    }

    @Override // androidx.compose.ui.platform.l1
    public void r(int i4) {
        RenderNode renderNode = this.renderNode;
        i4.Companion companion = androidx.compose.ui.graphics.i4.INSTANCE;
        companion.getClass();
        if (androidx.compose.ui.graphics.i4.g(i4, androidx.compose.ui.graphics.i4.f17853d)) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else {
            companion.getClass();
            if (androidx.compose.ui.graphics.i4.g(i4, androidx.compose.ui.graphics.i4.f17854e)) {
                renderNode.setUseCompositingLayer(false, null);
                renderNode.setHasOverlappingRendering(false);
            } else {
                renderNode.setUseCompositingLayer(false, null);
                renderNode.setHasOverlappingRendering(true);
            }
        }
        this.internalCompositingStrategy = i4;
    }

    @Override // androidx.compose.ui.platform.l1
    public float s() {
        float rotationY;
        rotationY = this.renderNode.getRotationY();
        return rotationY;
    }

    @Override // androidx.compose.ui.platform.l1
    /* renamed from: t */
    public boolean getClipToBounds() {
        boolean clipToBounds;
        clipToBounds = this.renderNode.getClipToBounds();
        return clipToBounds;
    }

    @Override // androidx.compose.ui.platform.l1
    /* renamed from: u */
    public int getTop() {
        int top2;
        top2 = this.renderNode.getTop();
        return top2;
    }

    @Override // androidx.compose.ui.platform.l1
    public float v() {
        float pivotY;
        pivotY = this.renderNode.getPivotY();
        return pivotY;
    }

    @Override // androidx.compose.ui.platform.l1
    @fg.l
    public m1 w() {
        long uniqueId;
        int left;
        int top2;
        int right;
        int bottom;
        int width;
        int height;
        float scaleX;
        float scaleY;
        float translationX;
        float translationY;
        float elevation;
        int ambientShadowColor;
        int spotShadowColor;
        float rotationZ;
        float rotationX;
        float rotationY;
        float cameraDistance;
        float pivotX;
        float pivotY;
        boolean clipToOutline;
        boolean clipToBounds;
        float alpha;
        uniqueId = this.renderNode.getUniqueId();
        left = this.renderNode.getLeft();
        top2 = this.renderNode.getTop();
        right = this.renderNode.getRight();
        bottom = this.renderNode.getBottom();
        width = this.renderNode.getWidth();
        height = this.renderNode.getHeight();
        scaleX = this.renderNode.getScaleX();
        scaleY = this.renderNode.getScaleY();
        translationX = this.renderNode.getTranslationX();
        translationY = this.renderNode.getTranslationY();
        elevation = this.renderNode.getElevation();
        ambientShadowColor = this.renderNode.getAmbientShadowColor();
        spotShadowColor = this.renderNode.getSpotShadowColor();
        rotationZ = this.renderNode.getRotationZ();
        rotationX = this.renderNode.getRotationX();
        rotationY = this.renderNode.getRotationY();
        cameraDistance = this.renderNode.getCameraDistance();
        pivotX = this.renderNode.getPivotX();
        pivotY = this.renderNode.getPivotY();
        clipToOutline = this.renderNode.getClipToOutline();
        clipToBounds = this.renderNode.getClipToBounds();
        alpha = this.renderNode.getAlpha();
        return new m1(uniqueId, left, top2, right, bottom, width, height, scaleX, scaleY, translationX, translationY, elevation, ambientShadowColor, spotShadowColor, rotationZ, rotationX, rotationY, cameraDistance, pivotX, pivotY, clipToOutline, clipToBounds, alpha, this.internalRenderEffect, this.internalCompositingStrategy, null);
    }

    @Override // androidx.compose.ui.platform.l1
    public float x() {
        float rotationZ;
        rotationZ = this.renderNode.getRotationZ();
        return rotationZ;
    }

    @Override // androidx.compose.ui.platform.l1
    public boolean y() {
        boolean clipToOutline;
        clipToOutline = this.renderNode.getClipToOutline();
        return clipToOutline;
    }

    @Override // androidx.compose.ui.platform.l1
    public void z(float f4) {
        this.renderNode.setScaleX(f4);
    }
}
