package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.u;
import kotlin.Metadata;

/* compiled from: PersistentVectorIterator.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B=\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/g;", "T", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/a;", "", "", "root", "tail", "", "index", "size", "trieHeight", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;III)V", "next", "()Ljava/lang/Object;", "previous", "e", "[Ljava/lang/Object;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/k;", "f", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/k;", "trieIterator", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g<T> extends a<T> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f16202g = 8;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final T[] tail;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k<T> trieIterator;

    public g(@fg.l Object[] objArr, @fg.l T[] tArr, int i4, int i5, int i6) {
        super(i4, i5);
        this.tail = tArr;
        int d5 = l.d(i5);
        this.trieIterator = new k<>(objArr, i4 > d5 ? d5 : i4, d5, i6);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public T next() {
        b();
        if (this.trieIterator.hasNext()) {
            f(getIndex() + 1);
            return this.trieIterator.next();
        }
        T[] tArr = this.tail;
        int index = getIndex();
        f(index + 1);
        return tArr[index - this.trieIterator.getSize()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        c();
        if (getIndex() <= this.trieIterator.getSize()) {
            f(getIndex() - 1);
            return this.trieIterator.previous();
        }
        T[] tArr = this.tail;
        f(getIndex() - 1);
        return tArr[getIndex() - this.trieIterator.getSize()];
    }
}
