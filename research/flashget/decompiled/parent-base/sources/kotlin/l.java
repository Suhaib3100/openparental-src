package kotlin;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Annotations.kt */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@dd.c
@c1(version = "1.4")
@Retention(RetentionPolicy.RUNTIME)
@dd.f(allowedTargets = {dd.b.CLASS, dd.b.FUNCTION, dd.b.PROPERTY, dd.b.ANNOTATION_CLASS, dd.b.CONSTRUCTOR, dd.b.PROPERTY_SETTER, dd.b.PROPERTY_GETTER, dd.b.TYPEALIAS})
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0002\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\bR\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/l;", "", "", "warningSince", "errorSince", "hiddenSince", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Documented
/* loaded from: classes7.dex */
public @interface l {
    String errorSince() default "";

    String hiddenSince() default "";

    String warningSince() default "";
}
