package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: JavaClassDataFinder.kt */
/* loaded from: classes7.dex */
public final class k implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.h {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final r f76922a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final j f76923b;

    public k(@fg.l r rVar, @fg.l j jVar) {
        l0.p(rVar, ProtectedSandApp.s("瑽\u0001"));
        l0.p(jVar, ProtectedSandApp.s("瑾\u0001"));
        this.f76922a = rVar;
        this.f76923b = jVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.h
    @fg.m
    public kotlin.reflect.jvm.internal.impl.serialization.deserialization.g a(@fg.l kotlin.reflect.jvm.internal.impl.name.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("瑿\u0001"));
        t a5 = s.a(this.f76922a, bVar, kotlin.reflect.jvm.internal.impl.utils.c.a(this.f76923b.d().g()));
        if (a5 == null) {
            return null;
        }
        l0.g(a5.m(), bVar);
        return this.f76923b.j(a5);
    }
}
