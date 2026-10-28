package s3;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.annimon.stream.function.z0;
import com.annimon.stream.p;
import com.applandeo.materialcalendarview.m;
import com.applandeo.materialcalendarview.n;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import t3.o;

/* compiled from: DayRowClickListener.java */
/* loaded from: classes3.dex */
public class g implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    private com.applandeo.materialcalendarview.adapters.f f90274b;

    /* renamed from: c, reason: collision with root package name */
    private t3.f f90275c;

    /* renamed from: d, reason: collision with root package name */
    private int f90276d;

    public g(com.applandeo.materialcalendarview.adapters.f fVar, t3.f fVar2, int i4) {
        this.f90274b = fVar;
        this.f90275c = fVar2;
        this.f90276d = i4 < 0 ? 11 : i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(m mVar) {
        mVar.e(this.f90275c.n().contains(mVar.a()) || !l(mVar.a()));
        this.f90275c.D().a(mVar);
    }

    private void h(TextView textView, Calendar calendar) {
        p.N0(this.f90274b.A()).J(new com.annimon.stream.function.h() { // from class: s3.f
            @Override // com.annimon.stream.function.h
            public final void accept(Object obj) {
                g.this.t((o) obj);
            }
        });
        u(textView, calendar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void p(Calendar calendar) {
        g(new m(calendar));
    }

    private boolean j(Calendar calendar) {
        return !this.f90275c.n().contains(calendar);
    }

    private boolean k(o oVar, Calendar calendar) {
        return oVar != null && !calendar.equals(oVar.a()) && m(calendar) && j(calendar);
    }

    private boolean l(Calendar calendar) {
        return (this.f90275c.B() == null || !calendar.before(this.f90275c.B())) && (this.f90275c.z() == null || !calendar.after(this.f90275c.z()));
    }

    private boolean m(Calendar calendar) {
        return calendar.get(2) == this.f90276d && l(calendar);
    }

    private boolean n(Calendar calendar, Calendar calendar2) {
        int size = com.applandeo.materialcalendarview.b.b(calendar, calendar2).size() + 1;
        int A = this.f90275c.A();
        return A != 0 && size >= A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean o(Calendar calendar, m mVar) {
        return mVar.a().equals(calendar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean q(Calendar calendar) {
        return !this.f90275c.n().contains(calendar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(Calendar calendar) {
        this.f90274b.y(new o(calendar));
    }

    private void s(final Calendar calendar) {
        if (this.f90275c.p() == null) {
            p(calendar);
        } else {
            p.N0(this.f90275c.p()).t(new z0() { // from class: s3.c
                @Override // com.annimon.stream.function.z0
                public final boolean test(Object obj) {
                    boolean o4;
                    o4 = g.o(calendar, (m) obj);
                    return o4;
                }
            }).z().j(new com.annimon.stream.function.h() { // from class: s3.d
                @Override // com.annimon.stream.function.h
                public final void accept(Object obj) {
                    g.this.g((m) obj);
                }
            }, new Runnable() { // from class: s3.e
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.p(calendar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(o oVar) {
        t3.j.c(oVar.a(), t3.h.a(), (TextView) oVar.b(), this.f90275c);
    }

    private void u(TextView textView, Calendar calendar) {
        t3.j.i(textView, this.f90275c);
        this.f90274b.D(new o(textView, calendar));
    }

    private void v(View view, Calendar calendar) {
        TextView textView = (TextView) view.findViewById(n.h.O);
        if (m(calendar) && j(calendar)) {
            o oVar = new o(textView, calendar);
            if (this.f90274b.A().contains(oVar)) {
                t(oVar);
            } else {
                t3.j.i(textView, this.f90275c);
            }
            this.f90274b.y(oVar);
        }
    }

    private void w(TextView textView, Calendar calendar) {
        o z4 = this.f90274b.z();
        p.N0(com.applandeo.materialcalendarview.b.b(z4.a(), calendar)).t(new z0() { // from class: s3.a
            @Override // com.annimon.stream.function.z0
            public final boolean test(Object obj) {
                boolean q4;
                q4 = g.this.q((Calendar) obj);
                return q4;
            }
        }).J(new com.annimon.stream.function.h() { // from class: s3.b
            @Override // com.annimon.stream.function.h
            public final void accept(Object obj) {
                g.this.r((Calendar) obj);
            }
        });
        if (n(z4.a(), calendar)) {
            return;
        }
        t3.j.i(textView, this.f90275c);
        this.f90274b.y(new o(textView, calendar));
        this.f90274b.o();
    }

    private void x(View view, Calendar calendar) {
        o z4 = this.f90274b.z();
        TextView textView = (TextView) view.findViewById(n.h.O);
        if (k(z4, calendar)) {
            u(textView, calendar);
            t(z4);
        }
    }

    private void y(View view, Calendar calendar) {
        TextView textView = (TextView) view.findViewById(n.h.O);
        if (m(calendar) && j(calendar)) {
            List<o> A = this.f90274b.A();
            if (A.size() > 1) {
                h(textView, calendar);
            }
            if (A.size() == 1) {
                w(textView, calendar);
            }
            if (A.isEmpty()) {
                u(textView, calendar);
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime((Date) adapterView.getItemAtPosition(i4));
        if (this.f90275c.D() != null) {
            s(gregorianCalendar);
        }
        int j5 = this.f90275c.j();
        if (j5 == 0) {
            this.f90274b.D(new o(view, gregorianCalendar));
            return;
        }
        if (j5 == 1) {
            x(view, gregorianCalendar);
        } else if (j5 == 2) {
            v(view, gregorianCalendar);
        } else {
            if (j5 != 3) {
                return;
            }
            y(view, gregorianCalendar);
        }
    }
}
