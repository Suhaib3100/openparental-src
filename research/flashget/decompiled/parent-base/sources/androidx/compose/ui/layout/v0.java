package androidx.compose.ui.layout;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: OnGloballyPositionedModifier.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/v0;", "Landroidx/compose/ui/q$c;", "Landroidx/compose/ui/layout/u;", "coordinates", "Lkotlin/k2;", "W", "(Landroidx/compose/ui/layout/u;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface v0 extends q.c {

    /* compiled from: OnGloballyPositionedModifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@fg.l v0 v0Var, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return v0.super.Z(lVar);
        }

        @Deprecated
        public static boolean b(@fg.l v0 v0Var, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return v0.super.y(lVar);
        }

        @Deprecated
        public static <R> R c(@fg.l v0 v0Var, R r4, @fg.l ld.p<? super R, ? super q.c, ? extends R> pVar) {
            return (R) v0.T5(v0Var, r4, pVar);
        }

        @Deprecated
        public static <R> R d(@fg.l v0 v0Var, R r4, @fg.l ld.p<? super q.c, ? super R, ? extends R> pVar) {
            return (R) v0.Q0(v0Var, r4, pVar);
        }

        @fg.l
        @Deprecated
        public static androidx.compose.ui.q e(@fg.l v0 v0Var, @fg.l androidx.compose.ui.q qVar) {
            return v0.super.w3(qVar);
        }
    }

    static Object Q0(v0 v0Var, Object obj, ld.p pVar) {
        v0Var.getClass();
        return pVar.invoke(v0Var, obj);
    }

    static Object T5(v0 v0Var, Object obj, ld.p pVar) {
        v0Var.getClass();
        return pVar.invoke(obj, v0Var);
    }

    void W(@fg.l u coordinates);
}
