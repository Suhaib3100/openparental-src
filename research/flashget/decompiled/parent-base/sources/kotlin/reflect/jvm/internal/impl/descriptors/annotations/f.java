package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.collections.j0;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.v;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.x1;

/* compiled from: annotationUtil.kt */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.f f75905a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.f f75906b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.f f75907c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.f f75908d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.f f75909e;

    /* compiled from: annotationUtil.kt */
    static final class a extends n0 implements ld.l<h0, kotlin.reflect.jvm.internal.impl.types.h0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.h f75910b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.reflect.jvm.internal.impl.builtins.h hVar) {
            super(1);
            this.f75910b = hVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.jvm.internal.impl.types.h0 invoke(@fg.l h0 h0Var) {
            l0.p(h0Var, ProtectedSandApp.s("櫲\u0001"));
            p0 l4 = h0Var.p().l(x1.INVARIANT, this.f75910b.W());
            l0.o(l4, ProtectedSandApp.s("櫳\u0001"));
            return l4;
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.f f4 = kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("櫴\u0001"));
        String s4 = ProtectedSandApp.s("櫵\u0001");
        l0.o(f4, s4);
        f75905a = f4;
        kotlin.reflect.jvm.internal.impl.name.f f5 = kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("櫶\u0001"));
        l0.o(f5, s4);
        f75906b = f5;
        kotlin.reflect.jvm.internal.impl.name.f f6 = kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("櫷\u0001"));
        l0.o(f6, s4);
        f75907c = f6;
        kotlin.reflect.jvm.internal.impl.name.f f7 = kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("櫸\u0001"));
        l0.o(f7, s4);
        f75908d = f7;
        kotlin.reflect.jvm.internal.impl.name.f f10 = kotlin.reflect.jvm.internal.impl.name.f.f(ProtectedSandApp.s("櫹\u0001"));
        l0.o(f10, s4);
        f75909e = f10;
    }

    @fg.l
    public static final c a(@fg.l kotlin.reflect.jvm.internal.impl.builtins.h hVar, @fg.l String str, @fg.l String str2, @fg.l String str3, boolean z4) {
        l0.p(hVar, ProtectedSandApp.s("櫺\u0001"));
        l0.p(str, ProtectedSandApp.s("櫴\u0001"));
        l0.p(str2, ProtectedSandApp.s("櫶\u0001"));
        l0.p(str3, ProtectedSandApp.s("櫷\u0001"));
        j jVar = new j(hVar, l.a.B, z0.W(new q0(f75908d, new v(str2)), new q0(f75909e, new kotlin.reflect.jvm.internal.impl.resolve.constants.b(j0.f74919b, new a(hVar)))), false, 8, null);
        kotlin.reflect.jvm.internal.impl.name.c cVar = l.a.f75886y;
        q0 q0Var = new q0(f75905a, new v(str));
        q0 q0Var2 = new q0(f75906b, new kotlin.reflect.jvm.internal.impl.resolve.constants.a(jVar));
        kotlin.reflect.jvm.internal.impl.name.f fVar = f75907c;
        kotlin.reflect.jvm.internal.impl.name.b m4 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.A);
        l0.o(m4, ProtectedSandApp.s("櫻\u0001"));
        kotlin.reflect.jvm.internal.impl.name.f f4 = kotlin.reflect.jvm.internal.impl.name.f.f(str3);
        l0.o(f4, ProtectedSandApp.s("櫵\u0001"));
        return new j(hVar, cVar, z0.W(q0Var, q0Var2, new q0(fVar, new kotlin.reflect.jvm.internal.impl.resolve.constants.j(m4, f4))), z4);
    }

    public static /* synthetic */ c b(kotlin.reflect.jvm.internal.impl.builtins.h hVar, String str, String str2, String str3, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = "";
        }
        if ((i4 & 4) != 0) {
            str3 = ProtectedSandApp.s("櫼\u0001");
        }
        if ((i4 & 8) != 0) {
            z4 = false;
        }
        return a(hVar, str, str2, str3, z4);
    }
}
