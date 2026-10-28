package r4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.jvm.internal.n1;
import r4.c;

/* compiled from: TypeParceler.kt */
@i3.e(i3.a.SOURCE)
@Target({ElementType.TYPE})
@i3.f(allowedTargets = {i3.b.CLASS, i3.b.PROPERTY})
@Retention(RetentionPolicy.SOURCE)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0010\b\u0001\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00010\u00032\u00020\u0004B\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/parcelize/TypeParceler;", "T", "P", "Lkotlinx/parcelize/Parceler;", "", "parcelize-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Repeatable(a.class)
@i3.d
/* loaded from: classes5.dex */
public @interface f<T, P extends c<? super T>> {

    /* compiled from: TypeParceler.kt */
    @i3.e(i3.a.SOURCE)
    @Target({ElementType.TYPE})
    @i3.f(allowedTargets = {i3.b.CLASS, i3.b.PROPERTY})
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @n1
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
        f[] value();
    }
}
