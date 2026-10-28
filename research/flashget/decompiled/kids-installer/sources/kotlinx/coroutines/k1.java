package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: DispatchedTask.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0011\u001a \u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a.\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001a'\u0010\u0010\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0080\b\u001a\u0019\u0010\u0013\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0080\b\"\u0014\u0010\u0015\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014\"\u001a\u0010\u0019\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014\"\u0014\u0010\u001d\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014\"\u0014\u0010\u001e\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0014\"\u0018\u0010 \u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001f\"\u0018\u0010!\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001f¨\u0006\""}, d2 = {"T", "Lkotlinx/coroutines/j1;", "", "mode", "Lkotlin/m2;", "a", "Lkotlin/coroutines/d;", "delegate", "", "undispatched", "e", "f", "Lkotlinx/coroutines/t1;", "eventLoop", "Lkotlin/Function0;", "block", "h", "", "exception", "g", "I", "MODE_ATOMIC", "b", "getMODE_CANCELLABLE$annotations", "()V", "MODE_CANCELLABLE", "c", "MODE_CANCELLABLE_REUSABLE", "d", "MODE_UNDISPATCHED", "MODE_UNINITIALIZED", "(I)Z", "isCancellableMode", "isReusableMode", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f28794a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f28795b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f28796c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f28797d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f28798e = -1;

    public static final <T> void a(@d5.d j1<? super T> j1Var, int i5) {
        Continuation<? super T> e6 = j1Var.e();
        boolean z5 = i5 == 4;
        if (z5 || !(e6 instanceof kotlinx.coroutines.internal.l) || c(i5) != c(j1Var.resumeMode)) {
            e(j1Var, e6, z5);
            return;
        }
        o0 o0Var = ((kotlinx.coroutines.internal.l) e6).dispatcher;
        CoroutineContext context = e6.getContext();
        if (o0Var.B0(context)) {
            o0Var.y0(context, j1Var);
        } else {
            f(j1Var);
        }
    }

    @PublishedApi
    public static /* synthetic */ void b() {
    }

    public static final boolean c(int i5) {
        return i5 == 1 || i5 == 2;
    }

    public static final boolean d(int i5) {
        return i5 == 2;
    }

    public static final <T> void e(@d5.d j1<? super T> j1Var, @d5.d Continuation<? super T> continuation, boolean z5) {
        Object g5;
        Object j5 = j1Var.j();
        Throwable f6 = j1Var.f(j5);
        if (f6 != null) {
            Result.a aVar = Result.f27242p;
            g5 = kotlin.a1.a(f6);
        } else {
            Result.a aVar2 = Result.f27242p;
            g5 = j1Var.g(j5);
        }
        if (!z5) {
            continuation.s(g5);
            return;
        }
        kotlinx.coroutines.internal.l lVar = (kotlinx.coroutines.internal.l) continuation;
        Continuation<T> continuation2 = lVar.continuation;
        Object obj = lVar.countOrElement;
        CoroutineContext context = continuation2.getContext();
        Object c6 = kotlinx.coroutines.internal.w0.c(context, obj);
        a4<?> g6 = c6 != kotlinx.coroutines.internal.w0.f28753a ? n0.g(continuation2, context, c6) : null;
        try {
            lVar.continuation.s(g5);
            kotlin.m2 m2Var = kotlin.m2.f23662a;
        } finally {
            if (g6 == null || g6.L1()) {
                kotlinx.coroutines.internal.w0.a(context, c6);
            }
        }
    }

    private static final void f(j1<?> j1Var) {
        t1 b6 = t3.f29007a.b();
        if (b6.f1()) {
            b6.O0(j1Var);
            return;
        }
        b6.T0(true);
        try {
            e(j1Var, j1Var.e(), true);
            do {
            } while (b6.m1());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void g(@d5.d Continuation<?> continuation, @d5.d Throwable th) {
        Result.a aVar = Result.f27242p;
        continuation.s(kotlin.a1.a(th));
    }

    public static final void h(@d5.d j1<?> j1Var, @d5.d t1 t1Var, @d5.d q3.a<kotlin.m2> aVar) {
        t1Var.T0(true);
        try {
            aVar.n();
            do {
            } while (t1Var.m1());
        } finally {
            try {
            } finally {
            }
        }
    }
}
