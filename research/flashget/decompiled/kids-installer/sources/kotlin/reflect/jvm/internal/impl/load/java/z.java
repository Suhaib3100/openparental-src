package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.f1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;

/* compiled from: Jsr305Settings.kt */
/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final g0 f24928a;

    /* renamed from: b, reason: collision with root package name */
    @d5.e
    private final g0 f24929b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final Map<kotlin.reflect.jvm.internal.impl.name.c, g0> f24930c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private final Lazy f24931d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f24932e;

    /* compiled from: Jsr305Settings.kt */
    /* loaded from: classes6.dex */
    static final class a extends Lambda implements q3.a<String[]> {
        a() {
            super(0);
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String[] n() {
            List a6;
            z zVar = z.this;
            ListBuilder listBuilder = new ListBuilder();
            listBuilder.add(zVar.a().getDescription());
            g0 b6 = zVar.b();
            if (b6 != null) {
                listBuilder.add(ProtectedSandApp.s("藄") + b6.getDescription());
            }
            for (Map.Entry<kotlin.reflect.jvm.internal.impl.name.c, g0> entry : zVar.c().entrySet()) {
                listBuilder.add(ProtectedSandApp.s("藅") + entry.getKey() + ':' + entry.getValue().getDescription());
            }
            a6 = kotlin.collections.z.a(listBuilder);
            return (String[]) a6.toArray(new String[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(@d5.d g0 g0Var, @d5.e g0 g0Var2, @d5.d Map<kotlin.reflect.jvm.internal.impl.name.c, ? extends g0> map) {
        Lazy c6;
        l0.p(g0Var, ProtectedSandApp.s("䮁"));
        l0.p(map, ProtectedSandApp.s("䮂"));
        this.f24928a = g0Var;
        this.f24929b = g0Var2;
        this.f24930c = map;
        c6 = kotlin.d0.c(new a());
        this.f24931d = c6;
        g0 g0Var3 = g0.IGNORE;
        this.f24932e = g0Var == g0Var3 && g0Var2 == g0Var3 && map.isEmpty();
    }

    @d5.d
    public final g0 a() {
        return this.f24928a;
    }

    @d5.e
    public final g0 b() {
        return this.f24929b;
    }

    @d5.d
    public final Map<kotlin.reflect.jvm.internal.impl.name.c, g0> c() {
        return this.f24930c;
    }

    public final boolean d() {
        return this.f24932e;
    }

    public boolean equals(@d5.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f24928a == zVar.f24928a && this.f24929b == zVar.f24929b && l0.g(this.f24930c, zVar.f24930c);
    }

    public int hashCode() {
        int hashCode = this.f24928a.hashCode() * 31;
        g0 g0Var = this.f24929b;
        return this.f24930c.hashCode() + ((hashCode + (g0Var == null ? 0 : g0Var.hashCode())) * 31);
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("䮃") + this.f24928a + ProtectedSandApp.s("䮄") + this.f24929b + ProtectedSandApp.s("䮅") + this.f24930c + ')';
    }

    public /* synthetic */ z(g0 g0Var, g0 g0Var2, Map map, int i5, kotlin.jvm.internal.w wVar) {
        this(g0Var, (i5 & 2) != 0 ? null : g0Var2, (i5 & 4) != 0 ? f1.z() : map);
    }
}
