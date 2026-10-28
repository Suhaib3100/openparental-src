package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* compiled from: Canvas.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\"\u0010\b\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a2\u0010\u000e\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u0014\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015\u001a-\u0010\u0017\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0015\u001a3\u0010\u001a\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/graphics/s4;", "image", "Landroidx/compose/ui/graphics/v1;", "a", "(Landroidx/compose/ui/graphics/s4;)Landroidx/compose/ui/graphics/v1;", "Lkotlin/Function0;", "Lkotlin/k2;", "block", "g", "(Landroidx/compose/ui/graphics/v1;Lld/a;)V", "Li0/i;", "bounds", "Landroidx/compose/ui/graphics/d5;", "paint", "h", "(Landroidx/compose/ui/graphics/v1;Li0/i;Landroidx/compose/ui/graphics/d5;Lld/a;)V", "", "degrees", "pivotX", "pivotY", "b", "(Landroidx/compose/ui/graphics/v1;FFF)V", "radians", "c", "sx", "sy", "e", "(Landroidx/compose/ui/graphics/v1;FFFF)V", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x1 {
    @fg.l
    public static final v1 a(@fg.l s4 s4Var) {
        return h0.a(s4Var);
    }

    public static final void b(@fg.l v1 v1Var, float f4, float f5, float f6) {
        if (f4 == 0.0f) {
            return;
        }
        v1Var.translate(f5, f6);
        v1Var.y(f4);
        v1Var.translate(-f5, -f6);
    }

    public static final void c(@fg.l v1 v1Var, float f4, float f5, float f6) {
        b(v1Var, f4 * 57.29578f, f5, f6);
    }

    public static /* synthetic */ void d(v1 v1Var, float f4, float f5, float f6, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            f5 = 0.0f;
        }
        if ((i4 & 4) != 0) {
            f6 = 0.0f;
        }
        c(v1Var, f4, f5, f6);
    }

    public static final void e(@fg.l v1 v1Var, float f4, float f5, float f6, float f7) {
        if (f4 == 1.0f && f5 == 1.0f) {
            return;
        }
        v1Var.translate(f6, f7);
        v1Var.d(f4, f5);
        v1Var.translate(-f6, -f7);
    }

    public static /* synthetic */ void f(v1 v1Var, float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            f5 = f4;
        }
        e(v1Var, f4, f5, f6, f7);
    }

    public static final void g(@fg.l v1 v1Var, @fg.l ld.a<kotlin.k2> aVar) {
        try {
            v1Var.C();
            aVar.invoke();
        } finally {
            v1Var.o();
        }
    }

    public static final void h(@fg.l v1 v1Var, @fg.l i0.i iVar, @fg.l d5 d5Var, @fg.l ld.a<kotlin.k2> aVar) {
        try {
            v1Var.z(iVar, d5Var);
            aVar.invoke();
        } finally {
            v1Var.o();
        }
    }
}
