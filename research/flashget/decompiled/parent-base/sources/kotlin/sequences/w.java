package kotlin.sequences;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lkotlin/sequences/w;", "T", "Lkotlin/sequences/m;", "Lkotlin/sequences/e;", "sequence", "", "startIndex", "endIndex", "<init>", "(Lkotlin/sequences/m;II)V", "n", "a", "(I)Lkotlin/sequences/m;", "b", "", "iterator", "()Ljava/util/Iterator;", "Lkotlin/sequences/m;", "I", "c", "f", "()I", "count", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
/* loaded from: classes7.dex */
public final class w<T> implements m<T>, e<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m<T> sequence;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int startIndex;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int endIndex;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"kotlin/sequences/w$a", "", "Lkotlin/k2;", "b", "()V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "Ljava/util/Iterator;", "c", "()Ljava/util/Iterator;", "iterator", "", "I", "d", "()I", "e", "(I)V", "position", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<T>, md.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Iterator<T> iterator;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int position;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w<T> f79036d;

        a(w<T> wVar) {
            this.f79036d = wVar;
            this.iterator = ((w) wVar).sequence.iterator();
        }

        private final void b() {
            while (this.position < ((w) this.f79036d).startIndex && this.iterator.hasNext()) {
                this.iterator.next();
                this.position++;
            }
        }

        @fg.l
        public final Iterator<T> c() {
            return this.iterator;
        }

        /* renamed from: d, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        public final void e(int i4) {
            this.position = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            return this.position < ((w) this.f79036d).endIndex && this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            b();
            if (this.position >= ((w) this.f79036d).endIndex) {
                throw new NoSuchElementException();
            }
            this.position++;
            return this.iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("荌\u0001"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(@fg.l m<? extends T> mVar, int i4, int i5) {
        l0.p(mVar, ProtectedSandApp.s("荍\u0001"));
        this.sequence = mVar;
        this.startIndex = i4;
        this.endIndex = i5;
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("荑\u0001"), i4).toString());
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("荐\u0001"), i5).toString());
        }
        if (i5 < i4) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("荎\u0001"), i5, ProtectedSandApp.s("荏\u0001"), i4).toString());
        }
    }

    private final int f() {
        return this.endIndex - this.startIndex;
    }

    @Override // kotlin.sequences.e
    @fg.l
    public m<T> a(int n4) {
        return n4 >= f() ? g.f78900a : new w(this.sequence, this.startIndex + n4, this.endIndex);
    }

    @Override // kotlin.sequences.e
    @fg.l
    public m<T> b(int n4) {
        if (n4 >= f()) {
            return this;
        }
        m<T> mVar = this.sequence;
        int i4 = this.startIndex;
        return new w(mVar, i4, n4 + i4);
    }

    @Override // kotlin.sequences.m
    @fg.l
    public Iterator<T> iterator() {
        return new a(this);
    }
}
