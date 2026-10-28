package org.minidns.record;

import androidx.compose.ui.layout.a0;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.minidns.dnsmessage.a;
import org.minidns.record.h;

/* compiled from: Record.java */
/* loaded from: classes9.dex */
public final class u<D extends h> {

    /* renamed from: a, reason: collision with root package name */
    public final org.minidns.dnsname.a f87493a;

    /* renamed from: b, reason: collision with root package name */
    public final c f87494b;

    /* renamed from: c, reason: collision with root package name */
    public final b f87495c;

    /* renamed from: d, reason: collision with root package name */
    public final int f87496d;

    /* renamed from: e, reason: collision with root package name */
    public final long f87497e;

    /* renamed from: f, reason: collision with root package name */
    public final D f87498f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f87499g;

    /* renamed from: h, reason: collision with root package name */
    private transient byte[] f87500h;

    /* renamed from: i, reason: collision with root package name */
    private transient Integer f87501i;

    /* compiled from: Record.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f87502a;

        static {
            int[] iArr = new int[c.values().length];
            f87502a = iArr;
            try {
                iArr[c.SOA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87502a[c.SRV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f87502a[c.MX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f87502a[c.AAAA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f87502a[c.A.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f87502a[c.NS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f87502a[c.CNAME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f87502a[c.DNAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f87502a[c.PTR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f87502a[c.TXT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f87502a[c.OPT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f87502a[c.DNSKEY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f87502a[c.RRSIG.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f87502a[c.DS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f87502a[c.NSEC.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f87502a[c.NSEC3.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f87502a[c.NSEC3PARAM.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f87502a[c.TLSA.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f87502a[c.OPENPGPKEY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f87502a[c.DLV.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f87502a[c.UNKNOWN.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    /* compiled from: Record.java */
    public enum b {
        IN(1),
        CH(3),
        HS(4),
        NONE(254),
        ANY(255);

        private static final HashMap<Integer, b> INVERSE_LUT = new HashMap<>();
        private final int value;

        static {
            for (b bVar : values()) {
                INVERSE_LUT.put(Integer.valueOf(bVar.getValue()), bVar);
            }
        }

        b(int i4) {
            this.value = i4;
        }

        public static b getClass(int i4) {
            return INVERSE_LUT.get(Integer.valueOf(i4));
        }

        public int getValue() {
            return this.value;
        }
    }

    /* compiled from: Record.java */
    public enum c {
        UNKNOWN(-1),
        A(1, org.minidns.record.a.class),
        NS(2, l.class),
        MD(3),
        MF(4),
        CNAME(5, org.minidns.record.c.class),
        SOA(6, v.class),
        MB(7),
        MG(8),
        MR(9),
        NULL(10),
        WKS(11),
        PTR(12, r.class),
        HINFO(13),
        MINFO(14),
        MX(15, k.class),
        TXT(16, y.class),
        RP(17),
        AFSDB(18),
        X25(19),
        ISDN(20),
        RT(21),
        NSAP(22),
        NSAP_PTR(23),
        SIG(24),
        KEY(25),
        PX(26),
        GPOS(27),
        AAAA(28, org.minidns.record.b.class),
        LOC(29),
        NXT(30),
        EID(31),
        NIMLOC(32),
        SRV(33, w.class),
        ATMA(34),
        NAPTR(35),
        KX(36),
        CERT(37),
        A6(38),
        DNAME(39, e.class),
        SINK(40),
        OPT(41, q.class),
        APL(42),
        DS(43, g.class),
        SSHFP(44),
        IPSECKEY(45),
        RRSIG(46, s.class),
        NSEC(47, o.class),
        DNSKEY(48, f.class),
        DHCID(49),
        NSEC3(50, m.class),
        NSEC3PARAM(51, n.class),
        TLSA(52, x.class),
        HIP(55),
        NINFO(56),
        RKEY(57),
        TALINK(58),
        CDS(59),
        CDNSKEY(60),
        OPENPGPKEY(61, p.class),
        CSYNC(62),
        SPF(99),
        UINFO(100),
        UID(101),
        GID(102),
        UNSPEC(103),
        NID(104),
        L32(105),
        L64(106),
        LP(107),
        EUI48(108),
        EUI64(109),
        TKEY(249),
        TSIG(250),
        IXFR(251),
        AXFR(252),
        MAILB(253),
        MAILA(254),
        ANY(255),
        URI(256),
        CAA(257),
        TA(32768),
        DLV(32769, d.class);

