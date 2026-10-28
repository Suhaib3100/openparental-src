package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u1;
import kotlin.x0;
import okio.p;

/* compiled from: CertificatePinner.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0003\u000f\u0017\u0014B#\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0016\"\u00020\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lokhttp3/g;", "", "", "Lokhttp3/g$c;", "pins", "Lue/c;", "certificateChainCleaner", "<init>", "(Ljava/util/Set;Lue/c;)V", "", "hostname", "", "Ljava/security/cert/Certificate;", "peerCertificates", "Lkotlin/k2;", "a", "(Ljava/lang/String;Ljava/util/List;)V", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "c", "(Ljava/lang/String;Lld/a;)V", "", "b", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "d", "(Ljava/lang/String;)Ljava/util/List;", "j", "(Lue/c;)Lokhttp3/g;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/Set;", "f", "()Ljava/util/Set;", "Lue/c;", "e", "()Lue/c;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Set<c> pins;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ue.c certificateChainCleaner;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final g f84125c = new a().b();

    /* compiled from: CertificatePinner.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0006\"\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/g$a;", "", "<init>", "()V", "", "pattern", "", "pins", "a", "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/g$a;", "Lokhttp3/g;", "b", "()Lokhttp3/g;", "", "Lokhttp3/g$c;", "Ljava/util/List;", "c", "()Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<c> pins = new ArrayList();

        @fg.l
        public final a a(@fg.l String pattern, @fg.l String... pins) {
            l0.p(pattern, ProtectedSandApp.s("鼏\u0001"));
            l0.p(pins, ProtectedSandApp.s("鼐\u0001"));
            for (String str : pins) {
                this.pins.add(new c(pattern, str));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @fg.l
        public final g b() {
            return new g(kotlin.collections.w.a6(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        @fg.l
        public final List<c> c() {
            return this.pins;
        }
    }

    /* compiled from: CertificatePinner.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/g$b;", "", "<init>", "()V", "Ljava/security/cert/X509Certificate;", "Lokio/p;", "b", "(Ljava/security/cert/X509Certificate;)Lokio/p;", "c", "Ljava/security/cert/Certificate;", "certificate", "", "a", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "Lokhttp3/g;", "DEFAULT", "Lokhttp3/g;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.g$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        @kd.n
        public final String a(@fg.l Certificate certificate) {
            l0.p(certificate, ProtectedSandApp.s("鼑\u0001"));
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("鼓\u0001"));
            }
            return ProtectedSandApp.s("鼒\u0001") + c((X509Certificate) certificate).d();
        }

        @fg.l
        @kd.n
        public final okio.p b(@fg.l X509Certificate x509Certificate) {
            l0.p(x509Certificate, ProtectedSandApp.s("鼔\u0001"));
            p.Companion companion = okio.p.INSTANCE;
            PublicKey publicKey = x509Certificate.getPublicKey();
            l0.o(publicKey, ProtectedSandApp.s("鼕\u0001"));
            byte[] encoded = publicKey.getEncoded();
            l0.o(encoded, ProtectedSandApp.s("鼖\u0001"));
            return p.Companion.p(companion, encoded, 0, 0, 3, null).a0();
        }

        @fg.l
        @kd.n
        public final okio.p c(@fg.l X509Certificate x509Certificate) {
            l0.p(x509Certificate, ProtectedSandApp.s("鼗\u0001"));
            p.Companion companion = okio.p.INSTANCE;
            PublicKey publicKey = x509Certificate.getPublicKey();
            l0.o(publicKey, ProtectedSandApp.s("鼕\u0001"));
            byte[] encoded = publicKey.getEncoded();
            l0.o(encoded, ProtectedSandApp.s("鼖\u0001"));
            return p.Companion.p(companion, encoded, 0, 0, 3, null).b0();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    /* compiled from: CertificatePinner.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u001f\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0017\u0010\u001e¨\u0006 "}, d2 = {"Lokhttp3/g$c;", "", "", "pattern", "pin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "hostname", "", "e", "(Ljava/lang/String;)Z", "Ljava/security/cert/X509Certificate;", "certificate", "d", "(Ljava/security/cert/X509Certificate;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "c", "b", "hashAlgorithm", "Lokio/p;", "Lokio/p;", "()Lokio/p;", "hash", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String pattern;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String hashAlgorithm;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final okio.p hash;

        public c(@fg.l String str, @fg.l String str2) {
            l0.p(str, ProtectedSandApp.s("鼘\u0001"));
            l0.p(str2, ProtectedSandApp.s("鼙\u0001"));
            if (!((kotlin.text.v.s2(str, ProtectedSandApp.s("鼚\u0001"), false, 2, null) && kotlin.text.v.p3(str, ProtectedSandApp.s("鼛\u0001"), 1, false, 4, null) == -1) || (kotlin.text.v.s2(str, ProtectedSandApp.s("鼜\u0001"), false, 2, null) && kotlin.text.v.p3(str, ProtectedSandApp.s("鼛\u0001"), 2, false, 4, null) == -1) || kotlin.text.v.p3(str, ProtectedSandApp.s("鼛\u0001"), 0, false, 6, null) == -1)) {
                throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("鼥\u0001"), str).toString());
            }
            String e4 = okhttp3.internal.a.e(str);
            if (e4 == null) {
                throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("鼤\u0001"), str));
            }
            this.pattern = e4;
            boolean s22 = kotlin.text.v.s2(str2, ProtectedSandApp.s("鼝\u0001"), false, 2, null);
            String s4 = ProtectedSandApp.s("鼞\u0001");
            String s5 = ProtectedSandApp.s("鼟\u0001");
            if (s22) {
                this.hashAlgorithm = ProtectedSandApp.s("鼠\u0001");
                p.Companion companion = okio.p.INSTANCE;
                String substring = str2.substring(5);
                l0.o(substring, s5);
                okio.p h4 = companion.h(substring);
                if (h4 == null) {
                    throw new IllegalArgumentException(s4.concat(str2));
                }
                this.hash = h4;
                return;
            }
            if (!kotlin.text.v.s2(str2, ProtectedSandApp.s("鼡\u0001"), false, 2, null)) {
                throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("鼣\u0001"), str2));
            }
            this.hashAlgorithm = ProtectedSandApp.s("鼢\u0001");
            p.Companion companion2 = okio.p.INSTANCE;
            String substring2 = str2.substring(7);
            l0.o(substring2, s5);
            okio.p h5 = companion2.h(substring2);
            if (h5 == null) {
                throw new IllegalArgumentException(s4.concat(str2));
            }
            this.hash = h5;
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final okio.p getHash() {
            return this.hash;
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        @fg.l
        /* renamed from: c, reason: from getter */
        public final String getPattern() {
            return this.pattern;
        }

        public final boolean d(@fg.l X509Certificate certificate) {
            l0.p(certificate, ProtectedSandApp.s("鼦\u0001"));
            String str = this.hashAlgorithm;
            int hashCode = str.hashCode();
            if (hashCode != -903629273) {
                if (hashCode == 3528965 && str.equals(ProtectedSandApp.s("鼠\u0001"))) {
                    return l0.g(this.hash, g.INSTANCE.b(certificate));
                }
            } else if (str.equals(ProtectedSandApp.s("鼢\u0001"))) {
                return l0.g(this.hash, g.INSTANCE.c(certificate));
            }
            return false;
        }

        public final boolean e(@fg.l String hostname) {
            l0.p(hostname, ProtectedSandApp.s("鼧\u0001"));
            if (kotlin.text.v.s2(this.pattern, ProtectedSandApp.s("鼜\u0001"), false, 2, null)) {
                int length = this.pattern.length() - 3;
                int length2 = hostname.length() - length;
                if (!kotlin.text.v.d2(hostname, hostname.length() - length, this.pattern, 3, length, false, 16, null)) {
                    return false;
                }
                if (length2 != 0 && hostname.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                if (!kotlin.text.v.s2(this.pattern, ProtectedSandApp.s("鼚\u0001"), false, 2, null)) {
                    return l0.g(hostname, this.pattern);
                }
                int length3 = this.pattern.length() - 1;
                int length4 = hostname.length() - length3;
                if (!kotlin.text.v.d2(hostname, hostname.length() - length3, this.pattern, 1, length3, false, 16, null) || kotlin.text.v.C3(hostname, '.', length4 - 1, false, 4, null) != -1) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return l0.g(this.pattern, cVar.pattern) && l0.g(this.hashAlgorithm, cVar.hashAlgorithm) && l0.g(this.hash, cVar.hash);
        }

        public int hashCode() {
            return this.hash.hashCode() + androidx.compose.foundation.text.modifiers.n.a(this.hashAlgorithm, this.pattern.hashCode() * 31, 31);
        }

        @fg.l
        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.d();
        }
    }

    /* compiled from: CertificatePinner.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/X509Certificate;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 4, 0})
    static final class d extends n0 implements ld.a<List<? extends X509Certificate>> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f84134c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f84135d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list, String str) {
            super(0);
            this.f84134c = list;
            this.f84135d = str;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<X509Certificate> invoke() {
            List<Certificate> list;
            ue.c certificateChainCleaner = g.this.getCertificateChainCleaner();
            if (certificateChainCleaner == null || (list = certificateChainCleaner.a(this.f84134c, this.f84135d)) == null) {
                list = this.f84134c;
            }
            List<Certificate> list2 = list;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list2, 10));
            for (Certificate certificate : list2) {
                if (certificate == null) {
                    throw new NullPointerException(ProtectedSandApp.s("鼨\u0001"));
                }
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public g(@fg.l Set<c> set, @fg.m ue.c cVar) {
        l0.p(set, ProtectedSandApp.s("鼱\u0001"));
        this.pins = set;
        this.certificateChainCleaner = cVar;
    }

    @fg.l
    @kd.n
    public static final String g(@fg.l Certificate certificate) {
        return INSTANCE.a(certificate);
    }

    @fg.l
    @kd.n
    public static final okio.p h(@fg.l X509Certificate x509Certificate) {
        return INSTANCE.b(x509Certificate);
    }

    @fg.l
    @kd.n
    public static final okio.p i(@fg.l X509Certificate x509Certificate) {
        return INSTANCE.c(x509Certificate);
    }

    public final void a(@fg.l String hostname, @fg.l List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        l0.p(hostname, ProtectedSandApp.s("鼲\u0001"));
        l0.p(peerCertificates, ProtectedSandApp.s("鼳\u0001"));
        c(hostname, new d(peerCertificates, hostname));
    }

    @kotlin.k(message = "replaced with {@link #check(String, List)}.", replaceWith = @x0(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    public final void b(@fg.l String hostname, @fg.l Certificate... peerCertificates) throws SSLPeerUnverifiedException {
        l0.p(hostname, ProtectedSandApp.s("鼲\u0001"));
        l0.p(peerCertificates, ProtectedSandApp.s("鼳\u0001"));
        a(hostname, kotlin.collections.l.Ky(peerCertificates));
    }

    public final void c(@fg.l String hostname, @fg.l ld.a<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) {
        String s4;
        l0.p(hostname, ProtectedSandApp.s("鼲\u0001"));
        l0.p(cleanedPeerCertificatesFn, ProtectedSandApp.s("鼴\u0001"));
        List<c> d5 = d(hostname);
        if (d5.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> invoke = cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : invoke) {
            okio.p pVar = null;
            okio.p pVar2 = null;
            for (c cVar : d5) {
                String hashAlgorithm = cVar.getHashAlgorithm();
                int hashCode = hashAlgorithm.hashCode();
                if (hashCode != -903629273) {
                    if (hashCode == 3528965 && hashAlgorithm.equals(ProtectedSandApp.s("鼵\u0001"))) {
                        if (pVar2 == null) {
                            pVar2 = INSTANCE.b(x509Certificate);
                        }
                        if (l0.g(cVar.getHash(), pVar2)) {
                            return;
                        }
                    }
                    throw new AssertionError(ProtectedSandApp.s("鼷\u0001") + cVar.getHashAlgorithm());
                }
                if (!hashAlgorithm.equals(ProtectedSandApp.s("鼶\u0001"))) {
                    throw new AssertionError(ProtectedSandApp.s("鼷\u0001") + cVar.getHashAlgorithm());
                }
                if (pVar == null) {
                    pVar = INSTANCE.c(x509Certificate);
                }
                if (l0.g(cVar.getHash(), pVar)) {
                    return;
                }
            }
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("鼸\u0001"));
        Iterator<? extends X509Certificate> it = invoke.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            s4 = ProtectedSandApp.s("鼹\u0001");
            if (!hasNext) {
                break;
            }
            X509Certificate next = it.next();
            sb.append(s4);
            sb.append(INSTANCE.a(next));
            sb.append(ProtectedSandApp.s("鼺\u0001"));
            Principal subjectDN = next.getSubjectDN();
            l0.o(subjectDN, ProtectedSandApp.s("鼻\u0001"));
            sb.append(subjectDN.getName());
        }
        sb.append(ProtectedSandApp.s("鼼\u0001"));
        sb.append(hostname);
        sb.append(ProtectedSandApp.s("鼽\u0001"));
        for (c cVar2 : d5) {
            sb.append(s4);
            sb.append(cVar2);
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("鼾\u0001"));
        throw new SSLPeerUnverifiedException(sb2);
    }

    @fg.l
    public final List<c> d(@fg.l String hostname) {
        l0.p(hostname, ProtectedSandApp.s("鼲\u0001"));
        Set<c> set = this.pins;
        List list = kotlin.collections.j0.f74919b;
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

    @fg.m
    /* renamed from: e, reason: from getter */
    public final ue.c getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof g) {
            g gVar = (g) other;
            if (l0.g(gVar.pins, this.pins) && l0.g(gVar.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
        }
        return false;
    }

    @fg.l
    public final Set<c> f() {
        return this.pins;
    }

    public int hashCode() {
        int hashCode = (this.pins.hashCode() + 1517) * 41;
        ue.c cVar = this.certificateChainCleaner;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    @fg.l
    public final g j(@fg.l ue.c certificateChainCleaner) {
        l0.p(certificateChainCleaner, ProtectedSandApp.s("鼿\u0001"));
        return l0.g(this.certificateChainCleaner, certificateChainCleaner) ? this : new g(this.pins, certificateChainCleaner);
    }

    public /* synthetic */ g(Set set, ue.c cVar, int i4, kotlin.jvm.internal.w wVar) {
        this(set, (i4 & 2) != 0 ? null : cVar);
    }
}
