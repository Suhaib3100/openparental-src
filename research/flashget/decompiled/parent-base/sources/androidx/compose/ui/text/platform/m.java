package androidx.compose.ui.text.platform;

import android.text.TextPaint;
import androidx.annotation.m1;
import androidx.compose.ui.graphics.c6;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.d5;
import androidx.compose.ui.graphics.f2;
import androidx.compose.ui.graphics.f5;
import androidx.compose.ui.graphics.t0;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.text.style.k;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.v0;

/* compiled from: AndroidTextPaint.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u001a\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R(\u0010\u000e\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b&\u0010(\"\u0004\b)\u0010\u0010R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010,R1\u00104\u001a\u00020-2\u0006\u0010.\u001a\u00020-8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\u001a\u0004\b!\u0010/\"\u0004\b0\u00101*\u0004\b2\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/ui/text/platform/m;", "Landroid/text/TextPaint;", "", "flags", "", "density", "<init>", "(IF)V", "Landroidx/compose/ui/text/style/k;", "textDecoration", "Lkotlin/k2;", "l", "(Landroidx/compose/ui/text/style/k;)V", "Landroidx/compose/ui/graphics/c6;", "shadow", "j", "(Landroidx/compose/ui/graphics/c6;)V", "Landroidx/compose/ui/graphics/d2;", "color", "h", "(J)V", "Landroidx/compose/ui/graphics/t1;", "brush", "Li0/n;", "size", "alpha", "f", "(Landroidx/compose/ui/graphics/t1;JF)V", "Landroidx/compose/ui/graphics/drawscope/i;", "drawStyle", "i", "(Landroidx/compose/ui/graphics/drawscope/i;)V", "Landroidx/compose/ui/graphics/d5;", "a", "Landroidx/compose/ui/graphics/d5;", "composePaint", "b", "Landroidx/compose/ui/text/style/k;", "c", "Landroidx/compose/ui/graphics/c6;", "()Landroidx/compose/ui/graphics/c6;", "k", "d", "()V", "Landroidx/compose/ui/graphics/drawscope/i;", "Landroidx/compose/ui/graphics/k1;", "<set-?>", "()I", "e", "(I)V", "getBlendMode-0nO6VwU$delegate", "(Landroidx/compose/ui/text/platform/m;)Ljava/lang/Object;", "blendMode", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidTextPaint.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,144:1\n646#2:145\n646#2:146\n152#3:147\n*S KotlinDebug\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n*L\n83#1:145\n92#1:146\n93#1:147\n*E\n"})
/* loaded from: classes.dex */
public final class m extends TextPaint {

    /* renamed from: e, reason: collision with root package name */
    public static final int f21264e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d5 composePaint;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.text.style.k textDecoration;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private c6 shadow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.graphics.drawscope.i drawStyle;

    public m(int i4, float f4) {
        super(i4);
        ((TextPaint) this).density = f4;
        this.composePaint = new t0(this);
        androidx.compose.ui.text.style.k.INSTANCE.getClass();
        this.textDecoration = androidx.compose.ui.text.style.k.f21364d;
        c6.INSTANCE.getClass();
        this.shadow = c6.f17640e;
    }

    private static Object b(m mVar) {
        return l1.j(new v0(mVar.composePaint, d5.class, "blendMode", "getBlendMode-0nO6VwU()I", 0));
    }

