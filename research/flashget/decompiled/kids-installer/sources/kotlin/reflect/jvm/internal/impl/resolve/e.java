package kotlin.reflect.jvm.internal.impl.resolve;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.l1;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.t;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.t1;

/* compiled from: DescriptorUtils.java */
/* loaded from: classes5.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.reflect.jvm.internal.impl.name.c f25929a = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("凢"));

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f25930b = false;

    private e() {
    }

    public static boolean A(@d5.e kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        return D(mVar, kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_CLASS);
    }

    public static boolean B(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(36);
        }
        return D(mVar, kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_ENTRY);
    }

    public static boolean C(@d5.e kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        return D(mVar, kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE);
    }

    private static boolean D(@d5.e kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.f fVar) {
        if (fVar == null) {
            a(37);
        }
        return (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && ((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar).j() == fVar;
    }

    public static boolean E(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(1);
        }
        while (mVar != null) {
            if (u(mVar) || y(mVar)) {
                return true;
            }
            mVar = mVar.b();
        }
        return false;
    }

    private static boolean F(@d5.d h0 h0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (h0Var == null) {
            a(30);
        }
        if (mVar == null) {
            a(31);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h0Var.U0().b();
        if (b6 == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.m R0 = b6.R0();
        return (R0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.h) && (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.h) && ((kotlin.reflect.jvm.internal.impl.descriptors.h) mVar).m().equals(((kotlin.reflect.jvm.internal.impl.descriptors.h) R0).m());
    }

    public static boolean G(@d5.e kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        return (D(mVar, kotlin.reflect.jvm.internal.impl.descriptors.f.CLASS) || D(mVar, kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE)) && ((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar).r() == e0.SEALED;
    }

    public static boolean H(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar2) {
        if (eVar == null) {
            a(28);
        }
        if (eVar2 == null) {
            a(29);
        }
        return I(eVar.E(), eVar2.R0());
    }

    public static boolean I(@d5.d h0 h0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (h0Var == null) {
            a(32);
        }
        if (mVar == null) {
            a(33);
        }
        if (F(h0Var, mVar)) {
            return true;
        }
        Iterator<h0> it = h0Var.U0().m().iterator();
        while (it.hasNext()) {
            if (I(it.next(), mVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(@d5.e kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        return mVar != null && (mVar.b() instanceof l0);
    }

    public static boolean K(@d5.d l1 l1Var, @d5.d h0 h0Var) {
        if (l1Var == null) {
            a(63);
        }
        if (h0Var == null) {
            a(64);
        }
        if (l1Var.q0() || j0.a(h0Var)) {
            return false;
        }
        if (t1.b(h0Var)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.builtins.h j5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(l1Var);
        if (!kotlin.reflect.jvm.internal.impl.builtins.h.r0(h0Var)) {
            kotlin.reflect.jvm.internal.impl.types.checker.e eVar = kotlin.reflect.jvm.internal.impl.types.checker.e.f26341a;
            if (!eVar.b(j5.W(), h0Var) && !eVar.b(j5.K().E(), h0Var) && !eVar.b(j5.i(), h0Var)) {
                kotlin.reflect.jvm.internal.impl.builtins.p pVar = kotlin.reflect.jvm.internal.impl.builtins.p.f24094a;
                if (!kotlin.reflect.jvm.internal.impl.builtins.p.d(h0Var)) {
                    return false;
                }
            }
        }
        return true;
    }

    @d5.d
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> D L(@d5.d D d6) {
        if (d6 == null) {
            a(59);
        }
        while (d6.j() == b.a.FAKE_OVERRIDE) {
            Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> g5 = d6.g();
            if (g5.isEmpty()) {
                throw new IllegalStateException(ProtectedSandApp.s("凣") + d6);
            }
            d6 = (D) g5.iterator().next();
        }
        return d6;
    }

    @d5.d
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.q> D M(@d5.d D d6) {
        if (d6 == null) {
            a(61);
        }
        if (d6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) {
            return L((kotlin.reflect.jvm.internal.impl.descriptors.b) d6);
        }
        if (d6 == null) {
            a(62);
        }
        return d6;
    }

    private static /* synthetic */ void a(int i5) {
        String s5;
        int i6;
        switch (i5) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                s5 = ProtectedSandApp.s("凥");
                break;
            default:
                s5 = ProtectedSandApp.s("凤");
                break;
        }
        switch (i5) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                i6 = 2;
                break;
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        String s6 = ProtectedSandApp.s("処");
        switch (i5) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 79:
            case 92:
            case 94:
                objArr[0] = ProtectedSandApp.s("凾");
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                objArr[0] = s6;
                break;
            case 16:
                objArr[0] = ProtectedSandApp.s("函");
                break;
            case 17:
                objArr[0] = ProtectedSandApp.s("凼");
                break;
            case 18:
            case 19:
                objArr[0] = ProtectedSandApp.s("击");
                break;
            case 20:
                objArr[0] = ProtectedSandApp.s("出");
                break;
            case 25:
                objArr[0] = ProtectedSandApp.s("凹");
                break;
            case 26:
            case 28:
                objArr[0] = ProtectedSandApp.s("凸");
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = ProtectedSandApp.s("凷");
                break;
            case 30:
            case 32:
            case 45:
            case 64:
                objArr[0] = ProtectedSandApp.s("凶");
                break;
            case 31:
                objArr[0] = ProtectedSandApp.s("凵");
                break;
            case 37:
                objArr[0] = ProtectedSandApp.s("凴");
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 65:
            case 66:
            case 67:
            case 74:
            case 75:
                objArr[0] = ProtectedSandApp.s("凳");
                break;
            case 46:
                objArr[0] = ProtectedSandApp.s("凲");
                break;
            case 55:
                objArr[0] = ProtectedSandApp.s("凱");
                break;
            case 56:
                objArr[0] = ProtectedSandApp.s("凰");
                break;
            case 63:
                objArr[0] = ProtectedSandApp.s("凯");
                break;
            case 68:
                objArr[0] = ProtectedSandApp.s("凮");
                break;
            case 70:
                objArr[0] = ProtectedSandApp.s("凭");
                break;
            case 71:
                objArr[0] = ProtectedSandApp.s("凬");
                break;
            case 72:
                objArr[0] = ProtectedSandApp.s("凫");
                break;
            case 76:
            case 77:
            case 78:
                objArr[0] = ProtectedSandApp.s("凪");
                break;
            case 82:
            case 84:
            case 87:
            case 89:
                objArr[0] = ProtectedSandApp.s("凩");
                break;
            case 85:
            case 88:
            case 90:
                objArr[0] = ProtectedSandApp.s("凨");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("凧");
                break;
        }
        String s7 = ProtectedSandApp.s("凿");
        String s8 = ProtectedSandApp.s("刀");
        String s9 = ProtectedSandApp.s("刁");
        String s10 = ProtectedSandApp.s("刂");
        String s11 = ProtectedSandApp.s("刃");
        String s12 = ProtectedSandApp.s("刄");
        String s13 = ProtectedSandApp.s("刅");
        String s14 = ProtectedSandApp.s("分");
        String s15 = ProtectedSandApp.s("切");
        String s16 = ProtectedSandApp.s("刈");
        String s17 = ProtectedSandApp.s("刉");
        String s18 = ProtectedSandApp.s("刊");
        String s19 = ProtectedSandApp.s("刋");
        String s20 = ProtectedSandApp.s("刌");
        String s21 = ProtectedSandApp.s("刍");
        String s22 = ProtectedSandApp.s("刎");
        String s23 = ProtectedSandApp.s("刏");
        String s24 = ProtectedSandApp.s("刐");
        switch (i5) {
            case 4:
                objArr[1] = s24;
                break;
            case 7:
                objArr[1] = s23;
                break;
            case 9:
            case 10:
                objArr[1] = s22;
                break;
            case 12:
                objArr[1] = s21;
                break;
            case 22:
                objArr[1] = s20;
                break;
            case 40:
                objArr[1] = s19;
                break;
            case 42:
            case 43:
                objArr[1] = s18;
                break;
            case 47:
                objArr[1] = s17;
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = s16;
                break;
            case 60:
                objArr[1] = s15;
                break;
            case 62:
                objArr[1] = s14;
                break;
            case 69:
                objArr[1] = s13;
                break;
            case 73:
                objArr[1] = s12;
                break;
            case 80:
            case 81:
                objArr[1] = s11;
                break;
            case 83:
                objArr[1] = s10;
                break;
            case 86:
                objArr[1] = s9;
                break;
            case 91:
                objArr[1] = s8;
                break;
            case 93:
                objArr[1] = s7;
                break;
            default:
                objArr[1] = s6;
                break;
        }
        switch (i5) {
            case 1:
                objArr[2] = ProtectedSandApp.s("制");
                break;
            case 2:
                objArr[2] = ProtectedSandApp.s("刵");
                break;
            case 3:
                objArr[2] = s24;
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                break;
            case 5:
                objArr[2] = ProtectedSandApp.s("刴");
                break;
            case 6:
                objArr[2] = s23;
                break;
            case 8:
                objArr[2] = s22;
                break;
            case 11:
                objArr[2] = s21;
                break;
            case 13:
                objArr[2] = ProtectedSandApp.s("刳");
                break;
            case 14:
                objArr[2] = ProtectedSandApp.s("刲");
                break;
            case 15:
                objArr[2] = ProtectedSandApp.s("刱");
                break;
            case 16:
            case 17:
                objArr[2] = ProtectedSandApp.s("到");
                break;
            case 18:
            case 19:
                objArr[2] = ProtectedSandApp.s("刯");
                break;
            case 20:
            case 23:
                objArr[2] = ProtectedSandApp.s("刮");
                break;
            case 21:
                objArr[2] = s20;
                break;
            case 24:
                objArr[2] = ProtectedSandApp.s("刭");
                break;
            case 25:
                objArr[2] = ProtectedSandApp.s("刬");
                break;
            case 26:
            case 27:
                objArr[2] = ProtectedSandApp.s("别");
                break;
            case 28:
            case 29:
                objArr[2] = ProtectedSandApp.s("刪");
                break;
            case 30:
            case 31:
                objArr[2] = ProtectedSandApp.s("利");
                break;
            case 32:
            case 33:
                objArr[2] = ProtectedSandApp.s("刨");
                break;
            case 34:
                objArr[2] = ProtectedSandApp.s("刧");
                break;
            case 35:
                objArr[2] = ProtectedSandApp.s("刦");
                break;
            case 36:
                objArr[2] = ProtectedSandApp.s("別");
                break;
            case 37:
                objArr[2] = ProtectedSandApp.s("判");
                break;
            case 38:
                objArr[2] = ProtectedSandApp.s("刣");
                break;
            case 39:
                objArr[2] = s19;
                break;
            case 41:
                objArr[2] = s18;
                break;
            case 44:
                objArr[2] = ProtectedSandApp.s("刢");
                break;
            case 45:
                objArr[2] = ProtectedSandApp.s("刡");
                break;
            case 46:
                objArr[2] = s17;
                break;
            case 48:
                objArr[2] = s16;
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = ProtectedSandApp.s("删");
                break;
            case 57:
                objArr[2] = ProtectedSandApp.s("刟");
                break;
            case 58:
                objArr[2] = ProtectedSandApp.s("刞");
                break;
            case 59:
                objArr[2] = s15;
                break;
            case 61:
                objArr[2] = s14;
                break;
            case 63:
            case 64:
                objArr[2] = ProtectedSandApp.s("初");
                break;
            case 65:
                objArr[2] = ProtectedSandApp.s("刜");
                break;
            case 66:
                objArr[2] = ProtectedSandApp.s("创");
                break;
            case 67:
                objArr[2] = ProtectedSandApp.s("刚");
                break;
            case 68:
                objArr[2] = s13;
                break;
            case 70:
            case 71:
                objArr[2] = ProtectedSandApp.s("则");
                break;
            case 72:
                objArr[2] = s12;
                break;
            case 74:
                objArr[2] = ProtectedSandApp.s("刘");
                break;
            case 75:
                objArr[2] = ProtectedSandApp.s("列");
                break;
            case 76:
                objArr[2] = ProtectedSandApp.s("刖");
                break;
            case 77:
                objArr[2] = ProtectedSandApp.s("刕");
                break;
            case 78:
                objArr[2] = ProtectedSandApp.s("刔");
                break;
            case 79:
                objArr[2] = s11;
                break;
            case 82:
                objArr[2] = s10;
                break;
            case 84:
            case 85:
                objArr[2] = s9;
                break;
            case 87:
            case 88:
                objArr[2] = ProtectedSandApp.s("刓");
                break;
            case 89:
            case 90:
                objArr[2] = s8;
                break;
            case 92:
                objArr[2] = s7;
                break;
            case 94:
                objArr[2] = ProtectedSandApp.s("划");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("刑");
                break;
        }
        String format = String.format(s5, objArr);
        switch (i5) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static boolean b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar2) {
        if (mVar == null) {
            a(16);
        }
        if (mVar2 == null) {
            a(17);
        }
        return g(mVar).equals(g(mVar2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> void c(@d5.d D d6, @d5.d Set<D> set) {
        if (d6 == null) {
            a(70);
        }
        if (set == 0) {
            a(71);
        }
        if (set.contains(d6)) {
            return;
        }
        Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> it = d6.R0().g().iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.a R0 = it.next().R0();
            c(R0, set);
            set.add(R0);
        }
    }

    @d5.d
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> Set<D> d(@d5.d D d6) {
        if (d6 == null) {
            a(68);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c(d6.R0(), linkedHashSet);
        return linkedHashSet;
    }

    @d5.d
    public static kotlin.reflect.jvm.internal.impl.descriptors.e e(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(45);
        }
        return f(h0Var.U0());
    }

    @d5.d
    public static kotlin.reflect.jvm.internal.impl.descriptors.e f(@d5.d h1 h1Var) {
        if (h1Var == null) {
            a(46);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) h1Var.b();
        if (eVar == null) {
            a(47);
        }
        return eVar;
    }

    @d5.d
    public static kotlin.reflect.jvm.internal.impl.descriptors.h0 g(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(21);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h0 h5 = h(mVar);
        if (h5 == null) {
            a(22);
        }
        return h5;
    }

    @d5.e
    public static kotlin.reflect.jvm.internal.impl.descriptors.h0 h(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(23);
        }
        while (mVar != null) {
            if (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.h0) {
                return (kotlin.reflect.jvm.internal.impl.descriptors.h0) mVar;
            }
            if (mVar instanceof q0) {
                return ((q0) mVar).C0();
            }
            mVar = mVar.b();
        }
        return null;
    }

    @d5.e
    public static kotlin.reflect.jvm.internal.impl.descriptors.h0 i(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(20);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h0Var.U0().b();
        if (b6 == null) {
            return null;
        }
        return h(b6);
    }

    @d5.d
    public static b1 j(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(79);
        }
        if (mVar instanceof w0) {
            mVar = ((w0) mVar).I0();
        }
        if (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.p) {
            b1 a6 = ((kotlin.reflect.jvm.internal.impl.descriptors.p) mVar).k().a();
            if (a6 == null) {
                a(80);
            }
            return a6;
        }
        b1 b1Var = b1.f24130a;
        if (b1Var == null) {
            a(81);
        }
        return b1Var;
    }

    @d5.d
    public static u k(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, boolean z5) {
        if (eVar == null) {
            a(48);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f j5 = eVar.j();
        if (j5 == kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_CLASS || j5.isSingleton()) {
            u uVar = t.f24436a;
            if (uVar == null) {
                a(49);
            }
            return uVar;
        }
        if (G(eVar)) {
            if (z5) {
                u uVar2 = t.f24438c;
                if (uVar2 == null) {
                    a(50);
                }
                return uVar2;
            }
            u uVar3 = t.f24436a;
            if (uVar3 == null) {
                a(51);
            }
            return uVar3;
        }
        if (u(eVar)) {
            u uVar4 = t.f24447l;
            if (uVar4 == null) {
                a(52);
            }
            return uVar4;
        }
        u uVar5 = t.f24440e;
        if (uVar5 == null) {
            a(53);
        }
        return uVar5;
    }

    @d5.e
    public static x0 l(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(0);
        }
        if (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar).Q0();
        }
        return null;
    }

    @d5.d
    public static kotlin.reflect.jvm.internal.impl.name.d m(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(2);
        }
        kotlin.reflect.jvm.internal.impl.name.c o5 = o(mVar);
        return o5 != null ? o5.j() : p(mVar);
    }

    @d5.d
    public static kotlin.reflect.jvm.internal.impl.name.c n(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(3);
        }
        kotlin.reflect.jvm.internal.impl.name.c o5 = o(mVar);
        if (o5 == null) {
            o5 = p(mVar).l();
        }
        if (o5 == null) {
            a(4);
        }
        return o5;
    }

    @d5.e
    private static kotlin.reflect.jvm.internal.impl.name.c o(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(5);
        }
        if ((mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.h0) || kotlin.reflect.jvm.internal.impl.types.error.k.m(mVar)) {
            return kotlin.reflect.jvm.internal.impl.name.c.f25590c;
        }
        if (mVar instanceof q0) {
            return ((q0) mVar).f();
        }
        if (mVar instanceof l0) {
            return ((l0) mVar).f();
        }
        return null;
    }

    @d5.d
    private static kotlin.reflect.jvm.internal.impl.name.d p(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(6);
        }
        kotlin.reflect.jvm.internal.impl.name.d c6 = m(mVar.b()).c(mVar.getName());
        if (c6 == null) {
            a(7);
        }
        return c6;
    }

    @d5.e
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.m> D q(@d5.e kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d Class<D> cls) {
        if (cls == null) {
            a(18);
        }
        return (D) r(mVar, cls, true);
    }

    @d5.e
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.m> D r(@d5.e kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @d5.d Class<D> cls, boolean z5) {
        if (cls == null) {
            a(19);
        }
        if (mVar == null) {
            return null;
        }
        if (z5) {
            mVar = (D) mVar.b();
        }
        while (mVar != null) {
            if (cls.isInstance(mVar)) {
                return (D) mVar;
            }
            mVar = (D) mVar.b();
        }
        return null;
    }

    @d5.e
    public static kotlin.reflect.jvm.internal.impl.descriptors.e s(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(44);
        }
        Iterator<h0> it = eVar.m().m().iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.e e6 = e(it.next());
            if (e6.j() != kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE) {
                return e6;
            }
        }
        return null;
    }

    public static boolean t(@d5.e kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        return D(mVar, kotlin.reflect.jvm.internal.impl.descriptors.f.ANNOTATION_CLASS);
    }

    public static boolean u(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(34);
        }
        return v(mVar) && mVar.getName().equals(kotlin.reflect.jvm.internal.impl.name.h.f25606b);
    }

    public static boolean v(@d5.e kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        return D(mVar, kotlin.reflect.jvm.internal.impl.descriptors.f.CLASS);
    }

    public static boolean w(@d5.e kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        return v(mVar) || A(mVar);
    }

    public static boolean x(@d5.e kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        return D(mVar, kotlin.reflect.jvm.internal.impl.descriptors.f.OBJECT) && ((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar).L();
    }

    public static boolean y(kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        return (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.q) && ((kotlin.reflect.jvm.internal.impl.descriptors.q) mVar).c() == t.f24441f;
    }

    public static boolean z(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar2) {
        if (eVar == null) {
            a(26);
        }
        if (eVar2 == null) {
            a(27);
        }
        Iterator<h0> it = eVar.m().m().iterator();
        while (it.hasNext()) {
            if (F(it.next(), eVar2.R0())) {
                return true;
            }
        }
        return false;
    }
}
