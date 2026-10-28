package w4;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: HttpsClient.java */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.CLASS)
@Deprecated
/* loaded from: classes5.dex */
public @interface h0 {

    /* renamed from: x0, reason: collision with root package name */
    public static final String f34023x0 = ProtectedSandApp.s("款");

    boolean allowAllHostnames() default true;

    int keyStore() default -1;

    String keyStorePwd() default "changeit";

    String keyStoreResName() default "";

    int trustStore() default -1;

    String trustStorePwd() default "changeit";

    String trustStoreResName() default "";
}
