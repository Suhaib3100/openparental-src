package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.x0;

/* compiled from: ConnectionSpec.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 (2\u00020\u0001:\u0002\u0012\u0016B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010&\u001a\u0004\b(\u0010\u0017R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0019\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108G¢\u0006\u0006\u001a\u0004\b+\u0010\u0013R\u0019\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00108G¢\u0006\u0006\u001a\u0004\b-\u0010\u0013¨\u0006/"}, d2 = {"Lokhttp3/l;", "", "", "isTls", "supportsTlsExtensions", "", "", "cipherSuitesAsString", "tlsVersionsAsString", "<init>", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "isFallback", "j", "(Ljavax/net/ssl/SSLSocket;Z)Lokhttp3/l;", "", "Lokhttp3/i;", "a", "()Ljava/util/List;", "Lokhttp3/i0;", "c", "b", "()Z", "Lkotlin/k2;", "f", "(Ljavax/net/ssl/SSLSocket;Z)V", "socket", "h", "(Ljavax/net/ssl/SSLSocket;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Z", "i", "k", "[Ljava/lang/String;", "d", "g", "cipherSuites", "l", "tlsVersions", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    private static final i[] f85003e;

    /* renamed from: f, reason: collision with root package name */
    private static final i[] f85004f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final l f85005g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final l f85006h;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final l f85007i;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final l f85008j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isTls;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean supportsTlsExtensions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String[] cipherSuitesAsString;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String[] tlsVersionsAsString;

    /* compiled from: ConnectionSpec.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\r\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\u00002\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00002\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b\"\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\nJ!\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u000b\"\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00002\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b\"\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0005R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\"\u0010\u0019\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\u0005¨\u0006+"}, d2 = {"Lokhttp3/l$a;", "", "", "tls", "<init>", "(Z)V", "Lokhttp3/l;", "connectionSpec", "(Lokhttp3/l;)V", "a", "()Lokhttp3/l$a;", "", "Lokhttp3/i;", "cipherSuites", "e", "([Lokhttp3/i;)Lokhttp3/l$a;", "", "d", "([Ljava/lang/String;)Lokhttp3/l$a;", "b", "Lokhttp3/i0;", "tlsVersions", "p", "([Lokhttp3/i0;)Lokhttp3/l$a;", "o", "supportsTlsExtensions", "n", "(Z)Lokhttp3/l$a;", "c", "()Lokhttp3/l;", "Z", "h", "()Z", "l", "[Ljava/lang/String;", "f", "()[Ljava/lang/String;", "j", "([Ljava/lang/String;)V", "i", "m", "g", "k", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean tls;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private String[] cipherSuites;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private String[] tlsVersions;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean supportsTlsExtensions;

        public a(boolean z4) {
            this.tls = z4;
        }

        @fg.l
        public final a a() {
            if (!this.tls) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ꆧ\u0001"));
            }
            this.cipherSuites = null;
            return this;
        }

        @fg.l
        public final a b() {
            if (!this.tls) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ꆨ\u0001"));
            }
            this.tlsVersions = null;
            return this;
        }

        @fg.l
        public final l c() {
            return new l(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }

        @fg.l
        public final a d(@fg.l String... cipherSuites) {
            l0.p(cipherSuites, ProtectedSandApp.s("ꆩ\u0001"));
            if (!this.tls) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ꆧ\u0001"));
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ꆫ\u0001"));
            }
            Object clone = cipherSuites.clone();
            if (clone == null) {
                throw new NullPointerException(ProtectedSandApp.s("ꆪ\u0001"));
            }
            this.cipherSuites = (String[]) clone;
            return this;
        }

        @fg.l
        public final a e(@fg.l i... cipherSuites) {
            l0.p(cipherSuites, ProtectedSandApp.s("ꆩ\u0001"));
            if (!this.tls) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ꆧ\u0001"));
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (i iVar : cipherSuites) {
                arrayList.add(iVar.e());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException(ProtectedSandApp.s("ꆬ\u0001"));
            }
            String[] strArr = (String[]) array;
            return d((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @fg.m
        /* renamed from: f, reason: from getter */
        public final String[] getCipherSuites() {
            return this.cipherSuites;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getSupportsTlsExtensions() {
            return this.supportsTlsExtensions;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getTls() {
            return this.tls;
        }

        @fg.m
        /* renamed from: i, reason: from getter */
        public final String[] getTlsVersions() {
            return this.tlsVersions;
        }

        public final void j(@fg.m String[] strArr) {
            this.cipherSuites = strArr;
        }

        public final void k(boolean z4) {
            this.supportsTlsExtensions = z4;
        }

        public final void l(boolean z4) {
            this.tls = z4;
        }

        public final void m(@fg.m String[] strArr) {
            this.tlsVersions = strArr;
        }

        @fg.l
        @kotlin.k(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        public final a n(boolean supportsTlsExtensions) {
            if (!this.tls) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ꆭ\u0001"));
            }
            this.supportsTlsExtensions = supportsTlsExtensions;
            return this;
        }

        @fg.l
        public final a o(@fg.l String... tlsVersions) {
            l0.p(tlsVersions, ProtectedSandApp.s("ꆮ\u0001"));
            if (!this.tls) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ꆨ\u0001"));
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ꆯ\u0001"));
            }
            Object clone = tlsVersions.clone();
            if (clone == null) {
                throw new NullPointerException(ProtectedSandApp.s("ꆪ\u0001"));
            }
            this.tlsVersions = (String[]) clone;
            return this;
        }

        @fg.l
        public final a p(@fg.l i0... tlsVersions) {
            l0.p(tlsVersions, ProtectedSandApp.s("ꆮ\u0001"));
            if (!this.tls) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ꆨ\u0001"));
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (i0 i0Var : tlsVersions) {
                arrayList.add(i0Var.javaName());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException(ProtectedSandApp.s("ꆬ\u0001"));
            }
            String[] strArr = (String[]) array;
            return o((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public a(@fg.l l lVar) {
            l0.p(lVar, ProtectedSandApp.s("ꆦ\u0001"));
            this.tls = lVar.getIsTls();
            this.cipherSuites = lVar.cipherSuitesAsString;
            this.tlsVersions = lVar.tlsVersionsAsString;
            this.supportsTlsExtensions = lVar.k();
        }
    }

    static {
        i iVar = i.f84190n1;
        i iVar2 = i.f84193o1;
        i iVar3 = i.f84196p1;
        i iVar4 = i.Z0;
        i iVar5 = i.f84160d1;
        i iVar6 = i.f84151a1;
        i iVar7 = i.f84163e1;
        i iVar8 = i.f84181k1;
        i iVar9 = i.f84178j1;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        f85003e = iVarArr;
        i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, i.K0, i.L0, i.f84174i0, i.f84177j0, i.G, i.K, i.f84179k};
        f85004f = iVarArr2;
        a e4 = new a(true).e((i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        i0 i0Var = i0.TLS_1_3;
        i0 i0Var2 = i0.TLS_1_2;
        f85005g = e4.p(i0Var, i0Var2).n(true).c();
        f85006h = new a(true).e((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).p(i0Var, i0Var2).n(true).c();
        f85007i = new a(true).e((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).p(i0Var, i0Var2, i0.TLS_1_1, i0.TLS_1_0).n(true).c();
        f85008j = new a(false).c();
    }

    public l(boolean z4, boolean z5, @fg.m String[] strArr, @fg.m String[] strArr2) {
        this.isTls = z4;
        this.supportsTlsExtensions = z5;
        this.cipherSuitesAsString = strArr;
        this.tlsVersionsAsString = strArr2;
    }

    private final l j(SSLSocket sslSocket, boolean isFallback) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.cipherSuitesAsString != null) {
            String[] enabledCipherSuites2 = sslSocket.getEnabledCipherSuites();
            l0.o(enabledCipherSuites2, ProtectedSandApp.s("ꆰ\u0001"));
            String[] strArr = this.cipherSuitesAsString;
            i.INSTANCE.getClass();
            enabledCipherSuites = okhttp3.internal.d.I(enabledCipherSuites2, strArr, i.f84152b);
        } else {
            enabledCipherSuites = sslSocket.getEnabledCipherSuites();
        }
        if (this.tlsVersionsAsString != null) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            l0.o(enabledProtocols2, ProtectedSandApp.s("ꆱ\u0001"));
            enabledProtocols = okhttp3.internal.d.I(enabledProtocols2, this.tlsVersionsAsString, kotlin.comparisons.a.q());
        } else {
            enabledProtocols = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        l0.o(supportedCipherSuites, ProtectedSandApp.s("ꆲ\u0001"));
        i.INSTANCE.getClass();
        int A = okhttp3.internal.d.A(supportedCipherSuites, ProtectedSandApp.s("ꆳ\u0001"), i.f84152b);
        String s4 = ProtectedSandApp.s("ꆴ\u0001");
        if (isFallback && A != -1) {
            l0.o(enabledCipherSuites, s4);
            String str = supportedCipherSuites[A];
            l0.o(str, ProtectedSandApp.s("ꆵ\u0001"));
            enabledCipherSuites = okhttp3.internal.d.o(enabledCipherSuites, str);
        }
        a aVar = new a(this);
        l0.o(enabledCipherSuites, s4);
        a d5 = aVar.d((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        l0.o(enabledProtocols, ProtectedSandApp.s("ꆶ\u0001"));
        return d5.o((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).c();
    }

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "cipherSuites", imports = {}))
    @kd.i(name = "-deprecated_cipherSuites")
    public final List<i> a() {
        return g();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "supportsTlsExtensions", imports = {}))
    @kd.i(name = "-deprecated_supportsTlsExtensions")
    /* renamed from: b, reason: from getter */
    public final boolean getSupportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "tlsVersions", imports = {}))
    @kd.i(name = "-deprecated_tlsVersions")
    public final List<i0> c() {
        return l();
    }

    public boolean equals(@fg.m Object other) {
        if (!(other instanceof l)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        boolean z4 = this.isTls;
        l lVar = (l) other;
        if (z4 != lVar.isTls) {
            return false;
        }
        return !z4 || (Arrays.equals(this.cipherSuitesAsString, lVar.cipherSuitesAsString) && Arrays.equals(this.tlsVersionsAsString, lVar.tlsVersionsAsString) && this.supportsTlsExtensions == lVar.supportsTlsExtensions);
    }

    public final void f(@fg.l SSLSocket sslSocket, boolean isFallback) {
        l0.p(sslSocket, ProtectedSandApp.s("ꆷ\u0001"));
        l j4 = j(sslSocket, isFallback);
        if (j4.l() != null) {
            sslSocket.setEnabledProtocols(j4.tlsVersionsAsString);
        }
        if (j4.g() != null) {
            sslSocket.setEnabledCipherSuites(j4.cipherSuitesAsString);
        }
    }

    @fg.m
    @kd.i(name = "cipherSuites")
    public final List<i> g() {
        String[] strArr = this.cipherSuitesAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(i.INSTANCE.b(str));
        }
        return kotlin.collections.w.V5(arrayList);
    }

    public final boolean h(@fg.l SSLSocket socket) {
        l0.p(socket, ProtectedSandApp.s("ꆸ\u0001"));
        if (!this.isTls) {
            return false;
        }
        String[] strArr = this.tlsVersionsAsString;
        if (strArr != null && !okhttp3.internal.d.w(strArr, socket.getEnabledProtocols(), kotlin.comparisons.a.q())) {
            return false;
        }
        String[] strArr2 = this.cipherSuitesAsString;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = socket.getEnabledCipherSuites();
        i.INSTANCE.getClass();
        return okhttp3.internal.d.w(strArr2, enabledCipherSuites, i.f84152b);
    }

    public int hashCode() {
        if (!this.isTls) {
            return 17;
        }
        String[] strArr = this.cipherSuitesAsString;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.tlsVersionsAsString;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
    }

    @kd.i(name = "isTls")
    /* renamed from: i, reason: from getter */
    public final boolean getIsTls() {
        return this.isTls;
    }

    @kd.i(name = "supportsTlsExtensions")
    public final boolean k() {
        return this.supportsTlsExtensions;
    }

    @fg.m
    @kd.i(name = "tlsVersions")
    public final List<i0> l() {
        String[] strArr = this.tlsVersionsAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(i0.INSTANCE.a(str));
        }
        return kotlin.collections.w.V5(arrayList);
    }

    @fg.l
    public String toString() {
        if (!this.isTls) {
            return ProtectedSandApp.s("ꆹ\u0001");
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꆺ\u0001"));
        List<i> g4 = g();
        String s4 = ProtectedSandApp.s("ꆻ\u0001");
        sb.append(Objects.toString(g4, s4));
        sb.append(ProtectedSandApp.s("ꆼ\u0001"));
        sb.append(Objects.toString(l(), s4));
        sb.append(ProtectedSandApp.s("ꆽ\u0001"));
        return androidx.compose.animation.l.a(sb, this.supportsTlsExtensions, ')');
    }
}
