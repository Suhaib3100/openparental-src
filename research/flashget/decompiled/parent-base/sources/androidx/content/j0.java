package androidx.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.c1;
import androidx.annotation.d0;
import androidx.collection.c3;
import androidx.collection.e3;
import androidx.content.f0;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.k2;
import kotlin.sequences.p;
import kotlin.text.v;
import kotlin.x0;
import md.a;
import md.d;
import r2.a;

/* compiled from: NavGraph.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0016\u0018\u0000 V2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001WB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u000b2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\u000b2\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001a\"\u00020\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u0004\u0018\u00010\u00012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(J!\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u0010\"\u001a\u00020!2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b)\u0010*J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010+H\u0086\u0002¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0000¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b1\u0010\u0015J\r\u00102\u001a\u00020\u000b¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u001dH\u0007¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u001d¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u00020\u000b2\u0006\u00109\u001a\u00020!¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020!H\u0016¢\u0006\u0004\b<\u0010=J\u001a\u0010?\u001a\u00020%2\b\u0010.\u001a\u0004\u0018\u00010>H\u0096\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u001dH\u0016¢\u0006\u0004\bA\u00105R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010B8G¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0016\u00106\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010\u0011R\u0018\u0010J\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR.\u0010N\u001a\u0004\u0018\u00010!2\b\u00109\u001a\u0004\u0018\u00010!8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010I\u001a\u0004\bL\u0010=\"\u0004\bM\u0010;R$\u0010Q\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001d8G@BX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u00105\"\u0004\bP\u00108R\u0014\u0010S\u001a\u00020!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010=R\u0011\u0010U\u001a\u00020!8G¢\u0006\u0006\u001a\u0004\bT\u0010=¨\u0006X"}, d2 = {"Landroidx/navigation/j0;", "Landroidx/navigation/f0;", "", "Landroidx/navigation/c1;", "navGraphNavigator", "<init>", "(Landroidx/navigation/c1;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Lkotlin/k2;", "L", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/navigation/d0;", "navDeepLinkRequest", "Landroidx/navigation/f0$c;", "I", "(Landroidx/navigation/d0;)Landroidx/navigation/f0$c;", "node", "b0", "(Landroidx/navigation/f0;)V", "", "nodes", "d0", "(Ljava/util/Collection;)V", "", "e0", "([Landroidx/navigation/f0;)V", "", "resId", "f0", "(I)Landroidx/navigation/f0;", "", "route", "h0", "(Ljava/lang/String;)Landroidx/navigation/f0;", "", "searchParents", "g0", "(IZ)Landroidx/navigation/f0;", "i0", "(Ljava/lang/String;Z)Landroidx/navigation/f0;", "", "iterator", "()Ljava/util/Iterator;", "other", "a0", "(Landroidx/navigation/j0;)V", "q0", "clear", "()V", "m0", "()I", "startDestId", "r0", "(I)V", "startDestRoute", "s0", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Landroidx/collection/c3;", "m", "Landroidx/collection/c3;", "k0", "()Landroidx/collection/c3;", "n", "o", "Ljava/lang/String;", "startDestIdName", "p", "p0", "v0", "startDestinationRoute", "n0", "t0", "startDestinationId", "r", "displayName", "l0", "startDestDisplayName", "q", "a", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class j0 extends f0 implements Iterable<f0>, a {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @l
    private final c3<f0> nodes;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int startDestId;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @m
    private String startDestIdName;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @m
    private String startDestinationRoute;

    /* compiled from: NavGraph.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/navigation/j0$a;", "", "<init>", "()V", "Landroidx/navigation/j0;", "Landroidx/navigation/f0;", "a", "(Landroidx/navigation/j0;)Landroidx/navigation/f0;", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.navigation.j0$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: NavGraph.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/f0;", "it", "a", "(Landroidx/navigation/f0;)Landroidx/navigation/f0;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: androidx.navigation.j0$a$a, reason: collision with other inner class name */
        static final class C0517a extends n0 implements ld.l<f0, f0> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0517a f31162b = new C0517a(1);

            C0517a() {
                super(1);
            }

            @Override // ld.l
            @m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f0 invoke(@l f0 it) {
                l0.p(it, "it");
                if (!(it instanceof j0)) {
                    return null;
                }
                j0 j0Var = (j0) it;
                return j0Var.g0(j0Var.n0(), true);
            }
        }

        private Companion() {
        }

        @l
        @n
        public final f0 a(@l j0 j0Var) {
            l0.p(j0Var, "<this>");
            return (f0) p.f1(p.l(j0Var.g0(j0Var.n0(), true), C0517a.f31162b));
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: NavGraph.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"androidx/navigation/j0$b", "", "Landroidx/navigation/f0;", "", "hasNext", "()Z", "b", "()Landroidx/navigation/f0;", "Lkotlin/k2;", "remove", "()V", "", "I", "index", "c", "Z", "wentToNext", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class b implements Iterator<f0>, d {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index = -1;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean wentToNext;

        b() {
        }

        @Override // java.util.Iterator
        @l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f0 next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.wentToNext = true;
            c3<f0> k02 = j0.this.k0();
            int i4 = this.index + 1;
            this.index = i4;
            f0 C = k02.C(i4);
            l0.o(C, "nodes.valueAt(++index)");
            return C;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index + 1 < j0.this.k0().B();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.wentToNext) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            c3<f0> k02 = j0.this.k0();
            k02.C(this.index).W(null);
            k02.v(this.index);
            this.index--;
            this.wentToNext = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(@l c1<? extends j0> navGraphNavigator) {
        super(navGraphNavigator);
        l0.p(navGraphNavigator, "navGraphNavigator");
        this.nodes = new c3<>();
    }

    @l
    @n
    public static final f0 j0(@l j0 j0Var) {
        return INSTANCE.a(j0Var);
    }

    private final void t0(int i4) {
        if (i4 != getId()) {
            if (this.startDestinationRoute != null) {
                v0(null);
            }
            this.startDestId = i4;
            this.startDestIdName = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i4 + " cannot use the same id as the graph " + this).toString());
    }

    private final void v0(String str) {
        int hashCode;
        if (str == null) {
            hashCode = 0;
        } else {
            if (l0.g(str, getRoute())) {
                throw new IllegalArgumentException(("Start destination " + ((Object) str) + " cannot use the same route as the graph " + this).toString());
            }
            if (v.S1(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            hashCode = f0.INSTANCE.a(str).hashCode();
        }
        this.startDestId = hashCode;
        this.startDestinationRoute = str;
    }

    @Override // androidx.content.f0
    @m
    @c1({c1.a.LIBRARY_GROUP})
    public f0.c I(@l d0 navDeepLinkRequest) {
        l0.p(navDeepLinkRequest, "navDeepLinkRequest");
        f0.c I = super.I(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        Iterator<f0> it = iterator();
        while (it.hasNext()) {
            f0.c I2 = it.next().I(navDeepLinkRequest);
            if (I2 != null) {
                arrayList.add(I2);
            }
        }
        return (f0.c) kotlin.collections.w.P3(kotlin.collections.w.Q(I, (f0.c) kotlin.collections.w.P3(arrayList)));
    }

    @Override // androidx.content.f0
    public void L(@l Context context, @l AttributeSet attrs) {
        l0.p(context, "context");
        l0.p(attrs, "attrs");
        super.L(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, a.b.f89741w);
        l0.o(obtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        t0(obtainAttributes.getResourceId(a.b.f89742x, 0));
        this.startDestIdName = f0.INSTANCE.b(context, this.startDestId);
        k2 k2Var = k2.f75408a;
        obtainAttributes.recycle();
    }

    public final void a0(@l j0 other) {
        l0.p(other, "other");
        other.getClass();
        b bVar = other.new b();
        while (bVar.hasNext()) {
            f0 next = bVar.next();
            bVar.remove();
            b0(next);
        }
    }

    public final void b0(@l f0 node) {
        l0.p(node, "node");
        int id2 = node.getId();
        String route = node.getRoute();
        if (id2 == 0 && route == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        if (getRoute() != null && l0.g(route, getRoute())) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (id2 == getId()) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        f0 i4 = this.nodes.i(id2);
        if (i4 == node) {
            return;
        }
        if (node.getParent() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (i4 != null) {
            i4.W(null);
        }
        node.W(this);
        this.nodes.q(node.getId(), node);
    }

    public final void clear() {
        b bVar = new b();
        while (bVar.hasNext()) {
            bVar.next();
            bVar.remove();
        }
    }

    public final void d0(@l Collection<? extends f0> nodes) {
        l0.p(nodes, "nodes");
        for (f0 f0Var : nodes) {
            if (f0Var != null) {
                b0(f0Var);
            }
        }
    }

    public final void e0(@l f0... nodes) {
        l0.p(nodes, "nodes");
        int length = nodes.length;
        int i4 = 0;
        while (i4 < length) {
            f0 f0Var = nodes[i4];
            i4++;
            b0(f0Var);
        }
    }

    @Override // androidx.content.f0
    public boolean equals(@m Object other) {
        if (other == null || !(other instanceof j0)) {
            return false;
        }
        List d32 = p.d3(p.e(e3.k(this.nodes)));
        j0 j0Var = (j0) other;
        Iterator k4 = e3.k(j0Var.nodes);
        while (k4.hasNext()) {
            d32.remove((f0) k4.next());
        }
        return super.equals(other) && this.nodes.B() == j0Var.nodes.B() && this.startDestId == j0Var.startDestId && d32.isEmpty();
    }

    @m
    public final f0 f0(@d0 int resId) {
        return g0(resId, true);
    }

    @m
    @c1({c1.a.LIBRARY_GROUP})
    public final f0 g0(@d0 int resId, boolean searchParents) {
        f0 i4 = this.nodes.i(resId);
        if (i4 != null) {
            return i4;
        }
        if (!searchParents || getParent() == null) {
            return null;
        }
        j0 parent = getParent();
        l0.m(parent);
        return parent.f0(resId);
    }

    @m
    public final f0 h0(@m String route) {
        if (route == null || v.S1(route)) {
            return null;
        }
        return i0(route, true);
    }

    @Override // androidx.content.f0
    public int hashCode() {
        int i4 = this.startDestId;
        c3<f0> c3Var = this.nodes;
        int B = c3Var.B();
        for (int i5 = 0; i5 < B; i5++) {
            i4 = (((i4 * 31) + c3Var.p(i5)) * 31) + c3Var.C(i5).hashCode();
        }
        return i4;
    }

    @m
    @c1({c1.a.LIBRARY_GROUP})
    public final f0 i0(@l String route, boolean searchParents) {
        l0.p(route, "route");
        f0 i4 = this.nodes.i(f0.INSTANCE.a(route).hashCode());
        if (i4 != null) {
            return i4;
        }
        if (!searchParents || getParent() == null) {
            return null;
        }
        j0 parent = getParent();
        l0.m(parent);
        return parent.h0(route);
    }

    @Override // java.lang.Iterable
    @l
    public final Iterator<f0> iterator() {
        return new b();
    }

    @l
    @c1({c1.a.LIBRARY_GROUP})
    public final c3<f0> k0() {
        return this.nodes;
    }

    @l
    @c1({c1.a.LIBRARY_GROUP})
    public final String l0() {
        if (this.startDestIdName == null) {
            String str = this.startDestinationRoute;
            if (str == null) {
                str = String.valueOf(this.startDestId);
            }
            this.startDestIdName = str;
        }
        String str2 = this.startDestIdName;
        l0.m(str2);
        return str2;
    }

    @d0
    @k(message = "Use getStartDestinationId instead.", replaceWith = @x0(expression = "startDestinationId", imports = {}))
    /* renamed from: m0, reason: from getter */
    public final int getStartDestId() {
        return this.startDestId;
    }

    @d0
    public final int n0() {
        return this.startDestId;
    }

    @m
    /* renamed from: p0, reason: from getter */
    public final String getStartDestinationRoute() {
        return this.startDestinationRoute;
    }

    public final void q0(@l f0 node) {
        l0.p(node, "node");
        int m4 = this.nodes.m(node.getId());
        if (m4 >= 0) {
            this.nodes.C(m4).W(null);
            this.nodes.v(m4);
        }
    }

    @Override // androidx.content.f0
    @l
    @c1({c1.a.LIBRARY_GROUP})
    public String r() {
        return getId() != 0 ? super.r() : "the root navigation";
    }

    public final void r0(int startDestId) {
        t0(startDestId);
    }

    public final void s0(@l String startDestRoute) {
        l0.p(startDestRoute, "startDestRoute");
        v0(startDestRoute);
    }

    @Override // androidx.content.f0
    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        f0 h02 = h0(this.startDestinationRoute);
        if (h02 == null) {
            h02 = g0(this.startDestId, true);
        }
        sb.append(" startDestination=");
        if (h02 == null) {
            String str = this.startDestinationRoute;
            if (str != null) {
                sb.append(str);
            } else {
                String str2 = this.startDestIdName;
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append(l0.C("0x", Integer.toHexString(this.startDestId)));
                }
            }
        } else {
            sb.append("{");
            sb.append(h02.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        l0.o(sb2, "sb.toString()");
        return sb2;
    }
}
