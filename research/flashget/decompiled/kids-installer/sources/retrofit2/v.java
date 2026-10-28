package retrofit2;

import androidx.recyclerview.widget.o;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.g0;
import okhttp3.h0;
import retrofit2.m;

/* compiled from: Response.java */
/* loaded from: classes5.dex */
public final class v<T> {

    /* renamed from: a, reason: collision with root package name */
    private final g0 f33146a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final T f33147b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final h0 f33148c;

    private v(g0 g0Var, @Nullable T t5, @Nullable h0 h0Var) {
        this.f33146a = g0Var;
        this.f33147b = t5;
        this.f33148c = h0Var;
    }

    public static <T> v<T> c(int i5, h0 h0Var) {
        Objects.requireNonNull(h0Var, ProtectedSandApp.s("榝"));
        if (i5 >= 400) {
            return d(h0Var, new g0.a().b(new m.c(h0Var.getF30637r(), h0Var.getF30638s())).g(i5).y(ProtectedSandApp.s("榞")).B(d0.HTTP_1_1).E(new e0.a().B(ProtectedSandApp.s("榟")).b()).c());
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("榠"), i5));
    }

    public static <T> v<T> d(h0 h0Var, g0 g0Var) {
        Objects.requireNonNull(h0Var, ProtectedSandApp.s("榡"));
        Objects.requireNonNull(g0Var, ProtectedSandApp.s("榢"));
        if (g0Var.Z()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("榣"));
        }
        return new v<>(g0Var, null, h0Var);
    }

    public static <T> v<T> j(int i5, @Nullable T t5) {
        if (i5 < 200 || i5 >= 300) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("榦"), i5));
        }
        return m(t5, new g0.a().g(i5).y(ProtectedSandApp.s("榤")).B(d0.HTTP_1_1).E(new e0.a().B(ProtectedSandApp.s("榥")).b()).c());
    }

    public static <T> v<T> k(@Nullable T t5) {
        return m(t5, new g0.a().g(o.f.f9512b).y(ProtectedSandApp.s("榧")).B(d0.HTTP_1_1).E(new e0.a().B(ProtectedSandApp.s("榨")).b()).c());
    }

    public static <T> v<T> l(@Nullable T t5, okhttp3.v vVar) {
        Objects.requireNonNull(vVar, ProtectedSandApp.s("榩"));
        return m(t5, new g0.a().g(o.f.f9512b).y(ProtectedSandApp.s("榪")).B(d0.HTTP_1_1).w(vVar).E(new e0.a().B(ProtectedSandApp.s("榫")).b()).c());
    }

    public static <T> v<T> m(@Nullable T t5, g0 g0Var) {
        Objects.requireNonNull(g0Var, ProtectedSandApp.s("榬"));
        if (g0Var.Z()) {
            return new v<>(g0Var, t5, null);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("榭"));
    }

    @Nullable
    public T a() {
        return this.f33147b;
    }

    public int b() {
        return this.f33146a.getCode();
    }

    @Nullable
    public h0 e() {
        return this.f33148c;
    }

    public okhttp3.v f() {
        return this.f33146a.getHeaders();
    }

    public boolean g() {
        return this.f33146a.Z();
    }

    public String h() {
        return this.f33146a.getMessage();
    }

    public g0 i() {
        return this.f33146a;
    }

    public String toString() {
        return this.f33146a.toString();
    }
}
