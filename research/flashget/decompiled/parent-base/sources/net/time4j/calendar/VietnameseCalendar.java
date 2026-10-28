package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import net.time4j.calendar.d;
import net.time4j.calendar.n;
import net.time4j.engine.j0;
import net.time4j.g1;
import net.time4j.i1;
import net.time4j.w0;

@net.time4j.format.c("vietnam")
/* loaded from: classes7.dex */
public final class VietnameseCalendar extends j<d, VietnameseCalendar> implements net.time4j.format.h {

    @net.time4j.engine.d0(format = "F")
    public static final g0<VietnameseCalendar> A;
    private static final h<VietnameseCalendar> B;
    private static final net.time4j.engine.j0<d, VietnameseCalendar> C;

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f82254q = {4450, 2, 4452, 6, 4455, 4, 4458, 3, 4460, 7, 4463, 5, 4466, 4, 4468, 9, 4471, 6, 4474, 4, 4477, 3, 4479, 7, 4482, 5, 4485, 4, 4487, 8, 4490, 7, 4493, 5, 4496, 3, 4498, 8, 4501, 5, 4504, 4, 4506, 10, 4509, 6, 4512, 5, 4515, 3, 4517, 7, 4520, 5, 4523, 4, 4526, 2, 4528, 6, 4531, 5, 4534, 3, 4536, 8, 4539, 5, 4542, 4, 4545, 2, 4547, 6, 4550, 5, 4553, 3, 4555, 7, 4558, 6, 4561, 4, 4564, 2, 4566, 6, 4569, 5, 4572, 3, 4574, 7, 4577, 6, 4580, 4, 4583, 2, 4585, 7, 4588, 5, 4591, 3, 4593, 8, 4596, 6, 4599, 4, 4602, 3, 4604, 7, 4607, 5, 4610, 4, 4612, 8, 4615, 6, 4618, 4, 4621, 2, 4623, 7, 4626, 5, 4629, 3, 4631, 8, 4634, 5, 4637, 4, 4640, 2, 4642, 7, 4645, 5, 4648, 4, 4650, 9, 4653, 6, 4656, 4, 4659, 2, 4661, 6, 4664, 5, 4667, 3, 4669, 11, 4672, 6, 4675, 5, 4678, 2, 4680, 7, 4683, 5, 4686, 3, 4688, 8, 4691, 6, 4694, 4, 4697, 3, 4699, 7, 4702, 5, 4705, 4, 4707, 8, 4710, 6, 4713, 4, 4716, 3, 4718, 7, 4721, 5, 4724, 4, 4726, 8, 4729, 6, 4732, 4, 4735, 2, 4737, 7, 4740, 5, 4743, 4, 4745, 9, 4748, 6, 4751, 4, 4754, 3, 4756, 7, 4759, 5, 4762, 4, 4764, 11, 4767, 6, 4770, 5, 4773, 2, 4775, 7, 4778, 5, 4781, 4, 4784, 1, 4786, 6, 4789, 5, 4792, 3, 4794, 7, 4797, 6, 4800, 4, 4802, 10, 4805, 6, 4808, 5, 4811, 3, 4813, 7, 4816, 6, 4819, 4, 4822, 2, 4824, 6, 4827, 5, 4830, 3, 4832, 7, 4835, 6, 4838, 4, 4840, 9, 4843, 6, 4846, 4, 4849, 3, 4851, 7, 4854, 5, 4857, 4, 4859, 11, 4862, 7, 4865, 5, 4868, 3, 4870, 8, 4873, 5, 4876, 4, 4878, 11, 4881, 6, 4884, 5, 4887, 3, 4889, 7, 4892, 6, 4895, 4, 4898, 1, 4900, 6, 4903, 5, 4906, 3, 4908, 8, 4911, 6, 4914, 4, 4917, 2, 4919, 6, 4922, 5, 4925, 3, 4927, 7, 4930, 6, 4933, 4, 4936, 2, 4938, 6, 4941, 5, 4944, 3, 4946, 7, 4949, 6, 4952, 4, 4954, 10, 4957, 7, 4960, 5, 4963, 3, 4965, 8, 4968, 6, 4971, 4, 4974, 3, 4976, 7, 4979, 5, 4982, 4, 4984, 8, 4987, 6, 4990, 5, 4993, 1, 4995, 7, 4998, 5, 5001, 4, 5003, 8, 5006, 6, 5009, 5, 5012, 2, 5014, 7, 5017, 5, 5020, 4, 5022, 10, 5025, 6, 5028, 4, 5031, 2, 5033, 6, 5036, 5, 5039, 3, 5041, 7, 5044, 6, 5047, 5, 5050, 2, 5052, 7, 5055, 5, 5058, 3, 5060, 8, 5063, 6, 5066, 4, 5069, 3, 5071, 7, 5074, 5, 5077, 4, 5079, 8, 5082, 7, 5085, 5, 5088, 3, 5090, 8, 5093, 5, 5096, 4, 5098, 8, 5101, 6, 5104, 5, 5107, 3, 5109, 7, 5112, 5, 5115, 4, 5117, 10, 5120, 6, 5123, 5, 5126, 3, 5128, 7, 5131, 5, 5134, 4, 5136, 10, 5139, 6, 5142, 5, 5145, 2, 5147, 7, 5150, 6, 5153, 4, 5156, 1, 5158, 6, 5161, 5, 5164, 3, 5166, 7, 5169, 6, 5172, 4, 5174, 10, 5177, 7, 5180, 5, 5183, 3, 5185, 7, 5188, 6, 5191, 4, 5193, 8, 5196, 7, 5199, 5, 5202, 3, 5204, 7, 5207, 6, 5210, 4, 5212, 10, 5215, 6, 5218, 5, 5221, 3, 5223, 7, 5226, 5, 5229, 4, 5231, 9, 5234, 7, 5237, 5, 5240, 3, 5242, 8, 5245, 6, 5248, 4, 5250, 11, 5253, 6, 5256, 5, 5259, 3, 5261, 8, 5264, 6, 5267, 5, 5270, 1, 5272, 7, 5275, 5, 5278, 3, 5280, 8, 5283, 6, 5286, 4, 5289, 2, 5291, 7, 5294, 5, 5297, 3, 5299, 7, 5302, 6, 5305, 4, 5308, 3, 5310, 7, 5313, 5, 5316, 3, 5318, 7, 5321, 6, 5324, 4, 5327, 2, 5329, 7, 5332, 5, 5335, 3, 5337, 8, 5340, 6, 5343, 4, 5346, 3, 5348, 7, 5351, 5, 5354, 4, 5356, 9, 5359, 6, 5362, 5, 5364, 11, 5367, 7, 5370, 5, 5373, 4, 5375, 9, 5378, 6, 5381, 5, 5384, 2, 5386, 7, 5389, 6, 5392, 4, 5394, 8, 5397, 6, 5400, 5, 5403, 3, 5405, 7, 5408, 6, 5411, 3, 5413, 8, 5416, 6, 5419, 5, 5422, 3, 5424, 7, 5427, 6, 5430, 3, 5432, 8, 5435, 6, 5438, 4, 5441, 3, 5443, 7, 5446, 6, 5449, 4, 5451, 9, 5454, 7, 5457, 5, 5460, 3, 5462, 8, 5465, 5, 5468, 4, 5470, 9, 5473, 6, 5476, 5, 5479, 3, 5481, 8, 5484, 6, 5487, 5, 5489, 9, 5492, 7, 5495, 5, 5498, 3, 5500, 7, 5503, 6, 5506, 4, 5508, 10, 5511, 6, 5514, 5, 5517, 3, 5519, 7, 5522, 6, 5525, 4, 5527, 10, 5530, 6, 5533, 5, 5536, 3, 5538, 7, 5541, 6, 5544, 4, 5546, 11, 5549, 7, 5552, 5, 5555, 3, 5557, 8, 5560, 6, 5563, 4, 5565, 9, 5568, 7, 5571, 5, 5574, 4, 5576, 8, 5579, 6, 5582, 4, 5584, 8, 5587, 7, 5590, 5, 5593, 4, 5595, 8, 5598, 6, 5601, 4, 5603, 10, 5606, 7, 5609, 5, 5612, 3, 5614, 8, 5617, 6, 5620, 4, 5622, 10, 5625, 6, 5628, 5, 5631, 3, 5633, 8, 5636, 6};

