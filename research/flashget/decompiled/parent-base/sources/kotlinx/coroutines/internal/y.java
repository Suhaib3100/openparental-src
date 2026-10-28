package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.f2;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: LockFreeLinkedList.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00060\u0000j\u0002`\u00072\n\u0010\b\u001a\u00060\u0000j\u0002`\u0007H\u0082\u0010¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0011\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0082\u0010¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0018\u001a\u00020\u00172\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u00072\u000e\b\u0004\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0081\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00152\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\f2\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0007¢\u0006\u0004\b\u001c\u0010\u000eJ,\u0010\u001d\u001a\u00020\u00152\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u00072\u000e\b\u0004\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0086\b¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u00020\u00152\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u00072\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u0007H\u0001¢\u0006\u0004\b\u001f\u0010 J/\u0010#\u001a\u00020\"2\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u00072\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u00072\u0006\u0010!\u001a\u00020\u0017H\u0001¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0007H\u0001¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0007H\u0014¢\u0006\u0004\b)\u0010(J'\u0010+\u001a\u00020\f2\n\u0010*\u001a\u00060\u0000j\u0002`\u00072\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u0007H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010&R\u0011\u0010\u000b\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0015\u00105\u001a\u00060\u0000j\u0002`\u00078F¢\u0006\u0006\u001a\u0004\b4\u0010(R\u0015\u00107\u001a\u00060\u0000j\u0002`\u00078F¢\u0006\u0006\u001a\u0004\b6\u0010(R\u0011\u00109\u001a\b\u0012\u0004\u0012\u00020\u0001088\u0002X\u0082\u0004R\u0011\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0000088\u0002X\u0082\u0004R\u0013\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004088\u0002X\u0082\u0004¨\u0006="}, d2 = {"Lkotlinx/coroutines/internal/y;", "", "<init>", "()V", "Lkotlinx/coroutines/internal/m0;", "F", "()Lkotlinx/coroutines/internal/m0;", "Lkotlinx/coroutines/internal/Node;", "current", "n", "(Lkotlinx/coroutines/internal/y;)Lkotlinx/coroutines/internal/y;", "next", "Lkotlin/k2;", "p", "(Lkotlinx/coroutines/internal/y;)V", "Lkotlinx/coroutines/internal/k0;", "op", "m", "(Lkotlinx/coroutines/internal/k0;)Lkotlinx/coroutines/internal/y;", "node", "Lkotlin/Function0;", "", "condition", "Lkotlinx/coroutines/internal/y$a;", "A", "(Lkotlinx/coroutines/internal/y;Lld/a;)Lkotlinx/coroutines/internal/y$a;", "l", "(Lkotlinx/coroutines/internal/y;)Z", "f", "h", "(Lkotlinx/coroutines/internal/y;Lld/a;)Z", "j", "(Lkotlinx/coroutines/internal/y;Lkotlinx/coroutines/internal/y;)Z", "condAdd", "", "N", "(Lkotlinx/coroutines/internal/y;Lkotlinx/coroutines/internal/y;Lkotlinx/coroutines/internal/y$a;)I", "D", "()Z", "E", "()Lkotlinx/coroutines/internal/y;", "C", "prev", "W", "(Lkotlinx/coroutines/internal/y;Lkotlinx/coroutines/internal/y;)V", "", "toString", "()Ljava/lang/String;", "v", "isRemoved", "q", "()Ljava/lang/Object;", "r", "nextNode", "s", "prevNode", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "_removedRef", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f2
@r1({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,367:1\n73#1,3:369\n1#2:368\n*S KotlinDebug\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n*L\n134#1:369,3\n*E\n"})
/* loaded from: classes7.dex */
public class y {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f80828b = AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, ProtectedSandApp.s("薫\u0001"));

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f80829c = AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, ProtectedSandApp.s("薬\u0001"));

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f80830d = AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, ProtectedSandApp.s("薭\u0001"));

    @fg.m
    @kd.x
    private volatile Object _next = this;

    @fg.m
    @kd.x
    private volatile Object _prev = this;

    @fg.m
    @kd.x
    private volatile Object _removedRef;

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/internal/y$a;", "Lkotlinx/coroutines/internal/b;", "Lkotlinx/coroutines/internal/y;", "Lkotlinx/coroutines/internal/Node;", "newNode", "<init>", "(Lkotlinx/coroutines/internal/y;)V", "affected", "", "failure", "Lkotlin/k2;", "f", "(Lkotlinx/coroutines/internal/y;Ljava/lang/Object;)V", "b", "Lkotlinx/coroutines/internal/y;", "c", "oldNext", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.w0
    public static abstract class a extends kotlinx.coroutines.internal.b<y> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        @kd.f
        public final y newNode;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.m
        @kd.f
        public y oldNext;

        public a(@fg.l y yVar) {
            this.newNode = yVar;
        }

        @Override // kotlinx.coroutines.internal.b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void c(@fg.l y affected, @fg.m Object failure) {
            boolean z4 = failure == null;
            y yVar = z4 ? this.newNode : this.oldNext;
            if (yVar != null && androidx.concurrent.futures.c.a(y.f80828b, affected, this, yVar) && z4) {
                y yVar2 = this.newNode;
                y yVar3 = this.oldNext;
                kotlin.jvm.internal.l0.m(yVar3);
                yVar2.p(yVar3);
            }
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"kotlinx/coroutines/internal/y$b", "Lkotlinx/coroutines/internal/y$a;", "Lkotlinx/coroutines/internal/y;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "g", "(Lkotlinx/coroutines/internal/y;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1\n*L\n1#1,367:1\n*E\n"})
    public static final class b extends a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<Boolean> f80833d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y yVar, ld.a<Boolean> aVar) {
            super(yVar);
            this.f80833d = aVar;
        }

        @Override // kotlinx.coroutines.internal.b
        @fg.m
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Object e(@fg.l y affected) {
            if (this.f80833d.invoke().booleanValue()) {
                return null;
            }
            return x.a();
        }
    }

    private final m0 F() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80830d;
        m0 m0Var = (m0) atomicReferenceFieldUpdater.get(this);
        if (m0Var != null) {
            return m0Var;
        }
        m0 m0Var2 = new m0(this);
        atomicReferenceFieldUpdater.lazySet(this, m0Var2);
        return m0Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (androidx.concurrent.futures.c.a(r4, r3, r2, ((kotlinx.coroutines.internal.m0) r5).f80792a) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlinx.coroutines.internal.y m(kotlinx.coroutines.internal.k0 r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.y.f80829c
            java.lang.Object r0 = r0.get(r8)
            kotlinx.coroutines.internal.y r0 = (kotlinx.coroutines.internal.y) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.y.f80828b
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L20
            if (r0 != r2) goto L16
            return r2
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.y.f80829c
            boolean r0 = androidx.concurrent.futures.c.a(r1, r8, r0, r2)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            return r2
        L20:
            boolean r6 = r8.v()
            if (r6 == 0) goto L27
            return r1
        L27:
            if (r5 != r9) goto L2a
            return r2
        L2a:
            boolean r6 = r5 instanceof kotlinx.coroutines.internal.k0
            if (r6 == 0) goto L34
            kotlinx.coroutines.internal.k0 r5 = (kotlinx.coroutines.internal.k0) r5
            r5.b(r2)
            goto L0
        L34:
            boolean r6 = r5 instanceof kotlinx.coroutines.internal.m0
            if (r6 == 0) goto L50
            if (r3 == 0) goto L47
            kotlinx.coroutines.internal.m0 r5 = (kotlinx.coroutines.internal.m0) r5
            kotlinx.coroutines.internal.y r5 = r5.ref
            boolean r2 = androidx.concurrent.futures.c.a(r4, r3, r2, r5)
            if (r2 != 0) goto L45
            goto L0
        L45:
            r2 = r3
            goto La
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.y.f80829c
            java.lang.Object r2 = r4.get(r2)
            kotlinx.coroutines.internal.y r2 = (kotlinx.coroutines.internal.y) r2
            goto Lb
        L50:
            java.lang.String r3 = "薮\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            kotlin.jvm.internal.l0.n(r5, r3)
            r3 = r5
            kotlinx.coroutines.internal.y r3 = (kotlinx.coroutines.internal.y) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.y.m(kotlinx.coroutines.internal.k0):kotlinx.coroutines.internal.y");
    }

    private final y n(y current) {
        while (current.v()) {
            current = (y) f80829c.get(current);
        }
        return current;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(y next) {
        y yVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80829c;
        do {
            yVar = (y) atomicReferenceFieldUpdater.get(next);
            if (q() != next) {
                return;
            }
        } while (!androidx.concurrent.futures.c.a(f80829c, next, yVar, this));
        if (v()) {
            next.m(null);
        }
    }

    private final void w(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ld.l<Object, k2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @fg.l
    @kotlin.w0
    public final a A(@fg.l y node, @fg.l ld.a<Boolean> condition) {
        return new b(node, condition);
    }

    @fg.m
    protected y C() {
        Object q4 = q();
        m0 m0Var = q4 instanceof m0 ? (m0) q4 : null;
        if (m0Var != null) {
            return m0Var.ref;
        }
        return null;
    }

    public boolean D() {
        return E() == null;
    }

    @fg.m
    @kotlin.w0
    public final y E() {
        Object q4;
        y yVar;
        do {
            q4 = q();
            if (q4 instanceof m0) {
                return ((m0) q4).ref;
            }
            if (q4 == this) {
                return (y) q4;
            }
            kotlin.jvm.internal.l0.n(q4, ProtectedSandApp.s("薮\u0001"));
            yVar = (y) q4;
        } while (!androidx.concurrent.futures.c.a(f80828b, this, q4, yVar.F()));
        yVar.m(null);
        return null;
    }

    @kotlin.w0
    public final int N(@fg.l y node, @fg.l y next, @fg.l a condAdd) {
        f80829c.lazySet(node, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80828b;
        atomicReferenceFieldUpdater.lazySet(node, next);
        condAdd.oldNext = next;
        if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, next, condAdd)) {
            return condAdd.b(this) == null ? 1 : 2;
        }
        return 0;
    }

    public final void W(@fg.l y prev, @fg.l y next) {
    }

    public final void f(@fg.l y node) {
        while (!s().j(node, this)) {
        }
    }

    public final boolean h(@fg.l y node, @fg.l ld.a<Boolean> condition) {
        int N;
        b bVar = new b(node, condition);
        do {
            N = s().N(node, this, bVar);
            if (N == 1) {
                return true;
            }
        } while (N != 2);
        return false;
    }

    @kotlin.w0
    public final boolean j(@fg.l y node, @fg.l y next) {
        f80829c.lazySet(node, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80828b;
        atomicReferenceFieldUpdater.lazySet(node, next);
        if (!androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, next, node)) {
            return false;
        }
        node.p(next);
        return true;
    }

    public final boolean l(@fg.l y node) {
        f80829c.lazySet(node, this);
        f80828b.lazySet(node, this);
        while (q() == this) {
            if (androidx.concurrent.futures.c.a(f80828b, this, this, node)) {
                node.p(this);
                return true;
            }
        }
        return false;
    }

    @fg.l
    public final Object q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80828b;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof k0)) {
                return obj;
            }
            ((k0) obj).b(this);
        }
    }

    @fg.l
    public final y r() {
        return x.f(q());
    }

    @fg.l
    public final y s() {
        y m4 = m(null);
        return m4 == null ? n((y) f80829c.get(this)) : m4;
    }

    @fg.l
    public String toString() {
        return new kotlin.jvm.internal.e1(this) { // from class: kotlinx.coroutines.internal.y.c
            {
                String s4 = ProtectedSandApp.s("蠗\u0001");
                String s5 = ProtectedSandApp.s("蠘\u0001");
            }

            @Override // kotlin.jvm.internal.e1, kotlin.reflect.p
            @fg.m
            public Object get() {
                return kotlinx.coroutines.w0.a(this.receiver);
            }
        } + '@' + kotlinx.coroutines.w0.b(this);
    }

    public boolean v() {
        return q() instanceof m0;
    }
}
