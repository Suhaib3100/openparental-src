package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: TypeAliasExpansion.kt */
/* loaded from: classes7.dex */
public final class z0 {

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    public static final a f78577e = new a();

    /* renamed from: a, reason: collision with root package name */
    @fg.m
    private final z0 f78578a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.descriptors.e1 f78579b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final List<l1> f78580c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final Map<kotlin.reflect.jvm.internal.impl.descriptors.f1, l1> f78581d;

    /* compiled from: TypeAliasExpansion.kt */
    @kotlin.jvm.internal.r1({"SMAP\nTypeAliasExpansion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasExpansion.kt\norg/jetbrains/kotlin/types/TypeAliasExpansion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1549#2:44\n1620#2,3:45\n*S KotlinDebug\n*F\n+ 1 TypeAliasExpansion.kt\norg/jetbrains/kotlin/types/TypeAliasExpansion$Companion\n*L\n34#1:44\n34#1:45,3\n*E\n"})
    public static final class a {
        private a() {
        }

        @fg.l
        public final z0 a(@fg.m z0 z0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e1 e1Var, @fg.l List<? extends l1> list) {
            kotlin.jvm.internal.l0.p(e1Var, ProtectedSandApp.s("肮\u0001"));
            kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("肯\u0001"));
            List<kotlin.reflect.jvm.internal.impl.descriptors.f1> parameters = e1Var.j().getParameters();
            kotlin.jvm.internal.l0.o(parameters, ProtectedSandApp.s("肰\u0001"));
            List<kotlin.reflect.jvm.internal.impl.descriptors.f1> list2 = parameters;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.f1) it.next()).a());
            }
            return new z0(z0Var, e1Var, list, kotlin.collections.z0.B0(kotlin.collections.w.i6(arrayList, list)), null);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ z0(z0 z0Var, kotlin.reflect.jvm.internal.impl.descriptors.e1 e1Var, List list, Map map, kotlin.jvm.internal.w wVar) {
        this(z0Var, e1Var, list, map);
    }

    @fg.l
    public final List<l1> a() {
        return this.f78580c;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.e1 b() {
        return this.f78579b;
    }

    @fg.m
    public final l1 c(@fg.l h1 h1Var) {
        kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("肱\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h1Var.c();
        if (c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1) {
            return this.f78581d.get(c5);
        }
        return null;
    }

    public final boolean d(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e1 e1Var) {
        kotlin.jvm.internal.l0.p(e1Var, ProtectedSandApp.s("育\u0001"));
        if (!kotlin.jvm.internal.l0.g(this.f78579b, e1Var)) {
            z0 z0Var = this.f78578a;
            if (!(z0Var != null ? z0Var.d(e1Var) : false)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private z0(z0 z0Var, kotlin.reflect.jvm.internal.impl.descriptors.e1 e1Var, List<? extends l1> list, Map<kotlin.reflect.jvm.internal.impl.descriptors.f1, ? extends l1> map) {
        this.f78578a = z0Var;
        this.f78579b = e1Var;
        this.f78580c = list;
        this.f78581d = map;
    }
}
