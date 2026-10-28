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
class c extends DataSetObservable {

    /* renamed from: n, reason: collision with root package name */
    static final boolean f1131n = false;

    /* renamed from: v, reason: collision with root package name */
    public static final int f1139v = 50;

    /* renamed from: w, reason: collision with root package name */
    private static final int f1140w = 5;

    /* renamed from: x, reason: collision with root package name */
    private static final float f1141x = 1.0f;

    /* renamed from: z, reason: collision with root package name */
    private static final int f1143z = -1;

    /* renamed from: d, reason: collision with root package name */
    final Context f1147d;

    /* renamed from: e, reason: collision with root package name */
    final String f1148e;

    /* renamed from: f, reason: collision with root package name */
    private Intent f1149f;

    /* renamed from: m, reason: collision with root package name */
    private f f1156m;

    /* renamed from: p, reason: collision with root package name */
    static final String f1133p = "historical-records";

    /* renamed from: q, reason: collision with root package name */
    static final String f1134q = "historical-record";

    /* renamed from: r, reason: collision with root package name */
    static final String f1135r = "activity";

    /* renamed from: s, reason: collision with root package name */
    static final String f1136s = "time";

    /* renamed from: t, reason: collision with root package name */
    static final String f1137t = "weight";

    /* renamed from: u, reason: collision with root package name */
    public static final String f1138u = "activity_choser_model_history.xml";

    /* renamed from: y, reason: collision with root package name */
    private static final String f1142y = ".xml";

    /* renamed from: o, reason: collision with root package name */
    static final String f1132o = "c";
    private static final Object A = new Object();
    private static final Map<String, c> B = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Object f1144a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final List<b> f1145b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<e> f1146c = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC0011c f1150g = new d();

    /* renamed from: h, reason: collision with root package name */
    private int f1151h = 50;

    /* renamed from: i, reason: collision with root package name */
    boolean f1152i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1153j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1154k = true;

    /* renamed from: l, reason: collision with root package name */
    private boolean f1155l = false;

    /* compiled from: ActivityChooserModel.java */
    public interface a {
        void a(c cVar);
    }

    /* compiled from: ActivityChooserModel.java */
    public static final class b implements Comparable<b> {

        /* renamed from: o, reason: collision with root package name */
        public final ResolveInfo f1157o;

        /* renamed from: p, reason: collision with root package name */
        public float f1158p;

        public b(ResolveInfo resolveInfo) {
            this.f1157o = resolveInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && b.class == obj.getClass() && Float.floatToIntBits(this.f1158p) == Float.floatToIntBits(((b) obj).f1158p);
        }

