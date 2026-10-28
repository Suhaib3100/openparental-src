package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;

/* compiled from: Handshake.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\u0006B;\b\u0000\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0+¢\u0006\u0004\b-\u0010.J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u001d\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u0004R\u0017\u0010 \u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010\u0007R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010\u000bR\u0018\u0010&\u001a\u00020\u0016*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010(\u001a\u0004\u0018\u00010\f8G¢\u0006\u0006\u001a\u0004\b'\u0010\u000eR\u0013\u0010*\u001a\u0004\u0018\u00010\f8G¢\u0006\u0006\u001a\u0004\b)\u0010\u000e¨\u0006/"}, d2 = {"Lokhttp3/t;", "", "Lokhttp3/j0;", "f", "()Lokhttp3/j0;", "Lokhttp3/i;", "a", "()Lokhttp3/i;", "", "Ljava/security/cert/Certificate;", "d", "()Ljava/util/List;", "Ljava/security/Principal;", "e", "()Ljava/security/Principal;", "b", "c", "other", "", "equals", "", "hashCode", "", "toString", "Lkotlin/b0;", "m", "peerCertificates", "Lokhttp3/j0;", "o", "tlsVersion", "Lokhttp3/i;", "g", "cipherSuite", "Ljava/util/List;", "k", "localCertificates", "j", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "name", "n", "peerPrincipal", "l", "localPrincipal", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lokhttp3/j0;Lokhttp3/i;Ljava/util/List;Lq3/a;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Lazy peerCertificates;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final j0 tlsVersion;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final i cipherSuite;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<Certificate> localCertificates;

    /* compiled from: Handshake.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004*\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\nJ4\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004H\u0007¨\u0006\u0016"}, d2 = {"Lokhttp3/t$a;", "", "", "Ljava/security/cert/Certificate;", "", "d", "([Ljava/security/cert/Certificate;)Ljava/util/List;", "Ljavax/net/ssl/SSLSession;", "Lokhttp3/t;", "b", "(Ljavax/net/ssl/SSLSession;)Lokhttp3/t;", "sslSession", "a", "Lokhttp3/j0;", "tlsVersion", "Lokhttp3/i;", "cipherSuite", "peerCertificates", "localCertificates", "c", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.t$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: Handshake.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 4, 0})
        /* renamed from: okhttp3.t$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        static final class C0491a extends Lambda implements q3.a<List<? extends Certificate>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ List f31529p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0491a(List list) {
                super(0);
                this.f31529p = list;
            }

            @d5.d
            public final List<Certificate> a() {
                return this.f31529p;
            }

            @Override // q3.a
            public List<? extends Certificate> n() {
                return this.f31529p;
            }
        }

        /* compiled from: Handshake.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 4, 0})
        /* renamed from: okhttp3.t$a$b */
        /* loaded from: classes6.dex */
        static final class b extends Lambda implements q3.a<List<? extends Certificate>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ List f31530p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(List list) {
                super(0);
                this.f31530p = list;
            }

            @d5.d
            public final List<Certificate> a() {
                return this.f31530p;
            }

            @Override // q3.a
            public List<? extends Certificate> n() {
                return this.f31530p;
            }
        }

        private Companion() {
        }

        private final List<Certificate> d(Certificate[] certificateArr) {
            return certificateArr != null ? okhttp3.internal.d.z((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length)) : EmptyList.f23167o;
        }

        @p3.i(name = "-deprecated_get")
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "sslSession.handshake()", imports = {}))
        @d5.d
        public final t a(@d5.d SSLSession sslSession) throws IOException {
            kotlin.jvm.internal.l0.p(sslSession, ProtectedSandApp.s("曣"));
            return b(sslSession);
        }

        @p3.i(name = "get")
        @d5.d
        @p3.n
        public final t b(@d5.d SSLSession sSLSession) throws IOException {
            List<Certificate> list;
            kotlin.jvm.internal.l0.p(sSLSession, ProtectedSandApp.s("曤"));
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException(ProtectedSandApp.s("曫").toString());
            }
            int hashCode = cipherSuite.hashCode();
            if (hashCode == 1019404634 ? cipherSuite.equals(ProtectedSandApp.s("曦")) : hashCode == 1208658923 && cipherSuite.equals(ProtectedSandApp.s("曥"))) {
                throw new IOException(ProtectedSandApp.s("曪").concat(cipherSuite));
            }
            i b6 = i.INSTANCE.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException(ProtectedSandApp.s("曩").toString());
            }
            if (kotlin.jvm.internal.l0.g(ProtectedSandApp.s("曧"), protocol)) {
                throw new IOException(ProtectedSandApp.s("曨"));
            }
            j0 a6 = j0.INSTANCE.a(protocol);
            try {
                list = d(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                list = EmptyList.f23167o;
            }
            return new t(a6, b6, d(sSLSession.getLocalCertificates()), new b(list));
        }

        @d5.d
        @p3.n
        public final t c(@d5.d j0 tlsVersion, @d5.d i cipherSuite, @d5.d List<? extends Certificate> peerCertificates, @d5.d List<? extends Certificate> localCertificates) {
            kotlin.jvm.internal.l0.p(tlsVersion, ProtectedSandApp.s("曬"));
            kotlin.jvm.internal.l0.p(cipherSuite, ProtectedSandApp.s("曭"));
            kotlin.jvm.internal.l0.p(peerCertificates, ProtectedSandApp.s("曮"));
            kotlin.jvm.internal.l0.p(localCertificates, ProtectedSandApp.s("曯"));
            return new t(tlsVersion, cipherSuite, okhttp3.internal.d.c0(localCertificates), new C0491a(okhttp3.internal.d.c0(peerCertificates)));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    /* compiled from: Handshake.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.a<List<? extends Certificate>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.a f31531p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q3.a aVar) {
            super(0);
            this.f31531p = aVar;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> n() {
            try {
                return (List) this.f31531p.n();
            } catch (SSLPeerUnverifiedException unused) {
                return EmptyList.f23167o;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(@d5.d j0 j0Var, @d5.d i iVar, @d5.d List<? extends Certificate> list, @d5.d q3.a<? extends List<? extends Certificate>> aVar) {
        Lazy c6;
        kotlin.jvm.internal.l0.p(j0Var, ProtectedSandApp.s("曰"));
        kotlin.jvm.internal.l0.p(iVar, ProtectedSandApp.s("曱"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("曲"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("曳"));
        this.tlsVersion = j0Var;
        this.cipherSuite = iVar;
        this.localCertificates = list;
        c6 = kotlin.d0.c(new b(aVar));
        this.peerCertificates = c6;
    }

    @p3.i(name = "get")
    @d5.d
    @p3.n
    public static final t h(@d5.d SSLSession sSLSession) throws IOException {
        return INSTANCE.b(sSLSession);
    }

    @d5.d
    @p3.n
    public static final t i(@d5.d j0 j0Var, @d5.d i iVar, @d5.d List<? extends Certificate> list, @d5.d List<? extends Certificate> list2) {
        return INSTANCE.c(j0Var, iVar, list, list2);
    }

    private final String j(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        kotlin.jvm.internal.l0.o(type, ProtectedSandApp.s("更"));
        return type;
    }

    @p3.i(name = "-deprecated_cipherSuite")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cipherSuite", imports = {}))
    @d5.d
    /* renamed from: a, reason: from getter */
    public final i getCipherSuite() {
        return this.cipherSuite;
    }

    @p3.i(name = "-deprecated_localCertificates")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "localCertificates", imports = {}))
    @d5.d
    public final List<Certificate> b() {
        return this.localCertificates;
    }

    @p3.i(name = "-deprecated_localPrincipal")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "localPrincipal", imports = {}))
    @d5.e
    public final Principal c() {
        return l();
    }

    @p3.i(name = "-deprecated_peerCertificates")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "peerCertificates", imports = {}))
    @d5.d
    public final List<Certificate> d() {
        return m();
    }

    @p3.i(name = "-deprecated_peerPrincipal")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "peerPrincipal", imports = {}))
    @d5.e
    public final Principal e() {
        return n();
    }

    public boolean equals(@d5.e Object other) {
        if (other instanceof t) {
            t tVar = (t) other;
            if (tVar.tlsVersion == this.tlsVersion && kotlin.jvm.internal.l0.g(tVar.cipherSuite, this.cipherSuite) && kotlin.jvm.internal.l0.g(tVar.m(), m()) && kotlin.jvm.internal.l0.g(tVar.localCertificates, this.localCertificates)) {
                return true;
            }
        }
        return false;
    }

    @p3.i(name = "-deprecated_tlsVersion")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "tlsVersion", imports = {}))
    @d5.d
    /* renamed from: f, reason: from getter */
    public final j0 getTlsVersion() {
        return this.tlsVersion;
    }

    @p3.i(name = "cipherSuite")
    @d5.d
    public final i g() {
        return this.cipherSuite;
    }

    public int hashCode() {
        return this.localCertificates.hashCode() + ((m().hashCode() + ((this.cipherSuite.hashCode() + ((this.tlsVersion.hashCode() + 527) * 31)) * 31)) * 31);
    }

    @p3.i(name = "localCertificates")
    @d5.d
    public final List<Certificate> k() {
        return this.localCertificates;
    }

    @p3.i(name = "localPrincipal")
    @d5.e
    public final Principal l() {
        Object G2;
        G2 = kotlin.collections.j0.G2(this.localCertificates);
        if (!(G2 instanceof X509Certificate)) {
            G2 = null;
        }
        X509Certificate x509Certificate = (X509Certificate) G2;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @p3.i(name = "peerCertificates")
    @d5.d
    public final List<Certificate> m() {
        return (List) this.peerCertificates.getValue();
    }

    @p3.i(name = "peerPrincipal")
    @d5.e
    public final Principal n() {
        Object G2;
        G2 = kotlin.collections.j0.G2(m());
        if (!(G2 instanceof X509Certificate)) {
            G2 = null;
        }
        X509Certificate x509Certificate = (X509Certificate) G2;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @p3.i(name = "tlsVersion")
    @d5.d
    public final j0 o() {
        return this.tlsVersion;
    }

    @d5.d
    public String toString() {
        int b02;
        int b03;
        List<Certificate> m5 = m();
        b02 = kotlin.collections.b0.b0(m5, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = m5.iterator();
        while (it.hasNext()) {
            arrayList.add(j((Certificate) it.next()));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("曵"));
        sb.append(this.tlsVersion);
        sb.append(ProtectedSandApp.s("曶"));
        sb.append(this.cipherSuite);
        sb.append(ProtectedSandApp.s("曷"));
        sb.append(obj);
        sb.append(ProtectedSandApp.s("書"));
        List<Certificate> list = this.localCertificates;
        b03 = kotlin.collections.b0.b0(list, 10);
        ArrayList arrayList2 = new ArrayList(b03);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(j((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
