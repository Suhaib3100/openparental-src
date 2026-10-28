package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.w;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.m;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.n;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.types.error.k;

/* compiled from: JavaAnnotationMapper.kt */
@r1({"SMAP\nJavaAnnotationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaAnnotationTargetMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n800#2,11:183\n1360#2:194\n1446#2,5:195\n1549#2:200\n1620#2,3:201\n*S KotlinDebug\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaAnnotationTargetMapper\n*L\n153#1:183,11\n154#1:194\n154#1:195,5\n155#1:200\n155#1:201,3\n*E\n"})
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final d f76391a = new d();

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final Map<String, EnumSet<n>> f76392b = z0.W(new q0(ProtectedSandApp.s("濹\u0001"), EnumSet.noneOf(n.class)), new q0(ProtectedSandApp.s("濺\u0001"), EnumSet.of(n.CLASS, n.FILE)), new q0(ProtectedSandApp.s("濻\u0001"), EnumSet.of(n.ANNOTATION_CLASS)), new q0(ProtectedSandApp.s("濼\u0001"), EnumSet.of(n.TYPE_PARAMETER)), new q0(ProtectedSandApp.s("濽\u0001"), EnumSet.of(n.FIELD)), new q0(ProtectedSandApp.s("濾\u0001"), EnumSet.of(n.LOCAL_VARIABLE)), new q0(ProtectedSandApp.s("濿\u0001"), EnumSet.of(n.VALUE_PARAMETER)), new q0(ProtectedSandApp.s("瀀\u0001"), EnumSet.of(n.CONSTRUCTOR)), new q0(ProtectedSandApp.s("瀁\u0001"), EnumSet.of(n.FUNCTION, n.PROPERTY_GETTER, n.PROPERTY_SETTER)), new q0(ProtectedSandApp.s("瀂\u0001"), EnumSet.of(n.TYPE)));

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final Map<String, m> f76393c = z0.W(new q0(ProtectedSandApp.s("瀃\u0001"), m.RUNTIME), new q0(ProtectedSandApp.s("瀄\u0001"), m.BINARY), new q0(ProtectedSandApp.s("瀅\u0001"), m.SOURCE));

    /* compiled from: JavaAnnotationMapper.kt */
    static final class a extends n0 implements ld.l<h0, kotlin.reflect.jvm.internal.impl.types.h0> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f76394b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.types.h0 invoke(@l h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("濸\u0001"));
            j1 b5 = kotlin.reflect.jvm.internal.impl.load.java.components.a.b(c.f76386a.d(), h0Var.p().o(l.a.H));
            kotlin.reflect.jvm.internal.impl.types.h0 type = b5 != null ? b5.getType() : null;
            return type == null ? k.d(kotlin.reflect.jvm.internal.impl.types.error.j.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
        }
    }

    private d() {
    }

    @fg.m
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> a(@fg.m wd.b bVar) {
        wd.m mVar = bVar instanceof wd.m ? (wd.m) bVar : null;
        if (mVar == null) {
            return null;
        }
        Map<String, m> map = f76393c;
        kotlin.reflect.jvm.internal.impl.name.f c5 = mVar.c();
        m mVar2 = map.get(c5 != null ? c5.b() : null);
        if (mVar2 == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.b m4 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.K);
        l0.o(m4, ProtectedSandApp.s("瀆\u0001"));
        kotlin.reflect.jvm.internal.impl.name.f f4 = kotlin.reflect.jvm.internal.impl.name.f.f(mVar2.name());
        l0.o(f4, ProtectedSandApp.s("瀇\u0001"));
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.j(m4, f4);
    }

    @fg.l
    public final Set<n> b(@fg.m String str) {
        EnumSet<n> enumSet = f76392b.get(str);
        return enumSet != null ? enumSet : kotlin.collections.l0.f74939b;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> c(@fg.l List<? extends wd.b> list) {
        l0.p(list, ProtectedSandApp.s("瀈\u0001"));
        ArrayList<wd.m> arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof wd.m) {
                arrayList.add(obj);
            }
        }
        ArrayList<n> arrayList2 = new ArrayList();
        for (wd.m mVar : arrayList) {
            d dVar = f76391a;
            kotlin.reflect.jvm.internal.impl.name.f c5 = mVar.c();
            w.q0(arrayList2, dVar.b(c5 != null ? c5.b() : null));
        }
        ArrayList arrayList3 = new ArrayList(w.b0(arrayList2, 10));
        for (n nVar : arrayList2) {
            kotlin.reflect.jvm.internal.impl.name.b m4 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.J);
            l0.o(m4, ProtectedSandApp.s("瀆\u0001"));
            kotlin.reflect.jvm.internal.impl.name.f f4 = kotlin.reflect.jvm.internal.impl.name.f.f(nVar.name());
            l0.o(f4, ProtectedSandApp.s("瀇\u0001"));
            arrayList3.add(new kotlin.reflect.jvm.internal.impl.resolve.constants.j(m4, f4));
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.b(arrayList3, a.f76394b);
    }
}
