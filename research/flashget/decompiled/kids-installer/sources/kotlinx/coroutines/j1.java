package kotlinx.coroutines;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: DispatchedTask.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\nJ\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bR\u0016\u0010\u0019\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lkotlinx/coroutines/j1;", "T", "Lkotlinx/coroutines/scheduling/k;", "Lkotlinx/coroutines/SchedulerTask;", "", "j", "()Ljava/lang/Object;", "takenState", "", "cause", "Lkotlin/m2;", "c", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "f", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "exception", "finallyException", "h", "", "q", "I", "resumeMode", "Lkotlin/coroutines/d;", "e", "()Lkotlin/coroutines/d;", "delegate", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public abstract class j1<T> extends kotlinx.coroutines.scheduling.k {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public int resumeMode;

    public j1(int i5) {
        this.resumeMode = i5;
    }

    public void c(@d5.e Object takenState, @d5.d Throwable cause) {
    }

    @d5.d
    public abstract Continuation<T> e();

    @d5.e
    public Throwable f(@d5.e Object state) {
        f0 f0Var = state instanceof f0 ? (f0) state : null;
        if (f0Var != null) {
            return f0Var.cause;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T g(@d5.e Object state) {
        return state;
    }

    public final void h(@d5.e Throwable th, @d5.e Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            kotlin.p.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        String str = ProtectedSandApp.s("帍") + this + ProtectedSandApp.s("帎");
        kotlin.jvm.internal.l0.m(th);
        r0.b(e().getContext(), new x0(str, th));
    }

    @d5.e
    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        Object a6;
        kotlinx.coroutines.scheduling.l lVar = this.taskContext;
        try {
            kotlinx.coroutines.internal.l lVar2 = (kotlinx.coroutines.internal.l) e();
            Continuation<T> continuation = lVar2.continuation;
            Object obj = lVar2.countOrElement;
            CoroutineContext context = continuation.getContext();
            Object c6 = kotlinx.coroutines.internal.w0.c(context, obj);
            a4<?> g5 = c6 != kotlinx.coroutines.internal.w0.f28753a ? n0.g(continuation, context, c6) : null;
            try {
                CoroutineContext context2 = continuation.getContext();
                Object j5 = j();
                Throwable f6 = f(j5);
                n2 n2Var = (f6 == null && k1.c(this.resumeMode)) ? (n2) context2.b(n2.INSTANCE) : null;
                if (n2Var != null && !n2Var.d()) {
                    CancellationException O = n2Var.O();
                    c(j5, O);
                    Result.a aVar = Result.f27242p;
                    continuation.s(kotlin.a1.a(O));
                } else if (f6 != null) {
                    Result.a aVar2 = Result.f27242p;
                    continuation.s(kotlin.a1.a(f6));
                } else {
                    Result.a aVar3 = Result.f27242p;
                    continuation.s(g(j5));
                }
                Object obj2 = kotlin.m2.f23662a;
                try {
                    Result.a aVar4 = Result.f27242p;
                    lVar.r();
                } catch (Throwable th) {
                    Result.a aVar5 = Result.f27242p;
                    obj2 = kotlin.a1.a(th);
                }
                h(null, Result.e(obj2));
            } finally {
                if (g5 == null || g5.L1()) {
                    kotlinx.coroutines.internal.w0.a(context, c6);
                }
            }
        } catch (Throwable th2) {
            try {
                Result.a aVar6 = Result.f27242p;
                lVar.r();
                a6 = kotlin.m2.f23662a;
            } catch (Throwable th3) {
                Result.a aVar7 = Result.f27242p;
                a6 = kotlin.a1.a(th3);
            }
            h(th2, Result.e(a6));
        }
    }
}
