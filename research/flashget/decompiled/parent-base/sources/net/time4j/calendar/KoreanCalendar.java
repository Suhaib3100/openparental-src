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

@net.time4j.format.c("dangi")
/* loaded from: classes7.dex */
public final class KoreanCalendar extends j<e, KoreanCalendar> implements net.time4j.format.h {

    @net.time4j.engine.d0(format = "E")
    public static final o0<g1, KoreanCalendar> A;
    private static final r0<KoreanCalendar> B;

    @net.time4j.engine.d0(format = "F")
    public static final g0<KoreanCalendar> C;
    private static final h<KoreanCalendar> D;
    private static final net.time4j.engine.j0<e, KoreanCalendar> E;

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f82176q = {4281, 5, 4284, 4, 4287, 1, 4289, 6, 4292, 5, 4295, 3, 4297, 7, 4300, 6, 4303, 4, 4306, 2, 4308, 7, 4311, 5, 4314, 3, 4316, 8, 4319, 6, 4322, 4, 4325, 3, 4327, 7, 4330, 5, 4333, 3, 4335, 7, 4338, 6, 4341, 4, 4344, 3, 4346, 7, 4349, 5, 4352, 3, 4354, 8, 4357, 6, 4360, 4, 4363, 2, 4365, 7, 4368, 5, 4371, 3, 4373, 9, 4376, 6, 4379, 4, 4382, 3, 4384, 7, 4387, 5, 4390, 4, 4392, 9, 4395, 6, 4398, 5, 4401, 2, 4403, 7, 4406, 5, 4409, 3, 4411, 10, 4414, 6, 4417, 5, 4420, 3, 4422, 7, 4425, 6, 4428, 4, 4431, 2, 4433, 6, 4436, 4, 4439, 3, 4441, 6, 4444, 5, 4447, 3, 4450, 2, 4452, 6, 4455, 4, 4458, 3, 4460, 7, 4463, 5, 4466, 4, 4468, 9, 4471, 6, 4474, 4, 4477, 3, 4479, 7, 4482, 5, 4485, 4, 4487, 11, 4490, 7, 4493, 5, 4496, 3, 4498, 8, 4501, 5, 4504, 4, 4506, 10, 4509, 6, 4512, 5, 4515, 3, 4517, 7, 4520, 5, 4523, 4, 4525, 12, 4528, 6, 4531, 5, 4534, 3, 4536, 8, 4539, 5, 4542, 4, 4545, 2, 4547, 6, 4550, 5, 4553, 2, 4555, 7, 4558, 5, 4561, 4, 4564, 2, 4566, 6, 4569, 5, 4572, 3, 4574, 7, 4577, 6, 4580, 4, 4583, 2, 4585, 7, 4588, 5, 4591, 3, 4593, 8, 4596, 6, 4599, 4, 4602, 3, 4604, 7, 4607, 5, 4610, 4, 4612, 8, 4615, 6, 4618, 4, 4620, 10, 4623, 6, 4626, 5, 4629, 3, 4631, 8, 4634, 5, 4637, 4, 4640, 2, 4642, 7, 4645, 5, 4648, 3, 4650, 9, 4653, 5, 4656, 4, 4659, 2, 4661, 6, 4664, 5, 4667, 3, 4669, 11, 4672, 6, 4675, 5, 4678, 2, 4680, 7, 4683, 5, 4686, 3, 4688, 8, 4691, 6, 4694, 4, 4697, 3, 4699, 7, 4702, 5, 4705, 4, 4707, 8, 4710, 6, 4713, 4, 4716, 3, 4718, 7, 4721, 5, 4724, 4, 4726, 8, 4729, 6, 4732, 4, 4735, 3, 4737, 7, 4740, 5, 4743, 4, 4745, 9, 4748, 6, 4751, 4, 4754, 3, 4756, 7, 4759, 5, 4762, 4, 4764, 9, 4767, 6, 4770, 5, 4773, 2, 4775, 7, 4778, 5, 4781, 4, 4783, 11, 4786, 6, 4789, 5, 4792, 3, 4794, 7, 4797, 6, 4800, 4, 4802, 10, 4805, 6, 4808, 4, 4811, 3, 4813, 7, 4816, 6, 4819, 4, 4822, 2, 4824, 7, 4827, 5, 4830, 3, 4832, 7, 4835, 6, 4838, 4, 4840, 9, 4843, 6, 4846, 4, 4849, 3, 4851, 7, 4854, 5, 4857, 4, 4859, 9, 4862, 7, 4865, 5, 4868, 3, 4870, 8, 4873, 5, 4876, 4, 4878, 11, 4881, 6, 4884, 5, 4887, 3, 4889, 8, 4892, 6, 4895, 4, 4898, 1, 4900, 6, 4903, 5, 4906, 3, 4908, 8, 4911, 6, 4914, 4, 4917, 2, 4919, 6, 4922, 5, 4925, 3, 4927, 7, 4930, 6, 4933, 4, 4936, 2, 4938, 6, 4941, 5, 4944, 3, 4946, 7, 4949, 6, 4952, 4, 4955, 2, 4957, 7, 4960, 5, 4963, 3, 4965, 8, 4968, 6, 4971, 4, 4974, 3, 4976, 7, 4979, 5, 4982, 4, 4984, 8, 4987, 6, 4990, 5, 4993, 2, 4995, 7, 4998, 5, 5001, 4, 5003, 8, 5006, 6, 5009, 5, 5012, 2, 5014, 7, 5017, 5, 5020, 4, 5022, 10, 5025, 6, 5028, 4, 5031, 2, 5033, 6, 5036, 5, 5039, 3, 5041, 8, 5044, 6, 5047, 5, 5050, 2, 5052, 7, 5055, 5, 5058, 3, 5060, 8, 5063, 6, 5066, 4, 5069, 3, 5071, 7, 5074, 5, 5077, 4, 5079, 8, 5082, 6, 5085, 5, 5088, 3, 5090, 8, 5093, 5, 5096, 4, 5098, 8, 5101, 6, 5104, 5, 5107, 3, 5109, 7, 5112, 5, 5115, 4, 5117, 8, 5120, 6, 5123, 5, 5126, 3, 5128, 7, 5131, 5, 5134, 4, 5136, 10, 5139, 6, 5142, 5, 5145, 2, 5147, 7, 5150, 5, 5153, 4, 5156, 2, 5158, 6, 5161, 5, 5164, 3, 5166, 7, 5169, 6, 5172, 4, 5175, 1, 5177, 7, 5180, 5, 5183, 3, 5185, 8, 5188, 6, 5191, 4, 5193, 8, 5196, 7, 5199, 5, 5202, 4, 5204, 8, 5207, 6, 5210, 4, 5212, 8, 5215, 7, 5218, 5, 5221, 3, 5223, 7, 5226, 6, 5229, 4, 5231, 10, 5234, 7, 5237, 5, 5240, 3, 5242, 8, 5245, 5, 5248, 4, 5250, 11, 5253, 6, 5256, 5, 5259, 3, 5261, 8, 5264, 6, 5267, 5, 5270, 1, 5272, 7, 5275, 5, 5278, 3, 5280, 8, 5283, 6, 5286, 4, 5289, 2, 5291, 7, 5294, 5, 5297, 3, 5299, 8, 5302, 6, 5305, 4, 5308, 3, 5310, 7, 5313, 5, 5316, 3, 5318, 7, 5321, 6, 5324, 4, 5327, 3, 5329, 7, 5332, 5, 5335, 3, 5337, 8, 5340, 6, 5343, 4, 5345, 10, 5348, 7, 5351, 5, 5354, 4, 5356, 9, 5359, 6, 5362, 5, 5364, 11, 5367, 7, 5370, 5, 5373, 4, 5375, 9, 5378, 6, 5381, 5, 5384, 1, 5386, 7, 5389, 6, 5392, 4, 5394, 8, 5397, 6, 5400, 5, 5403, 3, 5405, 7, 5408, 6, 5411, 4, 5413, 8, 5416, 6, 5419, 5, 5422, 3, 5424, 7, 5427, 6, 5430, 3, 5432, 8, 5435, 6, 5438, 4, 5441, 3, 5443, 7, 5446, 6, 5449, 4, 5451, 9, 5454, 7, 5457, 5, 5460, 3, 5462, 8, 5465, 5, 5468, 4, 5470, 9, 5473, 6, 5476, 5, 5479, 3, 5481, 8, 5484, 6, 5487, 4, 5489, 9, 5492, 6, 5495, 5, 5498, 3, 5500, 7, 5503, 6, 5506, 4, 5508, 10, 5511, 6, 5514, 5, 5517, 3, 5519, 7, 5522, 6, 5525, 4, 5527, 10, 5530, 6, 5533, 5, 5536, 3, 5538, 7, 5541, 6, 5544, 4, 5546, 11, 5549, 7, 5552, 5, 5555, 3, 5557, 8, 5560, 6, 5563, 4, 5565, 9, 5568, 7, 5571, 5, 5574, 4, 5576, 8, 5579, 6, 5582, 4, 5584, 11, 5587, 7, 5590, 5, 5593, 4, 5595, 8, 5598, 6, 5601, 5, 5603, 10, 5606, 7, 5609, 5, 5612, 3, 5614, 8, 5617, 6, 5620, 4, 5622, 10, 5625, 6, 5628, 5, 5631, 4, 5633, 9, 5636, 6
    };

