package androidx.compose.ui.draw;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: DrawModifier.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/j;", "Landroidx/compose/ui/draw/k;", "Landroidx/compose/ui/draw/d;", "params", "Lkotlin/k2;", "y4", "(Landroidx/compose/ui/draw/d;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface j extends k {

    /* compiled from: DrawModifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@fg.l j jVar, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return j.super.Z(lVar);
        }

        @Deprecated
        public static boolean b(@fg.l j jVar, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return j.super.y(lVar);
        }

        @Deprecated
        public static <R> R c(@fg.l j jVar, R r4, @fg.l ld.p<? super R, ? super q.c, ? extends R> pVar) {
            return (R) j.N0(jVar, r4, pVar);
        }

        @Deprecated
        public static <R> R d(@fg.l j jVar, R r4, @fg.l ld.p<? super q.c, ? super R, ? extends R> pVar) {
            return (R) j.w6(jVar, r4, pVar);
        }

        @fg.l
        @Deprecated
        public static androidx.compose.ui.q e(@fg.l j jVar, @fg.l androidx.compose.ui.q qVar) {
            return j.super.w3(qVar);
        }
    }

    static Object N0(j jVar, Object obj, ld.p pVar) {
        jVar.getClass();
        return pVar.invoke(obj, jVar);
    }

    static Object w6(j jVar, Object obj, ld.p pVar) {
        jVar.getClass();
        return pVar.invoke(jVar, obj);
    }

    void y4(@fg.l d params);
}
