package kotlin.sequences;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/sequences/TakeWhileSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "predicate", "Lkotlin/Function1;", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.y, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class TakeWhileSequence<T> implements Sequence<T> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Sequence<T> f27031a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final q3.l<T, Boolean> f27032b;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0002J\u000e\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001e\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"kotlin/sequences/TakeWhileSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.sequences.y$a */
    public static final class a implements Iterator<T>, r3.a {

        /* renamed from: o, reason: collision with root package name */
        @d5.d
        private final Iterator<T> f27033o;

        /* renamed from: p, reason: collision with root package name */
        private int f27034p = -1;

        /* renamed from: q, reason: collision with root package name */
        @d5.e
        private T f27035q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ TakeWhileSequence<T> f27036r;

        a(TakeWhileSequence<T> takeWhileSequence) {
            this.f27036r = takeWhileSequence;
            this.f27033o = ((TakeWhileSequence) takeWhileSequence).f27031a.iterator();
        }

        private final void a() {
            if (this.f27033o.hasNext()) {
                T next = this.f27033o.next();
                if (((Boolean) ((TakeWhileSequence) this.f27036r).f27032b.N(next)).booleanValue()) {
                    this.f27034p = 1;
                    this.f27035q = next;
                    return;
                }
            }
            this.f27034p = 0;
        }

        @d5.d
        public final Iterator<T> d() {
            return this.f27033o;
        }

        @d5.e
        public final T f() {
            return this.f27035q;
        }

        /* renamed from: g, reason: from getter */
        public final int getF27034p() {
            return this.f27034p;
        }

        public final void h(@d5.e T t5) {
            this.f27035q = t5;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f27034p == -1) {
                a();
            }
            return this.f27034p == 1;
        }

        public final void j(int i5) {
            this.f27034p = i5;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f27034p == -1) {
                a();
            }
            if (this.f27034p == 0) {
                throw new NoSuchElementException();
            }
            T t5 = this.f27035q;
            this.f27035q = null;
            this.f27034p = -1;
            return t5;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("娵"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TakeWhileSequence(@d5.d Sequence<? extends T> sequence, @d5.d q3.l<? super T, Boolean> lVar) {
        l0.p(sequence, ProtectedSandApp.s("娶"));
        l0.p(lVar, ProtectedSandApp.s("娷"));
        this.f27031a = sequence;
        this.f27032b = lVar;
    }

    @Override // kotlin.sequences.Sequence
    @d5.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}
