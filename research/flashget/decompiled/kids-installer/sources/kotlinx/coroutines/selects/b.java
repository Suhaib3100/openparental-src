package kotlinx.coroutines.selects;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlinx.coroutines.f0;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.internal.j0;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.o2;
import kotlinx.coroutines.p1;
import kotlinx.coroutines.r;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.t;
import q3.l;
import q3.p;

/* compiled from: Select.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0004ZC[\\B\u0015\u0012\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bX\u0010YJ.\u0010\r\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0082\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0018\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001aH\u0001¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u0004\u0018\u00010\t2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u0004\u0018\u00010\t2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J5\u0010\u0001\u001a\u00020\u000b*\u0002042\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t05H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0001\u00106JG\u0010:\u001a\u00020\u000b\"\u0004\b\u0001\u00107*\b\u0012\u0004\u0012\u00028\u0001082\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t09H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b:\u0010;J[\u0010?\u001a\u00020\u000b\"\u0004\b\u0001\u0010<\"\u0004\b\u0002\u00107*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020=2\u0006\u0010>\u001a\u00028\u00012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t09H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@J8\u0010C\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020A2\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\t05H\u0016ø\u0001\u0000¢\u0006\u0004\bC\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR(\u0010K\u001a\u0004\u0018\u00010\"2\b\u0010\n\u001a\u0004\u0018\u00010\"8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010%R\u001c\u0010N\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"Lkotlinx/coroutines/selects/b;", "R", "Lkotlinx/coroutines/internal/w;", "Lkotlinx/coroutines/selects/a;", "Lkotlinx/coroutines/selects/f;", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/Function0;", "", "value", "Lkotlin/m2;", "block", "f1", "(Lq3/a;Lq3/a;)V", "X", "()V", "e1", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "I", "()Ljava/lang/StackTraceElement;", "Lkotlin/z0;", "result", "s", "(Ljava/lang/Object;)V", "", "exception", "j0", "(Ljava/lang/Throwable;)V", "h1", "()Ljava/lang/Object;", "e", "i1", "Lkotlinx/coroutines/p1;", "handle", "t0", "(Lkotlinx/coroutines/p1;)V", "", "t", "()Z", "Lkotlinx/coroutines/internal/y$d;", "otherOp", "j", "(Lkotlinx/coroutines/internal/y$d;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/b;", "desc", "l0", "(Lkotlinx/coroutines/internal/b;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/selects/c;", "Lkotlin/Function1;", "(Lkotlinx/coroutines/selects/c;Lq3/l;)V", "Q", "Lkotlinx/coroutines/selects/d;", "Lkotlin/Function2;", "s0", "(Lkotlinx/coroutines/selects/d;Lq3/p;)V", "P", "Lkotlinx/coroutines/selects/e;", "param", "A", "(Lkotlinx/coroutines/selects/e;Ljava/lang/Object;Lq3/p;)V", "", "timeMillis", "b", "(JLq3/l;)V", "r", "Lkotlin/coroutines/d;", "uCont", "g1", "()Lkotlinx/coroutines/p1;", "j1", "parentHandle", "i", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "Lkotlin/coroutines/g;", "l", "()Lkotlin/coroutines/g;", "context", "L", "()Lkotlin/coroutines/d;", "completion", "C", "isSelected", "<init>", "(Lkotlin/coroutines/d;)V", "a", "c", "d", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@PublishedApi
/* loaded from: classes6.dex */
public final class b<R> extends w implements kotlinx.coroutines.selects.a<R>, f<R>, Continuation<R>, CoroutineStackFrame {

    /* renamed from: s, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f28909s = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, ProtectedSandApp.s("酶"));

    /* renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28910t = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, ProtectedSandApp.s("酷"));

    @d5.d
    private volatile /* synthetic */ Object _parentHandle;

    @d5.d
    private volatile /* synthetic */ Object _result;

    @d5.d
    volatile /* synthetic */ Object _state = g.f();

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Continuation<R> uCont;

