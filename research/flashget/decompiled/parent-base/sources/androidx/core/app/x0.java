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
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;

/* compiled from: TaskStackBuilder.java */
/* loaded from: classes3.dex */
public final class x0 implements Iterable<Intent> {

    /* renamed from: d, reason: collision with root package name */
    private static final String f25940d = "TaskStackBuilder";

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<Intent> f25941b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final Context f25942c;

    /* compiled from: TaskStackBuilder.java */
    public interface a {
        @androidx.annotation.q0
        Intent getSupportParentActivityIntent();
    }

    private x0(Context context) {
        this.f25942c = context;
    }

    @androidx.annotation.o0
    public static x0 j(@androidx.annotation.o0 Context context) {
        return new x0(context);
    }

    @Deprecated
    public static x0 m(Context context) {
        return new x0(context);
    }

    @androidx.annotation.o0
    public x0 b(@androidx.annotation.o0 Intent intent) {
        this.f25941b.add(intent);
        return this;
    }

    @androidx.annotation.o0
    public x0 c(@androidx.annotation.o0 Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f25942c.getPackageManager());
        }
        if (component != null) {
            h(component);
        }
        b(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.o0
    public x0 f(@androidx.annotation.o0 Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = x.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f25942c.getPackageManager());
            }
            h(component);
            b(supportParentActivityIntent);
        }
        return this;
    }

    @androidx.annotation.o0
    public x0 h(@androidx.annotation.o0 ComponentName componentName) {
        int size = this.f25941b.size();
        try {
            Intent b5 = x.b(this.f25942c, componentName);
            while (b5 != null) {
                this.f25941b.add(size, b5);
                b5 = x.b(this.f25942c, b5.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    @androidx.annotation.o0
    public x0 i(@androidx.annotation.o0 Class<?> cls) {
        return h(new ComponentName(this.f25942c, cls));
    }

    @Override // java.lang.Iterable
    @androidx.annotation.o0
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f25941b.iterator();
    }

    @androidx.annotation.q0
    public Intent l(int i4) {
        return this.f25941b.get(i4);
    }

    @Deprecated
    public Intent p(int i4) {
        return l(i4);
    }

    public int q() {
        return this.f25941b.size();
    }

    @androidx.annotation.o0
    public Intent[] r() {
        int size = this.f25941b.size();
        Intent[] intentArr = new Intent[size];
        if (size == 0) {
            return intentArr;
        }
        intentArr[0] = new Intent(this.f25941b.get(0)).addFlags(268484608);
        for (int i4 = 1; i4 < size; i4++) {
            intentArr[i4] = new Intent(this.f25941b.get(i4));
        }
        return intentArr;
    }

    @androidx.annotation.q0
    public PendingIntent s(int i4, int i5) {
        return v(i4, i5, null);
    }

    @androidx.annotation.q0
    public PendingIntent v(int i4, int i5, @androidx.annotation.q0 Bundle bundle) {
        if (this.f25941b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.f25941b.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return PendingIntent.getActivities(this.f25942c, i4, intentArr, i5, bundle);
    }

    public void w() {
        x(null);
    }

    public void x(@androidx.annotation.q0 Bundle bundle) {
        if (this.f25941b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f25941b.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.d.startActivities(this.f25942c, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(ClientDefaults.MAX_MSG_SIZE);
        this.f25942c.startActivity(intent);
    }
}
