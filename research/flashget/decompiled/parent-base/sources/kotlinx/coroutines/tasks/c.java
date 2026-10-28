package kotlinx.coroutines.tasks;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import fg.m;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.k2;
import kotlin.z0;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.p;
import kotlinx.coroutines.q;
import kotlinx.coroutines.v;
import kotlinx.coroutines.x;
import kotlinx.coroutines.y;
import kotlinx.coroutines.z0;
import kotlinx.coroutines.z1;
import ld.l;
import ld.p;

/* compiled from: Tasks.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\n\u001a#\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"T", "Lkotlinx/coroutines/z0;", "Lcom/google/android/gms/tasks/Task;", "g", "(Lkotlinx/coroutines/z0;)Lcom/google/android/gms/tasks/Task;", "c", "(Lcom/google/android/gms/tasks/Task;)Lkotlinx/coroutines/z0;", "Lcom/google/android/gms/tasks/CancellationTokenSource;", "cancellationTokenSource", "d", "(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/CancellationTokenSource;)Lkotlinx/coroutines/z0;", "e", "i", "(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/d;)Ljava/lang/Object;", "h", "(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/CancellationTokenSource;Lkotlin/coroutines/d;)Ljava/lang/Object;", "j", "kotlinx-coroutines-play-services"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTasks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/tasks/TasksKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,167:1\n314#2,11:168\n*S KotlinDebug\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/tasks/TasksKt\n*L\n139#1:168,11\n*E\n"})
/* loaded from: classes7.dex */
public final class c {

