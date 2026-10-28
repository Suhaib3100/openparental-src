package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.core.app.x1;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: NotificationCompatJellybean.java */
@androidx.annotation.x0(16)
/* loaded from: classes.dex */
class i3 {

    /* renamed from: r, reason: collision with root package name */
    private static Field f4104r;

    /* renamed from: s, reason: collision with root package name */
    private static boolean f4105s;

    /* renamed from: u, reason: collision with root package name */
    private static Field f4107u;

    /* renamed from: v, reason: collision with root package name */
    private static Field f4108v;

    /* renamed from: w, reason: collision with root package name */
    private static Field f4109w;

    /* renamed from: x, reason: collision with root package name */
    private static Field f4110x;

    /* renamed from: y, reason: collision with root package name */
    private static boolean f4111y;

    /* renamed from: a, reason: collision with root package name */
    public static final String f4087a = "NotificationCompat";

    /* renamed from: b, reason: collision with root package name */
    static final String f4088b = "android.support.dataRemoteInputs";

    /* renamed from: c, reason: collision with root package name */
    static final String f4089c = "android.support.allowGeneratedReplies";

    /* renamed from: d, reason: collision with root package name */
    private static final String f4090d = "icon";

    /* renamed from: e, reason: collision with root package name */
    private static final String f4091e = "title";

    /* renamed from: f, reason: collision with root package name */
    private static final String f4092f = "actionIntent";

    /* renamed from: g, reason: collision with root package name */
    private static final String f4093g = "extras";

    /* renamed from: h, reason: collision with root package name */
    private static final String f4094h = "remoteInputs";

    /* renamed from: i, reason: collision with root package name */
    private static final String f4095i = "dataOnlyRemoteInputs";

    /* renamed from: j, reason: collision with root package name */
    private static final String f4096j = "resultKey";

    /* renamed from: k, reason: collision with root package name */
    private static final String f4097k = "label";

    /* renamed from: l, reason: collision with root package name */
    private static final String f4098l = "choices";

    /* renamed from: m, reason: collision with root package name */
    private static final String f4099m = "allowFreeFormInput";

    /* renamed from: n, reason: collision with root package name */
    private static final String f4100n = "allowedDataTypes";

    /* renamed from: o, reason: collision with root package name */
    private static final String f4101o = "semanticAction";

    /* renamed from: p, reason: collision with root package name */
    private static final String f4102p = "showsUserInterface";

    /* renamed from: q, reason: collision with root package name */
    private static final Object f4103q = new Object();

    /* renamed from: t, reason: collision with root package name */
    private static final Object f4106t = new Object();

    private i3() {
    }

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i5 = 0; i5 < size; i5++) {
            Bundle bundle = list.get(i5);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i5, bundle);
            }
        }
        return sparseArray;
    }

    private static boolean b() {
        if (f4111y) {
            return false;
        }
        try {
            if (f4107u == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                f4108v = cls.getDeclaredField("icon");
                f4109w = cls.getDeclaredField("title");
                f4110x = cls.getDeclaredField("actionIntent");
                Field declaredField = Notification.class.getDeclaredField("actions");
                f4107u = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException unused) {
            f4111y = true;
        } catch (NoSuchFieldException unused2) {
            f4111y = true;
        }
        return true ^ f4111y;
    }

    private static v4 c(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new v4(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
    }

    private static v4[] d(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        v4[] v4VarArr = new v4[bundleArr.length];
        for (int i5 = 0; i5 < bundleArr.length; i5++) {
            v4VarArr[i5] = c(bundleArr[i5]);
        }
        return v4VarArr;
    }

    public static x1.b e(Notification notification, int i5) {
        SparseArray sparseParcelableArray;
        synchronized (f4106t) {
            try {
                try {
                    Object[] h5 = h(notification);
                    if (h5 != null) {
                        Object obj = h5[i5];
                        Bundle k5 = k(notification);
                        return l(f4108v.getInt(obj), (CharSequence) f4109w.get(obj), (PendingIntent) f4110x.get(obj), (k5 == null || (sparseParcelableArray = k5.getSparseParcelableArray("android.support.actionExtras")) == null) ? null : (Bundle) sparseParcelableArray.get(i5));
                    }
                } catch (IllegalAccessException unused) {
                    f4111y = true;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int f(Notification notification) {
        int length;
        synchronized (f4106t) {
            Object[] h5 = h(notification);
            length = h5 != null ? h5.length : 0;
        }
        return length;
    }

    static x1.b g(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        return new x1.b(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent) bundle.getParcelable("actionIntent"), bundle.getBundle("extras"), d(i(bundle, "remoteInputs")), d(i(bundle, "dataOnlyRemoteInputs")), bundle2 != null ? bundle2.getBoolean("android.support.allowGeneratedReplies", false) : false, bundle.getInt("semanticAction"), bundle.getBoolean("showsUserInterface"), false, false);
    }

    private static Object[] h(Notification notification) {
        synchronized (f4106t) {
            if (!b()) {
                return null;
            }
            try {
                return (Object[]) f4107u.get(notification);
            } catch (IllegalAccessException unused) {
                f4111y = true;
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

    static Bundle j(x1.b bVar) {
        Bundle bundle = new Bundle();
        IconCompat f6 = bVar.f();
        bundle.putInt("icon", f6 != null ? f6.t() : 0);
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
        synchronized (f4103q) {
            if (f4105s) {
                return null;
            }
            try {
                if (f4104r == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        f4105s = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f4104r = declaredField;
                }
                Bundle bundle = (Bundle) f4104r.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f4104r.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException | NoSuchFieldException unused) {
                f4105s = true;
                return null;
            }
        }
    }

    public static x1.b l(int i5, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        v4[] v4VarArr;
        v4[] v4VarArr2;
        boolean z5;
        if (bundle != null) {
            v4VarArr = d(i(bundle, "android.support.remoteInputs"));
            v4VarArr2 = d(i(bundle, "android.support.dataRemoteInputs"));
            z5 = bundle.getBoolean("android.support.allowGeneratedReplies");
        } else {
            v4VarArr = null;
            v4VarArr2 = null;
            z5 = false;
        }
        return new x1.b(i5, charSequence, pendingIntent, bundle, v4VarArr, v4VarArr2, z5, 0, true, false, false);
    }

    private static Bundle m(v4 v4Var) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", v4Var.o());
        bundle.putCharSequence("label", v4Var.n());
        bundle.putCharSequenceArray("choices", v4Var.h());
        bundle.putBoolean("allowFreeFormInput", v4Var.f());
        bundle.putBundle("extras", v4Var.m());
        Set<String> g5 = v4Var.g();
        if (g5 != null && !g5.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(g5.size());
            Iterator<String> it = g5.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] n(v4[] v4VarArr) {
        if (v4VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[v4VarArr.length];
        for (int i5 = 0; i5 < v4VarArr.length; i5++) {
            bundleArr[i5] = m(v4VarArr[i5]);
        }
        return bundleArr;
    }

    public static Bundle o(Notification.Builder builder, x1.b bVar) {
        IconCompat f6 = bVar.f();
        builder.addAction(f6 != null ? f6.t() : 0, bVar.j(), bVar.a());
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
