package kotlin.sequences;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.r0;
import kotlin.jvm.internal.l0;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/sequences/k;", "T", "Lkotlin/sequences/m;", "Lkotlin/collections/r0;", "sequence", "<init>", "(Lkotlin/sequences/m;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "Lkotlin/sequences/m;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class k<T> implements m<r0<? extends T>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m<T> sequence;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\b\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"kotlin/sequences/k$a", "", "Lkotlin/collections/r0;", "d", "()Lkotlin/collections/r0;", "", "hasNext", "()Z", "b", "Ljava/util/Iterator;", "c", "()Ljava/util/Iterator;", "iterator", "", "I", "()I", "e", "(I)V", "index", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<r0<? extends T>>, md.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Iterator<T> iterator;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int index;

        a(k<T> kVar) {
            this.iterator = ((k) kVar).sequence.iterator();
        }

        /* renamed from: b, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        @fg.l
        public final Iterator<T> c() {
            return this.iterator;
        }

        @Override // java.util.Iterator
        @fg.l
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public r0<T> next() {
            int i4 = this.index;
            this.index = i4 + 1;
            if (i4 < 0) {
                kotlin.collections.w.Z();
            }
            return new r0<>(i4, this.iterator.next());
        }

        public final void e(int i4) {
            this.index = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("苳\u0001"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@fg.l m<? extends T> mVar) {
        l0.p(mVar, ProtectedSandApp.s("苴\u0001"));
        this.sequence = mVar;
    }

    @Override // kotlin.sequences.m
    @fg.l
    public Iterator<r0<T>> iterator() {
        return new a(this);
    }
}
