package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: Iterators.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkotlin/collections/t0;", "T", "", "Lkotlin/collections/r0;", "iterator", "<init>", "(Ljava/util/Iterator;)V", "", "hasNext", "()Z", "b", "()Lkotlin/collections/r0;", "Ljava/util/Iterator;", "", "c", "I", "index", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class t0<T> implements Iterator<r0<? extends T>>, md.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Iterator<T> iterator;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX WARN: Multi-variable type inference failed */
    public t0(@fg.l Iterator<? extends T> it) {
        kotlin.jvm.internal.l0.p(it, ProtectedSandApp.s("我\u0001"));
        this.iterator = it;
    }

    @Override // java.util.Iterator
    @fg.l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final r0<T> next() {
        int i4 = this.index;
        this.index = i4 + 1;
        if (i4 < 0) {
            y.Z();
        }
        return new r0<>(i4, this.iterator.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("戒\u0001"));
    }
}
