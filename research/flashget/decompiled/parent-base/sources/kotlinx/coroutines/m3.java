package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: ThreadContextElement.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"T", "Ljava/lang/ThreadLocal;", "value", "Lkotlinx/coroutines/l3;", "a", "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)Lkotlinx/coroutines/l3;", "", "e", "(Ljava/lang/ThreadLocal;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/k2;", "c", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nThreadContextElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n266#1:289\n1#2:290\n*S KotlinDebug\n*F\n+ 1 ThreadContextElement.kt\nkotlinx/coroutines/ThreadContextElementKt\n*L\n287#1:289\n*E\n"})
/* loaded from: classes7.dex */
public final class m3 {
    @fg.l
    public static final <T> l3<T> a(@fg.l ThreadLocal<T> threadLocal, T t4) {
        return new kotlinx.coroutines.internal.z0(t4, threadLocal);
    }

    public static l3 b(ThreadLocal threadLocal, Object obj, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            obj = threadLocal.get();
        }
        return new kotlinx.coroutines.internal.z0(obj, threadLocal);
    }

    @fg.m
    public static final Object c(@fg.l ThreadLocal<?> threadLocal, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        if (dVar.getContext().c(new kotlinx.coroutines.internal.a1(threadLocal)) != null) {
            return kotlin.k2.f75408a;
        }
        throw new IllegalStateException((ProtectedSandApp.s("蠥\u0001") + threadLocal + ProtectedSandApp.s("蠦\u0001") + dVar.getContext()).toString());
    }

    private static final Object d(ThreadLocal<?> threadLocal, kotlin.coroutines.d<? super kotlin.k2> dVar) {
        throw null;
    }

    @fg.m
    public static final Object e(@fg.l ThreadLocal<?> threadLocal, @fg.l kotlin.coroutines.d<? super Boolean> dVar) {
        return Boolean.valueOf(dVar.getContext().c(new kotlinx.coroutines.internal.a1(threadLocal)) != null);
    }

    private static final Object f(ThreadLocal<?> threadLocal, kotlin.coroutines.d<? super Boolean> dVar) {
        throw null;
    }
}
