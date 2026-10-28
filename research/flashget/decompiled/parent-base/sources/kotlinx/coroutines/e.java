package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.z0;

/* compiled from: Await.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000b\u000fB\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u000b\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/e;", "T", "", "", "Lkotlinx/coroutines/z0;", "deferreds", "<init>", "([Lkotlinx/coroutines/z0;)V", "", "c", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "[Lkotlinx/coroutines/z0;", "Lkotlinx/atomicfu/AtomicInt;", "notCompletedCount", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,127:1\n314#2,9:128\n323#2,2:141\n13#3:137\n19#3:140\n13579#4,2:138\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll\n*L\n71#1:128,9\n71#1:141,2\n78#1:137\n90#1:140\n83#1:138,2\n*E\n"})
/* loaded from: classes7.dex */
final class e<T> {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final AtomicIntegerFieldUpdater f79731b = AtomicIntegerFieldUpdater.newUpdater(e.class, ProtectedSandApp.s("蛎\u0001"));

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final z0<T>[] deferreds;

    @kd.x
    private volatile int notCompletedCount;

    /* compiled from: Await.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R<\u0010\u001d\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00172\u0012\u0010\u0018\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00170\u001e8\u0002X\u0082\u0004¨\u0006 "}, d2 = {"Lkotlinx/coroutines/e$a;", "Lkotlinx/coroutines/q2;", "Lkotlinx/coroutines/p;", "", "continuation", "<init>", "(Lkotlinx/coroutines/e;Lkotlinx/coroutines/p;)V", "", "cause", "Lkotlin/k2;", "Z", "(Ljava/lang/Throwable;)V", "f", "Lkotlinx/coroutines/p;", "Lkotlinx/coroutines/m1;", "g", "Lkotlinx/coroutines/m1;", "h0", "()Lkotlinx/coroutines/m1;", "j0", "(Lkotlinx/coroutines/m1;)V", "handle", "Lkotlinx/coroutines/e$b;", "Lkotlinx/coroutines/e;", "value", "g0", "()Lkotlinx/coroutines/e$b;", "i0", "(Lkotlinx/coroutines/e$b;)V", "disposer", "Lkotlinx/atomicfu/AtomicRef;", "_disposer", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,127:1\n11335#2:128\n11670#2,3:129\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n*L\n121#1:128\n121#1:129,3\n*E\n"})
    private final class a extends q2 {

        /* renamed from: i, reason: collision with root package name */
        @fg.l
        private static final AtomicReferenceFieldUpdater f79733i = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, ProtectedSandApp.s("蛉\u0001"));

        @fg.m
        @kd.x
        private volatile Object _disposer;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final p<List<? extends T>> continuation;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        public m1 handle;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@fg.l p<? super List<? extends T>> pVar) {
            this.continuation = pVar;
        }

        @Override // kotlinx.coroutines.f0
        public void Z(@fg.m Throwable cause) {
            if (cause != null) {
                Object v4 = this.continuation.v(cause);
                if (v4 != null) {
                    this.continuation.l0(v4);
                    e<T>.b g02 = g0();
                    if (g02 != null) {
                        g02.p();
                        return;
                    }
                    return;
                }
                return;
            }
            if (e.f79731b.decrementAndGet(e.this) == 0) {
                p<List<? extends T>> pVar = this.continuation;
                z0[] z0VarArr = ((e) e.this).deferreds;
                ArrayList arrayList = new ArrayList(z0VarArr.length);
                for (z0 z0Var : z0VarArr) {
                    arrayList.add(z0Var.k());
                }
                z0.Companion companion = kotlin.z0.INSTANCE;
                pVar.resumeWith(arrayList);
            }
        }

        @fg.m
        public final e<T>.b g0() {
            return (b) f79733i.get(this);
        }

        @fg.l
        public final m1 h0() {
            m1 m1Var = this.handle;
            if (m1Var != null) {
                return m1Var;
            }
            kotlin.jvm.internal.l0.S(ProtectedSandApp.s("蛊\u0001"));
            return null;
        }

        public final void i0(@fg.m e<T>.b bVar) {
            f79733i.set(this, bVar);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
            Z(th);
            return kotlin.k2.f75408a;
        }

        public final void j0(@fg.l m1 m1Var) {
            this.handle = m1Var;
        }
    }

    /* compiled from: Await.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/e$b;", "Lkotlinx/coroutines/n;", "", "Lkotlinx/coroutines/e$a;", "Lkotlinx/coroutines/e;", "nodes", "<init>", "(Lkotlinx/coroutines/e;[Lkotlinx/coroutines/e$a;)V", "Lkotlin/k2;", "p", "()V", "", "cause", "n", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "b", "[Lkotlinx/coroutines/e$a;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,127:1\n13579#2,2:128\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel\n*L\n96#1:128,2\n*E\n"})
    private final class b extends n {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final e<T>.a[] nodes;

        public b(@fg.l e<T>.a[] aVarArr) {
            this.nodes = aVarArr;
        }

        @Override // ld.l
        public kotlin.k2 invoke(Throwable th) {
            p();
            return kotlin.k2.f75408a;
        }

        @Override // kotlinx.coroutines.o
        public void n(@fg.m Throwable cause) {
            p();
        }

        public final void p() {
            for (e<T>.a aVar : this.nodes) {
                aVar.h0().dispose();
            }
        }

        @fg.l
        public String toString() {
            return ProtectedSandApp.s("蛋\u0001") + this.nodes + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@fg.l z0<? extends T>[] z0VarArr) {
        this.deferreds = z0VarArr;
        this.notCompletedCount = z0VarArr.length;
    }

    @fg.m
    public final Object c(@fg.l kotlin.coroutines.d<? super List<? extends T>> dVar) {
        q qVar = new q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        int length = this.deferreds.length;
        a[] aVarArr = new a[length];
        for (int i4 = 0; i4 < length; i4++) {
            z0<T> z0Var = this.deferreds[i4];
            z0Var.start();
            a aVar = new a(qVar);
            aVar.handle = z0Var.F(aVar);
            kotlin.k2 k2Var = kotlin.k2.f75408a;
            aVarArr[i4] = aVar;
        }
        e<T>.b bVar = new b(aVarArr);
        for (int i5 = 0; i5 < length; i5++) {
            aVarArr[i5].i0(bVar);
        }
        if (qVar.l()) {
            bVar.p();
        } else {
            qVar.k0(bVar);
        }
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }
}
