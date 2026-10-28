package androidx.paging;

import java.util.List;
import kotlin.Metadata;

/* compiled from: ItemSnapshotList.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002B)\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u0018"}, d2 = {"Landroidx/paging/b0;", "T", "Lkotlin/collections/c;", "", "placeholdersBefore", "placeholdersAfter", "", "items", "<init>", "(IILjava/util/List;)V", "index", "get", "(I)Ljava/lang/Object;", "d", "I", "h", "()I", "e", "f", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "size", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class b0<T> extends kotlin.collections.c<T> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int placeholdersBefore;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int placeholdersAfter;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<T> items;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(@androidx.annotation.g0(from = 0) int i4, @androidx.annotation.g0(from = 0) int i5, @fg.l List<? extends T> items) {
        kotlin.jvm.internal.l0.p(items, "items");
        this.placeholdersBefore = i4;
        this.placeholdersAfter = i5;
        this.items = items;
    }

    @Override // kotlin.collections.c, kotlin.collections.a
    /* renamed from: b */
    public int get_size() {
        return this.items.size() + this.placeholdersBefore + this.placeholdersAfter;
    }

    @fg.l
    public final List<T> c() {
        return this.items;
    }

    /* renamed from: f, reason: from getter */
    public final int getPlaceholdersAfter() {
        return this.placeholdersAfter;
    }

    @Override // kotlin.collections.c, java.util.List
    @fg.m
    public T get(int index) {
        if (index >= 0 && index < this.placeholdersBefore) {
            return null;
        }
        int i4 = this.placeholdersBefore;
        if (index < this.items.size() + i4 && i4 <= index) {
            return this.items.get(index - this.placeholdersBefore);
        }
        int size = this.items.size() + this.placeholdersBefore;
        if (index < get_size() && size <= index) {
            return null;
        }
        StringBuilder a5 = androidx.collection.s.a("Illegal attempt to access index ", index, " in ItemSnapshotList of size ");
        a5.append(get_size());
        throw new IndexOutOfBoundsException(a5.toString());
    }

    /* renamed from: h, reason: from getter */
    public final int getPlaceholdersBefore() {
        return this.placeholdersBefore;
    }
}
