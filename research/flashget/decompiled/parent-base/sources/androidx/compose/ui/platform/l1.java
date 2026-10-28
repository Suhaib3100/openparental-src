package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import kotlin.Metadata;

/* compiled from: DeviceRenderNode.android.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007H&¢\u0006\u0004\b\u0012\u0010\u0011J5\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u0017H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH&¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H&¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0004H&¢\u0006\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u0010\b\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u0010\t\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00102R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00102R\u0014\u0010\u000b\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00102R\u0014\u00107\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00102R\u0014\u00109\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00102R\u001c\u0010?\u001a\u00020:8&@&X¦\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010B\u001a\u00020:8&@&X¦\u000e¢\u0006\f\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>R\u001c\u0010E\u001a\u00020:8&@&X¦\u000e¢\u0006\f\u001a\u0004\bC\u0010<\"\u0004\bD\u0010>R\u001c\u0010H\u001a\u00020:8&@&X¦\u000e¢\u0006\f\u001a\u0004\bF\u0010<\"\u0004\bG\u0010>R\u001c\u0010K\u001a\u00020:8&@&X¦\u000e¢\u0006\f\u001a\u0004\bI\u0010<\"\u0004\bJ\u0010>R\u001c\u0010N\u001a\u00020\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\bL\u00102\"\u0004\bM\u0010\u0011R\u001c\u0010Q\u001a\u00020\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\bO\u00102\"\u0004\bP\u0010\u0011R\u001c\u0010T\u001a\u00020:8&@&X¦\u000e¢\u0006\f\u001a\u0004\bR\u0010<\"\u0004\bS\u0010>R\u001c\u0010W\u001a\u00020:8&@&X¦\u000e¢\u0006\f\u001a\u0004\bU\u0010<\"\u0004\bV\u0010>R\u001c\u0010Z\u001a\u00020:8&@&X¦\u000e¢\u0006\f\u001a\u0004\bX\u0010<\"\u0004\bY\u0010>R\u001c\u0010]\u001a\u00020:8&@&X¦\u000e¢\u0006\f\u001a\u0004\b[\u0010<\"\u0004\b\\\u0010>R\u001c\u0010`\u001a\u00020:8&@&X¦\u000e¢\u0006\f\u001a\u0004\b^\u0010<\"\u0004\b_\u0010>R\u001c\u0010c\u001a\u00020:8&@&X¦\u000e¢\u0006\f\u001a\u0004\ba\u0010<\"\u0004\bb\u0010>R\u001c\u0010h\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001c\u0010k\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\bi\u0010e\"\u0004\bj\u0010gR\u001c\u0010n\u001a\u00020:8&@&X¦\u000e¢\u0006\f\u001a\u0004\bl\u0010<\"\u0004\bm\u0010>R\u001e\u0010t\u001a\u0004\u0018\u00010o8&@&X¦\u000e¢\u0006\f\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0014\u0010v\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bu\u0010eR\"\u0010z\u001a\u00020w8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bx\u00102\"\u0004\by\u0010\u0011ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006{À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/l1;", "", "Landroid/graphics/Outline;", "outline", "Lkotlin/k2;", "P", "(Landroid/graphics/Outline;)V", "", "left", "top", "right", "bottom", "", "h", "(IIII)Z", "offset", "E", "(I)V", "l", "Landroidx/compose/ui/graphics/w1;", "canvasHolder", "Landroidx/compose/ui/graphics/g5;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/v1;", "drawBlock", "R", "(Landroidx/compose/ui/graphics/w1;Landroidx/compose/ui/graphics/g5;Lld/l;)V", "Landroid/graphics/Matrix;", "matrix", "B", "(Landroid/graphics/Matrix;)V", "b", "Landroid/graphics/Canvas;", "canvas", "c", "(Landroid/graphics/Canvas;)V", "hasOverlappingRendering", "A", "(Z)Z", "Landroidx/compose/ui/platform/m1;", "w", "()Landroidx/compose/ui/platform/m1;", "i", "()V", "", "a", "()J", "uniqueId", "d", "()I", "u", "e", "G", "getWidth", "width", "getHeight", "height", "", "K", "()F", "z", "(F)V", "scaleX", "f0", "Q", "scaleY", "Y", "b0", "translationX", "X", "o", "translationY", "V", "j", "elevation", "p", "S", "ambientShadowColor", "L", "U", "spotShadowColor", "x", "O", "rotationZ", "a0", "H", "rotationX", "s", "J", "rotationY", "C", "F", "cameraDistance", "q", "I", "pivotX", "v", "N", "pivotY", "y", "()Z", "T", "(Z)V", "clipToOutline", "t", "f", "clipToBounds", "g", "k", "alpha", "Landroidx/compose/ui/graphics/s5;", "m", "()Landroidx/compose/ui/graphics/s5;", "D", "(Landroidx/compose/ui/graphics/s5;)V", "renderEffect", "n", "hasDisplayList", "Landroidx/compose/ui/graphics/i4;", "M", "r", "compositingStrategy", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface l1 {
    boolean A(boolean hasOverlappingRendering);

    void B(@fg.l Matrix matrix);

    float C();

    void D(@fg.m androidx.compose.ui.graphics.s5 s5Var);

    void E(int offset);

    void F(float f4);

    int G();

    void H(float f4);

    void I(float f4);

    void J(float f4);

    float K();

    int L();

    int M();

    void N(float f4);

    void O(float f4);

    void P(@fg.m Outline outline);

    void Q(float f4);

    void R(@fg.l androidx.compose.ui.graphics.w1 canvasHolder, @fg.m androidx.compose.ui.graphics.g5 clipPath, @fg.l ld.l<? super androidx.compose.ui.graphics.v1, kotlin.k2> drawBlock);

    void S(int i4);

    void T(boolean z4);

    void U(int i4);

    float V();

    float X();

    float Y();

    long a();

    float a0();

    void b(@fg.l Matrix matrix);

    void b0(float f4);

    void c(@fg.l Canvas canvas);

    int d();

    int e();

    void f(boolean z4);

    float f0();

    float g();

    int getHeight();

    int getWidth();

    boolean h(int left, int top2, int right, int bottom);

    void i();

    void j(float f4);

    void k(float f4);

    void l(int offset);

    @fg.m
    androidx.compose.ui.graphics.s5 m();

    boolean n();

    void o(float f4);

    int p();

    float q();

    void r(int i4);

    float s();

    boolean t();

    int u();

    float v();

    @fg.l
    m1 w();

    float x();

    boolean y();

    void z(float f4);
}
