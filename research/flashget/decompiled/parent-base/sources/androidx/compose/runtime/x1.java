package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: ValueHolders.kt */
@androidx.compose.runtime.internal.u(parameters = 2)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\u000b\u001a\u00028\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/x1;", "T", "Landroidx/compose/runtime/b5;", "Lkotlin/Function0;", "valueProducer", "<init>", "(Lld/a;)V", "b", "Lkotlin/b0;", "a", "()Ljava/lang/Object;", "current", "getValue", "value", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x1<T> implements b5<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final int f17314c = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0 current;

    public x1(@fg.l ld.a<? extends T> aVar) {
        this.current = kotlin.c0.c(aVar);
    }

    private final T a() {
        return (T) this.current.getValue();
    }

    @Override // androidx.compose.runtime.b5
    public T getValue() {
        return (T) this.current.getValue();
    }
}
