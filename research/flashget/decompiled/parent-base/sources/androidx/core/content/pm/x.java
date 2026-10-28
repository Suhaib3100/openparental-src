package androidx.core.content.pm;

import android.annotation.SuppressLint;
import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.annotation.c1;
import androidx.compose.material3.z3;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: ShortcutInfoCompat.java */
/* loaded from: classes3.dex */
public class x {
    private static final String C = "extraPersonCount";
    private static final String D = "extraPerson_";
    private static final String E = "extraLocusId";
    private static final String F = "extraLongLived";
    private static final String G = "extraSliceUri";
    public static final int H = 1;
    int A;
    int B;

    /* renamed from: a, reason: collision with root package name */
    Context f26057a;

    /* renamed from: b, reason: collision with root package name */
    String f26058b;

    /* renamed from: c, reason: collision with root package name */
    String f26059c;

    /* renamed from: d, reason: collision with root package name */
    Intent[] f26060d;

    /* renamed from: e, reason: collision with root package name */
    ComponentName f26061e;

    /* renamed from: f, reason: collision with root package name */
    CharSequence f26062f;

    /* renamed from: g, reason: collision with root package name */
    CharSequence f26063g;

    /* renamed from: h, reason: collision with root package name */
    CharSequence f26064h;

    /* renamed from: i, reason: collision with root package name */
    IconCompat f26065i;

    /* renamed from: j, reason: collision with root package name */
    boolean f26066j;

    /* renamed from: k, reason: collision with root package name */
    androidx.core.app.r0[] f26067k;

    /* renamed from: l, reason: collision with root package name */
    Set<String> f26068l;

    /* renamed from: m, reason: collision with root package name */
    @androidx.annotation.q0
    androidx.core.content.a0 f26069m;

    /* renamed from: n, reason: collision with root package name */
    boolean f26070n;

    /* renamed from: o, reason: collision with root package name */
    int f26071o;

    /* renamed from: p, reason: collision with root package name */
    PersistableBundle f26072p;

    /* renamed from: q, reason: collision with root package name */
    Bundle f26073q;

    /* renamed from: r, reason: collision with root package name */
    long f26074r;

    /* renamed from: s, reason: collision with root package name */
    UserHandle f26075s;

    /* renamed from: t, reason: collision with root package name */
    boolean f26076t;

    /* renamed from: u, reason: collision with root package name */
    boolean f26077u;

    /* renamed from: v, reason: collision with root package name */
    boolean f26078v;

    /* renamed from: w, reason: collision with root package name */
    boolean f26079w;

    /* renamed from: x, reason: collision with root package name */
    boolean f26080x;

    /* renamed from: y, reason: collision with root package name */
    boolean f26081y = true;

    /* renamed from: z, reason: collision with root package name */
    boolean f26082z;

    /* compiled from: ShortcutInfoCompat.java */
    @androidx.annotation.x0(33)
    private static class a {
        private a() {
        }

        static void a(@androidx.annotation.o0 ShortcutInfo.Builder builder, int i4) {
            builder.setExcludedFromSurfaces(i4);
        }
    }

