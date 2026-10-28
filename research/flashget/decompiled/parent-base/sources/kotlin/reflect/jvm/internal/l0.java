package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.l;
import kotlin.reflect.jvm.internal.m;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u001b2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u001e\u0010#\u001a\u0004\u0018\u00010 *\u0006\u0012\u0002\b\u00030\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lkotlin/reflect/jvm/internal/l0;", "", "<init>", "()V", "Lkotlin/reflect/jvm/internal/impl/descriptors/z;", "descriptor", "", "b", "(Lkotlin/reflect/jvm/internal/impl/descriptors/z;)Z", "Lkotlin/reflect/jvm/internal/l$e;", "d", "(Lkotlin/reflect/jvm/internal/impl/descriptors/z;)Lkotlin/reflect/jvm/internal/l$e;", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "", "e", "(Lkotlin/reflect/jvm/internal/impl/descriptors/b;)Ljava/lang/String;", "possiblySubstitutedFunction", "Lkotlin/reflect/jvm/internal/l;", "g", "(Lkotlin/reflect/jvm/internal/impl/descriptors/z;)Lkotlin/reflect/jvm/internal/l;", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "possiblyOverriddenProperty", "Lkotlin/reflect/jvm/internal/m;", "f", "(Lkotlin/reflect/jvm/internal/impl/descriptors/u0;)Lkotlin/reflect/jvm/internal/m;", "Ljava/lang/Class;", "klass", "Lkotlin/reflect/jvm/internal/impl/name/b;", "c", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/impl/name/b;", "Lkotlin/reflect/jvm/internal/impl/name/b;", "JAVA_LANG_VOID", "Lkotlin/reflect/jvm/internal/impl/builtins/i;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nRuntimeTypeMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/RuntimeTypeMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
/* loaded from: classes7.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final l0 f78709a = new l0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.b JAVA_LANG_VOID;

    static {
        kotlin.reflect.jvm.internal.impl.name.b m4 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("膮\u0001")));
        kotlin.jvm.internal.l0.o(m4, ProtectedSandApp.s("膯\u0001"));
        JAVA_LANG_VOID = m4;
    }

    private l0() {
    }

    private final kotlin.reflect.jvm.internal.impl.builtins.i a(Class<?> cls) {
        if (cls.isPrimitive()) {
            return kotlin.reflect.jvm.internal.impl.resolve.jvm.e.get(cls.getSimpleName()).getPrimitiveType();
        }
        return null;
    }

    private final boolean b(kotlin.reflect.jvm.internal.impl.descriptors.z descriptor) {
        if (kotlin.reflect.jvm.internal.impl.resolve.e.p(descriptor) || kotlin.reflect.jvm.internal.impl.resolve.e.q(descriptor)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.name.f name = descriptor.getName();
        kotlin.reflect.jvm.internal.impl.builtins.jvm.a.f75730e.getClass();
        return kotlin.jvm.internal.l0.g(name, kotlin.reflect.jvm.internal.impl.builtins.jvm.a.f75731f) && descriptor.i().isEmpty();
    }

    private final l.e d(kotlin.reflect.jvm.internal.impl.descriptors.z descriptor) {
        return new l.e(new d.b(e(descriptor), kotlin.reflect.jvm.internal.impl.load.kotlin.y.c(descriptor, false, false, 1, null)));
    }

    private final String e(kotlin.reflect.jvm.internal.impl.descriptors.b descriptor) {
        String b5 = kotlin.reflect.jvm.internal.impl.load.java.h0.b(descriptor);
        if (b5 != null) {
            return b5;
        }
        boolean z4 = descriptor instanceof v0;
        String s4 = ProtectedSandApp.s("膰\u0001");
        if (z4) {
            String b6 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.t(descriptor).getName().b();
            kotlin.jvm.internal.l0.o(b6, s4);
            return kotlin.reflect.jvm.internal.impl.load.java.a0.b(b6);
        }
        if (descriptor instanceof w0) {
            String b7 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.t(descriptor).getName().b();
            kotlin.jvm.internal.l0.o(b7, s4);
            return kotlin.reflect.jvm.internal.impl.load.java.a0.e(b7);
        }
        String b10 = descriptor.getName().b();
        kotlin.jvm.internal.l0.o(b10, s4);
        return b10;
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.name.b c(@fg.l Class<?> klass) {
        kotlin.jvm.internal.l0.p(klass, ProtectedSandApp.s("膱\u0001"));
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            kotlin.jvm.internal.l0.o(componentType, ProtectedSandApp.s("膲\u0001"));
            kotlin.reflect.jvm.internal.impl.builtins.i a5 = a(componentType);
            if (a5 != null) {
                return new kotlin.reflect.jvm.internal.impl.name.b(kotlin.reflect.jvm.internal.impl.builtins.l.f75836y, a5.getArrayTypeName());
            }
            kotlin.reflect.jvm.internal.impl.name.b m4 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.f75854i.l());
            kotlin.jvm.internal.l0.o(m4, ProtectedSandApp.s("膯\u0001"));
            return m4;
        }
        if (kotlin.jvm.internal.l0.g(klass, Void.TYPE)) {
            return JAVA_LANG_VOID;
        }
        kotlin.reflect.jvm.internal.impl.builtins.i a6 = a(klass);
        if (a6 != null) {
            return new kotlin.reflect.jvm.internal.impl.name.b(kotlin.reflect.jvm.internal.impl.builtins.l.f75836y, a6.getTypeName());
        }
        kotlin.reflect.jvm.internal.impl.name.b a7 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(klass);
        if (!a7.k()) {
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f75734a;
            kotlin.reflect.jvm.internal.impl.name.c b5 = a7.b();
            kotlin.jvm.internal.l0.o(b5, ProtectedSandApp.s("膳\u0001"));
            kotlin.reflect.jvm.internal.impl.name.b m5 = cVar.m(b5);
            if (m5 != null) {
                return m5;
            }
        }
        return a7;
    }

    @fg.l
    public final m f(@fg.l u0 possiblyOverriddenProperty) {
        kotlin.jvm.internal.l0.p(possiblyOverriddenProperty, ProtectedSandApp.s("膴\u0001"));
        u0 a5 = ((u0) kotlin.reflect.jvm.internal.impl.resolve.f.L(possiblyOverriddenProperty)).a();
        kotlin.jvm.internal.l0.o(a5, ProtectedSandApp.s("膵\u0001"));
        if (a5 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k kVar = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k) a5;
            a.n h12 = kVar.h1();
            h.g<a.n, a.d> gVar = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f77450d;
            kotlin.jvm.internal.l0.o(gVar, ProtectedSandApp.s("膶\u0001"));
            a.d dVar = (a.d) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(h12, gVar);
            if (dVar != null) {
                return new m.c(a5, h12, dVar, kVar.L(), kVar.I());
            }
        } else if (a5 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.f) {
            a1 f4 = ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.f) a5).f();
            vd.a aVar = f4 instanceof vd.a ? (vd.a) f4 : null;
            wd.l c5 = aVar != null ? aVar.c() : null;
            if (c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.r) {
                return new m.a(((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.r) c5).R());
            }
            if (!(c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u)) {
                throw new g0(ProtectedSandApp.s("膷\u0001") + a5 + ProtectedSandApp.s("膸\u0001") + c5 + ')');
            }
            Method R = ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u) c5).R();
            w0 setter = a5.getSetter();
            a1 f5 = setter != null ? setter.f() : null;
            vd.a aVar2 = f5 instanceof vd.a ? (vd.a) f5 : null;
            wd.l c6 = aVar2 != null ? aVar2.c() : null;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u uVar = c6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u ? (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u) c6 : null;
            return new m.b(R, uVar != null ? uVar.R() : null);
        }
        v0 getter = a5.getGetter();
        kotlin.jvm.internal.l0.m(getter);
        l.e d5 = d(getter);
        w0 setter2 = a5.getSetter();
        return new m.d(d5, setter2 != null ? d(setter2) : null);
    }

    @fg.l
    public final l g(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.z possiblySubstitutedFunction) {
        Method R;
        d.b b5;
        d.b e4;
        kotlin.jvm.internal.l0.p(possiblySubstitutedFunction, ProtectedSandApp.s("膹\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.z a5 = ((kotlin.reflect.jvm.internal.impl.descriptors.z) kotlin.reflect.jvm.internal.impl.resolve.f.L(possiblySubstitutedFunction)).a();
        kotlin.jvm.internal.l0.o(a5, ProtectedSandApp.s("膵\u0001"));
        if (!(a5 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c)) {
            if (a5 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) {
                a1 f4 = ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) a5).f();
                vd.a aVar = f4 instanceof vd.a ? (vd.a) f4 : null;
                wd.l c5 = aVar != null ? aVar.c() : null;
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u uVar = c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u ? (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u) c5 : null;
                if (uVar != null && (R = uVar.R()) != null) {
                    return new l.c(R);
                }
                throw new g0(ProtectedSandApp.s("臀\u0001") + a5);
            }
            boolean z4 = a5 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.b;
            String s4 = ProtectedSandApp.s("臁\u0001");
            if (!z4) {
                if (b(a5)) {
                    return d(a5);
                }
                throw new g0(ProtectedSandApp.s("臃\u0001") + a5 + s4 + a5.getClass() + ')');
            }
            a1 f5 = ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.b) a5).f();
            vd.a aVar2 = f5 instanceof vd.a ? (vd.a) f5 : null;
            wd.l c6 = aVar2 != null ? aVar2.c() : null;
            if (c6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.o) {
                return new l.b(((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.o) c6).R());
            }
            if (c6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l) {
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l lVar = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l) c6;
                if (lVar.t()) {
                    return new l.a(lVar.Q());
                }
            }
            throw new g0(ProtectedSandApp.s("臂\u0001") + a5 + s4 + c6 + ')');
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c cVar = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c) a5;
        kotlin.reflect.jvm.internal.impl.protobuf.o h02 = cVar.h0();
        if ((h02 instanceof a.i) && (e4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f77559a.e((a.i) h02, cVar.L(), cVar.I())) != null) {
            return new l.e(e4);
        }
        if (!(h02 instanceof a.d) || (b5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f77559a.b((a.d) h02, cVar.L(), cVar.I())) == null) {
            return d(a5);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.m c7 = possiblySubstitutedFunction.c();
        String s5 = ProtectedSandApp.s("膺\u0001");
        kotlin.jvm.internal.l0.o(c7, s5);
        if (kotlin.reflect.jvm.internal.impl.resolve.h.b(c7)) {
            return new l.e(b5);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.m c10 = possiblySubstitutedFunction.c();
        kotlin.jvm.internal.l0.o(c10, s5);
        if (!kotlin.reflect.jvm.internal.impl.resolve.h.d(c10)) {
            return new l.d(b5);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.l lVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.l) possiblySubstitutedFunction;
        boolean f02 = lVar2.f0();
        String s6 = ProtectedSandApp.s("膻\u0001");
        String s7 = ProtectedSandApp.s("膼\u0001");
        String s10 = ProtectedSandApp.s("膽\u0001");
        if (f02) {
            if (!kotlin.jvm.internal.l0.g(b5.c(), s7) || !kotlin.text.v.J1(b5.b(), s6, false, 2, null)) {
                throw new IllegalArgumentException((s10 + b5).toString());
            }
        } else {
            if (!kotlin.jvm.internal.l0.g(b5.c(), s7)) {
                throw new IllegalArgumentException((s10 + b5).toString());
            }
            kotlin.reflect.jvm.internal.impl.descriptors.e g02 = lVar2.g0();
            kotlin.jvm.internal.l0.o(g02, ProtectedSandApp.s("膾\u0001"));
            String t4 = kotlin.reflect.jvm.internal.calls.k.t(g02);
            if (kotlin.text.v.J1(b5.b(), s6, false, 2, null)) {
                b5 = d.b.e(b5, null, kotlin.text.v.g4(b5.b(), ProtectedSandApp.s("膿\u0001")) + t4, 1, null);
            } else if (!kotlin.text.v.J1(b5.b(), t4, false, 2, null)) {
                throw new IllegalArgumentException((s10 + b5).toString());
            }
        }
        return new l.e(b5);
    }
}
