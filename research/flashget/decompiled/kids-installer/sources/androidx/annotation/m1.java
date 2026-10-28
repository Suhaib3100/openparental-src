package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

/* compiled from: VisibleForTesting.kt */
@i3.e(i3.a.BINARY)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/annotation/m1;", "", "", "otherwise", "()I", "e", "a", "annotation"}, k = 1, mv = {1, 7, 0})
@i3.c
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface m1 {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE = Companion.f144a;

    /* renamed from: f, reason: collision with root package name */
    public static final int f140f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f141g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f142h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f143i = 5;

    /* compiled from: VisibleForTesting.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000e"}, d2 = {"Landroidx/annotation/m1$a;", "", "", "b", "I", "PRIVATE", "c", "PACKAGE_PRIVATE", "d", "PROTECTED", "e", "NONE", "<init>", "()V", "annotation"}, k = 1, mv = {1, 7, 0})
    /* renamed from: androidx.annotation.m1$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f144a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int PRIVATE = 2;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final int PACKAGE_PRIVATE = 3;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final int PROTECTED = 4;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public static final int NONE = 5;

        private Companion() {
        }
    }

    int otherwise() default 2;
}
