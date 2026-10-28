package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.g;

/* compiled from: ThreadContext.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0003HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/internal/a1;", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/internal/z0;", "Ljava/lang/ThreadLocal;", "threadLocal", "<init>", "(Ljava/lang/ThreadLocal;)V", "a", "()Ljava/lang/ThreadLocal;", "b", "(Ljava/lang/ThreadLocal;)Lkotlinx/coroutines/internal/a1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/ThreadLocal;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.w0
/* loaded from: classes7.dex */
public final /* data */ class a1 implements g.c<z0<?>> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ThreadLocal<?> threadLocal;

    public a1(@fg.l ThreadLocal<?> threadLocal) {
        this.threadLocal = threadLocal;
    }

    private final ThreadLocal<?> a() {
        return this.threadLocal;
    }

    public static a1 c(a1 a1Var, ThreadLocal threadLocal, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            threadLocal = a1Var.threadLocal;
        }
        a1Var.getClass();
        return new a1(threadLocal);
    }

    @fg.l
    public final a1 b(@fg.l ThreadLocal<?> threadLocal) {
        return new a1(threadLocal);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof a1) && kotlin.jvm.internal.l0.g(this.threadLocal, ((a1) other).threadLocal);
    }

    public int hashCode() {
        return this.threadLocal.hashCode();
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("蟓\u0001") + this.threadLocal + ')';
    }
}
