package android.content.core;

import kotlin.Metadata;

/* compiled from: SingleProcessDataStore.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0004\u001a\u00020\u0003R\u0017\u0010\b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/datastore/core/b;", "T", "Landroidx/datastore/core/m;", "Lkotlin/m2;", "a", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "value", "", "b", "I", "()I", "hashCode", "<init>", "(Ljava/lang/Object;I)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
final class b<T> extends m<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int hashCode;

    public b(T t5, int i5) {
        super(null);
        this.value = t5;
        this.hashCode = i5;
    }

    public final void a() {
        T t5 = this.value;
        if (!((t5 != null ? t5.hashCode() : 0) == this.hashCode)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
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
