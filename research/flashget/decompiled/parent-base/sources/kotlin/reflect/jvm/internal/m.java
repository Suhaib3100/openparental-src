package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.l;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0005\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/m;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "b", "c", "d", "Lkotlin/reflect/jvm/internal/m$a;", "Lkotlin/reflect/jvm/internal/m$b;", "Lkotlin/reflect/jvm/internal/m$c;", "Lkotlin/reflect/jvm/internal/m$d;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class m {

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/m$a;", "Lkotlin/reflect/jvm/internal/m;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Field;", "b", "()Ljava/lang/reflect/Field;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends m {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Field field;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@fg.l Field field) {
            super(null);
            kotlin.jvm.internal.l0.p(field, ProtectedSandApp.s("臄\u0001"));
            this.field = field;
        }

        @Override // kotlin.reflect.jvm.internal.m
        @fg.l
        /* renamed from: a */
        public String getString() {
            StringBuilder sb = new StringBuilder();
            String name = this.field.getName();
            kotlin.jvm.internal.l0.o(name, ProtectedSandApp.s("臅\u0001"));
            sb.append(kotlin.reflect.jvm.internal.impl.load.java.a0.b(name));
            sb.append(ProtectedSandApp.s("臆\u0001"));
            Class<?> type = this.field.getType();
            kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("臇\u0001"));
            sb.append(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.b(type));
            return sb.toString();
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final Field getField() {
            return this.field;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/m$b;", "Lkotlin/reflect/jvm/internal/m;", "Ljava/lang/reflect/Method;", "getterMethod", "setterMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "c", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends m {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Method getterMethod;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final Method setterMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@fg.l Method method, @fg.m Method method2) {
            super(null);
            kotlin.jvm.internal.l0.p(method, ProtectedSandApp.s("臈\u0001"));
            this.getterMethod = method;
            this.setterMethod = method2;
        }

        @Override // kotlin.reflect.jvm.internal.m
        @fg.l
        /* renamed from: a */
        public String getString() {
            String b5;
            b5 = m0.b(this.getterMethod);
            return b5;
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final Method getGetterMethod() {
            return this.getterMethod;
        }

        @fg.m
        /* renamed from: c, reason: from getter */
        public final Method getSetterMethod() {
            return this.setterMethod;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lkotlin/reflect/jvm/internal/m$c;", "Lkotlin/reflect/jvm/internal/m;", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/metadata/a$n;", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$d;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/c;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/g;", "typeTable", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "", "c", "()Ljava/lang/String;", "a", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "b", "Lkotlin/reflect/jvm/internal/impl/metadata/a$n;", "getProto", "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/a$d;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "d", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/c;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "e", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/g;", "getTypeTable", "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;", "f", "Ljava/lang/String;", "string", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nRuntimeTypeMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
    public static final class c extends m {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final u0 descriptor;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final a.n proto;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final a.d signature;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g typeTable;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String string;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@fg.l u0 u0Var, @fg.l a.n nVar, @fg.l a.d dVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar) {
            super(null);
            String a5;
            kotlin.jvm.internal.l0.p(u0Var, ProtectedSandApp.s("臉\u0001"));
            kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("臊\u0001"));
            kotlin.jvm.internal.l0.p(dVar, ProtectedSandApp.s("臋\u0001"));
            kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("臌\u0001"));
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("臍\u0001"));
            this.descriptor = u0Var;
            this.proto = nVar;
            this.signature = dVar;
            this.nameResolver = cVar;
            this.typeTable = gVar;
            if (dVar.I()) {
                a5 = cVar.getString(dVar.D().x()) + cVar.getString(dVar.D().v());
            } else {
                d.a d5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.d(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f77559a, nVar, cVar, gVar, false, 8, null);
                if (d5 == null) {
                    throw new g0(ProtectedSandApp.s("臏\u0001") + u0Var);
                }
                String d6 = d5.d();
                String e4 = d5.e();
                StringBuilder sb = new StringBuilder();
                sb.append(kotlin.reflect.jvm.internal.impl.load.java.a0.b(d6));
                a5 = androidx.fragment.app.k0.a(sb, c(), ProtectedSandApp.s("臎\u0001"), e4);
            }
            this.string = a5;
        }

        private final String c() {
            String s4;
            kotlin.reflect.jvm.internal.impl.descriptors.m c5 = this.descriptor.c();
            kotlin.jvm.internal.l0.o(c5, ProtectedSandApp.s("臐\u0001"));
            boolean g4 = kotlin.jvm.internal.l0.g(this.descriptor.getVisibility(), kotlin.reflect.jvm.internal.impl.descriptors.t.f76289d);
            String s5 = ProtectedSandApp.s("臑\u0001");
            if (g4 && (c5 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e)) {
                a.c b12 = ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e) c5).b1();
                h.g<a.c, Integer> gVar = kotlin.reflect.jvm.internal.impl.metadata.jvm.a.f77455i;
                kotlin.jvm.internal.l0.o(gVar, ProtectedSandApp.s("臒\u0001"));
                Integer num = (Integer) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(b12, gVar);
                if (num == null || (s4 = this.nameResolver.getString(num.intValue())) == null) {
                    s4 = ProtectedSandApp.s("臓\u0001");
                }
                return s5 + kotlin.reflect.jvm.internal.impl.name.g.b(s4);
            }
            if (!kotlin.jvm.internal.l0.g(this.descriptor.getVisibility(), kotlin.reflect.jvm.internal.impl.descriptors.t.f76286a) || !(c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0)) {
                return "";
            }
            u0 u0Var = this.descriptor;
            kotlin.jvm.internal.l0.n(u0Var, ProtectedSandApp.s("臔\u0001"));
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g M = ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k) u0Var).M();
            if (!(M instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.n)) {
                return "";
            }
            kotlin.reflect.jvm.internal.impl.load.kotlin.n nVar = (kotlin.reflect.jvm.internal.impl.load.kotlin.n) M;
            if (nVar.f() == null) {
                return "";
            }
            return s5 + nVar.h().b();
        }

        @Override // kotlin.reflect.jvm.internal.m
        @fg.l
        /* renamed from: a, reason: from getter */
        public String getString() {
            return this.string;
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final u0 getDescriptor() {
            return this.descriptor;
        }

        @fg.l
        /* renamed from: d, reason: from getter */
        public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c getNameResolver() {
            return this.nameResolver;
        }

        @fg.l
        /* renamed from: e, reason: from getter */
        public final a.n getProto() {
            return this.proto;
        }

        @fg.l
        /* renamed from: f, reason: from getter */
        public final a.d getSignature() {
            return this.signature;
        }

        @fg.l
        /* renamed from: g, reason: from getter */
        public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g getTypeTable() {
            return this.typeTable;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/m$d;", "Lkotlin/reflect/jvm/internal/m;", "Lkotlin/reflect/jvm/internal/l$e;", "getterSignature", "setterSignature", "<init>", "(Lkotlin/reflect/jvm/internal/l$e;Lkotlin/reflect/jvm/internal/l$e;)V", "", "a", "()Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/l$e;", "b", "()Lkotlin/reflect/jvm/internal/l$e;", "c", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends m {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final l.e getterSignature;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final l.e setterSignature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@fg.l l.e eVar, @fg.m l.e eVar2) {
            super(null);
            kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("臕\u0001"));
            this.getterSignature = eVar;
            this.setterSignature = eVar2;
        }

        @Override // kotlin.reflect.jvm.internal.m
        @fg.l
        /* renamed from: a */
        public String getString() {
            return this.getterSignature.get_signature();
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final l.e getGetterSignature() {
            return this.getterSignature;
        }

        @fg.m
        /* renamed from: c, reason: from getter */
        public final l.e getSetterSignature() {
            return this.setterSignature;
        }
    }

    public /* synthetic */ m(kotlin.jvm.internal.w wVar) {
        this();
    }

    @fg.l
    /* renamed from: a */
    public abstract String getString();

    private m() {
    }
}
