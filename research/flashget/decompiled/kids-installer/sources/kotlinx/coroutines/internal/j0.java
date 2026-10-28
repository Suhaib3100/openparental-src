package kotlinx.coroutines.internal;

import kotlin.Metadata;

/* compiled from: Atomic.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000R\u001a\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/internal/j0;", "", "affected", "c", "", "toString", "that", "", "b", "Lkotlinx/coroutines/internal/d;", "a", "()Lkotlinx/coroutines/internal/d;", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public abstract class j0 {
    @d5.e
    public abstract d<?> a();

    public final boolean b(@d5.d j0 that) {
        d<?> a6;
        d<?> a7 = a();
        return (a7 == null || (a6 = that.a()) == null || a7.g() >= a6.g()) ? false : true;
    }

    @d5.e
    public abstract Object c(@d5.e Object affected);

    @d5.d
    public String toString() {
        return kotlinx.coroutines.z0.a(this) + '@' + kotlinx.coroutines.z0.b(this);
    }
}
