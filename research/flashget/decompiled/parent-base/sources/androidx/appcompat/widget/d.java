package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ActivityChooserModel.java */
/* loaded from: classes.dex */
class d extends DataSetObservable {

    /* renamed from: n, reason: collision with root package name */
    static final boolean f1778n = false;

    /* renamed from: v, reason: collision with root package name */
    public static final int f1786v = 50;

    /* renamed from: w, reason: collision with root package name */
    private static final int f1787w = 5;

    /* renamed from: x, reason: collision with root package name */
    private static final float f1788x = 1.0f;

    /* renamed from: z, reason: collision with root package name */
    private static final int f1790z = -1;

    /* renamed from: d, reason: collision with root package name */
    final Context f1794d;

    /* renamed from: e, reason: collision with root package name */
    final String f1795e;

    /* renamed from: f, reason: collision with root package name */
    private Intent f1796f;

    /* renamed from: m, reason: collision with root package name */
    private f f1803m;

    /* renamed from: p, reason: collision with root package name */
    static final String f1780p = "historical-records";

    /* renamed from: q, reason: collision with root package name */
    static final String f1781q = "historical-record";

    /* renamed from: r, reason: collision with root package name */
    static final String f1782r = "activity";

    /* renamed from: s, reason: collision with root package name */
    static final String f1783s = "time";

    /* renamed from: t, reason: collision with root package name */
    static final String f1784t = "weight";

    /* renamed from: u, reason: collision with root package name */
    public static final String f1785u = "activity_choser_model_history.xml";

    /* renamed from: y, reason: collision with root package name */
    private static final String f1789y = ".xml";

    /* renamed from: o, reason: collision with root package name */
    static final String f1779o = "d";
    private static final Object A = new Object();
    private static final Map<String, d> B = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Object f1791a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final List<b> f1792b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<e> f1793c = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private c f1797g = new C0020d();

    /* renamed from: h, reason: collision with root package name */
    private int f1798h = 50;

    /* renamed from: i, reason: collision with root package name */
    boolean f1799i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1800j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1801k = true;

    /* renamed from: l, reason: collision with root package name */
    private boolean f1802l = false;

    /* compiled from: ActivityChooserModel.java */
    public interface a {
        void a(d dVar);
    }

    /* compiled from: ActivityChooserModel.java */
    public static final class b implements Comparable<b> {

        /* renamed from: b, reason: collision with root package name */
        public final ResolveInfo f1804b;

        /* renamed from: c, reason: collision with root package name */
        public float f1805c;

        public b(ResolveInfo resolveInfo) {
            this.f1804b = resolveInfo;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Float.floatToIntBits(bVar.f1805c) - Float.floatToIntBits(this.f1805c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && b.class == obj.getClass() && Float.floatToIntBits(this.f1805c) == Float.floatToIntBits(((b) obj).f1805c);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f1805c) + 31;
        }

        public String toString() {
            return "[resolveInfo:" + this.f1804b.toString() + "; weight:" + new BigDecimal(this.f1805c) + "]";
        }
    }

    /* compiled from: ActivityChooserModel.java */
    public interface c {
        void a(Intent intent, List<b> list, List<e> list2);
    }

    /* compiled from: ActivityChooserModel.java */
    /* renamed from: androidx.appcompat.widget.d$d, reason: collision with other inner class name */
    private static final class C0020d implements c {

        /* renamed from: b, reason: collision with root package name */
        private static final float f1806b = 0.95f;

        /* renamed from: a, reason: collision with root package name */
        private final Map<ComponentName, b> f1807a = new HashMap();

        C0020d() {
        }

