package net.time4j.calendar.bahai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.rtmp.TXLiveConstants;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import net.time4j.calendar.o0;
import net.time4j.engine.ChronoException;
import net.time4j.engine.a0;
import net.time4j.engine.b0;
import net.time4j.engine.d0;
import net.time4j.engine.e0;
import net.time4j.engine.g0;
import net.time4j.engine.j0;
import net.time4j.engine.p0;
import net.time4j.engine.q;
import net.time4j.engine.r;
import net.time4j.engine.w;
import net.time4j.engine.z;
import net.time4j.format.u;
import net.time4j.format.v;
import net.time4j.format.x;
import net.time4j.g1;
import net.time4j.i1;
import net.time4j.l0;
import net.time4j.m0;
import net.time4j.w0;

/* compiled from: BadiCalendar.java */
@net.time4j.format.c("bahai")
/* loaded from: classes7.dex */
public final class a extends net.time4j.engine.n<n, a> {
    private static final j0<n, a> A;

    /* renamed from: i, reason: collision with root package name */
    private static final int f82376i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static final int f82377j = 1;

    /* renamed from: k, reason: collision with root package name */
    private static final int f82378k = 2;

    /* renamed from: l, reason: collision with root package name */
    private static final int f82379l = 3;

    /* renamed from: m, reason: collision with root package name */
    private static final int f82380m = 4;

    /* renamed from: n, reason: collision with root package name */
    private static final int f82381n = 5;

    /* renamed from: p, reason: collision with root package name */
    @d0(dynamic = true, format = "G")
    public static final q<net.time4j.calendar.bahai.c> f82383p;

    /* renamed from: q, reason: collision with root package name */
    @d0(alt = "y", dynamic = true, format = "Y")
    public static final o0<Integer, a> f82384q;

    /* renamed from: r, reason: collision with root package name */
    @d0(alt = "k", dynamic = true, format = "K")
    public static final q<Integer> f82385r;

    /* renamed from: s, reason: collision with root package name */
    @d0(alt = "v", dynamic = true, format = "V")
    public static final o0<Integer, a> f82386s;
    private static final long serialVersionUID = 7091925253640345123L;

    /* renamed from: t, reason: collision with root package name */
    @d0(alt = "x", dynamic = true, format = "X")
    public static final v<Integer> f82387t;

    /* renamed from: u, reason: collision with root package name */
    @d0(alt = "m", dynamic = true, format = "M")
    public static final o0<net.time4j.calendar.bahai.e, a> f82388u;

    /* renamed from: v, reason: collision with root package name */
    @d0(dynamic = true, format = "A")
    public static final q<net.time4j.calendar.bahai.d> f82389v;

    /* renamed from: w, reason: collision with root package name */
    @d0(alt = "d", dynamic = true, format = "D")
    public static final o0<Integer, a> f82390w;

    /* renamed from: x, reason: collision with root package name */
    public static final o0<Integer, a> f82391x;

    /* renamed from: y, reason: collision with root package name */
    @d0(dynamic = true, format = "E")
    public static final o0<g1, a> f82392y;

    /* renamed from: z, reason: collision with root package name */
    private static final net.time4j.engine.l<a> f82393z;

    /* renamed from: b, reason: collision with root package name */
    private final transient int f82394b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f82395c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f82396d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f82397e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f82398f;

    /* renamed from: g, reason: collision with root package name */
    public static final net.time4j.engine.c<net.time4j.calendar.bahai.f> f82374g = net.time4j.format.a.e(ProtectedSandApp.s("贪\u0001"), net.time4j.calendar.bahai.f.class);

