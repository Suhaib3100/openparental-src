package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.j;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.util.f;

/* compiled from: modifierChecks.kt */
/* loaded from: classes7.dex */
final class j implements f {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final String f78603b = ProtectedSandApp.s("胇\u0001");

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final j f78602a = new j();

    private j() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @fg.l
    public String a() {
        return f78603b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @fg.m
    public String b(@fg.l z zVar) {
        return f.a.a(this, zVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    public boolean c(@fg.l z zVar) {
        l0.p(zVar, ProtectedSandApp.s("胈\u0001"));
        j1 j1Var = zVar.i().get(1);
        j.b bVar = kotlin.reflect.jvm.internal.impl.builtins.j.f75716k;
        l0.m(j1Var);
        h0 a5 = bVar.a(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.p(j1Var));
        if (a5 == null) {
            return false;
        }
        h0 type = j1Var.getType();
        l0.o(type, ProtectedSandApp.s("胉\u0001"));
        return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.r(a5, kotlin.reflect.jvm.internal.impl.types.typeUtil.a.v(type));
    }
}
