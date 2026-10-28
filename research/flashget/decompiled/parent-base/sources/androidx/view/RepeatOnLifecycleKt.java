package androidx.view;

import androidx.view.AbstractC1450w;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.a;
import kotlin.k2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import ld.p;

/* compiled from: RepeatOnLifecycle.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aH\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aH\u0010\r\u001a\u00020\u0006*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/w;", "Landroidx/lifecycle/w$b;", "state", "Lkotlin/Function2;", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "block", "a", "(Landroidx/lifecycle/w;Landroidx/lifecycle/w$b;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/lifecycle/e0;", "b", "(Landroidx/lifecycle/e0;Landroidx/lifecycle/w$b;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "lifecycle-runtime-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RepeatOnLifecycleKt {
    @m
    public static final Object a(@l AbstractC1450w abstractC1450w, @l AbstractC1450w.b bVar, @l p<? super r0, ? super d<? super k2>, ? extends Object> pVar, @l d<? super k2> dVar) {
        if (bVar == AbstractC1450w.b.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (abstractC1450w.getState() == AbstractC1450w.b.DESTROYED) {
            return k2.f75408a;
        }
        Object g4 = s0.g(new RepeatOnLifecycleKt$repeatOnLifecycle$3(abstractC1450w, bVar, pVar, null), dVar);
        return g4 == a.COROUTINE_SUSPENDED ? g4 : k2.f75408a;
    }

    @m
    public static final Object b(@l InterfaceC1423e0 interfaceC1423e0, @l AbstractC1450w.b bVar, @l p<? super r0, ? super d<? super k2>, ? extends Object> pVar, @l d<? super k2> dVar) {
        Object a5 = a(interfaceC1423e0.getLifecycle(), bVar, pVar, dVar);
        return a5 == a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
    }
}