    /* renamed from: h, reason: collision with root package name */
    private static final net.time4j.calendar.astro.j f82375h = net.time4j.calendar.astro.j.C().d(51, 25, com.google.firebase.remoteconfig.p.f60679p).f(35, 42, com.google.firebase.remoteconfig.p.f60679p).i(net.time4j.calendar.astro.k.TIME4J).b();

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f82382o = {15785, 16150, 16515, 16881, 17246, 17611, 17976, 18342, 18707, 19072, 19437, 19803, 20168, 20533, 20898, 21263, 21629, 21994, 22359, 22724, 23090, 23455, 23820, 24185, 24551, 24916, 25281, 25646, 26012, 26377, 26742, 27107, 27473, 27838, 28203, 28568, 28934, 29299, 29664, 30029, 30395, 30760, 31125, 31490, 31855, 32221, 32586, 32951, 33316, 33682, 34047, 34412, 34777, 35143, 35508, 35873, 36238, 36604, 36969, 37334, 37699, 38065, 38430, 38795, 39160, 39526, 39891, 40256, 40621, 40987, 41352, 41717, 42082, 42448, 42813, 43178, 43543, 43908, 44274, 44639, 45004, 45369, 45735, 46100, 46465, 46830, 47196, 47561, 47926, 48291, 48657, 49022, 49387, 49752, 50118, 50483, 50848, 51213, 51579, 51944, 52309, 52674, 53040, 53405, 53770, 54135, 54501, 54866, 55231, 55596, 55961, 56327, 56692, 57057, 57422, 57788, 58153, 58518, 58883, 59249, 59614, 59979, 60344, 60710, 61075, 61440, 61805, 62171, 62536, 62901, 63266, 63632, 63997, 64362, 64727, 65093, 65458, 65823, 66188, 66554, 66919, 67284, 67649, 68014, 68380, 68745, 69110, 69475, 69841, 70206, 70571, 70936, 71302, 71667, 72032, 72397, 72763, 73128, 73493, 73858, 74224, 74589, 74954, 75319, 75685, 76050, 76415, 76780, 77146, 77511, 77876, 78241, 78607, 78972, 79337, 79702, 80067, 80433, 80798, 81163, 81528, 81894, 82259, 82624, 82989, 83355, 83720, 84085, 84450, 84816, 85181, 85546, 85911, 86277, 86642, 87007, 87372, 87738, 88103, 88468, 88833, 89199, 89564, 89929, 90294, 90660, 91025, 91390, 91755, 92120, 92486, 92851, 93216, 93581, 93947, 94312, 94677, 95042, 95408, 95773, 96138, 96503, 96869, 97234, 97599, 97964, 98330, 98695, 99060, 99425, 99791, 100156, 100521, 100886, 101252, 101617, 101982, 102347, 102713, 103078, 103443, 103808, 104173, 104539, 104904, 105269, 105634, 106000, 106365, 106730, 107095, 107461, 107826, 108191, 108556, 108922, 109287, 109652, 110017, 110383, 110748, 111113, 111478, 111844, 112209, 112574, 112939, 113305, 113670, 114035, 114400, 114766, 115131, 115496, 115861, 116226, 116592, 116957, 117322, 117687, 118053, 118418, 118783, 119148, 119514, 119879, 120244, 120609, 120975, 121340, 121705, 122070, 122436, 122801, 123166, 123531, 123897, 124262, 124627, 124992, 125358, 125723, 126088, 126453, 126819, 127184, 127549, 127914, 128279, 128645, 129010, 129375, 129740, 130106, 130471, 130836, 131201, 131567, 131932, 132297, 132662, 133028, 133393, 133758, 134123, 134489, 134854, 135219, 135584, 135950, 136315, 136680, 137045, 137411, 137776, 138141, 138506, 138872, 139237, 139602, 139967, 140332, 140698, 141063, 141428, 141793, 142159, 142524, 142889, 143254, 143620, 143985, 144350, 144715, 145081, 145446, 145811, 146176, 146542, 146907, 147272, 147637, 148003, 148368, 148733, 149098, 149464, 149829, 150194, 150559, 150924, 151290, 151655, 152020, 152385, 152751, 153116, 153481, 153846, 154212, 154577, 154942, 155307, 155673, 156038, 156403, 156768, 157134, 157499, 157864, 158229, 158595, 158960, 159325, 159690, 160056, 160421, 160786, 161151, 161517, 161882, 162247, 162612, 162978, 163343, 163708, 164073, 164438, 164804, 165169, 165534, 165899, 166265, 166630, 166995, 167360, 167726, 168091, 168456, 168821, 169187, 169552, 169917, 170282, 170648, 171013, 171378, 171743, 172109, 172474, 172839, 173204, 173570, 173935, 174300, 174665, 175031, 175396, 175761, 176126, 176491, 176857, 177222, 177587, 177952, 178318, 178683, 179048, 179413, 179779, 180144, 180509, 180874, 181240, 181605, 181970, 182335, 182701, 183066, 183431, 183796, 184162, 184527, 184892, 185257, 185623, 185988, 186353, 186718, 187084, 187449, 187814, 188179, 188544, 188910, 189275, 189640, 190005, 190371, 190736, 191101, 191466, 191832, 192197, 192562, 192927, 193293, 193658, 194023, 194388, 194754, 195119, 195484, 195849, 196215, 196580, 196945, 197310, 197676, 198041, 198406, 198771, 199136, 199502, 199867, 200232, 200597, 200963, 201328, 201693, 202058, 202424, 202789, 203154, 203519, 203885, 204250, 204615, 204980, 205346, 205711, 206076, 206441, 206807, 207172, 207537, 207902, 208268, 208633, 208998, 209363, 209729, 210094, 210459, 210824, 211189, 211555, 211920, 212285, 212650, 213016, 213381, 213746, 214111, 214477, 214842, 215207, 215572, 215938, 216303, 216668, 217033, 217399, 217764, 218129, 218494, 218860, 219225, 219590, 219955, 220321, 220686, 221051, 221416, 221782, 222147, 222512, 222877, 223242, 223608, 223973, 224338, 224703, 225069, 225434, 225799, 226164, 226530, 226895, 227260, 227625, 227991, 228356, 228721, 229086, 229452, 229817, 230182, 230547, 230913, 231278, 231643, 232008, 232374, 232739, 233104, 233469, 233835, 234200, 234565, 234930, 235295, 235661, 236026, 236391, 236756, 237122, 237487, 237852, 238217, 238583, 238948, 239313, 239678, 240044, 240409, 240774, 241139, 241505, 241870, 242235, 242600, 242966, 243331, 243696, 244061, 244427, 244792, 245157, 245522, 245888, 246253, 246618, 246983, 247348, 247714, 248079, 248444, 248809, 249175, 249540, 249905, 250270, 250636, 251001, 251366, 251731, 252097, 252462, 252827, 253192, 253558, 253923, 254288, 254653, 255019, 255384, 255749, 256114, 256480, 256845, 257210, 257575, 257941, 258306, 258671, 259036, 259401, 259767, 260132, 260497, 260862, 261228, 261593, 261958, 262323, 262689, 263054, 263419, 263784, 264150, 264515, 264880, 265245, 265611, 265976, 266341, 266706, 267072, 267437, 267802, 268167, 268533, 268898, 269263, 269628, 269994, 270359, 270724, 271089, 271454, 271820, 272185, 272550, 272915, 273281, 273646, 274011, 274376, 274742, 275107, 275472, 275837, 276203, 276568, 276933, 277298, 277664, 278029, 278394, 278759, 279125, 279490, 279855, 280220, 280586, 280951, 281316, 281681, 282047, 282412, 282777, 283142, 283507, 283873, 284238, 284603, 284968, 285334, 285699, 286064, 286429, 286795, 287160, 287525, 287890, 288256, 288621, 288986, 289351, 289717, 290082, 290447, 290812, 291178, 291543, 291908, 292273, 292639, 293004, 293369, 293734, 294100, 294465, 294830, 295195, 295560, 295926, 296291, 296656, 297021, 297387, 297752, 298117, 298482, 298848, 299213, 299578, 299943, 300309, 300674, 301039, 301404, 301770, 302135, 302500, 302865, 303231, 303596, 303961, 304326, 304692, 305057, 305422, 305787, 306153, 306518, 306883, 307248, 307613, 307979, 308344, 308709, 309074, 309440, 309805, 310170, 310535, 310901, 311266, 311631, 311996, 312362, 312727, 313092, 313457, 313823, 314188, 314553, 314918, 315284, 315649, 316014, 316379, 316745, 317110, 317475, 317840, 318206, 318571, 318936, 319301, 319666, 320032, 320397, 320762, 321127, 321493, 321858, 322223, 322588, 322954, 323319, 323684, 324049, 324415, 324780, 325145, 325510, 325876, 326241, 326606, 326971, 327337, 327702, 328067, 328432, 328798, 329163, 329528, 329893, 330259, 330624, 330989, 331354, 331719, 332085, 332450, 332815, 333180, 333546, 333911, 334276, 334641, 335007, 335372, 335737, 336102, 336468, 336833, 337198, 337563, 337929, 338294, 338659, 339024, 339390, 339755, 340120, 340485, 340851, 341216, 341581, 341946, 342312, 342677, 343042, 343407, 343772, 344138, 344503, 344868, 345233, 345599, 345964, 346329, 346694, 347060, 347425, 347790, 348155, 348521, 348886};

    /* compiled from: BadiCalendar.java */
    /* renamed from: net.time4j.calendar.bahai.a$a, reason: collision with other inner class name */
    static class C1279a extends net.time4j.calendar.service.i<net.time4j.calendar.bahai.c, a> {
        C1279a(String str, Class cls, Class cls2, char c5) {
            super(str, cls, cls2, c5);
        }

        @Override // net.time4j.calendar.service.i
        protected u z(net.time4j.engine.d dVar, net.time4j.format.m mVar, boolean z4) {
            return net.time4j.calendar.bahai.c.accessor((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT), (x) dVar.b(net.time4j.format.a.f82785g, x.WIDE));
        }
    }

    /* compiled from: BadiCalendar.java */
    static class b extends net.time4j.calendar.service.j<a> {
        b(String str, Class cls, int i4, int i5, char c5) {
            super(str, cls, i4, i5, c5);
        }

        @Override // net.time4j.format.d, net.time4j.engine.e, net.time4j.engine.q
        public String getDisplayName(Locale locale) {
            return net.time4j.format.b.d(ProtectedSandApp.s("贃\u0001"), locale).o().get(ProtectedSandApp.s("贄\u0001"));
        }
    }

