package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: BuiltInTypeConverters.kt */
@Target({})
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\tB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\bR\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\n"}, d2 = {"Landroidx/room/h;", "", "Landroidx/room/h$a;", "enums", "uuid", "byteBuffer", "<init>", "(Landroidx/room/h$a;Landroidx/room/h$a;Landroidx/room/h$a;)V", "()Landroidx/room/h$a;", "a", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@dd.e(dd.a.BINARY)
@Retention(RetentionPolicy.CLASS)
@dd.f(allowedTargets = {})
/* loaded from: classes3.dex */
public @interface h {

    /* compiled from: BuiltInTypeConverters.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/room/h$a;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", "INHERITED", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum a {
        ENABLED,
        DISABLED,
        INHERITED
    }

    a byteBuffer() default a.INHERITED;

    a enums() default a.INHERITED;

    a uuid() default a.INHERITED;
}
