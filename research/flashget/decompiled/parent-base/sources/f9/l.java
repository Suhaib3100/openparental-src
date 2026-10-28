package f9;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* compiled from: InlineMe.java */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
/* loaded from: classes6.dex */
public @interface l {
    String[] imports() default {};

    String replacement();

    String[] staticImports() default {};
}
