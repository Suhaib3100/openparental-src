package androidx.compose.material3.carousel;

import androidx.compose.runtime.internal.u;
import fg.l;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.v;
import kotlin.ranges.s;

/* compiled from: Keyline.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b)\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0003¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0096\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001dJ&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010\u0015J\u0015\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020#¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020#¢\u0006\u0004\b*\u0010)J\u0015\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020#¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00022\u0006\u0010+\u001a\u00020#¢\u0006\u0004\b.\u0010-R\u0017\u00102\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u00101R\u0017\u00107\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010:\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b8\u0010%\u001a\u0004\b9\u00101R\u0017\u0010<\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b;\u00106R\u0017\u0010?\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b=\u0010%\u001a\u0004\b>\u00101R\u0017\u0010A\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u00104\u001a\u0004\b@\u00106R\u0017\u0010C\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\bB\u00101R\u0017\u0010E\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u00104\u001a\u0004\bD\u00106R\u0017\u0010H\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010%\u001a\u0004\bG\u00101R\u0017\u0010J\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u00104\u001a\u0004\bI\u00106R\u0014\u0010'\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bK\u00101¨\u0006L"}, d2 = {"Landroidx/compose/material3/carousel/e;", "", "Landroidx/compose/material3/carousel/c;", "keylines", "<init>", "(Ljava/util/List;)V", "element", "", "f", "(Landroidx/compose/material3/carousel/c;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "i", "(I)Landroidx/compose/material3/carousel/c;", "G", "(Landroidx/compose/material3/carousel/c;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "O", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "H", "", "carouselMainAxisSize", "I", "(F)Z", "size", "h", "(F)I", "L", "unadjustedOffset", "r", "(F)Landroidx/compose/material3/carousel/c;", "q", "c", "D", "()I", "pivotIndex", "d", "Landroidx/compose/material3/carousel/c;", "A", "()Landroidx/compose/material3/carousel/c;", "pivot", "e", "p", "firstNonAnchorIndex", "m", "firstNonAnchor", "g", "x", "lastNonAnchorIndex", "w", "lastNonAnchor", "l", "firstFocalIndex", "j", "firstFocal", "k", "v", "lastFocalIndex", "s", "lastFocal", "F", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 0)
@r1({"SMAP\nKeyline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Keyline.kt\nandroidx/compose/material3/carousel/KeylineList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,471:1\n350#2,7:472\n350#2,7:479\n378#2,7:486\n350#2,7:493\n378#2,7:500\n288#2,2:507\n288#2,2:509\n116#3,2:511\n33#3,6:513\n118#3:519\n*S KotlinDebug\n*F\n+ 1 Keyline.kt\nandroidx/compose/material3/carousel/KeylineList\n*L\n70#1:472,7\n79#1:479,7\n91#1:486,7\n103#1:493,7\n116#1:500,7\n164#1:507,2\n178#1:509,2\n201#1:511,2\n201#1:513,6\n201#1:519\n*E\n"})
/* loaded from: classes.dex */
public final class e implements List<c>, md.a {

    /* renamed from: m, reason: collision with root package name */
    public static final int f10311m = 8;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ List<c> f10312b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int pivotIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final c pivot;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int firstNonAnchorIndex;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final c firstNonAnchor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int lastNonAnchorIndex;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    private final c lastNonAnchor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int firstFocalIndex;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @l
    private final c firstFocal;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int lastFocalIndex;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @l
    private final c lastFocal;

