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
import androidx.annotation.g1;
import androidx.collection.r2;
import java.util.ArrayList;

/* compiled from: ShareCompat.java */
/* loaded from: classes3.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f25913a = "androidx.core.app.EXTRA_CALLING_PACKAGE";

    /* renamed from: b, reason: collision with root package name */
    public static final String f25914b = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    /* renamed from: c, reason: collision with root package name */
    public static final String f25915c = "androidx.core.app.EXTRA_CALLING_ACTIVITY";

    /* renamed from: d, reason: collision with root package name */
    public static final String f25916d = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";

    /* renamed from: e, reason: collision with root package name */
    private static final String f25917e = ".sharecompat_";

    /* compiled from: ShareCompat.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        private final Context f25918a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.o0
        private final Intent f25919b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.q0
        private CharSequence f25920c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.q0
        private ArrayList<String> f25921d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.q0
        private ArrayList<String> f25922e;

        /* renamed from: f, reason: collision with root package name */
        @androidx.annotation.q0
        private ArrayList<String> f25923f;

        /* renamed from: g, reason: collision with root package name */
        @androidx.annotation.q0
        private ArrayList<Uri> f25924g;

        public a(@androidx.annotation.o0 Context context) {
            Activity activity;
            context.getClass();
            this.f25918a = context;
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f25919b = action;
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
                this.f25919b.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
                this.f25919b.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
            }
        }

        private void h(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.f25919b.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[arrayList.size() + length];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.f25919b.putExtra(str, strArr);
        }

        private void i(@androidx.annotation.q0 String str, @androidx.annotation.o0 String[] strArr) {
            Intent m4 = m();
            String[] stringArrayExtra = m4.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr2 = new String[strArr.length + length];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, length);
            }
            System.arraycopy(strArr, 0, strArr2, length, strArr.length);
            m4.putExtra(str, strArr2);
        }

        @androidx.annotation.o0
        @Deprecated
        public static a k(@androidx.annotation.o0 Activity activity) {
            return new a(activity);
        }

        @androidx.annotation.o0
        public a a(@androidx.annotation.o0 String str) {
            if (this.f25923f == null) {
                this.f25923f = new ArrayList<>();
            }
            this.f25923f.add(str);
            return this;
        }

        @androidx.annotation.o0
        public a b(@androidx.annotation.o0 String[] strArr) {
            i("android.intent.extra.BCC", strArr);
            return this;
        }

        @androidx.annotation.o0
        public a c(@androidx.annotation.o0 String str) {
            if (this.f25922e == null) {
                this.f25922e = new ArrayList<>();
            }
            this.f25922e.add(str);
            return this;
        }

        @androidx.annotation.o0
        public a d(@androidx.annotation.o0 String[] strArr) {
            i("android.intent.extra.CC", strArr);
            return this;
        }

        @androidx.annotation.o0
        public a e(@androidx.annotation.o0 String str) {
            if (this.f25921d == null) {
                this.f25921d = new ArrayList<>();
            }
            this.f25921d.add(str);
            return this;
        }

        @androidx.annotation.o0
        public a f(@androidx.annotation.o0 String[] strArr) {
            i("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @androidx.annotation.o0
        public a g(@androidx.annotation.o0 Uri uri) {
            if (this.f25924g == null) {
                this.f25924g = new ArrayList<>();
            }
            this.f25924g.add(uri);
            return this;
        }

        @androidx.annotation.o0
        public Intent j() {
            return Intent.createChooser(m(), this.f25920c);
        }

        @androidx.annotation.o0
        Context l() {
            return this.f25918a;
        }

        @androidx.annotation.o0
        public Intent m() {
            ArrayList<String> arrayList = this.f25921d;
            if (arrayList != null) {
                h("android.intent.extra.EMAIL", arrayList);
                this.f25921d = null;
            }
            ArrayList<String> arrayList2 = this.f25922e;
            if (arrayList2 != null) {
                h("android.intent.extra.CC", arrayList2);
                this.f25922e = null;
            }
            ArrayList<String> arrayList3 = this.f25923f;
            if (arrayList3 != null) {
                h("android.intent.extra.BCC", arrayList3);
                this.f25923f = null;
            }
            ArrayList<Uri> arrayList4 = this.f25924g;
            if (arrayList4 == null || arrayList4.size() <= 1) {
                this.f25919b.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList5 = this.f25924g;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    this.f25919b.removeExtra("android.intent.extra.STREAM");
                    this.f25919b.setClipData(null);
                    Intent intent = this.f25919b;
                    intent.setFlags(intent.getFlags() & (-2));
                } else {
                    this.f25919b.putExtra("android.intent.extra.STREAM", this.f25924g.get(0));
                    v0.g(this.f25919b, this.f25924g);
                }
            } else {
                this.f25919b.setAction("android.intent.action.SEND_MULTIPLE");
                this.f25919b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f25924g);
                v0.g(this.f25919b, this.f25924g);
            }
            return this.f25919b;
        }

        @androidx.annotation.o0
        public a n(@g1 int i4) {
            return o(this.f25918a.getText(i4));
        }

        @androidx.annotation.o0
        public a o(@androidx.annotation.q0 CharSequence charSequence) {
            this.f25920c = charSequence;
            return this;
        }

        @androidx.annotation.o0
        public a p(@androidx.annotation.q0 String[] strArr) {
            this.f25919b.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        @androidx.annotation.o0
        public a q(@androidx.annotation.q0 String[] strArr) {
            this.f25919b.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        @androidx.annotation.o0
        public a r(@androidx.annotation.q0 String[] strArr) {
            if (this.f25921d != null) {
                this.f25921d = null;
            }
            this.f25919b.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @androidx.annotation.o0
        public a s(@androidx.annotation.q0 String str) {
            this.f25919b.putExtra("android.intent.extra.HTML_TEXT", str);
            if (!this.f25919b.hasExtra("android.intent.extra.TEXT")) {
                v(Html.fromHtml(str));
            }
            return this;
        }

        @androidx.annotation.o0
        public a t(@androidx.annotation.q0 Uri uri) {
            this.f25924g = null;
            if (uri != null) {
                g(uri);
            }
            return this;
        }

        @androidx.annotation.o0
        public a u(@androidx.annotation.q0 String str) {
            this.f25919b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        @androidx.annotation.o0
        public a v(@androidx.annotation.q0 CharSequence charSequence) {
            this.f25919b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        @androidx.annotation.o0
        public a w(@androidx.annotation.q0 String str) {
            this.f25919b.setType(str);
            return this;
        }

        public void x() {
            this.f25918a.startActivity(j());
        }
    }

    private v0() {
    }

    @Deprecated
    public static void a(@androidx.annotation.o0 Menu menu, @androidx.annotation.d0 int i4, @androidx.annotation.o0 a aVar) {
        MenuItem findItem = menu.findItem(i4);
        if (findItem == null) {
            throw new IllegalArgumentException(r2.a("Could not find menu item with id ", i4, " in the supplied menu"));
        }
        b(findItem, aVar);
    }

    @Deprecated
    public static void b(@androidx.annotation.o0 MenuItem menuItem, @androidx.annotation.o0 a aVar) {
        ActionProvider actionProvider = menuItem.getActionProvider();
        ShareActionProvider shareActionProvider = !(actionProvider instanceof ShareActionProvider) ? new ShareActionProvider(aVar.l()) : (ShareActionProvider) actionProvider;
        shareActionProvider.setShareHistoryFileName(".sharecompat_".concat(aVar.l().getClass().getName()));
        shareActionProvider.setShareIntent(aVar.m());
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

    static void g(@androidx.annotation.o0 Intent intent, @androidx.annotation.o0 ArrayList<Uri> arrayList) {
        ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), null, arrayList.get(0)));
        int size = arrayList.size();
        for (int i4 = 1; i4 < size; i4++) {
            clipData.addItem(new ClipData.Item(arrayList.get(i4)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }

    /* compiled from: ShareCompat.java */
    public static class b {

        /* renamed from: f, reason: collision with root package name */
        private static final String f25925f = "IntentReader";

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.o0
        private final Context f25926a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.o0
        private final Intent f25927b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.q0
        private final String f25928c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.q0
        private final ComponentName f25929d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.q0
        private ArrayList<Uri> f25930e;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@androidx.annotation.o0 Activity activity) {
            this(activity, activity.getIntent());
            activity.getClass();
        }

        @androidx.annotation.o0
        @Deprecated
        public static b a(@androidx.annotation.o0 Activity activity) {
            return new b(activity);
        }

        @androidx.annotation.q0
        public ComponentName b() {
            return this.f25929d;
        }

        @androidx.annotation.q0
        public Drawable c() {
            if (this.f25929d == null) {
                return null;
            }
            try {
                return this.f25926a.getPackageManager().getActivityIcon(this.f25929d);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @androidx.annotation.q0
        public Drawable d() {
            if (this.f25928c == null) {
                return null;
            }
            try {
                return this.f25926a.getPackageManager().getApplicationIcon(this.f25928c);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @androidx.annotation.q0
        public CharSequence e() {
            if (this.f25928c == null) {
                return null;
            }
            PackageManager packageManager = this.f25926a.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f25928c, 0));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @androidx.annotation.q0
        public String f() {
            return this.f25928c;
        }

        @androidx.annotation.q0
        public String[] g() {
            return this.f25927b.getStringArrayExtra("android.intent.extra.BCC");
        }

        @androidx.annotation.q0
        public String[] h() {
            return this.f25927b.getStringArrayExtra("android.intent.extra.CC");
        }

        @androidx.annotation.q0
        public String[] i() {
            return this.f25927b.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        @androidx.annotation.q0
        public String j() {
            String stringExtra = this.f25927b.getStringExtra("android.intent.extra.HTML_TEXT");
            if (stringExtra != null) {
                return stringExtra;
            }
            CharSequence o4 = o();
            return o4 instanceof Spanned ? Html.toHtml((Spanned) o4) : o4 != null ? Html.escapeHtml(o4) : stringExtra;
        }

        @androidx.annotation.q0
        public Uri k() {
            return (Uri) this.f25927b.getParcelableExtra("android.intent.extra.STREAM");
        }

        @androidx.annotation.q0
        public Uri l(int i4) {
            if (this.f25930e == null && q()) {
                this.f25930e = this.f25927b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f25930e;
            if (arrayList != null) {
                return arrayList.get(i4);
            }
            if (i4 == 0) {
                return (Uri) this.f25927b.getParcelableExtra("android.intent.extra.STREAM");
            }
            throw new IndexOutOfBoundsException("Stream items available: " + m() + " index requested: " + i4);
        }

        public int m() {
            if (this.f25930e == null && q()) {
                this.f25930e = this.f25927b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f25930e;
            return arrayList != null ? arrayList.size() : this.f25927b.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        @androidx.annotation.q0
        public String n() {
            return this.f25927b.getStringExtra("android.intent.extra.SUBJECT");
        }

        @androidx.annotation.q0
        public CharSequence o() {
            return this.f25927b.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        @androidx.annotation.q0
        public String p() {
            return this.f25927b.getType();
        }

        public boolean q() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.f25927b.getAction());
        }

        public boolean r() {
            String action = this.f25927b.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        public boolean s() {
            return "android.intent.action.SEND".equals(this.f25927b.getAction());
        }

        public b(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Intent intent) {
            context.getClass();
            this.f25926a = context;
            intent.getClass();
            this.f25927b = intent;
            this.f25928c = v0.f(intent);
            this.f25929d = v0.d(intent);
        }
    }
}