        private final Class<?> dataClass;
        private final int value;
        private static final Map<Integer, c> INVERSE_LUT = new HashMap();
        private static final Map<Class<?>, c> DATA_LUT = new HashMap();

        static {
            for (c cVar : values()) {
                INVERSE_LUT.put(Integer.valueOf(cVar.getValue()), cVar);
                Class<?> cls = cVar.dataClass;
                if (cls != null) {
                    DATA_LUT.put(cls, cVar);
                }
            }
        }

        c(int i4) {
            this(i4, null);
        }

        public static c getType(int i4) {
            c cVar = INVERSE_LUT.get(Integer.valueOf(i4));
            return cVar == null ? UNKNOWN : cVar;
        }

        public <D extends h> Class<D> getDataClass() {
            return (Class<D>) this.dataClass;
        }

        public int getValue() {
            return this.value;
        }

        c(int i4, Class cls) {
            this.value = i4;
            this.dataClass = cls;
        }

        public static <D extends h> c getType(Class<D> cls) {
            return DATA_LUT.get(cls);
        }
    }

    public u(org.minidns.dnsname.a aVar, c cVar, b bVar, long j4, D d5, boolean z4) {
        this(aVar, cVar, bVar, bVar.getValue() + (z4 ? 32768 : 0), j4, d5, z4);
    }

    public static <E extends h> List<u<E>> b(Class<E> cls, Collection<u<? extends h>> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        c(arrayList, cls, collection);
        return arrayList;
    }

    public static <E extends h> void c(Collection<u<E>> collection, Class<E> cls, Collection<u<? extends h>> collection2) {
        Iterator<u<? extends h>> it = collection2.iterator();
        while (it.hasNext()) {
            u<E> h4 = it.next().h(cls);
            if (h4 != null) {
                collection.add(h4);
            }
        }
    }

    public static u<h> k(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        h h4;
        org.minidns.dnsname.a E = org.minidns.dnsname.a.E(dataInputStream, bArr);
        c type = c.getType(dataInputStream.readUnsignedShort());
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        b bVar = b.getClass(readUnsignedShort & a0.f18904a);
        boolean z4 = (32768 & readUnsignedShort) > 0;
        long readUnsignedShort2 = (dataInputStream.readUnsignedShort() << 16) + dataInputStream.readUnsignedShort();
        int readUnsignedShort3 = dataInputStream.readUnsignedShort();
        switch (a.f87502a[type.ordinal()]) {
            case 1:
                h4 = v.h(dataInputStream, bArr);
                break;
            case 2:
                h4 = w.j(dataInputStream, bArr);
                break;
            case 3:
                h4 = k.h(dataInputStream, bArr);
                break;
            case 4:
                h4 = org.minidns.record.b.k(dataInputStream);
                break;
            case 5:
                h4 = org.minidns.record.a.k(dataInputStream);
                break;
            case 6:
                h4 = l.i(dataInputStream, bArr);
                break;
            case 7:
                h4 = org.minidns.record.c.i(dataInputStream, bArr);
                break;
            case 8:
                h4 = e.i(dataInputStream, bArr);
                break;
            case 9:
                h4 = r.i(dataInputStream, bArr);
                break;
            case 10:
                h4 = y.l(dataInputStream, readUnsignedShort3);
                break;
            case 11:
                h4 = q.h(dataInputStream, readUnsignedShort3);
                break;
            case 12:
                h4 = f.p(dataInputStream, readUnsignedShort3);
                break;
            case 13:
                h4 = s.l(dataInputStream, bArr, readUnsignedShort3);
                break;
            case 14:
                h4 = g.l(dataInputStream, readUnsignedShort3);
                break;
            case 15:
                h4 = o.i(dataInputStream, bArr, readUnsignedShort3);
                break;
            case 16:
                h4 = m.o(dataInputStream, readUnsignedShort3);
                break;
            case 17:
                h4 = n.i(dataInputStream);
                break;
            case 18:
                h4 = x.m(dataInputStream, readUnsignedShort3);
                break;
            case 19:
                h4 = p.j(dataInputStream, readUnsignedShort3);
                break;
            case 20:
                h4 = d.l(dataInputStream, readUnsignedShort3);
                break;
            default:
                h4 = z.h(dataInputStream, readUnsignedShort3, type);
                break;
        }
        return new u<>(E, type, bVar, readUnsignedShort, readUnsignedShort2, h4, z4);
    }

