package kotlinx.coroutines.selects;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.m2;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.internal.r0;
import q3.l;

/* compiled from: Select.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aN\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001aG\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001f\b\u0004\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\u000bH\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\r\u0010\u000e\" \u0010\u0015\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\" \u0010\u0019\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012\"\u001a\u0010\u001c\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u0012\u0004\b\u001b\u0010\u0014\"\u001a\u0010\u001e\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u0012\u0004\b\u001d\u0010\u0014\"\u001a\u0010#\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010\u0014\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"R", "Lkotlinx/coroutines/selects/a;", "Lkotlin/time/e;", "timeout", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "Lkotlin/m2;", "k", "(Lkotlinx/coroutines/selects/a;JLq3/l;)V", "Lkotlin/u;", "builder", "l", "(Lq3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "getNOT_SELECTED$annotations", "()V", "NOT_SELECTED", "b", "d", "getALREADY_SELECTED$annotations", "ALREADY_SELECTED", "c", "getUNDECIDED$annotations", "UNDECIDED", "getRESUMED$annotations", "RESUMED", "Lkotlinx/coroutines/selects/i;", "e", "Lkotlinx/coroutines/selects/i;", "getSelectOpSequenceNumber$annotations", "selectOpSequenceNumber", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final Object f28920a = new r0(ProtectedSandApp.s("幑"));

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final Object f28921b = new r0(ProtectedSandApp.s("幒"));

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final Object f28922c = new r0(ProtectedSandApp.s("幓"));

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final Object f28923d = new r0(ProtectedSandApp.s("幔"));

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final i f28924e = new i();

    @d5.d
    public static final Object d() {
        return f28921b;
    }

    public static /* synthetic */ void e() {
    }

    @d5.d
    public static final Object f() {
        return f28920a;
    }

    public static /* synthetic */ void g() {
    }

    private static /* synthetic */ void h() {
    }

    private static /* synthetic */ void i() {
    }

    private static /* synthetic */ void j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @c2
    public static final <R> void k(@d5.d a<? super R> aVar, long j5, @d5.d l<? super Continuation<? super R>, ? extends Object> lVar) {
        aVar.b(f1.e(j5), lVar);
    }

    @d5.e
    public static final <R> Object l(@d5.d l<? super a<? super R>, m2> lVar, @d5.d Continuation<? super R> continuation) {
        b bVar = new b(continuation);
        try {
            lVar.N(bVar);
        } catch (Throwable th) {
            bVar.i1(th);
        }
        Object h12 = bVar.h1();
        if (h12 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return h12;
    }

    private static final <R> Object m(l<? super a<? super R>, m2> lVar, Continuation<? super R> continuation) {
        b bVar = new b(continuation);
        try {
            lVar.N(bVar);
        } catch (Throwable th) {
            bVar.i1(th);
        }
        Object h12 = bVar.h1();
        if (h12 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return h12;
    }
}
