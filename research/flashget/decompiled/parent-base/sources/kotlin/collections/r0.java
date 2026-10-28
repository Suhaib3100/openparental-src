package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: IndexedValue.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lkotlin/collections/r0;", "T", "", "", "index", "value", "<init>", "(ILjava/lang/Object;)V", "a", "()I", "b", "()Ljava/lang/Object;", "c", "(ILjava/lang/Object;)Lkotlin/collections/r0;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "e", "Ljava/lang/Object;", "f", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class r0<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T value;

    public r0(int i4, T t4) {
        this.index = i4;
        this.value = t4;
    }

    public static r0 d(r0 r0Var, int i4, Object obj, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            i4 = r0Var.index;
        }
        if ((i5 & 2) != 0) {
            obj = r0Var.value;
        }
        r0Var.getClass();
        return new r0(i4, obj);
    }

    /* renamed from: a, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final T b() {
        return this.value;
    }

    @fg.l
    public final r0<T> c(int index, T value) {
        return new r0<>(index, value);
    }

    public final int e() {
        return this.index;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) other;
        return this.index == r0Var.index && kotlin.jvm.internal.l0.g(this.value, r0Var.value);
    }

    public final T f() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.index) * 31;
        T t4 = this.value;
        return hashCode + (t4 == null ? 0 : t4.hashCode());
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("戊\u0001") + this.index + ProtectedSandApp.s("戋\u0001") + this.value + ')';
    }
}
