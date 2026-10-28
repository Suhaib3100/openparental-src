package okhttp3.internal.ws;

import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okio.m;
import okio.p;

/* compiled from: WebSocketProtocol.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\t\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b:\u0010;J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nR\u0014\u0010\u000f\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0014\u0010\u001b\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0014\u0010\u001d\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u0014\u0010\u001f\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010R\u0014\u0010!\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u0010R\u0014\u0010#\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010\u0010R\u0014\u0010%\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\u0010R\u0014\u0010'\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010\u0010R\u0014\u0010)\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010\u0010R\u0014\u0010-\u001a\u00020*8\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020*8\u0000X\u0080T¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u00101\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010\u0010R\u0014\u00103\u001a\u00020*8\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u0010,R\u0014\u00105\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b4\u0010\u0010R\u0014\u00107\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b6\u0010\u0010R\u0014\u00109\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u0010\u0010¨\u0006<"}, d2 = {"Lokhttp3/internal/ws/g;", "", "Lokio/m$a;", "cursor", "", "key", "Lkotlin/m2;", "c", "", "code", "", "b", "d", "a", "Ljava/lang/String;", "ACCEPT_MAGIC", "I", "B0_FLAG_FIN", "B0_FLAG_RSV1", "B0_FLAG_RSV2", "e", "B0_FLAG_RSV3", "f", "B0_MASK_OPCODE", "g", "OPCODE_FLAG_CONTROL", "h", "B1_FLAG_MASK", "i", "B1_MASK_LENGTH", "j", "OPCODE_CONTINUATION", "k", "OPCODE_TEXT", "l", "OPCODE_BINARY", "m", "OPCODE_CONTROL_CLOSE", "n", "OPCODE_CONTROL_PING", "o", "OPCODE_CONTROL_PONG", "", "p", "J", "PAYLOAD_BYTE_MAX", "q", "CLOSE_MESSAGE_MAX", "r", "PAYLOAD_SHORT", "s", "PAYLOAD_SHORT_MAX", "t", "PAYLOAD_LONG", "u", "CLOSE_CLIENT_GOING_AWAY", "v", "CLOSE_NO_STATUS_CODE", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
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
    @d5.d
    public static final String ACCEPT_MAGIC = ProtectedSandApp.s("旵");

    /* renamed from: w, reason: collision with root package name */
    public static final g f31433w = new g();

    private g() {
    }

    @d5.d
    public final String a(@d5.d String key) {
        l0.p(key, ProtectedSandApp.s("时"));
        return p.INSTANCE.l(key + ProtectedSandApp.s("旷")).f0().l();
    }

    @d5.e
    public final String b(int code) {
        if (code < 1000 || code >= 5000) {
            return s.a(ProtectedSandApp.s("旺"), code);
        }
        if ((1004 > code || 1006 < code) && (1015 > code || 2999 < code)) {
            return null;
        }
        return androidx.constraintlayout.solver.f.a(ProtectedSandApp.s("旸"), code, ProtectedSandApp.s("旹"));
    }

    public final void c(@d5.d m.a aVar, @d5.d byte[] bArr) {
        l0.p(aVar, ProtectedSandApp.s("旻"));
        l0.p(bArr, ProtectedSandApp.s("旼"));
        int length = bArr.length;
        int i5 = 0;
        do {
            byte[] bArr2 = aVar.data;
            int i6 = aVar.start;
            int i7 = aVar.end;
            if (bArr2 != null) {
                while (i6 < i7) {
                    int i8 = i5 % length;
                    bArr2[i6] = (byte) (bArr2[i6] ^ bArr[i8]);
                    i6++;
                    i5 = i8 + 1;
                }
            }
        } while (aVar.b() != -1);
    }

    public final void d(int i5) {
        String b6 = b(i5);
        if (b6 == null) {
            return;
        }
        l0.m(b6);
        throw new IllegalArgumentException(b6.toString());
    }
}
