package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.collections.b0;
import kotlin.collections.f0;
import kotlin.collections.f1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.m;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.n;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.types.error.k;
import q3.l;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final d f24537a = new d();

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final Map<String, EnumSet<n>> f24538b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final Map<String, m> f24539c;

    /* compiled from: JavaAnnotationMapper.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements l<h0, kotlin.reflect.jvm.internal.impl.types.h0> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f24540p = new a();

        a() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.types.h0 N(@d5.d h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("萌"));
            j1 b6 = kotlin.reflect.jvm.internal.impl.load.java.components.a.b(c.f24532a.d(), h0Var.A().o(l.a.H));
            kotlin.reflect.jvm.internal.impl.types.h0 type = b6 != null ? b6.getType() : null;
            return type == null ? k.d(kotlin.reflect.jvm.internal.impl.types.error.j.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
        }
    }

    static {
        Map<String, EnumSet<n>> W;
        Map<String, m> W2;
        W = f1.W(new Pair(ProtectedSandApp.s("䥜"), EnumSet.noneOf(n.class)), new Pair(ProtectedSandApp.s("䥝"), EnumSet.of(n.CLASS, n.FILE)), new Pair(ProtectedSandApp.s("䥞"), EnumSet.of(n.ANNOTATION_CLASS)), new Pair(ProtectedSandApp.s("䥟"), EnumSet.of(n.TYPE_PARAMETER)), new Pair(ProtectedSandApp.s("䥠"), EnumSet.of(n.FIELD)), new Pair(ProtectedSandApp.s("䥡"), EnumSet.of(n.LOCAL_VARIABLE)), new Pair(ProtectedSandApp.s("䥢"), EnumSet.of(n.VALUE_PARAMETER)), new Pair(ProtectedSandApp.s("䥣"), EnumSet.of(n.CONSTRUCTOR)), new Pair(ProtectedSandApp.s("䥤"), EnumSet.of(n.FUNCTION, n.PROPERTY_GETTER, n.PROPERTY_SETTER)), new Pair(ProtectedSandApp.s("䥥"), EnumSet.of(n.TYPE)));
        f24538b = W;
        W2 = f1.W(new Pair(ProtectedSandApp.s("䥦"), m.RUNTIME), new Pair(ProtectedSandApp.s("䥧"), m.BINARY), new Pair(ProtectedSandApp.s("䥨"), m.SOURCE));
        f24539c = W2;
    }

    private d() {
    }

    @d5.e
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> a(@d5.e b4.b bVar) {
        b4.m mVar = bVar instanceof b4.m ? (b4.m) bVar : null;
        if (mVar == null) {
            return null;
        }
        Map<String, m> map = f24539c;
        kotlin.reflect.jvm.internal.impl.name.f d6 = mVar.d();
        m mVar2 = map.get(d6 != null ? d6.h() : null);
        if (mVar2 == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.K);
        l0.o(m5, ProtectedSandApp.s("䥩"));
        kotlin.reflect.jvm.internal.impl.name.f p5 = kotlin.reflect.jvm.internal.impl.name.f.p(mVar2.name());
        l0.o(p5, ProtectedSandApp.s("䥪"));
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.j(m5, p5);
    }

    @d5.d
    public final Set<n> b(@d5.e String str) {
        EnumSet<n> enumSet = f24538b.get(str);
        return enumSet != null ? enumSet : EmptySet.f23181o;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> c(@d5.d List<? extends b4.b> list) {
        int b02;
        l0.p(list, ProtectedSandApp.s("䥫"));
        ArrayList<b4.m> arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof b4.m) {
                arrayList.add(obj);
            }
        }
        ArrayList<n> arrayList2 = new ArrayList();
        for (b4.m mVar : arrayList) {
            d dVar = f24537a;
            kotlin.reflect.jvm.internal.impl.name.f d6 = mVar.d();
            f0.q0(arrayList2, dVar.b(d6 != null ? d6.h() : null));
        }
        b02 = b0.b0(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(b02);
        for (n nVar : arrayList2) {
            kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.J);
            l0.o(m5, ProtectedSandApp.s("䥬"));
            kotlin.reflect.jvm.internal.impl.name.f p5 = kotlin.reflect.jvm.internal.impl.name.f.p(nVar.name());
            l0.o(p5, ProtectedSandApp.s("䥭"));
            arrayList3.add(new kotlin.reflect.jvm.internal.impl.resolve.constants.j(m5, p5));
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.b(arrayList3, a.f24540p);
    }
}
