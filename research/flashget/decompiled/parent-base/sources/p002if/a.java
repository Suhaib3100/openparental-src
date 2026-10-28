package p002if;

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

/* compiled from: EnsuresLTLengthOf.java */
@p
@x(qualifier = i.class)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
@Repeatable(InterfaceC1030a.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface a {

    /* compiled from: EnsuresLTLengthOf.java */
    @p
    @x(qualifier = i.class)
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: if.a$a, reason: collision with other inner class name */
    public @interface InterfaceC1030a {
        a[] value();
    }

    @a0("offset")
    @r
    String[] offset() default {};

    @a0("value")
    @r
    String[] targetValue();

    @r
    String[] value();
}
