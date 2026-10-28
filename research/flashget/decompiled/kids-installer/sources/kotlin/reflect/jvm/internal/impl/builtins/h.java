package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
import w3.a;
import w3.c;

/* compiled from: KotlinBuiltIns.java */
/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: g, reason: collision with root package name */
    public static final kotlin.reflect.jvm.internal.impl.name.f f23906g = kotlin.reflect.jvm.internal.impl.name.f.s(ProtectedSandApp.s("䏺"));

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f23907h = false;

    /* renamed from: a, reason: collision with root package name */
    private x f23908a;

    /* renamed from: b, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.storage.i<x> f23909b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.i<e> f23910c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.i<Collection<q0>> f23911d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.e> f23912e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.storage.n f23913f;

    /* compiled from: KotlinBuiltIns.java */
    /* loaded from: classes6.dex */
    class a implements q3.a<Collection<q0>> {
        a() {
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<q0> n() {
            return Arrays.asList(h.this.r().V(l.f24035u), h.this.r().V(l.f24037w), h.this.r().V(l.f24038x), h.this.r().V(l.f24036v));
        }
    }

    /* compiled from: KotlinBuiltIns.java */
    /* loaded from: classes6.dex */
    class b implements q3.a<e> {
        b() {
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e n() {
            EnumMap enumMap = new EnumMap(i.class);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (i iVar : i.values()) {
                p0 q5 = h.this.q(iVar.getTypeName().h());
                p0 q6 = h.this.q(iVar.getArrayTypeName().h());
                enumMap.put((EnumMap) iVar, (i) q6);
                hashMap.put(q5, q6);
                hashMap2.put(q6, q5);
            }
            return new e(enumMap, hashMap, hashMap2, null);
        }
    }

    /* compiled from: KotlinBuiltIns.java */
    /* loaded from: classes6.dex */
    class c implements q3.l<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.descriptors.e> {
        c() {
        }

        @Override // q3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.descriptors.e N(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            kotlin.reflect.jvm.internal.impl.descriptors.h h5 = h.this.s().h(fVar, z3.d.FROM_BUILTINS);
            if (h5 == null) {
                throw new AssertionError(ProtectedSandApp.s("胕") + l.f24035u.c(fVar) + ProtectedSandApp.s("胖"));
            }
            if (h5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                return (kotlin.reflect.jvm.internal.impl.descriptors.e) h5;
            }
            throw new AssertionError(ProtectedSandApp.s("胓") + fVar + ProtectedSandApp.s("胔") + h5);
        }
    }

    /* compiled from: KotlinBuiltIns.java */
    /* loaded from: classes6.dex */
    class d implements q3.a<Void> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ x f23917o;

        d(x xVar) {
            this.f23917o = xVar;
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void n() {
            if (h.this.f23908a == null) {
                h.this.f23908a = this.f23917o;
                return null;
            }
            throw new AssertionError(ProtectedSandApp.s("胗") + h.this.f23908a + ProtectedSandApp.s("胘") + this.f23917o + ProtectedSandApp.s("胙"));
        }
    }

    /* compiled from: KotlinBuiltIns.java */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        public final Map<i, p0> f23919a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<h0, p0> f23920b;

        /* renamed from: c, reason: collision with root package name */
        public final Map<p0, p0> f23921c;

        /* synthetic */ e(Map map, Map map2, Map map3, a aVar) {
            this(map, map2, map3);
        }

        private static /* synthetic */ void a(int i5) {
            Object[] objArr = new Object[3];
            if (i5 == 1) {
                objArr[0] = ProtectedSandApp.s("䓮");
            } else if (i5 != 2) {
                objArr[0] = ProtectedSandApp.s("䓬");
            } else {
                objArr[0] = ProtectedSandApp.s("䓭");
            }
            objArr[1] = ProtectedSandApp.s("䓯");
            objArr[2] = ProtectedSandApp.s("䓰");
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("䓱"), objArr));
        }

        private e(@d5.d Map<i, p0> map, @d5.d Map<h0, p0> map2, @d5.d Map<p0, p0> map3) {
            if (map == null) {
                a(0);
            }
            if (map2 == null) {
                a(1);
            }
            if (map3 == null) {
                a(2);
            }
            this.f23919a = map;
            this.f23920b = map2;
            this.f23921c = map3;
        }
    }

    protected h(@d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar) {
        if (nVar == null) {
            a(0);
        }
        this.f23913f = nVar;
        this.f23911d = nVar.d(new a());
        this.f23910c = nVar.d(new b());
        this.f23912e = nVar.g(new c());
    }

    @d5.e
    private static h0 A(@d5.d h0 h0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var2) {
        kotlin.reflect.jvm.internal.impl.name.b k5;
        kotlin.reflect.jvm.internal.impl.name.b a6;
        kotlin.reflect.jvm.internal.impl.descriptors.e a7;
        if (h0Var == null) {
            a(71);
        }
        if (h0Var2 == null) {
            a(72);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h0Var.U0().b();
        if (b6 == null) {
            return null;
        }
        p pVar = p.f24094a;
        if (!pVar.b(b6.getName()) || (k5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.k(b6)) == null || (a6 = pVar.a(k5)) == null || (a7 = y.a(h0Var2, a6)) == null) {
            return null;
        }
        return a7.E();
    }

    public static boolean A0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(10);
        }
        while (mVar != null) {
            if (mVar instanceof l0) {
                return ((l0) mVar).f().i(l.f24034t);
            }
            mVar = mVar.b();
        }
        return false;
    }

    public static boolean B0(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(142);
        }
        return l0(h0Var, l.a.f24051f);
    }

    public static boolean C0(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(132);
        }
        return w0(h0Var) || z0(h0Var) || x0(h0Var) || y0(h0Var);
    }

    @d5.e
    public static i N(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(92);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h0Var.U0().b();
        if (b6 == null) {
            return null;
        }
        return P(b6);
    }

    @d5.e
    public static i P(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(77);
        }
        if (l.a.H0.contains(mVar.getName())) {
            return l.a.J0.get(kotlin.reflect.jvm.internal.impl.resolve.e.m(mVar));
        }
        return null;
    }

    @d5.d
    private kotlin.reflect.jvm.internal.impl.descriptors.e Q(@d5.d i iVar) {
        if (iVar == null) {
            a(16);
        }
        return p(iVar.getTypeName().h());
    }

    @d5.e
    public static i S(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(76);
        }
        if (l.a.G0.contains(mVar.getName())) {
            return l.a.I0.get(kotlin.reflect.jvm.internal.impl.resolve.e.m(mVar));
        }
        return null;
    }

    private static /* synthetic */ void a(int i5) {
        String s5;
        int i6;
        switch (i5) {
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
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
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
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                s5 = ProtectedSandApp.s("䏼");
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                s5 = ProtectedSandApp.s("䏻");
                break;
        }
        switch (i5) {
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
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
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
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i6 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                i6 = 3;
                break;
        }
        Object[] objArr = new Object[i6];
        String s6 = ProtectedSandApp.s("䏽");
        switch (i5) {
            case 1:
            case 72:
                objArr[0] = ProtectedSandApp.s("䐏");
                break;
            case 2:
                objArr[0] = ProtectedSandApp.s("䐎");
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
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
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
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = s6;
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
            case SyslogAppender.LOG_LOCAL4 /* 160 */:
                objArr[0] = ProtectedSandApp.s("䐍");
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = ProtectedSandApp.s("䐌");
                break;
            case 14:
                objArr[0] = ProtectedSandApp.s("䐋");
                break;
            case 16:
            case 17:
            case 53:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
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
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case SyslogAppender.LOG_LOCAL1 /* 136 */:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case SyslogAppender.LOG_LOCAL2 /* 144 */:
            case 145:
            case 148:
            case 150:
            case 151:
            case SyslogAppender.LOG_LOCAL3 /* 152 */:
            case 153:
            case 154:
            case 155:
            case 156:
            case 162:
                objArr[0] = ProtectedSandApp.s("䐊");
                break;
            case 46:
                objArr[0] = ProtectedSandApp.s("䐉");
                break;
            case 67:
                objArr[0] = ProtectedSandApp.s("䐈");
                break;
            case 71:
                objArr[0] = ProtectedSandApp.s("䐇");
                break;
            case 73:
                objArr[0] = ProtectedSandApp.s("䐆");
                break;
            case 75:
                objArr[0] = ProtectedSandApp.s("䐅");
                break;
            case 78:
            case 82:
                objArr[0] = ProtectedSandApp.s("䐄");
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = ProtectedSandApp.s("䐃");
                break;
            case 80:
                objArr[0] = ProtectedSandApp.s("䐂");
                break;
            case 101:
                objArr[0] = ProtectedSandApp.s("䐁");
                break;
            case 112:
                objArr[0] = ProtectedSandApp.s("䐀");
                break;
            case 161:
                objArr[0] = ProtectedSandApp.s("䏿");
                break;
            default:
                objArr[0] = ProtectedSandApp.s("䏾");
                break;
        }
        String s7 = ProtectedSandApp.s("䐐");
        String s8 = ProtectedSandApp.s("䐑");
        String s9 = ProtectedSandApp.s("䐒");
        String s10 = ProtectedSandApp.s("䐓");
        String s11 = ProtectedSandApp.s("䐔");
        String s12 = ProtectedSandApp.s("䐕");
        String s13 = ProtectedSandApp.s("䐖");
        String s14 = ProtectedSandApp.s("䐗");
        switch (i5) {
            case 3:
                objArr[1] = ProtectedSandApp.s("䑌");
                break;
            case 4:
                objArr[1] = ProtectedSandApp.s("䑋");
                break;
            case 5:
                objArr[1] = ProtectedSandApp.s("䑊");
                break;
            case 6:
                objArr[1] = ProtectedSandApp.s("䑉");
                break;
            case 7:
                objArr[1] = ProtectedSandApp.s("䑈");
                break;
            case 8:
                objArr[1] = ProtectedSandApp.s("䑇");
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                objArr[1] = s6;
                break;
            case 11:
                objArr[1] = ProtectedSandApp.s("䑆");
                break;
            case 13:
                objArr[1] = s14;
                break;
            case 15:
                objArr[1] = s13;
                break;
            case 18:
                objArr[1] = ProtectedSandApp.s("䑅");
                break;
            case 19:
                objArr[1] = ProtectedSandApp.s("䑄");
                break;
            case 20:
                objArr[1] = ProtectedSandApp.s("䑃");
                break;
            case 21:
                objArr[1] = ProtectedSandApp.s("䑂");
                break;
            case 22:
                objArr[1] = ProtectedSandApp.s("䑁");
                break;
            case 23:
                objArr[1] = ProtectedSandApp.s("䑀");
                break;
            case 24:
                objArr[1] = ProtectedSandApp.s("䐿");
                break;
            case 25:
                objArr[1] = ProtectedSandApp.s("䐾");
                break;
            case 26:
                objArr[1] = ProtectedSandApp.s("䐽");
                break;
            case 27:
                objArr[1] = ProtectedSandApp.s("䐼");
                break;
            case 28:
                objArr[1] = ProtectedSandApp.s("䐻");
                break;
            case 29:
                objArr[1] = ProtectedSandApp.s("䐺");
                break;
            case 30:
                objArr[1] = ProtectedSandApp.s("䐹");
                break;
            case 31:
                objArr[1] = ProtectedSandApp.s("䐸");
                break;
            case 32:
                objArr[1] = ProtectedSandApp.s("䐷");
                break;
            case 33:
                objArr[1] = ProtectedSandApp.s("䐶");
                break;
            case 34:
                objArr[1] = ProtectedSandApp.s("䐵");
                break;
            case 35:
                objArr[1] = ProtectedSandApp.s("䐴");
                break;
            case 36:
                objArr[1] = ProtectedSandApp.s("䐳");
                break;
            case 37:
                objArr[1] = ProtectedSandApp.s("䐲");
                break;
            case 38:
                objArr[1] = ProtectedSandApp.s("䐱");
                break;
            case 39:
                objArr[1] = ProtectedSandApp.s("䐰");
                break;
            case 40:
                objArr[1] = ProtectedSandApp.s("䐯");
                break;
            case 41:
                objArr[1] = ProtectedSandApp.s("䐮");
                break;
            case 42:
                objArr[1] = ProtectedSandApp.s("䐭");
                break;
            case 43:
                objArr[1] = ProtectedSandApp.s("䐬");
                break;
            case 44:
                objArr[1] = ProtectedSandApp.s("䐫");
                break;
            case 45:
                objArr[1] = ProtectedSandApp.s("䐪");
                break;
            case 47:
                objArr[1] = s12;
                break;
            case 48:
                objArr[1] = ProtectedSandApp.s("䐩");
                break;
            case 49:
                objArr[1] = ProtectedSandApp.s("䐨");
                break;
            case 50:
                objArr[1] = ProtectedSandApp.s("䐧");
                break;
            case 51:
                objArr[1] = ProtectedSandApp.s("䐦");
                break;
            case 52:
                objArr[1] = ProtectedSandApp.s("䐥");
                break;
            case 54:
                objArr[1] = s11;
                break;
            case 55:
                objArr[1] = ProtectedSandApp.s("䐤");
                break;
            case 56:
                objArr[1] = ProtectedSandApp.s("䐣");
                break;
            case 57:
                objArr[1] = ProtectedSandApp.s("䐢");
                break;
            case 58:
                objArr[1] = ProtectedSandApp.s("䐡");
                break;
            case 59:
                objArr[1] = ProtectedSandApp.s("䐠");
                break;
            case 60:
                objArr[1] = ProtectedSandApp.s("䐟");
                break;
            case 61:
                objArr[1] = ProtectedSandApp.s("䐞");
                break;
            case 62:
                objArr[1] = ProtectedSandApp.s("䐝");
                break;
            case 63:
                objArr[1] = ProtectedSandApp.s("䐜");
                break;
            case 64:
                objArr[1] = ProtectedSandApp.s("䐛");
                break;
            case 65:
                objArr[1] = ProtectedSandApp.s("䐚");
                break;
            case 66:
                objArr[1] = ProtectedSandApp.s("䐙");
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = s10;
                break;
            case 74:
                objArr[1] = s9;
                break;
            case 81:
            case 84:
                objArr[1] = s8;
                break;
            case 86:
                objArr[1] = s7;
                break;
            case 87:
                objArr[1] = ProtectedSandApp.s("䐘");
                break;
        }
        switch (i5) {
            case 1:
                objArr[2] = ProtectedSandApp.s("䒕");
                break;
            case 2:
                objArr[2] = ProtectedSandApp.s("䒔");
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
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
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
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = ProtectedSandApp.s("䒓");
                break;
            case 10:
                objArr[2] = ProtectedSandApp.s("䒒");
                break;
            case 12:
                objArr[2] = s14;
                break;
            case 14:
                objArr[2] = s13;
                break;
            case 16:
                objArr[2] = ProtectedSandApp.s("䒑");
                break;
            case 17:
                objArr[2] = ProtectedSandApp.s("䒐");
                break;
            case 46:
                objArr[2] = s12;
                break;
            case 53:
                objArr[2] = s11;
                break;
            case 67:
                objArr[2] = s10;
                break;
            case 71:
            case 72:
                objArr[2] = ProtectedSandApp.s("䒏");
                break;
            case 73:
                objArr[2] = s9;
                break;
            case 75:
                objArr[2] = ProtectedSandApp.s("䒎");
                break;
            case 76:
            case 93:
                objArr[2] = ProtectedSandApp.s("䒍");
                break;
            case 77:
                objArr[2] = ProtectedSandApp.s("䒌");
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = s8;
                break;
            case 85:
                objArr[2] = s7;
                break;
            case 88:
                objArr[2] = ProtectedSandApp.s("䒋");
                break;
            case 89:
            case 90:
                objArr[2] = ProtectedSandApp.s("䒊");
                break;
            case 91:
                objArr[2] = ProtectedSandApp.s("䒉");
                break;
            case 92:
                objArr[2] = ProtectedSandApp.s("䒈");
                break;
            case 94:
                objArr[2] = ProtectedSandApp.s("䒇");
                break;
            case 95:
                objArr[2] = ProtectedSandApp.s("䒆");
                break;
            case 96:
                objArr[2] = ProtectedSandApp.s("䒅");
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = ProtectedSandApp.s("䒄");
                break;
            case 101:
            case 102:
                objArr[2] = ProtectedSandApp.s("䒃");
                break;
            case 103:
            case 104:
                objArr[2] = ProtectedSandApp.s("䒂");
                break;
            case 105:
            case 106:
                objArr[2] = ProtectedSandApp.s("䒁");
                break;
            case 107:
                objArr[2] = ProtectedSandApp.s("䒀");
                break;
            case 108:
            case 109:
                objArr[2] = ProtectedSandApp.s("䑿");
                break;
            case 110:
            case 112:
                objArr[2] = ProtectedSandApp.s("䑾");
                break;
            case 111:
                objArr[2] = ProtectedSandApp.s("䑽");
                break;
            case 113:
                objArr[2] = ProtectedSandApp.s("䑼");
                break;
            case 114:
                objArr[2] = ProtectedSandApp.s("䑻");
                break;
            case 115:
                objArr[2] = ProtectedSandApp.s("䑺");
                break;
            case 116:
                objArr[2] = ProtectedSandApp.s("䑹");
                break;
            case 117:
                objArr[2] = ProtectedSandApp.s("䑸");
                break;
            case 118:
                objArr[2] = ProtectedSandApp.s("䑷");
                break;
            case 119:
                objArr[2] = ProtectedSandApp.s("䑶");
                break;
            case 120:
                objArr[2] = ProtectedSandApp.s("䑵");
                break;
            case 121:
                objArr[2] = ProtectedSandApp.s("䑴");
                break;
            case 122:
                objArr[2] = ProtectedSandApp.s("䑳");
                break;
            case 123:
                objArr[2] = ProtectedSandApp.s("䑲");
                break;
            case 124:
                objArr[2] = ProtectedSandApp.s("䑱");
                break;
            case 125:
                objArr[2] = ProtectedSandApp.s("䑰");
                break;
            case 126:
                objArr[2] = ProtectedSandApp.s("䑯");
                break;
            case 127:
                objArr[2] = ProtectedSandApp.s("䑮");
                break;
            case 128:
                objArr[2] = ProtectedSandApp.s("䑭");
                break;
            case 129:
                objArr[2] = ProtectedSandApp.s("䑬");
                break;
            case 130:
                objArr[2] = ProtectedSandApp.s("䑫");
                break;
            case 131:
                objArr[2] = ProtectedSandApp.s("䑪");
                break;
            case 132:
                objArr[2] = ProtectedSandApp.s("䑩");
                break;
            case 133:
                objArr[2] = ProtectedSandApp.s("䑨");
                break;
            case 134:
            case 135:
                objArr[2] = ProtectedSandApp.s("䑧");
                break;
            case SyslogAppender.LOG_LOCAL1 /* 136 */:
                objArr[2] = ProtectedSandApp.s("䑦");
                break;
            case 137:
                objArr[2] = ProtectedSandApp.s("䑥");
                break;
            case 138:
                objArr[2] = ProtectedSandApp.s("䑤");
                break;
            case 139:
                objArr[2] = ProtectedSandApp.s("䑣");
                break;
            case 140:
                objArr[2] = ProtectedSandApp.s("䑢");
                break;
            case 141:
                objArr[2] = ProtectedSandApp.s("䑡");
                break;
            case 142:
                objArr[2] = ProtectedSandApp.s("䑠");
                break;
            case 143:
                objArr[2] = ProtectedSandApp.s("䑟");
                break;
            case SyslogAppender.LOG_LOCAL2 /* 144 */:
                objArr[2] = ProtectedSandApp.s("䑞");
                break;
            case 145:
                objArr[2] = ProtectedSandApp.s("䑝");
                break;
            case 146:
                objArr[2] = ProtectedSandApp.s("䑜");
                break;
            case 147:
            case 148:
                objArr[2] = ProtectedSandApp.s("䑛");
                break;
            case 149:
            case 150:
                objArr[2] = ProtectedSandApp.s("䑚");
                break;
            case 151:
                objArr[2] = ProtectedSandApp.s("䑙");
                break;
            case SyslogAppender.LOG_LOCAL3 /* 152 */:
                objArr[2] = ProtectedSandApp.s("䑘");
                break;
            case 153:
                objArr[2] = ProtectedSandApp.s("䑗");
                break;
            case 154:
                objArr[2] = ProtectedSandApp.s("䑖");
                break;
            case 155:
                objArr[2] = ProtectedSandApp.s("䑕");
                break;
            case 156:
                objArr[2] = ProtectedSandApp.s("䑔");
                break;
            case 157:
                objArr[2] = ProtectedSandApp.s("䑓");
                break;
            case 158:
                objArr[2] = ProtectedSandApp.s("䑒");
                break;
            case 159:
                objArr[2] = ProtectedSandApp.s("䑑");
                break;
            case SyslogAppender.LOG_LOCAL4 /* 160 */:
                objArr[2] = ProtectedSandApp.s("䑐");
                break;
            case 161:
                objArr[2] = ProtectedSandApp.s("䑏");
                break;
            case 162:
                objArr[2] = ProtectedSandApp.s("䑎");
                break;
            default:
                objArr[2] = ProtectedSandApp.s("䑍");
                break;
        }
        String format = String.format(s5, objArr);
        switch (i5) {
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
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
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
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                throw new IllegalStateException(format);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static boolean a0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(108);
        }
        return e(eVar, l.a.f24043b);
    }

    public static boolean b0(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(139);
        }
        return g0(h0Var, l.a.f24043b);
    }

    public static boolean c0(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(88);
        }
        return g0(h0Var, l.a.f24057i);
    }

    public static boolean d0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(89);
        }
        return e(eVar, l.a.f24057i) || P(eVar) != null;
    }

    private static boolean e(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.h hVar, @d5.d kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (hVar == null) {
            a(103);
        }
        if (dVar == null) {
            a(104);
        }
        return hVar.getName().equals(dVar.i()) && dVar.equals(kotlin.reflect.jvm.internal.impl.resolve.e.m(hVar));
    }

    public static boolean e0(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(90);
        }
        return c0(h0Var) || p0(h0Var);
    }

    public static boolean f0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(9);
        }
        return kotlin.reflect.jvm.internal.impl.resolve.e.r(mVar, kotlin.reflect.jvm.internal.impl.builtins.b.class, false) != null;
    }

    private static boolean g0(@d5.d h0 h0Var, @d5.d kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (h0Var == null) {
            a(97);
        }
        if (dVar == null) {
            a(98);
        }
        return v0(h0Var.U0(), dVar);
    }

    private static boolean h0(@d5.d h0 h0Var, @d5.d kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (h0Var == null) {
            a(134);
        }
        if (dVar == null) {
            a(135);
        }
        return g0(h0Var, dVar) && !h0Var.V0();
    }

    public static boolean i0(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(141);
        }
        return o0(h0Var);
    }

    public static boolean j0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            a(161);
        }
        if (mVar.R0().getAnnotations().O0(l.a.f24089y)) {
            return true;
        }
        if (!(mVar instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) mVar;
        boolean q02 = u0Var.q0();
        v0 e6 = u0Var.e();
        w0 h5 = u0Var.h();
        if (e6 != null && j0(e6)) {
            if (!q02) {
                return true;
            }
            if (h5 != null && j0(h5)) {
                return true;
            }
        }
        return false;
    }

    public static boolean k0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(158);
        }
        return e(eVar, l.a.f24058i0);
    }

    private static boolean l0(@d5.d h0 h0Var, @d5.d kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (h0Var == null) {
            a(105);
        }
        if (dVar == null) {
            a(106);
        }
        return !h0Var.V0() && g0(h0Var, dVar);
    }

    public static boolean m0(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(SyslogAppender.LOG_LOCAL1);
        }
        return n0(h0Var) && !t1.l(h0Var);
    }

    public static boolean n0(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(138);
        }
        return g0(h0Var, l.a.f24045c);
    }

    public static boolean o0(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(140);
        }
        return b0(h0Var) && h0Var.V0();
    }

    @d5.d
    private kotlin.reflect.jvm.internal.impl.descriptors.e p(@d5.d String str) {
        if (str == null) {
            a(14);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e N = this.f23912e.N(kotlin.reflect.jvm.internal.impl.name.f.p(str));
        if (N == null) {
            a(15);
        }
        return N;
    }

    public static boolean p0(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(91);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h0Var.U0().b();
        return (b6 == null || P(b6) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @d5.d
    public p0 q(@d5.d String str) {
        if (str == null) {
            a(46);
        }
        p0 E = p(str).E();
        if (E == null) {
            a(47);
        }
        return E;
    }

    public static boolean q0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(96);
        }
        return S(eVar) != null;
    }

    public static boolean r0(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(94);
        }
        return !h0Var.V0() && s0(h0Var);
    }

    public static boolean s0(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(95);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h0Var.U0().b();
        return (b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && q0((kotlin.reflect.jvm.internal.impl.descriptors.e) b6);
    }

    public static boolean t0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        if (eVar == null) {
            a(107);
        }
        return e(eVar, l.a.f24043b) || e(eVar, l.a.f24045c);
    }

    public static boolean u0(@d5.e h0 h0Var) {
        return h0Var != null && l0(h0Var, l.a.f24055h);
    }

    public static boolean v0(@d5.d h1 h1Var, @d5.d kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (h1Var == null) {
            a(101);
        }
        if (dVar == null) {
            a(102);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h b6 = h1Var.b();
        return (b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && e(b6, dVar);
    }

    public static boolean w0(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(128);
        }
        return h0(h0Var, l.a.C0.j());
    }

    public static boolean x0(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(130);
        }
        return h0(h0Var, l.a.E0.j());
    }

    public static boolean y0(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(131);
        }
        return h0(h0Var, l.a.F0.j());
    }

    public static boolean z0(@d5.d h0 h0Var) {
        if (h0Var == null) {
            a(129);
        }
        return h0(h0Var, l.a.D0.j());
    }

    @d5.d
    public p0 B() {
        p0 R = R(i.FLOAT);
        if (R == null) {
            a(60);
        }
        return R;
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.e C(int i5) {
        return p(l.b(i5));
    }

    @d5.d
    public p0 D() {
        p0 R = R(i.INT);
        if (R == null) {
            a(58);
        }
        return R;
    }

    public void D0(@d5.d x xVar) {
        if (xVar == null) {
            a(1);
        }
        this.f23913f.a(new d(xVar));
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.e E() {
        kotlin.reflect.jvm.internal.impl.descriptors.e o5 = o(l.a.f24058i0.l());
        if (o5 == null) {
            a(21);
        }
        return o5;
    }

    @d5.d
    public p0 F() {
        p0 R = R(i.LONG);
        if (R == null) {
            a(59);
        }
        return R;
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.e G() {
        return p(ProtectedSandApp.s("䒖"));
    }

    @d5.d
    public p0 H() {
        p0 E = G().E();
        if (E == null) {
            a(48);
        }
        return E;
    }

    @d5.d
    public p0 I() {
        p0 b12 = i().b1(true);
        if (b12 == null) {
            a(51);
        }
        return b12;
    }

    @d5.d
    public p0 J() {
        p0 b12 = H().b1(true);
        if (b12 == null) {
            a(49);
        }
        return b12;
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.e K() {
        return p(ProtectedSandApp.s("䒗"));
    }

    @d5.d
    public p0 L() {
        p0 E = K().E();
        if (E == null) {
            a(55);
        }
        return E;
    }

    @d5.d
    protected w3.c M() {
        c.b bVar = c.b.f34020a;
        if (bVar == null) {
            a(4);
        }
        return bVar;
    }

    @d5.d
    public p0 O(@d5.d i iVar) {
        if (iVar == null) {
            a(73);
        }
        p0 p0Var = this.f23910c.n().f23919a.get(iVar);
        if (p0Var == null) {
            a(74);
        }
        return p0Var;
    }

    @d5.d
    public p0 R(@d5.d i iVar) {
        if (iVar == null) {
            a(53);
        }
        p0 E = Q(iVar).E();
        if (E == null) {
            a(54);
        }
        return E;
    }

    @d5.d
    public p0 T() {
        p0 R = R(i.SHORT);
        if (R == null) {
            a(57);
        }
        return R;
    }

    @d5.d
    protected kotlin.reflect.jvm.internal.impl.storage.n U() {
        kotlin.reflect.jvm.internal.impl.storage.n nVar = this.f23913f;
        if (nVar == null) {
            a(6);
        }
        return nVar;
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.e V() {
        return p(ProtectedSandApp.s("䒘"));
    }

    @d5.d
    public p0 W() {
        p0 E = V().E();
        if (E == null) {
            a(65);
        }
        return E;
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.e X(int i5) {
        kotlin.reflect.jvm.internal.impl.descriptors.e o5 = o(l.f24027m.c(kotlin.reflect.jvm.internal.impl.name.f.p(l.d(i5))));
        if (o5 == null) {
            a(18);
        }
        return o5;
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.e Y() {
        return p(ProtectedSandApp.s("䒙"));
    }

    @d5.d
    public p0 Z() {
        p0 E = Y().E();
        if (E == null) {
            a(64);
        }
        return E;
    }

    protected void f(boolean z5) {
        x xVar = new x(f23906g, this.f23913f, this, null);
        this.f23908a = xVar;
        xVar.Z0(kotlin.reflect.jvm.internal.impl.builtins.a.f23885a.a().a(this.f23913f, this.f23908a, v(), M(), g(), z5));
        x xVar2 = this.f23908a;
        xVar2.f1(xVar2);
    }

    @d5.d
    protected w3.a g() {
        a.C0517a c0517a = a.C0517a.f34018a;
        if (c0517a == null) {
            a(3);
        }
        return c0517a;
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.e h() {
        return p(ProtectedSandApp.s("䒚"));
    }

    @d5.d
    public p0 i() {
        p0 E = h().E();
        if (E == null) {
            a(50);
        }
        return E;
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.e j() {
        return p(ProtectedSandApp.s("䒛"));
    }

    @d5.d
    public h0 k(@d5.d h0 h0Var) {
        h0 A;
        if (h0Var == null) {
            a(67);
        }
        if (c0(h0Var)) {
            if (h0Var.S0().size() != 1) {
                throw new IllegalStateException();
            }
            h0 type = h0Var.S0().get(0).getType();
            if (type == null) {
                a(68);
            }
            return type;
        }
        h0 n5 = t1.n(h0Var);
        p0 p0Var = this.f23910c.n().f23921c.get(n5);
        if (p0Var != null) {
            return p0Var;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h0 i5 = kotlin.reflect.jvm.internal.impl.resolve.e.i(n5);
        if (i5 != null && (A = A(n5, i5)) != null) {
            return A;
        }
        throw new IllegalStateException(ProtectedSandApp.s("䒜") + h0Var);
    }

    @d5.d
    public p0 l(@d5.d x1 x1Var, @d5.d h0 h0Var) {
        if (x1Var == null) {
            a(82);
        }
        if (h0Var == null) {
            a(83);
        }
        p0 m5 = m(x1Var, h0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b());
        if (m5 == null) {
            a(84);
        }
        return m5;
    }

    @d5.d
    public p0 m(@d5.d x1 x1Var, @d5.d h0 h0Var, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        if (x1Var == null) {
            a(78);
        }
        if (h0Var == null) {
            a(79);
        }
        if (gVar == null) {
            a(80);
        }
        p0 g5 = i0.g(e1.b(gVar), j(), Collections.singletonList(new n1(x1Var, h0Var)));
        if (g5 == null) {
            a(81);
        }
        return g5;
    }

    @d5.d
    public p0 n() {
        p0 R = R(i.BOOLEAN);
        if (R == null) {
            a(63);
        }
        return R;
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.e o(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        if (cVar == null) {
            a(12);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e c6 = s.c(r(), cVar, z3.d.FROM_BUILTINS);
        if (c6 == null) {
            a(13);
        }
        return c6;
    }

    @d5.d
    public x r() {
        if (this.f23908a == null) {
            this.f23908a = this.f23909b.n();
        }
        x xVar = this.f23908a;
        if (xVar == null) {
            a(7);
        }
        return xVar;
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h s() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h C = r().V(l.f24035u).C();
        if (C == null) {
            a(11);
        }
        return C;
    }

    @d5.d
    public p0 t() {
        p0 R = R(i.BYTE);
        if (R == null) {
            a(56);
        }
        return R;
    }

    @d5.d
    public p0 u() {
        p0 R = R(i.CHAR);
        if (R == null) {
            a(62);
        }
        return R;
    }

    @d5.d
    protected Iterable<w3.b> v() {
        List singletonList = Collections.singletonList(new kotlin.reflect.jvm.internal.impl.builtins.functions.a(this.f23913f, r()));
        if (singletonList == null) {
            a(5);
        }
        return singletonList;
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.e w() {
        kotlin.reflect.jvm.internal.impl.descriptors.e o5 = o(l.a.U);
        if (o5 == null) {
            a(34);
        }
        return o5;
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.descriptors.e x() {
        return p(ProtectedSandApp.s("䒝"));
    }

    @d5.d
    public p0 y() {
        p0 I = I();
        if (I == null) {
            a(52);
        }
        return I;
    }

    @d5.d
    public p0 z() {
        p0 R = R(i.DOUBLE);
        if (R == null) {
            a(61);
        }
        return R;
    }
}
