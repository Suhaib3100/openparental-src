package lg;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import org.mp4parser.aspectj.lang.reflect.NoSuchAdviceException;
import org.mp4parser.aspectj.lang.reflect.NoSuchPointcutException;

/* compiled from: AjType.java */
/* loaded from: classes9.dex */
public interface d<T> extends Type, AnnotatedElement {
    l[] A();

    boolean B();

    Field[] C();

    m[] D();

    boolean E();

    boolean F();

    Constructor G();

    a H(String str) throws NoSuchAdviceException;

    Package I();

    r[] J();

    s[] K();

    Method L(String str, d<?>... dVarArr) throws NoSuchMethodException;

    boolean M();

    k[] N();

    d<?> O();

    Method[] P();

    r[] Q();

    s[] R();

    y S(String str) throws NoSuchPointcutException;

    r T(String str, d<?> dVar) throws NoSuchFieldException;

    T[] U();

    Field V(String str) throws NoSuchFieldException;

    Method W();

    Constructor[] X();

    p Y(d<?> dVar, d<?>... dVarArr) throws NoSuchMethodException;

    boolean Z();

    d<?> a();

    a[] a0(b... bVarArr);

    boolean b();

    Type b0();

    Constructor c0(d<?>... dVarArr) throws NoSuchMethodException;

    a d0(String str) throws NoSuchAdviceException;

    Method[] e();

    d<?> e0();

    boolean f();

    w f0();

    Constructor g(d<?>... dVarArr) throws NoSuchMethodException;

    y[] g0();

    int getModifiers();

    String getName();

    TypeVariable<Class<T>>[] getTypeParameters();

    Constructor[] h();

    Class<T> h0();

    d<?>[] i();

    j[] i0();

    a[] j(b... bVarArr);

    s j0(String str, d<?> dVar, d<?>... dVarArr) throws NoSuchMethodException;

    Field k(String str) throws NoSuchFieldException;

    Field[] l();

    p[] m();

    r n(String str, d<?> dVar) throws NoSuchFieldException;

    p[] o();

    i[] p();

    boolean q(Object obj);

    y[] r();

    boolean s();

    y t(String str) throws NoSuchPointcutException;

    s u(String str, d<?> dVar, d<?>... dVarArr) throws NoSuchMethodException;

    p v(d<?> dVar, d<?>... dVarArr) throws NoSuchMethodException;

    d<?>[] w();

    d<?>[] x();

    Method y(String str, d<?>... dVarArr) throws NoSuchMethodException;

    boolean z();
}
