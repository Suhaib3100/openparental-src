package org.minidns.dnssec;

import java.util.Collections;
import java.util.List;
import org.minidns.constants.b;
import org.minidns.record.s;
import org.minidns.record.u;

/* compiled from: DnssecUnverifiedReason.java */
/* loaded from: classes5.dex */
public abstract class d {

    /* compiled from: DnssecUnverifiedReason.java */
    public static class a extends d {

        /* renamed from: a, reason: collision with root package name */
        private final int f87282a;

        /* renamed from: b, reason: collision with root package name */
        private final String f87283b;

        /* renamed from: c, reason: collision with root package name */
        private final Exception f87284c;

        /* renamed from: d, reason: collision with root package name */
        private final u<? extends org.minidns.record.h> f87285d;

        public a(b.a aVar, String str, u<? extends org.minidns.record.h> uVar, Exception exc) {
            this.f87282a = aVar.value;
            this.f87283b = str;
            this.f87285d = uVar;
            this.f87284c = exc;
        }

        @Override // org.minidns.dnssec.d
        public String a() {
            return this.f87283b + " algorithm " + this.f87282a + " threw exception while verifying " + ((Object) this.f87285d.f87493a) + ": " + this.f87284c;
        }
    }

    /* compiled from: DnssecUnverifiedReason.java */
    public static class b extends d {

        /* renamed from: a, reason: collision with root package name */
        private final String f87286a;

        /* renamed from: b, reason: collision with root package name */
        private final u.c f87287b;

        /* renamed from: c, reason: collision with root package name */
        private final u<? extends org.minidns.record.h> f87288c;

        public b(byte b5, u.c cVar, u<? extends org.minidns.record.h> uVar) {
            this.f87286a = Integer.toString(b5 & 255);
            this.f87287b = cVar;
            this.f87288c = uVar;
        }

        @Override // org.minidns.dnssec.d
        public String a() {
            return this.f87287b.name() + " algorithm " + this.f87286a + " required to verify " + ((Object) this.f87288c.f87493a) + " is unknown or not supported by platform";
        }
    }

    /* compiled from: DnssecUnverifiedReason.java */
    public static class c extends d {

        /* renamed from: a, reason: collision with root package name */
        private final u<org.minidns.record.f> f87289a;

        public c(u<org.minidns.record.f> uVar) {
            this.f87289a = uVar;
        }

        @Override // org.minidns.dnssec.d
        public String a() {
            return android.support.v4.media.c.a(new StringBuilder("Zone "), this.f87289a.f87493a.f87227b, " is in list of known SEPs, but DNSKEY from response mismatches!");
        }
    }

    /* compiled from: DnssecUnverifiedReason.java */
    /* renamed from: org.minidns.dnssec.d$d, reason: collision with other inner class name */
    public static class C1354d extends d {

        /* renamed from: a, reason: collision with root package name */
        private final org.minidns.dnsmessage.b f87290a;

        /* renamed from: b, reason: collision with root package name */
        private final u<? extends org.minidns.record.h> f87291b;

        public C1354d(org.minidns.dnsmessage.b bVar, u<? extends org.minidns.record.h> uVar) {
            this.f87290a = bVar;
            this.f87291b = uVar;
        }

        @Override // org.minidns.dnssec.d
        public String a() {
            return "NSEC " + ((Object) this.f87291b.f87493a) + " does nat match question for " + this.f87290a.f87208b + " at " + ((Object) this.f87290a.f87207a);
        }
    }

    /* compiled from: DnssecUnverifiedReason.java */
    public static class e extends d {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f87292c = false;

        /* renamed from: a, reason: collision with root package name */
        private final org.minidns.dnsmessage.b f87293a;

        /* renamed from: b, reason: collision with root package name */
        private final List<s> f87294b;

        public e(org.minidns.dnsmessage.b bVar, List<s> list) {
            this.f87293a = bVar;
            this.f87294b = Collections.unmodifiableList(list);
        }

        @Override // org.minidns.dnssec.d
        public String a() {
            return "No currently active signatures were attached to answer on question for " + this.f87293a.f87208b + " at " + ((Object) this.f87293a.f87207a);
        }

        public List<s> b() {
            return this.f87294b;
        }
    }

    /* compiled from: DnssecUnverifiedReason.java */
    public static class f extends d {
        @Override // org.minidns.dnssec.d
        public String a() {
            return "No secure entry point was found for the root zone (\"Did you forget to configure a root SEP?\")";
        }
    }

    /* compiled from: DnssecUnverifiedReason.java */
    public static class g extends d {

        /* renamed from: a, reason: collision with root package name */
        private final org.minidns.dnsname.a f87295a;

        public g(org.minidns.dnsname.a aVar) {
            this.f87295a = aVar;
        }

        @Override // org.minidns.dnssec.d
        public String a() {
            return "No secure entry point was found for zone " + ((Object) this.f87295a);
        }
    }

    /* compiled from: DnssecUnverifiedReason.java */
    public static class h extends d {

        /* renamed from: a, reason: collision with root package name */
        private final org.minidns.dnsmessage.b f87296a;

        public h(org.minidns.dnsmessage.b bVar) {
            this.f87296a = bVar;
        }

        @Override // org.minidns.dnssec.d
        public String a() {
            return "No signatures were attached to answer on question for " + this.f87296a.f87208b + " at " + ((Object) this.f87296a.f87207a);
        }
    }

    /* compiled from: DnssecUnverifiedReason.java */
    public static class i extends d {

        /* renamed from: a, reason: collision with root package name */
        private final org.minidns.dnsname.a f87297a;

        public i(org.minidns.dnsname.a aVar) {
            this.f87297a = aVar;
        }

        @Override // org.minidns.dnssec.d
        public String a() {
            return "No trust anchor was found for zone " + ((Object) this.f87297a) + ". Try enabling DLV";
        }
    }

    public abstract String a();

    public boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).a().equals(a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a();
    }
}
