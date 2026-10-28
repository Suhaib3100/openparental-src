package com.google.maps.android.compose;

import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: MapApplier.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u009c\u0001\u0010\r\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00000\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00052%\u0010\t\u001a!\u0012\u0004\u0012\u00028\u0000\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00050\u0005¢\u0006\u0002\b\b2\u0006\u0010\n\u001a\u00028\u00012%\u0010\f\u001a!\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00050\u0005¢\u0006\u0002\b\bH\u0082\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/maps/android/compose/o0;", "NodeT", "I", "O", "", "Lkotlin/Function1;", "", "nodeMatchPredicate", "Lkotlin/u;", "nodeInputCallback", "marker", "Lcom/google/maps/android/compose/s;", "inputHandlerCallback", "a", "(Ljava/lang/Iterable;Lld/l;Lld/l;Ljava/lang/Object;Lld/l;)Z", "maps-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class c0 {
    private static final <NodeT extends o0, I, O> boolean a(Iterable<? extends o0> iterable, ld.l<? super NodeT, Boolean> lVar, ld.l<? super NodeT, ? extends ld.l<? super I, ? extends O>> lVar2, I i4, ld.l<? super s, ? extends ld.l<? super I, ? extends O>> lVar3) {
        Iterator<? extends o0> it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            o0 next = it.next();
            kotlin.jvm.internal.l0.P();
            if (next != null && lVar.invoke(next).booleanValue()) {
                ld.l<? super I, ? extends O> invoke = lVar2.invoke(next);
                if (invoke != null ? kotlin.jvm.internal.l0.g(invoke.invoke(i4), Boolean.TRUE) : false) {
                    return true;
                }
            } else if (next instanceof s) {
                ld.l<? super I, ? extends O> invoke2 = lVar3.invoke(next);
                if (invoke2 != null ? kotlin.jvm.internal.l0.g(invoke2.invoke(i4), Boolean.TRUE) : false) {
                    return true;
                }
            } else {
                continue;
            }
        }
    }
}