    @m1
    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void g(m mVar, t1 t1Var, long j4, float f4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            f4 = Float.NaN;
        }
        mVar.f(t1Var, j4, f4);
    }

    public final int a() {
        return this.composePaint.get_blendMode();
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final c6 getShadow() {
        return this.shadow;
    }

    public final void e(int i4) {
        this.composePaint.e(i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r8 = kotlin.ranges.s.H(r8, 0.0f, 1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r6 != i0.n.f74172d) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r0 != androidx.compose.ui.graphics.d2.f17778o) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        r0 = r4.composePaint;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (java.lang.Float.isNaN(r8) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        r8 = r4.composePaint.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        r5.a(r6, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(@fg.m androidx.compose.ui.graphics.t1 r5, long r6, float r8) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.ui.graphics.g6
            if (r0 == 0) goto L19
            r0 = r5
            androidx.compose.ui.graphics.g6 r0 = (androidx.compose.ui.graphics.g6) r0
            long r0 = r0.getValue()
            androidx.compose.ui.graphics.d2$a r2 = androidx.compose.ui.graphics.d2.INSTANCE
            r2.getClass()
            long r2 = androidx.compose.ui.graphics.d2.k()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L19
            goto L2a
        L19:
            boolean r0 = r5 instanceof androidx.compose.ui.graphics.a6
            if (r0 == 0) goto L44
            i0.n$a r0 = i0.n.INSTANCE
            r0.getClass()
            long r0 = i0.n.a()
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L44
        L2a:
            androidx.compose.ui.graphics.d5 r0 = r4.composePaint
            boolean r1 = java.lang.Float.isNaN(r8)
            if (r1 == 0) goto L39
            androidx.compose.ui.graphics.d5 r8 = r4.composePaint
            float r8 = r8.g()
            goto L40
        L39:
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r8 = kotlin.ranges.s.H(r8, r1, r2)
        L40:
            r5.a(r6, r0, r8)
            goto L4c
        L44:
            if (r5 != 0) goto L4c
            androidx.compose.ui.graphics.d5 r5 = r4.composePaint
            r6 = 0
            r5.s(r6)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.m.f(androidx.compose.ui.graphics.t1, long, float):void");
    }

    public final void h(long color) {
        d2.INSTANCE.getClass();
        if (color != d2.f17778o) {
            this.composePaint.m(color);
            this.composePaint.s(null);
        }
    }

    public final void i(@fg.m androidx.compose.ui.graphics.drawscope.i drawStyle) {
        if (drawStyle == null || l0.g(this.drawStyle, drawStyle)) {
            return;
        }
        this.drawStyle = drawStyle;
        if (l0.g(drawStyle, androidx.compose.ui.graphics.drawscope.m.f17797a)) {
            d5 d5Var = this.composePaint;
            f5.INSTANCE.getClass();
            d5Var.y(f5.f17816c);
        } else if (drawStyle instanceof androidx.compose.ui.graphics.drawscope.n) {
            d5 d5Var2 = this.composePaint;
            f5.INSTANCE.getClass();
            d5Var2.y(f5.f17817d);
            androidx.compose.ui.graphics.drawscope.n nVar = (androidx.compose.ui.graphics.drawscope.n) drawStyle;
            this.composePaint.z(nVar.getWidth());
            this.composePaint.v(nVar.getMiter());
            this.composePaint.l(nVar.getJoin());
            this.composePaint.c(nVar.getCap());
            this.composePaint.j(nVar.getPathEffect());
        }
    }

    public final void j(@fg.m c6 shadow) {
        if (shadow == null || l0.g(this.shadow, shadow)) {
            return;
        }
        this.shadow = shadow;
        c6.INSTANCE.getClass();
        if (l0.g(shadow, c6.f17640e)) {
            clearShadowLayer();
        } else {
            setShadowLayer(androidx.compose.ui.text.platform.extensions.e.c(this.shadow.getBlurRadius()), i0.f.p(this.shadow.getOffset()), i0.f.r(this.shadow.getOffset()), f2.r(this.shadow.getColor()));
        }
    }

    public final void k(@fg.l c6 c6Var) {
        this.shadow = c6Var;
    }

    public final void l(@fg.m androidx.compose.ui.text.style.k textDecoration) {
        if (textDecoration == null || l0.g(this.textDecoration, textDecoration)) {
            return;
        }
        this.textDecoration = textDecoration;
        k.Companion companion = androidx.compose.ui.text.style.k.INSTANCE;
        companion.getClass();
        setUnderlineText(textDecoration.d(androidx.compose.ui.text.style.k.f21365e));
        androidx.compose.ui.text.style.k kVar = this.textDecoration;
        companion.getClass();
        setStrikeThruText(kVar.d(androidx.compose.ui.text.style.k.f21366f));
    }
}
