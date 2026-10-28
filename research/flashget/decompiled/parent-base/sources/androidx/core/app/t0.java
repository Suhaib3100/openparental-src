package androidx.core.app;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.c1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: RemoteInput.java */
/* loaded from: classes3.dex */
public final class t0 {

    /* renamed from: h, reason: collision with root package name */
    public static final String f25879h = "android.remoteinput.results";

    /* renamed from: i, reason: collision with root package name */
    public static final String f25880i = "android.remoteinput.resultsData";

    /* renamed from: j, reason: collision with root package name */
    private static final String f25881j = "android.remoteinput.dataTypeResultsData";

    /* renamed from: k, reason: collision with root package name */
    private static final String f25882k = "android.remoteinput.resultsSource";

    /* renamed from: l, reason: collision with root package name */
    public static final int f25883l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f25884m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f25885n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f25886o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f25887p = 2;

    /* renamed from: a, reason: collision with root package name */
    private final String f25888a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f25889b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence[] f25890c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f25891d;

    /* renamed from: e, reason: collision with root package name */
    private final int f25892e;

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f25893f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<String> f25894g;

    /* compiled from: RemoteInput.java */
    @androidx.annotation.x0(20)
    static class a {
        private a() {
        }

        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(t0 t0Var) {
            Set<String> g4;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(t0Var.o()).setLabel(t0Var.n()).setChoices(t0Var.h()).setAllowFreeFormInput(t0Var.f()).addExtras(t0Var.m());
            if (Build.VERSION.SDK_INT >= 26 && (g4 = t0Var.g()) != null) {
                Iterator<String> it = g4.iterator();
                while (it.hasNext()) {
                    b.d(addExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                d.b(addExtras, t0Var.k());
            }
            return addExtras.build();
        }

        static t0 c(Object obj) {
            Set<String> b5;
            RemoteInput remoteInput = (RemoteInput) obj;
            e a5 = new e(remoteInput.getResultKey()).h(remoteInput.getLabel()).f(remoteInput.getChoices()).e(remoteInput.getAllowFreeFormInput()).a(remoteInput.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (b5 = b.b(remoteInput)) != null) {
                Iterator<String> it = b5.iterator();
                while (it.hasNext()) {
                    a5.d(it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                a5.g(d.a(remoteInput));
            }
            return a5.b();
        }

        static Bundle d(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* compiled from: RemoteInput.java */
    @androidx.annotation.x0(26)
    static class b {
        private b() {
        }

        static void a(t0 t0Var, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(a.b(t0Var), intent, map);
        }

        static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z4) {
            return builder.setAllowDataType(str, z4);
        }
    }

    /* compiled from: RemoteInput.java */
    @androidx.annotation.x0(28)
    static class c {
        private c() {
        }

        static int a(Intent intent) {
            return RemoteInput.getResultsSource(intent);
        }

        static void b(Intent intent, int i4) {
            RemoteInput.setResultsSource(intent, i4);
        }
    }

    /* compiled from: RemoteInput.java */
    @androidx.annotation.x0(29)
    static class d {
        private d() {
        }

        static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        static RemoteInput.Builder b(RemoteInput.Builder builder, int i4) {
            return builder.setEditChoicesBeforeSending(i4);
        }
    }

    /* compiled from: RemoteInput.java */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final String f25895a;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f25898d;

        /* renamed from: e, reason: collision with root package name */
        private CharSequence[] f25899e;

        /* renamed from: b, reason: collision with root package name */
        private final Set<String> f25896b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Bundle f25897c = new Bundle();

        /* renamed from: f, reason: collision with root package name */
        private boolean f25900f = true;

        /* renamed from: g, reason: collision with root package name */
        private int f25901g = 0;

        public e(@androidx.annotation.o0 String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f25895a = str;
        }

        @androidx.annotation.o0
        public e a(@androidx.annotation.o0 Bundle bundle) {
            if (bundle != null) {
                this.f25897c.putAll(bundle);
            }
            return this;
        }

        @androidx.annotation.o0
        public t0 b() {
            return new t0(this.f25895a, this.f25898d, this.f25899e, this.f25900f, this.f25901g, this.f25897c, this.f25896b);
        }

        @androidx.annotation.o0
        public Bundle c() {
            return this.f25897c;
        }

        @androidx.annotation.o0
        public e d(@androidx.annotation.o0 String str, boolean z4) {
            if (z4) {
                this.f25896b.add(str);
            } else {
                this.f25896b.remove(str);
            }
            return this;
        }

        @androidx.annotation.o0
        public e e(boolean z4) {
            this.f25900f = z4;
            return this;
        }

        @androidx.annotation.o0
        public e f(@androidx.annotation.q0 CharSequence[] charSequenceArr) {
            this.f25899e = charSequenceArr;
            return this;
        }

        @androidx.annotation.o0
        public e g(int i4) {
            this.f25901g = i4;
            return this;
        }

        @androidx.annotation.o0
        public e h(@androidx.annotation.q0 CharSequence charSequence) {
            this.f25898d = charSequence;
            return this;
        }
    }

    /* compiled from: RemoteInput.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    /* compiled from: RemoteInput.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    t0(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z4, int i4, Bundle bundle, Set<String> set) {
        this.f25888a = str;
        this.f25889b = charSequence;
        this.f25890c = charSequenceArr;
        this.f25891d = z4;
        this.f25892e = i4;
        this.f25893f = bundle;
        this.f25894g = set;
        if (i4 == 2 && !z4) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static void a(@androidx.annotation.o0 t0 t0Var, @androidx.annotation.o0 Intent intent, @androidx.annotation.o0 Map<String, Uri> map) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(t0Var, intent, map);
            return;
        }
        Intent i4 = i(intent);
        if (i4 == null) {
            i4 = new Intent();
        }
        for (Map.Entry<String, Uri> entry : map.entrySet()) {
            String key = entry.getKey();
            Uri value = entry.getValue();
            if (key != null) {
                Bundle bundleExtra = i4.getBundleExtra(l(key));
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString(t0Var.f25888a, value.toString());
                i4.putExtra(l(key), bundleExtra);
            }
        }
        intent.setClipData(ClipData.newIntent("android.remoteinput.results", i4));
    }

    public static void b(@androidx.annotation.o0 t0[] t0VarArr, @androidx.annotation.o0 Intent intent, @androidx.annotation.o0 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            RemoteInput.addResultsToIntent(d(t0VarArr), intent, bundle);
            return;
        }
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        int q4 = q(intent);
        if (resultsFromIntent != null) {
            resultsFromIntent.putAll(bundle);
            bundle = resultsFromIntent;
        }
        for (t0 t0Var : t0VarArr) {
            Map<String, Uri> j4 = j(intent, t0Var.f25888a);
            RemoteInput.addResultsToIntent(d(new t0[]{t0Var}), intent, bundle);
            if (j4 != null) {
                a(t0Var, intent, j4);
            }
        }
        s(intent, q4);
    }

    @androidx.annotation.x0(20)
    static RemoteInput c(t0 t0Var) {
        return a.b(t0Var);
    }

    @androidx.annotation.x0(20)
    static RemoteInput[] d(t0[] t0VarArr) {
        if (t0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[t0VarArr.length];
        for (int i4 = 0; i4 < t0VarArr.length; i4++) {
            remoteInputArr[i4] = a.b(t0VarArr[i4]);
        }
        return remoteInputArr;
    }

    @androidx.annotation.x0(20)
    static t0 e(RemoteInput remoteInput) {
        return a.c(remoteInput);
    }

    private static Intent i(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals("android.remoteinput.results")) {
            return clipData.getItemAt(0).getIntent();
        }
        return null;
    }

    @androidx.annotation.q0
    public static Map<String, Uri> j(@androidx.annotation.o0 Intent intent, @androidx.annotation.o0 String str) {
        String string;
        if (Build.VERSION.SDK_INT >= 26) {
            return b.c(intent, str);
        }
        Intent i4 = i(intent);
        if (i4 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : i4.getExtras().keySet()) {
            if (str2.startsWith("android.remoteinput.dataTypeResultsData")) {
                String substring = str2.substring(39);
                if (!substring.isEmpty() && (string = i4.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
                    hashMap.put(substring, Uri.parse(string));
                }
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    private static String l(String str) {
        return androidx.constraintlayout.core.motion.key.c.a("android.remoteinput.dataTypeResultsData", str);
    }

    @androidx.annotation.q0
    public static Bundle p(@androidx.annotation.o0 Intent intent) {
        return RemoteInput.getResultsFromIntent(intent);
    }

    public static int q(@androidx.annotation.o0 Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(intent);
        }
        Intent i4 = i(intent);
        if (i4 == null) {
            return 0;
        }
        return i4.getExtras().getInt("android.remoteinput.resultsSource", 0);
    }

    public static void s(@androidx.annotation.o0 Intent intent, int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            c.b(intent, i4);
            return;
        }
        Intent i5 = i(intent);
        if (i5 == null) {
            i5 = new Intent();
        }
        i5.putExtra("android.remoteinput.resultsSource", i4);
        intent.setClipData(ClipData.newIntent("android.remoteinput.results", i5));
    }

    public boolean f() {
        return this.f25891d;
    }

    @androidx.annotation.q0
    public Set<String> g() {
        return this.f25894g;
    }

    @androidx.annotation.q0
    public CharSequence[] h() {
        return this.f25890c;
    }

    public int k() {
        return this.f25892e;
    }

    @androidx.annotation.o0
    public Bundle m() {
        return this.f25893f;
    }

    @androidx.annotation.q0
    public CharSequence n() {
        return this.f25889b;
    }

    @androidx.annotation.o0
    public String o() {
        return this.f25888a;
    }

    public boolean r() {
        CharSequence[] charSequenceArr;
        Set<String> set;
        return (this.f25891d || ((charSequenceArr = this.f25890c) != null && charSequenceArr.length != 0) || (set = this.f25894g) == null || set.isEmpty()) ? false : true;
    }
}
