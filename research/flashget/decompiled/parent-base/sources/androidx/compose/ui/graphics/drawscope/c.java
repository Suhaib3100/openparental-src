package androidx.compose.ui.graphics.drawscope;

import androidx.annotation.x;
import androidx.compose.runtime.x4;
import androidx.compose.ui.graphics.e2;
import androidx.compose.ui.graphics.s4;
import kotlin.Metadata;

/* compiled from: ContentDrawScope.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/c;", "Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "G6", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface c extends f {

    /* compiled from: ContentDrawScope.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static void a(@fg.l c cVar, @fg.l s4 s4Var, long j4, long j5, long j6, long j7, @x(from = 0.0d, to = 1.0d) float f4, @fg.l i iVar, @fg.m e2 e2Var, int i4, int i5) {
            c.super.c6(s4Var, j4, j5, j6, j7, f4, iVar, e2Var, i4, i5);
        }

        @Deprecated
        public static long b(@fg.l c cVar) {
            return c.super.c0();
        }

        @Deprecated
        public static long c(@fg.l c cVar) {
            return c.super.e();
        }

        @x4
        @Deprecated
        public static int d(@fg.l c cVar, long j4) {
            return c.super.J5(j4);
        }

        @x4
        @Deprecated
        public static int e(@fg.l c cVar, float f4) {
            return c.super.q2(f4);
        }

        @x4
        @Deprecated
        public static float f(@fg.l c cVar, long j4) {
            return c.super.i(j4);
        }

        @x4
        @Deprecated
        public static float g(@fg.l c cVar, float f4) {
            return c.super.S(f4);
        }

        @x4
        @Deprecated
        public static float h(@fg.l c cVar, int i4) {
            return c.super.R(i4);
        }

        @x4
        @Deprecated
        public static long i(@fg.l c cVar, long j4) {
            return c.super.n(j4);
        }

        @x4
        @Deprecated
        public static float j(@fg.l c cVar, long j4) {
            return c.super.J2(j4);
        }

        @x4
        @Deprecated
        public static float k(@fg.l c cVar, float f4) {
            return cVar.b() * f4;
        }

        @x4
        @fg.l
        @Deprecated
        public static i0.i l(@fg.l c cVar, @fg.l androidx.compose.ui.unit.k kVar) {
            return c.super.c5(kVar);
        }

        @x4
        @Deprecated
        public static long m(@fg.l c cVar, long j4) {
            return c.super.d0(j4);
        }

        @x4
        @Deprecated
        public static long n(@fg.l c cVar, float f4) {
            return c.super.h(f4);
        }

        @x4
        @Deprecated
        public static long o(@fg.l c cVar, float f4) {
            return c.super.w(f4);
        }

        @x4
        @Deprecated
        public static long p(@fg.l c cVar, int i4) {
            return c.super.u(i4);
        }
    }

    static float C3(c cVar, float f4) {
        return cVar.b() * f4;
    }

    void G6();
}
