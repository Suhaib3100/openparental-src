package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Preconditions.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a#\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a4\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\b\u0010\t\u001a1\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\u0087\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aB\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\u000f\u0010\u0004\u001a4\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b\u0010\u0010\t\u001a1\u0010\u0011\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\u0087\b\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\u0011\u0010\f\u001aB\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\u0012\u0010\u000e\u001a\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"", "value", "Lkotlin/k2;", "h", "(Z)V", "Lkotlin/Function0;", "", "lazyMessage", "i", "(ZLld/a;)V", "T", "j", "(Ljava/lang/Object;)Ljava/lang/Object;", "k", "(Ljava/lang/Object;Lld/a;)Ljava/lang/Object;", "c", "d", "e", "f", "message", "", "g", "(Ljava/lang/Object;)Ljava/lang/Void;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/PreconditionsKt")
@kotlin.jvm.internal.r1({"SMAP\nPreconditions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preconditions.kt\nkotlin/PreconditionsKt__PreconditionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
/* loaded from: classes7.dex */
class u0 extends t0 {
    @kotlin.internal.f
    private static final void c(boolean z4) {
        if (!z4) {
            throw new IllegalStateException(ProtectedSandApp.s("苒\u0001"));
        }
    }

    @kotlin.internal.f
    private static final void d(boolean z4, ld.a<? extends Object> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("苓\u0001"));
        if (!z4) {
            throw new IllegalStateException(aVar.invoke().toString());
        }
    }

    @kotlin.internal.f
    private static final <T> T e(T t4) {
        if (t4 != null) {
            return t4;
        }
        throw new IllegalStateException(ProtectedSandApp.s("苔\u0001"));
    }

    @kotlin.internal.f
    private static final <T> T f(T t4, ld.a<? extends Object> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("苓\u0001"));
        if (t4 != null) {
            return t4;
        }
        throw new IllegalStateException(aVar.invoke().toString());
    }

    @kotlin.internal.f
    private static final Void g(Object obj) {
        kotlin.jvm.internal.l0.p(obj, ProtectedSandApp.s("苕\u0001"));
        throw new IllegalStateException(obj.toString());
    }

    @kotlin.internal.f
    private static final void h(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(ProtectedSandApp.s("苖\u0001"));
        }
    }

    @kotlin.internal.f
    private static final void i(boolean z4, ld.a<? extends Object> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("苓\u0001"));
        if (!z4) {
            throw new IllegalArgumentException(aVar.invoke().toString());
        }
    }

    @kotlin.internal.f
    private static final <T> T j(T t4) {
        if (t4 != null) {
            return t4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("苔\u0001"));
    }

    @kotlin.internal.f
    private static final <T> T k(T t4, ld.a<? extends Object> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("苓\u0001"));
        if (t4 != null) {
            return t4;
        }
        throw new IllegalArgumentException(aVar.invoke().toString());
    }
}
