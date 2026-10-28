package androidx.compose.runtime.external.kotlinx.collections.immutable;

import fg.l;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ImmutableList.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\tJ%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/c;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/b;", "", "fromIndex", "toIndex", "subList", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/c;", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface c<E> extends List<E>, b<E>, md.a {

    /* compiled from: ImmutableList.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/c$a;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/c;", "Lkotlin/collections/c;", "source", "", "fromIndex", "toIndex", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/c;II)V", "index", "get", "(I)Ljava/lang/Object;", "subList", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/c;", "d", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/c;", "e", "I", "f", "g", "_size", "b", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a<E> extends kotlin.collections.c<E> implements c<E> {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @l
        private final c<E> source;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int fromIndex;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final int toIndex;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private int _size;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@l c<? extends E> cVar, int i4, int i5) {
            this.source = cVar;
            this.fromIndex = i4;
            this.toIndex = i5;
            f0.e.c(i4, i5, cVar.size());
            this._size = i5 - i4;
        }

        @Override // kotlin.collections.c, kotlin.collections.a
        /* renamed from: b, reason: from getter */
        public int get_size() {
            return this._size;
        }

        @Override // kotlin.collections.c, java.util.List
        public E get(int index) {
            f0.e.a(index, this._size);
            return this.source.get(this.fromIndex + index);
        }

        @Override // kotlin.collections.c, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.c
        @l
        public c<E> subList(int fromIndex, int toIndex) {
            f0.e.c(fromIndex, toIndex, this._size);
            c<E> cVar = this.source;
            int i4 = this.fromIndex;
            return new a(cVar, fromIndex + i4, i4 + toIndex);
        }
    }

    @Override // java.util.List
    @l
    default c<E> subList(int fromIndex, int toIndex) {
        return new a(this, fromIndex, toIndex);
    }
}
