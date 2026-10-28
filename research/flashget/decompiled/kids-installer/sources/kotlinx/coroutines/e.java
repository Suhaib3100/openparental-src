package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: Await.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\b\u0004B\u001d\u0012\u0014\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/e;", "T", "", "", "b", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "Lkotlinx/coroutines/c1;", "a", "[Lkotlinx/coroutines/c1;", "deferreds", "<init>", "([Lkotlinx/coroutines/c1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
final class e<T> {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ AtomicIntegerFieldUpdater f27705b = AtomicIntegerFieldUpdater.newUpdater(e.class, ProtectedSandApp.s("崺"));

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final c1<T>[] deferreds;

    @d5.d
    volatile /* synthetic */ int notCompletedCount;

    /* compiled from: Await.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R<\u0010\u001b\u001a\u000e\u0018\u00010\u0014R\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0016\u001a\u000e\u0018\u00010\u0014R\b\u0012\u0004\u0012\u00028\u00000\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/e$a;", "Lkotlinx/coroutines/t2;", "", "cause", "Lkotlin/m2;", "Z0", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/q;", "", "s", "Lkotlinx/coroutines/q;", "continuation", "Lkotlinx/coroutines/p1;", "t", "Lkotlinx/coroutines/p1;", "d1", "()Lkotlinx/coroutines/p1;", "f1", "(Lkotlinx/coroutines/p1;)V", "handle", "Lkotlinx/coroutines/e$b;", "Lkotlinx/coroutines/e;", "value", "c1", "()Lkotlinx/coroutines/e$b;", "e1", "(Lkotlinx/coroutines/e$b;)V", "disposer", "<init>", "(Lkotlinx/coroutines/e;Lkotlinx/coroutines/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    private final class a extends t2 {

        @d5.d
        private volatile /* synthetic */ Object _disposer = null;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final q<List<? extends T>> continuation;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        public p1 handle;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@d5.d q<? super List<? extends T>> qVar) {
            this.continuation = qVar;
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ kotlin.m2 N(Throwable th) {
            Z0(th);
            return kotlin.m2.f23662a;
        }

        @Override // kotlinx.coroutines.h0
        public void Z0(@d5.e Throwable cause) {
            if (cause != null) {
                Object J = this.continuation.J(cause);
                if (J != null) {
                    this.continuation.v0(J);
                    b bVar = (b) this._disposer;
                    if (bVar != null) {
                        bVar.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (e.f27705b.decrementAndGet(e.this) == 0) {
                q<List<? extends T>> qVar = this.continuation;
                c1[] c1VarArr = ((e) e.this).deferreds;
                ArrayList arrayList = new ArrayList(c1VarArr.length);
                for (c1 c1Var : c1VarArr) {
                    arrayList.add(c1Var.t());
                }
                Result.a aVar = Result.f27242p;
                qVar.s(arrayList);
            }
        }

        @d5.e
        public final e<T>.b c1() {
            return (b) this._disposer;
        }

        @d5.d
        public final p1 d1() {
            p1 p1Var = this.handle;
            if (p1Var != null) {
                return p1Var;
            }
            kotlin.jvm.internal.l0.S(ProtectedSandApp.s("郌"));
            return null;
        }

        public final void e1(@d5.e e<T>.b bVar) {
            this._disposer = bVar;
        }

        public final void f1(@d5.d p1 p1Var) {
            this.handle = p1Var;
        }
    }

    /* compiled from: Await.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R$\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/e$b;", "Lkotlinx/coroutines/o;", "Lkotlin/m2;", "b", "", "cause", "a", "", "toString", "", "Lkotlinx/coroutines/e$a;", "Lkotlinx/coroutines/e;", "o", "[Lkotlinx/coroutines/e$a;", "nodes", "<init>", "(Lkotlinx/coroutines/e;[Lkotlinx/coroutines/e$a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    private final class b extends o {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final e<T>.a[] nodes;

        public b(@d5.d e<T>.a[] aVarArr) {
            this.nodes = aVarArr;
        }

        @Override // q3.l
        public kotlin.m2 N(Throwable th) {
            b();
            return kotlin.m2.f23662a;
        }

        @Override // kotlinx.coroutines.p
        public void a(@d5.e Throwable th) {
            b();
        }

        public final void b() {
            for (e<T>.a aVar : this.nodes) {
                aVar.d1().g();
            }
        }

        @d5.d
        public String toString() {
            return ProtectedSandApp.s("郍") + this.nodes + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@d5.d c1<? extends T>[] c1VarArr) {
        this.deferreds = c1VarArr;
        this.notCompletedCount = c1VarArr.length;
    }

    @d5.e
    public final Object b(@d5.d Continuation<? super List<? extends T>> continuation) {
        Continuation e6;
        e6 = kotlin.coroutines.intrinsics.c.e(continuation);
        s sVar = new s(e6, 1);
        sVar.X();
        int length = this.deferreds.length;
        a[] aVarArr = new a[length];
        for (int i5 = 0; i5 < length; i5++) {
            c1<T> c1Var = this.deferreds[i5];
            c1Var.start();
            a aVar = new a(sVar);
            aVar.handle = c1Var.m0(aVar);
            kotlin.m2 m2Var = kotlin.m2.f23662a;
            aVarArr[i5] = aVar;
        }
        e<T>.b bVar = new b(aVarArr);
        for (int i6 = 0; i6 < length; i6++) {
            aVarArr[i6].e1(bVar);
        }
        if (sVar.m()) {
            bVar.b();
        } else {
            sVar.K(bVar);
        }
        Object A = sVar.A();
        if (A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return A;
    }
}
