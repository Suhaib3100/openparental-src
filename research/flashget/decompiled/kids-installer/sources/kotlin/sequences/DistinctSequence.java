package kotlin.sequences;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/sequences/DistinctSequence;", "T", "K", "Lkotlin/sequences/Sequence;", "source", "keySelector", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.c, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class DistinctSequence<T, K> implements Sequence<T> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Sequence<T> f26878a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final q3.l<T, K> f26879b;

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctSequence(@d5.d Sequence<? extends T> sequence, @d5.d q3.l<? super T, ? extends K> lVar) {
        l0.p(sequence, ProtectedSandApp.s("娖"));
        l0.p(lVar, ProtectedSandApp.s("娗"));
        this.f26878a = sequence;
        this.f26879b = lVar;
    }

    @Override // kotlin.sequences.Sequence
    @d5.d
    public Iterator<T> iterator() {
        return new DistinctIterator(this.f26878a.iterator(), this.f26879b);
    }
}
