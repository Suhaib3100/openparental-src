package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.load.kotlin.o;

/* compiled from: methodSignatureMapping.kt */
@r1({"SMAP\nmethodSignatureMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 methodSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/JvmTypeFactoryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,200:1\n1#2:201\n1282#3,2:202\n*S KotlinDebug\n*F\n+ 1 methodSignatureMapping.kt\norg/jetbrains/kotlin/load/kotlin/JvmTypeFactoryImpl\n*L\n144#1:202,2\n*E\n"})
/* loaded from: classes7.dex */
final class q implements p<o> {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final q f76947a = new q();

    /* compiled from: methodSignatureMapping.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76948a;

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
            f76948a = iArr;
        }
    }

    private q() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.p
    public o f() {
        return e(ProtectedSandApp.s("璘\u0001"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.p
    @fg.l
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public o b(@fg.l o oVar) {
        l0.p(oVar, ProtectedSandApp.s("璙\u0001"));
        if (!(oVar instanceof o.d)) {
            return oVar;
        }
        o.d dVar = (o.d) oVar;
        if (dVar.i() == null) {
            return oVar;
        }
        String f4 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.c(dVar.i().getWrapperFqName()).f();
        l0.o(f4, ProtectedSandApp.s("璚\u0001"));
        return e(f4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.p
    @fg.l
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public o a(@fg.l String str) {
        kotlin.reflect.jvm.internal.impl.resolve.jvm.e eVar;
        o cVar;
        l0.p(str, ProtectedSandApp.s("璛\u0001"));
        str.length();
        char charAt = str.charAt(0);
        kotlin.reflect.jvm.internal.impl.resolve.jvm.e[] values = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                eVar = null;
                break;
            }
            eVar = values[i4];
            if (eVar.getDesc().charAt(0) == charAt) {
                break;
            }
            i4++;
        }
        if (eVar != null) {
            return new o.d(eVar);
        }
        if (charAt == 'V') {
            return new o.d(null);
        }
        String s4 = ProtectedSandApp.s("璜\u0001");
        if (charAt == '[') {
            String substring = str.substring(1);
            l0.o(substring, s4);
            cVar = new o.a(a(substring));
        } else {
            if (charAt == 'L') {
                kotlin.text.v.Y2(str, ';', false, 2, null);
            }
            String substring2 = str.substring(1, str.length() - 1);
            l0.o(substring2, s4);
            cVar = new o.c(substring2);
        }
        return cVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.p
    @fg.l
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public o.c e(@fg.l String str) {
        l0.p(str, ProtectedSandApp.s("璝\u0001"));
        return new o.c(str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.p
    @fg.l
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public o c(@fg.l kotlin.reflect.jvm.internal.impl.builtins.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("璞\u0001"));
        switch (a.f76948a[iVar.ordinal()]) {
            case 1:
                o.f76935a.getClass();
                return o.f76936b;
            case 2:
                o.f76935a.getClass();
                return o.f76937c;
            case 3:
                o.f76935a.getClass();
                return o.f76938d;
            case 4:
                o.f76935a.getClass();
                return o.f76939e;
            case 5:
                o.f76935a.getClass();
                return o.f76940f;
            case 6:
                o.f76935a.getClass();
                return o.f76941g;
            case 7:
                o.f76935a.getClass();
                return o.f76942h;
            case 8:
                o.f76935a.getClass();
                return o.f76943i;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @fg.l
    public o k() {
        return e(ProtectedSandApp.s("璘\u0001"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.p
    @fg.l
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String d(@fg.l o oVar) {
        String desc;
        l0.p(oVar, ProtectedSandApp.s("璟\u0001"));
        if (oVar instanceof o.a) {
            return ProtectedSandApp.s("璠\u0001") + d(((o.a) oVar).i());
        }
        if (oVar instanceof o.d) {
            kotlin.reflect.jvm.internal.impl.resolve.jvm.e i4 = ((o.d) oVar).i();
            return (i4 == null || (desc = i4.getDesc()) == null) ? ProtectedSandApp.s("璡\u0001") : desc;
        }
        if (!(oVar instanceof o.c)) {
            throw new NoWhenBranchMatchedException();
        }
        return ProtectedSandApp.s("璢\u0001") + ((o.c) oVar).i() + ';';
    }
}
