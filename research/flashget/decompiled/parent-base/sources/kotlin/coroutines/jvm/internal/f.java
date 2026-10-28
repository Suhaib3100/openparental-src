package kotlin.coroutines.jvm.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.c1;

/* compiled from: DebugMetadata.kt */
@Target({ElementType.TYPE})
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0014\b\u0081\u0002\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0007¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0007¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u00068\u0007¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\f\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\r\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013¨\u0006\u001c"}, d2 = {"Lkotlin/coroutines/jvm/internal/f;", "", "", "version", "", "sourceFile", "", "lineNumbers", "", "localNames", "spilled", "indexToLabel", "methodName", "className", "<init>", "(ILjava/lang/String;[ILkotlin/Array;Lkotlin/Array;[ILjava/lang/String;Ljava/lang/String;)V", "v", "()I", "f", "()Ljava/lang/String;", "l", "()[I", "n", "()[Ljava/lang/String;", "s", "i", "m", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@c1(version = "1.3")
@Retention(RetentionPolicy.RUNTIME)
@dd.f(allowedTargets = {dd.b.CLASS})
/* loaded from: classes7.dex */
public @interface f {
    @kd.i(name = "c")
    String c() default "";

    @kd.i(name = "f")
    String f() default "";

    @kd.i(name = "i")
    int[] i() default {};

    @kd.i(name = "l")
    int[] l() default {};

    @kd.i(name = "m")
    String m() default "";

    @kd.i(name = "n")
    String[] n() default {};

    @kd.i(name = "s")
    String[] s() default {};

    @kd.i(name = "v")
    int v() default 1;
}
