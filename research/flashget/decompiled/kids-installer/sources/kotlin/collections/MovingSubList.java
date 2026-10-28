package kotlin.collections;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;

/* compiled from: SlidingWindow.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\tH\u0096\u0002¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lkotlin/collections/MovingSubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "list", "", "(Ljava/util/List;)V", "_size", "", "fromIndex", "size", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "move", "", "toIndex", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.collections.i1, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public final class MovingSubList<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final List<E> f23145q;

    /* renamed from: r, reason: collision with root package name */
    private int f23146r;

    /* renamed from: s, reason: collision with root package name */
    private int f23147s;

    /* JADX WARN: Multi-variable type inference failed */
    public MovingSubList(@d5.d List<? extends E> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("洊"));
        this.f23145q = list;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* renamed from: b, reason: from getter */
    public int getF23147s() {
        return this.f23147s;
    }

    public final void f(int i5, int i6) {
        AbstractList.f23126o.d(i5, i6, this.f23145q.size());
        this.f23146r = i5;
        this.f23147s = i6 - i5;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int index) {
        AbstractList.f23126o.b(index, this.f23147s);
        return this.f23145q.get(this.f23146r + index);
    }
}
