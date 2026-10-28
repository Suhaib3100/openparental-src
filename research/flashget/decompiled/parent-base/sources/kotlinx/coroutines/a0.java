package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: CompletableDeferred.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"T", "Lkotlinx/coroutines/y;", "Lkotlin/z0;", "result", "", "d", "(Lkotlinx/coroutines/y;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/k2;", "parent", "b", "(Lkotlinx/coroutines/k2;)Lkotlinx/coroutines/y;", "value", "a", "(Ljava/lang/Object;)Lkotlinx/coroutines/y;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nCompletableDeferred.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletableDeferred.kt\nkotlinx/coroutines/CompletableDeferredKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
/* loaded from: classes7.dex */
public final class a0 {
    @fg.l
    public static final <T> y<T> a(T t4) {
        z zVar = new z(null);
        zVar.u1(t4);
        return zVar;
    }

    @fg.l
    public static final <T> y<T> b(@fg.m k2 k2Var) {
        return new z(k2Var);
    }

    public static y c(k2 k2Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            k2Var = null;
        }
        return new z(k2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean d(@fg.l y<T> yVar, @fg.l Object obj) {
        Throwable e4 = kotlin.z0.e(obj);
        return e4 == null ? yVar.I(obj) : yVar.e(e4);
    }
}
