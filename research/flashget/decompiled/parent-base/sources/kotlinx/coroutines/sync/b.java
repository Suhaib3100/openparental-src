package kotlinx.coroutines.sync;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kd.x;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.k2;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.internal.p0;
import kotlinx.coroutines.internal.s0;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.p;
import kotlinx.coroutines.s;
import kotlinx.coroutines.selects.i;
import kotlinx.coroutines.selects.j;
import kotlinx.coroutines.selects.m;
import kotlinx.coroutines.selects.n;
import kotlinx.coroutines.w0;
import kotlinx.coroutines.y3;
import kotlinx.coroutines.z1;
import ld.q;

/* compiled from: Mutex.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u000245B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000eJ\u0019\u0010\u0013\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u00020\f2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fRq\u0010)\u001a_\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0016¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\f0%0 j\u0002`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(R(\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00020*8VX\u0096\u0004¢\u0006\f\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R\u0014\u00102\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007038\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Lkotlinx/coroutines/sync/b;", "Lkotlinx/coroutines/sync/e;", "Lkotlinx/coroutines/sync/a;", "", "locked", "<init>", "(Z)V", "", "owner", "", "y", "(Ljava/lang/Object;)I", "Lkotlin/k2;", "A", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "D", "h", "(Ljava/lang/Object;)Z", "f", "c", "g", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/selects/m;", "select", "C", "(Lkotlinx/coroutines/selects/m;Ljava/lang/Object;)V", "result", "B", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lkotlin/Function3;", "Lkotlin/r0;", "name", "param", "internalResult", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "Lld/q;", "onSelectCancellationUnlockConstructor", "Lkotlinx/coroutines/selects/i;", "i", "()Lkotlinx/coroutines/selects/i;", "x", "()V", "onLock", "d", "()Z", "isLocked", "Lkotlinx/atomicfu/AtomicRef;", "a", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n332#2,12:311\n1#3:323\n*S KotlinDebug\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n*L\n175#1:311,12\n*E\n"})
/* loaded from: classes7.dex */
public class b extends kotlinx.coroutines.sync.e implements kotlinx.coroutines.sync.a {