    /* renamed from: r, reason: collision with root package name */
    @net.time4j.engine.d0(format = "G")
    public static final net.time4j.engine.q<d0> f82177r;

    /* renamed from: s, reason: collision with root package name */
    public static final net.time4j.engine.q<Integer> f82178s;
    private static final long serialVersionUID = -4284841131270593971L;

    /* renamed from: t, reason: collision with root package name */
    @net.time4j.engine.d0(format = "y")
    public static final net.time4j.engine.q<Integer> f82179t;

    /* renamed from: u, reason: collision with root package name */
    @net.time4j.engine.d0(format = "U")
    public static final net.time4j.format.v<g> f82180u;

    /* renamed from: v, reason: collision with root package name */
    public static final net.time4j.engine.q<n0> f82181v;

    /* renamed from: w, reason: collision with root package name */
    @net.time4j.engine.d0(alt = "L", format = "M")
    public static final net.time4j.format.v<l> f82182w;

    /* renamed from: x, reason: collision with root package name */
    public static final o0<Integer, KoreanCalendar> f82183x;

    /* renamed from: y, reason: collision with root package name */
    @net.time4j.engine.d0(format = "d")
    public static final o0<Integer, KoreanCalendar> f82184y;

    /* renamed from: z, reason: collision with root package name */
    @net.time4j.engine.d0(format = "D")
    public static final o0<Integer, KoreanCalendar> f82185z;

