package t3;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.annimon.stream.function.z0;
import com.annimon.stream.p;
import com.applandeo.materialcalendarview.exceptions.UnsupportedMethodsException;
import com.applandeo.materialcalendarview.n;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* compiled from: CalendarProperties.java */
/* loaded from: classes3.dex */
public class f {
    public static final int O = 2401;
    public static final int P = 1200;
    private Calendar A;
    private Calendar B;
    private Calendar C;
    private s3.i D;
    private s3.j E;
    private s3.k F;
    private s3.h G;
    private s3.h H;
    private s3.h I;
    private Context N;

    /* renamed from: a, reason: collision with root package name */
    private int f91865a;

    /* renamed from: b, reason: collision with root package name */
    private int f91866b;

    /* renamed from: c, reason: collision with root package name */
    private int f91867c;

    /* renamed from: d, reason: collision with root package name */
    private int f91868d;

    /* renamed from: e, reason: collision with root package name */
    private int f91869e;

    /* renamed from: f, reason: collision with root package name */
    private int f91870f;

    /* renamed from: g, reason: collision with root package name */
    private int f91871g;

    /* renamed from: h, reason: collision with root package name */
    private int f91872h;

    /* renamed from: i, reason: collision with root package name */
    private int f91873i;

    /* renamed from: j, reason: collision with root package name */
    private int f91874j;

    /* renamed from: k, reason: collision with root package name */
    private int f91875k;

    /* renamed from: l, reason: collision with root package name */
    private int f91876l;

    /* renamed from: m, reason: collision with root package name */
    private int f91877m;

    /* renamed from: n, reason: collision with root package name */
    private int f91878n;

    /* renamed from: o, reason: collision with root package name */
    private int f91879o;

    /* renamed from: p, reason: collision with root package name */
    private int f91880p;

    /* renamed from: q, reason: collision with root package name */
    private int f91881q;

    /* renamed from: r, reason: collision with root package name */
    private int f91882r;

    /* renamed from: s, reason: collision with root package name */
    private int f91883s;

    /* renamed from: t, reason: collision with root package name */
    private int f91884t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f91885u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f91886v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f91887w;

    /* renamed from: x, reason: collision with root package name */
    private Drawable f91888x;

    /* renamed from: y, reason: collision with root package name */
    private Drawable f91889y;

    /* renamed from: z, reason: collision with root package name */
    private Calendar f91890z = h.a();
    private List<com.applandeo.materialcalendarview.m> J = new ArrayList();
    private List<Calendar> K = new ArrayList();
    private List<Calendar> L = new ArrayList();
    private List<o> M = new ArrayList();

    public f(Context context) {
        this.N = context;
    }

    private static /* synthetic */ Calendar S(Calendar calendar) {
        h.h(calendar);
        return calendar;
    }

