package retrofit2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Objects;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.g0;
import retrofit2.m;

/* compiled from: Response.java */
/* loaded from: classes9.dex */
public final class x<T> {

    /* renamed from: a, reason: collision with root package name */
    private final f0 f90062a;

    /* renamed from: b, reason: collision with root package name */
    @zc.h
    private final T f90063b;

    /* renamed from: c, reason: collision with root package name */
    @zc.h
    private final g0 f90064c;

    private x(f0 f0Var, @zc.h T t4, @zc.h g0 g0Var) {
        this.f90062a = f0Var;
        this.f90063b = t4;
        this.f90064c = g0Var;
    }

    public static <T> x<T> c(int i4, g0 g0Var) {
        Objects.requireNonNull(g0Var, ProtectedSandApp.s("Ꙕ\u0001"));
        if (i4 >= 400) {
            return d(g0Var, new f0.a().b(new m.c(g0Var.getF84143e(), g0Var.getF84144f())).g(i4).y(ProtectedSandApp.s("ꙕ\u0001")).B(okhttp3.c0.HTTP_1_1).E(new d0.a().B(ProtectedSandApp.s("Ꙗ\u0001")).b()).c());
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("ꙗ\u0001"), i4));
    }

    public static <T> x<T> d(g0 g0Var, f0 f0Var) {
        Objects.requireNonNull(g0Var, ProtectedSandApp.s("Ꙕ\u0001"));
        Objects.requireNonNull(f0Var, ProtectedSandApp.s("Ꙙ\u0001"));
        if (f0Var.r1()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ꙙ\u0001"));
        }
        return new x<>(f0Var, null, g0Var);
    }

    public static <T> x<T> j(int i4, @zc.h T t4) {
        if (i4 < 200 || i4 >= 300) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("ꙛ\u0001"), i4));
        }
        return m(t4, new f0.a().g(i4).y(ProtectedSandApp.s("Ꙛ\u0001")).B(okhttp3.c0.HTTP_1_1).E(new d0.a().B(ProtectedSandApp.s("Ꙗ\u0001")).b()).c());
    }

    public static <T> x<T> k(@zc.h T t4) {
        return m(t4, new f0.a().g(200).y(ProtectedSandApp.s("Ꙝ\u0001")).B(okhttp3.c0.HTTP_1_1).E(new d0.a().B(ProtectedSandApp.s("Ꙗ\u0001")).b()).c());
    }

    public static <T> x<T> l(@zc.h T t4, okhttp3.u uVar) {
        Objects.requireNonNull(uVar, ProtectedSandApp.s("ꙝ\u0001"));
        return m(t4, new f0.a().g(200).y(ProtectedSandApp.s("Ꙝ\u0001")).B(okhttp3.c0.HTTP_1_1).w(uVar).E(new d0.a().B(ProtectedSandApp.s("Ꙗ\u0001")).b()).c());
    }

    public static <T> x<T> m(@zc.h T t4, f0 f0Var) {
        Objects.requireNonNull(f0Var, ProtectedSandApp.s("Ꙙ\u0001"));
        if (f0Var.r1()) {
            return new x<>(f0Var, t4, null);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("Ꙟ\u0001"));
    }

    @zc.h
    public T a() {
        return this.f90063b;
    }

    public int b() {
        return this.f90062a.u();
    }

    @zc.h
    public g0 e() {
        return this.f90064c;
    }

    public okhttp3.u f() {
        return this.f90062a.getHeaders();
    }

    public boolean g() {
        return this.f90062a.r1();
    }

    public String h() {
        return this.f90062a.getMessage();
    }

    public f0 i() {
        return this.f90062a;
    }

    public String toString() {
        return this.f90062a.toString();
    }
}