    private static class SPX implements Externalizable {

        /* renamed from: c, reason: collision with root package name */
        private static final int f82186c = 15;
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        private transient Object f82187b;

        public SPX() {
        }

        private KoreanCalendar a(ObjectInput objectInput) throws IOException {
            byte readByte = objectInput.readByte();
            byte readByte2 = objectInput.readByte();
            byte readByte3 = objectInput.readByte();
            boolean readBoolean = objectInput.readBoolean();
            byte readByte4 = objectInput.readByte();
            l f4 = l.f(readByte3);
            if (readBoolean) {
                f4 = f4.g();
            }
            return KoreanCalendar.V0(readByte, readByte2, f4, readByte4);
        }

        private void b(ObjectOutput objectOutput) throws IOException {
            j jVar = (j) this.f82187b;
            objectOutput.writeByte(jVar.r0());
            objectOutput.writeByte(jVar.G0().getNumber());
            objectOutput.writeByte(jVar.y0().getNumber());
            objectOutput.writeBoolean(jVar.y0().e());
            objectOutput.writeByte(jVar.t());
        }

        private Object readResolve() throws ObjectStreamException {
            return this.f82187b;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readByte() != 15) {
                throw new InvalidObjectException(ProtectedSandApp.s("譧\u0001"));
            }
            this.f82187b = a(objectInput);
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeByte(15);
            b(objectOutput);
        }

