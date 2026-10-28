package fg;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: ApiStatus.java */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: ApiStatus.java */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
    @Documented
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: fg.a$a, reason: collision with other inner class name */
    public @interface InterfaceC1023a {
        String value();
    }

    /* compiled from: ApiStatus.java */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
    @Documented
    @Retention(RetentionPolicy.CLASS)
    public @interface b {
    }

    /* compiled from: ApiStatus.java */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
    @Documented
    @Retention(RetentionPolicy.CLASS)
    public @interface c {
    }

    /* compiled from: ApiStatus.java */
    @Target({ElementType.TYPE, ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.CLASS)
    public @interface d {
    }

    /* compiled from: ApiStatus.java */
    @Target({ElementType.TYPE, ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.CLASS)
    public @interface e {
    }

    /* compiled from: ApiStatus.java */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
    @Documented
    @Retention(RetentionPolicy.CLASS)
    public @interface f {
        String inVersion() default "";
    }

    private a() {
        throw new AssertionError("ApiStatus should not be instantiated");
    }
}
