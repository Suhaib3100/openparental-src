package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: RequiresPermission.jvm.kt */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@dd.c
@dd.e(dd.a.BINARY)
@Retention(RetentionPolicy.CLASS)
@dd.f(allowedTargets = {dd.b.ANNOTATION_CLASS, dd.b.FUNCTION, dd.b.PROPERTY_GETTER, dd.b.PROPERTY_SETTER, dd.b.CONSTRUCTOR, dd.b.FIELD, dd.b.VALUE_PARAMETER})
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\b\u001a\u00020\u00078\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/annotation/b1;", "", "", "value", "", "allOf", "anyOf", "", "conditional", "<init>", "(Ljava/lang/String;Lkotlin/Array;Lkotlin/Array;Z)V", "()Ljava/lang/String;", "()[Ljava/lang/String;", "()Z", "a", "b", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
@Documented
/* loaded from: classes.dex */
public @interface b1 {

    /* compiled from: RequiresPermission.jvm.kt */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/annotation/b1$a;", "", "Landroidx/annotation/b1;", "value", "<init>", "(Landroidx/annotation/b1;)V", "()Landroidx/annotation/b1;", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    @dd.f(allowedTargets = {dd.b.FIELD, dd.b.FUNCTION, dd.b.PROPERTY_GETTER, dd.b.PROPERTY_SETTER, dd.b.VALUE_PARAMETER})
    public @interface a {
        b1 value() default @b1;
    }

    /* compiled from: RequiresPermission.jvm.kt */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/annotation/b1$b;", "", "Landroidx/annotation/b1;", "value", "<init>", "(Landroidx/annotation/b1;)V", "()Landroidx/annotation/b1;", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    @dd.f(allowedTargets = {dd.b.FIELD, dd.b.FUNCTION, dd.b.PROPERTY_GETTER, dd.b.PROPERTY_SETTER, dd.b.VALUE_PARAMETER})
    public @interface b {
        b1 value() default @b1;
    }

    String[] allOf() default {};

    String[] anyOf() default {};

    boolean conditional() default false;

    String value() default "";
}
