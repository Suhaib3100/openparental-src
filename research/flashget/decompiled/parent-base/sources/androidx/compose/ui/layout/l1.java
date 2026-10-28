package androidx.compose.ui.layout;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: RemeasurementModifier.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/l1;", "Landroidx/compose/ui/q$c;", "Landroidx/compose/ui/layout/k1;", "remeasurement", "Lkotlin/k2;", "K2", "(Landroidx/compose/ui/layout/k1;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface l1 extends q.c {

    /* compiled from: RemeasurementModifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@fg.l l1 l1Var, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return l1.super.Z(lVar);
        }

        @Deprecated
        public static boolean b(@fg.l l1 l1Var, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return l1.super.y(lVar);
        }

        @Deprecated
        public static <R> R c(@fg.l l1 l1Var, R r4, @fg.l ld.p<? super R, ? super q.c, ? extends R> pVar) {
            return (R) l1.E0(l1Var, r4, pVar);
        }

        @Deprecated
        public static <R> R d(@fg.l l1 l1Var, R r4, @fg.l ld.p<? super q.c, ? super R, ? extends R> pVar) {
            return (R) l1.V1(l1Var, r4, pVar);
        }

        @fg.l
        @Deprecated
        public static androidx.compose.ui.q e(@fg.l l1 l1Var, @fg.l androidx.compose.ui.q qVar) {
            return l1.super.w3(qVar);
        }
    }

    static Object E0(l1 l1Var, Object obj, ld.p pVar) {
        l1Var.getClass();
        return pVar.invoke(obj, l1Var);
    }

    static Object V1(l1 l1Var, Object obj, ld.p pVar) {
        l1Var.getClass();
        return pVar.invoke(l1Var, obj);
    }

    void K2(@fg.l k1 remeasurement);
}
