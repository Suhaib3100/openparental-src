package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.j;
import kotlin.reflect.jvm.internal.k;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eJ\u0012\u0010\u0015\u001a\u00020\u00142\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0018*\u0006\u0012\u0002\b\u00030\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lkotlin/reflect/jvm/internal/j0;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/z;", "descriptor", "", "b", "Lkotlin/reflect/jvm/internal/j$e;", "d", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "", "e", "possiblySubstitutedFunction", "Lkotlin/reflect/jvm/internal/j;", "g", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "possiblyOverriddenProperty", "Lkotlin/reflect/jvm/internal/k;", "f", "Ljava/lang/Class;", "klass", "Lkotlin/reflect/jvm/internal/impl/name/b;", "c", "Lkotlin/reflect/jvm/internal/impl/name/b;", "JAVA_LANG_VOID", "Lkotlin/reflect/jvm/internal/impl/builtins/i;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final j0 f26695a = new j0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.b JAVA_LANG_VOID;

    static {
        kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("夾")));
        kotlin.jvm.internal.l0.o(m5, ProtectedSandApp.s("夿"));
        JAVA_LANG_VOID = m5;
    }

    private j0() {
    }

    private final kotlin.reflect.jvm.internal.impl.builtins.i a(Class<?> cls) {
        if (cls.isPrimitive()) {
            return kotlin.reflect.jvm.internal.impl.resolve.jvm.e.get(cls.getSimpleName()).getPrimitiveType();
        }
        return null;
    }

    private final boolean b(kotlin.reflect.jvm.internal.impl.descriptors.z descriptor) {
        if (kotlin.reflect.jvm.internal.impl.resolve.d.p(descriptor) || kotlin.reflect.jvm.internal.impl.resolve.d.q(descriptor)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.name.f name = descriptor.getName();
        kotlin.reflect.jvm.internal.impl.builtins.jvm.a.f23938e.getClass();
        return kotlin.jvm.internal.l0.g(name, kotlin.reflect.jvm.internal.impl.builtins.jvm.a.f23939f) && descriptor.n().isEmpty();
    }

    private final j.e d(kotlin.reflect.jvm.internal.impl.descriptors.z descriptor) {
        return new j.e(new d.b(e(descriptor), kotlin.reflect.jvm.internal.impl.load.kotlin.w.c(descriptor, false, false, 1, null)));
    }

    private final String e(kotlin.reflect.jvm.internal.impl.descriptors.b descriptor) {
        String b6 = kotlin.reflect.jvm.internal.impl.load.java.h0.b(descriptor);
        if (b6 != null) {
            return b6;
        }
        boolean z5 = descriptor instanceof v0;
        String s5 = ProtectedSandApp.s("奀");
        if (z5) {
            String h5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.s(descriptor).getName().h();
            kotlin.jvm.internal.l0.o(h5, s5);
            return kotlin.reflect.jvm.internal.impl.load.java.a0.b(h5);
        }
        if (descriptor instanceof w0) {
            String h6 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.s(descriptor).getName().h();
            kotlin.jvm.internal.l0.o(h6, s5);
            return kotlin.reflect.jvm.internal.impl.load.java.a0.e(h6);
        }
        String h7 = descriptor.getName().h();
        kotlin.jvm.internal.l0.o(h7, ProtectedSandApp.s("奁"));
        return h7;
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.name.b c(@d5.d Class<?> klass) {
        kotlin.jvm.internal.l0.p(klass, ProtectedSandApp.s("奂"));
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            kotlin.jvm.internal.l0.o(componentType, ProtectedSandApp.s("奃"));
            kotlin.reflect.jvm.internal.impl.builtins.i a6 = a(componentType);
            if (a6 != null) {
                return new kotlin.reflect.jvm.internal.impl.name.b(kotlin.reflect.jvm.internal.impl.builtins.l.f24035u, a6.getArrayTypeName());
            }
            kotlin.reflect.jvm.internal.impl.name.b m5 = kotlin.reflect.jvm.internal.impl.name.b.m(l.a.f24057i.l());
            kotlin.jvm.internal.l0.o(m5, ProtectedSandApp.s("奄"));
            return m5;
        }
        if (kotlin.jvm.internal.l0.g(klass, Void.TYPE)) {
            return JAVA_LANG_VOID;
        }
        kotlin.reflect.jvm.internal.impl.builtins.i a7 = a(klass);
        if (a7 != null) {
            return new kotlin.reflect.jvm.internal.impl.name.b(kotlin.reflect.jvm.internal.impl.builtins.l.f24035u, a7.getTypeName());
        }
        kotlin.reflect.jvm.internal.impl.name.b a8 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(klass);
        if (!a8.k()) {
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f23942a;
            kotlin.reflect.jvm.internal.impl.name.c b6 = a8.b();
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("奅"));
            kotlin.reflect.jvm.internal.impl.name.b m6 = cVar.m(b6);
            if (m6 != null) {
                return m6;
            }
        }
        return a8;
    }

    @d5.d
    public final k f(@d5.d u0 possiblyOverriddenProperty) {
        kotlin.jvm.internal.l0.p(possiblyOverriddenProperty, ProtectedSandApp.s("奆"));
        u0 a6 = ((u0) kotlin.reflect.jvm.internal.impl.resolve.e.L(possiblyOverriddenProperty)).a();
        kotlin.jvm.internal.l0.o(a6, ProtectedSandApp.s("奇"));
        if (a6 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k kVar = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k) a6;
            a.n n12 = kVar.n1();
            h.g<a.n, a.d> gVar = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f25472d;
            kotlin.jvm.internal.l0.o(gVar, ProtectedSandApp.s("奈"));
            a.d dVar = (a.d) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(n12, gVar);
            if (dVar != null) {
                return new k.c(a6, n12, dVar, kVar.g0(), kVar.a0());
            }
        } else if (a6 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.f) {
            a1 k5 = ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.f) a6).k();
            a4.a aVar = k5 instanceof a4.a ? (a4.a) k5 : null;
            b4.l b6 = aVar != null ? aVar.b() : null;
            if (b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.r) {
                return new k.a(((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.r) b6).X());
            }
            if (!(b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u)) {
                throw new e0(ProtectedSandApp.s("奉") + a6 + ProtectedSandApp.s("奊") + b6 + ')');
            }
            Method X = ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u) b6).X();
            w0 h5 = a6.h();
            a1 k6 = h5 != null ? h5.k() : null;
            a4.a aVar2 = k6 instanceof a4.a ? (a4.a) k6 : null;
            b4.l b7 = aVar2 != null ? aVar2.b() : null;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u uVar = b7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u ? (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u) b7 : null;
            return new k.b(X, uVar != null ? uVar.X() : null);
        }
        v0 e6 = a6.e();
        kotlin.jvm.internal.l0.m(e6);
        j.e d6 = d(e6);
        w0 h6 = a6.h();
        return new k.d(d6, h6 != null ? d(h6) : null);
    }

    @d5.d
    public final j g(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.z possiblySubstitutedFunction) {
        Method X;
        d.b b6;
        d.b e6;
        kotlin.jvm.internal.l0.p(possiblySubstitutedFunction, ProtectedSandApp.s("奋"));
        kotlin.reflect.jvm.internal.impl.descriptors.z a6 = ((kotlin.reflect.jvm.internal.impl.descriptors.z) kotlin.reflect.jvm.internal.impl.resolve.e.L(possiblySubstitutedFunction)).a();
        kotlin.jvm.internal.l0.o(a6, ProtectedSandApp.s("奌"));
        if (a6 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c cVar = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c) a6;
            kotlin.reflect.jvm.internal.impl.protobuf.o O = cVar.O();
            if ((O instanceof a.i) && (e6 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f25577a.e((a.i) O, cVar.g0(), cVar.a0())) != null) {
                return new j.e(e6);
            }
            if (!(O instanceof a.d) || (b6 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f25577a.b((a.d) O, cVar.g0(), cVar.a0())) == null) {
                return d(a6);
            }
            kotlin.reflect.jvm.internal.impl.descriptors.m b7 = possiblySubstitutedFunction.b();
            kotlin.jvm.internal.l0.o(b7, ProtectedSandApp.s("奍"));
            return kotlin.reflect.jvm.internal.impl.resolve.g.b(b7) ? new j.e(b6) : new j.d(b6);
        }
        if (a6 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) {
            a1 k5 = ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) a6).k();
            a4.a aVar = k5 instanceof a4.a ? (a4.a) k5 : null;
            b4.l b8 = aVar != null ? aVar.b() : null;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u uVar = b8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u ? (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u) b8 : null;
            if (uVar != null && (X = uVar.X()) != null) {
                return new j.c(X);
            }
            throw new e0(ProtectedSandApp.s("奎") + a6);
        }
        boolean z5 = a6 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.b;
        String s5 = ProtectedSandApp.s("奏");
        if (!z5) {
            if (b(a6)) {
                return d(a6);
            }
            throw new e0(ProtectedSandApp.s("契") + a6 + s5 + a6.getClass() + ')');
        }
        a1 k6 = ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.b) a6).k();
        a4.a aVar2 = k6 instanceof a4.a ? (a4.a) k6 : null;
        b4.l b9 = aVar2 != null ? aVar2.b() : null;
        if (b9 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.o) {
            return new j.b(((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.o) b9).X());
        }
        if (b9 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l) {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l lVar = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l) b9;
            if (lVar.x()) {
                return new j.a(lVar.W());
            }
        }
        throw new e0(ProtectedSandApp.s("奐") + a6 + s5 + b9 + ')');
    }
}
