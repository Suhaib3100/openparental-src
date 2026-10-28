package kotlin.sequences;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004B;\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u000bH\u0096\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/sequences/MergingSequence;", "T1", "T2", "V", "Lkotlin/sequences/Sequence;", "sequence1", "sequence2", "transform", "Lkotlin/Function2;", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.l, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class MergingSequence<T1, T2, V> implements Sequence<V> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Sequence<T1> f26912a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final Sequence<T2> f26913b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final q3.p<T1, T2, V> f26914c;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0007\u001a\u00020\bH\u0096\u0002J\u000e\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u000b"}, d2 = {"kotlin/sequences/MergingSequence$iterator$1", "", "iterator1", "getIterator1", "()Ljava/util/Iterator;", "iterator2", "getIterator2", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.sequences.l$a */
    public static final class a implements Iterator<V>, r3.a {

        /* renamed from: o, reason: collision with root package name */
        @d5.d
        private final Iterator<T1> f26915o;

        /* renamed from: p, reason: collision with root package name */
        @d5.d
        private final Iterator<T2> f26916p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ MergingSequence<T1, T2, V> f26917q;

        a(MergingSequence<T1, T2, V> mergingSequence) {
            this.f26917q = mergingSequence;
            this.f26915o = ((MergingSequence) mergingSequence).f26912a.iterator();
            this.f26916p = ((MergingSequence) mergingSequence).f26913b.iterator();
        }

        @d5.d
        public final Iterator<T1> a() {
            return this.f26915o;
        }

        @d5.d
        public final Iterator<T2> d() {
            return this.f26916p;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26915o.hasNext() && this.f26916p.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) ((MergingSequence) this.f26917q).f26914c.g0(this.f26915o.next(), this.f26916p.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("娩"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MergingSequence(@d5.d Sequence<? extends T1> sequence, @d5.d Sequence<? extends T2> sequence2, @d5.d q3.p<? super T1, ? super T2, ? extends V> pVar) {
        l0.p(sequence, ProtectedSandApp.s("娪"));
        l0.p(sequence2, ProtectedSandApp.s("娫"));
        l0.p(pVar, ProtectedSandApp.s("娬"));
        this.f26912a = sequence;
        this.f26913b = sequence2;
        this.f26914c = pVar;
    }

    @Override // kotlin.sequences.Sequence
    @d5.d
    public Iterator<V> iterator() {
        return new a(this);
    }
}
