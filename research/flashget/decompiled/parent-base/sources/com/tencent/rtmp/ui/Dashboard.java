package com.tencent.rtmp.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes7.dex */
public class Dashboard extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f72695a;

    /* renamed from: b, reason: collision with root package name */
    private final SimpleDateFormat f72696b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f72697c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f72698d;

    /* renamed from: e, reason: collision with root package name */
    private ScrollView f72699e;

    /* renamed from: f, reason: collision with root package name */
    private int f72700f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f72701g;

    public Dashboard(Context context) {
        this(context, null);
    }

    private void a() {
        if (this.f72697c != null) {
            return;
        }
        this.f72697c = new TextView(getContext());
        this.f72698d = new TextView(getContext());
        this.f72699e = new ScrollView(getContext());
        this.f72697c.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f72697c.setTextColor(-49023);
        this.f72697c.setTypeface(Typeface.MONOSPACE);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        this.f72699e.setPadding(0, 10, 0, 0);
        this.f72699e.setLayoutParams(layoutParams);
        this.f72699e.setVerticalScrollBarEnabled(true);
        this.f72699e.setScrollbarFadingEnabled(true);
        this.f72698d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f72698d.setTextColor(-49023);
        this.f72699e.addView(this.f72698d);
        addView(this.f72697c);
        addView(this.f72699e);
        if (this.f72695a.length() <= 0) {
            this.f72695a.append(ProtectedSandApp.s("將\u0001"));
        }
        this.f72698d.setText(this.f72695a.toString());
    }

    public void setEventTextSize(float f4) {
        TextView textView = this.f72698d;
        if (textView != null) {
            textView.setTextSize(f4);
        }
    }

    public void setMessageMaxLength(int i4) {
        this.f72700f = i4;
    }

    public void setShowLevel(int i4) {
        if (i4 == 0) {
            TextView textView = this.f72697c;
            if (textView != null) {
                textView.setVisibility(4);
            }
            ScrollView scrollView = this.f72699e;
            if (scrollView != null) {
                scrollView.setVisibility(4);
            }
            setVisibility(4);
            return;
        }
        if (i4 != 1) {
            a();
            this.f72697c.setVisibility(0);
            this.f72699e.setVisibility(0);
            setVisibility(0);
            return;
        }
        a();
        this.f72697c.setVisibility(0);
        this.f72699e.setVisibility(4);
        setVisibility(0);
    }

    public void setStatusText(CharSequence charSequence) {
        TextView textView = this.f72697c;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setStatusTextSize(float f4) {
        TextView textView = this.f72697c;
        if (textView != null) {
            textView.setTextSize(f4);
        }
    }

    public Dashboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f72695a = new StringBuilder();
        this.f72696b = new SimpleDateFormat(ProtectedSandApp.s("将\u0001"), Locale.ENGLISH);
        this.f72700f = 3000;
        this.f72701g = false;
        setOrientation(1);
        setVisibility(8);
    }
}
