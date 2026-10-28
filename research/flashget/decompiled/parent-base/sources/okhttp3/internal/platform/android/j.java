package okhttp3.internal.platform.android;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: CloseGuard.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\nB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/platform/android/j;", "", "Ljava/lang/reflect/Method;", "getMethod", "openMethod", "warnIfOpenMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "", "closer", "a", "(Ljava/lang/String;)Ljava/lang/Object;", "closeGuardInstance", "", "b", "(Ljava/lang/Object;)Z", "Ljava/lang/reflect/Method;", "c", "d", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Method getMethod;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Method openMethod;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Method warnIfOpenMethod;

    /* compiled from: CloseGuard.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/platform/android/j$a;", "", "<init>", "()V", "Lokhttp3/internal/platform/android/j;", "a", "()Lokhttp3/internal/platform/android/j;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.platform.android.j$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final j a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName(ProtectedSandApp.s("ᷦ"));
                Method method4 = cls.getMethod(ProtectedSandApp.s("ᷧ"), null);
                method2 = cls.getMethod(ProtectedSandApp.s("ᷨ"), String.class);
                method = cls.getMethod(ProtectedSandApp.s("ᷩ"), null);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new j(method3, method2, method);
        }

        public Companion(w wVar) {
        }
    }

    public j(@fg.m Method method, @fg.m Method method2, @fg.m Method method3) {
        this.getMethod = method;
        this.openMethod = method2;
        this.warnIfOpenMethod = method3;
    }

    @fg.m
    public final Object a(@fg.l String closer) {
        l0.p(closer, ProtectedSandApp.s("ᷪ"));
        Method method = this.getMethod;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                Method method2 = this.openMethod;
                l0.m(method2);
                method2.invoke(invoke, closer);
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(@fg.m Object closeGuardInstance) {
        if (closeGuardInstance != null) {
            try {
                Method method = this.warnIfOpenMethod;
                l0.m(method);
                method.invoke(closeGuardInstance, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
