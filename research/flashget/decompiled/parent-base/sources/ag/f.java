package ag;

import cg.a0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: EnsuresMinLenIf.java */
@cg.p
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@cg.c(qualifier = n.class)
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface f {

    /* compiled from: EnsuresMinLenIf.java */
    @cg.p
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @cg.c(qualifier = n.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        f[] value();
    }

    String[] expression();

    boolean result();

    @a0("value")
    int targetValue() default 0;
}
