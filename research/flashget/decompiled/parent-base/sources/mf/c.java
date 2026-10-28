package mf;

import cg.a0;
import cg.p;
import cg.r;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: EnsuresKeyForIf.java */
@p
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@cg.c(qualifier = f.class)
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface c {

    /* compiled from: EnsuresKeyForIf.java */
    @p
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @cg.c(qualifier = f.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        c[] value();
    }

    String[] expression();

    @a0("value")
    @r
    String[] map();

    boolean result();
}
