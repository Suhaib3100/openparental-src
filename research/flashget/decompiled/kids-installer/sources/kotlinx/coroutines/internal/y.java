package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.e1;
import kotlinx.coroutines.i2;

/* compiled from: LockFreeLinkedList.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001:\u0005JKLMNB\u0007¢\u0006\u0004\bI\u00102J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0007\u001a\u00060\u0000j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0000j\u0002`\u0005H\u0082\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082\u0010¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0016\u001a\u00020\u00152\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0081\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u001a\u0010\fJ)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\f\b\u0000\u0010\u001b*\u00060\u0000j\u0002`\u00052\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\u001f\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0086\b¢\u0006\u0004\b\u001f\u0010 J4\u0010#\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u0016\u0010\"\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0005\u0012\u0004\u0012\u00020\u00130!H\u0086\b¢\u0006\u0004\b#\u0010$JD\u0010%\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u0016\u0010\"\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0005\u0012\u0004\u0012\u00020\u00130!2\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0086\b¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0001¢\u0006\u0004\b'\u0010(J/\u0010+\u001a\u00020*2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u00052\u0006\u0010)\u001a\u00020\u0015H\u0001¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0001¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\n¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\nH\u0001¢\u0006\u0004\b3\u00102J\u0015\u00104\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b4\u00100J\u0017\u00106\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u000505¢\u0006\u0004\b6\u00107J.\u00108\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001b\u0018\u00012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130!H\u0086\b¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0014¢\u0006\u0004\b:\u00100J'\u0010<\u001a\u00020\n2\n\u0010;\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0000¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010.R\u0011\u0010\t\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0015\u0010F\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\bE\u00100R\u0015\u0010H\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\bG\u00100¨\u0006O"}, d2 = {"Lkotlinx/coroutines/internal/y;", "", "Lkotlinx/coroutines/internal/l0;", "W0", "()Lkotlinx/coroutines/internal/l0;", "Lkotlinx/coroutines/internal/Node;", "current", "I0", "(Lkotlinx/coroutines/internal/y;)Lkotlinx/coroutines/internal/y;", "next", "Lkotlin/m2;", "J0", "(Lkotlinx/coroutines/internal/y;)V", "Lkotlinx/coroutines/internal/j0;", "op", "F0", "(Lkotlinx/coroutines/internal/j0;)Lkotlinx/coroutines/internal/y;", "node", "Lkotlin/Function0;", "", "condition", "Lkotlinx/coroutines/internal/y$c;", "Q0", "(Lkotlinx/coroutines/internal/y;Lq3/a;)Lkotlinx/coroutines/internal/y$c;", "E0", "(Lkotlinx/coroutines/internal/y;)Z", "z0", "T", "Lkotlinx/coroutines/internal/y$b;", "G0", "(Lkotlinx/coroutines/internal/y;)Lkotlinx/coroutines/internal/y$b;", "A0", "(Lkotlinx/coroutines/internal/y;Lq3/a;)Z", "Lkotlin/Function1;", "predicate", "B0", "(Lkotlinx/coroutines/internal/y;Lq3/l;)Z", "C0", "(Lkotlinx/coroutines/internal/y;Lq3/l;Lq3/a;)Z", "D0", "(Lkotlinx/coroutines/internal/y;Lkotlinx/coroutines/internal/y;)Z", "condAdd", "", "X0", "(Lkotlinx/coroutines/internal/y;Lkotlinx/coroutines/internal/y;Lkotlinx/coroutines/internal/y$c;)I", "S0", "()Z", "V0", "()Lkotlinx/coroutines/internal/y;", "N0", "()V", "O0", "U0", "Lkotlinx/coroutines/internal/y$e;", "H0", "()Lkotlinx/coroutines/internal/y$e;", "T0", "(Lq3/l;)Ljava/lang/Object;", "R0", "prev", "Y0", "(Lkotlinx/coroutines/internal/y;Lkotlinx/coroutines/internal/y;)V", "", "toString", "()Ljava/lang/String;", "P0", "isRemoved", "K0", "()Ljava/lang/Object;", "L0", "nextNode", "M0", "prevNode", "<init>", "a", "b", "c", "d", "e", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@i2
/* loaded from: classes5.dex */
public class y {

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f28768o = AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, ProtectedSandApp.s("岹"));

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f28769p = AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, ProtectedSandApp.s("岺"));

    /* renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28770q = AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, ProtectedSandApp.s("岻"));

    @d5.d
    volatile /* synthetic */ Object _next = this;

    @d5.d
    volatile /* synthetic */ Object _prev = this;

    @d5.d
    private volatile /* synthetic */ Object _removedRef = null;

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0016\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0014J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\bH\u0014J \u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H$J \u0010\u000f\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H&J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0014\u0010\u0014\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0015J\u001c\u0010\u0018\u001a\u00020\r2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\bR\u001c\u0010\u001b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006 "}, d2 = {"Lkotlinx/coroutines/internal/y$a;", "Lkotlinx/coroutines/internal/b;", "Lkotlinx/coroutines/internal/j0;", "op", "Lkotlinx/coroutines/internal/y;", "Lkotlinx/coroutines/internal/Node;", "m", "affected", "", "e", "next", "", "l", "Lkotlin/m2;", "f", "n", "Lkotlinx/coroutines/internal/y$d;", "prepareOp", "g", "j", "k", "Lkotlinx/coroutines/internal/d;", "c", "failure", "a", "h", "()Lkotlinx/coroutines/internal/y;", "affectedNode", "i", "originalNext", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static abstract class a extends kotlinx.coroutines.internal.b {
        @Override // kotlinx.coroutines.internal.b
        public final void a(@d5.d kotlinx.coroutines.internal.d<?> dVar, @d5.e Object obj) {
            y queue;
            boolean z5 = obj == null;
            y h5 = h();
            if (h5 == null || (queue = getQueue()) == null) {
                return;
            }
            if (androidx.concurrent.futures.d.a(y.f28768o, h5, dVar, z5 ? n(h5, queue) : queue) && z5) {
                f(h5, queue);
            }
        }

        @Override // kotlinx.coroutines.internal.b
        @d5.e
        public final Object c(@d5.d kotlinx.coroutines.internal.d<?> op) {
            while (true) {
                y m5 = m(op);
                if (m5 == null) {
                    return kotlinx.coroutines.internal.c.f28690b;
                }
                Object obj = m5._next;
                if (obj == op || op.h()) {
                    return null;
                }
                if (obj instanceof j0) {
                    j0 j0Var = (j0) obj;
                    if (op.b(j0Var)) {
                        return kotlinx.coroutines.internal.c.f28690b;
                    }
                    j0Var.c(m5);
                } else {
                    Object e6 = e(m5);
                    if (e6 != null) {
                        return e6;
                    }
                    if (l(m5, obj)) {
                        continue;
                    } else {
                        d dVar = new d(m5, (y) obj, this);
                        if (androidx.concurrent.futures.d.a(y.f28768o, m5, obj, dVar)) {
                            try {
                                if (dVar.c(m5) != z.f28784a) {
                                    return null;
                                }
                            } catch (Throwable th) {
                                androidx.concurrent.futures.d.a(y.f28768o, m5, dVar, obj);
                                throw th;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }

        @d5.e
        protected Object e(@d5.d y affected) {
            return null;
        }

        protected abstract void f(@d5.d y yVar, @d5.d y yVar2);

        public abstract void g(@d5.d d dVar);

        @d5.e
        protected abstract y h();

        @d5.e
        /* renamed from: i */
        protected abstract y getQueue();

        @d5.e
        public Object j(@d5.d d prepareOp) {
            g(prepareOp);
            return null;
        }

        public void k(@d5.d y yVar) {
        }

        protected boolean l(@d5.d y affected, @d5.d Object next) {
            return false;
        }

        @d5.e
        protected y m(@d5.d j0 op) {
            y h5 = h();
            kotlin.jvm.internal.l0.m(h5);
            return h5;
        }

        @d5.d
        public abstract Object n(@d5.d y affected, @d5.d y next);
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020\u0004B\u001b\u0012\n\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002\u0012\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010\u0017J\u001f\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00112\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u00060\u0001j\u0002`\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u00060\u0001j\u0002`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"Lkotlinx/coroutines/internal/y$b;", "Lkotlinx/coroutines/internal/y;", "Lkotlinx/coroutines/internal/Node;", "T", "Lkotlinx/coroutines/internal/y$a;", "Lkotlinx/coroutines/internal/j0;", "op", "m", "(Lkotlinx/coroutines/internal/j0;)Lkotlinx/coroutines/internal/y;", "affected", "", "next", "", "l", "(Lkotlinx/coroutines/internal/y;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/y$d;", "prepareOp", "Lkotlin/m2;", "g", "(Lkotlinx/coroutines/internal/y$d;)V", "n", "(Lkotlinx/coroutines/internal/y;Lkotlinx/coroutines/internal/y;)Ljava/lang/Object;", "f", "(Lkotlinx/coroutines/internal/y;Lkotlinx/coroutines/internal/y;)V", "b", "Lkotlinx/coroutines/internal/y;", "queue", "c", "node", "h", "()Lkotlinx/coroutines/internal/y;", "affectedNode", "i", "originalNext", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static class b<T extends y> extends a {

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f28771d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, ProtectedSandApp.s("邇"));

        @d5.d
        private volatile /* synthetic */ Object _affectedNode = null;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final y queue;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final T node;

        public b(@d5.d y yVar, @d5.d T t5) {
            this.queue = yVar;
            this.node = t5;
        }

        @Override // kotlinx.coroutines.internal.y.a
        protected void f(@d5.d y affected, @d5.d y next) {
            this.node.J0(this.queue);
        }

        @Override // kotlinx.coroutines.internal.y.a
        public void g(@d5.d d prepareOp) {
            androidx.concurrent.futures.d.a(f28771d, this, null, prepareOp.affected);
        }

        @Override // kotlinx.coroutines.internal.y.a
        @d5.e
        protected final y h() {
            return (y) this._affectedNode;
        }

        @Override // kotlinx.coroutines.internal.y.a
        @d5.d
        /* renamed from: i, reason: from getter */
        protected final y getQueue() {
            return this.queue;
        }

        @Override // kotlinx.coroutines.internal.y.a
        protected boolean l(@d5.d y affected, @d5.d Object next) {
            return next != this.queue;
        }

        @Override // kotlinx.coroutines.internal.y.a
        @d5.e
        protected final y m(@d5.d j0 op) {
            return this.queue.F0(op);
        }

        @Override // kotlinx.coroutines.internal.y.a
        @d5.d
        public Object n(@d5.d y affected, @d5.d y next) {
            T t5 = this.node;
            androidx.concurrent.futures.d.a(y.f28769p, t5, t5, affected);
            T t6 = this.node;
            androidx.concurrent.futures.d.a(y.f28768o, t6, t6, this.queue);
            return this.node;
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u0018\u0010\u000b\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/internal/y$c;", "Lkotlinx/coroutines/internal/d;", "Lkotlinx/coroutines/internal/y;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "failure", "Lkotlin/m2;", "j", "b", "Lkotlinx/coroutines/internal/y;", "newNode", "c", "oldNext", "<init>", "(Lkotlinx/coroutines/internal/y;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    @PublishedApi
    /* loaded from: classes6.dex */
    public static abstract class c extends kotlinx.coroutines.internal.d<y> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final y newNode;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d5.e
        @p3.f
        public y oldNext;

        public c(@d5.d y yVar) {
            this.newNode = yVar;
        }

        @Override // kotlinx.coroutines.internal.d
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void d(@d5.d y yVar, @d5.e Object obj) {
            boolean z5 = obj == null;
            y yVar2 = z5 ? this.newNode : this.oldNext;
            if (yVar2 != null && androidx.concurrent.futures.d.a(y.f28768o, yVar, this, yVar2) && z5) {
                y yVar3 = this.newNode;
                y yVar4 = this.oldNext;
                kotlin.jvm.internal.l0.m(yVar4);
                yVar3.J0(yVar4);
            }
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0003\u001a\u00060\tj\u0002`\n\u0012\n\u0010\u000e\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0018\u0010\u0003\u001a\u00060\tj\u0002`\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u00060\tj\u0002`\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/internal/y$d;", "Lkotlinx/coroutines/internal/j0;", "", "affected", "c", "Lkotlin/m2;", "d", "", "toString", "Lkotlinx/coroutines/internal/y;", "Lkotlinx/coroutines/internal/Node;", "a", "Lkotlinx/coroutines/internal/y;", "b", "next", "Lkotlinx/coroutines/internal/y$a;", "Lkotlinx/coroutines/internal/y$a;", "desc", "Lkotlinx/coroutines/internal/d;", "()Lkotlinx/coroutines/internal/d;", "atomicOp", "<init>", "(Lkotlinx/coroutines/internal/y;Lkotlinx/coroutines/internal/y;Lkotlinx/coroutines/internal/y$a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class d extends j0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final y affected;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final y next;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final a desc;

        public d(@d5.d y yVar, @d5.d y yVar2, @d5.d a aVar) {
            this.affected = yVar;
            this.next = yVar2;
            this.desc = aVar;
        }

        @Override // kotlinx.coroutines.internal.j0
        @d5.d
        public kotlinx.coroutines.internal.d<?> a() {
            return this.desc.b();
        }

        @Override // kotlinx.coroutines.internal.j0
        @d5.e
        public Object c(@d5.e Object affected) {
            if (affected == null) {
                throw new NullPointerException(ProtectedSandApp.s("帉"));
            }
            y yVar = (y) affected;
            Object j5 = this.desc.j(this);
            Object obj = z.f28784a;
            if (j5 != obj) {
                Object e6 = j5 != null ? a().e(j5) : a().get_consensus();
                androidx.concurrent.futures.d.a(y.f28768o, yVar, this, e6 == kotlinx.coroutines.internal.c.f28689a ? a() : e6 == null ? this.desc.n(yVar, this.next) : this.next);
                return null;
            }
            y yVar2 = this.next;
            if (androidx.concurrent.futures.d.a(y.f28768o, yVar, this, yVar2.W0())) {
                this.desc.k(yVar);
                yVar2.F0(null);
            }
            return obj;
        }

        public final void d() {
            this.desc.g(this);
        }

        @Override // kotlinx.coroutines.internal.j0
        @d5.d
        public String toString() {
            return ProtectedSandApp.s("帊") + a() + ')';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\u0010\u001c\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b'\u0010(J\u001f\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\t\u001a\u00060\u0005j\u0002`\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\u000e2\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\r\u001a\u00020\nH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\r\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00132\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\r\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u00060\u0005j\u0002`\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010!\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010$\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001c\u0010&\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006)"}, d2 = {"Lkotlinx/coroutines/internal/y$e;", "T", "Lkotlinx/coroutines/internal/y$a;", "Lkotlinx/coroutines/internal/j0;", "op", "Lkotlinx/coroutines/internal/y;", "Lkotlinx/coroutines/internal/Node;", "m", "(Lkotlinx/coroutines/internal/j0;)Lkotlinx/coroutines/internal/y;", "affected", "", "e", "(Lkotlinx/coroutines/internal/y;)Ljava/lang/Object;", "next", "", "l", "(Lkotlinx/coroutines/internal/y;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/y$d;", "prepareOp", "Lkotlin/m2;", "g", "(Lkotlinx/coroutines/internal/y$d;)V", "n", "(Lkotlinx/coroutines/internal/y;Lkotlinx/coroutines/internal/y;)Ljava/lang/Object;", "f", "(Lkotlinx/coroutines/internal/y;Lkotlinx/coroutines/internal/y;)V", "b", "Lkotlinx/coroutines/internal/y;", "queue", "o", "()Ljava/lang/Object;", "getResult$annotations", "()V", "result", "h", "()Lkotlinx/coroutines/internal/y;", "affectedNode", "i", "originalNext", "<init>", "(Lkotlinx/coroutines/internal/y;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static class e<T> extends a {

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f28779c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, ProtectedSandApp.s("避"));

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f28780d = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, ProtectedSandApp.s("邀"));

        @d5.d
        private volatile /* synthetic */ Object _affectedNode = null;

        @d5.d
        private volatile /* synthetic */ Object _originalNext = null;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final y queue;

        public e(@d5.d y yVar) {
            this.queue = yVar;
        }

        public static /* synthetic */ void p() {
        }

        @Override // kotlinx.coroutines.internal.y.a
        @d5.e
        protected Object e(@d5.d y affected) {
            if (affected == this.queue) {
                return x.d();
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.y.a
        protected final void f(@d5.d y affected, @d5.d y next) {
            next.F0(null);
        }

        @Override // kotlinx.coroutines.internal.y.a
        public void g(@d5.d d prepareOp) {
            androidx.concurrent.futures.d.a(f28779c, this, null, prepareOp.affected);
            androidx.concurrent.futures.d.a(f28780d, this, null, prepareOp.next);
        }

        @Override // kotlinx.coroutines.internal.y.a
        @d5.e
        protected final y h() {
            return (y) this._affectedNode;
        }

        @Override // kotlinx.coroutines.internal.y.a
        @d5.e
        /* renamed from: i */
        protected final y getQueue() {
            return (y) this._originalNext;
        }

        @Override // kotlinx.coroutines.internal.y.a
        protected final boolean l(@d5.d y affected, @d5.d Object next) {
            if (!(next instanceof l0)) {
                return false;
            }
            ((l0) next).ref.O0();
            return true;
        }

        @Override // kotlinx.coroutines.internal.y.a
        @d5.e
        protected final y m(@d5.d j0 op) {
            y yVar = this.queue;
            while (true) {
                Object obj = yVar._next;
                if (!(obj instanceof j0)) {
                    return (y) obj;
                }
                j0 j0Var = (j0) obj;
                if (op.b(j0Var)) {
                    return null;
                }
                j0Var.c(this.queue);
            }
        }

        @Override // kotlinx.coroutines.internal.y.a
        @d5.d
        public final Object n(@d5.d y affected, @d5.d y next) {
            return next.W0();
        }

        public final T o() {
            T t5 = (T) h();
            kotlin.jvm.internal.l0.m(t5);
            return t5;
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/internal/y$f", "Lkotlinx/coroutines/internal/y$c;", "Lkotlinx/coroutines/internal/y;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    public static final class f extends c {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ q3.a<Boolean> f28782d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(y yVar, q3.a<Boolean> aVar) {
            super(yVar);
            this.f28782d = aVar;
        }

        @Override // kotlinx.coroutines.internal.d
        @d5.e
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Object i(@d5.d y affected) {
            if (this.f28782d.n().booleanValue()) {
                return null;
            }
            return x.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (androidx.concurrent.futures.d.a(kotlinx.coroutines.internal.y.f28768o, r3, r2, ((kotlinx.coroutines.internal.l0) r4).f28723a) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.internal.y F0(kotlinx.coroutines.internal.j0 r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.y r0 = (kotlinx.coroutines.internal.y) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.y.f28769p
            boolean r0 = androidx.concurrent.futures.d.a(r1, r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.P0()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.j0
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            kotlinx.coroutines.internal.j0 r0 = (kotlinx.coroutines.internal.j0) r0
            boolean r0 = r8.b(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            kotlinx.coroutines.internal.j0 r4 = (kotlinx.coroutines.internal.j0) r4
            r4.c(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.l0
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.y.f28768o
            kotlinx.coroutines.internal.l0 r4 = (kotlinx.coroutines.internal.l0) r4
            kotlinx.coroutines.internal.y r4 = r4.ref
            boolean r2 = androidx.concurrent.futures.d.a(r5, r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.y r2 = (kotlinx.coroutines.internal.y) r2
            goto L7
        L52:
            r3 = r4
            kotlinx.coroutines.internal.y r3 = (kotlinx.coroutines.internal.y) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.y.F0(kotlinx.coroutines.internal.j0):kotlinx.coroutines.internal.y");
    }

    private final y I0(y current) {
        while (current.P0()) {
            current = (y) current._prev;
        }
        return current;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0(y next) {
        y yVar;
        do {
            yVar = (y) next._prev;
            if (K0() != next) {
                return;
            }
        } while (!androidx.concurrent.futures.d.a(f28769p, next, yVar, this));
        if (P0()) {
            next.F0(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l0 W0() {
        l0 l0Var = (l0) this._removedRef;
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0Var2 = new l0(this);
        f28770q.lazySet(this, l0Var2);
        return l0Var2;
    }

    public final boolean A0(@d5.d y node, @d5.d q3.a<Boolean> condition) {
        int X0;
        f fVar = new f(node, condition);
        do {
            X0 = M0().X0(node, this, fVar);
            if (X0 == 1) {
                return true;
            }
        } while (X0 != 2);
        return false;
    }

    public final boolean B0(@d5.d y node, @d5.d q3.l<? super y, Boolean> predicate) {
        y M0;
        do {
            M0 = M0();
            if (!predicate.N(M0).booleanValue()) {
                return false;
            }
        } while (!M0.D0(node, this));
        return true;
    }

    public final boolean C0(@d5.d y node, @d5.d q3.l<? super y, Boolean> predicate, @d5.d q3.a<Boolean> condition) {
        int X0;
        f fVar = new f(node, condition);
        do {
            y M0 = M0();
            if (!predicate.N(M0).booleanValue()) {
                return false;
            }
            X0 = M0.X0(node, this, fVar);
            if (X0 == 1) {
                return true;
            }
        } while (X0 != 2);
        return false;
    }

    @PublishedApi
    public final boolean D0(@d5.d y node, @d5.d y next) {
        f28769p.lazySet(node, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28768o;
        atomicReferenceFieldUpdater.lazySet(node, next);
        if (!androidx.concurrent.futures.d.a(atomicReferenceFieldUpdater, this, next, node)) {
            return false;
        }
        node.J0(next);
        return true;
    }

    public final boolean E0(@d5.d y node) {
        f28769p.lazySet(node, this);
        f28768o.lazySet(node, this);
        while (K0() == this) {
            if (androidx.concurrent.futures.d.a(f28768o, this, this, node)) {
                node.J0(this);
                return true;
            }
        }
        return false;
    }

    @d5.d
    public final <T extends y> b<T> G0(@d5.d T node) {
        return new b<>(this, node);
    }

    @d5.d
    public final e<y> H0() {
        return new e<>(this);
    }

    @d5.d
    public final Object K0() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof j0)) {
                return obj;
            }
            ((j0) obj).c(this);
        }
    }

    @d5.d
    public final y L0() {
        return x.h(K0());
    }

    @d5.d
    public final y M0() {
        y F0 = F0(null);
        return F0 == null ? I0((y) this._prev) : F0;
    }

    public final void N0() {
        ((l0) K0()).ref.O0();
    }

    @PublishedApi
    public final void O0() {
        y yVar = this;
        while (true) {
            Object K0 = yVar.K0();
            if (!(K0 instanceof l0)) {
                yVar.F0(null);
                return;
            }
            yVar = ((l0) K0).ref;
        }
    }

    public boolean P0() {
        return K0() instanceof l0;
    }

    @PublishedApi
    @d5.d
    public final c Q0(@d5.d y node, @d5.d q3.a<Boolean> condition) {
        return new f(node, condition);
    }

    @d5.e
    protected y R0() {
        Object K0 = K0();
        l0 l0Var = K0 instanceof l0 ? (l0) K0 : null;
        if (l0Var != null) {
            return l0Var.ref;
        }
        return null;
    }

    public boolean S0() {
        return V0() == null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object, kotlinx.coroutines.internal.y] */
    public final <T> T T0(q3.l<? super T, Boolean> predicate) {
        while (true) {
            y yVar = (y) K0();
            if (yVar == this) {
                return null;
            }
            kotlin.jvm.internal.l0.P();
            if (!(yVar instanceof Object)) {
                return null;
            }
            if (predicate.N(yVar).booleanValue() && !yVar.P0()) {
                return yVar;
            }
            y V0 = yVar.V0();
            if (V0 == null) {
                return yVar;
            }
            V0.O0();
        }
    }

    @d5.e
    public final y U0() {
        while (true) {
            y yVar = (y) K0();
            if (yVar == this) {
                return null;
            }
            if (yVar.S0()) {
                return yVar;
            }
            yVar.N0();
        }
    }

    @d5.e
    @PublishedApi
    public final y V0() {
        Object K0;
        y yVar;
        do {
            K0 = K0();
            if (K0 instanceof l0) {
                return ((l0) K0).ref;
            }
            if (K0 == this) {
                return (y) K0;
            }
            yVar = (y) K0;
        } while (!androidx.concurrent.futures.d.a(f28768o, this, K0, yVar.W0()));
        yVar.F0(null);
        return null;
    }

    @PublishedApi
    public final int X0(@d5.d y node, @d5.d y next, @d5.d c condAdd) {
        f28769p.lazySet(node, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28768o;
        atomicReferenceFieldUpdater.lazySet(node, next);
        condAdd.oldNext = next;
        if (androidx.concurrent.futures.d.a(atomicReferenceFieldUpdater, this, next, condAdd)) {
            return condAdd.c(this) == null ? 1 : 2;
        }
        return 0;
    }

    public final void Y0(@d5.d y prev, @d5.d y next) {
    }

    @d5.d
    public String toString() {
        return new e1(this) { // from class: kotlinx.coroutines.internal.y.g
            {
                String s5 = ProtectedSandApp.s("酂");
                String s6 = ProtectedSandApp.s("酃");
            }

            @Override // kotlin.jvm.internal.e1, kotlin.reflect.KProperty0
            @d5.e
            public Object get() {
                return kotlinx.coroutines.z0.a(this.f23596p);
            }
        } + '@' + kotlinx.coroutines.z0.b(this);
    }

    public final void z0(@d5.d y node) {
        while (!M0().D0(node, this)) {
        }
    }
}
