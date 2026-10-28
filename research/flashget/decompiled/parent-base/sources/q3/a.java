package q3;

import android.content.Context;
import androidx.annotation.n;
import androidx.annotation.v;
import androidx.core.content.d;
import com.applandeo.materialcalendarview.l;
import com.applandeo.materialcalendarview.m;
import java.util.Calendar;
import java.util.List;
import s3.h;
import s3.j;
import t3.f;

/* compiled from: DatePickerBuilder.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f89520a;

    /* renamed from: b, reason: collision with root package name */
    private f f89521b;

    public a(Context context, j jVar) {
        this.f89520a = context;
        f fVar = new f(context);
        this.f89521b = fVar;
        fVar.b0(1);
        this.f89521b.y0(jVar);
    }

    public a A(@n int i4) {
        this.f89521b.W(d.getColor(this.f89520a, i4));
        return this;
    }

    public a B(@n int i4) {
        this.f89521b.Y(d.getColor(this.f89520a, i4));
        return this;
    }

    public a C(@n int i4) {
        this.f89521b.Z(d.getColor(this.f89520a, i4));
        return this;
    }

    public a D(Calendar calendar) {
        this.f89521b.a0(calendar);
        return this;
    }

    public a E(@n int i4) {
        this.f89521b.d0(d.getColor(this.f89520a, i4));
        return this;
    }

    public a F(@n int i4) {
        this.f89521b.e0(i4);
        return this;
    }

    public a G(List<Calendar> list) {
        this.f89521b.f0(list);
        return this;
    }

    public a H(@n int i4) {
        this.f89521b.g0(d.getColor(this.f89520a, i4));
        return this;
    }

    public a I(List<m> list) {
        if (list != null) {
            this.f89521b.i0(true);
            this.f89521b.h0(list);
        }
        return this;
    }

    public a J(@v int i4) {
        this.f89521b.j0(d.getDrawable(this.f89520a, i4));
        return this;
    }

    public a K(h hVar) {
        this.f89521b.v0(hVar);
        return this;
    }

    public a L(@n int i4) {
        this.f89521b.k0(i4);
        return this;
    }

    public a M(@n int i4) {
        this.f89521b.l0(i4);
        return this;
    }

    public a N(int i4) {
        this.f89521b.m0(i4);
        return this;
    }

    public a O(Calendar calendar) {
        this.f89521b.q0(calendar);
        return this;
    }

    public a P(int i4) {
        this.f89521b.r0(i4);
        return this;
    }

    public a Q(Calendar calendar) {
        this.f89521b.s0(calendar);
        return this;
    }

    public a R(int i4) {
        this.f89521b.t0(i4);
        return this;
    }

    public a S(h hVar) {
        this.f89521b.w0(hVar);
        return this;
    }

    public a T(@n int i4) {
        this.f89521b.c0(d.getColor(this.f89520a, i4));
        return this;
    }

    public a U(@n int i4) {
        this.f89521b.A0(d.getColor(this.f89520a, i4));
        return this;
    }

    public a V(int i4) {
        this.f89521b.b0(i4);
        return this;
    }

    public a W(@v int i4) {
        this.f89521b.B0(d.getDrawable(this.f89520a, i4));
        return this;
    }

    public a X(h hVar) {
        this.f89521b.x0(hVar);
        return this;
    }

    public a Y(boolean z4) {
        this.f89521b.C0(z4);
        return this;
    }

    public a Z(List<Calendar> list) {
        this.f89521b.F0(list);
        return this;
    }

    @Deprecated
    public a a(@n int i4) {
        return A(i4);
    }

    public a a0(@n int i4) {
        this.f89521b.G0(d.getColor(this.f89520a, i4));
        return this;
    }

    public a b(int i4) {
        this.f89521b.X(i4);
        return this;
    }

    public a b0(@n int i4) {
        this.f89521b.H0(d.getColor(this.f89520a, i4));
        return this;
    }

    @Deprecated
    public a c(@n int i4) {
        return B(i4);
    }

    public a c0(int i4) {
        this.f89521b.J0(i4);
        return this;
    }

    @Deprecated
    public a d(@n int i4) {
        return C(i4);
    }

    public a d0(@n int i4) {
        this.f89521b.K0(d.getColor(this.f89520a, i4));
        return this;
    }

    public l e() {
        return new l(this.f89520a, this.f89521b);
    }

    @Deprecated
    public a e0(@n int i4) {
        return d0(i4);
    }

    @Deprecated
    public a f(Calendar calendar) {
        return D(calendar);
    }

    @Deprecated
    public a g(@n int i4) {
        return E(i4);
    }

    @Deprecated
    public a h(@n int i4) {
        return F(i4);
    }

    @Deprecated
    public a i(List<Calendar> list) {
        return G(list);
    }

    @Deprecated
    public a j(@n int i4) {
        return H(i4);
    }

    @Deprecated
    public a k(@v int i4) {
        return J(i4);
    }

    @Deprecated
    public a l(h hVar) {
        return K(hVar);
    }

    @Deprecated
    public a m(@n int i4) {
        return L(i4);
    }

    @Deprecated
    public a n(@n int i4) {
        return M(i4);
    }

    @Deprecated
    public a o(int i4) {
        return N(i4);
    }

    public a p(List<Calendar> list) {
        this.f89521b.n0(list);
        return this;
    }

    public a q(@n int i4) {
        this.f89521b.o0(d.getColor(this.f89520a, i4));
        return this;
    }

    @Deprecated
    public a r(Calendar calendar) {
        return O(calendar);
    }

    @Deprecated
    public a s(Calendar calendar) {
        return Q(calendar);
    }

    @Deprecated
    public a t(@n int i4) {
        return U(i4);
    }

    @Deprecated
    public a u(int i4) {
        return V(i4);
    }

    @Deprecated
    public a v(@v int i4) {
        return W(i4);
    }

    @Deprecated
    public a w(h hVar) {
        return X(hVar);
    }

    @Deprecated
    public a x(List<Calendar> list) {
        return Z(list);
    }

    @Deprecated
    public a y(@n int i4) {
        return a0(i4);
    }

    @Deprecated
    public a z(@n int i4) {
        return b0(i4);
    }
}
