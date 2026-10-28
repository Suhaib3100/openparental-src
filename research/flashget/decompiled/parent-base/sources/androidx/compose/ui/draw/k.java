package androidx.compose.ui.draw;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: DrawModifier.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/k;", "Landroidx/compose/ui/q$c;", "Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "E", "(Landroidx/compose/ui/graphics/drawscope/c;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface k extends q.c {

    /* compiled from: DrawModifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@fg.l k kVar, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return k.super.Z(lVar);
        }

        @Deprecated
        public static boolean b(@fg.l k kVar, @fg.l ld.l<? super q.c, Boolean> lVar) {
            return k.super.y(lVar);
        }

        @Deprecated
        public static <R> R c(@fg.l k kVar, R r4, @fg.l ld.p<? super R, ? super q.c, ? extends R> pVar) {
            return (R) k.a3(kVar, r4, pVar);
        }

        @Deprecated
        public static <R> R d(@fg.l k kVar, R r4, @fg.l ld.p<? super q.c, ? super R, ? extends R> pVar) {
            return (R) k.y1(kVar, r4, pVar);
        }

        @fg.l
        @Deprecated
        public static androidx.compose.ui.q e(@fg.l k kVar, @fg.l androidx.compose.ui.q qVar) {
            return k.super.w3(qVar);
        }
    }

    static Object a3(k kVar, Object obj, ld.p pVar) {
        kVar.getClass();
        return pVar.invoke(obj, kVar);
    }

    static Object y1(k kVar, Object obj, ld.p pVar) {
        kVar.getClass();
        return pVar.invoke(kVar, obj);
    }

    void E(@fg.l androidx.compose.ui.graphics.drawscope.c cVar);
}
