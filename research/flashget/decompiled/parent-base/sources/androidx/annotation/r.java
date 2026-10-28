package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: Dimension.jvm.kt */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@dd.c
@dd.e(dd.a.BINARY)
@Retention(RetentionPolicy.CLASS)
@dd.f(allowedTargets = {dd.b.FUNCTION, dd.b.PROPERTY_GETTER, dd.b.PROPERTY_SETTER, dd.b.VALUE_PARAMETER, dd.b.FIELD, dd.b.LOCAL_VARIABLE, dd.b.ANNOTATION_CLASS})
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/annotation/r;", "", "", "unit", "<init>", "(I)V", "()I", "a", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
@Documented
/* loaded from: classes.dex */
public @interface r {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f646a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f643b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f644c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f645d = 2;

    /* compiled from: Dimension.jvm.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/annotation/r$a;", "", "<init>", "()V", "", "b", "I", "DP", "c", "PX", "d", "SP", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
    /* renamed from: androidx.annotation.r$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f646a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int DP = 0;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final int PX = 1;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final int SP = 2;

        private Companion() {
        }
    }

    int unit() default 1;
}
