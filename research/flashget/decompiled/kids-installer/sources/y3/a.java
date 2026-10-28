package y3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.name.f;
import z3.b;
import z3.c;

/* compiled from: utils.kt */
/* loaded from: classes5.dex */
public final class a {
    public static final void a(@d c cVar, @d b bVar, @d e eVar, @d f fVar) {
        z3.a location;
        z3.e eVar2;
        l0.p(cVar, ProtectedSandApp.s("歏"));
        l0.p(bVar, ProtectedSandApp.s("歐"));
        l0.p(eVar, ProtectedSandApp.s("歑"));
        l0.p(fVar, ProtectedSandApp.s("歒"));
        if (cVar == c.a.f34404a || (location = bVar.getLocation()) == null) {
            return;
        }
        if (cVar.a()) {
            eVar2 = location.getPosition();
        } else {
            z3.e.f34405q.getClass();
            eVar2 = z3.e.f34406r;
        }
        String a6 = location.a();
        String b6 = kotlin.reflect.jvm.internal.impl.resolve.e.m(eVar).b();
        l0.o(b6, ProtectedSandApp.s("歓"));
        z3.f fVar2 = z3.f.CLASSIFIER;
        String h5 = fVar.h();
        l0.o(h5, ProtectedSandApp.s("歔"));
        cVar.b(a6, eVar2, b6, fVar2, h5);
    }

    public static final void b(@d c cVar, @d b bVar, @d kotlin.reflect.jvm.internal.impl.descriptors.l0 l0Var, @d f fVar) {
        l0.p(cVar, ProtectedSandApp.s("歕"));
        l0.p(bVar, ProtectedSandApp.s("歖"));
        l0.p(l0Var, ProtectedSandApp.s("歗"));
        l0.p(fVar, ProtectedSandApp.s("歘"));
        String b6 = l0Var.f().b();
        l0.o(b6, ProtectedSandApp.s("歙"));
        String h5 = fVar.h();
        l0.o(h5, ProtectedSandApp.s("歚"));
        c(cVar, bVar, b6, h5);
    }

    public static final void c(@d c cVar, @d b bVar, @d String str, @d String str2) {
        z3.a location;
        z3.e eVar;
        l0.p(cVar, ProtectedSandApp.s("歛"));
        l0.p(bVar, ProtectedSandApp.s("歜"));
        l0.p(str, ProtectedSandApp.s("歝"));
        l0.p(str2, ProtectedSandApp.s("歞"));
        if (cVar == c.a.f34404a || (location = bVar.getLocation()) == null) {
            return;
        }
        if (cVar.a()) {
            eVar = location.getPosition();
        } else {
            z3.e.f34405q.getClass();
            eVar = z3.e.f34406r;
        }
        cVar.b(location.a(), eVar, str, z3.f.PACKAGE, str2);
    }
}
