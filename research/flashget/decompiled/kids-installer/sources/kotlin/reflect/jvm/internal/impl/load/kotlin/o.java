package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.m;
import kotlin.text.h0;

/* compiled from: methodSignatureMapping.kt */
/* loaded from: classes5.dex */
final class o implements n<m> {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final o f25065a = new o();

    /* compiled from: methodSignatureMapping.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25066a;

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
            f25066a = iArr;
        }
    }

    private o() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.n
    @d5.d
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public m d(@d5.d m mVar) {
        l0.p(mVar, ProtectedSandApp.s("䲜"));
        if (!(mVar instanceof m.d)) {
            return mVar;
        }
        m.d dVar = (m.d) mVar;
        if (dVar.i() == null) {
            return mVar;
        }
        String f6 = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.c(dVar.i().getWrapperFqName()).f();
        l0.o(f6, ProtectedSandApp.s("䲝"));
        return c(f6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.n
    @d5.d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public m b(@d5.d String str) {
        kotlin.reflect.jvm.internal.impl.resolve.jvm.e eVar;
        m cVar;
        l0.p(str, ProtectedSandApp.s("䲞"));
        str.getClass();
        char charAt = str.charAt(0);
        kotlin.reflect.jvm.internal.impl.resolve.jvm.e[] values = kotlin.reflect.jvm.internal.impl.resolve.jvm.e.values();
        int length = values.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                eVar = null;
                break;
            }
            eVar = values[i5];
            if (eVar.getDesc().charAt(0) == charAt) {
                break;
            }
            i5++;
        }
        if (eVar != null) {
            return new m.d(eVar);
        }
        if (charAt == 'V') {
            return new m.d(null);
        }
        if (charAt == '[') {
            String substring = str.substring(1);
            l0.o(substring, ProtectedSandApp.s("䲟"));
            cVar = new m.a(b(substring));
        } else {
            if (charAt == 'L') {
                h0.Y2(str, ';', false, 2, null);
            }
            String substring2 = str.substring(1, str.length() - 1);
            l0.o(substring2, ProtectedSandApp.s("䲠"));
            cVar = new m.c(substring2);
        }
        return cVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.n
    @d5.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public m.c c(@d5.d String str) {
        l0.p(str, ProtectedSandApp.s("䲡"));
        return new m.c(str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.n
    @d5.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public m f(@d5.d kotlin.reflect.jvm.internal.impl.builtins.i iVar) {
        l0.p(iVar, ProtectedSandApp.s("䲢"));
        switch (a.f25066a[iVar.ordinal()]) {
            case 1:
                m.f25053a.getClass();
                return m.f25054b;
            case 2:
                m.f25053a.getClass();
                return m.f25055c;
            case 3:
                m.f25053a.getClass();
                return m.f25056d;
            case 4:
                m.f25053a.getClass();
                return m.f25057e;
            case 5:
                m.f25053a.getClass();
                return m.f25058f;
            case 6:
                m.f25053a.getClass();
                return m.f25059g;
            case 7:
                m.f25053a.getClass();
                return m.f25060h;
            case 8:
                m.f25053a.getClass();
                return m.f25061i;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.n
    @d5.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public m e() {
        return c(ProtectedSandApp.s("䲣"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.n
    @d5.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String a(@d5.d m mVar) {
        String desc;
        l0.p(mVar, ProtectedSandApp.s("䲤"));
        if (mVar instanceof m.a) {
            return ProtectedSandApp.s("䲥") + a(((m.a) mVar).i());
        }
        if (mVar instanceof m.d) {
            kotlin.reflect.jvm.internal.impl.resolve.jvm.e i5 = ((m.d) mVar).i();
            return (i5 == null || (desc = i5.getDesc()) == null) ? ProtectedSandApp.s("䲦") : desc;
        }
        if (!(mVar instanceof m.c)) {
            throw new NoWhenBranchMatchedException();
        }
        return ProtectedSandApp.s("䲧") + ((m.c) mVar).i() + ';';
    }
}
