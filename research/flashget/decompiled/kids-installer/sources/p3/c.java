package p3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.SinceKotlin;

/* compiled from: JvmDefault.kt */
@Target({ElementType.METHOD})
@i3.f(allowedTargets = {i3.b.FUNCTION, i3.b.PROPERTY})
@Deprecated(level = DeprecationLevel.ERROR, message = "Switch to new -Xjvm-default modes: `all` or `all-compatibility`")
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lkotlin/jvm/JvmDefault;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SinceKotlin(version = "1.2")
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes5.dex */
public @interface c {
}
