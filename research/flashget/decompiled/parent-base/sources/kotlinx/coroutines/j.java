package kotlinx.coroutines;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aV\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"T", "Lkotlin/coroutines/g;", "context", "Lkotlin/Function2;", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "a", "(Lkotlin/coroutines/g;Lld/p;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/BuildersKt")
@kotlin.jvm.internal.r1({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BuildersKt__BuildersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* loaded from: classes7.dex */
public final /* synthetic */ class j {
    public static final <T> T a(@fg.l kotlin.coroutines.g gVar, @fg.l ld.p<? super r0, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar) throws InterruptedException {
        q1 a5;
        kotlin.coroutines.g e4;
        Thread currentThread = Thread.currentThread();
        kotlin.coroutines.e eVar = (kotlin.coroutines.e) gVar.c(kotlin.coroutines.e.INSTANCE);
        if (eVar == null) {
            a5 = n3.f80870a.b();
            e4 = l0.e(b2.f79269b, gVar.O(a5));
        } else {
            q1 q1Var = eVar instanceof q1 ? (q1) eVar : null;
            if (q1Var != null) {
                q1 q1Var2 = q1Var.S1() ? q1Var : null;
                if (q1Var2 != null) {
                    a5 = q1Var2;
                    e4 = l0.e(b2.f79269b, gVar);
                }
            }
            a5 = n3.f80870a.a();
            e4 = l0.e(b2.f79269b, gVar);
        }
        g gVar2 = new g(e4, currentThread, a5);
        t0.DEFAULT.invoke(pVar, gVar2, gVar2);
        return (T) gVar2.b2();
    }

    public static Object b(kotlin.coroutines.g gVar, ld.p pVar, int i4, Object obj) throws InterruptedException {
        if ((i4 & 1) != 0) {
            gVar = kotlin.coroutines.i.f75057b;
        }
        return a(gVar, pVar);
    }
}
