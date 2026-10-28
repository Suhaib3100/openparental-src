package lf;

import cg.p;
import cg.x;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: EnsuresLockHeld.java */
@p
@x(qualifier = h.class)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
@Repeatable(InterfaceC1271a.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface a {

    /* compiled from: EnsuresLockHeld.java */
    @p
    @x(qualifier = h.class)
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: lf.a$a, reason: collision with other inner class name */
    public @interface InterfaceC1271a {
        a[] value();
    }

    String[] value();
}
