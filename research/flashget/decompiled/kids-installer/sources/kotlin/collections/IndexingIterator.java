package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: Iterators.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u0086\u0002J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/collections/IndexingIterator;", "T", "", "Lkotlin/collections/IndexedValue;", "iterator", "(Ljava/util/Iterator;)V", "index", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.collections.w0, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class IndexingIterator<T> implements Iterator<IndexedValue<? extends T>>, r3.a {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final Iterator<T> f23246o;

    /* renamed from: p, reason: collision with root package name */
    private int f23247p;

    /* JADX WARN: Multi-variable type inference failed */
    public IndexingIterator(@d5.d Iterator<? extends T> it) {
        kotlin.jvm.internal.l0.p(it, ProtectedSandApp.s("㸄"));
        this.f23246o = it;
    }

    @Override // java.util.Iterator
    @d5.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IndexedValue<T> next() {
        int i5 = this.f23247p;
        this.f23247p = i5 + 1;
        if (i5 < 0) {
            a0.Z();
        }
        return new IndexedValue<>(i5, this.f23246o.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23246o.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("㸅"));
    }
}
