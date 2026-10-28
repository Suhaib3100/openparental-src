package androidx.compose.ui.node;

import androidx.compose.ui.q;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: HitTestResult.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002I\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0015\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u0004J\u001d\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u001b\u0010\u001aJ\u001e\u0010\u001d\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015H\u0086\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u000b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0018\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010\rJ\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020-H\u0096\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b0\u0010+J\u0015\u00102\u001a\b\u0012\u0004\u0012\u00020\u000201H\u0016¢\u0006\u0004\b2\u00103J\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u0002012\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b2\u00104J%\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00105\u001a\u00020&2\u0006\u00106\u001a\u00020&H\u0016¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u0005¢\u0006\u0004\b9\u0010\u0004R\u001e\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010<R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010\u001dR$\u0010H\u001a\u00020&2\u0006\u0010D\u001a\u00020&8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bE\u0010\u001d\u001a\u0004\bF\u0010G\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"Landroidx/compose/ui/node/t;", "", "Landroidx/compose/ui/q$d;", "<init>", "()V", "Lkotlin/k2;", "G", "Landroidx/compose/ui/node/p;", "p", "()J", "m", "", "s", "()Z", "b", "", "distanceFromEdge", "isInLayer", "A", "(FZ)Z", "node", "Lkotlin/Function0;", "childHitTest", "v", "(Landroidx/compose/ui/q$d;ZLld/a;)V", "w", "(Landroidx/compose/ui/q$d;FZLld/a;)V", "L", "block", "I", "(Lld/a;)V", "element", "l", "(Landroidx/compose/ui/q$d;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "q", "(I)Landroidx/compose/ui/q$d;", "x", "(Landroidx/compose/ui/q$d;)I", "isEmpty", "", "iterator", "()Ljava/util/Iterator;", "D", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "clear", "", "", "[Ljava/lang/Object;", "values", "", "c", "[J", "distanceFromEdgeAndInLayer", "d", "hitDepth", "<set-?>", "e", "r", "()I", "size", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,341:1\n1855#2,2:342\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n195#1:342,2\n*E\n"})
/* loaded from: classes.dex */
public final class t implements List<q.d>, md.a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f19493f = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private Object[] values = new Object[16];

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private long[] distanceFromEdgeAndInLayer = new long[16];

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int hitDepth = -1;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* compiled from: HitTestResult.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0010\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0014\u0010*\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010&¨\u0006+"}, d2 = {"Landroidx/compose/ui/node/t$b;", "", "Landroidx/compose/ui/q$d;", "", "minIndex", "maxIndex", "<init>", "(Landroidx/compose/ui/node/t;II)V", "element", "", "f", "(Landroidx/compose/ui/q$d;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "h", "(I)Landroidx/compose/ui/q$d;", "m", "(Landroidx/compose/ui/q$d;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "p", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "b", "I", "j", "()I", "c", "i", "l", "size", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,341:1\n1855#2,2:342\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n*L\n273#1:342,2\n*E\n"})
    private final class b implements List<q.d>, md.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int minIndex;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int maxIndex;

        public b(int i4, int i5) {
            this.minIndex = i4;
            this.maxIndex = i5;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i4, q.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i4, Collection<? extends q.d> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void b(int i4, q.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean c(q.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof q.d) {
                return f((q.d) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@fg.l Collection<? extends Object> elements) {
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains((q.d) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public boolean f(@fg.l q.d element) {
            return indexOf(element) != -1;
        }

        @Override // java.util.List
        @fg.l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public q.d get(int index) {
            Object obj = t.this.values[index + this.minIndex];
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (q.d) obj;
        }

        /* renamed from: i, reason: from getter */
        public final int getMaxIndex() {
            return this.maxIndex;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof q.d) {
                return m((q.d) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return l() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @fg.l
        public Iterator<q.d> iterator() {
            t tVar = t.this;
            int i4 = this.minIndex;
            return tVar.new a(i4, i4, this.maxIndex);
        }

        /* renamed from: j, reason: from getter */
        public final int getMinIndex() {
            return this.minIndex;
        }

        public int l() {
            return this.maxIndex - this.minIndex;
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof q.d) {
                return p((q.d) obj);
            }
            return -1;
        }

        @Override // java.util.List
        @fg.l
        public ListIterator<q.d> listIterator() {
            t tVar = t.this;
            int i4 = this.minIndex;
            return tVar.new a(i4, i4, this.maxIndex);
        }

        public int m(@fg.l q.d element) {
            int i4 = this.minIndex;
            int i5 = this.maxIndex;
            if (i4 > i5) {
                return -1;
            }
            while (!kotlin.jvm.internal.l0.g(t.this.values[i4], element)) {
                if (i4 == i5) {
                    return -1;
                }
                i4++;
            }
            return i4 - this.minIndex;
        }

        public int p(@fg.l q.d element) {
            int i4 = this.maxIndex;
            int i5 = this.minIndex;
            if (i5 > i4) {
                return -1;
            }
            while (!kotlin.jvm.internal.l0.g(t.this.values[i4], element)) {
                if (i4 == i5) {
                    return -1;
                }
                i4--;
            }
            return i4 - this.minIndex;
        }

        public q.d q(int i4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public q.d r(int i4, q.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ q.d remove(int i4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<q.d> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ q.d set(int i4, q.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return l();
        }

        @Override // java.util.List
        public void sort(Comparator<? super q.d> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        @fg.l
        public List<q.d> subList(int fromIndex, int toIndex) {
            t tVar = t.this;
            int i4 = this.minIndex;
            return tVar.new b(fromIndex + i4, i4 + toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return kotlin.jvm.internal.v.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends q.d> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        @fg.l
        public ListIterator<q.d> listIterator(int index) {
            t tVar = t.this;
            int i4 = this.minIndex;
            return tVar.new a(index + i4, i4, this.maxIndex);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) kotlin.jvm.internal.v.b(this, tArr);
        }
    }

    private final void G() {
        int i4 = this.hitDepth + 1;
        int J = kotlin.collections.w.J(this);
        if (i4 <= J) {
            while (true) {
                this.values[i4] = null;
                if (i4 == J) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        this.size = this.hitDepth + 1;
    }

    private final void m() {
        int i4 = this.hitDepth;
        Object[] objArr = this.values;
        if (i4 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            this.values = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.distanceFromEdgeAndInLayer, length);
            kotlin.jvm.internal.l0.o(copyOf2, "copyOf(this, newSize)");
            this.distanceFromEdgeAndInLayer = copyOf2;
        }
    }

    private final long p() {
        long a5;
        a5 = u.a(Float.POSITIVE_INFINITY, false);
        int i4 = this.hitDepth + 1;
        int J = kotlin.collections.w.J(this);
        if (i4 <= J) {
            while (true) {
                long j4 = this.distanceFromEdgeAndInLayer[i4];
                if (p.b(j4, a5) < 0) {
                    a5 = j4;
                }
                if (p.f(a5) < 0.0f && p.i(a5)) {
                    return a5;
                }
                if (i4 == J) {
                    break;
                }
                i4++;
            }
        }
        return a5;
    }

    public final boolean A(float distanceFromEdge, boolean isInLayer) {
        long a5;
        if (this.hitDepth == kotlin.collections.w.J(this)) {
            return true;
        }
        a5 = u.a(distanceFromEdge, isInLayer);
        return p.b(p(), a5) > 0;
    }

    public int D(@fg.l q.d element) {
        for (int J = kotlin.collections.w.J(this); -1 < J; J--) {
            if (kotlin.jvm.internal.l0.g(this.values[J], element)) {
                return J;
            }
        }
        return -1;
    }

    public q.d F(int i4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public q.d H(int i4, q.d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void I(@fg.l ld.a<k2> block) {
        int i4 = this.hitDepth;
        block.invoke();
        this.hitDepth = i4;
    }

    public final void L(@fg.l q.d node, float distanceFromEdge, boolean isInLayer, @fg.l ld.a<k2> childHitTest) {
        if (this.hitDepth == kotlin.collections.w.J(this)) {
            w(node, distanceFromEdge, isInLayer, childHitTest);
            if (this.hitDepth + 1 == kotlin.collections.w.J(this)) {
                G();
                return;
            }
            return;
        }
        long p4 = p();
        int i4 = this.hitDepth;
        this.hitDepth = kotlin.collections.w.J(this);
        w(node, distanceFromEdge, isInLayer, childHitTest);
        if (this.hitDepth + 1 < kotlin.collections.w.J(this) && p.b(p4, p()) > 0) {
            int i5 = this.hitDepth + 1;
            int i6 = i4 + 1;
            Object[] objArr = this.values;
            kotlin.collections.l.B0(objArr, objArr, i6, i5, this.size);
            long[] jArr = this.distanceFromEdgeAndInLayer;
            kotlin.collections.l.A0(jArr, jArr, i6, i5, this.size);
            this.hitDepth = ((this.size + i4) - this.hitDepth) - 1;
        }
        G();
        this.hitDepth = i4;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i4, q.d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i4, Collection<? extends q.d> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        this.hitDepth = this.size - 1;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        G();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof q.d) {
            return l((q.d) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@fg.l Collection<? extends Object> elements) {
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains((q.d) it.next())) {
                return false;
            }
        }
        return true;
    }

    public void i(int i4, q.d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof q.d) {
            return x((q.d) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @fg.l
    public Iterator<q.d> iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    public boolean j(q.d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean l(@fg.l q.d element) {
        return indexOf(element) != -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof q.d) {
            return D((q.d) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @fg.l
    public ListIterator<q.d> listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    @fg.l
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public q.d get(int index) {
        Object obj = this.values[index];
        kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (q.d) obj;
    }

    /* renamed from: r, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ q.d remove(int i4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<q.d> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean s() {
        long p4 = p();
        return p.f(p4) < 0.0f && p.i(p4);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ q.d set(int i4, q.d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.size;
    }

    @Override // java.util.List
    public void sort(Comparator<? super q.d> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @fg.l
    public List<q.d> subList(int fromIndex, int toIndex) {
        return new b(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.v.a(this);
    }

    public final void v(@fg.l q.d node, boolean isInLayer, @fg.l ld.a<k2> childHitTest) {
        w(node, -1.0f, isInLayer, childHitTest);
    }

    public final void w(@fg.l q.d node, float distanceFromEdge, boolean isInLayer, @fg.l ld.a<k2> childHitTest) {
        long a5;
        int i4 = this.hitDepth;
        this.hitDepth = i4 + 1;
        m();
        Object[] objArr = this.values;
        int i5 = this.hitDepth;
        objArr[i5] = node;
        long[] jArr = this.distanceFromEdgeAndInLayer;
        a5 = u.a(distanceFromEdge, isInLayer);
        jArr[i5] = a5;
        G();
        childHitTest.invoke();
        this.hitDepth = i4;
    }

    public int x(@fg.l q.d element) {
        int J = kotlin.collections.w.J(this);
        if (J < 0) {
            return -1;
        }
        int i4 = 0;
        while (!kotlin.jvm.internal.l0.g(this.values[i4], element)) {
            if (i4 == J) {
                return -1;
            }
            i4++;
        }
        return i4;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends q.d> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @fg.l
    public ListIterator<q.d> listIterator(int index) {
        return new a(this, index, 0, 0, 6, null);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.v.b(this, tArr);
    }

    /* compiled from: HitTestResult.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/node/t$a;", "", "Landroidx/compose/ui/q$d;", "", "index", "minIndex", "maxIndex", "<init>", "(Landroidx/compose/ui/node/t;III)V", "", "hasNext", "()Z", "hasPrevious", "f", "()Landroidx/compose/ui/q$d;", "nextIndex", "()I", "h", "previousIndex", "b", "I", "c", "j", "(I)V", "e", "d", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a implements ListIterator<q.d>, md.a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int minIndex;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int maxIndex;

        public a(int i4, int i5, int i6) {
            this.index = i4;
            this.minIndex = i5;
            this.maxIndex = i6;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(q.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void b(q.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: c, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: d, reason: from getter */
        public final int getMaxIndex() {
            return this.maxIndex;
        }

        /* renamed from: e, reason: from getter */
        public final int getMinIndex() {
            return this.minIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @fg.l
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public q.d next() {
            Object[] objArr = t.this.values;
            int i4 = this.index;
            this.index = i4 + 1;
            Object obj = objArr[i4];
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (q.d) obj;
        }

        @Override // java.util.ListIterator
        @fg.l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public q.d previous() {
            Object[] objArr = t.this.values;
            int i4 = this.index - 1;
            this.index = i4;
            Object obj = objArr[i4];
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (q.d) obj;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.maxIndex;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > this.minIndex;
        }

        public void i(q.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void j(int i4) {
            this.index = i4;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(q.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ a(t tVar, int i4, int i5, int i6, int i7, kotlin.jvm.internal.w wVar) {
            this((i7 & 1) != 0 ? 0 : i4, (i7 & 2) != 0 ? 0 : i5, (i7 & 4) != 0 ? tVar.size() : i6);
        }
    }
}
