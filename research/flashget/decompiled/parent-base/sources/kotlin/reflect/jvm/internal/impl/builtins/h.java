package kotlin.reflect.jvm.internal.impl.builtins;

import com.android.internal.telephony.SmsConstants;
import com.android.internal.telephony.cdma.UserData;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.x;
import kotlin.reflect.jvm.internal.impl.descriptors.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.s;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.types.e1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.i0;
import kotlin.reflect.jvm.internal.impl.types.n1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.t1;
import kotlin.reflect.jvm.internal.impl.types.x1;
import org.apache.log4j.net.SyslogAppender;
import rd.a;
import rd.c;

/* compiled from: KotlinBuiltIns.java */
/* loaded from: classes7.dex */
public abstract class h {

    /* renamed from: g, reason: collision with root package name */
    public static final kotlin.reflect.jvm.internal.impl.name.f f75698g = kotlin.reflect.jvm.internal.impl.name.f.i(ProtectedSandApp.s("杸\u0001"));

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f75699h = false;

    /* renamed from: a, reason: collision with root package name */
    private x f75700a;

    /* renamed from: b, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.storage.i<x> f75701b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.i<e> f75702c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.i<Collection<q0>> f75703d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.e> f75704e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.n f75705f;

    /* compiled from: KotlinBuiltIns.java */
    class a implements ld.a<Collection<q0>> {
        a() {
        }

