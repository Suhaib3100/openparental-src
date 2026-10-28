package lf;

import cg.f0;
import cg.h0;
import cg.i0;
import cg.k0;
import cg.r;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: GuardedBy.java */
@cg.h
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@cg.e(typeKinds = {h0.BOOLEAN, h0.BYTE, h0.CHAR, h0.DOUBLE, h0.FLOAT, h0.INT, h0.LONG, h0.SHORT}, types = {String.class, Void.class}, value = {i0.EXCEPTION_PARAMETER, i0.UPPER_BOUND})
@f0({f.class})
@k0(typeKinds = {h0.BOOLEAN, h0.BYTE, h0.CHAR, h0.DOUBLE, h0.FLOAT, h0.INT, h0.LONG, h0.SHORT}, types = {String.class})
@Documented
/* loaded from: classes3.dex */
public @interface d {
    @r
    String[] value() default {};
}
