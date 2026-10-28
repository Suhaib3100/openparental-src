package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes7.dex */
public abstract class i1 extends o1 {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    public static final a f78491c = new a();

    /* compiled from: TypeSubstitution.kt */
    @kotlin.jvm.internal.r1({"SMAP\nTypeSubstitution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/TypeConstructorSubstitution$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n1549#2:208\n1620#2,3:209\n*S KotlinDebug\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/TypeConstructorSubstitution$Companion\n*L\n96#1:208\n96#1:209,3\n*E\n"})
    public static final class a {

        /* compiled from: TypeSubstitution.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.i1$a$a, reason: collision with other inner class name */
        public static final class C1195a extends i1 {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map<h1, l1> f78492d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f78493e;

            /* JADX WARN: Multi-variable type inference failed */
            C1195a(Map<h1, ? extends l1> map, boolean z4) {
                this.f78492d = map;
                this.f78493e = z4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.o1
            public boolean a() {
                return this.f78493e;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.o1
            public boolean f() {
                return this.f78492d.isEmpty();
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.i1
            @fg.m
            public l1 k(@fg.l h1 h1Var) {
                kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("署\u0001"));
                return this.f78492d.get(h1Var);
            }
        }

        private a() {
        }

        public static /* synthetic */ i1 e(a aVar, Map map, boolean z4, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = false;
            }
            return aVar.d(map, z4);
        }

        @fg.l
        @kd.n
        public final o1 a(@fg.l h0 h0Var) {
            kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("罳\u0001"));
            return b(h0Var.O0(), h0Var.M0());
        }

        @fg.l
        @kd.n
        public final o1 b(@fg.l h1 h1Var, @fg.l List<? extends l1> list) {
            kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("罴\u0001"));
            kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("罵\u0001"));
            List<kotlin.reflect.jvm.internal.impl.descriptors.f1> parameters = h1Var.getParameters();
            String s4 = ProtectedSandApp.s("罶\u0001");
            kotlin.jvm.internal.l0.o(parameters, s4);
            kotlin.reflect.jvm.internal.impl.descriptors.f1 f1Var = (kotlin.reflect.jvm.internal.impl.descriptors.f1) kotlin.collections.w.v3(parameters);
            if (f1Var == null || !f1Var.U()) {
                return new f0(parameters, list);
            }
            List<kotlin.reflect.jvm.internal.impl.descriptors.f1> parameters2 = h1Var.getParameters();
            kotlin.jvm.internal.l0.o(parameters2, s4);
            List<kotlin.reflect.jvm.internal.impl.descriptors.f1> list2 = parameters2;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.f1) it.next()).j());
            }
            return e(this, kotlin.collections.z0.B0(kotlin.collections.w.i6(arrayList, list)), false, 2, null);
        }

        @fg.l
        @kd.j
        @kd.n
        public final i1 c(@fg.l Map<h1, ? extends l1> map) {
            kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("罷\u0001"));
            return e(this, map, false, 2, null);
        }

        @fg.l
        @kd.j
        @kd.n
        public final i1 d(@fg.l Map<h1, ? extends l1> map, boolean z4) {
            kotlin.jvm.internal.l0.p(map, ProtectedSandApp.s("罷\u0001"));
            return new C1195a(map, z4);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    @fg.l
    @kd.n
    public static final o1 i(@fg.l h1 h1Var, @fg.l List<? extends l1> list) {
        return f78491c.b(h1Var, list);
    }

    @fg.l
    @kd.j
    @kd.n
    public static final i1 j(@fg.l Map<h1, ? extends l1> map) {
        return f78491c.c(map);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.o1
    @fg.m
    public l1 e(@fg.l h0 h0Var) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("罱\u0001"));
        return k(h0Var.O0());
    }

    @fg.m
    public abstract l1 k(@fg.l h1 h1Var);
}
