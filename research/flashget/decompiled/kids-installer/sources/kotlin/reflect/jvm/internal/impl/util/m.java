package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.util.f;

/* compiled from: modifierChecks.kt */
/* loaded from: classes5.dex */
final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final m f26600a = new m();

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final String f26601b = ProtectedSandApp.s("墓");

    private m() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @d5.d
    public String a() {
        return f26601b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @d5.e
    public String b(@d5.d z zVar) {
        return f.a.a(this, zVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    public boolean c(@d5.d z zVar) {
        l0.p(zVar, ProtectedSandApp.s("墔"));
        List<j1> n5 = zVar.n();
        l0.o(n5, ProtectedSandApp.s("墕"));
        if ((n5 instanceof Collection) && n5.isEmpty()) {
            return true;
        }
        for (j1 j1Var : n5) {
            l0.o(j1Var, ProtectedSandApp.s("墖"));
            if (!(!kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.c(j1Var) && j1Var.s0() == null)) {
                return false;
            }
        }
        return true;
    }
}
