package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: EventLoop.common.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nR(\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/t3;", "", "Lkotlinx/coroutines/t1;", "a", "()Lkotlinx/coroutines/t1;", "Lkotlin/m2;", "c", "()V", "eventLoop", "d", "(Lkotlinx/coroutines/t1;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "b", "Ljava/lang/ThreadLocal;", "ref", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class t3 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final t3 f29007a = new t3();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final ThreadLocal<t1> ref = new ThreadLocal<>();

    private t3() {
    }

    @d5.e
    public final t1 a() {
        return ref.get();
    }

    @d5.d
    public final t1 b() {
        ThreadLocal<t1> threadLocal = ref;
        t1 t1Var = threadLocal.get();
        if (t1Var != null) {
            return t1Var;
        }
        t1 a6 = w1.a();
        threadLocal.set(a6);
        return a6;
    }

    public final void c() {
        ref.set(null);
    }

    public final void d(@d5.d t1 eventLoop) {
        ref.set(eventLoop);
    }
}