    /* compiled from: Select.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\u0012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0018\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/selects/b$a;", "Lkotlinx/coroutines/internal/d;", "", "k", "Lkotlin/m2;", "l", "failure", "j", "affected", "i", "d", "", "toString", "Lkotlinx/coroutines/selects/b;", "b", "Lkotlinx/coroutines/selects/b;", "impl", "Lkotlinx/coroutines/internal/b;", "c", "Lkotlinx/coroutines/internal/b;", "desc", "", "J", "g", "()J", "opSequence", "<init>", "(Lkotlinx/coroutines/selects/b;Lkotlinx/coroutines/internal/b;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    private static final class a extends kotlinx.coroutines.internal.d<Object> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final b<?> impl;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final kotlinx.coroutines.internal.b desc;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final long opSequence;

        public a(@d5.d b<?> bVar, @d5.d kotlinx.coroutines.internal.b bVar2) {
            i iVar;
            this.impl = bVar;
            this.desc = bVar2;
            iVar = g.f28924e;
            this.opSequence = iVar.a();
            bVar2.d(this);
        }

        private final void j(Object obj) {
            boolean z5 = obj == null;
            if (androidx.concurrent.futures.d.a(b.f28909s, this.impl, this, z5 ? null : g.f()) && z5) {
                this.impl.e1();
            }
        }

        private final Object k() {
            b<?> bVar = this.impl;
            while (true) {
                Object obj = bVar._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof j0) {
                    ((j0) obj).c(this.impl);
                } else {
                    if (obj != g.f()) {
                        return g.d();
                    }
                    if (androidx.concurrent.futures.d.a(b.f28909s, this.impl, g.f(), this)) {
                        return null;
                    }
                }
            }
        }

        private final void l() {
            androidx.concurrent.futures.d.a(b.f28909s, this.impl, this, g.f());
        }

        @Override // kotlinx.coroutines.internal.d
        public void d(@d5.e Object obj, @d5.e Object obj2) {
            j(obj2);
            this.desc.a(this, obj2);
        }

        @Override // kotlinx.coroutines.internal.d
        /* renamed from: g, reason: from getter */
        public long getOpSequence() {
            return this.opSequence;
        }

        @Override // kotlinx.coroutines.internal.d
        @d5.e
        public Object i(@d5.e Object affected) {
            Object k5;
            if (affected == null && (k5 = k()) != null) {
                return k5;
            }
            try {
                return this.desc.c(this);
            } catch (Throwable th) {
                if (affected == null) {
                    l();
                }
                throw th;
            }
        }