    /* renamed from: r, reason: collision with root package name */
    public static final net.time4j.engine.q<Integer> f82255r;

    /* renamed from: s, reason: collision with root package name */
    @net.time4j.engine.d0(format = "U")
    public static final net.time4j.format.v<g> f82256s;
    private static final long serialVersionUID = -3151525803739185874L;

    /* renamed from: t, reason: collision with root package name */
    public static final net.time4j.engine.q<n0> f82257t;

    /* renamed from: u, reason: collision with root package name */
    @net.time4j.engine.d0(alt = "L", format = "M")
    public static final net.time4j.format.v<l> f82258u;

    /* renamed from: v, reason: collision with root package name */
    public static final o0<Integer, VietnameseCalendar> f82259v;

    /* renamed from: w, reason: collision with root package name */
    @net.time4j.engine.d0(format = "d")
    public static final o0<Integer, VietnameseCalendar> f82260w;

    /* renamed from: x, reason: collision with root package name */
    @net.time4j.engine.d0(format = "D")
    public static final o0<Integer, VietnameseCalendar> f82261x;

    /* renamed from: y, reason: collision with root package name */
    @net.time4j.engine.d0(format = "E")
    public static final o0<g1, VietnameseCalendar> f82262y;

    /* renamed from: z, reason: collision with root package name */
    private static final r0<VietnameseCalendar> f82263z;

