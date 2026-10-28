package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: NotificationChannelGroupCompat.java */
/* loaded from: classes3.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    final String f25415a;

    /* renamed from: b, reason: collision with root package name */
    CharSequence f25416b;

    /* renamed from: c, reason: collision with root package name */
    String f25417c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f25418d;

    /* renamed from: e, reason: collision with root package name */
    private List<z> f25419e;

    /* compiled from: NotificationChannelGroupCompat.java */
    @androidx.annotation.x0(26)
    static class a {
        private a() {
        }

        static NotificationChannelGroup a(String str, CharSequence charSequence) {
            return new NotificationChannelGroup(str, charSequence);
        }

        static List<NotificationChannel> b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getChannels();
        }

        static String c(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        static String d(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        static CharSequence e(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getName();
        }
    }

    /* compiled from: NotificationChannelGroupCompat.java */
    @androidx.annotation.x0(28)
    static class b {
        private b() {
        }

        static String a(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getDescription();
        }

        static boolean b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.isBlocked();
        }

        static void c(NotificationChannelGroup notificationChannelGroup, String str) {
            notificationChannelGroup.setDescription(str);
        }
    }

    /* compiled from: NotificationChannelGroupCompat.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final b0 f25420a;

        public c(@androidx.annotation.o0 String str) {
            this.f25420a = new b0(str);
        }

        @androidx.annotation.o0
        public b0 a() {
            return this.f25420a;
        }

        @androidx.annotation.o0
        public c b(@androidx.annotation.q0 String str) {
            this.f25420a.f25417c = str;
            return this;
        }

        @androidx.annotation.o0
        public c c(@androidx.annotation.q0 CharSequence charSequence) {
            this.f25420a.f25416b = charSequence;
            return this;
        }
    }

    b0(@androidx.annotation.o0 String str) {
        this.f25419e = Collections.emptyList();
        str.getClass();
        this.f25415a = str;
    }

    @androidx.annotation.x0(26)
    private List<z> b(List<NotificationChannel> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationChannel> it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel a5 = a0.a(it.next());
            if (this.f25415a.equals(a.c(a5))) {
                arrayList.add(new z(a5));
            }
        }
        return arrayList;
    }

    @androidx.annotation.o0
    public List<z> a() {
        return this.f25419e;
    }

    @androidx.annotation.q0
    public String c() {
        return this.f25417c;
    }

    @androidx.annotation.o0
    public String d() {
        return this.f25415a;
    }

    @androidx.annotation.q0
    public CharSequence e() {
        return this.f25416b;
    }

    NotificationChannelGroup f() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26) {
            return null;
        }
        NotificationChannelGroup a5 = a.a(this.f25415a, this.f25416b);
        if (i4 >= 28) {
            b.c(a5, this.f25417c);
        }
        return a5;
    }

    public boolean g() {
        return this.f25418d;
    }

    @androidx.annotation.o0
    public c h() {
        c cVar = new c(this.f25415a);
        CharSequence charSequence = this.f25416b;
        b0 b0Var = cVar.f25420a;
        b0Var.f25416b = charSequence;
        b0Var.f25417c = this.f25417c;
        return cVar;
    }

    @androidx.annotation.x0(28)
    b0(@androidx.annotation.o0 NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    @androidx.annotation.x0(26)
    b0(@androidx.annotation.o0 NotificationChannelGroup notificationChannelGroup, @androidx.annotation.o0 List<NotificationChannel> list) {
        this(a.d(notificationChannelGroup));
        this.f25416b = a.e(notificationChannelGroup);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            this.f25417c = b.a(notificationChannelGroup);
        }
        if (i4 >= 28) {
            this.f25418d = b.b(notificationChannelGroup);
            this.f25419e = b(a.b(notificationChannelGroup));
        } else {
            this.f25419e = b(list);
        }
    }
}
