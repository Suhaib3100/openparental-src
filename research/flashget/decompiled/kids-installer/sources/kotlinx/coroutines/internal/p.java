package kotlinx.coroutines.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.Result;

/* compiled from: FastServiceLoader.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"", "a", "Z", "()Z", "ANDROID_DETECTED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f28739a;

    static {
        Object a6;
        try {
            Result.a aVar = Result.f27242p;
            a6 = Result.b(Class.forName(ProtectedSandApp.s("己")));
        } catch (Throwable th) {
            Result.a aVar2 = Result.f27242p;
            a6 = kotlin.a1.a(th);
        }
        f28739a = Result.j(a6);
    }

    public static final boolean a() {
        return f28739a;
    }
}
