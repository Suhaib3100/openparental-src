package okhttp3.internal.publicsuffix;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
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
import kotlin.collections.w;
import kotlin.io.b;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import kotlin.sequences.p;
import kotlin.text.v;
import okhttp3.internal.d;
import okhttp3.internal.platform.j;
import okio.a0;
import okio.o;

/* compiled from: PublicSuffixDatabase.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u001f¨\u0006!"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "", "domain", "", "i", "(Ljava/lang/String;)Ljava/util/List;", "domainLabels", "d", "(Ljava/util/List;)Ljava/util/List;", "Lkotlin/k2;", "g", "f", "e", "(Ljava/lang/String;)Ljava/lang/String;", "", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "h", "([B[B)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/CountDownLatch;", "b", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "c", "[B", "j", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {

    /* renamed from: h, reason: collision with root package name */
    private static final char f84871h = '!';

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean listRead = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private byte[] publicSuffixListBytes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private byte[] publicSuffixExceptionListBytes;

    /* renamed from: e, reason: collision with root package name */
    @l
    public static final String f84868e = ProtectedSandApp.s("Ṵ");

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f84869f = {(byte) 42};

    /* renamed from: g, reason: collision with root package name */
    private static final List<String> f84870g = w.k(ProtectedSandApp.s("ṵ"));

    /* renamed from: i, reason: collision with root package name */
    private static final PublicSuffixDatabase f84872i = new PublicSuffixDatabase();

    /* compiled from: PublicSuffixDatabase.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$a;", "", "<init>", "()V", "", "", "labels", "", "labelIndex", "", "b", "([B[[BI)Ljava/lang/String;", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "c", "()Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "EXCEPTION_MARKER", "C", "", "PREVAILING_RULE", "Ljava/util/List;", "PUBLIC_SUFFIX_RESOURCE", "Ljava/lang/String;", "WILDCARD_LABEL", "[B", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(byte[] bArr, byte[][] bArr2, int i4) {
            int i5;
            int b5;
            boolean z4;
            int b6;
            int length = bArr.length;
            int i6 = 0;
            while (i6 < length) {
                int i7 = (i6 + length) / 2;
                while (i7 > -1 && bArr[i7] != ((byte) 10)) {
                    i7--;
                }
                int i10 = i7 + 1;
                int i11 = 1;
                while (true) {
                    i5 = i10 + i11;
                    if (bArr[i5] == ((byte) 10)) {
                        break;
                    }
                    i11++;
                }
                int i12 = i5 - i10;
                int i13 = i4;
                boolean z5 = false;
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    if (z5) {
                        b5 = 46;
                        z4 = false;
                    } else {
                        boolean z6 = z5;
                        b5 = d.b(bArr2[i13][i14], 255);
                        z4 = z6;
                    }
                    b6 = b5 - d.b(bArr[i10 + i15], 255);
                    if (b6 != 0) {
                        break;
                    }
                    i15++;
                    i14++;
                    if (i15 == i12) {
                        break;
                    }
                    if (bArr2[i13].length != i14) {
                        z5 = z4;
                    } else {
                        if (i13 == bArr2.length - 1) {
                            break;
                        }
                        i13++;
                        z5 = true;
                        i14 = -1;
                    }
                }
                if (b6 >= 0) {
                    if (b6 <= 0) {
                        int i16 = i12 - i15;
                        int length2 = bArr2[i13].length - i14;
                        int length3 = bArr2.length;
                        for (int i17 = i13 + 1; i17 < length3; i17++) {
                            length2 += bArr2[i17].length;
                        }
                        if (length2 >= i16) {
                            if (length2 <= i16) {
                                Charset charset = StandardCharsets.UTF_8;
                                l0.o(charset, ProtectedSandApp.s("ṳ"));
                                return new String(bArr, i10, i12, charset);
                            }
                        }
                    }
                    i6 = i5 + 1;
                }
                length = i7;
            }
            return null;
        }

        @l
        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f84872i;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public static final /* synthetic */ byte[] b(PublicSuffixDatabase publicSuffixDatabase) {
        byte[] bArr = publicSuffixDatabase.publicSuffixListBytes;
        if (bArr == null) {
            l0.S(ProtectedSandApp.s("Ṷ"));
        }
        return bArr;
    }

    private final List<String> d(List<String> domainLabels) {
        String s4;
        String str;
        String str2;
        String str3;
        List<String> list;
        List<String> list2;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            g();
        }
        if (!(this.publicSuffixListBytes != null)) {
            throw new IllegalStateException(ProtectedSandApp.s("Ṽ"));
        }
        int size = domainLabels.size();
        byte[][] bArr = new byte[size][];
        for (int i4 = 0; i4 < size; i4++) {
            String str4 = domainLabels.get(i4);
            Charset charset = StandardCharsets.UTF_8;
            l0.o(charset, ProtectedSandApp.s("ṷ"));
            if (str4 == null) {
                throw new NullPointerException(ProtectedSandApp.s("ṹ"));
            }
            byte[] bytes = str4.getBytes(charset);
            l0.o(bytes, ProtectedSandApp.s("Ṹ"));
            bArr[i4] = bytes;
        }
        int i5 = 0;
        while (true) {
            s4 = ProtectedSandApp.s("Ṷ");
            str = null;
            if (i5 >= size) {
                str2 = null;
                break;
            }
            Companion companion = INSTANCE;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                l0.S(s4);
            }
            str2 = companion.b(bArr2, bArr, i5);
            if (str2 != null) {
                break;
            }
            i5++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i6 = 0; i6 < length; i6++) {
                bArr3[i6] = f84869f;
                Companion companion2 = INSTANCE;
                byte[] bArr4 = this.publicSuffixListBytes;
                if (bArr4 == null) {
                    l0.S(s4);
                }
                String b5 = companion2.b(bArr4, bArr3, i6);
                if (b5 != null) {
                    str3 = b5;
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            int i7 = size - 1;
            int i10 = 0;
            while (true) {
                if (i10 >= i7) {
                    break;
                }
                Companion companion3 = INSTANCE;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    l0.S(ProtectedSandApp.s("Ṻ"));
                }
                String b6 = companion3.b(bArr5, bArr, i10);
                if (b6 != null) {
                    str = b6;
                    break;
                }
                i10++;
            }
        }
        if (str != null) {
            return v.Q4(ProtectedSandApp.s("ṻ").concat(str), new char[]{'.'}, false, 0, 6, null);
        }
        if (str2 == null && str3 == null) {
            return f84870g;
        }
        if (str2 == null || (list = v.Q4(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            list = j0.f74919b;
        }
        if (str3 == null || (list2 = v.Q4(str3, new char[]{'.'}, false, 0, 6, null)) == null) {
            list2 = j0.f74919b;
        }
        return list.size() > list2.size() ? list : list2;
    }

    private final void f() throws IOException {
        InputStream a5 = ProtectedSandApp.a(PublicSuffixDatabase.class, ProtectedSandApp.s("Ṵ"));
        if (a5 == null) {
            return;
        }
        o d5 = a0.d(new okio.v(a0.m(a5)));
        try {
            byte[] q12 = d5.q1(d5.readInt());
            byte[] q13 = d5.q1(d5.readInt());
            k2 k2Var = k2.f75408a;
            b.a(d5, null);
            synchronized (this) {
                l0.m(q12);
                this.publicSuffixListBytes = q12;
                l0.m(q13);
                this.publicSuffixExceptionListBytes = q13;
            }
            this.readCompleteLatch.countDown();
        } finally {
        }
    }

    private final void g() {
        boolean z4 = false;
        while (true) {
            try {
                try {
                    f();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z4 = true;
                } catch (IOException e4) {
                    j.INSTANCE.getClass();
                    j.f84863a.m(ProtectedSandApp.s("ṽ"), 5, e4);
                    if (z4) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> i(String domain) {
        List<String> Q4 = v.Q4(domain, new char[]{'.'}, false, 0, 6, null);
        return l0.g((String) w.p3(Q4), "") ? w.d2(Q4, 1) : Q4;
    }

    @m
    public final String e(@l String domain) {
        int size;
        int size2;
        l0.p(domain, ProtectedSandApp.s("Ṿ"));
        String unicode = IDN.toUnicode(domain);
        l0.o(unicode, ProtectedSandApp.s("ṿ"));
        List<String> i4 = i(unicode);
        List<String> d5 = d(i4);
        if (i4.size() == d5.size() && d5.get(0).charAt(0) != '!') {
            return null;
        }
        if (d5.get(0).charAt(0) == '!') {
            size = i4.size();
            size2 = d5.size();
        } else {
            size = i4.size();
            size2 = d5.size() + 1;
        }
        return p.e1(p.k0(w.A1(i(domain)), size - size2), ProtectedSandApp.s("Ẁ"), null, null, 0, null, null, 62, null);
    }

    public final void h(@l byte[] publicSuffixListBytes, @l byte[] publicSuffixExceptionListBytes) {
        l0.p(publicSuffixListBytes, ProtectedSandApp.s("Ṷ"));
        l0.p(publicSuffixExceptionListBytes, ProtectedSandApp.s("Ṻ"));
        this.publicSuffixListBytes = publicSuffixListBytes;
        this.publicSuffixExceptionListBytes = publicSuffixExceptionListBytes;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
