package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.m2;
import kotlinx.coroutines.a4;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.t1;
import kotlinx.coroutines.t3;

/* compiled from: DispatchedContinuation.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aW\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0012\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\t0\rH\u0000\u001a;\u0010\u0017\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\u0082\b\"\u001a\u0010\u001d\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001b\u0010\u001c\"\u001a\u0010\u001f\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u0012\u0004\b\u001e\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"T", "Lkotlin/coroutines/d;", "Lkotlin/z0;", "result", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "Lkotlin/m2;", "onCancellation", "f", "(Lkotlin/coroutines/d;Ljava/lang/Object;Lq3/l;)V", "Lkotlinx/coroutines/internal/l;", "", "h", "", "contState", "", "mode", "doYield", "Lkotlin/Function0;", "block", "b", "Lkotlinx/coroutines/internal/r0;", "a", "Lkotlinx/coroutines/internal/r0;", "getUNDEFINED$annotations", "()V", "UNDEFINED", "getREUSABLE_CLAIMED$annotations", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final r0 f28724a = new r0(ProtectedSandApp.s("川"));

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final r0 f28725b = new r0(ProtectedSandApp.s("州"));

    private static final boolean b(l<?> lVar, Object obj, int i5, boolean z5, q3.a<m2> aVar) {
        t1 b6 = t3.f29007a.b();
        if (z5 && b6.g1()) {
            return false;
        }
        if (b6.f1()) {
            lVar._state = obj;
            lVar.resumeMode = i5;
            b6.O0(lVar);
            return true;
        }
        b6.T0(true);
        try {
            aVar.n();
            do {
            } while (b6.m1());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }

    static boolean c(l lVar, Object obj, int i5, boolean z5, q3.a aVar, int i6, Object obj2) {
        if ((i6 & 4) != 0) {
            z5 = false;
        }
        t1 b6 = t3.f29007a.b();
        if (z5 && b6.g1()) {
            return false;
        }
        if (b6.f1()) {
            lVar._state = obj;
            lVar.resumeMode = i5;
            b6.O0(lVar);
            return true;
        }
        b6.T0(true);
        try {
            aVar.n();
            do {
            } while (b6.m1());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }

    public static /* synthetic */ void d() {
    }

    private static /* synthetic */ void e() {
    }

    /* JADX WARN: Finally extract failed */
    @i2
    public static final <T> void f(@d5.d Continuation<? super T> continuation, @d5.d Object obj, @d5.e q3.l<? super Throwable, m2> lVar) {
        boolean z5;
        if (!(continuation instanceof l)) {
            continuation.s(obj);
            return;
        }
        l lVar2 = (l) continuation;
        Object c6 = kotlinx.coroutines.k0.c(obj, lVar);
        if (lVar2.dispatcher.B0(lVar2.getContext())) {
            lVar2._state = c6;
            lVar2.resumeMode = 1;
            lVar2.dispatcher.y0(lVar2.getContext(), lVar2);
            return;
        }
        t1 b6 = t3.f29007a.b();
        if (b6.f1()) {
            lVar2._state = c6;
            lVar2.resumeMode = 1;
            b6.O0(lVar2);
            return;
        }
        b6.T0(true);
        try {
            n2 n2Var = (n2) lVar2.getContext().b(n2.INSTANCE);
            if (n2Var == null || n2Var.d()) {
                z5 = false;
            } else {
                CancellationException O = n2Var.O();
                lVar2.c(c6, O);
                Result.a aVar = Result.f27242p;
                lVar2.s(kotlin.a1.a(O));
                z5 = true;
            }
            if (!z5) {
                Continuation<T> continuation2 = lVar2.continuation;
                Object obj2 = lVar2.countOrElement;
                CoroutineContext context = continuation2.getContext();
                Object c7 = w0.c(context, obj2);
                a4<?> g5 = c7 != w0.f28753a ? kotlinx.coroutines.n0.g(continuation2, context, c7) : null;
                try {
                    lVar2.continuation.s(obj);
                    m2 m2Var = m2.f23662a;
                    if (g5 == null || g5.L1()) {
                        w0.a(context, c7);
                    }
                } catch (Throwable th) {
                    if (g5 == null || g5.L1()) {
                        w0.a(context, c7);
                    }
                    throw th;
                }
            }
            while (b6.m1()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void g(Continuation continuation, Object obj, q3.l lVar, int i5, Object obj2) {
        if ((i5 & 2) != 0) {
            lVar = null;
        }
        f(continuation, obj, lVar);
    }

    public static final boolean h(@d5.d l<? super m2> lVar) {
        m2 m2Var = m2.f23662a;
        t1 b6 = t3.f29007a.b();
        if (b6.g1()) {
            return false;
        }
        if (b6.f1()) {
            lVar._state = m2Var;
            lVar.resumeMode = 1;
            b6.O0(lVar);
            return true;
        }
        b6.T0(true);
        try {
            lVar.run();
            do {
            } while (b6.m1());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
