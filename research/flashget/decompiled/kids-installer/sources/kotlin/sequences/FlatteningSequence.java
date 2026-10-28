package kotlin.sequences;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004BA\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\tH\u0096\u0002R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/FlatteningSequence;", "T", "R", "E", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "iterator", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.i, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class FlatteningSequence<T, R, E> implements Sequence<E> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Sequence<T> f26898a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final q3.l<T, R> f26899b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final q3.l<R, Iterator<E>> f26900c;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\t\u001a\u00020\nH\u0002J\t\u0010\u000b\u001a\u00020\nH\u0096\u0002J\u000e\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\rR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0004¨\u0006\u000e"}, d2 = {"kotlin/sequences/FlatteningSequence$iterator$1", "", "itemIterator", "getItemIterator", "()Ljava/util/Iterator;", "setItemIterator", "(Ljava/util/Iterator;)V", "iterator", "getIterator", "ensureItemIterator", "", "hasNext", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.sequences.i$a */
    public static final class a implements Iterator<E>, r3.a {

        /* renamed from: o, reason: collision with root package name */
        @d5.d
        private final Iterator<T> f26901o;

        /* renamed from: p, reason: collision with root package name */
        @d5.e
        private Iterator<? extends E> f26902p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ FlatteningSequence<T, R, E> f26903q;

        a(FlatteningSequence<T, R, E> flatteningSequence) {
            this.f26903q = flatteningSequence;
            this.f26901o = ((FlatteningSequence) flatteningSequence).f26898a.iterator();
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final boolean a() {
            /*
                r5 = this;
                java.util.Iterator<? extends E> r0 = r5.f26902p
                r1 = 1
                r2 = 0
                if (r0 == 0) goto Le
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto Le
                r0 = r1
                goto Lf
            Le:
                r0 = r2
            Lf:
                if (r0 == 0) goto L14
                r0 = 0
                r5.f26902p = r0
            L14:
                java.util.Iterator<? extends E> r0 = r5.f26902p
                if (r0 != 0) goto L45
                java.util.Iterator<T> r0 = r5.f26901o
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L21
                return r2
            L21:
                java.util.Iterator<T> r0 = r5.f26901o
                java.lang.Object r0 = r0.next()
                kotlin.sequences.i<T, R, E> r3 = r5.f26903q
                q3.l r3 = kotlin.sequences.FlatteningSequence.c(r3)
                kotlin.sequences.i<T, R, E> r4 = r5.f26903q
                q3.l r4 = kotlin.sequences.FlatteningSequence.e(r4)
                java.lang.Object r0 = r4.N(r0)
                java.lang.Object r0 = r3.N(r0)
                java.util.Iterator r0 = (java.util.Iterator) r0
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L14
                r5.f26902p = r0
            L45:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.FlatteningSequence.a.a():boolean");
        }

        @d5.e
        public final Iterator<E> d() {
            return this.f26902p;
        }

        @d5.d
        public final Iterator<T> f() {
            return this.f26901o;
        }

        public final void g(@d5.e Iterator<? extends E> it) {
            this.f26902p = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return a();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends E> it = this.f26902p;
            l0.m(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("娟"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlatteningSequence(@d5.d Sequence<? extends T> sequence, @d5.d q3.l<? super T, ? extends R> lVar, @d5.d q3.l<? super R, ? extends Iterator<? extends E>> lVar2) {
        l0.p(sequence, ProtectedSandApp.s("娠"));
        l0.p(lVar, ProtectedSandApp.s("娡"));
        l0.p(lVar2, ProtectedSandApp.s("娢"));
        this.f26898a = sequence;
        this.f26899b = lVar;
        this.f26900c = lVar2;
    }

    @Override // kotlin.sequences.Sequence
    @d5.d
    public Iterator<E> iterator() {
        return new a(this);
    }
}
