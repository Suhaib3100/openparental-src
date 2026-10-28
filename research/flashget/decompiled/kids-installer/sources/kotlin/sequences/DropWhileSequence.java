package kotlin.sequences;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/sequences/DropWhileSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "predicate", "Lkotlin/Function1;", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.f, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class DropWhileSequence<T> implements Sequence<T> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Sequence<T> f26884a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final q3.l<T, Boolean> f26885b;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0002J\u000e\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"kotlin/sequences/DropWhileSequence$iterator$1", "", "dropState", "", "getDropState", "()I", "setDropState", "(I)V", "iterator", "getIterator", "()Ljava/util/Iterator;", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "drop", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.sequences.f$a */
    public static final class a implements Iterator<T>, r3.a {

        /* renamed from: o, reason: collision with root package name */
        @d5.d
        private final Iterator<T> f26886o;

        /* renamed from: p, reason: collision with root package name */
        private int f26887p = -1;

        /* renamed from: q, reason: collision with root package name */
        @d5.e
        private T f26888q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ DropWhileSequence<T> f26889r;

        a(DropWhileSequence<T> dropWhileSequence) {
            this.f26889r = dropWhileSequence;
            this.f26886o = ((DropWhileSequence) dropWhileSequence).f26884a.iterator();
        }

        private final void a() {
            while (this.f26886o.hasNext()) {
                T next = this.f26886o.next();
                if (!((Boolean) ((DropWhileSequence) this.f26889r).f26885b.N(next)).booleanValue()) {
                    this.f26888q = next;
                    this.f26887p = 1;
                    return;
                }
            }
            this.f26887p = 0;
        }

        /* renamed from: d, reason: from getter */
        public final int getF26887p() {
            return this.f26887p;
        }

        @d5.d
        public final Iterator<T> f() {
            return this.f26886o;
        }

        @d5.e
        public final T g() {
            return this.f26888q;
        }

        public final void h(int i5) {
            this.f26887p = i5;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f26887p == -1) {
                a();
            }
            return this.f26887p == 1 || this.f26886o.hasNext();
        }

        public final void j(@d5.e T t5) {
            this.f26888q = t5;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f26887p == -1) {
                a();
            }
            if (this.f26887p != 1) {
                return this.f26886o.next();
            }
            T t5 = this.f26888q;
            this.f26888q = null;
            this.f26887p = 0;
            return t5;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("娙"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DropWhileSequence(@d5.d Sequence<? extends T> sequence, @d5.d q3.l<? super T, Boolean> lVar) {
        l0.p(sequence, ProtectedSandApp.s("娚"));
        l0.p(lVar, ProtectedSandApp.s("娛"));
        this.f26884a = sequence;
        this.f26885b = lVar;
    }

    @Override // kotlin.sequences.Sequence
    @d5.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}
