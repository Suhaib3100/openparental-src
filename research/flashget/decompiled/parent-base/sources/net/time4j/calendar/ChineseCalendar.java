package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import net.time4j.calendar.d;
import net.time4j.calendar.n;
import net.time4j.engine.ChronoException;
import net.time4j.engine.j0;
import net.time4j.g1;
import net.time4j.i1;
import net.time4j.w0;

@net.time4j.format.c("chinese")
/* loaded from: classes7.dex */
public final class ChineseCalendar extends j<e, ChineseCalendar> implements net.time4j.format.h {

    @net.time4j.engine.d0(format = "E")
    public static final o0<g1, ChineseCalendar> A;
    private static final r0<ChineseCalendar> B;

    @net.time4j.engine.d0(format = "F")
    public static final g0<ChineseCalendar> C;
    private static final h<ChineseCalendar> D;
    private static final net.time4j.engine.j0<e, ChineseCalendar> E;

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f81893q = {4281, 5, 4284, 4, 4287, 1, 4289, 6, 4292, 5, 4295, 3, 4297, 8, 4300, 6, 4303, 4, 4306, 2, 4308, 7, 4311, 5, 4314, 3, 4316, 8, 4319, 6, 4322, 4, 4325, 3, 4327, 7, 4330, 5, 4333, 3, 4335, 7, 4338, 6, 4341, 4, 4344, 3, 4346, 7, 4349, 5, 4352, 3, 4354, 8, 4357, 6, 4360, 4, 4363, 2, 4365, 7, 4368, 5, 4371, 4, 4373, 9, 4376, 6, 4379, 4, 4382, 3, 4384, 7, 4387, 5, 4390, 4, 4392, 9, 4395, 6, 4398, 5, 4401, 2, 4403, 7, 4406, 5, 4409, 3, 4411, 10, 4414, 6, 4417, 5, 4420, 3, 4422, 7, 4425, 5, 4428, 4, 4431, 2, 4433, 6, 4436, 4, 4439, 2, 4441, 7, 4444, 5, 4447, 3, 4450, 2, 4452, 6, 4455, 4, 4458, 3, 4460, 7, 4463, 5, 4466, 4, 4468, 9, 4471, 6, 4474, 4, 4477, 3, 4479, 7, 4482, 5, 4485, 4, 4487, 8, 4490, 7, 4493, 5, 4496, 3, 4498, 8, 4501, 5, 4504, 4, 4506, 10, 4509, 6, 4512, 5, 4515, 3, 4517, 7, 4520, 5, 4523, 4, 4526, 2, 4528, 6, 4531, 5, 4534, 3, 4536, 8, 4539, 5, 4542, 4, 4545, 2, 4547, 6, 4550, 5, 4553, 2, 4555, 7, 4558, 5, 4561, 4, 4564, 2, 4566, 6, 4569, 5, 4572, 3, 4574, 7, 4577, 6, 4580, 4, 4583, 2, 4585, 7, 4588, 5, 4591, 3, 4593, 8, 4596, 6, 4599, 4, 4602, 3, 4604, 7, 4607, 5, 4610, 4, 4612, 8, 4615, 6, 4618, 4, 4620, 10, 4623, 6, 4626, 5, 4629, 3, 4631, 8, 4634, 5, 4637, 4, 4640, 2, 4642, 7, 4645, 5, 4648, 4, 4650, 9, 4653, 6, 4656, 4, 4659, 2, 4661, 6, 4664, 5, 4667, 3, 4669, 11, 4672, 6, 4675, 5, 4678, 2, 4680, 7, 4683, 5, 4686, 3, 4688, 8, 4691, 6, 4694, 4, 4697, 3, 4699, 7, 4702, 5, 4705, 4, 4707, 8, 4710, 6, 4713, 4, 4716, 3, 4718, 7, 4721, 5, 4724, 4, 4726, 8, 4729, 6, 4732, 4, 4735, 2, 4737, 7, 4740, 5, 4743, 4, 4745, 9, 4748, 6, 4751, 4, 4754, 3, 4756, 7, 4759, 5, 4762, 4, 4764, 11, 4767, 6, 4770, 5, 4773, 2, 4775, 7, 4778, 5, 4781, 4, 4783, 11, 4786, 6, 4789, 5, 4792, 3, 4794, 7, 4797, 6, 4800, 4, 4802, 10, 4805, 6, 4808, 5, 4811, 3, 4813, 7, 4816, 6, 4819, 4, 4822, 2, 4824, 6, 4827, 5, 4830, 3, 4832, 7, 4835, 6, 4838, 4, 4840, 9, 4843, 6, 4846, 4, 4849, 3, 4851, 7, 4854, 5, 4857, 4, 4859, 9, 4862, 7, 4865, 5, 4868, 3, 4870, 8, 4873, 5, 4876, 4, 4878, 11, 4881, 6, 4884, 5, 4887, 3, 4889, 7, 4892, 6, 4895, 5, 4898, 1, 4900, 7, 4903, 5, 4906, 3, 4908, 8, 4911, 6, 4914, 4, 4917, 2, 4919, 6, 4922, 5, 4925, 3, 4927, 7, 4930, 6, 4933, 4, 4936, 2, 4938, 6, 4941, 5, 4944, 3, 4946, 7, 4949, 6, 4952, 4, 4954, 10, 4957, 7, 4960, 5, 4963, 3, 4965, 8, 4968, 6, 4971, 4, 4974, 3, 4976, 7, 4979, 5, 4982, 4, 4984, 8, 4987, 6, 4990, 5, 4993, 1, 4995, 7, 4998, 5, 5001, 4, 5003, 8, 5006, 6, 5009, 5, 5012, 2, 5014, 7, 5017, 5, 5020, 4, 5022, 10, 5025, 6, 5028, 4, 5031, 2, 5033, 6, 5036, 5, 5039, 3, 5041, 8, 5044, 6, 5047, 5, 5050, 2, 5052, 7, 5055, 5, 5058, 3, 5060, 8, 5063, 6, 5066, 4, 5069, 3, 5071, 7, 5074, 5, 5077, 4, 5079, 8, 5082, 7, 5085, 5, 5088, 3, 5090, 8, 5093, 5, 5096, 4, 5098, 8, 5101, 6, 5104, 5, 5107, 3, 5109, 7, 5112, 5, 5115, 4, 5117, 10, 5120, 6, 5123, 5, 5126, 3, 5128, 7, 5131, 5, 5134, 4, 5136, 10, 5139, 6, 5142, 5, 5145, 2, 5147, 7, 5150, 5, 5153, 4, 5156, 1, 5158, 6, 5161, 5, 5164, 3, 5166, 7, 5169, 6, 5172, 4, 5175, 1, 5177, 7, 5180, 5, 5183, 3, 5185, 7, 5188, 6, 5191, 4, 5193, 8, 5196, 7, 5199, 5, 5202, 4, 5204, 7, 5207, 6, 5210, 4, 5212, 9, 5215, 7, 5218, 5, 5221, 3, 5223, 7, 5226, 6, 5229, 4, 5231, 10, 5234, 7, 5237, 5, 5240, 3, 5242, 8, 5245, 6, 5248, 4, 5250, 11, 5253, 6, 5256, 5, 5259, 3, 5261, 8, 5264, 6, 5267, 5, 5270, 1, 5272, 7, 5275, 5, 5278, 3, 5280, 8, 5283, 6, 5286, 4, 5289, 2, 5291, 7, 5294, 5, 5297, 3, 5299, 7, 5302, 6, 5305, 4, 5308, 3, 5310, 7, 5313, 5, 5316, 3, 5318, 7, 5321, 6, 5324, 4, 5327, 3, 5329, 7, 5332, 5, 5335, 3, 5337, 8, 5340, 6, 5343, 4, 5346, 2, 5348, 7, 5351, 5, 5354, 4, 5356, 9, 5359, 6, 5362, 5, 5364, 11, 5367, 7, 5370, 5, 5373, 4, 5375, 9, 5378, 6, 5381, 5, 5384, 2, 5386, 7, 5389, 6, 5392, 4, 5394, 8, 5397, 6, 5400, 5, 5403, 3, 5405, 7, 5408, 6, 5411, 4, 5413, 8, 5416, 6, 5419, 5, 5422, 3, 5424, 7, 5427, 6, 5430, 3, 5432, 8, 5435, 6, 5438, 4, 5441, 3, 5443, 7, 5446, 6, 5449, 4, 5451, 9, 5454, 7, 5457, 5, 5460, 3, 5462, 8, 5465, 5, 5468, 4, 5470, 9, 5473, 6, 5476, 5, 5479, 3, 5481, 8, 5484, 6, 5487, 4, 5489, 9, 5492, 6, 5495, 5, 5498, 3, 5500, 7, 5503, 6, 5506, 4, 5508, 10, 5511, 6, 5514, 5, 5517, 3, 5519, 7, 5522, 6, 5525, 4, 5527, 10, 5530, 6, 5533, 5, 5536, 3, 5538, 7, 5541, 6, 5544, 4, 5546, 11, 5549, 7, 5552, 5, 5555, 3, 5557, 8, 5560, 6, 5563, 4, 5565, 9, 5568, 7, 5571, 5, 5574, 4, 5576, 8, 5579, 6, 5582, 4, 5584, 8, 5587, 7, 5590, 5, 5593, 4, 5595, 8, 5598, 6, 5601, 5, 5603, 10, 5606, 7, 5609, 5, 5612, 3, 5614, 8, 5617, 6, 5620, 4, 5622, 10, 5625, 6, 5628, 5, 5631, 3, 5633, 8, 5636, 6
    };

