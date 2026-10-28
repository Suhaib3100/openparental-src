package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: InspectableProperty.jvm.kt */
@Target({ElementType.METHOD})
@kotlin.k(message = "Replaced by the androidx.resourceinpsection package.")
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0013R\u0011\u0010\t\u001a\u00020\b8\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\u0014R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\u0015R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/annotation/e0;", "", "", "name", "", "attributeId", "", "hasAttributeId", "Landroidx/annotation/e0$c;", "valueType", "", "Landroidx/annotation/e0$a;", "enumMapping", "Landroidx/annotation/e0$b;", "flagMapping", "<init>", "(Ljava/lang/String;IZLandroidx/annotation/e0$c;Lkotlin/Array;Lkotlin/Array;)V", "()Ljava/lang/String;", "()I", "()Z", "()Landroidx/annotation/e0$c;", "()[Landroidx/annotation/e0$a;", "()[Landroidx/annotation/e0$b;", "a", "b", "c", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
@dd.e(dd.a.SOURCE)
@Retention(RetentionPolicy.SOURCE)
@dd.f(allowedTargets = {dd.b.FUNCTION, dd.b.PROPERTY_GETTER, dd.b.PROPERTY_SETTER})
/* loaded from: classes.dex */
public @interface e0 {

    /* compiled from: InspectableProperty.jvm.kt */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\bR\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Landroidx/annotation/e0$a;", "", "", "name", "", "value", "<init>", "(Ljava/lang/String;I)V", "()Ljava/lang/String;", "()I", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
    @dd.e(dd.a.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    @dd.f(allowedTargets = {dd.b.ANNOTATION_CLASS, dd.b.CLASS})
    public @interface a {
        String name();

        int value();
    }

    /* compiled from: InspectableProperty.jvm.kt */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\tR\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\nR\u0011\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/annotation/e0$b;", "", "", "name", "", "target", "mask", "<init>", "(Ljava/lang/String;II)V", "()Ljava/lang/String;", "()I", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
    @dd.e(dd.a.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    @dd.f(allowedTargets = {dd.b.ANNOTATION_CLASS, dd.b.CLASS})
    public @interface b {
        int mask() default 0;

        String name();

        int target();
    }

    /* compiled from: InspectableProperty.jvm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Landroidx/annotation/e0$c;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "INFERRED", "INT_ENUM", "INT_FLAG", "COLOR", "GRAVITY", "RESOURCE_ID", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum c {
        NONE,
        INFERRED,
        INT_ENUM,
        INT_FLAG,
        COLOR,
        GRAVITY,
        RESOURCE_ID
    }

    int attributeId() default 0;

    a[] enumMapping() default {};

    b[] flagMapping() default {};

    boolean hasAttributeId() default true;

    String name() default "";

    c valueType() default c.INFERRED;
}
