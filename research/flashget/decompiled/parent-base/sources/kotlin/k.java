package kotlin;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Annotations.kt */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\nR\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/k;", "", "", "message", "Lkotlin/x0;", "replaceWith", "Lkotlin/m;", "level", "<init>", "(Ljava/lang/String;Lkotlin/x0;Lkotlin/m;)V", "()Ljava/lang/String;", "()Lkotlin/x0;", "()Lkotlin/m;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@dd.c
@Documented
@Retention(RetentionPolicy.RUNTIME)
@dd.f(allowedTargets = {dd.b.CLASS, dd.b.FUNCTION, dd.b.PROPERTY, dd.b.ANNOTATION_CLASS, dd.b.CONSTRUCTOR, dd.b.PROPERTY_SETTER, dd.b.PROPERTY_GETTER, dd.b.TYPEALIAS})
/* loaded from: classes7.dex */
public @interface k {
    m level() default m.WARNING;

    String message();

    x0 replaceWith() default @x0(expression = "", imports = {});
}
