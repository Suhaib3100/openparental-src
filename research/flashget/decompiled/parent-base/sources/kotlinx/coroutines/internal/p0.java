package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.internal.p0;
import kotlinx.coroutines.z2;

/* compiled from: ConcurrentLinkedList.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\rR\u000b\u0010!\u001a\u00020 8\u0002X\u0082\u0004¨\u0006\""}, d2 = {"Lkotlinx/coroutines/internal/p0;", "S", "Lkotlinx/coroutines/internal/g;", "Lkotlinx/coroutines/z2;", "", "id", "prev", "", "pointers", "<init>", "(JLkotlinx/coroutines/internal/p0;I)V", "", "s", "()Z", "o", "index", "", "cause", "Lkotlin/coroutines/g;", "context", "Lkotlin/k2;", "q", "(ILjava/lang/Throwable;Lkotlin/coroutines/g;)V", "r", "()V", "d", "J", "p", "()I", "numberOfSlots", "h", "isRemoved", "Lkotlinx/atomicfu/AtomicInt;", "cleanedAndPointers", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n1#1,269:1\n252#2,4:270\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n*L\n225#1:270,4\n*E\n"})
/* loaded from: classes7.dex */
public abstract class p0<S extends p0<S>> extends g<S> implements z2 {

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final AtomicIntegerFieldUpdater f80805e = AtomicIntegerFieldUpdater.newUpdater(p0.class, ProtectedSandApp.s("虠\u0001"));

    @kd.x
    private volatile int cleanedAndPointers;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final long id;

    public p0(long j4, @fg.m S s4, int i4) {
        super(s4);
        this.id = j4;
        this.cleanedAndPointers = i4 << 16;
    }

    @Override // kotlinx.coroutines.internal.g
    public boolean h() {
        return f80805e.get(this) == p() && !i();
    }

    public final boolean o() {
        return f80805e.addAndGet(this, c1.a.f38447c) == p() && !i();
    }

    public abstract int p();

    public abstract void q(int index, @fg.m Throwable cause, @fg.l kotlin.coroutines.g context);

    public final void r() {
        if (f80805e.incrementAndGet(this) == p()) {
            l();
        }
    }

    public final boolean s() {
        int i4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f80805e;
        do {
            i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 == p() && !i()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 65536 + i4));
        return true;
    }
}
