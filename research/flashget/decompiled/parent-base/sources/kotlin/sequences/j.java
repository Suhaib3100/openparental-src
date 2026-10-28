package kotlin.sequences;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B-\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/sequences/j;", "", "T", "Lkotlin/sequences/m;", "Lkotlin/Function0;", "getInitialValue", "Lkotlin/Function1;", "getNextValue", "<init>", "(Lld/a;Lld/l;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "Lld/a;", "b", "Lld/l;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class j<T> implements m<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<T> getInitialValue;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<T, T> getNextValue;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR$\u0010\u000e\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"kotlin/sequences/j$a", "", "Lkotlin/k2;", "b", "()V", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "Ljava/lang/Object;", "c", "e", "(Ljava/lang/Object;)V", "nextItem", "", "I", "d", "()I", "f", "(I)V", "nextState", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<T>, md.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private T nextItem;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int nextState = -2;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ j<T> f78918d;

        a(j<T> jVar) {
            this.f78918d = jVar;
        }

        private final void b() {
            T t4;
            if (this.nextState == -2) {
                t4 = (T) ((j) this.f78918d).getInitialValue.invoke();
            } else {
                ld.l lVar = ((j) this.f78918d).getNextValue;
                T t5 = this.nextItem;
                l0.m(t5);
                t4 = (T) lVar.invoke(t5);
            }
            this.nextItem = t4;
            this.nextState = t4 == null ? 0 : 1;
        }

        @fg.m
        public final T c() {
            return this.nextItem;
        }

        /* renamed from: d, reason: from getter */
        public final int getNextState() {
            return this.nextState;
        }

        public final void e(@fg.m T t4) {
            this.nextItem = t4;
        }

        public final void f(int i4) {
            this.nextState = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextState < 0) {
                b();
            }
            return this.nextState == 1;
        }

        @Override // java.util.Iterator
        @fg.l
        public T next() {
            if (this.nextState < 0) {
                b();
            }
            if (this.nextState == 0) {
                throw new NoSuchElementException();
            }
            T t4 = this.nextItem;
            l0.n(t4, ProtectedSandApp.s("苯\u0001"));
            this.nextState = -1;
            return t4;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("苰\u0001"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@fg.l ld.a<? extends T> aVar, @fg.l ld.l<? super T, ? extends T> lVar) {
        l0.p(aVar, ProtectedSandApp.s("英\u0001"));
        l0.p(lVar, ProtectedSandApp.s("苲\u0001"));
        this.getInitialValue = aVar;
        this.getNextValue = lVar;
    }

    @Override // kotlin.sequences.m
    @fg.l
    public Iterator<T> iterator() {
        return new a(this);
    }
}
