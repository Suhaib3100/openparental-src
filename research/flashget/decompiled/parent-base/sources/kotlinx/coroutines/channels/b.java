package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.k2;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.r2;
import kotlinx.coroutines.t0;

/* compiled from: Actor.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009e\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062-\b\u0002\u0010\u000f\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bj\u0004\u0018\u0001`\u000e2-\u0010\u0015\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"E", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/t0;", "start", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "Lkotlin/k2;", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/c;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "Lkotlinx/coroutines/channels/e0;", "a", "(Lkotlinx/coroutines/r0;Lkotlin/coroutines/g;ILkotlinx/coroutines/t0;Lld/l;Lld/p;)Lkotlinx/coroutines/channels/e0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b {
    @fg.l
    @a3
    public static final <E> e0<E> a(@fg.l r0 r0Var, @fg.l kotlin.coroutines.g gVar, int i4, @fg.l t0 t0Var, @fg.m ld.l<? super Throwable, k2> lVar, @fg.l ld.p<? super c<E>, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar) {
        kotlin.coroutines.g e4 = l0.e(r0Var, gVar);
        l d5 = o.d(i4, null, null, 6, null);
        a xVar = t0Var.isLazy() ? new x(e4, d5, pVar) : new a(e4, d5, true);
        if (lVar != null) {
            ((r2) xVar).F(lVar);
        }
        t0Var.invoke(pVar, xVar, (kotlin.coroutines.d) xVar);
        return (e0<E>) xVar;
    }

    public static /* synthetic */ e0 b(r0 r0Var, kotlin.coroutines.g gVar, int i4, t0 t0Var, ld.l lVar, ld.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            gVar = kotlin.coroutines.i.f75057b;
        }
        kotlin.coroutines.g gVar2 = gVar;
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        int i6 = i4;
        if ((i5 & 4) != 0) {
            t0Var = t0.DEFAULT;
        }
        t0 t0Var2 = t0Var;
        if ((i5 & 8) != 0) {
            lVar = null;
        }
        return a(r0Var, gVar2, i6, t0Var2, lVar, pVar);
    }
}
