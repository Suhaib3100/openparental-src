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
/* loaded from: classes.dex */
public final class v4 {

    /* renamed from: h, reason: collision with root package name */
    public static final String f4236h = "android.remoteinput.results";

    /* renamed from: i, reason: collision with root package name */
    public static final String f4237i = "android.remoteinput.resultsData";

    /* renamed from: j, reason: collision with root package name */
    private static final String f4238j = "android.remoteinput.dataTypeResultsData";

    /* renamed from: k, reason: collision with root package name */
    private static final String f4239k = "android.remoteinput.resultsSource";

    /* renamed from: l, reason: collision with root package name */
    public static final int f4240l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f4241m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f4242n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f4243o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f4244p = 2;

    /* renamed from: a, reason: collision with root package name */
    private final String f4245a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f4246b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence[] f4247c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4248d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4249e;

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f4250f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<String> f4251g;

    /* compiled from: RemoteInput.java */
    @androidx.annotation.x0(16)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static ClipData a(Intent intent) {
            return intent.getClipData();
        }

        @androidx.annotation.u
        static void b(Intent intent, ClipData clipData) {
            intent.setClipData(clipData);
        }
    }

    /* compiled from: RemoteInput.java */
    @androidx.annotation.x0(20)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(v4 v4Var) {
            Set<String> g5;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(v4Var.o()).setLabel(v4Var.n()).setChoices(v4Var.h()).setAllowFreeFormInput(v4Var.f()).addExtras(v4Var.m());
            if (Build.VERSION.SDK_INT >= 26 && (g5 = v4Var.g()) != null) {
                Iterator<String> it = g5.iterator();
                while (it.hasNext()) {
                    c.d(addExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                e.b(addExtras, v4Var.k());
            }
            return addExtras.build();
        }

        static v4 c(Object obj) {
            Set<String> b6;
            RemoteInput remoteInput = (RemoteInput) obj;
            f a6 = new f(remoteInput.getResultKey()).h(remoteInput.getLabel()).f(remoteInput.getChoices()).e(remoteInput.getAllowFreeFormInput()).a(remoteInput.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (b6 = c.b(remoteInput)) != null) {
                Iterator<String> it = b6.iterator();
                while (it.hasNext()) {
                    a6.d(it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                a6.g(e.a(remoteInput));
            }
            return a6.b();
        }

        @androidx.annotation.u
        static Bundle d(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* compiled from: RemoteInput.java */
    @androidx.annotation.x0(26)
    static class c {
        private c() {
        }

        @androidx.annotation.u
        static void a(v4 v4Var, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(b.b(v4Var), intent, map);
        }

        @androidx.annotation.u
        static Set<String> b(Object obj) {
            Set<String> allowedDataTypes;
            allowedDataTypes = ((RemoteInput) obj).getAllowedDataTypes();
            return allowedDataTypes;
        }

        @androidx.annotation.u
        static Map<String, Uri> c(Intent intent, String str) {
            Map<String, Uri> dataResultsFromIntent;
            dataResultsFromIntent = RemoteInput.getDataResultsFromIntent(intent, str);
            return dataResultsFromIntent;
        }

        @androidx.annotation.u
        static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z5) {
            RemoteInput.Builder allowDataType;
            allowDataType = builder.setAllowDataType(str, z5);
            return allowDataType;
        }
    }

    /* compiled from: RemoteInput.java */
    @androidx.annotation.x0(28)
    static class d {
        private d() {
        }

        @androidx.annotation.u
        static int a(Intent intent) {
            int resultsSource;
            resultsSource = RemoteInput.getResultsSource(intent);
            return resultsSource;
        }

        @androidx.annotation.u
        static void b(Intent intent, int i5) {
            RemoteInput.setResultsSource(intent, i5);
        }
    }

    /* compiled from: RemoteInput.java */
    @androidx.annotation.x0(29)
    static class e {
        private e() {
        }

        @androidx.annotation.u
        static int a(Object obj) {
            int editChoicesBeforeSending;
            editChoicesBeforeSending = ((RemoteInput) obj).getEditChoicesBeforeSending();
            return editChoicesBeforeSending;
        }

        @androidx.annotation.u
        static RemoteInput.Builder b(RemoteInput.Builder builder, int i5) {
            RemoteInput.Builder editChoicesBeforeSending;
            editChoicesBeforeSending = builder.setEditChoicesBeforeSending(i5);
            return editChoicesBeforeSending;
        }
    }

    /* compiled from: RemoteInput.java */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final String f4252a;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f4255d;

        /* renamed from: e, reason: collision with root package name */
        private CharSequence[] f4256e;

        /* renamed from: b, reason: collision with root package name */
        private final Set<String> f4253b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Bundle f4254c = new Bundle();

        /* renamed from: f, reason: collision with root package name */
        private boolean f4257f = true;

        /* renamed from: g, reason: collision with root package name */
        private int f4258g = 0;

        public f(@androidx.annotation.o0 String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f4252a = str;
        }

        @androidx.annotation.o0
        public f a(@androidx.annotation.o0 Bundle bundle) {
            if (bundle != null) {
                this.f4254c.putAll(bundle);
            }
            return this;
        }

        @androidx.annotation.o0
        public v4 b() {
            return new v4(this.f4252a, this.f4255d, this.f4256e, this.f4257f, this.f4258g, this.f4254c, this.f4253b);
        }

        @androidx.annotation.o0
        public Bundle c() {
            return this.f4254c;
        }

        @androidx.annotation.o0
        public f d(@androidx.annotation.o0 String str, boolean z5) {
            if (z5) {
                this.f4253b.add(str);
            } else {
                this.f4253b.remove(str);
            }
            return this;
        }

        @androidx.annotation.o0
        public f e(boolean z5) {
            this.f4257f = z5;
            return this;
        }

        @androidx.annotation.o0
        public f f(@androidx.annotation.q0 CharSequence[] charSequenceArr) {
            this.f4256e = charSequenceArr;
            return this;
        }

        @androidx.annotation.o0
        public f g(int i5) {
            this.f4258g = i5;
            return this;
        }

        @androidx.annotation.o0
        public f h(@androidx.annotation.q0 CharSequence charSequence) {
            this.f4255d = charSequence;
            return this;
        }
    }

    /* compiled from: RemoteInput.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    /* compiled from: RemoteInput.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface h {
    }

    v4(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z5, int i5, Bundle bundle, Set<String> set) {
        this.f4245a = str;
        this.f4246b = charSequence;
        this.f4247c = charSequenceArr;
        this.f4248d = z5;
        this.f4249e = i5;
        this.f4250f = bundle;
        this.f4251g = set;
        if (i5 == 2 && !z5) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static void a(@androidx.annotation.o0 v4 v4Var, @androidx.annotation.o0 Intent intent, @androidx.annotation.o0 Map<String, Uri> map) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.a(v4Var, intent, map);
            return;
        }
        Intent i5 = i(intent);
        if (i5 == null) {
            i5 = new Intent();
        }
        for (Map.Entry<String, Uri> entry : map.entrySet()) {
            String key = entry.getKey();
            Uri value = entry.getValue();
            if (key != null) {
                Bundle bundleExtra = i5.getBundleExtra(l(key));
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString(v4Var.f4245a, value.toString());
                i5.putExtra(l(key), bundleExtra);
            }
        }
        a.b(intent, ClipData.newIntent("android.remoteinput.results", i5));
    }

    public static void b(@androidx.annotation.o0 v4[] v4VarArr, @androidx.annotation.o0 Intent intent, @androidx.annotation.o0 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(d(v4VarArr), intent, bundle);
            return;
        }
        Bundle d6 = b.d(intent);
        int q5 = q(intent);
        if (d6 != null) {
            d6.putAll(bundle);
            bundle = d6;
        }
        for (v4 v4Var : v4VarArr) {
            Map<String, Uri> j5 = j(intent, v4Var.f4245a);
            b.a(d(new v4[]{v4Var}), intent, bundle);
            if (j5 != null) {
                a(v4Var, intent, j5);
            }
        }
        s(intent, q5);
    }

    @androidx.annotation.x0(20)
    static RemoteInput c(v4 v4Var) {
        return b.b(v4Var);
    }

    @androidx.annotation.x0(20)
    static RemoteInput[] d(v4[] v4VarArr) {
        if (v4VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[v4VarArr.length];
        for (int i5 = 0; i5 < v4VarArr.length; i5++) {
            remoteInputArr[i5] = b.b(v4VarArr[i5]);
        }
        return remoteInputArr;
    }

    @androidx.annotation.x0(20)
    static v4 e(RemoteInput remoteInput) {
        return b.c(remoteInput);
    }

    @androidx.annotation.x0(16)
    private static Intent i(Intent intent) {
        ClipData a6 = a.a(intent);
        if (a6 == null) {
            return null;
        }
        ClipDescription description = a6.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals("android.remoteinput.results")) {
            return a6.getItemAt(0).getIntent();
        }
        return null;
    }

    @androidx.annotation.q0
    public static Map<String, Uri> j(@androidx.annotation.o0 Intent intent, @androidx.annotation.o0 String str) {
        String string;
        if (Build.VERSION.SDK_INT >= 26) {
            return c.c(intent, str);
        }
        Intent i5 = i(intent);
        if (i5 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : i5.getExtras().keySet()) {
            if (str2.startsWith("android.remoteinput.dataTypeResultsData")) {
                String substring = str2.substring(39);
                if (!substring.isEmpty() && (string = i5.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
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
        return androidx.constraintlayout.motion.widget.g.a("android.remoteinput.dataTypeResultsData", str);
    }

    @androidx.annotation.q0
    public static Bundle p(@androidx.annotation.o0 Intent intent) {
        return b.d(intent);
    }

    public static int q(@androidx.annotation.o0 Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.a(intent);
        }
        Intent i5 = i(intent);
        if (i5 == null) {
            return 0;
        }
        return i5.getExtras().getInt("android.remoteinput.resultsSource", 0);
    }

    public static void s(@androidx.annotation.o0 Intent intent, int i5) {
        if (Build.VERSION.SDK_INT >= 28) {
            d.b(intent, i5);
            return;
        }
        Intent i6 = i(intent);
        if (i6 == null) {
            i6 = new Intent();
        }
        i6.putExtra("android.remoteinput.resultsSource", i5);
        a.b(intent, ClipData.newIntent("android.remoteinput.results", i6));
    }

    public boolean f() {
        return this.f4248d;
    }

    @androidx.annotation.q0
    public Set<String> g() {
        return this.f4251g;
    }

    @androidx.annotation.q0
    public CharSequence[] h() {
        return this.f4247c;
    }

    public int k() {
        return this.f4249e;
    }

    @androidx.annotation.o0
    public Bundle m() {
        return this.f4250f;
    }

    @androidx.annotation.q0
    public CharSequence n() {
        return this.f4246b;
    }

    @androidx.annotation.o0
    public String o() {
        return this.f4245a;
    }

    public boolean r() {
        CharSequence[] charSequenceArr;
        Set<String> set;
        return (this.f4248d || ((charSequenceArr = this.f4247c) != null && charSequenceArr.length != 0) || (set = this.f4251g) == null || set.isEmpty()) ? false : true;
    }
}
