package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: TypeAliasExpansion.kt */
/* loaded from: classes5.dex */
public final class z0 {

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    public static final a f26568e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @d5.e
    private final z0 f26569a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.e1 f26570b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final List<l1> f26571c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final Map<kotlin.reflect.jvm.internal.impl.descriptors.f1, l1> f26572d;

    /* compiled from: TypeAliasExpansion.kt */
    public static final class a {
        private a() {
        }

        @d5.d
        public final z0 a(@d5.e z0 z0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e1 e1Var, @d5.d List<? extends l1> list) {
            int b02;
            List i6;
            Map B0;
            kotlin.jvm.internal.l0.p(e1Var, ProtectedSandApp.s("塵"));
            kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("塶"));
            List<kotlin.reflect.jvm.internal.impl.descriptors.f1> r5 = e1Var.m().r();
            kotlin.jvm.internal.l0.o(r5, ProtectedSandApp.s("塷"));
            b02 = kotlin.collections.b0.b0(r5, 10);
            ArrayList arrayList = new ArrayList(b02);
            Iterator<T> it = r5.iterator();
            while (it.hasNext()) {
                arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.f1) it.next()).a());
            }
            i6 = kotlin.collections.j0.i6(arrayList, list);
            B0 = kotlin.collections.f1.B0(i6);
            return new z0(z0Var, e1Var, list, B0, null);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ z0(z0 z0Var, kotlin.reflect.jvm.internal.impl.descriptors.e1 e1Var, List list, Map map, kotlin.jvm.internal.w wVar) {
        this(z0Var, e1Var, list, map);
    }

    @d5.d
    public final List<l1> a() {
        return this.f26571c;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.e1 b() {
        return this.f26570b;
    }

    @d5.e
    public final l1 c(@d5.d h1 h1Var) {
        kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("塸"));
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h1Var.b();
        if (b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f1) {
            return this.f26572d.get(b6);
        }
        return null;
    }

    public final boolean d(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e1 e1Var) {
        kotlin.jvm.internal.l0.p(e1Var, ProtectedSandApp.s("塹"));
        if (!kotlin.jvm.internal.l0.g(this.f26570b, e1Var)) {
            z0 z0Var = this.f26569a;
            if (!(z0Var != null ? z0Var.d(e1Var) : false)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private z0(z0 z0Var, kotlin.reflect.jvm.internal.impl.descriptors.e1 e1Var, List<? extends l1> list, Map<kotlin.reflect.jvm.internal.impl.descriptors.f1, ? extends l1> map) {
        this.f26569a = z0Var;
        this.f26570b = e1Var;
        this.f26571c = list;
        this.f26572d = map;
    }
}
