package net.time4j.tz.model;

import androidx.compose.ui.graphics.l6;
import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.time4j.tz.p;
import net.time4j.tz.q;

/* compiled from: CompositeTransitionModel.java */
/* loaded from: classes7.dex */
final class b extends l {
    private static final long serialVersionUID = 1749643877954103721L;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f83599c;

    /* renamed from: d, reason: collision with root package name */
    private final transient a f83600d;

    /* renamed from: e, reason: collision with root package name */
    private final transient j f83601e;

    /* renamed from: f, reason: collision with root package name */
    private final transient q f83602f;

    /* renamed from: g, reason: collision with root package name */
    private transient int f83603g = 0;

    b(int i4, List<q> list, List<d> list2, boolean z4, boolean z5) {
        this.f83599c = i4;
        a aVar = new a(list, z4, z5);
        this.f83600d = aVar;
        q x4 = aVar.x();
        this.f83602f = x4;
        this.f83601e = new j(x4, list2, z4);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("餀\u0001"));
    }

    private Object writeReplace() {
        return new SPX(this, 127);
    }

    @Override // net.time4j.tz.m
    public q a(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return this.f83600d.w(aVar, gVar, this.f83601e);
    }

    @Override // net.time4j.tz.m
    public List<q> b() {
        return this.f83600d.b();
    }

    @Override // net.time4j.tz.m
    public List<q> c(net.time4j.base.f fVar, net.time4j.base.f fVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f83600d.c(fVar, fVar2));
        arrayList.addAll(this.f83601e.c(fVar, fVar2));
        return Collections.unmodifiableList(arrayList);
    }

    @Override // net.time4j.tz.m
    public q d(net.time4j.base.f fVar) {
        if (fVar.j() < this.f83602f.e()) {
            return this.f83600d.d(fVar);
        }
        q d5 = this.f83601e.d(fVar);
        return d5 == null ? this.f83602f : d5;
    }

    @Override // net.time4j.tz.model.l, net.time4j.tz.m
    public boolean e() {
        return this.f83601e.e() || this.f83600d.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f83600d.v(bVar.f83600d, this.f83599c, bVar.f83599c) && this.f83601e.w().equals(bVar.f83601e.w());
    }

    @Override // net.time4j.tz.m
    public p f() {
        return this.f83600d.f();
    }

    @Override // net.time4j.tz.m
    public void g(Appendable appendable) throws IOException {
        this.f83600d.u(this.f83599c, appendable);
        this.f83601e.g(appendable);
    }

    @Override // net.time4j.tz.m
    public List<p> h(net.time4j.base.a aVar, net.time4j.base.g gVar) {
        return this.f83600d.z(aVar, gVar, this.f83601e);
    }

    public int hashCode() {
        int i4 = this.f83603g;
        if (i4 != 0) {
            return i4;
        }
        int A = this.f83600d.A(this.f83599c) + (this.f83601e.w().hashCode() * 37);
        this.f83603g = A;
        return A;
    }

    @Override // net.time4j.tz.m
    public q i(net.time4j.base.f fVar) {
        q i4 = this.f83600d.i(fVar);
        return i4 == null ? this.f83601e.i(fVar) : i4;
    }

    List<d> t() {
        return this.f83601e.w();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        m2.a(b.class, sb, ProtectedSandApp.s("餁\u0001"));
        sb.append(this.f83599c);
        sb.append(ProtectedSandApp.s("餂\u0001"));
        sb.append(hashCode());
        sb.append(ProtectedSandApp.s("餃\u0001"));
        return l6.a(sb, this.f83601e.w(), ']');
    }

    void u(ObjectOutput objectOutput) throws IOException {
        this.f83600d.D(this.f83599c, objectOutput);
    }
}
