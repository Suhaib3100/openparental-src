package v0;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.jvm.internal.n1;

/* compiled from: Preview.android.kt */
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@dd.c
@dd.d
@dd.e(dd.a.BINARY)
@Retention(RetentionPolicy.CLASS)
@dd.f(allowedTargets = {dd.b.ANNOTATION_CLASS, dd.b.FUNCTION})
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0017R\u0011\u0010\b\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\u0017R\u0011\u0010\t\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0018R\u0011\u0010\r\u001a\u00020\f8\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0016R\u0011\u0010\u0013\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u001b"}, d2 = {"Lv0/c;", "", "", "name", "group", "", "apiLevel", "widthDp", "heightDp", "locale", "", "fontScale", "", "showSystemUi", "showBackground", "", "backgroundColor", "uiMode", "device", "wallpaper", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;FZZJILjava/lang/String;I)V", "()Ljava/lang/String;", "()I", "()F", "()Z", "()J", "ui-tooling-preview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Documented
@Repeatable(a.class)
/* loaded from: classes.dex */
public @interface c {

    /* compiled from: Preview.android.kt */
    @Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @n1
    @dd.e(dd.a.BINARY)
    @Retention(RetentionPolicy.CLASS)
    @dd.f(allowedTargets = {dd.b.ANNOTATION_CLASS, dd.b.FUNCTION})
    public @interface a {
        c[] value();
    }

    int apiLevel() default -1;

    long backgroundColor() default 0;

    String device() default "";

    float fontScale() default 1.0f;

    String group() default "";

    int heightDp() default -1;

    String locale() default "";

    String name() default "";

    boolean showBackground() default false;

    boolean showSystemUi() default false;

    int uiMode() default 0;

    int wallpaper() default -1;

    int widthDp() default -1;
}