    private static /* synthetic */ Calendar T(Calendar calendar) {
        h.h(calendar);
        return calendar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o U(Calendar calendar) {
        h.h(calendar);
        return new o(calendar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean V(o oVar) {
        return this.K.contains(oVar.a());
    }

    public static /* synthetic */ Calendar a(Calendar calendar) {
        h.h(calendar);
        return calendar;
    }

    public static /* synthetic */ Calendar d(Calendar calendar) {
        h.h(calendar);
        return calendar;
    }

    public int A() {
        return this.f91884t;
    }

    public void A0(int i4) {
        this.f91875k = i4;
    }

    public Calendar B() {
        return this.B;
    }

    public void B0(Drawable drawable) {
        this.f91888x = drawable;
    }

    public int C() {
        return this.f91882r;
    }

    public void C0(boolean z4) {
        this.f91887w = z4;
    }

    public s3.i D() {
        return this.D;
    }

    public void D0(Calendar calendar) {
        E0(new o(calendar));
    }

    public s3.h E() {
        return this.H;
    }

    public void E0(o oVar) {
        this.M.clear();
        this.M.add(oVar);
    }

    public s3.h F() {
        return this.I;
    }

    public void F0(List<Calendar> list) {
        int i4 = this.f91865a;
        if (i4 == 1) {
            throw new UnsupportedMethodsException(ProtectedSandApp.s("\u206f"));
        }
        if (i4 == 3 && !h.e(list)) {
            throw new UnsupportedMethodsException(ProtectedSandApp.s("\u206e"));
        }
        this.M = p.N0(list).c0(new c()).y(new z0() { // from class: t3.d
            @Override // com.annimon.stream.function.z0
            public final boolean test(Object obj) {
                boolean V;
                V = f.this.V((o) obj);
                return V;
            }
        }).G2();
    }

    public s3.h G() {
        return this.G;
    }

    public void G0(int i4) {
        this.f91868d = i4;
    }

    public s3.j H() {
        return this.E;
    }

    public void H0(int i4) {
        this.f91879o = i4;
    }

    public s3.k I() {
        return this.F;
    }

    public void I0(boolean z4) {
        this.f91886v = z4;
    }

    public int J() {
        return this.f91875k;
    }

    public void J0(int i4) {
        this.f91870f = i4;
    }

    public Drawable K() {
        return this.f91888x;
    }

    public void K0(int i4) {
        this.f91869e = i4;
    }

    public boolean L() {
        return this.f91887w;
    }

    public List<o> M() {
        return this.M;
    }

    public int N() {
        int i4 = this.f91868d;
        return i4 == 0 ? androidx.core.content.d.getColor(this.N, n.e.Q) : i4;
    }

    public int O() {
        int i4 = this.f91879o;
        return i4 == 0 ? androidx.core.content.d.getColor(this.N, R.color.white) : i4;
    }

    public boolean P() {
        return this.f91886v;
    }

    public int Q() {
        return this.f91870f;
    }

    public int R() {
        int i4 = this.f91869e;
        return i4 == 0 ? androidx.core.content.d.getColor(this.N, n.e.Q) : i4;
    }

    public void W(int i4) {
        this.f91876l = i4;
    }

    public void X(int i4) {
        this.f91883s = i4;
    }

    public void Y(int i4) {
        this.f91877m = i4;
    }

    public void Z(int i4) {
        this.f91880p = i4;
    }

    public void a0(Calendar calendar) {
        this.A = calendar;
    }

    public void b0(int i4) {
        this.f91865a = i4;
    }

    public void c0(int i4) {
        this.f91880p = i4;
    }

    public void d0(int i4) {
        this.f91878n = i4;
    }

    public int e() {
        return this.f91876l;
    }

    public void e0(int i4) {
        this.f91871g = i4;
    }

    public int f() {
        return this.f91883s;
    }

    public void f0(List<Calendar> list) {
        this.M.removeAll(list);
        this.K = p.N0(list).c0(new b()).G2();
    }

    public int g() {
        return this.f91877m;
    }

    public void g0(int i4) {
        this.f91873i = i4;
    }

    public int h() {
        int i4 = this.f91880p;
        return i4 == 0 ? androidx.core.content.d.getColor(this.N, n.e.f42089q0) : i4;
    }

    public void h0(List<com.applandeo.materialcalendarview.m> list) {
        this.J = list;
    }

    public Calendar i() {
        return this.A;
    }

    public void i0(boolean z4) {
        this.f91885u = z4;
    }

    public int j() {
        return this.f91865a;
    }

    public void j0(Drawable drawable) {
        this.f91889y = drawable;
    }

    public int k() {
        int i4 = this.f91880p;
        return i4 == 0 ? androidx.core.content.d.getColor(this.N, n.e.M) : i4;
    }

    public void k0(int i4) {
        this.f91866b = i4;
    }

    public int l() {
        int i4 = this.f91878n;
        return i4 == 0 ? androidx.core.content.d.getColor(this.N, n.e.L) : i4;
    }

    public void l0(int i4) {
        this.f91867c = i4;
    }

    public int m() {
        return this.f91871g;
    }

    public void m0(int i4) {
        this.f91881q = i4;
    }

    public List<Calendar> n() {
        return this.K;
    }

    public void n0(List<Calendar> list) {
        this.L = p.N0(list).c0(new e()).G2();
    }

    public int o() {
        int i4 = this.f91873i;
        return i4 == 0 ? androidx.core.content.d.getColor(this.N, n.e.f42089q0) : i4;
    }

    public void o0(int i4) {
        this.f91874j = i4;
    }

    public List<com.applandeo.materialcalendarview.m> p() {
        return this.J;
    }

    public void p0(int i4) {
        this.f91872h = i4;
    }

    public boolean q() {
        return this.f91885u;
    }

    public void q0(Calendar calendar) {
        this.C = calendar;
    }

    public Calendar r() {
        return this.f91890z;
    }

    public void r0(int i4) {
        this.f91884t = i4;
    }

    public Drawable s() {
        return this.f91889y;
    }

    public void s0(Calendar calendar) {
        this.B = calendar;
    }

    public int t() {
        int i4 = this.f91866b;
        return i4 <= 0 ? i4 : androidx.core.content.d.getColor(this.N, i4);
    }

    public void t0(int i4) {
        this.f91882r = i4;
    }

    public int u() {
        int i4 = this.f91867c;
        return i4 <= 0 ? i4 : androidx.core.content.d.getColor(this.N, i4);
    }

    public void u0(s3.i iVar) {
        this.D = iVar;
    }

    public int v() {
        return this.f91881q;
    }

    public void v0(s3.h hVar) {
        this.H = hVar;
    }

    public List<Calendar> w() {
        return this.L;
    }

    public void w0(s3.h hVar) {
        this.I = hVar;
    }

    public int x() {
        int i4 = this.f91874j;
        return i4 == 0 ? androidx.core.content.d.getColor(this.N, n.e.f42089q0) : i4;
    }

    public void x0(s3.h hVar) {
        this.G = hVar;
    }

    public int y() {
        return this.f91872h;
    }

    public void y0(s3.j jVar) {
        this.E = jVar;
    }

    public Calendar z() {
        return this.C;
    }

    public void z0(s3.k kVar) {
        this.F = kVar;
    }
}