    private static class SPX implements Externalizable {

        /* renamed from: c, reason: collision with root package name */
        private static final int f82264c = 16;
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        private transient Object f82265b;

        public SPX() {
        }

        private VietnameseCalendar a(ObjectInput objectInput) throws IOException {
            byte readByte = objectInput.readByte();
            byte readByte2 = objectInput.readByte();
            byte readByte3 = objectInput.readByte();
            boolean readBoolean = objectInput.readBoolean();
            byte readByte4 = objectInput.readByte();
            l f4 = l.f(readByte3);
            if (readBoolean) {
                f4 = f4.g();
            }
            return VietnameseCalendar.V0(readByte, readByte2, f4, readByte4);
        }

        private void b(ObjectOutput objectOutput) throws IOException {
            j jVar = (j) this.f82265b;
            objectOutput.writeByte(jVar.r0());
            objectOutput.writeByte(jVar.G0().getNumber());
            objectOutput.writeByte(jVar.y0().getNumber());
            objectOutput.writeBoolean(jVar.y0().e());
            objectOutput.writeByte(jVar.t());
        }

        private Object readResolve() throws ObjectStreamException {
            return this.f82265b;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readByte() != 16) {
                throw new InvalidObjectException(ProtectedSandApp.s("讳\u0001"));
            }
            this.f82265b = a(objectInput);
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeByte(16);
            b(objectOutput);
        }

