package com.tencent.liteav.sdkcommon;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.android.internal.telephony.cdma.UserData;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.badge.BadgeDrawable;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.sdkcommon.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@JNINamespace("liteav::dashboard")
/* loaded from: classes7.dex */
public class DashboardManager {
    private static final int LOG_MAX_SIZE = 15000;
    private static final String TAG = ProtectedSandApp.s("呐\u0001");
    private final Context mAppContext;
    private final g mDashboardManagerView;
    private boolean mIsInit;
    private final g.a mSelectedDashboardChangeListener;
    private String mSelectedDashboardId;
    private final Handler mUIHandler;
    private final ArrayList<String> mDashboards = new ArrayList<>();
    private final Map<String, String> mDashboardStatus = new HashMap();
    private final Map<String, StringBuilder> mDashboardLogs = new HashMap();

    public DashboardManager() {
        g.a aVar = new g.a() { // from class: com.tencent.liteav.sdkcommon.DashboardManager.1
            @Override // com.tencent.liteav.sdkcommon.g.a
            public final void a(int i4) {
                if (DashboardManager.this.mDashboards.size() <= i4) {
                    return;
                }
                DashboardManager dashboardManager = DashboardManager.this;
                dashboardManager.mSelectedDashboardId = (String) dashboardManager.mDashboards.get(i4);
                if (DashboardManager.this.mDashboards.contains(DashboardManager.this.mSelectedDashboardId)) {
                    DashboardManager.this.mDashboardManagerView.b((String) DashboardManager.this.mDashboardStatus.get(DashboardManager.this.mSelectedDashboardId));
                    StringBuilder sb = (StringBuilder) DashboardManager.this.mDashboardLogs.get(DashboardManager.this.mSelectedDashboardId);
                    if (sb != null) {
                        DashboardManager.this.mDashboardManagerView.a(sb.toString());
                    } else {
                        DashboardManager.this.mDashboardManagerView.a("");
                    }
                }
            }
        };
        this.mSelectedDashboardChangeListener = aVar;
        LiteavLog.i(ProtectedSandApp.s("呐\u0001"), ProtectedSandApp.s("呑\u0001"));
        this.mIsInit = false;
        Context applicationContext = ContextUtils.getApplicationContext();
        this.mAppContext = applicationContext;
        this.mDashboardManagerView = new g(applicationContext, aVar);
        this.mUIHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDashboardInternal(String str) {
        if (this.mDashboards.contains(str)) {
            return;
        }
        this.mDashboards.add(str);
        g gVar = this.mDashboardManagerView;
        gVar.f72035e.add(str);
        if (gVar.f72042l == null) {
            gVar.f72042l = gVar.f72035e.getItem(0);
            gVar.f72045o.a(0);
        }
        gVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void appendLogInternal(String str, String str2) {
        g gVar;
        TextView textView;
        if (this.mDashboards.contains(str)) {
            StringBuilder sb = this.mDashboardLogs.get(str);
            if (sb == null) {
                sb = new StringBuilder();
                this.mDashboardLogs.put(str, sb);
            }
            sb.append(str2);
            String s4 = ProtectedSandApp.s("呒\u0001");
            sb.append(s4);
            if (sb.length() > LOG_MAX_SIZE) {
                sb.delete(0, sb.length() / 2);
            }
            if (!str.equals(this.mSelectedDashboardId) || (textView = (gVar = this.mDashboardManagerView).f72039i) == null) {
                return;
            }
            textView.append(str2 + s4);
            ScrollView scrollView = gVar.f72041k;
            if (scrollView != null) {
                if (gVar.f72041k.getHeight() + scrollView.getScrollY() + gVar.a(100) >= gVar.f72039i.getMeasuredHeight()) {
                    gVar.f72034d.post(i.a(gVar));
                }
            }
        }
    }

    private boolean checkPermission() {
        if (LiteavSystemInfo.getSystemOSVersionInt() <= 23 || Settings.canDrawOverlays(this.mAppContext)) {
            return true;
        }
        Toast.makeText(this.mAppContext, ProtectedSandApp.s("呓\u0001"), 0).show();
        return false;
    }

    private boolean init() {
        if (this.mIsInit) {
            return true;
        }
        g gVar = this.mDashboardManagerView;
        Context context = gVar.f72033c;
        String s4 = ProtectedSandApp.s("呔\u0001");
        if (context == null) {
            Log.e(s4, ProtectedSandApp.s("呕\u0001"), new Object[0]);
        } else {
            WindowManager windowManager = (WindowManager) context.getSystemService(ProtectedSandApp.s("呖\u0001"));
            gVar.f72036f = windowManager;
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getMetrics(gVar.f72031a);
                gVar.f72044n = gVar.f72031a.heightPixels - gVar.a(50);
                g gVar2 = this.mDashboardManagerView;
                if (Build.VERSION.SDK_INT >= 26) {
                    gVar2.f72032b.type = 2038;
                } else {
                    gVar2.f72032b.type = 2002;
                }
                WindowManager.LayoutParams layoutParams = gVar2.f72032b;
                layoutParams.format = 1;
                layoutParams.gravity = BadgeDrawable.f52614s;
                layoutParams.width = gVar2.f72031a.widthPixels;
                layoutParams.height = gVar2.f72044n;
                layoutParams.x = 0;
                layoutParams.y = 0;
                layoutParams.flags = 32;
                LinearLayout linearLayout = new LinearLayout(gVar2.f72033c);
                linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                linearLayout.setOrientation(1);
                linearLayout.setOnTouchListener(new g.b(gVar2, (byte) 0));
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(gVar2.a(70), gVar2.a(40));
                Button button = new Button(gVar2.f72033c);
                button.setText(ProtectedSandApp.s("员\u0001"));
                button.setLayoutParams(layoutParams2);
                button.setOnClickListener(j.a(gVar2, button));
                Button button2 = new Button(gVar2.f72033c);
                button2.setText(ProtectedSandApp.s("呙\u0001"));
                layoutParams2.leftMargin = gVar2.a(10);
                button2.setLayoutParams(layoutParams2);
                button2.setOnClickListener(k.a(gVar2));
                LinearLayout linearLayout2 = new LinearLayout(gVar2.f72033c);
                linearLayout2.addView(button);
                linearLayout2.addView(button2);
                linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                linearLayout2.setOrientation(0);
                linearLayout2.setBackgroundColor(-7829368);
                linearLayout2.setAlpha(0.5f);
                linearLayout.addView(linearLayout2);
                Spinner spinner = new Spinner(gVar2.f72033c);
                gVar2.f72040j = spinner;
                spinner.setAdapter((SpinnerAdapter) gVar2.f72035e);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, gVar2.a(30));
                layoutParams3.topMargin = gVar2.a(2);
                gVar2.f72040j.setLayoutParams(layoutParams3);
                gVar2.f72040j.setOnItemSelectedListener(new g.c(gVar2, (byte) 0));
                gVar2.f72040j.setBackgroundColor(-7829368);
                gVar2.f72040j.setAlpha(0.5f);
                linearLayout.addView(gVar2.f72040j);
                gVar2.f72038h = new TextView(gVar2.f72033c);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, gVar2.a(160));
                layoutParams4.topMargin = gVar2.a(10);
                layoutParams4.leftMargin = gVar2.a(10);
                layoutParams4.rightMargin = gVar2.a(3);
                gVar2.f72038h.setLayoutParams(layoutParams4);
                gVar2.f72038h.setTextColor(c1.a.f38447c);
                linearLayout.addView(gVar2.f72038h);
                gVar2.f72041k = new ScrollView(gVar2.f72033c);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, gVar2.b());
                layoutParams5.leftMargin = gVar2.a(10);
                layoutParams5.rightMargin = gVar2.a(3);
                gVar2.f72041k.setLayoutParams(layoutParams5);
                gVar2.f72041k.setVerticalScrollBarEnabled(true);
                gVar2.f72039i = new TextView(gVar2.f72033c);
                gVar2.f72039i.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                gVar2.f72039i.setTextColor(c1.a.f38447c);
                gVar2.f72041k.addView(gVar2.f72039i);
                gVar2.f72041k.fullScroll(UserData.IS91_MSG_TYPE_VOICEMAIL_STATUS);
                linearLayout.addView(gVar2.f72041k);
                gVar2.f72037g = linearLayout;
                gVar2.f72045o.a(0);
                this.mIsInit = true;
                return true;
            }
            Log.e(s4, ProtectedSandApp.s("呗\u0001"), new Object[0]);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAllDashboardInternal() {
        this.mDashboards.clear();
        this.mDashboardStatus.clear();
        this.mDashboardLogs.clear();
        g gVar = this.mDashboardManagerView;
        gVar.f72035e.clear();
        gVar.f72042l = null;
        TextView textView = gVar.f72038h;
        if (textView != null) {
            textView.setText("");
        }
        TextView textView2 = gVar.f72039i;
        if (textView2 != null) {
            textView2.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDashboardInternal(String str) {
        if (this.mDashboards.contains(str)) {
            this.mDashboards.remove(str);
            this.mDashboardStatus.remove(str);
            this.mDashboardLogs.remove(str);
            g gVar = this.mDashboardManagerView;
            if (str.equals(gVar.f72042l)) {
                int position = gVar.f72035e.getPosition(gVar.f72042l);
                if (position != gVar.f72035e.getCount() - 1) {
                    int i4 = position + 1;
                    gVar.f72042l = gVar.f72035e.getItem(i4);
                    gVar.f72045o.a(position);
                    Spinner spinner = gVar.f72040j;
                    if (spinner != null) {
                        spinner.setSelection(i4);
                    }
                } else if (position > 0) {
                    int i5 = position - 1;
                    gVar.f72042l = gVar.f72035e.getItem(i5);
                    gVar.f72045o.a(i5);
                    Spinner spinner2 = gVar.f72040j;
                    if (spinner2 != null) {
                        spinner2.setSelection(i5);
                    }
                }
            }
            gVar.f72035e.remove(str);
            if (gVar.f72035e.getCount() == 0) {
                gVar.f72042l = null;
            }
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusInternal(String str, String str2) {
        if (this.mDashboards.contains(str)) {
            this.mDashboardStatus.put(str, str2);
            if (str.equals(this.mSelectedDashboardId)) {
                this.mDashboardManagerView.b(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDashboardInternal(boolean z4) {
        if (!z4 || (checkPermission() && init())) {
            this.mDashboardManagerView.a(z4);
        } else {
            LiteavLog.i(ProtectedSandApp.s("呐\u0001"), ProtectedSandApp.s("呚\u0001"));
        }
    }

    public int addDashboard(String str) {
        LiteavLog.i(ProtectedSandApp.s("呐\u0001"), ProtectedSandApp.s("呛\u0001").concat(String.valueOf(str)));
        this.mUIHandler.post(b.a(this, str));
        return 0;
    }

    public int appendLog(String str, String str2) {
        this.mUIHandler.post(f.a(this, str, str2));
        return 0;
    }

    public int removeAllDashboard() {
        LiteavLog.i(ProtectedSandApp.s("呐\u0001"), ProtectedSandApp.s("呜\u0001"));
        this.mUIHandler.post(d.a(this));
        return 0;
    }

    public int removeDashboard(String str) {
        LiteavLog.i(ProtectedSandApp.s("呐\u0001"), ProtectedSandApp.s("呝\u0001").concat(String.valueOf(str)));
        this.mUIHandler.post(c.a(this, str));
        return 0;
    }

    public int setStatus(String str, String str2) {
        this.mUIHandler.post(e.a(this, str, str2));
        return 0;
    }

    public int showDashboard(boolean z4) {
        LiteavLog.i(ProtectedSandApp.s("呐\u0001"), ProtectedSandApp.s("呞\u0001").concat(String.valueOf(z4)));
        this.mUIHandler.post(a.a(this, z4));
        return 0;
    }
}
