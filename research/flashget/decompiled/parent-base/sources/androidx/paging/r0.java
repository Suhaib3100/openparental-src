package androidx.paging;

import androidx.paging.e0;
import androidx.paging.l0;
import androidx.paging.w1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PagePresenter.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0013\b\u0000\u0018\u0000 :*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002D0B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\"J#\u0010*\u001a\u00020\n2\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b*\u0010+J\r\u0010-\u001a\u00020,¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020/2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b0\u00101R \u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00103R$\u00109\u001a\u00020\b2\u0006\u00105\u001a\u00020\b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108R$\u0010;\u001a\u00020\b2\u0006\u00105\u001a\u00020\b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b:\u00108R$\u0010=\u001a\u00020\b2\u0006\u00105\u001a\u00020\b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001c\u00107\u001a\u0004\b<\u00108R\u0014\u0010?\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u00108R\u0014\u0010A\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u00108R\u0014\u0010C\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u00108¨\u0006E"}, d2 = {"Landroidx/paging/r0;", "", "T", "Landroidx/paging/k0;", "Landroidx/paging/l0$b;", "insertEvent", "<init>", "(Landroidx/paging/l0$b;)V", "", "index", "Lkotlin/k2;", "d", "(I)V", "", "Landroidx/paging/t1;", "h", "(Ljava/util/List;)I", "insert", "Landroidx/paging/r0$b;", "callback", "o", "(Landroidx/paging/l0$b;Landroidx/paging/r0$b;)V", "Lkotlin/ranges/l;", "pageOffsetsToDrop", "g", "(Lkotlin/ranges/l;)I", "Landroidx/paging/l0$a;", "drop", "e", "(Landroidx/paging/l0$a;Landroidx/paging/r0$b;)V", "", "toString", "()Ljava/lang/String;", "k", "(I)Ljava/lang/Object;", "Landroidx/paging/b0;", "q", "()Landroidx/paging/b0;", "localIndex", "j", "Landroidx/paging/l0;", "pageEvent", "p", "(Landroidx/paging/l0;Landroidx/paging/r0$b;)V", "Landroidx/paging/w1$b;", "n", "()Landroidx/paging/w1$b;", "Landroidx/paging/w1$a;", "b", "(I)Landroidx/paging/w1$a;", "", "Ljava/util/List;", "pages", "<set-?>", "c", "I", "()I", "storageCount", "f", "placeholdersBefore", "i", "placeholdersAfter", "l", "originalPageOffsetFirst", "m", "originalPageOffsetLast", "getSize", "size", "a", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class r0<T> implements k0<T> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final r0<Object> f32257g;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<t1<T>> pages;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int storageCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int placeholdersBefore;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int placeholdersAfter;

    /* compiled from: PagePresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0004*\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/paging/r0$a;", "", "<init>", "()V", "T", "Landroidx/paging/r0;", "a", "()Landroidx/paging/r0;", "INITIAL", "Landroidx/paging/r0;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.paging.r0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final <T> r0<T> a() {
            return r0.f32257g;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: PagePresenter.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0007J'\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/paging/r0$b;", "", "", "position", "count", "Lkotlin/k2;", "a", "(II)V", "onInserted", "onRemoved", "Landroidx/paging/g0;", "loadType", "", "fromMediator", "Landroidx/paging/e0;", "loadState", "b", "(Landroidx/paging/g0;ZLandroidx/paging/e0;)V", "Landroidx/paging/f0;", "source", "mediator", "c", "(Landroidx/paging/f0;Landroidx/paging/f0;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface b {
        void a(int position, int count);

        void b(@fg.l g0 loadType, boolean fromMediator, @fg.l e0 loadState);

        void c(@fg.l f0 source, @fg.m f0 mediator);

        void onInserted(int position, int count);

        void onRemoved(int position, int count);
    }

    /* compiled from: PagePresenter.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32262a;

        static {
            int[] iArr = new int[g0.values().length];
            iArr[g0.REFRESH.ordinal()] = 1;
            iArr[g0.PREPEND.ordinal()] = 2;
            iArr[g0.APPEND.ordinal()] = 3;
            f32262a = iArr;
        }
    }

    static {
        l0.b.INSTANCE.getClass();
        f32257g = new r0<>(l0.b.f31828h);
    }

    public r0(@fg.l l0.b<T> insertEvent) {
        kotlin.jvm.internal.l0.p(insertEvent, "insertEvent");
        this.pages = kotlin.collections.w.Y5(insertEvent.r());
        this.storageCount = h(insertEvent.r());
        this.placeholdersBefore = insertEvent.t();
        this.placeholdersAfter = insertEvent.s();
    }

    private final void d(int index) {
        if (index < 0 || index >= getSize()) {
            StringBuilder a5 = androidx.collection.s.a("Index: ", index, ", Size: ");
            a5.append(getSize());
            throw new IndexOutOfBoundsException(a5.toString());
        }
    }

    private final void e(l0.a<T> drop, b callback) {
        int size = getSize();
        g0 m4 = drop.m();
        g0 g0Var = g0.PREPEND;
        if (m4 == g0Var) {
            int i4 = this.placeholdersBefore;
            this.storageCount -= g(new kotlin.ranges.l(drop.o(), drop.n(), 1));
            this.placeholdersBefore = drop.q();
            int size2 = getSize() - size;
            if (size2 > 0) {
                callback.onInserted(0, size2);
            } else if (size2 < 0) {
                callback.onRemoved(0, -size2);
            }
            int max = Math.max(0, i4 + size2);
            int q4 = drop.q() - max;
            if (q4 > 0) {
                callback.a(max, q4);
            }
            e0.c.INSTANCE.getClass();
            callback.b(g0Var, false, e0.c.f31663d);
            return;
        }
        int i5 = this.placeholdersAfter;
        this.storageCount -= g(new kotlin.ranges.l(drop.o(), drop.n(), 1));
        this.placeholdersAfter = drop.q();
        int size3 = getSize() - size;
        if (size3 > 0) {
            callback.onInserted(size, size3);
        } else if (size3 < 0) {
            callback.onRemoved(size + size3, -size3);
        }
        int q5 = drop.q() - (i5 - (size3 < 0 ? Math.min(i5, -size3) : 0));
        if (q5 > 0) {
            callback.a(getSize() - drop.q(), q5);
        }
        g0 g0Var2 = g0.APPEND;
        e0.c.INSTANCE.getClass();
        callback.b(g0Var2, false, e0.c.f31663d);
    }

    private final int g(kotlin.ranges.l pageOffsetsToDrop) {
        Iterator<t1<T>> it = this.pages.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            t1<T> next = it.next();
            int[] k4 = next.k();
            int length = k4.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (pageOffsetsToDrop.r(k4[i5])) {
                    i4 += next.h().size();
                    it.remove();
                    break;
                }
                i5++;
            }
        }
        return i4;
    }

    private final int h(List<t1<T>> list) {
        Iterator<T> it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((t1) it.next()).h().size();
        }
        return i4;
    }

    private final int l() {
        Integer mn = kotlin.collections.l.mn(((t1) kotlin.collections.w.B2(this.pages)).k());
        kotlin.jvm.internal.l0.m(mn);
        return mn.intValue();
    }

    private final int m() {
        Integer Ok = kotlin.collections.l.Ok(((t1) kotlin.collections.w.p3(this.pages)).k());
        kotlin.jvm.internal.l0.m(Ok);
        return Ok.intValue();
    }

    private final void o(l0.b<T> insert, b callback) {
        int h4 = h(insert.r());
        int size = getSize();
        int i4 = c.f32262a[insert.p().ordinal()];
        if (i4 == 1) {
            throw new IllegalArgumentException();
        }
        if (i4 == 2) {
            int min = Math.min(this.placeholdersBefore, h4);
            int i5 = this.placeholdersBefore - min;
            int i6 = h4 - min;
            this.pages.addAll(0, insert.r());
            this.storageCount += h4;
            this.placeholdersBefore = insert.t();
            callback.a(i5, min);
            callback.onInserted(0, i6);
            int size2 = (getSize() - size) - i6;
            if (size2 > 0) {
                callback.onInserted(0, size2);
            } else if (size2 < 0) {
                callback.onRemoved(0, -size2);
            }
        } else if (i4 == 3) {
            int min2 = Math.min(this.placeholdersAfter, h4);
            int i7 = this.placeholdersBefore + this.storageCount;
            int i10 = h4 - min2;
            List<t1<T>> list = this.pages;
            list.addAll(list.size(), insert.r());
            this.storageCount += h4;
            this.placeholdersAfter = insert.s();
            callback.a(i7, min2);
            callback.onInserted(i7 + min2, i10);
            int size3 = (getSize() - size) - i10;
            if (size3 > 0) {
                callback.onInserted(getSize() - size3, size3);
            } else if (size3 < 0) {
                callback.onRemoved(getSize(), -size3);
            }
        }
        callback.c(insert.u(), insert.q());
    }

    @fg.l
    public final w1.a b(int index) {
        int i4 = 0;
        int i5 = index - this.placeholdersBefore;
        while (i5 >= this.pages.get(i4).h().size() && i4 < kotlin.collections.w.J(this.pages)) {
            i5 -= this.pages.get(i4).h().size();
            i4++;
        }
        return this.pages.get(i4).l(i5, index - this.placeholdersBefore, ((getSize() - index) - this.placeholdersAfter) - 1, l(), m());
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

    @Override // androidx.paging.k0
    public int getSize() {
        return this.placeholdersBefore + this.storageCount + this.placeholdersAfter;
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
            int size2 = this.pages.get(i4).h().size();
            if (size2 > localIndex) {
                break;
            }
            localIndex -= size2;
            i4++;
        }
        return this.pages.get(i4).h().get(localIndex);
    }

    @fg.m
    public final T k(int index) {
        d(index);
        int i4 = index - this.placeholdersBefore;
        if (i4 < 0 || i4 >= this.storageCount) {
            return null;
        }
        return j(i4);
    }

    @fg.l
    public final w1.b n() {
        int i4 = this.storageCount / 2;
        return new w1.b(i4, i4, l(), m(), null);
    }

    public final void p(@fg.l l0<T> pageEvent, @fg.l b callback) {
        kotlin.jvm.internal.l0.p(pageEvent, "pageEvent");
        kotlin.jvm.internal.l0.p(callback, "callback");
        if (pageEvent instanceof l0.b) {
            o((l0.b) pageEvent, callback);
            return;
        }
        if (pageEvent instanceof l0.a) {
            e((l0.a) pageEvent, callback);
        } else if (pageEvent instanceof l0.c) {
            l0.c cVar = (l0.c) pageEvent;
            callback.c(cVar.l(), cVar.k());
        }
    }

    @fg.l
    public final b0<T> q() {
        int i4 = this.placeholdersBefore;
        int i5 = this.placeholdersAfter;
        List<t1<T>> list = this.pages;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.w.q0(arrayList, ((t1) it.next()).h());
        }
        return new b0<>(i4, i5, arrayList);
    }

    @fg.l
    public String toString() {
        int i4 = this.storageCount;
        ArrayList arrayList = new ArrayList(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            arrayList.add(j(i5));
        }
        String m32 = kotlin.collections.w.m3(arrayList, null, null, null, 0, null, null, 63, null);
        StringBuilder sb = new StringBuilder("[(");
        androidx.compose.runtime.changelist.c.a(sb, this.placeholdersBefore, " placeholders), ", m32, ", (");
        return android.support.v4.media.b.a(sb, this.placeholdersAfter, " placeholders)]");
    }
}
