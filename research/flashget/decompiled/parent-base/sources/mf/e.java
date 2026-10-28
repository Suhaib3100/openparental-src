package mf;

import cg.p;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: EnsuresNonNullIf.java */
@p
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@cg.c(qualifier = i.class)
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface e {

    /* compiled from: EnsuresNonNullIf.java */
    @p
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @cg.c(qualifier = i.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        e[] value();
    }

    String[] expression();

    boolean result();
}
