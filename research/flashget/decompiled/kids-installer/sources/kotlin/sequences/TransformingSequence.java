package kotlin.sequences;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J3\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\t0\u0003\"\u0004\b\u0002\u0010\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u000b0\u0006H\u0000¢\u0006\u0002\b\fJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0096\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/sequences/TransformingSequence;", "T", "R", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "flatten", "E", "iterator", "", "flatten$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.a0, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class TransformingSequence<T, R> implements Sequence<R> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Sequence<T> f26871a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final q3.l<T, R> f26872b;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\u000e\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"kotlin/sequences/TransformingSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.sequences.a0$a */
    public static final class a implements Iterator<R>, r3.a {

        /* renamed from: o, reason: collision with root package name */
        @d5.d
        private final Iterator<T> f26873o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ TransformingSequence<T, R> f26874p;

        a(TransformingSequence<T, R> transformingSequence) {
            this.f26874p = transformingSequence;
            this.f26873o = ((TransformingSequence) transformingSequence).f26871a.iterator();
        }

        @d5.d
        public final Iterator<T> a() {
            return this.f26873o;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26873o.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((TransformingSequence) this.f26874p).f26872b.N(this.f26873o.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("娌"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransformingSequence(@d5.d Sequence<? extends T> sequence, @d5.d q3.l<? super T, ? extends R> lVar) {
        l0.p(sequence, ProtectedSandApp.s("娍"));
        l0.p(lVar, ProtectedSandApp.s("娎"));
        this.f26871a = sequence;
        this.f26872b = lVar;
    }

    @d5.d
    public final <E> Sequence<E> e(@d5.d q3.l<? super R, ? extends Iterator<? extends E>> lVar) {
        l0.p(lVar, ProtectedSandApp.s("娏"));
        return new FlatteningSequence(this.f26871a, this.f26872b, lVar);
    }

    @Override // kotlin.sequences.Sequence
    @d5.d
    public Iterator<R> iterator() {
        return new a(this);
    }
}
