package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: Atomic.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&J\u001e\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H&R&\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/internal/b;", "", "Lkotlinx/coroutines/internal/d;", "op", "c", "failure", "Lkotlin/m2;", "a", "Lkotlinx/coroutines/internal/d;", "b", "()Lkotlinx/coroutines/internal/d;", "d", "(Lkotlinx/coroutines/internal/d;)V", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public d<?> atomicOp;

    public abstract void a(@d5.d d<?> dVar, @d5.e Object obj);

    @d5.d
    public final d<?> b() {
        d<?> dVar = this.atomicOp;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.l0.S(ProtectedSandApp.s("巍"));
        return null;
    }

    @d5.e
    public abstract Object c(@d5.d d<?> op);

    public final void d(@d5.d d<?> dVar) {
        this.atomicOp = dVar;
    }
}
