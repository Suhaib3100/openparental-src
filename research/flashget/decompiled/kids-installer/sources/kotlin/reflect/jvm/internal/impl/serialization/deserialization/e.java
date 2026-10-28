package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.IntIterator;
import kotlin.collections.e1;
import kotlin.collections.f1;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.a1;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.metadata.a;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: AnnotationDeserializer.kt */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final h0 f26181a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final k0 f26182b;

    /* compiled from: AnnotationDeserializer.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26183a;

        static {
            int[] iArr = new int[a.b.C0307b.c.EnumC0312c.values().length];
            try {
                iArr[a.b.C0307b.c.EnumC0312c.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.b.C0307b.c.EnumC0312c.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.b.C0307b.c.EnumC0312c.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.b.C0307b.c.EnumC0312c.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.b.C0307b.c.EnumC0312c.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.b.C0307b.c.EnumC0312c.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.b.C0307b.c.EnumC0312c.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.b.C0307b.c.EnumC0312c.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a.b.C0307b.c.EnumC0312c.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[a.b.C0307b.c.EnumC0312c.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[a.b.C0307b.c.EnumC0312c.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[a.b.C0307b.c.EnumC0312c.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[a.b.C0307b.c.EnumC0312c.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f26183a = iArr;
        }
    }

    public e(@d5.d h0 h0Var, @d5.d k0 k0Var) {
        l0.p(h0Var, ProtectedSandApp.s("只"));
        l0.p(k0Var, ProtectedSandApp.s("叫"));
        this.f26181a = h0Var;
        this.f26182b = k0Var;
    }

    private final boolean b(kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar, kotlin.reflect.jvm.internal.impl.types.h0 h0Var, a.b.C0307b.c cVar) {
        Iterable I;
        a.b.C0307b.c.EnumC0312c T = cVar.T();
        int i5 = T == null ? -1 : a.f26183a[T.ordinal()];
        if (i5 == 10) {
            kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h0Var.U0().b();
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) b6 : null;
            if (eVar != null && !kotlin.reflect.jvm.internal.impl.builtins.h.k0(eVar)) {
                return false;
            }
        } else {
            if (i5 != 13) {
                return l0.g(gVar.a(this.f26181a), h0Var);
            }
            if (!((gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.b) && ((kotlin.reflect.jvm.internal.impl.resolve.constants.b) gVar).b().size() == cVar.J().size())) {
                throw new IllegalStateException((ProtectedSandApp.s("叮") + gVar).toString());
            }
            kotlin.reflect.jvm.internal.impl.types.h0 k5 = c().k(h0Var);
            l0.o(k5, ProtectedSandApp.s("召"));
            kotlin.reflect.jvm.internal.impl.resolve.constants.b bVar = (kotlin.reflect.jvm.internal.impl.resolve.constants.b) gVar;
            I = kotlin.collections.a0.I(bVar.b());
            if (!(I instanceof Collection) || !((Collection) I).isEmpty()) {
                IntIterator it = I.iterator();
                while (it.hasNext()) {
                    int nextInt = it.nextInt();
                    kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar2 = bVar.b().get(nextInt);
                    a.b.C0307b.c H = cVar.H(nextInt);
                    l0.o(H, ProtectedSandApp.s("叭"));
                    if (!b(gVar2, k5, H)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private final kotlin.reflect.jvm.internal.impl.builtins.h c() {
        return this.f26181a.A();
    }

    private final Pair<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> d(a.b.C0307b c0307b, Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends j1> map, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        j1 j1Var = map.get(y.b(cVar, c0307b.v()));
        if (j1Var == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.f b6 = y.b(cVar, c0307b.v());
        kotlin.reflect.jvm.internal.impl.types.h0 type = j1Var.getType();
        l0.o(type, ProtectedSandApp.s("可"));
        a.b.C0307b.c w5 = c0307b.w();
        l0.o(w5, ProtectedSandApp.s("台"));
        return new Pair<>(b6, g(type, w5, cVar));
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.e e(kotlin.reflect.jvm.internal.impl.name.b bVar) {
        return kotlin.reflect.jvm.internal.impl.descriptors.y.c(this.f26181a, bVar, this.f26182b);
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> g(kotlin.reflect.jvm.internal.impl.types.h0 h0Var, a.b.C0307b.c cVar, kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar2) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> f6 = f(h0Var, cVar, cVar2);
        if (!b(f6, h0Var, cVar)) {
            f6 = null;
        }
        if (f6 != null) {
            return f6;
        }
        return kotlin.reflect.jvm.internal.impl.resolve.constants.k.f25904b.a(ProtectedSandApp.s("叱") + cVar.T() + ProtectedSandApp.s("史") + h0Var);
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(@d5.d a.b bVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar) {
        Map z5;
        Object i5;
        int b02;
        int j5;
        l0.p(bVar, ProtectedSandApp.s("右"));
        l0.p(cVar, ProtectedSandApp.s("叴"));
        kotlin.reflect.jvm.internal.impl.descriptors.e e6 = e(y.a(cVar, bVar.B()));
        z5 = f1.z();
        if (bVar.v() != 0 && !kotlin.reflect.jvm.internal.impl.types.error.k.m(e6) && kotlin.reflect.jvm.internal.impl.resolve.e.t(e6)) {
            Collection<kotlin.reflect.jvm.internal.impl.descriptors.d> l5 = e6.l();
            l0.o(l5, ProtectedSandApp.s("叵"));
            i5 = j0.i5(l5);
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) i5;
            if (dVar != null) {
                List<j1> n5 = dVar.n();
                l0.o(n5, ProtectedSandApp.s("叶"));
                b02 = kotlin.collections.b0.b0(n5, 10);
                j5 = e1.j(b02);
                if (j5 < 16) {
                    j5 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(j5);
                for (Object obj : n5) {
                    linkedHashMap.put(((j1) obj).getName(), obj);
                }
                List<a.b.C0307b> w5 = bVar.w();
                l0.o(w5, ProtectedSandApp.s("号"));
                ArrayList arrayList = new ArrayList();
                for (a.b.C0307b c0307b : w5) {
                    l0.o(c0307b, ProtectedSandApp.s("司"));
                    Pair<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> d6 = d(c0307b, linkedHashMap, cVar);
                    if (d6 != null) {
                        arrayList.add(d6);
                    }
                }
                z5 = f1.B0(arrayList);
            }
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.annotations.d(e6.E(), z5, a1.f24103a);
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> f(@d5.d kotlin.reflect.jvm.internal.impl.types.h0 h0Var, @d5.d a.b.C0307b.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar2) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> eVar;
        int b02;
        l0.p(h0Var, ProtectedSandApp.s("叹"));
        l0.p(cVar, ProtectedSandApp.s("叺"));
        l0.p(cVar2, ProtectedSandApp.s("叻"));
        Boolean d6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.O.d(cVar.P());
        l0.o(d6, ProtectedSandApp.s("叼"));
        boolean booleanValue = d6.booleanValue();
        a.b.C0307b.c.EnumC0312c T = cVar.T();
        switch (T == null ? -1 : a.f26183a[T.ordinal()]) {
            case 1:
                byte R = (byte) cVar.R();
                return booleanValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.w(R) : new kotlin.reflect.jvm.internal.impl.resolve.constants.d(R);
            case 2:
                eVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.e((char) cVar.R());
                break;
            case 3:
                short R2 = (short) cVar.R();
                return booleanValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.z(R2) : new kotlin.reflect.jvm.internal.impl.resolve.constants.u(R2);
            case 4:
                int R3 = (int) cVar.R();
                return booleanValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.x(R3) : new kotlin.reflect.jvm.internal.impl.resolve.constants.m(R3);
            case 5:
                long R4 = cVar.R();
                return booleanValue ? new kotlin.reflect.jvm.internal.impl.resolve.constants.y(R4) : new kotlin.reflect.jvm.internal.impl.resolve.constants.r(R4);
            case 6:
                eVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.l(cVar.Q());
                break;
            case 7:
                eVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.i(cVar.N());
                break;
            case 8:
                eVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.c(cVar.R() != 0);
                break;
            case 9:
                eVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.v(cVar2.getString(cVar.S()));
                break;
            case 10:
                eVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.q(y.a(cVar2, cVar.K()), cVar.G());
                break;
            case 11:
                eVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.j(y.a(cVar2, cVar.K()), y.b(cVar2, cVar.O()));
                break;
            case 12:
                a.b F = cVar.F();
                l0.o(F, ProtectedSandApp.s("吂"));
                eVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.a(a(F, cVar2));
                break;
            case 13:
                List<a.b.C0307b.c> J = cVar.J();
                l0.o(J, ProtectedSandApp.s("叿"));
                b02 = kotlin.collections.b0.b0(J, 10);
                ArrayList arrayList = new ArrayList(b02);
                for (a.b.C0307b.c cVar3 : J) {
                    p0 i5 = c().i();
                    l0.o(i5, ProtectedSandApp.s("吀"));
                    l0.o(cVar3, ProtectedSandApp.s("吁"));
                    arrayList.add(f(i5, cVar3, cVar2));
                }
                return new n(arrayList, h0Var);
            default:
                throw new IllegalStateException((ProtectedSandApp.s("叽") + cVar.T() + ProtectedSandApp.s("叾") + h0Var + ')').toString());
        }
        return eVar;
    }
}
