package kotlinx.coroutines.debug.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.w0;

/* compiled from: DebugCoroutineInfo.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0011\u0010\u001aR\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010%\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b\u001d\u0010$R\u0019\u0010&\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\r\u001a\u0004\b\u0018\u0010\u000eR\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168G¢\u0006\f\n\u0004\b'\u0010\u0019\u001a\u0004\b'\u0010\u001a¨\u0006)"}, d2 = {"Lkotlinx/coroutines/debug/internal/d;", "", "Lkotlinx/coroutines/debug/internal/e;", "source", "Lkotlin/coroutines/g;", "context", "<init>", "(Lkotlinx/coroutines/debug/internal/e;Lkotlin/coroutines/g;)V", "a", "Lkotlin/coroutines/g;", "()Lkotlin/coroutines/g;", "Lkotlin/coroutines/jvm/internal/e;", "b", "Lkotlin/coroutines/jvm/internal/e;", "()Lkotlin/coroutines/jvm/internal/e;", "creationStackBottom", "", "c", "J", "f", "()J", "sequenceNumber", "", "Ljava/lang/StackTraceElement;", "d", "Ljava/util/List;", "()Ljava/util/List;", "creationStackTrace", "", "e", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "state", "Ljava/lang/Thread;", "Ljava/lang/Thread;", "()Ljava/lang/Thread;", "lastObservedThread", "lastObservedFrame", "h", "lastObservedStackTrace", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@w0
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.coroutines.g context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final kotlin.coroutines.jvm.internal.e creationStackBottom;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long sequenceNumber;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<StackTraceElement> creationStackTrace;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String state;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Thread lastObservedThread;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final kotlin.coroutines.jvm.internal.e lastObservedFrame;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<StackTraceElement> lastObservedStackTrace;

    public d(@fg.l e eVar, @fg.l kotlin.coroutines.g gVar) {
        this.context = gVar;
        this.creationStackBottom = eVar.getCreationStackBottom();
        this.sequenceNumber = eVar.sequenceNumber;
        this.creationStackTrace = eVar.e();
        this.state = eVar._state;
        this.lastObservedThread = eVar.lastObservedThread;
        this.lastObservedFrame = eVar.f();
        this.lastObservedStackTrace = eVar.h();
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final kotlin.coroutines.g getContext() {
        return this.context;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final kotlin.coroutines.jvm.internal.e getCreationStackBottom() {
        return this.creationStackBottom;
    }

    @fg.l
    public final List<StackTraceElement> c() {
        return this.creationStackTrace;
    }

    @fg.m
    /* renamed from: d, reason: from getter */
    public final kotlin.coroutines.jvm.internal.e getLastObservedFrame() {
        return this.lastObservedFrame;
    }

    @fg.m
    /* renamed from: e, reason: from getter */
    public final Thread getLastObservedThread() {
        return this.lastObservedThread;
    }

    /* renamed from: f, reason: from getter */
    public final long getSequenceNumber() {
        return this.sequenceNumber;
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @fg.l
    @kd.i(name = "lastObservedStackTrace")
    public final List<StackTraceElement> h() {
        return this.lastObservedStackTrace;
    }
}
