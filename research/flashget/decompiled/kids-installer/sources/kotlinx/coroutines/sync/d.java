package kotlinx.coroutines.sync;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Lambda;
import kotlin.m2;
import kotlinx.coroutines.internal.j0;
import kotlinx.coroutines.internal.r0;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.p1;
import kotlinx.coroutines.q;
import kotlinx.coroutines.r;
import kotlinx.coroutines.t;
import q3.l;
import q3.p;

/* compiled from: Mutex.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0006\t\u001a\u000b\u0015\u0014\u001fB\u000f\u0012\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\u001d\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0007JT\u0010\u0012\u001a\u00020\u0005\"\u0004\b\u0000\u0010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u0019\u0010\u0015\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\"\u0010!\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lkotlinx/coroutines/sync/d;", "Lkotlinx/coroutines/sync/c;", "Lkotlinx/coroutines/selects/e;", "", "owner", "Lkotlin/m2;", "i", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "a", "(Ljava/lang/Object;)Z", "c", "R", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "block", "V", "(Lkotlinx/coroutines/selects/f;Ljava/lang/Object;Lq3/p;)V", "e", "d", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "b", "()Z", "isLocked", "h", "isLockedEmptyQueueState", "f", "()Lkotlinx/coroutines/selects/e;", "onLock", "locked", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class d implements kotlinx.coroutines.sync.c, kotlinx.coroutines.selects.e<Object, kotlinx.coroutines.sync.c> {

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f28947o = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, ProtectedSandApp.s("幝"));

    @d5.d
    volatile /* synthetic */ Object _state;

    /* compiled from: Mutex.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u001f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/sync/d$a;", "Lkotlinx/coroutines/sync/d$c;", "Lkotlinx/coroutines/sync/d;", "", "b1", "Lkotlin/m2;", "Z0", "", "toString", "Lkotlinx/coroutines/q;", "u", "Lkotlinx/coroutines/q;", "cont", "", "owner", "<init>", "(Lkotlinx/coroutines/sync/d;Ljava/lang/Object;Lkotlinx/coroutines/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    private final class a extends c {

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final q<m2> cont;

        /* compiled from: Mutex.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/m2;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.sync.d$a$a, reason: collision with other inner class name */
        static final class C0455a extends Lambda implements l<Throwable, m2> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ d f28950p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ a f28951q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0455a(d dVar, a aVar) {
                super(1);
                this.f28950p = dVar;
                this.f28951q = aVar;
            }

            @Override // q3.l
            public /* bridge */ /* synthetic */ m2 N(Throwable th) {
                a(th);
                return m2.f23662a;
            }

            public final void a(@d5.d Throwable th) {
                this.f28950p.d(this.f28951q.owner);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@d5.e Object obj, @d5.d q<? super m2> qVar) {
            super(obj);
            this.cont = qVar;
        }

        @Override // kotlinx.coroutines.sync.d.c
        public void Z0() {
            this.cont.v0(t.f29000d);
        }

        @Override // kotlinx.coroutines.sync.d.c
        public boolean b1() {
            return a1() && this.cont.u(m2.f23662a, null, new C0455a(d.this, this)) != null;
        }

        @Override // kotlinx.coroutines.internal.y
        @d5.d
        public String toString() {
            return ProtectedSandApp.s("醂") + this.owner + ProtectedSandApp.s("醃") + this.cont + ProtectedSandApp.s("醄") + d.this;
        }
    }

    /* compiled from: Mutex.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002R\u00020\u0003BF\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR3\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/sync/d$b;", "R", "Lkotlinx/coroutines/sync/d$c;", "Lkotlinx/coroutines/sync/d;", "", "b1", "Lkotlin/m2;", "Z0", "", "toString", "Lkotlinx/coroutines/selects/f;", "u", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/Function2;", "Lkotlinx/coroutines/sync/c;", "Lkotlin/coroutines/d;", "", "v", "Lq3/p;", "block", "owner", "<init>", "(Lkotlinx/coroutines/sync/d;Ljava/lang/Object;Lkotlinx/coroutines/selects/f;Lq3/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    private final class b<R> extends c {

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final kotlinx.coroutines.selects.f<R> select;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final p<kotlinx.coroutines.sync.c, Continuation<? super R>, Object> block;

        /* compiled from: Mutex.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lkotlin/m2;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements l<Throwable, m2> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ d f28955p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ b<R> f28956q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, b<R> bVar) {
                super(1);
                this.f28955p = dVar;
                this.f28956q = bVar;
            }

            @Override // q3.l
            public /* bridge */ /* synthetic */ m2 N(Throwable th) {
                a(th);
                return m2.f23662a;
            }

            public final void a(@d5.d Throwable th) {
                this.f28955p.d(this.f28956q.owner);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@d5.e Object obj, @d5.d kotlinx.coroutines.selects.f<? super R> fVar, @d5.d p<? super kotlinx.coroutines.sync.c, ? super Continuation<? super R>, ? extends Object> pVar) {
            super(obj);
            this.select = fVar;
            this.block = pVar;
        }

        @Override // kotlinx.coroutines.sync.d.c
        public void Z0() {
            q4.a.e(this.block, d.this, this.select.L(), new a(d.this, this));
        }

        @Override // kotlinx.coroutines.sync.d.c
        public boolean b1() {
            return a1() && this.select.t();
        }

        @Override // kotlinx.coroutines.internal.y
        @d5.d
        public String toString() {
            return ProtectedSandApp.s("醅") + this.owner + ProtectedSandApp.s("醆") + this.select + ProtectedSandApp.s("醇") + d.this;
        }
    }

    /* compiled from: Mutex.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b¢\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/sync/d$c;", "Lkotlinx/coroutines/internal/y;", "Lkotlinx/coroutines/p1;", "", "a1", "()Z", "Lkotlin/m2;", "g", "()V", "b1", "Z0", "", "r", "Ljava/lang/Object;", "owner", "<init>", "(Lkotlinx/coroutines/sync/d;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    private abstract class c extends y implements p1 {

        /* renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f28957t = AtomicIntegerFieldUpdater.newUpdater(c.class, ProtectedSandApp.s("幛"));

        @d5.d
        private volatile /* synthetic */ int isTaken = 0;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        @d5.e
        @p3.f
        public final Object owner;

        public c(@d5.e Object obj) {
            this.owner = obj;
        }

        public abstract void Z0();

        public final boolean a1() {
            return f28957t.compareAndSet(this, 0, 1);
        }

        public abstract boolean b1();

        @Override // kotlinx.coroutines.p1
        public final void g() {
            S0();
        }
    }

    /* compiled from: Mutex.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/sync/d$d;", "Lkotlinx/coroutines/internal/w;", "", "toString", "", "owner", "Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.sync.d$d, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    private static final class C0456d extends w {

        @d5.d
        @p3.f
        public volatile Object owner;

        public C0456d(@d5.d Object obj) {
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.internal.y
        @d5.d
        public String toString() {
            return ProtectedSandApp.s("醈") + this.owner + ']';
        }
    }

    /* compiled from: Mutex.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/sync/d$e;", "Lkotlinx/coroutines/internal/b;", "Lkotlinx/coroutines/internal/d;", "op", "", "c", "failure", "Lkotlin/m2;", "a", "Lkotlinx/coroutines/sync/d;", "b", "Lkotlinx/coroutines/sync/d;", "mutex", "Ljava/lang/Object;", "owner", "<init>", "(Lkotlinx/coroutines/sync/d;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    private static final class e extends kotlinx.coroutines.internal.b {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final d mutex;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d5.e
        @p3.f
        public final Object owner;

        /* compiled from: Mutex.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001e\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/sync/d$e$a;", "Lkotlinx/coroutines/internal/j0;", "", "affected", "c", "Lkotlinx/coroutines/internal/d;", "a", "Lkotlinx/coroutines/internal/d;", "()Lkotlinx/coroutines/internal/d;", "atomicOp", "<init>", "(Lkotlinx/coroutines/sync/d$e;Lkotlinx/coroutines/internal/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
        private final class a extends j0 {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @d5.d
            private final kotlinx.coroutines.internal.d<?> atomicOp;

            public a(@d5.d kotlinx.coroutines.internal.d<?> dVar) {
                this.atomicOp = dVar;
            }

            @Override // kotlinx.coroutines.internal.j0
            @d5.d
            public kotlinx.coroutines.internal.d<?> a() {
                return this.atomicOp;
            }

            @Override // kotlinx.coroutines.internal.j0
            @d5.e
            public Object c(@d5.e Object affected) {
                Object obj = this.atomicOp.h() ? kotlinx.coroutines.sync.e.f28972f : this.atomicOp;
                if (affected == null) {
                    throw new NullPointerException(ProtectedSandApp.s("幜"));
                }
                androidx.concurrent.futures.d.a(d.f28947o, (d) affected, this, obj);
                return null;
            }
        }

        public e(@d5.d d dVar, @d5.e Object obj) {
            this.mutex = dVar;
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.internal.b
        public void a(@d5.d kotlinx.coroutines.internal.d<?> dVar, @d5.e Object obj) {
            kotlinx.coroutines.sync.b bVar;
            if (obj != null) {
                bVar = kotlinx.coroutines.sync.e.f28972f;
            } else {
                Object obj2 = this.owner;
                bVar = obj2 == null ? kotlinx.coroutines.sync.e.f28971e : new kotlinx.coroutines.sync.b(obj2);
            }
            androidx.concurrent.futures.d.a(d.f28947o, this.mutex, dVar, bVar);
        }

        @Override // kotlinx.coroutines.internal.b
        @d5.e
        public Object c(@d5.d kotlinx.coroutines.internal.d<?> op) {
            kotlinx.coroutines.sync.b bVar;
            r0 r0Var;
            a aVar = new a(op);
            d dVar = this.mutex;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f28947o;
            bVar = kotlinx.coroutines.sync.e.f28972f;
            if (androidx.concurrent.futures.d.a(atomicReferenceFieldUpdater, dVar, bVar, aVar)) {
                return aVar.c(this.mutex);
            }
            r0Var = kotlinx.coroutines.sync.e.f28967a;
            return r0Var;
        }
    }

    /* compiled from: Mutex.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/sync/d$f;", "Lkotlinx/coroutines/internal/d;", "Lkotlinx/coroutines/sync/d;", "affected", "", "k", "failure", "Lkotlin/m2;", "j", "Lkotlinx/coroutines/sync/d$d;", "b", "Lkotlinx/coroutines/sync/d$d;", "queue", "<init>", "(Lkotlinx/coroutines/sync/d$d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    private static final class f extends kotlinx.coroutines.internal.d<d> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final C0456d queue;

        public f(@d5.d C0456d c0456d) {
            this.queue = c0456d;
        }

        @Override // kotlinx.coroutines.internal.d
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void d(@d5.d d dVar, @d5.e Object obj) {
            androidx.concurrent.futures.d.a(d.f28947o, dVar, this, obj == null ? kotlinx.coroutines.sync.e.f28972f : this.queue);
        }

        @Override // kotlinx.coroutines.internal.d
        @d5.e
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Object i(@d5.d d affected) {
            r0 r0Var;
            if (this.queue.a1()) {
                return null;
            }
            r0Var = kotlinx.coroutines.sync.e.f28968b;
            return r0Var;
        }
    }

    /* compiled from: Mutex.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/m2;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class g extends Lambda implements l<Throwable, m2> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Object f28966q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Object obj) {
            super(1);
            this.f28966q = obj;
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Throwable th) {
            a(th);
            return m2.f23662a;
        }

        public final void a(@d5.d Throwable th) {
            d.this.d(this.f28966q);
        }
    }

    public d(boolean z5) {
        this._state = z5 ? kotlinx.coroutines.sync.e.f28971e : kotlinx.coroutines.sync.e.f28972f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        kotlinx.coroutines.u.c(r0, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Object r7, kotlin.coroutines.Continuation<? super kotlin.m2> r8) {
        /*
            r6 = this;
            kotlin.coroutines.d r0 = kotlin.coroutines.intrinsics.b.e(r8)
            kotlinx.coroutines.s r0 = kotlinx.coroutines.u.b(r0)
            kotlinx.coroutines.sync.d$a r1 = new kotlinx.coroutines.sync.d$a
            r1.<init>(r7, r0)
        Ld:
            java.lang.Object r2 = r6._state
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.b
            if (r3 == 0) goto L4a
            r3 = r2
            kotlinx.coroutines.sync.b r3 = (kotlinx.coroutines.sync.b) r3
            java.lang.Object r4 = r3.locked
            kotlinx.coroutines.internal.r0 r5 = kotlinx.coroutines.sync.e.g()
            if (r4 == r5) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.d.f28947o
            kotlinx.coroutines.sync.d$d r5 = new kotlinx.coroutines.sync.d$d
            java.lang.Object r3 = r3.locked
            r5.<init>(r3)
            androidx.concurrent.futures.d.a(r4, r6, r2, r5)
            goto Ld
        L2b:
            if (r7 != 0) goto L32
            kotlinx.coroutines.sync.b r3 = kotlinx.coroutines.sync.e.c()
            goto L37
        L32:
            kotlinx.coroutines.sync.b r3 = new kotlinx.coroutines.sync.b
            r3.<init>(r7)
        L37:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.d.f28947o
            boolean r2 = androidx.concurrent.futures.d.a(r4, r6, r2, r3)
            if (r2 == 0) goto Ld
            kotlin.m2 r1 = kotlin.m2.f23662a
            kotlinx.coroutines.sync.d$g r2 = new kotlinx.coroutines.sync.d$g
            r2.<init>(r7)
            r0.y(r1, r2)
            goto L71
        L4a:
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.d.C0456d
            if (r3 == 0) goto L9e
            r3 = r2
            kotlinx.coroutines.sync.d$d r3 = (kotlinx.coroutines.sync.d.C0456d) r3
            java.lang.Object r4 = r3.owner
            if (r4 == r7) goto L57
            r4 = 1
            goto L58
        L57:
            r4 = 0
        L58:
            if (r4 == 0) goto L82
            r3.z0(r1)
            java.lang.Object r3 = r6._state
            if (r3 == r2) goto L6e
            boolean r2 = r1.a1()
            if (r2 != 0) goto L68
            goto L6e
        L68:
            kotlinx.coroutines.sync.d$a r1 = new kotlinx.coroutines.sync.d$a
            r1.<init>(r7, r0)
            goto Ld
        L6e:
            kotlinx.coroutines.u.c(r0, r1)
        L71:
            java.lang.Object r7 = r0.A()
            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r7 != r0) goto L7c
            kotlin.coroutines.jvm.internal.h.c(r8)
        L7c:
            if (r7 != r0) goto L7f
            return r7
        L7f:
            kotlin.m2 r7 = kotlin.m2.f23662a
            return r7
        L82:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "幞"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L9e:
            boolean r3 = r2 instanceof kotlinx.coroutines.internal.j0
            if (r3 == 0) goto La9
            kotlinx.coroutines.internal.j0 r2 = (kotlinx.coroutines.internal.j0) r2
            r2.c(r6)
            goto Ld
        La9:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "幟"
            java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
            java.lang.String r8 = kotlinx.coroutines.r.a(r8, r2)
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.d.i(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.selects.e
    public <R> void V(@d5.d kotlinx.coroutines.selects.f<? super R> select, @d5.e Object owner, @d5.d p<? super kotlinx.coroutines.sync.c, ? super Continuation<? super R>, ? extends Object> block) {
        r0 r0Var;
        r0 r0Var2;
        while (!select.C()) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.b) {
                kotlinx.coroutines.sync.b bVar = (kotlinx.coroutines.sync.b) obj;
                Object obj2 = bVar.locked;
                r0Var = kotlinx.coroutines.sync.e.f28970d;
                if (obj2 != r0Var) {
                    androidx.concurrent.futures.d.a(f28947o, this, obj, new C0456d(bVar.locked));
                } else {
                    Object l02 = select.l0(new e(this, owner));
                    if (l02 == null) {
                        q4.b.d(block, this, select.L());
                        return;
                    } else {
                        if (l02 == kotlinx.coroutines.selects.g.d()) {
                            return;
                        }
                        r0Var2 = kotlinx.coroutines.sync.e.f28967a;
                        if (l02 != r0Var2 && l02 != kotlinx.coroutines.internal.c.f28690b) {
                            throw new IllegalStateException(r.a(ProtectedSandApp.s("幠"), l02));
                        }
                    }
                }
            } else if (obj instanceof C0456d) {
                C0456d c0456d = (C0456d) obj;
                if (!(c0456d.owner != owner)) {
                    throw new IllegalStateException((ProtectedSandApp.s("幡") + owner).toString());
                }
                b bVar2 = new b(owner, select, block);
                c0456d.z0(bVar2);
                if (this._state == obj || !bVar2.a1()) {
                    select.t0(bVar2);
                    return;
                }
            } else {
                if (!(obj instanceof j0)) {
                    throw new IllegalStateException(r.a(ProtectedSandApp.s("幢"), obj));
                }
                ((j0) obj).c(this);
            }
        }
    }

    @Override // kotlinx.coroutines.sync.c
    public boolean a(@d5.e Object owner) {
        r0 r0Var;
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.b) {
                Object obj2 = ((kotlinx.coroutines.sync.b) obj).locked;
                r0Var = kotlinx.coroutines.sync.e.f28970d;
                if (obj2 != r0Var) {
                    return false;
                }
                if (androidx.concurrent.futures.d.a(f28947o, this, obj, owner == null ? kotlinx.coroutines.sync.e.f28971e : new kotlinx.coroutines.sync.b(owner))) {
                    return true;
                }
            } else {
                if (obj instanceof C0456d) {
                    if (((C0456d) obj).owner != owner) {
                        return false;
                    }
                    throw new IllegalStateException((ProtectedSandApp.s("幣") + owner).toString());
                }
                if (!(obj instanceof j0)) {
                    throw new IllegalStateException(r.a(ProtectedSandApp.s("幤"), obj));
                }
                ((j0) obj).c(this);
            }
        }
    }

    @Override // kotlinx.coroutines.sync.c
    public boolean b() {
        r0 r0Var;
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.b) {
                Object obj2 = ((kotlinx.coroutines.sync.b) obj).locked;
                r0Var = kotlinx.coroutines.sync.e.f28970d;
                return obj2 != r0Var;
            }
            if (obj instanceof C0456d) {
                return true;
            }
            if (!(obj instanceof j0)) {
                throw new IllegalStateException(r.a(ProtectedSandApp.s("幥"), obj));
            }
            ((j0) obj).c(this);
        }
    }

    @Override // kotlinx.coroutines.sync.c
    @d5.e
    public Object c(@d5.e Object obj, @d5.d Continuation<? super m2> continuation) {
        if (a(obj)) {
            return m2.f23662a;
        }
        Object i5 = i(obj, continuation);
        return i5 == CoroutineSingletons.COROUTINE_SUSPENDED ? i5 : m2.f23662a;
    }

    @Override // kotlinx.coroutines.sync.c
    public void d(@d5.e Object owner) {
        kotlinx.coroutines.sync.b bVar;
        r0 r0Var;
        while (true) {
            Object obj = this._state;
            boolean z5 = obj instanceof kotlinx.coroutines.sync.b;
            String s5 = ProtectedSandApp.s("幦");
            String s6 = ProtectedSandApp.s("幧");
            if (z5) {
                if (owner == null) {
                    Object obj2 = ((kotlinx.coroutines.sync.b) obj).locked;
                    r0Var = kotlinx.coroutines.sync.e.f28970d;
                    if (!(obj2 != r0Var)) {
                        throw new IllegalStateException(ProtectedSandApp.s("幨").toString());
                    }
                } else {
                    kotlinx.coroutines.sync.b bVar2 = (kotlinx.coroutines.sync.b) obj;
                    if (!(bVar2.locked == owner)) {
                        throw new IllegalStateException((s6 + bVar2.locked + s5 + owner).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28947o;
                bVar = kotlinx.coroutines.sync.e.f28972f;
                if (androidx.concurrent.futures.d.a(atomicReferenceFieldUpdater, this, obj, bVar)) {
                    return;
                }
            } else if (obj instanceof j0) {
                ((j0) obj).c(this);
            } else {
                if (!(obj instanceof C0456d)) {
                    throw new IllegalStateException(r.a(ProtectedSandApp.s("幩"), obj));
                }
                if (owner != null) {
                    C0456d c0456d = (C0456d) obj;
                    if (!(c0456d.owner == owner)) {
                        throw new IllegalStateException((s6 + c0456d.owner + s5 + owner).toString());
                    }
                }
                C0456d c0456d2 = (C0456d) obj;
                y U0 = c0456d2.U0();
                if (U0 == null) {
                    f fVar = new f(c0456d2);
                    if (androidx.concurrent.futures.d.a(f28947o, this, obj, fVar) && fVar.c(this) == null) {
                        return;
                    }
                } else {
                    c cVar = (c) U0;
                    if (cVar.b1()) {
                        Object obj3 = cVar.owner;
                        if (obj3 == null) {
                            obj3 = kotlinx.coroutines.sync.e.f28969c;
                        }
                        c0456d2.owner = obj3;
                        cVar.Z0();
                        return;
                    }
                }
            }
        }
    }

    @Override // kotlinx.coroutines.sync.c
    public boolean e(@d5.d Object owner) {
        Object obj = this._state;
        if (obj instanceof kotlinx.coroutines.sync.b) {
            if (((kotlinx.coroutines.sync.b) obj).locked == owner) {
                return true;
            }
        } else if ((obj instanceof C0456d) && ((C0456d) obj).owner == owner) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.sync.c
    @d5.d
    public kotlinx.coroutines.selects.e<Object, kotlinx.coroutines.sync.c> f() {
        return this;
    }

    public final boolean h() {
        Object obj = this._state;
        return (obj instanceof C0456d) && ((C0456d) obj).a1();
    }

    @d5.d
    public String toString() {
        while (true) {
            Object obj = this._state;
            boolean z5 = obj instanceof kotlinx.coroutines.sync.b;
            String s5 = ProtectedSandApp.s("幪");
            if (z5) {
                return s5 + ((kotlinx.coroutines.sync.b) obj).locked + ']';
            }
            if (!(obj instanceof j0)) {
                if (!(obj instanceof C0456d)) {
                    throw new IllegalStateException(r.a(ProtectedSandApp.s("幫"), obj));
                }
                return s5 + ((C0456d) obj).owner + ']';
            }
            ((j0) obj).c(this);
        }
    }
}
