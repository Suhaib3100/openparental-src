package kotlinx.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.z0;

/* compiled from: DispatchedTask.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH ¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001f¨\u0006!"}, d2 = {"Lkotlinx/coroutines/g1;", "T", "Lkotlinx/coroutines/scheduling/k;", "Lkotlinx/coroutines/SchedulerTask;", "", "resumeMode", "<init>", "(I)V", "", "i", "()Ljava/lang/Object;", "takenState", "", "cause", "Lkotlin/k2;", "c", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "()V", "exception", "finallyException", "h", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "d", "I", "Lkotlin/coroutines/d;", "()Lkotlin/coroutines/d;", "delegate", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.w0
@kotlin.jvm.internal.r1({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,222:1\n1#2:223\n107#3,10:224\n118#3,2:238\n220#4:234\n221#4:237\n61#5,2:235\n75#6:240\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n*L\n90#1:224,10\n90#1:238,2\n103#1:234\n103#1:237\n103#1:235,2\n142#1:240\n*E\n"})
/* loaded from: classes7.dex */
public abstract class g1<T> extends kotlinx.coroutines.scheduling.k {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public int resumeMode;

    public g1(int i4) {
        this.resumeMode = i4;
    }

    public void c(@fg.m Object takenState, @fg.l Throwable cause) {
    }

    @fg.l
    public abstract kotlin.coroutines.d<T> d();

    @fg.m
    public Throwable e(@fg.m Object state) {
        d0 d0Var = state instanceof d0 ? (d0) state : null;
        if (d0Var != null) {
            return d0Var.cause;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T g(@fg.m Object state) {
        return state;
    }

    public final void h(@fg.m Throwable exception, @fg.m Throwable finallyException) {
        if (exception == null && finallyException == null) {
            return;
        }
        if (exception != null && finallyException != null) {
            kotlin.o.a(exception, finallyException);
        }
        if (exception == null) {
            exception = finallyException;
        }
        String str = ProtectedSandApp.s("螿\u0001") + this + ProtectedSandApp.s("蟀\u0001");
        kotlin.jvm.internal.l0.m(exception);
        o0.b(d().getF75269b(), new u0(str, exception));
    }

    @fg.m
    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        Object a5;
        kotlinx.coroutines.scheduling.l lVar = this.taskContext;
        try {
            kotlin.coroutines.d<T> d5 = d();
            kotlin.jvm.internal.l0.n(d5, ProtectedSandApp.s("蟁\u0001"));
            kotlinx.coroutines.internal.l lVar2 = (kotlinx.coroutines.internal.l) d5;
            kotlin.coroutines.d<T> dVar = lVar2.continuation;
            Object obj = lVar2.countOrElement;
            kotlin.coroutines.g f75269b = dVar.getF75269b();
            Object c5 = kotlinx.coroutines.internal.y0.c(f75269b, obj);
            w3<?> g4 = c5 != kotlinx.coroutines.internal.y0.f80834a ? l0.g(dVar, f75269b, c5) : null;
            try {
                kotlin.coroutines.g f75269b2 = dVar.getF75269b();
                Object i4 = i();
                Throwable e4 = e(i4);
                k2 k2Var = (e4 == null && h1.c(this.resumeMode)) ? (k2) f75269b2.c(k2.INSTANCE) : null;
                if (k2Var != null && !k2Var.isActive()) {
                    CancellationException x4 = k2Var.x();
                    c(i4, x4);
                    z0.Companion companion = kotlin.z0.INSTANCE;
                    dVar.resumeWith(kotlin.a1.a(x4));
                } else if (e4 != null) {
                    z0.Companion companion2 = kotlin.z0.INSTANCE;
                    dVar.resumeWith(kotlin.a1.a(e4));
                } else {
                    z0.Companion companion3 = kotlin.z0.INSTANCE;
                    dVar.resumeWith(g(i4));
                }
                Object obj2 = kotlin.k2.f75408a;
                if (g4 == null || g4.b2()) {
                    kotlinx.coroutines.internal.y0.a(f75269b, c5);
                }
                try {
                    z0.Companion companion4 = kotlin.z0.INSTANCE;
                    lVar.M();
                } catch (Throwable th) {
                    z0.Companion companion5 = kotlin.z0.INSTANCE;
                    obj2 = kotlin.a1.a(th);
                }
                h(null, kotlin.z0.e(obj2));
            } catch (Throwable th2) {
                if (g4 == null || g4.b2()) {
                    kotlinx.coroutines.internal.y0.a(f75269b, c5);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                z0.Companion companion6 = kotlin.z0.INSTANCE;
                lVar.M();
                a5 = kotlin.k2.f75408a;
            } catch (Throwable th4) {
                z0.Companion companion7 = kotlin.z0.INSTANCE;
                a5 = kotlin.a1.a(th4);
            }
            h(th3, kotlin.z0.e(a5));
        }
    }
}
