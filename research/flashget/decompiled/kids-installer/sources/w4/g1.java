package w4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Receiver.java */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes5.dex */
public @interface g1 {

    /* compiled from: Receiver.java */
    @Target({ElementType.PARAMETER})
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
        String value() default "";
    }

    /* compiled from: Receiver.java */
    public enum b {
        OnCreateOnDestroy,
        OnStartOnStop,
        OnResumeOnPause,
        OnAttachOnDetach
    }

    String[] actions();

    String[] dataSchemes() default {};

    boolean local() default false;

    b registerAt() default b.OnCreateOnDestroy;
}