    /* compiled from: BadiCalendar.java */
    static class c extends net.time4j.calendar.service.j<a> {
        c(String str, Class cls, int i4, int i5, char c5) {
            super(str, cls, i4, i5, c5);
        }

        @Override // net.time4j.format.d, net.time4j.engine.e, net.time4j.engine.q
        public String getDisplayName(Locale locale) {
            return net.time4j.format.b.d(ProtectedSandApp.s("贅\u0001"), locale).o().get(ProtectedSandApp.s("贆\u0001"));
        }
    }

    /* compiled from: BadiCalendar.java */
    static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82399a;

        static {
            int[] iArr = new int[n.values().length];
            f82399a = iArr;
            try {
                iArr[n.VAHID_CYCLES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82399a[n.YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82399a[n.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82399a[n.WEEKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f82399a[n.DAYS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: BadiCalendar.java */
    private static class e extends net.time4j.calendar.service.k<a> {

        /* renamed from: j, reason: collision with root package name */
        static final e f82400j = new e();
        private static final long serialVersionUID = -1733732651700208755L;

        private e() {
            super(a.class, a.I0());
        }

        private u o0(net.time4j.engine.d dVar) {
            Locale N0 = a.N0(dVar);
            net.time4j.calendar.bahai.f K0 = a.K0(dVar);
            return net.time4j.format.b.d(ProtectedSandApp.s("贈\u0001"), N0).p(ProtectedSandApp.s("贉\u0001"), g1.class, K0.variant());
        }

        @Override // net.time4j.calendar.service.i, net.time4j.format.v
        public void print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException {
            appendable.append(o0(dVar).g(((g1) pVar.r(this)).roll(2)));
        }

        @Override // net.time4j.calendar.service.i, net.time4j.format.v
        /* renamed from: q0, reason: merged with bridge method [inline-methods] */
        public g1 parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
            return ((g1) o0(dVar).d(charSequence, parsePosition, g1.class, dVar)).roll(-2);
        }

        @Override // net.time4j.engine.e
        protected boolean u() {
            return true;
        }
    }

    /* compiled from: BadiCalendar.java */
    private static class f implements a0<a, net.time4j.calendar.bahai.c> {
        private f() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtCeiling(a aVar) {
            return a.f82384q;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtFloor(a aVar) {
            return a.f82384q;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.bahai.c getMaximum(a aVar) {
            return net.time4j.calendar.bahai.c.BAHAI;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.bahai.c getMinimum(a aVar) {
            return net.time4j.calendar.bahai.c.BAHAI;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.bahai.c getValue(a aVar) {
            return net.time4j.calendar.bahai.c.BAHAI;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(a aVar, net.time4j.calendar.bahai.c cVar) {
            return cVar != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a withValue(a aVar, net.time4j.calendar.bahai.c cVar, boolean z4) {
            if (cVar != null) {
                return aVar;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("贊\u0001"));
        }

        f(C1279a c1279a) {
        }
    }

    /* compiled from: BadiCalendar.java */
    private static class g implements net.time4j.engine.o0<a> {

        /* renamed from: a, reason: collision with root package name */
        private final n f82401a;

        g(n nVar) {
            this.f82401a = nVar;
        }

        private static int e(a aVar) {
            return ((f(aVar) * 19) + (aVar.W0() ? 18 : aVar.O0().getValue())) - 1;
        }

        private static int f(a aVar) {
            return ((((aVar.f82395c - 1) + ((aVar.f82394b - 1) * 19)) * 19) + aVar.f82396d) - 1;
        }

        @Override // net.time4j.engine.o0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a b(a aVar, long j4) {
            int i4 = d.f82399a[this.f82401a.ordinal()];
            if (i4 == 1) {
                j4 = net.time4j.base.c.i(j4, 19L);
            } else if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4) {
                        j4 = net.time4j.base.c.i(j4, 7L);
                    } else if (i4 != 5) {
                        throw new UnsupportedOperationException(this.f82401a.name());
                    }
                    return (a) a.f82393z.e(net.time4j.base.c.f(a.f82393z.f(aVar), j4));
                }
                long f4 = net.time4j.base.c.f(e(aVar), j4);
                int g4 = net.time4j.base.c.g(net.time4j.base.c.b(f4, 6859)) + 1;
                int d5 = net.time4j.base.c.d(f4, 6859);
                int a5 = net.time4j.base.c.a(d5, 361) + 1;
                int c5 = net.time4j.base.c.c(d5, 361);
                return a.d1(g4, a5, net.time4j.base.c.a(c5, 19) + 1, net.time4j.calendar.bahai.e.valueOf(net.time4j.base.c.c(c5, 19) + 1), aVar.W0() ? 19 : aVar.f82398f);
            }
            long f5 = net.time4j.base.c.f(f(aVar), j4);
            int g5 = net.time4j.base.c.g(net.time4j.base.c.b(f5, 361)) + 1;
            int d6 = net.time4j.base.c.d(f5, 361);
            int a6 = net.time4j.base.c.a(d6, 19) + 1;
            int c6 = net.time4j.base.c.c(d6, 19) + 1;
            return a.d1(g5, a6, c6, aVar.J0(), (aVar.f82398f != 5 || a.Y0(g5, a6, c6)) ? aVar.f82398f : 4);
        }

        @Override // net.time4j.engine.o0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(a aVar, a aVar2) {
            int i4 = d.f82399a[this.f82401a.ordinal()];
            if (i4 == 1) {
                return n.YEARS.between(aVar, aVar2) / 19;
            }
            if (i4 == 2) {
                int f4 = f(aVar2) - f(aVar);
                if (f4 > 0 && aVar2.H0() < aVar.H0()) {
                    f4--;
                } else if (f4 < 0 && aVar2.H0() > aVar.H0()) {
                    f4++;
                }
                return f4;
            }
            if (i4 != 3) {
                if (i4 == 4) {
                    return n.DAYS.between(aVar, aVar2) / 7;
                }
                if (i4 == 5) {
                    return a.f82393z.f(aVar2) - a.f82393z.f(aVar);
                }
                throw new UnsupportedOperationException(this.f82401a.name());
            }
            long e4 = e(aVar2) - e(aVar);
            boolean W0 = aVar.W0();
            int i5 = aVar.f82398f;
            if (W0) {
                i5 += 19;
            }
            boolean W02 = aVar2.W0();
            int i6 = aVar2.f82398f;
            if (W02) {
                i6 += 19;
            }
            return (e4 <= 0 || i6 >= i5) ? (e4 >= 0 || i6 <= i5) ? e4 : e4 + 1 : e4 - 1;
        }
    }

    /* compiled from: BadiCalendar.java */
    private static class h implements e0<a> {

        /* renamed from: b, reason: collision with root package name */
        private final int f82402b;

        h(int i4) {
            this.f82402b = i4;
        }

        private int g(a aVar) {
            int i4 = this.f82402b;
            if (i4 == 0) {
                return 3;
            }
            if (i4 != 1 && i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4) {
                        return aVar.X0() ? 366 : 365;
                    }
                    if (i4 == 5) {
                        return 1083;
                    }
                    throw new UnsupportedOperationException(ProtectedSandApp.s("贋\u0001") + this.f82402b);
                }
                if (aVar.W0()) {
                    return aVar.X0() ? 5 : 4;
                }
            }
            return 19;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtCeiling(a aVar) {
            int i4 = this.f82402b;
            if (i4 == 0) {
                return a.f82386s;
            }
            if (i4 == 1) {
                return a.f82387t;
            }
            if (i4 != 2) {
                if (i4 == 3 || i4 == 4) {
                    return null;
                }
                if (i4 != 5) {
                    throw new UnsupportedOperationException(ProtectedSandApp.s("贋\u0001") + this.f82402b);
                }
            }
            return a.f82388u;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtFloor(a aVar) {
            int i4 = this.f82402b;
            if (i4 == 0) {
                return a.f82386s;
            }
            if (i4 == 1) {
                return a.f82387t;
            }
            if (i4 != 2) {
                if (i4 == 3 || i4 == 4) {
                    return null;
                }
                if (i4 != 5) {
                    throw new UnsupportedOperationException(ProtectedSandApp.s("贋\u0001") + this.f82402b);
                }
            }
            return a.f82388u;
        }

        @Override // net.time4j.engine.e0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public int d(a aVar) {
            int i4 = this.f82402b;
            if (i4 == 0) {
                return aVar.f82394b;
            }
            if (i4 == 1) {
                return aVar.f82395c;
            }
            if (i4 == 2) {
                return aVar.f82396d;
            }
            if (i4 == 3) {
                return aVar.f82398f;
            }
            if (i4 == 4) {
                return aVar.H0();
            }
            if (i4 == 5) {
                return aVar.S0();
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("贋\u0001") + this.f82402b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(a aVar) {
            return Integer.valueOf(g(aVar));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(a aVar) {
            return 1;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer getValue(a aVar) {
            return Integer.valueOf(d(aVar));
        }

        @Override // net.time4j.engine.e0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean e(a aVar, int i4) {
            return 1 <= i4 && g(aVar) >= i4;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public boolean j(a aVar, Integer num) {
            return num != null && e(aVar, num.intValue());
        }

        @Override // net.time4j.engine.e0
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public a a(a aVar, int i4, boolean z4) {
            if (!e(aVar, i4)) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("贌\u0001"), i4));
            }
            int i5 = aVar.f82398f;
            int i6 = this.f82402b;
            if (i6 == 0) {
                return new a(i4, aVar.f82395c, aVar.f82396d, aVar.f82397e, (i5 == 5 && aVar.W0() && !a.Y0(i4, aVar.f82395c, aVar.f82396d)) ? 4 : i5, null);
            }
            if (i6 == 1) {
                return new a(aVar.f82394b, i4, aVar.f82396d, aVar.f82397e, (i5 == 5 && aVar.W0() && !a.Y0(aVar.f82394b, i4, aVar.f82396d)) ? 4 : i5, null);
            }
            if (i6 == 2) {
                return new a(aVar.f82394b, aVar.f82395c, i4, aVar.f82397e, (i5 == 5 && aVar.W0() && !a.Y0(aVar.f82394b, aVar.f82395c, i4)) ? 4 : i5, null);
            }
            if (i6 == 3) {
                return new a(aVar.f82394b, aVar.f82395c, aVar.f82396d, aVar.f82397e, i4, null);
            }
            if (i6 == 4) {
                return aVar.g1(i4);
            }
            if (i6 != 5) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("贋\u0001") + this.f82402b);
            }
            int i7 = i4 - 1;
            int a5 = net.time4j.base.c.a(i7, 361);
            int i10 = a5 + 1;
            int a6 = net.time4j.base.c.a((i4 - (a5 * 361)) - 1, 19) + 1;
            int c5 = net.time4j.base.c.c(i7, 19) + 1;
            if (i5 == 5 && aVar.W0() && !a.Y0(i10, a6, c5)) {
                i5 = 4;
            }
            return a.d1(i10, a6, c5, aVar.J0(), i5);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public a withValue(a aVar, Integer num, boolean z4) {
            if (num != null) {
                return a(aVar, num.intValue(), z4);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("贍\u0001"));
        }
    }

    /* compiled from: BadiCalendar.java */
    private static class i extends net.time4j.engine.e<net.time4j.calendar.bahai.d> implements v<net.time4j.calendar.bahai.d>, a0<a, net.time4j.calendar.bahai.d> {

        /* renamed from: b, reason: collision with root package name */
        static final i f82403b = new i();
        private static final long serialVersionUID = -772152174221291354L;

        private i() {
            super(ProtectedSandApp.s("贎\u0001"));
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
        
            if (r4.containsKey(r0) != false) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private net.time4j.format.u y(java.util.Locale r3, net.time4j.engine.d r4) {
            /*
                r2 = this;
                net.time4j.engine.c<net.time4j.calendar.bahai.f> r0 = net.time4j.calendar.bahai.a.f82374g
                net.time4j.calendar.bahai.f r1 = net.time4j.calendar.bahai.f.TRANSCRIPTION
                java.lang.Object r4 = r4.b(r0, r1)
                net.time4j.calendar.bahai.f r4 = (net.time4j.calendar.bahai.f) r4
                java.lang.String r0 = "贏\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                net.time4j.format.b r3 = net.time4j.format.b.d(r0, r3)
                net.time4j.calendar.bahai.f r0 = net.time4j.calendar.bahai.f.MEANING
                if (r4 != r0) goto L29
                java.util.Map r4 = r3.o()
                java.lang.String r0 = "贐\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                boolean r4 = r4.containsKey(r0)
                if (r4 == 0) goto L29
                goto L2f
            L29:
                java.lang.String r0 = "贑\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            L2f:
                java.lang.Class r4 = r2.getType()
                r1 = 0
                java.lang.String[] r1 = new java.lang.String[r1]
                net.time4j.format.u r3 = r3.p(r0, r4, r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.calendar.bahai.a.i.y(java.util.Locale, net.time4j.engine.d):net.time4j.format.u");
        }

        @Override // net.time4j.engine.a0
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtFloor(a aVar) {
            return a.f82390w;
        }

        @Override // net.time4j.engine.q
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.bahai.d getDefaultMaximum() {
            return net.time4j.calendar.bahai.d.AYYAM_I_HA;
        }

        @Override // net.time4j.engine.q
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.bahai.d getDefaultMinimum() {
            return net.time4j.calendar.bahai.d.AYYAM_I_HA;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.bahai.d getMaximum(a aVar) {
            return net.time4j.calendar.bahai.d.AYYAM_I_HA;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.bahai.d getMinimum(a aVar) {
            return net.time4j.calendar.bahai.d.AYYAM_I_HA;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.bahai.d getValue(a aVar) {
            if (aVar.W0()) {
                return net.time4j.calendar.bahai.d.AYYAM_I_HA;
            }
            throw new ChronoException(ProtectedSandApp.s("贒\u0001") + aVar);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean j(a aVar, net.time4j.calendar.bahai.d dVar) {
            return dVar == net.time4j.calendar.bahai.d.AYYAM_I_HA;
        }

        @Override // net.time4j.format.v
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.bahai.d parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
            return (net.time4j.calendar.bahai.d) y((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT), dVar).d(charSequence, parsePosition, getType(), dVar);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public a withValue(a aVar, net.time4j.calendar.bahai.d dVar, boolean z4) {
            if (dVar == net.time4j.calendar.bahai.d.AYYAM_I_HA) {
                return new a(aVar.f82394b, aVar.f82395c, aVar.f82396d, 0, Math.min(aVar.f82398f, aVar.X0() ? 5 : 4), null);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("贓\u0001") + dVar);
        }

        @Override // net.time4j.engine.e, net.time4j.engine.q
        public String getDisplayName(Locale locale) {
            return net.time4j.calendar.bahai.d.AYYAM_I_HA.getDisplayName(locale);
        }

        @Override // net.time4j.engine.e, net.time4j.engine.q
        public char getSymbol() {
            return 'A';
        }

        @Override // net.time4j.engine.q
        public Class<net.time4j.calendar.bahai.d> getType() {
            return net.time4j.calendar.bahai.d.class;
        }

        @Override // net.time4j.engine.q
        public boolean isDateElement() {
            return true;
        }

        @Override // net.time4j.engine.q
        public boolean isTimeElement() {
            return false;
        }

        @Override // net.time4j.format.v
        public void print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException, ChronoException {
            appendable.append(y((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT), dVar).g((net.time4j.calendar.bahai.d) pVar.r(this)));
        }

        @Override // net.time4j.engine.e
        protected boolean u() {
            return true;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtCeiling(a aVar) {
            return a.f82390w;
        }
    }

    /* compiled from: BadiCalendar.java */
    private static class j implements net.time4j.engine.u<a> {
        private j() {
        }

        @Override // net.time4j.engine.u
        public g0 a() {
            return g0.a(a.f82375h.N());
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [net.time4j.base.f] */
        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
            net.time4j.tz.k G;
            net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f82782d;
            if (dVar.c(cVar)) {
                G = (net.time4j.tz.k) dVar.a(cVar);
            } else {
                if (!((net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART)).isLax()) {
                    return null;
                }
                G = net.time4j.tz.l.e0().G();
            }
            return (a) net.time4j.d0.y0(eVar.c()).d1(a.A, G, (g0) dVar.b(net.time4j.format.a.f82799u, a())).m();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a e(r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            boolean z6;
            int i4;
            int i5;
            int i6;
            int i7;
            int l4 = rVar.l(a.f82385r);
            if (l4 == Integer.MIN_VALUE) {
                l4 = 1;
            } else if (l4 < 1 || l4 > 3) {
                rVar.M(p0.ERROR_MESSAGE, ProtectedSandApp.s("贙\u0001") + l4);
                return null;
            }
            int l5 = rVar.l(a.f82386s);
            int i10 = 0;
            if (l5 == Integer.MIN_VALUE) {
                z6 = false;
            } else {
                if (l5 < 1 || l5 > 19) {
                    rVar.M(p0.ERROR_MESSAGE, ProtectedSandApp.s("贘\u0001") + l5);
                    return null;
                }
                z6 = true;
            }
            int l6 = rVar.l(a.f82387t);
            if (l6 == Integer.MIN_VALUE) {
                o0<Integer, a> o0Var = a.f82384q;
                if (!rVar.w(o0Var)) {
                    rVar.M(p0.ERROR_MESSAGE, ProtectedSandApp.s("贔\u0001"));
                    return null;
                }
                a aVar = (a) a.D0().x0().K(o0Var, rVar.l(o0Var));
                i5 = aVar.L0();
                i4 = aVar.R0();
                l6 = aVar.T0();
            } else {
                if (!z6) {
                    rVar.M(p0.ERROR_MESSAGE, ProtectedSandApp.s("贕\u0001"));
                    return null;
                }
                if (l6 < 1 || l6 > 19) {
                    rVar.M(p0.ERROR_MESSAGE, ProtectedSandApp.s("贗\u0001") + l6);
                    return null;
                }
                i4 = l5;
                i5 = l4;
            }
            o0<net.time4j.calendar.bahai.e, a> o0Var2 = a.f82388u;
            boolean w4 = rVar.w(o0Var2);
            String s4 = ProtectedSandApp.s("贖\u0001");
            if (w4) {
                int value = ((net.time4j.calendar.bahai.e) rVar.r(o0Var2)).getValue();
                int l7 = rVar.l(a.f82390w);
                if (l7 >= 1 && l7 <= 19) {
                    return new a(i5, i4, l6, value, l7, null);
                }
                rVar.M(p0.ERROR_MESSAGE, s4);
                return null;
            }
            if (rVar.w(a.f82389v)) {
                int l10 = rVar.l(a.f82390w);
                if (l10 >= 1) {
                    if (l10 <= (a.Y0(i5, i4, l6) ? 5 : 4)) {
                        return new a(i5, i4, l6, 0, l10, null);
                    }
                }
                rVar.M(p0.ERROR_MESSAGE, s4);
                return null;
            }
            int l11 = rVar.l(a.f82391x);
            boolean Y0 = a.Y0(i5, i4, l6);
            if (l11 == Integer.MIN_VALUE) {
                return null;
            }
            if (l11 >= 1) {
                if (l11 <= (Y0 ? 366 : 365)) {
                    if (l11 <= 342) {
                        int i11 = l11 - 1;
                        i10 = (i11 / 19) + 1;
                        i6 = (i11 % 19) + 1;
                    } else {
                        if (l11 > (Y0 ? 5 : 4) + 342) {
                            i6 = (l11 - (Y0 ? 5 : 4)) - 342;
                            i7 = 19;
                            return new a(i5, i4, l6, i7, i6, null);
                        }
                        i6 = l11 - 342;
                    }
                    i7 = i10;
                    return new a(i5, i4, l6, i7, i6, null);
                }
            }
            rVar.M(p0.ERROR_MESSAGE, s4);
            return null;
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.x<?> d() {
            return null;
        }

        @Override // net.time4j.engine.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p k(a aVar, net.time4j.engine.d dVar) {
            return aVar;
        }

        @Override // net.time4j.engine.u
        public int g() {
            return l0.T0().g() - 1844;
        }

        @Override // net.time4j.engine.u
        public String n(z zVar, Locale locale) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("贚\u0001"));
        }

        j(C1279a c1279a) {
        }
    }

    /* compiled from: BadiCalendar.java */
    private static class k extends net.time4j.calendar.service.i<net.time4j.calendar.bahai.e, a> {

        /* renamed from: i, reason: collision with root package name */
        static final k f82404i = new k();
        private static final long serialVersionUID = -5483090643555757806L;

        private k() {
            super(ProtectedSandApp.s("贛\u0001"), a.class, net.time4j.calendar.bahai.e.class, 'M');
        }

        private u S(net.time4j.engine.d dVar) {
            Locale N0 = a.N0(dVar);
            net.time4j.calendar.bahai.f K0 = a.K0(dVar);
            return net.time4j.format.b.d(ProtectedSandApp.s("贜\u0001"), N0).p(ProtectedSandApp.s("贝\u0001"), net.time4j.calendar.bahai.e.class, K0.variant());
        }

        @Override // net.time4j.calendar.service.i, net.time4j.format.v
        /* renamed from: Y, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.bahai.e parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
            return (net.time4j.calendar.bahai.e) S(dVar).d(charSequence, parsePosition, net.time4j.calendar.bahai.e.class, dVar);
        }

        @Override // net.time4j.calendar.service.i, net.time4j.format.v
        public void print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException {
            appendable.append(S(dVar).g((net.time4j.calendar.bahai.e) pVar.r(this)));
        }

        @Override // net.time4j.engine.e
        protected boolean u() {
            return true;
        }
    }

    /* compiled from: BadiCalendar.java */
    private static class l implements a0<a, net.time4j.calendar.bahai.e> {
        private l() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtCeiling(a aVar) {
            return a.f82390w;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtFloor(a aVar) {
            return a.f82390w;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.bahai.e getMaximum(a aVar) {
            return net.time4j.calendar.bahai.e.ALA;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.bahai.e getMinimum(a aVar) {
            return net.time4j.calendar.bahai.e.BAHA;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.bahai.e getValue(a aVar) {
            return aVar.O0();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(a aVar, net.time4j.calendar.bahai.e eVar) {
            return eVar != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a withValue(a aVar, net.time4j.calendar.bahai.e eVar, boolean z4) {
            if (eVar != null) {
                return new a(aVar.f82394b, aVar.f82395c, aVar.f82396d, eVar.getValue(), aVar.W0() ? 19 : aVar.f82398f, null);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("贞\u0001"));
        }

        l(C1279a c1279a) {
        }
    }

    /* compiled from: BadiCalendar.java */
    private static class m implements net.time4j.engine.l<a> {

        /* renamed from: a, reason: collision with root package name */
        private static final long f82405a = l0.r1(1844, 3, 21).b();

        private m() {
        }

        @Override // net.time4j.engine.l
        public List<net.time4j.engine.j> a() {
            return Collections.singletonList(net.time4j.calendar.bahai.c.BAHAI);
        }

        @Override // net.time4j.engine.l
        public long d() {
            return a.f82382o[a.f82382o.length - 1] - 1;
        }

        @Override // net.time4j.engine.l
        public long g() {
            return f82405a;
        }

        @Override // net.time4j.engine.l
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public long f(a aVar) {
            int P0 = aVar.P0();
            return P0 < 2015 ? (l0.r1(P0, 3, 21).b() + aVar.H0()) - 1 : (a.f82382o[P0 - TXLiveConstants.PLAY_EVT_STREAM_SWITCH_SUCC] + r5) - 1;
        }

        @Override // net.time4j.engine.l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a e(long j4) {
            if (j4 < f82405a) {
                throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("贠\u0001"), j4));
            }
            int i4 = 0;
            if (j4 >= a.f82382o[0]) {
                int length = a.f82382o.length - 2;
                while (i4 <= length) {
                    int i5 = i4 + 1;
                    if (j4 < a.f82382o[i5]) {
                        int g4 = net.time4j.base.c.g((j4 - a.f82382o[i4]) + 1);
                        int i6 = i4 + 172;
                        int i7 = i4 + 171;
                        return new a(net.time4j.base.c.a(i7, 361) + 1, net.time4j.base.c.a((i6 - (r4 * 361)) - 1, 19) + 1, net.time4j.base.c.c(i7, 19) + 1, 1, 1, null).g1(g4);
                    }
                    i4 = i5;
                }
                throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("负\u0001"), j4));
            }
            l0 w12 = l0.w1(j4, b0.UTC);
            int o4 = w12.o();
            int i10 = o4 - 1843;
            int q4 = w12.q();
            if (q4 <= 2 || (q4 == 3 && w12.t() < 21)) {
                i10 = o4 - 1844;
            }
            int i11 = i10 - 1;
            a aVar = new a(1, net.time4j.base.c.a(i11, 19) + 1, net.time4j.base.c.c(i11, 19) + 1, 1, 1, null);
            return aVar.g1(net.time4j.base.c.g((j4 - f(aVar)) + 1));
        }

        m(C1279a c1279a) {
        }
    }

    /* compiled from: BadiCalendar.java */
    public enum n implements w {
        VAHID_CYCLES(5.9958192384E8d),
        YEARS(3.155694336E7d),
        MONTHS(1641600.0d),
        WEEKS(604800.0d),
        DAYS(86400.0d);

        private final transient double length;

        n(double d5) {
            this.length = d5;
        }

        public long between(a aVar, a aVar2) {
            return aVar.Y(aVar2, this);
        }

        @Override // net.time4j.engine.w
        public double getLength() {
            return this.length;
        }

        @Override // net.time4j.engine.w
        public boolean isCalendrical() {
            return true;
        }
    }

    /* compiled from: BadiCalendar.java */
    private static class o implements a0<a, g1> {
        private o() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtCeiling(a aVar) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtFloor(a aVar) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public g1 getMaximum(a aVar) {
            return (aVar.f82394b == 3 && aVar.f82395c == 19 && aVar.f82396d == 19 && aVar.f82397e == 19 && aVar.f82398f >= 14) ? g1.THURSDAY : g1.FRIDAY;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public g1 getMinimum(a aVar) {
            return (aVar.f82394b == 1 && aVar.f82395c == 1 && aVar.f82396d == 1 && aVar.f82397e == 1 && aVar.f82398f <= 2) ? g1.THURSDAY : g1.SATURDAY;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public g1 getValue(a aVar) {
            return aVar.G0();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(a aVar, g1 g1Var) {
            if (g1Var == null) {
                return false;
            }
            i1 I0 = a.I0();
            int value = g1Var.getValue(I0);
            return getMinimum(aVar).getValue(I0) <= value && value <= getMaximum(aVar).getValue(I0);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a withValue(a aVar, g1 g1Var, boolean z4) {
            if (g1Var == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("账\u0001"));
            }
            i1 I0 = a.I0();
            return aVar.h0(net.time4j.engine.i.i(g1Var.getValue(I0) - aVar.G0().getValue(I0)));
        }

        o(C1279a c1279a) {
        }
    }

    /* compiled from: BadiCalendar.java */
    private static class p extends net.time4j.format.d<Integer> implements v<Integer> {

        /* renamed from: c, reason: collision with root package name */
        static final p f82406c = new p();
        private static final long serialVersionUID = -8280579801733395557L;

        private p() {
            super(ProtectedSandApp.s("货\u0001"));
        }

        private u y(net.time4j.engine.d dVar) {
            Locale N0 = a.N0(dVar);
            net.time4j.calendar.bahai.f K0 = a.K0(dVar);
            return net.time4j.format.b.d(ProtectedSandApp.s("质\u0001"), N0).p(ProtectedSandApp.s("贩\u0001"), net.time4j.calendar.bahai.e.class, K0.variant());
        }

        private static Class<net.time4j.calendar.bahai.e> z() {
            return net.time4j.calendar.bahai.e.class;
        }

        @Override // net.time4j.engine.q
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public Integer getDefaultMaximum() {
            return 19;
        }

        @Override // net.time4j.engine.q
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public Integer getDefaultMinimum() {
            return 1;
        }

        @Override // net.time4j.format.v
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public Integer parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
            Enum d5 = y(dVar).d(charSequence, parsePosition, net.time4j.calendar.bahai.e.class, dVar);
            if (d5 == null) {
                return null;
            }
            return Integer.valueOf(d5.ordinal() + 1);
        }

        @Override // net.time4j.engine.e, net.time4j.engine.q
        public char getSymbol() {
            return 'X';
        }

        @Override // net.time4j.engine.q
        public Class<Integer> getType() {
            return Integer.class;
        }

        @Override // net.time4j.engine.q
        public boolean isDateElement() {
            return true;
        }

        @Override // net.time4j.engine.q
        public boolean isTimeElement() {
            return false;
        }

        @Override // net.time4j.format.v
        public void print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException, ChronoException {
            appendable.append(y(dVar).g(((net.time4j.calendar.bahai.e[]) net.time4j.calendar.bahai.e.class.getEnumConstants())[pVar.l(this) - 1]));
        }

        @Override // net.time4j.engine.e
        protected boolean u() {
            return true;
        }
    }

    static {
        C1279a c1279a = new C1279a(ProtectedSandApp.s("贫\u0001"), a.class, net.time4j.calendar.bahai.c.class, 'G');
        f82383p = c1279a;
        net.time4j.calendar.service.j jVar = new net.time4j.calendar.service.j(ProtectedSandApp.s("贬\u0001"), a.class, 1, 1083, 'Y');
        f82384q = jVar;
        b bVar = new b(ProtectedSandApp.s("购\u0001"), a.class, 1, 3, 'K');
        f82385r = bVar;
        c cVar = new c(ProtectedSandApp.s("贮\u0001"), a.class, 1, 19, 'V');
        f82386s = cVar;
        p pVar = p.f82406c;
        f82387t = pVar;
        k kVar = k.f82404i;
        f82388u = kVar;
        i iVar = i.f82403b;
        f82389v = iVar;
        net.time4j.calendar.service.j jVar2 = new net.time4j.calendar.service.j(ProtectedSandApp.s("贯\u0001"), a.class, 1, 19, 'D');
        f82390w = jVar2;
        net.time4j.calendar.service.j jVar3 = new net.time4j.calendar.service.j(ProtectedSandApp.s("贰\u0001"), a.class, 1, 365, (char) 0);
        f82391x = jVar3;
        e eVar = e.f82400j;
        f82392y = eVar;
        m mVar = new m(null);
        f82393z = mVar;
        j0.c f4 = j0.c.m(n.class, a.class, new j(null), mVar).f(c1279a, new f(null));
        h hVar = new h(5);
        n nVar = n.YEARS;
        j0.c f5 = f4.g(jVar, hVar, nVar).f(bVar, new h(0));
        h hVar2 = new h(1);
        n nVar2 = n.VAHID_CYCLES;
        j0.c g4 = f5.g(cVar, hVar2, nVar2).g(pVar, new h(2), nVar);
        l lVar = new l(null);
        n nVar3 = n.MONTHS;
        j0.c f6 = g4.g(kVar, lVar, nVar3).f(iVar, iVar);
        h hVar3 = new h(3);
        n nVar4 = n.DAYS;
        j0.c i4 = f6.g(jVar2, hVar3, nVar4).g(jVar3, new h(4), nVar4).g(eVar, new o(null), nVar4).j(nVar2, new g(nVar2), nVar2.getLength(), Collections.singleton(nVar)).j(nVar, new g(nVar), nVar.getLength(), Collections.singleton(nVar2)).i(nVar3, new g(nVar3), nVar3.getLength());
        n nVar5 = n.WEEKS;
        A = i4.j(nVar5, new g(nVar5), nVar5.getLength(), Collections.singleton(nVar4)).j(nVar4, new g(nVar4), nVar4.getLength(), Collections.singleton(nVar5)).c();
    }

    /* synthetic */ a(int i4, int i5, int i6, int i7, int i10, C1279a c1279a) {
        this(i4, i5, i6, i7, i10);
    }

    public static j0<n, a> D0() {
        return A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static i1 I0() {
        g1 g1Var = g1.SATURDAY;
        return i1.m(g1Var, 1, g1Var, g1.SUNDAY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static net.time4j.calendar.bahai.f K0(net.time4j.engine.d dVar) {
        return (net.time4j.calendar.bahai.f) dVar.b(f82374g, net.time4j.calendar.bahai.f.TRANSCRIPTION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Locale N0(net.time4j.engine.d dVar) {
        return (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int P0() {
        return Q0(this.f82394b, this.f82395c, this.f82396d);
    }

    private static int Q0(int i4, int i5, int i6) {
        return ((i5 - 1) * 19) + ((i4 - 1) * 361) + i6 + 1843;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <V> boolean V0(a aVar, q<V> qVar) {
        try {
            return aVar.G(qVar, aVar.r(qVar));
        } catch (ChronoException unused) {
            return false;
        }
    }

    public static boolean Y0(int i4, int i5, int i6) {
        if (i4 < 1 || i4 > 3) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("贳\u0001"), i4));
        }
        if (i5 < 1 || i5 > 19) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("贲\u0001"), i5));
        }
        if (i6 < 1 || i6 > 19) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("贱\u0001"), i6));
        }
        int Q0 = Q0(i4, i5, i6);
        if (Q0 < 2015) {
            return net.time4j.base.b.e(Q0 + 1);
        }
        int i7 = Q0 - 2015;
        int[] iArr = f82382o;
        return iArr[Q0 + (-2014)] - iArr[i7] == 366;
    }

    public static boolean Z0(int i4, int i5, int i6, net.time4j.calendar.bahai.b bVar, int i7) {
        if (i4 < 1 || i4 > 3 || i5 < 1 || i5 > 19 || i6 < 1 || i6 > 19) {
            return false;
        }
        if (bVar instanceof net.time4j.calendar.bahai.e) {
            return i7 >= 1 && i7 <= 19;
        }
        if (bVar != net.time4j.calendar.bahai.d.AYYAM_I_HA || i7 < 1) {
            return false;
        }
        return i7 <= (Y0(i4, i5, i6) ? 5 : 4);
    }

    public static a a1() {
        return (a) w0.g().f(A);
    }

    public static a b1(int i4, int i5, int i6, int i7) {
        return d1(1, i4, i5, net.time4j.calendar.bahai.e.valueOf(i6), i7);
    }

    public static a c1(int i4, int i5, net.time4j.calendar.bahai.e eVar, int i6) {
        return d1(1, i4, i5, eVar, i6);
    }

    public static a d1(int i4, int i5, int i6, net.time4j.calendar.bahai.b bVar, int i7) {
        if (i4 < 1 || i4 > 3) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("贳\u0001"), i4));
        }
        if (i5 < 1 || i5 > 19) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("贲\u0001"), i5));
        }
        if (i6 < 1 || i6 > 19) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("费\u0001"), i6));
        }
        if (bVar instanceof net.time4j.calendar.bahai.e) {
            if (i7 < 1 || i7 > 19) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("贴\u0001"), i7));
            }
            return new a(i4, i5, i6, ((net.time4j.calendar.bahai.e) net.time4j.calendar.bahai.e.class.cast(bVar)).getValue(), i7);
        }
        if (bVar == net.time4j.calendar.bahai.d.AYYAM_I_HA) {
            int i10 = Y0(i4, i5, i6) ? 5 : 4;
            if (i7 < 1 || i7 > i10) {
                throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("贵\u0001"), i10, ProtectedSandApp.s("贶\u0001"), i7));
            }
            return new a(i4, i5, i6, 0, i7);
        }
        if (bVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("贷\u0001"));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("贸\u0001") + bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a e1(net.time4j.calendar.bahai.c cVar, int i4, net.time4j.calendar.bahai.b bVar, int i5) {
        if (cVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("贻\u0001"));
        }
        if (i4 < 1 || i4 > 1083) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("贺\u0001"), i4));
        }
        a aVar = (a) A.x0().K(f82384q, i4);
        int i6 = aVar.f82394b;
        int i7 = aVar.f82395c;
        int i10 = aVar.f82396d;
        if (bVar instanceof net.time4j.calendar.bahai.e) {
            if (i5 < 1 || i5 > 19) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("贴\u0001"), i5));
            }
            return new a(i6, i7, i10, ((net.time4j.calendar.bahai.e) net.time4j.calendar.bahai.e.class.cast(bVar)).getValue(), i5);
        }
        if (bVar == net.time4j.calendar.bahai.d.AYYAM_I_HA) {
            int i11 = Y0(i6, i7, i10) ? 5 : 4;
            if (i5 < 1 || i5 > i11) {
                throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("贵\u0001"), i11, ProtectedSandApp.s("贶\u0001"), i5));
            }
            return new a(i6, i7, i10, 0, i5);
        }
        if (bVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("贷\u0001"));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("贸\u0001") + bVar);
    }

    public static a f1(int i4, int i5, int i6) {
        return d1(1, i4, i5, net.time4j.calendar.bahai.d.AYYAM_I_HA, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a g1(int i4) {
        int i5;
        int i6;
        int i7;
        int i10 = 19;
        if (i4 <= 342) {
            int i11 = i4 - 1;
            i6 = (i11 % 19) + 1;
            i7 = (i11 / 19) + 1;
        } else {
            if (i4 <= (X0() ? 5 : 4) + 342) {
                i5 = i4 - 342;
                i10 = 0;
            } else {
                i5 = (i4 - (X0() ? 5 : 4)) - 342;
            }
            i6 = i5;
            i7 = i10;
        }
        return new a(this.f82394b, this.f82395c, this.f82396d, i7, i6);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("贼\u0001"));
    }

    private Object writeReplace() {
        return new SPX(this, 19);
    }

    public net.time4j.u<a> B0(m0 m0Var) {
        return net.time4j.u.h(this, m0Var);
    }

    public net.time4j.u<a> C0(int i4, int i5) {
        return net.time4j.u.h(this, m0.b1(i4, i5));
    }

    protected a E0() {
        return this;
    }

    public int F0() {
        return this.f82398f;
    }

    @Override // net.time4j.engine.r
    public <V> boolean G(q<V> qVar, V v4) {
        return (qVar == f82388u || qVar == f82389v || qVar == f82383p) ? v4 != null : super.G(qVar, v4);
    }

    public g1 G0() {
        return g1.valueOf(net.time4j.base.c.d(f82393z.f(this) + 5, 7) + 1);
    }

    public int H0() {
        int i4 = this.f82397e;
        if (i4 == 0) {
            return this.f82398f + 342;
        }
        if (i4 != 19) {
            return ((i4 - 1) * 19) + this.f82398f;
        }
        return (X0() ? 5 : 4) + 342 + this.f82398f;
    }

    public net.time4j.calendar.bahai.b J0() {
        return W0() ? net.time4j.calendar.bahai.d.AYYAM_I_HA : O0();
    }

    public int L0() {
        return this.f82394b;
    }

    public net.time4j.calendar.bahai.e O0() {
        int i4 = this.f82397e;
        if (i4 != 0) {
            return net.time4j.calendar.bahai.e.valueOf(i4);
        }
        throw new ChronoException(ProtectedSandApp.s("贽\u0001") + toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m0
    /* renamed from: Q */
    public j0<n, a> y() {
        return A;
    }

    public int R0() {
        return this.f82395c;
    }

    public int S0() {
        return P0() - 1843;
    }

    public int T0() {
        return this.f82396d;
    }

    public boolean U0() {
        return this.f82397e > 0;
    }

    public boolean W0() {
        return this.f82397e == 0;
    }

    public boolean X0() {
        return Y0(this.f82394b, this.f82395c, this.f82396d);
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f82394b == aVar.f82394b && this.f82395c == aVar.f82395c && this.f82396d == aVar.f82396d && this.f82397e == aVar.f82397e && this.f82398f == aVar.f82398f;
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public int hashCode() {
        return (this.f82397e * 19) + (((this.f82395c * 19) + (this.f82394b * 361) + this.f82396d) * 512) + this.f82398f;
    }

    @Override // net.time4j.engine.m0
    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(32, ProtectedSandApp.s("贾\u0001"));
        a5.append(this.f82394b);
        a5.append('-');
        a5.append(this.f82395c);
        a5.append('-');
        a5.append(this.f82396d);
        a5.append('-');
        int i4 = this.f82397e;
        if (i4 == 0) {
            a5.append(ProtectedSandApp.s("贿\u0001"));
        } else {
            a5.append(i4);
            a5.append('-');
        }
        a5.append(this.f82398f);
        return a5.toString();
    }

    @Override // net.time4j.engine.r, net.time4j.engine.p
    public boolean w(q<?> qVar) {
        if (qVar == f82388u) {
            return U0();
        }
        if (qVar == f82389v) {
            return W0();
        }
        if (A().contains(qVar)) {
            return true;
        }
        return V0(this, qVar);
    }

    @Override // net.time4j.engine.m0, net.time4j.engine.r
    protected net.time4j.engine.x y() {
        return A;
    }

    @Override // net.time4j.engine.r
    protected r z() {
        return this;
    }

    private a(int i4, int i5, int i6, int i7, int i10) {
        this.f82394b = i4;
        this.f82395c = i5;
        this.f82396d = i6;
        this.f82397e = i7;
        this.f82398f = i10;
    }
}
