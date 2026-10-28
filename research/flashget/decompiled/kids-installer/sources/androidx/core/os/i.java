package androidx.core.os;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.lang.reflect.InvocationTargetException;

/* compiled from: HandlerCompat.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4975a = "HandlerCompat";

    /* compiled from: HandlerCompat.java */
    @x0(28)
    private static class a {
        private a() {
        }

        public static Handler a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }

        public static Handler b(Looper looper, Handler.Callback callback) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper, callback);
            return createAsync;
        }

        public static boolean c(Handler handler, Runnable runnable, Object obj, long j5) {
            boolean postDelayed;
            postDelayed = handler.postDelayed(runnable, obj, j5);
            return postDelayed;
        }
    }

    /* compiled from: HandlerCompat.java */
    @x0(29)
    private static class b {
        private b() {
        }

        public static boolean a(Handler handler, Runnable runnable) {
            boolean hasCallbacks;
            hasCallbacks = handler.hasCallbacks(runnable);
            return hasCallbacks;
        }
    }

    private i() {
    }

    @o0
    public static Handler a(@o0 Looper looper) {
        Handler createAsync;
        if (Build.VERSION.SDK_INT >= 28) {
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    @o0
    public static Handler b(@o0 Looper looper, @o0 Handler.Callback callback) {
        Handler createAsync;
        if (Build.VERSION.SDK_INT >= 28) {
            createAsync = Handler.createAsync(looper, callback);
            return createAsync;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, callback, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper, callback);
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    @x0(16)
    public static boolean c(@o0 Handler handler, @o0 Runnable runnable) {
        boolean hasCallbacks;
        if (Build.VERSION.SDK_INT >= 29) {
            hasCallbacks = handler.hasCallbacks(runnable);
            return hasCallbacks;
        }
        try {
            return ((Boolean) Handler.class.getMethod("hasCallbacks", Runnable.class).invoke(handler, runnable)).booleanValue();
        } catch (IllegalAccessException e6) {
            e = e6;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (NoSuchMethodException e7) {
            e = e7;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (NullPointerException e8) {
            e = e8;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean d(@o0 Handler handler, @o0 Runnable runnable, @q0 Object obj, long j5) {
        boolean postDelayed;
        if (Build.VERSION.SDK_INT >= 28) {
            postDelayed = handler.postDelayed(runnable, obj, j5);
            return postDelayed;
        }
        Message obtain = Message.obtain(handler, runnable);
        obtain.obj = obj;
        return handler.sendMessageDelayed(obtain, j5);
    }
}
