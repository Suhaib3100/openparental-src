package t3;

import android.view.View;
import java.util.Calendar;

/* compiled from: SelectedDay.java */
/* loaded from: classes3.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private View f91894a;

    /* renamed from: b, reason: collision with root package name */
    private Calendar f91895b;

    public o(Calendar calendar) {
        this.f91895b = calendar;
    }

    public Calendar a() {
        return this.f91895b;
    }

    public View b() {
        return this.f91894a;
    }

    public void c(View view) {
        this.f91894a = view;
    }

    public boolean equals(Object obj) {
        return obj instanceof o ? a().equals(((o) obj).a()) : obj instanceof Calendar ? a().equals(obj) : super.equals(obj);
    }

    public o(View view, Calendar calendar) {
        this.f91894a = view;
        this.f91895b = calendar;
    }
}
