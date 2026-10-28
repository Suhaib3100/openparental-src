package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* compiled from: StackTraceFrame.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/debug/internal/n;", "Lkotlin/coroutines/jvm/internal/e;", "Ljava/lang/StackTraceElement;", "I", "o", "Lkotlin/coroutines/jvm/internal/e;", "i", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "p", "Ljava/lang/StackTraceElement;", "stackTraceElement", "<init>", "(Lkotlin/coroutines/jvm/internal/e;Ljava/lang/StackTraceElement;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class n implements CoroutineStackFrame {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final CoroutineStackFrame callerFrame;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final StackTraceElement stackTraceElement;

    public n(@d5.e CoroutineStackFrame coroutineStackFrame, @d5.d StackTraceElement stackTraceElement) {
        this.callerFrame = coroutineStackFrame;
        this.stackTraceElement = stackTraceElement;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @d5.d
    /* renamed from: I, reason: from getter */
    public StackTraceElement getStackTraceElement() {
        return this.stackTraceElement;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @d5.e
    /* renamed from: i, reason: from getter */
    public CoroutineStackFrame getCallerFrame() {
        return this.callerFrame;
    }
}
