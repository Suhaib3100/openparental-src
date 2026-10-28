package ze;

import java.io.Serializable;

/* compiled from: MutableBoolean.java */
/* loaded from: classes6.dex */
public class b implements a<Boolean>, Serializable, Comparable<b> {

    /* renamed from: c, reason: collision with root package name */
    private static final long f93824c = -4830728138360036487L;

    /* renamed from: b, reason: collision with root package name */
    private boolean f93825b;

    public b() {
    }

    public boolean a() {
        return this.f93825b;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(b bVar) {
        return org.apache.commons.lang3.g.c(this.f93825b, bVar.f93825b);
    }

    @Override // ze.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean getValue() {
        return Boolean.valueOf(this.f93825b);
    }

    public boolean d() {
        return !this.f93825b;
    }

    public boolean e() {
        return this.f93825b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && this.f93825b == ((b) obj).a();
    }

    public void f() {
        this.f93825b = false;
    }

    public void g() {
        this.f93825b = true;
    }

    @Override // ze.a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void setValue(Boolean bool) {
        this.f93825b = bool.booleanValue();
    }

    public int hashCode() {
        return (this.f93825b ? Boolean.TRUE : Boolean.FALSE).hashCode();
    }

    public void i(boolean z4) {
        this.f93825b = z4;
    }

    public Boolean j() {
        return Boolean.valueOf(a());
    }

    public String toString() {
        return String.valueOf(this.f93825b);
    }

    public b(boolean z4) {
        this.f93825b = z4;
    }

    public b(Boolean bool) {
        this.f93825b = bool.booleanValue();
    }
}
