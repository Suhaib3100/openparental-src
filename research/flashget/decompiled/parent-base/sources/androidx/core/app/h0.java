package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.core.app.d0;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: NotificationCompatJellybean.java */
/* loaded from: classes3.dex */
class h0 {

    /* renamed from: r, reason: collision with root package name */
    private static Field f25748r;

    /* renamed from: s, reason: collision with root package name */
    private static boolean f25749s;

    /* renamed from: u, reason: collision with root package name */
    private static Field f25751u;

    /* renamed from: v, reason: collision with root package name */
    private static Field f25752v;

    /* renamed from: w, reason: collision with root package name */
    private static Field f25753w;

    /* renamed from: x, reason: collision with root package name */
    private static Field f25754x;

    /* renamed from: y, reason: collision with root package name */
    private static boolean f25755y;

    /* renamed from: a, reason: collision with root package name */
    public static final String f25731a = "NotificationCompat";

    /* renamed from: b, reason: collision with root package name */
    static final String f25732b = "android.support.dataRemoteInputs";

    /* renamed from: c, reason: collision with root package name */
    static final String f25733c = "android.support.allowGeneratedReplies";

    /* renamed from: d, reason: collision with root package name */
    private static final String f25734d = "icon";

    /* renamed from: e, reason: collision with root package name */
    private static final String f25735e = "title";

    /* renamed from: f, reason: collision with root package name */
    private static final String f25736f = "actionIntent";

    /* renamed from: g, reason: collision with root package name */
    private static final String f25737g = "extras";

    /* renamed from: h, reason: collision with root package name */
    private static final String f25738h = "remoteInputs";

    /* renamed from: i, reason: collision with root package name */
    private static final String f25739i = "dataOnlyRemoteInputs";

    /* renamed from: j, reason: collision with root package name */
    private static final String f25740j = "resultKey";

    /* renamed from: k, reason: collision with root package name */
    private static final String f25741k = "label";

    /* renamed from: l, reason: collision with root package name */
    private static final String f25742l = "choices";

    /* renamed from: m, reason: collision with root package name */
    private static final String f25743m = "allowFreeFormInput";

    /* renamed from: n, reason: collision with root package name */
    private static final String f25744n = "allowedDataTypes";

    /* renamed from: o, reason: collision with root package name */
    private static final String f25745o = "semanticAction";

    /* renamed from: p, reason: collision with root package name */
    private static final String f25746p = "showsUserInterface";

    /* renamed from: q, reason: collision with root package name */
    private static final Object f25747q = new Object();

    /* renamed from: t, reason: collision with root package name */
    private static final Object f25750t = new Object();

