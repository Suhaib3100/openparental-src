package td;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.name.f;
import ud.b;
import ud.c;

/* compiled from: utils.kt */
/* loaded from: classes8.dex */
public final class a {
    public static final void a(@l c cVar, @l b bVar, @l e eVar, @l f fVar) {
        ud.a location;
        ud.e eVar2;
        l0.p(cVar, ProtectedSandApp.s("ꌜ\u0001"));
        l0.p(bVar, ProtectedSandApp.s("ꌝ\u0001"));
        l0.p(eVar, ProtectedSandApp.s("ꌞ\u0001"));
        l0.p(fVar, ProtectedSandApp.s("ꌟ\u0001"));
        if (cVar == c.a.f92759a || (location = bVar.getLocation()) == null) {
            return;
        }
        if (cVar.a()) {
            eVar2 = location.getPosition();
        } else {
            ud.e.f92760d.getClass();
            eVar2 = ud.e.f92761e;
        }
        ud.e eVar3 = eVar2;
        String a5 = location.a();
        String b5 = kotlin.reflect.jvm.internal.impl.resolve.f.m(eVar).b();
        String s4 = ProtectedSandApp.s("ꌠ\u0001");
        l0.o(b5, s4);
        ud.f fVar2 = ud.f.CLASSIFIER;
        String b6 = fVar.b();
        l0.o(b6, s4);
        cVar.b(a5, eVar3, b5, fVar2, b6);
    }

    public static final void b(@l c cVar, @l b bVar, @l kotlin.reflect.jvm.internal.impl.descriptors.l0 l0Var, @l f fVar) {
        l0.p(cVar, ProtectedSandApp.s("ꌜ\u0001"));
        l0.p(bVar, ProtectedSandApp.s("ꌝ\u0001"));
        l0.p(l0Var, ProtectedSandApp.s("ꌞ\u0001"));
        l0.p(fVar, ProtectedSandApp.s("ꌟ\u0001"));
        String b5 = l0Var.g().b();
        String s4 = ProtectedSandApp.s("ꌠ\u0001");
        l0.o(b5, s4);
        String b6 = fVar.b();
        l0.o(b6, s4);
        c(cVar, bVar, b5, b6);
    }

    public static final void c(@l c cVar, @l b bVar, @l String str, @l String str2) {
        ud.a location;
        ud.e eVar;
        l0.p(cVar, ProtectedSandApp.s("ꌜ\u0001"));
        l0.p(bVar, ProtectedSandApp.s("ꌝ\u0001"));
        l0.p(str, ProtectedSandApp.s("ꌡ\u0001"));
        l0.p(str2, ProtectedSandApp.s("ꌟ\u0001"));
        if (cVar == c.a.f92759a || (location = bVar.getLocation()) == null) {
            return;
        }
        if (cVar.a()) {
            eVar = location.getPosition();
        } else {
            ud.e.f92760d.getClass();
            eVar = ud.e.f92761e;
        }
        cVar.b(location.a(), eVar, str, ud.f.PACKAGE, str2);
    }
}
