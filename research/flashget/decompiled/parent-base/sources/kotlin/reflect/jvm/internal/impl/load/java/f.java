package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.load.java.i0;

/* compiled from: specialBuiltinMembers.kt */
@r1({"SMAP\nspecialBuiltinMembers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 specialBuiltinMembers.kt\norg/jetbrains/kotlin/load/java/BuiltinMethodsWithSpecialGenericSignature\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
/* loaded from: classes7.dex */
public final class f extends i0 {

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    public static final f f76422o = new f();

    /* compiled from: specialBuiltinMembers.kt */
    static final class a extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f76423b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("炷\u0001"));
            return Boolean.valueOf(f.f76422o.j(bVar));
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    static final class b extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f76424b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l0.p(bVar, ProtectedSandApp.s("炸\u0001"));
            return Boolean.valueOf((bVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.z) && f.f76422o.j(bVar));
        }
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        i0.f76436a.getClass();
        return kotlin.collections.w.W1(i0.f76443h, kotlin.reflect.jvm.internal.impl.load.kotlin.y.d(bVar));
    }

    @fg.m
    @kd.n
    public static final kotlin.reflect.jvm.internal.impl.descriptors.z k(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.z zVar) {
        l0.p(zVar, ProtectedSandApp.s("烀\u0001"));
        f fVar = f76422o;
        kotlin.reflect.jvm.internal.impl.name.f name = zVar.getName();
        l0.o(name, ProtectedSandApp.s("烁\u0001"));
        if (fVar.l(name)) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.z) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(zVar, false, a.f76423b, 1, null);
        }
        return null;
    }

    @fg.m
    @kd.n
    public static final i0.b m(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.b f4;
        String d5;
        l0.p(bVar, ProtectedSandApp.s("烂\u0001"));
        i0.a aVar = i0.f76436a;
        aVar.getClass();
        if (!i0.f76442g.contains(bVar.getName()) || (f4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(bVar, false, b.f76424b, 1, null)) == null || (d5 = kotlin.reflect.jvm.internal.impl.load.kotlin.y.d(f4)) == null) {
            return null;
        }
        return aVar.l(d5);
    }

    public final boolean l(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        l0.p(fVar, ProtectedSandApp.s("烂\u0001"));
        i0.f76436a.getClass();
        return i0.f76442g.contains(fVar);
    }
}
