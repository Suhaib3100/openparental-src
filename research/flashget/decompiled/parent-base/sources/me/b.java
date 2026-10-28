package me;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.z0;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.internal.y0;
import kotlinx.coroutines.s2;
import ld.p;

/* compiled from: Undispatched.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a@\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001aT\u0010\f\u001a\u00020\u0005\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a@\u0010\u000f\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\u0010\u000e\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0082\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a[\u0010\u0013\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u000b\u001a\u00028\u00012'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n¢\u0006\u0002\b\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a[\u0010\u0015\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u000b\u001a\u00028\u00012'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n¢\u0006\u0002\b\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001aF\u0010\u001b\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00012\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"T", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "completion", "Lkotlin/k2;", "c", "(Lld/l;Lkotlin/coroutines/d;)V", "a", "R", "Lkotlin/Function2;", "receiver", "b", "(Lld/p;Ljava/lang/Object;Lkotlin/coroutines/d;)V", "block", "d", "(Lkotlin/coroutines/d;Lld/l;)V", "Lkotlinx/coroutines/internal/o0;", "Lkotlin/u;", "e", "(Lkotlinx/coroutines/internal/o0;Ljava/lang/Object;Lld/p;)Ljava/lang/Object;", "f", "", "", "shouldThrow", "Lkotlin/Function0;", "startBlock", "g", "(Lkotlinx/coroutines/internal/o0;Lld/l;Lld/a;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nUndispatched.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n+ 2 ProbesSupport.kt\nkotlinx/coroutines/internal/ProbesSupportKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,127:1\n55#1:128\n56#1,11:130\n55#1:141\n56#1,2:143\n58#1,9:150\n55#1:159\n56#1,2:161\n58#1,9:168\n97#1,4:178\n114#1,6:182\n120#1,5:190\n97#1,4:195\n114#1,6:199\n120#1,5:207\n11#2:129\n11#2:142\n11#2:160\n11#2:177\n95#3,5:145\n95#3,5:163\n61#4,2:188\n61#4,2:205\n61#4,2:212\n61#4,2:214\n*S KotlinDebug\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n*L\n18#1:128\n18#1:130,11\n29#1:141\n29#1:143,2\n29#1:150,9\n42#1:159\n42#1:161,2\n42#1:168,9\n77#1:178,4\n77#1:182,6\n77#1:190,5\n88#1:195,4\n88#1:199,6\n88#1:207,5\n18#1:129\n29#1:142\n42#1:160\n55#1:177\n30#1:145,5\n43#1:163,5\n77#1:188,2\n88#1:205,2\n119#1:212,2\n120#1:214,2\n*E\n"})
/* loaded from: classes7.dex */
public final class b {
    public static final <T> void a(@l ld.l<? super d<? super T>, ? extends Object> lVar, @l d<? super T> dVar) {
        l0.p(dVar, ProtectedSandApp.s("褪\u0001"));
        try {
            g context = dVar.getContext();
            Object c5 = y0.c(context, null);
            try {
                Object invoke = ((ld.l) u1.q(lVar, 1)).invoke(dVar);
                if (invoke != kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                    z0.Companion companion = z0.INSTANCE;
                    dVar.resumeWith(invoke);
                }
            } finally {
                y0.a(context, c5);
            }
        } catch (Throwable th) {
            z0.Companion companion2 = z0.INSTANCE;
            dVar.resumeWith(a1.a(th));
        }
    }

    public static final <R, T> void b(@l p<? super R, ? super d<? super T>, ? extends Object> pVar, R r4, @l d<? super T> dVar) {
        l0.p(dVar, ProtectedSandApp.s("褪\u0001"));
        try {
            g context = dVar.getContext();
            Object c5 = y0.c(context, null);
            try {
                Object invoke = ((p) u1.q(pVar, 2)).invoke(r4, dVar);
                if (invoke != kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                    z0.Companion companion = z0.INSTANCE;
                    dVar.resumeWith(invoke);
                }
            } finally {
                y0.a(context, c5);
            }
        } catch (Throwable th) {
            z0.Companion companion2 = z0.INSTANCE;
            dVar.resumeWith(a1.a(th));
        }
    }

    public static final <T> void c(@l ld.l<? super d<? super T>, ? extends Object> lVar, @l d<? super T> dVar) {
        l0.p(dVar, ProtectedSandApp.s("褪\u0001"));
        try {
            Object invoke = ((ld.l) u1.q(lVar, 1)).invoke(dVar);
            if (invoke != kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                z0.Companion companion = z0.INSTANCE;
                dVar.resumeWith(invoke);
            }
        } catch (Throwable th) {
            z0.Companion companion2 = z0.INSTANCE;
            dVar.resumeWith(a1.a(th));
        }
    }

    private static final <T> void d(d<? super T> dVar, ld.l<? super d<? super T>, ? extends Object> lVar) {
        l0.p(dVar, ProtectedSandApp.s("褪\u0001"));
        try {
            Object invoke = lVar.invoke(dVar);
            if (invoke != kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                z0.Companion companion = z0.INSTANCE;
                dVar.resumeWith(invoke);
            }
        } catch (Throwable th) {
            z0.Companion companion2 = z0.INSTANCE;
            dVar.resumeWith(a1.a(th));
        }
    }

    @m
    public static final <T, R> Object e(@l o0<? super T> o0Var, R r4, @l p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object d0Var;
        Object v12;
        try {
            d0Var = ((p) u1.q(pVar, 2)).invoke(r4, o0Var);
        } catch (Throwable th) {
            d0Var = new d0(th, false, 2, null);
        }
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        if (d0Var == aVar || (v12 = o0Var.v1(d0Var)) == s2.f80933b) {
            return aVar;
        }
        if (v12 instanceof d0) {
            throw ((d0) v12).cause;
        }
        return s2.h(v12);
    }

    @m
    public static final <T, R> Object f(@l o0<? super T> o0Var, R r4, @l p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object d0Var;
        Object v12;
        try {
            d0Var = ((p) u1.q(pVar, 2)).invoke(r4, o0Var);
        } catch (Throwable th) {
            d0Var = new d0(th, false, 2, null);
        }
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        if (d0Var == aVar || (v12 = o0Var.v1(d0Var)) == s2.f80933b) {
            return aVar;
        }
        if (v12 instanceof d0) {
            Throwable th2 = ((d0) v12).cause;
            if (!(th2 instanceof TimeoutCancellationException)) {
                throw th2;
            }
            if (((TimeoutCancellationException) th2).coroutine != o0Var) {
                throw th2;
            }
            if (d0Var instanceof d0) {
                throw ((d0) d0Var).cause;
            }
        } else {
            d0Var = s2.h(v12);
        }
        return d0Var;
    }

    private static final <T> Object g(o0<? super T> o0Var, ld.l<? super Throwable, Boolean> lVar, ld.a<? extends Object> aVar) {
        Object d0Var;
        try {
            d0Var = aVar.invoke();
        } catch (Throwable th) {
            d0Var = new d0(th, false, 2, null);
        }
        kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
        if (d0Var == aVar2) {
            return aVar2;
        }
        Object v12 = o0Var.v1(d0Var);
        if (v12 == s2.f80933b) {
            return aVar2;
        }
        if (!(v12 instanceof d0)) {
            return s2.h(v12);
        }
        d0 d0Var2 = (d0) v12;
        if (lVar.invoke(d0Var2.cause).booleanValue()) {
            throw d0Var2.cause;
        }
        if (d0Var instanceof d0) {
            throw ((d0) d0Var).cause;
        }
        return d0Var;
    }
}
