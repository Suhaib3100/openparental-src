package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: ValueHolders.kt */
@androidx.compose.runtime.internal.u(parameters = 2)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/d5;", "T", "Landroidx/compose/runtime/b5;", "value", "<init>", "(Ljava/lang/Object;)V", "O", "()Ljava/lang/Object;", "a", "(Ljava/lang/Object;)Landroidx/compose/runtime/d5;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Object;", "getValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class d5<T> implements b5<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final int f16166c = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T value;

    public d5(T t4) {
        this.value = t4;
    }

    public static d5 i(d5 d5Var, Object obj, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            obj = d5Var.value;
        }
        d5Var.getClass();
        return new d5(obj);
    }

    public final T O() {
        return this.value;
    }

    @fg.l
    public final d5<T> a(T value) {
        return new d5<>(value);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof d5) && kotlin.jvm.internal.l0.g(this.value, ((d5) other).value);
    }

    @Override // androidx.compose.runtime.b5
    public T getValue() {
        return this.value;
    }

    public int hashCode() {
        T t4 = this.value;
        if (t4 == null) {
            return 0;
        }
        return t4.hashCode();
    }

    @fg.l
    public String toString() {
        return "StaticValueHolder(value=" + this.value + ')';
    }
}
