package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u1;
import okio.p;

/* compiled from: CertificatePinner.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\n\u0018\u0000 \u00122\u00020\u0001:\u0003\b\u000f\fB#\b\u0000\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001c\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b$\u0010%J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J+\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\tH\u0000¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000e\"\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001c8\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lokhttp3/g;", "", "", "hostname", "", "Ljava/security/cert/Certificate;", "peerCertificates", "Lkotlin/m2;", "a", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "c", "(Ljava/lang/String;Lq3/a;)V", "", "b", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "Lokhttp3/g$c;", "d", "Lu4/c;", "certificateChainCleaner", "j", "(Lu4/c;)Lokhttp3/g;", "other", "", "equals", "", "hashCode", "", "Ljava/util/Set;", "f", "()Ljava/util/Set;", "pins", "Lu4/c;", "e", "()Lu4/c;", "<init>", "(Ljava/util/Set;Lu4/c;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Set<c> pins;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final u4.c certificateChainCleaner;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final g f30592c = new a().b();

    /* compiled from: CertificatePinner.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\"\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\t\u001a\u00020\bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lokhttp3/g$a;", "", "", "pattern", "", "pins", "a", "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/g$a;", "Lokhttp3/g;", "b", "", "Lokhttp3/g$c;", "Ljava/util/List;", "c", "()Ljava/util/List;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final List<c> pins = new ArrayList();

        @d5.d
        public final a a(@d5.d String pattern, @d5.d String... pins) {
            kotlin.jvm.internal.l0.p(pattern, ProtectedSandApp.s("忌"));
            kotlin.jvm.internal.l0.p(pins, ProtectedSandApp.s("忍"));
            for (String str : pins) {
                this.pins.add(new c(pattern, str));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @d5.d
        public final g b() {
            Set a6;
            a6 = kotlin.collections.j0.a6(this.pins);
            return new g(a6, null, 2, 0 == true ? 1 : 0);
        }

        @d5.d
        public final List<c> c() {
            return this.pins;
        }
    }

    /* compiled from: CertificatePinner.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007J\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lokhttp3/g$b;", "", "Ljava/security/cert/X509Certificate;", "Lokio/p;", "b", "c", "Ljava/security/cert/Certificate;", "certificate", "", "a", "Lokhttp3/g;", "DEFAULT", "Lokhttp3/g;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.g$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        @p3.n
        public final String a(@d5.d Certificate certificate) {
            kotlin.jvm.internal.l0.p(certificate, ProtectedSandApp.s("忎"));
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("忐").toString());
            }
            return ProtectedSandApp.s("忏") + c((X509Certificate) certificate).l();
        }

        @d5.d
        @p3.n
        public final okio.p b(@d5.d X509Certificate x509Certificate) {
            kotlin.jvm.internal.l0.p(x509Certificate, ProtectedSandApp.s("忑"));
            p.Companion companion = okio.p.INSTANCE;
            PublicKey publicKey = x509Certificate.getPublicKey();
            kotlin.jvm.internal.l0.o(publicKey, ProtectedSandApp.s("忒"));
            byte[] encoded = publicKey.getEncoded();
            kotlin.jvm.internal.l0.o(encoded, ProtectedSandApp.s("忓"));
            return p.Companion.p(companion, encoded, 0, 0, 3, null).f0();
        }

        @d5.d
        @p3.n
        public final okio.p c(@d5.d X509Certificate x509Certificate) {
            kotlin.jvm.internal.l0.p(x509Certificate, ProtectedSandApp.s("忔"));
            p.Companion companion = okio.p.INSTANCE;
            PublicKey publicKey = x509Certificate.getPublicKey();
            kotlin.jvm.internal.l0.o(publicKey, ProtectedSandApp.s("忕"));
            byte[] encoded = publicKey.getEncoded();
            kotlin.jvm.internal.l0.o(encoded, ProtectedSandApp.s("忖"));
            return p.Companion.p(companion, encoded, 0, 0, 3, null).g0();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    /* compiled from: CertificatePinner.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017¨\u0006\u001c"}, d2 = {"Lokhttp3/g$c;", "", "", "hostname", "", "e", "Ljava/security/cert/X509Certificate;", "certificate", "d", "toString", "other", "equals", "", "hashCode", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "pattern", "b", "hashAlgorithm", "Lokio/p;", "Lokio/p;", "()Lokio/p;", "hash", "pin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final String pattern;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final String hashAlgorithm;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final okio.p hash;

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0051, code lost:
        
            if (r0 != (-1)) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0034, code lost:
        
            if (r0 != (-1)) goto L6;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0069  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(@d5.d java.lang.String r12, @d5.d java.lang.String r13) {
            /*
                Method dump skipped, instructions count: 275
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.g.c.<init>(java.lang.String, java.lang.String):void");
        }

        @d5.d
        /* renamed from: a, reason: from getter */
        public final okio.p getHash() {
            return this.hash;
        }

        @d5.d
        /* renamed from: b, reason: from getter */
        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        @d5.d
        /* renamed from: c, reason: from getter */
        public final String getPattern() {
            return this.pattern;
        }

        public final boolean d(@d5.d X509Certificate certificate) {
            kotlin.jvm.internal.l0.p(certificate, ProtectedSandApp.s("忧"));
            String str = this.hashAlgorithm;
            int hashCode = str.hashCode();
            if (hashCode != -903629273) {
                if (hashCode == 3528965 && str.equals(ProtectedSandApp.s("忨"))) {
                    return kotlin.jvm.internal.l0.g(this.hash, g.INSTANCE.b(certificate));
                }
            } else if (str.equals(ProtectedSandApp.s("忩"))) {
                return kotlin.jvm.internal.l0.g(this.hash, g.INSTANCE.c(certificate));
            }
            return false;
        }

        public final boolean e(@d5.d String hostname) {
            boolean s22;
            boolean s23;
            boolean d22;
            int C3;
            boolean d23;
            kotlin.jvm.internal.l0.p(hostname, ProtectedSandApp.s("忪"));
            s22 = kotlin.text.e0.s2(this.pattern, ProtectedSandApp.s("快"), false, 2, null);
            if (s22) {
                int length = this.pattern.length() - 3;
                int length2 = hostname.length() - length;
                d23 = kotlin.text.e0.d2(hostname, hostname.length() - length, this.pattern, 3, length, false, 16, null);
                if (!d23) {
                    return false;
                }
                if (length2 != 0 && hostname.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                s23 = kotlin.text.e0.s2(this.pattern, ProtectedSandApp.s("忬"), false, 2, null);
                if (!s23) {
                    return kotlin.jvm.internal.l0.g(hostname, this.pattern);
                }
                int length3 = this.pattern.length() - 1;
                int length4 = hostname.length() - length3;
                d22 = kotlin.text.e0.d2(hostname, hostname.length() - length3, this.pattern, 1, length3, false, 16, null);
                if (!d22) {
                    return false;
                }
                C3 = kotlin.text.h0.C3(hostname, org.apache.commons.io.k.f32026a, length4 - 1, false, 4, null);
                if (C3 != -1) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(@d5.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return ((kotlin.jvm.internal.l0.g(this.pattern, cVar.pattern) ^ true) || (kotlin.jvm.internal.l0.g(this.hashAlgorithm, cVar.hashAlgorithm) ^ true) || (kotlin.jvm.internal.l0.g(this.hash, cVar.hash) ^ true)) ? false : true;
        }

        public int hashCode() {
            return this.hash.hashCode() + ((this.hashAlgorithm.hashCode() + (this.pattern.hashCode() * 31)) * 31);
        }

        @d5.d
        public String toString() {
            return this.hashAlgorithm + org.apache.commons.io.n.f32060b + this.hash.l();
        }
    }

    /* compiled from: CertificatePinner.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/X509Certificate;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    static final class d extends Lambda implements q3.a<List<? extends X509Certificate>> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ List f30601q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f30602r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list, String str) {
            super(0);
            this.f30601q = list;
            this.f30602r = str;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<X509Certificate> n() {
            List<Certificate> list;
            int b02;
            u4.c certificateChainCleaner = g.this.getCertificateChainCleaner();
            if (certificateChainCleaner == null || (list = certificateChainCleaner.a(this.f30601q, this.f30602r)) == null) {
                list = this.f30601q;
            }
            b02 = kotlin.collections.b0.b0(list, 10);
            ArrayList arrayList = new ArrayList(b02);
            for (Certificate certificate : list) {
                if (certificate == null) {
                    throw new NullPointerException(ProtectedSandApp.s("醞"));
                }
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public g(@d5.d Set<c> set, @d5.e u4.c cVar) {
        kotlin.jvm.internal.l0.p(set, ProtectedSandApp.s("怒"));
        this.pins = set;
        this.certificateChainCleaner = cVar;
    }

    @d5.d
    @p3.n
    public static final String g(@d5.d Certificate certificate) {
        return INSTANCE.a(certificate);
    }

    @d5.d
    @p3.n
    public static final okio.p h(@d5.d X509Certificate x509Certificate) {
        return INSTANCE.b(x509Certificate);
    }

    @d5.d
    @p3.n
    public static final okio.p i(@d5.d X509Certificate x509Certificate) {
        return INSTANCE.c(x509Certificate);
    }

    public final void a(@d5.d String str, @d5.d List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("怓"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("怔"));
        c(str, new d(list, str));
    }

    @Deprecated(message = "replaced with {@link #check(String, List)}.", replaceWith = @ReplaceWith(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    public final void b(@d5.d String hostname, @d5.d Certificate... peerCertificates) throws SSLPeerUnverifiedException {
        List<? extends Certificate> Jy;
        kotlin.jvm.internal.l0.p(hostname, ProtectedSandApp.s("怕"));
        kotlin.jvm.internal.l0.p(peerCertificates, ProtectedSandApp.s("怖"));
        Jy = kotlin.collections.t.Jy(peerCertificates);
        a(hostname, Jy);
    }

    public final void c(@d5.d String hostname, @d5.d q3.a<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) {
        String s5;
        kotlin.jvm.internal.l0.p(hostname, ProtectedSandApp.s("怗"));
        kotlin.jvm.internal.l0.p(cleanedPeerCertificatesFn, ProtectedSandApp.s("怘"));
        List<c> d6 = d(hostname);
        if (d6.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> n5 = cleanedPeerCertificatesFn.n();
        for (X509Certificate x509Certificate : n5) {
            okio.p pVar = null;
            okio.p pVar2 = null;
            for (c cVar : d6) {
                String hashAlgorithm = cVar.getHashAlgorithm();
                int hashCode = hashAlgorithm.hashCode();
                if (hashCode != -903629273) {
                    if (hashCode == 3528965 && hashAlgorithm.equals(ProtectedSandApp.s("怙"))) {
                        if (pVar2 == null) {
                            pVar2 = INSTANCE.b(x509Certificate);
                        }
                        if (kotlin.jvm.internal.l0.g(cVar.getHash(), pVar2)) {
                            return;
                        }
                    }
                    throw new AssertionError(ProtectedSandApp.s("怛") + cVar.getHashAlgorithm());
                }
                if (!hashAlgorithm.equals(ProtectedSandApp.s("怚"))) {
                    throw new AssertionError(ProtectedSandApp.s("怛") + cVar.getHashAlgorithm());
                }
                if (pVar == null) {
                    pVar = INSTANCE.c(x509Certificate);
                }
                if (kotlin.jvm.internal.l0.g(cVar.getHash(), pVar)) {
                    return;
                }
            }
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("怜"));
        Iterator<? extends X509Certificate> it = n5.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            s5 = ProtectedSandApp.s("思");
            if (!hasNext) {
                break;
            }
            X509Certificate next = it.next();
            sb.append(s5);
            sb.append(INSTANCE.a(next));
            sb.append(ProtectedSandApp.s("怞"));
            Principal subjectDN = next.getSubjectDN();
            kotlin.jvm.internal.l0.o(subjectDN, ProtectedSandApp.s("怟"));
            sb.append(subjectDN.getName());
        }
        sb.append(ProtectedSandApp.s("怠"));
        sb.append(hostname);
        sb.append(ProtectedSandApp.s("怡"));
        for (c cVar2 : d6) {
            sb.append(s5);
            sb.append(cVar2);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("怢"));
        throw new SSLPeerUnverifiedException(sb2);
    }

    @d5.d
    public final List<c> d(@d5.d String hostname) {
        kotlin.jvm.internal.l0.p(hostname, ProtectedSandApp.s("怣"));
        Set<c> set = this.pins;
        List list = EmptyList.f23167o;
        for (Object obj : set) {
            if (((c) obj).e(hostname)) {
                if (list.isEmpty()) {
                    list = new ArrayList();
                }
                u1.g(list).add(obj);
            }
        }
        return list;
    }

    @d5.e
    /* renamed from: e, reason: from getter */
    public final u4.c getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public boolean equals(@d5.e Object other) {
        if (other instanceof g) {
            g gVar = (g) other;
            if (kotlin.jvm.internal.l0.g(gVar.pins, this.pins) && kotlin.jvm.internal.l0.g(gVar.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
        }
        return false;
    }

    @d5.d
    public final Set<c> f() {
        return this.pins;
    }

    public int hashCode() {
        int hashCode = (this.pins.hashCode() + 1517) * 41;
        u4.c cVar = this.certificateChainCleaner;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    @d5.d
    public final g j(@d5.d u4.c certificateChainCleaner) {
        kotlin.jvm.internal.l0.p(certificateChainCleaner, ProtectedSandApp.s("怤"));
        return kotlin.jvm.internal.l0.g(this.certificateChainCleaner, certificateChainCleaner) ? this : new g(this.pins, certificateChainCleaner);
    }

    public /* synthetic */ g(Set set, u4.c cVar, int i5, kotlin.jvm.internal.w wVar) {
        this(set, (i5 & 2) != 0 ? null : cVar);
    }
}
