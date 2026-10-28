package kotlin.reflect.jvm.internal.impl.builtins.functions;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.IndexedValue;
import kotlin.collections.b0;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.p;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.q1;
import kotlin.reflect.jvm.internal.impl.types.x1;
import kotlin.reflect.jvm.internal.impl.util.q;

/* compiled from: FunctionInvokeDescriptor.kt */
/* loaded from: classes6.dex */
public final class e extends g0 {

    @d5.d
    public static final a S = new a(null);

    /* compiled from: FunctionInvokeDescriptor.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        private final j1 b(e eVar, int i5, f1 f1Var) {
            String lowerCase;
            String h5 = f1Var.getName().h();
            l0.o(h5, ProtectedSandApp.s("䓀"));
            if (l0.g(h5, ProtectedSandApp.s("䓁"))) {
                lowerCase = ProtectedSandApp.s("䓂");
            } else if (l0.g(h5, ProtectedSandApp.s("䓃"))) {
                lowerCase = ProtectedSandApp.s("䓄");
            } else {
                lowerCase = h5.toLowerCase(Locale.ROOT);
                l0.o(lowerCase, ProtectedSandApp.s("䓅"));
            }
            g b6 = g.f24114e.b();
            f p5 = f.p(lowerCase);
            l0.o(p5, ProtectedSandApp.s("䓆"));
            p0 E = f1Var.E();
            l0.o(E, ProtectedSandApp.s("䓇"));
            a1 a1Var = a1.f24103a;
            l0.o(a1Var, ProtectedSandApp.s("䓈"));
            return new kotlin.reflect.jvm.internal.impl.descriptors.impl.l0(eVar, null, i5, b6, p5, E, false, false, false, null, a1Var);
        }

        @d5.d
        public final e a(@d5.d b bVar, boolean z5) {
            Iterable<IndexedValue> h6;
            int b02;
            Object p32;
            l0.p(bVar, ProtectedSandApp.s("䓉"));
            List<f1> G = bVar.G();
            e eVar = new e(bVar, null, b.a.DECLARATION, z5, null);
            x0 Q0 = bVar.Q0();
            EmptyList emptyList = EmptyList.f23167o;
            ArrayList arrayList = new ArrayList();
            for (Object obj : G) {
                if (!(((f1) obj).z() == x1.IN_VARIANCE)) {
                    break;
                }
                arrayList.add(obj);
            }
            h6 = j0.h6(arrayList);
            b02 = b0.b0(h6, 10);
            ArrayList arrayList2 = new ArrayList(b02);
            for (IndexedValue indexedValue : h6) {
                arrayList2.add(e.S.b(eVar, indexedValue.e(), (f1) indexedValue.f()));
            }
            p32 = j0.p3(G);
            eVar.Y0(null, Q0, emptyList, emptyList, arrayList2, ((f1) p32).E(), e0.ABSTRACT, t.f24440e);
            eVar.g1(true);
            return eVar;
        }

        public a(w wVar) {
        }
    }

    public /* synthetic */ e(m mVar, e eVar, b.a aVar, boolean z5, w wVar) {
        this(mVar, eVar, aVar, z5);
    }

    private final z w1(List<f> list) {
        int b02;
        f fVar;
        List<Pair> i6;
        boolean z5;
        int size = n().size() - list.size();
        boolean z6 = true;
        String s5 = ProtectedSandApp.s("胉");
        if (size == 0) {
            List<j1> n5 = n();
            l0.o(n5, s5);
            i6 = j0.i6(list, n5);
            if (!(i6 instanceof Collection) || !i6.isEmpty()) {
                for (Pair pair : i6) {
                    if (!l0.g((f) pair.a(), ((j1) pair.b()).getName())) {
                        z5 = false;
                        break;
                    }
                }
            }
            z5 = true;
            if (z5) {
                return this;
            }
        }
        List<j1> n6 = n();
        l0.o(n6, s5);
        b02 = b0.b0(n6, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (j1 j1Var : n6) {
            f name = j1Var.getName();
            l0.o(name, ProtectedSandApp.s("胊"));
            int index = j1Var.getIndex();
            int i5 = index - size;
            if (i5 >= 0 && (fVar = list.get(i5)) != null) {
                name = fVar;
            }
            arrayList.add(j1Var.O0(this, name, index));
        }
        p.c Z0 = Z0(q1.f26523b);
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((f) it.next()) == null) {
                    break;
                }
            }
        }
        z6 = false;
        p.c g5 = Z0.G(z6).b(arrayList).g(a());
        l0.o(g5, ProtectedSandApp.s("胋"));
        z T0 = super.T0(g5);
        l0.m(T0);
        return T0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.g0, kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    @d5.d
    protected p S0(@d5.d m mVar, @d5.e z zVar, @d5.d b.a aVar, @d5.e f fVar, @d5.d g gVar, @d5.d a1 a1Var) {
        l0.p(mVar, ProtectedSandApp.s("背"));
        l0.p(aVar, ProtectedSandApp.s("胍"));
        l0.p(gVar, ProtectedSandApp.s("胎"));
        l0.p(a1Var, ProtectedSandApp.s("胏"));
        return new e(mVar, (e) zVar, aVar, o());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p
    @d5.e
    protected z T0(@d5.d p.c cVar) {
        int b02;
        l0.p(cVar, ProtectedSandApp.s("胐"));
        e eVar = (e) super.T0(cVar);
        if (eVar == null) {
            return null;
        }
        List<j1> n5 = eVar.n();
        String s5 = ProtectedSandApp.s("胑");
        l0.o(n5, s5);
        boolean z5 = n5 instanceof Collection;
        String s6 = ProtectedSandApp.s("胒");
        boolean z6 = true;
        if (!z5 || !n5.isEmpty()) {
            Iterator<T> it = n5.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                h0 type = ((j1) it.next()).getType();
                l0.o(type, s6);
                if (kotlin.reflect.jvm.internal.impl.builtins.g.d(type) != null) {
                    z6 = false;
                    break;
                }
            }
        }
        if (z6) {
            return eVar;
        }
        List<j1> n6 = eVar.n();
        l0.o(n6, s5);
        b02 = b0.b0(n6, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it2 = n6.iterator();
        while (it2.hasNext()) {
            h0 type2 = ((j1) it2.next()).getType();
            l0.o(type2, s6);
            arrayList.add(kotlin.reflect.jvm.internal.impl.builtins.g.d(type2));
        }
        return eVar.w1(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean X() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.z
    public boolean p() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.p, kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean q() {
        return false;
    }

    private e(m mVar, e eVar, b.a aVar, boolean z5) {
        super(mVar, eVar, g.f24114e.b(), q.f26619i, aVar, a1.f24103a);
        m1(true);
        o1(z5);
        f1(false);
    }
}
