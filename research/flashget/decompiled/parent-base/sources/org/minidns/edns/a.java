package org.minidns.edns;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.minidns.record.h;
import org.minidns.record.q;
import org.minidns.record.u;

/* compiled from: Edns.java */
/* loaded from: classes9.dex */
public class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int f87312i = 32768;

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ boolean f87313j = false;

    /* renamed from: a, reason: collision with root package name */
    public final int f87314a;

    /* renamed from: b, reason: collision with root package name */
    public final int f87315b;

    /* renamed from: c, reason: collision with root package name */
    public final int f87316c;

    /* renamed from: d, reason: collision with root package name */
    public final int f87317d;

    /* renamed from: e, reason: collision with root package name */
    public final List<org.minidns.edns.b> f87318e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f87319f;

    /* renamed from: g, reason: collision with root package name */
    private u<q> f87320g;

    /* renamed from: h, reason: collision with root package name */
    private String f87321h;

    /* compiled from: Edns.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private int f87322a;

        /* renamed from: b, reason: collision with root package name */
        private int f87323b;

        /* renamed from: c, reason: collision with root package name */
        private int f87324c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f87325d;

        /* renamed from: e, reason: collision with root package name */
        private List<org.minidns.edns.b> f87326e;

        private b() {
        }

        public b f(org.minidns.edns.b bVar) {
            if (this.f87326e == null) {
                this.f87326e = new ArrayList(4);
            }
            this.f87326e.add(bVar);
            return this;
        }

        public a g() {
            return new a(this);
        }

        public b h() {
            this.f87325d = true;
            return this;
        }

        public b i(boolean z4) {
            this.f87325d = z4;
            return this;
        }

        public b j(int i4) {
            if (i4 > 65535) {
                throw new IllegalArgumentException(android.support.v4.media.a.a("UDP payload size must not be greater than 65536, was ", i4));
            }
            this.f87322a = i4;
            return this;
        }

        b(C1355a c1355a) {
        }
    }

    /* compiled from: Edns.java */
    public enum c {
        UNKNOWN(-1, d.class),
        NSID(3, org.minidns.edns.c.class);

        private static Map<Integer, c> INVERSE_LUT = new HashMap(values().length);
        public final int asInt;
        public final Class<? extends org.minidns.edns.b> clazz;

        static {
            for (c cVar : values()) {
                INVERSE_LUT.put(Integer.valueOf(cVar.asInt), cVar);
            }
        }

        c(int i4, Class cls) {
            this.asInt = i4;
            this.clazz = cls;
        }

        public static c from(int i4) {
            c cVar = INVERSE_LUT.get(Integer.valueOf(i4));
            return cVar == null ? UNKNOWN : cVar;
        }
    }

    public a(u<q> uVar) {
        this.f87314a = uVar.f87496d;
        long j4 = uVar.f87497e;
        this.f87315b = (int) ((j4 >> 8) & 255);
        this.f87316c = (int) ((j4 >> 16) & 255);
        this.f87317d = ((int) j4) & 65535;
        this.f87319f = (j4 & PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID) > 0;
        this.f87318e = uVar.f87498f.f87478d;
        this.f87320g = uVar;
    }

    public static b c() {
        return new b();
    }

    public static a d(u<? extends h> uVar) {
        if (uVar.f87494b != u.c.OPT) {
            return null;
        }
        return new a((u<q>) uVar);
    }

    public u<q> a() {
        if (this.f87320g == null) {
            this.f87320g = new u<>(org.minidns.dnsname.a.f87222q, u.c.OPT, this.f87314a, this.f87317d | (this.f87315b << 8) | (this.f87316c << 16), new q(this.f87318e));
        }
        return this.f87320g;
    }

    public String b() {
        if (this.f87321h == null) {
            StringBuilder sb = new StringBuilder("EDNS: version: ");
            sb.append(this.f87316c);
            sb.append(", flags:");
            if (this.f87319f) {
                sb.append(" do");
            }
            sb.append("; udp: ");
            sb.append(this.f87314a);
            if (!this.f87318e.isEmpty()) {
                sb.append('\n');
                Iterator<org.minidns.edns.b> it = this.f87318e.iterator();
                while (it.hasNext()) {
                    org.minidns.edns.b next = it.next();
                    sb.append(next.c());
                    sb.append(": ");
                    sb.append(next.a());
                    if (it.hasNext()) {
                        sb.append('\n');
                    }
                }
            }
            this.f87321h = sb.toString();
        }
        return this.f87321h;
    }

    public <O extends org.minidns.edns.b> O e(c cVar) {
        Iterator<org.minidns.edns.b> it = this.f87318e.iterator();
        while (it.hasNext()) {
            O o4 = (O) it.next();
            if (o4.c().equals(cVar)) {
                return o4;
            }
        }
        return null;
    }

    public String toString() {
        return b();
    }

    public a(b bVar) {
        this.f87314a = bVar.f87322a;
        this.f87315b = bVar.f87323b;
        this.f87316c = bVar.f87324c;
        int i4 = bVar.f87325d ? 32768 : 0;
        this.f87319f = bVar.f87325d;
        this.f87317d = i4;
        if (bVar.f87326e != null) {
            this.f87318e = bVar.f87326e;
        } else {
            this.f87318e = Collections.emptyList();
        }
    }
}
