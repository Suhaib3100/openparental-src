package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: Dimension.jvm.kt */
@i3.e(i3.a.BINARY)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@i3.f(allowedTargets = {i3.b.FUNCTION, i3.b.PROPERTY_GETTER, i3.b.PROPERTY_SETTER, i3.b.VALUE_PARAMETER, i3.b.FIELD, i3.b.LOCAL_VARIABLE, i3.b.ANNOTATION_CLASS})
@Retention(RetentionPolicy.CLASS)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/annotation/r;", "", "", "unit", "()I", "a", "annotation"}, k = 1, mv = {1, 7, 0})
@i3.c
@Documented
/* loaded from: classes.dex */
public @interface r {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE = Companion.f153a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f150b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f151c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f152d = 2;

    /* compiled from: Dimension.jvm.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\f"}, d2 = {"Landroidx/annotation/r$a;", "", "", "b", "I", "DP", "c", "PX", "d", "SP", "<init>", "()V", "annotation"}, k = 1, mv = {1, 7, 0})
    /* renamed from: androidx.annotation.r$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f153a = new Companion();

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
