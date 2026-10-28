package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: RequiresExtension.jvm.kt */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@dd.c
@dd.d
@dd.e(dd.a.BINARY)
@Retention(RetentionPolicy.CLASS)
@dd.f(allowedTargets = {dd.b.ANNOTATION_CLASS, dd.b.CLASS, dd.b.FUNCTION, dd.b.PROPERTY_GETTER, dd.b.PROPERTY_SETTER, dd.b.CONSTRUCTOR, dd.b.FIELD, dd.b.FILE})
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/annotation/y0;", "", "", "extension", "version", "<init>", "(II)V", "()I", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
@Documented
@Repeatable(a.class)
/* loaded from: classes.dex */
public @interface y0 {

    /* compiled from: RequiresExtension.jvm.kt */
    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    @kotlin.jvm.internal.n1
    @dd.e(dd.a.BINARY)
    @Retention(RetentionPolicy.CLASS)
    @dd.f(allowedTargets = {dd.b.ANNOTATION_CLASS, dd.b.CLASS, dd.b.FUNCTION, dd.b.PROPERTY_GETTER, dd.b.PROPERTY_SETTER, dd.b.CONSTRUCTOR, dd.b.FIELD, dd.b.FILE})
    public @interface a {
        y0[] value();
    }

    int extension();

    int version();
}
