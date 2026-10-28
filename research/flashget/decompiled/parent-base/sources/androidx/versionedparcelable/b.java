package androidx.versionedparcelable;

import androidx.annotation.c1;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: ParcelField.java */
@Target({ElementType.FIELD})
@c1({c1.a.LIBRARY_GROUP_PREFIX})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes3.dex */
public @interface b {
    String defaultValue() default "";

    int value();
}
