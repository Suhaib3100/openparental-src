package okhttp3.internal.ws;

import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okio.m;
import okio.p;

/* compiled from: WebSocketProtocol.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\t\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\r8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001f\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0016R\u0014\u0010!\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u0016R\u0014\u0010#\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010\u0016R\u0014\u0010%\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\u0016R\u0014\u0010'\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010\u0016R\u0014\u0010)\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010\u0016R\u0014\u0010+\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b*\u0010\u0016R\u0014\u0010-\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010\u0016R\u0014\u0010/\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b.\u0010\u0016R\u0014\u00103\u001a\u0002008\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u0002008\u0000X\u0080T¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00107\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b6\u0010\u0016R\u0014\u00109\u001a\u0002008\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u00102R\u0014\u0010;\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b:\u0010\u0016R\u0014\u0010=\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u0010\u0016R\u0014\u0010?\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b>\u0010\u0016¨\u0006@"}, d2 = {"Lokhttp3/internal/ws/g;", "", "<init>", "()V", "Lokio/m$a;", "cursor", "", "key", "Lkotlin/k2;", "c", "(Lokio/m$a;[B)V", "", "code", "", "b", "(I)Ljava/lang/String;", "d", "(I)V", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/String;", "ACCEPT_MAGIC", "I", "B0_FLAG_FIN", "B0_FLAG_RSV1", "B0_FLAG_RSV2", "e", "B0_FLAG_RSV3", "f", "B0_MASK_OPCODE", "g", "OPCODE_FLAG_CONTROL", "h", "B1_FLAG_MASK", "i", "B1_MASK_LENGTH", "j", "OPCODE_CONTINUATION", "k", "OPCODE_TEXT", "l", "OPCODE_BINARY", "m", "OPCODE_CONTROL_CLOSE", "n", "OPCODE_CONTROL_PING", "o", "OPCODE_CONTROL_PONG", "", "p", "J", "PAYLOAD_BYTE_MAX", "q", "CLOSE_MESSAGE_MAX", "r", "PAYLOAD_SHORT", "s", "PAYLOAD_SHORT_MAX", "t", "PAYLOAD_LONG", "u", "CLOSE_CLIENT_GOING_AWAY", "v", "CLOSE_NO_STATUS_CODE", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final int B0_FLAG_FIN = 128;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final int B0_FLAG_RSV1 = 64;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final int B0_FLAG_RSV2 = 32;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final int B0_FLAG_RSV3 = 16;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final int B0_MASK_OPCODE = 15;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final int OPCODE_FLAG_CONTROL = 8;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final int B1_FLAG_MASK = 128;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final int B1_MASK_LENGTH = 127;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final int OPCODE_CONTINUATION = 0;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final int OPCODE_TEXT = 1;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final int OPCODE_BINARY = 2;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final int OPCODE_CONTROL_CLOSE = 8;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final int OPCODE_CONTROL_PING = 9;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final int OPCODE_CONTROL_PONG = 10;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final long PAYLOAD_BYTE_MAX = 125;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final long CLOSE_MESSAGE_MAX = 123;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final int PAYLOAD_SHORT = 126;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final long PAYLOAD_SHORT_MAX = 65535;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final int PAYLOAD_LONG = 127;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final int CLOSE_NO_STATUS_CODE = 1005;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    public static final String ACCEPT_MAGIC = ProtectedSandApp.s("ỏ");

    /* renamed from: w, reason: collision with root package name */
    public static final g f84973w = new g();

    private g() {
    }

    @l
    public final String a(@l String key) {
        l0.p(key, ProtectedSandApp.s("Ố"));
        return p.INSTANCE.l(key + ProtectedSandApp.s("ỏ")).a0().d();
    }

    @m
    public final String b(int code) {
        if (code < 1000 || code >= 5000) {
            return android.support.v4.media.a.a(ProtectedSandApp.s("ồ"), code);
        }
        if ((1004 > code || 1006 < code) && (1015 > code || 2999 < code)) {
            return null;
        }
        return r2.a(ProtectedSandApp.s("ố"), code, ProtectedSandApp.s("Ồ"));
    }

    public final void c(@l m.a cursor, @l byte[] key) {
        l0.p(cursor, ProtectedSandApp.s("Ổ"));
        l0.p(key, ProtectedSandApp.s("Ố"));
        int length = key.length;
        int i4 = 0;
        do {
            byte[] bArr = cursor.data;
            int i5 = cursor.start;
            int i6 = cursor.end;
            if (bArr != null) {
                while (i5 < i6) {
                    int i7 = i4 % length;
                    bArr[i5] = (byte) (bArr[i5] ^ key[i7]);
                    i5++;
                    i4 = i7 + 1;
                }
            }
        } while (cursor.b() != -1);
    }

    public final void d(int code) {
        String b5 = b(code);
        if (b5 == null) {
            return;
        }
        l0.m(b5);
        throw new IllegalArgumentException(b5.toString());
    }
}
