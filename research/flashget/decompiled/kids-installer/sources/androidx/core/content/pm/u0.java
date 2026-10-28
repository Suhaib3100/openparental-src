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
import androidx.core.app.y3;
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
/* loaded from: classes.dex */
public class u0 {
    private static final String C = "extraPersonCount";
    private static final String D = "extraPerson_";
    private static final String E = "extraLocusId";
    private static final String F = "extraLongLived";
    private static final String G = "extraSliceUri";
    public static final int H = 1;
    int A;
    int B;

    /* renamed from: a, reason: collision with root package name */
    Context f4565a;

    /* renamed from: b, reason: collision with root package name */
    String f4566b;

    /* renamed from: c, reason: collision with root package name */
    String f4567c;

    /* renamed from: d, reason: collision with root package name */
    Intent[] f4568d;

    /* renamed from: e, reason: collision with root package name */
    ComponentName f4569e;

    /* renamed from: f, reason: collision with root package name */
    CharSequence f4570f;

    /* renamed from: g, reason: collision with root package name */
    CharSequence f4571g;

    /* renamed from: h, reason: collision with root package name */
    CharSequence f4572h;

    /* renamed from: i, reason: collision with root package name */
    IconCompat f4573i;

    /* renamed from: j, reason: collision with root package name */
    boolean f4574j;

    /* renamed from: k, reason: collision with root package name */
    y3[] f4575k;

    /* renamed from: l, reason: collision with root package name */
    Set<String> f4576l;

    /* renamed from: m, reason: collision with root package name */
    @androidx.annotation.q0
    androidx.core.content.k f4577m;

    /* renamed from: n, reason: collision with root package name */
    boolean f4578n;

    /* renamed from: o, reason: collision with root package name */
    int f4579o;

    /* renamed from: p, reason: collision with root package name */
    PersistableBundle f4580p;

    /* renamed from: q, reason: collision with root package name */
    Bundle f4581q;

    /* renamed from: r, reason: collision with root package name */
    long f4582r;

    /* renamed from: s, reason: collision with root package name */
    UserHandle f4583s;

    /* renamed from: t, reason: collision with root package name */
    boolean f4584t;

    /* renamed from: u, reason: collision with root package name */
    boolean f4585u;

    /* renamed from: v, reason: collision with root package name */
    boolean f4586v;

    /* renamed from: w, reason: collision with root package name */
    boolean f4587w;

    /* renamed from: x, reason: collision with root package name */
    boolean f4588x;

    /* renamed from: y, reason: collision with root package name */
    boolean f4589y = true;

    /* renamed from: z, reason: collision with root package name */
    boolean f4590z;

