package c;

import dd.e;
import dd.f;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.k;
import kotlin.x0;

/* compiled from: Experimental.kt */
@Target({ElementType.ANNOTATION_TYPE})
@k(message = "This annotation has been replaced by `@RequiresOptIn`", replaceWith = @x0(expression = "RequiresOptIn", imports = {"androidx.annotation.RequiresOptIn"}))
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\b"}, d2 = {"Lc/a;", "", "Lc/a$a;", "level", "<init>", "(Lc/a$a;)V", "()Lc/a$a;", "a", "annotation-experimental_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
@e(dd.a.BINARY)
@Retention(RetentionPolicy.CLASS)
@f(allowedTargets = {dd.b.ANNOTATION_CLASS})
/* loaded from: classes.dex */
public @interface a {

    /* compiled from: Experimental.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lc/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "annotation-experimental_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    /* renamed from: c.a$a, reason: collision with other inner class name */
    public enum EnumC0659a {
        WARNING,
        ERROR
    }

    EnumC0659a level() default EnumC0659a.ERROR;
}
