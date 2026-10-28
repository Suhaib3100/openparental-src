package androidx.paging;

import androidx.annotation.c1;
import androidx.paging.b1;
import androidx.paging.c0;
import androidx.paging.s0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PagedStorage.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b$\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005:\u0001dB\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0010\u0010\u000b\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\rB\u0017\b\u0012\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0006\u0010\u000fJA\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0010\u0010\u000b\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015Jb\u0010\u001d\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00162\u0006\u0010\u0017\u001a\u00020\b2B\b\u0004\u0010\u001c\u001a<\u0012\u001d\u0012\u001b\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00028\u00010\u0018H\u0082\b¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\"\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b$\u0010%JK\u0010(\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0010\u0010\u000b\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010+J!\u0010/\u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0000\u0018\u00010.2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u0004\u0018\u00018\u00002\u0006\u00101\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b2\u0010+J\u001d\u00103\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b¢\u0006\u0004\b3\u00104J\u001d\u00105\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b¢\u0006\u0004\b5\u00104J%\u00107\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u00106\u001a\u00020\b¢\u0006\u0004\b7\u0010#J/\u00109\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b9\u0010:J/\u0010\u0002\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b\u0002\u0010:J-\u0010;\u001a\u00020\u00132\u0010\u0010\u000b\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0004\b;\u0010<J-\u0010=\u001a\u00020\u00132\u0010\u0010\u000b\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0004\b=\u0010<J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@R$\u0010D\u001a\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR$\u0010I\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bF\u00103\u001a\u0004\bG\u0010HR$\u0010L\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bJ\u00103\u001a\u0004\bK\u0010HR$\u0010\u0010\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bM\u00103\u001a\u0004\bN\u0010HR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010OR$\u0010Q\u001a\u00020\b2\u0006\u0010E\u001a\u00020\b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bP\u00103\u001a\u0004\bF\u0010HR\u0016\u0010S\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u00103R\u0014\u0010V\u001a\u00028\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00028\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bW\u0010UR$\u0010]\u001a\u00020\b2\u0006\u0010Y\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010H\"\u0004\b[\u0010\\R\u0011\u0010_\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b^\u0010HR\u0016\u0010`\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010UR\u0016\u0010a\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010UR\u0014\u0010c\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010H¨\u0006e"}, d2 = {"Landroidx/paging/v0;", "", "T", "Ljava/util/AbstractList;", "Landroidx/paging/c0$a;", "Landroidx/paging/k0;", "<init>", "()V", "", "leadingNulls", "Landroidx/paging/b1$b$c;", "page", "trailingNulls", "(ILandroidx/paging/b1$b$c;I)V", "other", "(Landroidx/paging/v0;)V", "positionOffset", "", "counted", "Lkotlin/k2;", "D", "(ILandroidx/paging/b1$b$c;IIZ)V", "V", "localIndex", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "pageInternalIndex", "onLastPage", "S", "(ILld/p;)Ljava/lang/Object;", "maxSize", "requiredRemaining", "localPageIndex", "G", "(III)Z", "R", "()Landroidx/paging/v0;", "Landroidx/paging/v0$a;", "callback", "A", "(ILandroidx/paging/b1$b$c;IILandroidx/paging/v0$a;Z)V", "j", "(I)Ljava/lang/Object;", "Landroidx/paging/s0$e;", "config", "Landroidx/paging/d1;", "x", "(Landroidx/paging/s0$e;)Landroidx/paging/d1;", "index", "get", "I", "(II)Z", "H", "countToBeAdded", "Q", "insertNulls", "U", "(ZIILandroidx/paging/v0$a;)Z", "K", "(Landroidx/paging/b1$b$c;Landroidx/paging/v0$a;)V", "m", "", "toString", "()Ljava/lang/String;", "", "b", "Ljava/util/List;", "pages", "<set-?>", "c", "f", "()I", "placeholdersBefore", "d", "i", "placeholdersAfter", "e", "w", "Z", "g", "storageCount", "h", "lastLoadAroundLocalIndex", "q", "()Ljava/lang/Object;", "firstLoadedItem", "s", "lastLoadedItem", "value", "r", "P", "(I)V", "lastLoadAroundIndex", "v", "middleOfLoadedRange", "prevKey", "nextKey", "getSize", "size", "a", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class v0<T> extends AbstractList<T> implements c0.a<Object>, k0<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<b1.b.c<?, T>> pages;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int placeholdersBefore;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int placeholdersAfter;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int positionOffset;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean counted;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int storageCount;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int lastLoadAroundLocalIndex;

    /* compiled from: PagedStorage.kt */
    @androidx.annotation.c1({c1.a.LIBRARY})
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/paging/v0$a;", "", "", "count", "Lkotlin/k2;", "j", "(I)V", "leadingNulls", "changed", "added", "h", "(III)V", "endPosition", "f", "startOfDrops", "c", "(II)V", "b", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface a {
        void b(int startOfDrops, int count);

        void c(int startOfDrops, int count);

        void f(int endPosition, int changed, int added);

        void h(int leadingNulls, int changed, int added);

        void j(int count);
    }

    public v0() {
        this.pages = new ArrayList();
        this.counted = true;
    }

    private final void D(int leadingNulls, b1.b.c<?, T> page, int trailingNulls, int positionOffset, boolean counted) {
        this.placeholdersBefore = leadingNulls;
        this.pages.clear();
        this.pages.add(page);
        this.placeholdersAfter = trailingNulls;
        this.positionOffset = positionOffset;
        this.storageCount = page.i().size();
        this.counted = counted;
        this.lastLoadAroundLocalIndex = page.i().size() / 2;
    }

    public static /* synthetic */ void F(v0 v0Var, int i4, b1.b.c cVar, int i5, int i6, a aVar, boolean z4, int i7, Object obj) {
        if ((i7 & 32) != 0) {
            z4 = true;
        }
        v0Var.A(i4, cVar, i5, i6, aVar, z4);
    }

    private final boolean G(int maxSize, int requiredRemaining, int localPageIndex) {
        return this.storageCount > maxSize && this.pages.size() > 2 && this.storageCount - this.pages.get(localPageIndex).i().size() >= requiredRemaining;
    }

    public static /* synthetic */ void L(v0 v0Var, b1.b.c cVar, a aVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            aVar = null;
        }
        v0Var.K(cVar, aVar);
    }

    private final <V> V S(int localIndex, ld.p<? super b1.b.c<?, T>, ? super Integer, ? extends V> onLastPage) {
        int size = this.pages.size();
        int i4 = 0;
        while (i4 < size) {
            int size2 = this.pages.get(i4).i().size();
            if (size2 > localIndex) {
                break;
            }
            localIndex -= size2;
            i4++;
        }
        return onLastPage.invoke(this.pages.get(i4), Integer.valueOf(localIndex));
    }

    public static /* synthetic */ void p(v0 v0Var, b1.b.c cVar, a aVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            aVar = null;
        }
        v0Var.m(cVar, aVar);
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    public final void A(int leadingNulls, @fg.l b1.b.c<?, T> page, int trailingNulls, int positionOffset, @fg.l a callback, boolean counted) {
        kotlin.jvm.internal.l0.p(page, "page");
        kotlin.jvm.internal.l0.p(callback, "callback");
        D(leadingNulls, page, trailingNulls, positionOffset, counted);
        callback.j(getSize());
    }

    public final boolean H(int maxSize, int requiredRemaining) {
        return G(maxSize, requiredRemaining, this.pages.size() - 1);
    }

    public final boolean I(int maxSize, int requiredRemaining) {
        return G(maxSize, requiredRemaining, 0);
    }

    public final void K(@fg.l b1.b.c<?, T> page, @fg.m a callback) {
        kotlin.jvm.internal.l0.p(page, "page");
        int size = page.i().size();
        if (size == 0) {
            return;
        }
        this.pages.add(0, page);
        this.storageCount += size;
        int min = Math.min(this.placeholdersBefore, size);
        int i4 = size - min;
        if (min != 0) {
            this.placeholdersBefore -= min;
        }
        this.positionOffset -= i4;
        if (callback == null) {
            return;
        }
        callback.h(this.placeholdersBefore, min, i4);
    }

    public /* bridge */ Object O(int i4) {
        return super.remove(i4);
    }

    public final void P(int i4) {
        this.lastLoadAroundLocalIndex = kotlin.ranges.s.I(i4 - this.placeholdersBefore, 0, this.storageCount - 1);
    }

    public final boolean Q(int maxSize, int requiredRemaining, int countToBeAdded) {
        return this.storageCount + countToBeAdded > maxSize && this.pages.size() > 1 && this.storageCount >= requiredRemaining;
    }

    @fg.l
    public final v0<T> R() {
        return new v0<>(this);
    }

    public final boolean T(boolean insertNulls, int maxSize, int requiredRemaining, @fg.l a callback) {
        kotlin.jvm.internal.l0.p(callback, "callback");
        int i4 = 0;
        while (H(maxSize, requiredRemaining)) {
            List<b1.b.c<?, T>> list = this.pages;
            int size = list.remove(list.size() - 1).i().size();
            i4 += size;
            this.storageCount -= size;
        }
        int i5 = this.lastLoadAroundLocalIndex;
        int i6 = this.storageCount;
        int i7 = i6 - 1;
        if (i5 > i7) {
            i5 = i7;
        }
        this.lastLoadAroundLocalIndex = i5;
        if (i4 > 0) {
            int i10 = this.placeholdersBefore + i6;
            if (insertNulls) {
                this.placeholdersAfter += i4;
                callback.b(i10, i4);
            } else {
                callback.c(i10, i4);
            }
        }
        return i4 > 0;
    }

    public final boolean U(boolean insertNulls, int maxSize, int requiredRemaining, @fg.l a callback) {
        kotlin.jvm.internal.l0.p(callback, "callback");
        int i4 = 0;
        while (G(maxSize, requiredRemaining, 0)) {
            int size = this.pages.remove(0).i().size();
            i4 += size;
            this.storageCount -= size;
        }
        int i5 = this.lastLoadAroundLocalIndex - i4;
        if (i5 < 0) {
            i5 = 0;
        }
        this.lastLoadAroundLocalIndex = i5;
        if (i4 > 0) {
            if (insertNulls) {
                int i6 = this.placeholdersBefore;
                this.placeholdersBefore = i6 + i4;
                callback.b(i6, i4);
            } else {
                this.positionOffset += i4;
                callback.c(this.placeholdersBefore, i4);
            }
        }
        return i4 > 0;
    }

    @Override // androidx.paging.c0.a
    @fg.m
    public Object b() {
        if (!this.counted || this.placeholdersAfter > 0) {
            return ((b1.b.c) kotlin.collections.w.p3(this.pages)).l();
        }
        return null;
    }

    @Override // androidx.paging.k0
    /* renamed from: c, reason: from getter */
    public int getStorageCount() {
        return this.storageCount;
    }

    @Override // androidx.paging.k0
    /* renamed from: f, reason: from getter */
    public int getPlaceholdersBefore() {
        return this.placeholdersBefore;
    }

    @Override // java.util.AbstractList, java.util.List
    @fg.m
    public T get(int index) {
        int i4 = index - this.placeholdersBefore;
        if (index < 0 || index >= getSize()) {
            StringBuilder a5 = androidx.collection.s.a("Index: ", index, ", Size: ");
            a5.append(getSize());
            throw new IndexOutOfBoundsException(a5.toString());
        }
        if (i4 < 0 || i4 >= this.storageCount) {
            return null;
        }
        return j(i4);
    }

    @Override // androidx.paging.k0
    public int getSize() {
        return this.placeholdersBefore + this.storageCount + this.placeholdersAfter;
    }

    @Override // androidx.paging.c0.a
    @fg.m
    public Object h() {
        if (!this.counted || this.placeholdersBefore + this.positionOffset > 0) {
            return ((b1.b.c) kotlin.collections.w.B2(this.pages)).m();
        }
        return null;
    }

    @Override // androidx.paging.k0
    /* renamed from: i, reason: from getter */
    public int getPlaceholdersAfter() {
        return this.placeholdersAfter;
    }

    @Override // androidx.paging.k0
    @fg.l
    public T j(int localIndex) {
        int size = this.pages.size();
        int i4 = 0;
        while (i4 < size) {
            int size2 = this.pages.get(i4).i().size();
            if (size2 > localIndex) {
                break;
            }
            localIndex -= size2;
            i4++;
        }
        return this.pages.get(i4).i().get(localIndex);
    }

    public final void m(@fg.l b1.b.c<?, T> page, @fg.m a callback) {
        kotlin.jvm.internal.l0.p(page, "page");
        int size = page.i().size();
        if (size == 0) {
            return;
        }
        this.pages.add(page);
        this.storageCount += size;
        int min = Math.min(this.placeholdersAfter, size);
        int i4 = size - min;
        if (min != 0) {
            this.placeholdersAfter -= min;
        }
        if (callback == null) {
            return;
        }
        callback.f((this.placeholdersBefore + this.storageCount) - size, min, i4);
    }

    @fg.l
    public final T q() {
        return (T) kotlin.collections.w.B2(((b1.b.c) kotlin.collections.w.B2(this.pages)).i());
    }

    public final int r() {
        return this.placeholdersBefore + this.lastLoadAroundLocalIndex;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i4) {
        return (T) super.remove(i4);
    }

    @fg.l
    public final T s() {
        return (T) kotlin.collections.w.p3(((b1.b.c) kotlin.collections.w.p3(this.pages)).i());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.AbstractCollection
    @fg.l
    public String toString() {
        return "leading " + this.placeholdersBefore + ", storage " + this.storageCount + ", trailing " + this.placeholdersAfter + ' ' + kotlin.collections.w.m3(this.pages, " ", null, null, 0, null, null, 62, null);
    }

    public final int v() {
        return (this.storageCount / 2) + this.placeholdersBefore;
    }

    /* renamed from: w, reason: from getter */
    public final int getPositionOffset() {
        return this.positionOffset;
    }

    @fg.m
    public final d1<?, T> x(@fg.l s0.e config) {
        kotlin.jvm.internal.l0.p(config, "config");
        if (this.pages.isEmpty()) {
            return null;
        }
        return new d1<>(kotlin.collections.w.V5(this.pages), Integer.valueOf(r()), new x0(config.pageSize, config.prefetchDistance, config.enablePlaceholders, config.initialLoadSizeHint, config.maxSize, 0, 32, null), this.placeholdersBefore);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v0(int i4, @fg.l b1.b.c<?, T> page, int i5) {
        this();
        kotlin.jvm.internal.l0.p(page, "page");
        D(i4, page, i5, 0, true);
    }

    private v0(v0<T> v0Var) {
        ArrayList arrayList = new ArrayList();
        this.pages = arrayList;
        this.counted = true;
        arrayList.addAll(v0Var.pages);
        this.placeholdersBefore = v0Var.placeholdersBefore;
        this.placeholdersAfter = v0Var.placeholdersAfter;
        this.positionOffset = v0Var.positionOffset;
        this.counted = v0Var.counted;
        this.storageCount = v0Var.storageCount;
        this.lastLoadAroundLocalIndex = v0Var.lastLoadAroundLocalIndex;
    }
}
