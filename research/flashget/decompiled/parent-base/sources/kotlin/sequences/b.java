package kotlin.sequences;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0011j\b\u0012\u0004\u0012\u00028\u0001`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lkotlin/sequences/b;", "T", "K", "Lkotlin/collections/b;", "", "source", "Lkotlin/Function1;", "keySelector", "<init>", "(Ljava/util/Iterator;Lld/l;)V", "Lkotlin/k2;", "b", "()V", "d", "Ljava/util/Iterator;", "e", "Lld/l;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "f", "Ljava/util/HashSet;", "observed", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class b<T, K> extends kotlin.collections.b<T> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Iterator<T> source;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<T, K> keySelector;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final HashSet<K> observed;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@fg.l Iterator<? extends T> it, @fg.l ld.l<? super T, ? extends K> lVar) {
        l0.p(it, ProtectedSandApp.s("苞\u0001"));
        l0.p(lVar, ProtectedSandApp.s("苟\u0001"));
        this.source = it;
        this.keySelector = lVar;
        this.observed = new HashSet<>();
    }

    @Override // kotlin.collections.b
    protected void b() {
        while (this.source.hasNext()) {
            T next = this.source.next();
            if (this.observed.add(this.keySelector.invoke(next))) {
                d(next);
                return;
            }
        }
        c();
    }
}
