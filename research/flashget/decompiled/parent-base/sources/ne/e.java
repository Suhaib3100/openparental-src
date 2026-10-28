package ne;

import fg.l;
import fg.m;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.k2;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.u3;
import ld.p;

/* compiled from: Time.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0007\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\n\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\t\u001aF\u0010\u0012\u001a\u00020\u0002\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0001\u001a\u00020\u00002\u001c\u0010\u0011\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aW\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0001\u001a\u00020\u00002'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0014¢\u0006\u0002\b\u0016H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001aL\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0001\u001a\u00020\u00002'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0014¢\u0006\u0002\b\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Ljava/time/Duration;", "duration", "Lkotlin/k2;", "c", "(Ljava/time/Duration;Lkotlin/coroutines/d;)Ljava/lang/Object;", "T", "Lkotlinx/coroutines/flow/i;", "timeout", "b", "(Lkotlinx/coroutines/flow/i;Ljava/time/Duration;)Lkotlinx/coroutines/flow/i;", "period", "e", "R", "Lkotlinx/coroutines/selects/c;", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "d", "(Lkotlinx/coroutines/selects/c;Ljava/time/Duration;Lld/l;)V", "Lkotlin/Function2;", "Lkotlinx/coroutines/r0;", "Lkotlin/u;", "f", "(Ljava/time/Duration;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "g", "", "a", "(Ljava/time/Duration;)J", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class e {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r0 < 807000000) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final long a(java.time.Duration r4) {
        /*
            java.time.Duration r0 = ne.a.a()
            int r0 = ne.b.a(r4, r0)
            if (r0 > 0) goto Ld
            r0 = 0
            return r0
        Ld:
            java.time.temporal.ChronoUnit r0 = ne.c.a()
            java.time.Duration r0 = ne.d.a(r0)
            int r0 = ne.b.a(r4, r0)
            if (r0 > 0) goto L1e
            r0 = 1
            return r0
        L1e:
            long r0 = ie.a.a(r4)
            r2 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L43
            long r0 = ie.a.a(r4)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L3d
            int r0 = ie.b.a(r4)
            r1 = 807000000(0x3019d7c0, float:5.5967675E-10)
            if (r0 >= r1) goto L3d
            goto L43
        L3d:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L47
        L43:
            long r0 = androidx.work.c.a(r4)
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ne.e.a(java.time.Duration):long");
    }

    @l
    @a2
    public static final <T> i<T> b(@l i<? extends T> iVar, @l Duration duration) {
        return k.a0(iVar, a(duration));
    }

    @m
    public static final Object c(@l Duration duration, @l kotlin.coroutines.d<? super k2> dVar) {
        Object b5 = c1.b(a(duration), dVar);
        return b5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? b5 : k2.f75408a;
    }

    public static final <R> void d(@l kotlinx.coroutines.selects.c<? super R> cVar, @l Duration duration, @l ld.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar) {
        kotlinx.coroutines.selects.b.a(cVar, a(duration), lVar);
    }

    @l
    @a2
    public static final <T> i<T> e(@l i<? extends T> iVar, @l Duration duration) {
        return k.B1(iVar, a(duration));
    }

    @m
    public static final <T> Object f(@l Duration duration, @l p<? super r0, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, @l kotlin.coroutines.d<? super T> dVar) {
        return u3.c(a(duration), pVar, dVar);
    }

    @m
    public static final <T> Object g(@l Duration duration, @l p<? super r0, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, @l kotlin.coroutines.d<? super T> dVar) {
        return u3.e(a(duration), pVar, dVar);
    }
}
