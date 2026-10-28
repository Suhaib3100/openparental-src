package kotlinx.coroutines.channels;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlinx.coroutines.internal.r0;

/* compiled from: AbstractChannel.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u0004\u0018\u00010\u0001H\u0082\bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u0005H\u0082\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0016\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u0012\u0004\b\u0015\u0010\u0012\"\u001a\u0010\u0019\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u0012\u0004\b\u0018\u0010\u0012\"\u001a\u0010\u001c\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u0012\u0004\b\u001b\u0010\u0012\"\u001a\u0010\u001e\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u0012\u0004\b\u001d\u0010\u0012\"\u001a\u0010 \u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u0012\u0004\b\u001f\u0010\u0012*(\b\u0000\u0010$\"\u0010\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020#0!2\u0010\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020#0!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"E", "", "Lkotlinx/coroutines/channels/r;", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/w;", "h", "(Lkotlinx/coroutines/channels/w;)Ljava/lang/Object;", "", "a", "I", "RECEIVE_THROWS_ON_CLOSE", "b", "RECEIVE_RESULT", "Lkotlinx/coroutines/internal/r0;", "c", "Lkotlinx/coroutines/internal/r0;", "getEMPTY$annotations", "()V", "EMPTY", "d", "getOFFER_SUCCESS$annotations", "OFFER_SUCCESS", "e", "getOFFER_FAILED$annotations", "OFFER_FAILED", "f", "getPOLL_FAILED$annotations", "POLL_FAILED", "getENQUEUE_FAILED$annotations", "ENQUEUE_FAILED", "getHANDLER_INVOKED$annotations", "HANDLER_INVOKED", "Lkotlin/Function1;", "", "Lkotlin/m2;", "Handler", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f27301a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f27302b = 1;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final r0 f27303c = new r0(ProtectedSandApp.s("岣"));

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final r0 f27304d = new r0(ProtectedSandApp.s("岤"));

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final r0 f27305e = new r0(ProtectedSandApp.s("岥"));

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final r0 f27306f = new r0(ProtectedSandApp.s("岦"));

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final r0 f27307g = new r0(ProtectedSandApp.s("岧"));

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    @p3.f
    public static final r0 f27308h = new r0(ProtectedSandApp.s("岨"));

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void c() {
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void f() {
    }

    private static final <E> Object g(Object obj) {
        if (obj instanceof w) {
            return r.INSTANCE.a(((w) obj).closeCause);
        }
        r.INSTANCE.getClass();
        return r.c(obj);
    }

    private static final <E> Object h(w<?> wVar) {
        return r.INSTANCE.a(wVar.closeCause);
    }
}
