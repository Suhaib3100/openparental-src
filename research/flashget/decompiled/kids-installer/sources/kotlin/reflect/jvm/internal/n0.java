package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.f1;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.n1;
import kotlin.reflect.KCallable;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.l;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.resolve.constants.q;
import kotlin.text.Typography;

/* compiled from: util.kt */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a(\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002\u001a.\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a\u0014\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0000\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0000\u001a\u0012\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u0012H\u0000\u001a\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002\u001a\u000e\u0010\u0018\u001a\u0004\u0018\u00010\u0014*\u00020\u0017H\u0002\u001a\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a*\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001e*\u0004\u0018\u00010\u001aH\u0000\u001a\u0014\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010 *\u0004\u0018\u00010\u001aH\u0000\u001a\u0014\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\"*\u0004\u0018\u00010\u001aH\u0000\u001a\u0012\u0010&\u001a\u0004\u0018\u00010\u001a2\u0006\u0010%\u001a\u00020$H\u0000\u001an\u00107\u001a\u00028\u0001\"\b\b\u0000\u0010(*\u00020'\"\b\b\u0001\u0010**\u00020)2\n\u0010+\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010,\u001a\u00028\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u001d\u00106\u001a\u0019\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000103¢\u0006\u0002\b5H\u0000¢\u0006\u0004\b7\u00108\u001a'\u0010<\u001a\u00028\u0000\"\u0004\b\u0000\u001092\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:H\u0080\bø\u0001\u0000¢\u0006\u0004\b<\u0010=\"\u001a\u0010B\u001a\u00020>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010?\u001a\u0004\b@\u0010A\"\u0018\u0010G\u001a\u00020D*\u00020C8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F\"\u001a\u0010K\u001a\u0004\u0018\u00010H*\u00020)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006L"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "Ljava/lang/Class;", "p", "Ljava/lang/ClassLoader;", "classLoader", "Lkotlin/reflect/jvm/internal/impl/name/b;", "kotlinClassId", "", "arrayDimensions", "m", "", "packageName", "className", "l", "f", "Lkotlin/reflect/jvm/internal/impl/descriptors/u;", "Lkotlin/reflect/w;", "q", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;", "", "", "e", "s", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;", "o", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/g;", "", "r", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/b;", "a", "Lkotlin/reflect/jvm/internal/q;", "c", "Lkotlin/reflect/jvm/internal/z;", "d", "Lkotlin/reflect/jvm/internal/l;", "b", "Ljava/lang/reflect/Type;", "type", "g", "Lkotlin/reflect/jvm/internal/impl/protobuf/o;", "M", "Lkotlin/reflect/jvm/internal/impl/descriptors/a;", "D", "moduleAnchor", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/c;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/g;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/a;", "metadataVersion", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/x;", "Lkotlin/u;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lq3/p;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "R", "Lkotlin/Function0;", "block", "reflectionCall", "(Lq3/a;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/name/c;", "Lkotlin/reflect/jvm/internal/impl/name/c;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "JVM_STATIC", "Lkotlin/reflect/s;", "", "k", "(Lkotlin/reflect/s;)Z", "isInlineClassType", "Lkotlin/reflect/jvm/internal/impl/descriptors/x0;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f26773a = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("妫"));

    /* compiled from: util.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26774a;

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
            f26774a = iArr;
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
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.n0.a(kotlin.reflect.jvm.internal.impl.resolve.constants.b, java.lang.ClassLoader):java.lang.Object");
    }

    @d5.e
    public static final l<?> b(@d5.e Object obj) {
        l<?> lVar = obj instanceof l ? (l) obj : null;
        if (lVar != null) {
            return lVar;
        }
        q c6 = c(obj);
        return c6 != null ? c6 : d(obj);
    }

    @d5.e
    public static final q c(@d5.e Object obj) {
        q qVar = obj instanceof q ? (q) obj : null;
        if (qVar != null) {
            return qVar;
        }
        kotlin.jvm.internal.g0 g0Var = obj instanceof kotlin.jvm.internal.g0 ? (kotlin.jvm.internal.g0) obj : null;
        KCallable s02 = g0Var != null ? g0Var.s0() : null;
        if (s02 instanceof q) {
            return (q) s02;
        }
        return null;
    }

    @d5.e
    public static final z<?> d(@d5.e Object obj) {
        z<?> zVar = obj instanceof z ? (z) obj : null;
        if (zVar != null) {
            return zVar;
        }
        j1 j1Var = obj instanceof j1 ? (j1) obj : null;
        KCallable s02 = j1Var != null ? j1Var.s0() : null;
        if (s02 instanceof z) {
            return (z) s02;
        }
        return null;
    }

    @d5.d
    public static final List<Annotation> e(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.a aVar) {
        Annotation o5;
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("妺"));
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar : annotations) {
            a1 k5 = cVar.k();
            if (k5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.b) {
                o5 = ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.b) k5).d();
            } else if (k5 instanceof l.a) {
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.p d6 = ((l.a) k5).d();
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e eVar = d6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e ? (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e) d6 : null;
                o5 = eVar != null ? eVar.U() : null;
            } else {
                o5 = o(cVar);
            }
            if (o5 != null) {
                arrayList.add(o5);
            }
        }
        return s(arrayList);
    }

    @d5.d
    public static final Class<?> f(@d5.d Class<?> cls) {
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("妻"));
        return Array.newInstance(cls, 0).getClass();
    }

    @d5.e
    public static final Object g(@d5.d Type type) {
        kotlin.jvm.internal.l0.p(type, ProtectedSandApp.s("妼"));
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
            return Double.valueOf(com.google.firebase.remoteconfig.p.f18289o);
        }
        if (kotlin.jvm.internal.l0.g(type, Void.TYPE)) {
            throw new IllegalStateException(ProtectedSandApp.s("妽"));
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("妾") + type);
    }

    @d5.d
    public static final <M extends kotlin.reflect.jvm.internal.impl.protobuf.o, D extends kotlin.reflect.jvm.internal.impl.descriptors.a> D h(@d5.d Class<?> cls, @d5.d M m5, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar, @d5.d q3.p<? super kotlin.reflect.jvm.internal.impl.serialization.deserialization.x, ? super M, ? extends D> pVar) {
        List<a.s> n02;
        kotlin.jvm.internal.l0.p(cls, ProtectedSandApp.s("妿"));
        kotlin.jvm.internal.l0.p(m5, ProtectedSandApp.s("姀"));
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("姁"));
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("姂"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("姃"));
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("姄"));
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k b6 = f0.b(cls);
        if (m5 instanceof a.i) {
            n02 = ((a.i) m5).m0();
        } else {
            if (!(m5 instanceof a.n)) {
                throw new IllegalStateException((ProtectedSandApp.s("姆") + m5).toString());
            }
            n02 = ((a.n) m5).n0();
        }
        List<a.s> list = n02;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.k a6 = b6.a();
        kotlin.reflect.jvm.internal.impl.descriptors.h0 b7 = b6.b();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f25466b.getClass();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.h hVar = kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f25467c;
        kotlin.jvm.internal.l0.o(list, ProtectedSandApp.s("姅"));
        return pVar.g0(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.x(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.m(a6, cVar, b7, gVar, hVar, aVar, null, null, list)), m5);
    }

    @d5.e
    public static final x0 i(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("姇"));
        if (aVar.m0() == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.m b6 = aVar.b();
        kotlin.jvm.internal.l0.n(b6, ProtectedSandApp.s("姈"));
        return ((kotlin.reflect.jvm.internal.impl.descriptors.e) b6).Q0();
    }

    @d5.d
    public static final kotlin.reflect.jvm.internal.impl.name.c j() {
        return f26773a;
    }

    public static final boolean k(@d5.d KType kType) {
        kotlin.reflect.jvm.internal.impl.types.h0 type;
        kotlin.jvm.internal.l0.p(kType, ProtectedSandApp.s("姉"));
        b0 b0Var = kType instanceof b0 ? (b0) kType : null;
        return (b0Var == null || (type = b0Var.getType()) == null || !kotlin.reflect.jvm.internal.impl.resolve.g.c(type)) ? false : true;
    }

    private static final Class<?> l(ClassLoader classLoader, String str, String str2, int i5) {
        String h22;
        String e22;
        if (kotlin.jvm.internal.l0.g(str, ProtectedSandApp.s("姊"))) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals(ProtectedSandApp.s("姓"))) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals(ProtectedSandApp.s("姒"))) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals(ProtectedSandApp.s("姑"))) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals(ProtectedSandApp.s("姐"))) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals(ProtectedSandApp.s("姏"))) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals(ProtectedSandApp.s("姎"))) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals(ProtectedSandApp.s("姍"))) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals(ProtectedSandApp.s("姌"))) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals(ProtectedSandApp.s("始"))) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(org.apache.commons.io.k.f32026a);
        h22 = kotlin.text.e0.h2(str2, org.apache.commons.io.k.f32026a, Typography.f27127c, false, 4, null);
        sb.append(h22);
        String sb2 = sb.toString();
        if (i5 > 0) {
            StringBuilder sb3 = new StringBuilder();
            e22 = kotlin.text.e0.e2(ProtectedSandApp.s("委"), i5);
            sb3.append(e22);
            sb3.append('L');
            sb3.append(sb2);
            sb3.append(';');
            sb2 = sb3.toString();
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.e.a(classLoader, sb2);
    }

    private static final Class<?> m(ClassLoader classLoader, kotlin.reflect.jvm.internal.impl.name.b bVar, int i5) {
        kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f23942a;
        kotlin.reflect.jvm.internal.impl.name.d j5 = bVar.b().j();
        kotlin.jvm.internal.l0.o(j5, ProtectedSandApp.s("姕"));
        kotlin.reflect.jvm.internal.impl.name.b n5 = cVar.n(j5);
        if (n5 != null) {
            bVar = n5;
        }
        String b6 = bVar.h().b();
        kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("姖"));
        String b7 = bVar.i().b();
        kotlin.jvm.internal.l0.o(b7, ProtectedSandApp.s("姗"));
        return l(classLoader, b6, b7, i5);
    }

    static /* synthetic */ Class n(ClassLoader classLoader, kotlin.reflect.jvm.internal.impl.name.b bVar, int i5, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            i5 = 0;
        }
        return m(classLoader, bVar, i5);
    }

    private static final Annotation o(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        Map B0;
        kotlin.reflect.jvm.internal.impl.descriptors.e i5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.i(cVar);
        Class<?> p5 = i5 != null ? p(i5) : null;
        if (!(p5 instanceof Class)) {
            p5 = null;
        }
        if (p5 == null) {
            return null;
        }
        Set<Map.Entry<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> entrySet = cVar.a().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            kotlin.reflect.jvm.internal.impl.name.f fVar = (kotlin.reflect.jvm.internal.impl.name.f) entry.getKey();
            kotlin.reflect.jvm.internal.impl.resolve.constants.g gVar = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) entry.getValue();
            ClassLoader classLoader = p5.getClassLoader();
            kotlin.jvm.internal.l0.o(classLoader, ProtectedSandApp.s("姘"));
            Object r5 = r(gVar, classLoader);
            Pair pair = r5 != null ? new Pair(fVar.h(), r5) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        B0 = f1.B0(arrayList);
        return (Annotation) kotlin.reflect.jvm.internal.calls.c.e(p5, B0, null, 4, null);
    }

    @d5.e
    public static final Class<?> p(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("姙"));
        a1 k5 = eVar.k();
        kotlin.jvm.internal.l0.o(k5, ProtectedSandApp.s("姚"));
        if (k5 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.t) {
            kotlin.reflect.jvm.internal.impl.load.kotlin.r d6 = ((kotlin.reflect.jvm.internal.impl.load.kotlin.t) k5).d();
            kotlin.jvm.internal.l0.n(d6, ProtectedSandApp.s("姛"));
            return ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f) d6).d();
        }
        if (k5 instanceof l.a) {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.p d7 = ((l.a) k5).d();
            kotlin.jvm.internal.l0.n(d7, ProtectedSandApp.s("姜"));
            return ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l) d7).W();
        }
        kotlin.reflect.jvm.internal.impl.name.b k6 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.k(eVar);
        if (k6 == null) {
            return null;
        }
        return m(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.f(eVar.getClass()), k6, 0);
    }

    @d5.e
    public static final KVisibility q(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
        kotlin.jvm.internal.l0.p(uVar, ProtectedSandApp.s("姝"));
        if (kotlin.jvm.internal.l0.g(uVar, kotlin.reflect.jvm.internal.impl.descriptors.t.f24440e)) {
            return KVisibility.PUBLIC;
        }
        if (kotlin.jvm.internal.l0.g(uVar, kotlin.reflect.jvm.internal.impl.descriptors.t.f24438c)) {
            return KVisibility.PROTECTED;
        }
        if (kotlin.jvm.internal.l0.g(uVar, kotlin.reflect.jvm.internal.impl.descriptors.t.f24439d)) {
            return KVisibility.INTERNAL;
        }
        if (kotlin.jvm.internal.l0.g(uVar, kotlin.reflect.jvm.internal.impl.descriptors.t.f24436a) ? true : kotlin.jvm.internal.l0.g(uVar, kotlin.reflect.jvm.internal.impl.descriptors.t.f24437b)) {
            return KVisibility.PRIVATE;
        }
        return null;
    }

    private static final Object r(kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar, ClassLoader classLoader) {
        if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.a) {
            return o(((kotlin.reflect.jvm.internal.impl.resolve.constants.a) gVar).b());
        }
        if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.b) {
            return a((kotlin.reflect.jvm.internal.impl.resolve.constants.b) gVar, classLoader);
        }
        if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.j) {
            Pair<? extends kotlin.reflect.jvm.internal.impl.name.b, ? extends kotlin.reflect.jvm.internal.impl.name.f> b6 = ((kotlin.reflect.jvm.internal.impl.resolve.constants.j) gVar).b();
            kotlin.reflect.jvm.internal.impl.name.b a6 = b6.a();
            kotlin.reflect.jvm.internal.impl.name.f b7 = b6.b();
            Class n5 = n(classLoader, a6, 0, 4, null);
            if (n5 != null) {
                return Enum.valueOf(n5, b7.h());
            }
        } else if (gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.q) {
            q.b b8 = ((kotlin.reflect.jvm.internal.impl.resolve.constants.q) gVar).b();
            if (b8 instanceof q.b.C0373b) {
                q.b.C0373b c0373b = (q.b.C0373b) b8;
                return m(classLoader, c0373b.b(), c0373b.a());
            }
            if (!(b8 instanceof q.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            kotlin.reflect.jvm.internal.impl.descriptors.h b9 = ((q.b.a) b8).a().U0().b();
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = b9 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) b9 : null;
            if (eVar != null) {
                return p(eVar);
            }
        } else {
            if (!(gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.k ? true : gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.s)) {
                return gVar.b();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final List<Annotation> s(List<? extends Annotation> list) {
        boolean z5;
        List k5;
        boolean z6 = list instanceof Collection;
        String s5 = ProtectedSandApp.s("姞");
        if (!z6 || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.l0.g(p3.b.e(p3.b.a((Annotation) it.next())).getSimpleName(), s5)) {
                    z5 = true;
                    break;
                }
            }
        }
        z5 = false;
        if (!z5) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : list) {
            Class e6 = p3.b.e(p3.b.a(annotation));
            if (!kotlin.jvm.internal.l0.g(e6.getSimpleName(), s5) || e6.getAnnotation(n1.class) == null) {
                k5 = kotlin.collections.z.k(annotation);
            } else {
                Object invoke = e6.getDeclaredMethod(ProtectedSandApp.s("姟"), new Class[0]).invoke(annotation, new Object[0]);
                kotlin.jvm.internal.l0.n(invoke, ProtectedSandApp.s("姠"));
                k5 = kotlin.collections.p.t((Annotation[]) invoke);
            }
            kotlin.collections.f0.q0(arrayList, k5);
        }
        return arrayList;
    }
}
