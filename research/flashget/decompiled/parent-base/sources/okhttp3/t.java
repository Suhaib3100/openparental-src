package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.x0;

/* compiled from: Handshake.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000 \u00142\u00020\u0001:\u0001\u000fB;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0012J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0015J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b&\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0017\u0010'\u001a\u0004\b(\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b*\u0010\u0012R\u0018\u0010-\u001a\u00020\u001f*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010/\u001a\u0004\u0018\u00010\u00138G¢\u0006\u0006\u001a\u0004\b.\u0010\u0015R\u0013\u00101\u001a\u0004\u0018\u00010\u00138G¢\u0006\u0006\u001a\u0004\b0\u0010\u0015¨\u00062"}, d2 = {"Lokhttp3/t;", "", "Lokhttp3/i0;", "tlsVersion", "Lokhttp3/i;", "cipherSuite", "", "Ljava/security/cert/Certificate;", "localCertificates", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lokhttp3/i0;Lokhttp3/i;Ljava/util/List;Lld/a;)V", "f", "()Lokhttp3/i0;", "a", "()Lokhttp3/i;", "d", "()Ljava/util/List;", "Ljava/security/Principal;", "e", "()Ljava/security/Principal;", "b", "c", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/b0;", "m", "peerCertificates", "Lokhttp3/i0;", "o", "Lokhttp3/i;", "g", "Ljava/util/List;", "k", "j", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "name", "n", "peerPrincipal", "l", "localPrincipal", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0 peerCertificates;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i0 tlsVersion;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i cipherSuite;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<Certificate> localCertificates;

    /* compiled from: Handshake.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0006*\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\fJ;\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lokhttp3/t$a;", "", "<init>", "()V", "", "Ljava/security/cert/Certificate;", "", "d", "([Ljava/security/cert/Certificate;)Ljava/util/List;", "Ljavax/net/ssl/SSLSession;", "Lokhttp3/t;", "b", "(Ljavax/net/ssl/SSLSession;)Lokhttp3/t;", "sslSession", "a", "Lokhttp3/i0;", "tlsVersion", "Lokhttp3/i;", "cipherSuite", "peerCertificates", "localCertificates", "c", "(Lokhttp3/i0;Lokhttp3/i;Ljava/util/List;Ljava/util/List;)Lokhttp3/t;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.t$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: Handshake.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 4, 0})
        /* renamed from: okhttp3.t$a$a, reason: collision with other inner class name */
        static final class C1330a extends n0 implements ld.a<List<? extends Certificate>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List f85071b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1330a(List list) {
                super(0);
                this.f85071b = list;
            }

            @fg.l
            public final List<Certificate> a() {
                return this.f85071b;
            }

            @Override // ld.a
            public List<? extends Certificate> invoke() {
                return this.f85071b;
            }
        }

        /* compiled from: Handshake.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 4, 0})
        /* renamed from: okhttp3.t$a$b */
        static final class b extends n0 implements ld.a<List<? extends Certificate>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List f85072b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(List list) {
                super(0);
                this.f85072b = list;
            }

            @fg.l
            public final List<Certificate> a() {
                return this.f85072b;
            }

            @Override // ld.a
            public List<? extends Certificate> invoke() {
                return this.f85072b;
            }
        }

        private Companion() {
        }

        private final List<Certificate> d(Certificate[] certificateArr) {
            return certificateArr != null ? okhttp3.internal.d.z((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length)) : kotlin.collections.j0.f74919b;
        }

        @fg.l
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "sslSession.handshake()", imports = {}))
        @kd.i(name = "-deprecated_get")
        public final t a(@fg.l SSLSession sslSession) throws IOException {
            l0.p(sslSession, ProtectedSandApp.s("ꈋ\u0001"));
            return b(sslSession);
        }

        @fg.l
        @kd.n
        @kd.i(name = "get")
        public final t b(@fg.l SSLSession sSLSession) throws IOException {
            List<Certificate> list;
            l0.p(sSLSession, ProtectedSandApp.s("ꈌ\u0001"));
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException(ProtectedSandApp.s("ꈓ\u0001"));
            }
            int hashCode = cipherSuite.hashCode();
            if (hashCode == 1019404634 ? cipherSuite.equals(ProtectedSandApp.s("ꈎ\u0001")) : hashCode == 1208658923 && cipherSuite.equals(ProtectedSandApp.s("ꈍ\u0001"))) {
                throw new IOException(ProtectedSandApp.s("ꈒ\u0001").concat(cipherSuite));
            }
            i b5 = i.INSTANCE.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException(ProtectedSandApp.s("ꈑ\u0001"));
            }
            if (l0.g(ProtectedSandApp.s("ꈏ\u0001"), protocol)) {
                throw new IOException(ProtectedSandApp.s("ꈐ\u0001"));
            }
            i0 a5 = i0.INSTANCE.a(protocol);
            try {
                list = d(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                list = kotlin.collections.j0.f74919b;
            }
            return new t(a5, b5, d(sSLSession.getLocalCertificates()), new b(list));
        }

        @fg.l
        @kd.n
        public final t c(@fg.l i0 tlsVersion, @fg.l i cipherSuite, @fg.l List<? extends Certificate> peerCertificates, @fg.l List<? extends Certificate> localCertificates) {
            l0.p(tlsVersion, ProtectedSandApp.s("ꈔ\u0001"));
            l0.p(cipherSuite, ProtectedSandApp.s("ꈕ\u0001"));
            l0.p(peerCertificates, ProtectedSandApp.s("ꈖ\u0001"));
            l0.p(localCertificates, ProtectedSandApp.s("ꈗ\u0001"));
            return new t(tlsVersion, cipherSuite, okhttp3.internal.d.c0(localCertificates), new C1330a(okhttp3.internal.d.c0(peerCertificates)));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    /* compiled from: Handshake.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 4, 0})
    static final class b extends n0 implements ld.a<List<? extends Certificate>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f85073b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ld.a aVar) {
            super(0);
            this.f85073b = aVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> invoke() {
            try {
                return (List) this.f85073b.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return kotlin.collections.j0.f74919b;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(@fg.l i0 i0Var, @fg.l i iVar, @fg.l List<? extends Certificate> list, @fg.l ld.a<? extends List<? extends Certificate>> aVar) {
        l0.p(i0Var, ProtectedSandApp.s("ꈘ\u0001"));
        l0.p(iVar, ProtectedSandApp.s("ꈙ\u0001"));
        l0.p(list, ProtectedSandApp.s("ꈚ\u0001"));
        l0.p(aVar, ProtectedSandApp.s("ꈛ\u0001"));
        this.tlsVersion = i0Var;
        this.cipherSuite = iVar;
        this.localCertificates = list;
        this.peerCertificates = kotlin.c0.c(new b(aVar));
    }

    @fg.l
    @kd.n
    @kd.i(name = "get")
    public static final t h(@fg.l SSLSession sSLSession) throws IOException {
        return INSTANCE.b(sSLSession);
    }

    @fg.l
    @kd.n
    public static final t i(@fg.l i0 i0Var, @fg.l i iVar, @fg.l List<? extends Certificate> list, @fg.l List<? extends Certificate> list2) {
        return INSTANCE.c(i0Var, iVar, list, list2);
    }

    private final String j(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        l0.o(type, ProtectedSandApp.s("ꈜ\u0001"));
        return type;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "cipherSuite", imports = {}))
    @kd.i(name = "-deprecated_cipherSuite")
    /* renamed from: a, reason: from getter */
    public final i getCipherSuite() {
        return this.cipherSuite;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "localCertificates", imports = {}))
    @kd.i(name = "-deprecated_localCertificates")
    public final List<Certificate> b() {
        return this.localCertificates;
    }

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "localPrincipal", imports = {}))
    @kd.i(name = "-deprecated_localPrincipal")
    public final Principal c() {
        return l();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "peerCertificates", imports = {}))
    @kd.i(name = "-deprecated_peerCertificates")
    public final List<Certificate> d() {
        return m();
    }

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "peerPrincipal", imports = {}))
    @kd.i(name = "-deprecated_peerPrincipal")
    public final Principal e() {
        return n();
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof t) {
            t tVar = (t) other;
            if (tVar.tlsVersion == this.tlsVersion && l0.g(tVar.cipherSuite, this.cipherSuite) && l0.g(tVar.m(), m()) && l0.g(tVar.localCertificates, this.localCertificates)) {
                return true;
            }
        }
        return false;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "tlsVersion", imports = {}))
    @kd.i(name = "-deprecated_tlsVersion")
    /* renamed from: f, reason: from getter */
    public final i0 getTlsVersion() {
        return this.tlsVersion;
    }

    @fg.l
    @kd.i(name = "cipherSuite")
    public final i g() {
        return this.cipherSuite;
    }

    public int hashCode() {
        return this.localCertificates.hashCode() + ((m().hashCode() + ((this.cipherSuite.hashCode() + ((this.tlsVersion.hashCode() + 527) * 31)) * 31)) * 31);
    }

    @fg.l
    @kd.i(name = "localCertificates")
    public final List<Certificate> k() {
        return this.localCertificates;
    }

    @fg.m
    @kd.i(name = "localPrincipal")
    public final Principal l() {
        Object G2 = kotlin.collections.w.G2(this.localCertificates);
        if (!(G2 instanceof X509Certificate)) {
            G2 = null;
        }
        X509Certificate x509Certificate = (X509Certificate) G2;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @fg.l
    @kd.i(name = "peerCertificates")
    public final List<Certificate> m() {
        return (List) this.peerCertificates.getValue();
    }

    @fg.m
    @kd.i(name = "peerPrincipal")
    public final Principal n() {
        Object G2 = kotlin.collections.w.G2(m());
        if (!(G2 instanceof X509Certificate)) {
            G2 = null;
        }
        X509Certificate x509Certificate = (X509Certificate) G2;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @fg.l
    @kd.i(name = "tlsVersion")
    public final i0 o() {
        return this.tlsVersion;
    }

    @fg.l
    public String toString() {
        List<Certificate> m4 = m();
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(m4, 10));
        Iterator<T> it = m4.iterator();
        while (it.hasNext()) {
            arrayList.add(j((Certificate) it.next()));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꈝ\u0001"));
        sb.append(this.tlsVersion);
        sb.append(ProtectedSandApp.s("ꈞ\u0001"));
        sb.append(this.cipherSuite);
        sb.append(ProtectedSandApp.s("ꈟ\u0001"));
        sb.append(obj);
        sb.append(ProtectedSandApp.s("ꈠ\u0001"));
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.w.b0(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(j((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
