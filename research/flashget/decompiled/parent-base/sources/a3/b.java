package a3;

import androidx.annotation.o0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Attribute.java */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes3.dex */
public @interface b {

    /* compiled from: Attribute.java */
    @Target({})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
        int mask() default 0;

        @o0
        String name();

        int value();
    }

    @o0
    a[] intMapping() default {};

    @o0
    String value();
}
