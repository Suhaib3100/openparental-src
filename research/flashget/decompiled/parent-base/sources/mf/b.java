package mf;

import cg.a0;
import cg.p;
import cg.r;
import cg.x;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: EnsuresKeyFor.java */
@p
@x(qualifier = f.class)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface b {

    /* compiled from: EnsuresKeyFor.java */
    @p
    @x(qualifier = f.class)
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        b[] value();
    }

    @a0("value")
    @r
    String[] map();

    String[] value();
}
