package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;
import kotlin.text.v;

/* compiled from: ReflectKotlinClass.kt */
/* loaded from: classes7.dex */
public final class f implements t {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    public static final a f76210c = new a();

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final Class<?> f76211a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.header.a f76212b;

    /* compiled from: ReflectKotlinClass.kt */
    public static final class a {
        private a() {
        }

        @fg.m
        public final f a(@fg.l Class<?> cls) {
            l0.p(cls, ProtectedSandApp.s("湠\u0001"));
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.b bVar = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.b();
            c.f76208a.b(cls, bVar);
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.a m4 = bVar.m(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e.f77546i);
            w wVar = null;
            if (m4 == null) {
                return null;
            }
            return new f(cls, m4, wVar);
        }

        public a(w wVar) {
        }
    }

    public /* synthetic */ f(Class cls, kotlin.reflect.jvm.internal.impl.load.kotlin.header.a aVar, w wVar) {
        this(cls, aVar);
    }

    @fg.l
    public final Class<?> a() {
        return this.f76211a;
    }

    public boolean equals(@fg.m Object obj) {
        return (obj instanceof f) && l0.g(this.f76211a, ((f) obj).f76211a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t
    @fg.l
    public String getLocation() {
        StringBuilder sb = new StringBuilder();
        String name = this.f76211a.getName();
        l0.o(name, ProtectedSandApp.s("湡\u0001"));
        return android.support.v4.media.c.a(sb, v.h2(name, '.', '/', false, 4, null), ProtectedSandApp.s("湢\u0001"));
    }

    public int hashCode() {
        return this.f76211a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t
    @fg.l
    public kotlin.reflect.jvm.internal.impl.name.b m() {
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(this.f76211a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t
    public void n(@fg.l t.d dVar, @fg.m byte[] bArr) {
        l0.p(dVar, ProtectedSandApp.s("湣\u0001"));
        c.f76208a.i(this.f76211a, dVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t
    @fg.l
    public kotlin.reflect.jvm.internal.impl.load.kotlin.header.a o() {
        return this.f76212b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.t
    public void p(@fg.l t.c cVar, @fg.m byte[] bArr) {
        l0.p(cVar, ProtectedSandApp.s("湣\u0001"));
        c.f76208a.b(this.f76211a, cVar);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        m2.a(f.class, sb, ProtectedSandApp.s("湤\u0001"));
        sb.append(this.f76211a);
        return sb.toString();
    }

    private f(Class<?> cls, kotlin.reflect.jvm.internal.impl.load.kotlin.header.a aVar) {
        this.f76211a = cls;
        this.f76212b = aVar;
    }
}