    /* renamed from: i, reason: collision with root package name */
    @l
    private static final AtomicReferenceFieldUpdater f81096i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, ProtectedSandApp.s("裝\u0001"));

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    private final q<m<?>, Object, Object, ld.l<Throwable, k2>> onSelectCancellationUnlockConstructor;

    @fg.m
    @x
    private volatile Object owner;

    /* compiled from: Mutex.kt */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0019\u001a\u00020\u00022'\u0010\u0018\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00020\u0014j\u0002`\u0017H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0011J&\u0010 \u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001e\u001a\u00020\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0097\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u0004\u0018\u00010\u00062\u0006\u0010\"\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b#\u0010$J\u001c\u0010&\u001a\u00020\u0002*\u00020%2\u0006\u0010\u001e\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b&\u0010'J\u001c\u0010(\u001a\u00020\u0002*\u00020%2\u0006\u0010\"\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b(\u0010)J$\u0010.\u001a\u00020\u00022\n\u0010+\u001a\u0006\u0012\u0002\b\u00030*2\u0006\u0010-\u001a\u00020,H\u0096\u0001¢\u0006\u0004\b.\u0010/JH\u00101\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001e\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062#\u00100\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014H\u0016¢\u0006\u0004\b1\u00102J<\u00103\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022#\u00100\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014H\u0016¢\u0006\u0004\b3\u00104R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u00105R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u00106R\u0014\u0010:\u001a\u0002078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010;\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010<R\u0014\u0010?\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b>\u0010<\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006@"}, d2 = {"Lkotlinx/coroutines/sync/b$a;", "Lkotlinx/coroutines/p;", "Lkotlin/k2;", "Lkotlinx/coroutines/y3;", "Lkotlinx/coroutines/q;", "cont", "", "owner", "<init>", "(Lkotlinx/coroutines/sync/b;Lkotlinx/coroutines/q;Ljava/lang/Object;)V", "", "cause", "", "f", "(Ljava/lang/Throwable;)Z", "token", "l0", "(Ljava/lang/Object;)V", "e0", "()V", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "k0", "(Lld/l;)V", "Lkotlin/z0;", "result", "resumeWith", "value", "idempotent", "d", "(Lkotlin/k2;Ljava/lang/Object;)Ljava/lang/Object;", "exception", "v", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Lkotlinx/coroutines/m0;", "c", "(Lkotlinx/coroutines/m0;Lkotlin/k2;)V", "A", "(Lkotlinx/coroutines/m0;Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/internal/p0;", "segment", "", "index", "a", "(Lkotlinx/coroutines/internal/p0;I)V", "onCancellation", "e", "(Lkotlin/k2;Ljava/lang/Object;Lld/l;)Ljava/lang/Object;", "b", "(Lkotlin/k2;Lld/l;)V", "Lkotlinx/coroutines/q;", "Ljava/lang/Object;", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "isActive", "()Z", "isCancelled", "l", "isCompleted", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n1#2:311\n*E\n"})
    private final class a implements p<k2>, y3 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        @kd.f
        public final kotlinx.coroutines.q<k2> cont;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.m
        @kd.f
        public final Object owner;

        /* compiled from: Mutex.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: kotlinx.coroutines.sync.b$a$a, reason: collision with other inner class name */
        static final class C1263a extends n0 implements ld.l<Throwable, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f81101b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f81102c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1263a(b bVar, a aVar) {
                super(1);
                this.f81101b = bVar;
                this.f81102c = aVar;
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
                invoke2(th);
                return k2.f75408a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@l Throwable th) {
                this.f81101b.g(this.f81102c.owner);
            }
        }

        /* compiled from: Mutex.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner$tryResume$token$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n1#2:311\n*E\n"})
        /* renamed from: kotlinx.coroutines.sync.b$a$b, reason: collision with other inner class name */
        static final class C1264b extends n0 implements ld.l<Throwable, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f81103b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f81104c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1264b(b bVar, a aVar) {
                super(1);
                this.f81103b = bVar;
                this.f81104c = aVar;
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
                invoke2(th);
                return k2.f75408a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@l Throwable th) {
                b.f81096i.set(this.f81103b, this.f81104c.owner);
                this.f81103b.g(this.f81104c.owner);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@l kotlinx.coroutines.q<? super k2> qVar, @fg.m Object obj) {
            this.cont = qVar;
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.p
        @z1
        public void A(@l m0 m0Var, @l Throwable th) {
            this.cont.A(m0Var, th);
        }

        @Override // kotlinx.coroutines.y3
        public void a(@l p0<?> segment, int index) {
            this.cont.a(segment, index);
        }

        @Override // kotlinx.coroutines.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void W(@l k2 value, @fg.m ld.l<? super Throwable, k2> onCancellation) {
            b.f81096i.set(b.this, this.owner);
            this.cont.W(value, new C1263a(b.this, this));
        }

        @Override // kotlinx.coroutines.p
        @z1
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void Z(@l m0 m0Var, @l k2 k2Var) {
            this.cont.Z(m0Var, k2Var);
        }

        @fg.m
        @f2
        public Object d(@l k2 value, @fg.m Object idempotent) {
            return this.cont.p(value, idempotent);
        }

        @Override // kotlinx.coroutines.p
        @fg.m
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Object i0(@l k2 value, @fg.m Object idempotent, @fg.m ld.l<? super Throwable, k2> onCancellation) {
            Object i02 = this.cont.i0(value, idempotent, new C1264b(b.this, this));
            if (i02 != null) {
                b.f81096i.set(b.this, this.owner);
            }
            return i02;
        }

        @Override // kotlinx.coroutines.p
        @f2
        public void e0() {
            this.cont.e0();
        }

        @Override // kotlinx.coroutines.p
        public boolean f(@fg.m Throwable cause) {
            return this.cont.f(cause);
        }

        @Override // kotlin.coroutines.d
        @l
        /* renamed from: getContext */
        public kotlin.coroutines.g getF75269b() {
            return this.cont.getF75269b();
        }

        @Override // kotlinx.coroutines.p
        public boolean isActive() {
            return this.cont.isActive();
        }

        @Override // kotlinx.coroutines.p
        public boolean isCancelled() {
            return this.cont.isCancelled();
        }

        @Override // kotlinx.coroutines.p
        public void k0(@l ld.l<? super Throwable, k2> handler) {
            this.cont.k0(handler);
        }

        @Override // kotlinx.coroutines.p
        public boolean l() {
            return this.cont.l();
        }

        @Override // kotlinx.coroutines.p
        @f2
        public void l0(@l Object token) {
            this.cont.l0(token);
        }

        @Override // kotlinx.coroutines.p
        public Object p(k2 k2Var, Object obj) {
            return this.cont.p(k2Var, obj);
        }

        @Override // kotlin.coroutines.d
        public void resumeWith(@l Object result) {
            this.cont.resumeWith(result);
        }

        @Override // kotlinx.coroutines.p
        @fg.m
        @f2
        public Object v(@l Throwable exception) {
            return this.cont.v(exception);
        }
    }

    /* compiled from: Mutex.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0011\u001a\u00020\n2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lkotlinx/coroutines/sync/b$b;", "Q", "Lkotlinx/coroutines/selects/n;", "select", "", "owner", "<init>", "(Lkotlinx/coroutines/sync/b;Lkotlinx/coroutines/selects/n;Ljava/lang/Object;)V", "Lkotlinx/coroutines/m1;", "disposableHandle", "Lkotlin/k2;", "f", "(Lkotlinx/coroutines/m1;)V", "Lkotlinx/coroutines/internal/p0;", "segment", "", "index", "a", "(Lkotlinx/coroutines/internal/p0;I)V", "clauseObject", "result", "", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "internalResult", "d", "(Ljava/lang/Object;)V", "b", "Lkotlinx/coroutines/selects/n;", "c", "Ljava/lang/Object;", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$SelectInstanceWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n1#2:311\n*E\n"})
    /* renamed from: kotlinx.coroutines.sync.b$b, reason: collision with other inner class name */
    private final class C1265b<Q> implements n<Q> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        @kd.f
        public final n<Q> select;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.m
        @kd.f
        public final Object owner;

        public C1265b(@l n<Q> nVar, @fg.m Object obj) {
            this.select = nVar;
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.y3
        public void a(@l p0<?> segment, int index) {
            this.select.a(segment, index);
        }

        @Override // kotlinx.coroutines.selects.m
        public void d(@fg.m Object internalResult) {
            b.f81096i.set(b.this, this.owner);
            this.select.d(internalResult);
        }

        @Override // kotlinx.coroutines.selects.m
        public void f(@l m1 disposableHandle) {
            this.select.f(disposableHandle);
        }

        @Override // kotlinx.coroutines.selects.m
        @l
        public kotlin.coroutines.g getContext() {
            return this.select.getContext();
        }

        @Override // kotlinx.coroutines.selects.m
        public boolean l(@l Object clauseObject, @fg.m Object result) {
            boolean l4 = this.select.l(clauseObject, result);
            b bVar = b.this;
            if (l4) {
                b.f81096i.set(bVar, this.owner);
            }
            return l4;
        }
    }

    /* compiled from: Mutex.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class c extends h0 implements q<b, m<?>, Object, k2> {

        /* renamed from: d, reason: collision with root package name */
        public static final c f81108d = new c();

        c() {
            super(3, b.class, ProtectedSandApp.s("裏\u0001"), ProtectedSandApp.s("裎\u0001"), 0);
        }

        @Override // ld.q
        public k2 R(b bVar, m<?> mVar, Object obj) {
            bVar.C(mVar, obj);
            return k2.f75408a;
        }

        public final void Z(@l b bVar, @l m<?> mVar, @fg.m Object obj) {
            bVar.C(mVar, obj);
        }
    }

    /* compiled from: Mutex.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class d extends h0 implements q<b, Object, Object, Object> {

        /* renamed from: d, reason: collision with root package name */
        public static final d f81109d = new d();

        d() {
            super(3, b.class, ProtectedSandApp.s("裑\u0001"), ProtectedSandApp.s("裐\u0001"), 0);
        }

        @Override // ld.q
        public Object R(b bVar, Object obj, Object obj2) {
            return bVar.B(obj, obj2);
        }

        @fg.m
        public final Object Z(@l b bVar, @fg.m Object obj, @fg.m Object obj2) {
            return bVar.B(obj, obj2);
        }
    }

    /* compiled from: Mutex.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlinx/coroutines/selects/m;", "<anonymous parameter 0>", "", "owner", "<anonymous parameter 2>", "Lkotlin/Function1;", "", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/selects/m;Ljava/lang/Object;Ljava/lang/Object;)Lld/l;"}, k = 3, mv = {1, 8, 0})
    static final class e extends n0 implements q<m<?>, Object, Object, ld.l<? super Throwable, ? extends k2>> {

        /* compiled from: Mutex.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements ld.l<Throwable, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f81111b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f81112c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Object obj) {
                super(1);
                this.f81111b = bVar;
                this.f81112c = obj;
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
                invoke2(th);
                return k2.f75408a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@l Throwable th) {
                this.f81111b.g(this.f81112c);
            }
        }

        e() {
            super(3);
        }

        @Override // ld.q
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ld.l<Throwable, k2> R(@l m<?> mVar, @fg.m Object obj, @fg.m Object obj2) {
            return new a(b.this, obj);
        }
    }

    public b(boolean z4) {
        super(1, z4 ? 1 : 0);
        this.owner = z4 ? null : kotlinx.coroutines.sync.c.f81113a;
        this.onSelectCancellationUnlockConstructor = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A(Object obj, kotlin.coroutines.d<? super k2> dVar) {
        kotlinx.coroutines.q b5 = s.b(kotlin.coroutines.intrinsics.b.e(dVar));
        try {
            m(new a(b5, obj));
            Object y4 = b5.y();
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (y4 == aVar) {
                h.c(dVar);
            }
            return y4 == aVar ? y4 : k2.f75408a;
        } catch (Throwable th) {
            b5.N();
            throw th;
        }
    }

    private final int D(Object owner) {
        while (!b()) {
            if (owner == null) {
                return 1;
            }
            int y4 = y(owner);
            if (y4 == 1) {
                return 2;
            }
            if (y4 == 2) {
                return 1;
            }
        }
        f81096i.set(this, owner);
        return 0;
    }

    public static /* synthetic */ void x() {
    }

    private final int y(Object owner) {
        s0 s0Var;
        while (d()) {
            Object obj = f81096i.get(this);
            s0Var = kotlinx.coroutines.sync.c.f81113a;
            if (obj != s0Var) {
                return obj == owner ? 1 : 2;
            }
        }
        return 0;
    }

    static Object z(b bVar, Object obj, kotlin.coroutines.d<? super k2> dVar) {
        if (bVar.c(obj)) {
            return k2.f75408a;
        }
        Object A = bVar.A(obj, dVar);
        return A == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? A : k2.f75408a;
    }

    @fg.m
    protected Object B(@fg.m Object owner, @fg.m Object result) {
        s0 s0Var;
        s0Var = kotlinx.coroutines.sync.c.f81114b;
        if (!l0.g(result, s0Var)) {
            return this;
        }
        throw new IllegalStateException((ProtectedSandApp.s("裞\u0001") + owner).toString());
    }

    protected void C(@l m<?> select, @fg.m Object owner) {
        s0 s0Var;
        if (owner == null || !h(owner)) {
            l0.n(select, ProtectedSandApp.s("裟\u0001"));
            s(new C1265b((n) select, owner), owner);
        } else {
            s0Var = kotlinx.coroutines.sync.c.f81114b;
            select.d(s0Var);
        }
    }

    @Override // kotlinx.coroutines.sync.a
    public boolean c(@fg.m Object owner) {
        int D = D(owner);
        if (D == 0) {
            return true;
        }
        if (D == 1) {
            return false;
        }
        if (D != 2) {
            throw new IllegalStateException(ProtectedSandApp.s("裠\u0001"));
        }
        throw new IllegalStateException((ProtectedSandApp.s("裞\u0001") + owner).toString());
    }

    @Override // kotlinx.coroutines.sync.a
    public boolean d() {
        return a() == 0;
    }

    @Override // kotlinx.coroutines.sync.a
    @fg.m
    public Object f(@fg.m Object obj, @l kotlin.coroutines.d<? super k2> dVar) {
        return z(this, obj, dVar);
    }

    @Override // kotlinx.coroutines.sync.a
    public void g(@fg.m Object owner) {
        s0 s0Var;
        s0 s0Var2;
        while (d()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f81096i;
            Object obj = atomicReferenceFieldUpdater.get(this);
            s0Var = kotlinx.coroutines.sync.c.f81113a;
            if (obj != s0Var) {
                if (obj != owner && owner != null) {
                    throw new IllegalStateException((ProtectedSandApp.s("裡\u0001") + obj + ProtectedSandApp.s("裢\u0001") + owner + ProtectedSandApp.s("裣\u0001")).toString());
                }
                s0Var2 = kotlinx.coroutines.sync.c.f81113a;
                if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, obj, s0Var2)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException(ProtectedSandApp.s("裤\u0001"));
    }

    @Override // kotlinx.coroutines.sync.a
    public boolean h(@l Object owner) {
        return y(owner) == 1;
    }

    @Override // kotlinx.coroutines.sync.a
    @l
    public i<Object, kotlinx.coroutines.sync.a> i() {
        c cVar = c.f81108d;
        l0.n(cVar, ProtectedSandApp.s("裥\u0001"));
        q qVar = (q) u1.q(cVar, 3);
        d dVar = d.f81109d;
        l0.n(dVar, ProtectedSandApp.s("裦\u0001"));
        return new j(this, qVar, (q) u1.q(dVar, 3), this.onSelectCancellationUnlockConstructor);
    }

    @l
    public String toString() {
        return ProtectedSandApp.s("裧\u0001") + w0.b(this) + ProtectedSandApp.s("裨\u0001") + d() + ProtectedSandApp.s("裩\u0001") + f81096i.get(this) + ']';
    }
}
