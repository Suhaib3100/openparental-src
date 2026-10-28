package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.u;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: TrieIterator.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B/\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0015\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/k;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/a;", "", "", "root", "", "index", "size", "height", "<init>", "([Ljava/lang/Object;III)V", "startLevel", "Lkotlin/k2;", "j", "(II)V", "indexPredicate", "l", "(I)V", "i", "()Ljava/lang/Object;", "m", "next", "previous", "e", "I", "f", "[Ljava/lang/Object;", "path", "", "g", "Z", "isInRightEdge", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k<E> extends a<E> {

    /* renamed from: h, reason: collision with root package name */
    public static final int f16216h = 8;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int height;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private Object[] path;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isInRightEdge;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(@fg.l Object[] objArr, int i4, int i5, int i6) {
        super(i4, i5);
        this.height = i6;
        Object[] objArr2 = new Object[i6];
        this.path = objArr2;
        ?? r5 = i4 == i5 ? 1 : 0;
        this.isInRightEdge = r5;
        objArr2[0] = objArr;
        j(i4 - r5, 1);
    }

    private final E i() {
        int index = getIndex() & 31;
        Object obj = this.path[this.height - 1];
        l0.n(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[index];
    }

    private final void j(int index, int startLevel) {
        int i4 = (this.height - startLevel) * 5;
        while (startLevel < this.height) {
            Object[] objArr = this.path;
            Object obj = objArr[startLevel - 1];
            l0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[startLevel] = ((Object[]) obj)[l.a(index, i4)];
            i4 -= 5;
            startLevel++;
        }
    }

    private final void l(int indexPredicate) {
        int i4 = 0;
        while (l.a(getIndex(), i4) == indexPredicate) {
            i4 += 5;
        }
        if (i4 > 0) {
            j(getIndex(), ((this.height - 1) - (i4 / 5)) + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void m(@fg.l Object[] root, int index, int size, int height) {
        f(index);
        h(size);
        this.height = height;
        if (this.path.length < height) {
            this.path = new Object[height];
        }
        this.path[0] = root;
        ?? r02 = index == size ? 1 : 0;
        this.isInRightEdge = r02;
        j(index - r02, 1);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a, java.util.ListIterator, java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E i4 = i();
        f(getIndex() + 1);
        if (getIndex() == getSize()) {
            this.isInRightEdge = true;
            return i4;
        }
        l(0);
        return i4;
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        f(getIndex() - 1);
        if (this.isInRightEdge) {
            this.isInRightEdge = false;
            return i();
        }
        l(31);
        return i();
    }
}