    /* compiled from: Tasks.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CancellationTokenSource f81153b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CancellationTokenSource cancellationTokenSource) {
            super(1);
            this.f81153b = cancellationTokenSource;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m Throwable th) {
            this.f81153b.cancel();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Tasks.kt */
    @Metadata(d1 = {"\u0000\u008d\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J8\u0010\u001a\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00152\u0006\u0010\u0016\u001a\u00028\u00012\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00010\u0017H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\u001f\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u001c*\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001dH\u0096\u0003¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010!\u001a\u00060\u0011j\u0002`\u0012H\u0097\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\fH\u0097\u0001¢\u0006\u0004\b%\u0010&JI\u0010/\u001a\u00020.2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2'\u0010-\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t0)j\u0002`,H\u0097\u0001¢\u0006\u0004\b/\u00100J9\u00101\u001a\u00020.2'\u0010-\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\t0)j\u0002`,H\u0096\u0001¢\u0006\u0004\b1\u00102J\u0013\u00103\u001a\u00020\tH\u0096Aø\u0001\u0000¢\u0006\u0004\b3\u0010\bJ\u001c\u00105\u001a\u0002042\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0096\u0001¢\u0006\u0004\b5\u00106J\u0018\u00108\u001a\u0002042\u0006\u00107\u001a\u000204H\u0096\u0003¢\u0006\u0004\b8\u00109J\u0018\u0010\u001c\u001a\u00020:2\u0006\u0010;\u001a\u00020:H\u0097\u0003¢\u0006\u0004\b\u001c\u0010<J\u0010\u0010=\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b=\u0010>R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020:0?8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010>R\u0014\u0010D\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010>R\u0014\u0010F\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bE\u0010>R\u0018\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010HR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000I8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0016\u0010S\u001a\u0004\u0018\u00010:8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bQ\u0010R\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006T"}, d2 = {"kotlinx/coroutines/tasks/c$b", "Lkotlinx/coroutines/z0;", "Lkotlinx/coroutines/x;", "child", "Lkotlinx/coroutines/v;", "N0", "(Lkotlinx/coroutines/x;)Lkotlinx/coroutines/v;", "z", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/k2;", "cancel", "()V", "", "cause", "", "f", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "b", "(Ljava/util/concurrent/CancellationException;)V", "R", "initial", "Lkotlin/Function2;", "Lkotlin/coroutines/g$b;", "operation", "g", "(Ljava/lang/Object;Lld/p;)Ljava/lang/Object;", "E", "Lkotlin/coroutines/g$c;", "key", "c", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "x", "()Ljava/util/concurrent/CancellationException;", "k", "()Ljava/lang/Object;", "s", "()Ljava/lang/Throwable;", "onCancelling", "invokeImmediately", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/m1;", "K0", "(ZZLld/l;)Lkotlinx/coroutines/m1;", "F", "(Lld/l;)Lkotlinx/coroutines/m1;", "j0", "Lkotlin/coroutines/g;", "d", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g;", "context", "O", "(Lkotlin/coroutines/g;)Lkotlin/coroutines/g;", "Lkotlinx/coroutines/k2;", "other", "(Lkotlinx/coroutines/k2;)Lkotlinx/coroutines/k2;", "start", "()Z", "Lkotlin/sequences/m;", "o", "()Lkotlin/sequences/m;", "children", "isActive", "isCancelled", "l", "isCompleted", "getKey", "()Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/selects/g;", "X", "()Lkotlinx/coroutines/selects/g;", "onAwait", "Lkotlinx/coroutines/selects/e;", "r0", "()Lkotlinx/coroutines/selects/e;", "onJoin", "getParent", "()Lkotlinx/coroutines/k2;", "parent", "kotlinx-coroutines-play-services"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b<T> implements z0<T> {

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ y<T> f81154b;

        b(y<T> yVar) {
            this.f81154b = yVar;
        }

        @Override // kotlinx.coroutines.k2
        @fg.l
        @k(level = kotlin.m.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public kotlinx.coroutines.k2 E(@fg.l kotlinx.coroutines.k2 other) {
            return this.f81154b.E(other);
        }

        @Override // kotlinx.coroutines.k2
        @fg.l
        public m1 F(@fg.l l<? super Throwable, k2> handler) {
            return this.f81154b.F(handler);
        }

        @Override // kotlinx.coroutines.k2
        @fg.l
        @f2
        public m1 K0(boolean onCancelling, boolean invokeImmediately, @fg.l l<? super Throwable, k2> handler) {
            return this.f81154b.K0(onCancelling, invokeImmediately, handler);
        }

        @Override // kotlinx.coroutines.k2
        @fg.l
        @f2
        public v N0(@fg.l x child) {
            return this.f81154b.N0(child);
        }

        @Override // kotlin.coroutines.g
        @fg.l
        public g O(@fg.l g context) {
            return this.f81154b.O(context);
        }

        @Override // kotlinx.coroutines.z0
        @fg.l
        public kotlinx.coroutines.selects.g<T> X() {
            return this.f81154b.X();
        }

        @Override // kotlinx.coroutines.k2, kotlinx.coroutines.channels.d
        public void b(@m CancellationException cause) {
            this.f81154b.b(cause);
        }

        @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
        @m
        public <E extends g.b> E c(@fg.l g.c<E> key) {
            return (E) this.f81154b.c(key);
        }

        @Override // kotlinx.coroutines.k2, kotlinx.coroutines.channels.d0
        @k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public /* synthetic */ void cancel() {
            this.f81154b.cancel();
        }

        @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
        @fg.l
        public g d(@fg.l g.c<?> key) {
            return this.f81154b.d(key);
        }

        @Override // kotlinx.coroutines.k2, kotlinx.coroutines.channels.d
        @k(level = kotlin.m.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public /* synthetic */ boolean f(Throwable cause) {
            return this.f81154b.f(cause);
        }

        @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
        public <R> R g(R initial, @fg.l p<? super R, ? super g.b, ? extends R> operation) {
            return (R) this.f81154b.g(initial, operation);
        }

        @Override // kotlin.coroutines.g.b
        @fg.l
        public g.c<?> getKey() {
            return this.f81154b.getKey();
        }

        @Override // kotlinx.coroutines.k2
        @m
        public kotlinx.coroutines.k2 getParent() {
            return this.f81154b.getParent();
        }

        @Override // kotlinx.coroutines.k2
        public boolean isActive() {
            return this.f81154b.isActive();
        }

        @Override // kotlinx.coroutines.k2
        public boolean isCancelled() {
            return this.f81154b.isCancelled();
        }

        @Override // kotlinx.coroutines.k2
        @m
        public Object j0(@fg.l kotlin.coroutines.d<? super k2> dVar) {
            return this.f81154b.j0(dVar);
        }

        @Override // kotlinx.coroutines.z0
        @z1
        public T k() {
            return this.f81154b.k();
        }

        @Override // kotlinx.coroutines.k2
        public boolean l() {
            return this.f81154b.l();
        }

        @Override // kotlinx.coroutines.k2
        @fg.l
        public kotlin.sequences.m<kotlinx.coroutines.k2> o() {
            return this.f81154b.o();
        }

        @Override // kotlinx.coroutines.k2
        @fg.l
        public kotlinx.coroutines.selects.e r0() {
            return this.f81154b.r0();
        }

        @Override // kotlinx.coroutines.z0
        @m
        @z1
        public Throwable s() {
            return this.f81154b.s();
        }

        @Override // kotlinx.coroutines.k2
        public boolean start() {
            return this.f81154b.start();
        }

        @Override // kotlinx.coroutines.k2
        @fg.l
        @f2
        public CancellationException x() {
            return this.f81154b.x();
        }

        @Override // kotlinx.coroutines.z0
        @m
        public Object z(@fg.l kotlin.coroutines.d<? super T> dVar) {
            return this.f81154b.z(dVar);
        }
    }

    /* compiled from: Tasks.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: kotlinx.coroutines.tasks.c$c, reason: collision with other inner class name */
    static final class C1266c extends n0 implements l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CancellationTokenSource f81155b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z0<T> f81156c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TaskCompletionSource<T> f81157d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1266c(CancellationTokenSource cancellationTokenSource, z0<? extends T> z0Var, TaskCompletionSource<T> taskCompletionSource) {
            super(1);
            this.f81155b = cancellationTokenSource;
            this.f81156c = z0Var;
            this.f81157d = taskCompletionSource;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m Throwable th) {
            if (th instanceof CancellationException) {
                this.f81155b.cancel();
                return;
            }
            Throwable s4 = this.f81156c.s();
            if (s4 == null) {
                this.f81157d.setResult(this.f81156c.k());
                return;
            }
            TaskCompletionSource<T> taskCompletionSource = this.f81157d;
            Exception exc = s4 instanceof Exception ? (Exception) s4 : null;
            if (exc == null) {
                exc = new RuntimeExecutionException(s4);
            }
            taskCompletionSource.setException(exc);
        }
    }

    /* compiled from: Tasks.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00008\u00000\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lcom/google/android/gms/tasks/Task;", "kotlin.jvm.PlatformType", "it", "Lkotlin/k2;", "onComplete", "(Lcom/google/android/gms/tasks/Task;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class d<TResult> implements OnCompleteListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<T> f81158a;

        /* JADX WARN: Multi-variable type inference failed */
        d(kotlinx.coroutines.p<? super T> pVar) {
            this.f81158a = pVar;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(@fg.l Task<T> task) {
            Exception exception = task.getException();
            if (exception != null) {
                kotlin.coroutines.d dVar = this.f81158a;
                z0.Companion companion = kotlin.z0.INSTANCE;
                dVar.resumeWith(a1.a(exception));
            } else {
                if (task.isCanceled()) {
                    p.a.a(this.f81158a, null, 1, null);
                    return;
                }
                kotlin.coroutines.d dVar2 = this.f81158a;
                z0.Companion companion2 = kotlin.z0.INSTANCE;
                dVar2.resumeWith(task.getResult());
            }
        }
    }

    /* compiled from: Tasks.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class e extends n0 implements l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CancellationTokenSource f81159b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CancellationTokenSource cancellationTokenSource) {
            super(1);
            this.f81159b = cancellationTokenSource;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m Throwable th) {
            this.f81159b.cancel();
        }
    }

    @fg.l
    public static final <T> kotlinx.coroutines.z0<T> c(@fg.l Task<T> task) {
        return e(task, null);
    }

    @fg.l
    @z1
    public static final <T> kotlinx.coroutines.z0<T> d(@fg.l Task<T> task, @fg.l CancellationTokenSource cancellationTokenSource) {
        return e(task, cancellationTokenSource);
    }

    private static final <T> kotlinx.coroutines.z0<T> e(Task<T> task, CancellationTokenSource cancellationTokenSource) {
        final y c5 = a0.c(null, 1, null);
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception != null) {
                c5.e(exception);
            } else if (task.isCanceled()) {
                k2.a.b(c5, null, 1, null);
            } else {
                c5.I(task.getResult());
            }
        } else {
            task.addOnCompleteListener(kotlinx.coroutines.tasks.a.f81151b, new OnCompleteListener() { // from class: kotlinx.coroutines.tasks.b
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    c.f(y.this, task2);
                }
            });
        }
        if (cancellationTokenSource != null) {
            c5.F(new a(cancellationTokenSource));
        }
        return new b(c5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(y yVar, Task task) {
        Exception exception = task.getException();
        if (exception != null) {
            yVar.e(exception);
        } else if (task.isCanceled()) {
            k2.a.b(yVar, null, 1, null);
        } else {
            yVar.I(task.getResult());
        }
    }

    @fg.l
    public static final <T> Task<T> g(@fg.l kotlinx.coroutines.z0<? extends T> z0Var) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        z0Var.F(new C1266c(cancellationTokenSource, z0Var, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @m
    @z1
    public static final <T> Object h(@fg.l Task<T> task, @fg.l CancellationTokenSource cancellationTokenSource, @fg.l kotlin.coroutines.d<? super T> dVar) {
        return j(task, cancellationTokenSource, dVar);
    }

    @m
    public static final <T> Object i(@fg.l Task<T> task, @fg.l kotlin.coroutines.d<? super T> dVar) {
        return j(task, null, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object j(Task<T> task, CancellationTokenSource cancellationTokenSource, kotlin.coroutines.d<? super T> dVar) {
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception != null) {
                throw exception;
            }
            if (!task.isCanceled()) {
                return task.getResult();
            }
            throw new CancellationException(ProtectedSandApp.s("褃\u0001") + task + ProtectedSandApp.s("褄\u0001"));
        }
        q qVar = new q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        task.addOnCompleteListener(kotlinx.coroutines.tasks.a.f81151b, new d(qVar));
        if (cancellationTokenSource != null) {
            qVar.k0(new e(cancellationTokenSource));
        }
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            h.c(dVar);
        }
        return y4;
    }
}
