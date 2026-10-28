package me;

import fg.l;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.z0;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.internal.m;
import ld.p;

/* compiled from: Cancellable.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a{\u0010\u0010\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0013\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00050\u00022\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u0017\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015H\u0082\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u0019\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"T", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "completion", "Lkotlin/k2;", "d", "(Lld/l;Lkotlin/coroutines/d;)V", "R", "Lkotlin/Function2;", "receiver", "", "Lkotlin/r0;", "name", "cause", "onCancellation", "e", "(Lld/p;Ljava/lang/Object;Lkotlin/coroutines/d;Lld/l;)V", "fatalCompletion", "c", "(Lkotlin/coroutines/d;Lkotlin/coroutines/d;)V", "Lkotlin/Function0;", "block", "b", "(Lkotlin/coroutines/d;Lld/a;)V", "a", "(Lkotlin/coroutines/d;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nCancellable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n1#1,68:1\n49#1,6:69\n49#1,6:75\n49#1,6:81\n*S KotlinDebug\n*F\n+ 1 Cancellable.kt\nkotlinx/coroutines/intrinsics/CancellableKt\n*L\n17#1:69,6\n29#1:75,6\n38#1:81,6\n*E\n"})
/* loaded from: classes7.dex */
public final class a {
    private static final void a(d<?> dVar, Throwable th) {
        z0.Companion companion = z0.INSTANCE;
        dVar.resumeWith(a1.a(th));
        throw th;
    }

    private static final void b(d<?> dVar, ld.a<k2> aVar) {
        try {
            aVar.invoke();
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static final void c(@l d<? super k2> dVar, @l d<?> dVar2) {
        try {
            d e4 = kotlin.coroutines.intrinsics.b.e(dVar);
            z0.Companion companion = z0.INSTANCE;
            m.e(e4, k2.f75408a, null, 2, null);
        } catch (Throwable th) {
            a(dVar2, th);
        }
    }

    @f2
    public static final <T> void d(@l ld.l<? super d<? super T>, ? extends Object> lVar, @l d<? super T> dVar) {
        try {
            d e4 = kotlin.coroutines.intrinsics.b.e(kotlin.coroutines.intrinsics.b.b(lVar, dVar));
            z0.Companion companion = z0.INSTANCE;
            m.e(e4, k2.f75408a, null, 2, null);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static final <R, T> void e(@l p<? super R, ? super d<? super T>, ? extends Object> pVar, R r4, @l d<? super T> dVar, @fg.m ld.l<? super Throwable, k2> lVar) {
        try {
            d e4 = kotlin.coroutines.intrinsics.b.e(kotlin.coroutines.intrinsics.b.c(pVar, r4, dVar));
            z0.Companion companion = z0.INSTANCE;
            m.d(e4, k2.f75408a, lVar);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static /* synthetic */ void f(p pVar, Object obj, d dVar, ld.l lVar, int i4, Object obj2) {
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        e(pVar, obj, dVar, lVar);
    }
}
