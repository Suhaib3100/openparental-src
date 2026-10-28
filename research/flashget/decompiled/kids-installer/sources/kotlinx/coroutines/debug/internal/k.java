package kotlinx.coroutines.debug.internal;

import java.io.Serializable;
import java.lang.Thread;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;

/* compiled from: DebuggerInfo.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006,"}, d2 = {"Lkotlinx/coroutines/debug/internal/k;", "Ljava/io/Serializable;", "", "o", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "coroutineId", "", "p", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "dispatcher", "q", "f", "name", "r", "h", "state", "s", "e", "lastObservedThreadState", "t", "d", "lastObservedThreadName", "", "Ljava/lang/StackTraceElement;", "u", "Ljava/util/List;", "c", "()Ljava/util/List;", "lastObservedStackTrace", "v", "J", "g", "()J", "sequenceNumber", "Lkotlinx/coroutines/debug/internal/f;", "source", "Lkotlin/coroutines/g;", "context", "<init>", "(Lkotlinx/coroutines/debug/internal/f;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@PublishedApi
/* loaded from: classes5.dex */
public final class k implements Serializable {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final Long coroutineId;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final String dispatcher;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final String name;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String state;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final String lastObservedThreadState;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final String lastObservedThreadName;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<StackTraceElement> lastObservedStackTrace;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final long sequenceNumber;

    public k(@d5.d f fVar, @d5.d CoroutineContext coroutineContext) {
        Thread.State state;
        s0 s0Var = (s0) coroutineContext.b(s0.INSTANCE);
        this.coroutineId = s0Var != null ? Long.valueOf(s0Var.getId()) : null;
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.b(ContinuationInterceptor.f23289d);
        this.dispatcher = continuationInterceptor != null ? continuationInterceptor.toString() : null;
        t0 t0Var = (t0) coroutineContext.b(t0.INSTANCE);
        this.name = t0Var != null ? t0Var.getName() : null;
        this.state = fVar.get_state();
        Thread thread = fVar.lastObservedThread;
        this.lastObservedThreadState = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        Thread thread2 = fVar.lastObservedThread;
        this.lastObservedThreadName = thread2 != null ? thread2.getName() : null;
        this.lastObservedStackTrace = fVar.h();
        this.sequenceNumber = fVar.sequenceNumber;
    }

    @d5.e
    /* renamed from: a, reason: from getter */
    public final Long getCoroutineId() {
        return this.coroutineId;
    }

    @d5.e
    /* renamed from: b, reason: from getter */
    public final String getDispatcher() {
        return this.dispatcher;
    }

    @d5.d
    public final List<StackTraceElement> c() {
        return this.lastObservedStackTrace;
    }

    @d5.e
    /* renamed from: d, reason: from getter */
    public final String getLastObservedThreadName() {
        return this.lastObservedThreadName;
    }

    @d5.e
    /* renamed from: e, reason: from getter */
    public final String getLastObservedThreadState() {
        return this.lastObservedThreadState;
    }

    @d5.e
    /* renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: g, reason: from getter */
    public final long getSequenceNumber() {
        return this.sequenceNumber;
    }

    @d5.d
    /* renamed from: h, reason: from getter */
    public final String getState() {
        return this.state;
    }
}
