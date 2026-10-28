package kotlin.sequences;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0096\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/TransformingIndexedSequence;", "T", "R", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function2;", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.z, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class TransformingIndexedSequence<T, R> implements Sequence<R> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Sequence<T> f27037a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final q3.p<Integer, T, R> f27038b;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u000b\u001a\u00020\fH\u0096\u0002J\u000e\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"kotlin/sequences/TransformingIndexedSequence$iterator$1", "", "index", "", "getIndex", "()I", "setIndex", "(I)V", "iterator", "getIterator", "()Ljava/util/Iterator;", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.sequences.z$a */
    public static final class a implements Iterator<R>, r3.a {

        /* renamed from: o, reason: collision with root package name */
        @d5.d
        private final Iterator<T> f27039o;

        /* renamed from: p, reason: collision with root package name */
        private int f27040p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ TransformingIndexedSequence<T, R> f27041q;

        a(TransformingIndexedSequence<T, R> transformingIndexedSequence) {
            this.f27041q = transformingIndexedSequence;
            this.f27039o = ((TransformingIndexedSequence) transformingIndexedSequence).f27037a.iterator();
        }

        /* renamed from: a, reason: from getter */
        public final int getF27040p() {
            return this.f27040p;
        }

        @d5.d
        public final Iterator<T> d() {
            return this.f27039o;
        }

        public final void f(int i5) {
            this.f27040p = i5;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f27039o.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            q3.p pVar = ((TransformingIndexedSequence) this.f27041q).f27038b;
            int i5 = this.f27040p;
            this.f27040p = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.a0.Z();
            }
            return (R) pVar.g0(Integer.valueOf(i5), this.f27039o.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("娸"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransformingIndexedSequence(@d5.d Sequence<? extends T> sequence, @d5.d q3.p<? super Integer, ? super T, ? extends R> pVar) {
        l0.p(sequence, ProtectedSandApp.s("娹"));
        l0.p(pVar, ProtectedSandApp.s("娺"));
        this.f27037a = sequence;
        this.f27038b = pVar;
    }

    @Override // kotlin.sequences.Sequence
    @d5.d
    public Iterator<R> iterator() {
        return new a(this);
    }
}
