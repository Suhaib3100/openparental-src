package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.CoroutineContext;

/* compiled from: ThreadContext.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003HÂ\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\f\b\u0002\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/internal/y0;", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/internal/x0;", "Ljava/lang/ThreadLocal;", "a", "threadLocal", "b", "", "toString", "", "hashCode", "", "other", "", "equals", "o", "Ljava/lang/ThreadLocal;", "<init>", "(Ljava/lang/ThreadLocal;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@PublishedApi
/* loaded from: classes5.dex */
public final /* data */ class y0 implements CoroutineContext.c<x0<?>> {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final ThreadLocal<?> threadLocal;

    public y0(@d5.d ThreadLocal<?> threadLocal) {
        this.threadLocal = threadLocal;
    }

    private final ThreadLocal<?> a() {
        return this.threadLocal;
    }

    public static y0 c(y0 y0Var, ThreadLocal threadLocal, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            threadLocal = y0Var.threadLocal;
        }
        y0Var.getClass();
        return new y0(threadLocal);
    }

    @d5.d
    public final y0 b(@d5.d ThreadLocal<?> threadLocal) {
        return new y0(threadLocal);
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof y0) && kotlin.jvm.internal.l0.g(this.threadLocal, ((y0) other).threadLocal);
    }

    public int hashCode() {
        return this.threadLocal.hashCode();
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("帋") + this.threadLocal + ')';
    }
}
