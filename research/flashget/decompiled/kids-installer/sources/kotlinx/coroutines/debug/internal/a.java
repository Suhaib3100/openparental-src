package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;

/* compiled from: AgentInstallationType.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\b\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0003\u0010\u0007¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/debug/internal/a;", "", "", "b", "Z", "a", "()Z", "(Z)V", "isInstalledStatically", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final a f27621a = new a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static boolean isInstalledStatically;

    private a() {
    }

    public final boolean a() {
        return isInstalledStatically;
    }

    public final void b(boolean z5) {
        isInstalledStatically = z5;
    }
}
