package w4;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WakeLock.java */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes5.dex */
public @interface z1 {

    /* renamed from: z0, reason: collision with root package name */
    public static final String f34026z0 = ProtectedSandApp.s("歎");

    /* compiled from: WakeLock.java */
    public enum a {
        ACQUIRE_CAUSES_WAKEUP,
        ON_AFTER_RELEASE
    }

    /* compiled from: WakeLock.java */
    public enum b {
        FULL_WAKE_LOCK,
        PARTIAL_WAKE_LOCK,
        SCREEN_BRIGHT_WAKE_LOCK,
        SCREEN_DIM_WAKE_LOCK
    }

    a[] flags() default {};

    b level() default b.PARTIAL_WAKE_LOCK;

    String tag() default "NO_TAG";
}
