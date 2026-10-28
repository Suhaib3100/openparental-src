package androidx.compose.ui.semantics;

import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.x0;

/* compiled from: SemanticsModifier.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/n;", "Landroidx/compose/ui/q$c;", "", "a", "()I", "getId$annotations", "()V", "id", "Landroidx/compose/ui/semantics/l;", "v6", "()Landroidx/compose/ui/semantics/l;", "semanticsConfiguration", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface n extends q.c {

    /* compiled from: SemanticsModifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@fg.l n nVar, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return n.super.Z(lVar);
        }

        @Deprecated
        public static boolean b(@fg.l n nVar, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return n.super.y(lVar);
        }

        @Deprecated
        public static <R> R c(@fg.l n nVar, R r4, @fg.l ld.p<? super R, ? super q.c, ? extends R> pVar) {
            return (R) n.y6(nVar, r4, pVar);
        }

        @Deprecated
        public static <R> R d(@fg.l n nVar, R r4, @fg.l ld.p<? super q.c, ? super R, ? extends R> pVar) {
            return (R) n.N5(nVar, r4, pVar);
        }

        @Deprecated
        public static int e(@fg.l n nVar) {
            nVar.getClass();
            return -1;
        }

        @kotlin.k(message = "SemanticsModifier.id is now unused and has been set to a fixed value. Retrieve the id from LayoutInfo instead.", replaceWith = @x0(expression = "", imports = {}))
        public static /* synthetic */ void f() {
        }

        @fg.l
        @Deprecated
        public static androidx.compose.ui.q g(@fg.l n nVar, @fg.l androidx.compose.ui.q qVar) {
            return n.super.w3(qVar);
        }
    }

    static int K0(n nVar) {
        nVar.getClass();
        return -1;
    }

    static Object N5(n nVar, Object obj, ld.p pVar) {
        nVar.getClass();
        return pVar.invoke(nVar, obj);
    }

    static Object y6(n nVar, Object obj, ld.p pVar) {
        nVar.getClass();
        return pVar.invoke(obj, nVar);
    }

    default int a() {
        return -1;
    }

    @fg.l
    l v6();
}
