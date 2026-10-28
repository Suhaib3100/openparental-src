package androidx.compose.ui.node;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: DepthSortedSet.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\tJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0012\u001a\u00020\n2\u0014\b\u0004\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0010H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR'\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001c0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR$\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00060!j\b\u0012\u0004\u0012\u00020\u0006`\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010&¨\u0006("}, d2 = {"Landroidx/compose/ui/node/m;", "", "", "extraAssertions", "<init>", "(Z)V", "Landroidx/compose/ui/node/h0;", "node", "b", "(Landroidx/compose/ui/node/h0;)Z", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/h0;)V", "h", "f", "()Landroidx/compose/ui/node/h0;", "Lkotlin/Function1;", "block", "g", "(Lld/l;)V", "d", "()Z", "e", "", "toString", "()Ljava/lang/String;", "Z", "", "", "Lkotlin/b0;", "c", "()Ljava/util/Map;", "mapOfOriginalDepth", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "Ljava/util/Comparator;", "DepthComparator", "Landroidx/compose/ui/node/e2;", "Landroidx/compose/ui/node/e2;", "set", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n96#1:186\n1#2:185\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n87#1:186\n*E\n"})
/* loaded from: classes.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final int f19349e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean extraAssertions;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0 mapOfOriginalDepth = kotlin.c0.b(kotlin.f0.NONE, b.f19354b);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Comparator<h0> DepthComparator;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e2<h0> set;

    /* compiled from: DepthSortedSet.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/node/m$a", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/h0;", "Lkotlin/Comparator;", "l1", "l2", "", "a", "(Landroidx/compose/ui/node/h0;Landroidx/compose/ui/node/h0;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Comparator<h0> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(@fg.l h0 l12, @fg.l h0 l22) {
            int t4 = kotlin.jvm.internal.l0.t(l12.getDepth(), l22.getDepth());
            return t4 != 0 ? t4 : kotlin.jvm.internal.l0.t(l12.hashCode(), l22.hashCode());
        }
    }

    /* compiled from: DepthSortedSet.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Landroidx/compose/ui/node/h0;", "", "a", "()Ljava/util/Map;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<Map<h0, Integer>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f19354b = new b(0);

        b() {
            super(0);
        }

        @fg.l
        public final Map<h0, Integer> a() {
            return new LinkedHashMap();
        }

        @Override // ld.a
        public Map<h0, Integer> invoke() {
            return new LinkedHashMap();
        }
    }

    public m(boolean z4) {
        this.extraAssertions = z4;
        a aVar = new a();
        this.DepthComparator = aVar;
        this.set = new e2<>(aVar);
    }

    private final Map<h0, Integer> c() {
        return (Map) this.mapOfOriginalDepth.getValue();
    }

    public final void a(@fg.l h0 node) {
        if (!node.f()) {
            throw new IllegalStateException("DepthSortedSet.add called on an unattached node");
        }
        if (this.extraAssertions) {
            Integer num = c().get(node);
            if (num == null) {
                c().put(node, Integer.valueOf(node.getDepth()));
            } else {
                if (num.intValue() != node.getDepth()) {
                    throw new IllegalStateException("invalid node depth");
                }
            }
        }
        this.set.add(node);
    }

    public final boolean b(@fg.l h0 node) {
        boolean contains = this.set.contains(node);
        if (!this.extraAssertions || contains == c().containsKey(node)) {
            return contains;
        }
        throw new IllegalStateException("inconsistency in TreeSet");
    }

    public final boolean d() {
        return this.set.isEmpty();
    }

    public final boolean e() {
        return !this.set.isEmpty();
    }

    @fg.l
    public final h0 f() {
        h0 first = this.set.first();
        h(first);
        return first;
    }

    public final void g(@fg.l ld.l<? super h0, k2> block) {
        while (!this.set.isEmpty()) {
            block.invoke(f());
        }
    }

    public final boolean h(@fg.l h0 node) {
        if (!node.f()) {
            throw new IllegalStateException("DepthSortedSet.remove called on an unattached node");
        }
        boolean remove = this.set.remove(node);
        if (this.extraAssertions) {
            if (!kotlin.jvm.internal.l0.g(c().remove(node), remove ? Integer.valueOf(node.getDepth()) : null)) {
                throw new IllegalStateException("invalid node depth");
            }
        }
        return remove;
    }

    @fg.l
    public String toString() {
        return this.set.toString();
    }
}
