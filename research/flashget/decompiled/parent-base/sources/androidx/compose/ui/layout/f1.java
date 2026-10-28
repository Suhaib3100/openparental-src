package androidx.compose.ui.layout;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: ParentDataModifier.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u0003*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/f1;", "Landroidx/compose/ui/q$c;", "Landroidx/compose/ui/unit/d;", "", "parentData", "T", "(Landroidx/compose/ui/unit/d;Ljava/lang/Object;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface f1 extends q.c {

    /* compiled from: ParentDataModifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@fg.l f1 f1Var, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return f1.super.Z(lVar);
        }

        @Deprecated
        public static boolean b(@fg.l f1 f1Var, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return f1.super.y(lVar);
        }

        @Deprecated
        public static <R> R c(@fg.l f1 f1Var, R r4, @fg.l ld.p<? super R, ? super q.c, ? extends R> pVar) {
            return (R) f1.c3(f1Var, r4, pVar);
        }

        @Deprecated
        public static <R> R d(@fg.l f1 f1Var, R r4, @fg.l ld.p<? super q.c, ? super R, ? extends R> pVar) {
            return (R) f1.v2(f1Var, r4, pVar);
        }

        @fg.l
        @Deprecated
        public static androidx.compose.ui.q e(@fg.l f1 f1Var, @fg.l androidx.compose.ui.q qVar) {
            return f1.super.w3(qVar);
        }
    }

    static Object c3(f1 f1Var, Object obj, ld.p pVar) {
        f1Var.getClass();
        return pVar.invoke(obj, f1Var);
    }

    static Object v2(f1 f1Var, Object obj, ld.p pVar) {
        f1Var.getClass();
        return pVar.invoke(f1Var, obj);
    }

    @fg.m
    Object T(@fg.l androidx.compose.ui.unit.d dVar, @fg.m Object obj);
}
