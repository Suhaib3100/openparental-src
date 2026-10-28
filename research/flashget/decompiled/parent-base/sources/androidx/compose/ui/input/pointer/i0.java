package androidx.compose.ui.input.pointer;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: PointerEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/i0;", "Landroidx/compose/ui/q$c;", "Landroidx/compose/ui/input/pointer/h0;", "T4", "()Landroidx/compose/ui/input/pointer/h0;", "pointerInputFilter", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface i0 extends q.c {

    /* compiled from: PointerEvent.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@fg.l i0 i0Var, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return i0.super.Z(lVar);
        }

        @Deprecated
        public static boolean b(@fg.l i0 i0Var, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return i0.super.y(lVar);
        }

        @Deprecated
        public static <R> R c(@fg.l i0 i0Var, R r4, @fg.l ld.p<? super R, ? super q.c, ? extends R> pVar) {
            return (R) i0.g6(i0Var, r4, pVar);
        }

        @Deprecated
        public static <R> R d(@fg.l i0 i0Var, R r4, @fg.l ld.p<? super q.c, ? super R, ? extends R> pVar) {
            return (R) i0.H5(i0Var, r4, pVar);
        }

        @fg.l
        @Deprecated
        public static androidx.compose.ui.q e(@fg.l i0 i0Var, @fg.l androidx.compose.ui.q qVar) {
            return i0.super.w3(qVar);
        }
    }

    static Object H5(i0 i0Var, Object obj, ld.p pVar) {
        i0Var.getClass();
        return pVar.invoke(i0Var, obj);
    }

    static Object g6(i0 i0Var, Object obj, ld.p pVar) {
        i0Var.getClass();
        return pVar.invoke(obj, i0Var);
    }

    @fg.l
    /* renamed from: T4 */
    h0 getPointerInputFilter();
}