    /* compiled from: ShortcutInfoCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    u0() {
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.x0(22)
    private PersistableBundle b() {
        if (this.f4580p == null) {
            this.f4580p = new PersistableBundle();
        }
        y3[] y3VarArr = this.f4575k;
        if (y3VarArr != null && y3VarArr.length > 0) {
            this.f4580p.putInt("extraPersonCount", y3VarArr.length);
            int i5 = 0;
            while (i5 < this.f4575k.length) {
                PersistableBundle persistableBundle = this.f4580p;
                StringBuilder sb = new StringBuilder("extraPerson_");
                int i6 = i5 + 1;
                sb.append(i6);
                persistableBundle.putPersistableBundle(sb.toString(), this.f4575k[i5].n());
                i5 = i6;
            }
        }
        androidx.core.content.k kVar = this.f4577m;
        if (kVar != null) {
            this.f4580p.putString("extraLocusId", kVar.a());
        }
        this.f4580p.putBoolean("extraLongLived", this.f4578n);
        return this.f4580p;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.x0(25)
    static List<u0> c(@androidx.annotation.o0 Context context, @androidx.annotation.o0 List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ShortcutInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(context, it.next()).c());
        }
        return arrayList;
    }

    @androidx.annotation.q0
    @androidx.annotation.x0(25)
    static androidx.core.content.k p(@androidx.annotation.o0 ShortcutInfo shortcutInfo) {
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
        return androidx.core.content.k.d(locusId2);
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.x0(25)
    private static androidx.core.content.k q(@androidx.annotation.q0 PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString("extraLocusId")) == null) {
            return null;
        }
        return new androidx.core.content.k(string);
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
    static y3[] u(@androidx.annotation.o0 PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey("extraPersonCount")) {
            return null;
        }
        int i5 = persistableBundle.getInt("extraPersonCount");
        y3[] y3VarArr = new y3[i5];
        int i6 = 0;
        while (i6 < i5) {
            StringBuilder sb = new StringBuilder("extraPerson_");
            int i7 = i6 + 1;
            sb.append(i7);
            y3VarArr[i6] = y3.c(persistableBundle.getPersistableBundle(sb.toString()));
            i6 = i7;
        }
        return y3VarArr;
    }

    public boolean A() {
        return this.f4584t;
    }

    public boolean B() {
        return this.f4587w;
    }

    public boolean C() {
        return this.f4585u;
    }

    public boolean D() {
        return this.f4589y;
    }

    public boolean E(int i5) {
        return (i5 & this.B) != 0;
    }

    public boolean F() {
        return this.f4588x;
    }

    public boolean G() {
        return this.f4586v;
    }

    @androidx.annotation.x0(25)
    public ShortcutInfo H() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f4565a, this.f4566b).setShortLabel(this.f4570f).setIntents(this.f4568d);
        IconCompat iconCompat = this.f4573i;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.G(this.f4565a));
        }
        if (!TextUtils.isEmpty(this.f4571g)) {
            intents.setLongLabel(this.f4571g);
        }
        if (!TextUtils.isEmpty(this.f4572h)) {
            intents.setDisabledMessage(this.f4572h);
        }
        ComponentName componentName = this.f4569e;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f4576l;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f4579o);
        PersistableBundle persistableBundle = this.f4580p;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            y3[] y3VarArr = this.f4575k;
            if (y3VarArr != null && y3VarArr.length > 0) {
                int length = y3VarArr.length;
                Person[] personArr = new Person[length];
                for (int i5 = 0; i5 < length; i5++) {
                    personArr[i5] = this.f4575k[i5].k();
                }
                intents.setPersons(personArr);
            }
            androidx.core.content.k kVar = this.f4577m;
            if (kVar != null) {
                intents.setLocusId(kVar.c());
            }
            intents.setLongLived(this.f4578n);
        } else {
            intents.setExtras(b());
        }
        return intents.build();
    }

    Intent a(Intent intent) {
        intent.putExtra("android.intent.extra.shortcut.INTENT", this.f4568d[r0.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.f4570f.toString());
        if (this.f4573i != null) {
            Drawable drawable = null;
            if (this.f4574j) {
                PackageManager packageManager = this.f4565a.getPackageManager();
                ComponentName componentName = this.f4569e;
                if (componentName != null) {
                    try {
                        drawable = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (drawable == null) {
                    drawable = this.f4565a.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.f4573i.c(intent, drawable, this.f4565a);
        }
        return intent;
    }

    @androidx.annotation.q0
    public ComponentName d() {
        return this.f4569e;
    }

    @androidx.annotation.q0
    public Set<String> e() {
        return this.f4576l;
    }

    @androidx.annotation.q0
    public CharSequence f() {
        return this.f4572h;
    }

    public int g() {
        return this.A;
    }

    public int h() {
        return this.B;
    }

    @androidx.annotation.q0
    public PersistableBundle i() {
        return this.f4580p;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public IconCompat j() {
        return this.f4573i;
    }

    @androidx.annotation.o0
    public String k() {
        return this.f4566b;
    }

    @androidx.annotation.o0
    public Intent l() {
        return this.f4568d[r0.length - 1];
    }

    @androidx.annotation.o0
    public Intent[] m() {
        Intent[] intentArr = this.f4568d;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    public long n() {
        return this.f4582r;
    }

    @androidx.annotation.q0
    public androidx.core.content.k o() {
        return this.f4577m;
    }

    @androidx.annotation.q0
    public CharSequence r() {
        return this.f4571g;
    }

    @androidx.annotation.o0
    public String t() {
        return this.f4567c;
    }

    public int v() {
        return this.f4579o;
    }

    @androidx.annotation.o0
    public CharSequence w() {
        return this.f4570f;
    }

    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public Bundle x() {
        return this.f4581q;
    }

    @androidx.annotation.q0
    public UserHandle y() {
        return this.f4583s;
    }

    public boolean z() {
        return this.f4590z;
    }

    /* compiled from: ShortcutInfoCompat.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final u0 f4591a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f4592b;

        /* renamed from: c, reason: collision with root package name */
        private Set<String> f4593c;

        /* renamed from: d, reason: collision with root package name */
        private Map<String, Map<String, List<String>>> f4594d;

        /* renamed from: e, reason: collision with root package name */
        private Uri f4595e;

        public a(@androidx.annotation.o0 Context context, @androidx.annotation.o0 String str) {
            u0 u0Var = new u0();
            this.f4591a = u0Var;
            u0Var.f4565a = context;
            u0Var.f4566b = str;
        }

        @androidx.annotation.o0
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public a a(@androidx.annotation.o0 String str) {
            if (this.f4593c == null) {
                this.f4593c = new HashSet();
            }
            this.f4593c.add(str);
            return this;
        }

