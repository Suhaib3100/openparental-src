package okhttp3;

import com.android.internal.telephony.SmsConstants;
import com.android.internal.telephony.cdma.UserData;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.x0;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: CipherSuite.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u0007¨\u0006\r"}, d2 = {"Lokhttp3/i;", "", "", "javaName", "<init>", "(Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "toString", "Ljava/lang/String;", "e", "s1", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class i {

    @fg.l
    @kd.f
    public static final i A;

    @fg.l
    @kd.f
    public static final i A0;

    @fg.l
    @kd.f
    public static final i B;

    @fg.l
    @kd.f
    public static final i B0;

    @fg.l
    @kd.f
    public static final i C;

    @fg.l
    @kd.f
    public static final i C0;

    @fg.l
    @kd.f
    public static final i D;

    @fg.l
    @kd.f
    public static final i D0;

    @fg.l
    @kd.f
    public static final i E;

    @fg.l
    @kd.f
    public static final i E0;

    @fg.l
    @kd.f
    public static final i F;

    @fg.l
    @kd.f
    public static final i F0;

    @fg.l
    @kd.f
    public static final i G;

    @fg.l
    @kd.f
    public static final i G0;

    @fg.l
    @kd.f
    public static final i H;

    @fg.l
    @kd.f
    public static final i H0;

    @fg.l
    @kd.f
    public static final i I;

    @fg.l
    @kd.f
    public static final i I0;

    @fg.l
    @kd.f
    public static final i J;

    @fg.l
    @kd.f
    public static final i J0;

    @fg.l
    @kd.f
    public static final i K;

    @fg.l
    @kd.f
    public static final i K0;

    @fg.l
    @kd.f
    public static final i L;

    @fg.l
    @kd.f
    public static final i L0;

    @fg.l
    @kd.f
    public static final i M;

    @fg.l
    @kd.f
    public static final i M0;

    @fg.l
    @kd.f
    public static final i N;

    @fg.l
    @kd.f
    public static final i N0;

    @fg.l
    @kd.f
    public static final i O;

    @fg.l
    @kd.f
    public static final i O0;

    @fg.l
    @kd.f
    public static final i P;

    @fg.l
    @kd.f
    public static final i P0;

    @fg.l
    @kd.f
    public static final i Q;

    @fg.l
    @kd.f
    public static final i Q0;

    @fg.l
    @kd.f
    public static final i R;

    @fg.l
    @kd.f
    public static final i R0;

    @fg.l
    @kd.f
    public static final i S;

    @fg.l
    @kd.f
    public static final i S0;

    @fg.l
    @kd.f
    public static final i T;

    @fg.l
    @kd.f
    public static final i T0;

    @fg.l
    @kd.f
    public static final i U;

    @fg.l
    @kd.f
    public static final i U0;

    @fg.l
    @kd.f
    public static final i V;

    @fg.l
    @kd.f
    public static final i V0;

    @fg.l
    @kd.f
    public static final i W;

    @fg.l
    @kd.f
    public static final i W0;

    @fg.l
    @kd.f
    public static final i X;

    @fg.l
    @kd.f
    public static final i X0;

    @fg.l
    @kd.f
    public static final i Y;

    @fg.l
    @kd.f
    public static final i Y0;

    @fg.l
    @kd.f
    public static final i Z;

    @fg.l
    @kd.f
    public static final i Z0;

    /* renamed from: a0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84150a0;

    /* renamed from: a1, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84151a1;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final Comparator<String> f84152b;

    /* renamed from: b0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84153b0;

    /* renamed from: b1, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84154b1;

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, i> f84155c;

    /* renamed from: c0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84156c0;

    /* renamed from: c1, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84157c1;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84158d;

    /* renamed from: d0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84159d0;

    /* renamed from: d1, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84160d1;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84161e;

    /* renamed from: e0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84162e0;

    /* renamed from: e1, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84163e1;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84164f;

    /* renamed from: f0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84165f0;

    /* renamed from: f1, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84166f1;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84167g;

    /* renamed from: g0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84168g0;

    /* renamed from: g1, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84169g1;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84170h;

    /* renamed from: h0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84171h0;

    /* renamed from: h1, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84172h1;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84173i;

    /* renamed from: i0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84174i0;

    /* renamed from: i1, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84175i1;

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84176j;

    /* renamed from: j0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84177j0;

    /* renamed from: j1, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84178j1;

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84179k;

    /* renamed from: k0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84180k0;

    /* renamed from: k1, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84181k1;

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84182l;

    /* renamed from: l0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84183l0;

    /* renamed from: l1, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84184l1;

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84185m;

    /* renamed from: m0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84186m0;

    /* renamed from: m1, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84187m1;

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84188n;

    /* renamed from: n0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84189n0;

    /* renamed from: n1, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84190n1;

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84191o;

    /* renamed from: o0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84192o0;

    /* renamed from: o1, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84193o1;

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84194p;

    /* renamed from: p0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84195p0;

    /* renamed from: p1, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84196p1;

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84197q;

    /* renamed from: q0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84198q0;

    /* renamed from: q1, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84199q1;

    /* renamed from: r, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84200r;

    /* renamed from: r0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84201r0;

    /* renamed from: r1, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84202r1;

    /* renamed from: s, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84203s;

    /* renamed from: s0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84204s0;

    /* renamed from: s1, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: t, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84206t;

    /* renamed from: t0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84207t0;

    /* renamed from: u, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84208u;

    /* renamed from: u0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84209u0;

    /* renamed from: v, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84210v;

    /* renamed from: v0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84211v0;

    /* renamed from: w, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84212w;

    /* renamed from: w0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84213w0;

    /* renamed from: x, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84214x;

    /* renamed from: x0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84215x0;

    /* renamed from: y, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84216y;

    /* renamed from: y0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84217y0;

    /* renamed from: z, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84218z;

    /* renamed from: z0, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final i f84219z0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String javaName;

    /* compiled from: CipherSuite.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u001f\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"okhttp3/i$a", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "a", "b", "", "(Ljava/lang/String;Ljava/lang/String;)I", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(@fg.l String a5, @fg.l String b5) {
            l0.p(a5, ProtectedSandApp.s("齐\u0001"));
            l0.p(b5, ProtectedSandApp.s("齑\u0001"));
            int min = Math.min(a5.length(), b5.length());
            for (int i4 = 4; i4 < min; i4++) {
                char charAt = a5.charAt(i4);
                char charAt2 = b5.charAt(i4);
                if (charAt != charAt2) {
                    return l0.t(charAt, charAt2) < 0 ? -1 : 1;
                }
            }
            int length = a5.length();
            int length2 = b5.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    /* compiled from: CipherSuite.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b{\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eR*\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000fj\b\u0012\u0004\u0012\u00020\u0004`\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0014\u0010 \u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0014\u0010!\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0014\u0010\"\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u0014\u0010#\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u0014\u0010$\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u0014\u0010%\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u0014\u0010&\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u0014\u0010'\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u0014\u0010(\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u0014\u0010)\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u0014\u0010*\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u0014\u0010+\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u0014\u0010,\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019R\u0014\u0010-\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u0014\u0010.\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0019R\u0014\u0010/\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0019R\u0014\u00100\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0019R\u0014\u00101\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0019R\u0014\u00102\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0019R\u0014\u00103\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0019R\u0014\u00104\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0019R\u0014\u00105\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0019R\u0014\u00106\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0019R\u0014\u00107\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0019R\u0014\u00108\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0019R\u0014\u00109\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0019R\u0014\u0010:\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0019R\u0014\u0010;\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0019R\u0014\u0010<\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0019R\u0014\u0010=\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0019R\u0014\u0010>\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0019R\u0014\u0010?\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0019R\u0014\u0010@\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0019R\u0014\u0010A\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0019R\u0014\u0010B\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0019R\u0014\u0010C\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0019R\u0014\u0010D\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010\u0019R\u0014\u0010E\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0019R\u0014\u0010F\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010\u0019R\u0014\u0010G\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010\u0019R\u0014\u0010H\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0019R\u0014\u0010I\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010\u0019R\u0014\u0010J\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010\u0019R\u0014\u0010K\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0019R\u0014\u0010L\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0019R\u0014\u0010M\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010\u0019R\u0014\u0010N\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0019R\u0014\u0010O\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010\u0019R\u0014\u0010P\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010\u0019R\u0014\u0010Q\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010\u0019R\u0014\u0010R\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010\u0019R\u0014\u0010S\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010\u0019R\u0014\u0010T\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010\u0019R\u0014\u0010U\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010\u0019R\u0014\u0010V\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010\u0019R\u0014\u0010W\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bW\u0010\u0019R\u0014\u0010X\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bX\u0010\u0019R\u0014\u0010Y\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bY\u0010\u0019R\u0014\u0010Z\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bZ\u0010\u0019R\u0014\u0010[\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b[\u0010\u0019R\u0014\u0010\\\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u0010\u0019R\u0014\u0010]\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010\u0019R\u0014\u0010^\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b^\u0010\u0019R\u0014\u0010_\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b_\u0010\u0019R\u0014\u0010`\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b`\u0010\u0019R\u0014\u0010a\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\ba\u0010\u0019R\u0014\u0010b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bb\u0010\u0019R\u0014\u0010c\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bc\u0010\u0019R\u0014\u0010d\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bd\u0010\u0019R\u0014\u0010e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\be\u0010\u0019R\u0014\u0010f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bf\u0010\u0019R\u0014\u0010g\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bg\u0010\u0019R\u0014\u0010h\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bh\u0010\u0019R\u0014\u0010i\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bi\u0010\u0019R\u0014\u0010j\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bj\u0010\u0019R\u0014\u0010k\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bk\u0010\u0019R\u0014\u0010l\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bl\u0010\u0019R\u0014\u0010m\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bm\u0010\u0019R\u0014\u0010n\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bn\u0010\u0019R\u0014\u0010o\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bo\u0010\u0019R\u0014\u0010p\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bp\u0010\u0019R\u0014\u0010q\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bq\u0010\u0019R\u0014\u0010r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\br\u0010\u0019R\u0014\u0010s\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bs\u0010\u0019R\u0014\u0010t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bt\u0010\u0019R\u0014\u0010u\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bu\u0010\u0019R\u0014\u0010v\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bv\u0010\u0019R\u0014\u0010w\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bw\u0010\u0019R\u0014\u0010x\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bx\u0010\u0019R\u0014\u0010y\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\by\u0010\u0019R\u0014\u0010z\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bz\u0010\u0019R\u0014\u0010{\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b{\u0010\u0019R\u0014\u0010|\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b|\u0010\u0019R\u0014\u0010}\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b}\u0010\u0019R\u0014\u0010~\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b~\u0010\u0019R\u0014\u0010\u007f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010\u0019R\u0016\u0010\u0080\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u0019R\u0016\u0010\u0081\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u0019R\u0016\u0010\u0082\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\u0019R\u0016\u0010\u0083\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u0019R\u0016\u0010\u0084\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u0019R\u0016\u0010\u0085\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010\u0019R\u0016\u0010\u0086\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u0019R\u0016\u0010\u0087\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010\u0019R\u0016\u0010\u0088\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010\u0019R\u0016\u0010\u0089\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010\u0019R\u0016\u0010\u008a\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010\u0019R\u0016\u0010\u008b\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010\u0019R\u0016\u0010\u008c\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010\u0019R\u0016\u0010\u008d\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010\u0019R\u0016\u0010\u008e\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010\u0019R\u0016\u0010\u008f\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010\u0019¨\u0006\u0090\u0001"}, d2 = {"Lokhttp3/i$b;", "", "<init>", "()V", "", "javaName", "e", "(Ljava/lang/String;)Ljava/lang/String;", "", "value", "Lokhttp3/i;", "d", "(Ljava/lang/String;I)Lokhttp3/i;", "b", "(Ljava/lang/String;)Lokhttp3/i;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "ORDER_BY_NAME", "Ljava/util/Comparator;", "c", "()Ljava/util/Comparator;", "", "INSTANCES", "Ljava/util/Map;", "TLS_AES_128_CCM_8_SHA256", "Lokhttp3/i;", "TLS_AES_128_CCM_SHA256", "TLS_AES_128_GCM_SHA256", "TLS_AES_256_GCM_SHA384", "TLS_CHACHA20_POLY1305_SHA256", "TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_DSS_WITH_DES_CBC_SHA", "TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_DHE_RSA_WITH_DES_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_RC4_40_MD5", "TLS_DH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA256", "TLS_DH_anon_WITH_AES_128_GCM_SHA256", "TLS_DH_anon_WITH_AES_256_CBC_SHA", "TLS_DH_anon_WITH_AES_256_CBC_SHA256", "TLS_DH_anon_WITH_AES_256_GCM_SHA384", "TLS_DH_anon_WITH_DES_CBC_SHA", "TLS_DH_anon_WITH_RC4_128_MD5", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_ECDSA_WITH_NULL_SHA", "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_NULL_SHA", "TLS_ECDHE_RSA_WITH_RC4_128_SHA", "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_ECDSA_WITH_NULL_SHA", "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_RSA_WITH_NULL_SHA", "TLS_ECDH_RSA_WITH_RC4_128_SHA", "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", "TLS_ECDH_anon_WITH_NULL_SHA", "TLS_ECDH_anon_WITH_RC4_128_SHA", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", "TLS_FALLBACK_SCSV", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", "TLS_KRB5_WITH_DES_CBC_MD5", "TLS_KRB5_WITH_DES_CBC_SHA", "TLS_KRB5_WITH_RC4_128_MD5", "TLS_KRB5_WITH_RC4_128_SHA", "TLS_PSK_WITH_3DES_EDE_CBC_SHA", "TLS_PSK_WITH_AES_128_CBC_SHA", "TLS_PSK_WITH_AES_256_CBC_SHA", "TLS_PSK_WITH_RC4_128_SHA", "TLS_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_RSA_EXPORT_WITH_RC4_40_MD5", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA256", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA256", "TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_RSA_WITH_DES_CBC_SHA", "TLS_RSA_WITH_NULL_MD5", "TLS_RSA_WITH_NULL_SHA", "TLS_RSA_WITH_NULL_SHA256", "TLS_RSA_WITH_RC4_128_MD5", "TLS_RSA_WITH_RC4_128_SHA", "TLS_RSA_WITH_SEED_CBC_SHA", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.i$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final i d(String javaName, int value) {
            i iVar = new i(javaName, null);
            i.f84155c.put(javaName, iVar);
            return iVar;
        }

        private final String e(String javaName) {
            String s4 = ProtectedSandApp.s("齒\u0001");
            boolean s22 = kotlin.text.v.s2(javaName, s4, false, 2, null);
            String s5 = ProtectedSandApp.s("齓\u0001");
            String s6 = ProtectedSandApp.s("齔\u0001");
            String s7 = ProtectedSandApp.s("齕\u0001");
            if (s22) {
                StringBuilder sb = new StringBuilder(s7);
                if (javaName == null) {
                    throw new NullPointerException(s6);
                }
                String substring = javaName.substring(4);
                l0.o(substring, s5);
                sb.append(substring);
                return sb.toString();
            }
            if (!kotlin.text.v.s2(javaName, s7, false, 2, null)) {
                return javaName;
            }
            StringBuilder sb2 = new StringBuilder(s4);
            if (javaName == null) {
                throw new NullPointerException(s6);
            }
            String substring2 = javaName.substring(4);
            l0.o(substring2, s5);
            sb2.append(substring2);
            return sb2.toString();
        }

        @fg.l
        @kd.n
        public final synchronized i b(@fg.l String javaName) {
            i iVar;
            try {
                l0.p(javaName, ProtectedSandApp.s("齖\u0001"));
                iVar = (i) i.f84155c.get(javaName);
                if (iVar == null) {
                    iVar = (i) i.f84155c.get(e(javaName));
                    if (iVar == null) {
                        iVar = new i(javaName, null);
                    }
                    i.f84155c.put(javaName, iVar);
                }
            } catch (Throwable th) {
                throw th;
            }
            return iVar;
        }

        @fg.l
        public final Comparator<String> c() {
            return i.f84152b;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f84152b = new a();
        f84155c = new LinkedHashMap();
        f84158d = companion.d(ProtectedSandApp.s("齨\u0001"), 1);
        f84161e = companion.d(ProtectedSandApp.s("齩\u0001"), 2);
        f84164f = companion.d(ProtectedSandApp.s("齪\u0001"), 3);
        f84167g = companion.d(ProtectedSandApp.s("齫\u0001"), 4);
        f84170h = companion.d(ProtectedSandApp.s("齬\u0001"), 5);
        f84173i = companion.d(ProtectedSandApp.s("齭\u0001"), 8);
        f84176j = companion.d(ProtectedSandApp.s("齮\u0001"), 9);
        f84179k = companion.d(ProtectedSandApp.s("齯\u0001"), 10);
        f84182l = companion.d(ProtectedSandApp.s("齰\u0001"), 17);
        f84185m = companion.d(ProtectedSandApp.s("齱\u0001"), 18);
        f84188n = companion.d(ProtectedSandApp.s("齲\u0001"), 19);
        f84191o = companion.d(ProtectedSandApp.s("齳\u0001"), 20);
        f84194p = companion.d(ProtectedSandApp.s("齴\u0001"), 21);
        f84197q = companion.d(ProtectedSandApp.s("齵\u0001"), 22);
        f84200r = companion.d(ProtectedSandApp.s("齶\u0001"), 23);
        f84203s = companion.d(ProtectedSandApp.s("齷\u0001"), 24);
        f84206t = companion.d(ProtectedSandApp.s("齸\u0001"), 25);
        f84208u = companion.d(ProtectedSandApp.s("齹\u0001"), 26);
        f84210v = companion.d(ProtectedSandApp.s("齺\u0001"), 27);
        f84212w = companion.d(ProtectedSandApp.s("齻\u0001"), 30);
        f84214x = companion.d(ProtectedSandApp.s("齼\u0001"), 31);
        f84216y = companion.d(ProtectedSandApp.s("齽\u0001"), 32);
        f84218z = companion.d(ProtectedSandApp.s("齾\u0001"), 34);
        A = companion.d(ProtectedSandApp.s("齿\u0001"), 35);
        B = companion.d(ProtectedSandApp.s("龀\u0001"), 36);
        C = companion.d(ProtectedSandApp.s("龁\u0001"), 38);
        D = companion.d(ProtectedSandApp.s("龂\u0001"), 40);
        E = companion.d(ProtectedSandApp.s("龃\u0001"), 41);
        F = companion.d(ProtectedSandApp.s("龄\u0001"), 43);
        G = companion.d(ProtectedSandApp.s("龅\u0001"), 47);
        H = companion.d(ProtectedSandApp.s("龆\u0001"), 50);
        I = companion.d(ProtectedSandApp.s("龇\u0001"), 51);
        J = companion.d(ProtectedSandApp.s("龈\u0001"), 52);
        K = companion.d(ProtectedSandApp.s("龉\u0001"), 53);
        L = companion.d(ProtectedSandApp.s("龊\u0001"), 56);
        M = companion.d(ProtectedSandApp.s("龋\u0001"), 57);
        N = companion.d(ProtectedSandApp.s("龌\u0001"), 58);
        O = companion.d(ProtectedSandApp.s("龍\u0001"), 59);
        P = companion.d(ProtectedSandApp.s("龎\u0001"), 60);
        Q = companion.d(ProtectedSandApp.s("龏\u0001"), 61);
        R = companion.d(ProtectedSandApp.s("龐\u0001"), 64);
        S = companion.d(ProtectedSandApp.s("龑\u0001"), 65);
        T = companion.d(ProtectedSandApp.s("龒\u0001"), 68);
        U = companion.d(ProtectedSandApp.s("龓\u0001"), 69);
        V = companion.d(ProtectedSandApp.s("龔\u0001"), 103);
        W = companion.d(ProtectedSandApp.s("龕\u0001"), 106);
        X = companion.d(ProtectedSandApp.s("龖\u0001"), 107);
        Y = companion.d(ProtectedSandApp.s("龗\u0001"), 108);
        Z = companion.d(ProtectedSandApp.s("龘\u0001"), 109);
        f84150a0 = companion.d(ProtectedSandApp.s("龙\u0001"), UserData.IS91_MSG_TYPE_CLI);
        f84153b0 = companion.d(ProtectedSandApp.s("龚\u0001"), 135);
        f84156c0 = companion.d(ProtectedSandApp.s("龛\u0001"), SyslogAppender.LOG_LOCAL1);
        f84159d0 = companion.d(ProtectedSandApp.s("龜\u0001"), 138);
        f84162e0 = companion.d(ProtectedSandApp.s("龝\u0001"), 139);
        f84165f0 = companion.d(ProtectedSandApp.s("龞\u0001"), SmsConstants.MAX_USER_DATA_BYTES);
        f84168g0 = companion.d(ProtectedSandApp.s("龟\u0001"), 141);
        f84171h0 = companion.d(ProtectedSandApp.s("龠\u0001"), 150);
        f84174i0 = companion.d(ProtectedSandApp.s("龡\u0001"), 156);
        f84177j0 = companion.d(ProtectedSandApp.s("龢\u0001"), 157);
        f84180k0 = companion.d(ProtectedSandApp.s("龣\u0001"), 158);
        f84183l0 = companion.d(ProtectedSandApp.s("龤\u0001"), 159);
        f84186m0 = companion.d(ProtectedSandApp.s("龥\u0001"), 162);
        f84189n0 = companion.d(ProtectedSandApp.s("龦\u0001"), 163);
        f84192o0 = companion.d(ProtectedSandApp.s("龧\u0001"), 166);
        f84195p0 = companion.d(ProtectedSandApp.s("龨\u0001"), 167);
        f84198q0 = companion.d(ProtectedSandApp.s("龩\u0001"), 255);
        f84201r0 = companion.d(ProtectedSandApp.s("龪\u0001"), 22016);
        f84204s0 = companion.d(ProtectedSandApp.s("龫\u0001"), 49153);
        f84207t0 = companion.d(ProtectedSandApp.s("龬\u0001"), 49154);
        f84209u0 = companion.d(ProtectedSandApp.s("龭\u0001"), 49155);
        f84211v0 = companion.d(ProtectedSandApp.s("龮\u0001"), 49156);
        f84213w0 = companion.d(ProtectedSandApp.s("龯\u0001"), 49157);
        f84215x0 = companion.d(ProtectedSandApp.s("龰\u0001"), 49158);
        f84217y0 = companion.d(ProtectedSandApp.s("龱\u0001"), 49159);
        f84219z0 = companion.d(ProtectedSandApp.s("龲\u0001"), 49160);
        A0 = companion.d(ProtectedSandApp.s("龳\u0001"), 49161);
        B0 = companion.d(ProtectedSandApp.s("龴\u0001"), 49162);
        C0 = companion.d(ProtectedSandApp.s("龵\u0001"), 49163);
        D0 = companion.d(ProtectedSandApp.s("龶\u0001"), 49164);
        E0 = companion.d(ProtectedSandApp.s("龷\u0001"), 49165);
        F0 = companion.d(ProtectedSandApp.s("龸\u0001"), 49166);
        G0 = companion.d(ProtectedSandApp.s("龹\u0001"), 49167);
        H0 = companion.d(ProtectedSandApp.s("龺\u0001"), 49168);
        I0 = companion.d(ProtectedSandApp.s("龻\u0001"), 49169);
        J0 = companion.d(ProtectedSandApp.s("龼\u0001"), 49170);
        K0 = companion.d(ProtectedSandApp.s("龽\u0001"), 49171);
        L0 = companion.d(ProtectedSandApp.s("龾\u0001"), 49172);
        M0 = companion.d(ProtectedSandApp.s("龿\u0001"), 49173);
        N0 = companion.d(ProtectedSandApp.s("鿀\u0001"), 49174);
        O0 = companion.d(ProtectedSandApp.s("鿁\u0001"), 49175);
        P0 = companion.d(ProtectedSandApp.s("鿂\u0001"), 49176);
        Q0 = companion.d(ProtectedSandApp.s("鿃\u0001"), 49177);
        R0 = companion.d(ProtectedSandApp.s("鿄\u0001"), 49187);
        S0 = companion.d(ProtectedSandApp.s("鿅\u0001"), 49188);
        T0 = companion.d(ProtectedSandApp.s("鿆\u0001"), 49189);
        U0 = companion.d(ProtectedSandApp.s("鿇\u0001"), 49190);
        V0 = companion.d(ProtectedSandApp.s("鿈\u0001"), 49191);
        W0 = companion.d(ProtectedSandApp.s("鿉\u0001"), 49192);
        X0 = companion.d(ProtectedSandApp.s("鿊\u0001"), 49193);
        Y0 = companion.d(ProtectedSandApp.s("鿋\u0001"), 49194);
        Z0 = companion.d(ProtectedSandApp.s("鿌\u0001"), 49195);
        f84151a1 = companion.d(ProtectedSandApp.s("鿍\u0001"), 49196);
        f84154b1 = companion.d(ProtectedSandApp.s("鿎\u0001"), 49197);
        f84157c1 = companion.d(ProtectedSandApp.s("鿏\u0001"), 49198);
        f84160d1 = companion.d(ProtectedSandApp.s("鿐\u0001"), 49199);
        f84163e1 = companion.d(ProtectedSandApp.s("鿑\u0001"), 49200);
        f84166f1 = companion.d(ProtectedSandApp.s("鿒\u0001"), 49201);
        f84169g1 = companion.d(ProtectedSandApp.s("鿓\u0001"), 49202);
        f84172h1 = companion.d(ProtectedSandApp.s("鿔\u0001"), 49205);
        f84175i1 = companion.d(ProtectedSandApp.s("鿕\u0001"), 49206);
        f84178j1 = companion.d(ProtectedSandApp.s("鿖\u0001"), 52392);
        f84181k1 = companion.d(ProtectedSandApp.s("鿗\u0001"), 52393);
        f84184l1 = companion.d(ProtectedSandApp.s("鿘\u0001"), 52394);
        f84187m1 = companion.d(ProtectedSandApp.s("鿙\u0001"), 52396);
        f84190n1 = companion.d(ProtectedSandApp.s("鿚\u0001"), 4865);
        f84193o1 = companion.d(ProtectedSandApp.s("鿛\u0001"), 4866);
        f84196p1 = companion.d(ProtectedSandApp.s("鿜\u0001"), 4867);
        f84199q1 = companion.d(ProtectedSandApp.s("鿝\u0001"), 4868);
        f84202r1 = companion.d(ProtectedSandApp.s("鿞\u0001"), 4869);
    }

    private i(String str) {
        this.javaName = str;
    }

    @fg.l
    @kd.n
    public static final synchronized i d(@fg.l String str) {
        i b5;
        synchronized (i.class) {
            b5 = INSTANCE.b(str);
        }
        return b5;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "javaName", imports = {}))
    @kd.i(name = "-deprecated_javaName")
    /* renamed from: a, reason: from getter */
    public final String getJavaName() {
        return this.javaName;
    }

    @fg.l
    @kd.i(name = "javaName")
    public final String e() {
        return this.javaName;
    }

    @fg.l
    public String toString() {
        return this.javaName;
    }

    public /* synthetic */ i(String str, kotlin.jvm.internal.w wVar) {
        this(str);
    }
}
