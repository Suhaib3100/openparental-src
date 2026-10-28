package je;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

/* compiled from: ContainerOptions.kt */
@Retention(RetentionPolicy.RUNTIME)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, d2 = {"Lje/b;", "", "Lje/a;", "cache", "<init>", "(Lje/a;)V", "()Lje/a;", "kotlin-android-extensions-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public @interface b {
    a cache() default a.HASH_MAP;
}
