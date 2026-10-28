package kotlinx.coroutines.sync;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.internal.r0;

/* compiled from: Semaphore.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\t\u0010\nJ,\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/sync/i;", "Lkotlinx/coroutines/internal/o0;", "", "index", "", "u", "(I)Ljava/lang/Object;", "value", "Lkotlin/m2;", "w", "(ILjava/lang/Object;)V", "expected", "", "t", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "v", "(ILjava/lang/Object;)Ljava/lang/Object;", "s", "(I)V", "", "toString", "()Ljava/lang/String;", "p", "()I", "maxSlots", "", "id", "prev", "pointers", "<init>", "(JLkotlinx/coroutines/sync/i;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class i extends o0<i> {

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    /* synthetic */ AtomicReferenceArray f28996e;

    public i(long j5, @d5.e i iVar, int i5) {
        super(j5, iVar, i5);
        int i6;
        i6 = h.f28991f;
        this.f28996e = new AtomicReferenceArray(i6);
    }

    @Override // kotlinx.coroutines.internal.o0
    public int p() {
        int i5;
        i5 = h.f28991f;
        return i5;
    }

    public final void s(int index) {
        r0 r0Var;
        r0Var = h.f28990e;
        this.f28996e.set(index, r0Var);
        q();
    }

    public final boolean t(int index, @d5.e Object expected, @d5.e Object value) {
        return kotlinx.coroutines.debug.internal.b.a(this.f28996e, index, expected, value);
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("醉") + getId() + ProtectedSandApp.s("醊") + hashCode() + ']';
    }

    @d5.e
    public final Object u(int index) {
        return this.f28996e.get(index);
    }

    @d5.e
    public final Object v(int index, @d5.e Object value) {
        return this.f28996e.getAndSet(index, value);
    }

    public final void w(int index, @d5.e Object value) {
        this.f28996e.set(index, value);
    }
}
