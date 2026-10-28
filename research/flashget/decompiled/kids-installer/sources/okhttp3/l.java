package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

/* compiled from: ConnectionSpec.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u000b\u0018\u0000 \u001d2\u00020\u0001:\u0002\t\rB9\b\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001f\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001f¢\u0006\u0004\b(\u0010)J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0017\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0002J\u0013\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u0017\u0010\u001c\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u001e\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001d\u0010\u000eR\u001c\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u001c\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0019\u0010%\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078G¢\u0006\u0006\u001a\u0004\b$\u0010\nR\u0019\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00078G¢\u0006\u0006\u001a\u0004\b&\u0010\n¨\u0006*"}, d2 = {"Lokhttp3/l;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "isFallback", "j", "", "Lokhttp3/i;", "a", "()Ljava/util/List;", "Lokhttp3/j0;", "c", "b", "()Z", "Lkotlin/m2;", "f", "(Ljavax/net/ssl/SSLSocket;Z)V", "socket", "h", "other", "equals", "", "hashCode", "", "toString", "Z", "i", "isTls", "k", "supportsTlsExtensions", "", "[Ljava/lang/String;", "cipherSuitesAsString", "d", "tlsVersionsAsString", "g", "cipherSuites", "l", "tlsVersions", "<init>", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    private static final i[] f31459e;

    /* renamed from: f, reason: collision with root package name */
    private static final i[] f31460f;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final l f31461g;

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final l f31462h;

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final l f31463i;

    /* renamed from: j, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final l f31464j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isTls;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean supportsTlsExtensions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String[] cipherSuitesAsString;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String[] tlsVersionsAsString;

    /* compiled from: ConnectionSpec.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b%\u0010\u001aB\u0011\b\u0016\u0012\u0006\u0010&\u001a\u00020\u0014¢\u0006\u0004\b%\u0010'J\u0006\u0010\u0002\u001a\u00020\u0000J!\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\u00020\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0003\"\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000b\u001a\u00020\u0000J!\u0010\u000e\u001a\u00020\u00002\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0003\"\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00002\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0003\"\u00020\b¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0006\u0010\u0015\u001a\u00020\u0014R\"\u0010\u001b\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\"\u0010\u0012\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0016\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001a¨\u0006("}, d2 = {"Lokhttp3/l$a;", "", "a", "", "Lokhttp3/i;", "cipherSuites", "e", "([Lokhttp3/i;)Lokhttp3/l$a;", "", "d", "([Ljava/lang/String;)Lokhttp3/l$a;", "b", "Lokhttp3/j0;", "tlsVersions", "p", "([Lokhttp3/j0;)Lokhttp3/l$a;", "o", "", "supportsTlsExtensions", "n", "Lokhttp3/l;", "c", "Z", "h", "()Z", "l", "(Z)V", "tls", "[Ljava/lang/String;", "f", "()[Ljava/lang/String;", "j", "([Ljava/lang/String;)V", "i", "m", "g", "k", "<init>", "connectionSpec", "(Lokhttp3/l;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean tls;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private String[] cipherSuites;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private String[] tlsVersions;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean supportsTlsExtensions;

        public a(boolean z5) {
            this.tls = z5;
        }

        @d5.d
        public final a a() {
            if (!this.tls) {
                throw new IllegalArgumentException(ProtectedSandApp.s("昪").toString());
            }
            this.cipherSuites = null;
            return this;
        }

        @d5.d
        public final a b() {
            if (!this.tls) {
                throw new IllegalArgumentException(ProtectedSandApp.s("昫").toString());
            }
            this.tlsVersions = null;
            return this;
        }

        @d5.d
        public final l c() {
            return new l(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }

        @d5.d
        public final a d(@d5.d String... cipherSuites) {
            kotlin.jvm.internal.l0.p(cipherSuites, ProtectedSandApp.s("昬"));
            if (!this.tls) {
                throw new IllegalArgumentException(ProtectedSandApp.s("是").toString());
            }
            if (!(!(cipherSuites.length == 0))) {
                throw new IllegalArgumentException(ProtectedSandApp.s("昮").toString());
            }
            Object clone = cipherSuites.clone();
            if (clone == null) {
                throw new NullPointerException(ProtectedSandApp.s("昭"));
            }
            this.cipherSuites = (String[]) clone;
            return this;
        }

        @d5.d
        public final a e(@d5.d i... cipherSuites) {
            kotlin.jvm.internal.l0.p(cipherSuites, ProtectedSandApp.s("昰"));
            if (!this.tls) {
                throw new IllegalArgumentException(ProtectedSandApp.s("昲").toString());
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (i iVar : cipherSuites) {
                arrayList.add(iVar.e());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException(ProtectedSandApp.s("昱"));
            }
            String[] strArr = (String[]) array;
            return d((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @d5.e
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

        @d5.e
        /* renamed from: i, reason: from getter */
        public final String[] getTlsVersions() {
            return this.tlsVersions;
        }

        public final void j(@d5.e String[] strArr) {
            this.cipherSuites = strArr;
        }

        public final void k(boolean z5) {
            this.supportsTlsExtensions = z5;
        }

        public final void l(boolean z5) {
            this.tls = z5;
        }

        public final void m(@d5.e String[] strArr) {
            this.tlsVersions = strArr;
        }

        @Deprecated(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        @d5.d
        public final a n(boolean supportsTlsExtensions) {
            if (!this.tls) {
                throw new IllegalArgumentException(ProtectedSandApp.s("昳").toString());
            }
            this.supportsTlsExtensions = supportsTlsExtensions;
            return this;
        }

        @d5.d
        public final a o(@d5.d String... tlsVersions) {
            kotlin.jvm.internal.l0.p(tlsVersions, ProtectedSandApp.s("昴"));
            if (!this.tls) {
                throw new IllegalArgumentException(ProtectedSandApp.s("昷").toString());
            }
            if (!(!(tlsVersions.length == 0))) {
                throw new IllegalArgumentException(ProtectedSandApp.s("昶").toString());
            }
            Object clone = tlsVersions.clone();
            if (clone == null) {
                throw new NullPointerException(ProtectedSandApp.s("昵"));
            }
            this.tlsVersions = (String[]) clone;
            return this;
        }

        @d5.d
        public final a p(@d5.d j0... tlsVersions) {
            kotlin.jvm.internal.l0.p(tlsVersions, ProtectedSandApp.s("昸"));
            if (!this.tls) {
                throw new IllegalArgumentException(ProtectedSandApp.s("昺").toString());
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (j0 j0Var : tlsVersions) {
                arrayList.add(j0Var.javaName());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException(ProtectedSandApp.s("昹"));
            }
            String[] strArr = (String[]) array;
            return o((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public a(@d5.d l lVar) {
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("昩"));
            this.tls = lVar.getIsTls();
            this.cipherSuites = lVar.cipherSuitesAsString;
            this.tlsVersions = lVar.tlsVersionsAsString;
            this.supportsTlsExtensions = lVar.k();
        }
    }

    static {
        i iVar = i.f30679n1;
        i iVar2 = i.f30682o1;
        i iVar3 = i.f30685p1;
        i iVar4 = i.Z0;
        i iVar5 = i.f30649d1;
        i iVar6 = i.f30640a1;
        i iVar7 = i.f30652e1;
        i iVar8 = i.f30670k1;
        i iVar9 = i.f30667j1;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        f31459e = iVarArr;
        i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, i.K0, i.L0, i.f30663i0, i.f30666j0, i.G, i.K, i.f30668k};
        f31460f = iVarArr2;
        a e6 = new a(true).e((i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        j0 j0Var = j0.TLS_1_3;
        j0 j0Var2 = j0.TLS_1_2;
        f31461g = e6.p(j0Var, j0Var2).n(true).c();
        f31462h = new a(true).e((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).p(j0Var, j0Var2).n(true).c();
        f31463i = new a(true).e((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).p(j0Var, j0Var2, j0.TLS_1_1, j0.TLS_1_0).n(true).c();
        f31464j = new a(false).c();
    }

    public l(boolean z5, boolean z6, @d5.e String[] strArr, @d5.e String[] strArr2) {
        this.isTls = z5;
        this.supportsTlsExtensions = z6;
        this.cipherSuitesAsString = strArr;
        this.tlsVersionsAsString = strArr2;
    }

    private final l j(SSLSocket sslSocket, boolean isFallback) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        Comparator q5;
        if (this.cipherSuitesAsString != null) {
            String[] enabledCipherSuites2 = sslSocket.getEnabledCipherSuites();
            kotlin.jvm.internal.l0.o(enabledCipherSuites2, ProtectedSandApp.s("晇"));
            String[] strArr = this.cipherSuitesAsString;
            i.INSTANCE.getClass();
            enabledCipherSuites = okhttp3.internal.d.I(enabledCipherSuites2, strArr, i.f30641b);
        } else {
            enabledCipherSuites = sslSocket.getEnabledCipherSuites();
        }
        if (this.tlsVersionsAsString != null) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            kotlin.jvm.internal.l0.o(enabledProtocols2, ProtectedSandApp.s("晈"));
            String[] strArr2 = this.tlsVersionsAsString;
            q5 = kotlin.comparisons.g.q();
            enabledProtocols = okhttp3.internal.d.I(enabledProtocols2, strArr2, q5);
        } else {
            enabledProtocols = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.l0.o(supportedCipherSuites, ProtectedSandApp.s("晉"));
        i.INSTANCE.getClass();
        int A = okhttp3.internal.d.A(supportedCipherSuites, ProtectedSandApp.s("晊"), i.f30641b);
        String s5 = ProtectedSandApp.s("晋");
        if (isFallback && A != -1) {
            kotlin.jvm.internal.l0.o(enabledCipherSuites, s5);
            String str = supportedCipherSuites[A];
            kotlin.jvm.internal.l0.o(str, ProtectedSandApp.s("晌"));
            enabledCipherSuites = okhttp3.internal.d.o(enabledCipherSuites, str);
        }
        a aVar = new a(this);
        kotlin.jvm.internal.l0.o(enabledCipherSuites, s5);
        a d6 = aVar.d((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        kotlin.jvm.internal.l0.o(enabledProtocols, ProtectedSandApp.s("晍"));
        return d6.o((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).c();
    }

    @p3.i(name = "-deprecated_cipherSuites")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cipherSuites", imports = {}))
    @d5.e
    public final List<i> a() {
        return g();
    }

    @p3.i(name = "-deprecated_supportsTlsExtensions")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "supportsTlsExtensions", imports = {}))
    /* renamed from: b, reason: from getter */
    public final boolean getSupportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    @p3.i(name = "-deprecated_tlsVersions")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "tlsVersions", imports = {}))
    @d5.e
    public final List<j0> c() {
        return l();
    }

    public boolean equals(@d5.e Object other) {
        if (!(other instanceof l)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        boolean z5 = this.isTls;
        l lVar = (l) other;
        if (z5 != lVar.isTls) {
            return false;
        }
        return !z5 || (Arrays.equals(this.cipherSuitesAsString, lVar.cipherSuitesAsString) && Arrays.equals(this.tlsVersionsAsString, lVar.tlsVersionsAsString) && this.supportsTlsExtensions == lVar.supportsTlsExtensions);
    }

    public final void f(@d5.d SSLSocket sslSocket, boolean isFallback) {
        kotlin.jvm.internal.l0.p(sslSocket, ProtectedSandApp.s("晎"));
        l j5 = j(sslSocket, isFallback);
        if (j5.l() != null) {
            sslSocket.setEnabledProtocols(j5.tlsVersionsAsString);
        }
        if (j5.g() != null) {
            sslSocket.setEnabledCipherSuites(j5.cipherSuitesAsString);
        }
    }

    @p3.i(name = "cipherSuites")
    @d5.e
    public final List<i> g() {
        List<i> V5;
        String[] strArr = this.cipherSuitesAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(i.INSTANCE.b(str));
        }
        V5 = kotlin.collections.j0.V5(arrayList);
        return V5;
    }

    public final boolean h(@d5.d SSLSocket socket) {
        Comparator q5;
        kotlin.jvm.internal.l0.p(socket, ProtectedSandApp.s("晏"));
        if (!this.isTls) {
            return false;
        }
        String[] strArr = this.tlsVersionsAsString;
        if (strArr != null) {
            String[] enabledProtocols = socket.getEnabledProtocols();
            q5 = kotlin.comparisons.g.q();
            if (!okhttp3.internal.d.w(strArr, enabledProtocols, q5)) {
                return false;
            }
        }
        String[] strArr2 = this.cipherSuitesAsString;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = socket.getEnabledCipherSuites();
        i.INSTANCE.getClass();
        return okhttp3.internal.d.w(strArr2, enabledCipherSuites, i.f30641b);
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

    @p3.i(name = "isTls")
    /* renamed from: i, reason: from getter */
    public final boolean getIsTls() {
        return this.isTls;
    }

    @p3.i(name = "supportsTlsExtensions")
    public final boolean k() {
        return this.supportsTlsExtensions;
    }

    @p3.i(name = "tlsVersions")
    @d5.e
    public final List<j0> l() {
        List<j0> V5;
        String[] strArr = this.tlsVersionsAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(j0.INSTANCE.a(str));
        }
        V5 = kotlin.collections.j0.V5(arrayList);
        return V5;
    }

    @d5.d
    public String toString() {
        if (!this.isTls) {
            return ProtectedSandApp.s("晐");
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("晑"));
        List<i> g5 = g();
        String s5 = ProtectedSandApp.s("晒");
        sb.append(Objects.toString(g5, s5));
        sb.append(ProtectedSandApp.s("晓"));
        sb.append(Objects.toString(l(), s5));
        sb.append(ProtectedSandApp.s("晔"));
        sb.append(this.supportsTlsExtensions);
        sb.append(')');
        return sb.toString();
    }
}
