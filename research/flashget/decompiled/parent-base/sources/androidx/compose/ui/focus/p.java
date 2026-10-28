package androidx.compose.ui.focus;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: FocusOrderModifier.kt */
@kotlin.k(message = "Use Modifier.focusProperties() instead")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/p;", "Landroidx/compose/ui/q$c;", "Landroidx/compose/ui/focus/o;", "focusOrder", "Lkotlin/k2;", "R4", "(Landroidx/compose/ui/focus/o;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface p extends q.c {

    /* compiled from: FocusOrderModifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@fg.l p pVar, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return p.super.Z(lVar);
        }

        @Deprecated
        public static boolean b(@fg.l p pVar, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return p.super.y(lVar);
        }

        @Deprecated
        public static <R> R c(@fg.l p pVar, R r4, @fg.l ld.p<? super R, ? super q.c, ? extends R> pVar2) {
            return (R) p.F3(pVar, r4, pVar2);
        }

        @Deprecated
        public static <R> R d(@fg.l p pVar, R r4, @fg.l ld.p<? super q.c, ? super R, ? extends R> pVar2) {
            return (R) p.W1(pVar, r4, pVar2);
        }

        @fg.l
        @Deprecated
        public static androidx.compose.ui.q e(@fg.l p pVar, @fg.l androidx.compose.ui.q qVar) {
            return p.super.w3(qVar);
        }
    }

    static Object F3(p pVar, Object obj, ld.p pVar2) {
        pVar.getClass();
        return pVar2.invoke(obj, pVar);
    }

    static Object W1(p pVar, Object obj, ld.p pVar2) {
        pVar.getClass();
        return pVar2.invoke(pVar, obj);
    }

    void R4(@fg.l o focusOrder);
}
