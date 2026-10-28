package kotlin.sequences;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004BC\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lkotlin/sequences/i;", "T", "R", "E", "Lkotlin/sequences/m;", "sequence", "Lkotlin/Function1;", "transformer", "", "iterator", "<init>", "(Lkotlin/sequences/m;Lld/l;Lld/l;)V", "()Ljava/util/Iterator;", "a", "Lkotlin/sequences/m;", "b", "Lld/l;", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class i<T, R, E> implements m<E> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m<T> sequence;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<T, R> transformer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<R, Iterator<E>> iterator;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\u0004R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR*\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\b\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"kotlin/sequences/i$a", "", "", "b", "()Z", "next", "()Ljava/lang/Object;", "hasNext", "Ljava/util/Iterator;", "d", "()Ljava/util/Iterator;", "iterator", "c", "e", "(Ljava/util/Iterator;)V", "itemIterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<E>, md.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Iterator<T> iterator;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Iterator<? extends E> itemIterator;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ i<T, R, E> f78913d;

        a(i<T, R, E> iVar) {
            this.f78913d = iVar;
            this.iterator = ((i) iVar).sequence.iterator();
        }

        private final boolean b() {
            Iterator<? extends E> it = this.itemIterator;
            if (it != null && !it.hasNext()) {
                this.itemIterator = null;
            }
            while (true) {
                if (this.itemIterator != null) {
                    break;
                }
                if (!this.iterator.hasNext()) {
                    return false;
                }
                Iterator<? extends E> it2 = (Iterator) ((i) this.f78913d).iterator.invoke(((i) this.f78913d).transformer.invoke(this.iterator.next()));
                if (it2.hasNext()) {
                    this.itemIterator = it2;
                    break;
                }
            }
            return true;
        }

        @fg.m
        public final Iterator<E> c() {
            return this.itemIterator;
        }

        @fg.l
        public final Iterator<T> d() {
            return this.iterator;
        }

        public final void e(@fg.m Iterator<? extends E> it) {
            this.itemIterator = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return b();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends E> it = this.itemIterator;
            l0.m(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("苫\u0001"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@fg.l m<? extends T> mVar, @fg.l ld.l<? super T, ? extends R> lVar, @fg.l ld.l<? super R, ? extends Iterator<? extends E>> lVar2) {
        l0.p(mVar, ProtectedSandApp.s("苬\u0001"));
        l0.p(lVar, ProtectedSandApp.s("苭\u0001"));
        l0.p(lVar2, ProtectedSandApp.s("苮\u0001"));
        this.sequence = mVar;
        this.transformer = lVar;
        this.iterator = lVar2;
    }

    @Override // kotlin.sequences.m
    @fg.l
    public Iterator<E> iterator() {
        return new a(this);
    }
}
