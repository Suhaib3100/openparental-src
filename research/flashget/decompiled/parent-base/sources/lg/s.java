package lg;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: InterTypeMethodDeclaration.java */
/* loaded from: classes9.dex */
public interface s extends q {
    d<?>[] c();

    Type d();

    d<?>[] e();

    Type[] f();

    String getName();

    d<?> getReturnType();

    TypeVariable<Method>[] getTypeParameters();
}
