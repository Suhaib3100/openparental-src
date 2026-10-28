package kotlin.reflect.jvm.internal.impl.resolve;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.t1;

/* compiled from: DescriptorUtils.java */
/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.reflect.jvm.internal.impl.name.c f77912a = new kotlin.reflect.jvm.internal.impl.name.c(ProtectedSandApp.s("礴\u0001"));

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f77913b = false;

    private f() {
    }

    public static boolean A(@fg.m kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        return D(mVar, kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_CLASS);
    }

    public static boolean B(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(36);
        }
        return D(mVar, kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_ENTRY);
    }

    public static boolean C(@fg.m kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        return D(mVar, kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE);
    }

    private static boolean D(@fg.m kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.f fVar) {
        if (fVar == null) {
            a(37);
        }
        return (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && ((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar).b() == fVar;
    }

    public static boolean E(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(1);
        }
        while (mVar != null) {
            if (u(mVar) || y(mVar)) {
                return true;
            }
            mVar = mVar.c();
        }
        return false;
    }

    private static boolean F(@fg.l h0 h0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (h0Var == null) {
            a(30);
        }
        if (mVar == null) {
            a(31);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h0Var.O0().c();
        if (c5 == null) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.m L0 = c5.L0();
        return (L0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.h) && (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.h) && ((kotlin.reflect.jvm.internal.impl.descriptors.h) mVar).j().equals(((kotlin.reflect.jvm.internal.impl.descriptors.h) L0).j());
    }

    public static boolean G(@fg.m kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        return (D(mVar, kotlin.reflect.jvm.internal.impl.descriptors.f.CLASS) || D(mVar, kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE)) && ((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar).u() == e0.SEALED;
    }

    public static boolean H(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar2) {
        if (eVar == null) {
            a(28);
        }
        if (eVar2 == null) {
            a(29);
        }
        return I(eVar.r(), eVar2.L0());
    }

    public static boolean I(@fg.l h0 h0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (h0Var == null) {
            a(32);
        }
        if (mVar == null) {
            a(33);
        }
        if (F(h0Var, mVar)) {
            return true;
        }
        Iterator<h0> it = h0Var.O0().j().iterator();
        while (it.hasNext()) {
            if (I(it.next(), mVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(@fg.m kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        return mVar != null && (mVar.c() instanceof l0);
    }

    public static boolean K(@fg.l l1 l1Var, @fg.l h0 h0Var) {
        if (l1Var == null) {
            a(66);
        }
        if (h0Var == null) {
            a(67);
        }
        if (l1Var.Q() || j0.a(h0Var)) {
            return false;
        }
        if (t1.b(h0Var)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.builtins.h j4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(l1Var);
        if (!kotlin.reflect.jvm.internal.impl.builtins.h.s0(h0Var)) {
            kotlin.reflect.jvm.internal.impl.types.checker.e eVar = kotlin.reflect.jvm.internal.impl.types.checker.e.f78349a;
            if (!eVar.b(j4.W(), h0Var) && !eVar.b(j4.K().r(), h0Var) && !eVar.b(j4.i(), h0Var)) {
                kotlin.reflect.jvm.internal.impl.builtins.p pVar = kotlin.reflect.jvm.internal.impl.builtins.p.f75891a;
                if (!kotlin.reflect.jvm.internal.impl.builtins.p.d(h0Var)) {
                    return false;
                }
            }
        }
        return true;
    }

    @fg.l
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> D L(@fg.l D d5) {
        if (d5 == null) {
            a(59);
        }
        while (d5.b() == b.a.FAKE_OVERRIDE) {
            Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> e4 = d5.e();
            if (e4.isEmpty()) {
                throw new IllegalStateException(ProtectedSandApp.s("礵\u0001") + d5);
            }
            d5 = (D) e4.iterator().next();
        }
        return d5;
    }

    @fg.l
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.q> D M(@fg.l D d5) {
        if (d5 == null) {
            a(64);
        }
        if (d5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) {
            return L((kotlin.reflect.jvm.internal.impl.descriptors.b) d5);
        }
        if (d5 == null) {
            a(65);
        }
        return d5;
    }

    private static /* synthetic */ void a(int i4) {
        String s4;
        int i5;
        switch (i4) {
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
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                s4 = ProtectedSandApp.s("礷\u0001");
                break;
            default:
                s4 = ProtectedSandApp.s("礶\u0001");
                break;
        }
        switch (i4) {
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
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i5 = 2;
                break;
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        String s5 = ProtectedSandApp.s("礸\u0001");
        switch (i4) {
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
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = ProtectedSandApp.s("祐\u0001");
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
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = s5;
                break;
            case 16:
                objArr[0] = ProtectedSandApp.s("祏\u0001");
                break;
            case 17:
                objArr[0] = ProtectedSandApp.s("祎\u0001");
                break;
            case 18:
            case 19:
                objArr[0] = ProtectedSandApp.s("祍\u0001");
                break;
            case 20:
                objArr[0] = ProtectedSandApp.s("祌\u0001");
                break;
            case 25:
                objArr[0] = ProtectedSandApp.s("祋\u0001");
                break;
            case 26:
            case 28:
                objArr[0] = ProtectedSandApp.s("祊\u0001");
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = ProtectedSandApp.s("祉\u0001");
                break;
            case 30:
            case 32:
            case 45:
            case 67:
                objArr[0] = ProtectedSandApp.s("祈\u0001");
                break;
            case 31:
                objArr[0] = ProtectedSandApp.s("祇\u0001");
                break;
            case 37:
                objArr[0] = ProtectedSandApp.s("祆\u0001");
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = ProtectedSandApp.s("祅\u0001");
                break;
            case 46:
                objArr[0] = ProtectedSandApp.s("祄\u0001");
                break;
            case 55:
                objArr[0] = ProtectedSandApp.s("祃\u0001");
                break;
            case 56:
                objArr[0] = ProtectedSandApp.s("祂\u0001");
                break;
            case 66:
                objArr[0] = ProtectedSandApp.s("祁\u0001");
                break;
            case 71:
                objArr[0] = ProtectedSandApp.s("祀\u0001");
                break;
            case 73:
                objArr[0] = ProtectedSandApp.s("礿\u0001");
                break;
            case 74:
                objArr[0] = ProtectedSandApp.s("社\u0001");
                break;
            case 75:
                objArr[0] = ProtectedSandApp.s("礽\u0001");
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = ProtectedSandApp.s("礼\u0001");
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = ProtectedSandApp.s("礻\u0001");
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = ProtectedSandApp.s("示\u0001");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("礹\u0001");
                break;
        }
        String s6 = ProtectedSandApp.s("祑\u0001");
        String s7 = ProtectedSandApp.s("祒\u0001");
        String s10 = ProtectedSandApp.s("祓\u0001");
        String s11 = ProtectedSandApp.s("祔\u0001");
        String s12 = ProtectedSandApp.s("祕\u0001");
        String s13 = ProtectedSandApp.s("祖\u0001");
        String s14 = ProtectedSandApp.s("祗\u0001");
        String s15 = ProtectedSandApp.s("祘\u0001");
        String s16 = ProtectedSandApp.s("祙\u0001");
        String s17 = ProtectedSandApp.s("祚\u0001");
        String s18 = ProtectedSandApp.s("祛\u0001");
        String s19 = ProtectedSandApp.s("祜\u0001");
        String s20 = ProtectedSandApp.s("祝\u0001");
        String s21 = ProtectedSandApp.s("神\u0001");
        String s22 = ProtectedSandApp.s("祟\u0001");
        String s23 = ProtectedSandApp.s("祠\u0001");
        String s24 = ProtectedSandApp.s("祡\u0001");
        String s25 = ProtectedSandApp.s("祢\u0001");
        switch (i4) {
            case 4:
                objArr[1] = ProtectedSandApp.s("祣\u0001");
                break;
            case 7:
                objArr[1] = s6;
                break;
            case 9:
            case 10:
                objArr[1] = s7;
                break;
            case 12:
                objArr[1] = s10;
                break;
            case 22:
                objArr[1] = s11;
                break;
            case 40:
                objArr[1] = s12;
                break;
            case 42:
            case 43:
                objArr[1] = s13;
                break;
            case 47:
                objArr[1] = s14;
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = s15;
                break;
            case 60:
                objArr[1] = s16;
                break;
            case 62:
            case 63:
                objArr[1] = s17;
                break;
            case 65:
                objArr[1] = s18;
                break;
            case 72:
                objArr[1] = s19;
                break;
            case 76:
                objArr[1] = s20;
                break;
            case 83:
            case 84:
                objArr[1] = s21;
                break;
            case 86:
                objArr[1] = s22;
                break;
            case 89:
                objArr[1] = s23;
                break;
            case 94:
                objArr[1] = s24;
                break;
            case 96:
                objArr[1] = s25;
                break;
            default:
                objArr[1] = s5;
                break;
        }
        switch (i4) {
            case 1:
                objArr[2] = ProtectedSandApp.s("禉\u0001");
                break;
            case 2:
                objArr[2] = ProtectedSandApp.s("禈\u0001");
                break;
            case 3:
                objArr[2] = ProtectedSandApp.s("祣\u0001");
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
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = ProtectedSandApp.s("禇\u0001");
                break;
            case 6:
                objArr[2] = s6;
                break;
            case 8:
                objArr[2] = s7;
                break;
            case 11:
                objArr[2] = s10;
                break;
            case 13:
                objArr[2] = ProtectedSandApp.s("禆\u0001");
                break;
            case 14:
                objArr[2] = ProtectedSandApp.s("禅\u0001");
                break;
            case 15:
                objArr[2] = ProtectedSandApp.s("禄\u0001");
                break;
            case 16:
            case 17:
                objArr[2] = ProtectedSandApp.s("禃\u0001");
                break;
            case 18:
            case 19:
                objArr[2] = ProtectedSandApp.s("禂\u0001");
                break;
            case 20:
            case 23:
                objArr[2] = ProtectedSandApp.s("禁\u0001");
                break;
            case 21:
                objArr[2] = s11;
                break;
            case 24:
                objArr[2] = ProtectedSandApp.s("禀\u0001");
                break;
            case 25:
                objArr[2] = ProtectedSandApp.s("祿\u0001");
                break;
            case 26:
            case 27:
                objArr[2] = ProtectedSandApp.s("祾\u0001");
                break;
            case 28:
            case 29:
                objArr[2] = ProtectedSandApp.s("祽\u0001");
                break;
            case 30:
            case 31:
                objArr[2] = ProtectedSandApp.s("祼\u0001");
                break;
            case 32:
            case 33:
                objArr[2] = ProtectedSandApp.s("祻\u0001");
                break;
            case 34:
                objArr[2] = ProtectedSandApp.s("祺\u0001");
                break;
            case 35:
                objArr[2] = ProtectedSandApp.s("祹\u0001");
                break;
            case 36:
                objArr[2] = ProtectedSandApp.s("祸\u0001");
                break;
            case 37:
                objArr[2] = ProtectedSandApp.s("祷\u0001");
                break;
            case 38:
                objArr[2] = ProtectedSandApp.s("祶\u0001");
                break;
            case 39:
                objArr[2] = s12;
                break;
            case 41:
                objArr[2] = s13;
                break;
            case 44:
                objArr[2] = ProtectedSandApp.s("祵\u0001");
                break;
            case 45:
                objArr[2] = ProtectedSandApp.s("祴\u0001");
                break;
            case 46:
                objArr[2] = s14;
                break;
            case 48:
                objArr[2] = s15;
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = ProtectedSandApp.s("祳\u0001");
                break;
            case 57:
                objArr[2] = ProtectedSandApp.s("祲\u0001");
                break;
            case 58:
                objArr[2] = ProtectedSandApp.s("祱\u0001");
                break;
            case 59:
                objArr[2] = s16;
                break;
            case 61:
                objArr[2] = s17;
                break;
            case 64:
                objArr[2] = s18;
                break;
            case 66:
            case 67:
                objArr[2] = ProtectedSandApp.s("祰\u0001");
                break;
            case 68:
                objArr[2] = ProtectedSandApp.s("祯\u0001");
                break;
            case 69:
                objArr[2] = ProtectedSandApp.s("祮\u0001");
                break;
            case 70:
                objArr[2] = ProtectedSandApp.s("祭\u0001");
                break;
            case 71:
                objArr[2] = s19;
                break;
            case 73:
            case 74:
                objArr[2] = ProtectedSandApp.s("祬\u0001");
                break;
            case 75:
                objArr[2] = s20;
                break;
            case 77:
                objArr[2] = ProtectedSandApp.s("祫\u0001");
                break;
            case 78:
                objArr[2] = ProtectedSandApp.s("祪\u0001");
                break;
            case 79:
                objArr[2] = ProtectedSandApp.s("祩\u0001");
                break;
            case 80:
                objArr[2] = ProtectedSandApp.s("票\u0001");
                break;
            case 81:
                objArr[2] = ProtectedSandApp.s("祧\u0001");
                break;
            case 82:
                objArr[2] = s21;
                break;
            case 85:
                objArr[2] = s22;
                break;
            case 87:
            case 88:
                objArr[2] = s23;
                break;
            case 90:
            case 91:
                objArr[2] = ProtectedSandApp.s("祦\u0001");
                break;
            case 92:
            case 93:
                objArr[2] = s24;
                break;
            case 95:
                objArr[2] = s25;
                break;
            case 97:
                objArr[2] = ProtectedSandApp.s("祥\u0001");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("祤\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        switch (i4) {
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
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static boolean b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar2) {
        if (mVar == null) {
            a(16);
        }
        if (mVar2 == null) {
            a(17);
        }
        return g(mVar).equals(g(mVar2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> void c(@fg.l D d5, @fg.l Set<D> set) {
        if (d5 == null) {
            a(73);
        }
        if (set == 0) {
            a(74);
        }
        if (set.contains(d5)) {
            return;
        }
        Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> it = d5.L0().e().iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.a L0 = it.next().L0();
            c(L0, set);
            set.add(L0);
        }
    }

    @fg.l
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.a> Set<D> d(@fg.l D d5) {
        if (d5 == null) {
            a(71);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c(d5.L0(), linkedHashSet);
        return linkedHashSet;
    }

    @fg.l
    public static kotlin.reflect.jvm.internal.impl.descriptors.e e(@fg.l h0 h0Var) {
        if (h0Var == null) {
            a(45);
        }
        return f(h0Var.O0());
    }

    @fg.l
    public static kotlin.reflect.jvm.internal.impl.descriptors.e f(@fg.l h1 h1Var) {
        if (h1Var == null) {
            a(46);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) h1Var.c();
        if (eVar == null) {
            a(47);
        }
        return eVar;
    }

    @fg.l
    public static kotlin.reflect.jvm.internal.impl.descriptors.h0 g(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(21);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h0 h4 = h(mVar);
        if (h4 == null) {
            a(22);
        }
        return h4;
    }

    @fg.m
    public static kotlin.reflect.jvm.internal.impl.descriptors.h0 h(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(23);
        }
        while (mVar != null) {
            if (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.h0) {
                return (kotlin.reflect.jvm.internal.impl.descriptors.h0) mVar;
            }
            if (mVar instanceof q0) {
                return ((q0) mVar).D0();
            }
            mVar = mVar.c();
        }
        return null;
    }

    @fg.m
    public static kotlin.reflect.jvm.internal.impl.descriptors.h0 i(@fg.l h0 h0Var) {
        if (h0Var == null) {
            a(20);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h0Var.O0().c();
        if (c5 == null) {
            return null;
        }
        return h(c5);
    }

    @fg.l
    public static b1 j(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(82);
        }
        if (mVar instanceof w0) {
            mVar = ((w0) mVar).Y();
        }
        if (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.p) {
            b1 b5 = ((kotlin.reflect.jvm.internal.impl.descriptors.p) mVar).f().b();
            if (b5 == null) {
                a(83);
            }
            return b5;
        }
        b1 b1Var = b1.f75928a;
        if (b1Var == null) {
            a(84);
        }
        return b1Var;
    }

    @fg.l
    public static u k(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, boolean z4) {
        if (eVar == null) {
            a(48);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f b5 = eVar.b();
        if (b5 == kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_CLASS || b5.isSingleton()) {
            u uVar = kotlin.reflect.jvm.internal.impl.descriptors.t.f76286a;
            if (uVar == null) {
                a(49);
            }
            return uVar;
        }
        if (G(eVar)) {
            if (z4) {
                u uVar2 = kotlin.reflect.jvm.internal.impl.descriptors.t.f76288c;
                if (uVar2 == null) {
                    a(50);
                }
                return uVar2;
            }
            u uVar3 = kotlin.reflect.jvm.internal.impl.descriptors.t.f76286a;
            if (uVar3 == null) {
                a(51);
            }
            return uVar3;
        }
        if (u(eVar)) {
            u uVar4 = kotlin.reflect.jvm.internal.impl.descriptors.t.f76297l;
            if (uVar4 == null) {
                a(52);
            }
            return uVar4;
        }
        u uVar5 = kotlin.reflect.jvm.internal.impl.descriptors.t.f76290e;
        if (uVar5 == null) {
            a(53);
        }
        return uVar5;
    }

    @fg.m
    public static x0 l(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(0);
        }
        if (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar).K0();
        }
        return null;
    }

    @fg.l
    public static kotlin.reflect.jvm.internal.impl.name.d m(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(2);
        }
        kotlin.reflect.jvm.internal.impl.name.c o4 = o(mVar);
        return o4 != null ? o4.j() : p(mVar);
    }

    @fg.l
    public static kotlin.reflect.jvm.internal.impl.name.c n(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(3);
        }
        kotlin.reflect.jvm.internal.impl.name.c o4 = o(mVar);
        if (o4 == null) {
            o4 = p(mVar).l();
        }
        if (o4 == null) {
            a(4);
        }
        return o4;
    }

    @fg.m
    private static kotlin.reflect.jvm.internal.impl.name.c o(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(5);
        }
        if ((mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.h0) || kotlin.reflect.jvm.internal.impl.types.error.k.m(mVar)) {
            return kotlin.reflect.jvm.internal.impl.name.c.f77572c;
        }
        if (mVar instanceof q0) {
            return ((q0) mVar).g();
        }
        if (mVar instanceof l0) {
            return ((l0) mVar).g();
        }
        return null;
    }

    @fg.l
    private static kotlin.reflect.jvm.internal.impl.name.d p(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(6);
        }
        kotlin.reflect.jvm.internal.impl.name.d c5 = m(mVar.c()).c(mVar.getName());
        if (c5 == null) {
            a(7);
        }
        return c5;
    }

    @fg.m
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.m> D q(@fg.m kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l Class<D> cls) {
        if (cls == null) {
            a(18);
        }
        return (D) r(mVar, cls, true);
    }

    @fg.m
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.m> D r(@fg.m kotlin.reflect.jvm.internal.impl.descriptors.m mVar, @fg.l Class<D> cls, boolean z4) {
        if (cls == null) {
            a(19);
        }
        if (mVar == null) {
            return null;
        }
        if (z4) {
            mVar = (D) mVar.c();
        }
        while (mVar != null) {
            if (cls.isInstance(mVar)) {
                return (D) mVar;
            }
            mVar = (D) mVar.c();
        }
        return null;
    }

    @fg.m
    public static kotlin.reflect.jvm.internal.impl.descriptors.e s(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(44);
        }
        Iterator<h0> it = eVar.j().j().iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.descriptors.e e4 = e(it.next());
            if (e4.b() != kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE) {
                return e4;
            }
        }
        return null;
    }

    public static boolean t(@fg.m kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        return D(mVar, kotlin.reflect.jvm.internal.impl.descriptors.f.ANNOTATION_CLASS);
    }

    public static boolean u(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(34);
        }
        return D(mVar, kotlin.reflect.jvm.internal.impl.descriptors.f.CLASS) && mVar.getName().equals(kotlin.reflect.jvm.internal.impl.name.h.f77589b);
    }

    public static boolean v(@fg.m kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        return D(mVar, kotlin.reflect.jvm.internal.impl.descriptors.f.CLASS);
    }

    public static boolean w(@fg.m kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        return D(mVar, kotlin.reflect.jvm.internal.impl.descriptors.f.CLASS) || D(mVar, kotlin.reflect.jvm.internal.impl.descriptors.f.ENUM_CLASS);
    }

    public static boolean x(@fg.m kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        return D(mVar, kotlin.reflect.jvm.internal.impl.descriptors.f.OBJECT) && ((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar).e0();
    }

    public static boolean y(kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        return (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.q) && ((kotlin.reflect.jvm.internal.impl.descriptors.q) mVar).getVisibility() == kotlin.reflect.jvm.internal.impl.descriptors.t.f76291f;
    }

    public static boolean z(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar2) {
        if (eVar == null) {
            a(26);
        }
        if (eVar2 == null) {
            a(27);
        }
        Iterator<h0> it = eVar.j().j().iterator();
        while (it.hasNext()) {
            if (F(it.next(), eVar2.L0())) {
                return true;
            }
        }
        return false;
    }
}
