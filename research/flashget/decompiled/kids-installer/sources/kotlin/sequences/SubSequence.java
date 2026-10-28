package kotlin.sequences;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016R\u0014\u0010\t\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlin/sequences/SubSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "startIndex", "", "endIndex", "(Lkotlin/sequences/Sequence;II)V", "count", "getCount", "()I", "drop", "n", "iterator", "", "take", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
/* renamed from: kotlin.sequences.w, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public final class SubSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Sequence<T> f27021a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27022b;

    /* renamed from: c, reason: collision with root package name */
    private final int f27023c;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u000b\u001a\u00020\fH\u0002J\t\u0010\r\u001a\u00020\u000eH\u0096\u0002J\u000e\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"kotlin/sequences/SubSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "position", "", "getPosition", "()I", "setPosition", "(I)V", "drop", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.sequences.w$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator<T>, r3.a {

        /* renamed from: o, reason: collision with root package name */
        @d5.d
        private final Iterator<T> f27024o;

        /* renamed from: p, reason: collision with root package name */
        private int f27025p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ SubSequence<T> f27026q;

        a(SubSequence<T> subSequence) {
            this.f27026q = subSequence;
            this.f27024o = ((SubSequence) subSequence).f27021a.iterator();
        }

        private final void a() {
            while (this.f27025p < ((SubSequence) this.f27026q).f27022b && this.f27024o.hasNext()) {
                this.f27024o.next();
                this.f27025p++;
            }
        }

        @d5.d
        public final Iterator<T> d() {
            return this.f27024o;
        }

        /* renamed from: f, reason: from getter */
        public final int getF27025p() {
            return this.f27025p;
        }

        public final void g(int i5) {
            this.f27025p = i5;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f27025p < ((SubSequence) this.f27026q).f27023c && this.f27024o.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (this.f27025p >= ((SubSequence) this.f27026q).f27023c) {
                throw new NoSuchElementException();
            }
            this.f27025p++;
            return this.f27024o.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("娳"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubSequence(@d5.d Sequence<? extends T> sequence, int i5, int i6) {
        l0.p(sequence, ProtectedSandApp.s("豾"));
        this.f27021a = sequence;
        this.f27022b = i5;
        this.f27023c = i6;
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("貂"), i5).toString());
        }
        if (!(i6 >= 0)) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("貁"), i6).toString());
        }
        if (!(i6 >= i5)) {
            throw new IllegalArgumentException(android.content.preferences.protobuf.v.a(ProtectedSandApp.s("豿"), i6, ProtectedSandApp.s("貀"), i5).toString());
        }
    }

    private final int f() {
        return this.f27023c - this.f27022b;
    }

    @Override // kotlin.sequences.DropTakeSequence
    @d5.d
    public Sequence<T> a(int i5) {
        int i6 = this.f27023c;
        int i7 = this.f27022b;
        return i5 >= i6 - i7 ? this : new SubSequence(this.f27021a, i7, i5 + i7);
    }

    @Override // kotlin.sequences.DropTakeSequence
    @d5.d
    public Sequence<T> b(int i5) {
        int i6 = this.f27023c;
        int i7 = this.f27022b;
        return i5 >= i6 - i7 ? EmptySequence.f26890a : new SubSequence(this.f27021a, i7 + i5, i6);
    }

    @Override // kotlin.sequences.Sequence
    @d5.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}
