package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: RequiresFeature.kt */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/annotation/z0;", "", "", "name", "enforcement", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/String;", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
@dd.e(dd.a.SOURCE)
@Retention(RetentionPolicy.SOURCE)
@dd.f(allowedTargets = {dd.b.ANNOTATION_CLASS, dd.b.CLASS, dd.b.FIELD, dd.b.FUNCTION, dd.b.PROPERTY_GETTER, dd.b.PROPERTY_SETTER, dd.b.CONSTRUCTOR})
/* loaded from: classes.dex */
public @interface z0 {
    String enforcement();

    String name();
}
