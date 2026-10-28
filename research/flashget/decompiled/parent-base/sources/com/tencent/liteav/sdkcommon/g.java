package com.tencent.liteav.sdkcommon;

import android.R;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

/* loaded from: classes7.dex */
final class g {

    /* renamed from: c, reason: collision with root package name */
    final Context f72033c;

    /* renamed from: e, reason: collision with root package name */
    final ArrayAdapter<String> f72035e;

    /* renamed from: f, reason: collision with root package name */
    WindowManager f72036f;

    /* renamed from: g, reason: collision with root package name */
    View f72037g;

    /* renamed from: h, reason: collision with root package name */
    TextView f72038h;

    /* renamed from: i, reason: collision with root package name */
    TextView f72039i;

    /* renamed from: j, reason: collision with root package name */
    Spinner f72040j;

    /* renamed from: k, reason: collision with root package name */
    ScrollView f72041k;

    /* renamed from: l, reason: collision with root package name */
    String f72042l;

    /* renamed from: o, reason: collision with root package name */
    final a f72045o;

    /* renamed from: a, reason: collision with root package name */
    final DisplayMetrics f72031a = new DisplayMetrics();

    /* renamed from: b, reason: collision with root package name */
    final WindowManager.LayoutParams f72032b = new WindowManager.LayoutParams();

    /* renamed from: p, reason: collision with root package name */
    private final int f72046p = c1.a.f38447c;

    /* renamed from: q, reason: collision with root package name */
    private boolean f72047q = false;

    /* renamed from: m, reason: collision with root package name */
    boolean f72043m = false;

    /* renamed from: n, reason: collision with root package name */
    int f72044n = 1920;

    /* renamed from: d, reason: collision with root package name */
    final Handler f72034d = new Handler(Looper.getMainLooper());

    public interface a {
        void a(int i4);
    }

    class b implements View.OnTouchListener {

        /* renamed from: b, reason: collision with root package name */
        private int f72049b;

        /* renamed from: c, reason: collision with root package name */
        private int f72050c;

        private b() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f72049b = (int) motionEvent.getRawX();
                this.f72050c = (int) motionEvent.getRawY();
            } else if (action == 2) {
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                int i4 = rawX - this.f72049b;
                int i5 = rawY - this.f72050c;
                WindowManager.LayoutParams layoutParams = g.this.f72032b;
                int i6 = layoutParams.x + i4;
                layoutParams.x = i6;
                layoutParams.y += i5;
                this.f72049b = rawX;
                this.f72050c = rawY;
                layoutParams.x = Math.max(i6, 0);
                WindowManager.LayoutParams layoutParams2 = g.this.f72032b;
                layoutParams2.y = Math.max(layoutParams2.y, 0);
                g gVar = g.this;
                WindowManager.LayoutParams layoutParams3 = gVar.f72032b;
                int i7 = layoutParams3.x;
                DisplayMetrics displayMetrics = gVar.f72031a;
                int i10 = displayMetrics.widthPixels;
                if (i7 + i10 > i10) {
                    layoutParams3.width = i10 - i7;
                } else {
                    layoutParams3.width = i10;
                }
                int i11 = gVar.f72044n;
                layoutParams3.height = i11;
                if (gVar.f72043m) {
                    layoutParams3.height = i11 / 2;
                }
                int i12 = layoutParams3.y;
                int i13 = layoutParams3.height + i12;
                int i14 = displayMetrics.heightPixels;
                if (i13 > i14) {
                    layoutParams3.height = i14 - i12;
                }
                ViewGroup.LayoutParams layoutParams4 = gVar.f72041k.getLayoutParams();
                layoutParams4.height = g.this.b();
                g.this.f72041k.setLayoutParams(layoutParams4);
                g gVar2 = g.this;
                gVar2.f72036f.updateViewLayout(view, gVar2.f72032b);
            }
            view.performClick();
            return false;
        }

        /* synthetic */ b(g gVar, byte b5) {
            this();
        }
    }

    class c implements AdapterView.OnItemSelectedListener {
        private c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4) {
            if (view == null) {
                return;
            }
            ((TextView) view).setTextColor(c1.a.f38447c);
            g gVar = g.this;
            gVar.f72042l = gVar.f72035e.getItem(i4);
            g.this.f72045o.a(i4);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }

        /* synthetic */ c(g gVar, byte b5) {
            this();
        }
    }

    public g(Context context, a aVar) {
        this.f72033c = context;
        this.f72045o = aVar;
        this.f72035e = new ArrayAdapter<>(context, R.layout.simple_spinner_item);
    }

    public final void a(boolean z4) {
        if (z4 == this.f72047q) {
            return;
        }
        if (z4) {
            this.f72036f.addView(this.f72037g, this.f72032b);
        } else {
            this.f72036f.removeView(this.f72037g);
        }
        this.f72047q = z4;
    }

    public final void b(String str) {
        TextView textView = this.f72038h;
        if (textView != null) {
            textView.setText(str);
        }
    }

    final int b() {
        return Math.max((this.f72032b.height - a(230)) - a(20), 0);
    }

    public final void a(String str) {
        TextView textView = this.f72039i;
        if (textView != null) {
            textView.setText(str);
        }
        this.f72034d.post(h.a(this));
    }

    final void a() {
        TextView textView;
        Spinner spinner = this.f72040j;
        if (spinner == null || (textView = (TextView) spinner.getChildAt(spinner.getSelectedItemPosition())) == null) {
            return;
        }
        textView.setTextColor(c1.a.f38447c);
    }

    final int a(int i4) {
        return (int) ((i4 * this.f72033c.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