        @Override // java.lang.Comparable
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Float.floatToIntBits(bVar.f1158p) - Float.floatToIntBits(this.f1158p);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f1158p) + 31;
        }

        public String toString() {
            return "[resolveInfo:" + this.f1157o.toString() + "; weight:" + new BigDecimal(this.f1158p) + "]";
        }
    }

    /* compiled from: ActivityChooserModel.java */
    /* renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    public interface InterfaceC0011c {
        void a(Intent intent, List<b> list, List<e> list2);
    }

    /* compiled from: ActivityChooserModel.java */
    /* loaded from: classes2.dex */
    private static final class d implements InterfaceC0011c {

        /* renamed from: b, reason: collision with root package name */
        private static final float f1159b = 0.95f;

        /* renamed from: a, reason: collision with root package name */
        private final Map<ComponentName, b> f1160a = new HashMap();

        d() {
        }

        @Override // androidx.appcompat.widget.c.InterfaceC0011c
        public void a(Intent intent, List<b> list, List<e> list2) {
            Map<ComponentName, b> map = this.f1160a;
            map.clear();
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                b bVar = list.get(i5);
                bVar.f1158p = 0.0f;
                ActivityInfo activityInfo = bVar.f1157o.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), bVar);
            }
            float f6 = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                e eVar = list2.get(size2);
                b bVar2 = map.get(eVar.f1161a);
                if (bVar2 != null) {
                    bVar2.f1158p = (eVar.f1163c * f6) + bVar2.f1158p;
                    f6 *= f1159b;
                }
            }
            Collections.sort(list);
        }
    }

    /* compiled from: ActivityChooserModel.java */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final ComponentName f1161a;

        /* renamed from: b, reason: collision with root package name */
        public final long f1162b;

        /* renamed from: c, reason: collision with root package name */
        public final float f1163c;

        public e(String str, long j5, float f6) {
            this(ComponentName.unflattenFromString(str), j5, f6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            ComponentName componentName = this.f1161a;
            if (componentName == null) {
                if (eVar.f1161a != null) {
                    return false;
                }
            } else if (!componentName.equals(eVar.f1161a)) {
                return false;
            }
            return this.f1162b == eVar.f1162b && Float.floatToIntBits(this.f1163c) == Float.floatToIntBits(eVar.f1163c);
        }

        public int hashCode() {
            ComponentName componentName = this.f1161a;
            int hashCode = componentName == null ? 0 : componentName.hashCode();
            long j5 = this.f1162b;
            return Float.floatToIntBits(this.f1163c) + ((((hashCode + 31) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31);
        }

        public String toString() {
            return "[; activity:" + this.f1161a + "; time:" + this.f1162b + "; weight:" + new BigDecimal(this.f1163c) + "]";
        }

        public e(ComponentName componentName, long j5, float f6) {
            this.f1161a = componentName;
            this.f1162b = j5;
            this.f1163c = f6;
        }
    }

    /* compiled from: ActivityChooserModel.java */
    public interface f {
        boolean a(c cVar, Intent intent);
    }

    /* compiled from: ActivityChooserModel.java */
    private final class g extends AsyncTask<Object, Void, Void> {
        g() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
        
            r14.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
        
            if (r14 == null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
        
            if (r14 == null) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
        
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
                androidx.appcompat.widget.c r6 = androidx.appcompat.widget.c.this     // Catch: java.io.FileNotFoundException -> L9d
                android.content.Context r6 = r6.f1147d     // Catch: java.io.FileNotFoundException -> L9d
                java.io.FileOutputStream r14 = r6.openFileOutput(r14, r2)     // Catch: java.io.FileNotFoundException -> L9d
                org.xmlpull.v1.XmlSerializer r6 = android.util.Xml.newSerializer()
                r6.setOutput(r14, r5)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                java.lang.String r7 = "UTF-8"
                java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.startDocument(r7, r8)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.startTag(r5, r1)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                int r7 = r3.size()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r8 = r2
            L2d:
                if (r8 >= r7) goto L5f
                java.lang.Object r9 = r3.remove(r2)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                androidx.appcompat.widget.c$e r9 = (androidx.appcompat.widget.c.e) r9     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.startTag(r5, r0)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                java.lang.String r10 = "activity"
                android.content.ComponentName r11 = r9.f1161a     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                java.lang.String r11 = r11.flattenToString()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.attribute(r5, r10, r11)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                java.lang.String r10 = "time"
                long r11 = r9.f1162b     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.attribute(r5, r10, r11)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                java.lang.String r10 = "weight"
                float r9 = r9.f1163c     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.attribute(r5, r10, r9)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.endTag(r5, r0)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                int r8 = r8 + 1
                goto L2d
            L5f:
                r6.endTag(r5, r1)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                r6.endDocument()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71 java.lang.IllegalStateException -> L7c java.lang.IllegalArgumentException -> L87
                androidx.appcompat.widget.c r0 = androidx.appcompat.widget.c.this
                r0.f1152i = r4
                if (r14 == 0) goto L92
            L6b:
                r14.close()     // Catch: java.io.IOException -> L92
                goto L92
            L6f:
                r0 = move-exception
                goto L93
            L71:
                java.lang.String r0 = androidx.appcompat.widget.c.f1132o     // Catch: java.lang.Throwable -> L6f
                androidx.appcompat.widget.c r0 = androidx.appcompat.widget.c.this     // Catch: java.lang.Throwable -> L6f
                java.lang.String r1 = r0.f1148e     // Catch: java.lang.Throwable -> L6f
                r0.f1152i = r4
                if (r14 == 0) goto L92
                goto L6b
            L7c:
                java.lang.String r0 = androidx.appcompat.widget.c.f1132o     // Catch: java.lang.Throwable -> L6f
                androidx.appcompat.widget.c r0 = androidx.appcompat.widget.c.this     // Catch: java.lang.Throwable -> L6f
                java.lang.String r1 = r0.f1148e     // Catch: java.lang.Throwable -> L6f
                r0.f1152i = r4
                if (r14 == 0) goto L92
                goto L6b
            L87:
                java.lang.String r0 = androidx.appcompat.widget.c.f1132o     // Catch: java.lang.Throwable -> L6f
                androidx.appcompat.widget.c r0 = androidx.appcompat.widget.c.this     // Catch: java.lang.Throwable -> L6f
                java.lang.String r1 = r0.f1148e     // Catch: java.lang.Throwable -> L6f
                r0.f1152i = r4
                if (r14 == 0) goto L92
                goto L6b
            L92:
                return r5
            L93:
                androidx.appcompat.widget.c r1 = androidx.appcompat.widget.c.this
                r1.f1152i = r4
                if (r14 == 0) goto L9c
                r14.close()     // Catch: java.io.IOException -> L9c
            L9c:
                throw r0
            L9d:
                java.lang.String r14 = androidx.appcompat.widget.c.f1132o
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.g.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    private c(Context context, String str) {
        this.f1147d = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(".xml")) {
            this.f1148e = str;
        } else {
            this.f1148e = str.concat(".xml");
        }
    }

    private boolean a(e eVar) {
        boolean add = this.f1146c.add(eVar);
        if (add) {
            this.f1154k = true;
            n();
            m();
            v();
            notifyChanged();
        }
        return add;
    }

    private void c() {
        boolean l5 = l() | o();
        n();
        if (l5) {
            v();
            notifyChanged();
        }
    }

    public static c d(Context context, String str) {
        c cVar;
        synchronized (A) {
            Map<String, c> map = B;
            cVar = map.get(str);
            if (cVar == null) {
                cVar = new c(context, str);
                map.put(str, cVar);
            }
        }
        return cVar;
    }

    private boolean l() {
        if (!this.f1155l || this.f1149f == null) {
            return false;
        }
        this.f1155l = false;
        this.f1145b.clear();
        List<ResolveInfo> queryIntentActivities = this.f1147d.getPackageManager().queryIntentActivities(this.f1149f, 0);
        int size = queryIntentActivities.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f1145b.add(new b(queryIntentActivities.get(i5)));
        }
        return true;
    }

    private void m() {
        if (!this.f1153j) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.f1154k) {
            this.f1154k = false;
            if (TextUtils.isEmpty(this.f1148e)) {
                return;
            }
            new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f1146c), this.f1148e);
        }
    }

    private void n() {
        int size = this.f1146c.size() - this.f1151h;
        if (size <= 0) {
            return;
        }
        this.f1154k = true;
        for (int i5 = 0; i5 < size; i5++) {
            this.f1146c.remove(0);
        }
    }

    private boolean o() {
        if (!this.f1152i || !this.f1154k || TextUtils.isEmpty(this.f1148e)) {
            return false;
        }
        this.f1152i = false;
        this.f1153j = true;
        p();
        return true;
    }

    private void p() {
        XmlPullParser newPullParser;
        try {
            FileInputStream openFileInput = this.f1147d.openFileInput(this.f1148e);
            try {
                newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, "UTF-8");
                for (int i5 = 0; i5 != 1 && i5 != 2; i5 = newPullParser.next()) {
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
            List<e> list = this.f1146c;
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
        if (this.f1150g == null || this.f1149f == null || this.f1145b.isEmpty() || this.f1146c.isEmpty()) {
            return false;
        }
        this.f1150g.a(this.f1149f, this.f1145b, Collections.unmodifiableList(this.f1146c));
        return true;
    }

    public Intent b(int i5) {
        synchronized (this.f1144a) {
            if (this.f1149f == null) {
                return null;
            }
            c();
            ActivityInfo activityInfo = this.f1145b.get(i5).f1157o.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            Intent intent = new Intent(this.f1149f);
            intent.setComponent(componentName);
            if (this.f1156m != null) {
                if (this.f1156m.a(this, new Intent(intent))) {
                    return null;
                }
            }
            a(new e(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public ResolveInfo e(int i5) {
        ResolveInfo resolveInfo;
        synchronized (this.f1144a) {
            c();
            resolveInfo = this.f1145b.get(i5).f1157o;
        }
        return resolveInfo;
    }

    public int f() {
        int size;
        synchronized (this.f1144a) {
            c();
            size = this.f1145b.size();
        }
        return size;
    }

    public int g(ResolveInfo resolveInfo) {
        synchronized (this.f1144a) {
            c();
            List<b> list = this.f1145b;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (list.get(i5).f1157o == resolveInfo) {
                    return i5;
                }
            }
            return -1;
        }
    }

    public ResolveInfo h() {
        synchronized (this.f1144a) {
            c();
            if (this.f1145b.isEmpty()) {
                return null;
            }
            return this.f1145b.get(0).f1157o;
        }
    }

    public int i() {
        int i5;
        synchronized (this.f1144a) {
            i5 = this.f1151h;
        }
        return i5;
    }

    public int j() {
        int size;
        synchronized (this.f1144a) {
            c();
            size = this.f1146c.size();
        }
        return size;
    }

    public Intent k() {
        Intent intent;
        synchronized (this.f1144a) {
            intent = this.f1149f;
        }
        return intent;
    }

    public void q(InterfaceC0011c interfaceC0011c) {
        synchronized (this.f1144a) {
            if (this.f1150g == interfaceC0011c) {
                return;
            }
            this.f1150g = interfaceC0011c;
            if (v()) {
                notifyChanged();
            }
        }
    }

    public void r(int i5) {
        synchronized (this.f1144a) {
            c();
            b bVar = this.f1145b.get(i5);
            b bVar2 = this.f1145b.get(0);
            float f6 = bVar2 != null ? (bVar2.f1158p - bVar.f1158p) + 5.0f : 1.0f;
            ActivityInfo activityInfo = bVar.f1157o.activityInfo;
            a(new e(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f6));
        }
    }

    public void s(int i5) {
        synchronized (this.f1144a) {
            if (this.f1151h == i5) {
                return;
            }
            this.f1151h = i5;
            n();
            if (v()) {
                notifyChanged();
            }
        }
    }

    public void t(Intent intent) {
        synchronized (this.f1144a) {
            if (this.f1149f == intent) {
                return;
            }
            this.f1149f = intent;
            this.f1155l = true;
            c();
        }
    }

    public void u(f fVar) {
        synchronized (this.f1144a) {
            this.f1156m = fVar;
        }
    }
}
