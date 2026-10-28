package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.u0;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: AnnotationDeserializer.kt */
@r1({"SMAP\nAnnotationDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/AnnotationDeserializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n121#1:147\n121#1:148\n121#1:149\n121#1:150\n1194#2,2:128\n1222#2,4:130\n1603#2,9:134\n1855#2:143\n1856#2:145\n1612#2:146\n1549#2:151\n1620#2,3:152\n1726#2,3:155\n1#3:144\n*S KotlinDebug\n*F\n+ 1 AnnotationDeserializer.kt\norg/jetbrains/kotlin/serialization/deserialization/AnnotationDeserializer\n*L\n74#1:147\n76#1:148\n77#1:149\n78#1:150\n47#1:128,2\n47#1:130,4\n48#1:134,9\n48#1:143\n48#1:145\n48#1:146\n87#1:151\n87#1:152,3\n112#1:155,3\n48#1:144\n*E\n"})
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.descriptors.h0 f78188a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final k0 f78189b;

    /* compiled from: AnnotationDeserializer.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78190a;

        static {
            int[] iArr = new int[a.b.C1112b.c.EnumC1117c.values().length];
            try {
                iArr[a.b.C1112b.c.EnumC1117c.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.b.C1112b.c.EnumC1117c.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.b.C1112b.c.EnumC1117c.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.b.C1112b.c.EnumC1117c.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.b.C1112b.c.EnumC1117c.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.b.C1112b.c.EnumC1117c.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.b.C1112b.c.EnumC1117c.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.b.C1112b.c.EnumC1117c.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a.b.C1112b.c.EnumC1117c.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[a.b.C1112b.c.EnumC1117c.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[a.b.C1112b.c.EnumC1117c.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[a.b.C1112b.c.EnumC1117c.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[a.b.C1112b.c.EnumC1117c.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f78190a = iArr;
        }
    }

    public e(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var, @fg.l k0 k0Var) {
        l0.p(h0Var, ProtectedSandApp.s("簖\u0001"));
        l0.p(k0Var, ProtectedSandApp.s("簗\u0001"));
        this.f78188a = h0Var;
        this.f78189b = k0Var;
    }

    private final boolean b(kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar, kotlin.reflect.jvm.internal.impl.types.h0 h0Var, a.b.C1112b.c cVar) {
        a.b.C1112b.c.EnumC1117c U = cVar.U();
        int i4 = U == null ? -1 : a.f78190a[U.ordinal()];
        if (i4 == 10) {
            kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h0Var.O0().c();
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) c5 : null;
            if (eVar != null && !kotlin.reflect.jvm.internal.impl.builtins.h.l0(eVar)) {
                return false;
            }
        } else {
            if (i4 != 13) {
                return l0.g(gVar.a(this.f78188a), h0Var);
            }
            if (!(gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.b) || ((kotlin.reflect.jvm.internal.impl.resolve.constants.b) gVar).b().size() != cVar.K().size()) {
                throw new IllegalStateException((ProtectedSandApp.s("簚\u0001") + gVar).toString());
            }
            kotlin.reflect.jvm.internal.impl.types.h0 k4 = this.f78188a.p().k(h0Var);
            l0.o(k4, ProtectedSandApp.s("簘\u0001"));
            kotlin.reflect.jvm.internal.impl.resolve.constants.b bVar = (kotlin.reflect.jvm.internal.impl.resolve.constants.b) gVar;
            Iterable I = kotlin.collections.w.I(bVar.b());
            if (!(I instanceof Collection) || !((Collection) I).isEmpty()) {
                Iterator it = I.iterator();
                while (it.hasNext()) {
                    int c6 = ((u0) it).c();
                    kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar2 = bVar.b().get(c6);
                    a.b.C1112b.c I2 = cVar.I(c6);
                    l0.o(I2, ProtectedSandApp.s("簙\u0001"));
                    if (!b(gVar2, k4, I2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private final kotlin.reflect.jvm.internal.impl.builtins.h c() {
        return this.f78188a.p();
    }

    private final q0<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> d(a.b.C1112b c1112b, Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends j1> map, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        j1 j1Var = map.get(z.b(cVar, c1112b.v()));
        if (j1Var == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.f b5 = z.b(cVar, c1112b.v());
        kotlin.reflect.jvm.internal.impl.types.h0 type = j1Var.getType();
        l0.o(type, ProtectedSandApp.s("簛\u0001"));
        a.b.C1112b.c x4 = c1112b.x();
        l0.o(x4, ProtectedSandApp.s("簜\u0001"));
        return new q0<>(b5, g(type, x4, cVar));
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.e e(kotlin.reflect.jvm.internal.impl.name.b bVar) {
        return kotlin.reflect.jvm.internal.impl.descriptors.y.c(this.f78188a, bVar, this.f78189b);
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> g(kotlin.reflect.jvm.internal.impl.types.h0 h0Var, a.b.C1112b.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar2) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> f4 = f(h0Var, cVar, cVar2);
        if (!b(f4, h0Var, cVar)) {
            f4 = null;
        }
        if (f4 != null) {
            return f4;
        }
        return kotlin.reflect.jvm.internal.impl.resolve.constants.k.f77880b.a(ProtectedSandApp.s("簝\u0001") + cVar.U() + ProtectedSandApp.s("簞\u0001") + h0Var);
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(@fg.l a.b bVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        l0.p(bVar, ProtectedSandApp.s("簟\u0001"));
        l0.p(cVar, ProtectedSandApp.s("簠\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.e e4 = e(z.a(cVar, bVar.C()));
        Map z4 = z0.z();
        if (bVar.v() != 0 && !kotlin.reflect.jvm.internal.impl.types.error.k.m(e4) && kotlin.reflect.jvm.internal.impl.resolve.f.t(e4)) {
            Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> h4 = e4.h();
            l0.o(h4, ProtectedSandApp.s("簡\u0001"));
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) kotlin.collections.w.i5(h4);
            if (dVar != null) {
                List<j1> i4 = dVar.i();
                l0.o(i4, ProtectedSandApp.s("簢\u0001"));
                List<j1> list = i4;
                int j4 = z0.j(kotlin.collections.w.b0(list, 10));
                if (j4 < 16) {
                    j4 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(j4);
                for (Object obj : list) {
                    linkedHashMap.put(((j1) obj).getName(), obj);
                }
                List<a.b.C1112b> x4 = bVar.x();
                l0.o(x4, ProtectedSandApp.s("簣\u0001"));
                ArrayList arrayList = new ArrayList();
                for (a.b.C1112b c1112b : x4) {
                    l0.m(c1112b);
                    q0<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> d5 = d(c1112b, linkedHashMap, cVar);
                    if (d5 != null) {
                        arrayList.add(d5);
                    }
                }
                z4 = z0.B0(arrayList);
            }
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.annotations.d(e4.r(), z4, a1.f75900a);
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> f(@fg.l kotlin.reflect.jvm.internal.impl.types.h0 h0Var, @fg.l a.b.C1112b.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar2) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> dVar;
        l0.p(h0Var, ProtectedSandApp.s("簤\u0001"));
        l0.p(cVar, ProtectedSandApp.s("簥\u0001"));
        l0.p(cVar2, ProtectedSandApp.s("簠\u0001"));
        Boolean d5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.P.d(cVar.Q());
        l0.o(d5, ProtectedSandApp.s("簦\u0001"));
        boolean booleanValue = d5.booleanValue();
        a.b.C1112b.c.EnumC1117c U = cVar.U();
        switch (U == null ? -1 : a.f78190a[U.ordinal()]) {
            case 1:
                byte S = (byte) cVar.S();
                if (booleanValue) {
                    dVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.x(S);
                    break;
                } else {
                    dVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.d(S);
                    break;
                }
            case 2:
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.e((char) cVar.S());
            case 3:
                short S2 = (short) cVar.S();
                if (booleanValue) {
                    dVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.a0(S2);
                    break;
                } else {
                    dVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.u(S2);
                    break;
                }
            case 4:
                int S3 = (int) cVar.S();
                if (booleanValue) {
                    dVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.y(S3);
                    break;
                } else {
                    dVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.m(S3);
                    break;
                }
            case 5:
                long S4 = cVar.S();
                return booleanValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.z(S4) : new kotlin.reflect.jvm.internal.impl.resolve.constants.r(S4);
            case 6:
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.l(cVar.R());
            case 7:
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.i(cVar.O());
            case 8:
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.c(cVar.S() != 0);
            case 9:
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.v(cVar2.getString(cVar.T()));
            case 10:
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.q(z.a(cVar2, cVar.L()), cVar.H());
            case 11:
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.j(z.a(cVar2, cVar.L()), z.b(cVar2, cVar.P()));
            case 12:
                a.b G = cVar.G();
                l0.o(G, ProtectedSandApp.s("簫\u0001"));
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.a(a(G, cVar2));
            case 13:
                kotlin.reflect.jvm.internal.impl.resolve.constants.h hVar = kotlin.reflect.jvm.internal.impl.resolve.constants.h.f77876a;
                List<a.b.C1112b.c> K = cVar.K();
                l0.o(K, ProtectedSandApp.s("簩\u0001"));
                List<a.b.C1112b.c> list = K;
                ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list, 10));
                for (a.b.C1112b.c cVar3 : list) {
                    p0 i4 = this.f78188a.p().i();
                    l0.o(i4, ProtectedSandApp.s("簪\u0001"));
                    l0.m(cVar3);
                    arrayList.add(f(i4, cVar3, cVar2));
                }
                return hVar.b(arrayList, h0Var);
            default:
                throw new IllegalStateException((ProtectedSandApp.s("簧\u0001") + cVar.U() + ProtectedSandApp.s("簨\u0001") + h0Var + ')').toString());
        }
        return dVar;
    }
}