    /* renamed from: r, reason: collision with root package name */
    @net.time4j.engine.d0(format = "G")
    public static final net.time4j.engine.q<net.time4j.calendar.c> f81894r;

    /* renamed from: s, reason: collision with root package name */
    public static final net.time4j.engine.q<Integer> f81895s;
    private static final long serialVersionUID = 8743381746750717307L;

    /* renamed from: t, reason: collision with root package name */
    @net.time4j.engine.d0(format = "y")
    public static final o0<Integer, ChineseCalendar> f81896t;

    /* renamed from: u, reason: collision with root package name */
    @net.time4j.engine.d0(format = "U")
    public static final net.time4j.format.v<g> f81897u;

    /* renamed from: v, reason: collision with root package name */
    public static final net.time4j.engine.q<n0> f81898v;

    /* renamed from: w, reason: collision with root package name */
    @net.time4j.engine.d0(alt = "L", format = "M")
    public static final net.time4j.format.v<l> f81899w;

    /* renamed from: x, reason: collision with root package name */
    public static final o0<Integer, ChineseCalendar> f81900x;

    /* renamed from: y, reason: collision with root package name */
    @net.time4j.engine.d0(format = "d")
    public static final o0<Integer, ChineseCalendar> f81901y;

    /* renamed from: z, reason: collision with root package name */
    @net.time4j.engine.d0(format = "D")
    public static final o0<Integer, ChineseCalendar> f81902z;

