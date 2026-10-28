package w4;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Trace.java */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes5.dex */
public @interface u1 {

    /* renamed from: y0, reason: collision with root package name */
    public static final String f34025y0 = ProtectedSandApp.s("歅");

    int level() default 4;

    String tag() default "NO_TAG";
}
