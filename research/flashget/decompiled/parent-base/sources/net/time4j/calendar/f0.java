package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.config.PictureConfig;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.time4j.engine.ChronoException;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Nengo.java */
/* loaded from: classes7.dex */
public final class f0 implements net.time4j.engine.j, Serializable {
    public static final f0 A;
    public static final net.time4j.engine.c<d> B;
    private static final String[] C;
    private static final f0[] D;

    /* renamed from: i, reason: collision with root package name */
    private static final byte f82418i = 1;

    /* renamed from: j, reason: collision with root package name */
    private static final byte f82419j = 0;

    /* renamed from: k, reason: collision with root package name */
    private static final byte f82420k = -1;

    /* renamed from: l, reason: collision with root package name */
    private static final String f82421l = ProtectedSandApp.s("跓\u0001");

    /* renamed from: m, reason: collision with root package name */
    private static final f0[] f82422m;

    /* renamed from: n, reason: collision with root package name */
    private static final f0[] f82423n;

    /* renamed from: o, reason: collision with root package name */
    private static final f0 f82424o;

    /* renamed from: p, reason: collision with root package name */
    private static final f0 f82425p;

    /* renamed from: q, reason: collision with root package name */
    private static final Map<String, f0> f82426q;

    /* renamed from: r, reason: collision with root package name */
    private static final Map<String, f0> f82427r;

    /* renamed from: s, reason: collision with root package name */
    private static final e f82428s;
    private static final long serialVersionUID = 5696395761628504723L;

    /* renamed from: t, reason: collision with root package name */
    private static final e f82429t;

    /* renamed from: u, reason: collision with root package name */
    private static final e f82430u;

    /* renamed from: v, reason: collision with root package name */
    public static final f0 f82431v;

    /* renamed from: w, reason: collision with root package name */
    public static final f0 f82432w;

    /* renamed from: x, reason: collision with root package name */
    public static final f0 f82433x;

    /* renamed from: y, reason: collision with root package name */
    public static final f0 f82434y;

    /* renamed from: z, reason: collision with root package name */
    public static final f0 f82435z;

    /* renamed from: b, reason: collision with root package name */
    private final transient int f82436b;

    /* renamed from: c, reason: collision with root package name */
    private final transient long f82437c;
    private final byte court;

    /* renamed from: d, reason: collision with root package name */
    private final transient String f82438d;

    /* renamed from: e, reason: collision with root package name */
    private final transient String f82439e;

    /* renamed from: f, reason: collision with root package name */
    private final transient String f82440f;

    /* renamed from: g, reason: collision with root package name */
    private final transient String f82441g;

    /* renamed from: h, reason: collision with root package name */
    private final transient String f82442h;
    private final int index;

    /* compiled from: Nengo.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82443a;

        static {
            int[] iArr = new int[d.values().length];
            f82443a = iArr;
            try {
                iArr[d.OFFICIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82443a[d.MODERN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82443a[d.NORTHERN_COURT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82443a[d.SOUTHERN_COURT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f82443a[d.EDO_PERIOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f82443a[d.AZUCHI_MOMOYAMA_PERIOD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f82443a[d.MUROMACHI_PERIOD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f82443a[d.KAMAKURA_PERIOD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f82443a[d.HEIAN_PERIOD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f82443a[d.NARA_PERIOD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f82443a[d.ASUKA_PERIOD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* compiled from: Nengo.java */
    static class b implements net.time4j.format.v<f0>, Serializable {

        /* renamed from: b, reason: collision with root package name */
        static final b f82444b = new b();

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f82445c = false;
        private static final long serialVersionUID = -1099321098836107792L;

        /* compiled from: Nengo.java */
        class a implements Comparator<f0> {
            a() {
            }

            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(f0 f0Var, f0 f0Var2) {
                if (f0Var.f82437c < f0Var2.f82437c) {
                    return 1;
                }
                return f0Var.f82437c == f0Var2.f82437c ? 0 : -1;
            }
        }

