package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.j0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.types.b0;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.o0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.text.Typography;
import kotlin.text.h0;
import q3.l;

/* compiled from: RawType.kt */
/* loaded from: classes6.dex */
public final class h extends b0 implements o0 {

    /* compiled from: RawType.kt */
    static final class a extends Lambda implements l<String, CharSequence> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f24806p = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence N(@d5.d String str) {
            l0.p(str, ProtectedSandApp.s("蕪"));
            return ProtectedSandApp.s("蕫") + str;
        }
    }

    private h(p0 p0Var, p0 p0Var2, boolean z5) {
        super(p0Var, p0Var2);
        if (z5) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.types.checker.e.f26341a.d(p0Var, p0Var2);
    }

    private static final boolean h1(String str, String str2) {
        String a42;
        a42 = h0.a4(str2, ProtectedSandApp.s("蕰"));
        return l0.g(str, a42) || l0.g(str2, ProtectedSandApp.s("蕱"));
    }

    private static final List<String> i1(kotlin.reflect.jvm.internal.impl.renderer.c cVar, kotlin.reflect.jvm.internal.impl.types.h0 h0Var) {
        int b02;
        List<l1> S0 = h0Var.S0();
        b02 = kotlin.collections.b0.b0(S0, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = S0.iterator();
        while (it.hasNext()) {
            arrayList.add(cVar.z((l1) it.next()));
        }
        return arrayList;
    }

    private static final String j1(String str, String str2) {
        boolean S2;
        String u5;
        String q5;
        S2 = h0.S2(str, Typography.f27129e, false, 2, null);
        if (!S2) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        u5 = h0.u5(str, Typography.f27129e, null, 2, null);
        sb.append(u5);
        sb.append(Typography.f27129e);
        sb.append(str2);
        sb.append(Typography.f27130f);
        q5 = h0.q5(str, Typography.f27130f, null, 2, null);
        sb.append(q5);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.types.b0, kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h C() {
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = U0().b();
        k1 k1Var = null;
        Object[] objArr = 0;
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) b6 : null;
        if (eVar != null) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h h02 = eVar.h0(new g(k1Var, 1, objArr == true ? 1 : 0));
            l0.o(h02, ProtectedSandApp.s("蕲"));
            return h02;
        }
        throw new IllegalStateException((ProtectedSandApp.s("蕳") + U0().b()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    @d5.d
    public p0 b1() {
        return c1();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    @d5.d
    public String e1(@d5.d kotlin.reflect.jvm.internal.impl.renderer.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
        String m32;
        List i6;
        l0.p(cVar, ProtectedSandApp.s("蕴"));
        l0.p(fVar, ProtectedSandApp.s("蕵"));
        String y5 = cVar.y(c1());
        String y6 = cVar.y(d1());
        if (fVar.p()) {
            return ProtectedSandApp.s("蕶") + y5 + ProtectedSandApp.s("蕷") + y6 + ')';
        }
        if (d1().S0().isEmpty()) {
            return cVar.v(y5, y6, kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(this));
        }
        List<String> i12 = i1(cVar, c1());
        List<String> i13 = i1(cVar, d1());
        m32 = j0.m3(i12, ProtectedSandApp.s("蕸"), null, null, 0, null, a.f24806p, 30, null);
        i6 = j0.i6(i12, i13);
        boolean z5 = true;
        if (!(i6 instanceof Collection) || !i6.isEmpty()) {
            Iterator it = i6.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair pair = (Pair) it.next();
                if (!h1((String) pair.e(), (String) pair.f())) {
                    z5 = false;
                    break;
                }
            }
        }
        if (z5) {
            y6 = j1(y6, m32);
        }
        String j12 = j1(y5, m32);
        return l0.g(j12, y6) ? j12 : cVar.v(j12, y6, kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public h b1(boolean z5) {
        return new h(c1().b1(z5), d1().b1(z5));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    /* renamed from: g1, reason: merged with bridge method [inline-methods] */
    public b0 e1(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("蕹"));
        kotlin.reflect.jvm.internal.impl.types.h0 a6 = gVar.a(c1());
        String s5 = ProtectedSandApp.s("蕺");
        l0.n(a6, s5);
        kotlin.reflect.jvm.internal.impl.types.h0 a7 = gVar.a(d1());
        l0.n(a7, s5);
        return new h((p0) a6, (p0) a7, true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public h a1(@d5.d d1 d1Var) {
        l0.p(d1Var, ProtectedSandApp.s("蕻"));
        return new h(c1().a1(d1Var), d1().a1(d1Var));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@d5.d p0 p0Var, @d5.d p0 p0Var2) {
        this(p0Var, p0Var2, false);
        l0.p(p0Var, ProtectedSandApp.s("蕮"));
        l0.p(p0Var2, ProtectedSandApp.s("蕯"));
    }
}