    private h0() {
    }

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i4 = 0; i4 < size; i4++) {
            Bundle bundle = list.get(i4);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i4, bundle);
            }
        }
        return sparseArray;
    }

    private static boolean b() {
        if (f25755y) {
            return false;
        }
        try {
            if (f25751u == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                f25752v = cls.getDeclaredField("icon");
                f25753w = cls.getDeclaredField("title");
                f25754x = cls.getDeclaredField("actionIntent");
                Field declaredField = Notification.class.getDeclaredField("actions");
                f25751u = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException unused) {
            f25755y = true;
        } catch (NoSuchFieldException unused2) {
            f25755y = true;
        }
        return true ^ f25755y;
    }

    private static t0 c(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new t0(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
    }

    private static t0[] d(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        t0[] t0VarArr = new t0[bundleArr.length];
        for (int i4 = 0; i4 < bundleArr.length; i4++) {
            t0VarArr[i4] = c(bundleArr[i4]);
        }
        return t0VarArr;
    }

    public static d0.b e(Notification notification, int i4) {
        SparseArray sparseParcelableArray;
        synchronized (f25750t) {
            try {
                try {
                    Object[] h4 = h(notification);
                    if (h4 != null) {
                        Object obj = h4[i4];
                        Bundle k4 = k(notification);
                        return l(f25752v.getInt(obj), (CharSequence) f25753w.get(obj), (PendingIntent) f25754x.get(obj), (k4 == null || (sparseParcelableArray = k4.getSparseParcelableArray("android.support.actionExtras")) == null) ? null : (Bundle) sparseParcelableArray.get(i4));
                    }
                } catch (IllegalAccessException unused) {
                    f25755y = true;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int f(Notification notification) {
        int length;
        synchronized (f25750t) {
            try {
                Object[] h4 = h(notification);
                length = h4 != null ? h4.length : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return length;
    }

    static d0.b g(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        return new d0.b(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent) bundle.getParcelable("actionIntent"), bundle.getBundle("extras"), d(i(bundle, "remoteInputs")), d(i(bundle, "dataOnlyRemoteInputs")), bundle2 != null ? bundle2.getBoolean("android.support.allowGeneratedReplies", false) : false, bundle.getInt("semanticAction"), bundle.getBoolean("showsUserInterface"), false, false);
    }

    private static Object[] h(Notification notification) {
        synchronized (f25750t) {
            if (!b()) {
                return null;
            }
            try {
                return (Object[]) f25751u.get(notification);
            } catch (IllegalAccessException unused) {
                f25755y = true;
                return null;
            }
        }
    }

    private static Bundle[] i(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    static Bundle j(d0.b bVar) {
        Bundle bundle = new Bundle();
        IconCompat f4 = bVar.f();
        bundle.putInt("icon", f4 != null ? f4.y() : 0);
        bundle.putCharSequence("title", bVar.j());
        bundle.putParcelable("actionIntent", bVar.a());
        Bundle bundle2 = bVar.d() != null ? new Bundle(bVar.d()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", bVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", n(bVar.g()));
        bundle.putBoolean("showsUserInterface", bVar.i());
        bundle.putInt("semanticAction", bVar.h());
        return bundle;
    }

    public static Bundle k(Notification notification) {
        synchronized (f25747q) {
            if (f25749s) {
                return null;
            }
            try {
                if (f25748r == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        f25749s = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f25748r = declaredField;
                }
                Bundle bundle = (Bundle) f25748r.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f25748r.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException | NoSuchFieldException unused) {
                f25749s = true;
                return null;
            }
        }
    }

    public static d0.b l(int i4, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        t0[] t0VarArr;
        t0[] t0VarArr2;
        boolean z4;
        if (bundle != null) {
            t0VarArr = d(i(bundle, "android.support.remoteInputs"));
            t0VarArr2 = d(i(bundle, "android.support.dataRemoteInputs"));
            z4 = bundle.getBoolean("android.support.allowGeneratedReplies");
        } else {
            t0VarArr = null;
            t0VarArr2 = null;
            z4 = false;
        }
        return new d0.b(i4, charSequence, pendingIntent, bundle, t0VarArr, t0VarArr2, z4, 0, true, false, false);
    }

    private static Bundle m(t0 t0Var) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", t0Var.o());
        bundle.putCharSequence("label", t0Var.n());
        bundle.putCharSequenceArray("choices", t0Var.h());
        bundle.putBoolean("allowFreeFormInput", t0Var.f());
        bundle.putBundle("extras", t0Var.m());
        Set<String> g4 = t0Var.g();
        if (g4 != null && !g4.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(g4.size());
            Iterator<String> it = g4.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] n(t0[] t0VarArr) {
        if (t0VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[t0VarArr.length];
        for (int i4 = 0; i4 < t0VarArr.length; i4++) {
            bundleArr[i4] = m(t0VarArr[i4]);
        }
        return bundleArr;
    }

    public static Bundle o(Notification.Builder builder, d0.b bVar) {
        IconCompat f4 = bVar.f();
        builder.addAction(f4 != null ? f4.y() : 0, bVar.j(), bVar.a());
        Bundle bundle = new Bundle(bVar.d());
        if (bVar.g() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", n(bVar.g()));
        }
        if (bVar.c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", n(bVar.c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", bVar.b());
        return bundle;
    }
}
