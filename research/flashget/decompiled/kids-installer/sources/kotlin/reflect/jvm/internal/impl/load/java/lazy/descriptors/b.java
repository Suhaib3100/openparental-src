package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b4.r;
import b4.w;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.l0;

/* compiled from: DeclaredMemberIndex.kt */
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: DeclaredMemberIndex.kt */
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        public static final a f24642a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
        @d5.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> a() {
            return EmptySet.f23181o;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
        @d5.e
        public w b(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("䩛"));
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
        @d5.e
        public b4.n c(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("䩜"));
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
        @d5.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            return EmptySet.f23181o;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
        @d5.d
        public Set<kotlin.reflect.jvm.internal.impl.name.f> e() {
            return EmptySet.f23181o;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b
        @d5.d
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public List<r> f(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
            l0.p(fVar, ProtectedSandApp.s("䩝"));
            return EmptyList.f23167o;
        }
    }

    @d5.d
    Set<kotlin.reflect.jvm.internal.impl.name.f> a();

    @d5.e
    w b(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar);

    @d5.e
    b4.n c(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar);

    @d5.d
    Set<kotlin.reflect.jvm.internal.impl.name.f> d();

    @d5.d
    Set<kotlin.reflect.jvm.internal.impl.name.f> e();

    @d5.d
    Collection<r> f(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar);
}
