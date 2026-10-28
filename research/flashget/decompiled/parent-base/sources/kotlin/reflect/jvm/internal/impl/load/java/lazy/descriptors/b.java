package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.j0;
import kotlin.collections.l0;
import wd.r;
import wd.w;

/* compiled from: DeclaredMemberIndex.kt */
/* loaded from: classes7.dex */
public interface b {

    /* compiled from: DeclaredMemberIndex.kt */
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f76501a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
        @fg.l
        public Set<kotlin.reflect.jvm.internal.impl.name.f> a() {
            return l0.f74939b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
        @fg.l
        public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            return l0.f74939b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
        @fg.l
        public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
            return l0.f74939b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
        @fg.m
        public w e(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("焵\u0001"));
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
        @fg.m
        public wd.n f(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("焵\u0001"));
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
        @fg.l
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public List<r> d(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
            kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("焵\u0001"));
            return j0.f74919b;
        }
    }

    @fg.l
    Set<kotlin.reflect.jvm.internal.impl.name.f> a();

    @fg.l
    Set<kotlin.reflect.jvm.internal.impl.name.f> b();

    @fg.l
    Set<kotlin.reflect.jvm.internal.impl.name.f> c();

    @fg.l
    Collection<r> d(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar);

    @fg.m
    w e(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar);

    @fg.m
    wd.n f(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar);
}
