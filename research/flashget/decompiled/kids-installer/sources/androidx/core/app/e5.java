package androidx.core.app;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import java.util.ArrayList;

/* compiled from: ShareCompat.java */
/* loaded from: classes.dex */
public final class e5 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4042a = "androidx.core.app.EXTRA_CALLING_PACKAGE";

    /* renamed from: b, reason: collision with root package name */
    public static final String f4043b = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    /* renamed from: c, reason: collision with root package name */
    public static final String f4044c = "androidx.core.app.EXTRA_CALLING_ACTIVITY";

    /* renamed from: d, reason: collision with root package name */
    public static final String f4045d = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";

    /* renamed from: e, reason: collision with root package name */
    private static final String f4046e = ".sharecompat_";

    /* compiled from: ShareCompat.java */
    @androidx.annotation.x0(16)
    private static class a {
        private a() {
        }

        @androidx.annotation.u
        static String a(CharSequence charSequence) {
            return Html.escapeHtml(charSequence);
        }

        @androidx.annotation.u
        static void b(@androidx.annotation.o0 Intent intent, @androidx.annotation.o0 ArrayList<Uri> arrayList) {
            ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), null, arrayList.get(0)));
            int size = arrayList.size();
            for (int i5 = 1; i5 < size; i5++) {
                clipData.addItem(new ClipData.Item(arrayList.get(i5)));
            }
            intent.setClipData(clipData);
            intent.addFlags(1);
        }

        @androidx.annotation.u
        static void c(@androidx.annotation.o0 Intent intent) {
            intent.setClipData(null);
            intent.setFlags(intent.getFlags() & (-2));
        }
    }

    /* compiled from: ShareCompat.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        private final Context f4047a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.o0
        private final Intent f4048b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.q0
        private CharSequence f4049c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.q0
        private ArrayList<String> f4050d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.q0
        private ArrayList<String> f4051e;

        /* renamed from: f, reason: collision with root package name */
        @androidx.annotation.q0
        private ArrayList<String> f4052f;

        /* renamed from: g, reason: collision with root package name */
        @androidx.annotation.q0
        private ArrayList<Uri> f4053g;

        public b(@androidx.annotation.o0 Context context) {
            Activity activity;
            context.getClass();
            this.f4047a = context;
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f4048b = action;
            action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
            action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.f4048b.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
                this.f4048b.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
            }
        }

        private void h(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.f4048b.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[arrayList.size() + length];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.f4048b.putExtra(str, strArr);
        }

        private void i(@androidx.annotation.q0 String str, @androidx.annotation.o0 String[] strArr) {
            Intent m5 = m();
            String[] stringArrayExtra = m5.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr2 = new String[strArr.length + length];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, length);
            }
            System.arraycopy(strArr, 0, strArr2, length, strArr.length);
            m5.putExtra(str, strArr2);
        }

        @androidx.annotation.o0
        @Deprecated
        public static b k(@androidx.annotation.o0 Activity activity) {
            return new b(activity);
        }

        @androidx.annotation.o0
        public b a(@androidx.annotation.o0 String str) {
            if (this.f4052f == null) {
                this.f4052f = new ArrayList<>();
            }
            this.f4052f.add(str);
            return this;
        }

        @androidx.annotation.o0
        public b b(@androidx.annotation.o0 String[] strArr) {
            i("android.intent.extra.BCC", strArr);
            return this;
        }

        @androidx.annotation.o0
        public b c(@androidx.annotation.o0 String str) {
            if (this.f4051e == null) {
                this.f4051e = new ArrayList<>();
            }
            this.f4051e.add(str);
            return this;
        }

        @androidx.annotation.o0
        public b d(@androidx.annotation.o0 String[] strArr) {
            i("android.intent.extra.CC", strArr);
            return this;
        }

        @androidx.annotation.o0
        public b e(@androidx.annotation.o0 String str) {
            if (this.f4050d == null) {
                this.f4050d = new ArrayList<>();
            }
            this.f4050d.add(str);
            return this;
        }

        @androidx.annotation.o0
        public b f(@androidx.annotation.o0 String[] strArr) {
            i("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @androidx.annotation.o0
        public b g(@androidx.annotation.o0 Uri uri) {
            if (this.f4053g == null) {
                this.f4053g = new ArrayList<>();
            }
            this.f4053g.add(uri);
            return this;
        }

        @androidx.annotation.o0
        public Intent j() {
            return Intent.createChooser(m(), this.f4049c);
        }

        @androidx.annotation.o0
        Context l() {
            return this.f4047a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            if (r0.size() > 1) goto L17;
         */
        @androidx.annotation.o0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.content.Intent m() {
            /*
                r4 = this;
                java.util.ArrayList<java.lang.String> r0 = r4.f4050d
                r1 = 0
                if (r0 == 0) goto Lc
                java.lang.String r2 = "android.intent.extra.EMAIL"
                r4.h(r2, r0)
                r4.f4050d = r1
            Lc:
                java.util.ArrayList<java.lang.String> r0 = r4.f4051e
                if (r0 == 0) goto L17
                java.lang.String r2 = "android.intent.extra.CC"
                r4.h(r2, r0)
                r4.f4051e = r1
            L17:
                java.util.ArrayList<java.lang.String> r0 = r4.f4052f
                if (r0 == 0) goto L22
                java.lang.String r2 = "android.intent.extra.BCC"
                r4.h(r2, r0)
                r4.f4052f = r1
            L22:
                java.util.ArrayList<android.net.Uri> r0 = r4.f4053g
                r1 = 0
                if (r0 == 0) goto L2f
                int r0 = r0.size()
                r2 = 1
                if (r0 <= r2) goto L2f
                goto L30
            L2f:
                r2 = r1
            L30:
                java.lang.String r0 = "android.intent.extra.STREAM"
                if (r2 != 0) goto L65
                android.content.Intent r2 = r4.f4048b
                java.lang.String r3 = "android.intent.action.SEND"
                r2.setAction(r3)
                java.util.ArrayList<android.net.Uri> r2 = r4.f4053g
                if (r2 == 0) goto L5a
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L5a
                android.content.Intent r2 = r4.f4048b
                java.util.ArrayList<android.net.Uri> r3 = r4.f4053g
                java.lang.Object r1 = r3.get(r1)
                android.os.Parcelable r1 = (android.os.Parcelable) r1
                r2.putExtra(r0, r1)
                android.content.Intent r0 = r4.f4048b
                java.util.ArrayList<android.net.Uri> r1 = r4.f4053g
                androidx.core.app.e5.a.b(r0, r1)
                goto L7a
            L5a:
                android.content.Intent r1 = r4.f4048b
                r1.removeExtra(r0)
                android.content.Intent r0 = r4.f4048b
                androidx.core.app.e5.a.c(r0)
                goto L7a
            L65:
                android.content.Intent r1 = r4.f4048b
                java.lang.String r2 = "android.intent.action.SEND_MULTIPLE"
                r1.setAction(r2)
                android.content.Intent r1 = r4.f4048b
                java.util.ArrayList<android.net.Uri> r2 = r4.f4053g
                r1.putParcelableArrayListExtra(r0, r2)
                android.content.Intent r0 = r4.f4048b
                java.util.ArrayList<android.net.Uri> r1 = r4.f4053g
                androidx.core.app.e5.a.b(r0, r1)
            L7a:
                android.content.Intent r0 = r4.f4048b
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.e5.b.m():android.content.Intent");
        }

        @androidx.annotation.o0
        public b n(@androidx.annotation.g1 int i5) {
            return o(this.f4047a.getText(i5));
        }

        @androidx.annotation.o0
        public b o(@androidx.annotation.q0 CharSequence charSequence) {
            this.f4049c = charSequence;
            return this;
        }

        @androidx.annotation.o0
        public b p(@androidx.annotation.q0 String[] strArr) {
            this.f4048b.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        @androidx.annotation.o0
        public b q(@androidx.annotation.q0 String[] strArr) {
            this.f4048b.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        @androidx.annotation.o0
        public b r(@androidx.annotation.q0 String[] strArr) {
            if (this.f4050d != null) {
                this.f4050d = null;
            }
            this.f4048b.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @androidx.annotation.o0
        public b s(@androidx.annotation.q0 String str) {
            this.f4048b.putExtra("android.intent.extra.HTML_TEXT", str);
            if (!this.f4048b.hasExtra("android.intent.extra.TEXT")) {
                v(Html.fromHtml(str));
            }
            return this;
        }

        @androidx.annotation.o0
        public b t(@androidx.annotation.q0 Uri uri) {
            this.f4053g = null;
            if (uri != null) {
                g(uri);
            }
            return this;
        }

        @androidx.annotation.o0
        public b u(@androidx.annotation.q0 String str) {
            this.f4048b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        @androidx.annotation.o0
        public b v(@androidx.annotation.q0 CharSequence charSequence) {
            this.f4048b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        @androidx.annotation.o0
        public b w(@androidx.annotation.q0 String str) {
            this.f4048b.setType(str);
            return this;
        }

        public void x() {
            this.f4047a.startActivity(j());
        }
    }

    private e5() {
    }

    @Deprecated
    public static void a(@androidx.annotation.o0 Menu menu, @androidx.annotation.d0 int i5, @androidx.annotation.o0 b bVar) {
        MenuItem findItem = menu.findItem(i5);
        if (findItem == null) {
            throw new IllegalArgumentException(androidx.constraintlayout.solver.f.a("Could not find menu item with id ", i5, " in the supplied menu"));
        }
        b(findItem, bVar);
    }

    @Deprecated
    public static void b(@androidx.annotation.o0 MenuItem menuItem, @androidx.annotation.o0 b bVar) {
        ActionProvider actionProvider = menuItem.getActionProvider();
        ShareActionProvider shareActionProvider = !(actionProvider instanceof ShareActionProvider) ? new ShareActionProvider(bVar.l()) : (ShareActionProvider) actionProvider;
        shareActionProvider.setShareHistoryFileName(".sharecompat_".concat(bVar.l().getClass().getName()));
        shareActionProvider.setShareIntent(bVar.m());
        menuItem.setActionProvider(shareActionProvider);
    }

    @androidx.annotation.q0
    public static ComponentName c(@androidx.annotation.o0 Activity activity) {
        Intent intent = activity.getIntent();
        ComponentName callingActivity = activity.getCallingActivity();
        return callingActivity == null ? d(intent) : callingActivity;
    }

    @androidx.annotation.q0
    static ComponentName d(@androidx.annotation.o0 Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY");
        return componentName == null ? (ComponentName) intent.getParcelableExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY") : componentName;
    }

    @androidx.annotation.q0
    public static String e(@androidx.annotation.o0 Activity activity) {
        Intent intent = activity.getIntent();
        String callingPackage = activity.getCallingPackage();
        return (callingPackage != null || intent == null) ? callingPackage : f(intent);
    }

    @androidx.annotation.q0
    static String f(@androidx.annotation.o0 Intent intent) {
        String stringExtra = intent.getStringExtra("androidx.core.app.EXTRA_CALLING_PACKAGE");
        return stringExtra == null ? intent.getStringExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE") : stringExtra;
    }

    /* compiled from: ShareCompat.java */
    public static class c {

        /* renamed from: f, reason: collision with root package name */
        private static final String f4054f = "IntentReader";

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        private final Context f4055a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.o0
        private final Intent f4056b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.q0
        private final String f4057c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.q0
        private final ComponentName f4058d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.q0
        private ArrayList<Uri> f4059e;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(@androidx.annotation.o0 Activity activity) {
            this(activity, activity.getIntent());
            activity.getClass();
        }

        @androidx.annotation.o0
        @Deprecated
        public static c a(@androidx.annotation.o0 Activity activity) {
            return new c(activity);
        }

        private static void t(StringBuilder sb, CharSequence charSequence, int i5, int i6) {
            while (i5 < i6) {
                char charAt = charSequence.charAt(i5);
                if (charAt == '<') {
                    sb.append("&lt;");
                } else if (charAt == '>') {
                    sb.append("&gt;");
                } else if (charAt == '&') {
                    sb.append("&amp;");
                } else if (charAt > '~' || charAt < ' ') {
                    sb.append("&#");
                    sb.append((int) charAt);
                    sb.append(";");
                } else if (charAt == ' ') {
                    while (true) {
                        int i7 = i5 + 1;
                        if (i7 >= i6 || charSequence.charAt(i7) != ' ') {
                            break;
                        }
                        sb.append("&nbsp;");
                        i5 = i7;
                    }
                    sb.append(' ');
                } else {
                    sb.append(charAt);
                }
                i5++;
            }
        }

        @androidx.annotation.q0
        public ComponentName b() {
            return this.f4058d;
        }

        @androidx.annotation.q0
        public Drawable c() {
            if (this.f4058d == null) {
                return null;
            }
            try {
                return this.f4055a.getPackageManager().getActivityIcon(this.f4058d);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @androidx.annotation.q0
        public Drawable d() {
            if (this.f4057c == null) {
                return null;
            }
            try {
                return this.f4055a.getPackageManager().getApplicationIcon(this.f4057c);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @androidx.annotation.q0
        public CharSequence e() {
            if (this.f4057c == null) {
                return null;
            }
            PackageManager packageManager = this.f4055a.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f4057c, 0));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @androidx.annotation.q0
        public String f() {
            return this.f4057c;
        }

        @androidx.annotation.q0
        public String[] g() {
            return this.f4056b.getStringArrayExtra("android.intent.extra.BCC");
        }

        @androidx.annotation.q0
        public String[] h() {
            return this.f4056b.getStringArrayExtra("android.intent.extra.CC");
        }

        @androidx.annotation.q0
        public String[] i() {
            return this.f4056b.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        @androidx.annotation.q0
        public String j() {
            String stringExtra = this.f4056b.getStringExtra("android.intent.extra.HTML_TEXT");
            if (stringExtra != null) {
                return stringExtra;
            }
            CharSequence o5 = o();
            return o5 instanceof Spanned ? Html.toHtml((Spanned) o5) : o5 != null ? a.a(o5) : stringExtra;
        }

        @androidx.annotation.q0
        public Uri k() {
            return (Uri) this.f4056b.getParcelableExtra("android.intent.extra.STREAM");
        }

        @androidx.annotation.q0
        public Uri l(int i5) {
            if (this.f4059e == null && q()) {
                this.f4059e = this.f4056b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f4059e;
            if (arrayList != null) {
                return arrayList.get(i5);
            }
            if (i5 == 0) {
                return (Uri) this.f4056b.getParcelableExtra("android.intent.extra.STREAM");
            }
            throw new IndexOutOfBoundsException("Stream items available: " + m() + " index requested: " + i5);
        }

        public int m() {
            if (this.f4059e == null && q()) {
                this.f4059e = this.f4056b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f4059e;
            return arrayList != null ? arrayList.size() : this.f4056b.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        @androidx.annotation.q0
        public String n() {
            return this.f4056b.getStringExtra("android.intent.extra.SUBJECT");
        }

        @androidx.annotation.q0
        public CharSequence o() {
            return this.f4056b.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        @androidx.annotation.q0
        public String p() {
            return this.f4056b.getType();
        }

        public boolean q() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.f4056b.getAction());
        }

        public boolean r() {
            String action = this.f4056b.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        public boolean s() {
            return "android.intent.action.SEND".equals(this.f4056b.getAction());
        }

        public c(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Intent intent) {
            context.getClass();
            this.f4055a = context;
            intent.getClass();
            this.f4056b = intent;
            this.f4057c = e5.f(intent);
            this.f4058d = e5.d(intent);
        }
    }
}
