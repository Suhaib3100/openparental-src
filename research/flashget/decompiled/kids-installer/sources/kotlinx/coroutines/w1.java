package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: EventLoop.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\b\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0019\u0010\u0007\u001a\u00020\u00052\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\b¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/t1;", "a", "", "c", "Lkotlin/Function0;", "Lkotlin/m2;", "block", "b", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class w1 {
    @d5.d
    public static final t1 a() {
        return new i(Thread.currentThread());
    }

    public static final void b(@d5.d q3.a<kotlin.m2> aVar) {
        aVar.n();
    }

    @i2
    public static final long c() {
        t1 a6 = t3.f29007a.a();
        if (a6 != null) {
            return a6.i1();
        }
        return Long.MAX_VALUE;
    }
}
