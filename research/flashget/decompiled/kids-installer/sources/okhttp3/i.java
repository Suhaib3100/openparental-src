package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: CipherSuite.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\r"}, d2 = {"Lokhttp3/i;", "", "", "a", "()Ljava/lang/String;", "toString", "Ljava/lang/String;", "e", "javaName", "<init>", "(Ljava/lang/String;)V", "s1", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class i {

    @d5.d
    @p3.f
    public static final i A;

    @d5.d
    @p3.f
    public static final i A0;

    @d5.d
    @p3.f
    public static final i B;

    @d5.d
    @p3.f
    public static final i B0;

    @d5.d
    @p3.f
    public static final i C;

    @d5.d
    @p3.f
    public static final i C0;

    @d5.d
    @p3.f
    public static final i D;

    @d5.d
    @p3.f
    public static final i D0;

    @d5.d
    @p3.f
    public static final i E;

    @d5.d
    @p3.f
    public static final i E0;

    @d5.d
    @p3.f
    public static final i F;

    @d5.d
    @p3.f
    public static final i F0;

    @d5.d
    @p3.f
    public static final i G;

    @d5.d
    @p3.f
    public static final i G0;

    @d5.d
    @p3.f
    public static final i H;

    @d5.d
    @p3.f
    public static final i H0;

    @d5.d
    @p3.f
    public static final i I;

    @d5.d
    @p3.f
    public static final i I0;

    @d5.d
    @p3.f
    public static final i J;

    @d5.d
    @p3.f
    public static final i J0;

    @d5.d
    @p3.f
    public static final i K;

    @d5.d
    @p3.f
    public static final i K0;

    @d5.d
    @p3.f
    public static final i L;

    @d5.d
    @p3.f
    public static final i L0;

    @d5.d
    @p3.f
    public static final i M;

    @d5.d
    @p3.f
    public static final i M0;

    @d5.d
    @p3.f
    public static final i N;

    @d5.d
    @p3.f
    public static final i N0;

    @d5.d
    @p3.f
    public static final i O;

    @d5.d
    @p3.f
    public static final i O0;

    @d5.d
    @p3.f
    public static final i P;

    @d5.d
    @p3.f
    public static final i P0;

    @d5.d
    @p3.f
    public static final i Q;

    @d5.d
    @p3.f
    public static final i Q0;

    @d5.d
    @p3.f
    public static final i R;

    @d5.d
    @p3.f
    public static final i R0;

    @d5.d
    @p3.f
    public static final i S;

    @d5.d
    @p3.f
    public static final i S0;

    @d5.d
    @p3.f
    public static final i T;

    @d5.d
    @p3.f
    public static final i T0;

    @d5.d
    @p3.f
    public static final i U;

    @d5.d
    @p3.f
    public static final i U0;

    @d5.d
    @p3.f
    public static final i V;

    @d5.d
    @p3.f
    public static final i V0;

    @d5.d
    @p3.f
    public static final i W;

    @d5.d
    @p3.f
    public static final i W0;

    @d5.d
    @p3.f
    public static final i X;

    @d5.d
    @p3.f
    public static final i X0;

    @d5.d
    @p3.f
    public static final i Y;

    @d5.d
    @p3.f
    public static final i Y0;

    @d5.d
    @p3.f
    public static final i Z;

    @d5.d
    @p3.f
    public static final i Z0;

    /* renamed from: a0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30639a0;

    /* renamed from: a1, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30640a1;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final Comparator<String> f30641b;

    /* renamed from: b0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30642b0;

    /* renamed from: b1, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30643b1;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, i> f30644c;

    /* renamed from: c0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30645c0;

    /* renamed from: c1, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30646c1;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30647d;

    /* renamed from: d0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30648d0;

    /* renamed from: d1, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30649d1;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30650e;

    /* renamed from: e0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30651e0;

    /* renamed from: e1, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30652e1;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30653f;

    /* renamed from: f0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30654f0;

    /* renamed from: f1, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30655f1;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30656g;

    /* renamed from: g0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30657g0;

    /* renamed from: g1, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30658g1;

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30659h;

    /* renamed from: h0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30660h0;

    /* renamed from: h1, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30661h1;

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30662i;

    /* renamed from: i0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30663i0;

    /* renamed from: i1, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30664i1;

    /* renamed from: j, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30665j;

    /* renamed from: j0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30666j0;

    /* renamed from: j1, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30667j1;

    /* renamed from: k, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30668k;

    /* renamed from: k0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30669k0;

    /* renamed from: k1, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30670k1;

    /* renamed from: l, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30671l;

    /* renamed from: l0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30672l0;

    /* renamed from: l1, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30673l1;

    /* renamed from: m, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30674m;

    /* renamed from: m0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30675m0;

    /* renamed from: m1, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30676m1;

    /* renamed from: n, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30677n;

    /* renamed from: n0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30678n0;

    /* renamed from: n1, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30679n1;

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30680o;

    /* renamed from: o0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30681o0;

    /* renamed from: o1, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30682o1;

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30683p;

    /* renamed from: p0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30684p0;

    /* renamed from: p1, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30685p1;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30686q;

    /* renamed from: q0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30687q0;

    /* renamed from: q1, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30688q1;

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30689r;

    /* renamed from: r0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30690r0;

    /* renamed from: r1, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30691r1;

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30692s;

    /* renamed from: s0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30693s0;

    /* renamed from: s1, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: t, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30695t;

    /* renamed from: t0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30696t0;

    /* renamed from: u, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30697u;

    /* renamed from: u0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30698u0;

    /* renamed from: v, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30699v;

    /* renamed from: v0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30700v0;

    /* renamed from: w, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30701w;

    /* renamed from: w0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30702w0;

    /* renamed from: x, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30703x;

    /* renamed from: x0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30704x0;

    /* renamed from: y, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30705y;

    /* renamed from: y0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30706y0;

    /* renamed from: z, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30707z;

    /* renamed from: z0, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final i f30708z0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String javaName;

    /* compiled from: CipherSuite.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u0018\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"okhttp3/i$a", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "a", "b", "", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(@d5.d String a6, @d5.d String b6) {
            kotlin.jvm.internal.l0.p(a6, ProtectedSandApp.s("恁"));
            kotlin.jvm.internal.l0.p(b6, ProtectedSandApp.s("恂"));
            int min = Math.min(a6.length(), b6.length());
            for (int i5 = 4; i5 < min; i5++) {
                char charAt = a6.charAt(i5);
                char charAt2 = b6.charAt(i5);
                if (charAt != charAt2) {
                    return kotlin.jvm.internal.l0.t(charAt, charAt2) < 0 ? -1 : 1;
                }
            }
            int length = a6.length();
            int length2 = b6.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    /* compiled from: CipherSuite.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b}\b\u0086\u0003\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\nj\b\u0012\u0004\u0012\u00020\u0002`\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u0014\u0010\u001f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014R\u0014\u0010 \u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0014R\u0014\u0010!\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0014R\u0014\u0010\"\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0014R\u0014\u0010#\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0014R\u0014\u0010$\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0014R\u0014\u0010%\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0014R\u0014\u0010&\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0014R\u0014\u0010'\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0014R\u0014\u0010(\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0014R\u0014\u0010)\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0014R\u0014\u0010*\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0014R\u0014\u0010+\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0014R\u0014\u0010,\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0014R\u0014\u0010-\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0014R\u0014\u0010.\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0014R\u0014\u0010/\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0014R\u0014\u00100\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0014R\u0014\u00101\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0014R\u0014\u00102\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0014R\u0014\u00103\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0014R\u0014\u00104\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0014R\u0014\u00105\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0014R\u0014\u00106\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0014R\u0014\u00107\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0014R\u0014\u00108\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0014R\u0014\u00109\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0014R\u0014\u0010:\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0014R\u0014\u0010;\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0014R\u0014\u0010<\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0014R\u0014\u0010=\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0014R\u0014\u0010>\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0014R\u0014\u0010?\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0014R\u0014\u0010@\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0014R\u0014\u0010A\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0014R\u0014\u0010B\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0014R\u0014\u0010C\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0014R\u0014\u0010D\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010\u0014R\u0014\u0010E\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0014R\u0014\u0010F\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010\u0014R\u0014\u0010G\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010\u0014R\u0014\u0010H\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0014R\u0014\u0010I\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010\u0014R\u0014\u0010J\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010\u0014R\u0014\u0010K\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0014R\u0014\u0010L\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0014R\u0014\u0010M\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010\u0014R\u0014\u0010N\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0014R\u0014\u0010O\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010\u0014R\u0014\u0010P\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010\u0014R\u0014\u0010Q\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010\u0014R\u0014\u0010R\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010\u0014R\u0014\u0010S\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010\u0014R\u0014\u0010T\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010\u0014R\u0014\u0010U\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010\u0014R\u0014\u0010V\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010\u0014R\u0014\u0010W\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bW\u0010\u0014R\u0014\u0010X\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bX\u0010\u0014R\u0014\u0010Y\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bY\u0010\u0014R\u0014\u0010Z\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bZ\u0010\u0014R\u0014\u0010[\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b[\u0010\u0014R\u0014\u0010\\\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u0010\u0014R\u0014\u0010]\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010\u0014R\u0014\u0010^\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b^\u0010\u0014R\u0014\u0010_\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b_\u0010\u0014R\u0014\u0010`\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b`\u0010\u0014R\u0014\u0010a\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\ba\u0010\u0014R\u0014\u0010b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bb\u0010\u0014R\u0014\u0010c\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bc\u0010\u0014R\u0014\u0010d\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bd\u0010\u0014R\u0014\u0010e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\be\u0010\u0014R\u0014\u0010f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bf\u0010\u0014R\u0014\u0010g\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bg\u0010\u0014R\u0014\u0010h\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bh\u0010\u0014R\u0014\u0010i\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bi\u0010\u0014R\u0014\u0010j\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bj\u0010\u0014R\u0014\u0010k\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bk\u0010\u0014R\u0014\u0010l\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bl\u0010\u0014R\u0014\u0010m\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bm\u0010\u0014R\u0014\u0010n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bn\u0010\u0014R\u0014\u0010o\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bo\u0010\u0014R\u0014\u0010p\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bp\u0010\u0014R\u0014\u0010q\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bq\u0010\u0014R\u0014\u0010r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\br\u0010\u0014R\u0014\u0010s\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bs\u0010\u0014R\u0014\u0010t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bt\u0010\u0014R\u0014\u0010u\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bu\u0010\u0014R\u0014\u0010v\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bv\u0010\u0014R\u0014\u0010w\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bw\u0010\u0014R\u0014\u0010x\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bx\u0010\u0014R\u0014\u0010y\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\by\u0010\u0014R\u0014\u0010z\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bz\u0010\u0014R\u0014\u0010{\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b{\u0010\u0014R\u0014\u0010|\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b|\u0010\u0014R\u0014\u0010}\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b}\u0010\u0014R\u0014\u0010~\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b~\u0010\u0014R\u0014\u0010\u007f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010\u0014R\u0016\u0010\u0080\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u0014R\u0016\u0010\u0081\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u0014R\u0016\u0010\u0082\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\u0014R\u0016\u0010\u0083\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u0014R\u0016\u0010\u0084\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u0014R\u0016\u0010\u0085\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010\u0014R\u0016\u0010\u0086\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u0014R\u0016\u0010\u0087\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010\u0014R\u0016\u0010\u0088\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010\u0014R\u0016\u0010\u0089\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010\u0014R\u0016\u0010\u008a\u0001\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010\u0014¨\u0006\u008d\u0001"}, d2 = {"Lokhttp3/i$b;", "", "", "javaName", "e", "", "value", "Lokhttp3/i;", "d", "b", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "ORDER_BY_NAME", "Ljava/util/Comparator;", "c", "()Ljava/util/Comparator;", "", "INSTANCES", "Ljava/util/Map;", "TLS_AES_128_CCM_8_SHA256", "Lokhttp3/i;", "TLS_AES_128_CCM_SHA256", "TLS_AES_128_GCM_SHA256", "TLS_AES_256_GCM_SHA384", "TLS_CHACHA20_POLY1305_SHA256", "TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_DSS_WITH_DES_CBC_SHA", "TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_DHE_RSA_WITH_DES_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_RC4_40_MD5", "TLS_DH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA256", "TLS_DH_anon_WITH_AES_128_GCM_SHA256", "TLS_DH_anon_WITH_AES_256_CBC_SHA", "TLS_DH_anon_WITH_AES_256_CBC_SHA256", "TLS_DH_anon_WITH_AES_256_GCM_SHA384", "TLS_DH_anon_WITH_DES_CBC_SHA", "TLS_DH_anon_WITH_RC4_128_MD5", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_ECDSA_WITH_NULL_SHA", "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_NULL_SHA", "TLS_ECDHE_RSA_WITH_RC4_128_SHA", "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_ECDSA_WITH_NULL_SHA", "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_RSA_WITH_NULL_SHA", "TLS_ECDH_RSA_WITH_RC4_128_SHA", "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", "TLS_ECDH_anon_WITH_NULL_SHA", "TLS_ECDH_anon_WITH_RC4_128_SHA", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", "TLS_FALLBACK_SCSV", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", "TLS_KRB5_WITH_DES_CBC_MD5", "TLS_KRB5_WITH_DES_CBC_SHA", "TLS_KRB5_WITH_RC4_128_MD5", "TLS_KRB5_WITH_RC4_128_SHA", "TLS_PSK_WITH_3DES_EDE_CBC_SHA", "TLS_PSK_WITH_AES_128_CBC_SHA", "TLS_PSK_WITH_AES_256_CBC_SHA", "TLS_PSK_WITH_RC4_128_SHA", "TLS_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_RSA_EXPORT_WITH_RC4_40_MD5", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA256", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA256", "TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_RSA_WITH_DES_CBC_SHA", "TLS_RSA_WITH_NULL_MD5", "TLS_RSA_WITH_NULL_SHA", "TLS_RSA_WITH_NULL_SHA256", "TLS_RSA_WITH_RC4_128_MD5", "TLS_RSA_WITH_RC4_128_SHA", "TLS_RSA_WITH_SEED_CBC_SHA", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.i$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final i d(String javaName, int value) {
            i iVar = new i(javaName, null);
            i.f30644c.put(javaName, iVar);
            return iVar;
        }

        private final String e(String javaName) {
            boolean s22;
            boolean s23;
            String s5 = ProtectedSandApp.s("恃");
            s22 = kotlin.text.e0.s2(javaName, s5, false, 2, null);
            String s6 = ProtectedSandApp.s("恄");
            String s7 = ProtectedSandApp.s("恅");
            String s8 = ProtectedSandApp.s("恆");
            if (s22) {
                StringBuilder sb = new StringBuilder(s8);
                if (javaName == null) {
                    throw new NullPointerException(s6);
                }
                String substring = javaName.substring(4);
                kotlin.jvm.internal.l0.o(substring, s7);
                sb.append(substring);
                return sb.toString();
            }
            s23 = kotlin.text.e0.s2(javaName, s8, false, 2, null);
            if (!s23) {
                return javaName;
            }
            StringBuilder sb2 = new StringBuilder(s5);
            if (javaName == null) {
                throw new NullPointerException(s6);
            }
            String substring2 = javaName.substring(4);
            kotlin.jvm.internal.l0.o(substring2, s7);
            sb2.append(substring2);
            return sb2.toString();
        }

        @d5.d
        @p3.n
        public final synchronized i b(@d5.d String javaName) {
            i iVar;
            kotlin.jvm.internal.l0.p(javaName, ProtectedSandApp.s("恇"));
            iVar = (i) i.f30644c.get(javaName);
            if (iVar == null) {
                iVar = (i) i.f30644c.get(e(javaName));
                if (iVar == null) {
                    iVar = new i(javaName, null);
                }
                i.f30644c.put(javaName, iVar);
            }
            return iVar;
        }

        @d5.d
        public final Comparator<String> c() {
            return i.f30641b;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f30641b = new a();
        f30644c = new LinkedHashMap();
        f30647d = companion.d(ProtectedSandApp.s("恌"), 1);
        f30650e = companion.d(ProtectedSandApp.s("恍"), 2);
        f30653f = companion.d(ProtectedSandApp.s("恎"), 3);
        f30656g = companion.d(ProtectedSandApp.s("恏"), 4);
        f30659h = companion.d(ProtectedSandApp.s("恐"), 5);
        f30662i = companion.d(ProtectedSandApp.s("恑"), 8);
        f30665j = companion.d(ProtectedSandApp.s("恒"), 9);
        f30668k = companion.d(ProtectedSandApp.s("恓"), 10);
        f30671l = companion.d(ProtectedSandApp.s("恔"), 17);
        f30674m = companion.d(ProtectedSandApp.s("恕"), 18);
        f30677n = companion.d(ProtectedSandApp.s("恖"), 19);
        f30680o = companion.d(ProtectedSandApp.s("恗"), 20);
        f30683p = companion.d(ProtectedSandApp.s("恘"), 21);
        f30686q = companion.d(ProtectedSandApp.s("恙"), 22);
        f30689r = companion.d(ProtectedSandApp.s("恚"), 23);
        f30692s = companion.d(ProtectedSandApp.s("恛"), 24);
        f30695t = companion.d(ProtectedSandApp.s("恜"), 25);
        f30697u = companion.d(ProtectedSandApp.s("恝"), 26);
        f30699v = companion.d(ProtectedSandApp.s("恞"), 27);
        f30701w = companion.d(ProtectedSandApp.s("恟"), 30);
        f30703x = companion.d(ProtectedSandApp.s("恠"), 31);
        f30705y = companion.d(ProtectedSandApp.s("恡"), 32);
        f30707z = companion.d(ProtectedSandApp.s("恢"), 34);
        A = companion.d(ProtectedSandApp.s("恣"), 35);
        B = companion.d(ProtectedSandApp.s("恤"), 36);
        C = companion.d(ProtectedSandApp.s("恥"), 38);
        D = companion.d(ProtectedSandApp.s("恦"), 40);
        E = companion.d(ProtectedSandApp.s("恧"), 41);
        F = companion.d(ProtectedSandApp.s("恨"), 43);
        G = companion.d(ProtectedSandApp.s("恩"), 47);
        H = companion.d(ProtectedSandApp.s("恪"), 50);
        I = companion.d(ProtectedSandApp.s("恫"), 51);
        J = companion.d(ProtectedSandApp.s("恬"), 52);
        K = companion.d(ProtectedSandApp.s("恭"), 53);
        L = companion.d(ProtectedSandApp.s("恮"), 56);
        M = companion.d(ProtectedSandApp.s("息"), 57);
        N = companion.d(ProtectedSandApp.s("恰"), 58);
        O = companion.d(ProtectedSandApp.s("恱"), 59);
        P = companion.d(ProtectedSandApp.s("恲"), 60);
        Q = companion.d(ProtectedSandApp.s("恳"), 61);
        R = companion.d(ProtectedSandApp.s("恴"), 64);
        S = companion.d(ProtectedSandApp.s("恵"), 65);
        T = companion.d(ProtectedSandApp.s("恶"), 68);
        U = companion.d(ProtectedSandApp.s("恷"), 69);
        V = companion.d(ProtectedSandApp.s("恸"), 103);
        W = companion.d(ProtectedSandApp.s("恹"), 106);
        X = companion.d(ProtectedSandApp.s("恺"), 107);
        Y = companion.d(ProtectedSandApp.s("恻"), 108);
        Z = companion.d(ProtectedSandApp.s("恼"), 109);
        f30639a0 = companion.d(ProtectedSandApp.s("恽"), 132);
        f30642b0 = companion.d(ProtectedSandApp.s("恾"), 135);
        f30645c0 = companion.d(ProtectedSandApp.s("恿"), SyslogAppender.LOG_LOCAL1);
        f30648d0 = companion.d(ProtectedSandApp.s("悀"), 138);
        f30651e0 = companion.d(ProtectedSandApp.s("悁"), 139);
        f30654f0 = companion.d(ProtectedSandApp.s("悂"), 140);
        f30657g0 = companion.d(ProtectedSandApp.s("悃"), 141);
        f30660h0 = companion.d(ProtectedSandApp.s("悄"), 150);
        f30663i0 = companion.d(ProtectedSandApp.s("悅"), 156);
        f30666j0 = companion.d(ProtectedSandApp.s("悆"), 157);
        f30669k0 = companion.d(ProtectedSandApp.s("悇"), 158);
        f30672l0 = companion.d(ProtectedSandApp.s("悈"), 159);
        f30675m0 = companion.d(ProtectedSandApp.s("悉"), 162);
        f30678n0 = companion.d(ProtectedSandApp.s("悊"), 163);
        f30681o0 = companion.d(ProtectedSandApp.s("悋"), 166);
        f30684p0 = companion.d(ProtectedSandApp.s("悌"), 167);
        f30687q0 = companion.d(ProtectedSandApp.s("悍"), 255);
        f30690r0 = companion.d(ProtectedSandApp.s("悎"), 22016);
        f30693s0 = companion.d(ProtectedSandApp.s("悏"), 49153);
        f30696t0 = companion.d(ProtectedSandApp.s("悐"), 49154);
        f30698u0 = companion.d(ProtectedSandApp.s("悑"), 49155);
        f30700v0 = companion.d(ProtectedSandApp.s("悒"), 49156);
        f30702w0 = companion.d(ProtectedSandApp.s("悓"), 49157);
        f30704x0 = companion.d(ProtectedSandApp.s("悔"), 49158);
        f30706y0 = companion.d(ProtectedSandApp.s("悕"), 49159);
        f30708z0 = companion.d(ProtectedSandApp.s("悖"), 49160);
        A0 = companion.d(ProtectedSandApp.s("悗"), 49161);
        B0 = companion.d(ProtectedSandApp.s("悘"), 49162);
        C0 = companion.d(ProtectedSandApp.s("悙"), 49163);
        D0 = companion.d(ProtectedSandApp.s("悚"), 49164);
        E0 = companion.d(ProtectedSandApp.s("悛"), 49165);
        F0 = companion.d(ProtectedSandApp.s("悜"), 49166);
        G0 = companion.d(ProtectedSandApp.s("悝"), 49167);
        H0 = companion.d(ProtectedSandApp.s("悞"), 49168);
        I0 = companion.d(ProtectedSandApp.s("悟"), 49169);
        J0 = companion.d(ProtectedSandApp.s("悠"), 49170);
        K0 = companion.d(ProtectedSandApp.s("悡"), 49171);
        L0 = companion.d(ProtectedSandApp.s("悢"), 49172);
        M0 = companion.d(ProtectedSandApp.s("患"), 49173);
        N0 = companion.d(ProtectedSandApp.s("悤"), 49174);
        O0 = companion.d(ProtectedSandApp.s("悥"), 49175);
        P0 = companion.d(ProtectedSandApp.s("悦"), 49176);
        Q0 = companion.d(ProtectedSandApp.s("悧"), 49177);
        R0 = companion.d(ProtectedSandApp.s("您"), 49187);
        S0 = companion.d(ProtectedSandApp.s("悩"), 49188);
        T0 = companion.d(ProtectedSandApp.s("悪"), 49189);
        U0 = companion.d(ProtectedSandApp.s("悫"), 49190);
        V0 = companion.d(ProtectedSandApp.s("悬"), 49191);
        W0 = companion.d(ProtectedSandApp.s("悭"), 49192);
        X0 = companion.d(ProtectedSandApp.s("悮"), 49193);
        Y0 = companion.d(ProtectedSandApp.s("悯"), 49194);
        Z0 = companion.d(ProtectedSandApp.s("悰"), 49195);
        f30640a1 = companion.d(ProtectedSandApp.s("悱"), 49196);
        f30643b1 = companion.d(ProtectedSandApp.s("悲"), 49197);
        f30646c1 = companion.d(ProtectedSandApp.s("悳"), 49198);
        f30649d1 = companion.d(ProtectedSandApp.s("悴"), 49199);
        f30652e1 = companion.d(ProtectedSandApp.s("悵"), 49200);
        f30655f1 = companion.d(ProtectedSandApp.s("悶"), 49201);
        f30658g1 = companion.d(ProtectedSandApp.s("悷"), 49202);
        f30661h1 = companion.d(ProtectedSandApp.s("悸"), 49205);
        f30664i1 = companion.d(ProtectedSandApp.s("悹"), 49206);
        f30667j1 = companion.d(ProtectedSandApp.s("悺"), 52392);
        f30670k1 = companion.d(ProtectedSandApp.s("悻"), 52393);
        f30673l1 = companion.d(ProtectedSandApp.s("悼"), 52394);
        f30676m1 = companion.d(ProtectedSandApp.s("悽"), 52396);
        f30679n1 = companion.d(ProtectedSandApp.s("悾"), 4865);
        f30682o1 = companion.d(ProtectedSandApp.s("悿"), 4866);
        f30685p1 = companion.d(ProtectedSandApp.s("惀"), 4867);
        f30688q1 = companion.d(ProtectedSandApp.s("惁"), 4868);
        f30691r1 = companion.d(ProtectedSandApp.s("惂"), 4869);
    }

    private i(String str) {
        this.javaName = str;
    }

    @d5.d
    @p3.n
    public static final synchronized i d(@d5.d String str) {
        i b6;
        synchronized (i.class) {
            b6 = INSTANCE.b(str);
        }
        return b6;
    }

    @p3.i(name = "-deprecated_javaName")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "javaName", imports = {}))
    @d5.d
    /* renamed from: a, reason: from getter */
    public final String getJavaName() {
        return this.javaName;
    }

    @p3.i(name = "javaName")
    @d5.d
    public final String e() {
        return this.javaName;
    }

    @d5.d
    public String toString() {
        return this.javaName;
    }

    public /* synthetic */ i(String str, kotlin.jvm.internal.w wVar) {
        this(str);
    }
}
