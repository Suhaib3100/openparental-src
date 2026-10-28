package androidx.work;

import android.net.Uri;
import androidx.annotation.c1;
import androidx.annotation.o0;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ContentUriTriggers.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Set<a> f35965a = new HashSet();

    /* compiled from: ContentUriTriggers.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private final Uri f35966a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f35967b;

        a(@o0 Uri uri, boolean triggerForDescendants) {
            this.f35966a = uri;
            this.f35967b = triggerForDescendants;
        }

        @o0
        public Uri a() {
            return this.f35966a;
        }

        public boolean b() {
            return this.f35967b;
        }

        public boolean equals(Object o4) {
            if (this == o4) {
                return true;
            }
            if (o4 == null || a.class != o4.getClass()) {
                return false;
            }
            a aVar = (a) o4;
            return this.f35967b == aVar.f35967b && this.f35966a.equals(aVar.f35966a);
        }

        public int hashCode() {
            return (this.f35966a.hashCode() * 31) + (this.f35967b ? 1 : 0);
        }
    }

    public void a(@o0 Uri uri, boolean triggerForDescendants) {
        this.f35965a.add(new a(uri, triggerForDescendants));
    }

    @o0
    public Set<a> b() {
        return this.f35965a;
    }

    public int c() {
        return this.f35965a.size();
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (o4 == null || e.class != o4.getClass()) {
            return false;
        }
        return this.f35965a.equals(((e) o4).f35965a);
    }

    public int hashCode() {
        return this.f35965a.hashCode();
    }
}
