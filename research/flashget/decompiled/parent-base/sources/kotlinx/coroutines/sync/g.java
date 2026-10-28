package kotlinx.coroutines.sync;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.util.concurrent.d2;
import fg.l;
import fg.m;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.internal.p0;
import kotlinx.coroutines.internal.s0;

/* compiled from: Semaphore.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0010\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0#8\u0006¨\u0006%"}, d2 = {"Lkotlinx/coroutines/sync/g;", "Lkotlinx/coroutines/internal/p0;", "", "id", "prev", "", "pointers", "<init>", "(JLkotlinx/coroutines/sync/g;I)V", "index", "", "u", "(I)Ljava/lang/Object;", "value", "Lkotlin/k2;", "x", "(ILjava/lang/Object;)V", "expected", "", "t", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "w", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "cause", "Lkotlin/coroutines/g;", "context", "q", "(ILjava/lang/Throwable;Lkotlin/coroutines/g;)V", "", "toString", "()Ljava/lang/String;", "p", "()I", "numberOfSlots", "Lkotlinx/atomicfu/AtomicArray;", "acquirers", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,397:1\n371#1,2:398\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n384#1:398,2\n*E\n"})
/* loaded from: classes7.dex */
final class g extends p0<g> {

    /* renamed from: f, reason: collision with root package name */
    @l
    private final AtomicReferenceArray f81146f;

    public g(long j4, @m g gVar, int i4) {
        super(j4, gVar, i4);
        int i5;
        i5 = f.f81141f;
        this.f81146f = new AtomicReferenceArray(i5);
    }

    @Override // kotlinx.coroutines.internal.p0
    public int p() {
        int i4;
        i4 = f.f81141f;
        return i4;
    }

    @Override // kotlinx.coroutines.internal.p0
    public void q(int index, @m Throwable cause, @l kotlin.coroutines.g context) {
        s0 s0Var;
        s0Var = f.f81140e;
        this.f81146f.set(index, s0Var);
        r();
    }

    public final boolean t(int index, @m Object expected, @m Object value) {
        return d2.a(this.f81146f, index, expected, value);
    }

    @l
    public String toString() {
        return ProtectedSandApp.s("裸\u0001") + this.id + ProtectedSandApp.s("裹\u0001") + hashCode() + ']';
    }

    @m
    public final Object u(int index) {
        return this.f81146f.get(index);
    }

    @l
    /* renamed from: v, reason: from getter */
    public final AtomicReferenceArray getF81146f() {
        return this.f81146f;
    }

    @m
    public final Object w(int index, @m Object value) {
        return this.f81146f.getAndSet(index, value);
    }

    public final void x(int index, @m Object value) {
        this.f81146f.set(index, value);
    }
}
