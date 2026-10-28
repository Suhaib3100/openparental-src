package okhttp3.internal.http2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.text.v;
import okio.p;

/* compiled from: Http2.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0011\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001d\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u0014\u0010\u001f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015R\u0014\u0010!\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0014\u0010#\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010%\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0015R\u0014\u0010'\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0015R\u0014\u0010)\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0015R\u0014\u0010+\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0015R\u0014\u0010-\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0015R\u0014\u0010/\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0015R\u0014\u00101\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0015R\u0014\u00103\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0015R\u0014\u00105\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u0015R\u0014\u00107\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u0015R\u0014\u00109\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u0015R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000b0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010<¨\u0006B"}, d2 = {"Lokhttp3/internal/http2/d;", "", "<init>", "()V", "", "inbound", "", "streamId", "length", "type", "flags", "", "c", "(ZIIII)Ljava/lang/String;", "b", "(I)Ljava/lang/String;", "a", "(II)Ljava/lang/String;", "Lokio/p;", "Lokio/p;", "CONNECTION_PREFACE", "I", "INITIAL_MAX_FRAME_SIZE", "TYPE_DATA", "d", "TYPE_HEADERS", "e", "TYPE_PRIORITY", "f", "TYPE_RST_STREAM", "g", "TYPE_SETTINGS", "h", "TYPE_PUSH_PROMISE", "i", "TYPE_PING", "j", "TYPE_GOAWAY", "k", "TYPE_WINDOW_UPDATE", "l", "TYPE_CONTINUATION", "m", "FLAG_NONE", "n", "FLAG_ACK", "o", "FLAG_END_STREAM", "p", "FLAG_END_HEADERS", "q", "FLAG_END_PUSH_PROMISE", "r", "FLAG_PADDED", "s", "FLAG_PRIORITY", "t", "FLAG_COMPRESSED", "", "u", "[Ljava/lang/String;", "FRAME_NAMES", "v", "FLAGS", "w", "BINARY", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final int TYPE_DATA = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final int TYPE_HEADERS = 1;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final int TYPE_PRIORITY = 2;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final int TYPE_RST_STREAM = 3;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final int TYPE_SETTINGS = 4;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final int TYPE_PUSH_PROMISE = 5;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final int TYPE_PING = 6;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final int TYPE_GOAWAY = 7;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final int TYPE_WINDOW_UPDATE = 8;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final int TYPE_CONTINUATION = 9;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final int FLAG_NONE = 0;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final int FLAG_ACK = 1;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final int FLAG_END_STREAM = 1;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final int FLAG_END_HEADERS = 4;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final int FLAG_END_PUSH_PROMISE = 4;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final int FLAG_PADDED = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final int FLAG_PRIORITY = 32;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final int FLAG_COMPRESSED = 32;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final String[] BINARY;

    /* renamed from: x, reason: collision with root package name */
    public static final d f84609x = new d();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public static final p CONNECTION_PREFACE = p.INSTANCE.l(ProtectedSandApp.s("Ჯ"));

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final String[] FRAME_NAMES = {ProtectedSandApp.s("Ჲ"), ProtectedSandApp.s("Ჳ"), ProtectedSandApp.s("Ჴ"), ProtectedSandApp.s("Ჵ"), ProtectedSandApp.s("Ჶ"), ProtectedSandApp.s("Ჷ"), ProtectedSandApp.s("Ჸ"), ProtectedSandApp.s("Ჹ"), ProtectedSandApp.s("Ჰ"), ProtectedSandApp.s("Ჱ")};

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final String[] FLAGS = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i4 = 0; i4 < 256; i4++) {
            String binaryString = Integer.toBinaryString(i4);
            l0.o(binaryString, ProtectedSandApp.s("Ჺ"));
            strArr[i4] = v.h2(okhttp3.internal.d.v(ProtectedSandApp.s("\u1cbb"), binaryString), ' ', '0', false, 4, null);
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = ProtectedSandApp.s("\u1cbc");
        int[] iArr = {1};
        strArr2[8] = ProtectedSandApp.s("Ჽ");
        int i5 = iArr[0];
        int i6 = i5 | 8;
        String str = strArr2[i5];
        String s4 = ProtectedSandApp.s("Ჾ");
        strArr2[i6] = l0.C(str, s4);
        strArr2[4] = ProtectedSandApp.s("Ჿ");
        strArr2[32] = ProtectedSandApp.s("Ჴ");
        strArr2[36] = ProtectedSandApp.s("᳀");
        int[] iArr2 = {4, 32, 36};
        for (int i7 = 0; i7 < 3; i7++) {
            int i10 = iArr2[i7];
            int i11 = iArr[0];
            String[] strArr3 = FLAGS;
            int i12 = i11 | i10;
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i11]);
            String s5 = ProtectedSandApp.s("᳁");
            sb.append(s5);
            sb.append(strArr3[i10]);
            strArr3[i12] = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i11]);
            sb2.append(s5);
            strArr3[i12 | 8] = android.support.v4.media.c.a(sb2, strArr3[i10], s4);
        }
        int length = FLAGS.length;
        for (int i13 = 0; i13 < length; i13++) {
            String[] strArr4 = FLAGS;
            if (strArr4[i13] == null) {
                strArr4[i13] = BINARY[i13];
            }
        }
    }

    private d() {
    }

    @fg.l
    public final String a(int type, int flags) {
        String str;
        if (flags == 0) {
            return "";
        }
        if (type != 2 && type != 3) {
            if (type == 4 || type == 6) {
                return flags == 1 ? ProtectedSandApp.s("᳃") : BINARY[flags];
            }
            if (type != 7 && type != 8) {
                String[] strArr = FLAGS;
                if (flags < strArr.length) {
                    str = strArr[flags];
                    l0.m(str);
                } else {
                    str = BINARY[flags];
                }
                String str2 = str;
                return (type != 5 || (flags & 4) == 0) ? (type != 0 || (flags & 32) == 0) ? str2 : v.i2(str2, ProtectedSandApp.s("Ჴ"), ProtectedSandApp.s("᳂"), false, 4, null) : v.i2(str2, ProtectedSandApp.s("Ჳ"), ProtectedSandApp.s("Ჷ"), false, 4, null);
            }
        }
        return BINARY[flags];
    }

    @fg.l
    public final String b(int type) {
        String[] strArr = FRAME_NAMES;
        if (type < strArr.length) {
            return strArr[type];
        }
        return okhttp3.internal.d.v(ProtectedSandApp.s("᳄"), Integer.valueOf(type));
    }

    @fg.l
    public final String c(boolean inbound, int streamId, int length, int type, int flags) {
        return okhttp3.internal.d.v(ProtectedSandApp.s("᳇"), inbound ? ProtectedSandApp.s("᳅") : ProtectedSandApp.s("᳆"), Integer.valueOf(streamId), Integer.valueOf(length), b(type), a(type, flags));
    }
}
