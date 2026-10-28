package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.z0;

/* compiled from: DispatchedTask.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0011\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a.\u0010\u0013\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a \u0010\u0017\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0080\b¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001a\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019\"\u001a\u0010\u001d\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019\"\u0014\u0010!\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u0019\"\u0014\u0010\"\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019\"\u0018\u0010$\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010#\"\u0018\u0010%\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010#¨\u0006&"}, d2 = {"T", "Lkotlinx/coroutines/g1;", "", "mode", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/g1;I)V", "Lkotlin/coroutines/d;", "delegate", "", "undispatched", "e", "(Lkotlinx/coroutines/g1;Lkotlin/coroutines/d;Z)V", "f", "(Lkotlinx/coroutines/g1;)V", "Lkotlinx/coroutines/q1;", "eventLoop", "Lkotlin/Function0;", "block", "h", "(Lkotlinx/coroutines/g1;Lkotlinx/coroutines/q1;Lld/a;)V", "", "exception", "g", "(Lkotlin/coroutines/d;Ljava/lang/Throwable;)V", "I", "MODE_ATOMIC", "b", "()V", "MODE_CANCELLABLE", "c", "MODE_CANCELLABLE_REUSABLE", "d", "MODE_UNDISPATCHED", "MODE_UNINITIALIZED", "(I)Z", "isCancellableMode", "isReusableMode", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 4 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,222:1\n200#1,17:240\n1#2:223\n255#3:224\n256#3,2:235\n258#3:239\n107#4,10:225\n118#4,2:237\n61#5,2:257\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n*L\n190#1:240,17\n178#1:224\n178#1:235,2\n178#1:239\n178#1:225,10\n178#1:237,2\n220#1:257,2\n*E\n"})
/* loaded from: classes7.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f80713a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f80714b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f80715c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f80716d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f80717e = -1;

    public static final <T> void a(@fg.l g1<? super T> g1Var, int i4) {
        kotlin.coroutines.d<? super T> d5 = g1Var.d();
        boolean z4 = i4 == 4;
        if (z4 || !(d5 instanceof kotlinx.coroutines.internal.l) || c(i4) != c(g1Var.resumeMode)) {
            e(g1Var, d5, z4);
            return;
        }
        m0 m0Var = ((kotlinx.coroutines.internal.l) d5).dispatcher;
        kotlin.coroutines.g f75269b = ((kotlinx.coroutines.internal.l) d5).continuation.getF75269b();
        if (m0Var.c1(f75269b)) {
            m0Var.S0(f75269b, g1Var);
        } else {
            f(g1Var);
        }
    }

    @kotlin.w0
    public static /* synthetic */ void b() {
    }

    public static final boolean c(int i4) {
        return i4 == 1 || i4 == 2;
    }

    public static final boolean d(int i4) {
        return i4 == 2;
    }

    public static final <T> void e(@fg.l g1<? super T> g1Var, @fg.l kotlin.coroutines.d<? super T> dVar, boolean z4) {
        Object g4;
        Object i4 = g1Var.i();
        Throwable e4 = g1Var.e(i4);
        if (e4 != null) {
            z0.Companion companion = kotlin.z0.INSTANCE;
            g4 = kotlin.a1.a(e4);
        } else {
            z0.Companion companion2 = kotlin.z0.INSTANCE;
            g4 = g1Var.g(i4);
        }
        if (!z4) {
            dVar.resumeWith(g4);
            return;
        }
        kotlin.jvm.internal.l0.n(dVar, ProtectedSandApp.s("蟄\u0001"));
        kotlinx.coroutines.internal.l lVar = (kotlinx.coroutines.internal.l) dVar;
        kotlin.coroutines.d<T> dVar2 = lVar.continuation;
        Object obj = lVar.countOrElement;
        kotlin.coroutines.g f75269b = dVar2.getF75269b();
        Object c5 = kotlinx.coroutines.internal.y0.c(f75269b, obj);
        w3<?> g5 = c5 != kotlinx.coroutines.internal.y0.f80834a ? l0.g(dVar2, f75269b, c5) : null;
        try {
            lVar.continuation.resumeWith(g4);
            kotlin.k2 k2Var = kotlin.k2.f75408a;
        } finally {
            if (g5 == null || g5.b2()) {
                kotlinx.coroutines.internal.y0.a(f75269b, c5);
            }
        }
    }

    private static final void f(g1<?> g1Var) {
        q1 b5 = n3.f80870a.b();
        if (b5.H1()) {
            b5.n1(g1Var);
            return;
        }
        b5.y1(true);
        try {
            e(g1Var, g1Var.d(), true);
            do {
            } while (b5.M1());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void g(@fg.l kotlin.coroutines.d<?> dVar, @fg.l Throwable th) {
        z0.Companion companion = kotlin.z0.INSTANCE;
        dVar.resumeWith(kotlin.a1.a(th));
    }

    public static final void h(@fg.l g1<?> g1Var, @fg.l q1 q1Var, @fg.l ld.a<kotlin.k2> aVar) {
        q1Var.y1(true);
        try {
            aVar.invoke();
            do {
            } while (q1Var.M1());
        } finally {
            try {
            } finally {
            }
        }
    }
}
