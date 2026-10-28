package kotlinx.coroutines.debug.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* compiled from: DebugCoroutineInfo.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\r\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\u0019\u0010 R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u0014\u0010\nR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128G¢\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b#\u0010\u0016¨\u0006)"}, d2 = {"Lkotlinx/coroutines/debug/internal/e;", "", "Lkotlin/coroutines/g;", "a", "Lkotlin/coroutines/g;", "()Lkotlin/coroutines/g;", "context", "Lkotlin/coroutines/jvm/internal/e;", "b", "Lkotlin/coroutines/jvm/internal/e;", "()Lkotlin/coroutines/jvm/internal/e;", "creationStackBottom", "", "c", "J", "f", "()J", "sequenceNumber", "", "Ljava/lang/StackTraceElement;", "d", "Ljava/util/List;", "()Ljava/util/List;", "creationStackTrace", "", "e", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "state", "Ljava/lang/Thread;", "Ljava/lang/Thread;", "()Ljava/lang/Thread;", "lastObservedThread", "lastObservedFrame", "h", "lastObservedStackTrace", "Lkotlinx/coroutines/debug/internal/f;", "source", "<init>", "(Lkotlinx/coroutines/debug/internal/f;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@PublishedApi
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final CoroutineContext context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final CoroutineStackFrame creationStackBottom;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long sequenceNumber;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<StackTraceElement> creationStackTrace;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String state;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final Thread lastObservedThread;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final CoroutineStackFrame lastObservedFrame;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<StackTraceElement> lastObservedStackTrace;

    public e(@d5.d f fVar, @d5.d CoroutineContext coroutineContext) {
        this.context = coroutineContext;
        this.creationStackBottom = fVar.getCreationStackBottom();
        this.sequenceNumber = fVar.sequenceNumber;
        this.creationStackTrace = fVar.e();
        this.state = fVar.get_state();
        this.lastObservedThread = fVar.lastObservedThread;
        this.lastObservedFrame = fVar.f();
        this.lastObservedStackTrace = fVar.h();
    }

    @d5.d
    /* renamed from: a, reason: from getter */
    public final CoroutineContext getContext() {
        return this.context;
    }

    @d5.e
    /* renamed from: b, reason: from getter */
    public final CoroutineStackFrame getCreationStackBottom() {
        return this.creationStackBottom;
    }

    @d5.d
    public final List<StackTraceElement> c() {
        return this.creationStackTrace;
    }

    @d5.e
    /* renamed from: d, reason: from getter */
    public final CoroutineStackFrame getLastObservedFrame() {
        return this.lastObservedFrame;
    }

    @d5.e
    /* renamed from: e, reason: from getter */
    public final Thread getLastObservedThread() {
        return this.lastObservedThread;
    }

    /* renamed from: f, reason: from getter */
    public final long getSequenceNumber() {
        return this.sequenceNumber;
    }

    @d5.d
    /* renamed from: g, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @p3.i(name = "lastObservedStackTrace")
    @d5.d
    public final List<StackTraceElement> h() {
        return this.lastObservedStackTrace;
    }
}
