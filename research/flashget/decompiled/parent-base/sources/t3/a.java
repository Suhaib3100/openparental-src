package t3;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.applandeo.materialcalendarview.n;
import java.util.ArrayList;

/* compiled from: AppearanceUtils.java */
/* loaded from: classes3.dex */
public final class a {
    private a() {
    }

    public static void a(View view, int i4) {
        if (i4 == 0) {
            return;
        }
        view.findViewById(n.h.f42231a).setBackgroundColor(i4);
    }

    public static void b(View view, int i4) {
        ((LinearLayout) view.findViewById(n.h.f42231a)).setVisibility(i4);
    }

    public static void c(View view, int i4, int i5) {
        ArrayList arrayList = new ArrayList();
        arrayList.add((TextView) view.findViewById(n.h.f42277p0));
        arrayList.add((TextView) view.findViewById(n.h.D1));
        arrayList.add((TextView) view.findViewById(n.h.G1));
        arrayList.add((TextView) view.findViewById(n.h.f42296v1));
        arrayList.add((TextView) view.findViewById(n.h.Y));
        arrayList.add((TextView) view.findViewById(n.h.L0));
        arrayList.add((TextView) view.findViewById(n.h.f42269m1));
        String[] stringArray = view.getContext().getResources().getStringArray(n.b.f41918a);
        for (int i6 = 0; i6 < 7; i6++) {
            TextView textView = (TextView) arrayList.get(i6);
            textView.setText(stringArray[((i6 + i5) - 1) % 7]);
            if (i4 != 0) {
                textView.setTextColor(i4);
            }
        }
    }

    public static void d(View view, Drawable drawable) {
        if (drawable == null) {
            return;
        }
        ((ImageButton) view.findViewById(n.h.X)).setImageDrawable(drawable);
    }

    public static void e(View view, int i4) {
        if (i4 == 0) {
            return;
        }
        ((ConstraintLayout) view.findViewById(n.h.C)).setBackgroundColor(i4);
    }

    public static void f(View view, int i4) {
        if (i4 == 0) {
            return;
        }
        ((TextView) view.findViewById(n.h.J)).setTextColor(i4);
    }

    public static void g(View view, int i4) {
        ((ConstraintLayout) view.findViewById(n.h.C)).setVisibility(i4);
    }

    public static void h(View view, int i4) {
        view.findViewById(n.h.D0).setVisibility(i4);
        view.findViewById(n.h.X).setVisibility(i4);
    }

    public static void i(View view, int i4) {
        if (i4 == 0) {
            return;
        }
        view.findViewById(n.h.D).setBackgroundColor(i4);
    }

    public static void j(View view, Drawable drawable) {
        if (drawable == null) {
            return;
        }
        ((ImageButton) view.findViewById(n.h.D0)).setImageDrawable(drawable);
    }
}
