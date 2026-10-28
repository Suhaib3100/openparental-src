package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.types.b0;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.k1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.o0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.text.m0;
import kotlin.text.v;
import ld.l;

/* compiled from: RawType.kt */
@r1({"SMAP\nRawType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawType.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawTypeImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1726#2,3:99\n1549#2:102\n1620#2,3:103\n*S KotlinDebug\n*F\n+ 1 RawType.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawTypeImpl\n*L\n80#1:99,3\n61#1:102\n61#1:103,3\n*E\n"})
/* loaded from: classes7.dex */
public final class h extends b0 implements o0 {

    /* compiled from: RawType.kt */
    static final class a extends n0 implements l<String, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f76681b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@fg.l String str) {
            l0.p(str, ProtectedSandApp.s("爿\u0001"));
            return ProtectedSandApp.s("牀\u0001") + str;
        }
    }

    private h(p0 p0Var, p0 p0Var2, boolean z4) {
        super(p0Var, p0Var2);
        if (z4) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.types.checker.e.f78349a.d(p0Var, p0Var2);
    }

    private static final boolean b1(String str, String str2) {
        return l0.g(str, v.a4(str2, ProtectedSandApp.s("牅\u0001"))) || l0.g(str2, ProtectedSandApp.s("牆\u0001"));
    }

    private static final List<String> c1(kotlin.reflect.jvm.internal.impl.renderer.c cVar, h0 h0Var) {
        List<l1> M0 = h0Var.M0();
        ArrayList arrayList = new ArrayList(w.b0(M0, 10));
        Iterator<T> it = M0.iterator();
        while (it.hasNext()) {
            arrayList.add(cVar.z((l1) it.next()));
        }
        return arrayList;
    }

    private static final String d1(String str, String str2) {
        if (!v.S2(str, m0.less, false, 2, null)) {
            return str;
        }
        return v.u5(str, m0.less, null, 2, null) + m0.less + str2 + m0.greater + v.q5(str, m0.greater, null, 2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    @fg.l
    public p0 V0() {
        return W0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    @fg.l
    public String Y0(@fg.l kotlin.reflect.jvm.internal.impl.renderer.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.renderer.f fVar) {
        l0.p(cVar, ProtectedSandApp.s("片\u0001"));
        l0.p(fVar, ProtectedSandApp.s("版\u0001"));
        String y4 = cVar.y(W0());
        String y5 = cVar.y(X0());
        if (fVar.j()) {
            return ProtectedSandApp.s("牉\u0001") + y4 + ProtectedSandApp.s("牊\u0001") + y5 + ')';
        }
        if (X0().M0().isEmpty()) {
            return cVar.v(y4, y5, kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(this));
        }
        List<String> c12 = c1(cVar, W0());
        List<String> c13 = c1(cVar, X0());
        List<String> list = c12;
        String m32 = w.m3(list, ProtectedSandApp.s("牋\u0001"), null, null, 0, null, a.f76681b, 30, null);
        List<q0> i6 = w.i6(list, c13);
        if (!(i6 instanceof Collection) || !i6.isEmpty()) {
            for (q0 q0Var : i6) {
                if (!b1((String) q0Var.e(), (String) q0Var.f())) {
                    break;
                }
            }
        }
        y5 = d1(y5, m32);
        String d12 = d1(y4, m32);
        return l0.g(d12, y5) ? d12 : cVar.v(d12, y5, kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public h V0(boolean z4) {
        return new h(W0().V0(z4), X0().V0(z4));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public b0 Y0(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("牌\u0001"));
        h0 a5 = gVar.a(W0());
        String s4 = ProtectedSandApp.s("牍\u0001");
        l0.n(a5, s4);
        h0 a6 = gVar.a(X0());
        l0.n(a6, s4);
        return new h((p0) a5, (p0) a6, true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    /* renamed from: e1, reason: merged with bridge method [inline-methods] */
    public h U0(@fg.l d1 d1Var) {
        l0.p(d1Var, ProtectedSandApp.s("牎\u0001"));
        return new h(W0().U0(d1Var), X0().U0(d1Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.types.b0, kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h q() {
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = O0().c();
        k1 k1Var = null;
        Object[] objArr = 0;
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) c5 : null;
        if (eVar != null) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h s02 = eVar.s0(new g(k1Var, 1, objArr == true ? 1 : 0));
            l0.o(s02, ProtectedSandApp.s("牏\u0001"));
            return s02;
        }
        throw new IllegalStateException((ProtectedSandApp.s("牐\u0001") + O0().c()).toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@fg.l p0 p0Var, @fg.l p0 p0Var2) {
        this(p0Var, p0Var2, false);
        l0.p(p0Var, ProtectedSandApp.s("牃\u0001"));
        l0.p(p0Var2, ProtectedSandApp.s("牄\u0001"));
    }
}
