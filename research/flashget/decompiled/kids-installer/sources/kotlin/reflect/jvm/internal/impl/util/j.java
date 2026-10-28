package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.builtins.j;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.util.f;

/* compiled from: modifierChecks.kt */
/* loaded from: classes5.dex */
final class j implements f {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final j f26594a = new j();

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final String f26595b = ProtectedSandApp.s("墍");

    private j() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @d5.d
    public String a() {
        return f26595b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @d5.e
    public String b(@d5.d z zVar) {
        return f.a.a(this, zVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    public boolean c(@d5.d z zVar) {
        l0.p(zVar, ProtectedSandApp.s("墎"));
        j1 j1Var = zVar.n().get(1);
        j.b bVar = kotlin.reflect.jvm.internal.impl.builtins.j.f23924k;
        l0.o(j1Var, ProtectedSandApp.s("墏"));
        h0 a6 = bVar.a(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.p(j1Var));
        if (a6 == null) {
            return false;
        }
        h0 type = j1Var.getType();
        l0.o(type, ProtectedSandApp.s("墐"));
        return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.p(a6, kotlin.reflect.jvm.internal.impl.types.typeUtil.a.t(type));
    }
}
