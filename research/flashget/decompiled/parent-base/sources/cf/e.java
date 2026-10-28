package cf;

import cg.a0;
import cg.p;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: EnsuresCalledMethodsIf.java */
@p
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@cg.c(qualifier = cf.a.class)
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface e {

    /* compiled from: EnsuresCalledMethodsIf.java */
    @p
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @cg.c(qualifier = cf.a.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
        e[] value();
    }

    String[] expression();

    @a0("value")
    String[] methods();

    boolean result();
}
