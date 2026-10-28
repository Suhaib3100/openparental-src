package org.minidns.source;

import androidx.compose.foundation.layout.f3;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: NetworkDataSourceWithAccounting.java */
/* loaded from: classes9.dex */
public class d extends c {

    /* renamed from: g, reason: collision with root package name */
    private final AtomicInteger f87537g = new AtomicInteger();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicInteger f87538h = new AtomicInteger();

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f87539i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    private final AtomicInteger f87540j = new AtomicInteger();

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f87541k = new AtomicInteger();

    /* renamed from: l, reason: collision with root package name */
    private final AtomicInteger f87542l = new AtomicInteger();

    /* renamed from: m, reason: collision with root package name */
    private final AtomicInteger f87543m = new AtomicInteger();

    /* renamed from: n, reason: collision with root package name */
    private final AtomicInteger f87544n = new AtomicInteger();

    /* renamed from: o, reason: collision with root package name */
    private final AtomicInteger f87545o = new AtomicInteger();

    /* compiled from: NetworkDataSourceWithAccounting.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f87546a;

        /* renamed from: b, reason: collision with root package name */
        public final int f87547b;

        /* renamed from: c, reason: collision with root package name */
        public final int f87548c;

        /* renamed from: d, reason: collision with root package name */
        public final int f87549d;

        /* renamed from: e, reason: collision with root package name */
        public final int f87550e;

        /* renamed from: f, reason: collision with root package name */
        public final int f87551f;

        /* renamed from: g, reason: collision with root package name */
        public final int f87552g;

        /* renamed from: h, reason: collision with root package name */
        public final int f87553h;

        /* renamed from: i, reason: collision with root package name */
        public final int f87554i;

        /* renamed from: j, reason: collision with root package name */
        public final int f87555j;

        /* renamed from: k, reason: collision with root package name */
        public final int f87556k;

        /* renamed from: l, reason: collision with root package name */
        public final int f87557l;

        /* renamed from: m, reason: collision with root package name */
        private String f87558m;

        private static String a(int i4) {
            return String.format(Locale.US, "%,09d", Integer.valueOf(i4));
        }

        public String toString() {
            String str = this.f87558m;
            if (str != null) {
                return str;
            }
            StringBuilder sb = new StringBuilder("Stats\t# Successful\t# Failed\tResp. Size\tAvg. Resp. Size\nTotal\t");
            sb.append(a(this.f87546a));
            sb.append('\t');
            sb.append(a(this.f87549d));
            sb.append('\t');
            sb.append(a(this.f87547b));
            sb.append('\t');
            sb.append(a(this.f87548c));
            sb.append("\nUDP\t");
            sb.append(a(this.f87550e));
            sb.append('\t');
            sb.append(a(this.f87553h));
            sb.append('\t');
            sb.append(a(this.f87551f));
            sb.append('\t');
            sb.append(a(this.f87552g));
            sb.append("\nTCP\t");
            sb.append(a(this.f87554i));
            sb.append('\t');
            sb.append(a(this.f87557l));
            sb.append('\t');
            sb.append(a(this.f87555j));
            sb.append('\t');
            String a5 = f3.a(sb, a(this.f87556k), '\n');
            this.f87558m = a5;
            return a5;
        }

        private b(d dVar) {
            int i4 = dVar.f87537g.get();
            this.f87546a = i4;
            int i5 = dVar.f87538h.get();
            this.f87547b = i5;
            this.f87549d = dVar.f87539i.get();
            int i6 = dVar.f87540j.get();
            this.f87550e = i6;
            int i7 = dVar.f87541k.get();
            this.f87551f = i7;
            this.f87553h = dVar.f87542l.get();
            int i10 = dVar.f87543m.get();
            this.f87554i = i10;
            int i11 = dVar.f87544n.get();
            this.f87555j = i11;
            this.f87557l = dVar.f87545o.get();
            this.f87548c = i4 > 0 ? i5 / i4 : 0;
            this.f87552g = i6 > 0 ? i7 / i6 : 0;
            this.f87556k = i10 > 0 ? i11 / i10 : 0;
        }
    }

    public static d x(org.minidns.a aVar) {
        org.minidns.source.b j4 = aVar.j();
        if (j4 instanceof d) {
            return (d) j4;
        }
        return null;
    }

    @Override // org.minidns.source.c, org.minidns.source.a, org.minidns.source.b
    /* renamed from: l */
    public org.minidns.dnsqueryresult.d a(org.minidns.dnsmessage.a aVar, InetAddress inetAddress, int i4) throws IOException {
        try {
            org.minidns.dnsqueryresult.d a5 = super.a(aVar, inetAddress, i4);
            this.f87537g.incrementAndGet();
            this.f87538h.addAndGet(a5.f87242c.C().length);
            return a5;
        } catch (IOException e4) {
            this.f87539i.incrementAndGet();
            throw e4;
        }
    }

    @Override // org.minidns.source.c
    protected org.minidns.dnsmessage.a m(org.minidns.dnsmessage.a aVar, InetAddress inetAddress, int i4) throws IOException {
        try {
            org.minidns.dnsmessage.a m4 = super.m(aVar, inetAddress, i4);
            this.f87543m.incrementAndGet();
            this.f87544n.addAndGet(m4.C().length);
            return m4;
        } catch (IOException e4) {
            this.f87545o.incrementAndGet();
            throw e4;
        }
    }

    @Override // org.minidns.source.c
    protected org.minidns.dnsmessage.a n(org.minidns.dnsmessage.a aVar, InetAddress inetAddress, int i4) throws IOException {
        try {
            org.minidns.dnsmessage.a n4 = super.n(aVar, inetAddress, i4);
            this.f87540j.incrementAndGet();
            this.f87541k.addAndGet(n4.C().length);
            return n4;
        } catch (IOException e4) {
            this.f87542l.incrementAndGet();
            throw e4;
        }
    }

    public b y() {
        return new b();
    }
}