        @Override // kotlinx.coroutines.internal.j0
        @d5.d
        public String toString() {
            return ProtectedSandApp.s("酵") + this.opSequence + ')';
        }
    }

    /* compiled from: Select.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/selects/b$b;", "Lkotlinx/coroutines/internal/y;", "Lkotlinx/coroutines/p1;", "r", "Lkotlinx/coroutines/p1;", "handle", "<init>", "(Lkotlinx/coroutines/p1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.selects.b$b, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private static final class C0454b extends y {

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final p1 handle;

        public C0454b(@d5.d p1 p1Var) {
            this.handle = p1Var;
        }
    }

    /* compiled from: Select.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/selects/b$c;", "Lkotlinx/coroutines/internal/j0;", "", "affected", "c", "Lkotlinx/coroutines/internal/y$d;", "a", "Lkotlinx/coroutines/internal/y$d;", "otherOp", "Lkotlinx/coroutines/internal/d;", "()Lkotlinx/coroutines/internal/d;", "atomicOp", "<init>", "(Lkotlinx/coroutines/internal/y$d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes5.dex */
    private static final class c extends j0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        @p3.f
        public final y.d otherOp;

        public c(@d5.d y.d dVar) {
            this.otherOp = dVar;
        }

        @Override // kotlinx.coroutines.internal.j0
        @d5.d
        public kotlinx.coroutines.internal.d<?> a() {
            return this.otherOp.a();
        }

        @Override // kotlinx.coroutines.internal.j0
        @d5.e
        public Object c(@d5.e Object affected) {
            if (affected == null) {
                throw new NullPointerException(ProtectedSandApp.s("幐"));
            }
            b bVar = (b) affected;
            this.otherOp.d();
            Object e6 = this.otherOp.a().e(null);
            androidx.concurrent.futures.d.a(b.f28909s, bVar, this, e6 == null ? this.otherOp.desc : g.f());
            return e6;
        }
    }

    /* compiled from: Select.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/selects/b$d;", "Lkotlinx/coroutines/o2;", "", "cause", "Lkotlin/m2;", "Z0", "<init>", "(Lkotlinx/coroutines/selects/b;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    private final class d extends o2 {
        public d() {
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Throwable th) {
            Z0(th);
            return m2.f23662a;
        }

        @Override // kotlinx.coroutines.h0
        public void Z0(@d5.e Throwable th) {
            if (b.this.t()) {
                b.this.j0(a1().O());
            }
        }
    }

    /* compiled from: Runnable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/m2;", "run", "()V", "kotlinx/coroutines/j3$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes5.dex */
    public static final class e implements Runnable {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ l f28919p;

        public e(l lVar) {
            this.f28919p = lVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (b.this.t()) {
                l lVar = this.f28919p;
                b bVar = b.this;
                bVar.getClass();
                q4.a.d(lVar, bVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@d5.d Continuation<? super R> continuation) {
        Object obj;
        this.uCont = continuation;
        obj = g.f28922c;
        this._result = obj;
        this._parentHandle = null;
    }

    private final void X() {
        n2 n2Var = (n2) getContext().b(n2.INSTANCE);
        if (n2Var == null) {
            return;
        }
        p1 f6 = n2.a.f(n2Var, true, false, new d(), 2, null);
        this._parentHandle = f6;
        if (C()) {
            f6.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e1() {
        p1 p1Var = (p1) this._parentHandle;
        if (p1Var != null) {
            p1Var.g();
        }
        for (y yVar = (y) K0(); !l0.g(yVar, this); yVar = yVar.L0()) {
            if (yVar instanceof C0454b) {
                ((C0454b) yVar).handle.g();
            }
        }
    }

    private final void f1(q3.a<? extends Object> value, q3.a<m2> block) {
        Object obj;
        Object obj2;
        Object obj3;
        while (true) {
            Object obj4 = this._result;
            obj = g.f28922c;
            if (obj4 == obj) {
                Object n5 = value.n();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28910t;
                obj2 = g.f28922c;
                if (androidx.concurrent.futures.d.a(atomicReferenceFieldUpdater, this, obj2, n5)) {
                    return;
                }
            } else {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj4 != coroutineSingletons) {
                    throw new IllegalStateException(ProtectedSandApp.s("酸"));
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f28910t;
                obj3 = g.f28923d;
                if (androidx.concurrent.futures.d.a(atomicReferenceFieldUpdater2, this, coroutineSingletons, obj3)) {
                    block.n();
                    return;
                }
            }
        }
    }

    private final p1 g1() {
        return (p1) this._parentHandle;
    }

    private final void j1(p1 p1Var) {
        this._parentHandle = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.a
    public <P, Q> void A(@d5.d kotlinx.coroutines.selects.e<? super P, ? extends Q> eVar, P p5, @d5.d p<? super Q, ? super Continuation<? super R>, ? extends Object> pVar) {
        eVar.V(this, p5, pVar);
    }

    @Override // kotlinx.coroutines.selects.f
    public boolean C() {
        while (true) {
            Object obj = this._state;
            if (obj == g.f()) {
                return false;
            }
            if (!(obj instanceof j0)) {
                return true;
            }
            ((j0) obj).c(this);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @d5.e
    /* renamed from: I */
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.selects.f
    @d5.d
    public Continuation<R> L() {
        return this;
    }

    @Override // kotlinx.coroutines.selects.a
    public void R(@d5.d kotlinx.coroutines.selects.c cVar, @d5.d l<? super Continuation<? super R>, ? extends Object> lVar) {
        cVar.x(this, lVar);
    }

    @Override // kotlinx.coroutines.selects.a
    public void b(long timeMillis, @d5.d l<? super Continuation<? super R>, ? extends Object> block) {
        if (timeMillis > 0) {
            t0(f1.d(getContext()).b0(timeMillis, new e(block), getContext()));
        } else if (t()) {
            q4.b.c(block, this);
        }
    }

    @Override // kotlinx.coroutines.selects.a
    public <P, Q> void c(@d5.d kotlinx.coroutines.selects.e<? super P, ? extends Q> eVar, @d5.d p<? super Q, ? super Continuation<? super R>, ? extends Object> pVar) {
        A(eVar, null, pVar);
    }

    @d5.e
    @PublishedApi
    public final Object h1() {
        Object obj;
        Object obj2;
        Object obj3;
        if (!C()) {
            X();
        }
        Object obj4 = this._result;
        obj = g.f28922c;
        if (obj4 == obj) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28910t;
            obj3 = g.f28922c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (androidx.concurrent.futures.d.a(atomicReferenceFieldUpdater, this, obj3, coroutineSingletons)) {
                return coroutineSingletons;
            }
            obj4 = this._result;
        }
        obj2 = g.f28923d;
        if (obj4 == obj2) {
            throw new IllegalStateException(ProtectedSandApp.s("酹"));
        }
        if (obj4 instanceof f0) {
            throw ((f0) obj4).cause;
        }
        return obj4;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @d5.e
    /* renamed from: i */
    public CoroutineStackFrame getCallerFrame() {
        Continuation<R> continuation = this.uCont;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @PublishedApi
    public final void i1(@d5.d Throwable e6) {
        if (t()) {
            Result.a aVar = Result.f27242p;
            s(a1.a(e6));
        } else {
            if (e6 instanceof CancellationException) {
                return;
            }
            Object h12 = h1();
            if ((h12 instanceof f0) && ((f0) h12).cause == e6) {
                return;
            }
            r0.b(getContext(), e6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0030, code lost:
    
        e1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0035, code lost:
    
        return kotlinx.coroutines.t.f29000d;
     */
    @Override // kotlinx.coroutines.selects.f
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(@d5.e kotlinx.coroutines.internal.y.d r4) {
        /*
            r3 = this;
        L0:
            java.lang.Object r0 = r3._state
            java.lang.Object r1 = kotlinx.coroutines.selects.g.f()
            r2 = 0
            if (r0 != r1) goto L36
            if (r4 != 0) goto L18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.b.f28909s
            java.lang.Object r1 = kotlinx.coroutines.selects.g.f()
            boolean r0 = androidx.concurrent.futures.d.a(r0, r3, r1, r2)
            if (r0 != 0) goto L30
            goto L0
        L18:
            kotlinx.coroutines.selects.b$c r0 = new kotlinx.coroutines.selects.b$c
            r0.<init>(r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.selects.b.f28909s
            java.lang.Object r2 = kotlinx.coroutines.selects.g.f()
            boolean r1 = androidx.concurrent.futures.d.a(r1, r3, r2, r0)
            if (r1 == 0) goto L0
            java.lang.Object r4 = r0.c(r3)
            if (r4 == 0) goto L30
            return r4
        L30:
            r3.e1()
            kotlinx.coroutines.internal.r0 r4 = kotlinx.coroutines.t.f29000d
            return r4
        L36:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.j0
            if (r1 == 0) goto L6e
            if (r4 == 0) goto L68
            kotlinx.coroutines.internal.d r1 = r4.a()
            boolean r2 = r1 instanceof kotlinx.coroutines.selects.b.a
            if (r2 == 0) goto L5c
            r2 = r1
            kotlinx.coroutines.selects.b$a r2 = (kotlinx.coroutines.selects.b.a) r2
            kotlinx.coroutines.selects.b<?> r2 = r2.impl
            if (r2 == r3) goto L4c
            goto L5c
        L4c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "酺"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L5c:
            r2 = r0
            kotlinx.coroutines.internal.j0 r2 = (kotlinx.coroutines.internal.j0) r2
            boolean r1 = r1.b(r2)
            if (r1 == 0) goto L68
            java.lang.Object r4 = kotlinx.coroutines.internal.c.f28690b
            return r4
        L68:
            kotlinx.coroutines.internal.j0 r0 = (kotlinx.coroutines.internal.j0) r0
            r0.c(r3)
            goto L0
        L6e:
            if (r4 != 0) goto L71
            return r2
        L71:
            kotlinx.coroutines.internal.y$a r4 = r4.desc
            if (r0 != r4) goto L78
            kotlinx.coroutines.internal.r0 r4 = kotlinx.coroutines.t.f29000d
            return r4
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.b.j(kotlinx.coroutines.internal.y$d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.selects.f
    public void j0(@d5.d Throwable exception) {
        Object obj;
        Object obj2;
        Object obj3;
        Continuation e6;
        while (true) {
            Object obj4 = this._result;
            obj = g.f28922c;
            if (obj4 == obj) {
                f0 f0Var = new f0(exception, false, 2, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28910t;
                obj2 = g.f28922c;
                if (androidx.concurrent.futures.d.a(atomicReferenceFieldUpdater, this, obj2, f0Var)) {
                    return;
                }
            } else {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj4 != coroutineSingletons) {
                    throw new IllegalStateException(ProtectedSandApp.s("酻"));
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f28910t;
                obj3 = g.f28923d;
                if (androidx.concurrent.futures.d.a(atomicReferenceFieldUpdater2, this, coroutineSingletons, obj3)) {
                    e6 = kotlin.coroutines.intrinsics.c.e(this.uCont);
                    Result.a aVar = Result.f27242p;
                    e6.s(a1.a(exception));
                    return;
                }
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    @d5.d
    /* renamed from: l */
    public CoroutineContext getContext() {
        return this.uCont.getContext();
    }

    @Override // kotlinx.coroutines.selects.f
    @d5.e
    public Object l0(@d5.d kotlinx.coroutines.internal.b desc) {
        return new a(this, desc).c(null);
    }

    @Override // kotlin.coroutines.Continuation
    public void s(@d5.d Object result) {
        Object obj;
        Object obj2;
        Object obj3;
        while (true) {
            Object obj4 = this._result;
            obj = g.f28922c;
            if (obj4 == obj) {
                Object d6 = k0.d(result, null, 1, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28910t;
                obj2 = g.f28922c;
                if (androidx.concurrent.futures.d.a(atomicReferenceFieldUpdater, this, obj2, d6)) {
                    return;
                }
            } else {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj4 != coroutineSingletons) {
                    throw new IllegalStateException(ProtectedSandApp.s("酼"));
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f28910t;
                obj3 = g.f28923d;
                if (androidx.concurrent.futures.d.a(atomicReferenceFieldUpdater2, this, coroutineSingletons, obj3)) {
                    if (!Result.i(result)) {
                        this.uCont.s(result);
                        return;
                    }
                    Continuation<R> continuation = this.uCont;
                    Throwable e6 = Result.e(result);
                    l0.m(e6);
                    Result.a aVar = Result.f27242p;
                    continuation.s(a1.a(e6));
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.a
    public <Q> void s0(@d5.d kotlinx.coroutines.selects.d<? extends Q> dVar, @d5.d p<? super Q, ? super Continuation<? super R>, ? extends Object> pVar) {
        dVar.L(this, pVar);
    }

    @Override // kotlinx.coroutines.selects.f
    public boolean t() {
        Object j5 = j(null);
        if (j5 == t.f29000d) {
            return true;
        }
        if (j5 == null) {
            return false;
        }
        throw new IllegalStateException(r.a(ProtectedSandApp.s("酽"), j5));
    }

    @Override // kotlinx.coroutines.selects.f
    public void t0(@d5.d p1 handle) {
        C0454b c0454b = new C0454b(handle);
        if (!C()) {
            z0(c0454b);
            if (!C()) {
                return;
            }
        }
        handle.g();
    }

    @Override // kotlinx.coroutines.internal.y
    @d5.d
    public String toString() {
        return ProtectedSandApp.s("酾") + this._state + ProtectedSandApp.s("酿") + this._result + ')';
    }
}
