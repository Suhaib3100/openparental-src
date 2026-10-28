package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* compiled from: Jsr305Settings.kt */
/* loaded from: classes7.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final g0 f76805a;

    /* renamed from: b, reason: collision with root package name */
    @fg.m
    private final g0 f76806b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final Map<kotlin.reflect.jvm.internal.impl.name.c, g0> f76807c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final kotlin.b0 f76808d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f76809e;

    /* compiled from: Jsr305Settings.kt */
    @r1({"SMAP\nJsr305Settings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Jsr305Settings.kt\norg/jetbrains/kotlin/load/java/Jsr305Settings$description$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,27:1\n1#2:28\n215#3,2:29\n37#4,2:31\n*S KotlinDebug\n*F\n+ 1 Jsr305Settings.kt\norg/jetbrains/kotlin/load/java/Jsr305Settings$description$2\n*L\n20#1:29,2\n21#1:31,2\n*E\n"})
    static final class a extends n0 implements ld.a<String[]> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String[] invoke() {
            z zVar = z.this;
            kotlin.collections.builders.b bVar = new kotlin.collections.builders.b();
            bVar.add(zVar.a().getDescription());
            g0 b5 = zVar.b();
            if (b5 != null) {
                bVar.add(ProtectedSandApp.s("獉\u0001") + b5.getDescription());
            }
            for (Map.Entry<kotlin.reflect.jvm.internal.impl.name.c, g0> entry : zVar.c().entrySet()) {
                bVar.add(ProtectedSandApp.s("獊\u0001") + entry.getKey() + ':' + entry.getValue().getDescription());
            }
            return (String[]) kotlin.collections.w.a(bVar).toArray(new String[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(@fg.l g0 g0Var, @fg.m g0 g0Var2, @fg.l Map<kotlin.reflect.jvm.internal.impl.name.c, ? extends g0> map) {
        l0.p(g0Var, ProtectedSandApp.s("獋\u0001"));
        l0.p(map, ProtectedSandApp.s("獌\u0001"));
        this.f76805a = g0Var;
        this.f76806b = g0Var2;
        this.f76807c = map;
        this.f76808d = kotlin.c0.c(new a());
        g0 g0Var3 = g0.IGNORE;
        this.f76809e = g0Var == g0Var3 && g0Var2 == g0Var3 && map.isEmpty();
    }

    @fg.l
    public final g0 a() {
        return this.f76805a;
    }

    @fg.m
    public final g0 b() {
        return this.f76806b;
    }

    @fg.l
    public final Map<kotlin.reflect.jvm.internal.impl.name.c, g0> c() {
        return this.f76807c;
    }

    public final boolean d() {
        return this.f76809e;
    }

    public boolean equals(@fg.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f76805a == zVar.f76805a && this.f76806b == zVar.f76806b && l0.g(this.f76807c, zVar.f76807c);
    }

    public int hashCode() {
        int hashCode = this.f76805a.hashCode() * 31;
        g0 g0Var = this.f76806b;
        return this.f76807c.hashCode() + ((hashCode + (g0Var == null ? 0 : g0Var.hashCode())) * 31);
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("獍\u0001") + this.f76805a + ProtectedSandApp.s("獎\u0001") + this.f76806b + ProtectedSandApp.s("獏\u0001") + this.f76807c + ')';
    }

    public /* synthetic */ z(g0 g0Var, g0 g0Var2, Map map, int i4, kotlin.jvm.internal.w wVar) {
        this(g0Var, (i4 & 2) != 0 ? null : g0Var2, (i4 & 4) != 0 ? z0.z() : map);
    }
}
