package kotlin.sequences;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.internal.l0;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0014R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00028\u00010\nj\b\u0012\u0004\u0012\u00028\u0001`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/sequences/DistinctIterator;", "T", "K", "Lkotlin/collections/AbstractIterator;", "source", "", "keySelector", "Lkotlin/Function1;", "(Ljava/util/Iterator;Lkotlin/jvm/functions/Function1;)V", "observed", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "computeNext", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.sequences.b, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
final class DistinctIterator<T, K> extends AbstractIterator<T> {

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final Iterator<T> f26875q;

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    private final q3.l<T, K> f26876r;

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    private final HashSet<K> f26877s;

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctIterator(@d5.d Iterator<? extends T> it, @d5.d q3.l<? super T, ? extends K> lVar) {
        l0.p(it, ProtectedSandApp.s("誹"));
        l0.p(lVar, ProtectedSandApp.s("誺"));
        this.f26875q = it;
        this.f26876r = lVar;
        this.f26877s = new HashSet<>();
    }

    @Override // kotlin.collections.AbstractIterator
    protected void a() {
        while (this.f26875q.hasNext()) {
            T next = this.f26875q.next();
            if (this.f26877s.add(this.f26876r.N(next))) {
                f(next);
                return;
            }
        }
        d();
    }
}
