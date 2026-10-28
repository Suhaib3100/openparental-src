package ze;

import java.io.Serializable;

/* compiled from: MutableObject.java */
/* loaded from: classes6.dex */
public class h<T> implements a<T>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final long f93836c = 86241875189L;

    /* renamed from: b, reason: collision with root package name */
    private T f93837b;

    public h() {
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() == obj.getClass()) {
            return this.f93837b.equals(((h) obj).f93837b);
        }
        return false;
    }

    @Override // ze.a
    public T getValue() {
        return this.f93837b;
    }

    public int hashCode() {
        T t4 = this.f93837b;
        if (t4 == null) {
            return 0;
        }
        return t4.hashCode();
    }

    @Override // ze.a
    public void setValue(T t4) {
        this.f93837b = t4;
    }

    public String toString() {
        T t4 = this.f93837b;
        return t4 == null ? "null" : t4.toString();
    }

    public h(T t4) {
        this.f93837b = t4;
    }
}
