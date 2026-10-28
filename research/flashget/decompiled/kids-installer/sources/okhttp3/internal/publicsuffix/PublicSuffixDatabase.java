package okhttp3.internal.publicsuffix;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import d5.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.collections.z;
import kotlin.io.b;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.m2;
import kotlin.sequences.Sequence;
import kotlin.text.h0;
import okhttp3.internal.platform.j;
import okio.a0;
import okio.o;
import okio.v;
import org.apache.commons.io.k;

/* compiled from: PublicSuffixDatabase.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "", "domain", "", "i", "domainLabels", "d", "Lkotlin/m2;", "g", "f", "e", "", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "h", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/CountDownLatch;", "b", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "c", "[B", "<init>", "()V", "j", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class PublicSuffixDatabase {

    /* renamed from: g, reason: collision with root package name */
    private static final List<String> f31330g;

    /* renamed from: h, reason: collision with root package name */
    private static final char f31331h = '!';

    /* renamed from: i, reason: collision with root package name */
    private static final PublicSuffixDatabase f31332i;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean listRead = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private byte[] publicSuffixListBytes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private byte[] publicSuffixExceptionListBytes;

    /* renamed from: e, reason: collision with root package name */
    @d
    public static final String f31328e = ProtectedSandApp.s("旎");

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f31329f = {(byte) 42};

    /* compiled from: PublicSuffixDatabase.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$a;", "", "", "", "labels", "", "labelIndex", "", "b", "([B[[BI)Ljava/lang/String;", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "c", "", "EXCEPTION_MARKER", "C", "", "PREVAILING_RULE", "Ljava/util/List;", "PUBLIC_SUFFIX_RESOURCE", "Ljava/lang/String;", "WILDCARD_LABEL", "[B", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(byte[] bArr, byte[][] bArr2, int i5) {
            int i6;
            boolean z5;
            int b6;
            int b7;
            int length = bArr.length;
            int i7 = 0;
            while (i7 < length) {
                int i8 = (i7 + length) / 2;
                while (i8 > -1 && bArr[i8] != ((byte) 10)) {
                    i8--;
                }
                int i9 = i8 + 1;
                int i10 = 1;
                while (true) {
                    i6 = i9 + i10;
                    if (bArr[i6] == ((byte) 10)) {
                        break;
                    }
                    i10++;
                }
                int i11 = i6 - i9;
                int i12 = i5;
                boolean z6 = false;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (z6) {
                        b6 = 46;
                        z5 = false;
                    } else {
                        z5 = z6;
                        b6 = okhttp3.internal.d.b(bArr2[i12][i13], 255);
                    }
                    b7 = b6 - okhttp3.internal.d.b(bArr[i9 + i14], 255);
                    if (b7 != 0) {
                        break;
                    }
                    i14++;
                    i13++;
                    if (i14 == i11) {
                        break;
                    }
                    if (bArr2[i12].length != i13) {
                        z6 = z5;
                    } else {
                        if (i12 == bArr2.length - 1) {
                            break;
                        }
                        i12++;
                        i13 = -1;
                        z6 = true;
                    }
                }
                if (b7 >= 0) {
                    if (b7 <= 0) {
                        int i15 = i11 - i14;
                        int length2 = bArr2[i12].length - i13;
                        int length3 = bArr2.length;
                        for (int i16 = i12 + 1; i16 < length3; i16++) {
                            length2 += bArr2[i16].length;
                        }
                        if (length2 >= i15) {
                            if (length2 <= i15) {
                                Charset charset = StandardCharsets.UTF_8;
                                l0.o(charset, ProtectedSandApp.s("旍"));
                                return new String(bArr, i9, i11, charset);
                            }
                        }
                    }
                    i7 = i6 + 1;
                }
                length = i9 - 1;
            }
            return null;
        }

        @d
        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f31332i;
        }

        public Companion(w wVar) {
        }
    }

    static {
        List<String> k5;
        k5 = z.k(ProtectedSandApp.s("族"));
        f31330g = k5;
        f31332i = new PublicSuffixDatabase();
    }

    public static final /* synthetic */ byte[] b(PublicSuffixDatabase publicSuffixDatabase) {
        byte[] bArr = publicSuffixDatabase.publicSuffixListBytes;
        if (bArr == null) {
            l0.S(ProtectedSandApp.s("旐"));
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f2, code lost:
    
        r4 = kotlin.text.h0.Q4(r8, new char[]{org.apache.commons.io.k.f32026a}, false, 0, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0107, code lost:
    
        r1 = kotlin.text.h0.Q4(r5, new char[]{org.apache.commons.io.k.f32026a}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<java.lang.String> d(java.util.List<java.lang.String> r18) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.d(java.util.List):java.util.List");
    }

    private final void f() throws IOException {
        InputStream stoyCEb = ProtectedSandApp.stoyCEb(PublicSuffixDatabase.class, ProtectedSandApp.s("旘"));
        if (stoyCEb == null) {
            return;
        }
        o d6 = a0.d(new v(a0.m(stoyCEb)));
        try {
            byte[] K0 = d6.K0(d6.readInt());
            byte[] K02 = d6.K0(d6.readInt());
            m2 m2Var = m2.f23662a;
            b.a(d6, null);
            synchronized (this) {
                l0.m(K0);
                this.publicSuffixListBytes = K0;
                l0.m(K02);
                this.publicSuffixExceptionListBytes = K02;
            }
            this.readCompleteLatch.countDown();
        } finally {
        }
    }

    private final void g() {
        boolean z5 = false;
        while (true) {
            try {
                try {
                    f();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z5 = true;
                } catch (IOException e6) {
                    j.INSTANCE.getClass();
                    j.f31323a.m(ProtectedSandApp.s("旙"), 5, e6);
                    if (z5) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> i(String domain) {
        List<String> Q4;
        Object p32;
        List<String> d22;
        Q4 = h0.Q4(domain, new char[]{k.f32026a}, false, 0, 6, null);
        p32 = j0.p3(Q4);
        if (!l0.g((String) p32, "")) {
            return Q4;
        }
        d22 = j0.d2(Q4, 1);
        return d22;
    }

    @e
    public final String e(@d String domain) {
        int size;
        int size2;
        Sequence A1;
        Sequence k02;
        String e12;
        l0.p(domain, ProtectedSandApp.s("旚"));
        String unicode = IDN.toUnicode(domain);
        l0.o(unicode, ProtectedSandApp.s("旛"));
        List<String> i5 = i(unicode);
        List<String> d6 = d(i5);
        if (i5.size() == d6.size() && d6.get(0).charAt(0) != '!') {
            return null;
        }
        if (d6.get(0).charAt(0) == '!') {
            size = i5.size();
            size2 = d6.size();
        } else {
            size = i5.size();
            size2 = d6.size() + 1;
        }
        A1 = j0.A1(i(domain));
        k02 = kotlin.sequences.v.k0(A1, size - size2);
        e12 = kotlin.sequences.v.e1(k02, ProtectedSandApp.s("旜"), null, null, 0, null, null, 62, null);
        return e12;
    }

    public final void h(@d byte[] bArr, @d byte[] bArr2) {
        l0.p(bArr, ProtectedSandApp.s("旝"));
        l0.p(bArr2, ProtectedSandApp.s("旞"));
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
