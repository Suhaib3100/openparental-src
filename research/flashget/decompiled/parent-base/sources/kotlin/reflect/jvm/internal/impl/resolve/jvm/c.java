package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.load.java.components.g;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import wd.d0;

/* compiled from: JavaDescriptorResolver.kt */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.f f77921a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final g f77922b;

    public c(@l kotlin.reflect.jvm.internal.impl.load.java.lazy.f fVar, @l g gVar) {
        l0.p(fVar, ProtectedSandApp.s("禢\u0001"));
        l0.p(gVar, ProtectedSandApp.s("禣\u0001"));
        this.f77921a = fVar;
        this.f77922b = gVar;
    }

    @l
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.f a() {
        return this.f77921a;
    }

    @m
    public final kotlin.reflect.jvm.internal.impl.descriptors.e b(@l wd.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("禤\u0001"));
        kotlin.reflect.jvm.internal.impl.name.c g4 = gVar.g();
        if (g4 != null && gVar.K() == d0.SOURCE) {
            return this.f77922b.b(g4);
        }
        wd.g q4 = gVar.q();
        if (q4 != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.e b5 = b(q4);
            h W = b5 != null ? b5.W() : null;
            kotlin.reflect.jvm.internal.impl.descriptors.h f4 = W != null ? W.f(gVar.getName(), ud.d.FROM_JAVA_LOADER) : null;
            if (f4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                return (kotlin.reflect.jvm.internal.impl.descriptors.e) f4;
            }
            return null;
        }
        if (g4 == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.load.java.lazy.f fVar = this.f77921a;
        kotlin.reflect.jvm.internal.impl.name.c e4 = g4.e();
        l0.o(e4, ProtectedSandApp.s("禥\u0001"));
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.h) w.G2(fVar.a(e4));
        if (hVar != null) {
            return hVar.N0(gVar);
        }
        return null;
    }
}
