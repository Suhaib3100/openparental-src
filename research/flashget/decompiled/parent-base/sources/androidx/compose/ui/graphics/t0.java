package androidx.compose.ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.Metadata;

/* compiled from: AndroidPaint.android.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0013\u0010\b\u001a\u00060\u0002j\u0002`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u0014\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R.\u0010!\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010'\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010,\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020(8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b\r\u0010+R*\u0010.\u001a\u00020-2\u0006\u0010.\u001a\u00020-8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\n\u0010/\"\u0004\b0\u00101R*\u00105\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b\u001b\u00104R*\u00108\u001a\u0002062\u0006\u0010\u001a\u001a\u0002068V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0016\u00103\"\u0004\b7\u00104R$\u0010;\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b9\u0010$\"\u0004\b:\u0010&R*\u0010>\u001a\u00020<2\u0006\u0010\u001a\u001a\u00020<8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b=\u00103\"\u0004\b\u0012\u00104R*\u0010B\u001a\u00020?2\u0006\u0010\u001a\u001a\u00020?8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b@\u00103\"\u0004\bA\u00104R$\u0010E\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bC\u0010$\"\u0004\bD\u0010&R*\u0010I\u001a\u00020F2\u0006\u0010\u001a\u001a\u00020F8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bG\u00103\"\u0004\bH\u00104R4\u0010N\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u000e\u0010\u001a\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR(\u0010S\u001a\u0004\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010R\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006T"}, d2 = {"Landroidx/compose/ui/graphics/t0;", "Landroidx/compose/ui/graphics/d5;", "Landroid/graphics/Paint;", "internalPaint", "<init>", "(Landroid/graphics/Paint;)V", "()V", "Landroidx/compose/ui/graphics/NativePaint;", "r", "()Landroid/graphics/Paint;", "a", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/k1;", "b", "I", "_blendMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "c", "Landroid/graphics/Shader;", "internalShader", "Landroidx/compose/ui/graphics/e2;", "d", "Landroidx/compose/ui/graphics/e2;", "internalColorFilter", "Landroidx/compose/ui/graphics/h5;", "value", "e", "Landroidx/compose/ui/graphics/h5;", "n", "()Landroidx/compose/ui/graphics/h5;", "j", "(Landroidx/compose/ui/graphics/h5;)V", "pathEffect", "", "g", "()F", "k", "(F)V", "alpha", "", "x", "()Z", "(Z)V", "isAntiAlias", "Landroidx/compose/ui/graphics/d2;", "color", "()J", "m", "(J)V", "o", "()I", "(I)V", "blendMode", "Landroidx/compose/ui/graphics/f5;", "y", "style", "A", "z", "strokeWidth", "Landroidx/compose/ui/graphics/i6;", "i", "strokeCap", "Landroidx/compose/ui/graphics/j6;", "p", "l", "strokeJoin", "q", "v", "strokeMiterLimit", "Landroidx/compose/ui/graphics/m4;", "w", "h", "filterQuality", "t", "()Landroid/graphics/Shader;", "s", "(Landroid/graphics/Shader;)V", "shader", "f", "()Landroidx/compose/ui/graphics/e2;", "u", "(Landroidx/compose/ui/graphics/e2;)V", "colorFilter", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t0 implements d5 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private Paint internalPaint;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int _blendMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Shader internalShader;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private e2 internalColorFilter;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private h5 pathEffect;

    public t0(@fg.l Paint paint) {
        this.internalPaint = paint;
        k1.INSTANCE.getClass();
        this._blendMode = k1.f17877f;
    }

    @Override // androidx.compose.ui.graphics.d5
    public float A() {
        return this.internalPaint.getStrokeWidth();
    }

    @Override // androidx.compose.ui.graphics.d5
    public long a() {
        return u0.e(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.d5
    public void b(boolean z4) {
        this.internalPaint.setAntiAlias(z4);
    }

    @Override // androidx.compose.ui.graphics.d5
    public void c(int i4) {
        u0.u(this.internalPaint, i4);
    }

    @Override // androidx.compose.ui.graphics.d5
    public int d() {
        return u0.k(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.d5
    public void e(int i4) {
        if (k1.G(this._blendMode, i4)) {
            return;
        }
        this._blendMode = i4;
        u0.o(this.internalPaint, i4);
    }

    @Override // androidx.compose.ui.graphics.d5
    @fg.m
    /* renamed from: f, reason: from getter */
    public e2 getInternalColorFilter() {
        return this.internalColorFilter;
    }

    @Override // androidx.compose.ui.graphics.d5
    public float g() {
        return u0.c(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.d5
    public void h(int i4) {
        u0.r(this.internalPaint, i4);
    }

    @Override // androidx.compose.ui.graphics.d5
    public int i() {
        return u0.g(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.d5
    public void j(@fg.m h5 h5Var) {
        u0.s(this.internalPaint, h5Var);
        this.pathEffect = h5Var;
    }

    @Override // androidx.compose.ui.graphics.d5
    public void k(float f4) {
        u0.m(this.internalPaint, f4);
    }

    @Override // androidx.compose.ui.graphics.d5
    public void l(int i4) {
        u0.v(this.internalPaint, i4);
    }

    @Override // androidx.compose.ui.graphics.d5
    public void m(long j4) {
        u0.p(this.internalPaint, j4);
    }

    @Override // androidx.compose.ui.graphics.d5
    @fg.m
    /* renamed from: n, reason: from getter */
    public h5 getPathEffect() {
        return this.pathEffect;
    }

    @Override // androidx.compose.ui.graphics.d5
    /* renamed from: o, reason: from getter */
    public int get_blendMode() {
        return this._blendMode;
    }

    @Override // androidx.compose.ui.graphics.d5
    public int p() {
        return u0.h(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.d5
    public float q() {
        return this.internalPaint.getStrokeMiter();
    }

    @Override // androidx.compose.ui.graphics.d5
    @fg.l
    /* renamed from: r, reason: from getter */
    public Paint getInternalPaint() {
        return this.internalPaint;
    }

    @Override // androidx.compose.ui.graphics.d5
    public void s(@fg.m Shader shader) {
        this.internalShader = shader;
        this.internalPaint.setShader(shader);
    }

    @Override // androidx.compose.ui.graphics.d5
    @fg.m
    /* renamed from: t, reason: from getter */
    public Shader getInternalShader() {
        return this.internalShader;
    }

    @Override // androidx.compose.ui.graphics.d5
    public void u(@fg.m e2 e2Var) {
        this.internalColorFilter = e2Var;
        u0.q(this.internalPaint, e2Var);
    }

    @Override // androidx.compose.ui.graphics.d5
    public void v(float f4) {
        this.internalPaint.setStrokeMiter(f4);
    }

    @Override // androidx.compose.ui.graphics.d5
    public int w() {
        return u0.f(this.internalPaint);
    }

    @Override // androidx.compose.ui.graphics.d5
    public boolean x() {
        return this.internalPaint.isAntiAlias();
    }

    @Override // androidx.compose.ui.graphics.d5
    public void y(int i4) {
        u0.y(this.internalPaint, i4);
    }

    @Override // androidx.compose.ui.graphics.d5
    public void z(float f4) {
        this.internalPaint.setStrokeWidth(f4);
    }

    public t0() {
        this(u0.l());
    }
}