    private static class SPX implements Externalizable {

        /* renamed from: c, reason: collision with root package name */
        private static final int f81903c = 14;
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        private transient Object f81904b;

        public SPX() {
        }

        private ChineseCalendar a(ObjectInput objectInput) throws IOException {
            byte readByte = objectInput.readByte();
            byte readByte2 = objectInput.readByte();
            byte readByte3 = objectInput.readByte();
            boolean readBoolean = objectInput.readBoolean();
            byte readByte4 = objectInput.readByte();
            l f4 = l.f(readByte3);
            if (readBoolean) {
                f4 = f4.g();
            }
            return ChineseCalendar.V0(readByte, readByte2, f4, readByte4);
        }

        private void b(ObjectOutput objectOutput) throws IOException {
            j jVar = (j) this.f81904b;
            objectOutput.writeByte(jVar.r0());
            objectOutput.writeByte(jVar.G0().getNumber());
            objectOutput.writeByte(jVar.y0().getNumber());
            objectOutput.writeBoolean(jVar.y0().e());
            objectOutput.writeByte(jVar.t());
        }

        private Object readResolve() throws ObjectStreamException {
            return this.f81904b;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readByte() != 14) {
                throw new InvalidObjectException(ProtectedSandApp.s("訖\u0001"));
            }
            this.f81904b = a(objectInput);
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeByte(14);
            b(objectOutput);
        }

