package ig;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: ajcDeclareParents.java */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes9.dex */
public @interface c {
    boolean isExtends();

    String parentTypes();

    String targetTypePattern();
}
