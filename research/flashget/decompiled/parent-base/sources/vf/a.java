package vf;

import cg.a0;
import cg.p;
import cg.x;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: EnsuresInitializedFields.java */
@p
@x(qualifier = b.class)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
@Repeatable(InterfaceC1401a.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface a {

    /* compiled from: EnsuresInitializedFields.java */
    @p
    @x(qualifier = b.class)
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: vf.a$a, reason: collision with other inner class name */
    public @interface InterfaceC1401a {
        a[] value();
    }

    @a0("value")
    String[] fields();

    String[] value() default {"this"};
}
