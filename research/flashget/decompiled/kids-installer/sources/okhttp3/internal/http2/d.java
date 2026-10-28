package okhttp3.internal.http2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.text.e0;
import okio.p;

/* compiled from: Http2.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0011\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b>\u0010?J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004R\u0014\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0011R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0011R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0011R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0011R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0011R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0011R\u0014\u0010-\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0011R\u0014\u0010/\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0011R\u0014\u00101\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0011R\u0014\u00103\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0011R\u0014\u00105\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u0011R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\t068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\t068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00108¨\u0006@"}, d2 = {"Lokhttp3/internal/http2/d;", "", "", "inbound", "", "streamId", "length", "type", "flags", "", "c", "b", "(I)Ljava/lang/String;", "a", "Lokio/p;", "Lokio/p;", "CONNECTION_PREFACE", "I", "INITIAL_MAX_FRAME_SIZE", "TYPE_DATA", "d", "TYPE_HEADERS", "e", "TYPE_PRIORITY", "f", "TYPE_RST_STREAM", "g", "TYPE_SETTINGS", "h", "TYPE_PUSH_PROMISE", "i", "TYPE_PING", "j", "TYPE_GOAWAY", "k", "TYPE_WINDOW_UPDATE", "l", "TYPE_CONTINUATION", "m", "FLAG_NONE", "n", "FLAG_ACK", "o", "FLAG_END_STREAM", "p", "FLAG_END_HEADERS", "q", "FLAG_END_PUSH_PROMISE", "r", "FLAG_PADDED", "s", "FLAG_PRIORITY", "t", "FLAG_COMPRESSED", "", "u", "[Ljava/lang/String;", "FRAME_NAMES", "v", "FLAGS", "w", "BINARY", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
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
    public static final d f31082x = new d();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public static final p CONNECTION_PREFACE = p.INSTANCE.l(ProtectedSandApp.s("揩"));

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final String[] FRAME_NAMES = {ProtectedSandApp.s("揪"), ProtectedSandApp.s("揫"), ProtectedSandApp.s("揬"), ProtectedSandApp.s("揭"), ProtectedSandApp.s("揮"), ProtectedSandApp.s("揯"), ProtectedSandApp.s("揰"), ProtectedSandApp.s("揱"), ProtectedSandApp.s("揲"), ProtectedSandApp.s("揳")};

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final String[] FLAGS = new String[64];

    static {
        String h22;
        String[] strArr = new String[256];
        for (int i5 = 0; i5 < 256; i5++) {
            String binaryString = Integer.toBinaryString(i5);
            l0.o(binaryString, ProtectedSandApp.s("援"));
            h22 = e0.h2(okhttp3.internal.d.v(ProtectedSandApp.s("揵"), binaryString), ' ', '0', false, 4, null);
            strArr[i5] = h22;
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        String s5 = ProtectedSandApp.s("揶");
        strArr2[1] = s5;
        int[] iArr = {1};
        strArr2[8] = ProtectedSandApp.s("揷");
        String s6 = ProtectedSandApp.s("揸");
        strArr2[1 | 8] = l0.C(s5, s6);
        strArr2[4] = ProtectedSandApp.s("揹");
        strArr2[32] = ProtectedSandApp.s("揺");
        strArr2[36] = ProtectedSandApp.s("揻");
        int[] iArr2 = {4, 32, 36};
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = iArr2[i6];
            int i8 = iArr[0];
            String[] strArr3 = FLAGS;
            int i9 = i8 | i7;
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i8]);
            String s7 = ProtectedSandApp.s("揼");
            sb.append(s7);
            sb.append(strArr3[i7]);
            strArr3[i9] = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i8]);
            sb2.append(s7);
            strArr3[i9 | 8] = androidx.concurrent.futures.a.a(sb2, strArr3[i7], s6);
        }
        int length = FLAGS.length;
        for (int i10 = 0; i10 < length; i10++) {
            String[] strArr4 = FLAGS;
            if (strArr4[i10] == null) {
                strArr4[i10] = BINARY[i10];
            }
        }
    }

    private d() {
    }

    @d5.d
    public final String a(int type, int flags) {
        String str;
        String i22;
        String i23;
        if (flags == 0) {
            return "";
        }
        if (type != 2 && type != 3) {
            if (type == 4 || type == 6) {
                return flags == 1 ? ProtectedSandApp.s("搁") : BINARY[flags];
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
                if (type == 5 && (flags & 4) != 0) {
                    i23 = e0.i2(str2, ProtectedSandApp.s("揽"), ProtectedSandApp.s("揾"), false, 4, null);
                    return i23;
                }
                if (type != 0 || (flags & 32) == 0) {
                    return str2;
                }
                i22 = e0.i2(str2, ProtectedSandApp.s("揿"), ProtectedSandApp.s("搀"), false, 4, null);
                return i22;
            }
        }
        return BINARY[flags];
    }

    @d5.d
    public final String b(int type) {
        String[] strArr = FRAME_NAMES;
        return type < strArr.length ? strArr[type] : okhttp3.internal.d.v(ProtectedSandApp.s("搂"), Integer.valueOf(type));
    }

    @d5.d
    public final String c(boolean inbound, int streamId, int length, int type, int flags) {
        return okhttp3.internal.d.v(ProtectedSandApp.s("搅"), inbound ? ProtectedSandApp.s("搃") : ProtectedSandApp.s("搄"), Integer.valueOf(streamId), Integer.valueOf(length), b(type), a(type, flags));
    }
}
