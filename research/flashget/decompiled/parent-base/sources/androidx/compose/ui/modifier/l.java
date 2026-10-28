package androidx.compose.ui.modifier;

import androidx.compose.runtime.x4;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: ModifierLocalProvider.kt */
@x4
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/modifier/l;", "T", "Landroidx/compose/ui/q$c;", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "key", "getValue", "()Ljava/lang/Object;", "value", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface l<T> extends q.c {

    /* compiled from: ModifierLocalProvider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static <T> boolean a(@fg.l l<T> lVar, @fg.l ld.l<? super q.c, Boolean> lVar2) {
            return l.super.Z(lVar2);
        }

        @Deprecated
        public static <T> boolean b(@fg.l l<T> lVar, @fg.l ld.l<? super q.c, Boolean> lVar2) {
            return l.super.y(lVar2);
        }

        @Deprecated
        public static <T, R> R c(@fg.l l<T> lVar, R r4, @fg.l ld.p<? super R, ? super q.c, ? extends R> pVar) {
            return (R) l.t6(lVar, r4, pVar);
        }

        @Deprecated
        public static <T, R> R d(@fg.l l<T> lVar, R r4, @fg.l ld.p<? super q.c, ? super R, ? extends R> pVar) {
            return (R) l.b4(lVar, r4, pVar);
        }

        @fg.l
        @Deprecated
        public static <T> androidx.compose.ui.q e(@fg.l l<T> lVar, @fg.l androidx.compose.ui.q qVar) {
            return l.super.w3(qVar);
        }
    }

    static Object b4(l lVar, Object obj, ld.p pVar) {
        lVar.getClass();
        return pVar.invoke(lVar, obj);
    }

    static Object t6(l lVar, Object obj, ld.p pVar) {
        lVar.getClass();
        return pVar.invoke(obj, lVar);
    }

    @fg.l
    p<T> getKey();

    T getValue();
}
