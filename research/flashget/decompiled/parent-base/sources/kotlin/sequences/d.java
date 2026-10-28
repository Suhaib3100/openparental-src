package kotlin.sequences;

import androidx.compose.animation.core.a2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/sequences/d;", "T", "Lkotlin/sequences/m;", "Lkotlin/sequences/e;", "sequence", "", "count", "<init>", "(Lkotlin/sequences/m;I)V", "n", "a", "(I)Lkotlin/sequences/m;", "b", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/sequences/m;", "I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
/* loaded from: classes7.dex */
public final class d<T> implements m<T>, e<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m<T> sequence;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int count;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"kotlin/sequences/d$a", "", "Lkotlin/k2;", "b", "()V", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "Ljava/util/Iterator;", "c", "()Ljava/util/Iterator;", "iterator", "", "I", "d", "()I", "e", "(I)V", "left", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<T>, md.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Iterator<T> iterator;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int left;

        a(d<T> dVar) {
            this.iterator = ((d) dVar).sequence.iterator();
            this.left = ((d) dVar).count;
        }

        private final void b() {
            while (this.left > 0 && this.iterator.hasNext()) {
                this.iterator.next();
                this.left--;
            }
        }

        @fg.l
        public final Iterator<T> c() {
            return this.iterator;
        }

        /* renamed from: d, reason: from getter */
        public final int getLeft() {
            return this.left;
        }

        public final void e(int i4) {
            this.left = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            b();
            return this.iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("苢\u0001"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@fg.l m<? extends T> mVar, int i4) {
        l0.p(mVar, ProtectedSandApp.s("苣\u0001"));
        this.sequence = mVar;
        this.count = i4;
        if (i4 < 0) {
            throw new IllegalArgumentException(a2.a(ProtectedSandApp.s("苤\u0001"), i4, '.').toString());
        }
    }

    @Override // kotlin.sequences.e
    @fg.l
    public m<T> a(int n4) {
        int i4 = this.count + n4;
        return i4 < 0 ? new d(this, n4) : new d(this.sequence, i4);
    }

    @Override // kotlin.sequences.e
    @fg.l
    public m<T> b(int n4) {
        int i4 = this.count;
        int i5 = i4 + n4;
        return i5 < 0 ? new x(this, n4) : new w(this.sequence, i4, i5);
    }

    @Override // kotlin.sequences.m
    @fg.l
    public Iterator<T> iterator() {
        return new a(this);
    }
}