        @androidx.annotation.o0
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public a b(@androidx.annotation.o0 String str, @androidx.annotation.o0 String str2, @androidx.annotation.o0 List<String> list) {
            a(str);
            if (!list.isEmpty()) {
                if (this.f4594d == null) {
                    this.f4594d = new HashMap();
                }
                if (this.f4594d.get(str) == null) {
                    this.f4594d.put(str, new HashMap());
                }
                this.f4594d.get(str).put(str2, list);
            }
            return this;
        }

        @androidx.annotation.o0
        public u0 c() {
            if (TextUtils.isEmpty(this.f4591a.f4570f)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            u0 u0Var = this.f4591a;
            Intent[] intentArr = u0Var.f4568d;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.f4592b) {
                if (u0Var.f4577m == null) {
                    u0Var.f4577m = new androidx.core.content.k(u0Var.f4566b);
                }
                this.f4591a.f4578n = true;
            }
            if (this.f4593c != null) {
                u0 u0Var2 = this.f4591a;
                if (u0Var2.f4576l == null) {
                    u0Var2.f4576l = new HashSet();
                }
                this.f4591a.f4576l.addAll(this.f4593c);
            }
            if (this.f4594d != null) {
                u0 u0Var3 = this.f4591a;
                if (u0Var3.f4580p == null) {
                    u0Var3.f4580p = new PersistableBundle();
                }
                for (String str : this.f4594d.keySet()) {
                    Map<String, List<String>> map = this.f4594d.get(str);
                    this.f4591a.f4580p.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                    for (String str2 : map.keySet()) {
                        List<String> list = map.get(str2);
                        this.f4591a.f4580p.putStringArray(str + "/" + str2, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                    }
                }
            }
            if (this.f4595e != null) {
                u0 u0Var4 = this.f4591a;
                if (u0Var4.f4580p == null) {
                    u0Var4.f4580p = new PersistableBundle();
                }
                this.f4591a.f4580p.putString("extraSliceUri", androidx.core.net.e.a(this.f4595e));
            }
            return this.f4591a;
        }

        @androidx.annotation.o0
        public a d(@androidx.annotation.o0 ComponentName componentName) {
            this.f4591a.f4569e = componentName;
            return this;
        }

        @androidx.annotation.o0
        public a e() {
            this.f4591a.f4574j = true;
            return this;
        }

        @androidx.annotation.o0
        public a f(@androidx.annotation.o0 Set<String> set) {
            this.f4591a.f4576l = set;
            return this;
        }

        @androidx.annotation.o0
        public a g(@androidx.annotation.o0 CharSequence charSequence) {
            this.f4591a.f4572h = charSequence;
            return this;
        }

        @androidx.annotation.o0
        public a h(int i5) {
            this.f4591a.B = i5;
            return this;
        }

        @androidx.annotation.o0
        public a i(@androidx.annotation.o0 PersistableBundle persistableBundle) {
            this.f4591a.f4580p = persistableBundle;
            return this;
        }

        @androidx.annotation.o0
        public a j(IconCompat iconCompat) {
            this.f4591a.f4573i = iconCompat;
            return this;
        }

        @androidx.annotation.o0
        public a k(@androidx.annotation.o0 Intent intent) {
            return l(new Intent[]{intent});
        }

        @androidx.annotation.o0
        public a l(@androidx.annotation.o0 Intent[] intentArr) {
            this.f4591a.f4568d = intentArr;
            return this;
        }

        @androidx.annotation.o0
        public a m() {
            this.f4592b = true;
            return this;
        }

        @androidx.annotation.o0
        public a n(@androidx.annotation.q0 androidx.core.content.k kVar) {
            this.f4591a.f4577m = kVar;
            return this;
        }

        @androidx.annotation.o0
        public a o(@androidx.annotation.o0 CharSequence charSequence) {
            this.f4591a.f4571g = charSequence;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public a p() {
            this.f4591a.f4578n = true;
            return this;
        }

        @androidx.annotation.o0
        public a q(boolean z5) {
            this.f4591a.f4578n = z5;
            return this;
        }

        @androidx.annotation.o0
        public a r(@androidx.annotation.o0 y3 y3Var) {
            return s(new y3[]{y3Var});
        }

        @androidx.annotation.o0
        public a s(@androidx.annotation.o0 y3[] y3VarArr) {
            this.f4591a.f4575k = y3VarArr;
            return this;
        }

        @androidx.annotation.o0
        public a t(int i5) {
            this.f4591a.f4579o = i5;
            return this;
        }

        @androidx.annotation.o0
        public a u(@androidx.annotation.o0 CharSequence charSequence) {
            this.f4591a.f4570f = charSequence;
            return this;
        }

        @androidx.annotation.o0
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public a v(@androidx.annotation.o0 Uri uri) {
            this.f4595e = uri;
            return this;
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.o0
        public a w(@androidx.annotation.o0 Bundle bundle) {
            u0 u0Var = this.f4591a;
            bundle.getClass();
            u0Var.f4581q = bundle;
            return this;
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public a(@androidx.annotation.o0 u0 u0Var) {
            u0 u0Var2 = new u0();
            this.f4591a = u0Var2;
            u0Var2.f4565a = u0Var.f4565a;
            u0Var2.f4566b = u0Var.f4566b;
            u0Var2.f4567c = u0Var.f4567c;
            Intent[] intentArr = u0Var.f4568d;
            u0Var2.f4568d = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            u0Var2.f4569e = u0Var.f4569e;
            u0Var2.f4570f = u0Var.f4570f;
            u0Var2.f4571g = u0Var.f4571g;
            u0Var2.f4572h = u0Var.f4572h;
            u0Var2.A = u0Var.A;
            u0Var2.f4573i = u0Var.f4573i;
            u0Var2.f4574j = u0Var.f4574j;
            u0Var2.f4583s = u0Var.f4583s;
            u0Var2.f4582r = u0Var.f4582r;
            u0Var2.f4584t = u0Var.f4584t;
            u0Var2.f4585u = u0Var.f4585u;
            u0Var2.f4586v = u0Var.f4586v;
            u0Var2.f4587w = u0Var.f4587w;
            u0Var2.f4588x = u0Var.f4588x;
            u0Var2.f4589y = u0Var.f4589y;
            u0Var2.f4577m = u0Var.f4577m;
            u0Var2.f4578n = u0Var.f4578n;
            u0Var2.f4590z = u0Var.f4590z;
            u0Var2.f4579o = u0Var.f4579o;
            y3[] y3VarArr = u0Var.f4575k;
            if (y3VarArr != null) {
                u0Var2.f4575k = (y3[]) Arrays.copyOf(y3VarArr, y3VarArr.length);
            }
            if (u0Var.f4576l != null) {
                u0Var2.f4576l = new HashSet(u0Var.f4576l);
            }
            PersistableBundle persistableBundle = u0Var.f4580p;
            if (persistableBundle != null) {
                u0Var2.f4580p = persistableBundle;
            }
            u0Var2.B = u0Var.B;
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.x0(25)
        public a(@androidx.annotation.o0 Context context, @androidx.annotation.o0 ShortcutInfo shortcutInfo) {
            String id;
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
            u0 u0Var = new u0();
            this.f4591a = u0Var;
            u0Var.f4565a = context;
            id = shortcutInfo.getId();
            u0Var.f4566b = id;
            str = shortcutInfo.getPackage();
            u0Var.f4567c = str;
            intents = shortcutInfo.getIntents();
            u0Var.f4568d = (Intent[]) Arrays.copyOf(intents, intents.length);
            activity = shortcutInfo.getActivity();
            u0Var.f4569e = activity;
            shortLabel = shortcutInfo.getShortLabel();
            u0Var.f4570f = shortLabel;
            longLabel = shortcutInfo.getLongLabel();
            u0Var.f4571g = longLabel;
            disabledMessage = shortcutInfo.getDisabledMessage();
            u0Var.f4572h = disabledMessage;
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 28) {
                disabledReason = shortcutInfo.getDisabledReason();
                u0Var.A = disabledReason;
            } else {
                isEnabled = shortcutInfo.isEnabled();
                u0Var.A = isEnabled ? 0 : 3;
            }
            categories = shortcutInfo.getCategories();
            u0Var.f4576l = categories;
            extras = shortcutInfo.getExtras();
            u0Var.f4575k = u0.u(extras);
            userHandle = shortcutInfo.getUserHandle();
            u0Var.f4583s = userHandle;
            lastChangedTimestamp = shortcutInfo.getLastChangedTimestamp();
            u0Var.f4582r = lastChangedTimestamp;
            if (i5 >= 30) {
                isCached = shortcutInfo.isCached();
                u0Var.f4584t = isCached;
            }
            isDynamic = shortcutInfo.isDynamic();
            u0Var.f4585u = isDynamic;
            isPinned = shortcutInfo.isPinned();
            u0Var.f4586v = isPinned;
            isDeclaredInManifest = shortcutInfo.isDeclaredInManifest();
            u0Var.f4587w = isDeclaredInManifest;
            isImmutable = shortcutInfo.isImmutable();
            u0Var.f4588x = isImmutable;
            isEnabled2 = shortcutInfo.isEnabled();
            u0Var.f4589y = isEnabled2;
            hasKeyFieldsOnly = shortcutInfo.hasKeyFieldsOnly();
            u0Var.f4590z = hasKeyFieldsOnly;
            u0Var.f4577m = u0.p(shortcutInfo);
            rank = shortcutInfo.getRank();
            u0Var.f4579o = rank;
            extras2 = shortcutInfo.getExtras();
            u0Var.f4580p = extras2;
        }
    }
}
