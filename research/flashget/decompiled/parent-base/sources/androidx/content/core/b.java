package androidx.content.core;

import kotlin.Metadata;

/* compiled from: SingleProcessDataStore.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/datastore/core/b;", "T", "Landroidx/datastore/core/m;", "value", "", "hashCode", "<init>", "(Ljava/lang/Object;I)V", "Lkotlin/k2;", "a", "()V", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "b", "I", "()I", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
final class b<T> extends m<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int hashCode;

    public b(T t4, int i4) {
        super(null);
        this.value = t4;
        this.hashCode = i4;
    }

    public final void a() {
        T t4 = this.value;
        if (!((t4 != null ? t4.hashCode() : 0) == this.hashCode)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    /* renamed from: b, reason: from getter */
    public final int getHashCode() {
        return this.hashCode;
    }

    public final T c() {
        return this.value;
    }
}
