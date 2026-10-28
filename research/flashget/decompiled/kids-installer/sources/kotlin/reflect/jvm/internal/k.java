package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.j;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/k;", "", "", "a", "<init>", "()V", "b", "c", "d", "Lkotlin/reflect/jvm/internal/k$a;", "Lkotlin/reflect/jvm/internal/k$b;", "Lkotlin/reflect/jvm/internal/k$c;", "Lkotlin/reflect/jvm/internal/k$d;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public abstract class k {

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/k$a;", "Lkotlin/reflect/jvm/internal/k;", "", "a", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Field;", "b", "()Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    public static final class a extends k {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final Field field;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@d5.d Field field) {
            super(null);
            kotlin.jvm.internal.l0.p(field, ProtectedSandApp.s("奒"));
            this.field = field;
        }

        @Override // kotlin.reflect.jvm.internal.k
        @d5.d
        /* renamed from: a */
        public String getString() {
            StringBuilder sb = new StringBuilder();
            String name = this.field.getName();
            kotlin.jvm.internal.l0.o(name, ProtectedSandApp.s("奓"));
            sb.append(kotlin.reflect.jvm.internal.impl.load.java.a0.b(name));
            sb.append(ProtectedSandApp.s("奔"));
            Class<?> type = this.field.getType();
            kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("奕"));
            sb.append(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.b(type));
            return sb.toString();
        }

        @d5.d
        /* renamed from: b, reason: from getter */
        public final Field getField() {
            return this.field;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/k$b;", "Lkotlin/reflect/jvm/internal/k;", "", "a", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "getterMethod", "c", "setterMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    public static final class b extends k {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final Method getterMethod;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private final Method setterMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@d5.d Method method, @d5.e Method method2) {
            super(null);
            kotlin.jvm.internal.l0.p(method, ProtectedSandApp.s("奖"));
            this.getterMethod = method;
            this.setterMethod = method2;
        }

        @Override // kotlin.reflect.jvm.internal.k
        @d5.d
        /* renamed from: a */
        public String getString() {
            String b6;
            b6 = k0.b(this.getterMethod);
            return b6;
        }

        @d5.d
        /* renamed from: b, reason: from getter */
        public final Method getGetterMethod() {
            return this.getterMethod;
        }

        @d5.e
        /* renamed from: c, reason: from getter */
        public final Method getSetterMethod() {
            return this.setterMethod;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lkotlin/reflect/jvm/internal/k$c;", "Lkotlin/reflect/jvm/internal/k;", "", "c", "a", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/metadata/a$n;", "b", "Lkotlin/reflect/jvm/internal/impl/metadata/a$n;", "getProto", "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$d;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$d;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/c;", "d", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/c;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/g;", "e", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/g;", "getTypeTable", "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;", "typeTable", "f", "Ljava/lang/String;", "string", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    public static final class c extends k {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final u0 descriptor;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final a.n proto;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final a.d signature;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g typeTable;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final String string;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@d5.d u0 u0Var, @d5.d a.n nVar, @d5.d a.d dVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar) {
            super(null);
            String a6;
            kotlin.jvm.internal.l0.p(u0Var, ProtectedSandApp.s("套"));
            kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("奘"));
            kotlin.jvm.internal.l0.p(dVar, ProtectedSandApp.s("奙"));
            kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("奚"));
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("奛"));
            this.descriptor = u0Var;
            this.proto = nVar;
            this.signature = dVar;
            this.nameResolver = cVar;
            this.typeTable = gVar;
            if (dVar.H()) {
                a6 = cVar.getString(dVar.C().w()) + cVar.getString(dVar.C().v());
            } else {
                d.a d6 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.d(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f25577a, nVar, cVar, gVar, false, 8, null);
                if (d6 == null) {
                    throw new e0(ProtectedSandApp.s("奝") + u0Var);
                }
                String d7 = d6.d();
                String e6 = d6.e();
                StringBuilder sb = new StringBuilder();
                sb.append(kotlin.reflect.jvm.internal.impl.load.java.a0.b(d7));
                a6 = androidx.fragment.app.e0.a(sb, c(), ProtectedSandApp.s("奜"), e6);
            }
            this.string = a6;
        }

        private final String c() {
            String s5;
            kotlin.reflect.jvm.internal.impl.descriptors.m b6 = this.descriptor.b();
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("奞"));
            boolean g5 = kotlin.jvm.internal.l0.g(this.descriptor.c(), kotlin.reflect.jvm.internal.impl.descriptors.t.f24439d);
            String s6 = ProtectedSandApp.s("奟");
            if (g5 && (b6 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e)) {
                a.c i12 = ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e) b6).i1();
                h.g<a.c, Integer> gVar = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f25477i;
                kotlin.jvm.internal.l0.o(gVar, ProtectedSandApp.s("奠"));
                Integer num = (Integer) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(i12, gVar);
                if (num == null || (s5 = this.nameResolver.getString(num.intValue())) == null) {
                    s5 = ProtectedSandApp.s("奡");
                }
                return s6 + kotlin.reflect.jvm.internal.impl.name.g.a(s5);
            }
            if (!kotlin.jvm.internal.l0.g(this.descriptor.c(), kotlin.reflect.jvm.internal.impl.descriptors.t.f24436a) || !(b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0)) {
                return "";
            }
            u0 u0Var = this.descriptor;
            kotlin.jvm.internal.l0.n(u0Var, ProtectedSandApp.s("奢"));
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g j02 = ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k) u0Var).j0();
            if (!(j02 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.l)) {
                return "";
            }
            kotlin.reflect.jvm.internal.impl.load.kotlin.l lVar = (kotlin.reflect.jvm.internal.impl.load.kotlin.l) j02;
            if (lVar.f() == null) {
                return "";
            }
            return s6 + lVar.h().h();
        }

        @Override // kotlin.reflect.jvm.internal.k
        @d5.d
        /* renamed from: a, reason: from getter */
        public String getString() {
            return this.string;
        }

        @d5.d
        /* renamed from: b, reason: from getter */
        public final u0 getDescriptor() {
            return this.descriptor;
        }

        @d5.d
        /* renamed from: d, reason: from getter */
        public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c getNameResolver() {
            return this.nameResolver;
        }

        @d5.d
        /* renamed from: e, reason: from getter */
        public final a.n getProto() {
            return this.proto;
        }

        @d5.d
        /* renamed from: f, reason: from getter */
        public final a.d getSignature() {
            return this.signature;
        }

        @d5.d
        /* renamed from: g, reason: from getter */
        public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g getTypeTable() {
            return this.typeTable;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/k$d;", "Lkotlin/reflect/jvm/internal/k;", "", "a", "Lkotlin/reflect/jvm/internal/j$e;", "Lkotlin/reflect/jvm/internal/j$e;", "b", "()Lkotlin/reflect/jvm/internal/j$e;", "getterSignature", "c", "setterSignature", "<init>", "(Lkotlin/reflect/jvm/internal/j$e;Lkotlin/reflect/jvm/internal/j$e;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    public static final class d extends k {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final j.e getterSignature;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private final j.e setterSignature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@d5.d j.e eVar, @d5.e j.e eVar2) {
            super(null);
            kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("奣"));
            this.getterSignature = eVar;
            this.setterSignature = eVar2;
        }

        @Override // kotlin.reflect.jvm.internal.k
        @d5.d
        /* renamed from: a */
        public String getString() {
            return this.getterSignature.get_signature();
        }

        @d5.d
        /* renamed from: b, reason: from getter */
        public final j.e getGetterSignature() {
            return this.getterSignature;
        }

        @d5.e
        /* renamed from: c, reason: from getter */
        public final j.e getSetterSignature() {
            return this.setterSignature;
        }
    }

    public /* synthetic */ k(kotlin.jvm.internal.w wVar) {
        this();
    }

    @d5.d
    /* renamed from: a */
    public abstract String getString();

    private k() {
    }
}
