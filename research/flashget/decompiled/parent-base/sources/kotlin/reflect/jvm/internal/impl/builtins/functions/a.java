package kotlin.reflect.jvm.internal.impl.builtins.functions;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.builtins.functions.g;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.text.v;

/* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
@r1({"SMAP\nBuiltInFictitiousFunctionClassFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInFictitiousFunctionClassFactory.kt\norg/jetbrains/kotlin/builtins/functions/BuiltInFictitiousFunctionClassFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n800#2,11:71\n800#2,11:82\n*S KotlinDebug\n*F\n+ 1 BuiltInFictitiousFunctionClassFactory.kt\norg/jetbrains/kotlin/builtins/functions/BuiltInFictitiousFunctionClassFactory\n*L\n55#1:71,11\n59#1:82,11\n*E\n"})
/* loaded from: classes7.dex */
public final class a implements rd.b {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final n f75670a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final h0 f75671b;

    public a(@l n nVar, @l h0 h0Var) {
        l0.p(nVar, ProtectedSandApp.s("栞\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("栟\u0001"));
        this.f75670a = nVar;
        this.f75671b = h0Var;
    }

    @Override // rd.b
    @l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> a(@l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("栠\u0001"));
        return kotlin.collections.l0.f74939b;
    }

    @Override // rd.b
    public boolean b(@l kotlin.reflect.jvm.internal.impl.name.c cVar, @l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(cVar, ProtectedSandApp.s("栠\u0001"));
        l0.p(fVar, ProtectedSandApp.s("校\u0001"));
        String b5 = fVar.b();
        l0.o(b5, ProtectedSandApp.s("栢\u0001"));
        if (!v.s2(b5, ProtectedSandApp.s("栣\u0001"), false, 2, null) && !v.s2(b5, ProtectedSandApp.s("栤\u0001"), false, 2, null) && !v.s2(b5, ProtectedSandApp.s("栥\u0001"), false, 2, null) && !v.s2(b5, ProtectedSandApp.s("栦\u0001"), false, 2, null)) {
            return false;
        }
        g.f75692c.getClass();
        return g.f75693d.c(cVar, b5) != null;
    }

    @Override // rd.b
    @m
    public kotlin.reflect.jvm.internal.impl.descriptors.e c(@l kotlin.reflect.jvm.internal.impl.name.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("栧\u0001"));
        if (bVar.k() || bVar.l()) {
            return null;
        }
        String b5 = bVar.i().b();
        l0.o(b5, ProtectedSandApp.s("栢\u0001"));
        if (!v.T2(b5, ProtectedSandApp.s("栣\u0001"), false, 2, null)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.c h4 = bVar.h();
        l0.o(h4, ProtectedSandApp.s("栨\u0001"));
        g.f75692c.getClass();
        g.b c5 = g.f75693d.c(h4, b5);
        if (c5 == null) {
            return null;
        }
        f a5 = c5.a();
        int b6 = c5.b();
        List<kotlin.reflect.jvm.internal.impl.descriptors.l0> k02 = this.f75671b.n0(h4).k0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : k02) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.builtins.b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof kotlin.reflect.jvm.internal.impl.builtins.f) {
                arrayList2.add(obj2);
            }
        }
        kotlin.reflect.jvm.internal.impl.descriptors.l0 l0Var = (kotlin.reflect.jvm.internal.impl.builtins.f) w.G2(arrayList2);
        if (l0Var == null) {
            l0Var = (kotlin.reflect.jvm.internal.impl.builtins.b) w.B2(arrayList);
        }
        return new b(this.f75670a, l0Var, a5, b6);
    }
}
