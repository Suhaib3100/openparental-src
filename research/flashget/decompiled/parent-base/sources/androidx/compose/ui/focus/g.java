package androidx.compose.ui.focus;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: FocusEventModifier.kt */
@kotlin.k(message = "Use FocusEventModifierNode instead")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/g;", "Landroidx/compose/ui/q$c;", "Landroidx/compose/ui/focus/j0;", "focusState", "Lkotlin/k2;", "e0", "(Landroidx/compose/ui/focus/j0;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface g extends q.c {

    /* compiled from: FocusEventModifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@fg.l g gVar, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return g.super.Z(lVar);
        }

        @Deprecated
        public static boolean b(@fg.l g gVar, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return g.super.y(lVar);
        }

        @Deprecated
        public static <R> R c(@fg.l g gVar, R r4, @fg.l ld.p<? super R, ? super q.c, ? extends R> pVar) {
            return (R) g.c1(gVar, r4, pVar);
        }

        @Deprecated
        public static <R> R d(@fg.l g gVar, R r4, @fg.l ld.p<? super q.c, ? super R, ? extends R> pVar) {
            return (R) g.M0(gVar, r4, pVar);
        }

        @fg.l
        @Deprecated
        public static androidx.compose.ui.q e(@fg.l g gVar, @fg.l androidx.compose.ui.q qVar) {
            return g.super.w3(qVar);
        }
    }

    static Object M0(g gVar, Object obj, ld.p pVar) {
        gVar.getClass();
        return pVar.invoke(gVar, obj);
    }

    static Object c1(g gVar, Object obj, ld.p pVar) {
        gVar.getClass();
        return pVar.invoke(obj, gVar);
    }

    void e0(@fg.l j0 focusState);
}
