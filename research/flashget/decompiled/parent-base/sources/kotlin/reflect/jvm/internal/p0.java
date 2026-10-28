package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.z0;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.n1;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.l;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.resolve.constants.q;

/* compiled from: util.kt */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0019*\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a!\u0010#\u001a\u0004\u0018\u00010\"*\u0006\u0012\u0002\b\u00030!2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$\u001a\u001d\u0010&\u001a\u0004\u0018\u00010\"*\u00020%2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010'\u001a\u0017\u0010)\u001a\u0004\u0018\u00010(*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b)\u0010*\u001a\u001b\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b,\u0010-\u001a\u001b\u0010/\u001a\b\u0012\u0002\b\u0003\u0018\u00010.*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b/\u00100\u001a\u0019\u00103\u001a\u0004\u0018\u00010\"2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104\u001a=\u00109\u001a\u0004\u0018\u000108*\u0006\u0012\u0002\b\u00030\u00012\u0006\u00105\u001a\u00020\f2\u001a\u00107\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000106\"\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b9\u0010:\u001a!\u0010<\u001a\u0004\u0018\u00010;*\u0006\u0012\u0002\b\u00030\u00012\u0006\u00105\u001a\u00020\fH\u0000¢\u0006\u0004\b<\u0010=\u001an\u0010N\u001a\u00028\u0001\"\b\b\u0000\u0010?*\u00020>\"\b\b\u0001\u0010A*\u00020@2\n\u0010B\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010C\u001a\u00028\u00002\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020H2\u001d\u0010M\u001a\u0019\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010J¢\u0006\u0002\bLH\u0000¢\u0006\u0004\bN\u0010O\u001a'\u0010S\u001a\u00028\u0000\"\u0004\b\u0000\u0010P2\f\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000QH\u0080\bø\u0001\u0000¢\u0006\u0004\bS\u0010T\"\u001a\u0010Y\u001a\u00020U8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010V\u001a\u0004\bW\u0010X\"\u0018\u0010^\u001a\u00020[*\u00020Z8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]\"\u0018\u0010`\u001a\u00020[*\u00020Z8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u0010]\"\u001a\u0010d\u001a\u0004\u0018\u00010a*\u00020@8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006e"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "Ljava/lang/Class;", "s", "(Lkotlin/reflect/jvm/internal/impl/descriptors/e;)Ljava/lang/Class;", "Ljava/lang/ClassLoader;", "classLoader", "Lkotlin/reflect/jvm/internal/impl/name/b;", "kotlinClassId", "", "arrayDimensions", "p", "(Ljava/lang/ClassLoader;Lkotlin/reflect/jvm/internal/impl/name/b;I)Ljava/lang/Class;", "", "packageName", "className", "o", "(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/Class;", "f", "(Ljava/lang/Class;)Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/u;", "Lkotlin/reflect/w;", "t", "(Lkotlin/reflect/jvm/internal/impl/descriptors/u;)Lkotlin/reflect/w;", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;", "", "", "e", "(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;)Ljava/util/List;", "v", "(Ljava/util/List;)Ljava/util/List;", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;", "r", "(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;)Ljava/lang/annotation/Annotation;", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/g;", "", "u", "(Lkotlin/reflect/jvm/internal/impl/resolve/constants/g;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/b;", "a", "(Lkotlin/reflect/jvm/internal/impl/resolve/constants/b;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/s;", "c", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/s;", "Lkotlin/reflect/jvm/internal/b0;", "d", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/b0;", "Lkotlin/reflect/jvm/internal/n;", "b", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/n;", "Ljava/lang/reflect/Type;", "type", "g", "(Ljava/lang/reflect/Type;)Ljava/lang/Object;", "name", "", "parameterTypes", "Ljava/lang/reflect/Method;", "j", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Field;", "i", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;", "Lkotlin/reflect/jvm/internal/impl/protobuf/o;", "M", "Lkotlin/reflect/jvm/internal/impl/descriptors/a;", "D", "moduleAnchor", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/c;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/g;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/a;", "metadataVersion", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/y;", "Lkotlin/u;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lld/p;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "R", "Lkotlin/Function0;", "block", "reflectionCall", "(Lld/a;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/name/c;", "Lkotlin/reflect/jvm/internal/impl/name/c;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "JVM_STATIC", "Lkotlin/reflect/s;", "", "n", "(Lkotlin/reflect/s;)Z", "isInlineClassType", "m", "needsMultiFieldValueClassFlattening", "Lkotlin/reflect/jvm/internal/impl/descriptors/x0;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nutil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 util.kt\nkotlin/reflect/jvm/internal/UtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,330:1\n1603#2,9:331\n1855#2:340\n1856#2:342\n1612#2:343\n1747#2,3:344\n1360#2:347\n1446#2,5:348\n1603#2,9:353\n1855#2:362\n1856#2:365\n1612#2:366\n1549#2:367\n1620#2,3:368\n1#3:341\n1#3:363\n1#3:364\n1#3:371\n*S KotlinDebug\n*F\n+ 1 util.kt\nkotlin/reflect/jvm/internal/UtilKt\n*L\n134#1:331,9\n134#1:340\n134#1:342\n134#1:343\n143#1:344,3\n144#1:347\n144#1:348,5\n164#1:353,9\n164#1:362\n164#1:365\n164#1:366\n194#1:367\n194#1:368,3\n134#1:341\n164#1:364\n*E\n"})
/* loaded from: classes7.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final kotlin.reflect.jvm.internal.impl.name.c f78791a = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("舮\u0001"));

    /* compiled from: util.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78792a;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.builtins.i.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.i.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.i.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.i.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.i.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.i.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.i.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.i.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.i.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f78792a = iArr;
        }
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r7v14, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r7v16, types: [byte[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v19, types: [float[]] */
    /* JADX WARN: Type inference failed for: r7v20, types: [long[]] */
    /* JADX WARN: Type inference failed for: r7v22, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.Object a(kotlin.reflect.jvm.internal.impl.resolve.constants.b r6, java.lang.ClassLoader r7) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.p0.a(kotlin.reflect.jvm.internal.impl.resolve.constants.b, java.lang.ClassLoader):java.lang.Object");
    }

    @fg.m
    public static final n<?> b(@fg.m Object obj) {
        n<?> nVar = obj instanceof n ? (n) obj : null;
        if (nVar != null) {
            return nVar;
        }
        s c5 = c(obj);
        return c5 != null ? c5 : d(obj);
    }

    @fg.m
    public static final s c(@fg.m Object obj) {
        s sVar = obj instanceof s ? (s) obj : null;
        if (sVar != null) {
            return sVar;
        }
        kotlin.jvm.internal.g0 g0Var = obj instanceof kotlin.jvm.internal.g0 ? (kotlin.jvm.internal.g0) obj : null;
        kotlin.reflect.c compute = g0Var != null ? g0Var.compute() : null;
        if (compute instanceof s) {
            return (s) compute;
        }
        return null;
    }

    @fg.m
    public static final b0<?> d(@fg.m Object obj) {
        b0<?> b0Var = obj instanceof b0 ? (b0) obj : null;
        if (b0Var != null) {
            return b0Var;
        }
        j1 j1Var = obj instanceof j1 ? (j1) obj : null;
        kotlin.reflect.c compute = j1Var != null ? j1Var.compute() : null;
        if (compute instanceof b0) {
            return (b0) compute;
        }
        return null;
    }

    @fg.l
    public static final List<Annotation> e(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar) {
        Annotation r4;
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("舽\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar : annotations) {
            a1 f4 = cVar.f();
            if (f4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.b) {
                r4 = ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.b) f4).d();
            } else if (f4 instanceof l.a) {
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.p d5 = ((l.a) f4).d();
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e eVar = d5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e ? (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e) d5 : null;
                r4 = eVar != null ? eVar.O() : null;
            } else {
                r4 = r(cVar);
            }
            if (r4 != null) {
                arrayList.add(r4);
            }
        }
        return v(arrayList);
    }

    @fg.l
    public static final Class<?> f(@fg.l Class<?> cls) {
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("舽\u0001"));
        return Array.newInstance(cls, 0).getClass();
    }

    @fg.m
    public static final Object g(@fg.l Type type) {
        kotlin.jvm.internal.l0.p(type, ProtectedSandApp.s("舾\u0001"));
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (kotlin.jvm.internal.l0.g(type, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (kotlin.jvm.internal.l0.g(type, Character.TYPE)) {
            return (char) 0;
        }
        if (kotlin.jvm.internal.l0.g(type, Byte.TYPE)) {
            return (byte) 0;
        }
        if (kotlin.jvm.internal.l0.g(type, Short.TYPE)) {
            return (short) 0;
        }
        if (kotlin.jvm.internal.l0.g(type, Integer.TYPE)) {
            return 0;
        }
        if (kotlin.jvm.internal.l0.g(type, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (kotlin.jvm.internal.l0.g(type, Long.TYPE)) {
            return 0L;
        }
        if (kotlin.jvm.internal.l0.g(type, Double.TYPE)) {
            return Double.valueOf(com.google.firebase.remoteconfig.p.f60679p);
        }
        if (kotlin.jvm.internal.l0.g(type, Void.TYPE)) {
            throw new IllegalStateException(ProtectedSandApp.s("舿\u0001"));
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("艀\u0001") + type);
    }

    @fg.l
    public static final <M extends kotlin.reflect.jvm.internal.impl.protobuf.o, D extends kotlin.reflect.jvm.internal.impl.descriptors.a> D h(@fg.l Class<?> cls, @fg.l M m4, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar, @fg.l ld.p<? super kotlin.reflect.jvm.internal.impl.serialization.deserialization.y, ? super M, ? extends D> pVar) {
        List<a.s> n02;
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("艁\u0001"));
        kotlin.jvm.internal.l0.p(m4, ProtectedSandApp.s("艂\u0001"));
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("艃\u0001"));
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("艄\u0001"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("艅\u0001"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("艆\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k b5 = h0.b(cls);
        if (m4 instanceof a.i) {
            n02 = ((a.i) m4).m0();
        } else {
            if (!(m4 instanceof a.n)) {
                throw new IllegalStateException((ProtectedSandApp.s("艇\u0001") + m4).toString());
            }
            n02 = ((a.n) m4).n0();
        }
        List<a.s> list = n02;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.k a5 = b5.a();
        kotlin.reflect.jvm.internal.impl.descriptors.h0 b6 = b5.b();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f77444b.getClass();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar = kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f77445c;
        kotlin.jvm.internal.l0.m(list);
        return pVar.invoke(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.y(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.m(a5, cVar, b6, gVar, hVar, aVar, null, null, list)), m4);
    }

    @fg.m
    public static final Field i(@fg.l Class<?> cls, @fg.l String str) {
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("舽\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("艈\u0001"));
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @fg.m
    public static final Method j(@fg.l Class<?> cls, @fg.l String str, @fg.l Class<?>... clsArr) {
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("舽\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("艈\u0001"));
        kotlin.jvm.internal.l0.p(clsArr, ProtectedSandApp.s("艉\u0001"));
        try {
            return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @fg.m
    public static final x0 k(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("舽\u0001"));
        if (aVar.O() == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.m c5 = aVar.c();
        kotlin.jvm.internal.l0.n(c5, ProtectedSandApp.s("艊\u0001"));
        return ((kotlin.reflect.jvm.internal.impl.descriptors.e) c5).K0();
    }

    @fg.l
    public static final kotlin.reflect.jvm.internal.impl.name.c l() {
        return f78791a;
    }

    public static final boolean m(@fg.l kotlin.reflect.s sVar) {
        kotlin.reflect.jvm.internal.impl.types.h0 type;
        kotlin.jvm.internal.l0.p(sVar, ProtectedSandApp.s("舽\u0001"));
        d0 d0Var = sVar instanceof d0 ? (d0) sVar : null;
        return (d0Var == null || (type = d0Var.getType()) == null || !kotlin.reflect.jvm.internal.impl.resolve.h.i(type)) ? false : true;
    }

    public static final boolean n(@fg.l kotlin.reflect.s sVar) {
        kotlin.reflect.jvm.internal.impl.types.h0 type;
        kotlin.jvm.internal.l0.p(sVar, ProtectedSandApp.s("舽\u0001"));
        d0 d0Var = sVar instanceof d0 ? (d0) sVar : null;
        return (d0Var == null || (type = d0Var.getType()) == null || !kotlin.reflect.jvm.internal.impl.resolve.h.c(type)) ? false : true;
    }

    private static final Class<?> o(ClassLoader classLoader, String str, String str2, int i4) {
        if (kotlin.jvm.internal.l0.g(str, ProtectedSandApp.s("艋\u0001"))) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals(ProtectedSandApp.s("艔\u0001"))) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals(ProtectedSandApp.s("艓\u0001"))) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals(ProtectedSandApp.s("艒\u0001"))) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals(ProtectedSandApp.s("艑\u0001"))) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals(ProtectedSandApp.s("艐\u0001"))) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals(ProtectedSandApp.s("艏\u0001"))) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals(ProtectedSandApp.s("艎\u0001"))) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals(ProtectedSandApp.s("艍\u0001"))) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals(ProtectedSandApp.s("艌\u0001"))) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i4 > 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                sb.append(ProtectedSandApp.s("艕\u0001"));
            }
            sb.append(ProtectedSandApp.s("艖\u0001"));
        }
        if (str.length() > 0) {
            sb.append(str + '.');
        }
        sb.append(kotlin.text.v.h2(str2, '.', '$', false, 4, null));
        if (i4 > 0) {
            sb.append(ProtectedSandApp.s("艗\u0001"));
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("艘\u0001"));
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.e.a(classLoader, sb2);
    }

    private static final Class<?> p(ClassLoader classLoader, kotlin.reflect.jvm.internal.impl.name.b bVar, int i4) {
        kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f75734a;
        kotlin.reflect.jvm.internal.impl.name.d j4 = bVar.b().j();
        kotlin.jvm.internal.l0.o(j4, ProtectedSandApp.s("艙\u0001"));
        kotlin.reflect.jvm.internal.impl.name.b n4 = cVar.n(j4);
        if (n4 != null) {
            bVar = n4;
        }
        String b5 = bVar.h().b();
        String s4 = ProtectedSandApp.s("艚\u0001");
        kotlin.jvm.internal.l0.o(b5, s4);
        String b6 = bVar.i().b();
        kotlin.jvm.internal.l0.o(b6, s4);
        return o(classLoader, b5, b6, i4);
    }

    static /* synthetic */ Class q(ClassLoader classLoader, kotlin.reflect.jvm.internal.impl.name.b bVar, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return p(classLoader, bVar, i4);
    }

    private static final Annotation r(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.e i4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.i(cVar);
        Class<?> s4 = i4 != null ? s(i4) : null;
        if (s4 == null) {
            s4 = null;
        }
        if (s4 == null) {
            return null;
        }
        Set<Map.Entry<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> entrySet = cVar.a().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            kotlin.reflect.jvm.internal.impl.name.f fVar = (kotlin.reflect.jvm.internal.impl.name.f) entry.getKey();
            kotlin.reflect.jvm.internal.impl.resolve.constants.g gVar = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) entry.getValue();
            ClassLoader classLoader = s4.getClassLoader();
            kotlin.jvm.internal.l0.o(classLoader, ProtectedSandApp.s("艛\u0001"));
            Object u4 = u(gVar, classLoader);
            kotlin.q0 q0Var = u4 != null ? new kotlin.q0(fVar.b(), u4) : null;
            if (q0Var != null) {
                arrayList.add(q0Var);
            }
        }
        return (Annotation) kotlin.reflect.jvm.internal.calls.c.e(s4, z0.B0(arrayList), null, 4, null);
    }

    @fg.m
    public static final Class<?> s(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("舽\u0001"));
        a1 f4 = eVar.f();
        kotlin.jvm.internal.l0.o(f4, ProtectedSandApp.s("艜\u0001"));
        if (f4 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.v) {
            kotlin.reflect.jvm.internal.impl.load.kotlin.t d5 = ((kotlin.reflect.jvm.internal.impl.load.kotlin.v) f4).d();
            kotlin.jvm.internal.l0.n(d5, ProtectedSandApp.s("艝\u0001"));
            return ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f) d5).a();
        }
        if (f4 instanceof l.a) {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.p d6 = ((l.a) f4).d();
            kotlin.jvm.internal.l0.n(d6, ProtectedSandApp.s("艞\u0001"));
            return ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l) d6).Q();
        }
        kotlin.reflect.jvm.internal.impl.name.b k4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.k(eVar);
        if (k4 == null) {
            return null;
        }
        return p(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.f(eVar.getClass()), k4, 0);
    }

    @fg.m
    public static final kotlin.reflect.w t(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
        kotlin.jvm.internal.l0.p(uVar, ProtectedSandApp.s("舽\u0001"));
        if (kotlin.jvm.internal.l0.g(uVar, kotlin.reflect.jvm.internal.impl.descriptors.t.f76290e)) {
            return kotlin.reflect.w.PUBLIC;
        }
        if (kotlin.jvm.internal.l0.g(uVar, kotlin.reflect.jvm.internal.impl.descriptors.t.f76288c)) {
            return kotlin.reflect.w.PROTECTED;
        }
        if (kotlin.jvm.internal.l0.g(uVar, kotlin.reflect.jvm.internal.impl.descriptors.t.f76289d)) {
            return kotlin.reflect.w.INTERNAL;
        }
        if (kotlin.jvm.internal.l0.g(uVar, kotlin.reflect.jvm.internal.impl.descriptors.t.f76286a) ? true : kotlin.jvm.internal.l0.g(uVar, kotlin.reflect.jvm.internal.impl.descriptors.t.f76287b)) {
            return kotlin.reflect.w.PRIVATE;
        }
        return null;
    }

    private static final Object u(kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar, ClassLoader classLoader) {
        if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.a) {
            return r(((kotlin.reflect.jvm.internal.impl.resolve.constants.a) gVar).b());
        }
        if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.b) {
            return a((kotlin.reflect.jvm.internal.impl.resolve.constants.b) gVar, classLoader);
        }
        if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.j) {
            kotlin.q0<? extends kotlin.reflect.jvm.internal.impl.name.b, ? extends kotlin.reflect.jvm.internal.impl.name.f> b5 = ((kotlin.reflect.jvm.internal.impl.resolve.constants.j) gVar).b();
            kotlin.reflect.jvm.internal.impl.name.b a5 = b5.a();
            kotlin.reflect.jvm.internal.impl.name.f b6 = b5.b();
            Class q4 = q(classLoader, a5, 0, 4, null);
            if (q4 != null) {
                return Enum.valueOf(q4, b6.b());
            }
        } else if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.q) {
            q.b b7 = ((kotlin.reflect.jvm.internal.impl.resolve.constants.q) gVar).b();
            if (b7 instanceof q.b.C1177b) {
                q.b.C1177b c1177b = (q.b.C1177b) b7;
                return p(classLoader, c1177b.b(), c1177b.a());
            }
            if (!(b7 instanceof q.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            kotlin.reflect.jvm.internal.impl.descriptors.h c5 = ((q.b.a) b7).a().O0().c();
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) c5 : null;
            if (eVar != null) {
                return s(eVar);
            }
        } else {
            if (!(gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.k ? true : gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.s)) {
                return gVar.b();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List<? extends java.lang.annotation.Annotation>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List<java.lang.annotation.Annotation>] */
    private static final List<Annotation> v(List<? extends Annotation> list) {
        List k4;
        Iterable<Annotation> iterable = (Iterable) list;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String simpleName = kd.b.e(kd.b.a((Annotation) it.next())).getSimpleName();
                String s4 = ProtectedSandApp.s("艟\u0001");
                if (kotlin.jvm.internal.l0.g(simpleName, s4)) {
                    list = new ArrayList<>();
                    for (Annotation annotation : iterable) {
                        Class e4 = kd.b.e(kd.b.a(annotation));
                        if (!kotlin.jvm.internal.l0.g(e4.getSimpleName(), s4) || e4.getAnnotation(n1.class) == null) {
                            k4 = kotlin.collections.w.k(annotation);
                        } else {
                            Object invoke = e4.getDeclaredMethod(ProtectedSandApp.s("艠\u0001"), null).invoke(annotation, null);
                            kotlin.jvm.internal.l0.n(invoke, ProtectedSandApp.s("艡\u0001"));
                            k4 = kotlin.collections.l.t((Annotation[]) invoke);
                        }
                        kotlin.collections.w.q0(list, k4);
                    }
                }
            }
        }
        return list;
    }
}
