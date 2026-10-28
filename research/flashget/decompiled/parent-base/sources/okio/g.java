package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: GzipSource.kt */
@kd.i(name = "-GzipSourceExtensions")
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0005\n\u0002\b\n\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\n\"\u0014\u0010\r\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\n\"\u0014\u0010\u000f\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\n\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"\u0014\u0010\u0017\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012\"\u0014\u0010\u0019\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012¨\u0006\u001a"}, d2 = {"", "bit", "", "b", "(II)Z", "Lokio/o0;", "Lokio/v;", "c", "(Lokio/o0;)Lokio/v;", "a", "I", "FHCRC", "FEXTRA", "FNAME", "d", "FCOMMENT", "", "e", "B", "SECTION_HEADER", "f", "SECTION_BODY", "g", "SECTION_TRAILER", "h", "SECTION_DONE", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final int f85174a = 1;

    /* renamed from: b, reason: collision with root package name */
    private static final int f85175b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final int f85176c = 3;

    /* renamed from: d, reason: collision with root package name */
    private static final int f85177d = 4;

    /* renamed from: e, reason: collision with root package name */
    private static final byte f85178e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final byte f85179f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final byte f85180g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static final byte f85181h = 3;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(int i4, int i5) {
        return ((i4 >> i5) & 1) == 1;
    }

    @fg.l
    public static final v c(@fg.l o0 o0Var) {
        kotlin.jvm.internal.l0.p(o0Var, ProtectedSandApp.s("\u1f47"));
        return new v(o0Var);
    }
}
