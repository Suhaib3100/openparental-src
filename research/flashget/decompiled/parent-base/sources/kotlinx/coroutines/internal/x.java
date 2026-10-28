package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: LockFreeLinkedList.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u001a\u0017\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0081T¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\t\"\u001a\u0010\r\u001a\u00020\u00058\u0000X\u0081T¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u0012\u0004\b\f\u0010\t\"\u001a\u0010\u000f\u001a\u00020\u00058\u0000X\u0081T¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u0012\u0004\b\u000e\u0010\t\" \u0010\u0012\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0010\u0012\u0004\b\u000b\u0010\t\u001a\u0004\b\u0006\u0010\u0011*\f\b\u0002\u0010\u0013\"\u00020\u00012\u00020\u0001¨\u0006\u0014"}, d2 = {"", "Lkotlinx/coroutines/internal/y;", "Lkotlinx/coroutines/internal/Node;", "f", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/y;", "", "a", "I", "e", "()V", "UNDECIDED", "b", "d", "SUCCESS", "c", "FAILURE", "Ljava/lang/Object;", "()Ljava/lang/Object;", "CONDITION_FALSE", "Node", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final int f80824a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f80825b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f80826c = 2;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final Object f80827d = new s0(ProtectedSandApp.s("蠕\u0001"));

    @fg.l
    public static final Object a() {
        return f80827d;
    }

    @kotlin.w0
    public static /* synthetic */ void b() {
    }

    @kotlin.w0
    public static /* synthetic */ void c() {
    }

    @kotlin.w0
    public static /* synthetic */ void d() {
    }

    @kotlin.w0
    public static /* synthetic */ void e() {
    }

    @fg.l
    @kotlin.w0
    public static final y f(@fg.l Object obj) {
        y yVar;
        m0 m0Var = obj instanceof m0 ? (m0) obj : null;
        if (m0Var != null && (yVar = m0Var.ref) != null) {
            return yVar;
        }
        kotlin.jvm.internal.l0.n(obj, ProtectedSandApp.s("蠖\u0001"));
        return (y) obj;
    }
}
