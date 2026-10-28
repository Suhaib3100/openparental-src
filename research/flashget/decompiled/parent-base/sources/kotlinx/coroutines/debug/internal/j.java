package kotlinx.coroutines.debug.internal;

import java.io.Serializable;
import java.lang.Thread;
import java.util.List;
import kotlin.Metadata;
import kotlin.w0;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.q0;

/* compiled from: DebuggerInfo.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0016\u0010\u0011R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u000f\u0010\u001fR\u0017\u0010$\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001a\u0010#¨\u0006%"}, d2 = {"Lkotlinx/coroutines/debug/internal/j;", "Ljava/io/Serializable;", "Lkotlinx/coroutines/debug/internal/e;", "source", "Lkotlin/coroutines/g;", "context", "<init>", "(Lkotlinx/coroutines/debug/internal/e;Lkotlin/coroutines/g;)V", "", "b", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "coroutineId", "", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "dispatcher", "d", "f", "name", "e", "h", "state", "lastObservedThreadState", "g", "lastObservedThreadName", "", "Ljava/lang/StackTraceElement;", "Ljava/util/List;", "()Ljava/util/List;", "lastObservedStackTrace", "i", "J", "()J", "sequenceNumber", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@w0
/* loaded from: classes7.dex */
public final class j implements Serializable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Long coroutineId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String dispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String name;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String state;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String lastObservedThreadState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String lastObservedThreadName;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<StackTraceElement> lastObservedStackTrace;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long sequenceNumber;

    public j(@fg.l e eVar, @fg.l kotlin.coroutines.g gVar) {
        Thread.State state;
        p0 p0Var = (p0) gVar.c(p0.INSTANCE);
        this.coroutineId = p0Var != null ? Long.valueOf(p0Var.e1()) : null;
        kotlin.coroutines.e eVar2 = (kotlin.coroutines.e) gVar.c(kotlin.coroutines.e.INSTANCE);
        this.dispatcher = eVar2 != null ? eVar2.toString() : null;
        q0 q0Var = (q0) gVar.c(q0.INSTANCE);
        this.name = q0Var != null ? q0Var.getName() : null;
        this.state = eVar._state;
        Thread thread = eVar.lastObservedThread;
        this.lastObservedThreadState = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        Thread thread2 = eVar.lastObservedThread;
        this.lastObservedThreadName = thread2 != null ? thread2.getName() : null;
        this.lastObservedStackTrace = eVar.h();
        this.sequenceNumber = eVar.sequenceNumber;
    }

    @fg.m
    /* renamed from: a, reason: from getter */
    public final Long getCoroutineId() {
        return this.coroutineId;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final String getDispatcher() {
        return this.dispatcher;
    }

    @fg.l
    public final List<StackTraceElement> c() {
        return this.lastObservedStackTrace;
    }

    @fg.m
    /* renamed from: d, reason: from getter */
    public final String getLastObservedThreadName() {
        return this.lastObservedThreadName;
    }

    @fg.m
    /* renamed from: e, reason: from getter */
    public final String getLastObservedThreadState() {
        return this.lastObservedThreadState;
    }

    @fg.m
    /* renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: g, reason: from getter */
    public final long getSequenceNumber() {
        return this.sequenceNumber;
    }

    @fg.l
    /* renamed from: h, reason: from getter */
    public final String getState() {
        return this.state;
    }
}
