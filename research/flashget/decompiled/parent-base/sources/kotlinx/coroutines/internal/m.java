package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.z0;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.n3;
import kotlinx.coroutines.q1;
import kotlinx.coroutines.w3;

/* compiled from: DispatchedContinuation.kt */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aW\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\t0\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aB\u0010\u0018\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0016H\u0082\b¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\u001a8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"T", "Lkotlin/coroutines/d;", "Lkotlin/z0;", "result", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "Lkotlin/k2;", "onCancellation", "d", "(Lkotlin/coroutines/d;Ljava/lang/Object;Lld/l;)V", "Lkotlinx/coroutines/internal/l;", "", "f", "(Lkotlinx/coroutines/internal/l;)Z", "", "contState", "", "mode", "doYield", "Lkotlin/Function0;", "block", "b", "(Lkotlinx/coroutines/internal/l;Ljava/lang/Object;IZLld/a;)Z", "Lkotlinx/coroutines/internal/s0;", "a", "Lkotlinx/coroutines/internal/s0;", "UNDEFINED", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 2 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,317:1\n297#1,5:325\n302#1,12:331\n314#1:387\n301#1:389\n302#1,12:391\n314#1:420\n217#2,7:318\n224#2:346\n243#2,8:347\n225#2:355\n255#2:356\n256#2,2:367\n258#2:371\n227#2:372\n229#2:388\n1#3:330\n1#3:390\n1#3:421\n200#4,3:343\n203#4,14:373\n200#4,17:403\n200#4,17:422\n107#5,10:357\n118#5,2:369\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n*L\n282#1:325,5\n282#1:331,12\n282#1:387\n287#1:389\n287#1:391,12\n287#1:420\n282#1:318,7\n282#1:346\n282#1:347,8\n282#1:355\n282#1:356\n282#1:367,2\n282#1:371\n282#1:372\n282#1:388\n282#1:330\n287#1:390\n282#1:343,3\n282#1:373,14\n287#1:403,17\n313#1:422,17\n282#1:357,10\n282#1:369,2\n*E\n"})
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final s0 f80790a = new s0(ProtectedSandApp.s("蟰\u0001"));

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final s0 f80791b = new s0(ProtectedSandApp.s("蟱\u0001"));

    private static final boolean b(l<?> lVar, Object obj, int i4, boolean z4, ld.a<k2> aVar) {
        q1 b5 = n3.f80870a.b();
        if (z4 && b5.K1()) {
            return false;
        }
        if (b5.H1()) {
            lVar._state = obj;
            lVar.resumeMode = i4;
            b5.n1(lVar);
            return true;
        }
        b5.y1(true);
        try {
            aVar.invoke();
            do {
            } while (b5.M1());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }

    static boolean c(l lVar, Object obj, int i4, boolean z4, ld.a aVar, int i5, Object obj2) {
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        q1 b5 = n3.f80870a.b();
        if (z4 && b5.K1()) {
            return false;
        }
        if (b5.H1()) {
            lVar._state = obj;
            lVar.resumeMode = i4;
            b5.n1(lVar);
            return true;
        }
        b5.y1(true);
        try {
            aVar.invoke();
            do {
            } while (b5.M1());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }

    @f2
    public static final <T> void d(@fg.l kotlin.coroutines.d<? super T> dVar, @fg.l Object obj, @fg.m ld.l<? super Throwable, k2> lVar) {
        if (!(dVar instanceof l)) {
            dVar.resumeWith(obj);
            return;
        }
        l lVar2 = (l) dVar;
        Object c5 = kotlinx.coroutines.i0.c(obj, lVar);
        if (lVar2.dispatcher.c1(lVar2.continuation.getContext())) {
            lVar2._state = c5;
            lVar2.resumeMode = 1;
            lVar2.dispatcher.S0(lVar2.continuation.getContext(), lVar2);
            return;
        }
        q1 b5 = n3.f80870a.b();
        if (b5.H1()) {
            lVar2._state = c5;
            lVar2.resumeMode = 1;
            b5.n1(lVar2);
            return;
        }
        b5.y1(true);
        try {
            kotlinx.coroutines.k2 k2Var = (kotlinx.coroutines.k2) lVar2.continuation.getContext().c(kotlinx.coroutines.k2.INSTANCE);
            if (k2Var == null || k2Var.isActive()) {
                kotlin.coroutines.d<T> dVar2 = lVar2.continuation;
                Object obj2 = lVar2.countOrElement;
                kotlin.coroutines.g context = dVar2.getContext();
                Object c6 = y0.c(context, obj2);
                w3<?> g4 = c6 != y0.f80834a ? kotlinx.coroutines.l0.g(dVar2, context, c6) : null;
                try {
                    lVar2.continuation.resumeWith(obj);
                    k2 k2Var2 = k2.f75408a;
                } finally {
                    if (g4 == null || g4.b2()) {
                        y0.a(context, c6);
                    }
                }
            } else {
                CancellationException x4 = k2Var.x();
                lVar2.c(c5, x4);
                z0.Companion companion = kotlin.z0.INSTANCE;
                lVar2.resumeWith(kotlin.a1.a(x4));
            }
            while (b5.M1()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void e(kotlin.coroutines.d dVar, Object obj, ld.l lVar, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            lVar = null;
        }
        d(dVar, obj, lVar);
    }

    public static final boolean f(@fg.l l<? super k2> lVar) {
        k2 k2Var = k2.f75408a;
        q1 b5 = n3.f80870a.b();
        if (b5.K1()) {
            return false;
        }
        if (b5.H1()) {
            lVar._state = k2Var;
            lVar.resumeMode = 1;
            b5.n1(lVar);
            return true;
        }
        b5.y1(true);
        try {
            lVar.run();
            do {
            } while (b5.M1());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
