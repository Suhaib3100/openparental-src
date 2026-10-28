package androidx.core.app;

import android.app.Person;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.c1;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: Person.java */
/* loaded from: classes.dex */
public class y3 {

    /* renamed from: g, reason: collision with root package name */
    private static final String f4494g = "name";

    /* renamed from: h, reason: collision with root package name */
    private static final String f4495h = "icon";

    /* renamed from: i, reason: collision with root package name */
    private static final String f4496i = "uri";

    /* renamed from: j, reason: collision with root package name */
    private static final String f4497j = "key";

    /* renamed from: k, reason: collision with root package name */
    private static final String f4498k = "isBot";

    /* renamed from: l, reason: collision with root package name */
    private static final String f4499l = "isImportant";

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.q0
    CharSequence f4500a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.q0
    IconCompat f4501b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.q0
    String f4502c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.q0
    String f4503d;

    /* renamed from: e, reason: collision with root package name */
    boolean f4504e;

    /* renamed from: f, reason: collision with root package name */
    boolean f4505f;

    /* compiled from: Person.java */
    @androidx.annotation.x0(22)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static y3 a(PersistableBundle persistableBundle) {
            c cVar = new c();
            cVar.f4506a = persistableBundle.getString("name");
            cVar.f4508c = persistableBundle.getString("uri");
            cVar.f4509d = persistableBundle.getString("key");
            cVar.f4510e = persistableBundle.getBoolean("isBot");
            cVar.f4511f = persistableBundle.getBoolean("isImportant");
            return new y3(cVar);
        }

        @androidx.annotation.u
        static PersistableBundle b(y3 y3Var) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = y3Var.f4500a;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", y3Var.f4502c);
            persistableBundle.putString("key", y3Var.f4503d);
            persistableBundle.putBoolean("isBot", y3Var.f4504e);
            persistableBundle.putBoolean("isImportant", y3Var.f4505f);
            return persistableBundle;
        }
    }

    /* compiled from: Person.java */
    @androidx.annotation.x0(28)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static y3 a(Person person) {
            CharSequence name;
            Icon icon;
            IconCompat iconCompat;
            String uri;
            String key;
            boolean isBot;
            boolean isImportant;
            Icon icon2;
            c cVar = new c();
            name = person.getName();
            cVar.f4506a = name;
            icon = person.getIcon();
            if (icon != null) {
                icon2 = person.getIcon();
                iconCompat = IconCompat.g(icon2);
            } else {
                iconCompat = null;
            }
            cVar.f4507b = iconCompat;
            uri = person.getUri();
            cVar.f4508c = uri;
            key = person.getKey();
            cVar.f4509d = key;
            isBot = person.isBot();
            cVar.f4510e = isBot;
            isImportant = person.isImportant();
            cVar.f4511f = isImportant;
            return new y3(cVar);
        }

        @androidx.annotation.u
        static Person b(y3 y3Var) {
            return new Person.Builder().setName(y3Var.f()).setIcon(y3Var.d() != null ? y3Var.d().F() : null).setUri(y3Var.g()).setKey(y3Var.e()).setBot(y3Var.h()).setImportant(y3Var.i()).build();
        }
    }

    /* compiled from: Person.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.q0
        CharSequence f4506a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.q0
        IconCompat f4507b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.q0
        String f4508c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.q0
        String f4509d;

        /* renamed from: e, reason: collision with root package name */
        boolean f4510e;

        /* renamed from: f, reason: collision with root package name */
        boolean f4511f;

        public c() {
        }

        @androidx.annotation.o0
        public y3 a() {
            return new y3(this);
        }

        @androidx.annotation.o0
        public c b(boolean z5) {
            this.f4510e = z5;
            return this;
        }

        @androidx.annotation.o0
        public c c(@androidx.annotation.q0 IconCompat iconCompat) {
            this.f4507b = iconCompat;
            return this;
        }

        @androidx.annotation.o0
        public c d(boolean z5) {
            this.f4511f = z5;
            return this;
        }

        @androidx.annotation.o0
        public c e(@androidx.annotation.q0 String str) {
            this.f4509d = str;
            return this;
        }

        @androidx.annotation.o0
        public c f(@androidx.annotation.q0 CharSequence charSequence) {
            this.f4506a = charSequence;
            return this;
        }

        @androidx.annotation.o0
        public c g(@androidx.annotation.q0 String str) {
            this.f4508c = str;
            return this;
        }

        c(y3 y3Var) {
            this.f4506a = y3Var.f4500a;
            this.f4507b = y3Var.f4501b;
            this.f4508c = y3Var.f4502c;
            this.f4509d = y3Var.f4503d;
            this.f4510e = y3Var.f4504e;
            this.f4511f = y3Var.f4505f;
        }
    }

    y3(c cVar) {
        this.f4500a = cVar.f4506a;
        this.f4501b = cVar.f4507b;
        this.f4502c = cVar.f4508c;
        this.f4503d = cVar.f4509d;
        this.f4504e = cVar.f4510e;
        this.f4505f = cVar.f4511f;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.o0
    @androidx.annotation.x0(28)
    public static y3 a(@androidx.annotation.o0 Person person) {
        return b.a(person);
    }

    @androidx.annotation.o0
    public static y3 b(@androidx.annotation.o0 Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        c cVar = new c();
        cVar.f4506a = bundle.getCharSequence("name");
        cVar.f4507b = bundle2 != null ? IconCompat.e(bundle2) : null;
        cVar.f4508c = bundle.getString("uri");
        cVar.f4509d = bundle.getString("key");
        cVar.f4510e = bundle.getBoolean("isBot");
        cVar.f4511f = bundle.getBoolean("isImportant");
        return new y3(cVar);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.o0
    @androidx.annotation.x0(22)
    public static y3 c(@androidx.annotation.o0 PersistableBundle persistableBundle) {
        return a.a(persistableBundle);
    }

    @androidx.annotation.q0
    public IconCompat d() {
        return this.f4501b;
    }

    @androidx.annotation.q0
    public String e() {
        return this.f4503d;
    }

    @androidx.annotation.q0
    public CharSequence f() {
        return this.f4500a;
    }

    @androidx.annotation.q0
    public String g() {
        return this.f4502c;
    }

    public boolean h() {
        return this.f4504e;
    }

    public boolean i() {
        return this.f4505f;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.o0
    public String j() {
        String str = this.f4502c;
        if (str != null) {
            return str;
        }
        if (this.f4500a == null) {
            return "";
        }
        return "name:" + ((Object) this.f4500a);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.o0
    @androidx.annotation.x0(28)
    public Person k() {
        return b.b(this);
    }

    @androidx.annotation.o0
    public c l() {
        return new c(this);
    }

    @androidx.annotation.o0
    public Bundle m() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f4500a);
        IconCompat iconCompat = this.f4501b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.E() : null);
        bundle.putString("uri", this.f4502c);
        bundle.putString("key", this.f4503d);
        bundle.putBoolean("isBot", this.f4504e);
        bundle.putBoolean("isImportant", this.f4505f);
        return bundle;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.o0
    @androidx.annotation.x0(22)
    public PersistableBundle n() {
        return a.b(this);
    }
}
