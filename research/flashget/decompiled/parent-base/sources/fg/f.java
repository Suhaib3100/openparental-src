package fg;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Debug.java */
/* loaded from: classes.dex */
public final class f {

    /* compiled from: Debug.java */
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
        @org.intellij.lang.annotations.d(prefix = "class Renderer{Object[] $childrenArray(){return ", suffix = ";}}", value = "JAVA")
        @k
        String childrenArray() default "";

        @org.intellij.lang.annotations.d(prefix = "class Renderer{boolean $hasChildren(){return ", suffix = ";}}", value = "JAVA")
        @k
        String hasChildren() default "";

        @org.intellij.lang.annotations.d(prefix = "class Renderer{String $text(){return ", suffix = ";}}", value = "JAVA")
        @k
        String text() default "";
    }

    private f() {
        throw new AssertionError("Debug should not be instantiated");
    }
}
