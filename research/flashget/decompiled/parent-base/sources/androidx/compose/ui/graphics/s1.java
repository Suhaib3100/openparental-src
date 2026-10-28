package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import kotlin.Metadata;

/* compiled from: AndroidRenderEffect.android.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0015¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/graphics/s1;", "Landroidx/compose/ui/graphics/s5;", "renderEffect", "", "radiusX", "radiusY", "Landroidx/compose/ui/graphics/n6;", "edgeTreatment", "<init>", "(Landroidx/compose/ui/graphics/s5;FFILkotlin/jvm/internal/w;)V", "Landroid/graphics/RenderEffect;", "b", "()Landroid/graphics/RenderEffect;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/s5;", "c", "F", "d", "e", "I", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s1 extends s5 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final s5 renderEffect;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float radiusX;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float radiusY;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int edgeTreatment;

    public /* synthetic */ s1(s5 s5Var, float f4, float f5, int i4, kotlin.jvm.internal.w wVar) {
        this(s5Var, f4, f5, i4);
    }

    @Override // androidx.compose.ui.graphics.s5
    @fg.l
    @androidx.annotation.x0(31)
    /* renamed from: b */
    protected RenderEffect getAndroidRenderEffect() {
        return y5.f18482a.a(this.renderEffect, this.radiusX, this.radiusY, this.edgeTreatment);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) other;
        return this.radiusX == s1Var.radiusX && this.radiusY == s1Var.radiusY && n6.h(this.edgeTreatment, s1Var.edgeTreatment) && kotlin.jvm.internal.l0.g(this.renderEffect, s1Var.renderEffect);
    }

    public int hashCode() {
        s5 s5Var = this.renderEffect;
        return n6.i(this.edgeTreatment) + androidx.compose.animation.l0.a(this.radiusY, androidx.compose.animation.l0.a(this.radiusX, (s5Var != null ? s5Var.hashCode() : 0) * 31, 31), 31);
    }

    @fg.l
    public String toString() {
        return "BlurEffect(renderEffect=" + this.renderEffect + ", radiusX=" + this.radiusX + ", radiusY=" + this.radiusY + ", edgeTreatment=" + ((Object) n6.j(this.edgeTreatment)) + ')';
    }

    private s1(s5 s5Var, float f4, float f5, int i4) {
        super(null);
        this.renderEffect = s5Var;
        this.radiusX = f4;
        this.radiusY = f5;
        this.edgeTreatment = i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s1(androidx.compose.ui.graphics.s5 r1, float r2, float r3, int r4, int r5, kotlin.jvm.internal.w r6) {
        /*
            r0 = this;
            r6 = r5 & 4
            if (r6 == 0) goto L5
            r3 = r2
        L5:
            r5 = r5 & 8
            if (r5 == 0) goto L12
            androidx.compose.ui.graphics.n6$a r4 = androidx.compose.ui.graphics.n6.INSTANCE
            r4.getClass()
            int r4 = androidx.compose.ui.graphics.n6.a()
        L12:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.s1.<init>(androidx.compose.ui.graphics.s5, float, float, int, int, kotlin.jvm.internal.w):void");
    }
}
