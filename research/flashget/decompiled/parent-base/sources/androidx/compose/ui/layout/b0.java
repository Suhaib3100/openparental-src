package androidx.compose.ui.layout;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: LayoutModifier.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J&\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ#\u0010\u0012\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ#\u0010\u0013\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u000fø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/b0;", "Landroidx/compose/ui/q$c;", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/p;", "", "height", "P", "(Landroidx/compose/ui/layout/q;Landroidx/compose/ui/layout/p;I)I", "width", "G", "V", "p", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface b0 extends q.c {

    /* compiled from: LayoutModifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@fg.l b0 b0Var, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return b0.super.Z(lVar);
        }

        @Deprecated
        public static boolean b(@fg.l b0 b0Var, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return b0.super.y(lVar);
        }

        @Deprecated
        public static <R> R c(@fg.l b0 b0Var, R r4, @fg.l ld.p<? super R, ? super q.c, ? extends R> pVar) {
            return (R) b0.P2(b0Var, r4, pVar);
        }

        @Deprecated
        public static <R> R d(@fg.l b0 b0Var, R r4, @fg.l ld.p<? super q.c, ? super R, ? extends R> pVar) {
            return (R) b0.P1(b0Var, r4, pVar);
        }

        @Deprecated
        public static int e(@fg.l b0 b0Var, @fg.l q qVar, @fg.l p pVar, int i4) {
            return b0.p0(b0Var, qVar, pVar, i4);
        }

        @Deprecated
        public static int f(@fg.l b0 b0Var, @fg.l q qVar, @fg.l p pVar, int i4) {
            return b0.R6(b0Var, qVar, pVar, i4);
        }

        @Deprecated
        public static int g(@fg.l b0 b0Var, @fg.l q qVar, @fg.l p pVar, int i4) {
            return b0.V0(b0Var, qVar, pVar, i4);
        }

        @Deprecated
        public static int h(@fg.l b0 b0Var, @fg.l q qVar, @fg.l p pVar, int i4) {
            return b0.M1(b0Var, qVar, pVar, i4);
        }

        @fg.l
        @Deprecated
        public static androidx.compose.ui.q i(@fg.l b0 b0Var, @fg.l androidx.compose.ui.q qVar) {
            return b0.super.w3(qVar);
        }
    }

    static int M1(b0 b0Var, q qVar, p pVar, int i4) {
        b0Var.getClass();
        return q0.f19072a.d(b0Var, qVar, pVar, i4);
    }

    static Object P1(b0 b0Var, Object obj, ld.p pVar) {
        b0Var.getClass();
        return pVar.invoke(b0Var, obj);
    }

    static Object P2(b0 b0Var, Object obj, ld.p pVar) {
        b0Var.getClass();
        return pVar.invoke(obj, b0Var);
    }

    static int R6(b0 b0Var, q qVar, p pVar, int i4) {
        b0Var.getClass();
        return q0.f19072a.b(b0Var, qVar, pVar, i4);
    }

    static int V0(b0 b0Var, q qVar, p pVar, int i4) {
        b0Var.getClass();
        return q0.f19072a.c(b0Var, qVar, pVar, i4);
    }

    static int p0(b0 b0Var, q qVar, p pVar, int i4) {
        b0Var.getClass();
        return q0.f19072a.a(b0Var, qVar, pVar, i4);
    }

    default int G(@fg.l q qVar, @fg.l p pVar, int i4) {
        return q0.f19072a.c(this, qVar, pVar, i4);
    }

    default int P(@fg.l q qVar, @fg.l p pVar, int i4) {
        return q0.f19072a.d(this, qVar, pVar, i4);
    }

    default int V(@fg.l q qVar, @fg.l p pVar, int i4) {
        return q0.f19072a.b(this, qVar, pVar, i4);
    }

    @fg.l
    n0 f(@fg.l o0 o0Var, @fg.l l0 l0Var, long j4);

    default int p(@fg.l q qVar, @fg.l p pVar, int i4) {
        return q0.f19072a.a(this, qVar, pVar, i4);
    }
}