        private b() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f82444b;
        }

        @Override // net.time4j.engine.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f0 getDefaultMaximum() {
            return f0.f82422m[f0.f82422m.length - 1];
        }

        @Override // net.time4j.engine.q
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public f0 getDefaultMinimum() {
            return f0.f82422m[0];
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x019a A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0237 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0238  */
        @Override // net.time4j.format.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public net.time4j.calendar.f0 parse(java.lang.CharSequence r17, java.text.ParsePosition r18, net.time4j.engine.d r19) {
            /*
                Method dump skipped, instructions count: 573
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.calendar.f0.b.parse(java.lang.CharSequence, java.text.ParsePosition, net.time4j.engine.d):net.time4j.calendar.f0");
        }

        @Override // net.time4j.engine.q
        public String getDisplayName(Locale locale) {
            String str = net.time4j.format.b.f(locale).o().get(ProtectedSandApp.s("跅\u0001"));
            return str == null ? name() : str;
        }

        @Override // net.time4j.engine.q
        public char getSymbol() {
            return 'G';
        }

        @Override // net.time4j.engine.q
        public Class<f0> getType() {
            return f0.class;
        }

        @Override // net.time4j.engine.q
        public boolean isDateElement() {
            return true;
        }

        @Override // net.time4j.engine.q
        public boolean isLenient() {
            return false;
        }

        @Override // net.time4j.engine.q
        public boolean isTimeElement() {
            return false;
        }

        @Override // net.time4j.engine.q
        public String name() {
            return ProtectedSandApp.s("跆\u0001");
        }

        @Override // net.time4j.format.v
        public void print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException, ChronoException {
            appendable.append(((f0) pVar.r(this)).r((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT), (net.time4j.format.x) dVar.b(net.time4j.format.a.f82785g, net.time4j.format.x.WIDE)));
        }

        @Override // java.util.Comparator
        public int compare(net.time4j.engine.p pVar, net.time4j.engine.p pVar2) {
            f0 f0Var = (f0) pVar.r(this);
            f0 f0Var2 = (f0) pVar2.r(this);
            if (f0Var.f82437c < f0Var2.f82437c) {
                return -1;
            }
            if (f0Var.f82437c > f0Var2.f82437c) {
                return 1;
            }
            return f0Var.court == 1 ? f0Var2.court == 1 ? 0 : 1 : f0Var2.court == 1 ? -1 : 0;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Nengo.java */
    public static abstract class d implements net.time4j.engine.o<f0> {
        private static final /* synthetic */ d[] $VALUES;
        public static final d ASUKA_PERIOD;
        public static final d AZUCHI_MOMOYAMA_PERIOD;
        public static final d EDO_PERIOD;
        public static final d HEIAN_PERIOD;
        public static final d KAMAKURA_PERIOD;
        public static final d MODERN;
        public static final d MUROMACHI_PERIOD;
        public static final d NARA_PERIOD;
        public static final d NORTHERN_COURT;
        public static final d OFFICIAL;
        public static final d SOUTHERN_COURT;

        /* compiled from: Nengo.java */
        enum a extends d {
            a(String str, int i4) {
                super(str, i4, null);
            }

            @Override // net.time4j.engine.o
            public boolean test(f0 f0Var) {
                return f0Var.f82436b >= 710 && f0Var.f82436b < 794;
            }
        }

        /* compiled from: Nengo.java */
        enum b extends d {
            b(String str, int i4) {
                super(str, i4, null);
            }

            @Override // net.time4j.engine.o
            public boolean test(f0 f0Var) {
                return f0Var.f82436b >= 538 && f0Var.f82436b < 710;
            }
        }

        /* compiled from: Nengo.java */
        enum c extends d {
            c(String str, int i4) {
                super(str, i4, null);
            }

            @Override // net.time4j.engine.o
            public boolean test(f0 f0Var) {
                return f0Var.court != 1;
            }
        }

        /* compiled from: Nengo.java */
        /* renamed from: net.time4j.calendar.f0$d$d, reason: collision with other inner class name */
        enum C1281d extends d {
            C1281d(String str, int i4) {
                super(str, i4, null);
            }

            @Override // net.time4j.engine.o
            public boolean test(f0 f0Var) {
                return f0Var.index >= f0.f82431v.index;
            }
        }

        /* compiled from: Nengo.java */
        enum e extends d {
            e(String str, int i4) {
                super(str, i4, null);
            }

            @Override // net.time4j.engine.o
            public boolean test(f0 f0Var) {
                return f0Var.f82436b >= 1603 && f0Var.f82436b < 1868;
            }
        }

        /* compiled from: Nengo.java */
        enum f extends d {
            f(String str, int i4) {
                super(str, i4, null);
            }

            @Override // net.time4j.engine.o
            public boolean test(f0 f0Var) {
                return f0Var.f82436b >= 1573 && f0Var.f82436b < 1603;
            }
        }

        /* compiled from: Nengo.java */
        enum g extends d {
            g(String str, int i4) {
                super(str, i4, null);
            }

            @Override // net.time4j.engine.o
            public boolean test(f0 f0Var) {
                return f0Var.f82436b >= 1336 && f0Var.f82436b < 1573 && f0Var.court != 1;
            }
        }

        /* compiled from: Nengo.java */
        enum h extends d {
            h(String str, int i4) {
                super(str, i4, null);
            }

            @Override // net.time4j.engine.o
            public boolean test(f0 f0Var) {
                return f0Var.court == 1;
            }
        }

        /* compiled from: Nengo.java */
        enum i extends d {
            i(String str, int i4) {
                super(str, i4, null);
            }

            @Override // net.time4j.engine.o
            public boolean test(f0 f0Var) {
                return f0Var.court == -1;
            }
        }

        /* compiled from: Nengo.java */
        enum j extends d {
            j(String str, int i4) {
                super(str, i4, null);
            }

            @Override // net.time4j.engine.o
            public boolean test(f0 f0Var) {
                return f0Var.f82436b >= 1185 && f0Var.f82436b < 1332;
            }
        }

        /* compiled from: Nengo.java */
        enum k extends d {
            k(String str, int i4) {
                super(str, i4, null);
            }

            @Override // net.time4j.engine.o
            public boolean test(f0 f0Var) {
                return f0Var.f82436b >= 794 && f0Var.f82436b < 1185;
            }
        }

        static {
            c cVar = new c(ProtectedSandApp.s("跇\u0001"), 0);
            OFFICIAL = cVar;
            C1281d c1281d = new C1281d(ProtectedSandApp.s("跈\u0001"), 1);
            MODERN = c1281d;
            e eVar = new e(ProtectedSandApp.s("跉\u0001"), 2);
            EDO_PERIOD = eVar;
            f fVar = new f(ProtectedSandApp.s("跊\u0001"), 3);
            AZUCHI_MOMOYAMA_PERIOD = fVar;
            g gVar = new g(ProtectedSandApp.s("跋\u0001"), 4);
            MUROMACHI_PERIOD = gVar;
            h hVar = new h(ProtectedSandApp.s("跌\u0001"), 5);
            NORTHERN_COURT = hVar;
            i iVar = new i(ProtectedSandApp.s("跍\u0001"), 6);
            SOUTHERN_COURT = iVar;
            j jVar = new j(ProtectedSandApp.s("跎\u0001"), 7);
            KAMAKURA_PERIOD = jVar;
            k kVar = new k(ProtectedSandApp.s("跏\u0001"), 8);
            HEIAN_PERIOD = kVar;
            a aVar = new a(ProtectedSandApp.s("跐\u0001"), 9);
            NARA_PERIOD = aVar;
            b bVar = new b(ProtectedSandApp.s("跑\u0001"), 10);
            ASUKA_PERIOD = bVar;
            $VALUES = new d[]{cVar, c1281d, eVar, fVar, gVar, hVar, iVar, jVar, kVar, aVar, bVar};
        }

        private d(String str, int i4) {
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        /* synthetic */ d(String str, int i4, a aVar) {
            this(str, i4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0124, code lost:
    
        if (r14.f82436b != r8) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x032d  */
    static {
        /*
            Method dump skipped, instructions count: 963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.calendar.f0.<clinit>():void");
    }

    private f0(int i4, long j4, String str, String str2, String str3, String str4, String str5, byte b5, int i5) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("跬\u0001"));
        }
        if (str5.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("跫\u0001"));
        }
        if (b5 > 1 || b5 < -1) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("跪\u0001"), b5));
        }
        this.f82436b = i4;
        this.f82437c = j4;
        this.f82438d = str;
        this.f82439e = str2;
        this.f82440f = str3;
        this.f82441g = str4;
        this.f82442h = str5;
        this.court = b5;
        this.index = i5;
    }

    public static List<f0> B() {
        return C(d.OFFICIAL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    public static List<f0> C(d dVar) {
        ?? asList;
        int i4 = a.f82443a[dVar.ordinal()];
        if (i4 == 1) {
            asList = Arrays.asList(f82422m);
        } else if (i4 != 3) {
            int u4 = u(dVar);
            int x4 = x(dVar);
            asList = new ArrayList((x4 - u4) + 1);
            while (u4 <= x4) {
                asList.add(f82422m[u4]);
                u4++;
            }
        } else {
            asList = Arrays.asList(f82423n);
        }
        return Collections.unmodifiableList(asList);
    }

    private static f0 E(int i4, boolean z4) {
        return z4 ? f82423n[i4] : f82422m[i4];
    }

    static f0 F(int i4) {
        return f82422m[i4];
    }

    public static f0 G(String str) {
        f0 f0Var = f82426q.get(str);
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("跭\u0001"), str));
    }

    public static f0 H(int i4) {
        return I(i4, d.OFFICIAL);
    }

    public static f0 I(int i4, d dVar) {
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3 = null;
        if (i4 >= 701) {
            int i5 = a.f82443a[dVar.ordinal()];
            if (i5 == 1) {
                if (i4 >= 1873) {
                    return I(i4, d.MODERN);
                }
                int length = f82422m.length - 1;
                int i6 = 0;
                while (i6 <= length) {
                    int i7 = (i6 + length) >> 1;
                    if (f82422m[i7].f82436b <= i4) {
                        i6 = i7 + 1;
                    } else {
                        length = i7 - 1;
                    }
                }
                if (i6 != 0) {
                    return f82422m[i6 - 1];
                }
            } else if (i5 == 2) {
                int u4 = u(dVar);
                for (int length2 = f82422m.length - 1; length2 >= u4; length2--) {
                    f0Var = f82422m[length2];
                    if (f0Var.f82436b <= i4) {
                        f0Var3 = f0Var;
                        break;
                    }
                }
            } else if (i5 != 3) {
                if (i5 != 4) {
                    int u5 = u(dVar);
                    int x4 = x(dVar);
                    f0[] f0VarArr = f82422m;
                    if (i4 >= f0VarArr[u5].f82436b && i4 <= f0VarArr[x4 + 1].f82436b) {
                        while (x4 >= u5) {
                            f0Var = f82422m[x4];
                            if (f0Var.f82436b <= i4) {
                                f0Var3 = f0Var;
                                break;
                            }
                            x4--;
                        }
                    }
                } else if (i4 >= 1334 && i4 <= 1393) {
                    int i10 = f82425p.index - 1;
                    while (true) {
                        f0Var2 = f82422m[i10];
                        if (f0Var2.court != -1) {
                            break;
                        }
                        if (f0Var2.f82436b <= i4) {
                            break;
                        }
                        i10--;
                    }
                    f0Var3 = f0Var2;
                }
            } else if (i4 >= 1332 && i4 <= 1394) {
                for (int length3 = f82423n.length - 1; length3 >= 0; length3--) {
                    f0Var2 = f82423n[length3];
                    if (f0Var2.f82436b <= i4) {
                        f0Var3 = f0Var2;
                    }
                }
            }
        }
        if (f0Var3 != null) {
            return f0Var3;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("跮\u0001") + i4 + ProtectedSandApp.s("路\u0001") + dVar + ProtectedSandApp.s("跰\u0001"));
    }

    public static List<f0> J(String str) {
        String z4 = z(str, 0);
        e eVar = f82430u;
        return eVar.a(eVar.e(z4, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String n(CharSequence charSequence, int i4) {
        int min = Math.min(charSequence.length(), i4 + 32);
        StringBuilder sb = null;
        int i5 = i4;
        boolean z4 = true;
        while (i5 < min) {
            char charAt = charSequence.charAt(i5);
            char upperCase = z4 ? Character.toUpperCase(charAt) : Character.toLowerCase(charAt);
            boolean z5 = charAt == ' ';
            if (sb != null || upperCase != charAt) {
                if (sb == null) {
                    sb = new StringBuilder(32);
                    sb.append(charSequence.subSequence(i4, i5));
                }
                sb.append(upperCase);
            }
            i5++;
            z4 = z5;
        }
        return sb == null ? charSequence.subSequence(i4, min).toString() : sb.toString();
    }

    private Object readResolve() throws ObjectStreamException {
        try {
            int i4 = this.index;
            boolean z4 = true;
            if (this.court != 1) {
                z4 = false;
            }
            return E(i4, z4);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new StreamCorruptedException();
        }
    }

    private static int u(d dVar) {
        switch (a.f82443a[dVar.ordinal()]) {
            case 2:
                return f82431v.index;
            case 3:
            default:
                return 0;
            case 4:
                return f82424o.index;
            case 5:
                return PictureConfig.CHOOSE_REQUEST;
            case 6:
                return 185;
            case 7:
                return f82424o.index + 1;
            case 8:
                return 103;
            case 9:
                return 15;
            case 10:
                return 3;
        }
    }

    private static int x(d dVar) {
        switch (a.f82443a[dVar.ordinal()]) {
            case 3:
                return f82423n.length - 1;
            case 4:
                return f82424o.index + 8;
            case 5:
                return f82431v.index - 1;
            case 6:
                return 187;
            case 7:
                return SyslogAppender.LOG_LOCAL7;
            case 8:
                return f82424o.index - 1;
            case 9:
                return 102;
            case 10:
                return 14;
            case 11:
                return 2;
            default:
                return f82422m.length - 1;
        }
    }

    static String z(CharSequence charSequence, int i4) {
        int min = Math.min(charSequence.length(), i4 + 32);
        StringBuilder sb = null;
        for (int i5 = i4; i5 < min; i5++) {
            char charAt = charSequence.charAt(i5);
            char c5 = 362;
            char c6 = 363;
            char c7 = 332;
            char c10 = 333;
            if (i5 == i4) {
                if (charAt != 212 && charAt != 244 && charAt != 333) {
                    c7 = Character.toUpperCase(charAt);
                }
                if (charAt != 219 && charAt != 251 && charAt != 363) {
                    c5 = c7;
                }
            } else {
                if (charAt != 212 && charAt != 244 && charAt != 332) {
                    c10 = Character.toLowerCase(charAt);
                }
                if (charAt != 219 && charAt != 251 && charAt != 362) {
                    c6 = c10;
                }
                c5 = c6;
            }
            if (charAt == '\'') {
                c5 = kotlin.text.m0.rightSingleQuote;
            }
            if (charAt == ' ') {
                c5 = '-';
            }
            if (sb != null || c5 != charAt) {
                if (sb == null) {
                    sb = new StringBuilder(32);
                    sb.append(charSequence.subSequence(i4, i5));
                }
                sb.append(c5);
            }
        }
        return sb == null ? charSequence.subSequence(i4, min).toString() : sb.toString();
    }

    public boolean A() {
        return this.index >= f82431v.index;
    }

    public boolean D(d dVar) {
        return dVar.test(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f82436b == f0Var.f82436b && this.f82437c == f0Var.f82437c && this.f82438d.equals(f0Var.f82438d) && this.f82442h.equals(f0Var.f82442h) && this.court == f0Var.court;
    }

    public int hashCode() {
        long j4 = this.f82437c;
        return (int) (j4 ^ (j4 >>> 32));
    }

    @Override // net.time4j.engine.j
    public String name() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f82442h);
        sb.append(ProtectedSandApp.s("跱\u0001"));
        f0 o4 = o();
        if (o4 != null) {
            sb.append(this.f82436b);
            sb.append('-');
            sb.append(o4.f82436b);
        } else {
            sb.append(ProtectedSandApp.s("跲\u0001"));
            sb.append(this.f82436b);
        }
        sb.append(')');
        return sb.toString();
    }

    public f0 o() {
        if (this.court == 1) {
            int i4 = this.index;
            f0[] f0VarArr = f82423n;
            return i4 == f0VarArr.length - 1 ? f82425p : f0VarArr[i4 + 1];
        }
        int i5 = this.index;
        f0[] f0VarArr2 = f82422m;
        if (i5 == f0VarArr2.length - 1) {
            return null;
        }
        return f0VarArr2[i5 + 1];
    }

    public f0 p() {
        if (this.court == 1) {
            int i4 = this.index;
            return i4 == 0 ? f82422m[f82424o.index - 1] : f82423n[i4 - 1];
        }
        int i5 = this.index;
        if (i5 == 0) {
            return null;
        }
        return f82422m[i5 - 1];
    }

    public String q(Locale locale) {
        return r(locale, net.time4j.format.x.WIDE);
    }

    public String r(Locale locale, net.time4j.format.x xVar) {
        String str;
        if (locale.getLanguage().isEmpty()) {
            return this.f82442h;
        }
        int i4 = this.index;
        int i5 = f82431v.index;
        String s4 = ProtectedSandApp.s("跳\u0001");
        if (i4 < i5 || i4 > A.index || locale.getLanguage().equals(s4)) {
            if (locale.getLanguage().equals(ProtectedSandApp.s("跷\u0001"))) {
                return this.f82438d;
            }
            if (locale.getLanguage().equals(ProtectedSandApp.s("跸\u0001"))) {
                return this.f82439e;
            }
            if (locale.getLanguage().equals(ProtectedSandApp.s("跹\u0001"))) {
                return this.f82440f;
            }
            if (!locale.getLanguage().equals(s4)) {
                return this.f82442h;
            }
            return ProtectedSandApp.s("跺\u0001") + this.f82441g;
        }
        int i6 = 0;
        while (true) {
            f0[] f0VarArr = D;
            if (i6 >= f0VarArr.length) {
                str = null;
                break;
            }
            if (equals(f0VarArr[i6])) {
                str = C[i6];
                break;
            }
            i6++;
        }
        if (str == null) {
            throw new IllegalStateException(ProtectedSandApp.s("跶\u0001"));
        }
        if (xVar == net.time4j.format.x.NARROW) {
            str = str.concat(ProtectedSandApp.s("跴\u0001"));
        }
        return net.time4j.format.b.d(ProtectedSandApp.s("践\u0001"), locale).o().get(str);
    }

    public int s() {
        return this.f82436b;
    }

    int t() {
        return this.index;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f82442h);
        sb.append(' ');
        sb.append(this.f82438d);
        sb.append(' ');
        f0 o4 = o();
        if (o4 != null) {
            sb.append(this.f82436b);
            sb.append('-');
            sb.append(o4.f82436b);
        } else {
            sb.append(ProtectedSandApp.s("跲\u0001"));
            sb.append(this.f82436b);
        }
        if (this.court != 0) {
            sb.append(ProtectedSandApp.s("跱\u0001"));
            sb.append(this.court == 1 ? 'N' : 'S');
            sb.append(')');
        }
        return sb.toString();
    }

    public net.time4j.l0 v() {
        return net.time4j.l0.w1(this.f82437c, net.time4j.engine.b0.UTC);
    }

    long w() {
        return this.f82437c;
    }

    int y() {
        int i4;
        int i5;
        if (d.NORTHERN_COURT.test(this)) {
            i4 = (this.index - f82423n.length) + f82425p.index;
            i5 = f82433x.index;
        } else {
            i4 = this.index;
            i5 = f82433x.index;
        }
        return (i4 - i5) + 1;
    }

    /* compiled from: Nengo.java */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private c f82452a;

        private e() {
            this.f82452a = null;
        }

        private static c b(c cVar, String str, int i4) {
            if (cVar == null) {
                return null;
            }
            char charAt = str.charAt(i4);
            return charAt < cVar.f82447a ? b(cVar.f82448b, str, i4) : charAt > cVar.f82447a ? b(cVar.f82450d, str, i4) : i4 < str.length() + (-1) ? b(cVar.f82449c, str, i4 + 1) : cVar;
        }

        private static c c(c cVar, String str, f0 f0Var, int i4) {
            char charAt = str.charAt(i4);
            if (cVar == null) {
                cVar = new c(null);
                cVar.f82447a = charAt;
            }
            if (charAt < cVar.f82447a) {
                cVar.f82448b = c(cVar.f82448b, str, f0Var, i4);
            } else if (charAt > cVar.f82447a) {
                cVar.f82450d = c(cVar.f82450d, str, f0Var, i4);
            } else if (i4 < str.length() - 1) {
                cVar.f82449c = c(cVar.f82449c, str, f0Var, i4 + 1);
            } else {
                if (cVar.f82451e == null) {
                    cVar.f82451e = new ArrayList();
                }
                cVar.f82451e.add(f0Var);
            }
            return cVar;
        }

        List<f0> a(String str) {
            if (str == null || str.length() == 0) {
                return Collections.emptyList();
            }
            c b5 = b(this.f82452a, str, 0);
            return b5 == null ? Collections.emptyList() : Collections.unmodifiableList(b5.f82451e);
        }

        void d(String str, f0 f0Var) {
            if (str.isEmpty()) {
                throw new IllegalArgumentException(ProtectedSandApp.s("跒\u0001"));
            }
            this.f82452a = c(this.f82452a, str, f0Var, 0);
        }

        String e(CharSequence charSequence, int i4) {
            c cVar = this.f82452a;
            int length = charSequence.length();
            int i5 = i4;
            int i6 = i5;
            while (cVar != null && i5 < length) {
                char charAt = charSequence.charAt(i5);
                if (charAt < cVar.f82447a) {
                    cVar = cVar.f82448b;
                } else if (charAt > cVar.f82447a) {
                    cVar = cVar.f82450d;
                } else {
                    i5++;
                    if (cVar.f82451e != null) {
                        i6 = i5;
                    }
                    cVar = cVar.f82449c;
                }
            }
            if (i4 >= i6) {
                return null;
            }
            return charSequence.subSequence(i4, i6).toString();
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    /* compiled from: Nengo.java */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private char f82447a;

        /* renamed from: b, reason: collision with root package name */
        private c f82448b;

        /* renamed from: c, reason: collision with root package name */
        private c f82449c;

        /* renamed from: d, reason: collision with root package name */
        private c f82450d;

        /* renamed from: e, reason: collision with root package name */
        private List<f0> f82451e;

        private c() {
            this.f82447a = (char) 0;
            this.f82448b = null;
            this.f82449c = null;
            this.f82450d = null;
            this.f82451e = null;
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }
}
