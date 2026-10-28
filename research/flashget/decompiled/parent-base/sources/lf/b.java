package lf;

import cg.p;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: EnsuresLockHeldIf.java */
@p
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@cg.c(qualifier = h.class)
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface b {

    /* compiled from: EnsuresLockHeldIf.java */
    @p
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @cg.c(qualifier = h.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        b[] value();
    }

    String[] expression();

    boolean result();
}
