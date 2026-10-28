package kotlin.reflect.jvm;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.RequiresOptIn;
import kotlin.SinceKotlin;

/* compiled from: reflectLambda.kt */
@i3.e(i3.a.BINARY)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@i3.f(allowedTargets = {i3.b.CLASS, i3.b.ANNOTATION_CLASS, i3.b.PROPERTY, i3.b.FIELD, i3.b.LOCAL_VARIABLE, i3.b.VALUE_PARAMETER, i3.b.CONSTRUCTOR, i3.b.FUNCTION, i3.b.PROPERTY_GETTER, i3.b.PROPERTY_SETTER, i3.b.TYPEALIAS})
@SinceKotlin(version = "1.5")
@Retention(RetentionPolicy.CLASS)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/a;", "", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
@RequiresOptIn(level = RequiresOptIn.a.WARNING)
@i3.c
@Documented
/* loaded from: classes5.dex */
public @interface a {
}
