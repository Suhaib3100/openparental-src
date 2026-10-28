package com.androidquery.service;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v4.media.d;
import android.text.Editable;
import android.text.Html;
import androidx.appcompat.view.g;
import androidx.compose.runtime.changelist.j;
import androidx.room.l0;
import com.androidquery.callback.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import org.json.JSONObject;
import org.xml.sax.XMLReader;

/* compiled from: MarketService.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: n, reason: collision with root package name */
    public static final int f41177n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f41178o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f41179p = 2;

    /* renamed from: q, reason: collision with root package name */
    private static ApplicationInfo f41180q;

    /* renamed from: r, reason: collision with root package name */
    private static PackageInfo f41181r;

    /* renamed from: s, reason: collision with root package name */
    private static final String f41182s = ProtectedSandApp.s("ފ");

    /* renamed from: t, reason: collision with root package name */
    private static final String f41183t = ProtectedSandApp.s("ޤ");

    /* renamed from: a, reason: collision with root package name */
    private Activity f41184a;

    /* renamed from: b, reason: collision with root package name */
    private com.androidquery.a f41185b;

    /* renamed from: e, reason: collision with root package name */
    private String f41188e;

    /* renamed from: f, reason: collision with root package name */
    private String f41189f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f41190g;

    /* renamed from: h, reason: collision with root package name */
    private int f41191h;

    /* renamed from: j, reason: collision with root package name */
    private String f41193j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f41194k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f41195l;

    /* renamed from: i, reason: collision with root package name */
    private long f41192i = 720000;

    /* renamed from: m, reason: collision with root package name */
    private int f41196m = 0;

    /* renamed from: c, reason: collision with root package name */
    private b f41186c = new b();

    /* renamed from: d, reason: collision with root package name */
    private String f41187d = Locale.getDefault().toString();

    /* compiled from: MarketService.java */
    private class b implements DialogInterface.OnClickListener, Html.TagHandler {
        private b() {
        }

        private void a(String str, JSONObject jSONObject, c cVar) {
            if (a.this.f41195l) {
                return;
            }
            a.this.f41195l = true;
            a.this.f41191h = 0;
            a.this.o(str, jSONObject, cVar);
        }

        public void b(String str, String str2, c cVar) {
            if (str2 == null || str2.length() <= 1000) {
                return;
            }
            String y4 = a.this.y();
            com.androidquery.callback.b bVar = new com.androidquery.callback.b();
            bVar.d1(y4).b1(JSONObject.class).a0(this, ProtectedSandApp.s("ݹ"));
            bVar.y0(ProtectedSandApp.s("ݺ"), str2);
            a.this.f41185b.e1(a.this.f41191h).c(bVar);
        }

        public void c(String str, JSONObject jSONObject, c cVar) {
            if (a.this.f41184a.isFinishing()) {
                return;
            }
            if (jSONObject == null) {
                a(str, jSONObject, cVar);
                return;
            }
            String optString = jSONObject.optString(ProtectedSandApp.s("ݻ"));
            if (!ProtectedSandApp.s("ݼ").equals(optString)) {
                if (ProtectedSandApp.s("ށ").equals(optString)) {
                    cVar.C();
                    return;
                } else {
                    a(str, jSONObject, cVar);
                    return;
                }
            }
            if (jSONObject.has(ProtectedSandApp.s("ݽ"))) {
                a(str, jSONObject, cVar);
            }
            if (!a.this.f41194k && jSONObject.optBoolean(ProtectedSandApp.s("ݾ"), false) && cVar.z() == 1) {
                a.this.f41194k = true;
                String optString2 = jSONObject.optString(ProtectedSandApp.s("ݿ"), null);
                com.androidquery.callback.b bVar = new com.androidquery.callback.b();
                bVar.d1(optString2).b1(String.class).a0(this, ProtectedSandApp.s("ހ"));
                a.this.f41185b.e1(a.this.f41191h).c(bVar);
            }
        }

        @Override // android.text.Html.TagHandler
        public void handleTag(boolean z4, String str, Editable editable, XMLReader xMLReader) {
            if (ProtectedSandApp.s("ނ").equals(str)) {
                if (!z4) {
                    editable.append((CharSequence) ProtectedSandApp.s("ޅ"));
                    return;
                }
                String s4 = ProtectedSandApp.s("ރ");
                editable.append((CharSequence) s4);
                editable.append((CharSequence) ProtectedSandApp.s("ބ"));
                editable.append((CharSequence) s4);
            }
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            if (i4 == -3) {
                a.L(a.this.f41184a, a.this.f41193j);
            } else if (i4 == -2) {
                a.F(a.this.f41184a, a.this.f41189f);
            } else {
                if (i4 != -1) {
                    return;
                }
                a.F(a.this.f41184a, a.this.f41188e);
            }
        }
    }

    public a(Activity activity) {
        this.f41184a = activity;
        this.f41185b = new com.androidquery.a(activity);
        String w4 = w();
        this.f41188e = w4;
        this.f41189f = w4;
    }

    private String A() {
        return x().versionName;
    }

    private int B() {
        return x().versionCode;
    }

    private boolean C() {
        return !this.f41184a.isFinishing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean F(Activity activity, String str) {
        if (str == null) {
            return false;
        }
        try {
            activity.startActivity(new Intent(ProtectedSandApp.s("ކ"), Uri.parse(str)));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean G(String str, int i4) {
        if (str.equals(z(this.f41184a))) {
            return false;
        }
        String str2 = x().versionName;
        int i5 = x().versionCode;
        if (str2.equals(str) || i5 > i4) {
            return false;
        }
        return K(str2, str, this.f41196m);
    }

    private static String H(String str) {
        return d.a(ProtectedSandApp.s("އ"), str, ProtectedSandApp.s("ވ"));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean K(java.lang.String r6, java.lang.String r7, int r8) {
        /*
            r5 = this;
            java.lang.String r0 = "މ"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            boolean r1 = r6.equals(r7)
            r2 = 0
            if (r1 == 0) goto Le
            return r2
        Le:
            r1 = 1
            java.lang.String[] r6 = r6.split(r0)     // Catch: java.lang.Exception -> L55
            java.lang.String[] r7 = r7.split(r0)     // Catch: java.lang.Exception -> L55
            int r0 = r6.length     // Catch: java.lang.Exception -> L55
            r3 = 3
            if (r0 < r3) goto L57
            int r0 = r7.length     // Catch: java.lang.Exception -> L55
            if (r0 >= r3) goto L1f
            goto L57
        L1f:
            r0 = 2
            if (r8 == 0) goto L27
            if (r8 == r1) goto L36
            if (r8 == r0) goto L45
            return r1
        L27:
            int r8 = r6.length     // Catch: java.lang.Exception -> L55
            int r8 = r8 - r1
            r8 = r6[r8]     // Catch: java.lang.Exception -> L55
            int r4 = r7.length     // Catch: java.lang.Exception -> L55
            int r4 = r4 - r1
            r4 = r7[r4]     // Catch: java.lang.Exception -> L55
            boolean r8 = r8.equals(r4)     // Catch: java.lang.Exception -> L55
            if (r8 != 0) goto L36
            return r1
        L36:
            int r8 = r6.length     // Catch: java.lang.Exception -> L55
            int r8 = r8 - r0
            r8 = r6[r8]     // Catch: java.lang.Exception -> L55
            int r4 = r7.length     // Catch: java.lang.Exception -> L55
            int r4 = r4 - r0
            r0 = r7[r4]     // Catch: java.lang.Exception -> L55
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Exception -> L55
            if (r8 != 0) goto L45
            return r1
        L45:
            int r8 = r6.length     // Catch: java.lang.Exception -> L55
            int r8 = r8 - r3
            r6 = r6[r8]     // Catch: java.lang.Exception -> L55
            int r8 = r7.length     // Catch: java.lang.Exception -> L55
            int r8 = r8 - r3
            r7 = r7[r8]     // Catch: java.lang.Exception -> L55
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Exception -> L55
            if (r6 != 0) goto L54
            return r1
        L54:
            return r2
        L55:
            r6 = move-exception
            goto L58
        L57:
            return r1
        L58:
            com.androidquery.util.a.R(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.androidquery.service.a.K(java.lang.String, java.lang.String, int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void L(Context context, String str) {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(ProtectedSandApp.s("ފ"), str).commit();
    }

    private Drawable s() {
        return u().loadIcon(this.f41184a.getPackageManager());
    }

    private String t() {
        return u().packageName;
    }

    private ApplicationInfo u() {
        if (f41180q == null) {
            f41180q = this.f41184a.getApplicationInfo();
        }
        return f41180q;
    }

    private String v() {
        return ProtectedSandApp.s("ދ");
    }

    private String w() {
        return androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("ތ"), u().packageName);
    }

    private PackageInfo x() {
        if (f41181r == null) {
            try {
                f41181r = this.f41184a.getPackageManager().getPackageInfo(u().packageName, 0);
            } catch (PackageManager.NameNotFoundException e4) {
                e4.printStackTrace();
            }
        }
        return f41181r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String y() {
        StringBuilder a5 = g.a(ProtectedSandApp.s("ލ"), u().packageName, ProtectedSandApp.s("ގ"));
        a5.append(this.f41187d);
        a5.append(ProtectedSandApp.s("ޏ"));
        a5.append(x().versionName);
        a5.append(ProtectedSandApp.s("ސ"));
        String a6 = android.support.v4.media.b.a(a5, x().versionCode, ProtectedSandApp.s("ޑ"));
        return this.f41190g ? j.a(a6, ProtectedSandApp.s("ޒ")) : a6;
    }

    private static String z(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(ProtectedSandApp.s("ފ"), null);
    }

    public a D(int i4) {
        this.f41196m = i4;
        return this;
    }

    public a E(String str) {
        this.f41187d = str;
        return this;
    }

    public a I(int i4) {
        this.f41191h = i4;
        return this;
    }

    public a J(String str) {
        this.f41188e = str;
        return this;
    }

    protected void M(JSONObject jSONObject) {
        if (jSONObject != null && this.f41193j == null && C()) {
            JSONObject optJSONObject = jSONObject.optJSONObject(ProtectedSandApp.s("ޓ"));
            String optString = optJSONObject.optString(ProtectedSandApp.s("ޔ"), ProtectedSandApp.s("ޕ"));
            String optString2 = optJSONObject.optString(ProtectedSandApp.s("ޖ"), ProtectedSandApp.s("ޗ"));
            String optString3 = optJSONObject.optString(ProtectedSandApp.s("ޘ"), ProtectedSandApp.s("ޙ"));
            String s4 = ProtectedSandApp.s("ޚ");
            String optString4 = optJSONObject.optString(s4, "");
            String optString5 = optJSONObject.optString(ProtectedSandApp.s("ޛ"), ProtectedSandApp.s("ޜ"));
            com.androidquery.util.a.j(s4, optString4);
            this.f41193j = jSONObject.optString(ProtectedSandApp.s("ޝ"), null);
            AlertDialog create = new AlertDialog.Builder(this.f41184a).setIcon(s()).setTitle(optString5).setPositiveButton(optString3, this.f41186c).setNeutralButton(optString2, this.f41186c).setNegativeButton(optString, this.f41186c).create();
            create.setMessage(Html.fromHtml(H(optString4), null, this.f41186c));
            this.f41185b.y1(create);
        }
    }

    public a N(String str) {
        this.f41189f = str;
        return this;
    }

    protected void o(String str, JSONObject jSONObject, c cVar) {
        if (jSONObject == null) {
            return;
        }
        String s4 = ProtectedSandApp.s("ޞ");
        String s5 = ProtectedSandApp.s("ޝ");
        String optString = jSONObject.optString(s5, s4);
        int optInt = jSONObject.optInt(ProtectedSandApp.s("ޟ"), 0);
        StringBuilder sb = new StringBuilder();
        String str2 = x().versionName;
        String s6 = ProtectedSandApp.s("ޠ");
        l0.a(sb, str2, s6, optString, ProtectedSandApp.s("ޡ"));
        sb.append(x().versionCode);
        sb.append(s6);
        sb.append(optInt);
        com.androidquery.util.a.j(s5, sb.toString());
        com.androidquery.util.a.j(ProtectedSandApp.s("ޢ"), Boolean.valueOf(G(optString, optInt)));
        if (this.f41190g || G(optString, optInt)) {
            M(jSONObject);
        }
    }

    public void p() {
        String y4 = y();
        com.androidquery.callback.b bVar = new com.androidquery.callback.b();
        bVar.d1(y4).b1(JSONObject.class).a0(this.f41186c, ProtectedSandApp.s("ޣ")).B(!this.f41190g).x(this.f41192i);
        this.f41185b.e1(this.f41191h).c(bVar);
    }

    public a q(long j4) {
        this.f41192i = j4;
        return this;
    }

    public a r(boolean z4) {
        this.f41190g = z4;
        return this;
    }
}
