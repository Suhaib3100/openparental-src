package androidx.databinding.adapters;

import android.widget.CalendarView;
import androidx.annotation.c1;

/* compiled from: CalendarViewBindingAdapter.java */
@c1({c1.a.LIBRARY})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:date", type = CalendarView.class)})
/* loaded from: classes.dex */
public class g {

    /* compiled from: CalendarViewBindingAdapter.java */
    class a implements CalendarView.OnDateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CalendarView.OnDateChangeListener f6052a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f6053b;

        a(CalendarView.OnDateChangeListener onDateChangeListener, androidx.databinding.o oVar) {
            this.f6052a = onDateChangeListener;
            this.f6053b = oVar;
        }

        @Override // android.widget.CalendarView.OnDateChangeListener
        public void onSelectedDayChange(CalendarView calendarView, int i5, int i6, int i7) {
            CalendarView.OnDateChangeListener onDateChangeListener = this.f6052a;
            if (onDateChangeListener != null) {
                onDateChangeListener.onSelectedDayChange(calendarView, i5, i6, i7);
            }
            this.f6053b.a();
        }
    }

    @androidx.databinding.d({"android:date"})
    public static void a(CalendarView calendarView, long j5) {
        if (calendarView.getDate() != j5) {
            calendarView.setDate(j5);
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onSelectedDayChange", "android:dateAttrChanged"})
    public static void b(CalendarView calendarView, CalendarView.OnDateChangeListener onDateChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            calendarView.setOnDateChangeListener(onDateChangeListener);
        } else {
            calendarView.setOnDateChangeListener(new a(onDateChangeListener, oVar));
        }
    }
}
