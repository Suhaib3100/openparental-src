package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/flow/internal/x;", "T", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "uCont", "Lkotlin/coroutines/g;", "context", "<init>", "(Lkotlin/coroutines/d;Lkotlin/coroutines/g;)V", "Lkotlin/z0;", "result", "Lkotlin/k2;", "resumeWith", "(Ljava/lang/Object;)V", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "b", "Lkotlin/coroutines/d;", "c", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class x<T> implements kotlin.coroutines.d<T>, kotlin.coroutines.jvm.internal.e {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.coroutines.d<T> uCont;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.coroutines.g context;

    /* JADX WARN: Multi-variable type inference failed */
    public x(@fg.l kotlin.coroutines.d<? super T> dVar, @fg.l kotlin.coroutines.g gVar) {
        this.uCont = dVar;
        this.context = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @fg.m
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d<T> dVar = this.uCont;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    @fg.l
    public kotlin.coroutines.g getContext() {
        return this.context;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @fg.m
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(@fg.l Object result) {
        this.uCont.resumeWith(result);
    }
}
