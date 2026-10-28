package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: NotificationChannelGroupCompat.java */
/* loaded from: classes.dex */
public class j1 {

    /* renamed from: a, reason: collision with root package name */
    final String f4132a;

    /* renamed from: b, reason: collision with root package name */
    CharSequence f4133b;

    /* renamed from: c, reason: collision with root package name */
    String f4134c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4135d;

    /* renamed from: e, reason: collision with root package name */
    private List<c1> f4136e;

    /* compiled from: NotificationChannelGroupCompat.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final j1 f4137a;

        public a(@androidx.annotation.o0 String str) {
            this.f4137a = new j1(str);
        }

        @androidx.annotation.o0
        public j1 a() {
            return this.f4137a;
        }

        @androidx.annotation.o0
        public a b(@androidx.annotation.q0 String str) {
            this.f4137a.f4134c = str;
            return this;
        }

        @androidx.annotation.o0
        public a c(@androidx.annotation.q0 CharSequence charSequence) {
            this.f4137a.f4133b = charSequence;
            return this;
        }
    }

    j1(@androidx.annotation.o0 String str) {
        this.f4136e = Collections.emptyList();
        str.getClass();
        this.f4132a = str;
    }

    @androidx.annotation.x0(26)
    private List<c1> b(List<NotificationChannel> list) {
        String group;
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel notificationChannel : list) {
            String str = this.f4132a;
            group = notificationChannel.getGroup();
            if (str.equals(group)) {
                arrayList.add(new c1(notificationChannel));
            }
        }
        return arrayList;
    }

    @androidx.annotation.o0
    public List<c1> a() {
        return this.f4136e;
    }

    @androidx.annotation.q0
    public String c() {
        return this.f4134c;
    }

    @androidx.annotation.o0
    public String d() {
        return this.f4132a;
    }

    @androidx.annotation.q0
    public CharSequence e() {
        return this.f4133b;
    }

    NotificationChannelGroup f() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 26) {
            return null;
        }
        NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(this.f4132a, this.f4133b);
        if (i5 >= 28) {
            notificationChannelGroup.setDescription(this.f4134c);
        }
        return notificationChannelGroup;
    }

    public boolean g() {
        return this.f4135d;
    }

    @androidx.annotation.o0
    public a h() {
        a aVar = new a(this.f4132a);
        CharSequence charSequence = this.f4133b;
        j1 j1Var = aVar.f4137a;
        j1Var.f4133b = charSequence;
        j1Var.f4134c = this.f4134c;
        return aVar;
    }

    @androidx.annotation.x0(28)
    j1(@androidx.annotation.o0 NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @androidx.annotation.x0(26)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    j1(@androidx.annotation.o0 android.app.NotificationChannelGroup r4, @androidx.annotation.o0 java.util.List<android.app.NotificationChannel> r5) {
        /*
            r3 = this;
            java.lang.String r0 = androidx.core.app.d1.a(r4)
            r3.<init>(r0)
            java.lang.CharSequence r0 = androidx.core.app.e1.a(r4)
            r3.f4133b = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L19
            java.lang.String r2 = androidx.core.app.f1.a(r4)
            r3.f4134c = r2
        L19:
            if (r0 < r1) goto L2c
            boolean r5 = androidx.core.app.g1.a(r4)
            r3.f4135d = r5
            java.util.List r4 = androidx.core.app.h1.a(r4)
            java.util.List r4 = r3.b(r4)
            r3.f4136e = r4
            goto L32
        L2c:
            java.util.List r4 = r3.b(r5)
            r3.f4136e = r4
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.j1.<init>(android.app.NotificationChannelGroup, java.util.List):void");
    }
}
