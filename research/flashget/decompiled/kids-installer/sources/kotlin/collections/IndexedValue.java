package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: IndexedValue.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lkotlin/collections/IndexedValue;", "T", "", "index", "", "value", "(ILjava/lang/Object;)V", "getIndex", "()I", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(ILjava/lang/Object;)Lkotlin/collections/IndexedValue;", "equals", "", "other", "hashCode", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.collections.u0, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final /* data */ class IndexedValue<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f23235a;

    /* renamed from: b, reason: collision with root package name */
    private final T f23236b;

    public IndexedValue(int i5, T t5) {
        this.f23235a = i5;
        this.f23236b = t5;
    }

    public static IndexedValue d(IndexedValue indexedValue, int i5, Object obj, int i6, Object obj2) {
        if ((i6 & 1) != 0) {
            i5 = indexedValue.f23235a;
        }
        if ((i6 & 2) != 0) {
            obj = indexedValue.f23236b;
        }
        indexedValue.getClass();
        return new IndexedValue(i5, obj);
    }

    /* renamed from: a, reason: from getter */
    public final int getF23235a() {
        return this.f23235a;
    }

    public final T b() {
        return this.f23236b;
    }

    @d5.d
    public final IndexedValue<T> c(int i5, T t5) {
        return new IndexedValue<>(i5, t5);
    }

    public final int e() {
        return this.f23235a;
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) other;
        return this.f23235a == indexedValue.f23235a && kotlin.jvm.internal.l0.g(this.f23236b, indexedValue.f23236b);
    }

    public final T f() {
        return this.f23236b;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f23235a) * 31;
        T t5 = this.f23236b;
        return hashCode + (t5 == null ? 0 : t5.hashCode());
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("㡈") + this.f23235a + ProtectedSandApp.s("㡉") + this.f23236b + ')';
    }
}
