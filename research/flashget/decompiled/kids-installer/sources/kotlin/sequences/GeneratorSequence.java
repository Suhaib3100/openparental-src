package kotlin.sequences;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/GeneratorSequence;", "T", "", "Lkotlin/sequences/Sequence;", "getInitialValue", "Lkotlin/Function0;", "getNextValue", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.j, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class GeneratorSequence<T> implements Sequence<T> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final q3.a<T> f26904a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final q3.l<T, T> f26905b;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010(\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\t\u0010\u0010\u001a\u00020\u0011H\u0096\u0002J\u000e\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0002\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0007\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"kotlin/sequences/GeneratorSequence$iterator$1", "", "nextItem", "getNextItem", "()Ljava/lang/Object;", "setNextItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.sequences.j$a */
    public static final class a implements Iterator<T>, r3.a {

        /* renamed from: o, reason: collision with root package name */
        @d5.e
        private T f26906o;

        /* renamed from: p, reason: collision with root package name */
        private int f26907p = -2;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ GeneratorSequence<T> f26908q;

        a(GeneratorSequence<T> generatorSequence) {
            this.f26908q = generatorSequence;
        }

        private final void a() {
            T t5;
            if (this.f26907p == -2) {
                t5 = (T) ((GeneratorSequence) this.f26908q).f26904a.n();
            } else {
                q3.l lVar = ((GeneratorSequence) this.f26908q).f26905b;
                T t6 = this.f26906o;
                l0.m(t6);
                t5 = (T) lVar.N(t6);
            }
            this.f26906o = t5;
            this.f26907p = t5 == null ? 0 : 1;
        }

        @d5.e
        public final T d() {
            return this.f26906o;
        }

        /* renamed from: f, reason: from getter */
        public final int getF26907p() {
            return this.f26907p;
        }

        public final void g(@d5.e T t5) {
            this.f26906o = t5;
        }

        public final void h(int i5) {
            this.f26907p = i5;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f26907p < 0) {
                a();
            }
            return this.f26907p == 1;
        }

        @Override // java.util.Iterator
        @d5.d
        public T next() {
            if (this.f26907p < 0) {
                a();
            }
            if (this.f26907p == 0) {
                throw new NoSuchElementException();
            }
            T t5 = this.f26906o;
            l0.n(t5, ProtectedSandApp.s("娣"));
            this.f26907p = -1;
            return t5;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("娤"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GeneratorSequence(@d5.d q3.a<? extends T> aVar, @d5.d q3.l<? super T, ? extends T> lVar) {
        l0.p(aVar, ProtectedSandApp.s("娥"));
        l0.p(lVar, ProtectedSandApp.s("娦"));
        this.f26904a = aVar;
        this.f26905b = lVar;
    }

    @Override // kotlin.sequences.Sequence
    @d5.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}
