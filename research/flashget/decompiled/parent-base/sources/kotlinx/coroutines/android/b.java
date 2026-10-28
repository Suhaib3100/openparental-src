package kotlinx.coroutines.android;

import android.os.Build;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlinx.coroutines.n0;

/* compiled from: AndroidExceptionPreHandler.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/android/b;", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/n0;", "<init>", "()V", "Ljava/lang/reflect/Method;", "S0", "()Ljava/lang/reflect/Method;", "Lkotlin/coroutines/g;", "context", "", "exception", "Lkotlin/k2;", "N", "(Lkotlin/coroutines/g;Ljava/lang/Throwable;)V", "", "_preHandler", "Ljava/lang/Object;", "kotlinx-coroutines-android"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b extends kotlin.coroutines.a implements n0 {

    @m
    private volatile Object _preHandler;

    public b() {
        super(n0.INSTANCE);
        this._preHandler = this;
    }

    private final Method S0() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod(ProtectedSandApp.s("薜\u0001"), null);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    method = declaredMethod;
                }
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // kotlinx.coroutines.n0
    public void N(@l kotlin.coroutines.g context, @l Throwable exception) {
        int i4 = Build.VERSION.SDK_INT;
        if (26 > i4 || i4 >= 28) {
            return;
        }
        Method S0 = S0();
        Object invoke = S0 != null ? S0.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), exception);
        }
    }
}
