package kotlin.sequences;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/sequences/h;", "T", "Lkotlin/sequences/m;", "sequence", "", "sendWhen", "Lkotlin/Function1;", "predicate", "<init>", "(Lkotlin/sequences/m;ZLld/l;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "Lkotlin/sequences/m;", "b", "Z", "c", "Lld/l;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class h<T> implements m<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m<T> sequence;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean sendWhen;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<T, Boolean> predicate;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0019\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"kotlin/sequences/h$a", "", "Lkotlin/k2;", "b", "()V", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "Ljava/util/Iterator;", "c", "()Ljava/util/Iterator;", "iterator", "", "I", "e", "()I", "h", "(I)V", "nextState", "d", "Ljava/lang/Object;", "f", "(Ljava/lang/Object;)V", "nextItem", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<T>, md.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Iterator<T> iterator;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int nextState = -1;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private T nextItem;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ h<T> f78907e;

        a(h<T> hVar) {
            this.f78907e = hVar;
            this.iterator = ((h) hVar).sequence.iterator();
        }

        private final void b() {
            while (this.iterator.hasNext()) {
                T next = this.iterator.next();
                if (((Boolean) ((h) this.f78907e).predicate.invoke(next)).booleanValue() == ((h) this.f78907e).sendWhen) {
                    this.nextItem = next;
                    this.nextState = 1;
                    return;
                }
            }
            this.nextState = 0;
        }

        @fg.l
        public final Iterator<T> c() {
            return this.iterator;
        }

        @fg.m
        public final T d() {
            return this.nextItem;
        }

        /* renamed from: e, reason: from getter */
        public final int getNextState() {
            return this.nextState;
        }

        public final void f(@fg.m T t4) {
            this.nextItem = t4;
        }

        public final void h(int i4) {
            this.nextState = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextState == -1) {
                b();
            }
            return this.nextState == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.nextState == -1) {
                b();
            }
            if (this.nextState == 0) {
                throw new NoSuchElementException();
            }
            T t4 = this.nextItem;
            this.nextItem = null;
            this.nextState = -1;
            return t4;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("苨\u0001"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@fg.l m<? extends T> mVar, boolean z4, @fg.l ld.l<? super T, Boolean> lVar) {
        l0.p(mVar, ProtectedSandApp.s("苩\u0001"));
        l0.p(lVar, ProtectedSandApp.s("苪\u0001"));
        this.sequence = mVar;
        this.sendWhen = z4;
        this.predicate = lVar;
    }

    @Override // kotlin.sequences.m
    @fg.l
    public Iterator<T> iterator() {
        return new a(this);
    }

    public /* synthetic */ h(m mVar, boolean z4, ld.l lVar, int i4, kotlin.jvm.internal.w wVar) {
        this(mVar, (i4 & 2) != 0 ? true : z4, lVar);
    }
}
