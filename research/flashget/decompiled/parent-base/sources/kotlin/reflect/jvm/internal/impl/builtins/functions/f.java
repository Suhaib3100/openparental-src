package kotlin.reflect.jvm.internal.impl.builtins.functions;

import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.jvm.internal.l0;

/* compiled from: FunctionTypeKind.kt */
/* loaded from: classes7.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.name.c f75684a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final String f75685b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f75686c;

    /* renamed from: d, reason: collision with root package name */
    @m
    private final kotlin.reflect.jvm.internal.impl.name.b f75687d;

    /* compiled from: FunctionTypeKind.kt */
    public static final class a extends f {

        /* renamed from: e, reason: collision with root package name */
        @l
        public static final a f75688e = new a();

        private a() {
            super(kotlin.reflect.jvm.internal.impl.builtins.l.f75836y, ProtectedSandApp.s("棣\u0001"), false, null);
        }
    }

    /* compiled from: FunctionTypeKind.kt */
    public static final class b extends f {

        /* renamed from: e, reason: collision with root package name */
        @l
        public static final b f75689e = new b();

        private b() {
            super(kotlin.reflect.jvm.internal.impl.builtins.l.f75833v, ProtectedSandApp.s("棤\u0001"), true, null);
        }
    }

    /* compiled from: FunctionTypeKind.kt */
    public static final class c extends f {

        /* renamed from: e, reason: collision with root package name */
        @l
        public static final c f75690e = new c();

        private c() {
            super(kotlin.reflect.jvm.internal.impl.builtins.l.f75833v, ProtectedSandApp.s("棥\u0001"), true, null);
        }
    }

    /* compiled from: FunctionTypeKind.kt */
    public static final class d extends f {

        /* renamed from: e, reason: collision with root package name */
        @l
        public static final d f75691e = new d();

        private d() {
            super(kotlin.reflect.jvm.internal.impl.builtins.l.f75828q, ProtectedSandApp.s("棦\u0001"), false, null);
        }
    }

    public f(@l kotlin.reflect.jvm.internal.impl.name.c cVar, @l String str, boolean z4, @m kotlin.reflect.jvm.internal.impl.name.b bVar) {
        l0.p(cVar, ProtectedSandApp.s("棠\u0001"));
        l0.p(str, ProtectedSandApp.s("棡\u0001"));
        this.f75684a = cVar;
        this.f75685b = str;
        this.f75686c = z4;
        this.f75687d = bVar;
    }

    @l
    public final String a() {
        return this.f75685b;
    }

    @l
    public final kotlin.reflect.jvm.internal.impl.name.c b() {
        return this.f75684a;
    }

    @l
    public final kotlin.reflect.jvm.internal.impl.name.f c(int i4) {
        kotlin.reflect.jvm.internal.impl.name.f f4 = kotlin.reflect.jvm.internal.impl.name.f.f(this.f75685b + i4);
        l0.o(f4, ProtectedSandApp.s("棢\u0001"));
        return f4;
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f75684a);
        sb.append('.');
        return f3.a(sb, this.f75685b, 'N');
    }
}
