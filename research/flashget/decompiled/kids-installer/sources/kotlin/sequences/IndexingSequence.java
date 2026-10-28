package kotlin.sequences;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.l0;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0007H\u0096\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/sequences/IndexingSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/collections/IndexedValue;", "sequence", "(Lkotlin/sequences/Sequence;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.k, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class IndexingSequence<T> implements Sequence<IndexedValue<? extends T>> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Sequence<T> f26909a;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\t\u0010\f\u001a\u00020\rH\u0096\u0002J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"kotlin/sequences/IndexingSequence$iterator$1", "", "Lkotlin/collections/IndexedValue;", "index", "", "getIndex", "()I", "setIndex", "(I)V", "iterator", "getIterator", "()Ljava/util/Iterator;", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.sequences.k$a */
    public static final class a implements Iterator<IndexedValue<? extends T>>, r3.a {

        /* renamed from: o, reason: collision with root package name */
        @d5.d
        private final Iterator<T> f26910o;

        /* renamed from: p, reason: collision with root package name */
        private int f26911p;

        a(IndexingSequence<T> indexingSequence) {
            this.f26910o = ((IndexingSequence) indexingSequence).f26909a.iterator();
        }

        /* renamed from: a, reason: from getter */
        public final int getF26911p() {
            return this.f26911p;
        }

        @d5.d
        public final Iterator<T> d() {
            return this.f26910o;
        }

        @Override // java.util.Iterator
        @d5.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public IndexedValue<T> next() {
            int i5 = this.f26911p;
            this.f26911p = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.a0.Z();
            }
            return new IndexedValue<>(i5, this.f26910o.next());
        }

        public final void g(int i5) {
            this.f26911p = i5;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26910o.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("娧"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IndexingSequence(@d5.d Sequence<? extends T> sequence) {
        l0.p(sequence, ProtectedSandApp.s("娨"));
        this.f26909a = sequence;
    }

    @Override // kotlin.sequences.Sequence
    @d5.d
    public Iterator<IndexedValue<T>> iterator() {
        return new a(this);
    }
}
