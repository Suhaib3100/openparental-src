package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: RequiresExtension.jvm.kt */
@i3.e(i3.a.BINARY)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@i3.f(allowedTargets = {i3.b.ANNOTATION_CLASS, i3.b.CLASS, i3.b.FUNCTION, i3.b.PROPERTY_GETTER, i3.b.PROPERTY_SETTER, i3.b.CONSTRUCTOR, i3.b.FIELD, i3.b.FILE})
@Retention(RetentionPolicy.CLASS)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0014\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/annotation/y0;", "", "", "extension", "()I", "version", "annotation"}, k = 1, mv = {1, 7, 0})
@i3.c
@Documented
@Repeatable(a.class)
@i3.d
/* loaded from: classes.dex */
public @interface y0 {

    /* compiled from: RequiresExtension.jvm.kt */
    @i3.e(i3.a.BINARY)
    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
    @i3.f(allowedTargets = {i3.b.ANNOTATION_CLASS, i3.b.CLASS, i3.b.FUNCTION, i3.b.PROPERTY_GETTER, i3.b.PROPERTY_SETTER, i3.b.CONSTRUCTOR, i3.b.FIELD, i3.b.FILE})
    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    @kotlin.jvm.internal.n1
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
        y0[] value();
    }

    int extension();

    int version();
}