        SPX(Object obj) {
            this.f82265b = obj;
        }
    }

    static class a implements net.time4j.engine.t<VietnameseCalendar, net.time4j.engine.l<VietnameseCalendar>> {
        a() {
        }

        public net.time4j.engine.l<VietnameseCalendar> a(VietnameseCalendar vietnameseCalendar) {
            return VietnameseCalendar.B;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.l<VietnameseCalendar> apply(VietnameseCalendar vietnameseCalendar) {
            return VietnameseCalendar.B;
        }
    }

    private static class b extends net.time4j.calendar.a<VietnameseCalendar> {
        b() {
            super(VietnameseCalendar.class);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.calendar.a, net.time4j.engine.u
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public VietnameseCalendar e(net.time4j.engine.r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            n aVar;
            int l4 = rVar.l(net.time4j.calendar.d.f82409a);
            if (l4 == Integer.MIN_VALUE) {
                net.time4j.format.v<g> vVar = VietnameseCalendar.f82256s;
                if (rVar.w(vVar)) {
                    g gVar = (g) rVar.r(vVar);
                    int l5 = rVar.l(VietnameseCalendar.f82255r);
                    if (l5 != Integer.MIN_VALUE) {
                        aVar = gVar.p(l5);
                    }
                }
                aVar = null;
            } else {
                aVar = new n.a(l4);
            }
            if (aVar == null) {
                rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("讴\u0001"));
                return null;
            }
            net.time4j.format.v<l> vVar2 = VietnameseCalendar.f82258u;
            if (rVar.w(vVar2)) {
                l lVar = (l) rVar.r(vVar2);
                int l6 = rVar.l(VietnameseCalendar.f82260w);
                if (l6 != Integer.MIN_VALUE) {
                    return VietnameseCalendar.W0(aVar, lVar, l6);
                }
            } else {
                int l7 = rVar.l(VietnameseCalendar.f82261x);
                if (l7 != Integer.MIN_VALUE && l7 >= 1) {
                    return (VietnameseCalendar) VietnameseCalendar.W0(aVar, l.f(1), 1).W(l7 - 1, d.DAYS);
                }
            }
            return null;
        }
    }

    private static class c extends h<VietnameseCalendar> {

        /* renamed from: f, reason: collision with root package name */
        private static final List<net.time4j.tz.p> f82266f;

        /* renamed from: g, reason: collision with root package name */
        private static final long f82267g;

        /* renamed from: h, reason: collision with root package name */
        private static final long f82268h;

        /* renamed from: i, reason: collision with root package name */
        private static final long f82269i;

        /* renamed from: j, reason: collision with root package name */
        private static final long f82270j;

        static {
            ArrayList arrayList = new ArrayList(5);
            net.time4j.tz.f fVar = net.time4j.tz.f.AHEAD_OF_UTC;
            arrayList.add(net.time4j.tz.p.b(fVar, 116, 25, com.google.firebase.remoteconfig.p.f60679p));
            arrayList.add(net.time4j.tz.p.b(fVar, 107, 35, com.google.firebase.remoteconfig.p.f60679p));
            arrayList.add(net.time4j.tz.p.n(fVar, 8, 0));
            arrayList.add(net.time4j.tz.p.n(fVar, 7, 0));
            f82266f = Collections.unmodifiableList(arrayList);
            f82267g = net.time4j.l0.r1(1841, 1, 1).b();
            f82268h = net.time4j.l0.r1(1954, 7, 1).b();
            f82269i = net.time4j.l0.r1(1968, 1, 1).b();
            f82270j = net.time4j.l0.r1(1813, 2, 1).b();
        }

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.time4j.calendar.h
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public VietnameseCalendar i(int i4, int i5, l lVar, int i6, long j4) {
            return new VietnameseCalendar(i4, i5, lVar, i6, j4);
        }

        @Override // net.time4j.engine.l
        public List<net.time4j.engine.j> a() {
            return Collections.emptyList();
        }

        @Override // net.time4j.calendar.h, net.time4j.engine.l
        public long g() {
            return f82270j;
        }

        @Override // net.time4j.calendar.h
        int[] l() {
            return VietnameseCalendar.f82254q;
        }

        @Override // net.time4j.calendar.h
        net.time4j.tz.p n(long j4) {
            List<net.time4j.tz.p> list;
            int i4;
            if (j4 < f82267g) {
                return f82266f.get(0);
            }
            if (j4 < f82268h) {
                return f82266f.get(1);
            }
            if (j4 < f82269i) {
                list = f82266f;
                i4 = 2;
            } else {
                list = f82266f;
                i4 = 3;
            }
            return list.get(i4);
        }

        @Override // net.time4j.calendar.h
        boolean q(int i4, int i5, l lVar, int i6) {
            if (i4 < 75) {
                return false;
            }
            if (i4 != 75 || i5 >= 10) {
                return super.q(i4, i5, lVar, i6);
            }
            return false;
        }

        c(a aVar) {
        }
    }

    public enum d implements net.time4j.engine.w {
        CYCLES(1.893415507776E9d),
        YEARS(3.15569251296E7d),
        MONTHS(2551442.8775903997d),
        WEEKS(604800.0d),
        DAYS(86400.0d);

        private final transient double length;

        d(double d5) {
            this.length = d5;
        }

        public int between(VietnameseCalendar vietnameseCalendar, VietnameseCalendar vietnameseCalendar2) {
            return (int) vietnameseCalendar.Y(vietnameseCalendar2, this);
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

    static {
        net.time4j.calendar.service.j jVar = new net.time4j.calendar.service.j(ProtectedSandApp.s("论\u0001"), VietnameseCalendar.class, 75, 94, (char) 0, null, null);
        f82255r = jVar;
        i iVar = i.f82567b;
        f82256s = iVar;
        m t4 = m.t();
        f82257t = t4;
        k kVar = k.f82589b;
        f82258u = kVar;
        net.time4j.calendar.service.j jVar2 = new net.time4j.calendar.service.j(ProtectedSandApp.s("讻\u0001"), VietnameseCalendar.class, 1, 12, (char) 0, null, null);
        f82259v = jVar2;
        net.time4j.calendar.service.j jVar3 = new net.time4j.calendar.service.j(ProtectedSandApp.s("讼\u0001"), VietnameseCalendar.class, 1, 30, 'd');
        f82260w = jVar3;
        net.time4j.calendar.service.j jVar4 = new net.time4j.calendar.service.j(ProtectedSandApp.s("讽\u0001"), VietnameseCalendar.class, 1, 355, 'D');
        f82261x = jVar4;
        net.time4j.calendar.service.k kVar2 = new net.time4j.calendar.service.k(VietnameseCalendar.class, S0());
        f82262y = kVar2;
        r0<VietnameseCalendar> r0Var = new r0<>(VietnameseCalendar.class, jVar3, kVar2);
        f82263z = r0Var;
        A = r0Var;
        c cVar = new c(null);
        B = cVar;
        j0.c f4 = j0.c.m(d.class, VietnameseCalendar.class, new b(), cVar).f(jVar, j.s0(iVar));
        net.time4j.engine.a0 F0 = j.F0(kVar);
        d dVar = d.YEARS;
        j0.c f5 = f4.g(iVar, F0, dVar).f(t4, m.t());
        net.time4j.engine.a0 A0 = j.A0(jVar3);
        d dVar2 = d.MONTHS;
        j0.c g4 = f5.g(kVar, A0, dVar2).g(jVar2, j.z0(jVar3), dVar2);
        net.time4j.engine.a0 t02 = j.t0();
        d dVar3 = d.DAYS;
        j0.c f6 = g4.g(jVar3, t02, dVar3).g(jVar4, j.w0(), dVar3).g(kVar2, new s0(S0(), new a()), dVar3).f(r0Var, r0.E(r0Var)).f(net.time4j.calendar.d.f82409a, new l0(cVar, jVar4));
        d dVar4 = d.CYCLES;
        j0.c j4 = f6.j(dVar4, j.E0(0), dVar4.getLength(), Collections.singleton(dVar)).j(dVar, j.E0(1), dVar.getLength(), Collections.singleton(dVar4)).j(dVar2, j.E0(2), dVar2.getLength(), Collections.emptySet());
        d dVar5 = d.WEEKS;
        C = j4.j(dVar5, j.E0(3), dVar5.getLength(), Collections.singleton(dVar3)).j(dVar3, j.E0(4), dVar3.getLength(), Collections.singleton(dVar5)).h(new d.h(VietnameseCalendar.class, jVar3, jVar4, S0())).c();
    }

    private VietnameseCalendar(int i4, int i5, l lVar, int i6, long j4) {
        super(i4, i5, lVar, i6, j4);
    }

    public static net.time4j.engine.j0<d, VietnameseCalendar> Q0() {
        return C;
    }

    public static i1 S0() {
        return i1.k(new Locale(ProtectedSandApp.s("设\u0001"), ProtectedSandApp.s("访\u0001")));
    }

    public static boolean T0(n nVar, l lVar, int i4) {
        return B.q(nVar.e(), nVar.g().getNumber(), lVar, i4);
    }

    public static VietnameseCalendar U0() {
        return (VietnameseCalendar) w0.g().f(C);
    }

    static VietnameseCalendar V0(int i4, int i5, l lVar, int i6) {
        return new VietnameseCalendar(i4, i5, lVar, i6, B.y(i4, i5, lVar, i6));
    }

    public static VietnameseCalendar W0(n nVar, l lVar, int i4) {
        return V0(nVar.e(), nVar.g().getNumber(), lVar, i4);
    }

    public static VietnameseCalendar X0(int i4) {
        return W0(new n.a(i4), l.f(1), 1);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("诀\u0001"));
    }

    private Object writeReplace() {
        return new SPX(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m0
    /* renamed from: Q */
    public net.time4j.engine.j0<d, VietnameseCalendar> y() {
        return C;
    }

    protected VietnameseCalendar R0() {
        return this;
    }

    @Override // net.time4j.calendar.j
    h<VietnameseCalendar> p0() {
        return B;
    }

    @Override // net.time4j.engine.m0, net.time4j.engine.r
    protected net.time4j.engine.x y() {
        return C;
    }

    @Override // net.time4j.engine.r
    protected net.time4j.engine.r z() {
        return this;
    }

    VietnameseCalendar(int i4, int i5, l lVar, int i6, long j4, a aVar) {
        super(i4, i5, lVar, i6, j4);
    }
}
