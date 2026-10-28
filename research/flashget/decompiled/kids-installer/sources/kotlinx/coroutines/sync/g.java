package kotlinx.coroutines.sync;

import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Lambda;
import kotlin.m2;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.internal.p0;
import kotlinx.coroutines.internal.r0;
import kotlinx.coroutines.q;
import kotlinx.coroutines.u;
import q3.l;

/* compiled from: Semaphore.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/sync/g;", "Lkotlinx/coroutines/sync/f;", "Lkotlin/m2;", "g", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/q;", "cont", "", "h", "(Lkotlinx/coroutines/q;)Z", "j", "()Z", "i", "c", "b", "release", "()V", "", "a", "I", "permits", "Lkotlin/Function1;", "", "Lq3/l;", "onCancellationRelease", "()I", "availablePermits", "acquiredPermits", "<init>", "(II)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
final class g implements f {

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28978c = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, ProtectedSandApp.s("幱"));

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f28979d = AtomicLongFieldUpdater.newUpdater(g.class, ProtectedSandApp.s("干"));

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28980e = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, ProtectedSandApp.s("平"));

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f28981f = AtomicLongFieldUpdater.newUpdater(g.class, ProtectedSandApp.s("年"));

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ AtomicIntegerFieldUpdater f28982g = AtomicIntegerFieldUpdater.newUpdater(g.class, ProtectedSandApp.s("幵"));

    @d5.d
    volatile /* synthetic */ int _availablePermits;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int permits;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final l<Throwable, m2> onCancellationRelease;

    @d5.d
    private volatile /* synthetic */ long deqIdx = 0;

    @d5.d
    private volatile /* synthetic */ long enqIdx = 0;

    @d5.d
    private volatile /* synthetic */ Object head;

    @d5.d
    private volatile /* synthetic */ Object tail;

    /* compiled from: Semaphore.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/m2;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements l<Throwable, m2> {
        a() {
            super(1);
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Throwable th) {
            a(th);
            return m2.f23662a;
        }

        public final void a(@d5.d Throwable th) {
            g.this.release();
        }
    }

    public g(int i5, int i6) {
        this.permits = i5;
        if (!(i5 > 0)) {
            throw new IllegalArgumentException(s.a(ProtectedSandApp.s("幷"), i5).toString());
        }
        if (!(i6 >= 0 && i6 <= i5)) {
            throw new IllegalArgumentException(s.a(ProtectedSandApp.s("并"), i5).toString());
        }
        i iVar = new i(0L, null, 2);
        this.head = iVar;
        this.tail = iVar;
        this._availablePermits = i5 - i6;
        this.onCancellationRelease = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(Continuation<? super m2> continuation) {
        Continuation e6;
        e6 = kotlin.coroutines.intrinsics.c.e(continuation);
        kotlinx.coroutines.s b6 = u.b(e6);
        while (true) {
            if (h(b6)) {
                break;
            }
            if (f28982g.getAndDecrement(this) > 0) {
                b6.y(m2.f23662a, this.onCancellationRelease);
                break;
            }
        }
        Object A = b6.A();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (A == coroutineSingletons) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return A == coroutineSingletons ? A : m2.f23662a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlinx.coroutines.internal.h, kotlinx.coroutines.internal.o0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlinx.coroutines.internal.r0] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    public final boolean h(q<? super m2> cont) {
        int i5;
        i iVar;
        r0 r0Var;
        int i6;
        r0 r0Var2;
        r0 r0Var3;
        boolean z5;
        i iVar2 = (i) this.tail;
        long andIncrement = f28981f.getAndIncrement(this);
        i5 = h.f28991f;
        long j5 = andIncrement / i5;
        do {
            iVar = iVar2;
            while (true) {
                if (iVar.getId() >= j5 && !iVar.g()) {
                    break;
                }
                Object a6 = kotlinx.coroutines.internal.h.a(iVar);
                r0Var = kotlinx.coroutines.internal.g.f28708b;
                if (a6 == r0Var) {
                    iVar = kotlinx.coroutines.internal.g.f28708b;
                    break;
                }
                Object obj = (o0) ((kotlinx.coroutines.internal.h) a6);
                if (obj == null) {
                    obj = h.j(iVar.getId() + 1, iVar);
                    if (iVar.m(obj)) {
                        if (iVar.g()) {
                            iVar.l();
                        }
                    }
                }
                iVar = obj;
            }
            if (p0.h(iVar)) {
                break;
            }
            o0 f6 = p0.f(iVar);
            while (true) {
                o0 o0Var = (o0) this.tail;
                if (o0Var.getId() >= f6.getId()) {
                    break;
                }
                if (!f6.r()) {
                    z5 = false;
                    break;
                }
                if (androidx.concurrent.futures.d.a(f28980e, this, o0Var, f6)) {
                    if (o0Var.n()) {
                        o0Var.l();
                    }
                } else if (f6.n()) {
                    f6.l();
                }
            }
            z5 = true;
        } while (!z5);
        i iVar3 = (i) p0.f(iVar);
        i6 = h.f28991f;
        int i7 = (int) (andIncrement % i6);
        if (kotlinx.coroutines.debug.internal.b.a(iVar3.f28996e, i7, null, cont)) {
            cont.K(new kotlinx.coroutines.sync.a(iVar3, i7));
            return true;
        }
        r0Var2 = h.f28987b;
        r0Var3 = h.f28988c;
        if (!kotlinx.coroutines.debug.internal.b.a(iVar3.f28996e, i7, r0Var2, r0Var3)) {
            return false;
        }
        cont.y(m2.f23662a, this.onCancellationRelease);
        return true;
    }

    private final boolean i(q<? super m2> qVar) {
        Object u5 = qVar.u(m2.f23662a, null, this.onCancellationRelease);
        if (u5 == null) {
            return false;
        }
        qVar.v0(u5);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlinx.coroutines.internal.h, kotlinx.coroutines.internal.o0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlinx.coroutines.internal.r0] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    private final boolean j() {
        int i5;
        i iVar;
        r0 r0Var;
        int i6;
        int i7;
        r0 r0Var2;
        r0 r0Var3;
        int i8;
        r0 r0Var4;
        r0 r0Var5;
        r0 r0Var6;
        boolean z5;
        i iVar2 = (i) this.head;
        long andIncrement = f28979d.getAndIncrement(this);
        i5 = h.f28991f;
        long j5 = andIncrement / i5;
        do {
            iVar = iVar2;
            while (true) {
                if (iVar.getId() >= j5 && !iVar.g()) {
                    break;
                }
                Object a6 = kotlinx.coroutines.internal.h.a(iVar);
                r0Var = kotlinx.coroutines.internal.g.f28708b;
                if (a6 == r0Var) {
                    iVar = kotlinx.coroutines.internal.g.f28708b;
                    break;
                }
                Object obj = (o0) ((kotlinx.coroutines.internal.h) a6);
                if (obj == null) {
                    obj = h.j(iVar.getId() + 1, iVar);
                    if (iVar.m(obj)) {
                        if (iVar.g()) {
                            iVar.l();
                        }
                    }
                }
                iVar = obj;
            }
            if (p0.h(iVar)) {
                break;
            }
            o0 f6 = p0.f(iVar);
            while (true) {
                o0 o0Var = (o0) this.head;
                if (o0Var.getId() >= f6.getId()) {
                    break;
                }
                if (!f6.r()) {
                    z5 = false;
                    break;
                }
                if (androidx.concurrent.futures.d.a(f28978c, this, o0Var, f6)) {
                    if (o0Var.n()) {
                        o0Var.l();
                    }
                } else if (f6.n()) {
                    f6.l();
                }
            }
            z5 = true;
        } while (!z5);
        i iVar3 = (i) p0.f(iVar);
        iVar3.b();
        if (iVar3.getId() > j5) {
            return false;
        }
        i7 = h.f28991f;
        int i9 = (int) (andIncrement % i7);
        r0Var2 = h.f28987b;
        Object andSet = iVar3.f28996e.getAndSet(i9, r0Var2);
        if (andSet != null) {
            r0Var3 = h.f28990e;
            if (andSet == r0Var3) {
                return false;
            }
            return i((q) andSet);
        }
        i8 = h.f28986a;
        for (i6 = 0; i6 < i8; i6++) {
            Object obj2 = iVar3.f28996e.get(i9);
            r0Var6 = h.f28988c;
            if (obj2 == r0Var6) {
                return true;
            }
        }
        r0Var4 = h.f28987b;
        r0Var5 = h.f28989d;
        return !kotlinx.coroutines.debug.internal.b.a(iVar3.f28996e, i9, r0Var4, r0Var5);
    }

    @Override // kotlinx.coroutines.sync.f
    public int a() {
        return Math.max(this._availablePermits, 0);
    }

    @Override // kotlinx.coroutines.sync.f
    @d5.e
    public Object b(@d5.d Continuation<? super m2> continuation) {
        if (f28982g.getAndDecrement(this) > 0) {
            return m2.f23662a;
        }
        Object g5 = g(continuation);
        return g5 == CoroutineSingletons.COROUTINE_SUSPENDED ? g5 : m2.f23662a;
    }

    @Override // kotlinx.coroutines.sync.f
    public boolean c() {
        int i5;
        do {
            i5 = this._availablePermits;
            if (i5 <= 0) {
                return false;
            }
        } while (!f28982g.compareAndSet(this, i5, i5 - 1));
        return true;
    }

    @Override // kotlinx.coroutines.sync.f
    public void release() {
        while (true) {
            int i5 = this._availablePermits;
            if (!(i5 < this.permits)) {
                throw new IllegalStateException((ProtectedSandApp.s("幸") + this.permits).toString());
            }
            if (f28982g.compareAndSet(this, i5, i5 + 1) && (i5 >= 0 || j())) {
                return;
            }
        }
    }
}