    /* compiled from: ShortcutInfoCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    x() {
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.x0(22)
    private PersistableBundle b() {
        if (this.f26072p == null) {
            this.f26072p = new PersistableBundle();
        }
        androidx.core.app.r0[] r0VarArr = this.f26067k;
        if (r0VarArr != null && r0VarArr.length > 0) {
            this.f26072p.putInt("extraPersonCount", r0VarArr.length);
            int i4 = 0;
            while (i4 < this.f26067k.length) {
                PersistableBundle persistableBundle = this.f26072p;
                StringBuilder sb = new StringBuilder("extraPerson_");
                int i5 = i4 + 1;
                sb.append(i5);
                persistableBundle.putPersistableBundle(sb.toString(), this.f26067k[i4].n());
                i4 = i5;
            }
        }
        androidx.core.content.a0 a0Var = this.f26069m;
        if (a0Var != null) {
            this.f26072p.putString("extraLocusId", a0Var.a());
        }
        this.f26072p.putBoolean("extraLongLived", this.f26070n);
        return this.f26072p;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.x0(25)
    static List<x> c(@androidx.annotation.o0 Context context, @androidx.annotation.o0 List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ShortcutInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, j.a(it.next())).c());
        }
        return arrayList;
    }

    @androidx.annotation.q0
    @androidx.annotation.x0(25)
    static androidx.core.content.a0 p(@androidx.annotation.o0 ShortcutInfo shortcutInfo) {
        PersistableBundle extras;
        LocusId locusId;
        LocusId locusId2;
        if (Build.VERSION.SDK_INT < 29) {
            extras = shortcutInfo.getExtras();
            return q(extras);
        }
        locusId = shortcutInfo.getLocusId();
        if (locusId == null) {
            return null;
        }
        locusId2 = shortcutInfo.getLocusId();
        return androidx.core.content.a0.d(locusId2);
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.x0(25)
    private static androidx.core.content.a0 q(@androidx.annotation.q0 PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString("extraLocusId")) == null) {
            return null;
        }
        return new androidx.core.content.a0(string);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.m1
    @androidx.annotation.x0(25)
    static boolean s(@androidx.annotation.q0 PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey("extraLongLived")) {
            return false;
        }
        return persistableBundle.getBoolean("extraLongLived");
    }

    @androidx.annotation.m1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.x0(25)
    static androidx.core.app.r0[] u(@androidx.annotation.o0 PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey("extraPersonCount")) {
            return null;
        }
        int i4 = persistableBundle.getInt("extraPersonCount");
        androidx.core.app.r0[] r0VarArr = new androidx.core.app.r0[i4];
        int i5 = 0;
        while (i5 < i4) {
            StringBuilder sb = new StringBuilder("extraPerson_");
            int i6 = i5 + 1;
            sb.append(i6);
            r0VarArr[i5] = androidx.core.app.r0.c(persistableBundle.getPersistableBundle(sb.toString()));
            i5 = i6;
        }
        return r0VarArr;
    }

    public boolean A() {
        return this.f26076t;
    }

    public boolean B() {
        return this.f26079w;
    }

    public boolean C() {
        return this.f26077u;
    }

    public boolean D() {
        return this.f26081y;
    }

    public boolean E(int i4) {
        return (i4 & this.B) != 0;
    }

    public boolean F() {
        return this.f26080x;
    }

    public boolean G() {
        return this.f26078v;
    }

    @androidx.annotation.x0(25)
    public ShortcutInfo H() {
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder intents;
        ShortcutInfo build;
        n.a();
        shortLabel = m.a(this.f26057a, this.f26058b).setShortLabel(this.f26062f);
        intents = shortLabel.setIntents(this.f26060d);
        IconCompat iconCompat = this.f26065i;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.K(this.f26057a));
        }
        if (!TextUtils.isEmpty(this.f26063g)) {
            intents.setLongLabel(this.f26063g);
        }
        if (!TextUtils.isEmpty(this.f26064h)) {
            intents.setDisabledMessage(this.f26064h);
        }
        ComponentName componentName = this.f26061e;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f26068l;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f26071o);
        PersistableBundle persistableBundle = this.f26072p;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            androidx.core.app.r0[] r0VarArr = this.f26067k;
            if (r0VarArr != null && r0VarArr.length > 0) {
                int length = r0VarArr.length;
                Person[] personArr = new Person[length];
                for (int i4 = 0; i4 < length; i4++) {
                    personArr[i4] = this.f26067k[i4].k();
                }
                intents.setPersons(personArr);
            }
            androidx.core.content.a0 a0Var = this.f26069m;
            if (a0Var != null) {
                intents.setLocusId(a0Var.c());
            }
            intents.setLongLived(this.f26070n);
        } else {
            intents.setExtras(b());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.a(intents, this.B);
        }
        build = intents.build();
        return build;
    }

    Intent a(Intent intent) {
        intent.putExtra("android.intent.extra.shortcut.INTENT", this.f26060d[r0.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.f26062f.toString());
        if (this.f26065i != null) {
            Drawable drawable = null;
            if (this.f26066j) {
                PackageManager packageManager = this.f26057a.getPackageManager();
                ComponentName componentName = this.f26061e;
                if (componentName != null) {
                    try {
                        drawable = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (drawable == null) {
                    drawable = this.f26057a.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.f26065i.h(intent, drawable, this.f26057a);
        }
        return intent;
    }

    @androidx.annotation.q0
    public ComponentName d() {
        return this.f26061e;
    }

    @androidx.annotation.q0
    public Set<String> e() {
        return this.f26068l;
    }

    @androidx.annotation.q0
    public CharSequence f() {
        return this.f26064h;
    }

    public int g() {
        return this.A;
    }

    public int h() {
        return this.B;
    }

    @androidx.annotation.q0
    public PersistableBundle i() {
        return this.f26072p;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public IconCompat j() {
        return this.f26065i;
    }

    @androidx.annotation.o0
    public String k() {
        return this.f26058b;
    }

    @androidx.annotation.o0
    public Intent l() {
        return this.f26060d[r0.length - 1];
    }

    @androidx.annotation.o0
    public Intent[] m() {
        Intent[] intentArr = this.f26060d;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    public long n() {
        return this.f26074r;
    }

    @androidx.annotation.q0
    public androidx.core.content.a0 o() {
        return this.f26069m;
    }

    @androidx.annotation.q0
    public CharSequence r() {
        return this.f26063g;
    }

    @androidx.annotation.o0
    public String t() {
        return this.f26059c;
    }

    public int v() {
        return this.f26071o;
    }

    @androidx.annotation.o0
    public CharSequence w() {
        return this.f26062f;
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public Bundle x() {
        return this.f26073q;
    }

    @androidx.annotation.q0
    public UserHandle y() {
        return this.f26075s;
    }

    public boolean z() {
        return this.f26082z;
    }

    /* compiled from: ShortcutInfoCompat.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final x f26083a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f26084b;

        /* renamed from: c, reason: collision with root package name */
        private Set<String> f26085c;

