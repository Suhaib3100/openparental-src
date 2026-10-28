package cf;

import cg.a0;
import cg.x;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* compiled from: EnsuresCalledMethods.java */
@x(qualifier = a.class)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
/* loaded from: classes3.dex */
public @interface d {
    @a0("value")
    String[] methods();

    String[] value();
}
