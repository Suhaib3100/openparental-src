package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/* compiled from: FlexBuffersBuilder.java */
/* loaded from: classes3.dex */
public class j {

    /* renamed from: h, reason: collision with root package name */
    public static final int f29356h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f29357i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f29358j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f29359k = 3;

    /* renamed from: l, reason: collision with root package name */
    public static final int f29360l = 4;

    /* renamed from: m, reason: collision with root package name */
    public static final int f29361m = 7;

    /* renamed from: n, reason: collision with root package name */
    private static final int f29362n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f29363o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f29364p = 2;

    /* renamed from: q, reason: collision with root package name */
    private static final int f29365q = 3;

    /* renamed from: r, reason: collision with root package name */
    static final /* synthetic */ boolean f29366r = false;

    /* renamed from: a, reason: collision with root package name */
    private final q f29367a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<b> f29368b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, Integer> f29369c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, Integer> f29370d;

    /* renamed from: e, reason: collision with root package name */
    private final int f29371e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29372f;

    /* renamed from: g, reason: collision with root package name */
    private Comparator<b> f29373g;

    /* compiled from: FlexBuffersBuilder.java */
    class a implements Comparator<b> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            byte b5;
            byte b6;
            int i4 = bVar.f29380e;
            int i5 = bVar2.f29380e;
            do {
                b5 = j.this.f29367a.get(i4);
                b6 = j.this.f29367a.get(i5);
                if (b5 == 0) {
                    return b5 - b6;
                }
                i4++;
                i5++;
            } while (b5 == b6);
            return b5 - b6;
        }
    }

    public j(int i4) {
        this(new androidx.emoji2.text.flatbuffer.a(i4), 1);
    }

    private void A(String str, long j4) {
        this.f29368b.add(b.w(u(str), j4));
    }

    static int E(long j4) {
        if (j4 <= 255) {
            return 0;
        }
        if (j4 <= 65535) {
            return 1;
        }
        return j4 <= (((long) (-1)) & 4294967295L) ? 2 : 3;
    }

    private void F(b bVar, int i4) {
        int i5 = bVar.f29376a;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            if (i5 == 3) {
                H(bVar.f29378c, i4);
                return;
            } else if (i5 != 26) {
                J(bVar.f29379d, i4);
                return;
            }
        }
        I(bVar.f29379d, i4);
    }

    private b G(int i4, byte[] bArr, int i5, boolean z4) {
        int E = E(bArr.length);
        I(bArr.length, b(E));
        int l4 = this.f29367a.l();
        this.f29367a.o(bArr, 0, bArr.length);
        if (z4) {
            this.f29367a.m((byte) 0);
        }
        return b.f(i4, l4, i5, E);
    }

    private void H(double d5, int i4) {
        if (i4 == 4) {
            this.f29367a.c((float) d5);
        } else if (i4 == 8) {
            this.f29367a.b(d5);
        }
    }

    private void I(long j4, int i4) {
        if (i4 == 1) {
            this.f29367a.m((byte) j4);
            return;
        }
        if (i4 == 2) {
            this.f29367a.e((short) j4);
        } else if (i4 == 4) {
            this.f29367a.g((int) j4);
        } else {
            if (i4 != 8) {
                return;
            }
            this.f29367a.h(j4);
        }
    }

    private void J(long j4, int i4) {
        I((int) (this.f29367a.l() - j4), i4);
    }

    private b K(int i4, String str) {
        return G(i4, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    private int b(int i4) {
        int i5 = 1 << i4;
        int q4 = b.q(this.f29367a.l(), i5);
        while (true) {
            int i6 = q4 - 1;
            if (q4 == 0) {
                return i5;
            }
            this.f29367a.m((byte) 0);
            q4 = i6;
        }
    }

    private b c(int i4, int i5) {
        long j4 = i5;
        int max = Math.max(0, E(j4));
        int i6 = i4;
        while (i6 < this.f29368b.size()) {
            i6++;
            max = Math.max(max, b.i(4, 0, this.f29368b.get(i6).f29380e, this.f29367a.l(), i6));
        }
        int b5 = b(max);
        I(j4, b5);
        int l4 = this.f29367a.l();
        while (i4 < this.f29368b.size()) {
            int i7 = this.f29368b.get(i4).f29380e;
            J(this.f29368b.get(i4).f29380e, b5);
            i4++;
        }
        return new b(-1, FlexBuffers.q(4, 0), max, l4);
    }

    private b d(int i4, int i5, int i6, boolean z4, boolean z5, b bVar) {
        int i7;
        int i10;
        int i11 = i6;
        long j4 = i11;
        int max = Math.max(0, E(j4));
        if (bVar != null) {
            max = Math.max(max, bVar.h(this.f29367a.l(), 0));
            i7 = 3;
        } else {
            i7 = 1;
        }
        int i12 = 4;
        int i13 = max;
        for (int i14 = i5; i14 < this.f29368b.size(); i14++) {
            i13 = Math.max(i13, this.f29368b.get(i14).h(this.f29367a.l(), i14 + i7));
            if (z4 && i14 == i5) {
                i12 = this.f29368b.get(i14).f29376a;
                if (!FlexBuffers.l(i12)) {
                    throw new FlexBuffers.FlexBufferException("TypedVector does not support this element type");
                }
            }
        }
        int i15 = i5;
        int b5 = b(i13);
        if (bVar != null) {
            J(bVar.f29379d, b5);
            I(1 << bVar.f29377b, b5);
        }
        if (!z5) {
            I(j4, b5);
        }
        int l4 = this.f29367a.l();
        for (int i16 = i15; i16 < this.f29368b.size(); i16++) {
            F(this.f29368b.get(i16), b5);
        }
        if (!z4) {
            while (i15 < this.f29368b.size()) {
                this.f29367a.m(this.f29368b.get(i15).s(i13));
                i15++;
            }
        }
        if (bVar != null) {
            i10 = 9;
        } else if (z4) {
            if (!z5) {
                i11 = 0;
            }
            i10 = FlexBuffers.q(i12, i11);
        } else {
            i10 = 10;
        }
        return new b(i4, i10, i13, l4);
    }

    private int u(String str) {
        if (str == null) {
            return -1;
        }
        int l4 = this.f29367a.l();
        if ((this.f29371e & 1) == 0) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            this.f29367a.o(bytes, 0, bytes.length);
            this.f29367a.m((byte) 0);
            this.f29369c.put(str, Integer.valueOf(l4));
            return l4;
        }
        Integer num = this.f29369c.get(str);
        if (num != null) {
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.f29367a.o(bytes2, 0, bytes2.length);
        this.f29367a.m((byte) 0);
        this.f29369c.put(str, Integer.valueOf(l4));
        return l4;
    }

    private void z(String str, long j4) {
        int u4 = u(str);
        int E = E(j4);
        this.f29368b.add(E == 0 ? b.x(u4, (int) j4) : E == 1 ? b.u(u4, (int) j4) : E == 2 ? b.v(u4, (int) j4) : b.w(u4, j4));
    }

    public void B(BigInteger bigInteger) {
        A(null, bigInteger.longValue());
    }

    public int C() {
        return this.f29368b.size();
    }

    public int D() {
        return this.f29368b.size();
    }

    public int e(String str, int i4) {
        int u4 = u(str);
        ArrayList<b> arrayList = this.f29368b;
        Collections.sort(arrayList.subList(i4, arrayList.size()), this.f29373g);
        b d5 = d(u4, i4, this.f29368b.size() - i4, false, false, c(i4, this.f29368b.size() - i4));
        while (this.f29368b.size() > i4) {
            this.f29368b.remove(r0.size() - 1);
        }
        this.f29368b.add(d5);
        return (int) d5.f29379d;
    }

    public int f(String str, int i4, boolean z4, boolean z5) {
        b d5 = d(u(str), i4, this.f29368b.size() - i4, z4, z5, null);
        while (this.f29368b.size() > i4) {
            this.f29368b.remove(r10.size() - 1);
        }
        this.f29368b.add(d5);
        return (int) d5.f29379d;
    }

    public ByteBuffer g() {
        int b5 = b(this.f29368b.get(0).h(this.f29367a.l(), 0));
        F(this.f29368b.get(0), b5);
        this.f29367a.m(b.c(this.f29368b.get(0)));
        this.f29367a.m((byte) b5);
        this.f29372f = true;
        return ByteBuffer.wrap(this.f29367a.a(), 0, this.f29367a.l());
    }

    public q h() {
        return this.f29367a;
    }

    public int i(String str, byte[] bArr) {
        b G = G(u(str), bArr, 25, false);
        this.f29368b.add(G);
        return (int) G.f29379d;
    }

    public int j(byte[] bArr) {
        return i(null, bArr);
    }

    public void k(String str, boolean z4) {
        this.f29368b.add(b.g(u(str), z4));
    }

    public void l(boolean z4) {
        k(null, z4);
    }

    public void m(double d5) {
        o(null, d5);
    }

    public void n(float f4) {
        p(null, f4);
    }

    public void o(String str, double d5) {
        this.f29368b.add(b.k(u(str), d5));
    }

    public void p(String str, float f4) {
        this.f29368b.add(b.j(u(str), f4));
    }

    public void q(int i4) {
        s(null, i4);
    }

    public void r(long j4) {
        t(null, j4);
    }

    public void s(String str, int i4) {
        t(str, i4);
    }

    public void t(String str, long j4) {
        int u4 = u(str);
        if (-128 <= j4 && j4 <= 127) {
            this.f29368b.add(b.o(u4, (int) j4));
            return;
        }
        if (-32768 <= j4 && j4 <= 32767) {
            this.f29368b.add(b.l(u4, (int) j4));
        } else if (-2147483648L > j4 || j4 > 2147483647L) {
            this.f29368b.add(b.n(u4, j4));
        } else {
            this.f29368b.add(b.m(u4, (int) j4));
        }
    }

    public int v(String str) {
        return w(null, str);
    }

    public int w(String str, String str2) {
        int u4 = u(str);
        if ((this.f29371e & 2) == 0) {
            b K = K(u4, str2);
            this.f29368b.add(K);
            return (int) K.f29379d;
        }
        Integer num = this.f29370d.get(str2);
        if (num != null) {
            this.f29368b.add(b.f(u4, num.intValue(), 5, E(str2.length())));
            return num.intValue();
        }
        b K2 = K(u4, str2);
        this.f29370d.put(str2, Integer.valueOf((int) K2.f29379d));
        this.f29368b.add(K2);
        return (int) K2.f29379d;
    }

    public void x(int i4) {
        z(null, i4);
    }

    public void y(long j4) {
        z(null, j4);
    }

    public j() {
        this(256);
    }

    @Deprecated
    public j(ByteBuffer byteBuffer, int i4) {
        this(new androidx.emoji2.text.flatbuffer.a(byteBuffer.array()), i4);
    }

    public j(q qVar, int i4) {
        this.f29368b = new ArrayList<>();
        this.f29369c = new HashMap<>();
        this.f29370d = new HashMap<>();
        this.f29372f = false;
        this.f29373g = new a();
        this.f29367a = qVar;
        this.f29371e = i4;
    }

    /* compiled from: FlexBuffersBuilder.java */
    private static class b {

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ boolean f29375f = false;

        /* renamed from: a, reason: collision with root package name */
        final int f29376a;

        /* renamed from: b, reason: collision with root package name */
        final int f29377b;

        /* renamed from: c, reason: collision with root package name */
        final double f29378c;

        /* renamed from: d, reason: collision with root package name */
        long f29379d;

        /* renamed from: e, reason: collision with root package name */
        int f29380e;

        b(int i4, int i5, int i6, long j4) {
            this.f29380e = i4;
            this.f29376a = i5;
            this.f29377b = i6;
            this.f29379d = j4;
            this.f29378c = Double.MIN_VALUE;
        }

        static byte c(b bVar) {
            return bVar.s(0);
        }

        static b f(int i4, int i5, int i6, int i7) {
            return new b(i4, i6, i7, i5);
        }

        static b g(int i4, boolean z4) {
            return new b(i4, 26, 0, z4 ? 1L : 0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int h(int i4, int i5) {
            return i(this.f29376a, this.f29377b, this.f29379d, i4, i5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int i(int i4, int i5, long j4, int i6, int i7) {
            if (FlexBuffers.j(i4)) {
                return i5;
            }
            for (int i10 = 1; i10 <= 32; i10 *= 2) {
                int E = j.E((int) (((i7 * i10) + (q(i6, i10) + i6)) - j4));
                if ((1 << E) == i10) {
                    return E;
                }
            }
            return 3;
        }

        static b j(int i4, float f4) {
            return new b(i4, 3, 2, f4);
        }

        static b k(int i4, double d5) {
            return new b(i4, 3, 3, d5);
        }

        static b l(int i4, int i5) {
            return new b(i4, 1, 1, i5);
        }

        static b m(int i4, int i5) {
            return new b(i4, 1, 2, i5);
        }

        static b n(int i4, long j4) {
            return new b(i4, 1, 3, j4);
        }

        static b o(int i4, int i5) {
            return new b(i4, 1, 0, i5);
        }

        private static byte p(int i4, int i5) {
            return (byte) (i4 | (i5 << 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int q(int i4, int i5) {
            return ((~i4) + 1) & (i5 - 1);
        }

        private byte r() {
            return s(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte s(int i4) {
            return p(t(i4), this.f29376a);
        }

        private int t(int i4) {
            return FlexBuffers.j(this.f29376a) ? Math.max(this.f29377b, i4) : this.f29377b;
        }

        static b u(int i4, int i5) {
            return new b(i4, 2, 1, i5);
        }

        static b v(int i4, int i5) {
            return new b(i4, 2, 2, i5);
        }

        static b w(int i4, long j4) {
            return new b(i4, 2, 3, j4);
        }

        static b x(int i4, int i5) {
            return new b(i4, 2, 0, i5);
        }

        b(int i4, int i5, int i6, double d5) {
            this.f29380e = i4;
            this.f29376a = i5;
            this.f29377b = i6;
            this.f29378c = d5;
            this.f29379d = Long.MIN_VALUE;
        }
    }

    public j(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }
}
