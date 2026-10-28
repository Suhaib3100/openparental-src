package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.c1;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* compiled from: Person.java */
/* loaded from: classes3.dex */
public class r0 {

    /* renamed from: g, reason: collision with root package name */
    private static final String f25859g = "name";

    /* renamed from: h, reason: collision with root package name */
    private static final String f25860h = "icon";

    /* renamed from: i, reason: collision with root package name */
    private static final String f25861i = "uri";

    /* renamed from: j, reason: collision with root package name */
    private static final String f25862j = "key";

    /* renamed from: k, reason: collision with root package name */
    private static final String f25863k = "isBot";

    /* renamed from: l, reason: collision with root package name */
    private static final String f25864l = "isImportant";

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.q0
    CharSequence f25865a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.q0
    IconCompat f25866b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.q0
    String f25867c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.q0
    String f25868d;

    /* renamed from: e, reason: collision with root package name */
    boolean f25869e;

    /* renamed from: f, reason: collision with root package name */
    boolean f25870f;

    /* compiled from: Person.java */
    @androidx.annotation.x0(22)
    static class a {
        private a() {
        }

        static r0 a(PersistableBundle persistableBundle) {
            c cVar = new c();
            cVar.f25871a = persistableBundle.getString("name");
            cVar.f25873c = persistableBundle.getString("uri");
            cVar.f25874d = persistableBundle.getString("key");
            cVar.f25875e = persistableBundle.getBoolean("isBot");
            cVar.f25876f = persistableBundle.getBoolean("isImportant");
            return new r0(cVar);
        }

        static PersistableBundle b(r0 r0Var) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = r0Var.f25865a;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", r0Var.f25867c);
            persistableBundle.putString("key", r0Var.f25868d);
            persistableBundle.putBoolean("isBot", r0Var.f25869e);
            persistableBundle.putBoolean("isImportant", r0Var.f25870f);
            return persistableBundle;
        }
    }

    /* compiled from: Person.java */
    @androidx.annotation.x0(28)
    static class b {
        private b() {
        }

        static r0 a(Person person) {
            c cVar = new c();
            cVar.f25871a = person.getName();
            cVar.f25872b = person.getIcon() != null ? IconCompat.l(person.getIcon()) : null;
            cVar.f25873c = person.getUri();
            cVar.f25874d = person.getKey();
            cVar.f25875e = person.isBot();
            cVar.f25876f = person.isImportant();
            return new r0(cVar);
        }

        static Person b(r0 r0Var) {
            return new Person.Builder().setName(r0Var.f()).setIcon(r0Var.d() != null ? r0Var.d().J() : null).setUri(r0Var.g()).setKey(r0Var.e()).setBot(r0Var.h()).setImportant(r0Var.i()).build();
        }
    }

    /* compiled from: Person.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.q0
        CharSequence f25871a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.q0
        IconCompat f25872b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.q0
        String f25873c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.q0
        String f25874d;

        /* renamed from: e, reason: collision with root package name */
        boolean f25875e;

        /* renamed from: f, reason: collision with root package name */
        boolean f25876f;

        public c() {
        }

        @androidx.annotation.o0
        public r0 a() {
            return new r0(this);
        }

        @androidx.annotation.o0
        public c b(boolean z4) {
            this.f25875e = z4;
            return this;
        }

        @androidx.annotation.o0
        public c c(@androidx.annotation.q0 IconCompat iconCompat) {
            this.f25872b = iconCompat;
            return this;
        }

        @androidx.annotation.o0
        public c d(boolean z4) {
            this.f25876f = z4;
            return this;
        }

        @androidx.annotation.o0
        public c e(@androidx.annotation.q0 String str) {
            this.f25874d = str;
            return this;
        }

        @androidx.annotation.o0
        public c f(@androidx.annotation.q0 CharSequence charSequence) {
            this.f25871a = charSequence;
            return this;
        }

        @androidx.annotation.o0
        public c g(@androidx.annotation.q0 String str) {
            this.f25873c = str;
            return this;
        }

        c(r0 r0Var) {
            this.f25871a = r0Var.f25865a;
            this.f25872b = r0Var.f25866b;
            this.f25873c = r0Var.f25867c;
            this.f25874d = r0Var.f25868d;
            this.f25875e = r0Var.f25869e;
            this.f25876f = r0Var.f25870f;
        }
    }

    r0(c cVar) {
        this.f25865a = cVar.f25871a;
        this.f25866b = cVar.f25872b;
        this.f25867c = cVar.f25873c;
        this.f25868d = cVar.f25874d;
        this.f25869e = cVar.f25875e;
        this.f25870f = cVar.f25876f;
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.o0
    @androidx.annotation.x0(28)
    public static r0 a(@androidx.annotation.o0 Person person) {
        return b.a(person);
    }

    @androidx.annotation.o0
    public static r0 b(@androidx.annotation.o0 Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        c cVar = new c();
        cVar.f25871a = bundle.getCharSequence("name");
        cVar.f25872b = bundle2 != null ? IconCompat.j(bundle2) : null;
        cVar.f25873c = bundle.getString("uri");
        cVar.f25874d = bundle.getString("key");
        cVar.f25875e = bundle.getBoolean("isBot");
        cVar.f25876f = bundle.getBoolean("isImportant");
        return new r0(cVar);
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.o0
    @androidx.annotation.x0(22)
    public static r0 c(@androidx.annotation.o0 PersistableBundle persistableBundle) {
        return a.a(persistableBundle);
    }

    @androidx.annotation.q0
    public IconCompat d() {
        return this.f25866b;
    }

    @androidx.annotation.q0
    public String e() {
        return this.f25868d;
    }

    public boolean equals(@androidx.annotation.q0 Object obj) {
        if (obj == null || !(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        String e4 = e();
        String e5 = r0Var.e();
        return (e4 == null && e5 == null) ? Objects.equals(Objects.toString(f()), Objects.toString(r0Var.f())) && Objects.equals(g(), r0Var.g()) && Boolean.valueOf(h()).equals(Boolean.valueOf(r0Var.h())) && Boolean.valueOf(i()).equals(Boolean.valueOf(r0Var.i())) : Objects.equals(e4, e5);
    }

    @androidx.annotation.q0
    public CharSequence f() {
        return this.f25865a;
    }

    @androidx.annotation.q0
    public String g() {
        return this.f25867c;
    }

    public boolean h() {
        return this.f25869e;
    }

    public int hashCode() {
        String e4 = e();
        return e4 != null ? e4.hashCode() : Objects.hash(f(), g(), Boolean.valueOf(h()), Boolean.valueOf(i()));
    }

    public boolean i() {
        return this.f25870f;
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.o0
    public String j() {
        String str = this.f25867c;
        if (str != null) {
            return str;
        }
        if (this.f25865a == null) {
            return "";
        }
        return "name:" + ((Object) this.f25865a);
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
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
        bundle.putCharSequence("name", this.f25865a);
        IconCompat iconCompat = this.f25866b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.toBundle() : null);
        bundle.putString("uri", this.f25867c);
        bundle.putString("key", this.f25868d);
        bundle.putBoolean("isBot", this.f25869e);
        bundle.putBoolean("isImportant", this.f25870f);
        return bundle;
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @androidx.annotation.o0
    @androidx.annotation.x0(22)
    public PersistableBundle n() {
        return a.b(this);
    }
}
