package androidx.compose.ui.text.font;

import androidx.compose.runtime.x4;
import androidx.compose.ui.text.font.n0;
import kotlin.Metadata;

/* compiled from: Font.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a8\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aB\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"", "resId", "Landroidx/compose/ui/text/font/o0;", "weight", "Landroidx/compose/ui/text/font/k0;", "style", "Landroidx/compose/ui/text/font/x;", "c", "(ILandroidx/compose/ui/text/font/o0;I)Landroidx/compose/ui/text/font/x;", "Landroidx/compose/ui/text/font/i0;", "loadingStrategy", "e", "(ILandroidx/compose/ui/text/font/o0;II)Landroidx/compose/ui/text/font/x;", "Landroidx/compose/ui/text/font/n0$e;", "variationSettings", "a", "(ILandroidx/compose/ui/text/font/o0;IILandroidx/compose/ui/text/font/n0$e;)Landroidx/compose/ui/text/font/x;", "Landroidx/compose/ui/text/font/y;", "g", "(Landroidx/compose/ui/text/font/x;)Landroidx/compose/ui/text/font/y;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e0 {
    @fg.l
    @androidx.compose.ui.text.k
    public static final x a(int i4, @fg.l o0 o0Var, int i5, int i6, @fg.l n0.e eVar) {
        return new b1(i4, o0Var, i5, eVar, i6, null);
    }

    public static x b(int i4, o0 o0Var, int i5, int i6, n0.e eVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            o0.INSTANCE.getClass();
            o0Var = o0.f20834q;
        }
        if ((i7 & 4) != 0) {
            k0.INSTANCE.getClass();
            i5 = k0.f20754c;
        }
        if ((i7 & 8) != 0) {
            i0.INSTANCE.getClass();
            i6 = i0.f20743c;
        }
        if ((i7 & 16) != 0) {
            eVar = n0.f20791a.b(o0Var, i5, new n0.a[0]);
        }
        return a(i4, o0Var, i5, i6, eVar);
    }

    @x4
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility until Compose 1.3.", replaceWith = @kotlin.x0(expression = "Font(resId, weight, style)", imports = {}))
    public static final x c(int i4, o0 o0Var, int i5) {
        i0.INSTANCE.getClass();
        return new b1(i4, o0Var, i5, null, i0.f20743c, 8, null);
    }

    public static x d(int i4, o0 o0Var, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            o0.INSTANCE.getClass();
            o0Var = o0.f20834q;
        }
        if ((i6 & 4) != 0) {
            k0.INSTANCE.getClass();
            i5 = k0.f20754c;
        }
        return c(i4, o0Var, i5);
    }

    @x4
    @fg.l
    public static final x e(int i4, @fg.l o0 o0Var, int i5, int i6) {
        return new b1(i4, o0Var, i5, new n0.e(new n0.a[0]), i6, null);
    }

    public static x f(int i4, o0 o0Var, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            o0.INSTANCE.getClass();
            o0Var = o0.f20834q;
        }
        if ((i7 & 4) != 0) {
            k0.INSTANCE.getClass();
            i5 = k0.f20754c;
        }
        if ((i7 & 8) != 0) {
            i0.INSTANCE.getClass();
            i6 = i0.f20743c;
        }
        return e(i4, o0Var, i5, i6);
    }

    @x4
    @fg.l
    public static final y g(@fg.l x xVar) {
        return z.c(xVar);
    }
}