        SPX(Object obj) {
            this.f81904b = obj;
        }
    }

    static class a implements net.time4j.engine.t<ChineseCalendar, net.time4j.engine.l<ChineseCalendar>> {
        a() {
        }

        public net.time4j.engine.l<ChineseCalendar> a(ChineseCalendar chineseCalendar) {
            return ChineseCalendar.D;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.l<ChineseCalendar> apply(ChineseCalendar chineseCalendar) {
            return ChineseCalendar.D;
        }
    }

    private static class b extends net.time4j.format.d<net.time4j.calendar.c> implements net.time4j.format.v<net.time4j.calendar.c>, net.time4j.engine.a0<ChineseCalendar, net.time4j.calendar.c> {

        /* renamed from: c, reason: collision with root package name */
        static final b f81905c = new b();
        private static final long serialVersionUID = -7868534502157983978L;

        private b() {
            super(ProtectedSandApp.s("託\u0001"));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int H(ChineseCalendar chineseCalendar) {
            return (((chineseCalendar.r0() - 1) * 60) + chineseCalendar.G0().getNumber()) - 2637;
        }

        private Object readResolve() throws ObjectStreamException {
            return f81905c;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(ChineseCalendar chineseCalendar) {
            return ChineseCalendar.f81896t;
        }

        @Override // net.time4j.engine.q
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.c getDefaultMaximum() {
            return net.time4j.calendar.c.YELLOW_EMPEROR;
        }

        @Override // net.time4j.engine.q
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.c getDefaultMinimum() {
            return net.time4j.calendar.c.QING_SHUNZHI_1644_1662;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.c getMaximum(ChineseCalendar chineseCalendar) {
            return net.time4j.calendar.c.YELLOW_EMPEROR;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.c getMinimum(ChineseCalendar chineseCalendar) {
            return net.time4j.calendar.c.QING_SHUNZHI_1644_1662;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.c getValue(ChineseCalendar chineseCalendar) {
            int H = H(chineseCalendar);
            return H < 1662 ? net.time4j.calendar.c.QING_SHUNZHI_1644_1662 : H < 1723 ? net.time4j.calendar.c.QING_KANGXI_1662_1723 : H < 1736 ? net.time4j.calendar.c.QING_YONGZHENG_1723_1736 : H < 1796 ? net.time4j.calendar.c.QING_QIANLONG_1736_1796 : H < 1821 ? net.time4j.calendar.c.QING_JIAQING_1796_1821 : H < 1851 ? net.time4j.calendar.c.QING_DAOGUANG_1821_1851 : H < 1862 ? net.time4j.calendar.c.QING_XIANFENG_1851_1862 : H < 1875 ? net.time4j.calendar.c.QING_TONGZHI_1862_1875 : H < 1909 ? net.time4j.calendar.c.QING_GUANGXU_1875_1909 : chineseCalendar.b() < -21873 ? net.time4j.calendar.c.QING_XUANTONG_1909_1912 : net.time4j.calendar.c.YELLOW_EMPEROR;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public boolean j(ChineseCalendar chineseCalendar, net.time4j.calendar.c cVar) {
            return getValue(chineseCalendar) == cVar;
        }

        @Override // net.time4j.format.v
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.c parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
            Locale locale = (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT);
            boolean booleanValue = ((Boolean) dVar.b(net.time4j.format.a.f82787i, Boolean.TRUE)).booleanValue();
            boolean booleanValue2 = ((Boolean) dVar.b(net.time4j.format.a.f82788j, Boolean.FALSE)).booleanValue();
            net.time4j.format.x xVar = (net.time4j.format.x) dVar.b(net.time4j.format.a.f82785g, net.time4j.format.x.WIDE);
            int index = parsePosition.getIndex();
            for (net.time4j.calendar.c cVar : net.time4j.calendar.c.values()) {
                String displayName = cVar.getDisplayName(locale, xVar);
                int max = Math.max(Math.min(displayName.length() + index, charSequence.length()), index);
                if (max > index) {
                    String charSequence2 = charSequence.subSequence(index, max).toString();
                    if (booleanValue) {
                        displayName = displayName.toLowerCase(locale);
                        charSequence2 = charSequence2.toLowerCase(locale);
                    }
                    if (displayName.equals(charSequence2) || (booleanValue2 && displayName.startsWith(charSequence2))) {
                        parsePosition.setIndex(max);
                        return cVar;
                    }
                }
            }
            if (!locale.getLanguage().isEmpty() && !locale.getLanguage().equals(ProtectedSandApp.s("記\u0001"))) {
                for (net.time4j.calendar.c cVar2 : net.time4j.calendar.c.values()) {
                    Locale locale2 = Locale.ROOT;
                    String displayName2 = cVar2.getDisplayName(locale2, xVar);
                    int max2 = Math.max(Math.min(displayName2.length() + index, charSequence.length()), index);
                    if (max2 > index) {
                        String charSequence3 = charSequence.subSequence(index, max2).toString();
                        if (booleanValue) {
                            displayName2 = displayName2.toLowerCase(locale2);
                            charSequence3 = charSequence3.toLowerCase(locale2);
                        }
                        if (displayName2.equals(charSequence3) || (booleanValue2 && displayName2.startsWith(charSequence3))) {
                            parsePosition.setIndex(max2);
                            return cVar2;
                        }
                    }
                }
            }
            parsePosition.setErrorIndex(index);
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public ChineseCalendar withValue(ChineseCalendar chineseCalendar, net.time4j.calendar.c cVar, boolean z4) {
            if (j(chineseCalendar, cVar)) {
                return chineseCalendar;
            }
            if (cVar == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("訙\u0001"));
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("訚\u0001"));
        }

        @Override // net.time4j.engine.e, net.time4j.engine.q
        public char getSymbol() {
            return 'G';
        }

        @Override // net.time4j.engine.q
        public Class<net.time4j.calendar.c> getType() {
            return net.time4j.calendar.c.class;
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
            appendable.append(((net.time4j.calendar.c) pVar.r(this)).getDisplayName((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT), (net.time4j.format.x) dVar.b(net.time4j.format.a.f82785g, net.time4j.format.x.WIDE)));
        }

        @Override // net.time4j.engine.e
        protected boolean u() {
            return true;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(ChineseCalendar chineseCalendar) {
            return ChineseCalendar.f81896t;
        }
    }

    private static class c extends net.time4j.calendar.a<ChineseCalendar> {
        c() {
            super(ChineseCalendar.class);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
        @Override // net.time4j.calendar.a, net.time4j.engine.u
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public net.time4j.calendar.ChineseCalendar e(net.time4j.engine.r<?> r4, net.time4j.engine.d r5, boolean r6, boolean r7) {
            /*
                r3 = this;
                net.time4j.engine.q<java.lang.Integer> r5 = net.time4j.calendar.d.f82409a
                int r5 = r4.l(r5)
                r6 = 1
                r7 = 0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r5 != r0) goto L64
                net.time4j.format.v<net.time4j.calendar.g> r5 = net.time4j.calendar.ChineseCalendar.f81897u
                boolean r1 = r4.w(r5)
                if (r1 == 0) goto L40
                java.lang.Object r5 = r4.r(r5)
                net.time4j.calendar.g r5 = (net.time4j.calendar.g) r5
                net.time4j.engine.q<java.lang.Integer> r1 = net.time4j.calendar.ChineseCalendar.f81895s
                int r1 = r4.l(r1)
                if (r1 != r0) goto L3b
                net.time4j.engine.q<net.time4j.calendar.c> r1 = net.time4j.calendar.ChineseCalendar.f81894r
                boolean r2 = r4.w(r1)
                if (r2 == 0) goto L62
                java.lang.Object r1 = r4.r(r1)
                net.time4j.calendar.c r1 = (net.time4j.calendar.c) r1
                boolean r2 = r1.isQingDynasty()
                if (r2 == 0) goto L62
                net.time4j.calendar.n r5 = r5.q(r1)
                goto L6a
            L3b:
                net.time4j.calendar.n r5 = r5.p(r1)
                goto L6a
            L40:
                net.time4j.engine.q<net.time4j.calendar.c> r5 = net.time4j.calendar.ChineseCalendar.f81894r
                boolean r1 = r4.w(r5)
                if (r1 == 0) goto L62
                net.time4j.calendar.o0<java.lang.Integer, net.time4j.calendar.ChineseCalendar> r1 = net.time4j.calendar.ChineseCalendar.f81896t
                int r1 = r4.l(r1)
                if (r1 == r0) goto L62
                java.lang.Object r5 = r4.r(r5)
                net.time4j.calendar.c r5 = (net.time4j.calendar.c) r5
                int r5 = r5.getStartAsGregorianYear()
                int r5 = r5 + r1
                int r5 = r5 - r6
                net.time4j.calendar.n$a r1 = new net.time4j.calendar.n$a
                r1.<init>(r5)
                goto L69
            L62:
                r5 = r7
                goto L6a
            L64:
                net.time4j.calendar.n$a r1 = new net.time4j.calendar.n$a
                r1.<init>(r5)
            L69:
                r5 = r1
            L6a:
                if (r5 != 0) goto L78
                net.time4j.engine.p0 r5 = net.time4j.engine.p0.ERROR_MESSAGE
                java.lang.String r6 = "訜\u0001"
                java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                r4.M(r5, r6)
                return r7
            L78:
                net.time4j.format.v<net.time4j.calendar.l> r1 = net.time4j.calendar.ChineseCalendar.f81899w
                boolean r2 = r4.w(r1)
                if (r2 == 0) goto L93
                java.lang.Object r6 = r4.r(r1)
                net.time4j.calendar.l r6 = (net.time4j.calendar.l) r6
                net.time4j.calendar.o0<java.lang.Integer, net.time4j.calendar.ChineseCalendar> r1 = net.time4j.calendar.ChineseCalendar.f81901y
                int r4 = r4.l(r1)
                if (r4 == r0) goto Lb0
                net.time4j.calendar.ChineseCalendar r4 = net.time4j.calendar.ChineseCalendar.W0(r5, r6, r4)
                return r4
            L93:
                net.time4j.calendar.o0<java.lang.Integer, net.time4j.calendar.ChineseCalendar> r1 = net.time4j.calendar.ChineseCalendar.f81902z
                int r4 = r4.l(r1)
                if (r4 == r0) goto Lb0
                if (r4 < r6) goto Lb0
                net.time4j.calendar.l r7 = net.time4j.calendar.l.f(r6)
                net.time4j.calendar.ChineseCalendar r5 = net.time4j.calendar.ChineseCalendar.W0(r5, r7, r6)
                int r4 = r4 - r6
                long r6 = (long) r4
                net.time4j.calendar.ChineseCalendar$e r4 = net.time4j.calendar.ChineseCalendar.e.DAYS
                net.time4j.engine.m0 r4 = r5.W(r6, r4)
                net.time4j.calendar.ChineseCalendar r4 = (net.time4j.calendar.ChineseCalendar) r4
                return r4
            Lb0:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.calendar.ChineseCalendar.c.e(net.time4j.engine.r, net.time4j.engine.d, boolean, boolean):net.time4j.calendar.ChineseCalendar");
        }
    }

    private static class d extends h<ChineseCalendar> {

        /* renamed from: f, reason: collision with root package name */
        private static final net.time4j.tz.p f81906f;

        /* renamed from: g, reason: collision with root package name */
        private static final net.time4j.tz.p f81907g;

        /* renamed from: h, reason: collision with root package name */
        private static final long f81908h = -15705;

        static {
            net.time4j.tz.f fVar = net.time4j.tz.f.AHEAD_OF_UTC;
            f81906f = net.time4j.tz.p.b(fVar, 116, 25, com.google.firebase.remoteconfig.p.f60679p);
            f81907g = net.time4j.tz.p.n(fVar, 8, 0);
        }

        private d() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.time4j.calendar.h
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public ChineseCalendar i(int i4, int i5, l lVar, int i6, long j4) {
            return new ChineseCalendar(i4, i5, lVar, i6, j4);
        }

        @Override // net.time4j.engine.l
        public List<net.time4j.engine.j> a() {
            return Arrays.asList(net.time4j.calendar.c.values());
        }

        @Override // net.time4j.calendar.h
        int[] l() {
            return ChineseCalendar.f81893q;
        }

        @Override // net.time4j.calendar.h
        net.time4j.tz.p n(long j4) {
            return j4 < f81908h ? f81906f : f81907g;
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

        public int between(ChineseCalendar chineseCalendar, ChineseCalendar chineseCalendar2) {
            return (int) chineseCalendar.Y(chineseCalendar2, this);
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

    private static class f implements net.time4j.engine.e0<ChineseCalendar> {
        private f() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(ChineseCalendar chineseCalendar) {
            return ChineseCalendar.f81899w;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(ChineseCalendar chineseCalendar) {
            return ChineseCalendar.f81899w;
        }

        @Override // net.time4j.engine.e0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public int d(ChineseCalendar chineseCalendar) {
            int H = b.f81905c.H(chineseCalendar);
            return H < 1662 ? H - 1643 : H < 1723 ? H - 1661 : H < 1736 ? H - 1722 : H < 1796 ? H - 1735 : H < 1821 ? H - 1795 : H < 1851 ? H - 1820 : H < 1862 ? H - 1850 : H < 1875 ? H - 1861 : H < 1909 ? H - 1874 : chineseCalendar.b() < -21873 ? H - 1908 : H + 2698;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(ChineseCalendar chineseCalendar) {
            return Integer.valueOf(((net.time4j.calendar.c) chineseCalendar.r(ChineseCalendar.f81894r)).getMaxYearOfEra());
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(ChineseCalendar chineseCalendar) {
            return Integer.valueOf(((net.time4j.calendar.c) chineseCalendar.r(ChineseCalendar.f81894r)).getMinYearOfEra());
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer getValue(ChineseCalendar chineseCalendar) {
            return Integer.valueOf(d(chineseCalendar));
        }

        @Override // net.time4j.engine.e0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean e(ChineseCalendar chineseCalendar, int i4) {
            net.time4j.calendar.c cVar = (net.time4j.calendar.c) chineseCalendar.r(ChineseCalendar.f81894r);
            return i4 >= cVar.getMinYearOfEra() && i4 <= cVar.getMaxYearOfEra();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean j(ChineseCalendar chineseCalendar, Integer num) {
            return num != null && e(chineseCalendar, num.intValue());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.e0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public ChineseCalendar a(ChineseCalendar chineseCalendar, int i4, boolean z4) {
            if (e(chineseCalendar, i4)) {
                return (ChineseCalendar) chineseCalendar.W(i4 - d(chineseCalendar), e.YEARS);
            }
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("訣\u0001"), i4));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public ChineseCalendar withValue(ChineseCalendar chineseCalendar, Integer num, boolean z4) {
            if (num != null) {
                return a(chineseCalendar, num.intValue(), z4);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("訤\u0001"));
        }

        f(a aVar) {
        }
    }

    static {
        b bVar = b.f81905c;
        f81894r = bVar;
        net.time4j.calendar.service.j jVar = new net.time4j.calendar.service.j(ProtectedSandApp.s("許\u0001"), ChineseCalendar.class, 72, 94, (char) 0, null, null);
        f81895s = jVar;
        net.time4j.calendar.service.j jVar2 = new net.time4j.calendar.service.j(ProtectedSandApp.s("訲\u0001"), ChineseCalendar.class, 1, 5636, 'y', null, null);
        f81896t = jVar2;
        i iVar = i.f82567b;
        f81897u = iVar;
        m t4 = m.t();
        f81898v = t4;
        k kVar = k.f82589b;
        f81899w = kVar;
        net.time4j.calendar.service.j jVar3 = new net.time4j.calendar.service.j(ProtectedSandApp.s("訳\u0001"), ChineseCalendar.class, 1, 12, (char) 0, null, null);
        f81900x = jVar3;
        net.time4j.calendar.service.j jVar4 = new net.time4j.calendar.service.j(ProtectedSandApp.s("訴\u0001"), ChineseCalendar.class, 1, 30, 'd');
        f81901y = jVar4;
        net.time4j.calendar.service.j jVar5 = new net.time4j.calendar.service.j(ProtectedSandApp.s("訵\u0001"), ChineseCalendar.class, 1, 355, 'D');
        f81902z = jVar5;
        net.time4j.calendar.service.k kVar2 = new net.time4j.calendar.service.k(ChineseCalendar.class, S0());
        A = kVar2;
        r0<ChineseCalendar> r0Var = new r0<>(ChineseCalendar.class, jVar4, kVar2);
        B = r0Var;
        C = r0Var;
        d dVar = new d(null);
        D = dVar;
        j0.c f4 = j0.c.m(e.class, ChineseCalendar.class, new c(), dVar).f(bVar, bVar).f(jVar, j.s0(iVar)).f(jVar2, new f(null));
        net.time4j.engine.a0 H0 = j.H0(kVar);
        e eVar = e.YEARS;
        j0.c f5 = f4.g(iVar, H0, eVar).f(t4, m.t());
        net.time4j.engine.a0 A0 = j.A0(jVar4);
        e eVar2 = e.MONTHS;
        j0.c g4 = f5.g(kVar, A0, eVar2).g(jVar3, j.z0(jVar4), eVar2);
        net.time4j.engine.a0 t02 = j.t0();
        e eVar3 = e.DAYS;
        j0.c f6 = g4.g(jVar4, t02, eVar3).g(jVar5, j.w0(), eVar3).g(kVar2, new s0(S0(), new a()), eVar3).f(r0Var, r0.E(r0Var)).f(net.time4j.calendar.d.f82409a, new l0(dVar, jVar5));
        e eVar4 = e.CYCLES;
        j0.c j4 = f6.j(eVar4, j.E0(0), eVar4.getLength(), Collections.singleton(eVar)).j(eVar, j.E0(1), eVar.getLength(), Collections.singleton(eVar4)).j(eVar2, j.E0(2), eVar2.getLength(), Collections.emptySet());
        e eVar5 = e.WEEKS;
        E = j4.j(eVar5, j.E0(3), eVar5.getLength(), Collections.singleton(eVar3)).j(eVar3, j.E0(4), eVar3.getLength(), Collections.singleton(eVar5)).h(new d.h(ChineseCalendar.class, jVar4, jVar5, S0())).c();
    }

    private ChineseCalendar(int i4, int i5, l lVar, int i6, long j4) {
        super(i4, i5, lVar, i6, j4);
    }

    public static net.time4j.engine.j0<e, ChineseCalendar> Q0() {
        return E;
    }

    public static i1 S0() {
        return i1.k(Locale.CHINA);
    }

    public static boolean T0(n nVar, l lVar, int i4) {
        return D.q(nVar.e(), nVar.g().getNumber(), lVar, i4);
    }

    public static ChineseCalendar U0() {
        return (ChineseCalendar) w0.g().f(E);
    }

    static ChineseCalendar V0(int i4, int i5, l lVar, int i6) {
        return new ChineseCalendar(i4, i5, lVar, i6, D.y(i4, i5, lVar, i6));
    }

    public static ChineseCalendar W0(n nVar, l lVar, int i4) {
        return V0(nVar.e(), nVar.g().getNumber(), lVar, i4);
    }

    public static ChineseCalendar X0(int i4) {
        return W0(new n.a(i4), l.f(1), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ChineseCalendar Y0(int i4) {
        return (ChineseCalendar) X0(i4).N(n0.MINOR_03_QINGMING_015.sinceLichun());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("訶\u0001"));
    }

    private Object writeReplace() {
        return new SPX(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m0
    /* renamed from: Q */
    public net.time4j.engine.j0<e, ChineseCalendar> y() {
        return E;
    }

    protected ChineseCalendar R0() {
        return this;
    }

    @Override // net.time4j.calendar.j
    h<ChineseCalendar> p0() {
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

    ChineseCalendar(int i4, int i5, l lVar, int i6, long j4, a aVar) {
        super(i4, i5, lVar, i6, j4);
    }
}
