package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.w0;

/* compiled from: StackTraceFrame.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/debug/internal/m;", "Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "Ljava/lang/StackTraceElement;", "stackTraceElement", "<init>", "(Lkotlin/coroutines/jvm/internal/e;Ljava/lang/StackTraceElement;)V", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "b", "Lkotlin/coroutines/jvm/internal/e;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "c", "Ljava/lang/StackTraceElement;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@w0
/* loaded from: classes7.dex */
public final class m implements kotlin.coroutines.jvm.internal.e {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final kotlin.coroutines.jvm.internal.e callerFrame;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final StackTraceElement stackTraceElement;

    public m(@fg.m kotlin.coroutines.jvm.internal.e eVar, @fg.l StackTraceElement stackTraceElement) {
        this.callerFrame = eVar;
        this.stackTraceElement = stackTraceElement;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @fg.m
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        return this.callerFrame;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @fg.l
    public StackTraceElement getStackTraceElement() {
        return this.stackTraceElement;
    }
}
