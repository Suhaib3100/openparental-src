package androidx.compose.ui.graphics.drawscope;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: DrawTransform.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a(\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a)\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a)\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/j;", "", "horizontal", "vertical", "Lkotlin/k2;", "b", "(Landroidx/compose/ui/graphics/drawscope/j;FF)V", "inset", "a", "(Landroidx/compose/ui/graphics/drawscope/j;F)V", "radians", "Li0/f;", "pivot", "d", "(Landroidx/compose/ui/graphics/drawscope/j;FJ)V", "scale", "f", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDrawTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n1#1,179:1\n37#1:180\n*S KotlinDebug\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n49#1:180\n*E\n"})
/* loaded from: classes.dex */
public final class k {
    public static final void a(@fg.l j jVar, float f4) {
        jVar.m(f4, f4, f4, f4);
    }

    public static final void b(@fg.l j jVar, float f4, float f5) {
        jVar.m(f4, f5, f4, f5);
    }

    public static /* synthetic */ void c(j jVar, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 0.0f;
        }
        if ((i4 & 2) != 0) {
            f5 = 0.0f;
        }
        jVar.m(f4, f5, f4, f5);
    }

    public static final void d(@fg.l j jVar, float f4, long j4) {
        jVar.j(f4 * 57.29578f, j4);
    }

    public static void e(j jVar, float f4, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = jVar.c0();
        }
        jVar.j(f4 * 57.29578f, j4);
    }

    public static final void f(@fg.l j jVar, float f4, long j4) {
        jVar.i(f4, f4, j4);
    }

    public static /* synthetic */ void g(j jVar, float f4, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = jVar.c0();
        }
        jVar.i(f4, f4, j4);
    }
}
