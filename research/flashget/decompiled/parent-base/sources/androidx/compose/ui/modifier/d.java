package androidx.compose.ui.modifier;

import androidx.compose.runtime.x4;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: ModifierLocalConsumer.kt */
@x4
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/modifier/d;", "Landroidx/compose/ui/q$c;", "Landroidx/compose/ui/modifier/n;", "scope", "Lkotlin/k2;", "e4", "(Landroidx/compose/ui/modifier/n;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface d extends q.c {

    /* compiled from: ModifierLocalConsumer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@fg.l d dVar, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return d.super.Z(lVar);
        }

        @Deprecated
        public static boolean b(@fg.l d dVar, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return d.super.y(lVar);
        }

        @Deprecated
        public static <R> R c(@fg.l d dVar, R r4, @fg.l ld.p<? super R, ? super q.c, ? extends R> pVar) {
            return (R) d.c4(dVar, r4, pVar);
        }

        @Deprecated
        public static <R> R d(@fg.l d dVar, R r4, @fg.l ld.p<? super q.c, ? super R, ? extends R> pVar) {
            return (R) d.H4(dVar, r4, pVar);
        }

        @fg.l
        @Deprecated
        public static androidx.compose.ui.q e(@fg.l d dVar, @fg.l androidx.compose.ui.q qVar) {
            return d.super.w3(qVar);
        }
    }

    static Object H4(d dVar, Object obj, ld.p pVar) {
        dVar.getClass();
        return pVar.invoke(dVar, obj);
    }

    static Object c4(d dVar, Object obj, ld.p pVar) {
        dVar.getClass();
        return pVar.invoke(obj, dVar);
    }

    void e4(@fg.l n scope);
}
