package t9;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Encodable.java */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface a {

    /* compiled from: Encodable.java */
    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: t9.a$a, reason: collision with other inner class name */
    public @interface InterfaceC1396a {
        boolean inline() default false;

        String name() default "";
    }

    /* compiled from: Encodable.java */
    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
    }
}
