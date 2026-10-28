package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.load.kotlin.r;
import kotlin.text.e0;
import org.apache.commons.io.n;

/* compiled from: ReflectKotlinClass.kt */
/* loaded from: classes5.dex */
public final class f implements r {

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    public static final a f24360c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Class<?> f24361a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.header.a f24362b;

    /* compiled from: ReflectKotlinClass.kt */
    public static final class a {
        private a() {
        }

        @d5.e
        public final f a(@d5.d Class<?> cls) {
            l0.p(cls, ProtectedSandApp.s("䡔"));
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.b bVar = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.b();
            c.f24358a.b(cls, bVar);
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.a m5 = bVar.m();
            w wVar = null;
            if (m5 == null) {
                return null;
            }
            return new f(cls, m5, wVar);
        }

        public a(w wVar) {
        }
    }

    public /* synthetic */ f(Class cls, kotlin.reflect.jvm.internal.impl.load.kotlin.header.a aVar, w wVar) {
        this(cls, aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r
    @d5.d
    public kotlin.reflect.jvm.internal.impl.load.kotlin.header.a a() {
        return this.f24362b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r
    public void b(@d5.d r.c cVar, @d5.e byte[] bArr) {
        l0.p(cVar, ProtectedSandApp.s("䡕"));
        c.f24358a.b(this.f24361a, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r
    public void c(@d5.d r.d dVar, @d5.e byte[] bArr) {
        l0.p(dVar, ProtectedSandApp.s("䡖"));
        c.f24358a.i(this.f24361a, dVar);
    }

    @d5.d
    public final Class<?> d() {
        return this.f24361a;
    }

    public boolean equals(@d5.e Object obj) {
        return (obj instanceof f) && l0.g(this.f24361a, ((f) obj).f24361a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r
    @d5.d
    public String getLocation() {
        String h22;
        StringBuilder sb = new StringBuilder();
        String name = this.f24361a.getName();
        l0.o(name, ProtectedSandApp.s("䡗"));
        h22 = e0.h2(name, org.apache.commons.io.k.f32026a, n.f32060b, false, 4, null);
        return androidx.concurrent.futures.a.a(sb, h22, ProtectedSandApp.s("䡘"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.r
    @d5.d
    public kotlin.reflect.jvm.internal.impl.name.b h() {
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.a(this.f24361a);
    }

    public int hashCode() {
        return this.f24361a.hashCode();
    }

    @d5.d
    public String toString() {
        return f.class.getName() + ProtectedSandApp.s("䡙") + this.f24361a;
    }

    private f(Class<?> cls, kotlin.reflect.jvm.internal.impl.load.kotlin.header.a aVar) {
        this.f24361a = cls;
        this.f24362b = aVar;
    }
}