        SPX(Object obj) {
            this.f82187b = obj;
        }
    }

    static class a implements net.time4j.engine.t<KoreanCalendar, net.time4j.engine.l<KoreanCalendar>> {
        a() {
        }

        public net.time4j.engine.l<KoreanCalendar> a(KoreanCalendar koreanCalendar) {
            return KoreanCalendar.D;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.l<KoreanCalendar> apply(KoreanCalendar koreanCalendar) {
            return KoreanCalendar.D;
        }
    }

    private static class b implements net.time4j.engine.a0<KoreanCalendar, d0> {
        private b() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(KoreanCalendar koreanCalendar) {
            throw new AbstractMethodError(ProtectedSandApp.s("譨\u0001"));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(KoreanCalendar koreanCalendar) {
            throw new AbstractMethodError(ProtectedSandApp.s("譨\u0001"));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public d0 getMaximum(KoreanCalendar koreanCalendar) {
            return d0.DANGI;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public d0 getMinimum(KoreanCalendar koreanCalendar) {
            return d0.DANGI;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public d0 getValue(KoreanCalendar koreanCalendar) {
            return d0.DANGI;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(KoreanCalendar koreanCalendar, d0 d0Var) {
            return d0Var == d0.DANGI;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public KoreanCalendar withValue(KoreanCalendar koreanCalendar, d0 d0Var, boolean z4) {
            if (j(koreanCalendar, d0Var)) {
                return koreanCalendar;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("譩\u0001") + d0Var);
        }

        b(a aVar) {
        }
    }

    private static class c extends net.time4j.calendar.a<KoreanCalendar> {
        c() {
            super(KoreanCalendar.class);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.calendar.a, net.time4j.engine.u
        /* renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public KoreanCalendar e(net.time4j.engine.r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            n aVar;
            int l4 = rVar.l(net.time4j.calendar.d.f82409a);
            if (l4 == Integer.MIN_VALUE) {
                net.time4j.format.v<g> vVar = KoreanCalendar.f82180u;
                if (rVar.w(vVar)) {
                    net.time4j.engine.q<Integer> qVar = KoreanCalendar.f82178s;
                    if (rVar.w(qVar)) {
                        aVar = ((g) rVar.r(vVar)).p(rVar.l(qVar));
                    }
                }
                int l5 = rVar.l(d0.DANGI.yearOfEra());
                aVar = l5 != Integer.MIN_VALUE ? n.a(l5) : null;
            } else {
                aVar = new n.a(l4);
            }
            if (aVar == null) {
                rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("譪\u0001"));
                return null;
            }
            net.time4j.format.v<l> vVar2 = KoreanCalendar.f82182w;
            if (rVar.w(vVar2)) {
                l lVar = (l) rVar.r(vVar2);
                int l6 = rVar.l(KoreanCalendar.f82184y);
                if (l6 != Integer.MIN_VALUE) {
                    return KoreanCalendar.W0(aVar, lVar, l6);
                }
            } else {
                int l7 = rVar.l(KoreanCalendar.f82185z);
                if (l7 != Integer.MIN_VALUE && l7 >= 1) {
                    return (KoreanCalendar) KoreanCalendar.W0(aVar, l.f(1), 1).W(l7 - 1, e.DAYS);
                }
            }
            return null;
        }
    }

    private static class d extends h<KoreanCalendar> {

        /* renamed from: f, reason: collision with root package name */
        private static final List<net.time4j.tz.p> f82188f;

        /* renamed from: g, reason: collision with root package name */
        private static final long f82189g;

        /* renamed from: h, reason: collision with root package name */
        private static final long f82190h;

        /* renamed from: i, reason: collision with root package name */
        private static final long f82191i;

        /* renamed from: j, reason: collision with root package name */
        private static final long f82192j;

        static {
            ArrayList arrayList = new ArrayList(5);
            net.time4j.tz.f fVar = net.time4j.tz.f.AHEAD_OF_UTC;
            arrayList.add(net.time4j.tz.p.b(fVar, 126, 58, com.google.firebase.remoteconfig.p.f60679p));
            arrayList.add(net.time4j.tz.p.n(fVar, 8, 30));
            arrayList.add(net.time4j.tz.p.n(fVar, 9, 0));
            arrayList.add(net.time4j.tz.p.n(fVar, 8, 30));
            arrayList.add(net.time4j.tz.p.n(fVar, 9, 0));
            f82188f = Collections.unmodifiableList(arrayList);
            f82189g = net.time4j.l0.r1(1908, 4, 1).b();
            f82190h = net.time4j.l0.r1(1912, 1, 1).b();
            f82191i = net.time4j.l0.r1(1954, 3, 21).b();
            f82192j = net.time4j.l0.r1(1961, 8, 10).b();
        }

        private d() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.time4j.calendar.h
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public KoreanCalendar i(int i4, int i5, l lVar, int i6, long j4) {
            return new KoreanCalendar(i4, i5, lVar, i6, j4);
        }

        @Override // net.time4j.engine.l
        public List<net.time4j.engine.j> a() {
            return Collections.singletonList(d0.DANGI);
        }

        @Override // net.time4j.calendar.h
        int[] l() {
            return KoreanCalendar.f82176q;
        }

        @Override // net.time4j.calendar.h
        net.time4j.tz.p n(long j4) {
            return j4 < f82189g ? f82188f.get(0) : j4 < f82190h ? f82188f.get(1) : j4 < f82191i ? f82188f.get(2) : j4 < f82192j ? f82188f.get(3) : f82188f.get(4);
        }

        d(a aVar) {
        }
    }

    public enum e implements net.time4j.engine.w {
        CYCLES(1.893415507776E9d),
        YEARS(3.15569251296E7d),
        MONTHS(2551442.8775903997d),
        WEEKS(604800.0d),
        DAYS(86400.0d);

        private final transient double length;

        e(double d5) {
            this.length = d5;
        }

        public int between(KoreanCalendar koreanCalendar, KoreanCalendar koreanCalendar2) {
            return (int) koreanCalendar.Y(koreanCalendar2, this);
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

    private static class f implements net.time4j.engine.a0<KoreanCalendar, Integer> {
        private f() {
        }

        private int f(KoreanCalendar koreanCalendar) {
            return (koreanCalendar.G0().getNumber() + (koreanCalendar.r0() * 60)) - 364;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(KoreanCalendar koreanCalendar) {
            throw new AbstractMethodError(ProtectedSandApp.s("議\u0001"));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(KoreanCalendar koreanCalendar) {
            throw new AbstractMethodError(ProtectedSandApp.s("議\u0001"));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(KoreanCalendar koreanCalendar) {
            return 5332;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(KoreanCalendar koreanCalendar) {
            return 3978;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer getValue(KoreanCalendar koreanCalendar) {
            return Integer.valueOf(f(koreanCalendar));
        }

        @Override // net.time4j.engine.a0
        public boolean j(KoreanCalendar koreanCalendar, Integer num) {
            if (num == null) {
                return false;
            }
            return num.intValue() >= getMinimum(koreanCalendar).intValue() && num.intValue() <= getMaximum(koreanCalendar).intValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.a0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public KoreanCalendar withValue(KoreanCalendar koreanCalendar, Integer num, boolean z4) {
            if (num == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("譲\u0001"));
            }
            if (j(koreanCalendar, num)) {
                return (KoreanCalendar) koreanCalendar.W(num.intValue() - f(koreanCalendar), e.YEARS);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("譱\u0001") + num);
        }

        f(a aVar) {
        }
    }

    static {
        d0 d0Var = d0.DANGI;
        net.time4j.engine.q<d0> era = d0Var.era();
        f82177r = era;
        net.time4j.calendar.service.j jVar = new net.time4j.calendar.service.j(ProtectedSandApp.s("譳\u0001"), KoreanCalendar.class, 72, 94, (char) 0, null, null);
        f82178s = jVar;
        net.time4j.engine.q<Integer> yearOfEra = d0Var.yearOfEra();
        f82179t = yearOfEra;
        i iVar = i.f82567b;
        f82180u = iVar;
        m t4 = m.t();
        f82181v = t4;
        k kVar = k.f82589b;
        f82182w = kVar;
        net.time4j.calendar.service.j jVar2 = new net.time4j.calendar.service.j(ProtectedSandApp.s("譴\u0001"), KoreanCalendar.class, 1, 12, (char) 0, null, null);
        f82183x = jVar2;
        net.time4j.calendar.service.j jVar3 = new net.time4j.calendar.service.j(ProtectedSandApp.s("譵\u0001"), KoreanCalendar.class, 1, 30, 'd');
        f82184y = jVar3;
        net.time4j.calendar.service.j jVar4 = new net.time4j.calendar.service.j(ProtectedSandApp.s("譶\u0001"), KoreanCalendar.class, 1, 355, 'D');
        f82185z = jVar4;
        net.time4j.calendar.service.k kVar2 = new net.time4j.calendar.service.k(KoreanCalendar.class, S0());
        A = kVar2;
        r0<KoreanCalendar> r0Var = new r0<>(KoreanCalendar.class, jVar3, kVar2);
        B = r0Var;
        C = r0Var;
        d dVar = new d(null);
        D = dVar;
        j0.c f4 = j0.c.m(e.class, KoreanCalendar.class, new c(), dVar).f(era, new b(null)).f(jVar, j.s0(iVar));
        f fVar = new f(null);
        e eVar = e.YEARS;
        j0.c f5 = f4.g(yearOfEra, fVar, eVar).g(iVar, j.H0(kVar), eVar).f(t4, m.t());
        net.time4j.engine.a0 A0 = j.A0(jVar3);
        e eVar2 = e.MONTHS;
        j0.c g4 = f5.g(kVar, A0, eVar2).g(jVar2, j.z0(jVar3), eVar2);
        net.time4j.engine.a0 t02 = j.t0();
        e eVar3 = e.DAYS;
        j0.c f6 = g4.g(jVar3, t02, eVar3).g(jVar4, j.w0(), eVar3).g(kVar2, new s0(S0(), new a()), eVar3).f(r0Var, r0.E(r0Var)).f(net.time4j.calendar.d.f82409a, new l0(dVar, jVar4));
        e eVar4 = e.CYCLES;
        j0.c j4 = f6.j(eVar4, j.E0(0), eVar4.getLength(), Collections.singleton(eVar)).j(eVar, j.E0(1), eVar.getLength(), Collections.singleton(eVar4)).j(eVar2, j.E0(2), eVar2.getLength(), Collections.emptySet());
        e eVar5 = e.WEEKS;
        E = j4.j(eVar5, j.E0(3), eVar5.getLength(), Collections.singleton(eVar3)).j(eVar3, j.E0(4), eVar3.getLength(), Collections.singleton(eVar5)).h(new d.h(KoreanCalendar.class, jVar3, jVar4, S0())).c();
    }

    private KoreanCalendar(int i4, int i5, l lVar, int i6, long j4) {
        super(i4, i5, lVar, i6, j4);
    }

    public static net.time4j.engine.j0<e, KoreanCalendar> Q0() {
        return E;
    }

    public static i1 S0() {
        return i1.k(new Locale(ProtectedSandApp.s("護\u0001"), ProtectedSandApp.s("譸\u0001")));
    }

    public static boolean T0(n nVar, l lVar, int i4) {
        return D.q(nVar.e(), nVar.g().getNumber(), lVar, i4);
    }

    public static KoreanCalendar U0() {
        return (KoreanCalendar) w0.g().f(E);
    }

    static KoreanCalendar V0(int i4, int i5, l lVar, int i6) {
        return new KoreanCalendar(i4, i5, lVar, i6, D.y(i4, i5, lVar, i6));
    }

    public static KoreanCalendar W0(n nVar, l lVar, int i4) {
        return V0(nVar.e(), nVar.g().getNumber(), lVar, i4);
    }

    public static KoreanCalendar X0(int i4) {
        return W0(new n.a(i4), l.f(1), 1);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("譹\u0001"));
    }

    private Object writeReplace() {
        return new SPX(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m0
    /* renamed from: Q */
    public net.time4j.engine.j0<e, KoreanCalendar> y() {
        return E;
    }

    protected KoreanCalendar R0() {
        return this;
    }

    @Override // net.time4j.calendar.j
    h<KoreanCalendar> p0() {
        return D;
    }

    @Override // net.time4j.engine.m0, net.time4j.engine.r
    protected net.time4j.engine.x y() {
        return E;
    }

    @Override // net.time4j.engine.r
    protected net.time4j.engine.r z() {
        return this;
    }

    KoreanCalendar(int i4, int i5, l lVar, int i6, long j4, a aVar) {
        super(i4, i5, lVar, i6, j4);
    }
}