        @Override // ld.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<q0> invoke() {
            return Arrays.asList(h.this.r().n0(l.f75836y), h.this.r().n0(l.A), h.this.r().n0(l.B), h.this.r().n0(l.f75837z));
        }
    }

    /* compiled from: KotlinBuiltIns.java */
    class b implements ld.a<e> {
        b() {
        }

        @Override // ld.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e invoke() {
            EnumMap enumMap = new EnumMap(i.class);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (i iVar : i.values()) {
                p0 q4 = h.this.q(iVar.getTypeName().b());
                p0 q5 = h.this.q(iVar.getArrayTypeName().b());
                enumMap.put((EnumMap) iVar, (i) q5);
                hashMap.put(q4, q5);
                hashMap2.put(q5, q4);
            }
            return new e(enumMap, hashMap, hashMap2, null);
        }
    }

    /* compiled from: KotlinBuiltIns.java */
    class c implements ld.l<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.e> {
        c() {
        }

        @Override // ld.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.descriptors.e invoke(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            kotlin.reflect.jvm.internal.impl.descriptors.h f4 = h.this.s().f(fVar, ud.d.FROM_BUILTINS);
            if (f4 == null) {
                throw new AssertionError(ProtectedSandApp.s("棺\u0001") + l.f75836y.c(fVar) + ProtectedSandApp.s("棻\u0001"));
            }
            if (f4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                return (kotlin.reflect.jvm.internal.impl.descriptors.e) f4;
            }
            throw new AssertionError(ProtectedSandApp.s("棸\u0001") + fVar + ProtectedSandApp.s("棹\u0001") + f4);
        }
    }

    /* compiled from: KotlinBuiltIns.java */
    class d implements ld.a<Void> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f75709b;

        d(x xVar) {
            this.f75709b = xVar;
        }

        @Override // ld.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void invoke() {
            if (h.this.f75700a == null) {
                h.this.f75700a = this.f75709b;
                return null;
            }
            throw new AssertionError(ProtectedSandApp.s("棼\u0001") + h.this.f75700a + ProtectedSandApp.s("棽\u0001") + this.f75709b + ProtectedSandApp.s("棾\u0001"));
        }
    }

    /* compiled from: KotlinBuiltIns.java */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        public final Map<i, p0> f75711a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<h0, p0> f75712b;

        /* renamed from: c, reason: collision with root package name */
        public final Map<p0, p0> f75713c;

        /* synthetic */ e(Map map, Map map2, Map map3, a aVar) {
            this(map, map2, map3);
        }

        private static /* synthetic */ void a(int i4) {
            Object[] objArr = new Object[3];
            if (i4 == 1) {
                objArr[0] = ProtectedSandApp.s("椁\u0001");
            } else if (i4 != 2) {
                objArr[0] = ProtectedSandApp.s("棿\u0001");
            } else {
                objArr[0] = ProtectedSandApp.s("椀\u0001");
            }
            objArr[1] = ProtectedSandApp.s("椂\u0001");
            objArr[2] = ProtectedSandApp.s("椃\u0001");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("椄\u0001"), objArr));
        }

        private e(@fg.l Map<i, p0> map, @fg.l Map<h0, p0> map2, @fg.l Map<p0, p0> map3) {
            if (map == null) {
                a(0);
            }
            if (map2 == null) {
                a(1);
            }
            if (map3 == null) {
                a(2);
            }
            this.f75711a = map;
            this.f75712b = map2;
            this.f75713c = map3;
        }
    }

    protected h(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar) {
        if (nVar == null) {
            a(0);
        }
        this.f75705f = nVar;
        this.f75703d = nVar.h(new a());
        this.f75702c = nVar.h(new b());
        this.f75704e = nVar.e(new c());
    }

    @fg.m
    private static h0 A(@fg.l h0 h0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var2) {
        kotlin.reflect.jvm.internal.impl.name.b k4;
        kotlin.reflect.jvm.internal.impl.name.b a5;
        kotlin.reflect.jvm.internal.impl.descriptors.e a6;
        if (h0Var == null) {
            a(72);
        }
        if (h0Var2 == null) {
            a(73);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h0Var.O0().c();
        if (c5 == null) {
            return null;
        }
        p pVar = p.f75891a;
        if (!pVar.b(c5.getName()) || (k4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.k(c5)) == null || (a5 = pVar.a(k4)) == null || (a6 = y.a(h0Var2, a5)) == null) {
            return null;
        }
        return a6.r();
    }

    public static boolean A0(@fg.l h0 h0Var) {
        if (h0Var == null) {
            a(UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS);
        }
        return i0(h0Var, l.a.F0.j());
    }

    public static boolean B0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(10);
        }
        while (mVar != null) {
            if (mVar instanceof l0) {
                return ((l0) mVar).g().i(l.f75835x);
            }
            mVar = mVar.c();
        }
        return false;
    }

    public static boolean C0(@fg.l h0 h0Var) {
        if (h0Var == null) {
            a(143);
        }
        return m0(h0Var, l.a.f75848f);
    }

    public static boolean D0(@fg.l h0 h0Var) {
        if (h0Var == null) {
            a(UserData.IS91_MSG_TYPE_SHORT_MESSAGE);
        }
        return x0(h0Var) || A0(h0Var) || y0(h0Var) || z0(h0Var);
    }

    @fg.m
    public static i N(@fg.l h0 h0Var) {
        if (h0Var == null) {
            a(93);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h0Var.O0().c();
        if (c5 == null) {
            return null;
        }
        return P(c5);
    }

    @fg.m
    public static i P(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(78);
        }
        if (l.a.J0.contains(mVar.getName())) {
            return l.a.L0.get(kotlin.reflect.jvm.internal.impl.resolve.f.m(mVar));
        }
        return null;
    }

    @fg.l
    private kotlin.reflect.jvm.internal.impl.descriptors.e Q(@fg.l i iVar) {
        if (iVar == null) {
            a(16);
        }
        return p(iVar.getTypeName().b());
    }

    @fg.m
    public static i S(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(77);
        }
        if (l.a.I0.contains(mVar.getName())) {
            return l.a.K0.get(kotlin.reflect.jvm.internal.impl.resolve.f.m(mVar));
        }
        return null;
    }

    private static /* synthetic */ void a(int i4) {
        String s4;
        int i5;
        switch (i4) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                s4 = ProtectedSandApp.s("杺\u0001");
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                s4 = ProtectedSandApp.s("杹\u0001");
                break;
        }
        switch (i4) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                i5 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        String s5 = ProtectedSandApp.s("杻\u0001");
        switch (i4) {
            case 1:
            case 73:
                objArr[0] = ProtectedSandApp.s("枍\u0001");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("枌\u0001");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                objArr[0] = s5;
                break;
            case 9:
            case 10:
            case 77:
            case 78:
            case 90:
            case 97:
            case 104:
            case 108:
            case 109:
            case 144:
            case 147:
            case 148:
            case 150:
            case 158:
            case 159:
            case 160:
            case 161:
                objArr[0] = ProtectedSandApp.s("枋\u0001");
                break;
            case 12:
            case 99:
            case 101:
            case 103:
            case 105:
            case 107:
            case SyslogAppender.LOG_LOCAL1 /* 136 */:
                objArr[0] = ProtectedSandApp.s("枊\u0001");
                break;
            case 14:
                objArr[0] = ProtectedSandApp.s("枉\u0001");
                break;
            case 16:
            case 17:
            case 54:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 98:
            case 100:
            case 106:
            case 110:
            case 111:
            case 112:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS /* 130 */:
            case UserData.IS91_MSG_TYPE_SHORT_MESSAGE_FULL /* 131 */:
            case UserData.IS91_MSG_TYPE_CLI /* 132 */:
            case UserData.IS91_MSG_TYPE_SHORT_MESSAGE /* 133 */:
            case SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER /* 134 */:
            case 135:
            case 137:
            case 138:
            case 139:
            case SmsConstants.MAX_USER_DATA_BYTES /* 140 */:
            case 141:
            case 142:
            case 143:
            case 145:
            case 146:
            case 149:
            case 151:
            case SyslogAppender.LOG_LOCAL3 /* 152 */:
            case SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER /* 153 */:
            case 154:
            case 155:
            case 156:
            case 157:
            case 163:
                objArr[0] = ProtectedSandApp.s("枈\u0001");
                break;
            case 47:
                objArr[0] = ProtectedSandApp.s("枇\u0001");
                break;
            case 68:
                objArr[0] = ProtectedSandApp.s("枆\u0001");
                break;
            case 72:
                objArr[0] = ProtectedSandApp.s("枅\u0001");
                break;
            case 74:
                objArr[0] = ProtectedSandApp.s("构\u0001");
                break;
            case 76:
                objArr[0] = ProtectedSandApp.s("枃\u0001");
                break;
            case 79:
            case 83:
                objArr[0] = ProtectedSandApp.s("枂\u0001");
                break;
            case 80:
            case 84:
            case 86:
                objArr[0] = ProtectedSandApp.s("极\u0001");
                break;
            case 81:
                objArr[0] = ProtectedSandApp.s("枀\u0001");
                break;
            case 102:
                objArr[0] = ProtectedSandApp.s("板\u0001");
                break;
            case 113:
                objArr[0] = ProtectedSandApp.s("松\u0001");
                break;
            case 162:
                objArr[0] = ProtectedSandApp.s("杽\u0001");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("杼\u0001");
                break;
        }
        String s6 = ProtectedSandApp.s("枎\u0001");
        String s7 = ProtectedSandApp.s("枏\u0001");
        String s10 = ProtectedSandApp.s("析\u0001");
        String s11 = ProtectedSandApp.s("枑\u0001");
        String s12 = ProtectedSandApp.s("枒\u0001");
        String s13 = ProtectedSandApp.s("枓\u0001");
        String s14 = ProtectedSandApp.s("枔\u0001");
        String s15 = ProtectedSandApp.s("枕\u0001");
        switch (i4) {
            case 3:
                objArr[1] = ProtectedSandApp.s("柋\u0001");
                break;
            case 4:
                objArr[1] = ProtectedSandApp.s("柊\u0001");
                break;
            case 5:
                objArr[1] = ProtectedSandApp.s("柉\u0001");
                break;
            case 6:
                objArr[1] = ProtectedSandApp.s("柈\u0001");
                break;
            case 7:
                objArr[1] = ProtectedSandApp.s("柇\u0001");
                break;
            case 8:
                objArr[1] = ProtectedSandApp.s("柆\u0001");
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                objArr[1] = s5;
                break;
            case 11:
                objArr[1] = ProtectedSandApp.s("柅\u0001");
                break;
            case 13:
                objArr[1] = s6;
                break;
            case 15:
                objArr[1] = s7;
                break;
            case 18:
                objArr[1] = ProtectedSandApp.s("柄\u0001");
                break;
            case 19:
                objArr[1] = ProtectedSandApp.s("柃\u0001");
                break;
            case 20:
                objArr[1] = ProtectedSandApp.s("柂\u0001");
                break;
            case 21:
                objArr[1] = ProtectedSandApp.s("柁\u0001");
                break;
            case 22:
                objArr[1] = ProtectedSandApp.s("柀\u0001");
                break;
            case 23:
                objArr[1] = ProtectedSandApp.s("枿\u0001");
                break;
            case 24:
                objArr[1] = ProtectedSandApp.s("枾\u0001");
                break;
            case 25:
                objArr[1] = ProtectedSandApp.s("枽\u0001");
                break;
            case 26:
                objArr[1] = ProtectedSandApp.s("枼\u0001");
                break;
            case 27:
                objArr[1] = ProtectedSandApp.s("枻\u0001");
                break;
            case 28:
                objArr[1] = ProtectedSandApp.s("枺\u0001");
                break;
            case 29:
                objArr[1] = ProtectedSandApp.s("枹\u0001");
                break;
            case 30:
                objArr[1] = ProtectedSandApp.s("枸\u0001");
                break;
            case 31:
                objArr[1] = ProtectedSandApp.s("枷\u0001");
                break;
            case 32:
                objArr[1] = ProtectedSandApp.s("架\u0001");
                break;
            case 33:
                objArr[1] = ProtectedSandApp.s("枵\u0001");
                break;
            case 34:
                objArr[1] = ProtectedSandApp.s("枴\u0001");
                break;
            case 35:
                objArr[1] = ProtectedSandApp.s("枳\u0001");
                break;
            case 36:
                objArr[1] = ProtectedSandApp.s("枲\u0001");
                break;
            case 37:
                objArr[1] = ProtectedSandApp.s("枱\u0001");
                break;
            case 38:
                objArr[1] = ProtectedSandApp.s("枰\u0001");
                break;
            case 39:
                objArr[1] = ProtectedSandApp.s("枯\u0001");
                break;
            case 40:
                objArr[1] = ProtectedSandApp.s("枮\u0001");
                break;
            case 41:
                objArr[1] = ProtectedSandApp.s("枭\u0001");
                break;
            case 42:
                objArr[1] = ProtectedSandApp.s("枬\u0001");
                break;
            case 43:
                objArr[1] = ProtectedSandApp.s("枫\u0001");
                break;
            case 44:
                objArr[1] = ProtectedSandApp.s("枪\u0001");
                break;
            case 45:
                objArr[1] = ProtectedSandApp.s("枩\u0001");
                break;
            case 46:
                objArr[1] = ProtectedSandApp.s("枨\u0001");
                break;
            case 48:
                objArr[1] = s10;
                break;
            case 49:
                objArr[1] = ProtectedSandApp.s("枧\u0001");
                break;
            case 50:
                objArr[1] = ProtectedSandApp.s("枦\u0001");
                break;
            case 51:
                objArr[1] = ProtectedSandApp.s("枥\u0001");
                break;
            case 52:
                objArr[1] = ProtectedSandApp.s("枤\u0001");
                break;
            case 53:
                objArr[1] = ProtectedSandApp.s("枣\u0001");
                break;
            case 55:
                objArr[1] = s11;
                break;
            case 56:
                objArr[1] = ProtectedSandApp.s("枢\u0001");
                break;
            case 57:
                objArr[1] = ProtectedSandApp.s("枡\u0001");
                break;
            case 58:
                objArr[1] = ProtectedSandApp.s("枠\u0001");
                break;
            case 59:
                objArr[1] = ProtectedSandApp.s("枟\u0001");
                break;
            case 60:
                objArr[1] = ProtectedSandApp.s("枞\u0001");
                break;
            case 61:
                objArr[1] = ProtectedSandApp.s("枝\u0001");
                break;
            case 62:
                objArr[1] = ProtectedSandApp.s("果\u0001");
                break;
            case 63:
                objArr[1] = ProtectedSandApp.s("枛\u0001");
                break;
            case 64:
                objArr[1] = ProtectedSandApp.s("枚\u0001");
                break;
            case 65:
                objArr[1] = ProtectedSandApp.s("枙\u0001");
                break;
            case 66:
                objArr[1] = ProtectedSandApp.s("枘\u0001");
                break;
            case 67:
                objArr[1] = ProtectedSandApp.s("林\u0001");
                break;
            case 69:
            case 70:
            case 71:
                objArr[1] = s12;
                break;
            case 75:
                objArr[1] = s13;
                break;
            case 82:
            case 85:
                objArr[1] = s14;
                break;
            case 87:
                objArr[1] = s15;
                break;
            case 88:
                objArr[1] = ProtectedSandApp.s("枖\u0001");
                break;
        }
        switch (i4) {
            case 1:
                objArr[2] = ProtectedSandApp.s("栔\u0001");
                break;
            case 2:
                objArr[2] = ProtectedSandApp.s("栓\u0001");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                break;
            case 9:
                objArr[2] = ProtectedSandApp.s("栒\u0001");
                break;
            case 10:
                objArr[2] = ProtectedSandApp.s("树\u0001");
                break;
            case 12:
                objArr[2] = s6;
                break;
            case 14:
                objArr[2] = s7;
                break;
            case 16:
                objArr[2] = ProtectedSandApp.s("栐\u0001");
                break;
            case 17:
                objArr[2] = ProtectedSandApp.s("栏\u0001");
                break;
            case 47:
                objArr[2] = s10;
                break;
            case 54:
                objArr[2] = s11;
                break;
            case 68:
                objArr[2] = s12;
                break;
            case 72:
            case 73:
                objArr[2] = ProtectedSandApp.s("栎\u0001");
                break;
            case 74:
                objArr[2] = s13;
                break;
            case 76:
                objArr[2] = ProtectedSandApp.s("栍\u0001");
                break;
            case 77:
            case 94:
                objArr[2] = ProtectedSandApp.s("栌\u0001");
                break;
            case 78:
                objArr[2] = ProtectedSandApp.s("栋\u0001");
                break;
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
                objArr[2] = s14;
                break;
            case 86:
                objArr[2] = s15;
                break;
            case 89:
                objArr[2] = ProtectedSandApp.s("栊\u0001");
                break;
            case 90:
            case 91:
                objArr[2] = ProtectedSandApp.s("栉\u0001");
                break;
            case 92:
                objArr[2] = ProtectedSandApp.s("栈\u0001");
                break;
            case 93:
                objArr[2] = ProtectedSandApp.s("标\u0001");
                break;
            case 95:
                objArr[2] = ProtectedSandApp.s("栆\u0001");
                break;
            case 96:
                objArr[2] = ProtectedSandApp.s("栅\u0001");
                break;
            case 97:
                objArr[2] = ProtectedSandApp.s("栄\u0001");
                break;
            case 98:
            case 99:
            case 100:
            case 101:
                objArr[2] = ProtectedSandApp.s("栃\u0001");
                break;
            case 102:
            case 103:
                objArr[2] = ProtectedSandApp.s("栂\u0001");
                break;
            case 104:
            case 105:
                objArr[2] = ProtectedSandApp.s("栁\u0001");
                break;
            case 106:
            case 107:
                objArr[2] = ProtectedSandApp.s("栀\u0001");
                break;
            case 108:
                objArr[2] = ProtectedSandApp.s("柿\u0001");
                break;
            case 109:
            case 110:
                objArr[2] = ProtectedSandApp.s("柾\u0001");
                break;
            case 111:
            case 113:
                objArr[2] = ProtectedSandApp.s("柽\u0001");
                break;
            case 112:
                objArr[2] = ProtectedSandApp.s("柼\u0001");
                break;
            case 114:
                objArr[2] = ProtectedSandApp.s("査\u0001");
                break;
            case 115:
                objArr[2] = ProtectedSandApp.s("柺\u0001");
                break;
            case 116:
                objArr[2] = ProtectedSandApp.s("柹\u0001");
                break;
            case 117:
                objArr[2] = ProtectedSandApp.s("柸\u0001");
                break;
            case 118:
                objArr[2] = ProtectedSandApp.s("柷\u0001");
                break;
            case 119:
                objArr[2] = ProtectedSandApp.s("柶\u0001");
                break;
            case 120:
                objArr[2] = ProtectedSandApp.s("柵\u0001");
                break;
            case 121:
                objArr[2] = ProtectedSandApp.s("柴\u0001");
                break;
            case 122:
                objArr[2] = ProtectedSandApp.s("柳\u0001");
                break;
            case 123:
                objArr[2] = ProtectedSandApp.s("柲\u0001");
                break;
            case 124:
                objArr[2] = ProtectedSandApp.s("柱\u0001");
                break;
            case 125:
                objArr[2] = ProtectedSandApp.s("柰\u0001");
                break;
            case 126:
                objArr[2] = ProtectedSandApp.s("柯\u0001");
                break;
            case 127:
                objArr[2] = ProtectedSandApp.s("柮\u0001");
                break;
            case 128:
                objArr[2] = ProtectedSandApp.s("柭\u0001");
                break;
            case 129:
                objArr[2] = ProtectedSandApp.s("柬\u0001");
                break;
            case UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS /* 130 */:
                objArr[2] = ProtectedSandApp.s("柫\u0001");
                break;
            case UserData.IS91_MSG_TYPE_SHORT_MESSAGE_FULL /* 131 */:
                objArr[2] = ProtectedSandApp.s("柪\u0001");
                break;
            case UserData.IS91_MSG_TYPE_CLI /* 132 */:
                objArr[2] = ProtectedSandApp.s("柩\u0001");
                break;
            case UserData.IS91_MSG_TYPE_SHORT_MESSAGE /* 133 */:
                objArr[2] = ProtectedSandApp.s("柨\u0001");
                break;
            case SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER /* 134 */:
                objArr[2] = ProtectedSandApp.s("柧\u0001");
                break;
            case 135:
            case SyslogAppender.LOG_LOCAL1 /* 136 */:
                objArr[2] = ProtectedSandApp.s("柦\u0001");
                break;
            case 137:
                objArr[2] = ProtectedSandApp.s("查\u0001");
                break;
            case 138:
                objArr[2] = ProtectedSandApp.s("柤\u0001");
                break;
            case 139:
                objArr[2] = ProtectedSandApp.s("柣\u0001");
                break;
            case SmsConstants.MAX_USER_DATA_BYTES /* 140 */:
                objArr[2] = ProtectedSandApp.s("柢\u0001");
                break;
            case 141:
                objArr[2] = ProtectedSandApp.s("柡\u0001");
                break;
            case 142:
                objArr[2] = ProtectedSandApp.s("柠\u0001");
                break;
            case 143:
                objArr[2] = ProtectedSandApp.s("柟\u0001");
                break;
            case 144:
                objArr[2] = ProtectedSandApp.s("柞\u0001");
                break;
            case 145:
                objArr[2] = ProtectedSandApp.s("柝\u0001");
                break;
            case 146:
                objArr[2] = ProtectedSandApp.s("柜\u0001");
                break;
            case 147:
                objArr[2] = ProtectedSandApp.s("柛\u0001");
                break;
            case 148:
            case 149:
                objArr[2] = ProtectedSandApp.s("柚\u0001");
                break;
            case 150:
            case 151:
                objArr[2] = ProtectedSandApp.s("柙\u0001");
                break;
            case SyslogAppender.LOG_LOCAL3 /* 152 */:
                objArr[2] = ProtectedSandApp.s("柘\u0001");
                break;
            case SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER /* 153 */:
                objArr[2] = ProtectedSandApp.s("柗\u0001");
                break;
            case 154:
                objArr[2] = ProtectedSandApp.s("柖\u0001");
                break;
            case 155:
                objArr[2] = ProtectedSandApp.s("柕\u0001");
                break;
            case 156:
                objArr[2] = ProtectedSandApp.s("柔\u0001");
                break;
            case 157:
                objArr[2] = ProtectedSandApp.s("染\u0001");
                break;
            case 158:
                objArr[2] = ProtectedSandApp.s("柒\u0001");
                break;
            case 159:
                objArr[2] = ProtectedSandApp.s("柑\u0001");
                break;
            case 160:
                objArr[2] = ProtectedSandApp.s("某\u0001");
                break;
            case 161:
                objArr[2] = ProtectedSandApp.s("柏\u0001");
                break;
            case 162:
                objArr[2] = ProtectedSandApp.s("柎\u0001");
                break;
            case 163:
                objArr[2] = ProtectedSandApp.s("柍\u0001");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("柌\u0001");
                break;
        }
        String format = String.format(s4, objArr);
        switch (i4) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                throw new IllegalStateException(format);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static boolean a0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(109);
        }
        return e(eVar, l.a.f75840b);
    }

    public static boolean b0(@fg.l h0 h0Var) {
        if (h0Var == null) {
            a(SmsConstants.MAX_USER_DATA_BYTES);
        }
        return h0(h0Var, l.a.f75840b);
    }

    public static boolean c0(@fg.l h0 h0Var) {
        if (h0Var == null) {
            a(89);
        }
        return h0(h0Var, l.a.f75854i);
    }

    public static boolean d0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(90);
        }
        return e(eVar, l.a.f75854i) || P(eVar) != null;
    }

    private static boolean e(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h hVar, @fg.l kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (hVar == null) {
            a(104);
        }
        if (dVar == null) {
            a(105);
        }
        return hVar.getName().equals(dVar.i()) && dVar.equals(kotlin.reflect.jvm.internal.impl.resolve.f.m(hVar));
    }

    public static boolean e0(@fg.l h0 h0Var) {
        if (h0Var == null) {
            a(91);
        }
        return c0(h0Var) || q0(h0Var);
    }

    public static boolean f0(@fg.l h0 h0Var) {
        if (h0Var == null) {
            a(111);
        }
        return i0(h0Var, l.a.f75856j);
    }

    public static boolean g0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(9);
        }
        return kotlin.reflect.jvm.internal.impl.resolve.f.r(mVar, kotlin.reflect.jvm.internal.impl.builtins.b.class, false) != null;
    }

    private static boolean h0(@fg.l h0 h0Var, @fg.l kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (h0Var == null) {
            a(98);
        }
        if (dVar == null) {
            a(99);
        }
        return w0(h0Var.O0(), dVar);
    }

    private static boolean i0(@fg.l h0 h0Var, @fg.l kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (h0Var == null) {
            a(135);
        }
        if (dVar == null) {
            a(SyslogAppender.LOG_LOCAL1);
        }
        return h0(h0Var, dVar) && !h0Var.P0();
    }

    public static boolean j0(@fg.l h0 h0Var) {
        if (h0Var == null) {
            a(142);
        }
        return p0(h0Var);
    }

    public static boolean k0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(162);
        }
        if (mVar.L0().getAnnotations().o3(l.a.f75886y)) {
            return true;
        }
        if (!(mVar instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) mVar;
        boolean Q = u0Var.Q();
        v0 getter = u0Var.getGetter();
        w0 setter = u0Var.getSetter();
        if (getter != null && k0(getter)) {
            if (!Q) {
                return true;
            }
            if (setter != null && k0(setter)) {
                return true;
            }
        }
        return false;
    }

    public static boolean l0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(159);
        }
        return e(eVar, l.a.f75857j0);
    }

    private static boolean m0(@fg.l h0 h0Var, @fg.l kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (h0Var == null) {
            a(106);
        }
        if (dVar == null) {
            a(107);
        }
        return !h0Var.P0() && h0(h0Var, dVar);
    }

    public static boolean n0(@fg.l h0 h0Var) {
        if (h0Var == null) {
            a(137);
        }
        return o0(h0Var) && !t1.l(h0Var);
    }

    public static boolean o0(@fg.l h0 h0Var) {
        if (h0Var == null) {
            a(139);
        }
        return h0(h0Var, l.a.f75842c);
    }

    @fg.l
    private kotlin.reflect.jvm.internal.impl.descriptors.e p(@fg.l String str) {
        if (str == null) {
            a(14);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e invoke = this.f75704e.invoke(kotlin.reflect.jvm.internal.impl.name.f.f(str));
        if (invoke == null) {
            a(15);
        }
        return invoke;
    }

    public static boolean p0(@fg.l h0 h0Var) {
        if (h0Var == null) {
            a(141);
        }
        return b0(h0Var) && h0Var.P0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @fg.l
    public p0 q(@fg.l String str) {
        if (str == null) {
            a(47);
        }
        p0 r4 = p(str).r();
        if (r4 == null) {
            a(48);
        }
        return r4;
    }

    public static boolean q0(@fg.l h0 h0Var) {
        if (h0Var == null) {
            a(92);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h0Var.O0().c();
        return (c5 == null || P(c5) == null) ? false : true;
    }

    public static boolean r0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(97);
        }
        return S(eVar) != null;
    }

    public static boolean s0(@fg.l h0 h0Var) {
        if (h0Var == null) {
            a(95);
        }
        return !h0Var.P0() && t0(h0Var);
    }

    public static boolean t0(@fg.l h0 h0Var) {
        if (h0Var == null) {
            a(96);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h0Var.O0().c();
        return (c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && r0((kotlin.reflect.jvm.internal.impl.descriptors.e) c5);
    }

    public static boolean u0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(108);
        }
        return e(eVar, l.a.f75840b) || e(eVar, l.a.f75842c);
    }

    public static boolean v0(@fg.m h0 h0Var) {
        return h0Var != null && m0(h0Var, l.a.f75852h);
    }

    public static boolean w0(@fg.l h1 h1Var, @fg.l kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (h1Var == null) {
            a(102);
        }
        if (dVar == null) {
            a(103);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h c5 = h1Var.c();
        return (c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && e(c5, dVar);
    }

    public static boolean x0(@fg.l h0 h0Var) {
        if (h0Var == null) {
            a(129);
        }
        return i0(h0Var, l.a.E0.j());
    }

    public static boolean y0(@fg.l h0 h0Var) {
        if (h0Var == null) {
            a(UserData.IS91_MSG_TYPE_SHORT_MESSAGE_FULL);
        }
        return i0(h0Var, l.a.G0.j());
    }

    public static boolean z0(@fg.l h0 h0Var) {
        if (h0Var == null) {
            a(UserData.IS91_MSG_TYPE_CLI);
        }
        return i0(h0Var, l.a.H0.j());
    }

    @fg.l
    public p0 B() {
        p0 R = R(i.FLOAT);
        if (R == null) {
            a(61);
        }
        return R;
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e C(int i4) {
        return p(l.b(i4));
    }

    @fg.l
    public p0 D() {
        p0 R = R(i.INT);
        if (R == null) {
            a(59);
        }
        return R;
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e E() {
        kotlin.reflect.jvm.internal.impl.descriptors.e o4 = o(l.a.f75857j0.l());
        if (o4 == null) {
            a(21);
        }
        return o4;
    }

    public void E0(@fg.l x xVar) {
        if (xVar == null) {
            a(1);
        }
        this.f75705f.c(new d(xVar));
    }

    @fg.l
    public p0 F() {
        p0 R = R(i.LONG);
        if (R == null) {
            a(60);
        }
        return R;
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e G() {
        return p(ProtectedSandApp.s("栕\u0001"));
    }

    @fg.l
    public p0 H() {
        p0 r4 = G().r();
        if (r4 == null) {
            a(49);
        }
        return r4;
    }

    @fg.l
    public p0 I() {
        p0 V0 = i().V0(true);
        if (V0 == null) {
            a(52);
        }
        return V0;
    }

    @fg.l
    public p0 J() {
        p0 V0 = H().V0(true);
        if (V0 == null) {
            a(50);
        }
        return V0;
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e K() {
        return p(ProtectedSandApp.s("栖\u0001"));
    }

    @fg.l
    public p0 L() {
        p0 r4 = K().r();
        if (r4 == null) {
            a(56);
        }
        return r4;
    }

    @fg.l
    protected rd.c M() {
        c.b bVar = c.b.f89866a;
        if (bVar == null) {
            a(4);
        }
        return bVar;
    }

    @fg.l
    public p0 O(@fg.l i iVar) {
        if (iVar == null) {
            a(74);
        }
        p0 p0Var = this.f75702c.invoke().f75711a.get(iVar);
        if (p0Var == null) {
            a(75);
        }
        return p0Var;
    }

    @fg.l
    public p0 R(@fg.l i iVar) {
        if (iVar == null) {
            a(54);
        }
        p0 r4 = Q(iVar).r();
        if (r4 == null) {
            a(55);
        }
        return r4;
    }

    @fg.l
    public p0 T() {
        p0 R = R(i.SHORT);
        if (R == null) {
            a(58);
        }
        return R;
    }

    @fg.l
    protected kotlin.reflect.jvm.internal.impl.storage.n U() {
        kotlin.reflect.jvm.internal.impl.storage.n nVar = this.f75705f;
        if (nVar == null) {
            a(6);
        }
        return nVar;
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e V() {
        return p(ProtectedSandApp.s("栗\u0001"));
    }

    @fg.l
    public p0 W() {
        p0 r4 = V().r();
        if (r4 == null) {
            a(66);
        }
        return r4;
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e X(int i4) {
        kotlin.reflect.jvm.internal.impl.descriptors.e o4 = o(l.f75828q.c(kotlin.reflect.jvm.internal.impl.name.f.f(l.d(i4))));
        if (o4 == null) {
            a(18);
        }
        return o4;
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e Y() {
        return p(ProtectedSandApp.s("栘\u0001"));
    }

    @fg.l
    public p0 Z() {
        p0 r4 = Y().r();
        if (r4 == null) {
            a(65);
        }
        return r4;
    }

    protected void f(boolean z4) {
        x xVar = new x(f75698g, this.f75705f, this, null);
        this.f75700a = xVar;
        xVar.T0(kotlin.reflect.jvm.internal.impl.builtins.a.f75661a.a().a(this.f75705f, this.f75700a, v(), M(), g(), z4));
        x xVar2 = this.f75700a;
        xVar2.Z0(xVar2);
    }

    @fg.l
    protected rd.a g() {
        a.C1384a c1384a = a.C1384a.f89864a;
        if (c1384a == null) {
            a(3);
        }
        return c1384a;
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e h() {
        return p(ProtectedSandApp.s("栙\u0001"));
    }

    @fg.l
    public p0 i() {
        p0 r4 = h().r();
        if (r4 == null) {
            a(51);
        }
        return r4;
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e j() {
        return p(ProtectedSandApp.s("栚\u0001"));
    }

    @fg.l
    public h0 k(@fg.l h0 h0Var) {
        h0 A;
        if (h0Var == null) {
            a(68);
        }
        if (c0(h0Var)) {
            if (h0Var.M0().size() != 1) {
                throw new IllegalStateException();
            }
            h0 type = h0Var.M0().get(0).getType();
            if (type == null) {
                a(69);
            }
            return type;
        }
        h0 n4 = t1.n(h0Var);
        p0 p0Var = this.f75702c.invoke().f75713c.get(n4);
        if (p0Var != null) {
            return p0Var;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h0 i4 = kotlin.reflect.jvm.internal.impl.resolve.f.i(n4);
        if (i4 != null && (A = A(n4, i4)) != null) {
            return A;
        }
        throw new IllegalStateException(ProtectedSandApp.s("栛\u0001") + h0Var);
    }

    @fg.l
    public p0 l(@fg.l x1 x1Var, @fg.l h0 h0Var) {
        if (x1Var == null) {
            a(83);
        }
        if (h0Var == null) {
            a(84);
        }
        p0 m4 = m(x1Var, h0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b());
        if (m4 == null) {
            a(85);
        }
        return m4;
    }

    @fg.l
    public p0 m(@fg.l x1 x1Var, @fg.l h0 h0Var, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (x1Var == null) {
            a(79);
        }
        if (h0Var == null) {
            a(80);
        }
        if (gVar == null) {
            a(81);
        }
        p0 g4 = i0.g(e1.b(gVar), j(), Collections.singletonList(new n1(x1Var, h0Var)));
        if (g4 == null) {
            a(82);
        }
        return g4;
    }

    @fg.l
    public p0 n() {
        p0 R = R(i.BOOLEAN);
        if (R == null) {
            a(64);
        }
        return R;
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e o(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        if (cVar == null) {
            a(12);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e d5 = s.d(r(), cVar, ud.d.FROM_BUILTINS);
        if (d5 == null) {
            a(13);
        }
        return d5;
    }

    @fg.l
    public x r() {
        if (this.f75700a == null) {
            this.f75700a = this.f75701b.invoke();
        }
        x xVar = this.f75700a;
        if (xVar == null) {
            a(7);
        }
        return xVar;
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h s() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h q4 = r().n0(l.f75836y).q();
        if (q4 == null) {
            a(11);
        }
        return q4;
    }

    @fg.l
    public p0 t() {
        p0 R = R(i.BYTE);
        if (R == null) {
            a(57);
        }
        return R;
    }

    @fg.l
    public p0 u() {
        p0 R = R(i.CHAR);
        if (R == null) {
            a(63);
        }
        return R;
    }

    @fg.l
    protected Iterable<rd.b> v() {
        List singletonList = Collections.singletonList(new kotlin.reflect.jvm.internal.impl.builtins.functions.a(this.f75705f, r()));
        if (singletonList == null) {
            a(5);
        }
        return singletonList;
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e w() {
        kotlin.reflect.jvm.internal.impl.descriptors.e o4 = o(l.a.V);
        if (o4 == null) {
            a(35);
        }
        return o4;
    }

    @fg.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e x() {
        return p(ProtectedSandApp.s("栜\u0001"));
    }

    @fg.l
    public p0 y() {
        p0 I = I();
        if (I == null) {
            a(53);
        }
        return I;
    }

    @fg.l
    public p0 z() {
        p0 R = R(i.DOUBLE);
        if (R == null) {
            a(62);
        }
        return R;
    }
}
