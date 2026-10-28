package kotlinx.coroutines.flow.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* compiled from: FlowExceptions.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "fillInStackTrace", "Lkotlinx/coroutines/flow/j;", "o", "Lkotlinx/coroutines/flow/j;", "owner", "<init>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class AbortFlowException extends CancellationException {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final transient kotlinx.coroutines.flow.j<?> owner;

    public AbortFlowException(@d5.d kotlinx.coroutines.flow.j<?> jVar) {
        super(ProtectedSandApp.s("嵐"));
        this.owner = jVar;
    }

    @Override // java.lang.Throwable
    @d5.d
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
