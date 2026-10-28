package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: GuardedBy.kt */
@i3.e(i3.a.BINARY)
@Target({ElementType.FIELD, ElementType.METHOD})
@i3.f(allowedTargets = {i3.b.FIELD, i3.b.FUNCTION, i3.b.PROPERTY_GETTER, i3.b.PROPERTY_SETTER})
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/annotation/b0;", "", "", "value", "()Ljava/lang/String;", "annotation"}, k = 1, mv = {1, 7, 0})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface b0 {
    String value();
}
