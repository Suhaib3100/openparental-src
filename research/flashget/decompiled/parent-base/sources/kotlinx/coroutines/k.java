package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.common.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001aQ\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a]\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aW\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aH\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e*\u00020\u00142)\b\b\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086Jø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/g;", "context", "Lkotlinx/coroutines/t0;", "start", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "Lkotlin/u;", "block", "Lkotlinx/coroutines/k2;", "e", "(Lkotlinx/coroutines/r0;Lkotlin/coroutines/g;Lkotlinx/coroutines/t0;Lld/p;)Lkotlinx/coroutines/k2;", "T", "Lkotlinx/coroutines/z0;", "a", "(Lkotlinx/coroutines/r0;Lkotlin/coroutines/g;Lkotlinx/coroutines/t0;Lld/p;)Lkotlinx/coroutines/z0;", "g", "(Lkotlin/coroutines/g;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/m0;", "c", "(Lkotlinx/coroutines/m0;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "I", "UNDECIDED", "b", "SUSPENDED", "RESUMED", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/BuildersKt")
@kotlin.jvm.internal.r1({"SMAP\nBuilders.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/BuildersKt__Builders_commonKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,273:1\n95#2,5:274\n*S KotlinDebug\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/BuildersKt__Builders_commonKt\n*L\n166#1:274,5\n*E\n"})
/* loaded from: classes7.dex */
public final /* synthetic */ class k {

    /* renamed from: a, reason: collision with root package name */
    private static final int f80850a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f80851b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f80852c = 2;

    @fg.l
    public static final <T> z0<T> a(@fg.l r0 r0Var, @fg.l kotlin.coroutines.g gVar, @fg.l t0 t0Var, @fg.l ld.p<? super r0, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar) {
        kotlin.coroutines.g e4 = l0.e(r0Var, gVar);
        z0<T> t2Var = t0Var.isLazy() ? new t2<>(e4, pVar) : new a1<>(e4, true, true);
        t0Var.invoke(pVar, t2Var, t2Var);
        return t2Var;
    }

    public static z0 b(r0 r0Var, kotlin.coroutines.g gVar, t0 t0Var, ld.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = kotlin.coroutines.i.f75057b;
        }
        if ((i4 & 2) != 0) {
            t0Var = t0.DEFAULT;
        }
        return a(r0Var, gVar, t0Var, pVar);
    }

    @fg.m
    public static final <T> Object c(@fg.l m0 m0Var, @fg.l ld.p<? super r0, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        return g(m0Var, pVar, dVar);
    }

    private static final <T> Object d(m0 m0Var, ld.p<? super r0, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, kotlin.coroutines.d<? super T> dVar) {
        return g(m0Var, pVar, dVar);
    }

    @fg.l
    public static final k2 e(@fg.l r0 r0Var, @fg.l kotlin.coroutines.g gVar, @fg.l t0 t0Var, @fg.l ld.p<? super r0, ? super kotlin.coroutines.d<? super kotlin.k2>, ? extends Object> pVar) {
        kotlin.coroutines.g e4 = l0.e(r0Var, gVar);
        k2 u2Var = t0Var.isLazy() ? new u2(e4, pVar) : new h3(e4, true, true);
        t0Var.invoke(pVar, u2Var, u2Var);
        return u2Var;
    }

    public static k2 f(r0 r0Var, kotlin.coroutines.g gVar, t0 t0Var, ld.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = kotlin.coroutines.i.f75057b;
        }
        if ((i4 & 2) != 0) {
            t0Var = t0.DEFAULT;
        }
        return e(r0Var, gVar, t0Var, pVar);
    }

    @fg.m
    public static final <T> Object g(@fg.l kotlin.coroutines.g gVar, @fg.l ld.p<? super r0, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, @fg.l kotlin.coroutines.d<? super T> dVar) {
        Object b22;
        kotlin.coroutines.g context = dVar.getContext();
        kotlin.coroutines.g d5 = l0.d(context, gVar);
        p2.x(d5);
        if (d5 == context) {
            kotlinx.coroutines.internal.o0 o0Var = new kotlinx.coroutines.internal.o0(d5, dVar);
            b22 = me.b.e(o0Var, o0Var, pVar);
        } else {
            e.Companion companion = kotlin.coroutines.e.INSTANCE;
            if (kotlin.jvm.internal.l0.g(d5.c(companion), context.c(companion))) {
                w3 w3Var = new w3(d5, dVar);
                kotlin.coroutines.g context2 = w3Var.getContext();
                Object c5 = kotlinx.coroutines.internal.y0.c(context2, null);
                try {
                    Object e4 = me.b.e(w3Var, w3Var, pVar);
                    kotlinx.coroutines.internal.y0.a(context2, c5);
                    b22 = e4;
                } catch (Throwable th) {
                    kotlinx.coroutines.internal.y0.a(context2, c5);
                    throw th;
                }
            } else {
                f1 f1Var = new f1(d5, dVar);
                me.a.f(pVar, f1Var, f1Var, null, 4, null);
                b22 = f1Var.b2();
            }
        }
        if (b22 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return b22;
    }
}