    public e(@l List<c> list) {
        int i4;
        int i5;
        this.f10312b = list;
        Iterator<c> it = iterator();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i4 = -1;
            if (!it.hasNext()) {
                i7 = -1;
                break;
            } else if (it.next().p()) {
                break;
            } else {
                i7++;
            }
        }
        this.pivotIndex = i7;
        this.pivot = get(i7);
        Iterator<c> it2 = iterator();
        int i10 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i10 = -1;
                break;
            } else if (!it2.next().n()) {
                break;
            } else {
                i10++;
            }
        }
        this.firstNonAnchorIndex = i10;
        this.firstNonAnchor = get(i10);
        ListIterator<c> listIterator = listIterator(size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i5 = -1;
                break;
            } else if (!listIterator.previous().n()) {
                i5 = listIterator.nextIndex();
                break;
            }
        }
        this.lastNonAnchorIndex = i5;
        this.lastNonAnchor = get(i5);
        Iterator<c> it3 = iterator();
        while (true) {
            if (!it3.hasNext()) {
                i6 = -1;
                break;
            } else if (it3.next().o()) {
                break;
            } else {
                i6++;
            }
        }
        this.firstFocalIndex = i6;
        c cVar = (c) w.W2(this, i6);
        if (cVar == null) {
            throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
        }
        this.firstFocal = cVar;
        ListIterator<c> listIterator2 = listIterator(size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                break;
            } else if (listIterator2.previous().o()) {
                i4 = listIterator2.nextIndex();
                break;
            }
        }
        this.lastFocalIndex = i4;
        c cVar2 = (c) w.W2(this, i4);
        if (cVar2 == null) {
            throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
        }
        this.lastFocal = cVar2;
    }

    @l
    /* renamed from: A, reason: from getter */
    public final c getPivot() {
        return this.pivot;
    }

    /* renamed from: D, reason: from getter */
    public final int getPivotIndex() {
        return this.pivotIndex;
    }

    public int F() {
        return this.f10312b.size();
    }

    public int G(@l c element) {
        return this.f10312b.indexOf(element);
    }

    public final boolean H() {
        return this.firstFocal.k() - (this.firstFocal.l() / ((float) 2)) >= 0.0f && l0.g(this.firstFocal, this.firstNonAnchor);
    }

    public final boolean I(float carouselMainAxisSize) {
        return (this.lastFocal.l() / ((float) 2)) + this.lastFocal.k() <= carouselMainAxisSize && l0.g(this.lastFocal, this.lastNonAnchor);
    }

    public final int L(float size) {
        Integer num;
        Iterator<Integer> it = s.k0(this.firstFocalIndex - 1, 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = it.next();
            if (get(num.intValue()).l() == size) {
                break;
            }
        }
        Integer num2 = num;
        if (num2 != null) {
            return num2.intValue();
        }
        return 0;
    }

    public int O(@l c element) {
        return this.f10312b.lastIndexOf(element);
    }

    public c P(int i4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public c Q(int i4, c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i4, c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i4, Collection<? extends c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void b(int i4, c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean c(c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f10312b.contains((c) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@l Collection<? extends Object> elements) {
        return this.f10312b.containsAll(elements);
    }

    public boolean f(@l c element) {
        return this.f10312b.contains(element);
    }

    public final int h(float size) {
        Integer num;
        Iterator<Integer> it = new kotlin.ranges.l(this.lastFocalIndex, w.J(this), 1).iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = it.next();
            if (get(num.intValue()).l() == size) {
                break;
            }
        }
        Integer num2 = num;
        return num2 != null ? num2.intValue() : w.J(this);
    }

    @Override // java.util.List
    @l
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public c get(int index) {
        return this.f10312b.get(index);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof c)) {
            return -1;
        }
        return this.f10312b.indexOf((c) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f10312b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @l
    public Iterator<c> iterator() {
        return this.f10312b.iterator();
    }

    @l
    /* renamed from: j, reason: from getter */
    public final c getFirstFocal() {
        return this.firstFocal;
    }

    /* renamed from: l, reason: from getter */
    public final int getFirstFocalIndex() {
        return this.firstFocalIndex;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof c)) {
            return -1;
        }
        return this.f10312b.lastIndexOf((c) obj);
    }

    @Override // java.util.List
    @l
    public ListIterator<c> listIterator() {
        return this.f10312b.listIterator();
    }

    @l
    /* renamed from: m, reason: from getter */
    public final c getFirstNonAnchor() {
        return this.firstNonAnchor;
    }

    /* renamed from: p, reason: from getter */
    public final int getFirstNonAnchorIndex() {
        return this.firstNonAnchorIndex;
    }

    @l
    public final c q(float unadjustedOffset) {
        c cVar;
        int size = size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                cVar = null;
                break;
            }
            cVar = get(i4);
            if (cVar.m() >= unadjustedOffset) {
                break;
            }
            i4++;
        }
        c cVar2 = cVar;
        return cVar2 == null ? (c) w.p3(this) : cVar2;
    }

    @l
    public final c r(float unadjustedOffset) {
        int size = this.f10312b.size() - 1;
        if (size >= 0) {
            while (true) {
                int i4 = size - 1;
                c cVar = get(size);
                if (cVar.m() < unadjustedOffset) {
                    return cVar;
                }
                if (i4 < 0) {
                    break;
                }
                size = i4;
            }
        }
        return (c) w.B2(this);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ c remove(int i4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<c> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @l
    /* renamed from: s, reason: from getter */
    public final c getLastFocal() {
        return this.lastFocal;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ c set(int i4, c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f10312b.size();
    }

    @Override // java.util.List
    public void sort(Comparator<? super c> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @l
    public List<c> subList(int fromIndex, int toIndex) {
        return this.f10312b.subList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return v.a(this);
    }

    /* renamed from: v, reason: from getter */
    public final int getLastFocalIndex() {
        return this.lastFocalIndex;
    }

    @l
    /* renamed from: w, reason: from getter */
    public final c getLastNonAnchor() {
        return this.lastNonAnchor;
    }

    /* renamed from: x, reason: from getter */
    public final int getLastNonAnchorIndex() {
        return this.lastNonAnchorIndex;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @l
    public ListIterator<c> listIterator(int index) {
        return this.f10312b.listIterator(index);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) v.b(this, tArr);
    }
}
