package kotlinx.coroutines.android;

import android.os.Build;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.p0;

/* compiled from: AndroidExceptionPreHandler.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/android/b;", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/p0;", "Ljava/lang/reflect/Method;", "y0", "Lkotlin/coroutines/g;", "context", "", "exception", "Lkotlin/m2;", "n0", "", "_preHandler", "Ljava/lang/Object;", "<init>", "()V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class b extends AbstractCoroutineContextElement implements p0 {

    @d5.e
    private volatile Object _preHandler;

    public b() {
        super(p0.INSTANCE);
        this._preHandler = this;
    }

    private final Method y0() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z5 = false;
            Method declaredMethod = Thread.class.getDeclaredMethod(ProtectedSandApp.s("遲"), new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z5 = true;
                }
            }
            if (z5) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // kotlinx.coroutines.p0
    public void n0(@d5.d CoroutineContext coroutineContext, @d5.d Throwable th) {
        int i5 = Build.VERSION.SDK_INT;
        if (26 <= i5 && i5 < 28) {
            Method y02 = y0();
            Object invoke = y02 != null ? y02.invoke(null, new Object[0]) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