        @Override // androidx.appcompat.widget.d.c
        public void a(Intent intent, List<b> list, List<e> list2) {
            Map<ComponentName, b> map = this.f1807a;
            map.clear();
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                b bVar = list.get(i4);
                bVar.f1805c = 0.0f;
                ActivityInfo activityInfo = bVar.f1804b.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), bVar);
            }
            float f4 = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                e eVar = list2.get(size2);
                b bVar2 = map.get(eVar.f1808a);
                if (bVar2 != null) {
                    bVar2.f1805c = (eVar.f1810c * f4) + bVar2.f1805c;
                    f4 *= f1806b;
                }
            }
            Collections.sort(list);
        }
    }

    /* compiled from: ActivityChooserModel.java */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final ComponentName f1808a;

        /* renamed from: b, reason: collision with root package name */
        public final long f1809b;

        /* renamed from: c, reason: collision with root package name */
        public final float f1810c;

        public e(String str, long j4, float f4) {
            this(ComponentName.unflattenFromString(str), j4, f4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            ComponentName componentName = this.f1808a;
            if (componentName == null) {
                if (eVar.f1808a != null) {
                    return false;
                }
            } else if (!componentName.equals(eVar.f1808a)) {
                return false;
            }
            return this.f1809b == eVar.f1809b && Float.floatToIntBits(this.f1810c) == Float.floatToIntBits(eVar.f1810c);
        }

        public int hashCode() {
            ComponentName componentName = this.f1808a;
            int hashCode = componentName == null ? 0 : componentName.hashCode();
            long j4 = this.f1809b;
            return Float.floatToIntBits(this.f1810c) + ((((hashCode + 31) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31);
        }

        public String toString() {
            return "[; activity:" + this.f1808a + "; time:" + this.f1809b + "; weight:" + new BigDecimal(this.f1810c) + "]";
        }

        public e(ComponentName componentName, long j4, float f4) {
            this.f1808a = componentName;
            this.f1809b = j4;
            this.f1810c = f4;
        }
    }

    /* compiled from: ActivityChooserModel.java */
    public interface f {
        boolean a(d dVar, Intent intent);
    }

    /* compiled from: ActivityChooserModel.java */
    private final class g extends AsyncTask<Object, Void, Void> {
        g() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
        
            if (r14 != null) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
        
            r14.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
        
            if (r14 == null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
        
            if (r14 == null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
        
            if (r14 == null) goto L27;
         */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Void doInBackground(java.lang.Object... r14) {
            /*
                r13 = this;
                java.lang.String r0 = "historical-record"
                java.lang.String r1 = "historical-records"
                r2 = 0
                r3 = r14[r2]
                java.util.List r3 = (java.util.List) r3
                r4 = 1
                r14 = r14[r4]
                java.lang.String r14 = (java.lang.String) r14
                r5 = 0
                androidx.appcompat.widget.d r6 = androidx.appcompat.widget.d.this     // Catch: java.io.FileNotFoundException -> L9d
                android.content.Context r6 = r6.f1794d     // Catch: java.io.FileNotFoundException -> L9d
                java.io.FileOutputStream r14 = r6.openFileOutput(r14, r2)     // Catch: java.io.FileNotFoundException -> L9d
                org.xmlpull.v1.XmlSerializer r6 = android.util.Xml.newSerializer()
                r6.setOutput(r14, r5)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                java.lang.String r7 = "UTF-8"
                java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.startDocument(r7, r8)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.startTag(r5, r1)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                int r7 = r3.size()     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r8 = r2
            L2d:
                if (r8 >= r7) goto L61
                java.lang.Object r9 = r3.remove(r2)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                androidx.appcompat.widget.d$e r9 = (androidx.appcompat.widget.d.e) r9     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.startTag(r5, r0)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                java.lang.String r10 = "activity"
                android.content.ComponentName r11 = r9.f1808a     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                java.lang.String r11 = r11.flattenToString()     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.attribute(r5, r10, r11)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                java.lang.String r10 = "time"
                long r11 = r9.f1809b     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.attribute(r5, r10, r11)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                java.lang.String r10 = "weight"
                float r9 = r9.f1810c     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.attribute(r5, r10, r9)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.endTag(r5, r0)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                int r8 = r8 + 1
                goto L2d
            L5f:
                r0 = move-exception
                goto L93
            L61:
                r6.endTag(r5, r1)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.endDocument()     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                androidx.appcompat.widget.d r0 = androidx.appcompat.widget.d.this
                r0.f1799i = r4
                if (r14 == 0) goto L92
            L6d:
                r14.close()     // Catch: java.io.IOException -> L92
                goto L92
            L71:
                java.lang.String r0 = androidx.appcompat.widget.d.f1779o     // Catch: java.lang.Throwable -> L5f
                androidx.appcompat.widget.d r0 = androidx.appcompat.widget.d.this     // Catch: java.lang.Throwable -> L5f
                java.lang.String r1 = r0.f1795e     // Catch: java.lang.Throwable -> L5f
                r0.f1799i = r4
                if (r14 == 0) goto L92
                goto L6d
            L7c:
                java.lang.String r0 = androidx.appcompat.widget.d.f1779o     // Catch: java.lang.Throwable -> L5f
                androidx.appcompat.widget.d r0 = androidx.appcompat.widget.d.this     // Catch: java.lang.Throwable -> L5f
                java.lang.String r1 = r0.f1795e     // Catch: java.lang.Throwable -> L5f
                r0.f1799i = r4
                if (r14 == 0) goto L92
                goto L6d
            L87:
                java.lang.String r0 = androidx.appcompat.widget.d.f1779o     // Catch: java.lang.Throwable -> L5f
                androidx.appcompat.widget.d r0 = androidx.appcompat.widget.d.this     // Catch: java.lang.Throwable -> L5f
                java.lang.String r1 = r0.f1795e     // Catch: java.lang.Throwable -> L5f
                r0.f1799i = r4
                if (r14 == 0) goto L92
                goto L6d
            L92:
                return r5
            L93:
                androidx.appcompat.widget.d r1 = androidx.appcompat.widget.d.this
                r1.f1799i = r4
                if (r14 == 0) goto L9c
                r14.close()     // Catch: java.io.IOException -> L9c
            L9c:
                throw r0
            L9d:
                java.lang.String r14 = androidx.appcompat.widget.d.f1779o
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d.g.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    private d(Context context, String str) {
        this.f1794d = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(".xml")) {
            this.f1795e = str;
        } else {
            this.f1795e = str.concat(".xml");
        }
    }

    private boolean a(e eVar) {
        boolean add = this.f1793c.add(eVar);
        if (add) {
            this.f1801k = true;
            n();
            m();
            v();
            notifyChanged();
        }
        return add;
    }

    private void c() {
        boolean l4 = l() | o();
        n();
        if (l4) {
            v();
            notifyChanged();
        }
    }

    public static d d(Context context, String str) {
        d dVar;
        synchronized (A) {
            try {
                Map<String, d> map = B;
                dVar = map.get(str);
                if (dVar == null) {
                    dVar = new d(context, str);
                    map.put(str, dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    private boolean l() {
        if (!this.f1802l || this.f1796f == null) {
            return false;
        }
        this.f1802l = false;
        this.f1792b.clear();
        List<ResolveInfo> queryIntentActivities = this.f1794d.getPackageManager().queryIntentActivities(this.f1796f, 0);
        int size = queryIntentActivities.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f1792b.add(new b(queryIntentActivities.get(i4)));
        }
        return true;
    }

    private void m() {
        if (!this.f1800j) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.f1801k) {
            this.f1801k = false;
            if (TextUtils.isEmpty(this.f1795e)) {
                return;
            }
            new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f1793c), this.f1795e);
        }
    }

    private void n() {
        int size = this.f1793c.size() - this.f1798h;
        if (size <= 0) {
            return;
        }
        this.f1801k = true;
        for (int i4 = 0; i4 < size; i4++) {
            this.f1793c.remove(0);
        }
    }

    private boolean o() {
        if (!this.f1799i || !this.f1801k || TextUtils.isEmpty(this.f1795e)) {
            return false;
        }
        this.f1799i = false;
        this.f1800j = true;
        p();
        return true;
    }

    private void p() {
        XmlPullParser newPullParser;
        try {
            FileInputStream openFileInput = this.f1794d.openFileInput(this.f1795e);
            try {
                newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, "UTF-8");
                for (int i4 = 0; i4 != 1 && i4 != 2; i4 = newPullParser.next()) {
                }
            } catch (IOException unused) {
                if (openFileInput == null) {
                    return;
                }
            } catch (XmlPullParserException unused2) {
                if (openFileInput == null) {
                    return;
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
            if (!"historical-records".equals(newPullParser.getName())) {
                throw new XmlPullParserException("Share records file does not start with historical-records tag.");
            }
            List<e> list = this.f1793c;
            list.clear();
            while (true) {
                int next = newPullParser.next();
                if (next == 1) {
                    if (openFileInput == null) {
                        return;
                    }
                } else if (next != 3 && next != 4) {
                    if (!"historical-record".equals(newPullParser.getName())) {
                        throw new XmlPullParserException("Share records file not well-formed.");
                    }
                    list.add(new e(newPullParser.getAttributeValue(null, "activity"), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                }
            }
            openFileInput.close();
        } catch (FileNotFoundException | IOException unused4) {
        }
    }

    private boolean v() {
        if (this.f1797g == null || this.f1796f == null || this.f1792b.isEmpty() || this.f1793c.isEmpty()) {
            return false;
        }
        this.f1797g.a(this.f1796f, this.f1792b, Collections.unmodifiableList(this.f1793c));
        return true;
    }

    public Intent b(int i4) {
        synchronized (this.f1791a) {
            try {
                if (this.f1796f == null) {
                    return null;
                }
                c();
                ActivityInfo activityInfo = this.f1792b.get(i4).f1804b.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                Intent intent = new Intent(this.f1796f);
                intent.setComponent(componentName);
                if (this.f1803m != null) {
                    if (this.f1803m.a(this, new Intent(intent))) {
                        return null;
                    }
                }
                a(new e(componentName, System.currentTimeMillis(), 1.0f));
                return intent;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ResolveInfo e(int i4) {
        ResolveInfo resolveInfo;
        synchronized (this.f1791a) {
            c();
            resolveInfo = this.f1792b.get(i4).f1804b;
        }
        return resolveInfo;
    }

    public int f() {
        int size;
        synchronized (this.f1791a) {
            c();
            size = this.f1792b.size();
        }
        return size;
    }

    public int g(ResolveInfo resolveInfo) {
        synchronized (this.f1791a) {
            try {
                c();
                List<b> list = this.f1792b;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (list.get(i4).f1804b == resolveInfo) {
                        return i4;
                    }
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ResolveInfo h() {
        synchronized (this.f1791a) {
            try {
                c();
                if (this.f1792b.isEmpty()) {
                    return null;
                }
                return this.f1792b.get(0).f1804b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int i() {
        int i4;
        synchronized (this.f1791a) {
            i4 = this.f1798h;
        }
        return i4;
    }

    public int j() {
        int size;
        synchronized (this.f1791a) {
            c();
            size = this.f1793c.size();
        }
        return size;
    }

    public Intent k() {
        Intent intent;
        synchronized (this.f1791a) {
            intent = this.f1796f;
        }
        return intent;
    }

    public void q(c cVar) {
        synchronized (this.f1791a) {
            try {
                if (this.f1797g == cVar) {
                    return;
                }
                this.f1797g = cVar;
                if (v()) {
                    notifyChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r(int i4) {
        synchronized (this.f1791a) {
            try {
                c();
                b bVar = this.f1792b.get(i4);
                b bVar2 = this.f1792b.get(0);
                float f4 = bVar2 != null ? (bVar2.f1805c - bVar.f1805c) + 5.0f : 1.0f;
                ActivityInfo activityInfo = bVar.f1804b.activityInfo;
                a(new e(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f4));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(int i4) {
        synchronized (this.f1791a) {
            try {
                if (this.f1798h == i4) {
                    return;
                }
                this.f1798h = i4;
                n();
                if (v()) {
                    notifyChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void t(Intent intent) {
        synchronized (this.f1791a) {
            try {
                if (this.f1796f == intent) {
                    return;
                }
                this.f1796f = intent;
                this.f1802l = true;
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void u(f fVar) {
        synchronized (this.f1791a) {
            this.f1803m = fVar;
        }
    }
}
