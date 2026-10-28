package androidx.compose.ui.layout;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: OnRemeasuredModifier.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/b1;", "Landroidx/compose/ui/q$c;", "Landroidx/compose/ui/unit/u;", "size", "Lkotlin/k2;", "l", "(J)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface b1 extends q.c {

    /* compiled from: OnRemeasuredModifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@fg.l b1 b1Var, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return b1.super.Z(lVar);
        }

        @Deprecated
        public static boolean b(@fg.l b1 b1Var, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return b1.super.y(lVar);
        }

        @Deprecated
        public static <R> R c(@fg.l b1 b1Var, R r4, @fg.l ld.p<? super R, ? super q.c, ? extends R> pVar) {
            return (R) b1.D3(b1Var, r4, pVar);
        }

        @Deprecated
        public static <R> R d(@fg.l b1 b1Var, R r4, @fg.l ld.p<? super q.c, ? super R, ? extends R> pVar) {
            return (R) b1.m4(b1Var, r4, pVar);
        }

        @fg.l
        @Deprecated
        public static androidx.compose.ui.q e(@fg.l b1 b1Var, @fg.l androidx.compose.ui.q qVar) {
            return b1.super.w3(qVar);
        }
    }

    static Object D3(b1 b1Var, Object obj, ld.p pVar) {
        b1Var.getClass();
        return pVar.invoke(obj, b1Var);
    }

    static Object m4(b1 b1Var, Object obj, ld.p pVar) {
        b1Var.getClass();
        return pVar.invoke(b1Var, obj);
    }

    void l(long size);
}
