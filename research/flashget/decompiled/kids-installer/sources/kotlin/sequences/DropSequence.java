package kotlin.sequences;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/sequences/DropSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "count", "", "(Lkotlin/sequences/Sequence;I)V", "drop", "n", "iterator", "", "take", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
/* renamed from: kotlin.sequences.d, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public final class DropSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Sequence<T> f26880a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26881b;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u000b\u001a\u00020\fH\u0002J\t\u0010\r\u001a\u00020\u000eH\u0096\u0002J\u000e\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"kotlin/sequences/DropSequence$iterator$1", "", "iterator", "getIterator", "()Ljava/util/Iterator;", "left", "", "getLeft", "()I", "setLeft", "(I)V", "drop", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.sequences.d$a */
    /* loaded from: classes5.dex */
    public static final class a implements Iterator<T>, r3.a {

        /* renamed from: o, reason: collision with root package name */
        @d5.d
        private final Iterator<T> f26882o;

        /* renamed from: p, reason: collision with root package name */
        private int f26883p;

        a(DropSequence<T> dropSequence) {
            this.f26882o = ((DropSequence) dropSequence).f26880a.iterator();
            this.f26883p = ((DropSequence) dropSequence).f26881b;
        }

        private final void a() {
            while (this.f26883p > 0 && this.f26882o.hasNext()) {
                this.f26882o.next();
                this.f26883p--;
            }
        }

        @d5.d
        public final Iterator<T> d() {
            return this.f26882o;
        }

        /* renamed from: f, reason: from getter */
        public final int getF26883p() {
            return this.f26883p;
        }

        public final void g(int i5) {
            this.f26883p = i5;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f26882o.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            return this.f26882o.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("娘"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DropSequence(@d5.d Sequence<? extends T> sequence, int i5) {
        l0.p(sequence, ProtectedSandApp.s("誻"));
        this.f26880a = sequence;
        this.f26881b = i5;
        if (i5 >= 0) {
            return;
        }
        throw new IllegalArgumentException((ProtectedSandApp.s("誼") + i5 + org.apache.commons.io.k.f32026a).toString());
    }

    @Override // kotlin.sequences.DropTakeSequence
    @d5.d
    public Sequence<T> a(int i5) {
        int i6 = this.f26881b;
        int i7 = i6 + i5;
        return i7 < 0 ? new TakeSequence(this, i5) : new SubSequence(this.f26880a, i6, i7);
    }

    @Override // kotlin.sequences.DropTakeSequence
    @d5.d
    public Sequence<T> b(int i5) {
        int i6 = this.f26881b + i5;
        return i6 < 0 ? new DropSequence(this, i5) : new DropSequence(this.f26880a, i6);
    }

    @Override // kotlin.sequences.Sequence
    @d5.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}
