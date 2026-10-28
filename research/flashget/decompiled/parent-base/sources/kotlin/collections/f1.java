package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;

/* compiled from: SlidingWindow.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lkotlin/collections/f1;", "E", "Lkotlin/collections/c;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "list", "<init>", "(Ljava/util/List;)V", "", "fromIndex", "toIndex", "Lkotlin/k2;", "c", "(II)V", "index", "get", "(I)Ljava/lang/Object;", "d", "Ljava/util/List;", "e", "I", "f", "_size", "b", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class f1<E> extends c<E> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<E> list;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int fromIndex;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int _size;

    /* JADX WARN: Multi-variable type inference failed */
    public f1(@fg.l List<? extends E> list) {
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("慌\u0001"));
        this.list = list;
    }

    @Override // kotlin.collections.c, kotlin.collections.a
    /* renamed from: b, reason: from getter */
    public int get_size() {
        return this._size;
    }

    public final void c(int fromIndex, int toIndex) {
        c.INSTANCE.d(fromIndex, toIndex, this.list.size());
        this.fromIndex = fromIndex;
        this._size = toIndex - fromIndex;
    }

    @Override // kotlin.collections.c, java.util.List
    public E get(int index) {
        c.INSTANCE.b(index, this._size);
        return this.list.get(this.fromIndex + index);
    }
}
