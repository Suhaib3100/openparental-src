package org.minidns.dnsmessage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.minidns.edns.a;
import org.minidns.record.h;
import org.minidns.record.q;
import org.minidns.record.u;

/* compiled from: DnsMessage.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: x, reason: collision with root package name */
    private static final Logger f87165x = Logger.getLogger(a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final int f87166a;

    /* renamed from: b, reason: collision with root package name */
    public final c f87167b;

    /* renamed from: c, reason: collision with root package name */
    public final d f87168c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f87169d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f87170e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f87171f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f87172g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f87173h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f87174i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f87175j;

    /* renamed from: k, reason: collision with root package name */
    public final List<org.minidns.dnsmessage.b> f87176k;

    /* renamed from: l, reason: collision with root package name */
    public final List<u<? extends h>> f87177l;

    /* renamed from: m, reason: collision with root package name */
    public final List<u<? extends h>> f87178m;

    /* renamed from: n, reason: collision with root package name */
    public final List<u<? extends h>> f87179n;

    /* renamed from: o, reason: collision with root package name */
    public final int f87180o;

    /* renamed from: p, reason: collision with root package name */
    private org.minidns.edns.a f87181p;

    /* renamed from: q, reason: collision with root package name */
    public final long f87182q;

    /* renamed from: r, reason: collision with root package name */
    private byte[] f87183r;

    /* renamed from: s, reason: collision with root package name */
    private String f87184s;

    /* renamed from: t, reason: collision with root package name */
    private String f87185t;

    /* renamed from: u, reason: collision with root package name */
    private long f87186u;

    /* renamed from: v, reason: collision with root package name */
    private a f87187v;

    /* renamed from: w, reason: collision with root package name */
    private transient Integer f87188w;

    /* compiled from: DnsMessage.java */
    /* renamed from: org.minidns.dnsmessage.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1352a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f87189a;

        static {
            int[] iArr = new int[e.values().length];
            f87189a = iArr;
            try {
                iArr[e.answer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87189a[e.authority.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f87189a[e.additional.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: DnsMessage.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private int f87190a;

        /* renamed from: b, reason: collision with root package name */
        private c f87191b;

        /* renamed from: c, reason: collision with root package name */
        private d f87192c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f87193d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f87194e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f87195f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f87196g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f87197h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f87198i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f87199j;

        /* renamed from: k, reason: collision with root package name */
        private long f87200k;

        /* renamed from: l, reason: collision with root package name */
        private List<org.minidns.dnsmessage.b> f87201l;

        /* renamed from: m, reason: collision with root package name */
        private List<u<? extends h>> f87202m;

        /* renamed from: n, reason: collision with root package name */
        private List<u<? extends h>> f87203n;

        /* renamed from: o, reason: collision with root package name */
        private List<u<? extends h>> f87204o;

        /* renamed from: p, reason: collision with root package name */
        private a.b f87205p;

        /* synthetic */ b(C1352a c1352a) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void T(StringBuilder sb) {
            sb.append('(');
            sb.append(this.f87190a);
            sb.append(' ');
            sb.append(this.f87191b);
            sb.append(' ');
            sb.append(this.f87192c);
            sb.append(' ');
            if (this.f87193d) {
                sb.append("resp[qr=1]");
            } else {
                sb.append("query[qr=0]");
            }
            if (this.f87194e) {
                sb.append(" aa");
            }
            if (this.f87195f) {
                sb.append(" tr");
            }
            if (this.f87196g) {
                sb.append(" rd");
            }
            if (this.f87197h) {
                sb.append(" ra");
            }
            if (this.f87198i) {
                sb.append(" ad");
            }
            if (this.f87199j) {
                sb.append(" cd");
            }
            sb.append(")\n");
            List<org.minidns.dnsmessage.b> list = this.f87201l;
            if (list != null) {
                for (Object obj : list) {
                    sb.append("[Q: ");
                    sb.append(obj);
                    sb.append("]\n");
                }
            }
            List<u<? extends h>> list2 = this.f87202m;
            if (list2 != null) {
                for (Object obj2 : list2) {
                    sb.append("[A: ");
                    sb.append(obj2);
                    sb.append("]\n");
                }
            }
            List<u<? extends h>> list3 = this.f87203n;
            if (list3 != null) {
                for (Object obj3 : list3) {
                    sb.append("[N: ");
                    sb.append(obj3);
                    sb.append("]\n");
                }
            }
            List<u<? extends h>> list4 = this.f87204o;
            if (list4 != null) {
                for (u<? extends h> uVar : list4) {
                    sb.append("[X: ");
                    org.minidns.edns.a d5 = org.minidns.edns.a.d(uVar);
                    if (d5 != null) {
                        sb.append(d5.toString());
                    } else {
                        sb.append(uVar);
                    }
                    sb.append("]\n");
                }
            }
            if (sb.charAt(sb.length() - 1) == '\n') {
                sb.setLength(sb.length() - 1);
            }
        }

        public List<u<? extends h>> A() {
            List<u<? extends h>> list = this.f87202m;
            return list == null ? Collections.emptyList() : list;
        }

        public a.b B() {
            if (this.f87205p == null) {
                this.f87205p = org.minidns.edns.a.c();
            }
            return this.f87205p;
        }

        public b C(Collection<u<? extends h>> collection) {
            ArrayList arrayList = new ArrayList(collection.size());
            this.f87204o = arrayList;
            arrayList.addAll(collection);
            return this;
        }

        public b D(Collection<u<? extends h>> collection) {
            ArrayList arrayList = new ArrayList(collection.size());
            this.f87202m = arrayList;
            arrayList.addAll(collection);
            return this;
        }

        public b E(boolean z4) {
            this.f87198i = z4;
            return this;
        }

        public b F(boolean z4) {
            this.f87194e = z4;
            return this;
        }

        @Deprecated
        public b G(boolean z4) {
            this.f87199j = z4;
            return this;
        }

        public b H(boolean z4) {
            this.f87199j = z4;
            return this;
        }

        public b I(int i4) {
            this.f87190a = i4 & 65535;
            return this;
        }

        public b J(Collection<u<? extends h>> collection) {
            ArrayList arrayList = new ArrayList(collection.size());
            this.f87203n = arrayList;
            arrayList.addAll(collection);
            return this;
        }

        public b K(c cVar) {
            this.f87191b = cVar;
            return this;
        }

        public b L(boolean z4) {
            this.f87193d = z4;
            return this;
        }

        public b M(org.minidns.dnsmessage.b bVar) {
            ArrayList arrayList = new ArrayList(1);
            this.f87201l = arrayList;
            arrayList.add(bVar);
            return this;
        }

        public b N(List<org.minidns.dnsmessage.b> list) {
            this.f87201l = list;
            return this;
        }

        public b O(long j4) {
            this.f87200k = j4;
            return this;
        }

        public b P(boolean z4) {
            this.f87197h = z4;
            return this;
        }

        public b Q(boolean z4) {
            this.f87196g = z4;
            return this;
        }

        public b R(d dVar) {
            this.f87192c = dVar;
            return this;
        }

        public b S(boolean z4) {
            this.f87195f = z4;
            return this;
        }

        public b r(u<? extends h> uVar) {
            if (this.f87204o == null) {
                this.f87204o = new ArrayList();
            }
            this.f87204o.add(uVar);
            return this;
        }

        public b s(List<u<? extends h>> list) {
            if (this.f87204o == null) {
                this.f87204o = new ArrayList(list.size());
            }
            this.f87204o.addAll(list);
            return this;
        }

        public b t(u<? extends h> uVar) {
            if (this.f87202m == null) {
                this.f87202m = new ArrayList(1);
            }
            this.f87202m.add(uVar);
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Builder of DnsMessage");
            T(sb);
            return sb.toString();
        }

        public b u(Collection<u<? extends h>> collection) {
            if (this.f87202m == null) {
                this.f87202m = new ArrayList(collection.size());
            }
            this.f87202m.addAll(collection);
            return this;
        }

        public b v(u<? extends h> uVar) {
            if (this.f87203n == null) {
                this.f87203n = new ArrayList(8);
            }
            this.f87203n.add(uVar);
            return this;
        }

        public b w(org.minidns.dnsmessage.b bVar) {
            if (this.f87201l == null) {
                this.f87201l = new ArrayList(1);
            }
            this.f87201l.add(bVar);
            return this;
        }

        public a x() {
            return new a(this);
        }

        public void y(a aVar) {
            this.f87193d = aVar.f87169d;
            boolean z4 = aVar.f87174i;
            this.f87194e = z4;
            this.f87195f = aVar.f87171f;
            this.f87196g = aVar.f87172g;
            this.f87197h = aVar.f87173h;
            this.f87198i = z4;
            this.f87199j = aVar.f87175j;
        }

        public List<u<? extends h>> z() {
            List<u<? extends h>> list = this.f87204o;
            return list == null ? Collections.emptyList() : list;
        }

        /* synthetic */ b(a aVar, C1352a c1352a) {
            this(aVar);
        }

        private b() {
            this.f87191b = c.QUERY;
            this.f87192c = d.NO_ERROR;
            this.f87200k = -1L;
        }

        private b(a aVar) {
            this.f87191b = c.QUERY;
            this.f87192c = d.NO_ERROR;
            this.f87200k = -1L;
            this.f87190a = aVar.f87166a;
            this.f87191b = aVar.f87167b;
            this.f87192c = aVar.f87168c;
            this.f87193d = aVar.f87169d;
            this.f87194e = aVar.f87170e;
            this.f87195f = aVar.f87171f;
            this.f87196g = aVar.f87172g;
            this.f87197h = aVar.f87173h;
            this.f87198i = aVar.f87174i;
            this.f87199j = aVar.f87175j;
            this.f87200k = aVar.f87182q;
            ArrayList arrayList = new ArrayList(aVar.f87176k.size());
            this.f87201l = arrayList;
            arrayList.addAll(aVar.f87176k);
            ArrayList arrayList2 = new ArrayList(aVar.f87177l.size());
            this.f87202m = arrayList2;
            arrayList2.addAll(aVar.f87177l);
            ArrayList arrayList3 = new ArrayList(aVar.f87178m.size());
            this.f87203n = arrayList3;
            arrayList3.addAll(aVar.f87178m);
            ArrayList arrayList4 = new ArrayList(aVar.f87179n.size());
            this.f87204o = arrayList4;
            arrayList4.addAll(aVar.f87179n);
        }
    }

    /* compiled from: DnsMessage.java */
    public enum c {
        QUERY,
        INVERSE_QUERY,
        STATUS,
        UNASSIGNED3,
        NOTIFY,
        UPDATE;

        private static final c[] INVERSE_LUT = new c[values().length];
        private final byte value = (byte) ordinal();

        static {
            for (c cVar : values()) {
                c[] cVarArr = INVERSE_LUT;
                if (cVarArr[cVar.getValue()] != null) {
                    throw new IllegalStateException();
                }
                cVarArr[cVar.getValue()] = cVar;
            }
        }

        c() {
        }

        public static c getOpcode(int i4) throws IllegalArgumentException {
            if (i4 < 0 || i4 > 15) {
                throw new IllegalArgumentException();
            }
            c[] cVarArr = INVERSE_LUT;
            if (i4 >= cVarArr.length) {
                return null;
            }
            return cVarArr[i4];
        }

        public byte getValue() {
            return this.value;
        }
    }

    /* compiled from: DnsMessage.java */
    public enum d {
        NO_ERROR(0),
        FORMAT_ERR(1),
        SERVER_FAIL(2),
        NX_DOMAIN(3),
        NO_IMP(4),
        REFUSED(5),
        YXDOMAIN(6),
        YXRRSET(7),
        NXRRSET(8),
        NOT_AUTH(9),
        NOT_ZONE(10),
        BADVERS_BADSIG(16),
        BADKEY(17),
        BADTIME(18),
        BADMODE(19),
        BADNAME(20),
        BADALG(21),
        BADTRUNC(22),
        BADCOOKIE(23);

        private static final Map<Integer, d> INVERSE_LUT = new HashMap(values().length);
        private final byte value;

        static {
            for (d dVar : values()) {
                INVERSE_LUT.put(Integer.valueOf(dVar.value), dVar);
            }
        }

        d(int i4) {
            this.value = (byte) i4;
        }

        public static d getResponseCode(int i4) throws IllegalArgumentException {
            if (i4 < 0 || i4 > 65535) {
                throw new IllegalArgumentException();
            }
            return INVERSE_LUT.get(Integer.valueOf(i4));
        }

        public byte getValue() {
            return this.value;
        }
    }

    /* compiled from: DnsMessage.java */
    private enum e {
        answer,
        authority,
        additional
    }

    protected a(b bVar) {
        this.f87186u = -1L;
        this.f87166a = bVar.f87190a;
        this.f87167b = bVar.f87191b;
        this.f87168c = bVar.f87192c;
        this.f87182q = bVar.f87200k;
        this.f87169d = bVar.f87193d;
        this.f87170e = bVar.f87194e;
        this.f87171f = bVar.f87195f;
        this.f87172g = bVar.f87196g;
        this.f87173h = bVar.f87197h;
        this.f87174i = bVar.f87198i;
        this.f87175j = bVar.f87199j;
        if (bVar.f87201l == null) {
            this.f87176k = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(bVar.f87201l.size());
            arrayList.addAll(bVar.f87201l);
            this.f87176k = Collections.unmodifiableList(arrayList);
        }
        if (bVar.f87202m == null) {
            this.f87177l = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(bVar.f87202m.size());
            arrayList2.addAll(bVar.f87202m);
            this.f87177l = Collections.unmodifiableList(arrayList2);
        }
        if (bVar.f87203n == null) {
            this.f87178m = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(bVar.f87203n.size());
            arrayList3.addAll(bVar.f87203n);
            this.f87178m = Collections.unmodifiableList(arrayList3);
        }
        if (bVar.f87204o == null && bVar.f87205p == null) {
            this.f87179n = Collections.emptyList();
        } else {
            int size = bVar.f87204o != null ? bVar.f87204o.size() : 0;
            ArrayList arrayList4 = new ArrayList(bVar.f87205p != null ? size + 1 : size);
            if (bVar.f87204o != null) {
                arrayList4.addAll(bVar.f87204o);
            }
            if (bVar.f87205p != null) {
                a.b bVar2 = bVar.f87205p;
                bVar2.getClass();
                org.minidns.edns.a aVar = new org.minidns.edns.a(bVar2);
                this.f87181p = aVar;
                arrayList4.add(aVar.a());
            }
            this.f87179n = Collections.unmodifiableList(arrayList4);
        }
        int x4 = x(this.f87179n);
        this.f87180o = x4;
        if (x4 != -1) {
            do {
                x4++;
                if (x4 >= this.f87179n.size()) {
                    return;
                }
            } while (this.f87179n.get(x4).f87494b != u.c.OPT);
            throw new IllegalArgumentException("There must be only one OPT pseudo RR in the additional section");
        }
    }

    private byte[] B() {
        byte[] bArr = this.f87183r;
        if (bArr != null) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        int f4 = f();
        try {
            dataOutputStream.writeShort((short) this.f87166a);
            dataOutputStream.writeShort((short) f4);
            List<org.minidns.dnsmessage.b> list = this.f87176k;
            if (list == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort((short) list.size());
            }
            List<u<? extends h>> list2 = this.f87177l;
            if (list2 == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort((short) list2.size());
            }
            List<u<? extends h>> list3 = this.f87178m;
            if (list3 == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort((short) list3.size());
            }
            List<u<? extends h>> list4 = this.f87179n;
            if (list4 == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort((short) list4.size());
            }
            List<org.minidns.dnsmessage.b> list5 = this.f87176k;
            if (list5 != null) {
                Iterator<org.minidns.dnsmessage.b> it = list5.iterator();
                while (it.hasNext()) {
                    dataOutputStream.write(it.next().c());
                }
            }
            List<u<? extends h>> list6 = this.f87177l;
            if (list6 != null) {
                Iterator<u<? extends h>> it2 = list6.iterator();
                while (it2.hasNext()) {
                    dataOutputStream.write(it2.next().l());
                }
            }
            List<u<? extends h>> list7 = this.f87178m;
            if (list7 != null) {
                Iterator<u<? extends h>> it3 = list7.iterator();
                while (it3.hasNext()) {
                    dataOutputStream.write(it3.next().l());
                }
            }
            List<u<? extends h>> list8 = this.f87179n;
            if (list8 != null) {
                Iterator<u<? extends h>> it4 = list8.iterator();
                while (it4.hasNext()) {
                    dataOutputStream.write(it4.next().l());
                }
            }
            dataOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            this.f87183r = byteArray;
            return byteArray;
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public static b e() {
        return new b((C1352a) null);
    }

    private <D extends h> List<u<D>> m(e eVar, Class<D> cls) {
        return n(false, eVar, cls);
    }

    private <D extends h> List<u<D>> n(boolean z4, e eVar, Class<D> cls) {
        List<u<? extends h>> list;
        int i4 = C1352a.f87189a[eVar.ordinal()];
        if (i4 == 1) {
            list = this.f87177l;
        } else if (i4 == 2) {
            list = this.f87178m;
        } else {
            if (i4 != 3) {
                throw new AssertionError("Unknown section name " + eVar);
            }
            list = this.f87179n;
        }
        ArrayList arrayList = new ArrayList(z4 ? 1 : list.size());
        Iterator<u<? extends h>> it = list.iterator();
        while (it.hasNext()) {
            Object h4 = it.next().h(cls);
            if (h4 != null) {
                arrayList.add(h4);
                if (z4) {
                    break;
                }
            }
        }
        return arrayList;
    }

    private <D extends h> u<D> r(e eVar, Class<D> cls) {
        List<u<D>> n4 = n(true, eVar, cls);
        if (n4.isEmpty()) {
            return null;
        }
        return n4.get(0);
    }

    private static int x(List<u<? extends h>> list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (list.get(i4).f87494b == u.c.OPT) {
                return i4;
            }
        }
        return -1;
    }

    public boolean A() {
        org.minidns.edns.a q4 = q();
        if (q4 == null) {
            return false;
        }
        return q4.f87319f;
    }

    public byte[] C() {
        return (byte[]) B().clone();
    }

    public void D(OutputStream outputStream) throws IOException {
        E(outputStream, true);
    }

    public void E(OutputStream outputStream, boolean z4) throws IOException {
        byte[] B = B();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        if (z4) {
            dataOutputStream.writeShort(B.length);
        }
        dataOutputStream.write(B);
    }

    public b a() {
        return new b(this, null);
    }

    public DatagramPacket b(InetAddress inetAddress, int i4) {
        byte[] B = B();
        return new DatagramPacket(B, B.length, inetAddress, i4);
    }

    public a c() {
        if (this.f87187v == null) {
            this.f87187v = new a(this);
        }
        return this.f87187v;
    }

    public String d() {
        String str = this.f87185t;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(";; ->>HEADER<<- opcode: ");
        sb.append(this.f87167b);
        sb.append(", status: ");
        sb.append(this.f87168c);
        sb.append(", id: ");
        sb.append(this.f87166a);
        sb.append("\n;; flags:");
        if (!this.f87169d) {
            sb.append(" qr");
        }
        if (this.f87170e) {
            sb.append(" aa");
        }
        if (this.f87171f) {
            sb.append(" tr");
        }
        if (this.f87172g) {
            sb.append(" rd");
        }
        if (this.f87173h) {
            sb.append(" ra");
        }
        if (this.f87174i) {
            sb.append(" ad");
        }
        if (this.f87175j) {
            sb.append(" cd");
        }
        sb.append("; QUERY: ");
        sb.append(this.f87176k.size());
        sb.append(", ANSWER: ");
        sb.append(this.f87177l.size());
        sb.append(", AUTHORITY: ");
        sb.append(this.f87178m.size());
        sb.append(", ADDITIONAL: ");
        sb.append(this.f87179n.size());
        sb.append("\n\n");
        Iterator<u<? extends h>> it = this.f87179n.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            org.minidns.edns.a d5 = org.minidns.edns.a.d(it.next());
            if (d5 != null) {
                sb.append(";; OPT PSEUDOSECTION:\n; ");
                sb.append(d5.b());
                break;
            }
        }
        if (this.f87176k.size() != 0) {
            sb.append(";; QUESTION SECTION:\n");
            for (org.minidns.dnsmessage.b bVar : this.f87176k) {
                sb.append(';');
                sb.append(bVar.toString());
                sb.append('\n');
            }
        }
        if (this.f87178m.size() != 0) {
            sb.append("\n;; AUTHORITY SECTION:\n");
            Iterator<u<? extends h>> it2 = this.f87178m.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next().toString());
                sb.append('\n');
            }
        }
        if (this.f87177l.size() != 0) {
            sb.append("\n;; ANSWER SECTION:\n");
            Iterator<u<? extends h>> it3 = this.f87177l.iterator();
            while (it3.hasNext()) {
                sb.append(it3.next().toString());
                sb.append('\n');
            }
        }
        if (this.f87179n.size() != 0) {
            boolean z4 = false;
            for (u<? extends h> uVar : this.f87179n) {
                if (uVar.f87494b != u.c.OPT) {
                    if (!z4) {
                        sb.append("\n;; ADDITIONAL SECTION:\n");
                        z4 = true;
                    }
                    sb.append(uVar.toString());
                    sb.append('\n');
                }
            }
        }
        if (this.f87182q > 0) {
            sb.append("\n;; WHEN: ");
            sb.append(new Date(this.f87182q).toString());
        }
        String sb2 = sb.toString();
        this.f87185t = sb2;
        return sb2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return Arrays.equals(B(), ((a) obj).B());
    }

    int f() {
        int i4 = this.f87169d ? 32768 : 0;
        c cVar = this.f87167b;
        if (cVar != null) {
            i4 += cVar.getValue() << 11;
        }
        if (this.f87170e) {
            i4 += 1024;
        }
        if (this.f87171f) {
            i4 += 512;
        }
        if (this.f87172g) {
            i4 += 256;
        }
        if (this.f87173h) {
            i4 += 128;
        }
        if (this.f87174i) {
            i4 += 32;
        }
        if (this.f87175j) {
            i4 += 16;
        }
        d dVar = this.f87168c;
        return dVar != null ? i4 + dVar.getValue() : i4;
    }

    public List<u<? extends h>> g() {
        ArrayList arrayList = new ArrayList(this.f87177l.size());
        arrayList.addAll(this.f87177l);
        return arrayList;
    }

    public List<u<? extends h>> h() {
        ArrayList arrayList = new ArrayList(this.f87178m.size());
        arrayList.addAll(this.f87178m);
        return arrayList;
    }

    public int hashCode() {
        if (this.f87188w == null) {
            this.f87188w = Integer.valueOf(Arrays.hashCode(B()));
        }
        return this.f87188w.intValue();
    }

    public List<org.minidns.dnsmessage.b> i() {
        ArrayList arrayList = new ArrayList(this.f87176k.size());
        arrayList.addAll(this.f87176k);
        return arrayList;
    }

    public <D extends h> List<u<D>> j(Class<D> cls) {
        return n(false, e.additional, cls);
    }

    public <D extends h> List<u<D>> k(Class<D> cls) {
        return n(false, e.answer, cls);
    }

    public <D extends h> List<u<D>> l(Class<D> cls) {
        return n(false, e.authority, cls);
    }

    public <D extends h> Set<D> o(org.minidns.dnsmessage.b bVar) {
        if (this.f87168c != d.NO_ERROR) {
            return null;
        }
        HashSet hashSet = new HashSet(this.f87177l.size());
        for (u<? extends h> uVar : this.f87177l) {
            if (uVar.i(bVar) && !hashSet.add(uVar.f87498f)) {
                f87165x.log(Level.WARNING, "DnsMessage contains duplicate answers. Record: " + uVar + "; DnsMessage: " + this);
            }
        }
        return hashSet;
    }

    public long p() {
        long j4 = this.f87186u;
        if (j4 >= 0) {
            return j4;
        }
        this.f87186u = Long.MAX_VALUE;
        Iterator<u<? extends h>> it = this.f87177l.iterator();
        while (it.hasNext()) {
            this.f87186u = Math.min(this.f87186u, it.next().f87497e);
        }
        return this.f87186u;
    }

    public org.minidns.edns.a q() {
        org.minidns.edns.a aVar = this.f87181p;
        if (aVar != null) {
            return aVar;
        }
        u<q> w4 = w();
        if (w4 == null) {
            return null;
        }
        org.minidns.edns.a aVar2 = new org.minidns.edns.a(w4);
        this.f87181p = aVar2;
        return aVar2;
    }

    public <D extends h> u<D> s(Class<D> cls) {
        return r(e.additional, cls);
    }

    public <D extends h> u<D> t(Class<D> cls) {
        return r(e.answer, cls);
    }

    public String toString() {
        String str = this.f87184s;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder("DnsMessage");
        a().T(sb);
        String sb2 = sb.toString();
        this.f87184s = sb2;
        return sb2;
    }

    public <D extends h> u<D> u(Class<D> cls) {
        return r(e.authority, cls);
    }

    public ByteBuffer v() {
        return ByteBuffer.wrap((byte[]) B().clone());
    }

    public u<q> w() {
        int i4 = this.f87180o;
        if (i4 == -1) {
            return null;
        }
        return (u) this.f87179n.get(i4);
    }

    public org.minidns.dnsmessage.b y() {
        return this.f87176k.get(0);
    }

    public b z(d dVar) {
        if (this.f87169d) {
            throw new IllegalStateException();
        }
        return e().L(true).R(dVar).I(this.f87166a).M(y());
    }

    public a(byte[] bArr) throws IOException {
        this.f87186u = -1L;
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f87166a = dataInputStream.readUnsignedShort();
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        this.f87169d = ((readUnsignedShort >> 15) & 1) == 1;
        this.f87167b = c.getOpcode((readUnsignedShort >> 11) & 15);
        this.f87170e = ((readUnsignedShort >> 10) & 1) == 1;
        this.f87171f = ((readUnsignedShort >> 9) & 1) == 1;
        this.f87172g = ((readUnsignedShort >> 8) & 1) == 1;
        this.f87173h = ((readUnsignedShort >> 7) & 1) == 1;
        this.f87174i = ((readUnsignedShort >> 5) & 1) == 1;
        this.f87175j = ((readUnsignedShort >> 4) & 1) == 1;
        this.f87168c = d.getResponseCode(readUnsignedShort & 15);
        this.f87182q = System.currentTimeMillis();
        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
        int readUnsignedShort3 = dataInputStream.readUnsignedShort();
        int readUnsignedShort4 = dataInputStream.readUnsignedShort();
        int readUnsignedShort5 = dataInputStream.readUnsignedShort();
        this.f87176k = new ArrayList(readUnsignedShort2);
        for (int i4 = 0; i4 < readUnsignedShort2; i4++) {
            this.f87176k.add(new org.minidns.dnsmessage.b(dataInputStream, bArr));
        }
        this.f87177l = new ArrayList(readUnsignedShort3);
        for (int i5 = 0; i5 < readUnsignedShort3; i5++) {
            this.f87177l.add(u.k(dataInputStream, bArr));
        }
        this.f87178m = new ArrayList(readUnsignedShort4);
        for (int i6 = 0; i6 < readUnsignedShort4; i6++) {
            this.f87178m.add(u.k(dataInputStream, bArr));
        }
        this.f87179n = new ArrayList(readUnsignedShort5);
        for (int i7 = 0; i7 < readUnsignedShort5; i7++) {
            this.f87179n.add(u.k(dataInputStream, bArr));
        }
        this.f87180o = x(this.f87179n);
    }

    private a(a aVar) {
        this.f87186u = -1L;
        this.f87166a = 0;
        this.f87169d = aVar.f87169d;
        this.f87167b = aVar.f87167b;
        this.f87170e = aVar.f87170e;
        this.f87171f = aVar.f87171f;
        this.f87172g = aVar.f87172g;
        this.f87173h = aVar.f87173h;
        this.f87174i = aVar.f87174i;
        this.f87175j = aVar.f87175j;
        this.f87168c = aVar.f87168c;
        this.f87182q = aVar.f87182q;
        this.f87176k = aVar.f87176k;
        this.f87177l = aVar.f87177l;
        this.f87178m = aVar.f87178m;
        this.f87179n = aVar.f87179n;
        this.f87180o = aVar.f87180o;
    }
}
