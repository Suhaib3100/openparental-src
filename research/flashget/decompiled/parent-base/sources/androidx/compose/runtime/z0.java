package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: CompositionLocal.kt */
@androidx.compose.runtime.internal.u(parameters = 2)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\t\u001a\u00028\u00002\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nH\u0010¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/z0;", "T", "Landroidx/compose/runtime/a3;", "Landroidx/compose/runtime/m4;", "policy", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Landroidx/compose/runtime/m4;Lld/a;)V", "value", "Landroidx/compose/runtime/b5;", "previous", "d", "(Ljava/lang/Object;Landroidx/compose/runtime/b5;)Landroidx/compose/runtime/b5;", "Landroidx/compose/runtime/m4;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class z0<T> extends a3<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f17331e = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m4<T> policy;

    public z0(@fg.l m4<T> m4Var, @fg.l ld.a<? extends T> aVar) {
        super(aVar, null);
        this.policy = m4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.d0
    @fg.l
    public b5<T> d(T value, @fg.m b5<? extends T> previous) {
        if (previous == 0 || !(previous instanceof k2)) {
            return b.e(value, this.policy);
        }
        ((k2) previous).setValue(value);
        return previous;
    }
}