        /* renamed from: d, reason: collision with root package name */
        private Map<String, Map<String, List<String>>> f26086d;

        /* renamed from: e, reason: collision with root package name */
        private Uri f26087e;

        public b(@androidx.annotation.o0 Context context, @androidx.annotation.o0 String str) {
            x xVar = new x();
            this.f26083a = xVar;
            xVar.f26057a = context;
            xVar.f26058b = str;
        }

        @androidx.annotation.o0
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public b a(@androidx.annotation.o0 String str) {
            if (this.f26085c == null) {
                this.f26085c = new HashSet();
            }
            this.f26085c.add(str);
            return this;
        }

        @androidx.annotation.o0
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public b b(@androidx.annotation.o0 String str, @androidx.annotation.o0 String str2, @androidx.annotation.o0 List<String> list) {
            a(str);
            if (!list.isEmpty()) {
                if (this.f26086d == null) {
                    this.f26086d = new HashMap();
                }
                if (this.f26086d.get(str) == null) {
                    this.f26086d.put(str, new HashMap());
                }
                this.f26086d.get(str).put(str2, list);
            }
            return this;
        }

        @androidx.annotation.o0
        public x c() {
            if (TextUtils.isEmpty(this.f26083a.f26062f)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            x xVar = this.f26083a;
            Intent[] intentArr = xVar.f26060d;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.f26084b) {
                if (xVar.f26069m == null) {
                    xVar.f26069m = new androidx.core.content.a0(xVar.f26058b);
                }
                this.f26083a.f26070n = true;
            }
            if (this.f26085c != null) {
                x xVar2 = this.f26083a;
                if (xVar2.f26068l == null) {
                    xVar2.f26068l = new HashSet();
                }
                this.f26083a.f26068l.addAll(this.f26085c);
            }
            if (this.f26086d != null) {
                x xVar3 = this.f26083a;
                if (xVar3.f26072p == null) {
                    xVar3.f26072p = new PersistableBundle();
                }
                for (String str : this.f26086d.keySet()) {
                    Map<String, List<String>> map = this.f26086d.get(str);
                    this.f26083a.f26072p.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                    for (String str2 : map.keySet()) {
                        List<String> list = map.get(str2);
                        this.f26083a.f26072p.putStringArray(z3.a(str, "/", str2), list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                    }
                }
            }
            if (this.f26087e != null) {
                x xVar4 = this.f26083a;
                if (xVar4.f26072p == null) {
                    xVar4.f26072p = new PersistableBundle();
                }
                this.f26083a.f26072p.putString("extraSliceUri", androidx.core.net.e.a(this.f26087e));
            }
            return this.f26083a;
        }

        @androidx.annotation.o0
        public b d(@androidx.annotation.o0 ComponentName componentName) {
            this.f26083a.f26061e = componentName;
            return this;
        }

        @androidx.annotation.o0
        public b e() {
            this.f26083a.f26066j = true;
            return this;
        }

        @androidx.annotation.o0
        public b f(@androidx.annotation.o0 Set<String> set) {
            androidx.collection.d dVar = new androidx.collection.d();
            dVar.addAll(set);
            this.f26083a.f26068l = dVar;
            return this;
        }

        @androidx.annotation.o0
        public b g(@androidx.annotation.o0 CharSequence charSequence) {
            this.f26083a.f26064h = charSequence;
            return this;
        }

        @androidx.annotation.o0
        public b h(int i4) {
            this.f26083a.B = i4;
            return this;
        }

        @androidx.annotation.o0
        public b i(@androidx.annotation.o0 PersistableBundle persistableBundle) {
            this.f26083a.f26072p = persistableBundle;
            return this;
        }

        @androidx.annotation.o0
        public b j(IconCompat iconCompat) {
            this.f26083a.f26065i = iconCompat;
            return this;
        }

        @androidx.annotation.o0
        public b k(@androidx.annotation.o0 Intent intent) {
            return l(new Intent[]{intent});
        }

        @androidx.annotation.o0
        public b l(@androidx.annotation.o0 Intent[] intentArr) {
            this.f26083a.f26060d = intentArr;
            return this;
        }

        @androidx.annotation.o0
        public b m() {
            this.f26084b = true;
            return this;
        }

        @androidx.annotation.o0
        public b n(@androidx.annotation.q0 androidx.core.content.a0 a0Var) {
            this.f26083a.f26069m = a0Var;
            return this;
        }

        @androidx.annotation.o0
        public b o(@androidx.annotation.o0 CharSequence charSequence) {
            this.f26083a.f26063g = charSequence;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public b p() {
            this.f26083a.f26070n = true;
            return this;
        }

        @androidx.annotation.o0
        public b q(boolean z4) {
            this.f26083a.f26070n = z4;
            return this;
        }

        @androidx.annotation.o0
        public b r(@androidx.annotation.o0 androidx.core.app.r0 r0Var) {
            return s(new androidx.core.app.r0[]{r0Var});
        }

        @androidx.annotation.o0
        public b s(@androidx.annotation.o0 androidx.core.app.r0[] r0VarArr) {
            this.f26083a.f26067k = r0VarArr;
            return this;
        }

        @androidx.annotation.o0
        public b t(int i4) {
            this.f26083a.f26071o = i4;
            return this;
        }

        @androidx.annotation.o0
        public b u(@androidx.annotation.o0 CharSequence charSequence) {
            this.f26083a.f26062f = charSequence;
            return this;
        }

        @androidx.annotation.o0
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public b v(@androidx.annotation.o0 Uri uri) {
            this.f26087e = uri;
            return this;
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.o0
        public b w(@androidx.annotation.o0 Bundle bundle) {
            x xVar = this.f26083a;
            bundle.getClass();
            xVar.f26073q = bundle;
            return this;
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public b(@androidx.annotation.o0 x xVar) {
            x xVar2 = new x();
            this.f26083a = xVar2;
            xVar2.f26057a = xVar.f26057a;
            xVar2.f26058b = xVar.f26058b;
            xVar2.f26059c = xVar.f26059c;
            Intent[] intentArr = xVar.f26060d;
            xVar2.f26060d = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            xVar2.f26061e = xVar.f26061e;
            xVar2.f26062f = xVar.f26062f;
            xVar2.f26063g = xVar.f26063g;
            xVar2.f26064h = xVar.f26064h;
            xVar2.A = xVar.A;
            xVar2.f26065i = xVar.f26065i;
            xVar2.f26066j = xVar.f26066j;
            xVar2.f26075s = xVar.f26075s;
            xVar2.f26074r = xVar.f26074r;
            xVar2.f26076t = xVar.f26076t;
            xVar2.f26077u = xVar.f26077u;
            xVar2.f26078v = xVar.f26078v;
            xVar2.f26079w = xVar.f26079w;
            xVar2.f26080x = xVar.f26080x;
            xVar2.f26081y = xVar.f26081y;
            xVar2.f26069m = xVar.f26069m;
            xVar2.f26070n = xVar.f26070n;
            xVar2.f26082z = xVar.f26082z;
            xVar2.f26071o = xVar.f26071o;
            androidx.core.app.r0[] r0VarArr = xVar.f26067k;
            if (r0VarArr != null) {
                xVar2.f26067k = (androidx.core.app.r0[]) Arrays.copyOf(r0VarArr, r0VarArr.length);
            }
            if (xVar.f26068l != null) {
                xVar2.f26068l = new HashSet(xVar.f26068l);
            }
            PersistableBundle persistableBundle = xVar.f26072p;
            if (persistableBundle != null) {
                xVar2.f26072p = persistableBundle;
            }
            xVar2.B = xVar.B;
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.x0(25)
        public b(@androidx.annotation.o0 Context context, @androidx.annotation.o0 ShortcutInfo shortcutInfo) {
            String id2;
            String str;
            Intent[] intents;
            ComponentName activity;
            CharSequence shortLabel;
            CharSequence longLabel;
            CharSequence disabledMessage;
            boolean isEnabled;
            Set<String> categories;
            PersistableBundle extras;
            UserHandle userHandle;
            long lastChangedTimestamp;
            boolean isDynamic;
            boolean isPinned;
            boolean isDeclaredInManifest;
            boolean isImmutable;
            boolean isEnabled2;
            boolean hasKeyFieldsOnly;
            int rank;
            PersistableBundle extras2;
            boolean isCached;
            int disabledReason;
            x xVar = new x();
            this.f26083a = xVar;
            xVar.f26057a = context;
            id2 = shortcutInfo.getId();
            xVar.f26058b = id2;
            str = shortcutInfo.getPackage();
            xVar.f26059c = str;
            intents = shortcutInfo.getIntents();
            xVar.f26060d = (Intent[]) Arrays.copyOf(intents, intents.length);
            activity = shortcutInfo.getActivity();
            xVar.f26061e = activity;
            shortLabel = shortcutInfo.getShortLabel();
            xVar.f26062f = shortLabel;
            longLabel = shortcutInfo.getLongLabel();
            xVar.f26063g = longLabel;
            disabledMessage = shortcutInfo.getDisabledMessage();
            xVar.f26064h = disabledMessage;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 28) {
                disabledReason = shortcutInfo.getDisabledReason();
                xVar.A = disabledReason;
            } else {
                isEnabled = shortcutInfo.isEnabled();
                xVar.A = isEnabled ? 0 : 3;
            }
            categories = shortcutInfo.getCategories();
            xVar.f26068l = categories;
            extras = shortcutInfo.getExtras();
            xVar.f26067k = x.u(extras);
            userHandle = shortcutInfo.getUserHandle();
            xVar.f26075s = userHandle;
            lastChangedTimestamp = shortcutInfo.getLastChangedTimestamp();
            xVar.f26074r = lastChangedTimestamp;
            if (i4 >= 30) {
                isCached = shortcutInfo.isCached();
                xVar.f26076t = isCached;
            }
            isDynamic = shortcutInfo.isDynamic();
            xVar.f26077u = isDynamic;
            isPinned = shortcutInfo.isPinned();
            xVar.f26078v = isPinned;
            isDeclaredInManifest = shortcutInfo.isDeclaredInManifest();
            xVar.f26079w = isDeclaredInManifest;
            isImmutable = shortcutInfo.isImmutable();
            xVar.f26080x = isImmutable;
            isEnabled2 = shortcutInfo.isEnabled();
            xVar.f26081y = isEnabled2;
            hasKeyFieldsOnly = shortcutInfo.hasKeyFieldsOnly();
            xVar.f26082z = hasKeyFieldsOnly;
            xVar.f26069m = x.p(shortcutInfo);
            rank = shortcutInfo.getRank();
            xVar.f26071o = rank;
            extras2 = shortcutInfo.getExtras();
            xVar.f26072p = extras2;
        }
    }
}
