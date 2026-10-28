package kotlin.coroutines.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import kotlin.z0;

/* compiled from: ContinuationImpl.kt */
@c1(version = "1.3")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH$¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR!\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lkotlin/coroutines/jvm/internal/a;", "Lkotlin/coroutines/d;", "", "Lkotlin/coroutines/jvm/internal/e;", "Ljava/io/Serializable;", "completion", "<init>", "(Lkotlin/coroutines/d;)V", "Lkotlin/z0;", "result", "Lkotlin/k2;", "resumeWith", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "create", "(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "value", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/coroutines/d;", "getCompletion", "()Lkotlin/coroutines/d;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class a implements kotlin.coroutines.d<Object>, e, Serializable {

    @fg.m
    private final kotlin.coroutines.d<Object> completion;

    public a(@fg.m kotlin.coroutines.d<Object> dVar) {
        this.completion = dVar;
    }

    @fg.l
    public kotlin.coroutines.d<k2> create(@fg.l kotlin.coroutines.d<?> completion) {
        l0.p(completion, ProtectedSandApp.s("懽\u0001"));
        throw new UnsupportedOperationException(ProtectedSandApp.s("懿\u0001"));
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @fg.m
    public e getCallerFrame() {
        kotlin.coroutines.d<Object> dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    @fg.m
    public final kotlin.coroutines.d<Object> getCompletion() {
        return this.completion;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @fg.m
    public StackTraceElement getStackTraceElement() {
        return g.e(this);
    }

    @fg.m
    protected abstract Object invokeSuspend(@fg.l Object result);

    protected void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.d
    public final void resumeWith(@fg.l Object result) {
        Object invokeSuspend;
        kotlin.coroutines.d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            kotlin.coroutines.d dVar2 = aVar.completion;
            l0.m(dVar2);
            try {
                invokeSuspend = aVar.invokeSuspend(result);
            } catch (Throwable th) {
                z0.Companion companion = z0.INSTANCE;
                result = a1.a(th);
            }
            if (invokeSuspend == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
                return;
            }
            z0.Companion companion2 = z0.INSTANCE;
            result = z0.b(invokeSuspend);
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(result);
                return;
            }
            dVar = dVar2;
        }
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("戀\u0001"));
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    @fg.l
    public kotlin.coroutines.d<k2> create(@fg.m Object value, @fg.l kotlin.coroutines.d<?> completion) {
        l0.p(completion, ProtectedSandApp.s("懽\u0001"));
        throw new UnsupportedOperationException(ProtectedSandApp.s("懾\u0001"));
    }
}
