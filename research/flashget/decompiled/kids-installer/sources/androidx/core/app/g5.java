package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TaskStackBuilder.java */
/* loaded from: classes.dex */
public final class g5 implements Iterable<Intent> {

    /* renamed from: q, reason: collision with root package name */
    private static final String f4075q = "TaskStackBuilder";

    /* renamed from: o, reason: collision with root package name */
    private final ArrayList<Intent> f4076o = new ArrayList<>();

    /* renamed from: p, reason: collision with root package name */
    private final Context f4077p;

    /* compiled from: TaskStackBuilder.java */
    @androidx.annotation.x0(16)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static PendingIntent a(Context context, int i5, Intent[] intentArr, int i6, Bundle bundle) {
            return PendingIntent.getActivities(context, i5, intentArr, i6, bundle);
        }
    }

    /* compiled from: TaskStackBuilder.java */
    public interface b {
        @androidx.annotation.q0
        Intent t();
    }

    private g5(Context context) {
        this.f4077p = context;
    }

    @androidx.annotation.o0
    public static g5 o(@androidx.annotation.o0 Context context) {
        return new g5(context);
    }

    @Deprecated
    public static g5 q(Context context) {
        return new g5(context);
    }

    @androidx.annotation.o0
    public g5 b(@androidx.annotation.o0 Intent intent) {
        this.f4076o.add(intent);
        return this;
    }

    @androidx.annotation.o0
    public g5 f(@androidx.annotation.o0 Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f4077p.getPackageManager());
        }
        if (component != null) {
            h(component);
        }
        b(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.o0
    public g5 g(@androidx.annotation.o0 Activity activity) {
        Intent t5 = activity instanceof b ? ((b) activity).t() : null;
        if (t5 == null) {
            t5 = z.a(activity);
        }
        if (t5 != null) {
            ComponentName component = t5.getComponent();
            if (component == null) {
                component = t5.resolveActivity(this.f4077p.getPackageManager());
            }
            h(component);
            b(t5);
        }
        return this;
    }

    @androidx.annotation.o0
    public g5 h(@androidx.annotation.o0 ComponentName componentName) {
        int size = this.f4076o.size();
        try {
            Intent b6 = z.b(this.f4077p, componentName);
            while (b6 != null) {
                this.f4076o.add(size, b6);
                b6 = z.b(this.f4077p, b6.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    @androidx.annotation.o0
    public g5 i(@androidx.annotation.o0 Class<?> cls) {
        return h(new ComponentName(this.f4077p, cls));
    }

    @Override // java.lang.Iterable
    @androidx.annotation.o0
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f4076o.iterator();
    }

    @androidx.annotation.q0
    public Intent p(int i5) {
        return this.f4076o.get(i5);
    }

    @Deprecated
    public Intent r(int i5) {
        return p(i5);
    }

    public int s() {
        return this.f4076o.size();
    }

    @androidx.annotation.o0
    public Intent[] t() {
        int size = this.f4076o.size();
        Intent[] intentArr = new Intent[size];
        if (size == 0) {
            return intentArr;
        }
        intentArr[0] = new Intent(this.f4076o.get(0)).addFlags(268484608);
        for (int i5 = 1; i5 < size; i5++) {
            intentArr[i5] = new Intent(this.f4076o.get(i5));
        }
        return intentArr;
    }

    @androidx.annotation.q0
    public PendingIntent u(int i5, int i6) {
        return v(i5, i6, null);
    }

    @androidx.annotation.q0
    public PendingIntent v(int i5, int i6, @androidx.annotation.q0 Bundle bundle) {
        if (this.f4076o.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.f4076o.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return a.a(this.f4077p, i5, intentArr, i6, bundle);
    }

    public void x() {
        y(null);
    }

    public void y(@androidx.annotation.q0 Bundle bundle) {
        if (this.f4076o.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f4076o.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.d.s(this.f4077p, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f4077p.startActivity(intent);
    }
}
