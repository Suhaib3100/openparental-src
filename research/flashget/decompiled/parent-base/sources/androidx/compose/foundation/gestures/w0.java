package androidx.compose.foundation.gestures;

import androidx.compose.foundation.a2;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: ScrollableState.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001JC\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\b\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/w0;", "", "Landroidx/compose/foundation/a2;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/q0;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "Lkotlin/u;", "block", "f", "(Landroidx/compose/foundation/a2;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "delta", "b", "(F)F", "", "d", "()Z", "isScrollInProgress", "a", "canScrollForward", "e", "canScrollBackward", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface w0 {

    /* compiled from: ScrollableState.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static boolean a(@fg.l w0 w0Var) {
            w0Var.getClass();
            return true;
        }

        @Deprecated
        public static boolean b(@fg.l w0 w0Var) {
            w0Var.getClass();
            return true;
        }
    }

    static boolean c(w0 w0Var) {
        w0Var.getClass();
        return true;
    }

    static boolean g(w0 w0Var) {
        w0Var.getClass();
        return true;
    }

    static /* synthetic */ Object h(w0 w0Var, a2 a2Var, ld.p pVar, kotlin.coroutines.d dVar, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if ((i4 & 1) != 0) {
            a2Var = a2.Default;
        }
        return w0Var.f(a2Var, pVar, dVar);
    }

    default boolean a() {
        return true;
    }

    float b(float delta);

    boolean d();

    default boolean e() {
        return true;
    }

    @fg.m
    Object f(@fg.l a2 a2Var, @fg.l ld.p<? super q0, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super k2> dVar);
}
