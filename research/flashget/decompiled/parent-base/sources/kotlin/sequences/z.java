package kotlin.sequences;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/sequences/z;", "T", "R", "Lkotlin/sequences/m;", "sequence", "Lkotlin/Function2;", "", "transformer", "<init>", "(Lkotlin/sequences/m;Lld/p;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "Lkotlin/sequences/m;", "b", "Lld/p;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class z<T, R> implements m<R> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m<T> sequence;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.p<Integer, T, R> transformer;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0011\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\r\u001a\u0004\b\u0007\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"kotlin/sequences/z$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "b", "Ljava/util/Iterator;", "c", "()Ljava/util/Iterator;", "iterator", "", "I", "()I", "d", "(I)V", "index", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<R>, md.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Iterator<T> iterator;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z<T, R> f79051d;

        a(z<T, R> zVar) {
            this.f79051d = zVar;
            this.iterator = ((z) zVar).sequence.iterator();
        }

        /* renamed from: b, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        @fg.l
        public final Iterator<T> c() {
            return this.iterator;
        }

        public final void d(int i4) {
            this.index = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            ld.p pVar = ((z) this.f79051d).transformer;
            int i4 = this.index;
            this.index = i4 + 1;
            if (i4 < 0) {
                kotlin.collections.w.Z();
            }
            return (R) pVar.invoke(Integer.valueOf(i4), this.iterator.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("荘\u0001"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(@fg.l m<? extends T> mVar, @fg.l ld.p<? super Integer, ? super T, ? extends R> pVar) {
        l0.p(mVar, ProtectedSandApp.s("荙\u0001"));
        l0.p(pVar, ProtectedSandApp.s("荚\u0001"));
        this.sequence = mVar;
        this.transformer = pVar;
    }

    @Override // kotlin.sequences.m
    @fg.l
    public Iterator<R> iterator() {
        return new a(this);
    }
}
