package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: EventLoop.common.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u0010\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\fj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/n3;", "", "<init>", "()V", "Lkotlinx/coroutines/q1;", "a", "()Lkotlinx/coroutines/q1;", "Lkotlin/k2;", "c", "eventLoop", "d", "(Lkotlinx/coroutines/q1;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "b", "Ljava/lang/ThreadLocal;", "ref", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/ThreadLocalEventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
/* loaded from: classes7.dex */
public final class n3 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final n3 f80870a = new n3();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final ThreadLocal<q1> ref;

    static {
        new kotlinx.coroutines.internal.s0(ProtectedSandApp.s("蠨\u0001"));
        ref = new ThreadLocal<>();
    }

    private n3() {
    }

    @fg.m
    public final q1 a() {
        return ref.get();
    }

    @fg.l
    public final q1 b() {
        ThreadLocal<q1> threadLocal = ref;
        q1 q1Var = threadLocal.get();
        if (q1Var != null) {
            return q1Var;
        }
        q1 a5 = t1.a();
        threadLocal.set(a5);
        return a5;
    }

    public final void c() {
        ref.set(null);
    }

    public final void d(@fg.l q1 eventLoop) {
        ref.set(eventLoop);
    }
}
