package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: ReplaceWith.jvm.kt */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR})
@i3.f(allowedTargets = {i3.b.FUNCTION, i3.b.FIELD, i3.b.CONSTRUCTOR})
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001e\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\"\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0019\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/annotation/w0;", "", "", "expression", "()Ljava/lang/String;", "", "imports", "()[Ljava/lang/String;", "annotation"}, k = 1, mv = {1, 7, 0})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface w0 {
    String expression();

    String[] imports() default {};
}