    public <E extends h> u<E> a(Class<E> cls) {
        u<E> h4 = h(cls);
        if (h4 != null) {
            return h4;
        }
        throw new IllegalArgumentException("The instance " + this + " can not be cast to a Record with" + cls);
    }

    public D d() {
        return this.f87498f;
    }

    public org.minidns.dnsmessage.b e() {
        int i4 = a.f87502a[this.f87494b.ordinal()];
        if (i4 == 11) {
            return null;
        }
        if (i4 != 13) {
            return new org.minidns.dnsmessage.b(this.f87493a, this.f87494b, this.f87495c, false);
        }
        return new org.minidns.dnsmessage.b(this.f87493a, ((s) this.f87498f).f87480d, this.f87495c, false);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        u uVar = (u) obj;
        return this.f87493a.equals(uVar.f87493a) && this.f87494b == uVar.f87494b && this.f87495c == uVar.f87495c && this.f87498f.equals(uVar.f87498f);
    }

    public a.b f() {
        org.minidns.dnsmessage.b e4 = e();
        if (e4 == null) {
            return null;
        }
        return e4.a();
    }

    public long g() {
        return this.f87497e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E extends h> u<E> h(Class<E> cls) {
        if (this.f87494b.dataClass == cls) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        if (this.f87501i == null) {
            this.f87501i = Integer.valueOf(this.f87498f.hashCode() + ((this.f87495c.hashCode() + ((this.f87494b.hashCode() + ((this.f87493a.hashCode() + 37) * 37)) * 37)) * 37));
        }
        return this.f87501i.intValue();
    }

    public boolean i(org.minidns.dnsmessage.b bVar) {
        b bVar2;
        c cVar = bVar.f87208b;
        return (cVar == this.f87494b || cVar == c.ANY) && ((bVar2 = bVar.f87209c) == this.f87495c || bVar2 == b.ANY) && bVar.f87207a.equals(this.f87493a);
    }

    public boolean j() {
        return this.f87499g;
    }

    public byte[] l() {
        if (this.f87500h == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(this.f87498f.b() + this.f87493a.M() + 10);
            try {
                m(new DataOutputStream(byteArrayOutputStream));
                this.f87500h = byteArrayOutputStream.toByteArray();
            } catch (IOException e4) {
                throw new AssertionError(e4);
            }
        }
        return (byte[]) this.f87500h.clone();
    }

    public void m(OutputStream outputStream) throws IOException {
        if (this.f87498f == null) {
            throw new IllegalStateException("Empty Record has no byte representation");
        }
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        this.f87493a.R(dataOutputStream);
        dataOutputStream.writeShort(this.f87494b.getValue());
        dataOutputStream.writeShort(this.f87496d);
        dataOutputStream.writeInt((int) this.f87497e);
        dataOutputStream.writeShort(this.f87498f.b());
        this.f87498f.f(dataOutputStream);
    }

    public String toString() {
        return this.f87493a.w() + ".\t" + this.f87497e + '\t' + this.f87495c + '\t' + this.f87494b + '\t' + this.f87498f;
    }

    public u(String str, c cVar, b bVar, long j4, D d5, boolean z4) {
        this(org.minidns.dnsname.a.h(str), cVar, bVar, j4, d5, z4);
    }

    public u(String str, c cVar, int i4, long j4, D d5) {
        this(org.minidns.dnsname.a.h(str), cVar, b.NONE, i4, j4, d5, false);
    }

    public u(org.minidns.dnsname.a aVar, c cVar, int i4, long j4, D d5) {
        this(aVar, cVar, b.NONE, i4, j4, d5, false);
    }

    private u(org.minidns.dnsname.a aVar, c cVar, b bVar, int i4, long j4, D d5, boolean z4) {
        this.f87493a = aVar;
        this.f87494b = cVar;
        this.f87495c = bVar;
        this.f87496d = i4;
        this.f87497e = j4;
        this.f87498f = d5;
        this.f87499g = z4;
    }
}
