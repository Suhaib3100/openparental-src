package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: CompositionLocal.kt */
@androidx.compose.runtime.internal.u(parameters = 2)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0007\u001a\u00028\u00002\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bH\u0010¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/c5;", "T", "Landroidx/compose/runtime/a3;", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lld/a;)V", "value", "Landroidx/compose/runtime/b5;", "previous", "d", "(Ljava/lang/Object;Landroidx/compose/runtime/b5;)Landroidx/compose/runtime/b5;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c5<T> extends a3<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f15982d = 0;

    public c5(@fg.l ld.a<? extends T> aVar) {
        super(aVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.d0
    @fg.l
    public b5<T> d(T value, @fg.m b5<? extends T> previous) {
        return (previous == 0 || !kotlin.jvm.internal.l0.g(previous.getValue(), value)) ? new d5(value) : previous;
    }
}
