package t3;

import android.graphics.PorterDuff;
import android.widget.TextView;
import com.applandeo.materialcalendarview.n;
import java.util.Calendar;

/* compiled from: DayColorsUtils.java */
/* loaded from: classes3.dex */
public class j {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(TextView textView, com.applandeo.materialcalendarview.m mVar) {
        e(textView, mVar.c(), 0, n.g.f42222v0);
    }

    public static void c(Calendar calendar, Calendar calendar2, TextView textView, f fVar) {
        if (calendar2.equals(calendar)) {
            j(textView, fVar);
            return;
        }
        if (m.d(calendar, fVar)) {
            f(calendar, textView, fVar);
        } else if (fVar.w().contains(calendar)) {
            g(textView, fVar);
        } else {
            h(textView, fVar);
        }
    }

    private static void d(TextView textView, int i4) {
        textView.getBackground().setColorFilter(i4, PorterDuff.Mode.MULTIPLY);
    }

    public static void e(TextView textView, int i4, int i5, int i6) {
        if (textView == null) {
            return;
        }
        textView.setTypeface(null, i5);
        textView.setTextColor(i4);
        textView.setBackgroundResource(i6);
    }

    private static void f(Calendar calendar, final TextView textView, f fVar) {
        m.c(calendar, fVar).d(new com.annimon.stream.function.h() { // from class: t3.i
            @Override // com.annimon.stream.function.h
            public final void accept(Object obj) {
                j.b(textView, (com.applandeo.materialcalendarview.m) obj);
            }
        });
    }

    private static void g(TextView textView, f fVar) {
        e(textView, fVar.x(), 0, n.g.f42222v0);
    }

    private static void h(TextView textView, f fVar) {
        e(textView, fVar.l(), 0, n.g.f42222v0);
    }

    public static void i(TextView textView, f fVar) {
        e(textView, fVar.O(), 0, n.g.f42220u0);
        d(textView, fVar.N());
    }

    private static void j(TextView textView, f fVar) {
        e(textView, fVar.R(), 0, n.g.f42222v0);
        if (fVar.Q() != 0) {
            e(textView, fVar.O(), 0, n.g.f42220u0);
            d(textView, fVar.Q());
        }
    }
}
